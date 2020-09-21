# Section 4 - Displaying and Handling Event

1\) Property Binding vs String Interpolation

```text
<h2>{{title}}</h2> // string interporation
<h2 [textContent] = "title"></h2>  //property binding 

property is one way, any update in component is reflected in HTML DOM (document object model)

but HTML updates will not be reflected back in component 

```

2\) HTML vs DOM

HTML is text representation when being parsed into memory becomes DOM

![](../../../.gitbook/assets/image%20%28249%29.png)

3\) importing bootstrap

```text
- download and install bootstrap in package.json

npm install bootstrap --save


in style.css

/* You can add global styles to this file, and also import other style files */
@import "~bootstrap/dist/css/bootstrap.css";

body{
    padding:20px;
}


```

4\) style binding

```typescript

@Component({
    selector: 'courses',
    template: `
    <h2>{{getTitle()}}</h2>
    <ul>
        <li *ngFor="let course of courses">
            {{course}}
        </li>
    </ul>
    <button [style.backgroundColor]="isActive ? 'blue' :'red'">Save</button>
    `
})
export class CoursesComponent{

    isActive = false;

```

5\) Event binding

```typescript

@Component({
    selector: 'courses',
    template: `
    <h2>{{getTitle()}}</h2>
    <ul>
        <li *ngFor="let course of courses">
            {{course}}
        </li>
    </ul>
    <button (click)="onSave($event)">Save</button>
    `
})
export class CoursesComponent{

    onSave($event){
        console.log("Button was pressed", $event); 
    } 
    
    //event is what the angular knows 
```

6\) Event Filtering

```typescript

@Component({
    selector: 'courses',
    template: `

    <input (keyup)="onKeyUp($event)" />
    `
})
export class CoursesComponent{


    onKeyUp($event){
        if($event.keyCode == 13) console.log("entered");
    }

//log in console if it's entered 
```

7\) Template variable to catch input 

```typescript

@Component({
    selector: 'courses',
    template: `

    <input #email (keyup.enter)="onKeyUp(email.value)" />
    `
})
export class CoursesComponent{


    onKeyUp(email){
      console.log(email);
    }

```

8\) Two way binding

```typescript


@Component({
    selector: 'courses',
    template: `

    <input [(ngModel)]="email" (keyup.enter)="onKeyUp()" />
    `
})
export class CoursesComponent{

    email = "me@example.com";

    onKeyUp(){
      console.log(this.email);
    }

//the ngModel is used for 2 way binding 
//it's an angular directive 
//need to remember to import and add into app.module.ts
```

9\) Pipes to format data \(upper case , lower case , decimal ...\) 

```typescript
//Angular pipes to format data 

@Component({
    selector: 'courses',
    template: `

    {{course.title | uppercase | lowercase}} <br/>
    {{course.students | number}} <br/>
    {{course.rating | number:'1.1-1'}} <br/>
    {{course.price | currency:'AUD'}} <br/>
    {{course.releaseDate | date:'shortDate'}}
    `
})
export class CoursesComponent{

    course ={
        title : "The complete angular course",
        rating : 4.9745,
        students: 30123,
        price: 190.45,
        releaseDate: new Date(2016, 10, 1)
    }

```

10\) custom Pipes

```typescript
a. define a new summary pipe file (summary.pipe.ts)


import {Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'summary'
})
export class SummaryPipe implements PipeTransform{
    transform(value:string, args?:any){
        if(!value){
            return null;

        }

        return value.substr(0, 3) +"...";

    }
}

b. add it into the app.modules.ts

@NgModule({
  declarations: [
    AppComponent,
    CourseComponent,
    CoursesComponent,
    AuthorsComponent,
    SummaryPipe
  ],
  
  
c. use it in the component.ts

@Component({
    selector: 'courses',
    template: `

    {{text | summary}}
    `
})
export class CoursesComponent{

   text = "1234 12312 12214 "
```


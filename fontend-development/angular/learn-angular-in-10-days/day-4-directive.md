---
description: >-
  https://www.c-sharpcorner.com/article/learn-angular-8-step-by-step-in-10-days-directives-day-4/
---

# Day 4 - Directive

In general, a directive is a **TypeScript based function** that executes whenever Angular compiler identified it within the DOM element. Directives are used to provide or generate new HTML based syntax which will extend the power of the UI in an Angular Application. Each directive must have a selector name just like the same as a component – either that name can be from Angular predefined patterns like ng-if or a custom developer-defined name which can be any name but need to indicate the main purpose of the directive. Also, every directive can act as an element or an attribute or a class or a comment in the HTML section.



### Types of Directives

  
There are three main types of directives in Angular 8:

* **Component** – Directives with templates. 
* **Structural Directives:** Structural directives start with a \* sign. These directives are used to manipulate and change the structure of the DOM elements. For example, \*ngIf and \*ngFor.
* * **Attribute Directives:** Attribute directives are used to change the look and behavior of the DOM elements. For example: ngClass, ngStyle etc.



Difference between Directive and Component -&gt; [https://blogpedia.org/blogs/28/angular-directive-vs-components](https://blogpedia.org/blogs/28/angular-directive-vs-components)

[difference between ngClass and ngStyle](https://stackoverflow.com/questions/26919963/what-is-the-difference-between-ng-class-and-ng-style) 

Example -&gt; **ngClass** translate object into class attribute 

```typescript

<span [ngClass]="{'brown':showColor}">Attribute Change by Using NgClass</span><br /> 

// if showColor return true, then the class attribute class="brown" will be added 

// if CSS file is defined for class attribute, fipping will happen automatically

.red {color:red;}  
.blue {color:blue}  
.cyan {color : cyan}  
.brown {color : brown}    
    

```

Example -&gt; **ngStyle** is to interpolate java script object into style attribute 

```typescript
<span [ngStyle]="{'font-size':'14px','color':'green'}">Attribute Change by Using NgStyle</span>  


```

Example -&gt; **\*ngIf** is to decide if show or not show the content based on the output of the If condition

```typescript

<div>  
  <input type="button" value="{{caption}}" (click)="changeData()"/>  
  <br />  
  <h2 *ngIf="showInfo"><span>Demonstrate of Structural Directives - *ngIf</span></h2>  
</div> 


//app component 

import { Component } from '@angular/core';  
  
@Component({  
  selector: 'app-root',  
  templateUrl: './app.component.html',  
  styleUrls : ['./custom.css']  
})  
export class AppComponent {  
    
  showInfo: boolean = false;  
  caption: string = 'Show Text';  
  
  constructor() { }  
  
  public changeData(): void {  
      this.showInfo = !this.showInfo;  
      if (this.showInfo) {  
          this.caption = 'Hide Text';  
      }  
      else {  
          this.caption = 'Show Text';  
      }  
  }  
}  
```

Example -&gt; **\*ngFor** to run through each item 

```typescript

//html


<div>  
    <h2>Demonstrate ngFor</h2>  
    <ul>  
        <li *ngFor="let item of productList">  
            {{item}}  
        </li>  
    </ul>  
</div> 


// Component 

import { Component } from '@angular/core';  
  
@Component({  
  selector: 'app-root',  
  templateUrl: './app.component.html',  
  styleUrls : ['./custom.css']  
})  
export class AppComponent {  
    
  productList: Array<string> = ['IPhone','Galaxy 9.0','Blackberry 10Z'];  
  
  constructor() { }  
}  
```

Example -&gt; \*ngSwitch to combine with \*ngSwitchCase 

HTML

```typescript


<div>  
  <h2>Demonstrate ngSwitch</h2>  
  <table style="width:100%;border:solid;border-color:blue;border-width:thin;">  
      <thead>  
          <tr >  
              <td>Srl No</td>  
              <td>Student Name</td>  
              <td>Course</td>  
              <td>Grade</td>  
          </tr>  
      </thead>  
      <tbody>  
          <tr *ngFor="let student of studentList;" [ngSwitch]="student.Grade">  
              <td>  
                  <span *ngSwitchCase="'A'" [ngStyle]="{'font-size':'18px','color':'red'}">{{student.SrlNo}}</span>  
                  <span *ngSwitchCase="'B'" [ngStyle]="{'font-size':'16px','color':'blue'}">{{student.SrlNo}}</span>  
                  <span *ngSwitchCase="'C'" [ngStyle]="{'font-size':'14px','color':'green'}">{{student.SrlNo}}</span>  
                  <span *ngSwitchDefault [ngStyle]="{'font-size':'12px','color':'black'}">{{student.SrlNo}}</span>  
              </td>  
              <td>  
                  <span *ngSwitchCase="'A'" [ngStyle]="{'font-size':'18px','color':'red'}">{{student.Name}}</span>  
                  <span *ngSwitchCase="'B'" [ngStyle]="{'font-size':'16px','color':'blue'}">{{student.Name}}</span>  
                  <span *ngSwitchCase="'C'" [ngStyle]="{'font-size':'14px','color':'green'}">{{student.Name}}</span>  
                  <span *ngSwitchDefault [ngStyle]="{'font-size':'12px','color':'black'}">{{student.Name}}</span>  
              </td>  
              <td>  
                <span *ngSwitchCase="'A'" [ngStyle]="{'font-size':'18px','color':'red'}">{{student.Course}}</span>  
                    <span *ngSwitchCase="'B'" [ngStyle]="{'font-size':'16px','color':'blue'}">{{student.Course}}</span>  
                    <span *ngSwitchCase="'C'" [ngStyle]="{'font-size':'14px','color':'green'}">{{student.Course}}</span>  
                    <span *ngSwitchDefault [ngStyle]="{'font-size':'12px','color':'black'}">{{student.Course}}</span>  
                </td>  
                <td>  
                    <span *ngSwitchCase="'A'" [ngStyle]="{'font-size':'18px','color':'red'}">{{student.Grade}}</span>  
                    <span *ngSwitchCase="'B'" [ngStyle]="{'font-size':'16px','color':'blue'}">{{student.Grade}}</span>  
                    <span *ngSwitchCase="'C'" [ngStyle]="{'font-size':'14px','color':'green'}">{{student.Grade}}</span>  
                    <span *ngSwitchDefault [ngStyle]="{'font-size':'12px','color':'black'}">{{student.Grade}}</span>  
                </td>  
            </tr>  
        </tbody>  
    </table>  
</div>  
```

Component 

```typescript

import { Component, OnInit } from '@angular/core';  
  
@Component({  
  selector: 'app-root',  
  templateUrl: './app.component.html',  
  styleUrls : ['./custom.css']  
})  
export class AppComponent implements OnInit {  
    
  studentList: Array<any> = new Array<any>();  
  
    constructor() { }  
    ngOnInit() {  
        this.studentList = [  
            { SrlNo: 1, Name: 'Rajib Basak', Course: 'Bsc(Hons)', Grade: 'A' },  
            { SrlNo: 2, Name: 'Rajib Basak1', Course: 'BA', Grade: 'B' },  
            { SrlNo: 3, Name: 'Rajib Basak2', Course: 'BCom', Grade: 'A' },  
            { SrlNo: 4, Name: 'Rajib Basak3', Course: 'Bsc-Hons', Grade: 'C' },  
            { SrlNo: 5, Name: 'Rajib Basak4', Course: 'MBA', Grade: 'B' },  
            { SrlNo: 6, Name: 'Rajib Basak5', Course: 'MSc', Grade: 'B' },  
            { SrlNo: 7, Name: 'Rajib Basak6', Course: 'MBA', Grade: 'A' },  
            { SrlNo: 8, Name: 'Rajib Basak7', Course: 'MSc.', Grade: 'C' },  
            { SrlNo: 9, Name: 'Rajib Basak8', Course: 'MA', Grade: 'D' },  
            { SrlNo: 10, Name: 'Rajib Basak9', Course: 'B.Tech', Grade: 'A' }  
        ];  
    }  
}  

```

[building a simple directive from angular official website](https://angular.io/guide/attribute-directives)

1\) ng generate directive highlight

2\) modify highligh.directive.ts

It's the brackets \(`[]`\) that make it an attribute selector. Angular locates each element in the template that has an attribute named `appHighlight` and applies the logic of this directive to that element.

You use the [`ElementRef`](https://angular.io/api/core/ElementRef) in the directive's constructor to [inject](https://angular.io/guide/dependency-injection) a reference to the host DOM element, the element to which you applied `appHighlight`.

[`ElementRef`](https://angular.io/api/core/ElementRef) grants direct access to the host DOM element through its `nativeElement` property.

```typescript

import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {
    constructor(el: ElementRef) {
       el.nativeElement.style.backgroundColor = 'yellow';
    }
}
```

3\) apply directive in the app.component.html

```typescript
<p appHighlight>Highlight me!</p>
```

4\) make sure the directive is imported in the app.module.ts

```typescript

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HighlightDirective } from './highlight.directive';

@NgModule({
  imports: [ BrowserModule ],
  declarations: [
    AppComponent,
    HighlightDirective // this is needed  
  ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }

```



Version 2- &gt; we can also enhance it to respond to user initiated events from mouse leave or mouse enter

add HostListener methods 

```typescript
import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {
  constructor(private el: ElementRef) { }

  @HostListener('mouseenter') onMouseEnter() {
    this.highlight('yellow');
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.highlight(null);
  }

  private highlight(color: string) {
    this.el.nativeElement.style.backgroundColor = color;
  }
}

```



Version 3 -&gt; pass values into directive with @input 

in directive -&gt; appHighlight will listen for color

```typescript

import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  constructor(private el: ElementRef) { }

  @Input('appHighlight') highlightColor: string;

  @HostListener('mouseenter') onMouseEnter() {
    this.highlight(this.highlightColor || 'red');
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.highlight(null);
  }

  private highlight(color: string) {
    this.el.nativeElement.style.backgroundColor = color;
  }
}

```

appComponent will define a color attribute and pass it appHightLight input 

```typescript
<h1>My First Attribute Directive</h1>

<h4>Pick a highlight color</h4>
<div>
  <input type="radio" name="colors" (click)="color='lightgreen'">Green
  <input type="radio" name="colors" (click)="color='yellow'">Yellow
  <input type="radio" name="colors" (click)="color='cyan'">Cyan
</div>
<p [appHighlight]="color">Highlight me!</p>


//app component TS

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  color: string;
}


```


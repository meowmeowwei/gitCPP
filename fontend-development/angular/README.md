---
description: 'https://www.youtube.com/watch?v=Fdf5aTYRW0E'
---

# Angular

Javascript framework built by Google

```typescript
commands

ng g c courseWork -> generating components

ng g s emailWork -> generating service 

ng serve -> start the application
npm install -> looks at the package.json to see all depenencies and download install




```



Fundamental of Angular 

1\) components -&gt; encapsulate data, HMTL template, business logics 

2\) module -&gt; each module for specific function and can contain multiple components 

Components control views \(html\). They also communicate with other components and services to bring functionality to your app.

Modules consist of one or more components. They do not control any html. Your modules declare which components can be used by components belonging to _other_ modules, which classes will be injected by the dependency injector and which component gets bootstrapped. Modules allow you to manage your components to bring modularity to your app.

3\) Templates/Interpolation 

```typescript

import { Component } from '@angular/core';

@Component({
    selector: 'courses',
    template: '<h2>{{getTitle()}}</h2>'     --> {{can put typescript logics here}} 
})
export class CoursesComponent{
    title = "List of courses";

    getTitle(){
        return this.title;
    }
}



```



4\) Directives 

invoking specific Angular directives to update the DOM object 

```typescript


@Component({
    selector: 'courses',
    template: `
    <h2>{{getTitle()}}</h2>
    <ul>
        <li *ngFor="let course of courses">           --> *ngFor  
            {{course}}
        </li>
    </ul>
    `
})
export class CoursesComponent{
    title = "List of courses";

    getTitle(){
        return this.title;
    }

    courses = ["course1", "course2", "course3"];
}


```

5\) Service 

used for doing HTTP endpoint with Server, should not do it tightly connect to component 



6\) Dependency Injection

```typescript

    constructor (service:CoursesService){
        //let service = new CoursesService;   we let angular to do it for us in the contructor itself 
        this.courses = service.getCourses();

    }

//dependency injection, good for mocking also 

but if you do this , make sure you add this in the providers 

providers: [ CoursesService ],sadfasd
```

7\) Injectable 

```typescript

import { Injectable } from '@angular/core';  

//Injectable needed for contructor to take injection, already included in Component

@Injectable({
  providedIn: 'root'
})
export class EmailService {

  constructor(logService : LogService) { }
}


```



![](../../.gitbook/assets/image%20%28239%29.png)

SPA -&gt; server page application

CLI -&gt; command-line interface

![](../../.gitbook/assets/image%20%28245%29.png)

![](../../.gitbook/assets/image%20%28241%29.png)

![](../../.gitbook/assets/image%20%28244%29.png)

![](../../.gitbook/assets/image%20%28248%29.png)

app.module.ts -&gt; bootstrap point 

.ts -&gt; means typeScript

creating components -&gt; ng generate component components/Todos

webpack -&gt; automation tool that does the compiling of angular files , does recompiling , does Hot Module Recompiling








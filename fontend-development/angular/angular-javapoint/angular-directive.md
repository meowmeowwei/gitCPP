---
description: 'https://www.javatpoint.com/angular-7-directives'
---

# 3. Angular Directive



Directives are **instructions in the DOM.** They specify how to place your components and business logic in the Angular.

Directives are js class and declared as @directive. There are 3 directives in Angular.

* Component Directives
* Structural Directives
* Attribute Directives

**Component Directives:** Component directives are used in main class. They contain the detail of how the component should be processed, instantiated and used at runtime.

**Structural Directives:** Structural directives start with a \* sign. These directives are used to manipulate and change the structure of the DOM elements. For example, \*ngIf and \*ngFor.

**Attribute Directives:** Attribute directives are used to change the look and behavior of the DOM elements. For example: ngClass, ngStyle etc.



| Attribute Directives | Structural Directives |
| :--- | :--- |
| Attribute directives look like a normal HTML Attribute and mainly used in databinding and event binding. | Structural Directives start with a \* symbol and look different. |
| Attribute Directives affect only the element they are added to. | Structural Directives affect the whole area in the DOM. |

### How to create custom Directives?

You can create your own custom directives to use in Angular components.

#### Create a basic attribute directive

You have seen the attribute directive like ngClass and ngStyle. Now, it's time to create our own attribute directives.

First, create a folder. Let's name it "simple-style". Then, create a file within that folder named as "simple-style.directive.ts"

Now, you have to inform Angular that you have a new directive. So, you have to add **SimpleStyleDirective to app.module.ts** and also import it.

Now, your directive is created. Let's check it. Open app.component.html and use your created **SimpleStyleDirective**

&lt;p appSimpleStyle&gt;Style me with your created SimpleStyleDirective&lt;/p&gt;



Create Custom Directive 

1\) ng generate directive simple-style

2\) simple-style.directive.ts

```typescript

import {Directive, ElementRef, OnInit} from '@angular/core';

 @Directive( {
  selector: '[appSimpleStyle]'
})
export class SimpleStyleDirective implements OnInit {
  constructor(private elementRef: ElementRef) {
  }
  ngOnInit() {
  this.elementRef.nativeElement.style.backgroundColor = 'yellow';
  }
}


```

3\) app component.html

```typescript

<p appSimpleStyle> Highlight me</p>

```


---
description: >-
  https://www.c-sharpcorner.com/article/learn-angular-8-step-by-step-in-10-days-angular-forms-day-7/
---

# Day 7 - Angular Forms

### Types of Angular Forms

  
As a modern full-fledged UI Framework, Angular has its own full-fledged libraries for developing complex form-based UI. The current Angular framework has two types of form-building strategies as,

1. Template Driven Form --&gt; logic, validation in the HTML template part of the component   
2. Model Drive Form or Reactive Form -&gt; logic maintained within the Typescript part of the component 

Both the above technology belongs to the @angular/forms packages and are totally based on the form-control classes. But in spite of that, both the techniques are different from each other in respect to their own philosophy, programming style, and technique.



FormControl -&gt; used to assign form related fields in Angular component

Reactive Form Validation -&gt; validators to validate form control input 





**1\) Template Driven Form -&gt; achieved using ngModel**

app component 

```typescript

import { Component, OnInit } from '@angular/core';  
import { NgForm } from '@angular/forms';  
  
@Component({  
  selector: 'app-root',  
  templateUrl: './app.component.html',  
  styleUrls : ['./custom.css']  
})  
export class AppComponent implements OnInit {  
    private formData: any = {};  
    private showMessage: boolean = false;  
  
    constructor() {  
    }  
  
    ngOnInit(): void {  
    }  
  
    registerUser(formdata: NgForm) {  
        this.formData = formdata.value;  
        this.showMessage = true;  
    }  
} 

```

app component HTML

```typescript

<h2>Template Driven Form</h2>  
<div>  
    <form #signupForm="ngForm" (ngSubmit)="registerUser(signupForm)">  
        <table style="width:60%;" cellpadding="5" cellspacing="5">  
            <tr>  
                <td style="width :40%;">  
                    <label for="username">User Name</label>  
                </td>  
                <td style="width :60%;">  
                    <input type="text" name="username" id="username" [(ngModel)]="username" required>  
                </td>  
            </tr>  
            <tr>  
                <td style="width :40%;">  
                    <label for="email">Email</label>  
                </td>  
                <td style="width :60%;">  
                    <input type="text" name="email" id="email" [(ngModel)]="email" required>  
                </td>  
            </tr>  
            <tr>  
                <td style="width :40%;">  
                    <label for="password">Password</label>  
                </td>  
                <td style="width :60%;">  
                    <input type="password" name="password" id="password" [(ngModel)]="password" required>  
                </td>  
            </tr>  
            <tr>  
                <td style="width :40%;"></td>  
                <td style="width :60%;">  
                    <button type="submit">Sign Up</button>  
                </td>  
            </tr>  
        </table>  
    </form>  
    <div *ngIf="showMessage">  
        <h3>Thanks You {{formData.username}} for registration</h3>  
    </div>  
</div>  

```




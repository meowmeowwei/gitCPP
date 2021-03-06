---
description: 'https://www.javatpoint.com/angular-7-architecture'
---

# 1.Angular Architecture

NgModules are the basic building blocks of an Angular 7 application. They provide a compilation context for components. An Angular 7 app is defined by a set of NgModules and NgModules collect related code into functional sets.

```typescript

@NgModule({
  declarations: [
    AppComponent,ChildComponent,
    FormsModule
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

```



* Components define views, which are the sets of screen elements that are chosen and modified according to your program logic and data by Angular 7.
* Components use services, which provide specific functionality not directly related to views. Service providers can be injected into components as dependencies, making your code modular, reusable, and efficient.

![](../../../.gitbook/assets/image%20%28321%29.png)



### Template, Directives and Data Binding

In Angular 7, a template is used to combine HTML with Angular Markup and modify HTML elements before displaying them. Template directives provide program logic, and binding markup connects your application data and the DOM.

**There are two types of data binding:**

* **Event Binding:** Event binding is used to bind events to your app and respond to user input in the target environment by updating your application data. [Read more about event binding](https://www.javatpoint.com/angular-7-event-binding)
* **Property Binding:** Property binding is used to pass data from component class and facilitates you to interpolate values that are computed from your application data into the HTML. [Read more about property binding](https://www.javatpoint.com/angular-7-property-binding)



### Services and Dependency Injection

In Angular 7, developers create a service class for data or logic that isn't associated with a specific view, and they want to share across components.

Dependency Injection \(DI\) is used to make your component classes lean and efficient. DI doesn't fetch data from the server, validate user input, or log directly to the console; it simply renders such tasks to services.



### Routing

In Angular 7, **Router** is an NgModule which provides a service that facilitates developers to define a navigation path among the different application states and view hierarchies in their app.

It works in the same way as a browser's navigation works. i.e.:

* Enter a URL in the address bar and the browser will navigate to that corresponding page.
* Click the link on a page and the browser will navigate to a new page.
* Click the browser's back or forward buttons and the browser will navigate backward or forward according to your seen history pages.






---
description: 'https://www.javatpoint.com/angular-7-forms'
---

# 5. Angular Forms

Reactive Forms vs Template-driven forms



#### Reactive Forms

* Reactive forms are more robust.
* Reactive forms are more scalable, reusable, and testable.
* They are most preferred to use if forms are a key part of your application, or your application is already built using reactive patterns. In both cases, reactive forms are best to use.

#### Template-driven Forms

* Template-driven forms are best if you want to add a simple form to your application. For example: email list signup form.
* Template-driven forms are easy to use in the application but they are not as scalable as Reactive forms.
* Template-driven forms are mainly used if your application's requires a very basic form and logic. It can easily be managed in a template.

### Difference between Reactive Forms and Template-driven Forms

| Comparison Index | Reactive Forms | Template-driven Forms |
| :--- | :--- | :--- |
| Setup \(form model\) | Reactive forms are more explicit. They are created in component class. | Template-driven forms are less explicit. They are created by directives. |
| Data model | Structured | Unstructured |
| Predictability | Synchronous | Asynchronous |
| Form validation | Functions | Directives |
| Mutability | Immutable | Mutable |
| Scalability | Low-level API access | Abstraction on top of APIs |
|  |  |  |



### [High-level Differences between Template-driven and Reactive Forms](https://www.pluralsight.com/guides/difference-between-template-driven-and-reactive-forms-angular)

Below are some of the high-level differences between the two types:

1. Template-driven forms make use of the "FormsModule", while reactive forms are based on "ReactiveFormsModule".
2. Template-driven forms are asynchronous in nature, whereas Reactive forms are mostly synchronous.
3. In a template-driven approach, most of the logic is driven from the template, whereas in reactive-driven approach, the logic resides mainly in the component or typescript code. Let us get started by generating a component and then we'll update our form code.










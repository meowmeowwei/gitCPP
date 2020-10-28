---
description: >-
  https://www.c-sharpcorner.com/article/learn-angular-8-step-by-step-in-10-days-pipes-day-5/
---

# Day 5 - Pipes

helps to format the data into needed format e.g. lower case, upper case 



### Basic Pipes

  
Most of the pipes provided by Angular 8 will be familiar with us if we already worked in the previous Angular version. Actually, pipes do not provide any new features in Angular 8. In Angular 8, we can use logic in the template. We can define any function within the pipe class to implement any special type data conversion or business login and then execute that particular function from the HTML template to obtain the desired result. The syntax of the Pipe in the HTML template begins with the input value and then followed the pipe symbol \(\|\) and then need to provide the pipe name. The parameters of that pipe can be sent separately by a colon \(:\). The order of execution of a pipe is right to left. In General, Pipe is working within the HTML only. The most commonly used built-in pipes are:

* Currency 
* Date 
* Uppercase 
* Lowercase 
* JSON 
* Decimal 
* Percent 
* Async

**Syntax of Pipes**

> _**{{myValue \| myPipe:param1:param2 \| mySecondPipe:param1}}**_



### Types of Pipe

  
In Angular 8, we can categories the pipes in two types i.e. Pure Pipes and Impure Pipes.  
**Pure Pipes**:- Pure pipes in angular are those pipes which always accepts some arguments as input value and return some value as the output according to the input values. Some examples of the pure pipes are – decimal pipes, date pipes, etc. When we use these types of pipes in Angular, we provide input value with related configuration value to the pipes and pipes return us the formatted value as an output.  
**Impure Pipes**:- Impure pipes in angular are those pipes which also accepts the input values, but return the different types of the value set according to the state of the input value. An example of the impure pipes is async pipes. These pipes always store the internal state and return different types of value as the output according to the internal state and logic.    






### What is Viewchild?

  
Basically, Viewchild is one of the new features introduced in the Angular framework. Angular is basically depended on component-based architecture. So when we try to develop any web page or UI, it is most obvious that that page or UI must be a component that basically contains multiple numbers of different functional components as a child component. So in simple words, it is basically a parent component – child component-based architecture. In this scenario, there are some situations occurred when a parent component needs to interact with the child component. We can establish connections between parent and child components in many ways. One of the ways is ViewChild decorator. ViewChild decorator can be used if we need to access the instance of a child component or a directive from the parent component class. So when the need to invoke any method of the child component from the parent component, it can inject the child component as a Viewchild within the parent component. In cases where you’d want to access multiple children, you’d use ViewChildren instead.  
To implement ViewChild, we need to use @ViewChild decorator in the parent component. The @ViewChild decorator provides access to the class of child components from the parent component. The @ViewChild decorator is basically a function or method which accepts the name of a component class as its input and finds its selector in the template of the related component to bind to. The basic syntax of the ViewChild decorator in Angular 8 as below –

> _**@ViewChild\(ChildComponent, { static:true}\) \_calculator: ChildComponent;**_


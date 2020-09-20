# TypeScript

```typescript
interface Point{
    
    x:number,
    y:number

}


class Point{
    x: number;
    y: number;
    draw(){
        
    }
}
```

optional constructor fields

```typescript
class Point{
    x: number;
    y: number;

    constructor(x?:number, y?:number){
        this.x =x;
        this.y =y; 
    }

    draw(){
        console.log(this.x + " "+ this.y);
    }
}

let point = new Point();
point.draw();



```

auto fields generation in the class

```typescript
class Point{

    constructor(private x?: number, private y?: number){
    }

    // will autogenerate x and y field in the class 
}


```

properties -&gt; looks like a field from outside but actually is a method



\*\*\*\*[**TypeScripts vs JavaScripts** ](https://www.geeksforgeeks.org/difference-between-typescript-and-javascript/)\*\*\*\*

\*\*\*\*

* TypesScript is known as Object oriented programming language whereas JavaScript is a scripting language.
* TypeScript has a feature known as Static typing but JavaScript does not have this feature.
* TypeScript gives support for modules whereas JavaScript does not support modules.
* TypeScript has Interface but JavaScript does not have Interface.
* TypeScript support optional parameter function but JavaScript does not support optional parameter function.



**Advantages of using TypeScript over JavaScript**

* TypeScript always point out the compilation errors at the time of development only. Because of this at the run-time the chance of getting errors are very less whereas JavaScript is an interpreted language.
* TypeScript has a feature which is strongly-typed or supports static typing. That means Static typing allows for checking type correctness at compile time. This is not available in JavaScript.
* TypeScript is nothing but JavaScript and some additional features i.e. ES6 features. It may not be supported in your target browser but TypeScript compiler can compile the **.ts** files into ES3,ES4 and ES5 also.

\*\*\*\*






# React JSX

### What is JSX?

JSX stands for JavaScript XML.

JSX allows us to write HTML in React.

JSX makes it easier to write and add HTML in React.



**Expressions in JSX**

With JSX you can write expressions inside curly braces `{ }`.

The expression can be a React variable, or property, or any other valid JavaScript expression. JSX will execute the expression and return the result:

#### Example

Execute the expression `5 + 5`:

```text
const myelement = <h1>React is {5 + 5} times better with JSX</h1>;
```





### One Top Level Element

The HTML code must be wrapped in ONE top level element.

So if you like to write _two_ headers, you must put them inside a parent element, like a `div` element

#### Example

Wrap two headers inside one DIV element:

```text
const myelement = (
  <div>
    <h1>I am a Header.</h1>
    <h1>I am a Header too.</h1>
  </div>
);
```


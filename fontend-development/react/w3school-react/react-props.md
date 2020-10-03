---
description: 'https://www.w3schools.com/react/react_props.asp'
---

# React Props

React Props are like function arguments in JavaScript _and_ attributes in HTML.

To send props into a component, use the same syntax as HTML attributes:

**Props are read only , you can not change their value** 



#### Example

Add a "brand" attribute to the Car element:

```text
const myelement = <Car brand="Ford" />;
```

The component receives the argument as a `props` object:

#### Example

Use the brand attribute in the component:

```text
class Car extends React.Component {
  render() {
    return <h2>I am a {this.props.brand}!</h2>;
  }
}
```



### Props in the Constructor

If your component has a constructor function, the props should always be passed to the constructor and also to the React.Component via the `super()` method.

#### Example

```text
class Car extends React.Component {
  constructor(props) {
    super(props);
  }
  render() {
    return <h2>I am a {this.props.model}!</h2>;
  }
}

ReactDOM.render(<Car model="Mustang"/>, document.getElementById('root'));
```


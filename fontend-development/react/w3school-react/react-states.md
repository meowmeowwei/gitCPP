---
description: 'https://www.w3schools.com/react/react_state.asp'
---

# React States

React components has a built-in `state` object.

The `state` object is where you store property values that belongs to the component.

When the `state` object changes, the component re-renders.



changing state 



```javascript


class App extends React.Component {

constructor(){
  super();
  this.state = {
    color : "red"
  }

  this.changeColor = this.changeColor.bind(this);

}

  changeColor(){

  this.setState({color: "blue"});
  
}

  render() {

    return (
      <div className="App">
        <h1>{this.state.color}</h1>
        <button
          type="button"
          onClick={this.changeColor}
        >Change color</button>
      </div>
    );
  }
}

```


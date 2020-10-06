---
description: 'https://pusher.com/tutorials/consume-restful-api-react'
---

# React- REST API

fetching the value and set it into the state 

```javascript

class App extends Component {

      constructor(){
        super()

        this.state = {
          contacts: []
        }
      }

      componentDidMount() {
        
        fetch('http://jsonplaceholder.typicode.com/users')
        .then(res => res.json())
        .then((data) => {
          this.setState({ contacts: data })
        })
        .catch(console.log)

        
      }

```


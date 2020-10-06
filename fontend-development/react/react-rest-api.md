---
description: 'https://pusher.com/tutorials/consume-restful-api-react'
---

# React- REST API

1\) GET - fetching the value and set it into the state 

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

`fetch('http://jsonplaceholder.typicode.com/users')` will make a `GET` request to the endpoint `.then(res => res.json())` parses the output to JSON, `.then((data) => {this.setState({ contacts: data })})` sets the value of our state to the output from the API call and finally `.catch(console.log)` logs any error we get to the console.

spring boot side needs to have ability to return the value

```javascript

	@GetMapping("/todoitems")
	public List<ToDoItem> retriveAllUsers() {
		return service.findAll();
	}


```




---
description: 'https://spring.io/guides/gs/rest-service/'
---

# Spring Boot Greeting Project

[my GitHub sample ](https://github.com/sunwei9366/springBootHelloWorld)

1\) Start 

/mvnw spring-boot:run --&gt; command to run

@GetMapping\("/greeting"\) --&gt; for handling Get request

@PostMapping -&gt; for handling Post Request



A key difference between a traditional MVC controller and the RESTful web service controller shown earlier is the way that the HTTP response body is created. Rather than relying on a view technology to perform server-side rendering of the greeting data to HTML, this RESTful web service controller populates and returns a `Greeting` object. The object data will be written directly to the HTTP response as JSON.





`@SpringBootApplication` is a convenience annotation that adds all of the following:

* `@Configuration`: Tags the class as a source of bean definitions for the application context.
* `@EnableAutoConfiguration`: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if `spring-webmvc` is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a `DispatcherServlet`.
* `@ComponentScan`: **Tells Spring to look for other components, configurations, and services in the** `com/example` package, letting it find the controllers.



2\) With @Path Variable 

```java

package com.example.web.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	// here you can do with below population
	// http://localhost:8080/greeting?name=sunwei
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	// here you can do path variable name 
	// http://localhost:8080/greeting/path-variable/sunwei
	@GetMapping("/greeting/path-variable/{name}")
	public Greeting greetingPathVariable(@PathVariable String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}

```

3\) [declare component and and a resource ](https://www.javatpoint.com/restful-web-services-path-variable)

Declare Dao Resource as a component , which is a bean object 

```java

package com.example.web.example.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	public static int usersCount = 5;
//creating an instance of ArrayList  
	private static List<User> users = new ArrayList<>();
//static block   
	static {
//adding users to the list  
		users.add(new User(1, "John", new Date()));
		users.add(new User(2, "Robert", new Date()));
		users.add(new User(3, "Adam", new Date()));
		users.add(new User(4, "Andrew", new Date()));
		users.add(new User(5, "Jack", new Date()));
	}

//method that retrieve all users from the list  
	public List<User> findAll() {
		return users;
	}

//method that add the user in the list   
	public User save(User user) {
		if (user.getId() == null) {
//increments the user id  
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

//method that find a particular user from the list  
	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}
}

```

UserResource controller to use dao object to return

```java

package com.example.web.example.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return service.findAll();
	}
	
	//retrieves a specific user detail  
	@GetMapping("/users/{id}")  
	public User retriveUser(@PathVariable int id)  
	{  
	return service.findOne(id);  
	}  
}

```

4\) [implementing POST method ](https://www.javatpoint.com/restful-web-services-postman-for-chrome)

```java

@PostMapping("/users")  
public void createUser(@RequestBody User user)  
{  
User sevedUser=service.save(user);    
}  
}  

```

5\) [Enhance to have the post response to contain ID of the new user in the location of headers ](https://www.javatpoint.com/restful-web-services-postman-for-chrome)

```java

//method that posts a new user detail and returns the status of HTTP and location of the user resource  
@PostMapping("/users")  
public ResponseEntity<Object> createUser(@RequestBody User user)  
{  
User sevedUser=service.save(user);    
URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId()).toUri();  
return ResponseEntity.created(location).build();  
}  
}  

```


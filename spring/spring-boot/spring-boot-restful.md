---
description: 'https://spring.io/guides/gs/rest-service/'
---

# Spring Boot Restful



@GetMapping\("/greeting"\) --&gt; for handling Get request

@PostMapping -&gt; for handling Post Request



A key difference between a traditional MVC controller and the RESTful web service controller shown earlier is the way that the HTTP response body is created. Rather than relying on a view technology to perform server-side rendering of the greeting data to HTML, this RESTful web service controller populates and returns a `Greeting` object. The object data will be written directly to the HTTP response as JSON.





`@SpringBootApplication` is a convenience annotation that adds all of the following:

* `@Configuration`: Tags the class as a source of bean definitions for the application context.
* `@EnableAutoConfiguration`: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if `spring-webmvc` is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a `DispatcherServlet`.
* `@ComponentScan`: Tells Spring to look for other components, configurations, and services in the `com/example` package, letting it find the controllers.


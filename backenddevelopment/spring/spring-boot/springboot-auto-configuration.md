---
description: 'https://www.javatpoint.com/restful-web-services-spring-boot-auto-configure'
---

# SpringBoot auto configuration



* A typical MVC database driven Spring MVC application requires a lot of configuration such as **dispatcher servlet, a view resolver, Jackson, data source, transaction manager,** among many others.
  * Spring Boot auto-configures a **Dispatcher Servlet** if **Spring MVC jar** is on the classpath.
  * Auto-configures the **Jackson** if **Jackson jar** is on the classpath.
  * Auto-configures a **Data Source** if **Hibernate jar** is on the classpath.
* Auto-configuration can be enabled by adding **@SpringBootApplication** or **@EnableAutoConfiguration** annotation in startup class. It indicates that it is a spring context file.

![](../../../.gitbook/assets/image%20%28253%29.png)


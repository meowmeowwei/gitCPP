---
description: >-
  https://examples.javacodegeeks.com/enterprise-java/spring/boot/spring-boot-crossorigin-annotation-example/
---

# @CrossOrigin Annotation

[Cross-origin resource sharing \(CORS\)](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing) is a standard protocol that defines the interaction between a browser and a server for safely handling cross-origin HTTP requests.

Simply put, a **cross-origin HTTP request is a request to a specific resource, which is located at a different origin, namely a domain, protocol and port, than the one of the client performing the request**.

For obvious reasons, browsers can request several cross-origin resources, including images, CSS, JavaScript files and so forth. By default, however, **a browser’ security model will deny any cross-origin HTTP request performed by client-side scripts**.

While this behavior is desired, for instance, to prevent different types of [Ajax-based](https://en.wikipedia.org/wiki/Ajax_%28programming%29) attacks, sometimes we need to instruct the browser to allow cross-origin HTTP requests from JavaScript clients with CORS.

To better understand why CORS is useful in certain use cases, let’s consider the following example: a JavaScript client running on [http://localhost:4200](http://localhost:4200/), and a [Spring Boot](https://spring.io/projects/spring-boot) RESTful web service API listening at [http://domain.com/someendpoint](https://www.domain.com/someendpoint).

In such a case, the client should be able to consume the REST API, which by default would be forbidden. In order to accomplish this, we can easily enable CORS for these two specific domains on the browser by simply annotating the methods of the RESTful web service API responsible for handling client requests with the [`@CrossOrigin`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/CrossOrigin.html) annotation.


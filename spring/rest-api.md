# REST API

Representational State Transfer, style of using HTTP to provide remote API calls between systems.

HTTP Request 

* GET
* POST \(used for updating existing content\)
* PUT \(used for new content\)
* DELETE
* HEAD

A RESTful API is an architectural style for an application program interface \([API](https://searchapparchitecture.techtarget.com/definition/application-program-interface-API)\) that uses HTTP requests to access and use data. That data can be used to GET, PUT, POST and DELETE data types, which refers to the reading, updating, creating and deleting of operations concerning resources.



#### [Common REST API challenges](https://searchapparchitecture.techtarget.com/definition/RESTful-API)

Besides the design and architecture constraints, individuals will have to confront some challenges with REST APIs. Some concepts which may be challenging can include:

* Endpoint consistency -- paths of endpoints should be consistent by following common web standards, which may be difficult to manage.
* API [versioning](https://searchsoftwarequality.techtarget.com/definition/versioning) -- endpoint URLs shouldn't be invalidated when used internally or with other applications.
* Long response times and too much data -- the amount of returned resources can increase in size in time, adding to increased load and response times.
* Navigation paths and user input locations -- because REST uses URL paths for input parameters, determining URL spaces can be challenging.
* Security -- which has a lot of aspects to keep an eye on, including the use of:
  * HTTPS;
  * blocking access from unknown IP addresses and domains;
  * validating URLs;
  * blocking unexpectedly large payloads;
  * logging requests; and
  * investigating failures.
* Authentication -- use common authentication methods such as HTTP basic authentication \(which allows for a base64-encoded username:password string\), API keys, JSON Web Tokens and other access tokens. OAuth 2.0, for example, is good for [access control](https://searchsecurity.techtarget.com/definition/access-control).
* Requests and data -- requests may have more data and metadata than needed or more requests may be needed to obtain all the data. APIs can be adjusted for this.
* API testing -- can be a long process to set up and run. Each part of the process can be either long or challenging. Testing can also be done in the command line with the utility Curl. Parts of the testing process that may be challenging include:
  * Initial setup
  * [Schema](https://searchsqlserver.techtarget.com/definition/schema) updates
  * Test parameter combinations
  * Sequence API calls
  * Validate test parameters
  * System integration
* Define error codes and messages.
  * With error codes, it is more of a common practice to use standard HTTP error codes. These are recognized by clients and developers more often.
  * Error handling may not have a way to distinguish if a response is successful or not besides parsing the body or checking for an error.


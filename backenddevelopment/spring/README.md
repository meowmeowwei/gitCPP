# Spring

1\) Bean Scope

e.g. &lt;bean id="date" class="java.util.Date" scope="protoype"&gt;

* protoype -&gt; context return a new instance of bean each time
* request -&gt; context lives for the life of a particular HTTP request
* session -&gt; bean lives for the life of HTTP session

2\) Autowired

* let application context figure out the dependencies when constructing the bean 


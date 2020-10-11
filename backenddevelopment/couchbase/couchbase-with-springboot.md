---
description: >-
  https://spring.io/blog/2015/03/16/getting-started-with-couchbase-and-spring-data-couchbase
---

# Couchbase with Springboot



* Spring configuration support using Java based `@Configuration` classes or an XML namespace for the Couchbase driver.
* `CouchbaseTemplate` helper class that increases productivity performing common Couchbase operations. Includes integrated object mapping between documents and POJOs.
* Exception translation into Spring’s portable Data Access Exception hierarchy.
* Feature Rich Object Mapping integrated with Spring’s Conversion Service.
* Annotation based mapping metadata but extensible to support other metadata formats.
* Automatic implementation of Repository interfaces including support for custom finder methods \(backed by Couchbase Views\).
* JMX administration and monitoring
* Transparent `@Cacheable` support to cache any objects you need for high performance access.

[following link from here ](https://blog.knoldus.com/spring-boot-application-with-couchbase/)

1\) Define Document with Id and Field

```java

@Document
public class ToDoItem {
	@Id
	private Integer id;
	
	@Field
	private String taskName;

	@Field
	private boolean isCompleted;
	
	
	public ToDoItem(Integer id, String taskName, boolean isCompleted) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.isCompleted = isCompleted;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public boolean isCompleted() {
		return isCompleted;
	}


	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	@Override
	 public String toString() {
		  return "ToDoItem [id=" + id + ", taskName=" + taskName + ", isCompleted=" + isCompleted + "]";
		 }
	
}


```

2\) Create Repo interface and extends from CRUD repo

```java

import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<ToDoItem, Integer>{

}

```

3\) Create Configuration 

```java

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
public class CouchConfig extends AbstractCouchbaseConfiguration {



	@Override
	public String getConnectionString() {
		// TODO Auto-generated method stub
		return "localhost";
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return "sunwei";
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "steven";
	}

	@Override
	public String getBucketName() {
		// TODO Auto-generated method stub
		return "ToDoItem";
	}
}

```

4\) Inject Repo \ Dao Service in the controller 

```java

@SpringBootApplication
@RestController
public class SpringBootCouchBaseExampleApplication {

	@Autowired
	private ItemRepo itemRepo;

	@PostConstruct
	public void doWork() {

		itemRepo.deleteAll();

		ToDoItem item = new ToDoItem(1, "wash cloth", false);

		itemRepo.save(item);

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCouchBaseExampleApplication.class, args);
	}

}


```




---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaAccessors.html
title: JavaAccessors
---

# JavaAccessors

## Content

Package [akka.http.impl.util](package-summary.html)
## Class JavaAccessors

- java.lang.Object
- - akka.http.impl.util.JavaAccessors

- ---

```
public class JavaAccessors
extends java.lang.Object
```

INTERNAL API
 
 Accessors for constructors with default arguments to be used from the Java implementation

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JavaAccessors](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [UniversalEntity](../../javadsl/model/UniversalEntity.html "interface in akka.http.javadsl.model")` | `[HttpEntity](#HttpEntity(akka.http.javadsl.model.ContentType,java.io.File))​([ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") contentType,  java.io.File file)` | INTERNAL API |
	| `static [UniversalEntity](../../javadsl/model/UniversalEntity.html "interface in akka.http.javadsl.model")` | `[HttpEntity](#HttpEntity(akka.http.javadsl.model.ContentType,java.nio.file.Path))​([ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") contentType,  java.nio.file.Path file)` | INTERNAL API |
	| `static [HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")` | `[HttpRequest](#HttpRequest())()` | INTERNAL API |
	| `static [HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model")` | `[HttpRequest](#HttpRequest(java.lang.String))​(java.lang.String uri)` | INTERNAL API |
	| `static [HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")` | `[HttpResponse](#HttpResponse())()` | INTERNAL API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JavaAccessors
		
		
		
		```
		public JavaAccessors()
		```

	- ### Method Detail
	
	
	
		- #### HttpRequest
		
		
		
		```
		public static [HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model") HttpRequest()
		```
		
		INTERNAL API
		- #### HttpRequest
		
		
		
		```
		public static [HttpRequest](../../javadsl/model/HttpRequest.html "class in akka.http.javadsl.model") HttpRequest​(java.lang.String uri)
		```
		
		INTERNAL API
		- #### HttpResponse
		
		
		
		```
		public static [HttpResponse](../../javadsl/model/HttpResponse.html "class in akka.http.javadsl.model") HttpResponse()
		```
		
		INTERNAL API
		- #### HttpEntity
		
		
		
		```
		public static [UniversalEntity](../../javadsl/model/UniversalEntity.html "interface in akka.http.javadsl.model") HttpEntity​([ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                         java.io.File file)
		```
		
		INTERNAL API
		- #### HttpEntity
		
		
		
		```
		public static [UniversalEntity](../../javadsl/model/UniversalEntity.html "interface in akka.http.javadsl.model") HttpEntity​([ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                         java.nio.file.Path file)
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/UniversalEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaAccessors.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaAccessors.html)*
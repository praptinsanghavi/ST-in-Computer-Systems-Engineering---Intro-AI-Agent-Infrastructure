---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler$.html
title: ExceptionHandler$
---

# ExceptionHandler$

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class ExceptionHandler$

- java.lang.Object
- - akka.http.javadsl.server.ExceptionHandler$

- ---

```
public class ExceptionHandler$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ExceptionHandler$](ExceptionHandler$.html "class in akka.http.javadsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExceptionHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[newBuilder](#newBuilder())()` | Creates a new builder DSL for creating an ExceptionHandler |
	| `[ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server")` | `[of](#of(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​[Route](Route.html "interface in akka.http.javadsl.server")> pf)` | INTERNAL API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ExceptionHandler$](ExceptionHandler$.html "class in akka.http.javadsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ExceptionHandler$
		
		
		
		```
		public ExceptionHandler$()
		```

	- ### Method Detail
	
	
	
		- #### newBuilder
		
		
		
		```
		public [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server") newBuilder()
		```
		
		Creates a new builder DSL for creating an ExceptionHandler
		
		Returns:
		(undocumented)
		- #### of
		
		
		
		```
		public [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") of​(scala.PartialFunction<java.lang.Throwable,​[Route](Route.html "interface in akka.http.javadsl.server")> pf)
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandlerBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler$.html)*
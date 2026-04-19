---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/QueryCorrelationId$.html
title: QueryCorrelationId$
---

# QueryCorrelationId$

## Content

Package [akka.persistence.query](package-summary.html)
## Class QueryCorrelationId$

- java.lang.Object
- - akka.persistence.query.QueryCorrelationId$

- ---

```
public class QueryCorrelationId$
extends java.lang.Object
```

(Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and
 error messages. Used by akka\-projections to make correlating projection logs with debug and trace logging from the
 underlying akka persistence query implementations possible.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [QueryCorrelationId$](QueryCorrelationId$.html "class in akka.persistence.query")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[QueryCorrelationId$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> T` | `[callWithCorrelationId](#callWithCorrelationId(java.lang.String,java.util.function.Supplier))​(java.lang.String correlationId,  java.util.function.Supplier<T> function)` | Java API: Expected to be used "around" calls to plugin query method, will clear the correlation id from thread local  to make sure there is no leak between logic executed on shared threads. |
	| `<T> T` | `[callWithCorrelationId](#callWithCorrelationId(java.util.Optional,java.util.function.Supplier))​(java.util.Optional<java.lang.String> correlationId,  java.util.function.Supplier<T> function)` | Java API: Expected to be used "around" calls to plugin query method to pass along a previously extracted optional correlation id,  will clear the correlation id from thread local to make sure there is no leak between logic executed on shared threads. |
	| `scala.Option<java.lang.String>` | `[get](#get())()` | Scala API: Expected to be called by query plugins directly after receiving a query call, before starting any asynchronous tasks. |
	| `java.util.Optional<java.lang.String>` | `[getCorrelationId](#getCorrelationId())()` | Java API: Expected to be called by query plugins directly after receiving a query call, before starting any asynchronous tasks. |
	| `<T> T` | `[withCorrelationId](#withCorrelationId(java.lang.String,scala.Function0))​(java.lang.String correlationId,  scala.Function0<T> f)` | Scala API: Expected to be used "around" calls to plugin query method, will clear the correlation id from thread local  to make sure there is no leak between logic executed on shared threads. |
	| `<T> T` | `[withCorrelationId](#withCorrelationId(scala.Option,scala.Function0))​(scala.Option<java.lang.String> correlationId,  scala.Function0<T> f)` | Scala API: Expected to be used "around" calls to plugin query method to pass along a previously extracted optional correlation id,  will clear the correlation id from thread local to make sure there is no leak between logic executed on shared threads. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [QueryCorrelationId$](QueryCorrelationId$.html "class in akka.persistence.query") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### QueryCorrelationId$
		
		
		
		```
		public QueryCorrelationId$()
		```

	- ### Method Detail
	
	
	
		- #### withCorrelationId
		
		
		
		```
		public <T> T withCorrelationId​(java.lang.String correlationId,
		                               scala.Function0<T> f)
		```
		
		Scala API: Expected to be used "around" calls to plugin query method, will clear the correlation id from thread local
		 to make sure there is no leak between logic executed on shared threads.
		- #### withCorrelationId
		
		
		
		```
		public <T> T withCorrelationId​(scala.Option<java.lang.String> correlationId,
		                               scala.Function0<T> f)
		```
		
		Scala API: Expected to be used "around" calls to plugin query method to pass along a previously extracted optional correlation id,
		 will clear the correlation id from thread local to make sure there is no leak between logic executed on shared threads.
		- #### get
		
		
		
		```
		public scala.Option<java.lang.String> get()
		```
		
		Scala API: Expected to be called by query plugins directly after receiving a query call, before starting any asynchronous tasks.
		 Calling code is responsible to clear it out after method returns. The value is stored in a thread local so is not available
		 across threads or streams. Further passing around of the uuid inside the query plugin implementation is up to the implementer.
		- #### callWithCorrelationId
		
		
		
		```
		public <T> T callWithCorrelationId​(java.util.Optional<java.lang.String> correlationId,
		                                   java.util.function.Supplier<T> function)
		```
		
		Java API: Expected to be used "around" calls to plugin query method to pass along a previously extracted optional correlation id,
		 will clear the correlation id from thread local to make sure there is no leak between logic executed on shared threads.
		- #### callWithCorrelationId
		
		
		
		```
		public <T> T callWithCorrelationId​(java.lang.String correlationId,
		                                   java.util.function.Supplier<T> function)
		```
		
		Java API: Expected to be used "around" calls to plugin query method, will clear the correlation id from thread local
		 to make sure there is no leak between logic executed on shared threads.
		- #### getCorrelationId
		
		
		
		```
		public java.util.Optional<java.lang.String> getCorrelationId()
		```
		
		Java API: Expected to be called by query plugins directly after receiving a query call, before starting any asynchronous tasks.
		 Calling code is responsible to clear it out after method returns. The value is stored in a thread local so is not available
		 across threads or streams. Further passing around of the uuid inside the query plugin implementation is up to the implementer.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/QueryCorrelationId$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/QueryCorrelationId$.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/QueryCorrelationId$.html)*
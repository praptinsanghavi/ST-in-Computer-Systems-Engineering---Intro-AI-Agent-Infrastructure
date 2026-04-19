---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply$.html
title: StatusReply$
---

# StatusReply$

## Content

Package [akka.pattern](package-summary.html)
## Class StatusReply$

- java.lang.Object
- - akka.pattern.StatusReply$

- ---

```
public class StatusReply$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StatusReply$](StatusReply$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StatusReply$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StatusReply](StatusReply.html "class in akka.pattern")<[Done](../Done.html "class in akka")>` | `[ack](#ack())()` | Java API: A general purpose message for using as an Ack |
	| `[StatusReply](StatusReply.html "class in akka.pattern")<[Done](../Done.html "class in akka")>` | `[Ack](#Ack())()` | Scala API: A general purpose message for using as an Ack |
	| `<T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[error](#error(java.lang.String))​(java.lang.String errorMessage)` | Java API: Create an status response with a error message describing why the request was failed or denied. |
	| `<T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[error](#error(java.lang.Throwable))​(java.lang.Throwable exception)` | Java API: Create an error response with a user defined `Throwable`. |
	| `<T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[fromTry](#fromTry(scala.util.Try))​(scala.util.Try<T> status)` | Scala API: Turn a try into a status reply. |
	| `<T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[fromTryKeepException](#fromTryKeepException(scala.util.Try))​(scala.util.Try<T> status)` | Scala API: Turn a Try into a status reply. |
	| `<T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[success](#success(T))​(T value)` | Java API: Create a successful reply containing `value` |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StatusReply$](StatusReply$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StatusReply$
		
		
		
		```
		public StatusReply$()
		```

	- ### Method Detail
	
	
	
		- #### Ack
		
		
		
		```
		public [StatusReply](StatusReply.html "class in akka.pattern")<[Done](../Done.html "class in akka")> Ack()
		```
		
		Scala API: A general purpose message for using as an Ack
		- #### ack
		
		
		
		```
		public [StatusReply](StatusReply.html "class in akka.pattern")<[Done](../Done.html "class in akka")> ack()
		```
		
		Java API: A general purpose message for using as an Ack
		- #### success
		
		
		
		```
		public <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> success​(T value)
		```
		
		Java API: Create a successful reply containing `value`
		- #### error
		
		
		
		```
		public <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> error​(java.lang.String errorMessage)
		```
		
		Java API: Create an status response with a error message describing why the request was failed or denied.
		- #### error
		
		
		
		```
		public <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> error​(java.lang.Throwable exception)
		```
		
		Java API: Create an error response with a user defined `Throwable`.
		 
		 Prefer the string based error response over this one when possible to avoid tightly coupled logic across
		 actors and passing internal failure details on to callers that can not do much to handle them.
		 
		
		
		 For cases where types are needed to identify errors and behave differently enumerating them with a specific
		 set of response messages may be a better alternative to encoding them as generic exceptions.
		 
		
		
		 Also note that Akka does not contain pre\-build serializers for arbitrary exceptions.
		- #### fromTryKeepException
		
		
		
		```
		public <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> fromTryKeepException​(scala.util.Try<T> status)
		```
		
		Scala API: Turn a Try into a status reply.
		 
		 Prefer the string based error response over this one when possible to avoid tightly coupled logic across
		 actors and passing internal failure details on to callers that can not do much to handle them. [`fromTry(scala.util.Try<T>)`](#fromTry(scala.util.Try))
		 provides a convenience factory doing that for `Try`.
		 
		
		
		 For cases where types are needed to identify errors and behave differently enumerating them with a specific
		 set of response messages may be a better alternative to encoding them as generic exceptions.
		 
		
		
		 Also note that Akka does not contain pre\-built serializers for arbitrary exceptions.
		- #### fromTry
		
		
		
		```
		public <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> fromTry​(scala.util.Try<T> status)
		```
		
		Scala API: Turn a try into a status reply.
		 
		 Transforms exceptions into status reply errors containing just the exception message string.
		 
		
		
		 See [`fromTryKeepException(scala.util.Try<T>)`](#fromTryKeepException(scala.util.Try)) for passing the exception along as is.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply$.html](https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply$.html)*
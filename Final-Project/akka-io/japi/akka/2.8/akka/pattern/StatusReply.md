---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/pattern/StatusReply.html
title: StatusReply
---

# StatusReply

## Content

Package [akka.pattern](package-summary.html)
## Class StatusReply\<T\>

- java.lang.Object
- - akka.pattern.StatusReply\<T\>

- Type Parameters:
`T` \- the type of value a successful reply would have

---

```
public final class StatusReply<T>
extends java.lang.Object
```

Generic top\-level message type for replies that signal failure or success. Convenient to use together with the
 `askWithStatus` ask variants.
 
 Create using the factory methods [`success(T)`](#success(T)) and [`error(java.lang.String)`](#error(java.lang.String)).
 

 Akka contains predefined serializers for the wrapper type and the textual error messages.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[StatusReply.Error$](StatusReply.Error$.html "class in akka.pattern")` | Scala API for creating and pattern matching an error response |
	| `static class` | `[StatusReply.ErrorMessage](StatusReply.ErrorMessage.html "class in akka.pattern")` | Carrier exception used for textual error descriptions. |
	| `static class` | `[StatusReply.ErrorMessage$](StatusReply.ErrorMessage$.html "class in akka.pattern")` |  |
	| `static class` | `[StatusReply.Success$](StatusReply.Success$.html "class in akka.pattern")` | Scala API for creation and pattern matching a successful response. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StatusReply](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [StatusReply](StatusReply.html "class in akka.pattern")<[Done](../Done.html "class in akka")>` | `[ack](#ack())()` | Java API: A general purpose message for using as an Ack |
	| `static [StatusReply](StatusReply.html "class in akka.pattern")<[Done](../Done.html "class in akka")>` | `[Ack](#Ack())()` | Scala API: A general purpose message for using as an Ack |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[error](#error(java.lang.String))​(java.lang.String errorMessage)` | Java API: Create an status response with a error message describing why the request was failed or denied. |
	| `static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[error](#error(java.lang.Throwable))​(java.lang.Throwable exception)` | Java API: Create an error response with a user defined `Throwable`. |
	| `static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[fromTry](#fromTry(scala.util.Try))​(scala.util.Try<T> status)` | Scala API: Turn a try into a status reply. |
	| `static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[fromTryKeepException](#fromTryKeepException(scala.util.Try))​(scala.util.Try<T> status)` | Scala API: Turn a Try into a status reply. |
	| `java.lang.Throwable` | `[getError](#getError())()` | Java API: returns the exception if the reply is a failure, or throws an exception if not. |
	| `[T](StatusReply.html "type parameter in StatusReply")` | `[getValue](#getValue())()` | Java API: in the case of a successful reply returns the value, if the reply was not successful the exception  the failure was created with is thrown |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isError](#isError())()` |  |
	| `boolean` | `[isSuccess](#isSuccess())()` |  |
	| `static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[success](#success(T))​(T value)` | Java API: Create a successful reply containing `value` |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StatusReply
		
		
		
		```
		public StatusReply()
		```

	- ### Method Detail
	
	
	
		- #### Ack
		
		
		
		```
		public static [StatusReply](StatusReply.html "class in akka.pattern")<[Done](../Done.html "class in akka")> Ack()
		```
		
		Scala API: A general purpose message for using as an Ack
		- #### ack
		
		
		
		```
		public static [StatusReply](StatusReply.html "class in akka.pattern")<[Done](../Done.html "class in akka")> ack()
		```
		
		Java API: A general purpose message for using as an Ack
		- #### success
		
		
		
		```
		public static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> success​(T value)
		```
		
		Java API: Create a successful reply containing `value`
		- #### error
		
		
		
		```
		public static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> error​(java.lang.String errorMessage)
		```
		
		Java API: Create an status response with a error message describing why the request was failed or denied.
		- #### error
		
		
		
		```
		public static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> error​(java.lang.Throwable exception)
		```
		
		Java API: Create an error response with a user defined `Throwable`.
		 
		 Prefer the string based error response over this one when possible to avoid tightly coupled logic across
		 actors and passing internal failure details on to callers that can not do much to handle them.
		 
		
		
		 For cases where types are needed to identify errors and behave differently enumerating them with a specific
		 set of response messages may be a better alternative to encoding them as generic exceptions.
		 
		
		
		 Also note that Akka does not contain pre\-build serializers for arbitrary exceptions.
		- #### fromTryKeepException
		
		
		
		```
		public static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> fromTryKeepException​(scala.util.Try<T> status)
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
		public static <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> fromTry​(scala.util.Try<T> status)
		```
		
		Scala API: Turn a try into a status reply.
		 
		 Transforms exceptions into status reply errors containing just the exception message string.
		 
		
		
		 See [`fromTryKeepException(scala.util.Try<T>)`](#fromTryKeepException(scala.util.Try)) for passing the exception along as is.
		- #### getValue
		
		
		
		```
		public [T](StatusReply.html "type parameter in StatusReply") getValue()
		```
		
		Java API: in the case of a successful reply returns the value, if the reply was not successful the exception
		 the failure was created with is thrown
		- #### getError
		
		
		
		```
		public java.lang.Throwable getError()
		```
		
		Java API: returns the exception if the reply is a failure, or throws an exception if not.
		- #### isError
		
		
		
		```
		public boolean isError()
		```
		- #### isSuccess
		
		
		
		```
		public boolean isSuccess()
		```
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/Done.html
- https://doc.akka.io/japi/akka/2.8/akka/pattern/StatusReply.Error$.html
- https://doc.akka.io/japi/akka/2.8/akka/pattern/StatusReply.ErrorMessage$.html
- https://doc.akka.io/japi/akka/2.8/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka/2.8/akka/pattern/StatusReply.Success$.html
- https://doc.akka.io/japi/akka/2.8/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka/2.8/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/pattern/StatusReply.html](https://doc.akka.io/japi/akka/2.8/akka/pattern/StatusReply.html)*
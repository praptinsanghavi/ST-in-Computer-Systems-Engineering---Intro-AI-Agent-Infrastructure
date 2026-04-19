---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedRequestContentRejection.html
title: MalformedRequestContentRejection
---

# MalformedRequestContentRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MalformedRequestContentRejection

- java.lang.Object
- - akka.http.scaladsl.server.MalformedRequestContentRejection

- All Implemented Interfaces:
`[MalformedRequestContentRejection](../../javadsl/server/MalformedRequestContentRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MalformedRequestContentRejection
extends java.lang.Object
implements [MalformedRequestContentRejection](../../javadsl/server/MalformedRequestContentRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by unmarshallers.
 Signals that the request was rejected because unmarshalling failed with an error that wasn't
 an `IllegalArgumentException`. Usually that means that the request content was not of the expected format.
 Note that semantic issues with the request content (e.g. because some parameter was out of range)
 will usually trigger a `ValidationRejection` instead.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.MalformedRequestContentRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MalformedRequestContentRejection](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String message,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `java.lang.Throwable` | `[cause](#cause())()` |  |
	| `java.lang.Throwable` | `[getCause](#getCause())()` |  |
	| `java.lang.String` | `[message](#message())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### MalformedRequestContentRejection
		
		
		
		```
		public MalformedRequestContentRejection​(java.lang.String message,
		                                        java.lang.Throwable cause)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### message
		
		
		
		```
		public java.lang.String message()
		```
		
		
		Specified by:
		`[message](../../javadsl/server/MalformedRequestContentRejection.html#message())` in interface `[MalformedRequestContentRejection](../../javadsl/server/MalformedRequestContentRejection.html "interface in akka.http.javadsl.server")`
		- #### cause
		
		
		
		```
		public java.lang.Throwable cause()
		```
		- #### getCause
		
		
		
		```
		public java.lang.Throwable getCause()
		```
		
		
		Specified by:
		`[getCause](../../javadsl/server/MalformedRequestContentRejection.html#getCause())` in interface `[MalformedRequestContentRejection](../../javadsl/server/MalformedRequestContentRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedRequestContentRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedRequestContentRejection.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
title: CircuitBreakerOpenRejection
---

# CircuitBreakerOpenRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class CircuitBreakerOpenRejection

- java.lang.Object
- - akka.http.scaladsl.server.CircuitBreakerOpenRejection

- All Implemented Interfaces:
`[CircuitBreakerOpenRejection](../../javadsl/server/CircuitBreakerOpenRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class CircuitBreakerOpenRejection
extends java.lang.Object
implements [CircuitBreakerOpenRejection](../../javadsl/server/CircuitBreakerOpenRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by the `onCompleteWithBreaker` directive.
 Signals that the request was rejected because the supplied circuit breaker is open and requests are failing fast.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.CircuitBreakerOpenRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreakerOpenRejection](#%3Cinit%3E(akka.pattern.CircuitBreakerOpenException))​(akka.pattern.CircuitBreakerOpenException cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `akka.pattern.CircuitBreakerOpenException` | `[cause](#cause())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### CircuitBreakerOpenRejection
		
		
		
		```
		public CircuitBreakerOpenRejection​(akka.pattern.CircuitBreakerOpenException cause)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### cause
		
		
		
		```
		public akka.pattern.CircuitBreakerOpenException cause()
		```
		
		
		Specified by:
		`[cause](../../javadsl/server/CircuitBreakerOpenRejection.html#cause())` in interface `[CircuitBreakerOpenRejection](../../javadsl/server/CircuitBreakerOpenRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html)*
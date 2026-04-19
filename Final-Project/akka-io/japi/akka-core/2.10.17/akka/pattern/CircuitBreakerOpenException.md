---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakerOpenException.html
title: CircuitBreakerOpenException
---

# CircuitBreakerOpenException

## Content

Package [akka.pattern](package-summary.html)
## Class CircuitBreakerOpenException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.pattern.CircuitBreakerOpenException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public class CircuitBreakerOpenException
extends [AkkaException](../AkkaException.html "class in akka")
implements scala.util.control.NoStackTrace
```

Exception thrown when Circuit Breaker is open.
 
 param: remainingDuration Stores remaining time before attempting a reset. Zero duration means the breaker is
 currently in half\-open state.
 param: message Defaults to "Circuit Breaker is open; calls are failing fast"

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.CircuitBreakerOpenException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreakerOpenException](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.concurrent.duration.FiniteDuration remainingDuration,  java.lang.String message)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[remainingDuration](#remainingDuration())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### CircuitBreakerOpenException
		
		
		
		```
		public CircuitBreakerOpenException​(scala.concurrent.duration.FiniteDuration remainingDuration,
		                                   java.lang.String message)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$2()
		```
		- #### remainingDuration
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration remainingDuration()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakerOpenException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakerOpenException.html)*
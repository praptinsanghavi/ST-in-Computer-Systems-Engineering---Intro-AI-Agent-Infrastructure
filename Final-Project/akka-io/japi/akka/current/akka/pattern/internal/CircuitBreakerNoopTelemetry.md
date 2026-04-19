---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerNoopTelemetry.html
title: CircuitBreakerNoopTelemetry
---

# CircuitBreakerNoopTelemetry

## Content

Package [akka.pattern.internal](package-summary.html)
## Class CircuitBreakerNoopTelemetry

- java.lang.Object
- - akka.pattern.internal.CircuitBreakerNoopTelemetry

- ---

```
public class CircuitBreakerNoopTelemetry
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreakerNoopTelemetry](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[onCallBreakerOpenFailure](#onCallBreakerOpenFailure())()` |  |
	| `static void` | `[onCallFailure](#onCallFailure(long))​(long elapsedNanos)` |  |
	| `static void` | `[onCallSuccess](#onCallSuccess(long))​(long elapsedNanos)` |  |
	| `static void` | `[onCallTimeoutFailure](#onCallTimeoutFailure(long))​(long elapsedNanos)` |  |
	| `static void` | `[onClose](#onClose())()` |  |
	| `static void` | `[onHalfOpen](#onHalfOpen())()` |  |
	| `static void` | `[onOpen](#onOpen())()` |  |
	| `static void` | `[stopped](#stopped())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CircuitBreakerNoopTelemetry
		
		
		
		```
		public CircuitBreakerNoopTelemetry()
		```

	- ### Method Detail
	
	
	
		- #### onOpen
		
		
		
		```
		public static void onOpen()
		```
		- #### onClose
		
		
		
		```
		public static void onClose()
		```
		- #### onHalfOpen
		
		
		
		```
		public static void onHalfOpen()
		```
		- #### onCallSuccess
		
		
		
		```
		public static void onCallSuccess​(long elapsedNanos)
		```
		- #### onCallFailure
		
		
		
		```
		public static void onCallFailure​(long elapsedNanos)
		```
		- #### onCallTimeoutFailure
		
		
		
		```
		public static void onCallTimeoutFailure​(long elapsedNanos)
		```
		- #### onCallBreakerOpenFailure
		
		
		
		```
		public static void onCallBreakerOpenFailure()
		```
		- #### stopped
		
		
		
		```
		public static void stopped()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pattern/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerNoopTelemetry.html](https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerNoopTelemetry.html)*
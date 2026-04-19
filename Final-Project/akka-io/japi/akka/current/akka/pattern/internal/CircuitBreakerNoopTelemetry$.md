---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerNoopTelemetry$.html
title: CircuitBreakerNoopTelemetry$
---

# CircuitBreakerNoopTelemetry$

## Content

Package [akka.pattern.internal](package-summary.html)
## Class CircuitBreakerNoopTelemetry$

- java.lang.Object
- - akka.pattern.internal.CircuitBreakerNoopTelemetry$

- All Implemented Interfaces:
`[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`

---

```
public class CircuitBreakerNoopTelemetry$
extends java.lang.Object
implements [CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CircuitBreakerNoopTelemetry$](CircuitBreakerNoopTelemetry$.html "class in akka.pattern.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreakerNoopTelemetry$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[onCallBreakerOpenFailure](#onCallBreakerOpenFailure())()` | Invoked for each call when the future is completed with  `akka.pattern.CircuitBreakerOpenException` |
	| `void` | `[onCallFailure](#onCallFailure(long))​(long elapsedNanos)` | Invoked for each call when the future is completed with exception, except for  `scala.concurrent.TimeoutException` and [`CircuitBreakerOpenException`](../CircuitBreakerOpenException.html "class in akka.pattern")  that are handled by separate methods. |
	| `void` | `[onCallSuccess](#onCallSuccess(long))​(long elapsedNanos)` | Invoked for each successful call. |
	| `void` | `[onCallTimeoutFailure](#onCallTimeoutFailure(long))​(long elapsedNanos)` | Invoked for each call when the future is completed with `java.util.concurrent.TimeoutException` |
	| `void` | `[onClose](#onClose())()` | Invoked when the circuit breaker transitions to the close state. |
	| `void` | `[onHalfOpen](#onHalfOpen())()` | Invoked when the circuit breaker transitions to the half\-open state after reset timeout. |
	| `void` | `[onOpen](#onOpen())()` | Invoked when the circuit breaker transitions to the open state. |
	| `void` | `[stopped](#stopped())()` | Called when the circuit breaker is removed, e.g. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CircuitBreakerNoopTelemetry$](CircuitBreakerNoopTelemetry$.html "class in akka.pattern.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CircuitBreakerNoopTelemetry$
		
		
		
		```
		public CircuitBreakerNoopTelemetry$()
		```

	- ### Method Detail
	
	
	
		- #### onOpen
		
		
		
		```
		public void onOpen()
		```
		
		Description copied from interface: `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html#onOpen())`
		Invoked when the circuit breaker transitions to the open state.
		
		Specified by:
		`[onOpen](CircuitBreakerTelemetry.html#onOpen())` in interface `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`
		- #### onClose
		
		
		
		```
		public void onClose()
		```
		
		Description copied from interface: `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html#onClose())`
		Invoked when the circuit breaker transitions to the close state.
		
		Specified by:
		`[onClose](CircuitBreakerTelemetry.html#onClose())` in interface `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`
		- #### onHalfOpen
		
		
		
		```
		public void onHalfOpen()
		```
		
		Description copied from interface: `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html#onHalfOpen())`
		Invoked when the circuit breaker transitions to the half\-open state after reset timeout.
		
		Specified by:
		`[onHalfOpen](CircuitBreakerTelemetry.html#onHalfOpen())` in interface `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`
		- #### onCallSuccess
		
		
		
		```
		public void onCallSuccess​(long elapsedNanos)
		```
		
		Description copied from interface: `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html#onCallSuccess(long))`
		Invoked for each successful call.
		 
		
		Specified by:
		`[onCallSuccess](CircuitBreakerTelemetry.html#onCallSuccess(long))` in interface `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`
		Parameters:
		`elapsedNanos` \- the elapsed duration of the call in nanoseconds
		- #### onCallFailure
		
		
		
		```
		public void onCallFailure​(long elapsedNanos)
		```
		
		Description copied from interface: `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html#onCallFailure(long))`
		Invoked for each call when the future is completed with exception, except for
		 `scala.concurrent.TimeoutException` and [`CircuitBreakerOpenException`](../CircuitBreakerOpenException.html "class in akka.pattern")
		 that are handled by separate methods.
		 
		
		Specified by:
		`[onCallFailure](CircuitBreakerTelemetry.html#onCallFailure(long))` in interface `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`
		Parameters:
		`elapsedNanos` \- the elapsed duration of the call in nanoseconds
		- #### onCallTimeoutFailure
		
		
		
		```
		public void onCallTimeoutFailure​(long elapsedNanos)
		```
		
		Description copied from interface: `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html#onCallTimeoutFailure(long))`
		Invoked for each call when the future is completed with `java.util.concurrent.TimeoutException`
		
		
		Specified by:
		`[onCallTimeoutFailure](CircuitBreakerTelemetry.html#onCallTimeoutFailure(long))` in interface `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`
		Parameters:
		`elapsedNanos` \- the elapsed duration of the call in nanoseconds
		- #### onCallBreakerOpenFailure
		
		
		
		```
		public void onCallBreakerOpenFailure()
		```
		
		Description copied from interface: `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html#onCallBreakerOpenFailure())`
		Invoked for each call when the future is completed with
		 `akka.pattern.CircuitBreakerOpenException`
		
		Specified by:
		`[onCallBreakerOpenFailure](CircuitBreakerTelemetry.html#onCallBreakerOpenFailure())` in interface `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`
		- #### stopped
		
		
		
		```
		public void stopped()
		```
		
		Description copied from interface: `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html#stopped())`
		Called when the circuit breaker is removed, e.g. expired due to inactivity. It is also called
		 if the circuit breaker is re\-configured, before calling [`CircuitBreakerTelemetryProvider.start(java.lang.String, akka.actor.ExtendedActorSystem)`](CircuitBreakerTelemetryProvider.html#start(java.lang.String,akka.actor.ExtendedActorSystem)).
		
		Specified by:
		`[stopped](CircuitBreakerTelemetry.html#stopped())` in interface `[CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "interface in akka.pattern.internal")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerNoopTelemetry$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetry.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetryProvider.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerNoopTelemetry$.html](https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerNoopTelemetry$.html)*
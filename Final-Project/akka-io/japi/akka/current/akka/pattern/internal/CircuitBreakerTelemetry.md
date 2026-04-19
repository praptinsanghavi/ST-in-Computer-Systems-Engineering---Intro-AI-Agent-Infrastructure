---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetry.html
title: CircuitBreakerTelemetry
---

# CircuitBreakerTelemetry

## Content

Package [akka.pattern.internal](package-summary.html)
## Interface CircuitBreakerTelemetry

- All Known Implementing Classes:
`[CircuitBreakerNoopTelemetry$](CircuitBreakerNoopTelemetry$.html "class in akka.pattern.internal")`

---

```
public interface CircuitBreakerTelemetry
```

Service Provider Interface (SPI) for collecting metrics from Circuit Breaker.
 
 Implementations must include a single constructor with two arguments: Circuit Breaker id
 and `ExtendedActorSystem`. To setup your implementation, add a setting in your `application.conf`:
 

```

 akka.circuit-breaker.telemetry.implementations += com.example.MyMetrics
 
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[onCallBreakerOpenFailure](#onCallBreakerOpenFailure())()` | Invoked for each call when the future is completed with  `akka.pattern.CircuitBreakerOpenException` |
	| `void` | `[onCallFailure](#onCallFailure(long))​(long elapsedNanos)` | Invoked for each call when the future is completed with exception, except for  `scala.concurrent.TimeoutException` and [`CircuitBreakerOpenException`](../CircuitBreakerOpenException.html "class in akka.pattern")  that are handled by separate methods. |
	| `void` | `[onCallSuccess](#onCallSuccess(long))​(long elapsedNanos)` | Invoked for each successful call. |
	| `void` | `[onCallTimeoutFailure](#onCallTimeoutFailure(long))​(long elapsedNanos)` | Invoked for each call when the future is completed with `java.util.concurrent.TimeoutException` |
	| `void` | `[onClose](#onClose())()` | Invoked when the circuit breaker transitions to the close state. |
	| `void` | `[onHalfOpen](#onHalfOpen())()` | Invoked when the circuit breaker transitions to the half\-open state after reset timeout. |
	| `void` | `[onOpen](#onOpen())()` | Invoked when the circuit breaker transitions to the open state. |
	| `void` | `[stopped](#stopped())()` | Called when the circuit breaker is removed, e.g. |

- - ### Method Detail
	
	
	
		- #### onCallBreakerOpenFailure
		
		
		
		```
		void onCallBreakerOpenFailure()
		```
		
		Invoked for each call when the future is completed with
		 `akka.pattern.CircuitBreakerOpenException`
		- #### onCallFailure
		
		
		
		```
		void onCallFailure​(long elapsedNanos)
		```
		
		Invoked for each call when the future is completed with exception, except for
		 `scala.concurrent.TimeoutException` and [`CircuitBreakerOpenException`](../CircuitBreakerOpenException.html "class in akka.pattern")
		 that are handled by separate methods.
		 
		
		Parameters:
		`elapsedNanos` \- the elapsed duration of the call in nanoseconds
		- #### onCallSuccess
		
		
		
		```
		void onCallSuccess​(long elapsedNanos)
		```
		
		Invoked for each successful call.
		 
		
		Parameters:
		`elapsedNanos` \- the elapsed duration of the call in nanoseconds
		- #### onCallTimeoutFailure
		
		
		
		```
		void onCallTimeoutFailure​(long elapsedNanos)
		```
		
		Invoked for each call when the future is completed with `java.util.concurrent.TimeoutException`
		
		
		Parameters:
		`elapsedNanos` \- the elapsed duration of the call in nanoseconds
		- #### onClose
		
		
		
		```
		void onClose()
		```
		
		Invoked when the circuit breaker transitions to the close state.
		- #### onHalfOpen
		
		
		
		```
		void onHalfOpen()
		```
		
		Invoked when the circuit breaker transitions to the half\-open state after reset timeout.
		- #### onOpen
		
		
		
		```
		void onOpen()
		```
		
		Invoked when the circuit breaker transitions to the open state.
		- #### stopped
		
		
		
		```
		void stopped()
		```
		
		Called when the circuit breaker is removed, e.g. expired due to inactivity. It is also called
		 if the circuit breaker is re\-configured, before calling [`CircuitBreakerTelemetryProvider.start(java.lang.String, akka.actor.ExtendedActorSystem)`](CircuitBreakerTelemetryProvider.html#start(java.lang.String,akka.actor.ExtendedActorSystem)).

## Code Examples

### Example 1: Interface CircuitBreakerTelemetry

```text
akka.circuit-breaker.telemetry.implementations += com.example.MyMetrics
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerNoopTelemetry$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetryProvider.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetry.html](https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetry.html)*
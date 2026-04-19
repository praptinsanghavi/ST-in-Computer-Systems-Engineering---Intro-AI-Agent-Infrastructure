---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker.html
title: CircuitBreaker
---

# CircuitBreaker

## Content

Package [akka.pattern](package-summary.html)
## Class CircuitBreaker

- java.lang.Object
- - akka.pattern.CircuitBreaker

- ---

```
public class CircuitBreaker
extends java.lang.Object
```

Provides circuit breaker functionality for stability when working with "dangerous" operations, e.g. calls to
 remote systems.
 
 Transitions through three states:
 \- In \*Closed\* state, calls pass through until the `maxFailures` count is reached. This causes the circuit breaker
 to open. Both exceptions and calls exceeding `callTimeout` are considered failures.
 \- In \*Open\* state, calls fail\-fast with an exception. After `resetTimeout`, circuit breaker transitions to
 half\-open state.
 \- In \*Half\-Open\* state, the first call will be allowed through, if it succeeds the circuit breaker will reset to
 closed state. If it fails, the circuit breaker will re\-open to open state. All calls beyond the first that
 execute while the first is running will fail\-fast with an exception.
 

 param: scheduler Reference to Akka scheduler
 param: maxFailures Maximum number of failures before opening the circuit
 param: callTimeout `FiniteDuration` of time after which to consider a call a failure
 param: resetTimeout `FiniteDuration` of time after which to attempt to close the circuit
 param: randomFactor after calculation of the exponential back\-off an additional random delay
 based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 randomFactor should be in range `0.0` (inclusive) and `1.0` (inclusive).
 In order to skip this additional delay pass in `0`.
 param: executor `ExecutionContext` used for execution of state transition listeners

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[CircuitBreaker.State](CircuitBreaker.State.html "interface in akka.pattern")` | Internal state abstraction |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `protected static java.lang.invoke.VarHandle` | `[currentStateHandle](#currentStateHandle)` |  |
	| `protected static java.lang.invoke.VarHandle` | `[resetTimeoutHandle](#resetTimeoutHandle)` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreaker](#%3Cinit%3E(akka.actor.Scheduler,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,double,scala.collection.immutable.Set,akka.pattern.internal.CircuitBreakerTelemetry,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  scala.concurrent.duration.FiniteDuration callTimeout,  scala.concurrent.duration.FiniteDuration resetTimeout,  scala.concurrent.duration.FiniteDuration maxResetTimeout,  double exponentialBackoffFactor,  double randomFactor,  scala.collection.immutable.Set<java.lang.String> allowExceptions,  [CircuitBreakerTelemetry](internal/CircuitBreakerTelemetry.html "interface in akka.pattern.internal") telemetry,  scala.concurrent.ExecutionContext executor)` |  |
	| `[CircuitBreaker](#%3Cinit%3E(akka.actor.Scheduler,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,double,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  scala.concurrent.duration.FiniteDuration callTimeout,  scala.concurrent.duration.FiniteDuration resetTimeout,  scala.concurrent.duration.FiniteDuration maxResetTimeout,  double exponentialBackoffFactor,  double randomFactor,  scala.concurrent.ExecutionContext executor)` |  |
	| `[CircuitBreaker](#%3Cinit%3E(akka.actor.Scheduler,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  scala.concurrent.duration.FiniteDuration callTimeout,  scala.concurrent.duration.FiniteDuration resetTimeout,  scala.concurrent.duration.FiniteDuration maxResetTimeout,  double exponentialBackoffFactor,  scala.concurrent.ExecutionContext executor)` |  |
	| `[CircuitBreaker](#%3Cinit%3E(akka.actor.Scheduler,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  scala.concurrent.duration.FiniteDuration callTimeout,  scala.concurrent.duration.FiniteDuration resetTimeout,  scala.concurrent.ExecutionContext executor)` |  |
	| `[CircuitBreaker](#%3Cinit%3E(scala.concurrent.ExecutionContext,akka.actor.Scheduler,int,java.time.Duration,java.time.Duration))​(scala.concurrent.ExecutionContext executor,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  java.time.Duration callTimeout,  java.time.Duration resetTimeout)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[addOnCallBreakerOpenListener](#addOnCallBreakerOpenListener(java.lang.Runnable))​(java.lang.Runnable callback)` | JavaAPI for onCallBreakerOpen. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[addOnCallFailureListener](#addOnCallFailureListener(java.util.function.Consumer))​(java.util.function.Consumer<java.lang.Object> callback)` | JavaAPI for onCallFailure. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[addOnCallSuccessListener](#addOnCallSuccessListener(java.util.function.Consumer))​(java.util.function.Consumer<java.lang.Object> callback)` | JavaAPI for onCallSuccess |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[addOnCallTimeoutListener](#addOnCallTimeoutListener(java.util.function.Consumer))​(java.util.function.Consumer<java.lang.Object> callback)` | JavaAPI for onCallTimeout. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[addOnCloseListener](#addOnCloseListener(java.lang.Runnable))​(java.lang.Runnable callback)` | JavaAPI for onClose |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[addOnHalfOpenListener](#addOnHalfOpenListener(java.lang.Runnable))​(java.lang.Runnable callback)` | JavaAPI for onHalfOpen |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[addOnOpenListener](#addOnOpenListener(java.lang.Runnable))​(java.lang.Runnable callback)` | Java API for onOpen |
	| `scala.collection.immutable.Set<java.lang.String>` | `[allowExceptions](#allowExceptions())()` |  |
	| `static [CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[apply](#apply(akka.actor.Scheduler,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  scala.concurrent.duration.FiniteDuration callTimeout,  scala.concurrent.duration.FiniteDuration resetTimeout)` | Create a new CircuitBreaker. |
	| `static [CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[apply](#apply(java.lang.String,akka.actor.ClassicActorSystemProvider))​(java.lang.String id,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Create or find a CircuitBreaker in registry. |
	| `<T> scala.concurrent.Future<T>` | `[callWithCircuitBreaker](#callWithCircuitBreaker(java.util.concurrent.Callable))​(java.util.concurrent.Callable<scala.concurrent.Future<T>> body)` | Java API for [`withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>, scala.Function1<scala.util.Try<T>, java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1)). |
	| `<T> scala.concurrent.Future<T>` | `[callWithCircuitBreaker](#callWithCircuitBreaker(java.util.concurrent.Callable,java.util.function.BiFunction))​(java.util.concurrent.Callable<scala.concurrent.Future<T>> body,  java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> defineFailureFn)` | Java API for [`withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>, scala.Function1<scala.util.Try<T>, java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1)). |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[callWithCircuitBreakerCS](#callWithCircuitBreakerCS(java.util.concurrent.Callable))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> body)` | Java API (8\) for [`withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>, scala.Function1<scala.util.Try<T>, java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1)). |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[callWithCircuitBreakerCS](#callWithCircuitBreakerCS(java.util.concurrent.Callable,java.util.function.BiFunction))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> body,  java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> defineFailureFn)` | Java API (8\) for [`withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>, scala.Function1<scala.util.Try<T>, java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1)). |
	| `<T> T` | `[callWithSyncCircuitBreaker](#callWithSyncCircuitBreaker(java.util.concurrent.Callable))​(java.util.concurrent.Callable<T> body)` | Java API for [`withSyncCircuitBreaker(scala.Function0<T>)`](#withSyncCircuitBreaker(scala.Function0)). |
	| `<T> T` | `[callWithSyncCircuitBreaker](#callWithSyncCircuitBreaker(java.util.concurrent.Callable,java.util.function.BiFunction))​(java.util.concurrent.Callable<T> body,  java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> defineFailureFn)` | Java API for [`withSyncCircuitBreaker(scala.Function0<T>)`](#withSyncCircuitBreaker(scala.Function0)). |
	| `protected static <T> scala.Function1<scala.util.Try<T>,​java.lang.Object>` | `[convertJavaFailureFnToScala](#convertJavaFailureFnToScala(java.util.function.BiFunction))​(java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> javaFn)` |  |
	| `static [CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[create](#create(akka.actor.Scheduler,int,java.time.Duration,java.time.Duration))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  java.time.Duration callTimeout,  java.time.Duration resetTimeout)` | Java API: Create a new CircuitBreaker. |
	| `void` | `[fail](#fail())()` | Mark a failed call through CircuitBreaker. |
	| `boolean` | `[isClosed](#isClosed())()` | Return true if the internal state is Closed. |
	| `boolean` | `[isHalfOpen](#isHalfOpen())()` | Return true if the internal state is HalfOpen. |
	| `boolean` | `[isOpen](#isOpen())()` | Return true if the internal state is Open. |
	| `static [CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[lookup](#lookup(java.lang.String,akka.actor.ClassicActorSystemProvider))​(java.lang.String id,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Java API: Create or find a CircuitBreaker in registry. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[onCallBreakerOpen](#onCallBreakerOpen(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> callback)` | Adds a callback to execute if call was failed due to open breaker. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[onCallFailure](#onCallFailure(scala.Function1))​(scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit> callback)` | Adds a callback to execute if the call finished with failure. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[onCallSuccess](#onCallSuccess(scala.Function1))​(scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit> callback)` | Adds a callback to execute when call finished with success. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[onCallTimeout](#onCallTimeout(scala.Function1))​(scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit> callback)` | Adds a callback to execute if a call finished with timeout. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[onClose](#onClose(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> callback)` | Adds a callback to execute when circuit breaker state closes |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[onHalfOpen](#onHalfOpen(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> callback)` | Adds a callback to execute when circuit breaker transitions to half\-open  The callback is run in the `ExecutionContext` supplied in the constructor. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[onOpen](#onOpen(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> callback)` | Adds a callback to execute when circuit breaker opens |
	| `scala.concurrent.duration.FiniteDuration` | `[resetTimeout](#resetTimeout())()` |  |
	| `void` | `[succeed](#succeed())()` | Mark a successful call through CircuitBreaker. |
	| `[CircuitBreakerTelemetry](internal/CircuitBreakerTelemetry.html "interface in akka.pattern.internal")` | `[telemetry](#telemetry())()` |  |
	| `<T> scala.concurrent.Future<T>` | `[withCircuitBreaker](#withCircuitBreaker(scala.Function0))​(scala.Function0<scala.concurrent.Future<T>> body)` | Wraps invocations of asynchronous calls that need to be protected. |
	| `<T> scala.concurrent.Future<T>` | `[withCircuitBreaker](#withCircuitBreaker(scala.Function0,scala.Function1))​(scala.Function0<scala.concurrent.Future<T>> body,  scala.Function1<scala.util.Try<T>,​java.lang.Object> defineFailureFn)` | Wraps invocations of asynchronous calls that need to be protected. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[withExponentialBackoff](#withExponentialBackoff(java.time.Duration))​(java.time.Duration maxResetTimeout)` | The `resetTimeout` will be increased exponentially for each failed attempt to close the circuit. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[withExponentialBackoff](#withExponentialBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration maxResetTimeout)` | The `resetTimeout` will be increased exponentially for each failed attempt to close the circuit. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[withRandomFactor](#withRandomFactor(double))​(double randomFactor)` | Adds jitter to the delay. |
	| `<T> T` | `[withSyncCircuitBreaker](#withSyncCircuitBreaker(scala.Function0))​(scala.Function0<T> body)` | Wraps invocations of synchronous calls that need to be protected. |
	| `<T> T` | `[withSyncCircuitBreaker](#withSyncCircuitBreaker(scala.Function0,scala.Function1))​(scala.Function0<T> body,  scala.Function1<scala.util.Try<T>,​java.lang.Object> defineFailureFn)` | Wraps invocations of synchronous calls that need to be protected. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### currentStateHandle
		
		
		
		```
		protected static final java.lang.invoke.VarHandle currentStateHandle
		```
		- #### resetTimeoutHandle
		
		
		
		```
		protected static final java.lang.invoke.VarHandle resetTimeoutHandle
		```

	- ### Constructor Detail
	
	
	
		- #### CircuitBreaker
		
		
		
		```
		public CircuitBreaker​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                      int maxFailures,
		                      scala.concurrent.duration.FiniteDuration callTimeout,
		                      scala.concurrent.duration.FiniteDuration resetTimeout,
		                      scala.concurrent.duration.FiniteDuration maxResetTimeout,
		                      double exponentialBackoffFactor,
		                      double randomFactor,
		                      scala.collection.immutable.Set<java.lang.String> allowExceptions,
		                      [CircuitBreakerTelemetry](internal/CircuitBreakerTelemetry.html "interface in akka.pattern.internal") telemetry,
		                      scala.concurrent.ExecutionContext executor)
		```
		- #### CircuitBreaker
		
		
		
		```
		public CircuitBreaker​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                      int maxFailures,
		                      scala.concurrent.duration.FiniteDuration callTimeout,
		                      scala.concurrent.duration.FiniteDuration resetTimeout,
		                      scala.concurrent.duration.FiniteDuration maxResetTimeout,
		                      double exponentialBackoffFactor,
		                      double randomFactor,
		                      scala.concurrent.ExecutionContext executor)
		```
		- #### CircuitBreaker
		
		
		
		```
		public CircuitBreaker​(scala.concurrent.ExecutionContext executor,
		                      [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                      int maxFailures,
		                      java.time.Duration callTimeout,
		                      java.time.Duration resetTimeout)
		```
		- #### CircuitBreaker
		
		
		
		```
		public CircuitBreaker​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                      int maxFailures,
		                      scala.concurrent.duration.FiniteDuration callTimeout,
		                      scala.concurrent.duration.FiniteDuration resetTimeout,
		                      scala.concurrent.ExecutionContext executor)
		```
		- #### CircuitBreaker
		
		
		
		```
		public CircuitBreaker​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                      int maxFailures,
		                      scala.concurrent.duration.FiniteDuration callTimeout,
		                      scala.concurrent.duration.FiniteDuration resetTimeout,
		                      scala.concurrent.duration.FiniteDuration maxResetTimeout,
		                      double exponentialBackoffFactor,
		                      scala.concurrent.ExecutionContext executor)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") apply​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                   int maxFailures,
		                                   scala.concurrent.duration.FiniteDuration callTimeout,
		                                   scala.concurrent.duration.FiniteDuration resetTimeout)
		```
		
		Create a new CircuitBreaker.
		 
		 Callbacks run in caller's thread when using withSyncCircuitBreaker, and in same ExecutionContext as the passed
		 in Future when using withCircuitBreaker. To use another ExecutionContext for the callbacks you can specify the
		 executor in the constructor.
		 
		
		
		
		Parameters:
		`scheduler` \- Reference to Akka scheduler
		`maxFailures` \- Maximum number of failures before opening the circuit
		`callTimeout` \- `FiniteDuration` of time after which to consider a call a failure
		`resetTimeout` \- `FiniteDuration` of time after which to attempt to close the circuit
		- #### apply
		
		
		
		```
		public static [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") apply​(java.lang.String id,
		                                   [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Create or find a CircuitBreaker in registry.
		 
		
		Parameters:
		`id` \- Circuit Breaker identifier
		`system` \- `ActorSystem` that is storing this [`CircuitBreaker`](CircuitBreaker.html "class in akka.pattern")
		- #### create
		
		
		
		```
		public static [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") create​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                    int maxFailures,
		                                    java.time.Duration callTimeout,
		                                    java.time.Duration resetTimeout)
		```
		
		Java API: Create a new CircuitBreaker.
		 
		 Callbacks run in caller's thread when using withSyncCircuitBreaker, and in same ExecutionContext as the passed
		 in Future when using withCircuitBreaker. To use another ExecutionContext for the callbacks you can specify the
		 executor in the constructor.
		 
		
		
		
		Parameters:
		`scheduler` \- Reference to Akka scheduler
		`maxFailures` \- Maximum number of failures before opening the circuit
		`callTimeout` \- `Duration` of time after which to consider a call a failure
		`resetTimeout` \- `Duration` of time after which to attempt to close the circuit
		- #### lookup
		
		
		
		```
		public static [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") lookup​(java.lang.String id,
		                                    [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Java API: Create or find a CircuitBreaker in registry.
		 
		
		Parameters:
		`id` \- Circuit Breaker identifier
		`system` \- `ActorSystem` that is storing this [`CircuitBreaker`](CircuitBreaker.html "class in akka.pattern")
		- #### convertJavaFailureFnToScala
		
		
		
		```
		protected static <T> scala.Function1<scala.util.Try<T>,​java.lang.Object> convertJavaFailureFnToScala​(java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> javaFn)
		```
		- #### resetTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration resetTimeout()
		```
		- #### allowExceptions
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> allowExceptions()
		```
		- #### telemetry
		
		
		
		```
		public [CircuitBreakerTelemetry](internal/CircuitBreakerTelemetry.html "interface in akka.pattern.internal") telemetry()
		```
		- #### withExponentialBackoff
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") withExponentialBackoff​(scala.concurrent.duration.FiniteDuration maxResetTimeout)
		```
		
		The `resetTimeout` will be increased exponentially for each failed attempt to close the circuit.
		 The default exponential backoff factor is 2\.
		 
		
		Parameters:
		`maxResetTimeout` \- the upper bound of resetTimeout
		- #### withExponentialBackoff
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") withExponentialBackoff​(java.time.Duration maxResetTimeout)
		```
		
		The `resetTimeout` will be increased exponentially for each failed attempt to close the circuit.
		 The default exponential backoff factor is 2\.
		 
		
		Parameters:
		`maxResetTimeout` \- the upper bound of resetTimeout
		- #### withRandomFactor
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") withRandomFactor​(double randomFactor)
		```
		
		Adds jitter to the delay.
		
		Parameters:
		`randomFactor` \- after calculation of the back\-off an additional random delay based on this
		 factor is added, e.g. 0\.2 adds up to 20% delay. In order to skip this
		 additional delay pass in 0\.
		- #### withCircuitBreaker
		
		
		
		```
		public <T> scala.concurrent.Future<T> withCircuitBreaker​(scala.Function0<scala.concurrent.Future<T>> body,
		                                                         scala.Function1<scala.util.Try<T>,​java.lang.Object> defineFailureFn)
		```
		
		Wraps invocations of asynchronous calls that need to be protected.
		 
		
		Parameters:
		`body` \- Call needing protected
		`defineFailureFn` \- function that define what should be consider failure and thus increase failure count
		Returns:
		`Future` containing the call result or a
		 `scala.concurrent.TimeoutException` if the call timed out
		- #### withCircuitBreaker
		
		
		
		```
		public <T> scala.concurrent.Future<T> withCircuitBreaker​(scala.Function0<scala.concurrent.Future<T>> body)
		```
		
		Wraps invocations of asynchronous calls that need to be protected.
		 
		
		Parameters:
		`body` \- Call needing protected
		Returns:
		`Future` containing the call result or a
		 `scala.concurrent.TimeoutException` if the call timed out
		- #### callWithCircuitBreaker
		
		
		
		```
		public <T> scala.concurrent.Future<T> callWithCircuitBreaker​(java.util.concurrent.Callable<scala.concurrent.Future<T>> body)
		```
		
		Java API for [`withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>, scala.Function1<scala.util.Try<T>, java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1)).
		 
		
		Parameters:
		`body` \- Call needing protected
		Returns:
		`Future` containing the call result or a
		 `scala.concurrent.TimeoutException` if the call timed out
		- #### callWithCircuitBreaker
		
		
		
		```
		public <T> scala.concurrent.Future<T> callWithCircuitBreaker​(java.util.concurrent.Callable<scala.concurrent.Future<T>> body,
		                                                             java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> defineFailureFn)
		```
		
		Java API for [`withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>, scala.Function1<scala.util.Try<T>, java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1)).
		 
		
		Parameters:
		`body` \- Call needing protected
		`defineFailureFn` \- function that define what should be consider failure and thus increase failure count
		Returns:
		`Future` containing the call result or a
		 `scala.concurrent.TimeoutException` if the call timed out
		- #### callWithCircuitBreakerCS
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> callWithCircuitBreakerCS​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> body)
		```
		
		Java API (8\) for [`withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>, scala.Function1<scala.util.Try<T>, java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1)).
		 
		
		Parameters:
		`body` \- Call needing protected
		Returns:
		`CompletionStage` containing the call result or a
		 `scala.concurrent.TimeoutException` if the call timed out
		- #### callWithCircuitBreakerCS
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> callWithCircuitBreakerCS​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> body,
		                                                                            java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> defineFailureFn)
		```
		
		Java API (8\) for [`withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>, scala.Function1<scala.util.Try<T>, java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1)).
		 
		
		Parameters:
		`body` \- Call needing protected
		`defineFailureFn` \- function that define what should be consider failure and thus increase failure count
		Returns:
		`CompletionStage` containing the call result or a
		 `scala.concurrent.TimeoutException` if the call timed out
		- #### withSyncCircuitBreaker
		
		
		
		```
		public <T> T withSyncCircuitBreaker​(scala.Function0<T> body)
		```
		
		Wraps invocations of synchronous calls that need to be protected.
		 
		 Calls are run in the caller's thread. Because of the synchronous nature of
		 this call, the `scala.concurrent.TimeoutException` will only be thrown
		 after the body has completed.
		 
		
		
		 Throws java.util.concurrent.TimeoutException if the call timed out.
		 
		
		
		
		Parameters:
		`body` \- Call needing protected
		Returns:
		The result of the call
		- #### withSyncCircuitBreaker
		
		
		
		```
		public <T> T withSyncCircuitBreaker​(scala.Function0<T> body,
		                                    scala.Function1<scala.util.Try<T>,​java.lang.Object> defineFailureFn)
		```
		
		Wraps invocations of synchronous calls that need to be protected.
		 
		 Calls are run in caller's thread. Because of the synchronous nature of
		 this call the `scala.concurrent.TimeoutException` will only be thrown
		 after the body has completed.
		 
		
		
		 Throws java.util.concurrent.TimeoutException if the call timed out.
		 
		
		
		
		Parameters:
		`body` \- Call needing protected
		`defineFailureFn` \- function that define what should be consider failure and thus increase failure count
		Returns:
		The result of the call
		- #### callWithSyncCircuitBreaker
		
		
		
		```
		public <T> T callWithSyncCircuitBreaker​(java.util.concurrent.Callable<T> body)
		```
		
		Java API for [`withSyncCircuitBreaker(scala.Function0<T>)`](#withSyncCircuitBreaker(scala.Function0)). Throws `TimeoutException` if the call timed out.
		 
		
		Parameters:
		`body` \- Call needing protected
		Returns:
		The result of the call
		- #### callWithSyncCircuitBreaker
		
		
		
		```
		public <T> T callWithSyncCircuitBreaker​(java.util.concurrent.Callable<T> body,
		                                        java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> defineFailureFn)
		```
		
		Java API for [`withSyncCircuitBreaker(scala.Function0<T>)`](#withSyncCircuitBreaker(scala.Function0)). Throws `TimeoutException` if the call timed out.
		 
		
		Parameters:
		`body` \- Call needing protected
		`defineFailureFn` \- function that define what should be consider failure and thus increase failure count
		Returns:
		The result of the call
		- #### succeed
		
		
		
		```
		public void succeed()
		```
		
		Mark a successful call through CircuitBreaker. Sometimes the callee of CircuitBreaker sends back a message to the
		 caller Actor. In such a case, it is convenient to mark a successful call instead of using Future
		 via [`<T>withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>,scala.Function1<scala.util.Try<T>,java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1))
		- #### fail
		
		
		
		```
		public void fail()
		```
		
		Mark a failed call through CircuitBreaker. Sometimes the callee of CircuitBreaker sends back a message to the
		 caller Actor. In such a case, it is convenient to mark a failed call instead of using Future
		 via [`<T>withCircuitBreaker(scala.Function0<scala.concurrent.Future<T>>,scala.Function1<scala.util.Try<T>,java.lang.Object>)`](#withCircuitBreaker(scala.Function0,scala.Function1))
		- #### isClosed
		
		
		
		```
		public boolean isClosed()
		```
		
		Return true if the internal state is Closed. WARNING: It is a "power API" call which you should use with care.
		 Ordinal use cases of CircuitBreaker expects a remote call to return Future, as in withCircuitBreaker.
		 So, if you check the state by yourself, and make a remote call outside CircuitBreaker, you should
		 manage the state yourself.
		- #### isOpen
		
		
		
		```
		public boolean isOpen()
		```
		
		Return true if the internal state is Open. WARNING: It is a "power API" call which you should use with care.
		 Ordinal use cases of CircuitBreaker expects a remote call to return Future, as in withCircuitBreaker.
		 So, if you check the state by yourself, and make a remote call outside CircuitBreaker, you should
		 manage the state yourself.
		- #### isHalfOpen
		
		
		
		```
		public boolean isHalfOpen()
		```
		
		Return true if the internal state is HalfOpen. WARNING: It is a "power API" call which you should use with care.
		 Ordinal use cases of CircuitBreaker expects a remote call to return Future, as in withCircuitBreaker.
		 So, if you check the state by yourself, and make a remote call outside CircuitBreaker, you should
		 manage the state yourself.
		- #### onOpen
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") onOpen​(scala.Function0<scala.runtime.BoxedUnit> callback)
		```
		
		Adds a callback to execute when circuit breaker opens
		 
		 The callback is run in the `ExecutionContext` supplied in the constructor.
		 
		
		
		
		Parameters:
		`callback` \- Handler to be invoked on state change
		Returns:
		CircuitBreaker for fluent usage
		- #### addOnOpenListener
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") addOnOpenListener​(java.lang.Runnable callback)
		```
		
		Java API for onOpen
		 
		
		Parameters:
		`callback` \- Handler to be invoked on state change
		Returns:
		CircuitBreaker for fluent usage
		- #### onHalfOpen
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") onHalfOpen​(scala.Function0<scala.runtime.BoxedUnit> callback)
		```
		
		Adds a callback to execute when circuit breaker transitions to half\-open
		 The callback is run in the `ExecutionContext` supplied in the constructor.
		 
		
		Parameters:
		`callback` \- Handler to be invoked on state change
		Returns:
		CircuitBreaker for fluent usage
		- #### addOnHalfOpenListener
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") addOnHalfOpenListener​(java.lang.Runnable callback)
		```
		
		JavaAPI for onHalfOpen
		 
		
		Parameters:
		`callback` \- Handler to be invoked on state change
		Returns:
		CircuitBreaker for fluent usage
		- #### onClose
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") onClose​(scala.Function0<scala.runtime.BoxedUnit> callback)
		```
		
		Adds a callback to execute when circuit breaker state closes
		 
		 The callback is run in the `ExecutionContext` supplied in the constructor.
		 
		
		
		
		Parameters:
		`callback` \- Handler to be invoked on state change
		Returns:
		CircuitBreaker for fluent usage
		- #### addOnCloseListener
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") addOnCloseListener​(java.lang.Runnable callback)
		```
		
		JavaAPI for onClose
		 
		
		Parameters:
		`callback` \- Handler to be invoked on state change
		Returns:
		CircuitBreaker for fluent usage
		- #### onCallSuccess
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") onCallSuccess​(scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit> callback)
		```
		
		Adds a callback to execute when call finished with success.
		 
		 The callback is run in the `ExecutionContext` supplied in the constructor.
		 
		
		
		
		Parameters:
		`callback` \- Handler to be invoked on successful call, where passed value is elapsed time in nanoseconds.
		Returns:
		CircuitBreaker for fluent usage
		- #### addOnCallSuccessListener
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") addOnCallSuccessListener​(java.util.function.Consumer<java.lang.Object> callback)
		```
		
		JavaAPI for onCallSuccess
		 
		
		Parameters:
		`callback` \- Handler to be invoked on successful call, where passed value is elapsed time in nanoseconds.
		Returns:
		CircuitBreaker for fluent usage
		- #### onCallFailure
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") onCallFailure​(scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit> callback)
		```
		
		Adds a callback to execute if the call finished with failure.
		 
		 The callback is run in the `ExecutionContext` supplied in the constructor.
		 
		
		
		
		Parameters:
		`callback` \- Handler to be invoked on failed call, where passed value is elapsed time in nanoseconds.
		Returns:
		CircuitBreaker for fluent usage
		- #### addOnCallFailureListener
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") addOnCallFailureListener​(java.util.function.Consumer<java.lang.Object> callback)
		```
		
		JavaAPI for onCallFailure.
		 
		
		Parameters:
		`callback` \- Handler to be invoked on failed call, where passed value is elapsed time in nanoseconds.
		Returns:
		CircuitBreaker for fluent usage
		- #### onCallTimeout
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") onCallTimeout​(scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit> callback)
		```
		
		Adds a callback to execute if a call finished with timeout.
		 
		 The callback is run in the `ExecutionContext` supplied in the constructor.
		 
		
		
		
		Parameters:
		`callback` \- Handler to be invoked on call finished with timeout, where passed value is elapsed time in nanoseconds.
		Returns:
		CircuitBreaker for fluent usage
		- #### addOnCallTimeoutListener
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") addOnCallTimeoutListener​(java.util.function.Consumer<java.lang.Object> callback)
		```
		
		JavaAPI for onCallTimeout.
		 
		
		Parameters:
		`callback` \- Handler to be invoked on call finished with timeout, where passed value is elapsed time in nanoseconds.
		Returns:
		CircuitBreaker for fluent usage
		- #### onCallBreakerOpen
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") onCallBreakerOpen​(scala.Function0<scala.runtime.BoxedUnit> callback)
		```
		
		Adds a callback to execute if call was failed due to open breaker.
		 
		 The callback is run in the `ExecutionContext` supplied in the constructor.
		 
		
		
		
		Parameters:
		`callback` \- Handler to be invoked on call failed due to open breaker.
		Returns:
		CircuitBreaker for fluent usage
		- #### addOnCallBreakerOpenListener
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") addOnCallBreakerOpenListener​(java.lang.Runnable callback)
		```
		
		JavaAPI for onCallBreakerOpen.
		 
		
		Parameters:
		`callback` \- Handler to be invoked on call failed due to open breaker.
		Returns:
		CircuitBreaker for fluent usage

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker.State.html
- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/japi/akka/current/akka/pattern/internal/CircuitBreakerTelemetry.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker.html](https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker.html)*
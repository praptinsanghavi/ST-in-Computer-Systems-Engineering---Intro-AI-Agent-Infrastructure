---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker$.html
title: CircuitBreaker$
---

# CircuitBreaker$

## Content

Package [akka.pattern](package-summary.html)
## Class CircuitBreaker$

- java.lang.Object
- - akka.pattern.CircuitBreaker$

- ---

```
public class CircuitBreaker$
extends java.lang.Object
```

Companion object providing factory methods for Circuit Breaker which runs callbacks in caller's thread

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CircuitBreaker$](CircuitBreaker$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CircuitBreaker$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[apply](#apply(akka.actor.Scheduler,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  scala.concurrent.duration.FiniteDuration callTimeout,  scala.concurrent.duration.FiniteDuration resetTimeout)` | Create a new CircuitBreaker. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[apply](#apply(java.lang.String,akka.actor.ClassicActorSystemProvider))​(java.lang.String id,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Create or find a CircuitBreaker in registry. |
	| `protected <T> scala.Function1<scala.util.Try<T>,​java.lang.Object>` | `[convertJavaFailureFnToScala](#convertJavaFailureFnToScala(java.util.function.BiFunction))​(java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> javaFn)` |  |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[create](#create(akka.actor.Scheduler,int,java.time.Duration,java.time.Duration))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  int maxFailures,  java.time.Duration callTimeout,  java.time.Duration resetTimeout)` | Java API: Create a new CircuitBreaker. |
	| `[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")` | `[lookup](#lookup(java.lang.String,akka.actor.ClassicActorSystemProvider))​(java.lang.String id,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Java API: Create or find a CircuitBreaker in registry. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CircuitBreaker$](CircuitBreaker$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CircuitBreaker$
		
		
		
		```
		public CircuitBreaker$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") apply​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
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
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") apply​(java.lang.String id,
		                            [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Create or find a CircuitBreaker in registry.
		 
		
		Parameters:
		`id` \- Circuit Breaker identifier
		`system` \- `ActorSystem` that is storing this [`CircuitBreaker`](CircuitBreaker.html "class in akka.pattern")
		- #### create
		
		
		
		```
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") create​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
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
		public [CircuitBreaker](CircuitBreaker.html "class in akka.pattern") lookup​(java.lang.String id,
		                             [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Java API: Create or find a CircuitBreaker in registry.
		 
		
		Parameters:
		`id` \- Circuit Breaker identifier
		`system` \- `ActorSystem` that is storing this [`CircuitBreaker`](CircuitBreaker.html "class in akka.pattern")
		- #### convertJavaFailureFnToScala
		
		
		
		```
		protected <T> scala.Function1<scala.util.Try<T>,​java.lang.Object> convertJavaFailureFnToScala​(java.util.function.BiFunction<java.util.Optional<T>,​java.util.Optional<java.lang.Throwable>,​java.lang.Boolean> javaFn)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker$.html](https://doc.akka.io/japi/akka/current/akka/pattern/CircuitBreaker$.html)*
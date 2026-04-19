---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy$.html
title: SupervisorStrategy$
---

# SupervisorStrategy$

## Content

Package [akka.actor.typed](package-summary.html)
## Class SupervisorStrategy$

- java.lang.Object
- - akka.actor.typed.SupervisorStrategy$

- ---

```
public class SupervisorStrategy$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SupervisorStrategy$](SupervisorStrategy$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SupervisorStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed")` | `[restart](#restart())()` | Restart immediately without any limit on number of restart retries. |
	| `[BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[restartWithBackoff](#restartWithBackoff(java.time.Duration,java.time.Duration,double))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor)` | Java API: It supports exponential back\-off between the given `minBackoff` and  `maxBackoff` durations. |
	| `[BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[restartWithBackoff](#restartWithBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor)` | Scala API: It supports exponential back\-off between the given `minBackoff` and  `maxBackoff` durations. |
	| `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")` | `[resume](#resume())()` | Resume means keeping the same state as before the exception was  thrown and is thus less safe than `restart`. |
	| `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")` | `[stop](#stop())()` | Stop the actor |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SupervisorStrategy$](SupervisorStrategy$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SupervisorStrategy$
		
		
		
		```
		public SupervisorStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### resume
		
		
		
		```
		public [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed") resume()
		```
		
		Resume means keeping the same state as before the exception was
		 thrown and is thus less safe than `restart`.
		 
		 If the actor behavior is deferred and throws an exception on startup the actor is stopped
		 (restarting would be dangerous as it could lead to an infinite restart\-loop)
		- #### restart
		
		
		
		```
		public [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed") restart()
		```
		
		Restart immediately without any limit on number of restart retries. A limit can be
		 added with `RestartSupervisorStrategy.withLimit`.
		 
		 If the actor behavior is deferred and throws an exception on startup the actor is stopped
		 (restarting would be dangerous as it could lead to an infinite restart\-loop)
		- #### stop
		
		
		
		```
		public [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed") stop()
		```
		
		Stop the actor
		- #### restartWithBackoff
		
		
		
		```
		public [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") restartWithBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                                    scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                    double randomFactor)
		```
		
		Scala API: It supports exponential back\-off between the given `minBackoff` and
		 `maxBackoff` durations. For example, if `minBackoff` is 3 seconds and
		 `maxBackoff` 30 seconds the start attempts will be delayed with
		 3, 6, 12, 24, 30, 30 seconds. The exponential back\-off counter is reset
		 if the actor is not terminated within the `minBackoff` duration.
		 
		 In addition to the calculated exponential back\-off an additional
		 random delay based the given `randomFactor` is added, e.g. 0\.2 adds up to 20%
		 delay. The reason for adding a random delay is to avoid that all failing
		 actors hit the backend resource at the same time.
		 
		
		
		 During the back\-off incoming messages are dropped.
		 
		
		
		 If no new exception occurs within `(minBackoff + maxBackoff) / 2` the exponentially
		 increased back\-off timeout is reset. This can be overridden by explicitly setting
		 `resetBackoffAfter` using `withResetBackoffAfter` on the returned strategy.
		 
		
		
		 The strategy is applied also if the actor behavior is deferred and throws an exception during
		 startup.
		 
		
		
		 A maximum number of restarts can be specified with [`BackoffSupervisorStrategy.withMaxRestarts(int)`](BackoffSupervisorStrategy.html#withMaxRestarts(int))
		
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		- #### restartWithBackoff
		
		
		
		```
		public [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") restartWithBackoff​(java.time.Duration minBackoff,
		                                                    java.time.Duration maxBackoff,
		                                                    double randomFactor)
		```
		
		Java API: It supports exponential back\-off between the given `minBackoff` and
		 `maxBackoff` durations. For example, if `minBackoff` is 3 seconds and
		 `maxBackoff` 30 seconds the start attempts will be delayed with
		 3, 6, 12, 24, 30, 30 seconds. The exponential back\-off counter is reset
		 if the actor is not terminated within the `minBackoff` duration.
		 
		 In addition to the calculated exponential back\-off an additional
		 random delay based the given `randomFactor` is added, e.g. 0\.2 adds up to 20%
		 delay. The reason for adding a random delay is to avoid that all failing
		 actors hit the backend resource at the same time.
		 
		
		
		 During the back\-off incoming messages are dropped.
		 
		
		
		 If no new exception occurs within `(minBackoff + maxBackoff) / 2` the exponentially
		 increased back\-off timeout is reset. This can be overridden by explicitly setting
		 `resetBackoffAfter` using `withResetBackoffAfter` on the returned strategy.
		 
		
		
		 The strategy is applied also if the actor behavior is deferred and throws an exception during
		 startup.
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy$.html)*
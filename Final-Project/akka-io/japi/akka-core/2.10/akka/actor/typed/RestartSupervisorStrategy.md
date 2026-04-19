---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html
title: RestartSupervisorStrategy
---

# RestartSupervisorStrategy

## Content

Package [akka.actor.typed](package-summary.html)
## Class RestartSupervisorStrategy

- java.lang.Object
- - [akka.actor.typed.SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")
	- - akka.actor.typed.RestartSupervisorStrategy

- ---

```
public abstract class RestartSupervisorStrategy
extends [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")
```

Not for user extension

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")
		
		
		`[SupervisorStrategy.Backoff$](SupervisorStrategy.Backoff$.html "class in akka.actor.typed"), [SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor.typed"), [SupervisorStrategy.RestartOrBackoff](SupervisorStrategy.RestartOrBackoff.html "interface in akka.actor.typed"), [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor.typed"), [SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSupervisorStrategy](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed")` | `[withLimit](#withLimit(int,java.time.Duration))​(int maxNrOfRetries,  java.time.Duration withinTimeRange)` | Java API: Restart with a limit of number of restart retries. |
	| `abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed")` | `[withLimit](#withLimit(int,scala.concurrent.duration.FiniteDuration))​(int maxNrOfRetries,  scala.concurrent.duration.FiniteDuration withinTimeRange)` | Scala API: Restart with a limit of number of restart retries. |
	| `abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed")` | `[withLoggingEnabled](#withLoggingEnabled(boolean))​(boolean enabled)` |  |
	| `abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed")` | `[withLogLevel](#withLogLevel(org.slf4j.event.Level))​(org.slf4j.event.Level level)` |  |
	| `abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed")` | `[withStashCapacity](#withStashCapacity(int))​(int capacity)` | While restarting (waiting for children to stop) incoming messages and signals are  stashed, and delivered later to the newly restarted behavior. |
	| `abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed")` | `[withStopChildren](#withStopChildren(boolean))​(boolean enabled)` | Stop or keep child actors when the parent actor is restarted. |
	
	
		- ### Methods inherited from class akka.actor.typed.[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")
		
		
		`[loggingEnabled](SupervisorStrategy.html#loggingEnabled()), [logLevel](SupervisorStrategy.html#logLevel()), [restart](SupervisorStrategy.html#restart()), [restartWithBackoff](SupervisorStrategy.html#restartWithBackoff(java.time.Duration,java.time.Duration,double)), [restartWithBackoff](SupervisorStrategy.html#restartWithBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double)), [resume](SupervisorStrategy.html#resume()), [stop](SupervisorStrategy.html#stop())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RestartSupervisorStrategy
		
		
		
		```
		public RestartSupervisorStrategy()
		```

	- ### Method Detail
	
	
	
		- #### withLimit
		
		
		
		```
		public abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed") withLimit​(int maxNrOfRetries,
		                                                    scala.concurrent.duration.FiniteDuration withinTimeRange)
		```
		
		Scala API: Restart with a limit of number of restart retries.
		 The number of restarts are limited to a number of restart attempts (`maxNrOfRetries`)
		 within a time range (`withinTimeRange`). When the time window has elapsed without reaching
		 `maxNrOfRetries` the restart count is reset.
		 
		 The strategy is applied also if the actor behavior is deferred and throws an exception during
		 startup.
		 
		
		
		
		Parameters:
		`maxNrOfRetries` \- the number of times a child actor is allowed to be restarted,
		 if the limit is exceeded the child actor is stopped
		`withinTimeRange` \- duration of the time window for maxNrOfRetries
		- #### withLimit
		
		
		
		```
		public abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed") withLimit​(int maxNrOfRetries,
		                                                    java.time.Duration withinTimeRange)
		```
		
		Java API: Restart with a limit of number of restart retries.
		 The number of restarts are limited to a number of restart attempts (`maxNrOfRetries`)
		 within a time range (`withinTimeRange`). When the time window has elapsed without reaching
		 `maxNrOfRetries` the restart count is reset.
		 
		 The strategy is applied also if the actor behavior is deferred and throws an exception during
		 startup.
		 
		
		
		
		Parameters:
		`maxNrOfRetries` \- the number of times a child actor is allowed to be restarted,
		 if the limit is exceeded the child actor is stopped
		`withinTimeRange` \- duration of the time window for maxNrOfRetries
		- #### withLogLevel
		
		
		
		```
		public abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed") withLogLevel​(org.slf4j.event.Level level)
		```
		
		
		Specified by:
		`[withLogLevel](SupervisorStrategy.html#withLogLevel(org.slf4j.event.Level))` in class `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")`
		- #### withLoggingEnabled
		
		
		
		```
		public abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed") withLoggingEnabled​(boolean enabled)
		```
		
		
		Specified by:
		`[withLoggingEnabled](SupervisorStrategy.html#withLoggingEnabled(boolean))` in class `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")`
		- #### withStashCapacity
		
		
		
		```
		public abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed") withStashCapacity​(int capacity)
		```
		
		While restarting (waiting for children to stop) incoming messages and signals are
		 stashed, and delivered later to the newly restarted behavior. This property defines
		 the capacity in number of messages of the stash buffer. If the capacity is exceed
		 then additional incoming messages are dropped.
		 
		 By default the capacity is defined by config property `akka.actor.typed.restart-stash-capacity`.
		- #### withStopChildren
		
		
		
		```
		public abstract [RestartSupervisorStrategy](RestartSupervisorStrategy.html "class in akka.actor.typed") withStopChildren​(boolean enabled)
		```
		
		Stop or keep child actors when the parent actor is restarted.
		 By default child actors are stopped when parent is restarted.
		
		Parameters:
		`enabled` \- if `true` then child actors are stopped, otherwise they are kept

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.Backoff$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.Restart$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.RestartOrBackoff.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.Resume$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.Stop$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html)*
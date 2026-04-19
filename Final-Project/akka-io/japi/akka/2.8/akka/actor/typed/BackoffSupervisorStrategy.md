---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/actor/typed/BackoffSupervisorStrategy.html
title: BackoffSupervisorStrategy
---

# BackoffSupervisorStrategy

## Content

Package [akka.actor.typed](package-summary.html)
## Class BackoffSupervisorStrategy

- java.lang.Object
- - [akka.actor.typed.SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")
	- - akka.actor.typed.BackoffSupervisorStrategy

- ---

```
public abstract class BackoffSupervisorStrategy
extends [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")
```

Not for user extension

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")
		
		
		`[SupervisorStrategy.Backoff$](SupervisorStrategy.Backoff$.html "class in akka.actor.typed"), [SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor.typed"), [SupervisorStrategy.RestartOrBackoff](SupervisorStrategy.RestartOrBackoff.html "interface in akka.actor.typed"), [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor.typed"), [SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BackoffSupervisorStrategy](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract java.time.Duration` | `[getResetBackoffAfter](#getResetBackoffAfter())()` |  |
	| `abstract scala.concurrent.duration.FiniteDuration` | `[resetBackoffAfter](#resetBackoffAfter())()` |  |
	| `abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[withCriticalLogLevel](#withCriticalLogLevel(org.slf4j.event.Level,int))​(org.slf4j.event.Level criticalLevel,  int afterErrors)` | Possibility to use another log level after a given number of errors. |
	| `abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[withLoggingEnabled](#withLoggingEnabled(boolean))​(boolean enabled)` |  |
	| `abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[withLogLevel](#withLogLevel(org.slf4j.event.Level))​(org.slf4j.event.Level level)` |  |
	| `abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[withMaxRestarts](#withMaxRestarts(int))​(int maxRestarts)` | Allow at most this number of failed restarts in a row. |
	| `abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[withResetBackoffAfter](#withResetBackoffAfter(java.time.Duration))​(java.time.Duration timeout)` | Java API: The back\-off algorithm is reset if the actor does not crash within the  specified `resetBackoffAfter`. |
	| `abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[withResetBackoffAfter](#withResetBackoffAfter(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | Scala API: The back\-off algorithm is reset if the actor does not crash within the  specified `resetBackoffAfter`. |
	| `abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[withStashCapacity](#withStashCapacity(int))​(int capacity)` | While restarting (waiting for backoff to expire and children to stop) incoming  messages and signals are stashed, and delivered later to the newly restarted  behavior. |
	| `abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed")` | `[withStopChildren](#withStopChildren(boolean))​(boolean enabled)` | Stop or keep child actors when the parent actor is restarted. |
	
	
		- ### Methods inherited from class akka.actor.typed.[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")
		
		
		`[loggingEnabled](SupervisorStrategy.html#loggingEnabled()), [logLevel](SupervisorStrategy.html#logLevel()), [restart](SupervisorStrategy.html#restart()), [restartWithBackoff](SupervisorStrategy.html#restartWithBackoff(java.time.Duration,java.time.Duration,double)), [restartWithBackoff](SupervisorStrategy.html#restartWithBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double)), [resume](SupervisorStrategy.html#resume()), [stop](SupervisorStrategy.html#stop())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BackoffSupervisorStrategy
		
		
		
		```
		public BackoffSupervisorStrategy()
		```

	- ### Method Detail
	
	
	
		- #### getResetBackoffAfter
		
		
		
		```
		public abstract java.time.Duration getResetBackoffAfter()
		```
		- #### resetBackoffAfter
		
		
		
		```
		public abstract scala.concurrent.duration.FiniteDuration resetBackoffAfter()
		```
		- #### withCriticalLogLevel
		
		
		
		```
		public abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") withCriticalLogLevel​(org.slf4j.event.Level criticalLevel,
		                                                               int afterErrors)
		```
		
		Possibility to use another log level after a given number of errors.
		 The initial errors are logged at the level defined with `BackoffSupervisorStrategy.withLogLevel`.
		 For example, the first 3 errors can be logged at INFO level and thereafter at ERROR level.
		 
		 The counter (and log level) is reset after the `BackoffSupervisorStrategy.withResetBackoffAfter`
		 duration.
		- #### withLogLevel
		
		
		
		```
		public abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") withLogLevel​(org.slf4j.event.Level level)
		```
		
		
		Specified by:
		`[withLogLevel](SupervisorStrategy.html#withLogLevel(org.slf4j.event.Level))` in class `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")`
		- #### withLoggingEnabled
		
		
		
		```
		public abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") withLoggingEnabled​(boolean enabled)
		```
		
		
		Specified by:
		`[withLoggingEnabled](SupervisorStrategy.html#withLoggingEnabled(boolean))` in class `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")`
		- #### withMaxRestarts
		
		
		
		```
		public abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") withMaxRestarts​(int maxRestarts)
		```
		
		Allow at most this number of failed restarts in a row. Zero or negative disables
		 the upper limit on restarts (and is the default)
		- #### withResetBackoffAfter
		
		
		
		```
		public abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") withResetBackoffAfter​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Scala API: The back\-off algorithm is reset if the actor does not crash within the
		 specified `resetBackoffAfter`. By default, the `resetBackoffAfter` has
		 the value of `(minBackoff + maxBackoff) / 2`.
		- #### withResetBackoffAfter
		
		
		
		```
		public abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") withResetBackoffAfter​(java.time.Duration timeout)
		```
		
		Java API: The back\-off algorithm is reset if the actor does not crash within the
		 specified `resetBackoffAfter`. By default, the `resetBackoffAfter` has
		 the same value as `minBackoff`.
		- #### withStashCapacity
		
		
		
		```
		public abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") withStashCapacity​(int capacity)
		```
		
		While restarting (waiting for backoff to expire and children to stop) incoming
		 messages and signals are stashed, and delivered later to the newly restarted
		 behavior. This property defines the capacity in number of messages of the stash
		 buffer. If the capacity is exceed then additional incoming messages are dropped.
		 
		 By default the capacity is defined by config property `akka.actor.typed.restart-stash-capacity`.
		- #### withStopChildren
		
		
		
		```
		public abstract [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "class in akka.actor.typed") withStopChildren​(boolean enabled)
		```
		
		Stop or keep child actors when the parent actor is restarted.
		 By default child actors are stopped when parent is restarted.
		
		Parameters:
		`enabled` \- if `true` then child actors are stopped, otherwise they are kept

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/SupervisorStrategy.Backoff$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/SupervisorStrategy.Restart$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/SupervisorStrategy.RestartOrBackoff.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/SupervisorStrategy.Resume$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/SupervisorStrategy.Stop$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/actor/typed/BackoffSupervisorStrategy.html](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/BackoffSupervisorStrategy.html)*
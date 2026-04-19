---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:48:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractScheduler.html
title: AbstractScheduler
---

# AbstractScheduler

## Content

Package [akka.actor](package-summary.html)
## Class AbstractScheduler

- java.lang.Object
- - [akka.actor.AbstractSchedulerBase](AbstractSchedulerBase.html "class in akka.actor")
	- - akka.actor.AbstractScheduler

- All Implemented Interfaces:
`[Scheduler](Scheduler.html "interface in akka.actor")`

---

```
public abstract class AbstractScheduler
extends [AbstractSchedulerBase](AbstractSchedulerBase.html "class in akka.actor")
```

An Akka scheduler service. This one needs one special behavior: if Closeable, it MUST execute all
 outstanding tasks upon .close() in order to properly shutdown all dispatchers.

 Furthermore, this timer service MUST throw IllegalStateException if it cannot schedule a task.
 Once scheduled, the task MUST be executed. If executed upon close(), the task may execute before
 its timeout.

 

Scheduler implementation are loaded reflectively at ActorSystem start\-up with the following
 constructor arguments: 1\) the system’s com.typesafe.config.Config (from system.settings.config)
 2\) a akka.event.LoggingAdapter 3\) a java.util.concurrent.ThreadFactory

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Scheduler](Scheduler.html "interface in akka.actor")
		
		
		`[Scheduler.TaskRunOnClose](Scheduler.TaskRunOnClose.html "interface in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractScheduler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `abstract double` | `[maxFrequency](#maxFrequency())()` | The maximum supported task frequency of this scheduler, i.e. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration initialDelay,  java.time.Duration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Deprecated. |
	| `abstract [Cancellable](Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Deprecated. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Schedules a Runnable to be run once with a delay, i.e. |
	| `abstract [Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Schedules a Runnable to be run once with a delay, i.e. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Scheduler](Scheduler.html "interface in akka.actor")
		
		
		`[schedule](Scheduler.html#schedule(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [schedule](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [schedule](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext)), [schedule$default$6](Scheduler.html#schedule$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleAtFixedRate$default$6](Scheduler.html#scheduleAtFixedRate$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleOnce](Scheduler.html#scheduleOnce(java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleOnce](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleOnce](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext)), [scheduleOnce$default$5](Scheduler.html#scheduleOnce$default$5(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleWithFixedDelay$default$6](Scheduler.html#scheduleWithFixedDelay$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### AbstractScheduler
		
		
		
		```
		public AbstractScheduler()
		```

	- ### Method Detail
	
	
	
		- #### schedule
		
		
		
		```
		@Deprecated
		public abstract [Cancellable](Cancellable.html "interface in akka.actor") schedule​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                     scala.concurrent.duration.FiniteDuration interval,
		                                     java.lang.Runnable runnable,
		                                     scala.concurrent.ExecutionContext executor)
		```
		
		Deprecated.
		Schedules a function to be run repeatedly with an initial delay and a frequency. E.g. if you
		 would like the function to be run after 2 seconds and thereafter every 100ms you would set
		 delay \= Duration(2, TimeUnit.SECONDS) and interval \= Duration(100, TimeUnit.MILLISECONDS)
		- #### schedule
		
		
		
		```
		@Deprecated
		public [Cancellable](Cancellable.html "interface in akka.actor") schedule​(java.time.Duration initialDelay,
		                            java.time.Duration interval,
		                            java.lang.Runnable runnable,
		                            scala.concurrent.ExecutionContext executor)
		```
		
		Deprecated.
		Schedules a function to be run repeatedly with an initial delay and a frequency. E.g. if you
		 would like the function to be run after 2 seconds and thereafter every 100ms you would set
		 delay \= Duration(2, TimeUnit.SECONDS) and interval \= Duration.ofMillis(100\)
		- #### scheduleOnce
		
		
		
		```
		public abstract [Cancellable](Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                                         java.lang.Runnable runnable,
		                                         scala.concurrent.ExecutionContext executor)
		```
		
		Schedules a Runnable to be run once with a delay, i.e. a time period that has to pass before
		 the runnable is executed.
		- #### scheduleOnce
		
		
		
		```
		public [Cancellable](Cancellable.html "interface in akka.actor") scheduleOnce​(java.time.Duration delay,
		                                java.lang.Runnable runnable,
		                                scala.concurrent.ExecutionContext executor)
		```
		
		Schedules a Runnable to be run once with a delay, i.e. a time period that has to pass before
		 the runnable is executed.
		- #### maxFrequency
		
		
		
		```
		public abstract double maxFrequency()
		```
		
		The maximum supported task frequency of this scheduler, i.e. the inverse of the minimum time
		 interval between executions of a recurring task, in Hz.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.TaskRunOnClose.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractScheduler.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractScheduler.html)*
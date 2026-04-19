---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:18:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/ExplicitlyTriggeredScheduler.html
title: ExplicitlyTriggeredScheduler
---

# ExplicitlyTriggeredScheduler

## Content

Package [akka.testkit](package-summary.html)
## Class ExplicitlyTriggeredScheduler

- java.lang.Object
- - akka.testkit.ExplicitlyTriggeredScheduler

- All Implemented Interfaces:
`[Scheduler](../actor/Scheduler.html "interface in akka.actor")`

---

```
public class ExplicitlyTriggeredScheduler
extends java.lang.Object
implements [Scheduler](../actor/Scheduler.html "interface in akka.actor")
```

For testing: scheduler that does not look at the clock, but must be
 progressed manually by calling `timePasses`.
 
 This allows for faster and less timing\-sensitive specs, as jobs will be
 executed on the test thread instead of using the original
 {ExecutionContext}. This means recreating specific scenario's becomes
 easier, but these tests might fail to catch race conditions that only
 happen when tasks are scheduled in parallel in 'real time'.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Scheduler](../actor/Scheduler.html "interface in akka.actor")
		
		
		`[Scheduler.TaskRunOnClose](../actor/Scheduler.TaskRunOnClose.html "interface in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExplicitlyTriggeredScheduler](#%3Cinit%3E(com.typesafe.config.Config,akka.event.LoggingAdapter,java.util.concurrent.ThreadFactory))​(com.typesafe.config.Config config,  [LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log,  java.util.concurrent.ThreadFactory tf)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[currentTimeMs](#currentTimeMs())()` | The scheduler need to expose its internal time for testing. |
	| `double` | `[maxFrequency](#maxFrequency())()` | The maximum supported task frequency of this scheduler, i.e. |
	| `[Cancellable](../actor/Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Deprecated API: See [`Scheduler.scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](../actor/Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`Scheduler.scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](../actor/Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)). |
	| `[Cancellable](../actor/Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a Runnable to be run once with a delay, i.e. |
	| `void` | `[timePasses](#timePasses(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration amount)` | Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Scheduler](../actor/Scheduler.html "interface in akka.actor")
		
		
		`[schedule](../actor/Scheduler.html#schedule(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [schedule](../actor/Scheduler.html#schedule(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [schedule](../actor/Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [schedule](../actor/Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext)), [schedule$default$6](../actor/Scheduler.html#schedule$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleAtFixedRate](../actor/Scheduler.html#scheduleAtFixedRate(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleAtFixedRate](../actor/Scheduler.html#scheduleAtFixedRate(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleAtFixedRate](../actor/Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleAtFixedRate](../actor/Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleAtFixedRate$default$6](../actor/Scheduler.html#scheduleAtFixedRate$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleOnce](../actor/Scheduler.html#scheduleOnce(java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleOnce](../actor/Scheduler.html#scheduleOnce(java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleOnce](../actor/Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleOnce](../actor/Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext)), [scheduleOnce$default$5](../actor/Scheduler.html#scheduleOnce$default$5(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleWithFixedDelay](../actor/Scheduler.html#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleWithFixedDelay](../actor/Scheduler.html#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleWithFixedDelay](../actor/Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleWithFixedDelay](../actor/Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleWithFixedDelay$default$6](../actor/Scheduler.html#scheduleWithFixedDelay$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### ExplicitlyTriggeredScheduler
		
		
		
		```
		public ExplicitlyTriggeredScheduler​(com.typesafe.config.Config config,
		                                    [LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log,
		                                    java.util.concurrent.ThreadFactory tf)
		```

	- ### Method Detail
	
	
	
		- #### currentTimeMs
		
		
		
		```
		public long currentTimeMs()
		```
		
		The scheduler need to expose its internal time for testing.
		- #### maxFrequency
		
		
		
		```
		public double maxFrequency()
		```
		
		Description copied from interface: `[Scheduler](../actor/Scheduler.html#maxFrequency())`
		The maximum supported task frequency of this scheduler, i.e. the inverse
		 of the minimum time interval between executions of a recurring task, in Hz.
		
		Specified by:
		`[maxFrequency](../actor/Scheduler.html#maxFrequency())` in interface `[Scheduler](../actor/Scheduler.html "interface in akka.actor")`
		- #### schedule
		
		
		
		```
		public [Cancellable](../actor/Cancellable.html "interface in akka.actor") schedule​(scala.concurrent.duration.FiniteDuration initialDelay,
		                            scala.concurrent.duration.FiniteDuration interval,
		                            java.lang.Runnable runnable,
		                            scala.concurrent.ExecutionContext executor)
		```
		
		Description copied from interface: `[Scheduler](../actor/Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))`
		Deprecated API: See [`Scheduler.scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](../actor/Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`Scheduler.scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](../actor/Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)).
		
		Specified by:
		`[schedule](../actor/Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))` in interface `[Scheduler](../actor/Scheduler.html "interface in akka.actor")`
		- #### scheduleOnce
		
		
		
		```
		public [Cancellable](../actor/Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                                java.lang.Runnable runnable,
		                                scala.concurrent.ExecutionContext executor)
		```
		
		Description copied from interface: `[Scheduler](../actor/Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))`
		Scala API: Schedules a Runnable to be run once with a delay, i.e. a time period that
		 has to pass before the runnable is executed.
		 
		
		Specified by:
		`[scheduleOnce](../actor/Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))` in interface `[Scheduler](../actor/Scheduler.html "interface in akka.actor")`
		- #### timePasses
		
		
		
		```
		public void timePasses​(scala.concurrent.duration.FiniteDuration amount)
		```
		
		Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.
		 
		 We will not add a dilation factor to this amount, since the scheduler API also does not apply dilation.
		 If you want the amount of time passed to be dilated, apply the dilation before passing the delay to
		 this method.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scheduler.TaskRunOnClose.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/ExplicitlyTriggeredScheduler.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/ExplicitlyTriggeredScheduler.html)*
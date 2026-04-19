---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/LightArrayRevolverScheduler.html
title: LightArrayRevolverScheduler
---

# LightArrayRevolverScheduler

## Content

Package [akka.actor](package-summary.html)
## Class LightArrayRevolverScheduler

- java.lang.Object
- - akka.actor.LightArrayRevolverScheduler

- All Implemented Interfaces:
`[Scheduler](Scheduler.html "interface in akka.actor")`, `java.io.Closeable`, `java.lang.AutoCloseable`

---

```
public class LightArrayRevolverScheduler
extends java.lang.Object
implements [Scheduler](Scheduler.html "interface in akka.actor"), java.io.Closeable
```

This scheduler implementation is based on a revolving wheel of buckets,
 like Netty\&rsquo;s HashedWheelTimer, which it advances at a fixed tick rate and
 dispatches tasks it finds in the current bucket to their respective
 ExecutionContexts. The tasks are held in TaskHolders, which upon
 cancellation null out their reference to the actual task, leaving only this
 shell to be cleaned up when the wheel reaches that bucket next time. This
 enables the use of a simple linked list to chain the TaskHolders off the
 wheel.
 
 Also noteworthy is that this scheduler does not obtain a current time stamp
 when scheduling single\-shot tasks, instead it always rounds up the task
 delay to a full multiple of the TickDuration. This means that tasks are
 scheduled possibly one tick later than they could be (if checking that
 \&ldquo;now() \+ delay \<\= nextTick\&rdquo; were done).

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `protected static class` | `[LightArrayRevolverScheduler.TaskHolder](LightArrayRevolverScheduler.TaskHolder.html "class in akka.actor")` | INTERNAL API |
	| `static interface` | `[LightArrayRevolverScheduler.TimerTask](LightArrayRevolverScheduler.TimerTask.html "interface in akka.actor")` | INTERNAL API |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Scheduler](Scheduler.html "interface in akka.actor")
		
		
		`[Scheduler.TaskRunOnClose](Scheduler.TaskRunOnClose.html "interface in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LightArrayRevolverScheduler](#%3Cinit%3E(com.typesafe.config.Config,akka.event.LoggingAdapter,java.util.concurrent.ThreadFactory))​(com.typesafe.config.Config config,  [LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log,  java.util.concurrent.ThreadFactory threadFactory)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected long` | `[clock](#clock())()` | Clock implementation is replaceable (for testing); the implementation must  return a monotonically increasing series of Long nanoseconds. |
	| `void` | `[close](#close())()` |  |
	| `protected scala.concurrent.duration.FiniteDuration` | `[getShutdownTimeout](#getShutdownTimeout())()` | Overridable for tests |
	| `double` | `[maxFrequency](#maxFrequency())()` | The maximum supported task frequency of this scheduler, i.e. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Deprecated API: See [`Scheduler.scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`Scheduler.scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)). |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a Runnable to be run once with a delay, i.e. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a fixed `delay` between subsequent executions. |
	| `scala.concurrent.duration.FiniteDuration` | `[ShutdownTimeout](#ShutdownTimeout())()` |  |
	| `protected int` | `[startTick](#startTick())()` | Replaceable for testing. |
	| `scala.concurrent.duration.FiniteDuration` | `[TickDuration](#TickDuration())()` |  |
	| `protected void` | `[waitNanos](#waitNanos(long))​(long nanos)` | Overridable for tests |
	| `int` | `[WheelSize](#WheelSize())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Scheduler](Scheduler.html "interface in akka.actor")
		
		
		`[schedule](Scheduler.html#schedule(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [schedule](Scheduler.html#schedule(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [schedule](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [schedule](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext)), [schedule$default$6](Scheduler.html#schedule$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleAtFixedRate$default$6](Scheduler.html#scheduleAtFixedRate$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleOnce](Scheduler.html#scheduleOnce(java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleOnce](Scheduler.html#scheduleOnce(java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleOnce](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleOnce](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext)), [scheduleOnce$default$5](Scheduler.html#scheduleOnce$default$5(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext)), [scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef)), [scheduleWithFixedDelay$default$6](Scheduler.html#scheduleWithFixedDelay$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### LightArrayRevolverScheduler
		
		
		
		```
		public LightArrayRevolverScheduler​(com.typesafe.config.Config config,
		                                   [LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log,
		                                   java.util.concurrent.ThreadFactory threadFactory)
		```

	- ### Method Detail
	
	
	
		- #### WheelSize
		
		
		
		```
		public int WheelSize()
		```
		- #### TickDuration
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration TickDuration()
		```
		- #### ShutdownTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration ShutdownTimeout()
		```
		- #### clock
		
		
		
		```
		protected long clock()
		```
		
		Clock implementation is replaceable (for testing); the implementation must
		 return a monotonically increasing series of Long nanoseconds.
		- #### startTick
		
		
		
		```
		protected int startTick()
		```
		
		Replaceable for testing.
		- #### getShutdownTimeout
		
		
		
		```
		protected scala.concurrent.duration.FiniteDuration getShutdownTimeout()
		```
		
		Overridable for tests
		- #### waitNanos
		
		
		
		```
		protected void waitNanos​(long nanos)
		```
		
		Overridable for tests
		- #### scheduleWithFixedDelay
		
		
		
		```
		public [Cancellable](Cancellable.html "interface in akka.actor") scheduleWithFixedDelay​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                          scala.concurrent.duration.FiniteDuration delay,
		                                          java.lang.Runnable runnable,
		                                          scala.concurrent.ExecutionContext executor)
		```
		
		Description copied from interface: `[Scheduler](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))`
		Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and
		 a fixed `delay` between subsequent executions. E.g. if you would like the function to
		 be run after 2 seconds and thereafter every 100ms you would set `delay=Duration(2, TimeUnit.SECONDS)`
		 and `interval=Duration(100, TimeUnit.MILLISECONDS)`.
		 
		 It will not compensate the delay between tasks if the execution takes a long time or if
		 scheduling is delayed longer than specified for some reason. The delay between subsequent
		 execution will always be (at least) the given `delay`. In the long run, the
		 frequency of execution will generally be slightly lower than the reciprocal of the specified
		 `delay`.
		 
		
		
		 If the `Runnable` throws an exception the repeated scheduling is aborted,
		 i.e. the function will not be invoked any more.
		 
		
		
		
		Specified by:
		`[scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))` in interface `[Scheduler](Scheduler.html "interface in akka.actor")`
		- #### schedule
		
		
		
		```
		public [Cancellable](Cancellable.html "interface in akka.actor") schedule​(scala.concurrent.duration.FiniteDuration initialDelay,
		                            scala.concurrent.duration.FiniteDuration delay,
		                            java.lang.Runnable runnable,
		                            scala.concurrent.ExecutionContext executor)
		```
		
		Description copied from interface: `[Scheduler](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))`
		Deprecated API: See [`Scheduler.scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](Scheduler.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`Scheduler.scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](Scheduler.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)).
		
		Specified by:
		`[schedule](Scheduler.html#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))` in interface `[Scheduler](Scheduler.html "interface in akka.actor")`
		- #### scheduleOnce
		
		
		
		```
		public [Cancellable](Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                                java.lang.Runnable runnable,
		                                scala.concurrent.ExecutionContext executor)
		```
		
		Description copied from interface: `[Scheduler](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))`
		Scala API: Schedules a Runnable to be run once with a delay, i.e. a time period that
		 has to pass before the runnable is executed.
		 
		
		Specified by:
		`[scheduleOnce](Scheduler.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))` in interface `[Scheduler](Scheduler.html "interface in akka.actor")`
		- #### close
		
		
		
		```
		public void close()
		```
		
		
		Specified by:
		`close` in interface `java.lang.AutoCloseable`
		Specified by:
		`close` in interface `java.io.Closeable`
		- #### maxFrequency
		
		
		
		```
		public double maxFrequency()
		```
		
		Description copied from interface: `[Scheduler](Scheduler.html#maxFrequency())`
		The maximum supported task frequency of this scheduler, i.e. the inverse
		 of the minimum time interval between executions of a recurring task, in Hz.
		
		Specified by:
		`[maxFrequency](Scheduler.html#maxFrequency())` in interface `[Scheduler](Scheduler.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/LightArrayRevolverScheduler.TaskHolder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/LightArrayRevolverScheduler.TimerTask.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.TaskRunOnClose.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/LightArrayRevolverScheduler.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/LightArrayRevolverScheduler.html)*
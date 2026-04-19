---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/Scheduler.html
title: Scheduler
---

# Scheduler

## Content

Package [akka.actor](package-summary.html)
## Interface Scheduler

- All Known Implementing Classes:
`[AbstractScheduler](AbstractScheduler.html "class in akka.actor")`, `[AbstractSchedulerBase](AbstractSchedulerBase.html "class in akka.actor")`, `[ExplicitlyTriggeredScheduler](../testkit/ExplicitlyTriggeredScheduler.html "class in akka.testkit")`, `[LightArrayRevolverScheduler](LightArrayRevolverScheduler.html "class in akka.actor")`

---

```
public interface Scheduler
```

An Akka scheduler service.
 
 For scheduling within actors `with Timers` should be preferred.
 

 Please note that this scheduler implementation is highly optimised for high\-throughput
 and high\-frequency events. It is not to be confused with long\-term schedulers such as
 Quartz. The scheduler will throw an exception if attempts are made to schedule too far
 into the future (which by default is around 8 months (`Int.MaxValue` seconds).
 

 It's possible to implement a custom `Scheduler`, although that should rarely be needed.
 

 A `Scheduler` implementation needs one special behavior: if
 Closeable, it MUST execute all outstanding tasks that implement [`Scheduler.TaskRunOnClose`](Scheduler.TaskRunOnClose.html "interface in akka.actor")
 upon .close() in order to properly shutdown all dispatchers.
 

 Furthermore, this timer service MUST throw IllegalStateException if it
 cannot schedule a task. Once scheduled, the task MUST be executed. If
 executed upon close(), the task may execute before its timeout.
 

 Scheduler implementation are loaded reflectively at ActorSystem start\-up
 with the following constructor arguments:
 1\) the system\&rsquo;s com.typesafe.config.Config (from system.settings.config)
 2\) a akka.event.LoggingAdapter
 3\) a java.util.concurrent.ThreadFactory

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static interface` | `[Scheduler.TaskRunOnClose](Scheduler.TaskRunOnClose.html "interface in akka.actor")` | If a `TaskRunOnClose` is used in `scheduleOnce` it will be run when the `Scheduler` is  closed (`ActorSystem` shutdown). |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `double` | `[maxFrequency](#maxFrequency())()` | The maximum supported task frequency of this scheduler, i.e. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef))​(java.time.Duration initialDelay,  java.time.Duration interval,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message,  scala.concurrent.ExecutionContext executor,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration initialDelay,  java.time.Duration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message,  scala.concurrent.ExecutionContext executor,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[schedule](#schedule(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  scala.Function0<scala.runtime.BoxedUnit> f,  scala.concurrent.ExecutionContext executor)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[schedule$default$6](#schedule$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message)` | Deprecated API: See [`scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)). |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleAtFixedRate](#scheduleAtFixedRate(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef))​(java.time.Duration initialDelay,  java.time.Duration interval,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message,  scala.concurrent.ExecutionContext executor,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Java API: Schedules a message to be sent repeatedly with an initial delay and  frequency. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleAtFixedRate](#scheduleAtFixedRate(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration initialDelay,  java.time.Duration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a frequency. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleAtFixedRate](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message,  scala.concurrent.ExecutionContext executor,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Scala API: Schedules a message to be sent repeatedly with an initial delay and  frequency. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleAtFixedRate](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a frequency. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[scheduleAtFixedRate$default$6](#scheduleAtFixedRate$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message)` | Scala API: Schedules a message to be sent repeatedly with an initial delay and  frequency. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef))​(java.time.Duration delay,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message,  scala.concurrent.ExecutionContext executor,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Java API: Schedules a message to be sent once with a delay, i.e. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Java API: Schedules a Runnable to be run once with a delay, i.e. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef))​(scala.concurrent.duration.FiniteDuration delay,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message,  scala.concurrent.ExecutionContext executor,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Scala API: Schedules a message to be sent once with a delay, i.e. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a Runnable to be run once with a delay, i.e. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,scala.Function0,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration delay,  scala.Function0<scala.runtime.BoxedUnit> f,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a function to be run once with a delay, i.e. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[scheduleOnce$default$5](#scheduleOnce$default$5(scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object))​(scala.concurrent.duration.FiniteDuration delay,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message)` |  |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef))​(java.time.Duration initialDelay,  java.time.Duration delay,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message,  scala.concurrent.ExecutionContext executor,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Java API: Schedules a message to be sent repeatedly with an initial delay and  a fixed `delay` between messages. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration initialDelay,  java.time.Duration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a fixed `delay` between subsequent executions. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object,scala.concurrent.ExecutionContext,akka.actor.ActorRef))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message,  scala.concurrent.ExecutionContext executor,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Scala API: Schedules a message to be sent repeatedly with an initial delay and  a fixed `delay` between messages. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a fixed `delay` between subsequent executions. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[scheduleWithFixedDelay$default$6](#scheduleWithFixedDelay$default$6(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.ActorRef,java.lang.Object))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay,  [ActorRef](ActorRef.html "class in akka.actor") receiver,  java.lang.Object message)` |  |

- - ### Method Detail
	
	
	
		- #### scheduleWithFixedDelay
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleWithFixedDelay​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                   scala.concurrent.duration.FiniteDuration delay,
		                                   java.lang.Runnable runnable,
		                                   scala.concurrent.ExecutionContext executor)
		```
		
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
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `with Timers` should be preferred.
		- #### scheduleWithFixedDelay
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleWithFixedDelay​(java.time.Duration initialDelay,
		                                   java.time.Duration delay,
		                                   java.lang.Runnable runnable,
		                                   scala.concurrent.ExecutionContext executor)
		```
		
		Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and
		 a fixed `delay` between subsequent executions. E.g. if you would like the function to
		 be run after 2 seconds and thereafter every 100ms you would set delay to `Duration.ofSeconds(2)`,
		 and interval to `Duration.ofMillis(100)`.
		 
		 It will not compensate the delay between tasks if the execution takes a long time or if
		 scheduling is delayed longer than specified for some reason. The delay between subsequent
		 execution will always be (at least) the given `delay`.
		 
		
		
		 In the long run, the frequency of tasks will generally be slightly lower than
		 the reciprocal of the specified `delay`.
		 
		
		
		 If the `Runnable` throws an exception the repeated scheduling is aborted,
		 i.e. the function will not be invoked any more.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
		- #### scheduleWithFixedDelay
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleWithFixedDelay​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                   scala.concurrent.duration.FiniteDuration delay,
		                                   [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                                   java.lang.Object message,
		                                   scala.concurrent.ExecutionContext executor,
		                                   [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Scala API: Schedules a message to be sent repeatedly with an initial delay and
		 a fixed `delay` between messages. E.g. if you would like a message to be sent
		 immediately and thereafter every 500ms you would set `delay=Duration.Zero` and
		 `interval=Duration(500, TimeUnit.MILLISECONDS)`.
		 
		 It will not compensate the delay between messages if scheduling is delayed
		 longer than specified for some reason. The delay between sending of subsequent
		 messages will always be (at least) the given `delay`.
		 
		
		
		 In the long run, the frequency of messages will generally be slightly lower than
		 the reciprocal of the specified `delay`.
		 
		
		
		 Note: For scheduling within actors `with Timers` should be preferred.
		- #### scheduleWithFixedDelay
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleWithFixedDelay​(java.time.Duration initialDelay,
		                                   java.time.Duration delay,
		                                   [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                                   java.lang.Object message,
		                                   scala.concurrent.ExecutionContext executor,
		                                   [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Java API: Schedules a message to be sent repeatedly with an initial delay and
		 a fixed `delay` between messages. E.g. if you would like a message to be sent
		 immediately and thereafter every 500ms you would set `delay=Duration.ZERO` and
		 `interval=Duration.ofMillis(500)`.
		 
		 It will not compensate the delay between messages if scheduling is delayed
		 longer than specified for some reason. The delay between sending of subsequent
		 messages will always be (at least) the given `delay`.
		 
		
		
		 In the long run, the frequency of messages will generally be slightly lower than
		 the reciprocal of the specified `delay`.
		 
		
		
		 Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
		- #### scheduleAtFixedRate
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleAtFixedRate​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                scala.concurrent.duration.FiniteDuration interval,
		                                java.lang.Runnable runnable,
		                                scala.concurrent.ExecutionContext executor)
		```
		
		Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and
		 a frequency. E.g. if you would like the function to be run after 2
		 seconds and thereafter every 100ms you would set `delay=Duration(2, TimeUnit.SECONDS)`
		 and `interval=Duration(100, TimeUnit.MILLISECONDS)`.
		 
		 It will compensate the delay for a subsequent task if the previous tasks took
		 too long to execute. In such cases, the actual execution interval will differ from
		 the interval passed to the method.
		 
		
		
		 If the execution of the tasks takes longer than the `interval`, the subsequent
		 execution will start immediately after the prior one completes (there will be
		 no overlap of executions). This also has the consequence that after long garbage
		 collection pauses or other reasons when the JVM was suspended all "missed" tasks
		 will execute when the process wakes up again.
		 
		
		
		 In the long run, the frequency of execution will be exactly the reciprocal of the
		 specified `interval`.
		 
		
		
		 Warning: `scheduleAtFixedRate` can result in bursts of scheduled tasks after long
		 garbage collection pauses, which may in worst case cause undesired load on the system.
		 Therefore `scheduleWithFixedDelay` is often preferred.
		 
		
		
		 If the `Runnable` throws an exception the repeated scheduling is aborted,
		 i.e. the function will not be invoked any more.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `with Timers` should be preferred.
		- #### scheduleAtFixedRate
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleAtFixedRate​(java.time.Duration initialDelay,
		                                java.time.Duration interval,
		                                java.lang.Runnable runnable,
		                                scala.concurrent.ExecutionContext executor)
		```
		
		Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and
		 a frequency. E.g. if you would like the function to be run after 2
		 seconds and thereafter every 100ms you would set delay to `Duration.ofSeconds(2)`,
		 and interval to `Duration.ofMillis(100)`.
		 
		 It will compensate the delay for a subsequent task if the previous tasks took
		 too long to execute. In such cases, the actual execution interval will differ from
		 the interval passed to the method.
		 
		
		
		 If the execution of the tasks takes longer than the `interval`, the subsequent
		 execution will start immediately after the prior one completes (there will be
		 no overlap of executions). This also has the consequence that after long garbage
		 collection pauses or other reasons when the JVM was suspended all "missed" tasks
		 will execute when the process wakes up again.
		 
		
		
		 In the long run, the frequency of execution will be exactly the reciprocal of the
		 specified `interval`.
		 
		
		
		 Warning: `scheduleAtFixedRate` can result in bursts of scheduled tasks after long
		 garbage collection pauses, which may in worst case cause undesired load on the system.
		 Therefore `scheduleWithFixedDelay` is often preferred.
		 
		
		
		 If the `Runnable` throws an exception the repeated scheduling is aborted,
		 i.e. the function will not be invoked any more.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
		- #### scheduleAtFixedRate
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleAtFixedRate​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                scala.concurrent.duration.FiniteDuration interval,
		                                [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                                java.lang.Object message,
		                                scala.concurrent.ExecutionContext executor,
		                                [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Scala API: Schedules a message to be sent repeatedly with an initial delay and
		 frequency. E.g. if you would like a message to be sent immediately and
		 thereafter every 500ms you would set `delay=Duration.Zero` and
		 `interval=Duration(500, TimeUnit.MILLISECONDS)`
		
		 It will compensate the delay for a subsequent message if the sending of previous
		 message was delayed more than specified. In such cases, the actual message interval
		 will differ from the interval passed to the method.
		 
		
		
		 If the execution is delayed longer than the `interval`, the subsequent message will
		 be sent immediately after the prior one. This also has the consequence that after
		 long garbage collection pauses or other reasons when the JVM was suspended all
		 "missed" messages will be sent when the process wakes up again.
		 
		
		
		 In the long run, the frequency of messages will be exactly the reciprocal of the
		 specified `interval`.
		 
		
		
		 Warning: `scheduleAtFixedRate` can result in bursts of scheduled messages after long
		 garbage collection pauses, which may in worst case cause undesired load on the system.
		 Therefore `scheduleWithFixedDelay` is often preferred.
		 
		
		
		 Note: For scheduling within actors `with Timers` should be preferred.
		- #### scheduleAtFixedRate
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleAtFixedRate​(java.time.Duration initialDelay,
		                                java.time.Duration interval,
		                                [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                                java.lang.Object message,
		                                scala.concurrent.ExecutionContext executor,
		                                [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Java API: Schedules a message to be sent repeatedly with an initial delay and
		 frequency. E.g. if you would like a message to be sent immediately and
		 thereafter every 500ms you would set `delay=Duration.ZERO` and
		 `interval=Duration.ofMillis(500)`
		
		 It will compensate the delay for a subsequent message if the sending of previous
		 message was delayed more than specified. In such cases, the actual message interval
		 will differ from the interval passed to the method.
		 
		
		
		 If the execution is delayed longer than the `interval`, the subsequent message will
		 be sent immediately after the prior one. This also has the consequence that after
		 long garbage collection pauses or other reasons when the JVM was suspended all
		 "missed" messages will be sent when the process wakes up again.
		 
		
		
		 In the long run, the frequency of messages will be exactly the reciprocal of the
		 specified `interval`.
		 
		
		
		 Warning: `scheduleAtFixedRate` can result in bursts of scheduled messages after long
		 garbage collection pauses, which may in worst case cause undesired load on the system.
		 Therefore `scheduleWithFixedDelay` is often preferred.
		 
		
		
		 Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
		- #### schedule
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") schedule​(scala.concurrent.duration.FiniteDuration initialDelay,
		                     scala.concurrent.duration.FiniteDuration interval,
		                     [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                     java.lang.Object message,
		                     scala.concurrent.ExecutionContext executor,
		                     [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Deprecated API: See [`scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)).
		- #### schedule
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") schedule​(java.time.Duration initialDelay,
		                     java.time.Duration interval,
		                     [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                     java.lang.Object message,
		                     scala.concurrent.ExecutionContext executor,
		                     [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Deprecated API: See [`scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)).
		- #### schedule
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") schedule​(scala.concurrent.duration.FiniteDuration initialDelay,
		                     scala.concurrent.duration.FiniteDuration interval,
		                     scala.Function0<scala.runtime.BoxedUnit> f,
		                     scala.concurrent.ExecutionContext executor)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Deprecated API: See [`scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)).
		- #### schedule
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") schedule​(scala.concurrent.duration.FiniteDuration initialDelay,
		                     scala.concurrent.duration.FiniteDuration interval,
		                     java.lang.Runnable runnable,
		                     scala.concurrent.ExecutionContext executor)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Deprecated API: See [`scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)).
		- #### schedule
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") schedule​(java.time.Duration initialDelay,
		                     java.time.Duration interval,
		                     java.lang.Runnable runnable,
		                     scala.concurrent.ExecutionContext executor)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Deprecated API: See [`scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)).
		- #### scheduleWithFixedDelay$default$6
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") scheduleWithFixedDelay$default$6​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                          scala.concurrent.duration.FiniteDuration delay,
		                                          [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                                          java.lang.Object message)
		```
		- #### scheduleAtFixedRate$default$6
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") scheduleAtFixedRate$default$6​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                       scala.concurrent.duration.FiniteDuration interval,
		                                       [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                                       java.lang.Object message)
		```
		
		Scala API: Schedules a message to be sent repeatedly with an initial delay and
		 frequency. E.g. if you would like a message to be sent immediately and
		 thereafter every 500ms you would set `delay=Duration.Zero` and
		 `interval=Duration(500, TimeUnit.MILLISECONDS)`
		
		 It will compensate the delay for a subsequent message if the sending of previous
		 message was delayed more than specified. In such cases, the actual message interval
		 will differ from the interval passed to the method.
		 
		
		
		 If the execution is delayed longer than the `interval`, the subsequent message will
		 be sent immediately after the prior one. This also has the consequence that after
		 long garbage collection pauses or other reasons when the JVM was suspended all
		 "missed" messages will be sent when the process wakes up again.
		 
		
		
		 In the long run, the frequency of messages will be exactly the reciprocal of the
		 specified `interval`.
		 
		
		
		 Warning: `scheduleAtFixedRate` can result in bursts of scheduled messages after long
		 garbage collection pauses, which may in worst case cause undesired load on the system.
		 Therefore `scheduleWithFixedDelay` is often preferred.
		 
		
		
		 Note: For scheduling within actors `with Timers` should be preferred.
		- #### schedule$default$6
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") schedule$default$6​(scala.concurrent.duration.FiniteDuration initialDelay,
		                            scala.concurrent.duration.FiniteDuration interval,
		                            [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                            java.lang.Object message)
		```
		
		Deprecated API: See [`scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)) or [`scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, java.lang.Runnable, scala.concurrent.ExecutionContext)`](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext)).
		- #### scheduleOnce
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                         [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                         java.lang.Object message,
		                         scala.concurrent.ExecutionContext executor,
		                         [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Scala API: Schedules a message to be sent once with a delay, i.e. a time period that has
		 to pass before the message is sent.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `with Timers` should be preferred.
		- #### scheduleOnce
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleOnce​(java.time.Duration delay,
		                         [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                         java.lang.Object message,
		                         scala.concurrent.ExecutionContext executor,
		                         [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Java API: Schedules a message to be sent once with a delay, i.e. a time period that has
		 to pass before the message is sent.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
		- #### scheduleOnce
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                         scala.Function0<scala.runtime.BoxedUnit> f,
		                         scala.concurrent.ExecutionContext executor)
		```
		
		Scala API: Schedules a function to be run once with a delay, i.e. a time period that has
		 to pass before the function is run.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `with Timers` should be preferred.
		- #### scheduleOnce
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                         java.lang.Runnable runnable,
		                         scala.concurrent.ExecutionContext executor)
		```
		
		Scala API: Schedules a Runnable to be run once with a delay, i.e. a time period that
		 has to pass before the runnable is executed.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `with Timers` should be preferred.
		- #### scheduleOnce
		
		
		
		```
		[Cancellable](Cancellable.html "interface in akka.actor") scheduleOnce​(java.time.Duration delay,
		                         java.lang.Runnable runnable,
		                         scala.concurrent.ExecutionContext executor)
		```
		
		Java API: Schedules a Runnable to be run once with a delay, i.e. a time period that
		 has to pass before the runnable is executed.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
		- #### scheduleOnce$default$5
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") scheduleOnce$default$5​(scala.concurrent.duration.FiniteDuration delay,
		                                [ActorRef](ActorRef.html "class in akka.actor") receiver,
		                                java.lang.Object message)
		```
		- #### maxFrequency
		
		
		
		```
		double maxFrequency()
		```
		
		The maximum supported task frequency of this scheduler, i.e. the inverse
		 of the minimum time interval between executions of a recurring task, in Hz.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractScheduler.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/LightArrayRevolverScheduler.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Scheduler.TaskRunOnClose.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/testkit/ExplicitlyTriggeredScheduler.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/Scheduler.html](https://doc.akka.io/japi/akka/2.10/akka/actor/Scheduler.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:49:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Scheduler.html
title: Scheduler
---

# Scheduler

## Content

Package [akka.actor.typed](package-summary.html)
## Interface Scheduler

- ---

```
public interface Scheduler
```

The ActorSystem facility for scheduling tasks.
 
 For scheduling within actors `Behaviors.withTimers` should be preferred.
 

 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Cancellable](../Cancellable.html "interface in akka.actor")` | `[scheduleAtFixedRate](#scheduleAtFixedRate(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration initialDelay,  java.time.Duration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a frequency. |
	| `[Cancellable](../Cancellable.html "interface in akka.actor")` | `[scheduleAtFixedRate](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a frequency. |
	| `[Cancellable](../Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Java API: Schedules a Runnable to be run once with a delay, i.e. |
	| `[Cancellable](../Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a Runnable to be run once with a delay, i.e. |
	| `[Cancellable](../Cancellable.html "interface in akka.actor")` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(java.time.Duration,java.time.Duration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(java.time.Duration initialDelay,  java.time.Duration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a fixed `delay` between subsequent executions. |
	| `[Cancellable](../Cancellable.html "interface in akka.actor")` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable runnable,  scala.concurrent.ExecutionContext executor)` | Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and  a fixed `delay` between subsequent executions. |

- - ### Method Detail
	
	
	
		- #### scheduleAtFixedRate
		
		
		
		```
		[Cancellable](../Cancellable.html "interface in akka.actor") scheduleAtFixedRate​(scala.concurrent.duration.FiniteDuration initialDelay,
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
		 
		 Note: For scheduling within actors `Behaviors.withTimers` should be preferred.
		- #### scheduleAtFixedRate
		
		
		
		```
		[Cancellable](../Cancellable.html "interface in akka.actor") scheduleAtFixedRate​(java.time.Duration initialDelay,
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
		 
		 Note: For scheduling in actors `Behaviors.withTimers` should be preferred.
		- #### scheduleOnce
		
		
		
		```
		[Cancellable](../Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                         java.lang.Runnable runnable,
		                         scala.concurrent.ExecutionContext executor)
		```
		
		Scala API: Schedules a Runnable to be run once with a delay, i.e. a time period that
		 has to pass before the runnable is executed.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `Behaviors.withTimers` or `ActorContext.scheduleOnce` should be preferred.
		- #### scheduleOnce
		
		
		
		```
		[Cancellable](../Cancellable.html "interface in akka.actor") scheduleOnce​(java.time.Duration delay,
		                         java.lang.Runnable runnable,
		                         scala.concurrent.ExecutionContext executor)
		```
		
		Java API: Schedules a Runnable to be run once with a delay, i.e. a time period that
		 has to pass before the runnable is executed.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 reach (calculated as: `delay / tickNanos > Int.MaxValue`).
		 
		 Note: For scheduling within actors `Behaviors.withTimers` or `ActorContext.scheduleOnce` should be preferred.
		- #### scheduleWithFixedDelay
		
		
		
		```
		[Cancellable](../Cancellable.html "interface in akka.actor") scheduleWithFixedDelay​(scala.concurrent.duration.FiniteDuration initialDelay,
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
		 
		 Note: For scheduling within actors `Behaviors.withTimers` should be preferred.
		- #### scheduleWithFixedDelay
		
		
		
		```
		[Cancellable](../Cancellable.html "interface in akka.actor") scheduleWithFixedDelay​(java.time.Duration initialDelay,
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
		 
		 Note: For scheduling in actors `Behaviors.withTimers` should be preferred.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Scheduler.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Scheduler.html)*
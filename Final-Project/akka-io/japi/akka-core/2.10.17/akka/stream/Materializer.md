---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Materializer.html
title: Materializer
---

# Materializer

## Content

Package [akka.stream](package-summary.html)
## Class Materializer

- java.lang.Object
- - akka.stream.Materializer

- Direct Known Subclasses:
`[ActorMaterializer](ActorMaterializer.html "class in akka.stream")`

---

```
public abstract class Materializer
extends java.lang.Object
```

The Materializer is the component responsible for turning a stream blueprint into a running stream.
 In general the system wide materializer should be preferred over creating instances manually.
 
 Not for user extension

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Materializer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[apply](#apply(akka.actor.ClassicActorContextProvider))​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider)` | Scala API: Create a materializer whose lifecycle will be tied to the one of the passed actor context. |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[apply](#apply(akka.actor.ClassicActorContextProvider,akka.stream.Attributes))​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | Scala API: Create a materializer whose lifecycle will be tied to the one of the passed actor context. |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Scala API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped. |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider,akka.stream.Attributes))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | Scala API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped. |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[createMaterializer](#createMaterializer(akka.actor.ClassicActorContextProvider))​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider)` | Java API: Create a materializer whose lifecycle will be tied to the one of the passed actor context. |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[createMaterializer](#createMaterializer(akka.actor.ClassicActorContextProvider,akka.stream.Attributes))​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | Java API: Create a materializer whose lifecycle will be tied to the one of the passed actor context. |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[createMaterializer](#createMaterializer(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Java API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped. |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[createMaterializer](#createMaterializer(akka.actor.ClassicActorSystemProvider,akka.stream.Attributes))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | Java API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped. |
	| `abstract scala.concurrent.ExecutionContextExecutor` | `[executionContext](#executionContext())()` | Running a flow graph will require execution resources, as will computations  within Sources, Sinks, etc. |
	| `abstract boolean` | `[isShutdown](#isShutdown())()` | Indicates if the materializer has been shut down. |
	| `abstract <Mat> Mat` | `[materialize](#materialize(akka.stream.Graph))​([Graph](Graph.html "interface in akka.stream")<[ClosedShape](ClosedShape.html "class in akka.stream"),​Mat> runnable)` | This method interprets the given Flow description and creates the running  stream. |
	| `abstract <Mat> Mat` | `[materialize](#materialize(akka.stream.Graph,akka.stream.Attributes))​([Graph](Graph.html "interface in akka.stream")<[ClosedShape](ClosedShape.html "class in akka.stream"),​Mat> runnable,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | This method interprets the given Flow description and creates the running  stream using an explicitly provided [`Attributes`](Attributes.html "class in akka.stream") as top level (least specific) attributes that  will be defaults for the materialized stream. |
	| `static [Materializer](Materializer.html "class in akka.stream")` | `[matFromSystem](#matFromSystem(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") provider)` | Implicitly provides the system wide materializer from a classic or typed `ActorSystem` |
	| `abstract [Cancellable](../actor/Cancellable.html "interface in akka.actor")` | `[scheduleAtFixedRate](#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  java.lang.Runnable task)` | Interface for operators that need timer services for their functionality. |
	| `abstract [Cancellable](../actor/Cancellable.html "interface in akka.actor")` | `[scheduleOnce](#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable))​(scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable task)` | Interface for operators that need timer services for their functionality. |
	| `abstract [Cancellable](../actor/Cancellable.html "interface in akka.actor")` | `[schedulePeriodically](#schedulePeriodically(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  java.lang.Runnable task)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `abstract [Cancellable](../actor/Cancellable.html "interface in akka.actor")` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay,  java.lang.Runnable task)` | Interface for operators that need timer services for their functionality. |
	| `abstract [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[settings](#settings())()` | Deprecated. Use attributes to access settings from stages. |
	| `abstract void` | `[shutdown](#shutdown())()` | Shuts down this materializer and all the operators that have been materialized through this materializer. |
	| `abstract [ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` | The classic actor system this materializer is backed by (and in which the streams materialized with the  materializer will run) |
	| `abstract [Materializer](Materializer.html "class in akka.stream")` | `[withNamePrefix](#withNamePrefix(java.lang.String))​(java.lang.String name)` | The `namePrefix` shall be used for deriving the names of processing  entities that are created during materialization. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Materializer
		
		
		
		```
		public Materializer()
		```

	- ### Method Detail
	
	
	
		- #### matFromSystem
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") matFromSystem​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") provider)
		```
		
		Implicitly provides the system wide materializer from a classic or typed `ActorSystem`
		- #### apply
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") apply​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider)
		```
		
		Scala API: Create a materializer whose lifecycle will be tied to the one of the passed actor context.
		 When the actor stops the materializer will stop and all streams created with it will be failed with an `AbruptTerminationExeption`
		
		 You can pass either a classic actor context or a typed actor context.
		- #### createMaterializer
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") createMaterializer​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider)
		```
		
		Java API: Create a materializer whose lifecycle will be tied to the one of the passed actor context.
		 When the actor stops the materializer will stop and all streams created with it will be failed with an `AbruptTerminationExeption`
		
		 You can pass either a classic actor context or a typed actor context.
		- #### apply
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") apply​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider,
		                                 [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		Scala API: Create a materializer whose lifecycle will be tied to the one of the passed actor context.
		 When the actor stops the materializer will stop and all streams created with it will be failed with an `AbruptTerminationExeption`
		
		 You can pass either a classic actor context or a typed actor context.
		- #### createMaterializer
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") createMaterializer​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider,
		                                              [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		Java API: Create a materializer whose lifecycle will be tied to the one of the passed actor context.
		 When the actor stops the materializer will stop and all streams created with it will be failed with an `AbruptTerminationExeption`
		
		 You can pass either a classic actor context or a typed actor context.
		- #### apply
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Scala API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped.
		 
		 \*Note\* prefer using the default [`SystemMaterializer`](SystemMaterializer.html "class in akka.stream") that is implicitly available if you have an implicit
		 `ActorSystem` in scope. Only create new system level materializers if you have specific
		 needs or want to test abrupt termination of a custom graph stage. If you want to tie the lifecycle
		 of the materializer to an actor, use the factory that takes an `ActorContext` instead.
		- #### createMaterializer
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") createMaterializer​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Java API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped.
		 
		 \*Note\* prefer using the default [`SystemMaterializer`](SystemMaterializer.html "class in akka.stream") by passing the `ActorSystem` to the various `run`
		 methods on the streams. Only create new system level materializers if you have specific
		 needs or want to test abrupt termination of a custom graph stage. If you want to tie the
		 lifecycle of the materializer to an actor, use the factory that takes an `ActorContext` instead.
		- #### apply
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider,
		                                 [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		Scala API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped.
		 
		 It is generally advised to limit the number of system level materializers created.
		- #### createMaterializer
		
		
		
		```
		public static [Materializer](Materializer.html "class in akka.stream") createMaterializer​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider,
		                                              [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		Java API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped.
		 
		 It is generally advised to limit the number of system level materializers created.
		- #### withNamePrefix
		
		
		
		```
		public abstract [Materializer](Materializer.html "class in akka.stream") withNamePrefix​(java.lang.String name)
		```
		
		The `namePrefix` shall be used for deriving the names of processing
		 entities that are created during materialization. This is meant to aid
		 logging and failure reporting both during materialization and while the
		 stream is running.
		- #### materialize
		
		
		
		```
		public abstract <Mat> Mat materialize​([Graph](Graph.html "interface in akka.stream")<[ClosedShape](ClosedShape.html "class in akka.stream"),​Mat> runnable)
		```
		
		This method interprets the given Flow description and creates the running
		 stream. The result can be highly implementation specific, ranging from
		 local actor chains to remote\-deployed processing networks.
		- #### materialize
		
		
		
		```
		public abstract <Mat> Mat materialize​([Graph](Graph.html "interface in akka.stream")<[ClosedShape](ClosedShape.html "class in akka.stream"),​Mat> runnable,
		                                      [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		This method interprets the given Flow description and creates the running
		 stream using an explicitly provided [`Attributes`](Attributes.html "class in akka.stream") as top level (least specific) attributes that
		 will be defaults for the materialized stream.
		 The result can be highly implementation specific, ranging from local actor chains to remote\-deployed
		 processing networks.
		- #### executionContext
		
		
		
		```
		public abstract scala.concurrent.ExecutionContextExecutor executionContext()
		```
		
		Running a flow graph will require execution resources, as will computations
		 within Sources, Sinks, etc. This `ExecutionContextExecutor`
		 can be used by parts of the flow to submit processing jobs for execution,
		 run Future callbacks, etc.
		 
		 Note that this is not necessarily the same execution context the stream operator itself is running on.
		- #### scheduleOnce
		
		
		
		```
		public abstract [Cancellable](../actor/Cancellable.html "interface in akka.actor") scheduleOnce​(scala.concurrent.duration.FiniteDuration delay,
		                                         java.lang.Runnable task)
		```
		
		Interface for operators that need timer services for their functionality. Schedules a
		 single task with the given delay.
		 
		
		Returns:
		A [`Cancellable`](../actor/Cancellable.html "interface in akka.actor") that allows cancelling the timer. Cancelling is best effort, if the event
		 has been already enqueued it will not have an effect.
		- #### scheduleWithFixedDelay
		
		
		
		```
		public abstract [Cancellable](../actor/Cancellable.html "interface in akka.actor") scheduleWithFixedDelay​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                                   scala.concurrent.duration.FiniteDuration delay,
		                                                   java.lang.Runnable task)
		```
		
		Interface for operators that need timer services for their functionality.
		 
		 Schedules a `Runnable` to be run repeatedly with an initial delay and
		 a fixed `delay` between subsequent executions.
		 
		
		
		 It will not compensate the delay between tasks if the execution takes a long time or if
		 scheduling is delayed longer than specified for some reason. The delay between subsequent
		 execution will always be (at least) the given `delay`. In the long run, the
		 frequency of execution will generally be slightly lower than the reciprocal of the specified
		 `delay`.
		 
		
		
		 If the `Runnable` throws an exception the repeated scheduling is aborted,
		 i.e. the function will not be invoked any more.
		 
		
		
		
		Returns:
		A [`Cancellable`](../actor/Cancellable.html "interface in akka.actor") that allows cancelling the timer. Cancelling is best effort, if the event
		 has been already enqueued it will not have an effect.
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 supported by the `Scheduler`.
		- #### scheduleAtFixedRate
		
		
		
		```
		public abstract [Cancellable](../actor/Cancellable.html "interface in akka.actor") scheduleAtFixedRate​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                                scala.concurrent.duration.FiniteDuration interval,
		                                                java.lang.Runnable task)
		```
		
		Interface for operators that need timer services for their functionality.
		 
		 Schedules a `Runnable` to be run repeatedly with an initial delay and
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
		 
		
		
		
		Returns:
		A [`Cancellable`](../actor/Cancellable.html "interface in akka.actor") that allows cancelling the timer. Cancelling is best effort, if the event
		 has been already enqueued it will not have an effect.
		Throws:
		`java.lang.IllegalArgumentException` \- if the given delays exceed the maximum
		 supported by the `Scheduler`.
		- #### schedulePeriodically
		
		
		
		```
		public abstract [Cancellable](../actor/Cancellable.html "interface in akka.actor") schedulePeriodically​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                                 scala.concurrent.duration.FiniteDuration interval,
		                                                 java.lang.Runnable task)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Interface for operators that need timer services for their functionality. Schedules a
		 repeated task with the given interval between invocations.
		 
		
		Returns:
		A [`Cancellable`](../actor/Cancellable.html "interface in akka.actor") that allows cancelling the timer. Cancelling is best effort, if the event
		 has been already enqueued it will not have an effect.
		- #### shutdown
		
		
		
		```
		public abstract void shutdown()
		```
		
		Shuts down this materializer and all the operators that have been materialized through this materializer. After
		 having shut down, this materializer cannot be used again. Any attempt to materialize operators after having
		 shut down will result in an IllegalStateException being thrown at materialization time.
		- #### isShutdown
		
		
		
		```
		public abstract boolean isShutdown()
		```
		
		Indicates if the materializer has been shut down.
		- #### system
		
		
		
		```
		public abstract [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system()
		```
		
		The classic actor system this materializer is backed by (and in which the streams materialized with the
		 materializer will run)
		- #### settings
		
		
		
		```
		public abstract [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings()
		```
		
		Deprecated.
		Use attributes to access settings from stages. Since 2\.6\.0\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Materializer.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Materializer.html)*
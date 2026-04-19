---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.html
title: CoordinatedShutdown
---

# CoordinatedShutdown

## Content

Package [akka.actor](package-summary.html)
## Class CoordinatedShutdown

- java.lang.Object
- - akka.actor.CoordinatedShutdown

- All Implemented Interfaces:
`[Extension](Extension.html "interface in akka.actor")`

---

```
public final class CoordinatedShutdown
extends java.lang.Object
implements [Extension](Extension.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[CoordinatedShutdown.ActorSystemTerminateReason$](CoordinatedShutdown.ActorSystemTerminateReason$.html "class in akka.actor")` |  |
	| `static class` | `[CoordinatedShutdown.ClusterDowningReason$](CoordinatedShutdown.ClusterDowningReason$.html "class in akka.actor")` |  |
	| `static class` | `[CoordinatedShutdown.ClusterJoinUnsuccessfulReason$](CoordinatedShutdown.ClusterJoinUnsuccessfulReason$.html "class in akka.actor")` |  |
	| `static class` | `[CoordinatedShutdown.ClusterLeavingReason$](CoordinatedShutdown.ClusterLeavingReason$.html "class in akka.actor")` |  |
	| `static class` | `[CoordinatedShutdown.IncompatibleConfigurationDetectedReason$](CoordinatedShutdown.IncompatibleConfigurationDetectedReason$.html "class in akka.actor")` |  |
	| `static class` | `[CoordinatedShutdown.JvmExitReason$](CoordinatedShutdown.JvmExitReason$.html "class in akka.actor")` |  |
	| `static class` | `[CoordinatedShutdown.Phase$](CoordinatedShutdown.Phase$.html "class in akka.actor")` |  |
	| `static interface` | `[CoordinatedShutdown.PhaseDefinition](CoordinatedShutdown.PhaseDefinition.html "interface in akka.actor")` |  |
	| `static interface` | `[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | Reason for the shutdown, which can be used by tasks in case they need to do  different things depending on what caused the shutdown. |
	| `static class` | `[CoordinatedShutdown.UnknownReason$](CoordinatedShutdown.UnknownReason$.html "class in akka.actor")` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[actorSystemTerminateReason](#actorSystemTerminateReason())()` |  |
	| `void` | `[addActorTerminationTask](#addActorTerminationTask(java.lang.String,java.lang.String,akka.actor.ActorRef,java.util.Optional))​(java.lang.String phase,  java.lang.String taskName,  [ActorRef](ActorRef.html "class in akka.actor") actor,  java.util.Optional<java.lang.Object> stopMsg)` | Java API: Add an actor termination task to a phase. |
	| `void` | `[addActorTerminationTask](#addActorTerminationTask(java.lang.String,java.lang.String,akka.actor.ActorRef,scala.Option))​(java.lang.String phase,  java.lang.String taskName,  [ActorRef](ActorRef.html "class in akka.actor") actor,  scala.Option<java.lang.Object> stopMsg)` | Scala API: Add an actor termination task to a phase. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[addCancellableJvmShutdownHook](#addCancellableJvmShutdownHook(java.lang.Runnable))​(java.lang.Runnable hook)` | Java API: Add a JVM shutdown hook that will be run when the JVM process  begins its shutdown sequence. |
	| `<T> [Cancellable](Cancellable.html "interface in akka.actor")` | `[addCancellableJvmShutdownHook](#addCancellableJvmShutdownHook(scala.Function0))​(scala.Function0<T> hook)` | Scala API: Add a JVM shutdown hook that will be run when the JVM process  begins its shutdown sequence. |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[addCancellableTask](#addCancellableTask(java.lang.String,java.lang.String,java.util.function.Supplier))​(java.lang.String phase,  java.lang.String taskName,  java.util.function.Supplier<java.util.concurrent.CompletionStage<[Done](../Done.html "class in akka")>> task)` | Java API: Add a task to a phase, returning an object which will cancel it  on demand and remove it from the task pool (so long as the same task has not  been added elsewhere). |
	| `[Cancellable](Cancellable.html "interface in akka.actor")` | `[addCancellableTask](#addCancellableTask(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String phase,  java.lang.String taskName,  scala.Function0<scala.concurrent.Future<[Done](../Done.html "class in akka")>> task)` | Scala API: Add a task to a phase, returning an object which will cancel it  on demand and remove it from the task pool (so long as the same task has not  been added elsewhere). |
	| `void` | `[addJvmShutdownHook](#addJvmShutdownHook(java.lang.Runnable))​(java.lang.Runnable hook)` | Java API: Add a JVM shutdown hook that will be run when the JVM process  begins its shutdown sequence. |
	| `<T> void` | `[addJvmShutdownHook](#addJvmShutdownHook(scala.Function0))​(scala.Function0<T> hook)` | Scala API: Add a JVM shutdown hook that will be run when the JVM process  begins its shutdown sequence. |
	| `void` | `[addTask](#addTask(java.lang.String,java.lang.String,java.util.function.Supplier))​(java.lang.String phase,  java.lang.String taskName,  java.util.function.Supplier<java.util.concurrent.CompletionStage<[Done](../Done.html "class in akka")>> task)` | Java API: Add a task to a phase. |
	| `void` | `[addTask](#addTask(java.lang.String,java.lang.String,scala.Function0))​(java.lang.String phase,  java.lang.String taskName,  scala.Function0<scala.concurrent.Future<[Done](../Done.html "class in akka")>> task)` | Scala API: Add a task to a phase. |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[clusterDowningReason](#clusterDowningReason())()` |  |
	| `static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[clusterJoinUnsuccessfulReason](#clusterJoinUnsuccessfulReason())()` |  |
	| `static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[clusterLeavingReason](#clusterLeavingReason())()` |  |
	| `static [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor") system)` |  |
	| `static [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `java.util.Optional<[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")>` | `[getShutdownReason](#getShutdownReason())()` | The `Reason` for the shutdown as passed to the `run` method. |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[incompatibleConfigurationDetectedReason](#incompatibleConfigurationDetectedReason())()` |  |
	| `static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[jvmExitReason](#jvmExitReason())()` |  |
	| `static [CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor")` | `[lookup](#lookup())()` |  |
	| `static java.lang.String` | `[PhaseActorSystemTerminate](#PhaseActorSystemTerminate())()` | Last phase. |
	| `static java.lang.String` | `[PhaseBeforeActorSystemTerminate](#PhaseBeforeActorSystemTerminate())()` | Phase for custom application tasks that are to be run  after cluster shutdown and before ActorSystem termination. |
	| `static java.lang.String` | `[PhaseBeforeClusterShutdown](#PhaseBeforeClusterShutdown())()` | Phase for custom application tasks that are to be run  after service shutdown and before cluster shutdown. |
	| `static java.lang.String` | `[PhaseBeforeServiceUnbind](#PhaseBeforeServiceUnbind())()` |  |
	| `static java.lang.String` | `[PhaseClusterExiting](#PhaseClusterExiting())()` | Shutdown cluster singletons |
	| `static java.lang.String` | `[PhaseClusterExitingDone](#PhaseClusterExitingDone())()` | Wait until exiting has been completed |
	| `static java.lang.String` | `[PhaseClusterLeave](#PhaseClusterLeave())()` | Emit the leave command for the node that is shutting down. |
	| `static java.lang.String` | `[PhaseClusterShardingShutdownRegion](#PhaseClusterShardingShutdownRegion())()` | Graceful shutdown of the Cluster Sharding regions. |
	| `static java.lang.String` | `[PhaseClusterShutdown](#PhaseClusterShutdown())()` | Shutdown the cluster extension |
	| `static java.lang.String` | `[PhaseServiceRequestsDone](#PhaseServiceRequestsDone())()` | Wait for requests that are in progress to be completed. |
	| `static java.lang.String` | `[PhaseServiceStop](#PhaseServiceStop())()` | Final shutdown of service endpoints. |
	| `static java.lang.String` | `[PhaseServiceUnbind](#PhaseServiceUnbind())()` | Stop accepting new incoming requests in for example HTTP. |
	| `scala.concurrent.Future<[Done](../Done.html "class in akka")>` | `[run](#run(akka.actor.CoordinatedShutdown.Reason))​([CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") reason)` | Scala API: Run tasks of all phases. |
	| `java.util.concurrent.CompletionStage<[Done](../Done.html "class in akka")>` | `[run](#run(akka.actor.CoordinatedShutdown.Reason,java.util.Optional))​([CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") reason,  java.util.Optional<java.lang.String> fromPhase)` | Java API: Run tasks of all phases including and after the given phase. |
	| `scala.concurrent.Future<[Done](../Done.html "class in akka")>` | `[run](#run(akka.actor.CoordinatedShutdown.Reason,scala.Option))​([CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") reason,  scala.Option<java.lang.String> fromPhase)` | Scala API: Run tasks of all phases including and after the given phase. |
	| `java.util.concurrent.CompletionStage<[Done](../Done.html "class in akka")>` | `[runAll](#runAll(akka.actor.CoordinatedShutdown.Reason))​([CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") reason)` | Java API: Run tasks of all phases. |
	| `scala.Option<[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")>` | `[shutdownReason](#shutdownReason())()` | The `Reason` for the shutdown as passed to the `run` method. |
	| `scala.concurrent.duration.FiniteDuration` | `[timeout](#timeout(java.lang.String))​(java.lang.String phase)` | The configured timeout for a given `phase`. |
	| `scala.concurrent.duration.FiniteDuration` | `[totalTimeout](#totalTimeout())()` | Sum of timeouts of all phases that have some task. |
	| `static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[unknownReason](#unknownReason())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### PhaseBeforeServiceUnbind
		
		
		
		```
		public static java.lang.String PhaseBeforeServiceUnbind()
		```
		- #### PhaseServiceUnbind
		
		
		
		```
		public static java.lang.String PhaseServiceUnbind()
		```
		
		Stop accepting new incoming requests in for example HTTP.
		- #### PhaseServiceRequestsDone
		
		
		
		```
		public static java.lang.String PhaseServiceRequestsDone()
		```
		
		Wait for requests that are in progress to be completed.
		- #### PhaseServiceStop
		
		
		
		```
		public static java.lang.String PhaseServiceStop()
		```
		
		Final shutdown of service endpoints.
		- #### PhaseBeforeClusterShutdown
		
		
		
		```
		public static java.lang.String PhaseBeforeClusterShutdown()
		```
		
		Phase for custom application tasks that are to be run
		 after service shutdown and before cluster shutdown.
		- #### PhaseClusterShardingShutdownRegion
		
		
		
		```
		public static java.lang.String PhaseClusterShardingShutdownRegion()
		```
		
		Graceful shutdown of the Cluster Sharding regions.
		- #### PhaseClusterLeave
		
		
		
		```
		public static java.lang.String PhaseClusterLeave()
		```
		
		Emit the leave command for the node that is shutting down.
		- #### PhaseClusterExiting
		
		
		
		```
		public static java.lang.String PhaseClusterExiting()
		```
		
		Shutdown cluster singletons
		- #### PhaseClusterExitingDone
		
		
		
		```
		public static java.lang.String PhaseClusterExitingDone()
		```
		
		Wait until exiting has been completed
		- #### PhaseClusterShutdown
		
		
		
		```
		public static java.lang.String PhaseClusterShutdown()
		```
		
		Shutdown the cluster extension
		- #### PhaseBeforeActorSystemTerminate
		
		
		
		```
		public static java.lang.String PhaseBeforeActorSystemTerminate()
		```
		
		Phase for custom application tasks that are to be run
		 after cluster shutdown and before ActorSystem termination.
		- #### PhaseActorSystemTerminate
		
		
		
		```
		public static java.lang.String PhaseActorSystemTerminate()
		```
		
		Last phase. See terminate\-actor\-system and exit\-jvm above.
		 Don't add phases that depends on this phase because the
		 dispatcher and scheduler of the ActorSystem have been shutdown.
		- #### unknownReason
		
		
		
		```
		public static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") unknownReason()
		```
		- #### actorSystemTerminateReason
		
		
		
		```
		public static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") actorSystemTerminateReason()
		```
		- #### jvmExitReason
		
		
		
		```
		public static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") jvmExitReason()
		```
		- #### clusterDowningReason
		
		
		
		```
		public static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") clusterDowningReason()
		```
		- #### clusterJoinUnsuccessfulReason
		
		
		
		```
		public static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") clusterJoinUnsuccessfulReason()
		```
		- #### incompatibleConfigurationDetectedReason
		
		
		
		```
		public static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") incompatibleConfigurationDetectedReason()
		```
		- #### clusterLeavingReason
		
		
		
		```
		public static [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") clusterLeavingReason()
		```
		- #### get
		
		
		
		```
		public static [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor") get​([ActorSystem](ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor") get​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor") createExtension​([ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### addCancellableTask
		
		
		
		```
		public [Cancellable](Cancellable.html "interface in akka.actor") addCancellableTask​(java.lang.String phase,
		                                      java.lang.String taskName,
		                                      scala.Function0<scala.concurrent.Future<[Done](../Done.html "class in akka")>> task)
		```
		
		Scala API: Add a task to a phase, returning an object which will cancel it
		 on demand and remove it from the task pool (so long as the same task has not
		 been added elsewhere). Tasks in a phase are run concurrently, with no ordering
		 assumed.
		 
		 Adding a task to a phase does not remove any other tasks from the phase.
		 
		
		
		 If the same task is added multiple times, each addition will be run unless cancelled.
		 
		
		
		 Tasks should typically be registered as early as possible \-\- once coordinated
		 shutdown begins, tasks may be added without ever being run. A task may add tasks
		 to a later stage with confidence that they will be run.
		- #### addCancellableTask
		
		
		
		```
		public [Cancellable](Cancellable.html "interface in akka.actor") addCancellableTask​(java.lang.String phase,
		                                      java.lang.String taskName,
		                                      java.util.function.Supplier<java.util.concurrent.CompletionStage<[Done](../Done.html "class in akka")>> task)
		```
		
		Java API: Add a task to a phase, returning an object which will cancel it
		 on demand and remove it from the task pool (so long as the same task has not
		 been added elsewhere). Tasks in a phase are run concurrently, with no ordering
		 assumed.
		 
		 Adding a task to a phase does not remove any other tasks from the phase.
		 
		
		
		 If the same task is added multiple times, each addition will be run unless cancelled.
		 
		
		
		 Tasks should typically be registered as early as possible \-\- once coordinated
		 shutdown begins, tasks may be added without ever being run. A task may add tasks
		 to a later stage with confidence that they will be run.
		- #### addTask
		
		
		
		```
		public void addTask​(java.lang.String phase,
		                    java.lang.String taskName,
		                    scala.Function0<scala.concurrent.Future<[Done](../Done.html "class in akka")>> task)
		```
		
		Scala API: Add a task to a phase. It doesn't remove previously added tasks.
		 Tasks added to the same phase are executed in parallel without any
		 ordering assumptions. Next phase will not start until all tasks of
		 previous phase have been completed.
		 
		 Tasks should typically be registered as early as possible after system
		 startup. When running the coordinated shutdown tasks that have been registered
		 will be performed but tasks that are added too late will not be run.
		 It is possible to add a task to a later phase by a task in an earlier phase
		 and it will be performed.
		- #### addTask
		
		
		
		```
		public void addTask​(java.lang.String phase,
		                    java.lang.String taskName,
		                    java.util.function.Supplier<java.util.concurrent.CompletionStage<[Done](../Done.html "class in akka")>> task)
		```
		
		Java API: Add a task to a phase. It doesn't remove previously added tasks.
		 Tasks added to the same phase are executed in parallel without any
		 ordering assumptions. Next phase will not start until all tasks of
		 previous phase have been completed.
		 
		 Tasks should typically be registered as early as possible after system
		 startup. When running the coordinated shutdown tasks that have been registered
		 will be performed but tasks that are added too late will not be run.
		 It is possible to add a task to a later phase by a task in an earlier phase
		 and it will be performed.
		- #### addActorTerminationTask
		
		
		
		```
		public void addActorTerminationTask​(java.lang.String phase,
		                                    java.lang.String taskName,
		                                    [ActorRef](ActorRef.html "class in akka.actor") actor,
		                                    scala.Option<java.lang.Object> stopMsg)
		```
		
		Scala API: Add an actor termination task to a phase. It doesn't remove
		 previously added tasks. Tasks added to the same phase are executed in
		 parallel without any ordering assumptions. Next phase will not start until
		 all tasks of previous phase have been completed.
		 
		 When executed, this task will first send the given stop message, if defined,
		 to the actor, then it will watch the actor, and complete when the actor
		 terminates.
		 
		
		
		 Tasks should typically be registered as early as possible after system
		 startup. When running the coordinated shutdown tasks that have been registered
		 will be performed but tasks that are added too late will not be run.
		 It is possible to add a task to a later phase by a task in an earlier phase
		 and it will be performed.
		- #### addActorTerminationTask
		
		
		
		```
		public void addActorTerminationTask​(java.lang.String phase,
		                                    java.lang.String taskName,
		                                    [ActorRef](ActorRef.html "class in akka.actor") actor,
		                                    java.util.Optional<java.lang.Object> stopMsg)
		```
		
		Java API: Add an actor termination task to a phase. It doesn't remove
		 previously added tasks. Tasks added to the same phase are executed in
		 parallel without any ordering assumptions. Next phase will not start until
		 all tasks of previous phase have been completed.
		 
		 When executed, this task will first send the given stop message, if defined,
		 to the actor, then it will watch the actor, and complete when the actor
		 terminates.
		 
		
		
		 Tasks should typically be registered as early as possible after system
		 startup. When running the coordinated shutdown tasks that have been registered
		 will be performed but tasks that are added too late will not be run.
		 It is possible to add a task to a later phase by a task in an earlier phase
		 and it will be performed.
		- #### shutdownReason
		
		
		
		```
		public scala.Option<[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")> shutdownReason()
		```
		
		The `Reason` for the shutdown as passed to the `run` method. `None` if the shutdown
		 has not been started.
		- #### getShutdownReason
		
		
		
		```
		public java.util.Optional<[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")> getShutdownReason()
		```
		
		The `Reason` for the shutdown as passed to the `run` method. `Optional.empty` if the shutdown
		 has not been started.
		- #### run
		
		
		
		```
		public scala.concurrent.Future<[Done](../Done.html "class in akka")> run​([CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") reason)
		```
		
		Scala API: Run tasks of all phases. The returned
		 `Future` is completed when all tasks have been completed,
		 or there is a failure when recovery is disabled.
		 
		 It's safe to call this method multiple times. It will only run the shutdown sequence once.
		- #### runAll
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../Done.html "class in akka")> runAll​([CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") reason)
		```
		
		Java API: Run tasks of all phases. The returned
		 `CompletionStage` is completed when all tasks have been completed,
		 or there is a failure when recovery is disabled.
		 
		 It's safe to call this method multiple times. It will only run the shutdown sequence once.
		- #### run
		
		
		
		```
		public scala.concurrent.Future<[Done](../Done.html "class in akka")> run​([CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") reason,
		                                         scala.Option<java.lang.String> fromPhase)
		```
		
		Scala API: Run tasks of all phases including and after the given phase.
		 The returned `Future` is completed when all such tasks have been completed,
		 or there is a failure when recovery is disabled.
		 
		 It's safe to call this method multiple times. It will only run shutdown sequence once.
		- #### run
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../Done.html "class in akka")> run​([CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") reason,
		                                                      java.util.Optional<java.lang.String> fromPhase)
		```
		
		Java API: Run tasks of all phases including and after the given phase.
		 The returned `CompletionStage` is completed when all such tasks have been completed,
		 or there is a failure when recovery is disabled.
		 
		 It's safe to call this method multiple times. It will only run the shutdown sequence once.
		- #### timeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration timeout​(java.lang.String phase)
		```
		
		The configured timeout for a given `phase`.
		 For example useful as timeout when actor `ask` requests
		 is used as a task.
		- #### totalTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration totalTimeout()
		```
		
		Sum of timeouts of all phases that have some task.
		- #### addJvmShutdownHook
		
		
		
		```
		public <T> void addJvmShutdownHook​(scala.Function0<T> hook)
		```
		
		Scala API: Add a JVM shutdown hook that will be run when the JVM process
		 begins its shutdown sequence. Added hooks may run in any order
		 concurrently, but they are running before Akka internal shutdown
		 hooks, e.g. those shutting down Artery.
		- #### addCancellableJvmShutdownHook
		
		
		
		```
		public <T> [Cancellable](Cancellable.html "interface in akka.actor") addCancellableJvmShutdownHook​(scala.Function0<T> hook)
		```
		
		Scala API: Add a JVM shutdown hook that will be run when the JVM process
		 begins its shutdown sequence. Added hooks may run in any order
		 concurrently, but they are running before Akka internal shutdown
		 hooks, e.g. those shutting down Artery.
		 
		 The returned Cancellable makes it possible to de\-register the hook. For example
		 on actor system shutdown to avoid leaking references to the actor system in tests.
		 
		
		
		 For shutdown hooks that does not have any requirements on running before the Akka
		 shutdown hooks the standard library JVM shutdown hooks APIs are better suited.
		- #### addJvmShutdownHook
		
		
		
		```
		public void addJvmShutdownHook​(java.lang.Runnable hook)
		```
		
		Java API: Add a JVM shutdown hook that will be run when the JVM process
		 begins its shutdown sequence. Added hooks may run in any order
		 concurrently, but they are running before Akka internal shutdown
		 hooks, e.g. those shutting down Artery.
		- #### addCancellableJvmShutdownHook
		
		
		
		```
		public [Cancellable](Cancellable.html "interface in akka.actor") addCancellableJvmShutdownHook​(java.lang.Runnable hook)
		```
		
		Java API: Add a JVM shutdown hook that will be run when the JVM process
		 begins its shutdown sequence. Added hooks may run in an order
		 concurrently, but they are running before Akka internal shutdown
		 hooks, e.g. those shutting down Artery.
		 
		 The returned Cancellable makes it possible to de\-register the hook. For example
		 on actor system shutdown to avoid leaking references to the actor system in tests.
		 
		
		
		 For shutdown hooks that does not have any requirements on running before the Akka
		 shutdown hooks the standard library JVM shutdown hooks APIs are better suited.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/Done.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.ActorSystemTerminateReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.ClusterDowningReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.ClusterJoinUnsuccessfulReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.ClusterLeavingReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.IncompatibleConfigurationDetectedReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.JvmExitReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.Phase$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.PhaseDefinition.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.Reason.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.UnknownReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.html](https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.html)*
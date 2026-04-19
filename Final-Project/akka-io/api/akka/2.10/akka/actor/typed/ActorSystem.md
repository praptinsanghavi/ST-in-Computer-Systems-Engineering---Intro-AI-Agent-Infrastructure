---
description: Akka 2.10.17 - akka.actor.typed.ActorSystem
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorSystem.html
title: Akka 2.10.17 - akka.actor.typed.ActorSystem
---

# Akka 2.10.17 - akka.actor.typed.ActorSystem

> **Summary:** Akka 2.10.17 - akka.actor.typed.ActorSystem

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](eventstream/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](receptionist/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [AbstractExtensionSetup](AbstractExtensionSetup.html "Scala 2.11 API: Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")
- [ActorRef](ActorRef.html "An ActorRef is the identity or address of an Actor instance.")
- [ActorRefResolver](ActorRefResolver.html "Serialization and deserialization of ActorRef.")
- [ActorRefResolverSetup](ActorRefResolverSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ActorRefResolver extension.")
- ActorSystem
- [ActorTags](ActorTags.html "Actor tags are used to logically group actors.")
- [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "Not for user extension")
- [Behavior](Behavior.html "The behavior of an actor defines how it reacts to the messages that it receives.")
- [BehaviorInterceptor](BehaviorInterceptor.html "A behavior interceptor allows for intercepting message and signal reception and perform arbitrary logic - transform, filter, send to a side channel etc.")
- [BehaviorSignalInterceptor](BehaviorSignalInterceptor.html "A behavior interceptor allows for intercepting signals reception and perform arbitrary logic - transform, filter, send to a side channel etc.")
- [ChildFailed](ChildFailed.html "Child has failed due an uncaught exception")
- [DeathPactException](DeathPactException.html "Exception that an actor fails with if it does not handle a Terminated message.")
- [DispatcherSelector](DispatcherSelector.html "Not for user extension.")
- [Dispatchers](Dispatchers.html "An ActorSystem looks up all its thread pools via a Dispatchers instance.")
- [ExtensibleBehavior](ExtensibleBehavior.html "Extension point for implementing custom behaviors in addition to the existing set of behaviors available through the DSLs in akka.actor.typed.scaladsl.Behaviors and akka.actor.typed.javadsl.Behaviors")
- [Extension](Extension.html "Marker trait/interface for extensions.")
- [ExtensionId](ExtensionId.html "Identifier and factory for an extension.")
- [ExtensionSetup](ExtensionSetup.html "Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")
- [Extensions](Extensions.html "API for registering and looking up extensions.")
- [LogOptions](LogOptions.html "Logging options when using Behaviors.logMessages.")
- [MailboxSelector](MailboxSelector.html "Not for user extension.")
- [MessageAdaptionFailure](MessageAdaptionFailure.html "Signal passed to the actor when a message adapter has thrown an exception adapting an incoming message.")
- [PostStop](PostStop.html "Lifecycle signal that is fired after this actor and all its child actors (transitively) have terminated.")
- [PreRestart](PreRestart.html "Lifecycle signal that is fired upon restart of the Actor before replacing the behavior with the fresh one (i.e.")
- [Props](Props.html "Data structure for describing an actor’s props details like which executor to run it on.")
- [RecipientRef](RecipientRef.html "FIXME doc - not serializable - not watchable")
- [RestartSupervisorStrategy](RestartSupervisorStrategy.html "Not for user extension")
- [Scheduler](Scheduler.html "The ActorSystem facility for scheduling tasks.")
- [Settings](Settings.html "The configuration settings that were parsed from the config by an ActorSystem.")
- [Signal](Signal.html "System signals are notifications that are generated by the system and delivered to the Actor behavior in a reliable fashion (i.e.")
- [SpawnProtocol](SpawnProtocol$.html "A message protocol for actors that support spawning a child actor when receiving a SpawnProtocol#Spawn message and sending back the ActorRef of the child actor.")
- [SupervisorStrategy](SupervisorStrategy.html "Not for user extension")
- [Terminated](Terminated.html "Lifecycle signal that is fired when an Actor that was watched has terminated.")
- [TypedActorContext](TypedActorContext.html "This trait is not meant to be extended by user code.")
[c](ActorSystem$.html "See companion object")[akka](../../index.html).[actor](../index.html).[typed](index.html)

# [ActorSystem](ActorSystem$.html "See companion object")[**](../../../akka/actor/typed/ActorSystem.html "Permalink")

### Companion [object ActorSystem](ActorSystem$.html "See companion object")

#### abstract  class ActorSystem\[\-T] extends [ActorRef](ActorRef.html)\[T] with [Extensions](Extensions.html) with [ClassicActorSystemProvider](../ClassicActorSystemProvider.html)

An ActorSystem is home to a hierarchy of Actors. It is created using
[ActorSystem\#apply](ActorSystem$.html#apply[T](guardianBehavior:akka.actor.typed.Behavior[T],name:String,bootstrapSetup:akka.actor.BootstrapSetup):akka.actor.typed.ActorSystem[T]) from a [Behavior](Behavior.html) object that describes the root
Actor of this hierarchy and which will create all other Actors beneath it.
A system also implements the [ActorRef](ActorRef.html) type, and sending a message to
the system directs that message to the root Actor.

Not for user extension.

Self TypeActorSystem\[T] with InternalRecipientRef\[T]Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[ActorSystem.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/ActorSystem.scala#L36)Linear Supertypes[ClassicActorSystemProvider](../ClassicActorSystemProvider.html), [Extensions](Extensions.html), [ActorRef](ActorRef.html)\[T], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorRef](ActorRef.html)\[\_]], [RecipientRef](RecipientRef.html)\[T], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorSystem
2. ClassicActorSystemProvider
3. Extensions
4. ActorRef
5. Serializable
6. Comparable
7. RecipientRef
8. AnyRef
9. Any
Implicitly  
1. by ActorRefOps
2. by RecipientRefOps
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/actor/typed/ActorSystem.html#<init>():akka.actor.typed.ActorSystem[T] "Permalink")  new ActorSystem()
### Abstract Value Members

1. [**](../../../akka/actor/typed/ActorSystem.html#address:akka.actor.Address "Permalink") abstract  def address: [Address](../Address.html)Obtains the external address of the default transport.

Obtains the external address of the default transport.

Consider differences in clustered and non\-clustered ActorSystems.
For a non\-clustered ActorSystem, this will return an address without host and port.
For a clustered ActorSystem, this will return the address that other nodes can use to
communicate with this node.
2. [**](../../../akka/actor/typed/ActorSystem.html#classicSystem:akka.actor.ActorSystem "Permalink") abstract  def classicSystem: [actor.ActorSystem](../ActorSystem.html)Allows access to the classic `akka.actor.ActorSystem` even for `akka.actor.typed.ActorSystem[_]`s.

Allows access to the classic `akka.actor.ActorSystem` even for `akka.actor.typed.ActorSystem[_]`s.

Definition Classes[ClassicActorSystemProvider](../ClassicActorSystemProvider.html)
3. [**](../../../akka/actor/typed/ActorSystem.html#compareTo(x$1:T):Int "Permalink") abstract  def compareTo(arg0: [ActorRef](ActorRef.html)\[\_]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesComparable
4. [**](../../../akka/actor/typed/ActorSystem.html#deadLetters[U]:akka.actor.typed.ActorRef[U] "Permalink") abstract  def deadLetters\[U]: [ActorRef](ActorRef.html)\[U]The deadLetter address is a destination that will accept (and discard)
every message sent to it.
5. [**](../../../akka/actor/typed/ActorSystem.html#dispatchers:akka.actor.typed.Dispatchers "Permalink") abstract  def dispatchers: [Dispatchers](Dispatchers.html)Facilities for lookup up thread\-pools from configuration.
6. [**](../../../akka/actor/typed/ActorSystem.html#dynamicAccess:akka.actor.DynamicAccess "Permalink") abstract  def dynamicAccess: [DynamicAccess](../DynamicAccess.html)ClassLoader wrapper which is used for reflective accesses internally.

ClassLoader wrapper which is used for reflective accesses internally. This is set
to use the context class loader, if one is set, or the class loader which
loaded the ActorSystem implementation. The context class loader is also
set on all threads created by the ActorSystem, if one was set during
creation.
7. [**](../../../akka/actor/typed/ActorSystem.html#executionContext:scala.concurrent.ExecutionContextExecutor "Permalink") implicit abstract  def executionContext: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)The default thread pool of this ActorSystem, configured with settings in `akka.actor.default-dispatcher`.
8. [**](../../../akka/actor/typed/ActorSystem.html#extension[T<:akka.actor.typed.Extension](ext:akka.actor.typed.ExtensionId[T]):T "Permalink") abstract  def extension\[T \<: [Extension](Extension.html)](ext: [ExtensionId](ExtensionId.html)\[T]): TReturns the payload that is associated with the provided extension
throws an IllegalStateException if it is not registered.

Returns the payload that is associated with the provided extension
throws an IllegalStateException if it is not registered.
This method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution

Definition Classes[Extensions](Extensions.html)
9. [**](../../../akka/actor/typed/ActorSystem.html#getLicenseKeyExpiry:java.util.Optional[java.time.LocalDate] "Permalink") abstract  def getLicenseKeyExpiry: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[LocalDate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDate.html#java.time.LocalDate)]Java API: When the license key will expire.

Java API: When the license key will expire. `Optional.empty` for perpetual keys.
If a license key is not defined the expiry date will be today's date.
10. [**](../../../akka/actor/typed/ActorSystem.html#getWhenTerminated:java.util.concurrent.CompletionStage[akka.Done] "Permalink") abstract  def getWhenTerminated: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../Done.html)]Java API: Returns a CompletionStage which will be completed after the ActorSystem has been terminated
and termination hooks have been executed.

Java API: Returns a CompletionStage which will be completed after the ActorSystem has been terminated
and termination hooks have been executed. The `ActorSystem` can be stopped with [ActorSystem.terminate](#terminate():Unit)
or by stopping the guardian actor.

Be careful to not schedule any operations, such as `thenRunAsync`, on the dispatchers (`Executor`) of this
actor system as they will have been shut down before this CompletionStage completes.
11. [**](../../../akka/actor/typed/ActorSystem.html#hasExtension(ext:akka.actor.typed.ExtensionId[_<:akka.actor.typed.Extension]):Boolean "Permalink") abstract  def hasExtension(ext: [ExtensionId](ExtensionId.html)\[\_ \<: [Extension](Extension.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution

Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution

Definition Classes[Extensions](Extensions.html)
12. [**](../../../akka/actor/typed/ActorSystem.html#ignoreRef[U]:akka.actor.typed.ActorRef[U] "Permalink") abstract  def ignoreRef\[U]: [ActorRef](ActorRef.html)\[U]An ActorRef that ignores any incoming messages.
13. [**](../../../akka/actor/typed/ActorSystem.html#licenseKeyExpiry:Option[java.time.LocalDate] "Permalink") abstract  def licenseKeyExpiry: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LocalDate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDate.html#java.time.LocalDate)]Scala API: When the license key will expire.

Scala API: When the license key will expire. `None` for perpetual keys.
If a license key is not defined the expiry date will be today's date.
14. [**](../../../akka/actor/typed/ActorSystem.html#log:org.slf4j.Logger "Permalink") abstract  def log: LoggerA org.slf4j.Logger that can be used to emit log messages
without specifying a more detailed source.

A org.slf4j.Logger that can be used to emit log messages
without specifying a more detailed source. Typically it is desirable to
use the dedicated `Logger` available from each Actor’s [TypedActorContext](TypedActorContext.html)
as that ties the log entries to the actor.
15. [**](../../../akka/actor/typed/ActorSystem.html#logConfiguration():Unit "Permalink") abstract  def logConfiguration(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log the configuration.
16. [**](../../../akka/actor/typed/ActorSystem.html#name:String "Permalink") abstract  def name: StringThe name of this actor system, used to distinguish multiple ones within
the same JVM \& class loader.
17. [**](../../../akka/actor/typed/ActorSystem.html#narrow[U<:T]:akka.actor.typed.ActorRef[U] "Permalink") abstract  def narrow\[U \<: T]: [ActorRef](ActorRef.html)\[U]Narrow the type of this `ActorRef`, which is always a safe operation.

Narrow the type of this `ActorRef`, which is always a safe operation.

Definition Classes[ActorRef](ActorRef.html)
18. [**](../../../akka/actor/typed/ActorSystem.html#path:akka.actor.ActorPath "Permalink") abstract  def path: [ActorPath](../ActorPath.html)The hierarchical path name of the referenced Actor.

The hierarchical path name of the referenced Actor. The lifecycle of the
ActorRef is fully contained within the lifecycle of the [akka.actor.ActorPath](../ActorPath.html)
and more than one Actor instance can exist with the same path at different
points in time, but not concurrently.

Definition Classes[ActorRef](ActorRef.html)
19. [**](../../../akka/actor/typed/ActorSystem.html#printTree:String "Permalink") abstract  def printTree: StringCreate a string representation of the actor hierarchy within this system
for debugging purposes.

Create a string representation of the actor hierarchy within this system
for debugging purposes.

The format of the string is subject to change, i.e. no stable “API”.
20. [**](../../../akka/actor/typed/ActorSystem.html#registerExtension[T<:akka.actor.typed.Extension](ext:akka.actor.typed.ExtensionId[T]):T "Permalink") abstract  def registerExtension\[T \<: [Extension](Extension.html)](ext: [ExtensionId](ExtensionId.html)\[T]): TRegisters the provided extension and creates its payload, if this extension isn't already registered
This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution

Registers the provided extension and creates its payload, if this extension isn't already registered
This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution

Definition Classes[Extensions](Extensions.html)
21. [**](../../../akka/actor/typed/ActorSystem.html#scheduler:akka.actor.typed.Scheduler "Permalink") abstract  def scheduler: [Scheduler](Scheduler.html)A generic scheduler that can initiate the execution of tasks after some delay.

A generic scheduler that can initiate the execution of tasks after some delay.
It is recommended to use the ActorContext’s scheduling capabilities for sending
messages to actors instead of registering a Runnable for execution using this facility.
22. [**](../../../akka/actor/typed/ActorSystem.html#settings:akka.actor.typed.Settings "Permalink") abstract  def settings: [Settings](Settings.html)The core settings extracted from the supplied configuration.
23. [**](../../../akka/actor/typed/ActorSystem.html#startTime:Long "Permalink") abstract  def startTime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Start\-up time in milliseconds since the epoch.
24. [**](../../../akka/actor/typed/ActorSystem.html#systemActorOf[U](behavior:akka.actor.typed.Behavior[U],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[U] "Permalink") abstract  def systemActorOf\[U](behavior: [Behavior](Behavior.html)\[U], name: String, props: [Props](Props.html) \= [Props.empty](Props$.html)): [ActorRef](ActorRef.html)\[U]Create an actor in the "/system" namespace.

Create an actor in the "/system" namespace. This actor will be shut down
during system.terminate only after all user actors have terminated.

This is only intended to be used by libraries (and Akka itself).
Applications should use ordinary `spawn`.
25. [**](../../../akka/actor/typed/ActorSystem.html#tell(msg:T):Unit "Permalink") abstract  def tell(msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.

Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.

Definition Classes[ActorRef](ActorRef.html) → [RecipientRef](RecipientRef.html)
26. [**](../../../akka/actor/typed/ActorSystem.html#terminate():Unit "Permalink") abstract  def terminate(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Terminates this actor system by running [akka.actor.CoordinatedShutdown](../CoordinatedShutdown.html) with reason
[akka.actor.CoordinatedShutdown.ActorSystemTerminateReason](../CoordinatedShutdown$$ActorSystemTerminateReason$.html).

Terminates this actor system by running [akka.actor.CoordinatedShutdown](../CoordinatedShutdown.html) with reason
[akka.actor.CoordinatedShutdown.ActorSystemTerminateReason](../CoordinatedShutdown$$ActorSystemTerminateReason$.html).

If `akka.coordinated-shutdown.run-by-actor-system-terminate` is configured to `off`
it will not run `CoordinatedShutdown`, but the `ActorSystem` and its actors
will still be terminated.

This will stop the guardian actor, which in turn
will recursively stop all its child actors, and finally the system guardian
(below which the logging actors reside).

This is an asynchronous operation and completion of the termination can
be observed with [ActorSystem.whenTerminated](#whenTerminated:scala.concurrent.Future[akka.Done]) or [ActorSystem.getWhenTerminated](#getWhenTerminated:java.util.concurrent.CompletionStage[akka.Done]).
27. [**](../../../akka/actor/typed/ActorSystem.html#threadFactory:java.util.concurrent.ThreadFactory "Permalink") abstract  def threadFactory: [ThreadFactory](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ThreadFactory.html#java.util.concurrent.ThreadFactory)A ThreadFactory that can be used if the transport needs to create any Threads
28. [**](../../../akka/actor/typed/ActorSystem.html#unsafeUpcast[U>:T@scala.annotation.unchecked.uncheckedVariance]:akka.actor.typed.ActorRef[U] "Permalink") abstract  def unsafeUpcast\[U \>: T]: [ActorRef](ActorRef.html)\[U]Unsafe utility method for widening the type accepted by this ActorRef;
provided to avoid having to use `asInstanceOf` on the full reference type,
which would unfortunately also work on non\-ActorRefs.

Unsafe utility method for widening the type accepted by this ActorRef;
provided to avoid having to use `asInstanceOf` on the full reference type,
which would unfortunately also work on non\-ActorRefs. Use it with caution,it may cause a ClassCastException when you send a message
to the widened ActorRef\[U].

Definition Classes[ActorRef](ActorRef.html)
29. [**](../../../akka/actor/typed/ActorSystem.html#uptime:Long "Permalink") abstract  def uptime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Up\-time of this actor system in seconds.
30. [**](../../../akka/actor/typed/ActorSystem.html#whenTerminated:scala.concurrent.Future[akka.Done] "Permalink") abstract  def whenTerminated: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../Done.html)]Scala API: Returns a Future which will be completed after the ActorSystem has been terminated.

Scala API: Returns a Future which will be completed after the ActorSystem has been terminated.
The `ActorSystem` can be stopped with [ActorSystem.terminate](#terminate():Unit)
or by stopping the guardian actor.

Be careful to not schedule any operations, such as `onComplete`, on the dispatchers (`ExecutionContext`)
of this actor system as they will have been shut down before this future completes.
### Concrete Value Members

1. [**](../../../akka/actor/typed/ActorSystem.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/ActorSystem.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/ActorSystem.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorSystem\[T] toany2stringadd\[ActorSystem\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/ActorSystem.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorSystem\[T], B)ImplicitThis member is added by an implicit conversion from ActorSystem\[T] toArrowAssoc\[ActorSystem\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/ActorSystem.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/typed/ActorSystem.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/typed/ActorSystem.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/actor/typed/ActorSystem.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorSystem\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorSystem\[T]ImplicitThis member is added by an implicit conversion from ActorSystem\[T] toEnsuring\[ActorSystem\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/typed/ActorSystem.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorSystem\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorSystem\[T]ImplicitThis member is added by an implicit conversion from ActorSystem\[T] toEnsuring\[ActorSystem\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/ActorSystem.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorSystem\[T]ImplicitThis member is added by an implicit conversion from ActorSystem\[T] toEnsuring\[ActorSystem\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/ActorSystem.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorSystem\[T]ImplicitThis member is added by an implicit conversion from ActorSystem\[T] toEnsuring\[ActorSystem\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/ActorSystem.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/actor/typed/ActorSystem.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/actor/typed/ActorSystem.html#eventStream:akka.actor.typed.ActorRef[akka.actor.typed.eventstream.EventStream.Command] "Permalink")  def eventStream: [ActorRef](ActorRef.html)\[[Command](eventstream/EventStream$$Command.html)]Main event bus of this actor system, used for example for logging.

Main event bus of this actor system, used for example for logging.
Accepts [akka.actor.typed.eventstream.EventStream.Command](eventstream/EventStream$$Command.html).
15. [**](../../../akka/actor/typed/ActorSystem.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/actor/typed/ActorSystem.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/actor/typed/ActorSystem.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/actor/typed/ActorSystem.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/actor/typed/ActorSystem.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/actor/typed/ActorSystem.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/actor/typed/ActorSystem.html#receptionist:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command] "Permalink")  def receptionist: [ActorRef](ActorRef.html)\[[Command](receptionist/Receptionist$$Command.html)]Return a reference to this system’s [akka.actor.typed.receptionist.Receptionist](receptionist/Receptionist.html).
22. [**](../../../akka/actor/typed/ActorSystem.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/actor/typed/ActorSystem.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/actor/typed/ActorSystem.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/actor/typed/ActorSystem.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/actor/typed/ActorSystem.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../akka/actor/typed/ActorSystem.html#!(msg:T):Unit "Permalink")  def !(msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.

Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.

ImplicitThis member is added by an implicit conversion from ActorSystem\[T] to[ActorRefOps](ActorRef$$ActorRefOps.html)\[T] performed by method ActorRefOps in [akka.actor.typed.ActorRef](ActorRef$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(actorSystem: ActorRefOps[T]).!(msg)
```
Definition Classes[ActorRefOps](ActorRef$$ActorRefOps.html)
2. [**](../../../akka/actor/typed/ActorSystem.html#!(msg:T):Unit "Permalink")  def !(msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

ImplicitThis member is added by an implicit conversion from ActorSystem\[T] to[RecipientRefOps](RecipientRef$$RecipientRefOps.html)\[T] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](RecipientRef$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(actorSystem: RecipientRefOps[T]).!(msg)
```
Definition Classes[RecipientRefOps](RecipientRef$$RecipientRefOps.html)
3. [**](../../../akka/actor/typed/ActorSystem.html#ref:akka.actor.typed.ActorRef[T] "Permalink")  val ref: [ActorRef](ActorRef.html)\[T]ImplicitThis member is added by an implicit conversion from ActorSystem\[T] to[ActorRefOps](ActorRef$$ActorRefOps.html)\[T] performed by method ActorRefOps in [akka.actor.typed.ActorRef](ActorRef$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(actorSystem: ActorRefOps[T]).ref
```
Definition Classes[ActorRefOps](ActorRef$$ActorRefOps.html)
4. [**](../../../akka/actor/typed/ActorSystem.html#ref:akka.actor.typed.RecipientRef[T] "Permalink")  val ref: [RecipientRef](RecipientRef.html)\[T]ImplicitThis member is added by an implicit conversion from ActorSystem\[T] to[RecipientRefOps](RecipientRef$$RecipientRefOps.html)\[T] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](RecipientRef$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(actorSystem: RecipientRefOps[T]).ref
```
Definition Classes[RecipientRefOps](RecipientRef$$RecipientRefOps.html)
### Deprecated Value Members

1. [**](../../../akka/actor/typed/ActorSystem.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/typed/ActorSystem.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorSystem\[T] toStringFormat\[ActorSystem\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/typed/ActorSystem.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorSystem\[T], B)ImplicitThis member is added by an implicit conversion from ActorSystem\[T] toArrowAssoc\[ActorSystem\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ClassicActorSystemProvider](../ClassicActorSystemProvider.html)

### Inherited from [Extensions](Extensions.html)

### Inherited from [ActorRef](ActorRef.html)\[T]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorRef](ActorRef.html)\[\_]]

### Inherited from [RecipientRef](RecipientRef.html)\[T]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion ActorRefOps fromActorSystem\[T] to [ActorRefOps](ActorRef$$ActorRefOps.html)\[T]

### Inherited by implicit conversion RecipientRefOps fromActorSystem\[T] to [RecipientRefOps](RecipientRef$$RecipientRefOps.html)\[T]

### Inherited by implicit conversion any2stringadd fromActorSystem\[T] to any2stringadd\[ActorSystem\[T]]

### Inherited by implicit conversion StringFormat fromActorSystem\[T] to StringFormat\[ActorSystem\[T]]

### Inherited by implicit conversion Ensuring fromActorSystem\[T] to Ensuring\[ActorSystem\[T]]

### Inherited by implicit conversion ArrowAssoc fromActorSystem\[T] to ArrowAssoc\[ActorSystem\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/Done.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/2.10/akka/actor/CoordinatedShutdown$$ActorSystemTerminateReason$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/api/akka/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef$$ActorRefOps.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRefResolverSetup$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorTags.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Extensions.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/LogOptions$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Props.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html](https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html)*
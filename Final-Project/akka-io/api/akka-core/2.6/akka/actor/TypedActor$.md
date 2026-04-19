---
description: Akka 2.6.21 - akka.actor.TypedActor
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:21:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/actor/TypedActor$.html
title: Akka 2.6.21 - akka.actor.TypedActor
---

# Akka 2.6.21 - akka.actor.TypedActor

> **Summary:** Akka 2.6.21 - akka.actor.TypedActor

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/dungeon/index.html "Permalink")  package [dungeon](dungeon/index.html)Definition Classes[actor](index.html)
- [**](../../akka/actor/setup/index.html "Permalink")  package [setup](setup/index.html)Definition Classes[actor](index.html)
- [**](../../akka/actor/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[actor](index.html)
- [**](../../akka/actor/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[actor](index.html)
- [AbstractActor](AbstractActor.html "Java API: compatible with lambda expressions")
- [AbstractActorWithStash](AbstractActorWithStash.html "Java API: compatible with lambda expressions")
- [AbstractActorWithTimers](AbstractActorWithTimers.html "Java API: Support for scheduled self messages via TimerScheduler.")
- [AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "Java API: compatible with lambda expressions")
- [AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html "Java API: compatible with lambda expressions")
- [AbstractExtensionId](AbstractExtensionId.html "Java API for ExtensionId")
- [AbstractFSM](AbstractFSM.html "Java API: compatible with lambda expressions")
- [AbstractFSMWithStash](AbstractFSMWithStash.html "Java API: compatible with lambda expressions")
- [AbstractLoggingActor](AbstractLoggingActor.html "Java API: compatible with lambda expressions")
- [AbstractLoggingFSM](AbstractLoggingFSM.html "Java API: compatible with lambda expressions")
- [AbstractScheduler](AbstractScheduler.html "An Akka scheduler service.")
- [AbstractSchedulerBase](AbstractSchedulerBase.html)
- [Actor](Actor.html "Actor base trait that should be extended by or mixed to create an Actor with the semantics of the 'Actor Model': https://en.wikipedia.org/wiki/Actor_model")
- [ActorContext](ActorContext.html "The actor context - the view of the actor cell from the actor.")
- [ActorIdentity](ActorIdentity.html "Reply to akka.actor.Identify.")
- [ActorInitializationException](ActorInitializationException.html "An ActorInitializationException is thrown when the initialization logic for an Actor fails.")
- [ActorInterruptedException](ActorInterruptedException.html "When an InterruptedException is thrown inside an Actor, it is wrapped as an ActorInterruptedException as to avoid cascading interrupts to other threads than the originally interrupted one.")
- [ActorKilledException](ActorKilledException.html "ActorKilledException is thrown when an Actor receives the akka.actor.Kill message")
- [ActorLogMarker](ActorLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [ActorLogging](ActorLogging.html "Scala API: Mix in ActorLogging into your Actor to easily obtain a reference to a logger, which is available under the name \"log\".")
- [ActorNotFound](ActorNotFound.html "When ActorSelection#resolveOne can't identify the actor the Future is completed with this failure.")
- [ActorPath](ActorPath.html "Actor path is a unique path to an actor that shows the creation path up through the actor tree to the root actor.")
- [ActorPathExtractor](ActorPathExtractor$.html "Given an ActorPath it returns the Address and the path elements if the path is well-formed")
- [ActorPaths](ActorPaths$.html "Java API")
- [ActorRef](ActorRef.html "Immutable and serializable handle to an actor, which may or may not reside on the local host or inside the same akka.actor.ActorSystem.")
- [ActorRefFactory](ActorRefFactory.html "Interface implemented by ActorSystem and ActorContext, the only two places from which you can get fresh actors.")
- [ActorRefProvider](ActorRefProvider.html "Interface for all ActorRef providers to implement.")
- [ActorSelection](ActorSelection.html "An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors, allowing for broadcasting of messages to that section.")
- [ActorSystem](ActorSystem.html "An actor system is a hierarchical group of actors which share common configuration, e.g.")
- [Address](Address.html "The address specifies the physical location under which an Actor can be reached.")
- [AddressFromURIString](AddressFromURIString$.html "This object serves as extractor for Scala and as address parser for Java.")
- [AllDeadLetters](AllDeadLetters.html "Subscribe to this class to be notified about all DeadLetter (also the suppressed ones) and Dropped.")
- [AllForOneStrategy](AllForOneStrategy.html "Applies the fault handling Directive (Resume, Restart, Stop) specified in the Decider to all children when one fails, as opposed to akka.actor.OneForOneStrategy that applies it only to the child actor that failed.")
- [BootstrapSetup](BootstrapSetup.html "Core bootstrap settings of the actor system, create using one of the factories in BootstrapSetup, constructor is *Internal API*.")
- [Cancellable](Cancellable.html "Signifies something that can be cancelled There is no strict guarantee that the implementation is thread-safe, but it should be good practice to make it so.")
- [ChildActorPath](ChildActorPath.html)
- [ChildRestartStats](ChildRestartStats.html "ChildRestartStats is the statistics kept by every parent Actor for every child Actor and is used for SupervisorStrategies to know how to deal with problems that occur for the children.")
- [ClassicActorContextProvider](ClassicActorContextProvider.html "Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.")
- [ClassicActorSystemProvider](ClassicActorSystemProvider.html "Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.")
- [ContextualTypedActorFactory](ContextualTypedActorFactory.html "ContextualTypedActorFactory allows TypedActors to create children, effectively forming the same Actor Supervision Hierarchies as normal Actors can.")
- [CoordinatedShutdown](CoordinatedShutdown.html)
- [DeadLetter](DeadLetter.html "When a message is sent to an Actor that is terminated before receiving the message, it will be sent as a DeadLetter to the ActorSystem's EventStream.")
- [DeadLetterSuppression](DeadLetterSuppression.html "Use with caution: Messages extending this trait will not be logged by the default dead-letters listener.")
- [DeathPactException](DeathPactException.html "A DeathPactException is thrown by an Actor that receives a Terminated(someActor) message that it doesn't handle itself, effectively crashing the Actor and escalating to the supervisor.")
- [DefaultSupervisorStrategy](DefaultSupervisorStrategy.html)
- [Deploy](Deploy.html "This class represents deployment configuration for a given actor path.")
- [DiagnosticActorLogging](DiagnosticActorLogging.html "Scala API: Mix in DiagnosticActorLogging into your Actor to easily obtain a reference to a logger with MDC support, which is available under the name \"log\".")
- [Dropped](Dropped.html "Envelope that is published on the eventStream wrapped in akka.actor.DeadLetter for every message that is dropped due to overfull queues or routers with no routees.")
- [DynamicAccess](DynamicAccess.html "The DynamicAccess implementation is the class which is used for loading all configurable parts of an actor system (the akka.actor.ReflectiveDynamicAccess is the default implementation).")
- [ExtendedActorSystem](ExtendedActorSystem.html "More powerful interface to the actor system’s implementation which is presented to extensions (see akka.actor.Extension).")
- [Extension](Extension.html "The basic ActorSystem covers all that is needed for locally running actors, using futures and so on.")
- [ExtensionId](ExtensionId.html "Identifies an Extension Lookup of Extensions is done by object identity, so the Id must be the same wherever it's used, otherwise you'll get the same extension loaded multiple times.")
- [ExtensionIdProvider](ExtensionIdProvider.html "To be able to load an ExtensionId from the configuration, a class that implements ExtensionIdProvider must be specified.")
- [FSM](FSM.html "Finite State Machine actor trait.")
- [Identify](Identify.html "A message all Actors will understand, that when processed will reply with akka.actor.ActorIdentity containing the ActorRef.")
- [IllegalActorStateException](IllegalActorStateException.html "IllegalActorStateException is thrown when a core invariant in the Actor implementation has been violated.")
- [IndirectActorProducer](IndirectActorProducer.html "This interface defines a class of actor creation strategies deviating from the usual default of just reflectively instantiating the Actor subclass.")
- [InvalidActorNameException](InvalidActorNameException.html "An InvalidActorNameException is thrown when you try to convert something, usually a String, to an Actor name which doesn't validate.")
- [InvalidMessageException](InvalidMessageException.html "InvalidMessageException is thrown when an invalid message is sent to an Actor; Currently only null is an invalid message.")
- [Kill](Kill.html)
- [LightArrayRevolverScheduler](LightArrayRevolverScheduler.html "This scheduler implementation is based on a revolving wheel of buckets, like Netty’s HashedWheelTimer, which it advances at a fixed tick rate and dispatches tasks it finds in the current bucket to their respective ExecutionContexts.")
- [LocalScope](LocalScope.html)
- [LoggingFSM](LoggingFSM.html "Stackable trait for akka.actor.FSM which adds a rolling event log and debug logging capabilities (analogous to akka.event.LoggingReceive).")
- [NoScopeGiven](NoScopeGiven.html "This is the default value and as such allows overrides.")
- [NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html "Marker trait to signal that this class should not be verified for serializability.")
- [NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html "Marker trait to indicate that a message should not reset the receive timeout.")
- [OneForOneStrategy](OneForOneStrategy.html "Applies the fault handling Directive (Resume, Restart, Stop) specified in the Decider to the child actor that failed, as opposed to akka.actor.AllForOneStrategy that applies it to all children.")
- [OriginalRestartException](OriginalRestartException$.html "This is an extractor for retrieving the original cause (i.e.")
- [PoisonPill](PoisonPill.html)
- [PossiblyHarmful](PossiblyHarmful.html "Marker trait to indicate that a message might be potentially harmful, this is used to block messages coming in over remoting.")
- [PostRestartException](PostRestartException.html "A PostRestartException is thrown when constructor or postRestart() method fails during a restart attempt.")
- [PreRestartException](PreRestartException.html "A PreRestartException is thrown when the preRestart() method failed; this exception is not propagated to the supervisor, as it originates from the already failed instance, hence it is only visible as log entry on the event stream.")
- [Props](Props.html "Props is a configuration object using in creating an Actor; it is immutable, so it is thread-safe and fully shareable.")
- [ProviderSelection](ProviderSelection.html)
- [ReceiveTimeout](ReceiveTimeout.html)
- [ReflectiveDynamicAccess](ReflectiveDynamicAccess.html "This is the default akka.actor.DynamicAccess implementation used by akka.actor.ExtendedActorSystem unless overridden.")
- [RelativeActorPath](RelativeActorPath$.html "Extractor for so-called “relative actor paths” as in “relative URI”, not in “relative to some actor”.")
- [RootActorPath](RootActorPath.html "Root of the hierarchy of ActorPaths.")
- [ScalaActorRef](ScalaActorRef.html "This trait represents the Scala Actor API There are implicit conversions in package.scala from ActorRef -> ScalaActorRef and back")
- [ScalaActorSelection](ScalaActorSelection.html "Contains the Scala API (!-method) for ActorSelections) which provides automatic tracking of the sender, as per the usual implicit ActorRef pattern.")
- [Scheduler](Scheduler.html "An Akka scheduler service.")
- [Scope](Scope.html "The scope of a akka.actor.Deploy serves two purposes: as a marker for pattern matching the “scope” (i.e.")
- [Stash](Stash.html "The Stash trait enables an actor to temporarily stash away messages that can not or should not be handled using the actor's current behavior.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the Stash exceeds the capacity of the Stash")
- [Status](Status$.html "Superseeded by akka.pattern.StatusReply, prefer that when possible.")
- [StoppingSupervisorStrategy](StoppingSupervisorStrategy.html)
- [SupervisorStrategy](SupervisorStrategy.html "An Akka SupervisorStrategy is the policy to apply for crashing children.")
- [SupervisorStrategyConfigurator](SupervisorStrategyConfigurator.html "Implement this interface in order to configure the supervisorStrategy for the top-level guardian actor (/user).")
- [SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html)
- [SuppressedDeadLetter](SuppressedDeadLetter.html "Similar to DeadLetter with the slight twist of NOT being logged by the default dead letters listener.")
- [Terminated](Terminated.html "When Death Watch is used, the watcher will receive a Terminated(watched) message when watched is terminated.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
- [Timers](Timers.html "Scala API: Mix in Timers into your Actor to get support for scheduled self messages via TimerScheduler.")
- TypedActor
- [TypedActorExtension](TypedActorExtension.html)
- [TypedActorFactory](TypedActorFactory.html "A TypedActorFactory is something that can created TypedActor instances.")
- [TypedProps](TypedProps.html "TypedProps is a TypedActor configuration object, that is thread safe and fully sharable.")
- [UnboundedStash](UnboundedStash.html "The UnboundedStash trait is a version of akka.actor.Stash that enforces an unbounded stash for you actor.")
- [UnhandledMessage](UnhandledMessage.html "This message is published to the EventStream whenever an Actor receives a message it doesn't understand")
- [UnrestrictedStash](UnrestrictedStash.html "A version of akka.actor.Stash that does not enforce any mailbox type.")
- [UntypedAbstractActor](UntypedAbstractActor.html "If the validation of the ReceiveBuilder match logic turns out to be a bottleneck for some of your actors you can consider to implement it at lower level by extending UntypedAbstractActor instead of AbstractActor.")
- [WrappedMessage](WrappedMessage.html "Message envelopes may implement this trait for better logging, such as logging of message class name of the wrapped message instead of the envelope class name.")
o[akka](../index.html).[actor](index.html)

# TypedActor[**](../../akka/actor/TypedActor$.html "Permalink")

### 

#### object TypedActor extends [ExtensionId](ExtensionId.html)\[[TypedActorExtension](TypedActorExtension.html)] with [ExtensionIdProvider](ExtensionIdProvider.html)

This represents the TypedActor Akka Extension, access to the functionality is done through a given ActorSystem.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'akka.actor.typed' API.

Source[TypedActor.scala](https://github.com/akka/akka/tree/v2.6.21//akka-actor/src/main/scala/akka/actor/TypedActor.scala#L109)Linear Supertypes[ExtensionIdProvider](ExtensionIdProvider.html), [ExtensionId](ExtensionId.html)\[[TypedActorExtension](TypedActorExtension.html)], [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TypedActor
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/actor/TypedActor$$MethodCall.html "Permalink") final  case class [MethodCall](TypedActor$$MethodCall.html "This class represents a Method call, and has a reference to the Method to be called and the parameters to supply It's sent to the ActorRef backing the TypedActor and can be serialized and deserialized")(method: [Method](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Method.html#java.lang.reflect.Method), parameters: [Array](https://www.scala-lang.org/api/2.13.8/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]) extends [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableThis class represents a Method call, and has a reference to the Method to be called and the parameters to supply
It's sent to the ActorRef backing the TypedActor and can be serialized and deserialized
2. [**](../../akka/actor/TypedActor$$PostRestart.html "Permalink")  trait [PostRestart](TypedActor$$PostRestart.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)
3. [**](../../akka/actor/TypedActor$$PostStop.html "Permalink")  trait [PostStop](TypedActor$$PostStop.html "Mix this into your TypedActor to be able to hook into its lifecycle") extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Mix this into your TypedActor to be able to hook into its lifecycle
4. [**](../../akka/actor/TypedActor$$PreRestart.html "Permalink")  trait [PreRestart](TypedActor$$PreRestart.html "Mix this into your TypedActor to be able to hook into its lifecycle") extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Mix this into your TypedActor to be able to hook into its lifecycle
5. [**](../../akka/actor/TypedActor$$PreStart.html "Permalink")  trait [PreStart](TypedActor$$PreStart.html "Mix this into your TypedActor to be able to hook into its lifecycle") extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Mix this into your TypedActor to be able to hook into its lifecycle
6. [**](../../akka/actor/TypedActor$$Receiver.html "Permalink")  trait [Receiver](TypedActor$$Receiver.html "Mix this into your TypedActor to be able to intercept Terminated messages") extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Mix this into your TypedActor to be able to intercept Terminated messages
7. [**](../../akka/actor/TypedActor$$Supervisor.html "Permalink")  trait [Supervisor](TypedActor$$Supervisor.html "Mix this into your TypedActor to be able to define supervisor strategy") extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Mix this into your TypedActor to be able to define supervisor strategy
### Value Members

1. [**](../../akka/actor/TypedActor$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/TypedActor$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/TypedActor$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/actor/TypedActor$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](ClassicActorSystemProvider.html)): [TypedActorExtension](TypedActorExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](ExtensionId.html)
5. [**](../../akka/actor/TypedActor$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](ActorSystem.html)): [TypedActorExtension](TypedActorExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](ExtensionId.html)
6. [**](../../akka/actor/TypedActor$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/TypedActor$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../akka/actor/TypedActor$.html#context:akka.actor.ActorContext "Permalink")  def context: [ActorContext](ActorContext.html)Returns the ActorContext (for a TypedActor) when inside a method call in a TypedActor.
9. [**](../../akka/actor/TypedActor$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.actor.TypedActorExtension "Permalink")  def createExtension(system: [ExtendedActorSystem](ExtendedActorSystem.html)): [TypedActorExtension](TypedActorExtension.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesTypedActor → [ExtensionId](ExtensionId.html)
10. [**](../../akka/actor/TypedActor$.html#dispatcher:scala.concurrent.ExecutionContextExecutor "Permalink") implicit  def dispatcher: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.8/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)Returns the default dispatcher (for a TypedActor) when inside a method call in a TypedActor.
11. [**](../../akka/actor/TypedActor$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/actor/TypedActor$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](ExtensionId.html) → AnyRef → Any
13. [**](../../akka/actor/TypedActor$.html#get(context:akka.actor.ActorContext):akka.actor.TypedActorFactory "Permalink")  def get(context: [ActorContext](ActorContext.html)): [TypedActorFactory](TypedActorFactory.html)Returns a contextual TypedActorFactory of this extension, this means that any TypedActors created by this TypedActorExtension
will be children to the specified context, this allows for creating hierarchies of TypedActors.

Returns a contextual TypedActorFactory of this extension, this means that any TypedActors created by this TypedActorExtension
will be children to the specified context, this allows for creating hierarchies of TypedActors.
Do \_not\_ let this instance escape the TypedActor since that will not be thread\-safe.

Java API

Annotations@nowarn()
14. [**](../../akka/actor/TypedActor$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.actor.TypedActorExtension "Permalink")  def get(system: [ClassicActorSystemProvider](ClassicActorSystemProvider.html)): [TypedActorExtension](TypedActorExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesTypedActor → [ExtensionId](ExtensionId.html)
15. [**](../../akka/actor/TypedActor$.html#get(system:akka.actor.ActorSystem):akka.actor.TypedActorExtension "Permalink")  def get(system: [ActorSystem](ActorSystem.html)): [TypedActorExtension](TypedActorExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesTypedActor → [ExtensionId](ExtensionId.html)
16. [**](../../akka/actor/TypedActor$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
17. [**](../../akka/actor/TypedActor$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition Classes[ExtensionId](ExtensionId.html) → AnyRef → Any
18. [**](../../akka/actor/TypedActor$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/actor/TypedActor$.html#lookup:akka.actor.TypedActor.type "Permalink")  def lookup: TypedActorReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesTypedActor → [ExtensionIdProvider](ExtensionIdProvider.html)
20. [**](../../akka/actor/TypedActor$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/actor/TypedActor$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
22. [**](../../akka/actor/TypedActor$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
23. [**](../../akka/actor/TypedActor$.html#self[T<:AnyRef]:T "Permalink")  def self\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]: TReturns the reference to the proxy when called inside a method call in a TypedActor

Returns the reference to the proxy when called inside a method call in a TypedActor

Example:

class FooImpl extends Foo {
 def doFoo {
 val myself \= TypedActor.self\[Foo]
 }
}

Useful when you want to send a reference to this TypedActor to someone else.

NEVER EXPOSE "this" to someone else, always use "self\[TypeOfInterface(s)]"

Throws IllegalStateException if called outside of the scope of a method on this TypedActor.

Throws ClassCastException if the supplied type T isn't the type of the proxy associated with this TypedActor.
24. [**](../../akka/actor/TypedActor$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/actor/TypedActor$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/actor/TypedActor$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/actor/TypedActor$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/actor/TypedActor$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/TypedActor$.html#apply(context:akka.actor.ActorContext):akka.actor.TypedActorFactory "Permalink")  def apply(context: [ActorContext](ActorContext.html)): [TypedActorFactory](TypedActorFactory.html)Returns a contextual TypedActorFactory of this extension, this means that any TypedActors created by this TypedActorExtension
will be children to the specified context, this allows for creating hierarchies of TypedActors.

Returns a contextual TypedActorFactory of this extension, this means that any TypedActors created by this TypedActorExtension
will be children to the specified context, this allows for creating hierarchies of TypedActors.
Do \_not\_ let this instance escape the TypedActor since that will not be thread\-safe.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'akka.actor.typed' API.
2. [**](../../akka/actor/TypedActor$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
### Inherited from [ExtensionIdProvider](ExtensionIdProvider.html)

### Inherited from [ExtensionId](ExtensionId.html)\[[TypedActorExtension](TypedActorExtension.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractFSM$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractScheduler.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorInitializationException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorNotFound.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorPath$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorPaths$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSelection$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Address$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AddressFromURIString$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AllDeadLetters.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/BootstrapSetup$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/BootstrapSetup.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Cancellable$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ChildActorPath.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ChildRestartStats.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ClassicActorSystemProvider.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/actor/TypedActor$.html](https://doc.akka.io/api/akka-core/2.6/akka/actor/TypedActor$.html)*
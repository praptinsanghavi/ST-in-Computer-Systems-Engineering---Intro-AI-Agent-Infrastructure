---
description: Akka 2.10.11 - akka.actor.Actor
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:13:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/Actor.html
title: Akka 2.10.11 - akka.actor.Actor
---

# Akka 2.10.11 - akka.actor.Actor

> **Summary:** Akka 2.10.11 - akka.actor.Actor

## Content

Akka2\.10\.11 \< Back****# Packages

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
- Actor
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
- [ChildActorPath](ChildActorPath.html "Not for user instantiation")
- [ChildRestartStats](ChildRestartStats.html "ChildRestartStats is the statistics kept by every parent Actor for every child Actor and is used for SupervisorStrategies to know how to deal with problems that occur for the children.")
- [ClassicActorContextProvider](ClassicActorContextProvider.html "Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.")
- [ClassicActorSystemProvider](ClassicActorSystemProvider.html "Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.")
- [CoordinatedShutdown](CoordinatedShutdown.html "Not for user instantiation, use the extension to access")
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
- [UnboundedStash](UnboundedStash.html "The UnboundedStash trait is a version of akka.actor.Stash that enforces an unbounded stash for you actor.")
- [UnhandledMessage](UnhandledMessage.html "This message is published to the EventStream whenever an Actor receives a message it doesn't understand")
- [UnrestrictedStash](UnrestrictedStash.html "A version of akka.actor.Stash that does not enforce any mailbox type.")
- [UntypedAbstractActor](UntypedAbstractActor.html "If the validation of the ReceiveBuilder match logic turns out to be a bottleneck for some of your actors you can consider to implement it at lower level by extending UntypedAbstractActor instead of AbstractActor.")
- [WrappedMessage](WrappedMessage.html "Message envelopes may implement this trait for better logging, such as logging of message class name of the wrapped message instead of the envelope class name.")
[t](Actor$.html "See companion object")[akka](../index.html).[actor](index.html)

# [Actor](Actor$.html "See companion object")[**](../../akka/actor/Actor.html "Permalink")

### Companion [object Actor](Actor$.html "See companion object")

#### trait Actor extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Actor base trait that should be extended by or mixed to create an Actor with the semantics of the 'Actor Model':
<https://en.wikipedia.org/wiki/Actor_model>

An actor has a well\-defined (non\-cyclic) life\-cycle.

- *RUNNING* (created and started actor) \- can receive messages
- *SHUTDOWN* (when 'stop' is invoked) \- can't do anything

The Actor's own [akka.actor.ActorRef](ActorRef.html) is available as `self`, the current
message’s sender as `sender()` and the [akka.actor.ActorContext](ActorContext.html) as
`context`. The only abstract method is `receive` which shall return the
initial behavior of the actor as a partial function (behavior can be changed
using `context.become` and `context.unbecome`).

This is the Scala API (hence the Scala code below), for the Java API see [akka.actor.AbstractActor](AbstractActor.html).

```
class ExampleActor extends Actor {

  override val supervisorStrategy = OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
    case _: ArithmeticException      => Resume
    case _: NullPointerException     => Restart
    case _: IllegalArgumentException => Stop
    case _: Exception                => Escalate
  }

  def receive = {
                                     // directly calculated reply
    case Request(r)               => sender() ! calculate(r)

                                     // just to demonstrate how to stop yourself
    case Shutdown                 => context.stop(self)

                                     // error kernel with child replying directly to 'sender()'
    case Dangerous(r)             => context.actorOf(Props[ReplyToOriginWorker]).tell(PerformWork(r), sender())

                                     // error kernel with reply going through us
    case OtherJob(r)              => context.actorOf(Props[ReplyToMeWorker]) ! JobRequest(r, sender())
    case JobReply(result, orig_s) => orig_s ! result
  }
}
```
The last line demonstrates the essence of the error kernel design: spawn
one\-off actors which terminate after doing their job, pass on `sender()` to
allow direct reply if that is what makes sense, or round\-trip the sender
as shown with the fictitious JobRequest/JobReply message pair.

If you don’t like writing `context` you can always `import context._` to get
direct access to `actorOf`, `stop` etc. This is not default in order to keep
the name\-space clean.

Source[Actor.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/actor/Actor.scala#L476)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AbstractActor](AbstractActor.html), [AbstractActorWithStash](AbstractActorWithStash.html), [AbstractActorWithTimers](AbstractActorWithTimers.html), [AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html), [AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html), [AbstractFSM](AbstractFSM.html), [AbstractFSMWithStash](AbstractFSMWithStash.html), [AbstractLoggingActor](AbstractLoggingActor.html), [AbstractLoggingFSM](AbstractLoggingFSM.html), [DiagnosticActorLogging](DiagnosticActorLogging.html), [FSM](FSM.html), [LoggingFSM](LoggingFSM.html), [Stash](Stash.html), [Timers](Timers.html), [UnboundedStash](UnboundedStash.html), [UnrestrictedStash](UnrestrictedStash.html), [UntypedAbstractActor](UntypedAbstractActor.html), [LmdbDurableStore](../cluster/ddata/LmdbDurableStore.html), [Replicator](../cluster/ddata/Replicator.html), [DistributedPubSubMediator](../cluster/pubsub/DistributedPubSubMediator.html), [RemoveInternalClusterShardingData](../cluster/sharding/RemoveInternalClusterShardingData.html), [ShardCoordinator](../cluster/sharding/ShardCoordinator.html), [ClusterSingletonManager](../cluster/singleton/ClusterSingletonManager.html), [ClusterSingletonProxy](../cluster/singleton/ClusterSingletonProxy.html), [ActorClassificationUnsubscriber](../event/ActorClassificationUnsubscriber.html), [DeadLetterListener](../event/DeadLetterListener.html), [EventStreamUnsubscriber](../event/EventStreamUnsubscriber.html), [DefaultLogger](../event/Logging$$DefaultLogger.html), [Slf4jLogger](../event/slf4j/Slf4jLogger.html), [InetAddressDnsResolver](../io/InetAddressDnsResolver.html), [SimpleDnsManager](../io/SimpleDnsManager.html), [AbstractPersistentActor](../persistence/AbstractPersistentActor.html), [AbstractPersistentActorWithAtLeastOnceDelivery](../persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html), [AbstractPersistentActorWithTimers](../persistence/AbstractPersistentActorWithTimers.html), [PersistenceStash](../persistence/PersistenceStash.html), [Snapshotter](../persistence/Snapshotter.html), [AsyncWriteJournal](../persistence/journal/AsyncWriteJournal.html), [PersistencePluginProxy](../persistence/journal/PersistencePluginProxy.html), [AsyncWriteJournal](../persistence/journal/japi/AsyncWriteJournal.html), [NoSnapshotStore](../persistence/snapshot/NoSnapshotStore.html), [SnapshotStore](../persistence/snapshot/SnapshotStore.html), [SnapshotStore](../persistence/snapshot/japi/SnapshotStore.html), [PersistenceTestKitPlugin](../persistence/testkit/PersistenceTestKitPlugin.html), [PersistenceTestKitSnapshotPlugin](../persistence/testkit/PersistenceTestKitSnapshotPlugin.html), [Waiter](../remote/testconductor/Player$$Waiter.html), [TestActor](../testkit/TestActor.html), [BlackholeActor](../testkit/TestActors$$BlackholeActor.html), [EchoActor](../testkit/TestActors$$EchoActor.html), [ForwardActor](../testkit/TestActors$$ForwardActor.html), [TestEventListener](../testkit/TestEventListener.html), [PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html), [JavaLogger](../event/jul/JavaLogger.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Actor
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/actor/Actor.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
### Abstract Value Members

1. [**](../../akka/actor/Actor.html#receive:akka.actor.Actor.Receive "Permalink") abstract  def receive: [Actor.Receive](Actor$.html#Receive=PartialFunction[Any,Unit])Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.
### Concrete Value Members

1. [**](../../akka/actor/Actor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/Actor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/Actor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Actor toany2stringadd\[Actor] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/Actor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Actor, B)ImplicitThis member is added by an implicit conversion from Actor toArrowAssoc\[Actor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/Actor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/Actor.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../index.html)] Annotations@[InternalApi](../annotation/InternalApi.html)()
7. [**](../../akka/actor/Actor.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../index.html)] Annotations@[InternalApi](../annotation/InternalApi.html)()
8. [**](../../akka/actor/Actor.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../index.html)] Annotations@[InternalApi](../annotation/InternalApi.html)()
9. [**](../../akka/actor/Actor.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../index.html)] Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/actor/Actor.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [Actor.Receive](Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../index.html)] Annotations@[InternalApi](../annotation/InternalApi.html)()
11. [**](../../akka/actor/Actor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/actor/Actor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/actor/Actor.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](AbstractActor$$ActorContext.html), which is the Java API of the actor
context.
14. [**](../../akka/actor/Actor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Actor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorImplicitThis member is added by an implicit conversion from Actor toEnsuring\[Actor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/actor/Actor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Actor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorImplicitThis member is added by an implicit conversion from Actor toEnsuring\[Actor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/actor/Actor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorImplicitThis member is added by an implicit conversion from Actor toEnsuring\[Actor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/actor/Actor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorImplicitThis member is added by an implicit conversion from Actor toEnsuring\[Actor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/actor/Actor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/actor/Actor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/actor/Actor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/actor/Actor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/actor/Actor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../akka/actor/Actor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/actor/Actor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/actor/Actor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/actor/Actor.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Annotations@throws(classOf\[Exception])
27. [**](../../akka/actor/Actor.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Annotations@throws(classOf\[Exception])
28. [**](../../akka/actor/Actor.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Annotations@throws(classOf\[Exception])
29. [**](../../akka/actor/Actor.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Annotations@throws(classOf\[Exception])
30. [**](../../akka/actor/Actor.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```
31. [**](../../akka/actor/Actor.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!
32. [**](../../akka/actor/Actor.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.
33. [**](../../akka/actor/Actor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../akka/actor/Actor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../akka/actor/Actor.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../event/EventStream.html)
36. [**](../../akka/actor/Actor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../akka/actor/Actor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
38. [**](../../akka/actor/Actor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/Actor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/Actor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Actor toStringFormat\[Actor] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/Actor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Actor, B)ImplicitThis member is added by an implicit conversion from Actor toArrowAssoc\[Actor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActor to any2stringadd\[Actor]

### Inherited by implicit conversion StringFormat fromActor to StringFormat\[Actor]

### Inherited by implicit conversion Ensuring fromActor to Ensuring\[Actor]

### Inherited by implicit conversion ArrowAssoc fromActor to ArrowAssoc\[Actor]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActor.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractFSM$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractFSM.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractScheduler.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorInitializationException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorNotFound.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorPath$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorPaths$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSelection$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Address$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AddressFromURIString$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AllDeadLetters.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/BootstrapSetup$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/BootstrapSetup.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Cancellable$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ChildActorPath.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ChildRestartStats.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorContextProvider.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Actor.html](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Actor.html)*
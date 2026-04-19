---
description: Akka 2.10.17 - akka.actor.FSM
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:42:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/FSM.html
title: Akka 2.10.17 - akka.actor.FSM
---

# Akka 2.10.17 - akka.actor.FSM

> **Summary:** Akka 2.10.17 - akka.actor.FSM

## Content

Akka2\.10\.17 \< Back****# Packages

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
- FSM
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
[t](FSM$.html "See companion object")[akka](../index.html).[actor](index.html)

# [FSM](FSM$.html "See companion object")[**](../../akka/actor/FSM.html "Permalink")

### Companion [object FSM](FSM$.html "See companion object")

#### trait FSM\[S, D] extends [Actor](Actor.html) with [Listeners](../routing/Listeners.html) with [ActorLogging](ActorLogging.html)

Finite State Machine actor trait. Use as follows:

```

  object A {
    trait State
    case class One extends State
    case class Two extends State

    case class Data(i : Int)
  }

  class A extends Actor with FSM[A.State, A.Data] {
    import A._

    startWith(One, Data(42))
    when(One) {
        case Event(SomeMsg, Data(x)) => ...
        case Event(SomeOtherMsg, _) => ... // when data not needed
    }
    when(Two, stateTimeout = 5 seconds) { ... }
    initialize()
  }

```
Within the partial function the following values are returned for effecting
state transitions:

- `stay` for staying in the same state
- `stay using Data(...)` for staying in the same state, but with
 different data
- `stay forMax 5.millis` for staying with a state timeout; can be
 combined with `using`
- `goto(...)` for changing into a different state; also supports
 `using` and `forMax`
- `stop` for terminating this FSM actor

Each of the above also supports the method `replying(AnyRef)` for
sending a reply before changing state.

While changing state, custom handlers may be invoked which are registered
using `onTransition`. This is meant to enable concentrating
different concerns in different places; you may choose to use
`when` for describing the properties of a state, including of
course initiating transitions, but you can describe the transitions using
`onTransition` to avoid having to duplicate that code among
multiple paths which lead to a transition:

```

onTransition {
  case Active -> _ => cancelTimer("activeTimer")
}

```
Multiple such blocks are supported and all of them will be called, not only
the first matching one.

Another feature is that other actors may subscribe for transition events by
sending a `SubscribeTransitionCallback` message to this actor.
Stopping a listener without unregistering will not remove the listener from the
subscription list; use `UnsubscribeTransitionCallback` before stopping
the listener.

State timeouts set an upper bound to the time which may pass before another
message is received in the current state. If no external message is
available, then upon expiry of the timeout a StateTimeout message is sent.
Note that this message will only be received in the state for which the
timeout was set and that any message received will cancel the timeout
(possibly to be started again by the next transition).

Another feature is the ability to install and cancel single\-shot as well as
repeated timers which arrange for the sending of a user\-specified message:

```

  setTimer("tock", TockMsg, 1 second, true) // repeating
  setTimer("lifetime", TerminateMsg, 1 hour, false) // single-shot
  cancelTimer("tock")
  isTimerActive("tock")

```

Source[FSM.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/FSM.scala#L421)Linear Supertypes[ActorLogging](ActorLogging.html), [Listeners](../routing/Listeners.html), [Actor](Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AbstractFSM](AbstractFSM.html), [AbstractFSMWithStash](AbstractFSMWithStash.html), [AbstractLoggingFSM](AbstractLoggingFSM.html), [LoggingFSM](LoggingFSM.html), [ClusterSingletonManager](../cluster/singleton/ClusterSingletonManager.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FSM
2. ActorLogging
3. Listeners
4. Actor
5. AnyRef
6. Any
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

1. [**](../../akka/actor/FSM.html#Event=akka.actor.FSM.Event[D] "Permalink")  type Event \= [FSM.Event](FSM$$Event.html)\[D]
2. [**](../../akka/actor/FSM.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](Actor.html)
3. [**](../../akka/actor/FSM.html#State=akka.actor.FSM.State[S,D] "Permalink")  type State \= [FSM.State](FSM$$State.html)\[S, D]
4. [**](../../akka/actor/FSM.html#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State] "Permalink")  type StateFunction \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Event](#Event=akka.actor.FSM.Event[D]), [State](#State=akka.actor.FSM.State[S,D])]
5. [**](../../akka/actor/FSM.html#StopEvent=akka.actor.FSM.StopEvent[S,D] "Permalink")  type StopEvent \= [FSM.StopEvent](FSM$$StopEvent.html)\[S, D]
6. [**](../../akka/actor/FSM.html#Timeout=Option[scala.concurrent.duration.FiniteDuration] "Permalink")  type Timeout \= [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]
7. [**](../../akka/actor/FSM$TransformHelper.html "Permalink") final  class [TransformHelper](FSM$TransformHelper.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../akka/actor/FSM.html#TransitionHandler=PartialFunction[(S,S),Unit] "Permalink")  type TransitionHandler \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(S, S), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
### Value Members

1. [**](../../akka/actor/FSM.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/FSM.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/FSM.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FSM\[S, D] toany2stringadd\[FSM\[S, D]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/FSM.html#->:akka.actor.FSM.->.type "Permalink")  val \-\>: [FSM.\-\>](FSM$$$minus$greater$.html).typeThis extractor is just convenience for matching a (S, S) pair, including a
reminder what the new state is.
5. [**](../../akka/actor/FSM.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/FSM.html#Event:akka.actor.FSM.Event.type "Permalink")  val Event: FSM.Event.type
7. [**](../../akka/actor/FSM.html#StateTimeout:akka.actor.FSM.StateTimeout.type "Permalink")  val StateTimeout: [FSM.StateTimeout](FSM$$StateTimeout$.html).typeThis case object is received in case of a state timeout.
8. [**](../../akka/actor/FSM.html#StopEvent:akka.actor.FSM.StopEvent.type "Permalink")  val StopEvent: FSM.StopEvent.type
9. [**](../../akka/actor/FSM.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/actor/FSM.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
11. [**](../../akka/actor/FSM.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
12. [**](../../akka/actor/FSM.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
13. [**](../../akka/actor/FSM.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [Actor.Receive](Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
14. [**](../../akka/actor/FSM.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
15. [**](../../akka/actor/FSM.html#cancelTimer(name:String):Unit "Permalink") final  def cancelTimer(name: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Cancel named timer, ensuring that the message is not subsequently delivered (no race).

Cancel named timer, ensuring that the message is not subsequently delivered (no race).

nameof the timer to cancel
16. [**](../../akka/actor/FSM.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/actor/FSM.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](Actor.html)
18. [**](../../akka/actor/FSM.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FSM\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FSM\[S, D]ImplicitThis member is added by an implicit conversion from FSM\[S, D] toEnsuring\[FSM\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/actor/FSM.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FSM\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FSM\[S, D]ImplicitThis member is added by an implicit conversion from FSM\[S, D] toEnsuring\[FSM\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/actor/FSM.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FSM\[S, D]ImplicitThis member is added by an implicit conversion from FSM\[S, D] toEnsuring\[FSM\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/actor/FSM.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FSM\[S, D]ImplicitThis member is added by an implicit conversion from FSM\[S, D] toEnsuring\[FSM\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../akka/actor/FSM.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/actor/FSM.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../akka/actor/FSM.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/actor/FSM.html#gossip(msg:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def gossip(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit sender: [ActorRef](ActorRef.html) \= [Actor.noSender](../index.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends the supplied message to all current listeners using the provided sender() as sender.

Sends the supplied message to all current listeners using the provided sender() as sender.

Attributesprotected Definition Classes[Listeners](../routing/Listeners.html)
26. [**](../../akka/actor/FSM.html#goto(nextStateName:S):FSM.this.State "Permalink") final  def goto(nextStateName: S): [State](#State=akka.actor.FSM.State[S,D])Produce transition to other state.

Produce transition to other state.
Return this from a state function in order to effect the transition.

This method always triggers transition events, even for `A -> A` transitions.
If you want to stay in the same state without triggering an state transition event use [\#stay](#stay():FSM.this.State) instead.

nextStateNamestate designator for the next state

returnsstate transition descriptor
27. [**](../../akka/actor/FSM.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/actor/FSM.html#initialize():Unit "Permalink") final  def initialize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Verify existence of initial state and setup timers.

Verify existence of initial state and setup timers. This should be the
last call within the constructor, or [akka.actor.Actor\#preStart](Actor.html#preStart():Unit) and
[akka.actor.Actor\#postRestart](Actor.html#postRestart(reason:Throwable):Unit)

An initial `currentState -> currentState` notification will be triggered by calling this method.

See also[\#startWith](#startWith(stateName:S,stateData:D,timeout:FSM.this.Timeout):Unit)
29. [**](../../akka/actor/FSM.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../akka/actor/FSM.html#isTimerActive(name:String):Boolean "Permalink") final  def isTimerActive(name: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Inquire whether the named timer is still active.

Inquire whether the named timer is still active. Returns true unless the
timer does not exist, has previously been canceled or if it was a
single\-shot timer whose message was already received.
31. [**](../../akka/actor/FSM.html#listenerManagement:akka.actor.Actor.Receive "Permalink")  def listenerManagement: [Actor.Receive](Actor$.html#Receive=PartialFunction[Any,Unit])Chain this into the receive function.

Chain this into the receive function.

```
def receive = listenerManagement orElse …
```
Attributesprotected Definition Classes[Listeners](../routing/Listeners.html)
32. [**](../../akka/actor/FSM.html#listeners:java.util.Set[akka.actor.ActorRef] "Permalink")  val listeners: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](ActorRef.html)]Attributesprotected Definition Classes[Listeners](../routing/Listeners.html)
33. [**](../../akka/actor/FSM.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../event/LoggingAdapter.html)Definition Classes[ActorLogging](ActorLogging.html)
34. [**](../../akka/actor/FSM.html#logTermination(reason:akka.actor.FSM.Reason):Unit "Permalink")  def logTermination(reason: [Reason](FSM$$Reason.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)By default [FSM.Failure](FSM$$Failure.html) is logged at error level and other reason
types are not logged.

By default [FSM.Failure](FSM$$Failure.html) is logged at error level and other reason
types are not logged. It is possible to override this behavior.

Attributesprotected
35. [**](../../akka/actor/FSM.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../akka/actor/FSM.html#nextStateData:D "Permalink") final  def nextStateData: DReturn next state data (available in onTransition handlers)
37. [**](../../akka/actor/FSM.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../akka/actor/FSM.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
39. [**](../../akka/actor/FSM.html#onTermination(terminationHandler:PartialFunction[FSM.this.StopEvent,Unit]):Unit "Permalink") final  def onTermination(terminationHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[StopEvent](#StopEvent=akka.actor.FSM.StopEvent[S,D]), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set handler which is called upon termination of this FSM actor.

Set handler which is called upon termination of this FSM actor. Calling
this method again will overwrite the previous contents.
40. [**](../../akka/actor/FSM.html#onTransition(transitionHandler:FSM.this.TransitionHandler):Unit "Permalink") final  def onTransition(transitionHandler: [TransitionHandler](#TransitionHandler=PartialFunction[(S,S),Unit])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set handler which is called upon each state transition, i.e.

Set handler which is called upon each state transition, i.e. not when
staying in the same state. This may use the pair extractor defined in the
FSM companion object like so:

```

onTransition {
  case Old -> New => doSomething
}

```
It is also possible to supply a 2\-ary function object:

```

onTransition(handler _)

private def handler(from: S, to: S) { ... }

```
The underscore is unfortunately necessary to enable the nicer syntax shown
above (it uses the implicit conversion total2pf under the hood).

**Multiple handlers may be installed, and every one of them will be
called, not only the first one matching.**
41. [**](../../akka/actor/FSM.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](Actor.html)Annotations@throws(classOf\[Exception])
42. [**](../../akka/actor/FSM.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Call `onTermination` hook; if you want to retain this behavior when
overriding make sure to call `super.postStop()`.

Call `onTermination` hook; if you want to retain this behavior when
overriding make sure to call `super.postStop()`.

Please note that this method is called by default from `preRestart()`,
so override that one if `onTermination` shall not be called during
restart.

Definition ClassesFSM → [Actor](Actor.html)
43. [**](../../akka/actor/FSM.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](Actor.html)Annotations@throws(classOf\[Exception])
44. [**](../../akka/actor/FSM.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](Actor.html)Annotations@throws(classOf\[Exception])
45. [**](../../akka/actor/FSM.html#receive:FSM.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesFSM → [Actor](Actor.html)
46. [**](../../akka/actor/FSM.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](Actor.html)
47. [**](../../akka/actor/FSM.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](Actor.html)
48. [**](../../akka/actor/FSM.html#setStateTimeout(state:S,timeout:FSM.this.Timeout):Unit "Permalink") final  def setStateTimeout(state: S, timeout: [Timeout](#Timeout=Option[scala.concurrent.duration.FiniteDuration])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set state timeout explicitly.

Set state timeout explicitly. This method can safely be used from within a
state handler.
49. [**](../../akka/actor/FSM.html#startSingleTimer(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startSingleTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.
50. [**](../../akka/actor/FSM.html#startTimerAtFixedRate(name:String,msg:Any,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerAtFixedRate(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `startTimerWithFixedDelay` is often preferred.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.
51. [**](../../akka/actor/FSM.html#startTimerWithFixedDelay(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerWithFixedDelay(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.
52. [**](../../akka/actor/FSM.html#startWith(stateName:S,stateData:D,timeout:FSM.this.Timeout):Unit "Permalink") final  def startWith(stateName: S, stateData: D, timeout: [Timeout](#Timeout=Option[scala.concurrent.duration.FiniteDuration]) \= None): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set initial state.

Set initial state. Call this method from the constructor before the [\#initialize](#initialize():Unit) method.
If different state is needed after a restart this method, followed by [\#initialize](#initialize():Unit), can
be used in the actor life cycle hooks [akka.actor.Actor\#preStart](Actor.html#preStart():Unit) and [akka.actor.Actor\#postRestart](Actor.html#postRestart(reason:Throwable):Unit).

stateNameinitial state designator

stateDatainitial state data

timeoutstate timeout for the initial state, overriding the default timeout for that state
53. [**](../../akka/actor/FSM.html#stateData:D "Permalink") final  def stateData: DReturn current state data (i.e.

Return current state data (i.e. object of type D)
54. [**](../../akka/actor/FSM.html#stateName:S "Permalink") final  def stateName: SReturn current state name (i.e.

Return current state name (i.e. object of type S)
55. [**](../../akka/actor/FSM.html#stay():FSM.this.State "Permalink") final  def stay(): [State](#State=akka.actor.FSM.State[S,D])Produce "empty" transition descriptor.

Produce "empty" transition descriptor.
Return this from a state function when no state change is to be effected.

No transition event will be triggered by [\#stay](#stay():FSM.this.State).
If you want to trigger an event like `S -> S` for `onTransition` to handle use `goto` instead.

returnsdescriptor for staying in current state
56. [**](../../akka/actor/FSM.html#stop(reason:akka.actor.FSM.Reason,stateData:D):FSM.this.State "Permalink") final  def stop(reason: [Reason](FSM$$Reason.html), stateData: D): [State](#State=akka.actor.FSM.State[S,D])Produce change descriptor to stop this FSM actor including specified reason.
57. [**](../../akka/actor/FSM.html#stop(reason:akka.actor.FSM.Reason):FSM.this.State "Permalink") final  def stop(reason: [Reason](FSM$$Reason.html)): [State](#State=akka.actor.FSM.State[S,D])Produce change descriptor to stop this FSM actor including specified reason.
58. [**](../../akka/actor/FSM.html#stop():FSM.this.State "Permalink") final  def stop(): [State](#State=akka.actor.FSM.State[S,D])Produce change descriptor to stop this FSM actor with reason "Normal".
59. [**](../../akka/actor/FSM.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](Actor.html)
60. [**](../../akka/actor/FSM.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
61. [**](../../akka/actor/FSM.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
62. [**](../../akka/actor/FSM.html#total2pf(transitionHandler:(S,S)=>Unit):FSM.this.TransitionHandler "Permalink") implicit final  def total2pf(transitionHandler: (S, S) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [TransitionHandler](#TransitionHandler=PartialFunction[(S,S),Unit])Convenience wrapper for using a total function instead of a partial
function literal.

Convenience wrapper for using a total function instead of a partial
function literal. To be used with onTransition.
63. [**](../../akka/actor/FSM.html#transform(func:FSM.this.StateFunction):FSM.this.TransformHelper "Permalink") final  def transform(func: [StateFunction](#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State])): [TransformHelper](FSM$TransformHelper.html)
64. [**](../../akka/actor/FSM.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../event/EventStream.html)

Definition Classes[Actor](Actor.html)
65. [**](../../akka/actor/FSM.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
66. [**](../../akka/actor/FSM.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
67. [**](../../akka/actor/FSM.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
68. [**](../../akka/actor/FSM.html#when(stateName:S,stateTimeout:scala.concurrent.duration.FiniteDuration)(stateFunction:FSM.this.StateFunction):Unit "Permalink") final  def when(stateName: S, stateTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration) \= null)(stateFunction: [StateFunction](#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Insert a new StateFunction at the end of the processing chain for the
given state.

Insert a new StateFunction at the end of the processing chain for the
given state. If the stateTimeout parameter is set, entering this state
without a differing explicit timeout setting will trigger a StateTimeout
event; the same is true when using \#stay.

stateNamedesignator for the state

stateTimeoutdefault state timeout for this state

stateFunctionpartial function describing response to input
69. [**](../../akka/actor/FSM.html#whenUnhandled(stateFunction:FSM.this.StateFunction):Unit "Permalink") final  def whenUnhandled(stateFunction: [StateFunction](#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set handler which is called upon reception of unhandled messages.

Set handler which is called upon reception of unhandled messages. Calling
this method again will overwrite the previous contents.

The current state may be queried using `stateName`.
### Shadowed Implicit Value Members

1. [**](../../akka/actor/FSM.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FSM\[S, D], B)ImplicitThis member is added by an implicit conversion from FSM\[S, D] toArrowAssoc\[FSM\[S, D]] performed by method ArrowAssoc in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(fSM: ArrowAssoc[FSM[S, D]]).->(y)
```
Definition ClassesArrowAssocAnnotations@inline()
### Deprecated Value Members

1. [**](../../akka/actor/FSM.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/FSM.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FSM\[S, D] toStringFormat\[FSM\[S, D]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/FSM.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration,repeat:Boolean):Unit "Permalink") final  def setTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), repeat: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedule named timer to deliver message after given delay, possibly repeating.

Schedule named timer to deliver message after given delay, possibly repeating.
Any existing timer with the same name will automatically be canceled before
adding the new timer.

nameidentifier to be used with cancelTimer()

msgmessage to be delivered

timeoutdelay of first message delivery and between subsequent messages

repeatsend once if false, scheduleAtFixedRate if true

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred.
4. [**](../../akka/actor/FSM.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FSM\[S, D], B)ImplicitThis member is added by an implicit conversion from FSM\[S, D] toArrowAssoc\[FSM\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ActorLogging](ActorLogging.html)

### Inherited from [Listeners](../routing/Listeners.html)

### Inherited from [Actor](Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFSM\[S, D] to any2stringadd\[FSM\[S, D]]

### Inherited by implicit conversion StringFormat fromFSM\[S, D] to StringFormat\[FSM\[S, D]]

### Inherited by implicit conversion Ensuring fromFSM\[S, D] to Ensuring\[FSM\[S, D]]

### Inherited by implicit conversion ArrowAssoc fromFSM\[S, D] to ArrowAssoc\[FSM\[S, D]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractFSM$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractFSM.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractScheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorInitializationException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorNotFound.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPaths$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AddressFromURIString$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AllDeadLetters.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/BootstrapSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/BootstrapSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ChildActorPath.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ChildRestartStats.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ClassicActorContextProvider.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM.html)*
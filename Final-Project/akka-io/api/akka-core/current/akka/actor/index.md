---
description: Akka 2.10.17 - akka.actor
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:48:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/index.html
title: Akka 2.10.17 - akka.actor
---

# Akka 2.10.17 - akka.actor

> **Summary:** Akka 2.10.17 - akka.actor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package actorDefinition Classes[akka](../index.html)
- [**](../../akka/actor/dungeon/index.html "Permalink")  package [dungeon](dungeon/index.html)
- [**](../../akka/actor/setup/index.html "Permalink")  package [setup](setup/index.html)
- [**](../../akka/actor/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [**](../../akka/actor/typed/index.html "Permalink")  package [typed](typed/index.html)
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
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# actor[**](../../akka/actor/index.html "Permalink")

#### package actor

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/package.scala#L9)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. actor
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/actor/dungeon/index.html "Permalink")  package [dungeon](dungeon/index.html)
2. [**](../../akka/actor/setup/index.html "Permalink")  package [setup](setup/index.html)
3. [**](../../akka/actor/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
4. [**](../../akka/actor/typed/index.html "Permalink")  package [typed](typed/index.html)
### Type Members

1. [**](../../akka/actor/AbstractActor.html "Permalink") abstract  class [AbstractActor](AbstractActor.html "Java API: compatible with lambda expressions") extends [Actor](Actor.html)Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Actor base class that should be extended to create Java actors that use lambdas.

Example:

```

public class MyActorForJavaDoc extends AbstractActor{
   @Override
   public Receive createReceive() {
       return receiveBuilder()
               .match(Double.class, d -> {
                   sender().tell(d.isNaN() ? 0 : d, self());
               })
               .match(Integer.class, i -> {
                   sender().tell(i * 10, self());
               })
               .match(String.class, s -> s.startsWith("foo"), s -> {
                   sender().tell(s.toUpperCase(), self());
               })
               .build();
   }
}

```
2. [**](../../akka/actor/AbstractActorWithStash.html "Permalink") abstract  class [AbstractActorWithStash](AbstractActorWithStash.html "Java API: compatible with lambda expressions") extends [AbstractActor](AbstractActor.html) with [Stash](Stash.html)Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Actor base class that should be extended to create an actor with a stash.

The stash enables an actor to temporarily stash away messages that can not or
should not be handled using the actor's current behavior.

Example:

```

public class MyActorWithStash extends AbstractActorWithStash {
  int count = 0;

  public MyActorWithStash() {
    receive(ReceiveBuilder. match(String.class, s -> {
      if (count < 0) {
        sender().tell(new Integer(s.length()), self());
      } else if (count == 2) {
        count = -1;
        unstashAll();
      } else {
        count += 1;
        stash();
      }}).build()
    );
  }
}

```

Note that the subclasses of `AbstractActorWithStash` by default request a Deque based mailbox since this class
implements the `RequiresMessageQueue<DequeBasedMessageQueueSemantics>` marker interface.
You can override the default mailbox provided when `DequeBasedMessageQueueSemantics` are requested via config:

```

  akka.actor.mailbox.requirements {
    "akka.dispatch.BoundedDequeBasedMessageQueueSemantics" = your-custom-mailbox
  }

```

Alternatively, you can add your own requirement marker to the actor and configure a mailbox type to be used
for your marker.For a `Stash` based actor that enforces unbounded deques see [akka.actor.AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html).
There is also an unrestricted version [akka.actor.AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html) that does not
enforce the mailbox type.
3. [**](../../akka/actor/AbstractActorWithTimers.html "Permalink") abstract  class [AbstractActorWithTimers](AbstractActorWithTimers.html "Java API: Support for scheduled self messages via TimerScheduler.") extends [AbstractActor](AbstractActor.html) with [Timers](Timers.html)Java API: Support for scheduled `self` messages via [TimerScheduler](TimerScheduler.html).

Java API: Support for scheduled `self` messages via [TimerScheduler](TimerScheduler.html).

Timers are bound to the lifecycle of the actor that owns it,
and thus are cancelled automatically when it is restarted or stopped.
4. [**](../../akka/actor/AbstractActorWithUnboundedStash.html "Permalink") abstract  class [AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "Java API: compatible with lambda expressions") extends [AbstractActor](AbstractActor.html) with [UnboundedStash](UnboundedStash.html)Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Actor base class with `Stash` that enforces an unbounded deque for the actor. The proper mailbox has to be configured
manually, and the mailbox should extend the [akka.dispatch.DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html) marker trait.
See [akka.actor.AbstractActorWithStash](AbstractActorWithStash.html) for details on how `Stash` works.
5. [**](../../akka/actor/AbstractActorWithUnrestrictedStash.html "Permalink") abstract  class [AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html "Java API: compatible with lambda expressions") extends [AbstractActor](AbstractActor.html) with [UnrestrictedStash](UnrestrictedStash.html)Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Actor base class with `Stash` that does not enforce any mailbox type. The mailbox of the actor has to be configured
manually. See [akka.actor.AbstractActorWithStash](AbstractActorWithStash.html) for details on how `Stash` works.
6. [**](../../akka/actor/AbstractExtensionId.html "Permalink") abstract  class [AbstractExtensionId](AbstractExtensionId.html "Java API for ExtensionId")\[T \<: [Extension](Extension.html)] extends [ExtensionId](ExtensionId.html)\[T]Java API for ExtensionId
7. [**](../../akka/actor/AbstractFSM.html "Permalink") abstract  class [AbstractFSM](AbstractFSM.html "Java API: compatible with lambda expressions")\[S, D] extends [FSM](FSM.html)\[S, D]Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Finite State Machine actor abstract base class.
8. [**](../../akka/actor/AbstractFSMWithStash.html "Permalink") abstract  class [AbstractFSMWithStash](AbstractFSMWithStash.html "Java API: compatible with lambda expressions")\[S, D] extends [AbstractFSM](AbstractFSM.html)\[S, D] with [Stash](Stash.html)Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Finite State Machine actor abstract base class with Stash support.
9. [**](../../akka/actor/AbstractLoggingActor.html "Permalink") abstract  class [AbstractLoggingActor](AbstractLoggingActor.html "Java API: compatible with lambda expressions") extends [AbstractActor](AbstractActor.html) with [ActorLogging](ActorLogging.html)Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Actor base class that mixes in logging into the Actor.
10. [**](../../akka/actor/AbstractLoggingFSM.html "Permalink") abstract  class [AbstractLoggingFSM](AbstractLoggingFSM.html "Java API: compatible with lambda expressions")\[S, D] extends [AbstractFSM](AbstractFSM.html)\[S, D] with [LoggingFSM](LoggingFSM.html)\[S, D]Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Finite State Machine actor abstract base class.
11. [**](../../akka/actor/AbstractScheduler.html "Permalink") abstract  class [AbstractScheduler](AbstractScheduler.html "An Akka scheduler service.") extends [AbstractSchedulerBase](AbstractSchedulerBase.html)An Akka scheduler service.

An Akka scheduler service. This one needs one special behavior: if Closeable, it MUST execute all
outstanding tasks upon .close() in order to properly shutdown all dispatchers.

Furthermore, this timer service MUST throw IllegalStateException if it cannot schedule a task.
Once scheduled, the task MUST be executed. If executed upon close(), the task may execute before
its timeout.

Scheduler implementation are loaded reflectively at ActorSystem start\-up with the following
constructor arguments: 1\) the system’s com.typesafe.config.Config (from system.settings.config)
2\) a akka.event.LoggingAdapter 3\) a java.util.concurrent.ThreadFactory
12. [**](../../akka/actor/AbstractSchedulerBase.html "Permalink") abstract  class [AbstractSchedulerBase](AbstractSchedulerBase.html) extends [Scheduler](Scheduler.html)
13. [**](../../akka/actor/Actor.html "Permalink")  trait [Actor](Actor.html "Actor base trait that should be extended by or mixed to create an Actor with the semantics of the 'Actor Model': https://en.wikipedia.org/wiki/Actor_model") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Actor base trait that should be extended by or mixed to create an Actor with the semantics of the 'Actor Model':
<https://en.wikipedia.org/wiki/Actor_model>

Actor base trait that should be extended by or mixed to create an Actor with the semantics of the 'Actor Model':
<https://en.wikipedia.org/wiki/Actor_model>

An actor has a well\-defined (non\-cyclic) life\-cycle.

	- *RUNNING* (created and started actor) \- can receive messages
	- *SHUTDOWN* (when 'stop' is invoked) \- can't do anythingThe Actor's own [akka.actor.ActorRef](ActorRef.html) is available as `self`, the current
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
14. [**](../../akka/actor/ActorContext.html "Permalink")  trait [ActorContext](ActorContext.html "The actor context - the view of the actor cell from the actor.") extends [ActorRefFactory](ActorRefFactory.html) with [ClassicActorContextProvider](ClassicActorContextProvider.html)The actor context \- the view of the actor cell from the actor.

The actor context \- the view of the actor cell from the actor.
Exposes contextual information for the actor and the current message.

There are several possibilities for creating actors (see [akka.actor.Props](Props.html)
for details on `props`):

```
// Java or Scala
context.actorOf(props, "name")
context.actorOf(props)

// Scala
context.actorOf(Props[MyActor])
context.actorOf(Props(classOf[MyActor], arg1, arg2), "name")

// Java
getContext().actorOf(Props.create(MyActor.class));
getContext().actorOf(Props.create(MyActor.class, arg1, arg2), "name");
```
Where no name is given explicitly, one will be automatically generated.
15. [**](../../akka/actor/ActorIdentity.html "Permalink") final  case class [ActorIdentity](ActorIdentity.html "Reply to akka.actor.Identify.")(correlationId: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ref: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorRef](ActorRef.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply to [akka.actor.Identify](Identify.html).

Reply to [akka.actor.Identify](Identify.html). Contains
`Some(ref)` with the `ActorRef` of the actor replying to the request or
`None` if no actor matched the request.
The `correlationId` is taken from the `messageId` in
the `Identify` message.

Annotations@SerialVersionUID()
16. [**](../../akka/actor/ActorInitializationException.html "Permalink")  class [ActorInitializationException](ActorInitializationException.html "An ActorInitializationException is thrown when the initialization logic for an Actor fails.") extends [AkkaException](../AkkaException.html)An ActorInitializationException is thrown when the initialization logic for an Actor fails.

An ActorInitializationException is thrown when the initialization logic for an Actor fails.

There is an extractor which works for ActorInitializationException and its subtypes:

```
ex match {
  case ActorInitializationException(actor, message, cause) => ...
}
```
Annotations@SerialVersionUID()
17. [**](../../akka/actor/ActorInterruptedException.html "Permalink")  class [ActorInterruptedException](ActorInterruptedException.html "When an InterruptedException is thrown inside an Actor, it is wrapped as an ActorInterruptedException as to avoid cascading interrupts to other threads than the originally interrupted one.") extends [AkkaException](../AkkaException.html)When an InterruptedException is thrown inside an Actor, it is wrapped as an ActorInterruptedException as to
avoid cascading interrupts to other threads than the originally interrupted one.

When an InterruptedException is thrown inside an Actor, it is wrapped as an ActorInterruptedException as to
avoid cascading interrupts to other threads than the originally interrupted one.

Annotations@SerialVersionUID()
18. [**](../../akka/actor/ActorKilledException.html "Permalink") final  case class [ActorKilledException](ActorKilledException.html "ActorKilledException is thrown when an Actor receives the akka.actor.Kill message") extends [AkkaException](../AkkaException.html) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableActorKilledException is thrown when an Actor receives the [akka.actor.Kill](Kill.html) message

ActorKilledException is thrown when an Actor receives the [akka.actor.Kill](Kill.html) message

Not for user instatiation

Annotations@SerialVersionUID()
19. [**](../../akka/actor/ActorLogging.html "Permalink")  trait [ActorLogging](ActorLogging.html "Scala API: Mix in ActorLogging into your Actor to easily obtain a reference to a logger, which is available under the name \"log\".") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Scala API: Mix in ActorLogging into your Actor to easily obtain a reference to a logger,
which is available under the name "log".

Scala API: Mix in ActorLogging into your Actor to easily obtain a reference to a logger,
which is available under the name "log".

```
class MyActor extends Actor with ActorLogging {
  def receive = {
    case "pigdog" => log.info("We've got yet another pigdog on our hands")
  }
}
```
20. [**](../../akka/actor/ActorNotFound.html "Permalink") final  case class [ActorNotFound](ActorNotFound.html "When ActorSelection#resolveOne can't identify the actor the Future is completed with this failure.")(selection: [ActorSelection](ActorSelection.html)) extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen [ActorSelection\#resolveOne](ActorSelection.html#resolveOne(timeout:java.time.Duration):java.util.concurrent.CompletionStage[akka.actor.ActorRef]) can't identify the actor the
`Future` is completed with this failure.

When [ActorSelection\#resolveOne](ActorSelection.html#resolveOne(timeout:java.time.Duration):java.util.concurrent.CompletionStage[akka.actor.ActorRef]) can't identify the actor the
`Future` is completed with this failure.

Annotations@SerialVersionUID()
21. [**](../../akka/actor/ActorPath.html "Permalink") sealed  trait [ActorPath](ActorPath.html "Actor path is a unique path to an actor that shows the creation path up through the actor tree to the root actor.") extends [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorPath](ActorPath.html)] with SerializableActor path is a unique path to an actor that shows the creation path
up through the actor tree to the root actor.

Actor path is a unique path to an actor that shows the creation path
up through the actor tree to the root actor.

ActorPath defines a natural ordering (so that ActorRefs can be put into
collections with this requirement); this ordering is intended to be as fast
as possible, which owing to the bottom\-up recursive nature of ActorPath
is sorted by path elements FROM RIGHT TO LEFT, where RootActorPath \>
ChildActorPath in case the number of elements is different.

Two actor paths are compared equal when they have the same name and parent
elements, including the root address information. That does not necessarily
mean that they point to the same incarnation of the actor if the actor is
re\-created with the same path. In other words, in contrast to how actor
references are compared the unique id of the actor is not taken into account
when comparing actor paths.

Annotations@nowarn() @SerialVersionUID()
22. [**](../../akka/actor/ActorRef.html "Permalink") abstract  class [ActorRef](ActorRef.html "Immutable and serializable handle to an actor, which may or may not reside on the local host or inside the same akka.actor.ActorSystem.") extends [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorRef](ActorRef.html)] with SerializableImmutable and serializable handle to an actor, which may or may not reside
on the local host or inside the same [akka.actor.ActorSystem](ActorSystem.html).

Immutable and serializable handle to an actor, which may or may not reside
on the local host or inside the same [akka.actor.ActorSystem](ActorSystem.html). An ActorRef
can be obtained from an [akka.actor.ActorRefFactory](ActorRefFactory.html), an interface which
is implemented by ActorSystem and [akka.actor.ActorContext](ActorContext.html). This means
actors can be created top\-level in the ActorSystem or as children of an
existing actor, but only from within that actor.

ActorRefs can be freely shared among actors by message passing. Message
passing conversely is their only purpose, as demonstrated in the following
examples:

Scala:

```
import akka.pattern.ask
import scala.concurrent.Await

class ExampleActor extends Actor {
  val other = context.actorOf(Props[OtherActor], "childName") // will be destroyed and re-created upon restart by default

  def receive {
    case Request1(msg) => other ! refine(msg)     // uses this actor as sender reference, reply goes to us
    case Request2(msg) => other.tell(msg, sender()) // forward sender reference, enabling direct reply
    case Request3(msg) =>
      implicit val timeout = Timeout(5.seconds)
      (other ? msg) pipeTo sender()
      // the ask call will get a future from other's reply
      // when the future is complete, send its value to the original sender
  }
}
```
Java:

```
import static akka.pattern.Patterns.ask;
import static akka.pattern.Patterns.pipe;

public class ExampleActor extends AbstractActor {
  // this child will be destroyed and re-created upon restart by default
  final ActorRef other = getContext().actorOf(Props.create(OtherActor.class), "childName");
  @Override
  public Receive createReceive() {
    return receiveBuilder()
      .match(Request1.class, msg ->
        // uses this actor as sender reference, reply goes to us
        other.tell(msg, getSelf()))
      .match(Request2.class, msg ->
        // forward sender reference, enabling direct reply
        other.tell(msg, getSender()))
      .match(Request3.class, msg ->
        // the ask call will get a future from other's reply
        // when the future is complete, send its value to the original sender
        pipe(ask(other, msg, 5000), context().dispatcher()).to(getSender()))
      .build();
  }
}
```
ActorRef does not have a method for terminating the actor it points to, use
[akka.actor.ActorRefFactory](ActorRefFactory.html)`.stop(ref)`, or send a [akka.actor.PoisonPill](PoisonPill.html),
for this purpose.

Two actor references are compared equal when they have the same path and point to
the same actor incarnation. A reference pointing to a terminated actor doesn't compare
equal to a reference pointing to another (re\-created) actor with the same path.

If you need to keep track of actor references in a collection and do not care
about the exact actor incarnation you can use the `ActorPath` as key because
the unique id of the actor is not taken into account when comparing actor paths.

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
23. [**](../../akka/actor/ActorRefFactory.html "Permalink")  trait [ActorRefFactory](ActorRefFactory.html "Interface implemented by ActorSystem and ActorContext, the only two places from which you can get fresh actors.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Interface implemented by ActorSystem and ActorContext, the only two places
from which you can get fresh actors.

Interface implemented by ActorSystem and ActorContext, the only two places
from which you can get fresh actors.

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)() @implicitNotFound()
24. [**](../../akka/actor/ActorRefProvider.html "Permalink")  trait [ActorRefProvider](ActorRefProvider.html "Interface for all ActorRef providers to implement.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Interface for all ActorRef providers to implement.

Interface for all ActorRef providers to implement.
Not intended for extension outside of Akka.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
25. [**](../../akka/actor/ActorSelection.html "Permalink") abstract  class [ActorSelection](ActorSelection.html "An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors, allowing for broadcasting of messages to that section.") extends SerializableAn ActorSelection is a logical view of a section of an ActorSystem's tree of Actors,
allowing for broadcasting of messages to that section.

An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors,
allowing for broadcasting of messages to that section.

Annotations@SerialVersionUID()
26. [**](../../akka/actor/ActorSystem.html "Permalink") abstract  class [ActorSystem](ActorSystem.html "An actor system is a hierarchical group of actors which share common configuration, e.g.") extends [ActorRefFactory](ActorRefFactory.html) with [ClassicActorSystemProvider](ClassicActorSystemProvider.html)An actor system is a hierarchical group of actors which share common
configuration, e.g.

An actor system is a hierarchical group of actors which share common
configuration, e.g. dispatchers, deployments, remote capabilities and
addresses. It is also the entry point for creating or looking up actors.

There are several possibilities for creating actors (see [akka.actor.Props](Props.html)
for details on `props`):

```
// Java or Scala
system.actorOf(props, "name")
system.actorOf(props)

// Scala
system.actorOf(Props[MyActor], "name")
system.actorOf(Props(classOf[MyActor], arg1, arg2), "name")

// Java
system.actorOf(Props.create(MyActor.class), "name");
system.actorOf(Props.create(MyActor.class, arg1, arg2), "name");
```
Where no name is given explicitly, one will be automatically generated.

***Important Notice:***

This class is not meant to be extended by user code. If you want to
actually roll your own Akka, it will probably be better to look into
extending [akka.actor.ExtendedActorSystem](ExtendedActorSystem.html) instead, but beware that you
are completely on your own in that case!
27. [**](../../akka/actor/Address.html "Permalink") final  case class [Address](Address.html "The address specifies the physical location under which an Actor can be reached.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe address specifies the physical location under which an Actor can be
reached.

The address specifies the physical location under which an Actor can be
reached. Examples are local addresses, identified by the ActorSystem’s
name, and remote addresses, identified by protocol, host and port.

This class is final to allow use as a case class (copy method etc.); if
for example a remote transport would want to associate additional
information with an address, then this must be done externally.

Not for user instantiation

Annotations@SerialVersionUID()
28. [**](../../akka/actor/AllDeadLetters.html "Permalink")  trait [AllDeadLetters](AllDeadLetters.html "Subscribe to this class to be notified about all DeadLetter (also the suppressed ones) and Dropped.") extends [WrappedMessage](WrappedMessage.html)Subscribe to this class to be notified about all [DeadLetter](DeadLetter.html) (also the suppressed ones)
and [Dropped](Dropped.html).

Subscribe to this class to be notified about all [DeadLetter](DeadLetter.html) (also the suppressed ones)
and [Dropped](Dropped.html).

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
29. [**](../../akka/actor/AllForOneStrategy.html "Permalink")  case class [AllForOneStrategy](AllForOneStrategy.html "Applies the fault handling Directive (Resume, Restart, Stop) specified in the Decider to all children when one fails, as opposed to akka.actor.OneForOneStrategy that applies it only to the child actor that failed.")(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= \-1, withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true)(decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive])) extends [SupervisorStrategy](SupervisorStrategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableApplies the fault handling `Directive` (Resume, Restart, Stop) specified in the `Decider`
to all children when one fails, as opposed to [akka.actor.OneForOneStrategy](OneForOneStrategy.html) that applies
it only to the child actor that failed.

Applies the fault handling `Directive` (Resume, Restart, Stop) specified in the `Decider`
to all children when one fails, as opposed to [akka.actor.OneForOneStrategy](OneForOneStrategy.html) that applies
it only to the child actor that failed.

maxNrOfRetriesthe number of times a child actor is allowed to be restarted, negative value means no limit,
 if the limit is exceeded the child actor is stopped

withinTimeRangeduration of the time window for maxNrOfRetries, Duration.Inf means no window

loggingEnabledthe strategy logs the failure if this is enabled (true), by default it is enabled

decidermapping from Throwable to [akka.actor.SupervisorStrategy.Directive](SupervisorStrategy$$Directive.html), you can also use a
 [scala.collection.immutable.Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html) of Throwables which maps the given Throwables to restarts, otherwise escalates.
30. [**](../../akka/actor/BootstrapSetup.html "Permalink") final  class [BootstrapSetup](BootstrapSetup.html "Core bootstrap settings of the actor system, create using one of the factories in BootstrapSetup, constructor is *Internal API*.") extends [Setup](setup/Setup.html)Core bootstrap settings of the actor system, create using one of the factories in [BootstrapSetup](BootstrapSetup.html),
constructor is \*Internal API\*.
31. [**](../../akka/actor/Cancellable.html "Permalink")  trait [Cancellable](Cancellable.html "Signifies something that can be cancelled There is no strict guarantee that the implementation is thread-safe, but it should be good practice to make it so.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Signifies something that can be cancelled
There is no strict guarantee that the implementation is thread\-safe,
but it should be good practice to make it so.
32. [**](../../akka/actor/ChildActorPath.html "Permalink") final  class [ChildActorPath](ChildActorPath.html "Not for user instantiation") extends [ActorPath](ActorPath.html)Not for user instantiation

Not for user instantiation

Annotations@SerialVersionUID()
33. [**](../../akka/actor/ChildRestartStats.html "Permalink") final  case class [ChildRestartStats](ChildRestartStats.html "ChildRestartStats is the statistics kept by every parent Actor for every child Actor and is used for SupervisorStrategies to know how to deal with problems that occur for the children.")(child: [ActorRef](ActorRef.html), maxNrOfRetriesCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, restartTimeWindowStartNanos: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0L) extends ChildStats with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableChildRestartStats is the statistics kept by every parent Actor for every child Actor
and is used for SupervisorStrategies to know how to deal with problems that occur for the children.
34. [**](../../akka/actor/ClassicActorContextProvider.html "Permalink")  trait [ClassicActorContextProvider](ClassicActorContextProvider.html "Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.

Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.

Not for user extension.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
35. [**](../../akka/actor/ClassicActorSystemProvider.html "Permalink")  trait [ClassicActorSystemProvider](ClassicActorSystemProvider.html "Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.

Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.

Not for user extension.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
36. [**](../../akka/actor/CoordinatedShutdown.html "Permalink") final  class [CoordinatedShutdown](CoordinatedShutdown.html "Not for user instantiation, use the extension to access") extends [Extension](Extension.html)Not for user instantiation, use the extension to access
37. [**](../../akka/actor/DeadLetter.html "Permalink") final  case class [DeadLetter](DeadLetter.html "When a message is sent to an Actor that is terminated before receiving the message, it will be sent as a DeadLetter to the ActorSystem's EventStream.")(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](ActorRef.html), recipient: [ActorRef](ActorRef.html)) extends [AllDeadLetters](AllDeadLetters.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen a message is sent to an Actor that is terminated before receiving the message, it will be sent as a DeadLetter
to the ActorSystem's EventStream.

When a message is sent to an Actor that is terminated before receiving the message, it will be sent as a DeadLetter
to the ActorSystem's EventStream.

When this message was sent without a sender [ActorRef](ActorRef.html), `sender` will be `system.deadLetters`.

Annotations@SerialVersionUID()
38. [**](../../akka/actor/DeadLetterSuppression.html "Permalink")  trait [DeadLetterSuppression](DeadLetterSuppression.html "Use with caution: Messages extending this trait will not be logged by the default dead-letters listener.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Use with caution: Messages extending this trait will not be logged by the default dead\-letters listener.

Use with caution: Messages extending this trait will not be logged by the default dead\-letters listener.
Instead they will be wrapped as [SuppressedDeadLetter](SuppressedDeadLetter.html) and may be subscribed for explicitly.
39. [**](../../akka/actor/DeathPactException.html "Permalink") final  case class [DeathPactException](DeathPactException.html "A DeathPactException is thrown by an Actor that receives a Terminated(someActor) message that it doesn't handle itself, effectively crashing the Actor and escalating to the supervisor.") extends [AkkaException](../AkkaException.html) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA DeathPactException is thrown by an Actor that receives a Terminated(someActor) message
that it doesn't handle itself, effectively crashing the Actor and escalating to the supervisor.

A DeathPactException is thrown by an Actor that receives a Terminated(someActor) message
that it doesn't handle itself, effectively crashing the Actor and escalating to the supervisor.

Annotations@SerialVersionUID()
40. [**](../../akka/actor/DefaultSupervisorStrategy.html "Permalink") final  class [DefaultSupervisorStrategy](DefaultSupervisorStrategy.html) extends [SupervisorStrategyConfigurator](SupervisorStrategyConfigurator.html)
41. [**](../../akka/actor/Deploy.html "Permalink") final  class [Deploy](Deploy.html "This class represents deployment configuration for a given actor path.") extends Serializable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)This class represents deployment configuration for a given actor path.

This class represents deployment configuration for a given actor path. It is
marked final in order to guarantee stable merge semantics (i.e. what
overrides what in case multiple configuration sources are available) and is
fully extensible via its Scope argument, and by the fact that an arbitrary
Config section can be passed along with it (which will be merged when merging
two Deploys).

The path field is used only when inserting the Deploy into a deployer and
not needed when just doing deploy\-as\-you\-go:

```
val remoteProps = someProps.withDeploy(Deploy(scope = RemoteScope("someOtherNodeName")))
```
Annotations@SerialVersionUID()
42. [**](../../akka/actor/DiagnosticActorLogging.html "Permalink")  trait [DiagnosticActorLogging](DiagnosticActorLogging.html "Scala API: Mix in DiagnosticActorLogging into your Actor to easily obtain a reference to a logger with MDC support, which is available under the name \"log\".") extends [Actor](Actor.html)Scala API: Mix in DiagnosticActorLogging into your Actor to easily obtain a reference to a logger with MDC support,
which is available under the name "log".

Scala API: Mix in DiagnosticActorLogging into your Actor to easily obtain a reference to a logger with MDC support,
which is available under the name "log".
In the example bellow "the one who knocks" will be available under the key "iam" for using it in the logback pattern.

```
class MyActor extends Actor with DiagnosticActorLogging {

  override def mdc(currentMessage: Any): MDC = {
    Map("iam", "the one who knocks")
  }

  def receive = {
    case "pigdog" => log.info("We've got yet another pigdog on our hands")
  }
}
```
43. [**](../../akka/actor/Dropped.html "Permalink") final  case class [Dropped](Dropped.html "Envelope that is published on the eventStream wrapped in akka.actor.DeadLetter for every message that is dropped due to overfull queues or routers with no routees.")(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), reason: String, sender: [ActorRef](ActorRef.html), recipient: [ActorRef](ActorRef.html)) extends [AllDeadLetters](AllDeadLetters.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableEnvelope that is published on the eventStream wrapped in [akka.actor.DeadLetter](DeadLetter.html) for every message that is
dropped due to overfull queues or routers with no routees.

Envelope that is published on the eventStream wrapped in [akka.actor.DeadLetter](DeadLetter.html) for every message that is
dropped due to overfull queues or routers with no routees.

When this message was sent without a sender [ActorRef](ActorRef.html), `sender` will be `ActorRef.noSender`, i.e. `null`.
44. [**](../../akka/actor/DynamicAccess.html "Permalink") abstract  class [DynamicAccess](DynamicAccess.html "The DynamicAccess implementation is the class which is used for loading all configurable parts of an actor system (the akka.actor.ReflectiveDynamicAccess is the default implementation).") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The DynamicAccess implementation is the class which is used for
loading all configurable parts of an actor system (the
[akka.actor.ReflectiveDynamicAccess](ReflectiveDynamicAccess.html) is the default implementation).

The DynamicAccess implementation is the class which is used for
loading all configurable parts of an actor system (the
[akka.actor.ReflectiveDynamicAccess](ReflectiveDynamicAccess.html) is the default implementation).

This is an internal facility and users are not expected to encounter it
unless they are extending Akka in ways which go beyond simple Extensions.

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
45. [**](../../akka/actor/ExtendedActorSystem.html "Permalink") abstract  class [ExtendedActorSystem](ExtendedActorSystem.html "More powerful interface to the actor system’s implementation which is presented to extensions (see akka.actor.Extension).") extends [ActorSystem](ActorSystem.html)More powerful interface to the actor system’s implementation which is presented to extensions (see [akka.actor.Extension](Extension.html)).

More powerful interface to the actor system’s implementation which is presented to extensions (see [akka.actor.Extension](Extension.html)).

***Important Notice:***

This class is not meant to be extended by user code. If you want to
actually roll your own Akka, beware that you are completely on your own in
that case!

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
46. [**](../../akka/actor/Extension.html "Permalink")  trait [Extension](Extension.html "The basic ActorSystem covers all that is needed for locally running actors, using futures and so on.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The basic ActorSystem covers all that is needed for locally running actors,
using futures and so on.

The basic ActorSystem covers all that is needed for locally running actors,
using futures and so on. In addition, more features can hook into it and
thus become visible to actors et al by registering themselves as extensions.
This is accomplished by providing an extension—which is an object
implementing this trait—to `ActorSystem.registerExtension(...)` or by
specifying the corresponding option in the configuration passed to
ActorSystem, which will then instantiate (without arguments) each FQCN and
register the result.

The extension itself can be created in any way desired and has full access
to the ActorSystem implementation.

This trait is only a marker interface to signify an Akka Extension. This is
how an extension is normally constructed.

Scala API:

```
object MyExt extends ExtensionId[Ext] with ExtensionIdProvider {

  override def lookup = MyExt

  override def createExtension(system: ExtendedActorSystem): Ext = new Ext(system)

  // Java API: retrieve the extension for the given system.
  override def get(system: ActorSystem): UdpExt = super.get(system)
  override def get(system: ClassicActorSystemProvider): UdpExt = super.get(system)
}

class Ext(system: ExtendedActorSystem) extends Extension {
  ...
}
```
Java API:

```
public class MyExt extends AbstractExtensionId<MyExtImpl>
  implements ExtensionIdProvider {
  public final static MyExt MyExtProvider = new MyExt();

  private MyExt() {}

  public MyExt lookup() {
    return MyExt.MyExtProvider;
  }

  public MyExtImpl createExtension(ExtendedActorSystem system) {
    return new MyExtImpl();
  }
}

public class MyExtImpl implements Extension {
   ...
}
```
47. [**](../../akka/actor/ExtensionId.html "Permalink")  trait [ExtensionId](ExtensionId.html "Identifies an Extension Lookup of Extensions is done by object identity, so the Id must be the same wherever it's used, otherwise you'll get the same extension loaded multiple times.")\[T \<: [Extension](Extension.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Identifies an Extension
Lookup of Extensions is done by object identity, so the Id must be the same wherever it's used,
otherwise you'll get the same extension loaded multiple times.
48. [**](../../akka/actor/ExtensionIdProvider.html "Permalink")  trait [ExtensionIdProvider](ExtensionIdProvider.html "To be able to load an ExtensionId from the configuration, a class that implements ExtensionIdProvider must be specified.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)To be able to load an ExtensionId from the configuration,
a class that implements ExtensionIdProvider must be specified.

To be able to load an ExtensionId from the configuration,
a class that implements ExtensionIdProvider must be specified.
The lookup method should return the canonical reference to the extension.
49. [**](../../akka/actor/FSM.html "Permalink")  trait [FSM](FSM.html "Finite State Machine actor trait.")\[S, D] extends [Actor](Actor.html) with [Listeners](../routing/Listeners.html) with [ActorLogging](ActorLogging.html)Finite State Machine actor trait.

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
	- `stop` for terminating this FSM actorEach of the above also supports the method `replying(AnyRef)` for
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
50. [**](../../akka/actor/Identify.html "Permalink") final  case class [Identify](Identify.html "A message all Actors will understand, that when processed will reply with akka.actor.ActorIdentity containing the ActorRef.")(messageId: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends AutoReceivedMessage with [NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA message all Actors will understand, that when processed will reply with
[akka.actor.ActorIdentity](ActorIdentity.html) containing the `ActorRef`.

A message all Actors will understand, that when processed will reply with
[akka.actor.ActorIdentity](ActorIdentity.html) containing the `ActorRef`. The `messageId`
is returned in the `ActorIdentity` message as `correlationId`.

Annotations@SerialVersionUID()
51. [**](../../akka/actor/IllegalActorStateException.html "Permalink") final  case class [IllegalActorStateException](IllegalActorStateException.html "IllegalActorStateException is thrown when a core invariant in the Actor implementation has been violated.") extends [AkkaException](../AkkaException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableIllegalActorStateException is thrown when a core invariant in the Actor implementation has been violated.

IllegalActorStateException is thrown when a core invariant in the Actor implementation has been violated.
For instance, if you try to create an Actor that doesn't extend Actor.

Not for user instatiation

Annotations@SerialVersionUID()
52. [**](../../akka/actor/IndirectActorProducer.html "Permalink")  trait [IndirectActorProducer](IndirectActorProducer.html "This interface defines a class of actor creation strategies deviating from the usual default of just reflectively instantiating the Actor subclass.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This interface defines a class of actor creation strategies deviating from
the usual default of just reflectively instantiating the [Actor](Actor.html)
subclass.

This interface defines a class of actor creation strategies deviating from
the usual default of just reflectively instantiating the [Actor](Actor.html)
subclass. It can be used to allow a dependency injection framework to
determine the actual actor class and how it shall be instantiated.
53. [**](../../akka/actor/InvalidActorNameException.html "Permalink") final  case class [InvalidActorNameException](InvalidActorNameException.html "An InvalidActorNameException is thrown when you try to convert something, usually a String, to an Actor name which doesn't validate.")(message: String) extends [AkkaException](../AkkaException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAn InvalidActorNameException is thrown when you try to convert something, usually a String, to an Actor name
which doesn't validate.

An InvalidActorNameException is thrown when you try to convert something, usually a String, to an Actor name
which doesn't validate.

Annotations@SerialVersionUID()
54. [**](../../akka/actor/InvalidMessageException.html "Permalink") final  case class [InvalidMessageException](InvalidMessageException.html "InvalidMessageException is thrown when an invalid message is sent to an Actor; Currently only null is an invalid message.") extends [AkkaException](../AkkaException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInvalidMessageException is thrown when an invalid message is sent to an Actor;
Currently only `null` is an invalid message.

InvalidMessageException is thrown when an invalid message is sent to an Actor;
Currently only `null` is an invalid message.

Annotations@SerialVersionUID()
55. [**](../../akka/actor/Kill.html "Permalink") abstract  class [Kill](Kill.html) extends AutoReceivedMessage with [PossiblyHarmful](PossiblyHarmful.html)
56. [**](../../akka/actor/LightArrayRevolverScheduler.html "Permalink")  class [LightArrayRevolverScheduler](LightArrayRevolverScheduler.html "This scheduler implementation is based on a revolving wheel of buckets, like Netty’s HashedWheelTimer, which it advances at a fixed tick rate and dispatches tasks it finds in the current bucket to their respective ExecutionContexts.") extends [Scheduler](Scheduler.html) with [Closeable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Closeable.html#java.io.Closeable)This scheduler implementation is based on a revolving wheel of buckets,
like Netty’s HashedWheelTimer, which it advances at a fixed tick rate and
dispatches tasks it finds in the current bucket to their respective
ExecutionContexts.

This scheduler implementation is based on a revolving wheel of buckets,
like Netty’s HashedWheelTimer, which it advances at a fixed tick rate and
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
“now() \+ delay \<\= nextTick” were done).
57. [**](../../akka/actor/LocalScope.html "Permalink") abstract  class [LocalScope](LocalScope.html) extends [Scope](Scope.html)Annotations@nowarn() @SerialVersionUID()
58. [**](../../akka/actor/LoggingFSM.html "Permalink")  trait [LoggingFSM](LoggingFSM.html "Stackable trait for akka.actor.FSM which adds a rolling event log and debug logging capabilities (analogous to akka.event.LoggingReceive).")\[S, D] extends [FSM](FSM.html)\[S, D]Stackable trait for [akka.actor.FSM](FSM.html) which adds a rolling event log and
debug logging capabilities (analogous to [akka.event.LoggingReceive](../event/LoggingReceive.html)).

Stackable trait for [akka.actor.FSM](FSM.html) which adds a rolling event log and
debug logging capabilities (analogous to [akka.event.LoggingReceive](../event/LoggingReceive.html)).

Since1\.2
59. [**](../../akka/actor/NoScopeGiven.html "Permalink") abstract  class [NoScopeGiven](NoScopeGiven.html "This is the default value and as such allows overrides.") extends [Scope](Scope.html)This is the default value and as such allows overrides.

This is the default value and as such allows overrides.

Annotations@nowarn() @SerialVersionUID()
60. [**](../../akka/actor/NoSerializationVerificationNeeded.html "Permalink")  trait [NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html "Marker trait to signal that this class should not be verified for serializability.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Marker trait to signal that this class should not be verified for serializability.
61. [**](../../akka/actor/NotInfluenceReceiveTimeout.html "Permalink")  trait [NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html "Marker trait to indicate that a message should not reset the receive timeout.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Marker trait to indicate that a message should not reset the receive timeout.
62. [**](../../akka/actor/OneForOneStrategy.html "Permalink")  case class [OneForOneStrategy](OneForOneStrategy.html "Applies the fault handling Directive (Resume, Restart, Stop) specified in the Decider to the child actor that failed, as opposed to akka.actor.AllForOneStrategy that applies it to all children.")(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= \-1, withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true)(decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive])) extends [SupervisorStrategy](SupervisorStrategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableApplies the fault handling `Directive` (Resume, Restart, Stop) specified in the `Decider`
to the child actor that failed, as opposed to [akka.actor.AllForOneStrategy](AllForOneStrategy.html) that applies
it to all children.

Applies the fault handling `Directive` (Resume, Restart, Stop) specified in the `Decider`
to the child actor that failed, as opposed to [akka.actor.AllForOneStrategy](AllForOneStrategy.html) that applies
it to all children.

maxNrOfRetriesthe number of times a child actor is allowed to be restarted, negative value means no limit
 if the duration is infinite. If the limit is exceeded the child actor is stopped

withinTimeRangeduration of the time window for maxNrOfRetries, Duration.Inf means no window

loggingEnabledthe strategy logs the failure if this is enabled (true), by default it is enabled

decidermapping from Throwable to [akka.actor.SupervisorStrategy.Directive](SupervisorStrategy$$Directive.html), you can also use a
 [scala.collection.immutable.Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html) of Throwables which maps the given Throwables to restarts, otherwise escalates.
63. [**](../../akka/actor/PoisonPill.html "Permalink") abstract  class [PoisonPill](PoisonPill.html) extends AutoReceivedMessage with [PossiblyHarmful](PossiblyHarmful.html) with [DeadLetterSuppression](DeadLetterSuppression.html)
64. [**](../../akka/actor/PossiblyHarmful.html "Permalink")  trait [PossiblyHarmful](PossiblyHarmful.html "Marker trait to indicate that a message might be potentially harmful, this is used to block messages coming in over remoting.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Marker trait to indicate that a message might be potentially harmful,
this is used to block messages coming in over remoting.
65. [**](../../akka/actor/PostRestartException.html "Permalink") final  case class [PostRestartException](PostRestartException.html "A PostRestartException is thrown when constructor or postRestart() method fails during a restart attempt.") extends [ActorInitializationException](ActorInitializationException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA PostRestartException is thrown when constructor or postRestart() method
fails during a restart attempt.

A PostRestartException is thrown when constructor or postRestart() method
fails during a restart attempt.

Annotations@SerialVersionUID()
66. [**](../../akka/actor/PreRestartException.html "Permalink") final  case class [PreRestartException](PreRestartException.html "A PreRestartException is thrown when the preRestart() method failed; this exception is not propagated to the supervisor, as it originates from the already failed instance, hence it is only visible as log entry on the event stream.") extends [ActorInitializationException](ActorInitializationException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA PreRestartException is thrown when the preRestart() method failed; this
exception is not propagated to the supervisor, as it originates from the
already failed instance, hence it is only visible as log entry on the event
stream.

A PreRestartException is thrown when the preRestart() method failed; this
exception is not propagated to the supervisor, as it originates from the
already failed instance, hence it is only visible as log entry on the event
stream.

Annotations@SerialVersionUID()
67. [**](../../akka/actor/Props.html "Permalink") final  case class [Props](Props.html "Props is a configuration object using in creating an Actor; it is immutable, so it is thread-safe and fully shareable.")(deploy: [Deploy](Deploy.html), clazz: Class\[\_], args: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableProps is a configuration object using in creating an [Actor](Actor.html); it is
immutable, so it is thread\-safe and fully shareable.

Props is a configuration object using in creating an [Actor](Actor.html); it is
immutable, so it is thread\-safe and fully shareable.

Examples on Scala API:

```
val props = Props.empty
val props = Props[MyActor]
val props = Props(classOf[MyActor], arg1, arg2)

val otherProps = props.withDispatcher("dispatcher-id")
val otherProps = props.withDeploy(<deployment info>)
```
Examples on Java API:

```
final Props props = Props.empty();
final Props props = Props.create(MyActor.class, arg1, arg2);

final Props otherProps = props.withDispatcher("dispatcher-id");
final Props otherProps = props.withDeploy(<deployment info>);
```
Annotations@SerialVersionUID()
68. [**](../../akka/actor/ProviderSelection.html "Permalink") abstract  class [ProviderSelection](ProviderSelection.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
69. [**](../../akka/actor/ReceiveTimeout.html "Permalink") abstract  class [ReceiveTimeout](ReceiveTimeout.html) extends [PossiblyHarmful](PossiblyHarmful.html)
70. [**](../../akka/actor/ReflectiveDynamicAccess.html "Permalink")  class [ReflectiveDynamicAccess](ReflectiveDynamicAccess.html "This is the default akka.actor.DynamicAccess implementation used by akka.actor.ExtendedActorSystem unless overridden.") extends [DynamicAccess](DynamicAccess.html)This is the default [akka.actor.DynamicAccess](DynamicAccess.html) implementation used by [akka.actor.ExtendedActorSystem](ExtendedActorSystem.html)
unless overridden.

This is the default [akka.actor.DynamicAccess](DynamicAccess.html) implementation used by [akka.actor.ExtendedActorSystem](ExtendedActorSystem.html)
unless overridden. It uses reflection to turn fully\-qualified class names into `Class[_]` objects
and creates instances from there using `getDeclaredConstructor()` and invoking that. The class loader
to be used for all this is determined by the actor system’s class loader by default.

Not for user extension or construction

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
71. [**](../../akka/actor/RootActorPath.html "Permalink") final  case class [RootActorPath](RootActorPath.html "Root of the hierarchy of ActorPaths.")(address: [Address](Address.html), name: String \= "/") extends [ActorPath](ActorPath.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRoot of the hierarchy of ActorPaths.

Root of the hierarchy of ActorPaths. There is exactly root per ActorSystem
and node (for remote\-enabled or clustered systems).

Annotations@SerialVersionUID()
72. [**](../../akka/actor/ScalaActorSelection.html "Permalink")  trait [ScalaActorSelection](ScalaActorSelection.html "Contains the Scala API (!-method) for ActorSelections) which provides automatic tracking of the sender, as per the usual implicit ActorRef pattern.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains the Scala API (!\-method) for ActorSelections) which provides automatic tracking of the sender,
as per the usual implicit ActorRef pattern.
73. [**](../../akka/actor/Scheduler.html "Permalink")  trait [Scheduler](Scheduler.html "An Akka scheduler service.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An Akka scheduler service.

An Akka scheduler service.

For scheduling within actors `with Timers` should be preferred.

Please note that this scheduler implementation is highly optimised for high\-throughput
and high\-frequency events. It is not to be confused with long\-term schedulers such as
Quartz. The scheduler will throw an exception if attempts are made to schedule too far
into the future (which by default is around 8 months (`Int.MaxValue` seconds).

It's possible to implement a custom `Scheduler`, although that should rarely be needed.

A `Scheduler` implementation needs one special behavior: if
Closeable, it MUST execute all outstanding tasks that implement [Scheduler.TaskRunOnClose](Scheduler$$TaskRunOnClose.html)
upon .close() in order to properly shutdown all dispatchers.

Furthermore, this timer service MUST throw IllegalStateException if it
cannot schedule a task. Once scheduled, the task MUST be executed. If
executed upon close(), the task may execute before its timeout.

Scheduler implementation are loaded reflectively at ActorSystem start\-up
with the following constructor arguments:
 1\) the system’s com.typesafe.config.Config (from system.settings.config)
 2\) a akka.event.LoggingAdapter
 3\) a java.util.concurrent.ThreadFactory
74. [**](../../akka/actor/Scope.html "Permalink")  trait [Scope](Scope.html "The scope of a akka.actor.Deploy serves two purposes: as a marker for pattern matching the “scope” (i.e.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The scope of a [akka.actor.Deploy](Deploy.html) serves two purposes: as a marker for
pattern matching the “scope” (i.e.

The scope of a [akka.actor.Deploy](Deploy.html) serves two purposes: as a marker for
pattern matching the “scope” (i.e. local/remote/cluster) as well as for
extending the information carried by the final Deploy class. Scopes can be
used in conjunction with a custom [akka.actor.ActorRefProvider](ActorRefProvider.html), making
Akka actors fully extensible.
75. [**](../../akka/actor/Stash.html "Permalink")  trait [Stash](Stash.html "The Stash trait enables an actor to temporarily stash away messages that can not or should not be handled using the actor's current behavior.") extends [UnrestrictedStash](UnrestrictedStash.html) with [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html)] The `Stash` trait enables an actor to temporarily stash away messages that can not or
 should not be handled using the actor's current behavior.

 The `Stash` trait enables an actor to temporarily stash away messages that can not or
 should not be handled using the actor's current behavior.

 Example:

```

   class ActorWithProtocol extends Actor with Stash {
     def receive = {
       case "open" =>
         unstashAll()
         context.become({
           case "write" => // do writing...
           case "close" =>
             unstashAll()
             context.unbecome()
           case msg => stash()
         }, discardOld = false)
       case "done" => // done
       case msg    => stash()
     }
   }

```
 Note that the `Stash` trait can only be used together with actors that have a deque\-based
 mailbox. By default Stash based actors request a Deque based mailbox since the stash
 trait extends `RequiresMessageQueue[DequeBasedMessageQueueSemantics]`.
 You can override the default mailbox provided when `DequeBasedMessageQueueSemantics` are requested via config:

```

   akka.actor.mailbox.requirements {
     "akka.dispatch.BoundedDequeBasedMessageQueueSemantics" = your-custom-mailbox
   }

```

 Alternatively, you can add your own requirement marker to the actor and configure a mailbox type to be used
 for your marker. For a `Stash` that also enforces unboundedness of the deque see [akka.actor.UnboundedStash](UnboundedStash.html). For a `Stash`
 that does not enforce any mailbox type see [akka.actor.UnrestrictedStash](UnrestrictedStash.html).

 Note that the `Stash` trait must be mixed into (a subclass of) the `Actor` trait before
 any trait/class that overrides the `preRestart` callback. This means it's not possible to write
 `Actor with MyActor with Stash` if `MyActor` overrides `preRestart`.
76. [**](../../akka/actor/StashOverflowException.html "Permalink")  class [StashOverflowException](StashOverflowException.html "Is thrown when the size of the Stash exceeds the capacity of the Stash") extends [AkkaException](../AkkaException.html) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)Is thrown when the size of the Stash exceeds the capacity of the Stash
77. [**](../../akka/actor/StoppingSupervisorStrategy.html "Permalink") final  class [StoppingSupervisorStrategy](StoppingSupervisorStrategy.html) extends [SupervisorStrategyConfigurator](SupervisorStrategyConfigurator.html)
78. [**](../../akka/actor/SupervisorStrategy.html "Permalink") abstract  class [SupervisorStrategy](SupervisorStrategy.html "An Akka SupervisorStrategy is the policy to apply for crashing children.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An Akka SupervisorStrategy is the policy to apply for crashing children.

An Akka SupervisorStrategy is the policy to apply for crashing children.

**IMPORTANT:**

You should not normally need to create new subclasses, instead use the
existing [akka.actor.OneForOneStrategy](OneForOneStrategy.html) or [akka.actor.AllForOneStrategy](AllForOneStrategy.html),
but if you do, please read the docs of the methods below carefully, as
incorrect implementations may lead to “blocked” actor systems (i.e.
permanently suspended actors).
79. [**](../../akka/actor/SupervisorStrategyConfigurator.html "Permalink")  trait [SupervisorStrategyConfigurator](SupervisorStrategyConfigurator.html "Implement this interface in order to configure the supervisorStrategy for the top-level guardian actor (/user).") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Implement this interface in order to configure the supervisorStrategy for
the top\-level guardian actor (`/user`).

Implement this interface in order to configure the supervisorStrategy for
the top\-level guardian actor (`/user`). An instance of this class must be
instantiable using a no\-arg constructor.
80. [**](../../akka/actor/SupervisorStrategyLowPriorityImplicits.html "Permalink")  trait [SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
81. [**](../../akka/actor/SuppressedDeadLetter.html "Permalink") final  case class [SuppressedDeadLetter](SuppressedDeadLetter.html "Similar to DeadLetter with the slight twist of NOT being logged by the default dead letters listener.")(message: [DeadLetterSuppression](DeadLetterSuppression.html), sender: [ActorRef](ActorRef.html), recipient: [ActorRef](ActorRef.html)) extends [AllDeadLetters](AllDeadLetters.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSimilar to [DeadLetter](DeadLetter.html) with the slight twist of NOT being logged by the default dead letters listener.

Similar to [DeadLetter](DeadLetter.html) with the slight twist of NOT being logged by the default dead letters listener.
Messages which end up being suppressed dead letters are internal messages for which ending up as dead\-letter is both expected and harmless.

It is possible to subscribe to suppressed dead letters on the ActorSystem's EventStream explicitly.

Annotations@SerialVersionUID()
82. [**](../../akka/actor/Terminated.html "Permalink") final  case class [Terminated](Terminated.html "When Death Watch is used, the watcher will receive a Terminated(watched) message when watched is terminated.") extends AutoReceivedMessage with [PossiblyHarmful](PossiblyHarmful.html) with [DeadLetterSuppression](DeadLetterSuppression.html) with [NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen Death Watch is used, the watcher will receive a Terminated(watched)
message when watched is terminated.

When Death Watch is used, the watcher will receive a Terminated(watched)
message when watched is terminated.
Terminated message can't be forwarded to another actor, since that actor
might not be watching the subject. Instead, if you need to forward Terminated
to another actor you should send the information in your own message.

Annotations@SerialVersionUID()
83. [**](../../akka/actor/TimerScheduler.html "Permalink") abstract  class [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Support for scheduled `self` messages in an actor.

Support for scheduled `self` messages in an actor.
It is used by mixing in trait `Timers` in Scala or extending `AbstractActorWithTimers`
in Java.

Timers are bound to the lifecycle of the actor that owns it,
and thus are cancelled automatically when it is restarted or stopped.

`TimerScheduler` is not thread\-safe, i.e. it must only be used within
the actor that owns it.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
84. [**](../../akka/actor/Timers.html "Permalink")  trait [Timers](Timers.html "Scala API: Mix in Timers into your Actor to get support for scheduled self messages via TimerScheduler.") extends [Actor](Actor.html)Scala API: Mix in Timers into your Actor to get support for scheduled
`self` messages via [TimerScheduler](TimerScheduler.html).

Scala API: Mix in Timers into your Actor to get support for scheduled
`self` messages via [TimerScheduler](TimerScheduler.html).

Timers are bound to the lifecycle of the actor that owns it,
and thus are cancelled automatically when it is restarted or stopped.
85. [**](../../akka/actor/UnboundedStash.html "Permalink")  trait [UnboundedStash](UnboundedStash.html "The UnboundedStash trait is a version of akka.actor.Stash that enforces an unbounded stash for you actor.") extends [UnrestrictedStash](UnrestrictedStash.html) with [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[UnboundedDequeBasedMessageQueueSemantics](../dispatch/UnboundedDequeBasedMessageQueueSemantics.html)]The `UnboundedStash` trait is a version of [akka.actor.Stash](Stash.html) that enforces an unbounded stash for you actor.
86. [**](../../akka/actor/UnhandledMessage.html "Permalink") final  case class [UnhandledMessage](UnhandledMessage.html "This message is published to the EventStream whenever an Actor receives a message it doesn't understand")(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](ActorRef.html), recipient: [ActorRef](ActorRef.html)) extends [NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html) with [WrappedMessage](WrappedMessage.html) with [AllDeadLetters](AllDeadLetters.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis message is published to the EventStream whenever an Actor receives a message it doesn't understand

This message is published to the EventStream whenever an Actor receives a message it doesn't understand

Annotations@SerialVersionUID()
87. [**](../../akka/actor/UnrestrictedStash.html "Permalink")  trait [UnrestrictedStash](UnrestrictedStash.html "A version of akka.actor.Stash that does not enforce any mailbox type.") extends [Actor](Actor.html) with StashSupportA version of [akka.actor.Stash](Stash.html) that does not enforce any mailbox type.

A version of [akka.actor.Stash](Stash.html) that does not enforce any mailbox type. The proper mailbox has to be configured
manually, and the mailbox should extend the [akka.dispatch.DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html) marker trait.
88. [**](../../akka/actor/UntypedAbstractActor.html "Permalink") abstract  class [UntypedAbstractActor](UntypedAbstractActor.html "If the validation of the ReceiveBuilder match logic turns out to be a bottleneck for some of your actors you can consider to implement it at lower level by extending UntypedAbstractActor instead of AbstractActor.") extends [AbstractActor](AbstractActor.html)If the validation of the `ReceiveBuilder` match logic turns out to be a bottleneck for some of your
actors you can consider to implement it at lower level by extending `UntypedAbstractActor` instead
of `AbstractActor`.

If the validation of the `ReceiveBuilder` match logic turns out to be a bottleneck for some of your
actors you can consider to implement it at lower level by extending `UntypedAbstractActor` instead
of `AbstractActor`. The partial functions created by the `ReceiveBuilder` consist of multiple lambda
expressions for every match statement, where each lambda is referencing the code to be run. This is something
that the JVM can have problems optimizing and the resulting code might not be as performant as the
untyped version. When extending `UntypedAbstractActor` each message is received as an untyped
`Object` and you have to inspect and cast it to the actual message type in other ways (instanceof checks).
89. [**](../../akka/actor/WrappedMessage.html "Permalink")  trait [WrappedMessage](WrappedMessage.html "Message envelopes may implement this trait for better logging, such as logging of message class name of the wrapped message instead of the envelope class name.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Message envelopes may implement this trait for better logging, such as logging of
message class name of the wrapped message instead of the envelope class name.
### Deprecated Type Members

1. [**](../../akka/actor/ScalaActorRef.html "Permalink")  trait [ScalaActorRef](ScalaActorRef.html "This trait represents the Scala Actor API There are implicit conversions in package.scala from ActorRef -> ScalaActorRef and back") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This trait represents the Scala Actor API
There are implicit conversions in package.scala
from ActorRef \-\> ScalaActorRef and back

This trait represents the Scala Actor API
There are implicit conversions in package.scala
from ActorRef \-\> ScalaActorRef and back

Annotations@deprecated Deprecated*(Since version 2\.6\.13\)* tell method is now provided by ActorRef trait
### Value Members

1. [**](../../akka/actor/AbstractActor$.html "Permalink")  object [AbstractActor](AbstractActor$.html "Java API: compatible with lambda expressions")Java API: compatible with lambda expressions
2. [**](../../akka/actor/AbstractFSM$.html "Permalink")  object [AbstractFSM](AbstractFSM$.html "Java API: compatible with lambda expressions")Java API: compatible with lambda expressions
3. [**](../../akka/actor/Actor$.html "Permalink")  object [Actor](Actor$.html)
4. [**](../../akka/actor/ActorInitializationException$.html "Permalink")  object [ActorInitializationException](ActorInitializationException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../akka/actor/ActorLogMarker$.html "Permalink")  object [ActorLogMarker](ActorLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")This is public with the purpose to document the used markers and properties of log events.

This is public with the purpose to document the used markers and properties of log events.
No guarantee that it will remain binary compatible, but the marker names and properties
are considered public API and will not be changed without notice.
6. [**](../../akka/actor/ActorPath$.html "Permalink")  object [ActorPath](ActorPath$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
7. [**](../../akka/actor/ActorPathExtractor$.html "Permalink")  object [ActorPathExtractor](ActorPathExtractor$.html "Given an ActorPath it returns the Address and the path elements if the path is well-formed") extends PathUtilsGiven an ActorPath it returns the Address and the path elements if the path is well\-formed
8. [**](../../akka/actor/ActorPaths$.html "Permalink")  object [ActorPaths](ActorPaths$.html "Java API")Java API
9. [**](../../akka/actor/ActorRef$.html "Permalink")  object [ActorRef](ActorRef$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
10. [**](../../akka/actor/ActorSelection$.html "Permalink")  object [ActorSelection](ActorSelection$.html "An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors, allowing for broadcasting of messages to that section.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors,
allowing for broadcasting of messages to that section.
11. [**](../../akka/actor/ActorSystem$.html "Permalink")  object [ActorSystem](ActorSystem$.html)
12. [**](../../akka/actor/Address$.html "Permalink")  object [Address](Address$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
13. [**](../../akka/actor/AddressFromURIString$.html "Permalink")  object [AddressFromURIString](AddressFromURIString$.html "This object serves as extractor for Scala and as address parser for Java.")This object serves as extractor for Scala and as address parser for Java.
14. [**](../../akka/actor/BootstrapSetup$.html "Permalink")  object [BootstrapSetup](BootstrapSetup$.html)
15. [**](../../akka/actor/Cancellable$.html "Permalink")  object [Cancellable](Cancellable$.html)
16. [**](../../akka/actor/CoordinatedShutdown$.html "Permalink")  object [CoordinatedShutdown](CoordinatedShutdown$.html) extends [ExtensionId](ExtensionId.html)\[[CoordinatedShutdown](CoordinatedShutdown.html)] with [ExtensionIdProvider](ExtensionIdProvider.html)
17. [**](../../akka/actor/Deploy$.html "Permalink")  object [Deploy](Deploy$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
18. [**](../../akka/actor/Dropped$.html "Permalink")  object [Dropped](Dropped$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
19. [**](../../akka/actor/FSM$.html "Permalink")  object [FSM](FSM$.html)
20. [**](../../akka/actor/Kill$.html "Permalink")  case object [Kill](Kill$.html "A message all Actors will understand, that when processed will make the Actor throw an ActorKilledException, which will trigger supervision.") extends [Kill](Kill.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA message all Actors will understand, that when processed will make the Actor throw an ActorKilledException,
which will trigger supervision.

A message all Actors will understand, that when processed will make the Actor throw an ActorKilledException,
which will trigger supervision.

Annotations@SerialVersionUID()
21. [**](../../akka/actor/LightArrayRevolverScheduler$.html "Permalink")  object [LightArrayRevolverScheduler](LightArrayRevolverScheduler$.html)
22. [**](../../akka/actor/LocalScope$.html "Permalink")  case object [LocalScope](LocalScope$.html "The Local Scope is the default one, which is assumed on all deployments which do not set a different scope.") extends [LocalScope](LocalScope.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe Local Scope is the default one, which is assumed on all deployments
which do not set a different scope.

The Local Scope is the default one, which is assumed on all deployments
which do not set a different scope. It is also the only scope handled by
the LocalActorRefProvider.

Annotations@SerialVersionUID()
23. [**](../../akka/actor/NoScopeGiven$.html "Permalink")  case object [NoScopeGiven](NoScopeGiven$.html) extends [NoScopeGiven](NoScopeGiven.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
24. [**](../../akka/actor/OriginalRestartException$.html "Permalink")  object [OriginalRestartException](OriginalRestartException$.html "This is an extractor for retrieving the original cause (i.e.")This is an extractor for retrieving the original cause (i.e.

This is an extractor for retrieving the original cause (i.e. the first
failure) from a [akka.actor.PostRestartException](PostRestartException.html). In the face of multiple
“nested” restarts it will walk the origCause\-links until it arrives at a
non\-PostRestartException type.

Annotations@SerialVersionUID()
25. [**](../../akka/actor/PoisonPill$.html "Permalink")  case object [PoisonPill](PoisonPill$.html "A message all Actors will understand, that when processed will terminate the Actor permanently.") extends [PoisonPill](PoisonPill.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA message all Actors will understand, that when processed will terminate the Actor permanently.

A message all Actors will understand, that when processed will terminate the Actor permanently.

Annotations@SerialVersionUID()
26. [**](../../akka/actor/Props$.html "Permalink")  object [Props](Props$.html "Factory for Props instances.") extends AbstractProps with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Factory for Props instances.

Factory for Props instances.

Props is a ActorRef configuration object, that is immutable, so it is thread safe and fully sharable.

Used when creating new actors through `ActorSystem.actorOf` and `ActorContext.actorOf`.
27. [**](../../akka/actor/ProviderSelection$.html "Permalink")  object [ProviderSelection](ProviderSelection$.html)
28. [**](../../akka/actor/ReceiveTimeout$.html "Permalink")  case object [ReceiveTimeout](ReceiveTimeout$.html "When using ActorContext.setReceiveTimeout, the singleton instance of ReceiveTimeout will be sent to the Actor when there hasn't been any message for that long.") extends [ReceiveTimeout](ReceiveTimeout.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen using ActorContext.setReceiveTimeout, the singleton instance of ReceiveTimeout will be sent
to the Actor when there hasn't been any message for that long.

When using ActorContext.setReceiveTimeout, the singleton instance of ReceiveTimeout will be sent
to the Actor when there hasn't been any message for that long.

Annotations@SerialVersionUID()
29. [**](../../akka/actor/RelativeActorPath$.html "Permalink")  object [RelativeActorPath](RelativeActorPath$.html "Extractor for so-called “relative actor paths” as in “relative URI”, not in “relative to some actor”.") extends PathUtilsExtractor for so\-called “relative actor paths” as in “relative URI”, not in
“relative to some actor”.

Extractor for so\-called “relative actor paths” as in “relative URI”, not in
“relative to some actor”. Examples:

 \* "grand/child"
 \* "/user/hello/world"
30. [**](../../akka/actor/Scheduler$.html "Permalink")  object [Scheduler](Scheduler$.html)
31. [**](../../akka/actor/Status$.html "Permalink")  object [Status](Status$.html "Superseeded by akka.pattern.StatusReply, prefer that when possible.")Superseeded by [akka.pattern.StatusReply](../pattern/StatusReply.html), prefer that when possible.

Superseeded by [akka.pattern.StatusReply](../pattern/StatusReply.html), prefer that when possible.

Classes for passing status back to the sender.
Used for internal ACKing protocol. But exposed as utility class for user\-specific ACKing protocols as well.
32. [**](../../akka/actor/SupervisorStrategy$.html "Permalink")  object [SupervisorStrategy](SupervisorStrategy$.html) extends [SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html)
33. [**](../../akka/actor/WrappedMessage$.html "Permalink")  object [WrappedMessage](WrappedMessage$.html)
### Deprecated Value Members

1. [**](../../akka/actor/index.html#actorRef2Scala(ref:akka.actor.ActorRef):akka.actor.ScalaActorRef "Permalink") implicit final  def actorRef2Scala(ref: [ActorRef](ActorRef.html)): [ScalaActorRef](ScalaActorRef.html)Annotations@deprecated @inline() Deprecated*(Since version 2\.6\.13\)* implicit conversion is obsolete
2. [**](../../akka/actor/index.html#scala2ActorRef(ref:akka.actor.ScalaActorRef):akka.actor.ActorRef "Permalink") implicit final  def scala2ActorRef(ref: [ScalaActorRef](ScalaActorRef.html)): [ActorRef](ActorRef.html)Annotations@deprecated @inline() Deprecated*(Since version 2\.6\.13\)* implicit conversion is obsolete
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/AkkaException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractActor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractFSM$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractFSM.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractScheduler.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorInitializationException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorNotFound.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorPath$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorPaths$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSystem$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Address$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AddressFromURIString$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AllDeadLetters.html
- https://doc.akka.io/api/akka-core/current/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/api/akka-core/current/akka/actor/BootstrapSetup$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/BootstrapSetup.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Cancellable$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ChildActorPath.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ChildRestartStats.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ClassicActorContextProvider.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/actor/index.html](https://doc.akka.io/api/akka-core/current/akka/actor/index.html)*
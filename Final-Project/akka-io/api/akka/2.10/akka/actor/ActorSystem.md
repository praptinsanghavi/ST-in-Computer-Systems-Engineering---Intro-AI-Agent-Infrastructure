---
description: Akka 2.10.17 - akka.actor.ActorSystem
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/ActorSystem.html
title: Akka 2.10.17 - akka.actor.ActorSystem
---

# Akka 2.10.17 - akka.actor.ActorSystem

> **Summary:** Akka 2.10.17 - akka.actor.ActorSystem

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
- ActorSystem
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
[c](ActorSystem$.html "See companion object")[akka](../index.html).[actor](index.html)

# [ActorSystem](ActorSystem$.html "See companion object")[**](../../akka/actor/ActorSystem.html "Permalink")

### Companion [object ActorSystem](ActorSystem$.html "See companion object")

#### abstract  class ActorSystem extends [ActorRefFactory](ActorRefFactory.html) with [ClassicActorSystemProvider](ClassicActorSystemProvider.html)

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

Source[ActorSystem.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/ActorSystem.scala#L529)Linear Supertypes[ClassicActorSystemProvider](ClassicActorSystemProvider.html), [ActorRefFactory](ActorRefFactory.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ExtendedActorSystem](ExtendedActorSystem.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorSystem
2. ClassicActorSystemProvider
3. ActorRefFactory
4. AnyRef
5. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/actor/ActorSystem.html#<init>():akka.actor.ActorSystem "Permalink")  new ActorSystem()
### Abstract Value Members

1. [**](../../akka/actor/ActorSystem.html#/(name:Iterable[String]):akka.actor.ActorPath "Permalink") abstract  def /(name: Iterable\[String]): [ActorPath](ActorPath.html)Construct a path below the application guardian to be used with [ActorSystem\#actorSelection](#actorSelection(path:akka.actor.ActorPath):akka.actor.ActorSelection).
2. [**](../../akka/actor/ActorSystem.html#/(name:String):akka.actor.ActorPath "Permalink") abstract  def /(name: String): [ActorPath](ActorPath.html)Construct a path below the application guardian to be used with [ActorSystem\#actorSelection](#actorSelection(path:akka.actor.ActorPath):akka.actor.ActorSelection).
3. [**](../../akka/actor/ActorSystem.html#actorOf(props:akka.actor.Props,name:String):akka.actor.ActorRef "Permalink") abstract  def actorOf(props: [Props](Props.html), name: String): [ActorRef](ActorRef.html)Create new actor as child of this context with the given name, which must
not be null, empty or start with “$”.

Create new actor as child of this context with the given name, which must
not be null, empty or start with “$”. If the given name is already in use,
an `InvalidActorNameException` is thrown.

See [akka.actor.Props](Props.html) for details on how to obtain a `Props` object.

Definition Classes[ActorRefFactory](ActorRefFactory.html)Exceptions thrown`UnsupportedOperationException` if invoked on an ActorSystem that
 uses a custom user guardian

[`akka.ConfigurationException`](../ConfigurationException.html) if deployment, dispatcher
 or mailbox configuration is wrong

[`akka.actor.InvalidActorNameException`](InvalidActorNameException.html) if the given name is
 invalid or already in use
4. [**](../../akka/actor/ActorSystem.html#actorOf(props:akka.actor.Props):akka.actor.ActorRef "Permalink") abstract  def actorOf(props: [Props](Props.html)): [ActorRef](ActorRef.html)Create new actor as child of this context and give it an automatically
generated name (currently similar to base64\-encoded integer count,
reversed and with “$” prepended, may change in the future).

Create new actor as child of this context and give it an automatically
generated name (currently similar to base64\-encoded integer count,
reversed and with “$” prepended, may change in the future).

See [akka.actor.Props](Props.html) for details on how to obtain a `Props` object.

Definition Classes[ActorRefFactory](ActorRefFactory.html)Exceptions thrown`UnsupportedOperationException` if invoked on an ActorSystem that
 uses a custom user guardian

[`akka.ConfigurationException`](../ConfigurationException.html) if deployment, dispatcher
 or mailbox configuration is wrong
5. [**](../../akka/actor/ActorSystem.html#classicSystem:akka.actor.ActorSystem "Permalink") abstract  def classicSystem: ActorSystemAllows access to the classic `akka.actor.ActorSystem` even for `akka.actor.typed.ActorSystem[_]`s.

Allows access to the classic `akka.actor.ActorSystem` even for `akka.actor.typed.ActorSystem[_]`s.

Definition Classes[ClassicActorSystemProvider](ClassicActorSystemProvider.html)
6. [**](../../akka/actor/ActorSystem.html#deadLetters:akka.actor.ActorRef "Permalink") abstract  def deadLetters: [ActorRef](ActorRef.html)Actor reference where messages are re\-routed to which were addressed to
stopped or non\-existing actors.

Actor reference where messages are re\-routed to which were addressed to
stopped or non\-existing actors. Delivery to this actor is done on a best
effort basis and hence not strictly guaranteed.
7. [**](../../akka/actor/ActorSystem.html#dispatcher:scala.concurrent.ExecutionContextExecutor "Permalink") implicit abstract  def dispatcher: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)Default dispatcher as configured.

Default dispatcher as configured. This dispatcher is used for all actors
in the actor system which do not have a different dispatcher configured
explicitly.
Importing this member will place the default MessageDispatcher in scope.

Definition ClassesActorSystem → [ActorRefFactory](ActorRefFactory.html)
8. [**](../../akka/actor/ActorSystem.html#dispatchers:akka.dispatch.Dispatchers "Permalink") abstract  def dispatchers: [Dispatchers](../dispatch/Dispatchers.html)Helper object for looking up configured dispatchers.
9. [**](../../akka/actor/ActorSystem.html#eventStream:akka.event.EventStream "Permalink") abstract  def eventStream: [EventStream](../event/EventStream.html)Main event bus of this actor system, used for example for logging.
10. [**](../../akka/actor/ActorSystem.html#extension[T<:akka.actor.Extension](ext:akka.actor.ExtensionId[T]):T "Permalink") abstract  def extension\[T \<: [Extension](Extension.html)](ext: [ExtensionId](ExtensionId.html)\[T]): TReturns the payload that is associated with the provided extension
throws an IllegalStateException if it is not registered.

Returns the payload that is associated with the provided extension
throws an IllegalStateException if it is not registered.
This method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution
11. [**](../../akka/actor/ActorSystem.html#getLicenseKeyExpiry:java.util.Optional[java.time.LocalDate] "Permalink") abstract  def getLicenseKeyExpiry: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[LocalDate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDate.html#java.time.LocalDate)]Java API: When the license key will expire.

Java API: When the license key will expire. `Optional.empty` for perpetual keys.
If a license key is not defined the expiry date will be today's date.
12. [**](../../akka/actor/ActorSystem.html#getWhenTerminated:java.util.concurrent.CompletionStage[akka.actor.Terminated] "Permalink") abstract  def getWhenTerminated: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Terminated](Terminated.html)]Returns a CompletionStage which will be completed after the ActorSystem has been terminated
and termination hooks have been executed.

Returns a CompletionStage which will be completed after the ActorSystem has been terminated
and termination hooks have been executed. If you registered any callback with
[ActorSystem\#registerOnTermination](#registerOnTermination(code:Runnable):Unit), the returned CompletionStage from this method will not complete
until all the registered callbacks are finished. Be careful to not schedule any operations,
such as `thenRunAsync`, on the dispatchers (`Executor`) of this actor system as they
will have been shut down before this CompletionStage completes.
13. [**](../../akka/actor/ActorSystem.html#guardian:akka.actor.InternalActorRef "Permalink") abstract  def guardian: InternalActorRefParent of all children created by this interface.

Parent of all children created by this interface.

INTERNAL API

Attributesprotected Definition Classes[ActorRefFactory](ActorRefFactory.html)
14. [**](../../akka/actor/ActorSystem.html#hasExtension(ext:akka.actor.ExtensionId[_<:akka.actor.Extension]):Boolean "Permalink") abstract  def hasExtension(ext: [ExtensionId](ExtensionId.html)\[\_ \<: [Extension](Extension.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution
15. [**](../../akka/actor/ActorSystem.html#licenseKeyExpiry:Option[java.time.LocalDate] "Permalink") abstract  def licenseKeyExpiry: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LocalDate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDate.html#java.time.LocalDate)]Scala API: When the license key will expire.

Scala API: When the license key will expire. `None` for perpetual keys.
If a license key is not defined the expiry date will be today's date.
16. [**](../../akka/actor/ActorSystem.html#log:akka.event.LoggingAdapter "Permalink") abstract  def log: [LoggingAdapter](../event/LoggingAdapter.html)Convenient logging adapter for logging to the [ActorSystem\#eventStream](#eventStream:akka.event.EventStream).
17. [**](../../akka/actor/ActorSystem.html#logConfiguration():Unit "Permalink") abstract  def logConfiguration(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log the configuration.
18. [**](../../akka/actor/ActorSystem.html#lookupRoot:akka.actor.InternalActorRef "Permalink") abstract  def lookupRoot: InternalActorRefINTERNAL API

INTERNAL API

Attributesprotected Definition Classes[ActorRefFactory](ActorRefFactory.html)
19. [**](../../akka/actor/ActorSystem.html#mailboxes:akka.dispatch.Mailboxes "Permalink") abstract  def mailboxes: MailboxesHelper object for looking up configured mailbox types.
20. [**](../../akka/actor/ActorSystem.html#name:String "Permalink") abstract  def name: StringThe name of this actor system, used to distinguish multiple ones within
the same JVM \& class loader.
21. [**](../../akka/actor/ActorSystem.html#provider:akka.actor.ActorRefProvider "Permalink") abstract  def provider: [ActorRefProvider](ActorRefProvider.html)INTERNAL API

INTERNAL API

Attributesprotected Definition Classes[ActorRefFactory](ActorRefFactory.html)
22. [**](../../akka/actor/ActorSystem.html#registerExtension[T<:akka.actor.Extension](ext:akka.actor.ExtensionId[T]):T "Permalink") abstract  def registerExtension\[T \<: [Extension](Extension.html)](ext: [ExtensionId](ExtensionId.html)\[T]): TRegisters the provided extension and creates its payload, if this extension isn't already registered
This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution
23. [**](../../akka/actor/ActorSystem.html#registerOnTermination(code:Runnable):Unit "Permalink") abstract  def registerOnTermination(code: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API: Register a block of code (callback) to run after [ActorSystem.terminate](#terminate():scala.concurrent.Future[akka.actor.Terminated]) has been issued and
all actors in this actor system have been stopped.

Java API: Register a block of code (callback) to run after [ActorSystem.terminate](#terminate():scala.concurrent.Future[akka.actor.Terminated]) has been issued and
all actors in this actor system have been stopped.
Multiple code blocks may be registered by calling this method multiple times.
The callbacks will be run sequentially in reverse order of registration, i.e.
last registration is run first.
Note that ActorSystem will not terminate until all the registered callbacks are finished.

Throws a RejectedExecutionException if the System has already been terminated or if termination has been initiated.
24. [**](../../akka/actor/ActorSystem.html#registerOnTermination[T](code:=>T):Unit "Permalink") abstract  def registerOnTermination\[T](code: \=\> T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Register a block of code (callback) to run after [ActorSystem.terminate](#terminate():scala.concurrent.Future[akka.actor.Terminated]) has been issued and
all actors in this actor system have been stopped.

Register a block of code (callback) to run after [ActorSystem.terminate](#terminate():scala.concurrent.Future[akka.actor.Terminated]) has been issued and
all actors in this actor system have been stopped.
Multiple code blocks may be registered by calling this method multiple times.
The callbacks will be run sequentially in reverse order of registration, i.e.
last registration is run first.
Note that ActorSystem will not terminate until all the registered callbacks are finished.

Throws a RejectedExecutionException if the System has already been terminated or if termination has been initiated.

Scala API
25. [**](../../akka/actor/ActorSystem.html#scheduler:akka.actor.Scheduler "Permalink") abstract  def scheduler: [Scheduler](Scheduler.html)Light\-weight scheduler for running asynchronous tasks after some deadline
in the future.

Light\-weight scheduler for running asynchronous tasks after some deadline
in the future. Not terribly precise but cheap.
26. [**](../../akka/actor/ActorSystem.html#settings:akka.actor.ActorSystem.Settings "Permalink") abstract  def settings: [Settings](ActorSystem$$Settings.html)The core settings extracted from the supplied configuration.
27. [**](../../akka/actor/ActorSystem.html#stop(actor:akka.actor.ActorRef):Unit "Permalink") abstract  def stop(actor: [ActorRef](ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop the actor pointed to by the given [akka.actor.ActorRef](ActorRef.html); this is
an asynchronous operation, i.e.

Stop the actor pointed to by the given [akka.actor.ActorRef](ActorRef.html); this is
an asynchronous operation, i.e. involves a message send.
If this method is applied to the `self` reference from inside an Actor
then that Actor is guaranteed to not process any further messages after
this call; please note that the processing of the current message will
continue, this method does not immediately terminate this actor.

Definition Classes[ActorRefFactory](ActorRefFactory.html)
28. [**](../../akka/actor/ActorSystem.html#systemImpl:akka.actor.ActorSystemImpl "Permalink") abstract  def systemImpl: ActorSystemImplINTERNAL API

INTERNAL API

Attributesprotected Definition Classes[ActorRefFactory](ActorRefFactory.html)
29. [**](../../akka/actor/ActorSystem.html#terminate():scala.concurrent.Future[akka.actor.Terminated] "Permalink") abstract  def terminate(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Terminated](Terminated.html)]Terminates this actor system by running [CoordinatedShutdown](CoordinatedShutdown.html) with reason
[CoordinatedShutdown.ActorSystemTerminateReason](CoordinatedShutdown$$ActorSystemTerminateReason$.html).

Terminates this actor system by running [CoordinatedShutdown](CoordinatedShutdown.html) with reason
[CoordinatedShutdown.ActorSystemTerminateReason](CoordinatedShutdown$$ActorSystemTerminateReason$.html).

If `akka.coordinated-shutdown.run-by-actor-system-terminate` is configured to `off`
it will not run `CoordinatedShutdown`, but the `ActorSystem` and its actors
will still be terminated.

This will stop the guardian actor, which in turn
will recursively stop all its child actors, and finally the system guardian
(below which the logging actors reside) and then execute all registered
termination handlers (see [ActorSystem\#registerOnTermination](#registerOnTermination(code:Runnable):Unit)).
Be careful to not schedule any operations on completion of the returned future
using the dispatcher of this actor system as it will have been shut down before the
future completes.
30. [**](../../akka/actor/ActorSystem.html#whenTerminated:scala.concurrent.Future[akka.actor.Terminated] "Permalink") abstract  def whenTerminated: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Terminated](Terminated.html)]Returns a Future which will be completed after the ActorSystem has been terminated
and termination hooks have been executed.

Returns a Future which will be completed after the ActorSystem has been terminated
and termination hooks have been executed. If you registered any callback with
[ActorSystem\#registerOnTermination](#registerOnTermination(code:Runnable):Unit), the returned Future from this method will not complete
until all the registered callbacks are finished. Be careful to not schedule any operations,
such as `onComplete`, on the dispatchers (`ExecutionContext`) of this actor system as they
will have been shut down before this future completes.
### Concrete Value Members

1. [**](../../akka/actor/ActorSystem.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/ActorSystem.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/ActorSystem.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorSystem toany2stringadd\[ActorSystem] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/ActorSystem.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorSystem, B)ImplicitThis member is added by an implicit conversion from ActorSystem toArrowAssoc\[ActorSystem] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/ActorSystem.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/ActorSystem.html#actorSelection(path:akka.actor.ActorPath):akka.actor.ActorSelection "Permalink")  def actorSelection(path: [ActorPath](ActorPath.html)): [ActorSelection](ActorSelection.html)Construct an [akka.actor.ActorSelection](ActorSelection.html) from the given path, which is
parsed for wildcards (these are replaced by regular expressions
internally).

Construct an [akka.actor.ActorSelection](ActorSelection.html) from the given path, which is
parsed for wildcards (these are replaced by regular expressions
internally). No attempt is made to verify the existence of any part of
the supplied path, it is recommended to send a message and gather the
replies in order to resolve the matching set of actors.

Definition Classes[ActorRefFactory](ActorRefFactory.html)
7. [**](../../akka/actor/ActorSystem.html#actorSelection(path:String):akka.actor.ActorSelection "Permalink")  def actorSelection(path: String): [ActorSelection](ActorSelection.html)Construct an [akka.actor.ActorSelection](ActorSelection.html) from the given path, which is
parsed for wildcards (these are replaced by regular expressions
internally).

Construct an [akka.actor.ActorSelection](ActorSelection.html) from the given path, which is
parsed for wildcards (these are replaced by regular expressions
internally). No attempt is made to verify the existence of any part of
the supplied path, it is recommended to send a message and gather the
replies in order to resolve the matching set of actors.

Definition Classes[ActorRefFactory](ActorRefFactory.html)
8. [**](../../akka/actor/ActorSystem.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/actor/ActorSystem.html#child(child:String):akka.actor.ActorPath "Permalink")  def child(child: String): [ActorPath](ActorPath.html)Java API: Create a new child actor path.
10. [**](../../akka/actor/ActorSystem.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/actor/ActorSystem.html#descendant(names:Iterable[String]):akka.actor.ActorPath "Permalink")  def descendant(names: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String]): [ActorPath](ActorPath.html)Java API: Recursively create a descendant’s path by appending all child names.
12. [**](../../akka/actor/ActorSystem.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorSystem) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorSystemImplicitThis member is added by an implicit conversion from ActorSystem toEnsuring\[ActorSystem] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/actor/ActorSystem.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorSystem) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorSystemImplicitThis member is added by an implicit conversion from ActorSystem toEnsuring\[ActorSystem] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/actor/ActorSystem.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorSystemImplicitThis member is added by an implicit conversion from ActorSystem toEnsuring\[ActorSystem] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/actor/ActorSystem.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorSystemImplicitThis member is added by an implicit conversion from ActorSystem toEnsuring\[ActorSystem] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/actor/ActorSystem.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/actor/ActorSystem.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../akka/actor/ActorSystem.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/ActorSystem.html#getDispatcher:scala.concurrent.ExecutionContextExecutor "Permalink")  def getDispatcher: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)Java API: Default dispatcher as configured.

Java API: Default dispatcher as configured. This dispatcher is used for all actors
in the actor system which do not have a different dispatcher configured
explicitly.
Importing this member will place the default MessageDispatcher in scope.
20. [**](../../akka/actor/ActorSystem.html#getEventStream:akka.event.EventStream "Permalink")  def getEventStream: [EventStream](../event/EventStream.html)Java API: Main event bus of this actor system, used for example for logging.
21. [**](../../akka/actor/ActorSystem.html#getScheduler:akka.actor.Scheduler "Permalink")  def getScheduler: [Scheduler](Scheduler.html)Java API: Light\-weight scheduler for running asynchronous tasks after some deadline
in the future.

Java API: Light\-weight scheduler for running asynchronous tasks after some deadline
in the future. Not terribly precise but cheap.
22. [**](../../akka/actor/ActorSystem.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/actor/ActorSystem.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../akka/actor/ActorSystem.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/actor/ActorSystem.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/actor/ActorSystem.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/actor/ActorSystem.html#startTime:Long "Permalink")  val startTime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Start\-up time in milliseconds since the epoch.
28. [**](../../akka/actor/ActorSystem.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/actor/ActorSystem.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../akka/actor/ActorSystem.html#uptime:Long "Permalink")  def uptime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Up\-time of this actor system in seconds.
31. [**](../../akka/actor/ActorSystem.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/actor/ActorSystem.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../akka/actor/ActorSystem.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/ActorSystem.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/ActorSystem.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorSystem toStringFormat\[ActorSystem] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/ActorSystem.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorSystem, B)ImplicitThis member is added by an implicit conversion from ActorSystem toArrowAssoc\[ActorSystem] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ClassicActorSystemProvider](ClassicActorSystemProvider.html)

### Inherited from [ActorRefFactory](ActorRefFactory.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorSystem to any2stringadd\[ActorSystem]

### Inherited by implicit conversion StringFormat fromActorSystem to StringFormat\[ActorSystem]

### Inherited by implicit conversion Ensuring fromActorSystem to Ensuring\[ActorSystem]

### Inherited by implicit conversion ArrowAssoc fromActorSystem to ArrowAssoc\[ActorSystem]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/ConfigurationException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractFSM$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractFSM.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractScheduler.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorInitializationException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorNotFound.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorPath$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorPaths$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem$$Settings.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Address$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AddressFromURIString$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AllDeadLetters.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/actor/BootstrapSetup$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/BootstrapSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Cancellable$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ChildActorPath.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ChildRestartStats.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html](https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html)*
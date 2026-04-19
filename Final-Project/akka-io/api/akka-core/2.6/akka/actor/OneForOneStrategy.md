---
description: Akka 2.6.21 - akka.actor.OneForOneStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:20:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/actor/OneForOneStrategy.html
title: Akka 2.6.21 - akka.actor.OneForOneStrategy
---

# Akka 2.6.21 - akka.actor.OneForOneStrategy

> **Summary:** Akka 2.6.21 - akka.actor.OneForOneStrategy

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
- OneForOneStrategy
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
- [TypedActor](TypedActor$.html "This represents the TypedActor Akka Extension, access to the functionality is done through a given ActorSystem.")
- [TypedActorExtension](TypedActorExtension.html)
- [TypedActorFactory](TypedActorFactory.html "A TypedActorFactory is something that can created TypedActor instances.")
- [TypedProps](TypedProps.html "TypedProps is a TypedActor configuration object, that is thread safe and fully sharable.")
- [UnboundedStash](UnboundedStash.html "The UnboundedStash trait is a version of akka.actor.Stash that enforces an unbounded stash for you actor.")
- [UnhandledMessage](UnhandledMessage.html "This message is published to the EventStream whenever an Actor receives a message it doesn't understand")
- [UnrestrictedStash](UnrestrictedStash.html "A version of akka.actor.Stash that does not enforce any mailbox type.")
- [UntypedAbstractActor](UntypedAbstractActor.html "If the validation of the ReceiveBuilder match logic turns out to be a bottleneck for some of your actors you can consider to implement it at lower level by extending UntypedAbstractActor instead of AbstractActor.")
- [WrappedMessage](WrappedMessage.html "Message envelopes may implement this trait for better logging, such as logging of message class name of the wrapped message instead of the envelope class name.")
c[akka](../index.html).[actor](index.html)

# OneForOneStrategy[**](../../akka/actor/OneForOneStrategy.html "Permalink")

### 

#### case class OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int) \= \-1, withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean) \= true)(decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive])) extends [SupervisorStrategy](SupervisorStrategy.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with Serializable

Applies the fault handling `Directive` (Resume, Restart, Stop) specified in the `Decider`
to the child actor that failed, as opposed to [akka.actor.AllForOneStrategy](AllForOneStrategy.html) that applies
it to all children.

maxNrOfRetriesthe number of times a child actor is allowed to be restarted, negative value means no limit
 if the duration is infinite. If the limit is exceeded the child actor is stopped

withinTimeRangeduration of the time window for maxNrOfRetries, Duration.Inf means no window

loggingEnabledthe strategy logs the failure if this is enabled (true), by default it is enabled

decidermapping from Throwable to [akka.actor.SupervisorStrategy.Directive](SupervisorStrategy$$Directive.html), you can also use a
 [scala.collection.immutable.Seq](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Seq.html) of Throwables which maps the given Throwables to restarts, otherwise escalates.

Source[FaultHandling.scala](https://github.com/akka/akka/tree/v2.6.21//akka-actor/src/main/scala/akka/actor/FaultHandling.scala#L570)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.8/scala/Equals.html#scala.Equals), [SupervisorStrategy](SupervisorStrategy.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Known Subclasses[ClusterMetricsStrategy](../cluster/metrics/ClusterMetricsStrategy.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. OneForOneStrategy
2. Serializable
3. Product
4. Equals
5. SupervisorStrategy
6. AnyRef
7. Any
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

1. [**](../../akka/actor/OneForOneStrategy.html#<init>(decider:akka.actor.SupervisorStrategy.Decider):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive]))Java API: Restart an infinite number of times.

Java API: Restart an infinite number of times. Compatible with lambda expressions.
2. [**](../../akka/actor/OneForOneStrategy.html#<init>(loggingEnabled:Boolean,decider:akka.actor.SupervisorStrategy.Decider):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive]))
3. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:java.time.Duration,decider:akka.actor.SupervisorStrategy.Decider):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), withinTimeRange: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive]))Java API: compatible with lambda expressions
4. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:scala.concurrent.duration.Duration,decider:akka.actor.SupervisorStrategy.Decider):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive]))Java API: compatible with lambda expressions
5. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:java.time.Duration,trapExit:Iterable[Class[_<:Throwable]]):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), withinTimeRange: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), trapExit: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[Class\[\_ \<: Throwable]])Java API
6. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:scala.concurrent.duration.Duration,trapExit:Iterable[Class[_<:Throwable]]):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), trapExit: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[Class\[\_ \<: Throwable]])Java API
7. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:java.time.Duration,decider:akka.actor.SupervisorStrategy.JDecider):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), withinTimeRange: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), decider: [JDecider](SupervisorStrategy$.html#JDecider=akka.japi.Function[Throwable,akka.actor.SupervisorStrategy.Directive]))Java API
8. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:scala.concurrent.duration.Duration,decider:akka.actor.SupervisorStrategy.JDecider):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), decider: [JDecider](SupervisorStrategy$.html#JDecider=akka.japi.Function[Throwable,akka.actor.SupervisorStrategy.Directive]))Java API
9. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:java.time.Duration,decider:akka.actor.SupervisorStrategy.JDecider,loggingEnabled:Boolean):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), withinTimeRange: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), decider: [JDecider](SupervisorStrategy$.html#JDecider=akka.japi.Function[Throwable,akka.actor.SupervisorStrategy.Directive]), loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)) Java API
10. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:scala.concurrent.duration.Duration,decider:akka.actor.SupervisorStrategy.JDecider,loggingEnabled:Boolean):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), decider: [JDecider](SupervisorStrategy$.html#JDecider=akka.japi.Function[Throwable,akka.actor.SupervisorStrategy.Directive]), loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean))Java API
11. [**](../../akka/actor/OneForOneStrategy.html#<init>(maxNrOfRetries:Int,withinTimeRange:scala.concurrent.duration.Duration,loggingEnabled:Boolean)(decider:akka.actor.SupervisorStrategy.Decider):akka.actor.OneForOneStrategy "Permalink")  new OneForOneStrategy(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int) \= \-1, withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean) \= true)(decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive]))maxNrOfRetriesthe number of times a child actor is allowed to be restarted, negative value means no limit
 if the duration is infinite. If the limit is exceeded the child actor is stopped

withinTimeRangeduration of the time window for maxNrOfRetries, Duration.Inf means no window

loggingEnabledthe strategy logs the failure if this is enabled (true), by default it is enabled

decidermapping from Throwable to [akka.actor.SupervisorStrategy.Directive](SupervisorStrategy$$Directive.html), you can also use a
 [scala.collection.immutable.Seq](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Seq.html) of Throwables which maps the given Throwables to restarts, otherwise escalates.
### Value Members

1. [**](../../akka/actor/OneForOneStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/OneForOneStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/OneForOneStrategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from OneForOneStrategy toany2stringadd\[OneForOneStrategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/OneForOneStrategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (OneForOneStrategy, B)ImplicitThis member is added by an implicit conversion from OneForOneStrategy toArrowAssoc\[OneForOneStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/OneForOneStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/OneForOneStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/OneForOneStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../akka/actor/OneForOneStrategy.html#decider:akka.actor.SupervisorStrategy.Decider "Permalink")  val decider: [Decider](SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive])Returns the Decider that is associated with this SupervisorStrategy.

Returns the Decider that is associated with this SupervisorStrategy.
The Decider is invoked by the default implementation of `handleFailure`
to obtain the Directive to be applied.

Definition ClassesOneForOneStrategy → [SupervisorStrategy](SupervisorStrategy.html)
9. [**](../../akka/actor/OneForOneStrategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (OneForOneStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): OneForOneStrategyImplicitThis member is added by an implicit conversion from OneForOneStrategy toEnsuring\[OneForOneStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/OneForOneStrategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (OneForOneStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): OneForOneStrategyImplicitThis member is added by an implicit conversion from OneForOneStrategy toEnsuring\[OneForOneStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/OneForOneStrategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): OneForOneStrategyImplicitThis member is added by an implicit conversion from OneForOneStrategy toEnsuring\[OneForOneStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/OneForOneStrategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): OneForOneStrategyImplicitThis member is added by an implicit conversion from OneForOneStrategy toEnsuring\[OneForOneStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/actor/OneForOneStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/actor/OneForOneStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../akka/actor/OneForOneStrategy.html#handleChildTerminated(context:akka.actor.ActorContext,child:akka.actor.ActorRef,children:Iterable[akka.actor.ActorRef]):Unit "Permalink")  def handleChildTerminated(context: [ActorContext](ActorContext.html), child: [ActorRef](ActorRef.html), children: Iterable\[[ActorRef](ActorRef.html)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)This method is called after the child has been removed from the set of children.

This method is called after the child has been removed from the set of children.
It does not need to do anything special. Exceptions thrown from this method
do NOT make the actor fail if this happens during termination.

Definition ClassesOneForOneStrategy → [SupervisorStrategy](SupervisorStrategy.html)
16. [**](../../akka/actor/OneForOneStrategy.html#handleFailure(context:akka.actor.ActorContext,child:akka.actor.ActorRef,cause:Throwable,stats:akka.actor.ChildRestartStats,children:Iterable[akka.actor.ChildRestartStats]):Boolean "Permalink")  def handleFailure(context: [ActorContext](ActorContext.html), child: [ActorRef](ActorRef.html), cause: Throwable, stats: [ChildRestartStats](ChildRestartStats.html), children: Iterable\[[ChildRestartStats](ChildRestartStats.html)]): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)This is the main entry point: in case of a child’s failure, this method
must try to handle the failure by resuming, restarting or stopping the
child (and returning `true`), or it returns `false` to escalate the
failure, which will lead to this actor re\-throwing the exception which
caused the failure.

This is the main entry point: in case of a child’s failure, this method
must try to handle the failure by resuming, restarting or stopping the
child (and returning `true`), or it returns `false` to escalate the
failure, which will lead to this actor re\-throwing the exception which
caused the failure. The exception will not be wrapped.

This method calls [akka.actor.SupervisorStrategy\#logFailure](SupervisorStrategy.html#logFailure(context:akka.actor.ActorContext,child:akka.actor.ActorRef,cause:Throwable,decision:akka.actor.SupervisorStrategy.Directive):Unit), which will
log the failure unless it is escalated. You can customize the logging by
setting [akka.actor.SupervisorStrategy\#loggingEnabled](SupervisorStrategy.html#loggingEnabled:Boolean) to `false` and
do the logging inside the `decider` or override the `logFailure` method.

childrenis a lazy collection (a view)

Definition Classes[SupervisorStrategy](SupervisorStrategy.html)
17. [**](../../akka/actor/OneForOneStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/actor/OneForOneStrategy.html#logFailure(context:akka.actor.ActorContext,child:akka.actor.ActorRef,cause:Throwable,decision:akka.actor.SupervisorStrategy.Directive):Unit "Permalink")  def logFailure(context: [ActorContext](ActorContext.html), child: [ActorRef](ActorRef.html), cause: Throwable, decision: [Directive](SupervisorStrategy$$Directive.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Default logging of actor failures when
[akka.actor.SupervisorStrategy\#loggingEnabled](SupervisorStrategy.html#loggingEnabled:Boolean) is `true`.

Default logging of actor failures when
[akka.actor.SupervisorStrategy\#loggingEnabled](SupervisorStrategy.html#loggingEnabled:Boolean) is `true`.
`Escalate` failures are not logged here, since they are supposed
to be handled at a level higher up in the hierarchy.
`Resume` failures are logged at `Warning` level.
`Stop` and `Restart` failures are logged at `Error` level.

Definition Classes[SupervisorStrategy](SupervisorStrategy.html)
19. [**](../../akka/actor/OneForOneStrategy.html#loggingEnabled:Boolean "Permalink")  val loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Logging of actor failures is done when this is `true`.

Logging of actor failures is done when this is `true`.

Definition ClassesOneForOneStrategy → [SupervisorStrategy](SupervisorStrategy.html)
20. [**](../../akka/actor/OneForOneStrategy.html#maxNrOfRetries:Int "Permalink")  val maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)
21. [**](../../akka/actor/OneForOneStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/actor/OneForOneStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
23. [**](../../akka/actor/OneForOneStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
24. [**](../../akka/actor/OneForOneStrategy.html#processFailure(context:akka.actor.ActorContext,restart:Boolean,child:akka.actor.ActorRef,cause:Throwable,stats:akka.actor.ChildRestartStats,children:Iterable[akka.actor.ChildRestartStats]):Unit "Permalink")  def processFailure(context: [ActorContext](ActorContext.html), restart: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), child: [ActorRef](ActorRef.html), cause: Throwable, stats: [ChildRestartStats](ChildRestartStats.html), children: Iterable\[[ChildRestartStats](ChildRestartStats.html)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)This method is called to act on the failure of a child: restart if the flag is true, stop otherwise.

This method is called to act on the failure of a child: restart if the flag is true, stop otherwise.

Definition ClassesOneForOneStrategy → [SupervisorStrategy](SupervisorStrategy.html)
25. [**](../../akka/actor/OneForOneStrategy.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../akka/actor/OneForOneStrategy.html#restartChild(child:akka.actor.ActorRef,cause:Throwable,suspendFirst:Boolean):Unit "Permalink") final  def restartChild(child: [ActorRef](ActorRef.html), cause: Throwable, suspendFirst: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Restart the given child, possibly suspending it first.

Restart the given child, possibly suspending it first.

**IMPORTANT:**

If the child is the currently failing one, it will already have been
suspended, hence `suspendFirst` must be false. If the child is not the
currently failing one, then it did not request this treatment and is
therefore not prepared to be resumed without prior suspend.

Definition Classes[SupervisorStrategy](SupervisorStrategy.html)
27. [**](../../akka/actor/OneForOneStrategy.html#resumeChild(child:akka.actor.ActorRef,cause:Throwable):Unit "Permalink") final  def resumeChild(child: [ActorRef](ActorRef.html), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Resume the previously failed child: **do never apply this to a child which
is not the currently failing child**.

Resume the previously failed child: **do never apply this to a child which
is not the currently failing child**. Suspend/resume needs to be done in
matching pairs, otherwise actors will wake up too soon or never at all.

Definition Classes[SupervisorStrategy](SupervisorStrategy.html)
28. [**](../../akka/actor/OneForOneStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/actor/OneForOneStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/actor/OneForOneStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../akka/actor/OneForOneStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/actor/OneForOneStrategy.html#withMaxNrOfRetries(maxNrOfRetries:Int):akka.actor.OneForOneStrategy "Permalink")  def withMaxNrOfRetries(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): OneForOneStrategy
33. [**](../../akka/actor/OneForOneStrategy.html#withinTimeRange:scala.concurrent.duration.Duration "Permalink")  val withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
### Deprecated Value Members

1. [**](../../akka/actor/OneForOneStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../akka/actor/OneForOneStrategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from OneForOneStrategy toStringFormat\[OneForOneStrategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/OneForOneStrategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (OneForOneStrategy, B)ImplicitThis member is added by an implicit conversion from OneForOneStrategy toArrowAssoc\[OneForOneStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.8/scala/Equals.html#scala.Equals)

### Inherited from [SupervisorStrategy](SupervisorStrategy.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOneForOneStrategy to any2stringadd\[OneForOneStrategy]

### Inherited by implicit conversion StringFormat fromOneForOneStrategy to StringFormat\[OneForOneStrategy]

### Inherited by implicit conversion Ensuring fromOneForOneStrategy to Ensuring\[OneForOneStrategy]

### Inherited by implicit conversion ArrowAssoc fromOneForOneStrategy to ArrowAssoc\[OneForOneStrategy]

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
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/actor/OneForOneStrategy.html](https://doc.akka.io/api/akka-core/2.6/akka/actor/OneForOneStrategy.html)*
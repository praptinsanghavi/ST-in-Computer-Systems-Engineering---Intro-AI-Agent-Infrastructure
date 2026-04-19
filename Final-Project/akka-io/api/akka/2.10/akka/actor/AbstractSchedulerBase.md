---
description: Akka 2.10.17 - akka.actor.AbstractSchedulerBase
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:51:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/AbstractSchedulerBase.html
title: Akka 2.10.17 - akka.actor.AbstractSchedulerBase
---

# Akka 2.10.17 - akka.actor.AbstractSchedulerBase

> **Summary:** Akka 2.10.17 - akka.actor.AbstractSchedulerBase

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
- AbstractSchedulerBase
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
c[akka](../index.html).[actor](index.html)

# AbstractSchedulerBase[**](../../akka/actor/AbstractSchedulerBase.html "Permalink")

### 

#### abstract  class AbstractSchedulerBase extends [Scheduler](Scheduler.html)

Source[Scheduler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/Scheduler.scala#L508)Linear Supertypes[Scheduler](Scheduler.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AbstractScheduler](AbstractScheduler.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AbstractSchedulerBase
2. Scheduler
3. AnyRef
4. Any
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

1. [**](../../akka/actor/AbstractSchedulerBase.html#<init>():akka.actor.AbstractSchedulerBase "Permalink")  new AbstractSchedulerBase()
### Abstract Value Members

1. [**](../../akka/actor/AbstractSchedulerBase.html#maxFrequency:Double "Permalink") abstract  def maxFrequency: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)The maximum supported task frequency of this scheduler, i.e.

The maximum supported task frequency of this scheduler, i.e. the inverse
of the minimum time interval between executions of a recurring task, in Hz.

Definition Classes[Scheduler](Scheduler.html)
2. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleOnce(delay:scala.concurrent.duration.FiniteDuration,runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") abstract  def scheduleOnce(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Scala API: Schedules a Runnable to be run once with a delay, i.e.

Scala API: Schedules a Runnable to be run once with a delay, i.e. a time period that
has to pass before the runnable is executed.

Definition Classes[Scheduler](Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
3. [**](../../akka/actor/AbstractSchedulerBase.html#schedule(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") abstract  def schedule(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Definition Classes[Scheduler](Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
### Concrete Value Members

1. [**](../../akka/actor/AbstractSchedulerBase.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/AbstractSchedulerBase.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/AbstractSchedulerBase.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AbstractSchedulerBase toany2stringadd\[AbstractSchedulerBase] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/AbstractSchedulerBase.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AbstractSchedulerBase, B)ImplicitThis member is added by an implicit conversion from AbstractSchedulerBase toArrowAssoc\[AbstractSchedulerBase] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/AbstractSchedulerBase.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/AbstractSchedulerBase.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/AbstractSchedulerBase.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/AbstractSchedulerBase.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AbstractSchedulerBase) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractSchedulerBaseImplicitThis member is added by an implicit conversion from AbstractSchedulerBase toEnsuring\[AbstractSchedulerBase] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/AbstractSchedulerBase.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AbstractSchedulerBase) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractSchedulerBaseImplicitThis member is added by an implicit conversion from AbstractSchedulerBase toEnsuring\[AbstractSchedulerBase] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/AbstractSchedulerBase.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractSchedulerBaseImplicitThis member is added by an implicit conversion from AbstractSchedulerBase toEnsuring\[AbstractSchedulerBase] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/AbstractSchedulerBase.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractSchedulerBaseImplicitThis member is added by an implicit conversion from AbstractSchedulerBase toEnsuring\[AbstractSchedulerBase] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/AbstractSchedulerBase.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/AbstractSchedulerBase.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/actor/AbstractSchedulerBase.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/AbstractSchedulerBase.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/AbstractSchedulerBase.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/AbstractSchedulerBase.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/AbstractSchedulerBase.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/AbstractSchedulerBase.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleAtFixedRate(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), receiver: [ActorRef](ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](ActorRef.html)): [Cancellable](Cancellable.html)Java API: Schedules a message to be sent repeatedly with an initial delay and
frequency.

Java API: Schedules a message to be sent repeatedly with an initial delay and
frequency. E.g. if you would like a message to be sent immediately and
thereafter every 500ms you would set `delay=Duration.ZERO` and
`interval=Duration.ofMillis(500)`

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `scheduleAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `scheduleWithFixedDelay` is often preferred.

Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.

Definition Classes[Scheduler](Scheduler.html)
21. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleAtFixedRate(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,receiver:akka.actor.ActorRef,message:Any)(implicitexecutor:scala.concurrent.ExecutionContext,implicitsender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleAtFixedRate(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), receiver: [ActorRef](ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](ActorRef.html) \= [Actor.noSender](Actor$.html)): [Cancellable](Cancellable.html)Scala API: Schedules a message to be sent repeatedly with an initial delay and
frequency.

Scala API: Schedules a message to be sent repeatedly with an initial delay and
frequency. E.g. if you would like a message to be sent immediately and
thereafter every 500ms you would set `delay=Duration.Zero` and
`interval=Duration(500, TimeUnit.MILLISECONDS)`

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `scheduleAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `scheduleWithFixedDelay` is often preferred.

Note: For scheduling within actors `with Timers` should be preferred.

Definition Classes[Scheduler](Scheduler.html)Annotations@nowarn()
22. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,runnable:Runnable,executor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def scheduleAtFixedRate(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a frequency.

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

Definition Classes[Scheduler](Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
23. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleAtFixedRate(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration)(runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def scheduleAtFixedRate(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a frequency.

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

Definition Classes[Scheduler](Scheduler.html)Annotations@nowarn() Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
24. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleOnce(delay:java.time.Duration,runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink")  def scheduleOnce(delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Java API: Schedules a Runnable to be run once with a delay, i.e.

Java API: Schedules a Runnable to be run once with a delay, i.e. a time period that
has to pass before the runnable is executed.

Definition Classes[Scheduler](Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
25. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleOnce(delay:scala.concurrent.duration.FiniteDuration)(f:=>Unit)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def scheduleOnce(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Scala API: Schedules a function to be run once with a delay, i.e.

Scala API: Schedules a function to be run once with a delay, i.e. a time period that has
to pass before the function is run.

Definition Classes[Scheduler](Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
26. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleOnce(delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleOnce(delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), receiver: [ActorRef](ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](ActorRef.html)): [Cancellable](Cancellable.html)Java API: Schedules a message to be sent once with a delay, i.e.

Java API: Schedules a message to be sent once with a delay, i.e. a time period that has
to pass before the message is sent.

Definition Classes[Scheduler](Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
27. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleOnce(delay:scala.concurrent.duration.FiniteDuration,receiver:akka.actor.ActorRef,message:Any)(implicitexecutor:scala.concurrent.ExecutionContext,implicitsender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleOnce(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), receiver: [ActorRef](ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](ActorRef.html) \= [Actor.noSender](Actor$.html)): [Cancellable](Cancellable.html)Scala API: Schedules a message to be sent once with a delay, i.e.

Scala API: Schedules a message to be sent once with a delay, i.e. a time period that has
to pass before the message is sent.

Definition Classes[Scheduler](Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
28. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleWithFixedDelay(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), receiver: [ActorRef](ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](ActorRef.html)): [Cancellable](Cancellable.html)Java API: Schedules a message to be sent repeatedly with an initial delay and
a fixed `delay` between messages.

Java API: Schedules a message to be sent repeatedly with an initial delay and
a fixed `delay` between messages. E.g. if you would like a message to be sent
immediately and thereafter every 500ms you would set `delay=Duration.ZERO` and
`interval=Duration.ofMillis(500)`.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.

Definition Classes[Scheduler](Scheduler.html)
29. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleWithFixedDelay(initialDelay:scala.concurrent.duration.FiniteDuration,delay:scala.concurrent.duration.FiniteDuration,receiver:akka.actor.ActorRef,message:Any)(implicitexecutor:scala.concurrent.ExecutionContext,implicitsender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleWithFixedDelay(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), receiver: [ActorRef](ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](ActorRef.html) \= [Actor.noSender](Actor$.html)): [Cancellable](Cancellable.html)Scala API: Schedules a message to be sent repeatedly with an initial delay and
a fixed `delay` between messages.

Scala API: Schedules a message to be sent repeatedly with an initial delay and
a fixed `delay` between messages. E.g. if you would like a message to be sent
immediately and thereafter every 500ms you would set `delay=Duration.Zero` and
`interval=Duration(500, TimeUnit.MILLISECONDS)`.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Note: For scheduling within actors `with Timers` should be preferred.

Definition Classes[Scheduler](Scheduler.html)
30. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,runnable:Runnable,executor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def scheduleWithFixedDelay(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a fixed `delay` between subsequent executions.

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

Definition Classes[Scheduler](Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
31. [**](../../akka/actor/AbstractSchedulerBase.html#scheduleWithFixedDelay(initialDelay:scala.concurrent.duration.FiniteDuration,delay:scala.concurrent.duration.FiniteDuration)(runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink")  def scheduleWithFixedDelay(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a fixed `delay` between subsequent executions.

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

Definition Classes[Scheduler](Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
32. [**](../../akka/actor/AbstractSchedulerBase.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../akka/actor/AbstractSchedulerBase.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../akka/actor/AbstractSchedulerBase.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/actor/AbstractSchedulerBase.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../akka/actor/AbstractSchedulerBase.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/AbstractSchedulerBase.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/AbstractSchedulerBase.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AbstractSchedulerBase toStringFormat\[AbstractSchedulerBase] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/AbstractSchedulerBase.html#schedule(initialDelay:java.time.Duration,interval:java.time.Duration,runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink")  def schedule(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Definition Classes[Scheduler](Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
4. [**](../../akka/actor/AbstractSchedulerBase.html#schedule(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration)(f:=>Unit)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def schedule(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](Cancellable.html)Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Definition Classes[Scheduler](Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
5. [**](../../akka/actor/AbstractSchedulerBase.html#schedule(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def schedule(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), receiver: [ActorRef](ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](ActorRef.html)): [Cancellable](Cancellable.html)Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Definition Classes[Scheduler](Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
6. [**](../../akka/actor/AbstractSchedulerBase.html#schedule(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,receiver:akka.actor.ActorRef,message:Any)(implicitexecutor:scala.concurrent.ExecutionContext,implicitsender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def schedule(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), receiver: [ActorRef](ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](ActorRef.html) \= [Actor.noSender](Actor$.html)): [Cancellable](Cancellable.html)Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Deprecated API: See [Scheduler\#scheduleWithFixedDelay](Scheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable) or [Scheduler\#scheduleAtFixedRate](Scheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable).

Definition Classes[Scheduler](Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
7. [**](../../akka/actor/AbstractSchedulerBase.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AbstractSchedulerBase, B)ImplicitThis member is added by an implicit conversion from AbstractSchedulerBase toArrowAssoc\[AbstractSchedulerBase] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Scheduler](Scheduler.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAbstractSchedulerBase to any2stringadd\[AbstractSchedulerBase]

### Inherited by implicit conversion StringFormat fromAbstractSchedulerBase to StringFormat\[AbstractSchedulerBase]

### Inherited by implicit conversion Ensuring fromAbstractSchedulerBase to Ensuring\[AbstractSchedulerBase]

### Inherited by implicit conversion ArrowAssoc fromAbstractSchedulerBase to ArrowAssoc\[AbstractSchedulerBase]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka/2.10/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ClassicActorSystemProvider.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/AbstractSchedulerBase.html](https://doc.akka.io/api/akka/2.10/akka/actor/AbstractSchedulerBase.html)*
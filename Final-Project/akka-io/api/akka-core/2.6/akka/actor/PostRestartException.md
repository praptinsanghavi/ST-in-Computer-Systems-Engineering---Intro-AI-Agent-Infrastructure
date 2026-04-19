---
description: Akka 2.6.21 - akka.actor.PostRestartException
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:20:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/actor/PostRestartException.html
title: Akka 2.6.21 - akka.actor.PostRestartException
---

# Akka 2.6.21 - akka.actor.PostRestartException

> **Summary:** Akka 2.6.21 - akka.actor.PostRestartException

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
- PostRestartException
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

# PostRestartException[**](../../akka/actor/PostRestartException.html "Permalink")

### 

#### final  case class PostRestartException extends [ActorInitializationException](ActorInitializationException.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with Serializable

A PostRestartException is thrown when constructor or postRestart() method
fails during a restart attempt.

Annotations@SerialVersionUID() Source[Actor.scala](https://github.com/akka/akka/tree/v2.6.21//akka-actor/src/main/scala/akka/actor/Actor.scala#L237)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.8/scala/Equals.html#scala.Equals), [ActorInitializationException](ActorInitializationException.html), [AkkaException](../AkkaException.html), [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PostRestartException
2. Product
3. Equals
4. ActorInitializationException
5. AkkaException
6. RuntimeException
7. Exception
8. Throwable
9. Serializable
10. AnyRef
11. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/actor/PostRestartException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/PostRestartException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/PostRestartException.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PostRestartException toany2stringadd\[PostRestartException] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/PostRestartException.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PostRestartException, B)ImplicitThis member is added by an implicit conversion from PostRestartException toArrowAssoc\[PostRestartException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/PostRestartException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/PostRestartException.html#actor:akka.actor.ActorRef "Permalink")  val actor: [ActorRef](ActorRef.html)
7. [**](../../akka/actor/PostRestartException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesThrowable
8. [**](../../akka/actor/PostRestartException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/actor/PostRestartException.html#cause:Throwable "Permalink")  val cause: Throwable
10. [**](../../akka/actor/PostRestartException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
11. [**](../../akka/actor/PostRestartException.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PostRestartException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): PostRestartExceptionImplicitThis member is added by an implicit conversion from PostRestartException toEnsuring\[PostRestartException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/PostRestartException.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PostRestartException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): PostRestartExceptionImplicitThis member is added by an implicit conversion from PostRestartException toEnsuring\[PostRestartException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/actor/PostRestartException.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): PostRestartExceptionImplicitThis member is added by an implicit conversion from PostRestartException toEnsuring\[PostRestartException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/actor/PostRestartException.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): PostRestartExceptionImplicitThis member is added by an implicit conversion from PostRestartException toEnsuring\[PostRestartException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/actor/PostRestartException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/actor/PostRestartException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../akka/actor/PostRestartException.html#getActor:akka.actor.ActorRef "Permalink")  def getActor: [ActorRef](ActorRef.html)Definition Classes[ActorInitializationException](ActorInitializationException.html)
18. [**](../../akka/actor/PostRestartException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
19. [**](../../akka/actor/PostRestartException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
20. [**](../../akka/actor/PostRestartException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
21. [**](../../akka/actor/PostRestartException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
22. [**](../../akka/actor/PostRestartException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.8/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
23. [**](../../akka/actor/PostRestartException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.8/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
24. [**](../../akka/actor/PostRestartException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
25. [**](../../akka/actor/PostRestartException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../akka/actor/PostRestartException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../akka/actor/PostRestartException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
28. [**](../../akka/actor/PostRestartException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
29. [**](../../akka/actor/PostRestartException.html#originalCause:Throwable "Permalink")  val originalCause: Throwable
30. [**](../../akka/actor/PostRestartException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../akka/actor/PostRestartException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../akka/actor/PostRestartException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesThrowable
33. [**](../../akka/actor/PostRestartException.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
34. [**](../../akka/actor/PostRestartException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.8/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesThrowable
35. [**](../../akka/actor/PostRestartException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../akka/actor/PostRestartException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
37. [**](../../akka/actor/PostRestartException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../akka/actor/PostRestartException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../akka/actor/PostRestartException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/PostRestartException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../akka/actor/PostRestartException.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PostRestartException toStringFormat\[PostRestartException] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/PostRestartException.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PostRestartException, B)ImplicitThis member is added by an implicit conversion from PostRestartException toArrowAssoc\[PostRestartException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.8/scala/Equals.html#scala.Equals)

### Inherited from [ActorInitializationException](ActorInitializationException.html)

### Inherited from [AkkaException](../AkkaException.html)

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPostRestartException to any2stringadd\[PostRestartException]

### Inherited by implicit conversion StringFormat fromPostRestartException to StringFormat\[PostRestartException]

### Inherited by implicit conversion Ensuring fromPostRestartException to Ensuring\[PostRestartException]

### Inherited by implicit conversion ArrowAssoc fromPostRestartException to ArrowAssoc\[PostRestartException]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/AkkaException.html
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

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/actor/PostRestartException.html](https://doc.akka.io/api/akka-core/2.6/akka/actor/PostRestartException.html)*
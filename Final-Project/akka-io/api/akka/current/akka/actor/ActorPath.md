---
description: Akka 2.10.17 - akka.actor.ActorPath
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:33:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/ActorPath.html
title: Akka 2.10.17 - akka.actor.ActorPath
---

# Akka 2.10.17 - akka.actor.ActorPath

> **Summary:** Akka 2.10.17 - akka.actor.ActorPath

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
- ActorPath
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
[t](ActorPath$.html "See companion object")[akka](../index.html).[actor](index.html)

# [ActorPath](ActorPath$.html "See companion object")[**](../../akka/actor/ActorPath.html "Permalink")

### Companion [object ActorPath](ActorPath$.html "See companion object")

#### sealed  trait ActorPath extends [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[ActorPath] with Serializable

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

Annotations@nowarn() @SerialVersionUID() Source[ActorPath.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/ActorPath.scala#L160)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[ActorPath], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ChildActorPath](ChildActorPath.html), [RootActorPath](RootActorPath.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorPath
2. Serializable
3. Comparable
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
### Abstract Value Members

1. [**](../../akka/actor/ActorPath.html#/(child:String):akka.actor.ActorPath "Permalink") abstract  def /(child: String): ActorPathCreate a new child actor path.
2. [**](../../akka/actor/ActorPath.html#address:akka.actor.Address "Permalink") abstract  def address: [Address](Address.html)The Address under which this path can be reached; walks up the tree to
the RootActorPath.
3. [**](../../akka/actor/ActorPath.html#compareTo(x$1:T):Int "Permalink") abstract  def compareTo(arg0: ActorPath): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesComparable
4. [**](../../akka/actor/ActorPath.html#elements:scala.collection.immutable.Iterable[String] "Permalink") abstract  def elements: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String]Sequence of names for this path from root to this.

Sequence of names for this path from root to this. Performance implication: has to allocate a list.
5. [**](../../akka/actor/ActorPath.html#name:String "Permalink") abstract  def name: StringThe name of the actor that this path refers to.
6. [**](../../akka/actor/ActorPath.html#parent:akka.actor.ActorPath "Permalink") abstract  def parent: ActorPathThe path for the parent actor.
7. [**](../../akka/actor/ActorPath.html#root:akka.actor.RootActorPath "Permalink") abstract  def root: [RootActorPath](RootActorPath.html)Walk up the tree to obtain and return the RootActorPath.
8. [**](../../akka/actor/ActorPath.html#toSerializationFormat:String "Permalink") abstract  def toSerializationFormat: StringGenerate full String representation including the
uid for the actor cell instance as URI fragment.

Generate full String representation including the
uid for the actor cell instance as URI fragment.
This representation should be used as serialized
representation instead of `toString`.
9. [**](../../akka/actor/ActorPath.html#toSerializationFormatWithAddress(address:akka.actor.Address):String "Permalink") abstract  def toSerializationFormatWithAddress(address: [Address](Address.html)): StringGenerate full String representation including the uid for the actor cell
instance as URI fragment, replacing the Address in the RootActor Path
with the given one unless this path’s address includes host and port
information.

Generate full String representation including the uid for the actor cell
instance as URI fragment, replacing the Address in the RootActor Path
with the given one unless this path’s address includes host and port
information. This representation should be used as serialized
representation instead of `toStringWithAddress`.
10. [**](../../akka/actor/ActorPath.html#toStringWithAddress(address:akka.actor.Address):String "Permalink") abstract  def toStringWithAddress(address: [Address](Address.html)): StringGenerate String representation, replacing the Address in the RootActor
Path with the given one unless this path’s address includes host and port
information.
### Concrete Value Members

1. [**](../../akka/actor/ActorPath.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/ActorPath.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/ActorPath.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorPath toany2stringadd\[ActorPath] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/ActorPath.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorPath, B)ImplicitThis member is added by an implicit conversion from ActorPath toArrowAssoc\[ActorPath] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/ActorPath.html#/(child:Iterable[String]):akka.actor.ActorPath "Permalink")  def /(child: Iterable\[String]): ActorPathRecursively create a descendant’s path by appending all child names.
6. [**](../../akka/actor/ActorPath.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../akka/actor/ActorPath.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/actor/ActorPath.html#child(child:String):akka.actor.ActorPath "Permalink")  def child(child: String): ActorPathJava API: Create a new child actor path.
9. [**](../../akka/actor/ActorPath.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/actor/ActorPath.html#descendant(names:Iterable[String]):akka.actor.ActorPath "Permalink")  def descendant(names: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String]): ActorPathJava API: Recursively create a descendant’s path by appending all child names.
11. [**](../../akka/actor/ActorPath.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorPath) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorPathImplicitThis member is added by an implicit conversion from ActorPath toEnsuring\[ActorPath] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/ActorPath.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorPath) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorPathImplicitThis member is added by an implicit conversion from ActorPath toEnsuring\[ActorPath] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/actor/ActorPath.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorPathImplicitThis member is added by an implicit conversion from ActorPath toEnsuring\[ActorPath] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/actor/ActorPath.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorPathImplicitThis member is added by an implicit conversion from ActorPath toEnsuring\[ActorPath] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/actor/ActorPath.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/actor/ActorPath.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../akka/actor/ActorPath.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/actor/ActorPath.html#getElements:Iterable[String] "Permalink")  def getElements: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String]Java API: Sequence of names for this path from root to this.

Java API: Sequence of names for this path from root to this. Performance implication: has to allocate a list.
19. [**](../../akka/actor/ActorPath.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/ActorPath.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/actor/ActorPath.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/actor/ActorPath.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/actor/ActorPath.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/actor/ActorPath.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/actor/ActorPath.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/actor/ActorPath.html#toStringWithoutAddress:String "Permalink")  def toStringWithoutAddress: StringString representation of the path elements, excluding the address
information.

String representation of the path elements, excluding the address
information. The elements are separated with "/" and starts with "/",
e.g. "/user/a/b".
27. [**](../../akka/actor/ActorPath.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/actor/ActorPath.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/actor/ActorPath.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/ActorPath.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/ActorPath.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorPath toStringFormat\[ActorPath] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/ActorPath.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorPath, B)ImplicitThis member is added by an implicit conversion from ActorPath toArrowAssoc\[ActorPath] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[ActorPath]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorPath to any2stringadd\[ActorPath]

### Inherited by implicit conversion StringFormat fromActorPath to StringFormat\[ActorPath]

### Inherited by implicit conversion Ensuring fromActorPath to Ensuring\[ActorPath]

### Inherited by implicit conversion ArrowAssoc fromActorPath to ArrowAssoc\[ActorPath]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractActor.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractFSM$.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractFSM.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractScheduler.html
- https://doc.akka.io/api/akka/current/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor$.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorInitializationException.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorNotFound.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorPath$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorPaths$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSelection$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem$.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Address$.html
- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/actor/AddressFromURIString$.html
- https://doc.akka.io/api/akka/current/akka/actor/AllDeadLetters.html
- https://doc.akka.io/api/akka/current/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/BootstrapSetup$.html
- https://doc.akka.io/api/akka/current/akka/actor/BootstrapSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/Cancellable$.html
- https://doc.akka.io/api/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka/current/akka/actor/ChildActorPath.html
- https://doc.akka.io/api/akka/current/akka/actor/ChildRestartStats.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html](https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html)*
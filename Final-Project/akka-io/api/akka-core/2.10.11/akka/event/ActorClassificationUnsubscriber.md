---
description: Akka 2.10.11 - akka.event.ActorClassificationUnsubscriber
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:37:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/ActorClassificationUnsubscriber.html
title: Akka 2.10.11 - akka.event.ActorClassificationUnsubscriber
---

# Akka 2.10.11 - akka.event.ActorClassificationUnsubscriber

> **Summary:** Akka 2.10.11 - akka.event.ActorClassificationUnsubscriber

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[event](index.html)
- [**](../../akka/event/jul/index.html "Permalink")  package [jul](jul/index.html)Definition Classes[event](index.html)
- [**](../../akka/event/slf4j/index.html "Permalink")  package [slf4j](slf4j/index.html)Definition Classes[event](index.html)
- ActorClassificationUnsubscriber
- [ActorClassifier](ActorClassifier.html "Can be mixed into an EventBus to specify that the Classifier type is ActorRef")
- [ActorEventBus](ActorEventBus.html "Represents an EventBus where the Subscriber type is ActorRef")
- [BusLogging](BusLogging.html "akka.event.LoggingAdapter that publishes akka.event.Logging.LogEvent to event stream.")
- [DeadLetterListener](DeadLetterListener.html)
- [DefaultLoggingFilter](DefaultLoggingFilter.html "Default LoggingFilter that uses the logLevel of the eventStream, which initial value is defined in configuration.")
- [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "LoggingAdapter extension which adds MDC support.")
- [DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html)
- [DummyClassForStringSources](DummyClassForStringSources.html "This is a “marker” class which is inserted as originator class into akka.event.Logging.LogEvent when the string representation was supplied directly.")
- [EventBus](EventBus.html "Represents the base type for EventBuses Internally has an Event type, a Classifier type and a Subscriber type")
- [EventStream](EventStream.html "An Akka EventStream is a pub-sub stream of events both system and user generated, where subscribers are ActorRefs and the channels are Classes and Events are any java.lang.Object.")
- [EventStreamUnsubscriber](EventStreamUnsubscriber.html "INTERNAL API")
- [LogMarker](LogMarker.html "DO NOT INHERIT: Class is open only for use by akka-slf4j")
- [LogSource](LogSource.html "This trait defines the interface to be provided by a “log source formatting rule” as used by akka.event.Logging’s apply/create method.")
- [LoggerMessageQueueSemantics](LoggerMessageQueueSemantics.html)
- [Logging](Logging$.html "Main entry point for Akka logging: log levels and message types (aka channels) defined for the main transport medium, the main event bus.")
- [LoggingAdapter](LoggingAdapter.html "Logging wrapper to make nicer and optimize: provide template versions which evaluate .toString only if the log level is actually enabled.")
- [LoggingBus](LoggingBus.html "This trait brings log level handling to the EventStream: it reads the log levels for the initial logging (StandardOutLogger) and the loggers & level for after-init logging, possibly keeping the StandardOutLogger enabled if it is part of the configured loggers.")
- [LoggingFilter](LoggingFilter.html "Filter of log events that is used by the LoggingAdapter before publishing log events to the eventStream.")
- [LoggingFilterWithMarker](LoggingFilterWithMarker.html "In retrospect should have been abstract, but we cannot change that without breaking binary compatibility")
- [LoggingFilterWithMarkerWrapper](LoggingFilterWithMarkerWrapper.html)
- [LoggingReceive](LoggingReceive.html "This decorator adds invocation logging to a Receive function.")
- [LookupClassification](LookupClassification.html "Maps Subscribers to Classifiers using equality on Classifier to store a Set of Subscribers (hence the need for compareSubscribers) Maps Events to Classifiers through the classify-method (so it knows who to publish to)")
- [ManagedActorClassification](ManagedActorClassification.html "Maps ActorRefs to ActorRefs to form an EventBus where ActorRefs can listen to other ActorRefs.")
- [MarkerLoggingAdapter](MarkerLoggingAdapter.html "LoggingAdapter extension which adds Marker support.")
- [NoLogging](NoLogging$.html "NoLogging is a LoggingAdapter that does absolutely nothing – no logging at all.")
- [NoMarkerLogging](NoMarkerLogging$.html "NoLogging is a MarkerLoggingAdapter that does absolutely nothing – no logging at all.")
- [PredicateClassifier](PredicateClassifier.html "Can be mixed into an EventBus to specify that the Classifier type is a Function from Event to Boolean (predicate)")
- [ScanningClassification](ScanningClassification.html "Maps Classifiers to Subscribers and selects which Subscriber should receive which publication through scanning through all Subscribers through the matches(classifier, event) method")
- [SubchannelClassification](SubchannelClassification.html "Classification which respects relationships between channels: subscribing to one channel automatically and idempotently subscribes to all sub-channels.")
c[akka](../index.html).[event](index.html)

# ActorClassificationUnsubscriber[**](../../akka/event/ActorClassificationUnsubscriber.html "Permalink")

### 

#### class ActorClassificationUnsubscriber extends [Actor](../actor/Actor.html) with [Stash](../actor/Stash.html)

INTERNAL API

Watches all actors which subscribe on the given event stream, and unsubscribes them from it when they are Terminated.

Attributesprotected\[[akka](../index.html)] Source[ActorClassificationUnsubscriber.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/event/ActorClassificationUnsubscriber.scala#L19)Linear Supertypes[Stash](../actor/Stash.html), [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html)], [UnrestrictedStash](../actor/UnrestrictedStash.html), StashSupport, [Actor](../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorClassificationUnsubscriber
2. Stash
3. RequiresMessageQueue
4. UnrestrictedStash
5. StashSupport
6. Actor
7. AnyRef
8. Any
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

1. [**](../../akka/event/ActorClassificationUnsubscriber.html#<init>(bus:String,unsubscribe:akka.actor.ActorRef=>Unit,debug:Boolean):akka.event.ActorClassificationUnsubscriber "Permalink")  new ActorClassificationUnsubscriber(bus: String, unsubscribe: ([ActorRef](../actor/ActorRef.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), debug: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))
### Type Members

1. [**](../../akka/event/ActorClassificationUnsubscriber.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../actor/Actor.html)
### Value Members

1. [**](../../akka/event/ActorClassificationUnsubscriber.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/ActorClassificationUnsubscriber.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/ActorClassificationUnsubscriber.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorClassificationUnsubscriber toany2stringadd\[ActorClassificationUnsubscriber] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/ActorClassificationUnsubscriber.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorClassificationUnsubscriber, B)ImplicitThis member is added by an implicit conversion from ActorClassificationUnsubscriber toArrowAssoc\[ActorClassificationUnsubscriber] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/ActorClassificationUnsubscriber.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/event/ActorClassificationUnsubscriber.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
7. [**](../../akka/event/ActorClassificationUnsubscriber.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
8. [**](../../akka/event/ActorClassificationUnsubscriber.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
9. [**](../../akka/event/ActorClassificationUnsubscriber.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/event/ActorClassificationUnsubscriber.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
11. [**](../../akka/event/ActorClassificationUnsubscriber.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/event/ActorClassificationUnsubscriber.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/event/ActorClassificationUnsubscriber.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../actor/Actor.html)
14. [**](../../akka/event/ActorClassificationUnsubscriber.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorClassificationUnsubscriber) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorClassificationUnsubscriberImplicitThis member is added by an implicit conversion from ActorClassificationUnsubscriber toEnsuring\[ActorClassificationUnsubscriber] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/event/ActorClassificationUnsubscriber.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorClassificationUnsubscriber) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorClassificationUnsubscriberImplicitThis member is added by an implicit conversion from ActorClassificationUnsubscriber toEnsuring\[ActorClassificationUnsubscriber] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/event/ActorClassificationUnsubscriber.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorClassificationUnsubscriberImplicitThis member is added by an implicit conversion from ActorClassificationUnsubscriber toEnsuring\[ActorClassificationUnsubscriber] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/event/ActorClassificationUnsubscriber.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorClassificationUnsubscriberImplicitThis member is added by an implicit conversion from ActorClassificationUnsubscriber toEnsuring\[ActorClassificationUnsubscriber] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/event/ActorClassificationUnsubscriber.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/event/ActorClassificationUnsubscriber.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/event/ActorClassificationUnsubscriber.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/event/ActorClassificationUnsubscriber.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/event/ActorClassificationUnsubscriber.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../akka/event/ActorClassificationUnsubscriber.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/event/ActorClassificationUnsubscriber.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/event/ActorClassificationUnsubscriber.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/event/ActorClassificationUnsubscriber.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
27. [**](../../akka/event/ActorClassificationUnsubscriber.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox and clears the stash.
 Must be called when overriding this method, otherwise stashed messages won't be propagated to DeadLetters
 when actor stops.

Definition Classes[UnrestrictedStash](../actor/UnrestrictedStash.html) → [Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
28. [**](../../akka/event/ActorClassificationUnsubscriber.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox,
 clears the stash, stops all children and invokes the postStop() callback.

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[UnrestrictedStash](../actor/UnrestrictedStash.html) → [Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
29. [**](../../akka/event/ActorClassificationUnsubscriber.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition ClassesActorClassificationUnsubscriber → [Actor](../actor/Actor.html)
30. [**](../../akka/event/ActorClassificationUnsubscriber.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesActorClassificationUnsubscriber → [Actor](../actor/Actor.html)
31. [**](../../akka/event/ActorClassificationUnsubscriber.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../actor/Actor.html)
32. [**](../../akka/event/ActorClassificationUnsubscriber.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../actor/Actor.html)
33. [**](../../akka/event/ActorClassificationUnsubscriber.html#stash():Unit "Permalink")  def stash(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Adds the current message (the message that the actor received last) to the
 actor's stash.

 Adds the current message (the message that the actor received last) to the
 actor's stash.

Definition ClassesStashSupportExceptions thrown`IllegalStateException` if the same message is stashed more than once

`StashOverflowException` in case of a stash capacity violation
34. [**](../../akka/event/ActorClassificationUnsubscriber.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../actor/Actor.html)
35. [**](../../akka/event/ActorClassificationUnsubscriber.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../akka/event/ActorClassificationUnsubscriber.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
37. [**](../../akka/event/ActorClassificationUnsubscriber.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](EventStream.html)

Definition Classes[Actor](../actor/Actor.html)
38. [**](../../akka/event/ActorClassificationUnsubscriber.html#unstashAll():Unit "Permalink")  def unstashAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Prepends all messages in the stash to the mailbox, and then clears the stash.

 Prepends all messages in the stash to the mailbox, and then clears the stash.

 Messages from the stash are enqueued to the mailbox until the capacity of the
 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
 `MessageQueueAppendFailedException` is thrown.

 The stash is guaranteed to be empty after calling `unstashAll()`.

Definition ClassesStashSupport
39. [**](../../akka/event/ActorClassificationUnsubscriber.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../akka/event/ActorClassificationUnsubscriber.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../akka/event/ActorClassificationUnsubscriber.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/event/ActorClassificationUnsubscriber.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/ActorClassificationUnsubscriber.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorClassificationUnsubscriber toStringFormat\[ActorClassificationUnsubscriber] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/ActorClassificationUnsubscriber.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorClassificationUnsubscriber, B)ImplicitThis member is added by an implicit conversion from ActorClassificationUnsubscriber toArrowAssoc\[ActorClassificationUnsubscriber] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Stash](../actor/Stash.html)

### Inherited from [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html)]

### Inherited from [UnrestrictedStash](../actor/UnrestrictedStash.html)

### Inherited from StashSupport

### Inherited from [Actor](../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorClassificationUnsubscriber to any2stringadd\[ActorClassificationUnsubscriber]

### Inherited by implicit conversion StringFormat fromActorClassificationUnsubscriber to StringFormat\[ActorClassificationUnsubscriber]

### Inherited by implicit conversion Ensuring fromActorClassificationUnsubscriber to Ensuring\[ActorClassificationUnsubscriber]

### Inherited by implicit conversion ArrowAssoc fromActorClassificationUnsubscriber to ArrowAssoc\[ActorClassificationUnsubscriber]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Stash.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/ActorClassificationUnsubscriber.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/ActorClassifier.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/ActorEventBus.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/BusLogging.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/DeadLetterListener.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/DummyClassForStringSources.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/EventBus.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/EventStreamUnsubscriber.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LogSource$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LogSource.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/Logging$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingBus.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingFilterWithMarker$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingFilterWithMarkerWrapper.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingReceive$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingReceive.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LookupClassification.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/ManagedActorClassification.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/NoLogging$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/PredicateClassifier.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/ScanningClassification.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/SubchannelClassification.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/event/ActorClassificationUnsubscriber.html](https://doc.akka.io/api/akka-core/2.10.11/akka/event/ActorClassificationUnsubscriber.html)*
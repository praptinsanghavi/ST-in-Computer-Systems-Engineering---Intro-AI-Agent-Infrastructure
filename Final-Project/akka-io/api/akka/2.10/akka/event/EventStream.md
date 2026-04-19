---
description: Akka 2.10.17 - akka.event.EventStream
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/EventStream.html
title: Akka 2.10.17 - akka.event.EventStream
---

# Akka 2.10.17 - akka.event.EventStream

> **Summary:** Akka 2.10.17 - akka.event.EventStream

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[event](index.html)
- [**](../../akka/event/jul/index.html "Permalink")  package [jul](jul/index.html)Definition Classes[event](index.html)
- [**](../../akka/event/slf4j/index.html "Permalink")  package [slf4j](slf4j/index.html)Definition Classes[event](index.html)
- [ActorClassificationUnsubscriber](ActorClassificationUnsubscriber.html "INTERNAL API")
- [ActorClassifier](ActorClassifier.html "Can be mixed into an EventBus to specify that the Classifier type is ActorRef")
- [ActorEventBus](ActorEventBus.html "Represents an EventBus where the Subscriber type is ActorRef")
- [BusLogging](BusLogging.html "akka.event.LoggingAdapter that publishes akka.event.Logging.LogEvent to event stream.")
- [DeadLetterListener](DeadLetterListener.html)
- [DefaultLoggingFilter](DefaultLoggingFilter.html "Default LoggingFilter that uses the logLevel of the eventStream, which initial value is defined in configuration.")
- [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "LoggingAdapter extension which adds MDC support.")
- [DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html)
- [DummyClassForStringSources](DummyClassForStringSources.html "This is a “marker” class which is inserted as originator class into akka.event.Logging.LogEvent when the string representation was supplied directly.")
- [EventBus](EventBus.html "Represents the base type for EventBuses Internally has an Event type, a Classifier type and a Subscriber type")
- EventStream
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

# EventStream[**](../../akka/event/EventStream.html "Permalink")

### 

#### class EventStream extends [LoggingBus](LoggingBus.html) with [SubchannelClassification](SubchannelClassification.html)

An Akka EventStream is a pub\-sub stream of events both system and user generated,
where subscribers are ActorRefs and the channels are Classes and Events are any java.lang.Object.
EventStreams employ SubchannelClassification, which means that if you listen to a Class,
you'll receive any message that is of that type or a subtype.

The debug flag in the constructor toggles if operations on this EventStream should also be published
as Debug\-Events

Source[EventStream.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/EventStream.scala#L24)Linear Supertypes[SubchannelClassification](SubchannelClassification.html), [LoggingBus](LoggingBus.html), [ActorEventBus](ActorEventBus.html), [EventBus](EventBus.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventStream
2. SubchannelClassification
3. LoggingBus
4. ActorEventBus
5. EventBus
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

1. [**](../../akka/event/EventStream.html#<init>(sys:akka.actor.ActorSystem):akka.event.EventStream "Permalink")  new EventStream(sys: [ActorSystem](../actor/ActorSystem.html))
2. [**](../../akka/event/EventStream.html#<init>(sys:akka.actor.ActorSystem,debug:Boolean):akka.event.EventStream "Permalink")  new EventStream(sys: [ActorSystem](../actor/ActorSystem.html), debug: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))
### Type Members

1. [**](../../akka/event/EventStream.html#Classifier=Class[_] "Permalink")  type Classifier \= [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_]Definition ClassesEventStream → [LoggingBus](LoggingBus.html) → [EventBus](EventBus.html)
2. [**](../../akka/event/EventStream.html#Event=Any "Permalink")  type Event \= [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesEventStream → [LoggingBus](LoggingBus.html) → [EventBus](EventBus.html)
3. [**](../../akka/event/EventStream.html#Subscriber=akka.actor.ActorRef "Permalink")  type Subscriber \= [ActorRef](../actor/ActorRef.html)Definition Classes[ActorEventBus](ActorEventBus.html) → [EventBus](EventBus.html)
### Value Members

1. [**](../../akka/event/EventStream.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/EventStream.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/EventStream.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventStream toany2stringadd\[EventStream] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/EventStream.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventStream, B)ImplicitThis member is added by an implicit conversion from EventStream toArrowAssoc\[EventStream] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/EventStream.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/event/EventStream.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/EventStream.html#classify(event:Any):Class[_] "Permalink")  def classify(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Class\[\_]Returns the Classifier associated with the given Event

Returns the Classifier associated with the given Event

Attributesprotected Definition ClassesEventStream → [SubchannelClassification](SubchannelClassification.html)
8. [**](../../akka/event/EventStream.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/event/EventStream.html#compareSubscribers(a:akka.actor.ActorRef,b:akka.actor.ActorRef):Int "Permalink")  def compareSubscribers(a: [ActorRef](../actor/ActorRef.html), b: [ActorRef](../actor/ActorRef.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Attributesprotected Definition Classes[ActorEventBus](ActorEventBus.html)
10. [**](../../akka/event/EventStream.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventStream) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventStreamImplicitThis member is added by an implicit conversion from EventStream toEnsuring\[EventStream] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/event/EventStream.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventStream) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventStreamImplicitThis member is added by an implicit conversion from EventStream toEnsuring\[EventStream] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/event/EventStream.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventStreamImplicitThis member is added by an implicit conversion from EventStream toEnsuring\[EventStream] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/event/EventStream.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventStreamImplicitThis member is added by an implicit conversion from EventStream toEnsuring\[EventStream] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/event/EventStream.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/event/EventStream.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../akka/event/EventStream.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/event/EventStream.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/event/EventStream.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/event/EventStream.html#logLevel:akka.event.Logging.LogLevel "Permalink")  def logLevel: [LogLevel](Logging$$LogLevel.html)Query currently set log level.

Query currently set log level. See object Logging for more information.

Definition Classes[LoggingBus](LoggingBus.html)
20. [**](../../akka/event/EventStream.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/event/EventStream.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/event/EventStream.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/event/EventStream.html#publish(event:Any,subscriber:akka.actor.ActorRef):Unit "Permalink")  def publish(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), subscriber: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Publishes the given Event to the given Subscriber

Publishes the given Event to the given Subscriber

Attributesprotected Definition ClassesEventStream → [SubchannelClassification](SubchannelClassification.html)
24. [**](../../akka/event/EventStream.html#publish(event:SubchannelClassification.this.Event):Unit "Permalink")  def publish(event: [Event](#Event=Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[SubchannelClassification](SubchannelClassification.html)
25. [**](../../akka/event/EventStream.html#setLogLevel(level:akka.event.Logging.LogLevel):Unit "Permalink")  def setLogLevel(level: [LogLevel](Logging$$LogLevel.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Change log level: default loggers (i.e.

Change log level: default loggers (i.e. from configuration file) are
subscribed/unsubscribed as necessary so that they listen to all levels
which are at least as severe as the given one. See object Logging for
more information.

NOTE: if the StandardOutLogger is configured also as normal logger, it
will not participate in the automatic management of log level
subscriptions!

Definition Classes[LoggingBus](LoggingBus.html)
26. [**](../../akka/event/EventStream.html#startUnsubscriber():Unit "Permalink")  def startUnsubscriber(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)*Must* be called after actor system is "ready".

*Must* be called after actor system is "ready".
Starts system actor that takes care of unsubscribing subscribers that have terminated.
27. [**](../../akka/event/EventStream.html#subclassification:akka.util.Subclassification[EventStream.this.Classifier] "Permalink") implicit  val subclassification: [Subclassification](../util/Subclassification.html)\[[Classifier](#Classifier=Class[_])]The logic to form sub\-class hierarchy

The logic to form sub\-class hierarchy

Attributesprotected Definition ClassesEventStream → [SubchannelClassification](SubchannelClassification.html)
28. [**](../../akka/event/EventStream.html#subscribe(subscriber:akka.actor.ActorRef,channel:Class[_]):Boolean "Permalink")  def subscribe(subscriber: [ActorRef](../actor/ActorRef.html), channel: Class\[\_]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Subscribe an actor to listen for types and subtypes by passing Class to channel argument.

Subscribe an actor to listen for types and subtypes by passing Class to channel argument.
The same actor can create multiple subscriptions for different Class.

returnstrue if successful and false if not (because it was already
 subscribed to that Classifier, or otherwise)

Definition ClassesEventStream → [SubchannelClassification](SubchannelClassification.html) → [EventBus](EventBus.html)
29. [**](../../akka/event/EventStream.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../akka/event/EventStream.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../akka/event/EventStream.html#unsubscribe(subscriber:akka.actor.ActorRef):Unit "Permalink")  def unsubscribe(subscriber: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Unsubscribe all subscriptions created by this actor from the event stream.

Unsubscribe all subscriptions created by this actor from the event stream.

Definition ClassesEventStream → [SubchannelClassification](SubchannelClassification.html) → [EventBus](EventBus.html)
32. [**](../../akka/event/EventStream.html#unsubscribe(subscriber:akka.actor.ActorRef,channel:Class[_]):Boolean "Permalink")  def unsubscribe(subscriber: [ActorRef](../actor/ActorRef.html), channel: Class\[\_]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Unsubscribe specific types subscriptions created by this actor from the event stream.

Unsubscribe specific types subscriptions created by this actor from the event stream.

returnstrue if successful and false if not (because it wasn't subscribed
 to that Classifier, or otherwise)

Definition ClassesEventStream → [SubchannelClassification](SubchannelClassification.html) → [EventBus](EventBus.html)
33. [**](../../akka/event/EventStream.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../akka/event/EventStream.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../akka/event/EventStream.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/event/EventStream.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/EventStream.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventStream toStringFormat\[EventStream] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/EventStream.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventStream, B)ImplicitThis member is added by an implicit conversion from EventStream toArrowAssoc\[EventStream] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [SubchannelClassification](SubchannelClassification.html)

### Inherited from [LoggingBus](LoggingBus.html)

### Inherited from [ActorEventBus](ActorEventBus.html)

### Inherited from [EventBus](EventBus.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventStream to any2stringadd\[EventStream]

### Inherited by implicit conversion StringFormat fromEventStream to StringFormat\[EventStream]

### Inherited by implicit conversion Ensuring fromEventStream to Ensuring\[EventStream]

### Inherited by implicit conversion ArrowAssoc fromEventStream to ArrowAssoc\[EventStream]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/event/ActorClassificationUnsubscriber.html
- https://doc.akka.io/api/akka/2.10/akka/event/ActorClassifier.html
- https://doc.akka.io/api/akka/2.10/akka/event/ActorEventBus.html
- https://doc.akka.io/api/akka/2.10/akka/event/BusLogging.html
- https://doc.akka.io/api/akka/2.10/akka/event/DeadLetterListener.html
- https://doc.akka.io/api/akka/2.10/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/api/akka/2.10/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/api/akka/2.10/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/api/akka/2.10/akka/event/DummyClassForStringSources.html
- https://doc.akka.io/api/akka/2.10/akka/event/EventBus.html
- https://doc.akka.io/api/akka/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka/2.10/akka/event/EventStreamUnsubscriber.html
- https://doc.akka.io/api/akka/2.10/akka/event/LogMarker$.html
- https://doc.akka.io/api/akka/2.10/akka/event/LogMarker.html
- https://doc.akka.io/api/akka/2.10/akka/event/LogSource$.html
- https://doc.akka.io/api/akka/2.10/akka/event/LogSource.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka/2.10/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka/2.10/akka/event/Logging$.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingBus.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingFilterWithMarker$.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingFilterWithMarkerWrapper.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingReceive$.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingReceive.html
- https://doc.akka.io/api/akka/2.10/akka/event/LookupClassification.html
- https://doc.akka.io/api/akka/2.10/akka/event/ManagedActorClassification.html
- https://doc.akka.io/api/akka/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka/2.10/akka/event/NoLogging$.html
- https://doc.akka.io/api/akka/2.10/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/api/akka/2.10/akka/event/PredicateClassifier.html
- https://doc.akka.io/api/akka/2.10/akka/event/ScanningClassification.html
- https://doc.akka.io/api/akka/2.10/akka/event/SubchannelClassification.html
- https://doc.akka.io/api/akka/2.10/akka/event/index.html
- https://doc.akka.io/api/akka/2.10/akka/event/japi/index.html
- https://doc.akka.io/api/akka/2.10/akka/event/jul/index.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/util/Subclassification.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/event/EventStream.html](https://doc.akka.io/api/akka/2.10/akka/event/EventStream.html)*
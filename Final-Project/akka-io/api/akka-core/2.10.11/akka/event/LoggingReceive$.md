---
description: Akka 2.10.11 - akka.event.LoggingReceive
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:37:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/LoggingReceive$.html
title: Akka 2.10.11 - akka.event.LoggingReceive
---

# Akka 2.10.11 - akka.event.LoggingReceive

> **Summary:** Akka 2.10.11 - akka.event.LoggingReceive

## Content

Akka2\.10\.11 \< Back****# Packages

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
[o](LoggingReceive.html "See companion class")[akka](../index.html).[event](index.html)

# [LoggingReceive](LoggingReceive.html "See companion class")[**](../../akka/event/LoggingReceive$.html "Permalink")

### Companion [class LoggingReceive](LoggingReceive.html "See companion class")

#### object LoggingReceive

Source[LoggingReceive.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/event/LoggingReceive.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoggingReceive
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/event/LoggingReceive$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/LoggingReceive$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/LoggingReceive$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/event/LoggingReceive$.html#apply(logLevel:akka.event.Logging.LogLevel)(r:akka.actor.Actor.Receive)(implicitcontext:akka.actor.ActorContext):akka.actor.Actor.Receive "Permalink")  def apply(logLevel: [LogLevel](Logging$$LogLevel.html))(r: [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]))(implicit context: [ActorContext](../actor/ActorContext.html)): [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Wrap a Receive partial function in a logging enclosure, which sends a
message with given log level to the event bus each time before a message is matched.

Wrap a Receive partial function in a logging enclosure, which sends a
message with given log level to the event bus each time before a message is matched.
This includes messages which are not handled.
5. [**](../../akka/event/LoggingReceive$.html#apply(r:akka.actor.Actor.Receive)(implicitcontext:akka.actor.ActorContext):akka.actor.Actor.Receive "Permalink")  def apply(r: [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]))(implicit context: [ActorContext](../actor/ActorContext.html)): [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Wrap a Receive partial function in a logging enclosure, which sends a
debug message to the event bus each time before a message is matched.

Wrap a Receive partial function in a logging enclosure, which sends a
debug message to the event bus each time before a message is matched.
This includes messages which are not handled.

```

def receive = LoggingReceive {
  case x => ...
}

```
This method does NOT modify the given Receive unless
`akka.actor.debug.receive` is set in configuration.
6. [**](../../akka/event/LoggingReceive$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/LoggingReceive$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/event/LoggingReceive$.html#create(r:akka.actor.AbstractActor.Receive,context:akka.actor.AbstractActor.ActorContext):akka.actor.AbstractActor.Receive "Permalink")  def create(r: [Receive](../actor/AbstractActor$$Receive.html), context: [ActorContext](../actor/AbstractActor$$ActorContext.html)): [Receive](../actor/AbstractActor$$Receive.html)Java API: compatible with lambda expressions
9. [**](../../akka/event/LoggingReceive$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/event/LoggingReceive$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../akka/event/LoggingReceive$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/event/LoggingReceive$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/event/LoggingReceive$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/event/LoggingReceive$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/event/LoggingReceive$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/event/LoggingReceive$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/event/LoggingReceive$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/event/LoggingReceive$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../akka/event/LoggingReceive$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/event/LoggingReceive$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../akka/event/LoggingReceive$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/event/LoggingReceive$.html#withLabel(label:String)(r:akka.actor.Actor.Receive)(implicitcontext:akka.actor.ActorContext):akka.actor.Actor.Receive "Permalink")  def withLabel(label: String)(r: [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]))(implicit context: [ActorContext](../actor/ActorContext.html)): [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Create a decorated logger which will append `" in state " + label` to each message it logs.
23. [**](../../akka/event/LoggingReceive$.html#withLabel(label:String,logLevel:akka.event.Logging.LogLevel)(r:akka.actor.Actor.Receive)(implicitcontext:akka.actor.ActorContext):akka.actor.Actor.Receive "Permalink")  def withLabel(label: String, logLevel: [LogLevel](Logging$$LogLevel.html))(r: [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]))(implicit context: [ActorContext](../actor/ActorContext.html)): [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Create a decorated logger which will append `" in state " + label` to each message it logs.
### Deprecated Value Members

1. [**](../../akka/event/LoggingReceive$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Code Examples

### Example 1: Value Members

```text
def receive = LoggingReceive {
  case x => ...
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/AbstractActor$$Receive.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorContext.html
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
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/Logging$$LogLevel.html
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
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/jul/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingReceive$.html](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingReceive$.html)*
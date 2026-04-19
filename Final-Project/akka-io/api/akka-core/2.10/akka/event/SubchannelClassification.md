---
description: Akka 2.10.17 - akka.event.SubchannelClassification
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:47:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/SubchannelClassification.html
title: Akka 2.10.17 - akka.event.SubchannelClassification
---

# Akka 2.10.17 - akka.event.SubchannelClassification

> **Summary:** Akka 2.10.17 - akka.event.SubchannelClassification

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
- SubchannelClassification
t[akka](../index.html).[event](index.html)

# SubchannelClassification[**](../../akka/event/SubchannelClassification.html "Permalink")

### 

#### trait SubchannelClassification extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Classification which respects relationships between channels: subscribing
to one channel automatically and idempotently subscribes to all sub\-channels.

Self TypeSubchannelClassification with [EventBus](EventBus.html)Source[EventBus.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/EventBus.scala#L125)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[EventStream](EventStream.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SubchannelClassification
2. AnyRef
3. Any
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

1. [**](../../akka/event/SubchannelClassification.html#classify(event:SubchannelClassification.this.Event):SubchannelClassification.this.Classifier "Permalink") abstract  def classify(event: (SubchannelClassification.this)\#Event): (SubchannelClassification.this)\#ClassifierReturns the Classifier associated with the given Event

Returns the Classifier associated with the given Event

Attributesprotected
2. [**](../../akka/event/SubchannelClassification.html#publish(event:SubchannelClassification.this.Event,subscriber:SubchannelClassification.this.Subscriber):Unit "Permalink") abstract  def publish(event: (SubchannelClassification.this)\#Event, subscriber: (SubchannelClassification.this)\#Subscriber): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Publishes the given Event to the given Subscriber

Publishes the given Event to the given Subscriber

Attributesprotected
3. [**](../../akka/event/SubchannelClassification.html#subclassification:akka.util.Subclassification[SubchannelClassification.this.Classifier] "Permalink") implicit abstract  def subclassification: [Subclassification](../util/Subclassification.html)\[(SubchannelClassification.this)\#Classifier]The logic to form sub\-class hierarchy

The logic to form sub\-class hierarchy

Attributesprotected
### Concrete Value Members

1. [**](../../akka/event/SubchannelClassification.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/SubchannelClassification.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/SubchannelClassification.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SubchannelClassification toany2stringadd\[SubchannelClassification] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/SubchannelClassification.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SubchannelClassification, B)ImplicitThis member is added by an implicit conversion from SubchannelClassification toArrowAssoc\[SubchannelClassification] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/SubchannelClassification.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/event/SubchannelClassification.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/SubchannelClassification.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/event/SubchannelClassification.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SubchannelClassification) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubchannelClassificationImplicitThis member is added by an implicit conversion from SubchannelClassification toEnsuring\[SubchannelClassification] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/event/SubchannelClassification.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SubchannelClassification) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubchannelClassificationImplicitThis member is added by an implicit conversion from SubchannelClassification toEnsuring\[SubchannelClassification] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/event/SubchannelClassification.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubchannelClassificationImplicitThis member is added by an implicit conversion from SubchannelClassification toEnsuring\[SubchannelClassification] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/event/SubchannelClassification.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubchannelClassificationImplicitThis member is added by an implicit conversion from SubchannelClassification toEnsuring\[SubchannelClassification] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/event/SubchannelClassification.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/event/SubchannelClassification.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/event/SubchannelClassification.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/event/SubchannelClassification.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/event/SubchannelClassification.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/event/SubchannelClassification.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/event/SubchannelClassification.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/event/SubchannelClassification.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/event/SubchannelClassification.html#publish(event:SubchannelClassification.this.Event):Unit "Permalink")  def publish(event: (SubchannelClassification.this)\#Event): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
21. [**](../../akka/event/SubchannelClassification.html#subscribe(subscriber:SubchannelClassification.this.Subscriber,to:SubchannelClassification.this.Classifier):Boolean "Permalink")  def subscribe(subscriber: (SubchannelClassification.this)\#Subscriber, to: (SubchannelClassification.this)\#Classifier): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
22. [**](../../akka/event/SubchannelClassification.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/event/SubchannelClassification.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/event/SubchannelClassification.html#unsubscribe(subscriber:SubchannelClassification.this.Subscriber):Unit "Permalink")  def unsubscribe(subscriber: (SubchannelClassification.this)\#Subscriber): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
25. [**](../../akka/event/SubchannelClassification.html#unsubscribe(subscriber:SubchannelClassification.this.Subscriber,from:SubchannelClassification.this.Classifier):Boolean "Permalink")  def unsubscribe(subscriber: (SubchannelClassification.this)\#Subscriber, from: (SubchannelClassification.this)\#Classifier): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
26. [**](../../akka/event/SubchannelClassification.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/event/SubchannelClassification.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/event/SubchannelClassification.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/event/SubchannelClassification.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/SubchannelClassification.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SubchannelClassification toStringFormat\[SubchannelClassification] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/SubchannelClassification.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SubchannelClassification, B)ImplicitThis member is added by an implicit conversion from SubchannelClassification toArrowAssoc\[SubchannelClassification] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSubchannelClassification to any2stringadd\[SubchannelClassification]

### Inherited by implicit conversion StringFormat fromSubchannelClassification to StringFormat\[SubchannelClassification]

### Inherited by implicit conversion Ensuring fromSubchannelClassification to Ensuring\[SubchannelClassification]

### Inherited by implicit conversion ArrowAssoc fromSubchannelClassification to ArrowAssoc\[SubchannelClassification]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/event/ActorClassificationUnsubscriber.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/ActorClassifier.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/ActorEventBus.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/BusLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/DeadLetterListener.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/DummyClassForStringSources.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventBus.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStreamUnsubscriber.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LogSource$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LogSource.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingBus.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingFilterWithMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingFilterWithMarkerWrapper.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingReceive$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingReceive.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LookupClassification.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/ManagedActorClassification.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/NoLogging$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/PredicateClassifier.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/ScanningClassification.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/SubchannelClassification.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/jul/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Subclassification.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/event/SubchannelClassification.html](https://doc.akka.io/api/akka-core/2.10/akka/event/SubchannelClassification.html)*
---
description: Akka 2.10.17 - akka.event.LoggingFilterWithMarker
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/LoggingFilterWithMarker.html
title: Akka 2.10.17 - akka.event.LoggingFilterWithMarker
---

# Akka 2.10.17 - akka.event.LoggingFilterWithMarker

> **Summary:** Akka 2.10.17 - akka.event.LoggingFilterWithMarker

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
- LoggingFilterWithMarker
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
[t](LoggingFilterWithMarker$.html "See companion object")[akka](../index.html).[event](index.html)

# [LoggingFilterWithMarker](LoggingFilterWithMarker$.html "See companion object")[**](../../akka/event/LoggingFilterWithMarker.html "Permalink")

### Companion [object LoggingFilterWithMarker](LoggingFilterWithMarker$.html "See companion object")

#### trait LoggingFilterWithMarker extends [LoggingFilter](LoggingFilter.html)

In retrospect should have been abstract, but we cannot change that
without breaking binary compatibility

Annotations@nowarn() Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L1561)Linear Supertypes[LoggingFilter](LoggingFilter.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DefaultLoggingFilter](DefaultLoggingFilter.html), [LoggingFilterWithMarkerWrapper](LoggingFilterWithMarkerWrapper.html), [Slf4jLoggingFilter](slf4j/Slf4jLoggingFilter.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoggingFilterWithMarker
2. LoggingFilter
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
### Abstract Value Members

1. [**](../../akka/event/LoggingFilterWithMarker.html#isDebugEnabled(logClass:Class[_],logSource:String):Boolean "Permalink") abstract  def isDebugEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[LoggingFilter](LoggingFilter.html)
2. [**](../../akka/event/LoggingFilterWithMarker.html#isErrorEnabled(logClass:Class[_],logSource:String):Boolean "Permalink") abstract  def isErrorEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[LoggingFilter](LoggingFilter.html)
3. [**](../../akka/event/LoggingFilterWithMarker.html#isInfoEnabled(logClass:Class[_],logSource:String):Boolean "Permalink") abstract  def isInfoEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[LoggingFilter](LoggingFilter.html)
4. [**](../../akka/event/LoggingFilterWithMarker.html#isWarningEnabled(logClass:Class[_],logSource:String):Boolean "Permalink") abstract  def isWarningEnabled(logClass: Class\[\_], logSource: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[LoggingFilter](LoggingFilter.html)
### Concrete Value Members

1. [**](../../akka/event/LoggingFilterWithMarker.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/LoggingFilterWithMarker.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/LoggingFilterWithMarker.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LoggingFilterWithMarker toany2stringadd\[LoggingFilterWithMarker] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/LoggingFilterWithMarker.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LoggingFilterWithMarker, B)ImplicitThis member is added by an implicit conversion from LoggingFilterWithMarker toArrowAssoc\[LoggingFilterWithMarker] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/LoggingFilterWithMarker.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/event/LoggingFilterWithMarker.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/LoggingFilterWithMarker.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/event/LoggingFilterWithMarker.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LoggingFilterWithMarker) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggingFilterWithMarkerImplicitThis member is added by an implicit conversion from LoggingFilterWithMarker toEnsuring\[LoggingFilterWithMarker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/event/LoggingFilterWithMarker.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LoggingFilterWithMarker) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingFilterWithMarkerImplicitThis member is added by an implicit conversion from LoggingFilterWithMarker toEnsuring\[LoggingFilterWithMarker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/event/LoggingFilterWithMarker.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggingFilterWithMarkerImplicitThis member is added by an implicit conversion from LoggingFilterWithMarker toEnsuring\[LoggingFilterWithMarker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/event/LoggingFilterWithMarker.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingFilterWithMarkerImplicitThis member is added by an implicit conversion from LoggingFilterWithMarker toEnsuring\[LoggingFilterWithMarker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/event/LoggingFilterWithMarker.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/event/LoggingFilterWithMarker.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/event/LoggingFilterWithMarker.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/event/LoggingFilterWithMarker.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/event/LoggingFilterWithMarker.html#isDebugEnabled(logClass:Class[_],logSource:String,marker:akka.event.LogMarker):Boolean "Permalink")  def isDebugEnabled(logClass: Class\[\_], logSource: String, marker: [LogMarker](LogMarker.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
17. [**](../../akka/event/LoggingFilterWithMarker.html#isErrorEnabled(logClass:Class[_],logSource:String,marker:akka.event.LogMarker):Boolean "Permalink")  def isErrorEnabled(logClass: Class\[\_], logSource: String, marker: [LogMarker](LogMarker.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
18. [**](../../akka/event/LoggingFilterWithMarker.html#isInfoEnabled(logClass:Class[_],logSource:String,marker:akka.event.LogMarker):Boolean "Permalink")  def isInfoEnabled(logClass: Class\[\_], logSource: String, marker: [LogMarker](LogMarker.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
19. [**](../../akka/event/LoggingFilterWithMarker.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../akka/event/LoggingFilterWithMarker.html#isWarningEnabled(logClass:Class[_],logSource:String,marker:akka.event.LogMarker):Boolean "Permalink")  def isWarningEnabled(logClass: Class\[\_], logSource: String, marker: [LogMarker](LogMarker.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
21. [**](../../akka/event/LoggingFilterWithMarker.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/event/LoggingFilterWithMarker.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/event/LoggingFilterWithMarker.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/event/LoggingFilterWithMarker.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/event/LoggingFilterWithMarker.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/event/LoggingFilterWithMarker.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/event/LoggingFilterWithMarker.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/event/LoggingFilterWithMarker.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/event/LoggingFilterWithMarker.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/LoggingFilterWithMarker.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LoggingFilterWithMarker toStringFormat\[LoggingFilterWithMarker] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/LoggingFilterWithMarker.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LoggingFilterWithMarker, B)ImplicitThis member is added by an implicit conversion from LoggingFilterWithMarker toArrowAssoc\[LoggingFilterWithMarker] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LoggingFilter](LoggingFilter.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLoggingFilterWithMarker to any2stringadd\[LoggingFilterWithMarker]

### Inherited by implicit conversion StringFormat fromLoggingFilterWithMarker to StringFormat\[LoggingFilterWithMarker]

### Inherited by implicit conversion Ensuring fromLoggingFilterWithMarker to Ensuring\[LoggingFilterWithMarker]

### Inherited by implicit conversion ArrowAssoc fromLoggingFilterWithMarker to ArrowAssoc\[LoggingFilterWithMarker]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/api/akka/2.10/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/event/LoggingFilterWithMarker.html](https://doc.akka.io/api/akka/2.10/akka/event/LoggingFilterWithMarker.html)*
---
description: Akka 2.10.17 - akka.event.DiagnosticLoggingAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:52:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/DiagnosticLoggingAdapter.html
title: Akka 2.10.17 - akka.event.DiagnosticLoggingAdapter
---

# Akka 2.10.17 - akka.event.DiagnosticLoggingAdapter

> **Summary:** Akka 2.10.17 - akka.event.DiagnosticLoggingAdapter

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
- DiagnosticLoggingAdapter
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
t[akka](../index.html).[event](index.html)

# DiagnosticLoggingAdapter[**](../../akka/event/DiagnosticLoggingAdapter.html "Permalink")

### 

#### trait DiagnosticLoggingAdapter extends [LoggingAdapter](LoggingAdapter.html)

LoggingAdapter extension which adds MDC support.
Only recommended to be used within Actors as it isn't thread safe.

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L1611)Linear Supertypes[LoggingAdapter](LoggingAdapter.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DiagnosticLoggingAdapter
2. LoggingAdapter
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
### Type Members

1. [**](../../akka/event/DiagnosticLoggingAdapter.html#MDC=akka.event.Logging.MDC "Permalink")  type MDC \= [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition Classes[LoggingAdapter](LoggingAdapter.html)
### Abstract Value Members

1. [**](../../akka/event/DiagnosticLoggingAdapter.html#isDebugEnabled:Boolean "Permalink") abstract  def isDebugEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[LoggingAdapter](LoggingAdapter.html)
2. [**](../../akka/event/DiagnosticLoggingAdapter.html#isErrorEnabled:Boolean "Permalink") abstract  def isErrorEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[LoggingAdapter](LoggingAdapter.html)
3. [**](../../akka/event/DiagnosticLoggingAdapter.html#isInfoEnabled:Boolean "Permalink") abstract  def isInfoEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[LoggingAdapter](LoggingAdapter.html)
4. [**](../../akka/event/DiagnosticLoggingAdapter.html#isWarningEnabled:Boolean "Permalink") abstract  def isWarningEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[LoggingAdapter](LoggingAdapter.html)
5. [**](../../akka/event/DiagnosticLoggingAdapter.html#notifyDebug(message:String):Unit "Permalink") abstract  def notifyDebug(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[LoggingAdapter](LoggingAdapter.html)
6. [**](../../akka/event/DiagnosticLoggingAdapter.html#notifyError(cause:Throwable,message:String):Unit "Permalink") abstract  def notifyError(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[LoggingAdapter](LoggingAdapter.html)
7. [**](../../akka/event/DiagnosticLoggingAdapter.html#notifyError(message:String):Unit "Permalink") abstract  def notifyError(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[LoggingAdapter](LoggingAdapter.html)
8. [**](../../akka/event/DiagnosticLoggingAdapter.html#notifyInfo(message:String):Unit "Permalink") abstract  def notifyInfo(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[LoggingAdapter](LoggingAdapter.html)
9. [**](../../akka/event/DiagnosticLoggingAdapter.html#notifyWarning(message:String):Unit "Permalink") abstract  def notifyWarning(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[LoggingAdapter](LoggingAdapter.html)
### Concrete Value Members

1. [**](../../akka/event/DiagnosticLoggingAdapter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/DiagnosticLoggingAdapter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/DiagnosticLoggingAdapter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DiagnosticLoggingAdapter toany2stringadd\[DiagnosticLoggingAdapter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/DiagnosticLoggingAdapter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DiagnosticLoggingAdapter, B)ImplicitThis member is added by an implicit conversion from DiagnosticLoggingAdapter toArrowAssoc\[DiagnosticLoggingAdapter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/DiagnosticLoggingAdapter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/event/DiagnosticLoggingAdapter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/DiagnosticLoggingAdapter.html#clearMDC():Unit "Permalink")  def clearMDC(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all entries in the MDC
8. [**](../../akka/event/DiagnosticLoggingAdapter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/event/DiagnosticLoggingAdapter.html#debug(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
10. [**](../../akka/event/DiagnosticLoggingAdapter.html#debug(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
11. [**](../../akka/event/DiagnosticLoggingAdapter.html#debug(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
12. [**](../../akka/event/DiagnosticLoggingAdapter.html#debug(template:String,arg1:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
13. [**](../../akka/event/DiagnosticLoggingAdapter.html#debug(message:String):Unit "Permalink")  def debug(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at debug level.

Log message at debug level.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
14. [**](../../akka/event/DiagnosticLoggingAdapter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DiagnosticLoggingAdapter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DiagnosticLoggingAdapterImplicitThis member is added by an implicit conversion from DiagnosticLoggingAdapter toEnsuring\[DiagnosticLoggingAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/event/DiagnosticLoggingAdapter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DiagnosticLoggingAdapter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DiagnosticLoggingAdapterImplicitThis member is added by an implicit conversion from DiagnosticLoggingAdapter toEnsuring\[DiagnosticLoggingAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/event/DiagnosticLoggingAdapter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DiagnosticLoggingAdapterImplicitThis member is added by an implicit conversion from DiagnosticLoggingAdapter toEnsuring\[DiagnosticLoggingAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/event/DiagnosticLoggingAdapter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DiagnosticLoggingAdapterImplicitThis member is added by an implicit conversion from DiagnosticLoggingAdapter toEnsuring\[DiagnosticLoggingAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/event/DiagnosticLoggingAdapter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/event/DiagnosticLoggingAdapter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
21. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
22. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
23. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(template:String,arg1:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
24. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(message:String):Unit "Permalink")  def error(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at error level, without providing the exception that caused the error.

Log message at error level, without providing the exception that caused the error.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
25. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
26. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
27. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
28. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(cause:Throwable,template:String,arg1:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
29. [**](../../akka/event/DiagnosticLoggingAdapter.html#error(cause:Throwable,message:String):Unit "Permalink")  def error(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at error level, including the exception that caused the error.

Log message at error level, including the exception that caused the error.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
30. [**](../../akka/event/DiagnosticLoggingAdapter.html#format(t:String,arg:Any*):String "Permalink")  def format(t: String, arg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): StringDefinition Classes[LoggingAdapter](LoggingAdapter.html)
31. [**](../../akka/event/DiagnosticLoggingAdapter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../akka/event/DiagnosticLoggingAdapter.html#getMDC:java.util.Map[String,Any] "Permalink")  def getMDC: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Java API:
Mapped Diagnostic Context for application defined values
which can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.

Java API:
Mapped Diagnostic Context for application defined values
which can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.
Visit [Logback Docs: MDC](https://logback.qos.ch/manual/mdc.html) for more information.
Note tha it returns a **COPY** of the actual MDC values.
You cannot modify any value by changing the returned Map.
Code like the following won't have any effect unless you set back the modified Map.

```
Map mdc = log.getMDC();
mdc.put("key", value);
// NEEDED
log.setMDC(mdc);
```
returnsA copy of the actual MDC values
33. [**](../../akka/event/DiagnosticLoggingAdapter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/event/DiagnosticLoggingAdapter.html#info(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
35. [**](../../akka/event/DiagnosticLoggingAdapter.html#info(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
36. [**](../../akka/event/DiagnosticLoggingAdapter.html#info(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
37. [**](../../akka/event/DiagnosticLoggingAdapter.html#info(template:String,arg1:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
38. [**](../../akka/event/DiagnosticLoggingAdapter.html#info(message:String):Unit "Permalink")  def info(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at info level.

Log message at info level.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
39. [**](../../akka/event/DiagnosticLoggingAdapter.html#isEnabled(level:akka.event.Logging.LogLevel):Boolean "Permalink") final  def isEnabled(level: [LogLevel](Logging$$LogLevel.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)returnstrue if the specified log level is enabled

Definition Classes[LoggingAdapter](LoggingAdapter.html)
40. [**](../../akka/event/DiagnosticLoggingAdapter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
41. [**](../../akka/event/DiagnosticLoggingAdapter.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
42. [**](../../akka/event/DiagnosticLoggingAdapter.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
43. [**](../../akka/event/DiagnosticLoggingAdapter.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
44. [**](../../akka/event/DiagnosticLoggingAdapter.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
45. [**](../../akka/event/DiagnosticLoggingAdapter.html#log(level:akka.event.Logging.LogLevel,message:String):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at the specified log level.

Log message at the specified log level.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
46. [**](../../akka/event/DiagnosticLoggingAdapter.html#mdc(mdc:DiagnosticLoggingAdapter.this.MDC):Unit "Permalink")  def mdc(mdc: [MDC](#MDC=akka.event.Logging.MDC)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API:
Sets the values to be added to the MDC (Mapped Diagnostic Context) before the log is appended.

Scala API:
Sets the values to be added to the MDC (Mapped Diagnostic Context) before the log is appended.
These values can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.
Visit [Logback Docs: MDC](https://logback.qos.ch/manual/mdc.html) for more information.
47. [**](../../akka/event/DiagnosticLoggingAdapter.html#mdc:DiagnosticLoggingAdapter.this.MDC "Permalink")  def mdc: [MDC](#MDC=akka.event.Logging.MDC)Scala API:
Mapped Diagnostic Context for application defined values
which can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.

Scala API:
Mapped Diagnostic Context for application defined values
which can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.
Visit [Logback Docs: MDC](https://logback.qos.ch/manual/mdc.html) for more information.

returnsA Map containing the MDC values added by the application, or empty Map if no value was added.

Definition ClassesDiagnosticLoggingAdapter → [LoggingAdapter](LoggingAdapter.html)
48. [**](../../akka/event/DiagnosticLoggingAdapter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
49. [**](../../akka/event/DiagnosticLoggingAdapter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
50. [**](../../akka/event/DiagnosticLoggingAdapter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
51. [**](../../akka/event/DiagnosticLoggingAdapter.html#notifyLog(level:akka.event.Logging.LogLevel,message:String):Unit "Permalink") final  def notifyLog(level: [LogLevel](Logging$$LogLevel.html), message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[LoggingAdapter](LoggingAdapter.html)
52. [**](../../akka/event/DiagnosticLoggingAdapter.html#notifyWarning(cause:Throwable,message:String):Unit "Permalink")  def notifyWarning(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[LoggingAdapter](LoggingAdapter.html)
53. [**](../../akka/event/DiagnosticLoggingAdapter.html#setMDC(jMdc:java.util.Map[String,Any]):Unit "Permalink")  def setMDC(jMdc: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API:
Sets the values to be added to the MDC (Mapped Diagnostic Context) before the log is appended.

Java API:
Sets the values to be added to the MDC (Mapped Diagnostic Context) before the log is appended.
These values can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.
Visit [Logback Docs: MDC](https://logback.qos.ch/manual/mdc.html) for more information.
54. [**](../../akka/event/DiagnosticLoggingAdapter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
55. [**](../../akka/event/DiagnosticLoggingAdapter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
56. [**](../../akka/event/DiagnosticLoggingAdapter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
57. [**](../../akka/event/DiagnosticLoggingAdapter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
58. [**](../../akka/event/DiagnosticLoggingAdapter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
59. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
60. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
61. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
62. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(template:String,arg1:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
63. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(message:String):Unit "Permalink")  def warning(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at warning level.

Log message at warning level.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
64. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
65. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
66. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
67. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(cause:Throwable,template:String,arg1:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
68. [**](../../akka/event/DiagnosticLoggingAdapter.html#warning(cause:Throwable,message:String):Unit "Permalink")  def warning(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at warning level, including the exception that indicated the warning.

Log message at warning level, including the exception that indicated the warning.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
### Deprecated Value Members

1. [**](../../akka/event/DiagnosticLoggingAdapter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/DiagnosticLoggingAdapter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DiagnosticLoggingAdapter toStringFormat\[DiagnosticLoggingAdapter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/DiagnosticLoggingAdapter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DiagnosticLoggingAdapter, B)ImplicitThis member is added by an implicit conversion from DiagnosticLoggingAdapter toArrowAssoc\[DiagnosticLoggingAdapter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LoggingAdapter](LoggingAdapter.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDiagnosticLoggingAdapter to any2stringadd\[DiagnosticLoggingAdapter]

### Inherited by implicit conversion StringFormat fromDiagnosticLoggingAdapter to StringFormat\[DiagnosticLoggingAdapter]

### Inherited by implicit conversion Ensuring fromDiagnosticLoggingAdapter to Ensuring\[DiagnosticLoggingAdapter]

### Inherited by implicit conversion ArrowAssoc fromDiagnosticLoggingAdapter to ArrowAssoc\[DiagnosticLoggingAdapter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/event/ActorClassificationUnsubscriber.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/ActorClassifier.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/ActorEventBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/BusLogging.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/DeadLetterListener.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/DummyClassForStringSources.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/EventBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/EventStreamUnsubscriber.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LogSource$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LogSource.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingFilterWithMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingFilterWithMarkerWrapper.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingReceive$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingReceive.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LookupClassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/ManagedActorClassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/NoLogging$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/PredicateClassifier.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/ScanningClassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/SubchannelClassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/event/DiagnosticLoggingAdapter.html](https://doc.akka.io/api/akka-core/2.10.17/akka/event/DiagnosticLoggingAdapter.html)*
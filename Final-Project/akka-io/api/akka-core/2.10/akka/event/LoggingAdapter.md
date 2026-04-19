---
description: Akka 2.10.17 - akka.event.LoggingAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/LoggingAdapter.html
title: Akka 2.10.17 - akka.event.LoggingAdapter
---

# Akka 2.10.17 - akka.event.LoggingAdapter

> **Summary:** Akka 2.10.17 - akka.event.LoggingAdapter

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
- LoggingAdapter
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

# LoggingAdapter[**](../../akka/event/LoggingAdapter.html "Permalink")

### 

#### trait LoggingAdapter extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Logging wrapper to make nicer and optimize: provide template versions which
evaluate .toString only if the log level is actually enabled. Typically used
by obtaining an implementation from the Logging object:

```
val log = Logging(<bus>, <source object>)
...
log.info("hello world!")
```
All log\-level methods support simple interpolation templates with up to four
arguments placed by using `{}` within the template (first string
argument):

```
log.error(exception, "Exception while processing {} in state {}", msg, state)
```
More than four arguments can be defined by using an `Array` with the method with
one argument parameter.

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L1179)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[BusLogging](BusLogging.html), [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html), [DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html), [MarkerLoggingAdapter](MarkerLoggingAdapter.html), [NoLogging](NoLogging$.html), [NoMarkerLogging](NoMarkerLogging$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoggingAdapter
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
### Type Members

1. [**](../../akka/event/LoggingAdapter.html#MDC=akka.event.Logging.MDC "Permalink")  type MDC \= [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
### Abstract Value Members

1. [**](../../akka/event/LoggingAdapter.html#isDebugEnabled:Boolean "Permalink") abstract  def isDebugEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
2. [**](../../akka/event/LoggingAdapter.html#isErrorEnabled:Boolean "Permalink") abstract  def isErrorEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
3. [**](../../akka/event/LoggingAdapter.html#isInfoEnabled:Boolean "Permalink") abstract  def isInfoEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
4. [**](../../akka/event/LoggingAdapter.html#isWarningEnabled:Boolean "Permalink") abstract  def isWarningEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
5. [**](../../akka/event/LoggingAdapter.html#notifyDebug(message:String):Unit "Permalink") abstract  def notifyDebug(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
6. [**](../../akka/event/LoggingAdapter.html#notifyError(cause:Throwable,message:String):Unit "Permalink") abstract  def notifyError(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
7. [**](../../akka/event/LoggingAdapter.html#notifyError(message:String):Unit "Permalink") abstract  def notifyError(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
8. [**](../../akka/event/LoggingAdapter.html#notifyInfo(message:String):Unit "Permalink") abstract  def notifyInfo(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
9. [**](../../akka/event/LoggingAdapter.html#notifyWarning(message:String):Unit "Permalink") abstract  def notifyWarning(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
### Concrete Value Members

1. [**](../../akka/event/LoggingAdapter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/LoggingAdapter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/LoggingAdapter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LoggingAdapter toany2stringadd\[LoggingAdapter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/event/LoggingAdapter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LoggingAdapter, B)ImplicitThis member is added by an implicit conversion from LoggingAdapter toArrowAssoc\[LoggingAdapter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/event/LoggingAdapter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/event/LoggingAdapter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/event/LoggingAdapter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/event/LoggingAdapter.html#debug(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

See alsoLoggingAdapter
9. [**](../../akka/event/LoggingAdapter.html#debug(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

See alsoLoggingAdapter
10. [**](../../akka/event/LoggingAdapter.html#debug(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

See alsoLoggingAdapter
11. [**](../../akka/event/LoggingAdapter.html#debug(template:String,arg1:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

See alsoLoggingAdapter
12. [**](../../akka/event/LoggingAdapter.html#debug(message:String):Unit "Permalink")  def debug(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at debug level.

Log message at debug level.

See alsoLoggingAdapter
13. [**](../../akka/event/LoggingAdapter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LoggingAdapter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggingAdapterImplicitThis member is added by an implicit conversion from LoggingAdapter toEnsuring\[LoggingAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/event/LoggingAdapter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LoggingAdapter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingAdapterImplicitThis member is added by an implicit conversion from LoggingAdapter toEnsuring\[LoggingAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/event/LoggingAdapter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggingAdapterImplicitThis member is added by an implicit conversion from LoggingAdapter toEnsuring\[LoggingAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/event/LoggingAdapter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingAdapterImplicitThis member is added by an implicit conversion from LoggingAdapter toEnsuring\[LoggingAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/event/LoggingAdapter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/event/LoggingAdapter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../akka/event/LoggingAdapter.html#error(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

See alsoLoggingAdapter
20. [**](../../akka/event/LoggingAdapter.html#error(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

See alsoLoggingAdapter
21. [**](../../akka/event/LoggingAdapter.html#error(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

See alsoLoggingAdapter
22. [**](../../akka/event/LoggingAdapter.html#error(template:String,arg1:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

See alsoLoggingAdapter
23. [**](../../akka/event/LoggingAdapter.html#error(message:String):Unit "Permalink")  def error(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at error level, without providing the exception that caused the error.

Log message at error level, without providing the exception that caused the error.

See alsoLoggingAdapter
24. [**](../../akka/event/LoggingAdapter.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

See alsoLoggingAdapter
25. [**](../../akka/event/LoggingAdapter.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

See alsoLoggingAdapter
26. [**](../../akka/event/LoggingAdapter.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

See alsoLoggingAdapter
27. [**](../../akka/event/LoggingAdapter.html#error(cause:Throwable,template:String,arg1:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

See alsoLoggingAdapter
28. [**](../../akka/event/LoggingAdapter.html#error(cause:Throwable,message:String):Unit "Permalink")  def error(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at error level, including the exception that caused the error.

Log message at error level, including the exception that caused the error.

See alsoLoggingAdapter
29. [**](../../akka/event/LoggingAdapter.html#format(t:String,arg:Any*):String "Permalink")  def format(t: String, arg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): String
30. [**](../../akka/event/LoggingAdapter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../akka/event/LoggingAdapter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../akka/event/LoggingAdapter.html#info(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

See alsoLoggingAdapter
33. [**](../../akka/event/LoggingAdapter.html#info(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

See alsoLoggingAdapter
34. [**](../../akka/event/LoggingAdapter.html#info(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

See alsoLoggingAdapter
35. [**](../../akka/event/LoggingAdapter.html#info(template:String,arg1:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

See alsoLoggingAdapter
36. [**](../../akka/event/LoggingAdapter.html#info(message:String):Unit "Permalink")  def info(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at info level.

Log message at info level.

See alsoLoggingAdapter
37. [**](../../akka/event/LoggingAdapter.html#isEnabled(level:akka.event.Logging.LogLevel):Boolean "Permalink") final  def isEnabled(level: [LogLevel](Logging$$LogLevel.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)returnstrue if the specified log level is enabled
38. [**](../../akka/event/LoggingAdapter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
39. [**](../../akka/event/LoggingAdapter.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.
40. [**](../../akka/event/LoggingAdapter.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.
41. [**](../../akka/event/LoggingAdapter.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.
42. [**](../../akka/event/LoggingAdapter.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.
43. [**](../../akka/event/LoggingAdapter.html#log(level:akka.event.Logging.LogLevel,message:String):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at the specified log level.
44. [**](../../akka/event/LoggingAdapter.html#mdc:akka.event.Logging.MDC "Permalink")  def mdc: [Logging.MDC](Logging$.html#MDC=Map[String,Any])
45. [**](../../akka/event/LoggingAdapter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
46. [**](../../akka/event/LoggingAdapter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
47. [**](../../akka/event/LoggingAdapter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
48. [**](../../akka/event/LoggingAdapter.html#notifyLog(level:akka.event.Logging.LogLevel,message:String):Unit "Permalink") final  def notifyLog(level: [LogLevel](Logging$$LogLevel.html), message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
49. [**](../../akka/event/LoggingAdapter.html#notifyWarning(cause:Throwable,message:String):Unit "Permalink")  def notifyWarning(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
50. [**](../../akka/event/LoggingAdapter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
51. [**](../../akka/event/LoggingAdapter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
52. [**](../../akka/event/LoggingAdapter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
53. [**](../../akka/event/LoggingAdapter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
54. [**](../../akka/event/LoggingAdapter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
55. [**](../../akka/event/LoggingAdapter.html#warning(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

See alsoLoggingAdapter
56. [**](../../akka/event/LoggingAdapter.html#warning(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

See alsoLoggingAdapter
57. [**](../../akka/event/LoggingAdapter.html#warning(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

See alsoLoggingAdapter
58. [**](../../akka/event/LoggingAdapter.html#warning(template:String,arg1:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

See alsoLoggingAdapter
59. [**](../../akka/event/LoggingAdapter.html#warning(message:String):Unit "Permalink")  def warning(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at warning level.

Log message at warning level.

See alsoLoggingAdapter
60. [**](../../akka/event/LoggingAdapter.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

See alsoLoggingAdapter
61. [**](../../akka/event/LoggingAdapter.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

See alsoLoggingAdapter
62. [**](../../akka/event/LoggingAdapter.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

See alsoLoggingAdapter
63. [**](../../akka/event/LoggingAdapter.html#warning(cause:Throwable,template:String,arg1:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

See alsoLoggingAdapter
64. [**](../../akka/event/LoggingAdapter.html#warning(cause:Throwable,message:String):Unit "Permalink")  def warning(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at warning level, including the exception that indicated the warning.

Log message at warning level, including the exception that indicated the warning.

See alsoLoggingAdapter
### Deprecated Value Members

1. [**](../../akka/event/LoggingAdapter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/LoggingAdapter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LoggingAdapter toStringFormat\[LoggingAdapter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/LoggingAdapter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LoggingAdapter, B)ImplicitThis member is added by an implicit conversion from LoggingAdapter toArrowAssoc\[LoggingAdapter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLoggingAdapter to any2stringadd\[LoggingAdapter]

### Inherited by implicit conversion StringFormat fromLoggingAdapter to StringFormat\[LoggingAdapter]

### Inherited by implicit conversion Ensuring fromLoggingAdapter to Ensuring\[LoggingAdapter]

### Inherited by implicit conversion ArrowAssoc fromLoggingAdapter to ArrowAssoc\[LoggingAdapter]

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
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogLevel.html
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
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html)*
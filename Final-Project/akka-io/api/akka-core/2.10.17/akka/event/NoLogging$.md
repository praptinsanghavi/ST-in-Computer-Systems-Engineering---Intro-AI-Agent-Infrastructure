---
description: Akka 2.10.17 - akka.event.NoLogging
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:53:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/NoLogging$.html
title: Akka 2.10.17 - akka.event.NoLogging
---

# Akka 2.10.17 - akka.event.NoLogging

> **Summary:** Akka 2.10.17 - akka.event.NoLogging

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
- NoLogging
- [NoMarkerLogging](NoMarkerLogging$.html "NoLogging is a MarkerLoggingAdapter that does absolutely nothing – no logging at all.")
- [PredicateClassifier](PredicateClassifier.html "Can be mixed into an EventBus to specify that the Classifier type is a Function from Event to Boolean (predicate)")
- [ScanningClassification](ScanningClassification.html "Maps Classifiers to Subscribers and selects which Subscriber should receive which publication through scanning through all Subscribers through the matches(classifier, event) method")
- [SubchannelClassification](SubchannelClassification.html "Classification which respects relationships between channels: subscribing to one channel automatically and idempotently subscribes to all sub-channels.")
o[akka](../index.html).[event](index.html)

# NoLogging[**](../../akka/event/NoLogging$.html "Permalink")

### 

#### object NoLogging extends [LoggingAdapter](LoggingAdapter.html)

NoLogging is a LoggingAdapter that does absolutely nothing – no logging at all.

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L2031)Linear Supertypes[LoggingAdapter](LoggingAdapter.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NoLogging
2. LoggingAdapter
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/event/NoLogging$.html#MDC=akka.event.Logging.MDC "Permalink")  type MDC \= [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition Classes[LoggingAdapter](LoggingAdapter.html)
### Value Members

1. [**](../../akka/event/NoLogging$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/NoLogging$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/NoLogging$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/event/NoLogging$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/event/NoLogging$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/event/NoLogging$.html#debug(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
7. [**](../../akka/event/NoLogging$.html#debug(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
8. [**](../../akka/event/NoLogging$.html#debug(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
9. [**](../../akka/event/NoLogging$.html#debug(template:String,arg1:Any):Unit "Permalink")  def debug(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
10. [**](../../akka/event/NoLogging$.html#debug(message:String):Unit "Permalink")  def debug(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at debug level.

Log message at debug level.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
11. [**](../../akka/event/NoLogging$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/event/NoLogging$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
13. [**](../../akka/event/NoLogging$.html#error(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
14. [**](../../akka/event/NoLogging$.html#error(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
15. [**](../../akka/event/NoLogging$.html#error(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
16. [**](../../akka/event/NoLogging$.html#error(template:String,arg1:Any):Unit "Permalink")  def error(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
17. [**](../../akka/event/NoLogging$.html#error(message:String):Unit "Permalink")  def error(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at error level, without providing the exception that caused the error.

Log message at error level, without providing the exception that caused the error.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
18. [**](../../akka/event/NoLogging$.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
19. [**](../../akka/event/NoLogging$.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
20. [**](../../akka/event/NoLogging$.html#error(cause:Throwable,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
21. [**](../../akka/event/NoLogging$.html#error(cause:Throwable,template:String,arg1:Any):Unit "Permalink")  def error(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
22. [**](../../akka/event/NoLogging$.html#error(cause:Throwable,message:String):Unit "Permalink")  def error(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at error level, including the exception that caused the error.

Log message at error level, including the exception that caused the error.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
23. [**](../../akka/event/NoLogging$.html#format(t:String,arg:Any*):String "Permalink")  def format(t: String, arg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): StringDefinition Classes[LoggingAdapter](LoggingAdapter.html)
24. [**](../../akka/event/NoLogging$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/event/NoLogging$.html#getInstance:akka.event.NoLogging.type "Permalink")  def getInstance: NoLoggingJava API to return the reference to NoLogging

Java API to return the reference to NoLogging

returnsThe NoLogging instance
26. [**](../../akka/event/NoLogging$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/event/NoLogging$.html#info(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
28. [**](../../akka/event/NoLogging$.html#info(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
29. [**](../../akka/event/NoLogging$.html#info(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
30. [**](../../akka/event/NoLogging$.html#info(template:String,arg1:Any):Unit "Permalink")  def info(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
31. [**](../../akka/event/NoLogging$.html#info(message:String):Unit "Permalink")  def info(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at info level.

Log message at info level.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
32. [**](../../akka/event/NoLogging$.html#isDebugEnabled:Boolean "Permalink") final  def isDebugEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
33. [**](../../akka/event/NoLogging$.html#isEnabled(level:akka.event.Logging.LogLevel):Boolean "Permalink") final  def isEnabled(level: [LogLevel](Logging$$LogLevel.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)returnstrue if the specified log level is enabled

Definition Classes[LoggingAdapter](LoggingAdapter.html)
34. [**](../../akka/event/NoLogging$.html#isErrorEnabled:Boolean "Permalink") final  def isErrorEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
35. [**](../../akka/event/NoLogging$.html#isInfoEnabled:Boolean "Permalink") final  def isInfoEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
36. [**](../../akka/event/NoLogging$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
37. [**](../../akka/event/NoLogging$.html#isWarningEnabled:Boolean "Permalink") final  def isWarningEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
38. [**](../../akka/event/NoLogging$.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
39. [**](../../akka/event/NoLogging$.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
40. [**](../../akka/event/NoLogging$.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
41. [**](../../akka/event/NoLogging$.html#log(level:akka.event.Logging.LogLevel,template:String,arg1:Any):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
42. [**](../../akka/event/NoLogging$.html#log(level:akka.event.Logging.LogLevel,message:String):Unit "Permalink")  def log(level: [LogLevel](Logging$$LogLevel.html), message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at the specified log level.

Log message at the specified log level.

Definition Classes[LoggingAdapter](LoggingAdapter.html)
43. [**](../../akka/event/NoLogging$.html#mdc:akka.event.Logging.MDC "Permalink")  def mdc: [Logging.MDC](Logging$.html#MDC=Map[String,Any])Definition Classes[LoggingAdapter](LoggingAdapter.html)
44. [**](../../akka/event/NoLogging$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
45. [**](../../akka/event/NoLogging$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
46. [**](../../akka/event/NoLogging$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
47. [**](../../akka/event/NoLogging$.html#notifyDebug(message:String):Unit "Permalink") final  def notifyDebug(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
48. [**](../../akka/event/NoLogging$.html#notifyError(cause:Throwable,message:String):Unit "Permalink") final  def notifyError(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
49. [**](../../akka/event/NoLogging$.html#notifyError(message:String):Unit "Permalink") final  def notifyError(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
50. [**](../../akka/event/NoLogging$.html#notifyInfo(message:String):Unit "Permalink") final  def notifyInfo(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
51. [**](../../akka/event/NoLogging$.html#notifyLog(level:akka.event.Logging.LogLevel,message:String):Unit "Permalink") final  def notifyLog(level: [LogLevel](Logging$$LogLevel.html), message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[LoggingAdapter](LoggingAdapter.html)
52. [**](../../akka/event/NoLogging$.html#notifyWarning(cause:Throwable,message:String):Unit "Permalink") final  def notifyWarning(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
53. [**](../../akka/event/NoLogging$.html#notifyWarning(message:String):Unit "Permalink") final  def notifyWarning(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesNoLogging → [LoggingAdapter](LoggingAdapter.html)
54. [**](../../akka/event/NoLogging$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
55. [**](../../akka/event/NoLogging$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
56. [**](../../akka/event/NoLogging$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
57. [**](../../akka/event/NoLogging$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
58. [**](../../akka/event/NoLogging$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
59. [**](../../akka/event/NoLogging$.html#warning(template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
60. [**](../../akka/event/NoLogging$.html#warning(template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
61. [**](../../akka/event/NoLogging$.html#warning(template:String,arg1:Any,arg2:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
62. [**](../../akka/event/NoLogging$.html#warning(template:String,arg1:Any):Unit "Permalink")  def warning(template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
63. [**](../../akka/event/NoLogging$.html#warning(message:String):Unit "Permalink")  def warning(message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at warning level.

Log message at warning level.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
64. [**](../../akka/event/NoLogging$.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any,arg4:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg4: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 4 replacement arguments.

Message template with 4 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
65. [**](../../akka/event/NoLogging$.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any,arg3:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg3: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 3 replacement arguments.

Message template with 3 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
66. [**](../../akka/event/NoLogging$.html#warning(cause:Throwable,template:String,arg1:Any,arg2:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 2 replacement arguments.

Message template with 2 replacement arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
67. [**](../../akka/event/NoLogging$.html#warning(cause:Throwable,template:String,arg1:Any):Unit "Permalink")  def warning(cause: Throwable, template: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Message template with 1 replacement argument.

Message template with 1 replacement argument.

If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
there are more than four arguments.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
68. [**](../../akka/event/NoLogging$.html#warning(cause:Throwable,message:String):Unit "Permalink")  def warning(cause: Throwable, message: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log message at warning level, including the exception that indicated the warning.

Log message at warning level, including the exception that indicated the warning.

Definition Classes[LoggingAdapter](LoggingAdapter.html)See also[LoggingAdapter](LoggingAdapter.html)
### Deprecated Value Members

1. [**](../../akka/event/NoLogging$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [LoggingAdapter](LoggingAdapter.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/event/NoLogging$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/event/NoLogging$.html)*
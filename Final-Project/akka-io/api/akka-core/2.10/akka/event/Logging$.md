---
description: Akka 2.10.17 - akka.event.Logging
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/Logging$.html
title: Akka 2.10.17 - akka.event.Logging
---

# Akka 2.10.17 - akka.event.Logging

> **Summary:** Akka 2.10.17 - akka.event.Logging

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
- Logging
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
o[akka](../index.html).[event](index.html)

# Logging[**](../../akka/event/Logging$.html "Permalink")

### 

#### object Logging

Main entry point for Akka logging: log levels and message types (aka
channels) defined for the main transport medium, the main event bus. The
recommended use is to obtain an implementation of the Logging trait with
suitable and efficient methods for generating log events:

```

val log = Logging(<bus>, <source object>)
...
log.info("hello world!")

```
The source object is used in two fashions: its `Class[_]` will be part of
all log events produced by this logger, plus a string representation is
generated which may contain per\-instance information, see `apply` or `create`
below.

Loggers are attached to the level\-specific channels `Error`,
`Warning`, `Info` and `Debug` as
appropriate for the configured (or set) log level. If you want to implement
your own, make sure to handle these four event types plus the `InitializeLogger`
message which is sent before actually attaching it to the logging bus.

Logging is configured by setting (some of) the following:

```

akka {
  loggers = ["akka.slf4j.Slf4jLogger"] # for example
  loglevel = "INFO"        # used when normal logging ("loggers") has been started
  stdout-loglevel = "WARN" # used during application start-up until normal logging is available
}

```

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L425)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Logging
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/event/Logging$$Debug.html "Permalink")  case class [Debug](Logging$$Debug.html "For DEBUG Logging")(logSource: String, logClass: Class\[\_], message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= "") extends [LogEvent](Logging$$LogEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor DEBUG Logging
2. [**](../../akka/event/Logging$$Debug2.html "Permalink")  class [Debug2](Logging$$Debug2.html) extends [Debug](Logging$$Debug.html)
3. [**](../../akka/event/Logging$$Debug3.html "Permalink")  class [Debug3](Logging$$Debug3.html) extends [Debug2](Logging$$Debug2.html) with [LogEventWithMarker](Logging$$LogEventWithMarker.html)
4. [**](../../akka/event/Logging$$DefaultLogger.html "Permalink")  class [DefaultLogger](Logging$$DefaultLogger.html "Actor wrapper around the standard output logger.") extends [Actor](../actor/Actor.html) with [StdOutLogger](Logging$$StdOutLogger.html) with [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](LoggerMessageQueueSemantics.html)]Actor wrapper around the standard output logger.

Actor wrapper around the standard output logger. If
`akka.loggers` is not set, it defaults to just this
logger.
5. [**](../../akka/event/Logging$$Error.html "Permalink")  case class [Error](Logging$$Error.html "For ERROR Logging")(cause: Throwable, logSource: String, logClass: Class\[\_], message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= "") extends [LogEvent](Logging$$LogEvent.html) with [LogEventWithCause](Logging$$LogEventWithCause.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor ERROR Logging
6. [**](../../akka/event/Logging$$Error2.html "Permalink")  class [Error2](Logging$$Error2.html) extends [Error](Logging$$Error.html)
7. [**](../../akka/event/Logging$$Error3.html "Permalink")  class [Error3](Logging$$Error3.html) extends [Error2](Logging$$Error2.html) with [LogEventWithMarker](Logging$$LogEventWithMarker.html)
8. [**](../../akka/event/Logging$$Info.html "Permalink")  case class [Info](Logging$$Info.html "For INFO Logging")(logSource: String, logClass: Class\[\_], message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= "") extends [LogEvent](Logging$$LogEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor INFO Logging
9. [**](../../akka/event/Logging$$Info2.html "Permalink")  class [Info2](Logging$$Info2.html) extends [Info](Logging$$Info.html)
10. [**](../../akka/event/Logging$$Info3.html "Permalink")  class [Info3](Logging$$Info3.html) extends [Info2](Logging$$Info2.html) with [LogEventWithMarker](Logging$$LogEventWithMarker.html)
11. [**](../../akka/event/Logging$$InitializeLogger.html "Permalink") final  case class [InitializeLogger](Logging$$InitializeLogger.html "Message which is sent to each default logger (i.e.")(bus: [LoggingBus](LoggingBus.html)) extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMessage which is sent to each default logger (i.e.

Message which is sent to each default logger (i.e. from configuration file)
after its creation but before attaching it to the logging bus. The logger
actor must handle this message, it can be used e.g. to register for more
channels. When done, the logger must respond with a LoggerInitialized
message. This is necessary to ensure that additional subscriptions are in
effect when the logging system finished starting.
12. [**](../../akka/event/Logging$$LogEvent.html "Permalink") sealed  trait [LogEvent](Logging$$LogEvent.html "Base type of LogEvents") extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)Base type of LogEvents
13. [**](../../akka/event/Logging$$LogEventException.html "Permalink")  class [LogEventException](Logging$$LogEventException.html "Exception that wraps a LogEvent.") extends Throwable with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)Exception that wraps a LogEvent.
14. [**](../../akka/event/Logging$$LogEventWithCause.html "Permalink")  trait [LogEventWithCause](Logging$$LogEventWithCause.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
15. [**](../../akka/event/Logging$$LogEventWithMarker.html "Permalink") sealed  trait [LogEventWithMarker](Logging$$LogEventWithMarker.html "INTERNAL API, Marker interface for LogEvents containing Markers, which can be set for example on an slf4j logger") extends [LogEvent](Logging$$LogEvent.html)INTERNAL API, Marker interface for LogEvents containing Markers, which can be set for example on an slf4j logger
16. [**](../../akka/event/Logging$$LogLevel.html "Permalink") final  case class [LogLevel](Logging$$LogLevel.html "Marker trait for annotating LogLevel, which must be Int after erasure.")(asInt: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMarker trait for annotating LogLevel, which must be Int after erasure.
17. [**](../../akka/event/Logging$$LoggerException.html "Permalink")  class [LoggerException](Logging$$LoggerException.html "Artificial exception injected into Error events if no Throwable is supplied; used for getting a stack dump of error locations.") extends [AkkaException](../AkkaException.html)Artificial exception injected into Error events if no Throwable is
supplied; used for getting a stack dump of error locations.
18. [**](../../akka/event/Logging$$LoggerInitializationException.html "Permalink")  class [LoggerInitializationException](Logging$$LoggerInitializationException.html "LoggerInitializationException is thrown to indicate that there was a problem initializing a logger") extends [AkkaException](../AkkaException.html)LoggerInitializationException is thrown to indicate that there was a problem initializing a logger
19. [**](../../akka/event/Logging$$LoggerInitialized.html "Permalink") abstract  class [LoggerInitialized](Logging$$LoggerInitialized.html "Response message each logger must send within 1 second after receiving the InitializeLogger request.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Response message each logger must send within 1 second after receiving the
InitializeLogger request.

Response message each logger must send within 1 second after receiving the
InitializeLogger request. If initialization takes longer, send the reply
as soon as subscriptions are set\-up.
20. [**](../../akka/event/Logging$.html#MDC=Map[String,Any] "Permalink")  type MDC \= [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[String, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
21. [**](../../akka/event/Logging$$StandardOutLogger.html "Permalink")  class [StandardOutLogger](Logging$$StandardOutLogger.html "Actor-less logging implementation for synchronous logging to standard output.") extends InternalActorRef with MinimalActorRef with [StdOutLogger](Logging$$StdOutLogger.html)Actor\-less logging implementation for synchronous logging to standard
output.

Actor\-less logging implementation for synchronous logging to standard
output. This logger is always attached first in order to be able to log
failures during application start\-up, even before normal logging is
started. Its log level can be defined by configuration setting
`akka.stdout-loglevel`.
22. [**](../../akka/event/Logging$$StdOutLogger.html "Permalink")  trait [StdOutLogger](Logging$$StdOutLogger.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
23. [**](../../akka/event/Logging$$Warning.html "Permalink")  case class [Warning](Logging$$Warning.html "For WARNING Logging")(logSource: String, logClass: Class\[\_], message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= "") extends [LogEvent](Logging$$LogEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor WARNING Logging
24. [**](../../akka/event/Logging$$Warning2.html "Permalink")  class [Warning2](Logging$$Warning2.html) extends [Warning](Logging$$Warning.html)
25. [**](../../akka/event/Logging$$Warning3.html "Permalink")  class [Warning3](Logging$$Warning3.html) extends [Warning2](Logging$$Warning2.html) with [LogEventWithMarker](Logging$$LogEventWithMarker.html)
26. [**](../../akka/event/Logging$$Warning4.html "Permalink")  class [Warning4](Logging$$Warning4.html) extends [Warning2](Logging$$Warning2.html) with [LogEventWithMarker](Logging$$LogEventWithMarker.html) with [LogEventWithCause](Logging$$LogEventWithCause.html)
### Value Members

1. [**](../../akka/event/Logging$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/event/Logging$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/event/Logging$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/event/Logging$.html#AllLogLevels:Seq[akka.event.Logging.LogLevel] "Permalink")  val AllLogLevels: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[LogLevel](Logging$$LogLevel.html)]
5. [**](../../akka/event/Logging$.html#DebugLevel:akka.event.Logging.LogLevel "Permalink") final  val DebugLevel: [LogLevel](Logging$$LogLevel.html)
6. [**](../../akka/event/Logging$.html#ErrorLevel:akka.event.Logging.LogLevel "Permalink") final  val ErrorLevel: [LogLevel](Logging$$LogLevel.html)Log level in numeric form, used when deciding whether a certain log
statement should generate a log event.

Log level in numeric form, used when deciding whether a certain log
statement should generate a log event. Predefined levels are ErrorLevel (1\)
to DebugLevel (4\). In case you want to add more levels, loggers need to
be subscribed to their event bus channels manually.
7. [**](../../akka/event/Logging$.html#InfoLevel:akka.event.Logging.LogLevel "Permalink") final  val InfoLevel: [LogLevel](Logging$$LogLevel.html)
8. [**](../../akka/event/Logging$.html#StandardOutLogger:akka.event.Logging.StandardOutLogger "Permalink")  val StandardOutLogger: [StandardOutLogger](Logging$$StandardOutLogger.html)
9. [**](../../akka/event/Logging$.html#WarningLevel:akka.event.Logging.LogLevel "Permalink") final  val WarningLevel: [LogLevel](Logging$$LogLevel.html)
10. [**](../../akka/event/Logging$.html#apply(logSource:akka.actor.Actor):akka.event.DiagnosticLoggingAdapter "Permalink")  def apply(logSource: [Actor](../actor/Actor.html)): [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html)Obtain LoggingAdapter with MDC support for the given actor.

Obtain LoggingAdapter with MDC support for the given actor.
Don't use it outside its specific Actor as it isn't thread safe
11. [**](../../akka/event/Logging$.html#apply[T](bus:akka.event.LoggingBus,logSource:T)(implicitevidence$5:akka.event.LogSource[T]):akka.event.LoggingAdapter "Permalink")  def apply\[T](bus: [LoggingBus](LoggingBus.html), logSource: T)(implicit arg0: [LogSource](LogSource.html)\[T]): [LoggingAdapter](LoggingAdapter.html)Obtain LoggingAdapter for the given logging bus and source object.

Obtain LoggingAdapter for the given logging bus and source object.

The source is used to identify the source of this logging channel and
must have a corresponding implicit LogSource\[T] instance in scope; by
default these are provided for Class\[\_], Actor, ActorRef and String types.
See the companion object of [akka.event.LogSource](LogSource.html) for details.

You can add your own rules quite easily, see [akka.event.LogSource](LogSource.html).

Note that this `LoggingAdapter` will use the [akka.event.DefaultLoggingFilter](DefaultLoggingFilter.html),
and not the [akka.event.LoggingFilter](LoggingFilter.html) configured for the system
(if different from `DefaultLoggingFilter`).
12. [**](../../akka/event/Logging$.html#apply[T](system:akka.actor.ActorSystem,logSource:T)(implicitevidence$3:akka.event.LogSource[T]):akka.event.LoggingAdapter "Permalink")  def apply\[T](system: [ActorSystem](../actor/ActorSystem.html), logSource: T)(implicit arg0: [LogSource](LogSource.html)\[T]): [LoggingAdapter](LoggingAdapter.html)Obtain LoggingAdapter for the given actor system and source object.

Obtain LoggingAdapter for the given actor system and source object. This
will use the system’s event stream and include the system’s address in the
log source string.

**Do not use this if you want to supply a log category string (like
“com.example.app.whatever”) unaltered,** supply `system.eventStream` in this
case or use

```
Logging(system, this.getClass)
```
The source is used to identify the source of this logging channel and
must have a corresponding implicit LogSource\[T] instance in scope; by
default these are provided for Class\[\_], Actor, ActorRef and String types.
See the companion object of [akka.event.LogSource](LogSource.html) for details.

You can add your own rules quite easily, see [akka.event.LogSource](LogSource.html).
13. [**](../../akka/event/Logging$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
14. [**](../../akka/event/Logging$.html#classFor(level:akka.event.Logging.LogLevel):Class[_<:akka.event.Logging.LogEvent] "Permalink")  def classFor(level: [LogLevel](Logging$$LogLevel.html)): Class\[\_ \<: [LogEvent](Logging$$LogEvent.html)]Returns the event class associated with the given LogLevel
15. [**](../../akka/event/Logging$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/event/Logging$.html#emptyMDC:akka.event.Logging.MDC "Permalink")  val emptyMDC: [MDC](#MDC=Map[String,Any])
17. [**](../../akka/event/Logging$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/event/Logging$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../akka/event/Logging$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/event/Logging$.html#getLogger(logSource:akka.actor.Actor):akka.event.DiagnosticLoggingAdapter "Permalink")  def getLogger(logSource: [Actor](../actor/Actor.html)): [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html)Obtain LoggingAdapter with MDC support for the given actor.

Obtain LoggingAdapter with MDC support for the given actor.
Don't use it outside its specific Actor as it isn't thread safe
21. [**](../../akka/event/Logging$.html#getLogger(bus:akka.event.LoggingBus,logSource:AnyRef):akka.event.LoggingAdapter "Permalink")  def getLogger(bus: [LoggingBus](LoggingBus.html), logSource: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [LoggingAdapter](LoggingAdapter.html)Obtain LoggingAdapter for the given logging bus and source object.

Obtain LoggingAdapter for the given logging bus and source object.

The source is used to identify the source of this logging channel and
must have a corresponding implicit LogSource\[T] instance in scope; by
default these are provided for Class\[\_], Actor, ActorRef and String types.
See the companion object of [akka.event.LogSource](LogSource.html) for details.

Note that this `LoggingAdapter` will use the [akka.event.DefaultLoggingFilter](DefaultLoggingFilter.html),
and not the [akka.event.LoggingFilter](LoggingFilter.html) configured for the system
(if different from `DefaultLoggingFilter`).
22. [**](../../akka/event/Logging$.html#getLogger(system:akka.actor.ActorSystem,logSource:AnyRef):akka.event.LoggingAdapter "Permalink")  def getLogger(system: [ActorSystem](../actor/ActorSystem.html), logSource: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [LoggingAdapter](LoggingAdapter.html)Obtain LoggingAdapter for the given actor system and source object.

Obtain LoggingAdapter for the given actor system and source object. This
will use the system’s event stream and include the system’s address in the
log source string.

**Do not use this if you want to supply a log category string (like
“com.example.app.whatever”) unaltered,** supply `system.eventStream` in this
case or use

```
Logging.getLogger(system, this.getClass());
```
The source is used to identify the source of this logging channel and
must have a corresponding implicit LogSource\[T] instance in scope; by
default these are provided for Class\[\_], Actor, ActorRef and String types.
See the companion object of [akka.event.LogSource](LogSource.html) for details.
23. [**](../../akka/event/Logging$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/event/Logging$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/event/Logging$.html#levelFor(eventClass:Class[_<:akka.event.Logging.LogEvent]):akka.event.Logging.LogLevel "Permalink")  def levelFor(eventClass: Class\[\_ \<: [LogEvent](Logging$$LogEvent.html)]): [LogLevel](Logging$$LogLevel.html)Returns the LogLevel associated with the given event class.

Returns the LogLevel associated with the given event class.
Defaults to DebugLevel.
26. [**](../../akka/event/Logging$.html#levelFor(s:String):Option[akka.event.Logging.LogLevel] "Permalink")  def levelFor(s: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LogLevel](Logging$$LogLevel.html)]Returns the LogLevel associated with the given string,
valid inputs are upper or lowercase (not mixed) versions of:
"error", "warning", "info" and "debug"
27. [**](../../akka/event/Logging$.html#loggerInitialized():akka.event.Logging.LoggerInitialized.type "Permalink")  def loggerInitialized(): [LoggerInitialized](Logging$$LoggerInitialized$.html).typeJava API to create a LoggerInitialized message.
28. [**](../../akka/event/Logging$.html#messageClassName(message:Any):String "Permalink")  def messageClassName(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StringClass name representation of a message.

Class name representation of a message.
`ActorSelectionMessage` representation includes class name of
wrapped message.
29. [**](../../akka/event/Logging$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../akka/event/Logging$.html#noCause:akka.event.Logging.Error.NoCause.type "Permalink")  def noCause: [NoCause](Logging$$Error$$NoCause$.html)
31. [**](../../akka/event/Logging$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../akka/event/Logging$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../akka/event/Logging$.html#simpleName(clazz:Class[_]):String "Permalink")  def simpleName(clazz: Class\[\_]): StringReturns a 'safe' getSimpleName for the provided Class

Returns a 'safe' getSimpleName for the provided Class

returnsthe simple name of the given Class
34. [**](../../akka/event/Logging$.html#simpleName(obj:AnyRef):String "Permalink")  def simpleName(obj: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): StringReturns a 'safe' getSimpleName for the provided object's Class

Returns a 'safe' getSimpleName for the provided object's Class

returnsthe simple name of the given object's Class
35. [**](../../akka/event/Logging$.html#stackTraceFor(e:Throwable):String "Permalink")  def stackTraceFor(e: Throwable): StringReturns the StackTrace for the given Throwable as a String
36. [**](../../akka/event/Logging$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../akka/event/Logging$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
38. [**](../../akka/event/Logging$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../akka/event/Logging$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../akka/event/Logging$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../akka/event/Logging$.html#withMarker(logSource:akka.actor.Actor):akka.event.DiagnosticMarkerBusLoggingAdapter "Permalink")  def withMarker(logSource: [Actor](../actor/Actor.html)): [DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html)Obtain LoggingAdapter with marker and MDC support for the given actor.

Obtain LoggingAdapter with marker and MDC support for the given actor.
Don't use it outside its specific Actor as it isn't thread safe
42. [**](../../akka/event/Logging$.html#withMarker[T](bus:akka.event.LoggingBus,logSource:T)(implicitevidence$6:akka.event.LogSource[T]):akka.event.MarkerLoggingAdapter "Permalink")  def withMarker\[T](bus: [LoggingBus](LoggingBus.html), logSource: T)(implicit arg0: [LogSource](LogSource.html)\[T]): [MarkerLoggingAdapter](MarkerLoggingAdapter.html)Obtain LoggingAdapter for the given logging bus and source object.

Obtain LoggingAdapter for the given logging bus and source object.

The source is used to identify the source of this logging channel and
must have a corresponding implicit LogSource\[T] instance in scope; by
default these are provided for Class\[\_], Actor, ActorRef and String types.
See the companion object of [akka.event.LogSource](LogSource.html) for details.

You can add your own rules quite easily, see [akka.event.LogSource](LogSource.html).

Note that this `LoggingAdapter` will use the [akka.event.DefaultLoggingFilter](DefaultLoggingFilter.html),
and not the [akka.event.LoggingFilter](LoggingFilter.html) configured for the system
(if different from `DefaultLoggingFilter`).
43. [**](../../akka/event/Logging$.html#withMarker[T](system:akka.actor.ActorSystem,logSource:T)(implicitevidence$4:akka.event.LogSource[T]):akka.event.MarkerLoggingAdapter "Permalink")  def withMarker\[T](system: [ActorSystem](../actor/ActorSystem.html), logSource: T)(implicit arg0: [LogSource](LogSource.html)\[T]): [MarkerLoggingAdapter](MarkerLoggingAdapter.html)Obtain LoggingAdapter with additional "marker" support (which some logging frameworks are able to utilise)
for the given actor system and source object.

Obtain LoggingAdapter with additional "marker" support (which some logging frameworks are able to utilise)
for the given actor system and source object. This will use the system’s event stream and include the system’s
address in the log source string.

**Do not use this if you want to supply a log category string (like
“com.example.app.whatever”) unaltered,** supply `system.eventStream` in this
case or use

```
Logging(system, this.getClass)
```
The source is used to identify the source of this logging channel and
must have a corresponding implicit LogSource\[T] instance in scope; by
default these are provided for Class\[\_], Actor, ActorRef and String types.
See the companion object of [akka.event.LogSource](LogSource.html) for details.

You can add your own rules quite easily, see [akka.event.LogSource](LogSource.html).
44. [**](../../akka/event/Logging$$Debug$.html "Permalink")  object [Debug](Logging$$Debug$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
45. [**](../../akka/event/Logging$$Error$.html "Permalink")  object [Error](Logging$$Error$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
46. [**](../../akka/event/Logging$$Info$.html "Permalink")  object [Info](Logging$$Info$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
47. [**](../../akka/event/Logging$$LogEvent$.html "Permalink")  object [LogEvent](Logging$$LogEvent$.html)
48. [**](../../akka/event/Logging$$LoggerInitialized$.html "Permalink")  case object [LoggerInitialized](Logging$$LoggerInitialized$.html) extends [LoggerInitialized](Logging$$LoggerInitialized.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
49. [**](../../akka/event/Logging$$StdOutLogger$.html "Permalink")  object [StdOutLogger](Logging$$StdOutLogger$.html)
50. [**](../../akka/event/Logging$$Warning$.html "Permalink")  object [Warning](Logging$$Warning$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../akka/event/Logging$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Code Examples

### Example 1: objectLogging

```text
val log = Logging(<bus>, <source object>)
...
log.info("hello world!")
```

### Example 2: objectLogging

```text
akka {
  loggers = ["akka.slf4j.Slf4jLogger"] # for example
  loglevel = "INFO"        # used when normal logging ("loggers") has been started
  stdout-loglevel = "WARN" # used during application start-up until normal logging is available
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/AkkaException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Debug$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Debug.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Debug2.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Debug3.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$DefaultLogger.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Error$$NoCause$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Error$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Error.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Error2.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Error3.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Info$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Info.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Info2.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$Info3.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$InitializeLogger.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEventException.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEventWithCause.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEventWithMarker.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LoggerException.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LoggerInitializationException.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LoggerInitialized$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LoggerInitialized.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$StandardOutLogger.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$StdOutLogger$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$StdOutLogger.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$.html](https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$.html)*
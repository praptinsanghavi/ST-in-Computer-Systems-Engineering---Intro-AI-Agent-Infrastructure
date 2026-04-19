---
description: Akka 2.10.17 - akka.event
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:48:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/index.html
title: Akka 2.10.17 - akka.event
---

# Akka 2.10.17 - akka.event

> **Summary:** Akka 2.10.17 - akka.event

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package eventDefinition Classes[akka](../index.html)
- [**](../../akka/event/japi/index.html "Permalink")  package [japi](japi/index.html)
- [**](../../akka/event/jul/index.html "Permalink")  package [jul](jul/index.html)
- [**](../../akka/event/slf4j/index.html "Permalink")  package [slf4j](slf4j/index.html)
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
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# event[**](../../akka/event/index.html "Permalink")

#### package event

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/event/japi/index.html "Permalink")  package [japi](japi/index.html)
2. [**](../../akka/event/jul/index.html "Permalink")  package [jul](jul/index.html)
3. [**](../../akka/event/slf4j/index.html "Permalink")  package [slf4j](slf4j/index.html)
### Type Members

1. [**](../../akka/event/ActorClassificationUnsubscriber.html "Permalink")  class [ActorClassificationUnsubscriber](ActorClassificationUnsubscriber.html "INTERNAL API") extends [Actor](../actor/Actor.html) with [Stash](../actor/Stash.html)INTERNAL API

INTERNAL API

Watches all actors which subscribe on the given event stream, and unsubscribes them from it when they are Terminated.

Attributesprotected\[[akka](../index.html)]
2. [**](../../akka/event/ActorClassifier.html "Permalink")  trait [ActorClassifier](ActorClassifier.html "Can be mixed into an EventBus to specify that the Classifier type is ActorRef") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Can be mixed into an EventBus to specify that the Classifier type is ActorRef
3. [**](../../akka/event/ActorEventBus.html "Permalink")  trait [ActorEventBus](ActorEventBus.html "Represents an EventBus where the Subscriber type is ActorRef") extends [EventBus](EventBus.html)Represents an EventBus where the Subscriber type is ActorRef
4. [**](../../akka/event/BusLogging.html "Permalink")  class [BusLogging](BusLogging.html "akka.event.LoggingAdapter that publishes akka.event.Logging.LogEvent to event stream.") extends [LoggingAdapter](LoggingAdapter.html)[akka.event.LoggingAdapter](LoggingAdapter.html) that publishes [akka.event.Logging.LogEvent](Logging$$LogEvent.html) to event stream.
5. [**](../../akka/event/DeadLetterListener.html "Permalink")  class [DeadLetterListener](DeadLetterListener.html) extends [Actor](../actor/Actor.html)
6. [**](../../akka/event/DefaultLoggingFilter.html "Permalink")  class [DefaultLoggingFilter](DefaultLoggingFilter.html "Default LoggingFilter that uses the logLevel of the eventStream, which initial value is defined in configuration.") extends [LoggingFilterWithMarker](LoggingFilterWithMarker.html)Default [LoggingFilter](LoggingFilter.html) that uses the logLevel of the `eventStream`, which
initial value is defined in configuration.

Default [LoggingFilter](LoggingFilter.html) that uses the logLevel of the `eventStream`, which
initial value is defined in configuration. The logLevel `eventStream` can be
changed while the system is running.
7. [**](../../akka/event/DiagnosticLoggingAdapter.html "Permalink")  trait [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "LoggingAdapter extension which adds MDC support.") extends [LoggingAdapter](LoggingAdapter.html)LoggingAdapter extension which adds MDC support.

LoggingAdapter extension which adds MDC support.
Only recommended to be used within Actors as it isn't thread safe.
8. [**](../../akka/event/DiagnosticMarkerBusLoggingAdapter.html "Permalink") final  class [DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html) extends [MarkerLoggingAdapter](MarkerLoggingAdapter.html) with [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html)
9. [**](../../akka/event/DummyClassForStringSources.html "Permalink")  class [DummyClassForStringSources](DummyClassForStringSources.html "This is a “marker” class which is inserted as originator class into akka.event.Logging.LogEvent when the string representation was supplied directly.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This is a “marker” class which is inserted as originator class into
[akka.event.Logging.LogEvent](Logging$$LogEvent.html) when the string representation was supplied
directly.
10. [**](../../akka/event/EventBus.html "Permalink")  trait [EventBus](EventBus.html "Represents the base type for EventBuses Internally has an Event type, a Classifier type and a Subscriber type") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents the base type for EventBuses
Internally has an Event type, a Classifier type and a Subscriber type

Represents the base type for EventBuses
Internally has an Event type, a Classifier type and a Subscriber type

For the Java API, see akka.event.japi.\*
11. [**](../../akka/event/EventStream.html "Permalink")  class [EventStream](EventStream.html "An Akka EventStream is a pub-sub stream of events both system and user generated, where subscribers are ActorRefs and the channels are Classes and Events are any java.lang.Object.") extends [LoggingBus](LoggingBus.html) with [SubchannelClassification](SubchannelClassification.html)An Akka EventStream is a pub\-sub stream of events both system and user generated,
where subscribers are ActorRefs and the channels are Classes and Events are any java.lang.Object.

An Akka EventStream is a pub\-sub stream of events both system and user generated,
where subscribers are ActorRefs and the channels are Classes and Events are any java.lang.Object.
EventStreams employ SubchannelClassification, which means that if you listen to a Class,
you'll receive any message that is of that type or a subtype.

The debug flag in the constructor toggles if operations on this EventStream should also be published
as Debug\-Events
12. [**](../../akka/event/EventStreamUnsubscriber.html "Permalink")  class [EventStreamUnsubscriber](EventStreamUnsubscriber.html "INTERNAL API") extends [Actor](../actor/Actor.html)INTERNAL API

INTERNAL API

Watches all actors which subscribe on the given eventStream, and unsubscribes them from it when they are Terminated.

Assumptions note:
We do not guarantee happens\-before in the EventStream when 2 threads subscribe(a) / unsubscribe(a) on the same actor,
thus the messages sent to this actor may appear to be reordered \- this is fine, because the worst\-case is starting to
needlessly watch the actor which will not cause trouble for the stream. This is a trade\-off between slowing down
subscribe calls \* because of the need of linearizing the history message sequence and the possibility of sometimes
watching a few actors too much \- we opt for the 2nd choice here.

Attributesprotected\[[akka](../index.html)]
13. [**](../../akka/event/LogMarker.html "Permalink")  class [LogMarker](LogMarker.html "DO NOT INHERIT: Class is open only for use by akka-slf4j") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)DO NOT INHERIT: Class is open only for use by akka\-slf4j

DO NOT INHERIT: Class is open only for use by akka\-slf4j

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
14. [**](../../akka/event/LogSource.html "Permalink")  trait [LogSource](LogSource.html "This trait defines the interface to be provided by a “log source formatting rule” as used by akka.event.Logging’s apply/create method.")\[\-T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This trait defines the interface to be provided by a “log source formatting
rule” as used by [akka.event.Logging](Logging$.html)’s `apply`/`create` method.

This trait defines the interface to be provided by a “log source formatting
rule” as used by [akka.event.Logging](Logging$.html)’s `apply`/`create` method.

See the companion object for default implementations.

Example:

```
trait MyType { // as an example
  def name: String
}

implicit val myLogSourceType: LogSource[MyType] = new LogSource[MyType] {
  def genString(a: MyType) = a.name
}

class MyClass extends MyType {
  val log = Logging(eventStream, this) // will use "hallo" as logSource
  def name = "hallo"
}
```
The second variant is used for including the actor system’s address:

```
trait MyType { // as an example
  def name: String
}

implicit val myLogSourceType: LogSource[MyType] = new LogSource[MyType] {
  def genString(a: MyType) = a.name
  def genString(a: MyType, s: ActorSystem) = a.name + "," + s
}

class MyClass extends MyType {
  val sys = ActorSystem("sys")
  val log = Logging(sys, this) // will use "hallo,akka://sys" as logSource
  def name = "hallo"
}
```
The default implementation of the second variant will just call the first.

Annotations@implicitNotFound()
15. [**](../../akka/event/LoggerMessageQueueSemantics.html "Permalink")  trait [LoggerMessageQueueSemantics](LoggerMessageQueueSemantics.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
16. [**](../../akka/event/LoggingAdapter.html "Permalink")  trait [LoggingAdapter](LoggingAdapter.html "Logging wrapper to make nicer and optimize: provide template versions which evaluate .toString only if the log level is actually enabled.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Logging wrapper to make nicer and optimize: provide template versions which
evaluate .toString only if the log level is actually enabled.

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
17. [**](../../akka/event/LoggingBus.html "Permalink")  trait [LoggingBus](LoggingBus.html "This trait brings log level handling to the EventStream: it reads the log levels for the initial logging (StandardOutLogger) and the loggers & level for after-init logging, possibly keeping the StandardOutLogger enabled if it is part of the configured loggers.") extends [ActorEventBus](ActorEventBus.html)This trait brings log level handling to the EventStream: it reads the log
levels for the initial logging (StandardOutLogger) and the loggers \& level
for after\-init logging, possibly keeping the StandardOutLogger enabled if
it is part of the configured loggers.

This trait brings log level handling to the EventStream: it reads the log
levels for the initial logging (StandardOutLogger) and the loggers \& level
for after\-init logging, possibly keeping the StandardOutLogger enabled if
it is part of the configured loggers. All configured loggers are treated as
system services and managed by this trait, i.e. subscribed/unsubscribed in
response to changes of LoggingBus.logLevel.
18. [**](../../akka/event/LoggingFilter.html "Permalink")  trait [LoggingFilter](LoggingFilter.html "Filter of log events that is used by the LoggingAdapter before publishing log events to the eventStream.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Filter of log events that is used by the `LoggingAdapter` before
publishing log events to the `eventStream`.

Filter of log events that is used by the `LoggingAdapter` before
publishing log events to the `eventStream`. It can perform
fine grained filtering based on the log source.

Note that the [EventStream](EventStream.html) will only subscribe `loggers` to the events
corresponding to the `logLevel` of the `EventStream`. Therefore it is good
practice that the `LoggingFilter` implementation first filters using the
`logLevel` of the `EventStream` before applying more fine grained filters.
19. [**](../../akka/event/LoggingFilterWithMarker.html "Permalink")  trait [LoggingFilterWithMarker](LoggingFilterWithMarker.html "In retrospect should have been abstract, but we cannot change that without breaking binary compatibility") extends [LoggingFilter](LoggingFilter.html)In retrospect should have been abstract, but we cannot change that
without breaking binary compatibility

In retrospect should have been abstract, but we cannot change that
without breaking binary compatibility

Annotations@nowarn()
20. [**](../../akka/event/LoggingFilterWithMarkerWrapper.html "Permalink")  class [LoggingFilterWithMarkerWrapper](LoggingFilterWithMarkerWrapper.html) extends [LoggingFilterWithMarker](LoggingFilterWithMarker.html)
21. [**](../../akka/event/LoggingReceive.html "Permalink")  class [LoggingReceive](LoggingReceive.html "This decorator adds invocation logging to a Receive function.") extends [Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit])This decorator adds invocation logging to a Receive function.
22. [**](../../akka/event/LookupClassification.html "Permalink")  trait [LookupClassification](LookupClassification.html "Maps Subscribers to Classifiers using equality on Classifier to store a Set of Subscribers (hence the need for compareSubscribers) Maps Events to Classifiers through the classify-method (so it knows who to publish to)") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Maps Subscribers to Classifiers using equality on Classifier to store a Set of Subscribers (hence the need for compareSubscribers)
Maps Events to Classifiers through the classify\-method (so it knows who to publish to)

Maps Subscribers to Classifiers using equality on Classifier to store a Set of Subscribers (hence the need for compareSubscribers)
Maps Events to Classifiers through the classify\-method (so it knows who to publish to)

The compareSubscribers need to provide a total ordering of the Subscribers
23. [**](../../akka/event/ManagedActorClassification.html "Permalink")  trait [ManagedActorClassification](ManagedActorClassification.html "Maps ActorRefs to ActorRefs to form an EventBus where ActorRefs can listen to other ActorRefs.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Maps ActorRefs to ActorRefs to form an EventBus where ActorRefs can listen to other ActorRefs.

Maps ActorRefs to ActorRefs to form an EventBus where ActorRefs can listen to other ActorRefs.

All subscribers will be watched by an `akka.event.ActorClassificationUnsubscriber` and unsubscribed when they terminate.
The unsubscriber actor will not be stopped automatically, and if you want to stop using the bus you should stop it yourself.
24. [**](../../akka/event/MarkerLoggingAdapter.html "Permalink")  class [MarkerLoggingAdapter](MarkerLoggingAdapter.html "LoggingAdapter extension which adds Marker support.") extends [BusLogging](BusLogging.html)[LoggingAdapter](LoggingAdapter.html) extension which adds Marker support.
25. [**](../../akka/event/PredicateClassifier.html "Permalink")  trait [PredicateClassifier](PredicateClassifier.html "Can be mixed into an EventBus to specify that the Classifier type is a Function from Event to Boolean (predicate)") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Can be mixed into an EventBus to specify that the Classifier type is a Function from Event to Boolean (predicate)
26. [**](../../akka/event/ScanningClassification.html "Permalink")  trait [ScanningClassification](ScanningClassification.html "Maps Classifiers to Subscribers and selects which Subscriber should receive which publication through scanning through all Subscribers through the matches(classifier, event) method") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Maps Classifiers to Subscribers and selects which Subscriber should receive which publication through scanning through all Subscribers
through the matches(classifier, event) method

Maps Classifiers to Subscribers and selects which Subscriber should receive which publication through scanning through all Subscribers
through the matches(classifier, event) method

Note: the compareClassifiers and compareSubscribers must together form an absolute ordering (think java.util.Comparator.compare)
27. [**](../../akka/event/SubchannelClassification.html "Permalink")  trait [SubchannelClassification](SubchannelClassification.html "Classification which respects relationships between channels: subscribing to one channel automatically and idempotently subscribes to all sub-channels.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Classification which respects relationships between channels: subscribing
to one channel automatically and idempotently subscribes to all sub\-channels.
### Value Members

1. [**](../../akka/event/LogMarker$.html "Permalink")  object [LogMarker](LogMarker$.html)
2. [**](../../akka/event/LogSource$.html "Permalink")  object [LogSource](LogSource$.html "This object holds predefined formatting rules for log sources.")This object holds predefined formatting rules for log sources.

This object holds predefined formatting rules for log sources.

In case an [akka.actor.ActorSystem](../actor/ActorSystem.html) is provided, the following apply:

	- [akka.actor.Actor](../actor/Actor.html) and [akka.actor.ActorRef](../actor/ActorRef.html) will be represented by their absolute physical path
	- providing a `String` as source will append "(\<system address\>)" and use the result
	- providing a `Class` will extract its simple name, append "(\<system address\>)" and use the result
	- anything else gives compile error unless implicit [akka.event.LogSource](LogSource.html) is in scope for itIn case a [akka.event.LoggingBus](LoggingBus.html) is provided, the following apply:

	- [akka.actor.Actor](../actor/Actor.html) and [akka.actor.ActorRef](../actor/ActorRef.html) will be represented by their absolute physical path
	- providing a `String` as source will be used as is
	- providing a `Class` will extract its simple name
	- anything else gives compile error unless implicit [akka.event.LogSource](LogSource.html) is in scope for it
3. [**](../../akka/event/Logging$.html "Permalink")  object [Logging](Logging$.html "Main entry point for Akka logging: log levels and message types (aka channels) defined for the main transport medium, the main event bus.")Main entry point for Akka logging: log levels and message types (aka
channels) defined for the main transport medium, the main event bus.

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
4. [**](../../akka/event/LoggingFilterWithMarker$.html "Permalink")  object [LoggingFilterWithMarker](LoggingFilterWithMarker$.html)
5. [**](../../akka/event/LoggingReceive$.html "Permalink")  object [LoggingReceive](LoggingReceive$.html)
6. [**](../../akka/event/NoLogging$.html "Permalink")  object [NoLogging](NoLogging$.html "NoLogging is a LoggingAdapter that does absolutely nothing – no logging at all.") extends [LoggingAdapter](LoggingAdapter.html)NoLogging is a LoggingAdapter that does absolutely nothing – no logging at all.
7. [**](../../akka/event/NoMarkerLogging$.html "Permalink")  object [NoMarkerLogging](NoMarkerLogging$.html "NoLogging is a MarkerLoggingAdapter that does absolutely nothing – no logging at all.") extends [MarkerLoggingAdapter](MarkerLoggingAdapter.html)NoLogging is a MarkerLoggingAdapter that does absolutely nothing – no logging at all.
### Ungrouped

## Code Examples

### Example 1: Value Members

```text
val log = Logging(<bus>, <source object>)
...
log.info("hello world!")
```

### Example 2: Value Members

```text
akka {
  loggers = ["akka.slf4j.Slf4jLogger"] # for example
  loglevel = "INFO"        # used when normal logging ("loggers") has been started
  stdout-loglevel = "WARN" # used during application start-up until normal logging is available
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Stash.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/current/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/current/akka/event/ActorClassificationUnsubscriber.html
- https://doc.akka.io/api/akka-core/current/akka/event/ActorClassifier.html
- https://doc.akka.io/api/akka-core/current/akka/event/ActorEventBus.html
- https://doc.akka.io/api/akka-core/current/akka/event/BusLogging.html
- https://doc.akka.io/api/akka-core/current/akka/event/DeadLetterListener.html
- https://doc.akka.io/api/akka-core/current/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/api/akka-core/current/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/api/akka-core/current/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/api/akka-core/current/akka/event/DummyClassForStringSources.html
- https://doc.akka.io/api/akka-core/current/akka/event/EventBus.html
- https://doc.akka.io/api/akka-core/current/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/current/akka/event/EventStreamUnsubscriber.html
- https://doc.akka.io/api/akka-core/current/akka/event/LogMarker$.html
- https://doc.akka.io/api/akka-core/current/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/current/akka/event/LogSource$.html
- https://doc.akka.io/api/akka-core/current/akka/event/LogSource.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/current/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/current/akka/event/Logging$.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggingBus.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggingFilterWithMarker$.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggingFilterWithMarkerWrapper.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggingReceive$.html
- https://doc.akka.io/api/akka-core/current/akka/event/LoggingReceive.html
- https://doc.akka.io/api/akka-core/current/akka/event/LookupClassification.html
- https://doc.akka.io/api/akka-core/current/akka/event/ManagedActorClassification.html
- https://doc.akka.io/api/akka-core/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/current/akka/event/NoLogging$.html
- https://doc.akka.io/api/akka-core/current/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/api/akka-core/current/akka/event/PredicateClassifier.html
- https://doc.akka.io/api/akka-core/current/akka/event/ScanningClassification.html
- https://doc.akka.io/api/akka-core/current/akka/event/SubchannelClassification.html
- https://doc.akka.io/api/akka-core/current/akka/event/index.html
- https://doc.akka.io/api/akka-core/current/akka/event/japi/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/event/index.html](https://doc.akka.io/api/akka-core/current/akka/event/index.html)*
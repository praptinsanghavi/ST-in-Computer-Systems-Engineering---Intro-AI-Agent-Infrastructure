---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html
title: akka.event
---

# akka.event

## Content

# Package akka.event

- Interface Summary 
| Interface | Description |
| [ActorClassifier](ActorClassifier.html "interface in akka.event") | Can be mixed into an EventBus to specify that the Classifier type is ActorRef |
| --- | --- |
| [ActorEventBus](ActorEventBus.html "interface in akka.event") | Represents an EventBus where the Subscriber type is ActorRef |
| [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event") |  |
| [EventBus](EventBus.html "interface in akka.event") | Represents the base type for EventBuses  Internally has an Event type, a Classifier type and a Subscriber type |
| [LoggerMessageQueueSemantics](LoggerMessageQueueSemantics.html "interface in akka.event") |  |
| [Logging.LogEvent](Logging.LogEvent.html "interface in akka.event") |  |
| [Logging.LogEventWithCause](Logging.LogEventWithCause.html "interface in akka.event") |  |
| [Logging.LogEventWithMarker](Logging.LogEventWithMarker.html "interface in akka.event") |  |
| [Logging.StdOutLogger](Logging.StdOutLogger.html "interface in akka.event") |  |
| [LoggingAdapter](LoggingAdapter.html "interface in akka.event") |  |
| [LoggingBus](LoggingBus.html "interface in akka.event") | This trait brings log level handling to the EventStream: it reads the log  levels for the initial logging (StandardOutLogger) and the loggers \& level  for after\-init logging, possibly keeping the StandardOutLogger enabled if  it is part of the configured loggers. |
| [LoggingFilter](LoggingFilter.html "interface in akka.event") |  |
| [LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event") |  |
| [LogSource](LogSource.html "interface in akka.event")\<T\> |  |
| [LookupClassification](LookupClassification.html "interface in akka.event") | Maps Subscribers to Classifiers using equality on Classifier to store a Set of Subscribers (hence the need for compareSubscribers)  Maps Events to Classifiers through the classify\-method (so it knows who to publish to) |
| [ManagedActorClassification](ManagedActorClassification.html "interface in akka.event") | Maps ActorRefs to ActorRefs to form an EventBus where ActorRefs can listen to other ActorRefs. |
| [PredicateClassifier](PredicateClassifier.html "interface in akka.event") | Can be mixed into an EventBus to specify that the Classifier type is a Function from Event to Boolean (predicate) |
| [ScanningClassification](ScanningClassification.html "interface in akka.event") | Maps Classifiers to Subscribers and selects which Subscriber should receive which publication through scanning through all Subscribers  through the matches(classifier, event) method |
| [SubchannelClassification](SubchannelClassification.html "interface in akka.event") | Classification which respects relationships between channels: subscribing  to one channel automatically and idempotently subscribes to all sub\-channels. |
- Class Summary 
| Class | Description |
| [ActorClassificationUnsubscriber$](ActorClassificationUnsubscriber$.html "class in akka.event") | INTERNAL API |
| --- | --- |
| [ActorWithLogClass$](ActorWithLogClass$.html "class in akka.event") |  |
| [AddressTerminatedTopic$](AddressTerminatedTopic$.html "class in akka.event") | INTERNAL API |
| [BusLogging](BusLogging.html "class in akka.event") | [`LoggingAdapter`](LoggingAdapter.html "interface in akka.event") that publishes [`Logging.LogEvent`](Logging.LogEvent.html "interface in akka.event") to event stream. |
| [DeadLetterListener](DeadLetterListener.html "class in akka.event") |  |
| [DefaultLoggingFilter](DefaultLoggingFilter.html "class in akka.event") |  |
| [DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html "class in akka.event") |  |
| [DummyClassForStringSources](DummyClassForStringSources.html "class in akka.event") |  |
| [EventStream](EventStream.html "class in akka.event") | An Akka EventStream is a pub\-sub stream of events both system and user generated,  where subscribers are ActorRefs and the channels are Classes and Events are any java.lang.Object. |
| [EventStreamUnsubscriber$](EventStreamUnsubscriber$.html "class in akka.event") | INTERNAL API |
| [Logging](Logging.html "class in akka.event") |  |
| [Logging.Debug](Logging.Debug.html "class in akka.event") |  |
| [Logging.Debug$](Logging.Debug$.html "class in akka.event") |  |
| [Logging.Debug2](Logging.Debug2.html "class in akka.event") |  |
| [Logging.Debug3](Logging.Debug3.html "class in akka.event") |  |
| [Logging.DefaultLogger](Logging.DefaultLogger.html "class in akka.event") |  |
| [Logging.Error](Logging.Error.html "class in akka.event") |  |
| [Logging.Error$](Logging.Error$.html "class in akka.event") |  |
| [Logging.Error$.NoCause$](Logging.Error$.NoCause$.html "class in akka.event") |  |
| [Logging.Error2](Logging.Error2.html "class in akka.event") |  |
| [Logging.Error2$](Logging.Error2$.html "class in akka.event") |  |
| [Logging.Error3](Logging.Error3.html "class in akka.event") |  |
| [Logging.Info](Logging.Info.html "class in akka.event") |  |
| [Logging.Info$](Logging.Info$.html "class in akka.event") |  |
| [Logging.Info2](Logging.Info2.html "class in akka.event") |  |
| [Logging.Info3](Logging.Info3.html "class in akka.event") |  |
| [Logging.InitializeLogger](Logging.InitializeLogger.html "class in akka.event") |  |
| [Logging.InitializeLogger$](Logging.InitializeLogger$.html "class in akka.event") |  |
| [Logging.LogEvent$](Logging.LogEvent$.html "class in akka.event") |  |
| [Logging.LogEventException](Logging.LogEventException.html "class in akka.event") |  |
| [Logging.LogExt$](Logging.LogExt$.html "class in akka.event") |  |
| [Logging.LoggerInitialized](Logging.LoggerInitialized.html "class in akka.event") |  |
| [Logging.LoggerInitialized$](Logging.LoggerInitialized$.html "class in akka.event") |  |
| [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") |  |
| [Logging.LogLevel$](Logging.LogLevel$.html "class in akka.event") |  |
| [Logging.StandardOutLogger](Logging.StandardOutLogger.html "class in akka.event") |  |
| [Logging.StdOutLogger$](Logging.StdOutLogger$.html "class in akka.event") |  |
| [Logging.Warning](Logging.Warning.html "class in akka.event") |  |
| [Logging.Warning$](Logging.Warning$.html "class in akka.event") |  |
| [Logging.Warning2](Logging.Warning2.html "class in akka.event") |  |
| [Logging.Warning3](Logging.Warning3.html "class in akka.event") |  |
| [Logging.Warning4](Logging.Warning4.html "class in akka.event") |  |
| [Logging$](Logging$.html "class in akka.event") |  |
| [LoggingFilterWithMarker$](LoggingFilterWithMarker$.html "class in akka.event") |  |
| [LoggingFilterWithMarkerWrapper](LoggingFilterWithMarkerWrapper.html "class in akka.event") |  |
| [LoggingReceive](LoggingReceive.html "class in akka.event") | This decorator adds invocation logging to a Receive function. |
| [LoggingReceive$](LoggingReceive$.html "class in akka.event") |  |
| [LogMarker](LogMarker.html "class in akka.event") | DO NOT INHERIT: Class is open only for use by akka\-slf4j |
| [LogMarker.Properties$](LogMarker.Properties$.html "class in akka.event") | INTERNAL API |
| [LogMarker$](LogMarker$.html "class in akka.event") |  |
| [LogSource$](LogSource$.html "class in akka.event") |  |
| [MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event") | [`LoggingAdapter`](LoggingAdapter.html "interface in akka.event") extension which adds Marker support. |
| [NoLogging](NoLogging.html "class in akka.event") | NoLogging is a LoggingAdapter that does absolutely nothing – no logging at all. |
| [NoLogging$](NoLogging$.html "class in akka.event") | NoLogging is a LoggingAdapter that does absolutely nothing – no logging at all. |
| [NoMarkerLogging](NoMarkerLogging.html "class in akka.event") | NoLogging is a MarkerLoggingAdapter that does absolutely nothing – no logging at all. |
| [NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event") | NoLogging is a MarkerLoggingAdapter that does absolutely nothing – no logging at all. |
- Exception Summary 
| Exception | Description |
| [Logging.LoggerException](Logging.LoggerException.html "class in akka.event") | Artificial exception injected into Error events if no Throwable is  supplied; used for getting a stack dump of error locations. |
| --- | --- |
| [Logging.LoggerInitializationException](Logging.LoggerInitializationException.html "class in akka.event") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorClassificationUnsubscriber$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorClassifier.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorEventBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorWithLogClass$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/AddressTerminatedTopic$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/BusLogging.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DeadLetterListener.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DummyClassForStringSources.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStreamUnsubscriber$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LogMarker$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LogMarker.Properties$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LogSource$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LogSource.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Debug$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Debug.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Debug2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Debug3.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.DefaultLogger.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Error$.NoCause$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Error$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Error.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Error2$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Error2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Error3.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Info$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Info.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Info2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.Info3.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.InitializeLogger$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.InitializeLogger.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogEvent$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogEventException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogEventWithCause.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogEventWithMarker.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogExt$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LoggerException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LoggerInitializationException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LoggerInitialized$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LoggerInitialized.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html)*
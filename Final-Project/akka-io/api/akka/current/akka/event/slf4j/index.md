---
description: Akka 2.10.17 - akka.event.slf4j
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:38:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/slf4j/index.html
title: Akka 2.10.17 - akka.event.slf4j
---

# Akka 2.10.17 - akka.event.slf4j

> **Summary:** Akka 2.10.17 - akka.event.slf4j

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[event](../index.html)
- [**](../../../akka/event/jul/index.html "Permalink")  package [jul](../jul/index.html)Definition Classes[event](../index.html)
- [**](../../../akka/event/slf4j/index.html "Permalink")  package slf4jDefinition Classes[event](../index.html)
- [Logger](Logger$.html "Logger is a factory for obtaining SLF4J-Loggers")
- [SLF4JLogging](SLF4JLogging.html "Base trait for all classes that wants to be able use the SLF4J logging infrastructure.")
- [Slf4jLogMarker](Slf4jLogMarker.html "Wraps org.slf4j.Marker")
- [Slf4jLogger](Slf4jLogger.html "SLF4J logger.")
- [Slf4jLoggingFilter](Slf4jLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the SLF4J backend configuration (e.g.")
p[akka](../../index.html).[event](../index.html)

# slf4j[**](../../../akka/event/slf4j/index.html "Permalink")

#### package slf4j

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/event/slf4j/SLF4JLogging.html "Permalink")  trait [SLF4JLogging](SLF4JLogging.html "Base trait for all classes that wants to be able use the SLF4J logging infrastructure.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Base trait for all classes that wants to be able use the SLF4J logging infrastructure.
2. [**](../../../akka/event/slf4j/Slf4jLogMarker.html "Permalink") final  class [Slf4jLogMarker](Slf4jLogMarker.html "Wraps org.slf4j.Marker") extends [LogMarker](../LogMarker.html)Wraps org.slf4j.Marker
3. [**](../../../akka/event/slf4j/Slf4jLogger.html "Permalink")  class [Slf4jLogger](Slf4jLogger.html "SLF4J logger.") extends [Actor](../../actor/Actor.html) with [SLF4JLogging](SLF4JLogging.html) with [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../LoggerMessageQueueSemantics.html)]SLF4J logger.

SLF4J logger.

The thread in which the logging was performed is captured in
Mapped Diagnostic Context (MDC) with attribute name "sourceThread".
4. [**](../../../akka/event/slf4j/Slf4jLoggingFilter.html "Permalink")  class [Slf4jLoggingFilter](Slf4jLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the SLF4J backend configuration (e.g.") extends [LoggingFilterWithMarker](../LoggingFilterWithMarker.html)[akka.event.LoggingFilter](../LoggingFilter.html) that uses the log level defined in the SLF4J
backend configuration (e.g.

[akka.event.LoggingFilter](../LoggingFilter.html) that uses the log level defined in the SLF4J
backend configuration (e.g. logback.xml) to filter log events before publishing
the log events to the `eventStream`.
### Value Members

1. [**](../../../akka/event/slf4j/Logger$.html "Permalink")  object [Logger](Logger$.html "Logger is a factory for obtaining SLF4J-Loggers")Logger is a factory for obtaining SLF4J\-Loggers
2. [**](../../../akka/event/slf4j/Slf4jLogMarker$.html "Permalink")  object [Slf4jLogMarker](Slf4jLogMarker$.html "Factory for creating LogMarker that wraps org.slf4j.Marker")Factory for creating [LogMarker](../LogMarker.html) that wraps org.slf4j.Marker
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/api/akka/current/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka/current/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/event/japi/index.html
- https://doc.akka.io/api/akka/current/akka/event/jul/index.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Logger$.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/SLF4JLogging.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLogMarker.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/event/slf4j/index.html](https://doc.akka.io/api/akka/current/akka/event/slf4j/index.html)*
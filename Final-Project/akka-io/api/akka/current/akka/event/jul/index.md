---
description: Akka 2.10.17 - akka.event.jul
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:38:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/jul/index.html
title: Akka 2.10.17 - akka.event.jul
---

# Akka 2.10.17 - akka.event.jul

> **Summary:** Akka 2.10.17 - akka.event.jul

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[event](../index.html)
- [**](../../../akka/event/jul/index.html "Permalink")  package julDefinition Classes[event](../index.html)
- [JavaLogger](JavaLogger.html "java.util.logging logger.")
- [JavaLogging](JavaLogging.html "Base trait for all classes that wants to be able use the JUL logging infrastructure.")
- [JavaLoggingFilter](JavaLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the JUL backend configuration to filter log events before publishing the log events to the eventStream.")
- [Logger](Logger$.html "Logger is a factory for obtaining JUL Loggers")
- [**](../../../akka/event/slf4j/index.html "Permalink")  package [slf4j](../slf4j/index.html)Definition Classes[event](../index.html)
p[akka](../../index.html).[event](../index.html)

# jul[**](../../../akka/event/jul/index.html "Permalink")

#### package jul

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Deprecated Type Members

1. [**](../../../akka/event/jul/JavaLogger.html "Permalink")  class [JavaLogger](JavaLogger.html "java.util.logging logger.") extends [Actor](../../actor/Actor.html) with [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../LoggerMessageQueueSemantics.html)]`java.util.logging` logger.

`java.util.logging` logger.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Slf4jLogger instead.
2. [**](../../../akka/event/jul/JavaLogging.html "Permalink")  trait [JavaLogging](JavaLogging.html "Base trait for all classes that wants to be able use the JUL logging infrastructure.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Base trait for all classes that wants to be able use the JUL logging infrastructure.

Base trait for all classes that wants to be able use the JUL logging infrastructure.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use SLF4J or direct java.util.logging instead.
3. [**](../../../akka/event/jul/JavaLoggingFilter.html "Permalink")  class [JavaLoggingFilter](JavaLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the JUL backend configuration to filter log events before publishing the log events to the eventStream.") extends [LoggingFilter](../LoggingFilter.html)[akka.event.LoggingFilter](../LoggingFilter.html) that uses the log level defined in the JUL
backend configuration to filter log events before publishing
the log events to the `eventStream`.

[akka.event.LoggingFilter](../LoggingFilter.html) that uses the log level defined in the JUL
backend configuration to filter log events before publishing
the log events to the `eventStream`.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Slf4jLoggingFilter instead.
### Deprecated Value Members

1. [**](../../../akka/event/jul/Logger$.html "Permalink")  object [Logger](Logger$.html "Logger is a factory for obtaining JUL Loggers")Logger is a factory for obtaining JUL Loggers

Logger is a factory for obtaining JUL Loggers

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use SLF4J or direct java.util.logging instead.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/event/japi/index.html
- https://doc.akka.io/api/akka/current/akka/event/jul/JavaLogger.html
- https://doc.akka.io/api/akka/current/akka/event/jul/JavaLogging.html
- https://doc.akka.io/api/akka/current/akka/event/jul/JavaLoggingFilter.html
- https://doc.akka.io/api/akka/current/akka/event/jul/Logger$.html
- https://doc.akka.io/api/akka/current/akka/event/jul/index.html
- https://doc.akka.io/api/akka/current/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/event/jul/index.html](https://doc.akka.io/api/akka/current/akka/event/jul/index.html)*
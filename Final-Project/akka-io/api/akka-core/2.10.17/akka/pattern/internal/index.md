---
description: Akka 2.10.17 - akka.pattern.internal
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:07:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/internal/index.html
title: Akka 2.10.17 - akka.pattern.internal
---

# Akka 2.10.17 - akka.pattern.internal

> **Summary:** Akka 2.10.17 - akka.pattern.internal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/pattern/index.html "Permalink")  package [pattern](../index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../../index.html)
- [**](../../../akka/pattern/internal/index.html "Permalink")  package internalDefinition Classes[pattern](../index.html)
- [CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "Service Provider Interface (SPI) for collecting metrics from Circuit Breaker.")
p[akka](../../index.html).[pattern](../index.html)

# internal[**](../../../akka/pattern/internal/index.html "Permalink")

#### package internal

### Type Members

1. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html "Permalink")  trait [CircuitBreakerTelemetry](CircuitBreakerTelemetry.html "Service Provider Interface (SPI) for collecting metrics from Circuit Breaker.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Service Provider Interface (SPI) for collecting metrics from Circuit Breaker.

Service Provider Interface (SPI) for collecting metrics from Circuit Breaker.

Implementations must include a single constructor with two arguments: Circuit Breaker id
and ExtendedActorSystem. To setup your implementation, add a setting in your `application.conf`:

```
akka.circuit-breaker.telemetry.implementations += com.example.MyMetrics
```
Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/internal/CircuitBreakerTelemetry.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/internal/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/internal/index.html)*
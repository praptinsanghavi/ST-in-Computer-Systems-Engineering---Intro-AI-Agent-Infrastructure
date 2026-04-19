---
description: Akka Projection 1.5.9 - akka.projection.internal
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:32:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html
title: Akka Projection 1.5.9 - akka.projection.internal
---

# Akka Projection 1.5.9 - akka.projection.internal

> **Summary:** Akka Projection 1.5.9 - akka.projection.internal

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](../cassandra/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](../eventsourced/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../grpc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/internal/index.html "Permalink")  package internalDefinition Classes[projection](../index.html)
- [**](../../../akka/projection/internal/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
- [Telemetry](Telemetry.html "Service Provider Interface (SPI) for collecting metrics from projections.")
- [**](../../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](../jdbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/kafka/index.html "Permalink")  package [kafka](../kafka/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](../r2dbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/slick/index.html "Permalink")  package [slick](../slick/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[projection](../index.html)
p[akka](../../index.html).[projection](../index.html)

# internal[**](../../../akka/projection/internal/index.html "Permalink")

#### package internal

### Package Members

1. [**](../../../akka/projection/internal/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
### Type Members

1. [**](../../../akka/projection/internal/Telemetry.html "Permalink")  trait [Telemetry](Telemetry.html "Service Provider Interface (SPI) for collecting metrics from projections.") extends [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Service Provider Interface (SPI) for collecting metrics from projections.

Service Provider Interface (SPI) for collecting metrics from projections.

Implementations must include a single constructor with two arguments: [ProjectionId](../ProjectionId.html)
and ActorSystem. To setup your implementation, add a setting on your `application.conf`:

```
akka.projection.telemetry.implementations += com.example.MyMetrics
```
Annotations@InternalStableApi()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/Telemetry.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/protobuf/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html)*
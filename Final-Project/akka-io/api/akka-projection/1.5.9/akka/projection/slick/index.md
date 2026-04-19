---
description: Akka Projection 1.5.9 - akka.projection.slick
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:32:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html
title: Akka Projection 1.5.9 - akka.projection.slick
---

# Akka Projection 1.5.9 - akka.projection.slick

> **Summary:** Akka Projection 1.5.9 - akka.projection.slick

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](../cassandra/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](../eventsourced/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../grpc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](../jdbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/kafka/index.html "Permalink")  package [kafka](../kafka/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](../r2dbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/slick/index.html "Permalink")  package slickDefinition Classes[projection](../index.html)
- [SlickHandler](SlickHandler.html "Implement this interface for the Envelope handler in SlickProjection.")
- [SlickProjection](SlickProjection$.html "Factories of akka.projection.Projection where the offset is stored in a relational database table using Slick.")
- [**](../../../akka/projection/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[projection](../index.html)
p[akka](../../index.html).[projection](../index.html)

# slick[**](../../../akka/projection/slick/index.html "Permalink")

#### package slick

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/projection/slick/SlickHandler.html "Permalink")  trait [SlickHandler](SlickHandler.html "Implement this interface for the Envelope handler in SlickProjection.")\[Envelope] extends [HandlerLifecycle](../scaladsl/HandlerLifecycle.html)Implement this interface for the Envelope handler in [SlickProjection](SlickProjection$.html).

Implement this interface for the Envelope handler in [SlickProjection](SlickProjection$.html).

It can be stateful, with variables and mutable data structures.
It is invoked by the `Projection` machinery one envelope at a time and visibility
guarantees between the invocations are handled automatically, i.e. no volatile or
other concurrency primitives are needed for managing the state.

Supported error handling strategies for when processing an `Envelope` fails can be
defined in configuration or using the `withRecoveryStrategy` method of a `Projection`
implementation.
### Value Members

1. [**](../../../akka/projection/slick/SlickHandler$.html "Permalink")  object [SlickHandler](SlickHandler$.html)
2. [**](../../../akka/projection/slick/SlickProjection$.html "Permalink")  object [SlickProjection](SlickProjection$.html "Factories of akka.projection.Projection where the offset is stored in a relational database table using Slick.")Factories of [akka.projection.Projection](../Projection.html) where the offset is stored in a relational database table using Slick.

Factories of [akka.projection.Projection](../Projection.html) where the offset is stored in a relational database table using Slick.
The envelope handler can integrate with anything, such as publishing to a message broker, or updating a relational read model.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/SlickHandler$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/SlickHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/SlickProjection$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html)*
---
description: Akka Projection 1.6.20 - akka.projection
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:37:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
title: Akka Projection 1.6.20 - akka.projection
---

# Akka Projection 1.6.20 - akka.projection

> **Summary:** Akka Projection 1.6.20 - akka.projection

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/projection/index.html "Permalink")  package projectionDefinition Classes[akka](../index.html)
- [**](../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](cassandra/index.html)
- [**](../../akka/projection/dynamodb/index.html "Permalink")  package [dynamodb](dynamodb/index.html)
- [**](../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](eventsourced/index.html)
- [**](../../akka/projection/grpc/index.html "Permalink")  package [grpc](grpc/index.html)
- [**](../../akka/projection/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](jdbc/index.html)
- [**](../../akka/projection/kafka/index.html "Permalink")  package [kafka](kafka/index.html)
- [**](../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](r2dbc/index.html)
- [**](../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [**](../../akka/projection/slick/index.html "Permalink")  package [slick](slick/index.html)
- [**](../../akka/projection/state/index.html "Permalink")  package [state](state/index.html)
- [**](../../akka/projection/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [AllowSeqNrGapsMetadata](AllowSeqNrGapsMetadata.html)
- [BySlicesSourceProvider](BySlicesSourceProvider.html "Implemented by EventSourcedProvider and DurableStateSourceProvider.")
- [HandlerRecoveryStrategy](HandlerRecoveryStrategy.html "Error handling strategy when processing an Envelope fails.")
- [MergeableOffset](MergeableOffset.html)
- [OffsetVerification](OffsetVerification.html)
- [Projection](Projection.html "The core abstraction in Akka Projections.")
- [ProjectionBehavior](ProjectionBehavior$.html)
- [ProjectionContext](ProjectionContext.html)
- [ProjectionId](ProjectionId.html)
- [RetryRecoveryStrategy](RetryRecoveryStrategy.html)
- [StatusObserver](StatusObserver.html "Track status of a projection by implementing a StatusObserver and install it using Projection.withStatusObserver.")
- [StrictRecoveryStrategy](StrictRecoveryStrategy.html)
p[akka](../index.html)

# projection[**](../../akka/projection/index.html "Permalink")

#### package projection

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](cassandra/index.html)
2. [**](../../akka/projection/dynamodb/index.html "Permalink")  package [dynamodb](dynamodb/index.html)
3. [**](../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](eventsourced/index.html)
4. [**](../../akka/projection/grpc/index.html "Permalink")  package [grpc](grpc/index.html)
5. [**](../../akka/projection/internal/index.html "Permalink")  package [internal](internal/index.html)
6. [**](../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
7. [**](../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](jdbc/index.html)
8. [**](../../akka/projection/kafka/index.html "Permalink")  package [kafka](kafka/index.html)
9. [**](../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](r2dbc/index.html)
10. [**](../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
11. [**](../../akka/projection/slick/index.html "Permalink")  package [slick](slick/index.html)
12. [**](../../akka/projection/state/index.html "Permalink")  package [state](state/index.html)
13. [**](../../akka/projection/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
### Type Members

1. [**](../../akka/projection/AllowSeqNrGapsMetadata.html "Permalink")  trait [AllowSeqNrGapsMetadata](AllowSeqNrGapsMetadata.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../akka/projection/BySlicesSourceProvider.html "Permalink")  trait [BySlicesSourceProvider](BySlicesSourceProvider.html "Implemented by EventSourcedProvider and DurableStateSourceProvider.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Implemented by `EventSourcedProvider` and `DurableStateSourceProvider`.
3. [**](../../akka/projection/HandlerRecoveryStrategy.html "Permalink") sealed  trait [HandlerRecoveryStrategy](HandlerRecoveryStrategy.html "Error handling strategy when processing an Envelope fails.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Error handling strategy when processing an `Envelope` fails.

Error handling strategy when processing an `Envelope` fails. The default is defined in configuration .
4. [**](../../akka/projection/MergeableOffset.html "Permalink") final  case class [MergeableOffset](MergeableOffset.html)\[Offset](entries: Map\[String, Offset]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../akka/projection/OffsetVerification.html "Permalink") sealed  trait [OffsetVerification](OffsetVerification.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../akka/projection/Projection.html "Permalink")  trait [Projection](Projection.html "The core abstraction in Akka Projections.")\[Envelope] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The core abstraction in Akka Projections.

The core abstraction in Akka Projections.

A projection instance may share the same name and Envelope, but must have a unique key. The key is used
to achieve processing parallelism for a projection.

For example, many projections may share the same name "user\-events\-projection", but can process events for
different sharded entities within Akka Cluster, where key could be the Akka Cluster shardId.

EnvelopeThe envelope type of the projection.
7. [**](../../akka/projection/ProjectionContext.html "Permalink")  trait [ProjectionContext](ProjectionContext.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../akka/projection/ProjectionId.html "Permalink") final  class [ProjectionId](ProjectionId.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../akka/projection/RetryRecoveryStrategy.html "Permalink") sealed  trait [RetryRecoveryStrategy](RetryRecoveryStrategy.html) extends [HandlerRecoveryStrategy](HandlerRecoveryStrategy.html)
10. [**](../../akka/projection/StatusObserver.html "Permalink") abstract  class [StatusObserver](StatusObserver.html "Track status of a projection by implementing a StatusObserver and install it using Projection.withStatusObserver.")\[\-Envelope] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Track status of a projection by implementing a `StatusObserver` and install it using
[Projection.withStatusObserver](Projection.html#withStatusObserver(observer:akka.projection.StatusObserver[Envelope]):akka.projection.Projection[Envelope]).
11. [**](../../akka/projection/StrictRecoveryStrategy.html "Permalink") sealed  trait [StrictRecoveryStrategy](StrictRecoveryStrategy.html) extends [HandlerRecoveryStrategy](HandlerRecoveryStrategy.html)
### Value Members

1. [**](../../akka/projection/AllowSeqNrGapsMetadata$.html "Permalink")  object [AllowSeqNrGapsMetadata](AllowSeqNrGapsMetadata$.html "When used as metadata of the EventEnvelope the offset store will allow gaps in sequence numbers when validating the offset.") extends [AllowSeqNrGapsMetadata](AllowSeqNrGapsMetadata.html)When used as metadata of the EventEnvelope the offset store will allow gaps
in sequence numbers when validating the offset.
2. [**](../../akka/projection/HandlerRecoveryStrategy$.html "Permalink")  object [HandlerRecoveryStrategy](HandlerRecoveryStrategy$.html)
3. [**](../../akka/projection/OffsetVerification$.html "Permalink")  object [OffsetVerification](OffsetVerification$.html)
4. [**](../../akka/projection/ProjectionBehavior$.html "Permalink")  object [ProjectionBehavior](ProjectionBehavior$.html)
5. [**](../../akka/projection/ProjectionId$.html "Permalink")  object [ProjectionId](ProjectionId$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/AllowSeqNrGapsMetadata$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/AllowSeqNrGapsMetadata.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/BySlicesSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/HandlerRecoveryStrategy$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/HandlerRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionBehavior$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionId$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/RetryRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/StatusObserver.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/StrictRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html)*
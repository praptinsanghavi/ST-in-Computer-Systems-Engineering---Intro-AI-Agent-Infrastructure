---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package javadslDefinition Classes[consumer](../index.html)
- [EventDestinationInterceptor](EventDestinationInterceptor.html "Interceptor allowing for example authentication/authorization of incoming connections to a EventProducerPushDestination")
- [EventProducerPushDestination](EventProducerPushDestination.html)
- [GrpcReadJournal](GrpcReadJournal.html)
- [Transformation](Transformation.html "Transformation of incoming pushed events from the producer to the internal representation stored in the journal and seen by local projections.")
- [**](../../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[consumer](../index.html)
p[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[consumer](../index.html)

# javadsl[**](../../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventDestinationInterceptor.html "Permalink")  trait [EventDestinationInterceptor](EventDestinationInterceptor.html "Interceptor allowing for example authentication/authorization of incoming connections to a EventProducerPushDestination") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Interceptor allowing for example authentication/authorization of incoming connections to a [EventProducerPushDestination](EventProducerPushDestination.html)

Interceptor allowing for example authentication/authorization of incoming connections to a [EventProducerPushDestination](EventProducerPushDestination.html)

Annotations@FunctionalInterface()
2. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html "Permalink") final  class [EventProducerPushDestination](EventProducerPushDestination.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html "Permalink") final  class [GrpcReadJournal](GrpcReadJournal.html) extends [ReadJournal](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/javadsl/ReadJournal.html#akka.persistence.query.javadsl.ReadJournal) with [EventsBySliceQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html#akka.persistence.query.typed.javadsl.EventsBySliceQuery) with [EventTimestampQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventTimestampQuery.html#akka.persistence.query.typed.javadsl.EventTimestampQuery) with [LoadEventQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LoadEventQuery.html#akka.persistence.query.typed.javadsl.LoadEventQuery) with CanTriggerReplay with [LatestEventTimestampQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html#akka.persistence.query.typed.javadsl.LatestEventTimestampQuery) with [CurrentEventsByPersistenceIdTypedQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html#akka.persistence.query.typed.javadsl.CurrentEventsByPersistenceIdTypedQuery)
4. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html "Permalink") final  class [Transformation](Transformation.html "Transformation of incoming pushed events from the producer to the internal representation stored in the journal and seen by local projections.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Transformation of incoming pushed events from the producer to the internal representation stored in the journal
and seen by local projections.

Transformation of incoming pushed events from the producer to the internal representation stored in the journal
and seen by local projections. Start from [Transformation.empty](Transformation$.html#empty:akka.projection.grpc.consumer.javadsl.Transformation) when defining transformations.
### Value Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination$.html "Permalink")  object [EventProducerPushDestination](EventProducerPushDestination$.html "A passive consumer service for event producer push that can be bound as a gRPC endpoint accepting active producers pushing events, for example to run a projection piercing firewalls or NAT.")A passive consumer service for event producer push that can be bound as a gRPC endpoint accepting active producers
pushing events, for example to run a projection piercing firewalls or NAT.

A passive consumer service for event producer push that can be bound as a gRPC endpoint accepting active producers
pushing events, for example to run a projection piercing firewalls or NAT. Events are pushed directly into the
configured journal and can then be consumed through a local projection. A producer can push events for multiple
entities but no two producer are allowed to push events for the same entity, at the same time.

The event consumer service is not needed for normal projections over gRPC where the consuming side can access and
initiate connections to the producing side.

Producers are started using the [akka.projection.grpc.producer.javadsl.EventProducerPush](../../producer/javadsl/EventProducerPush.html) API.
2. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html "Permalink")  object [GrpcReadJournal](GrpcReadJournal$.html)
3. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation$.html "Permalink")  object [Transformation](Transformation$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LoadEventQuery.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventDestinationInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerPush.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html)*
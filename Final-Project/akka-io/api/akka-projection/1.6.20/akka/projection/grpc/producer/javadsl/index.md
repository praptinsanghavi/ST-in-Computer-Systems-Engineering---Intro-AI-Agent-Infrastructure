---
description: Akka Projection 1.6.20 - akka.projection.grpc.producer.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/index.html
title: Akka Projection 1.6.20 - akka.projection.grpc.producer.javadsl
---

# Akka Projection 1.6.20 - akka.projection.grpc.producer.javadsl

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.producer.javadsl

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/producer/index.html "Permalink")  package [producer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/producer/javadsl/index.html "Permalink")  package javadslDefinition Classes[producer](../index.html)
- [EventProducer](EventProducer$.html "The event producer implementation that can be included a gRPC route in an Akka HTTP server.")
- [EventProducerInterceptor](EventProducerInterceptor.html "Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.")
- [EventProducerPush](EventProducerPush.html)
- [EventProducerSource](EventProducerSource.html)
- [Mapper](Mapper.html)
- [Transformation](Transformation.html "Transformation of events to the external (public) representation.")
- [**](../../../../../akka/projection/grpc/producer/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[producer](../index.html)
p[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[producer](../index.html)

# javadsl[**](../../../../../akka/projection/grpc/producer/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html "Permalink")  trait [EventProducerInterceptor](EventProducerInterceptor.html "Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.

Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.

Annotations@FunctionalInterface()
2. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducerPush.html "Permalink") final  class [EventProducerPush](EventProducerPush.html)\[Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducerSource.html "Permalink") final  class [EventProducerSource](EventProducerSource.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../../akka/projection/grpc/producer/javadsl/Mapper.html "Permalink")  trait [Mapper](Mapper.html)\[A, B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@FunctionalInterface()
5. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html "Permalink") final  class [Transformation](Transformation.html "Transformation of events to the external (public) representation.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Transformation of events to the external (public) representation.

Transformation of events to the external (public) representation.
Events can be excluded by mapping them to `Optional.empty`.

Not for direct construction, use [Transformation.empty](Transformation$.html#empty:akka.projection.grpc.producer.javadsl.Transformation) as starting point and register
mappers to build your needed Transformation
### Value Members

1. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html "Permalink")  object [EventProducer](EventProducer$.html "The event producer implementation that can be included a gRPC route in an Akka HTTP server.")The event producer implementation that can be included a gRPC route in an Akka HTTP server.
2. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducerPush$.html "Permalink")  object [EventProducerPush](EventProducerPush$.html "An active producer for event producer push that can be started on the producer to connect to consumers to push events, for example to run a projection piercing firewalls or NAT.")An active producer for event producer push that can be started on the producer to connect to consumers to
push events, for example to run a projection piercing firewalls or NAT.

An active producer for event producer push that can be started on the producer to connect to consumers to
push events, for example to run a projection piercing firewalls or NAT. A producer can push events for multiple
entities but no two producer are allowed to push events for the same entity.

The event consumer service is not needed for normal projections over gRPC where the consuming side can access and
initiate connections to the producing side.

Expects a [akka.projection.grpc.consumer.javadsl.EventProducerPushDestination](../../consumer/javadsl/EventProducerPushDestination.html) gRPC service
to be set up to accept the events on the consuming side.
3. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducerSource$.html "Permalink")  object [EventProducerSource](EventProducerSource$.html)
4. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation$.html "Permalink")  object [Transformation](Transformation$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerPush$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerPush.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerSource$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerSource.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Mapper.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/index.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/index.html)*
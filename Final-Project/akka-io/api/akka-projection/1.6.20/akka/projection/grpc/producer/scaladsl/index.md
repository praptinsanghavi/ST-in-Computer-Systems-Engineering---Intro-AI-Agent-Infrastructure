---
description: Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/index.html
title: Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl
---

# Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/producer/index.html "Permalink")  package [producer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/producer/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[producer](../index.html)
- [**](../../../../../akka/projection/grpc/producer/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[producer](../index.html)
- [EventProducer](EventProducer$.html "The event producer implementation that can be included a gRPC route in an Akka HTTP server.")
- [EventProducerInterceptor](EventProducerInterceptor.html "Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.")
- [EventProducerPush](EventProducerPush.html)
p[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[producer](../index.html)

# scaladsl[**](../../../../../akka/projection/grpc/producer/scaladsl/index.html "Permalink")

#### package scaladsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducerInterceptor.html "Permalink")  trait [EventProducerInterceptor](EventProducerInterceptor.html "Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.
2. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducerPush.html "Permalink") final  class [EventProducerPush](EventProducerPush.html)\[Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html "Permalink")  object [EventProducer](EventProducer$.html "The event producer implementation that can be included a gRPC route in an Akka HTTP server.")The event producer implementation that can be included a gRPC route in an Akka HTTP server.
2. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducerPush$.html "Permalink")  object [EventProducerPush](EventProducerPush$.html "An active producer for event producer push that can be started on the producer to connect to consumers to push events, for example to run a projection piercing firewalls or NAT.")An active producer for event producer push that can be started on the producer to connect to consumers to
push events, for example to run a projection piercing firewalls or NAT.

An active producer for event producer push that can be started on the producer to connect to consumers to
push events, for example to run a projection piercing firewalls or NAT. A producer can push events for multiple
entities but no two producer are allowed to push events for the same entity.

The event consumer service is not needed for normal projections over gRPC where the consuming side can access and
initiate connections to the producing side.

Expects a [akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination](../../consumer/scaladsl/EventProducerPushDestination.html) gRPC service
to be set up to accept the events on the consuming side.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerPush$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerPush.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/index.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/index.html)*
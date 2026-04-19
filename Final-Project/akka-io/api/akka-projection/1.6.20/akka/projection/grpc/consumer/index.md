---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/grpc/consumer/index.html "Permalink")  package consumerDefinition Classes[grpc](../index.html)
- [**](../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [ConsumerFilter](ConsumerFilter.html)
- [EventProducerPushDestinationSettings](EventProducerPushDestinationSettings.html)
- [GrpcQuerySettings](GrpcQuerySettings.html)
- [GrpcReadJournalProvider](GrpcReadJournalProvider.html "Note that GrpcReadJournal should be created with the GrpcReadJournal apply / create factory method and not from configuration via GrpcReadJournalProvider when using Protobuf serialization.")
- [**](../../../../akka/projection/grpc/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[grpc](../index.html)
- [**](../../../../akka/projection/grpc/producer/index.html "Permalink")  package [producer](../producer/index.html)Definition Classes[grpc](../index.html)
- [**](../../../../akka/projection/grpc/replication/index.html "Permalink")  package [replication](../replication/index.html)Definition Classes[grpc](../index.html)
p[akka](../../../index.html).[projection](../../index.html).[grpc](../index.html)

# consumer[**](../../../../akka/projection/grpc/consumer/index.html "Permalink")

#### package consumer

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
2. [**](../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html "Permalink") final  class [ConsumerFilter](ConsumerFilter.html) extends [Extension](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Extension.html#akka.actor.typed.Extension)
2. [**](../../../../akka/projection/grpc/consumer/EventProducerPushDestinationSettings.html "Permalink") final  class [EventProducerPushDestinationSettings](EventProducerPushDestinationSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html "Permalink") final  class [GrpcQuerySettings](GrpcQuerySettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html "Permalink") final  class [GrpcReadJournalProvider](GrpcReadJournalProvider.html "Note that GrpcReadJournal should be created with the GrpcReadJournal apply / create factory method and not from configuration via GrpcReadJournalProvider when using Protobuf serialization.") extends [ReadJournalProvider](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/ReadJournalProvider.html#akka.persistence.query.ReadJournalProvider)Note that `GrpcReadJournal` `should be created with the` GrpcReadJournal `apply` / `create` factory method
and not from configuration via `GrpcReadJournalProvider` when using Protobuf serialization.
### Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter$.html "Permalink")  object [ConsumerFilter](ConsumerFilter$.html "Extension to dynamically control the filters for the GrpcReadJournal.") extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ConsumerFilter](ConsumerFilter.html)]Extension to dynamically control the filters for the `GrpcReadJournal`.
2. [**](../../../../akka/projection/grpc/consumer/EventProducerPushDestinationSettings$.html "Permalink")  object [EventProducerPushDestinationSettings](EventProducerPushDestinationSettings$.html)
3. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings$.html "Permalink")  object [GrpcQuerySettings](GrpcQuerySettings$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcReadJournalProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/internal/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html)*
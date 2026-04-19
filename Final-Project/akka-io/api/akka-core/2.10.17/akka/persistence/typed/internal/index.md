---
description: Akka 2.10.17 - akka.persistence.typed.internal
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/internal/index.html
title: Akka 2.10.17 - akka.persistence.typed.internal
---

# Akka 2.10.17 - akka.persistence.typed.internal

> **Summary:** Akka 2.10.17 - akka.persistence.typed.internal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](../crdt/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/internal/index.html "Permalink")  package internalDefinition Classes[typed](../index.html)
- [ReplicatedEventMetadata](ReplicatedEventMetadata.html "INTERNAL API")
- [ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html)
- [ReplicatedSnapshotMetadata](ReplicatedSnapshotMetadata$.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html)

# internal[**](../../../../akka/persistence/typed/internal/index.html "Permalink")

#### package internal

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html "Permalink") final  case class [ReplicatedEventMetadata](ReplicatedEventMetadata.html "INTERNAL API")(originReplica: [ReplicaId](../ReplicaId.html), originSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), version: VersionVector, concurrent: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableINTERNAL API

INTERNAL API

originReplicaWhere the event originally was created

originSequenceNrThe original sequenceNr in the origin DC

versionThe version with which the event was persisted at the different DC. The same event will have different version vectors
 at each location as they are received at different times

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
2. [**](../../../../akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html "Permalink") final  class [ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata$.html "Permalink")  object [ReplicatedEventMetadata](ReplicatedEventMetadata$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
2. [**](../../../../akka/persistence/typed/internal/ReplicatedSnapshotMetadata$.html "Permalink")  object [ReplicatedSnapshotMetadata](ReplicatedSnapshotMetadata$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedEventMetadata$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedEventMetadata.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedSnapshotMetadata$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/index.html)*
---
description: Akka 2.10.17 - akka.persistence.serialization
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:22:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/serialization/index.html
title: Akka 2.10.17 - akka.persistence.serialization
---

# Akka 2.10.17 - akka.persistence.serialization

> **Summary:** Akka 2.10.17 - akka.persistence.serialization

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/fsm/index.html "Permalink")  package [fsm](../fsm/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](../scalatest/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/serialization/index.html "Permalink")  package serializationDefinition Classes[persistence](../index.html)
- [Message](Message.html "Marker trait for all protobuf-serializable messages in akka.persistence.")
- [MessageFormats](MessageFormats.html)
- [MessageSerializer](MessageSerializer.html "Protobuf serializer for akka.persistence.PersistentRepr, akka.persistence.AtLeastOnceDelivery and akka.persistence.fsm.PersistentFSM.StateChangeEvent messages.")
- [PayloadSerializer](PayloadSerializer.html "INTERNAL API")
- [Snapshot](Snapshot.html "Wrapper for snapshot data.")
- [SnapshotSerializer](SnapshotSerializer.html "Snapshot serializer.")
- [**](../../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](../snapshot/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[persistence](../index.html)
p[akka](../../index.html).[persistence](../index.html)

# serialization[**](../../../akka/persistence/serialization/index.html "Permalink")

#### package serialization

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/serialization/package.scala#L9)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. serialization
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/persistence/serialization/Message.html "Permalink")  trait [Message](Message.html "Marker trait for all protobuf-serializable messages in akka.persistence.") extends SerializableMarker trait for all protobuf\-serializable messages in `akka.persistence`.
2. [**](../../../akka/persistence/serialization/MessageFormats.html "Permalink") final  class [MessageFormats](MessageFormats.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../akka/persistence/serialization/MessageSerializer.html "Permalink")  class [MessageSerializer](MessageSerializer.html "Protobuf serializer for akka.persistence.PersistentRepr, akka.persistence.AtLeastOnceDelivery and akka.persistence.fsm.PersistentFSM.StateChangeEvent messages.") extends [BaseSerializer](../../serialization/BaseSerializer.html)Protobuf serializer for [akka.persistence.PersistentRepr](../PersistentRepr.html), [akka.persistence.AtLeastOnceDelivery](../AtLeastOnceDelivery.html) and [akka.persistence.fsm.PersistentFSM.StateChangeEvent](../fsm/PersistentFSM$$StateChangeEvent.html) messages.
4. [**](../../../akka/persistence/serialization/PayloadSerializer.html "Permalink") final  class [PayloadSerializer](PayloadSerializer.html "INTERNAL API") extends [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) with [BaseSerializer](../../serialization/BaseSerializer.html)INTERNAL API

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)()
5. [**](../../../akka/persistence/serialization/Snapshot.html "Permalink") final  case class [Snapshot](Snapshot.html "Wrapper for snapshot data.")(data: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWrapper for snapshot `data`.

Wrapper for snapshot `data`. Snapshot `data` are the actual snapshot objects captured by
the persistent actor.

Annotations@SerialVersionUID() See also[SnapshotSerializer](SnapshotSerializer.html)
6. [**](../../../akka/persistence/serialization/SnapshotSerializer.html "Permalink")  class [SnapshotSerializer](SnapshotSerializer.html "Snapshot serializer.") extends [BaseSerializer](../../serialization/BaseSerializer.html)[Snapshot](Snapshot.html) serializer.
### Value Members

1. [**](../../../akka/persistence/serialization/index.html#streamToBytes(inputStream:java.io.InputStream):Array[Byte] "Permalink")  def streamToBytes(inputStream: [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Converts an input stream to a byte array.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/Message.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/MessageFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/MessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/PayloadSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/Snapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/SnapshotSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/index.html)*
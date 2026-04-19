---
description: Akka 2.10.17 - akka.persistence.testkit
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:42:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/index.html
title: Akka 2.10.17 - akka.persistence.testkit
---

# Akka 2.10.17 - akka.persistence.testkit

> **Summary:** Akka 2.10.17 - akka.persistence.testkit

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
- [**](../../../akka/persistence/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](../snapshot/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package testkitDefinition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../../akka/persistence/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../akka/persistence/testkit/query/index.html "Permalink")  package [query](query/index.html)
- [**](../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [**](../../../akka/persistence/testkit/state/index.html "Permalink")  package [state](state/index.html)
- [DeleteEvents](DeleteEvents.html "Delete events in the journal up to toSeqNumber operation.")
- [DeleteSnapshot](DeleteSnapshot.html "INTERNAL API")
- [DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "Delete particular snapshot from storage by its metadata.")
- [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "Delete snapshots from storage by criteria.")
- [EventStorage](EventStorage$.html)
- [ExpectedFailure](ExpectedFailure.html)
- [ExpectedRejection](ExpectedRejection.html)
- [JournalOperation](JournalOperation.html "INTERNAL API")
- [PersistenceTestKitDurableStateStorePlugin](PersistenceTestKitDurableStateStorePlugin$.html)
- [PersistenceTestKitPlugin](PersistenceTestKitPlugin.html "INTERNAL API")
- [PersistenceTestKitSnapshotPlugin](PersistenceTestKitSnapshotPlugin.html "INTERNAL API")
- [ProcessingFailure](ProcessingFailure.html)
- [ProcessingPolicy](ProcessingPolicy.html "Policies allow to emulate behavior of the storage (failures and rejections).")
- [ProcessingResult](ProcessingResult.html "INTERNAL API")
- [ProcessingSuccess](ProcessingSuccess.html)
- [ReadEvents](ReadEvents.html "Read from journal operation with events that were read.")
- [ReadSeqNum](ReadSeqNum$.html "Read persistent actor's sequence number operation.")
- [ReadSnapshot](ReadSnapshot.html "Storage read operation for recovery of the persistent actor.")
- [Reject](Reject.html "Emulates rejection of operation by the journal with error exception.")
- [SnapshotMeta](SnapshotMeta.html "Snapshot metainformation.")
- [SnapshotOperation](SnapshotOperation.html "INTERNAL API Operations supported by snapshot plugin")
- [SnapshotStorage](SnapshotStorage$.html)
- [StorageFailure](StorageFailure.html "Emulates exception thrown by the storage on the attempt to perform some operation.")
- [WriteEvents](WriteEvents.html "Write in journal operation with events to be written.")
- [WriteSnapshot](WriteSnapshot.html "Storage write operation to persist snapshot in the storage.")
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[persistence](../index.html)
p[akka](../../index.html).[persistence](../index.html)

# testkit[**](../../../akka/persistence/testkit/index.html "Permalink")

#### package testkit

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/persistence/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)
2. [**](../../../akka/persistence/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
3. [**](../../../akka/persistence/testkit/query/index.html "Permalink")  package [query](query/index.html)
4. [**](../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
5. [**](../../../akka/persistence/testkit/state/index.html "Permalink")  package [state](state/index.html)
### Type Members

1. [**](../../../akka/persistence/testkit/DeleteEvents.html "Permalink") final  case class [DeleteEvents](DeleteEvents.html "Delete events in the journal up to toSeqNumber operation.")(toSeqNumber: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [JournalOperation](JournalOperation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDelete events in the journal up to `toSeqNumber` operation.
2. [**](../../../akka/persistence/testkit/DeleteSnapshot.html "Permalink") sealed abstract  class [DeleteSnapshot](DeleteSnapshot.html "INTERNAL API") extends [SnapshotOperation](SnapshotOperation.html)INTERNAL API

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)()
3. [**](../../../akka/persistence/testkit/DeleteSnapshotByMeta.html "Permalink") final  case class [DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "Delete particular snapshot from storage by its metadata.")(metadata: [SnapshotMeta](SnapshotMeta.html)) extends [DeleteSnapshot](DeleteSnapshot.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDelete particular snapshot from storage by its metadata.
4. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html "Permalink") final  case class [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "Delete snapshots from storage by criteria.")(criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)) extends [DeleteSnapshot](DeleteSnapshot.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDelete snapshots from storage by criteria.
5. [**](../../../akka/persistence/testkit/ExpectedFailure.html "Permalink") sealed abstract  class [ExpectedFailure](ExpectedFailure.html) extends Throwable with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)
6. [**](../../../akka/persistence/testkit/ExpectedRejection.html "Permalink") sealed abstract  class [ExpectedRejection](ExpectedRejection.html) extends Throwable
7. [**](../../../akka/persistence/testkit/JournalOperation.html "Permalink") sealed  trait [JournalOperation](JournalOperation.html "INTERNAL API") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API

INTERNAL API

Persistent journal operations.

Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/persistence/testkit/PersistenceTestKitPlugin.html "Permalink")  class [PersistenceTestKitPlugin](PersistenceTestKitPlugin.html "INTERNAL API") extends [AsyncWriteJournal](../journal/AsyncWriteJournal.html) with [ActorLogging](../../actor/ActorLogging.html)INTERNAL API

INTERNAL API

Persistence testkit plugin for events.

Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html "Permalink")  class [PersistenceTestKitSnapshotPlugin](PersistenceTestKitSnapshotPlugin.html "INTERNAL API") extends [SnapshotStore](../snapshot/SnapshotStore.html)INTERNAL API

INTERNAL API

Persistence testkit plugin for snapshots.

Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/persistence/testkit/ProcessingFailure.html "Permalink") sealed  trait [ProcessingFailure](ProcessingFailure.html) extends [ProcessingResult](ProcessingResult.html)
11. [**](../../../akka/persistence/testkit/ProcessingPolicy.html "Permalink")  trait [ProcessingPolicy](ProcessingPolicy.html "Policies allow to emulate behavior of the storage (failures and rejections).")\[U] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Policies allow to emulate behavior of the storage (failures and rejections).

Policies allow to emulate behavior of the storage (failures and rejections).

Utype determines operations which storage can perform.

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)()
12. [**](../../../akka/persistence/testkit/ProcessingResult.html "Permalink") sealed  trait [ProcessingResult](ProcessingResult.html "INTERNAL API") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)()
13. [**](../../../akka/persistence/testkit/ProcessingSuccess.html "Permalink") sealed abstract  class [ProcessingSuccess](ProcessingSuccess.html) extends [ProcessingResult](ProcessingResult.html)
14. [**](../../../akka/persistence/testkit/ReadEvents.html "Permalink") final  case class [ReadEvents](ReadEvents.html "Read from journal operation with events that were read.")(batch: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [JournalOperation](JournalOperation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRead from journal operation with events that were read.
15. [**](../../../akka/persistence/testkit/ReadSnapshot.html "Permalink") final  case class [ReadSnapshot](ReadSnapshot.html "Storage read operation for recovery of the persistent actor.")(criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html), snapshot: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [SnapshotOperation](SnapshotOperation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStorage read operation for recovery of the persistent actor.

Storage read operation for recovery of the persistent actor.

criteriacriteria with which snapshot is searched

snapshotsnapshot found by criteria
16. [**](../../../akka/persistence/testkit/Reject.html "Permalink") final  case class [Reject](Reject.html "Emulates rejection of operation by the journal with error exception.")(error: Throwable \= [ExpectedRejection](ExpectedRejection$.html)) extends [ProcessingFailure](ProcessingFailure.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableEmulates rejection of operation by the journal with `error` exception.

Emulates rejection of operation by the journal with `error` exception.
Has the same meaning as `StorageFailure` for snapshot storage,
because it does not support rejections.
17. [**](../../../akka/persistence/testkit/SnapshotMeta.html "Permalink") final  case class [SnapshotMeta](SnapshotMeta.html "Snapshot metainformation.")(sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0L) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSnapshot metainformation.
18. [**](../../../akka/persistence/testkit/SnapshotOperation.html "Permalink") sealed  trait [SnapshotOperation](SnapshotOperation.html "INTERNAL API Operations supported by snapshot plugin") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API
Operations supported by snapshot plugin

INTERNAL API
Operations supported by snapshot plugin

Annotations@[InternalApi](../../annotation/InternalApi.html)()
19. [**](../../../akka/persistence/testkit/StorageFailure.html "Permalink") final  case class [StorageFailure](StorageFailure.html "Emulates exception thrown by the storage on the attempt to perform some operation.")(error: Throwable \= [ExpectedFailure](ExpectedFailure$.html)) extends [ProcessingFailure](ProcessingFailure.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableEmulates exception thrown by the storage on the attempt to perform some operation.
20. [**](../../../akka/persistence/testkit/WriteEvents.html "Permalink") final  case class [WriteEvents](WriteEvents.html "Write in journal operation with events to be written.")(batch: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [JournalOperation](JournalOperation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWrite in journal operation with events to be written.
21. [**](../../../akka/persistence/testkit/WriteSnapshot.html "Permalink") final  case class [WriteSnapshot](WriteSnapshot.html "Storage write operation to persist snapshot in the storage.")(metadata: [SnapshotMeta](SnapshotMeta.html), snapshot: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [SnapshotOperation](SnapshotOperation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStorage write operation to persist snapshot in the storage.

Storage write operation to persist snapshot in the storage.

metadatasnapshot metadata

snapshotsnapshot payload
### Value Members

1. [**](../../../akka/persistence/testkit/EventStorage$.html "Permalink")  object [EventStorage](EventStorage$.html)
2. [**](../../../akka/persistence/testkit/ExpectedFailure$.html "Permalink")  object [ExpectedFailure](ExpectedFailure$.html) extends [ExpectedFailure](ExpectedFailure.html)
3. [**](../../../akka/persistence/testkit/ExpectedRejection$.html "Permalink")  object [ExpectedRejection](ExpectedRejection$.html) extends [ExpectedRejection](ExpectedRejection.html)
4. [**](../../../akka/persistence/testkit/PersistenceTestKitDurableStateStorePlugin$.html "Permalink")  object [PersistenceTestKitDurableStateStorePlugin](PersistenceTestKitDurableStateStorePlugin$.html)
5. [**](../../../akka/persistence/testkit/PersistenceTestKitPlugin$.html "Permalink")  object [PersistenceTestKitPlugin](PersistenceTestKitPlugin$.html)
6. [**](../../../akka/persistence/testkit/PersistenceTestKitSnapshotPlugin$.html "Permalink")  object [PersistenceTestKitSnapshotPlugin](PersistenceTestKitSnapshotPlugin$.html)
7. [**](../../../akka/persistence/testkit/ProcessingPolicy$.html "Permalink")  object [ProcessingPolicy](ProcessingPolicy$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/persistence/testkit/ProcessingSuccess$.html "Permalink")  case object [ProcessingSuccess](ProcessingSuccess$.html "Emulates successful processing of some operation.") extends [ProcessingSuccess](ProcessingSuccess.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableEmulates successful processing of some operation.
9. [**](../../../akka/persistence/testkit/ReadSeqNum$.html "Permalink")  case object [ReadSeqNum](ReadSeqNum$.html "Read persistent actor's sequence number operation.") extends [JournalOperation](JournalOperation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRead persistent actor's sequence number operation.
10. [**](../../../akka/persistence/testkit/Reject$.html "Permalink")  object [Reject](Reject$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
11. [**](../../../akka/persistence/testkit/SnapshotMeta$.html "Permalink")  case object [SnapshotMeta](SnapshotMeta$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
12. [**](../../../akka/persistence/testkit/SnapshotStorage$.html "Permalink")  object [SnapshotStorage](SnapshotStorage$.html)
13. [**](../../../akka/persistence/testkit/StorageFailure$.html "Permalink")  object [StorageFailure](StorageFailure$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/SnapshotStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteEvents.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteSnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteSnapshotByMeta.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/EventStorage$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ExpectedFailure$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ExpectedFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ExpectedRejection$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ExpectedRejection.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitDurableStateStorePlugin$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitPlugin$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingPolicy$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingSuccess$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ReadEvents.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ReadSeqNum$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ReadSnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/Reject$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/Reject.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotMeta$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotStorage$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/StorageFailure$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/StorageFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/WriteEvents.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html)*
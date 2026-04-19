---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.cleanup.Cleanup
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/cleanup/Cleanup.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.cleanup.Cleanup
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.cleanup.Cleanup

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.cleanup.Cleanup

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/cassandra/cleanup/index.html "Permalink")  package [cleanup](index.html)Definition Classes[cassandra](../index.html)
- Cleanup
- [CleanupSettings](CleanupSettings.html)
c[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html).[cleanup](index.html)

# Cleanup[**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html "Permalink")

### 

#### final  class Cleanup extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Tool for deleting all events and/or snapshots for a given list of `persistenceIds` without using persistent actors.
It's important that the actors with corresponding `persistenceId` are not running
at the same time as using the tool.

If `neverUsePersistenceIdAgain` is `true` then the highest used sequence number is deleted and
the `persistenceId` should not be used again, since it would be confusing to reuse the same sequence
numbers for new events.

When a list of `persistenceIds` are given they are deleted sequentially in the order
of the list. It's possible to parallelize the deletes by running several cleanup operations
at the same time operating on different sets of `persistenceIds`.

Annotations@ApiMayChange() Source[Cleanup.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/cleanup/Cleanup.scala#L46)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Cleanup
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider):akka.persistence.cassandra.cleanup.Cleanup "Permalink")  new Cleanup(systemProvider: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider))
2. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider,settings:akka.persistence.cassandra.cleanup.CleanupSettings):akka.persistence.cassandra.cleanup.Cleanup "Permalink")  new Cleanup(systemProvider: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), settings: [CleanupSettings](CleanupSettings.html))
### Value Members

1. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#cleanupBeforeSnapshot(persistenceIds:Seq[String],nrSnapshotsToKeep:Int,keepAfter:Long):scala.concurrent.Future[akka.Done] "Permalink")  def cleanupBeforeSnapshot(persistenceIds: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String], nrSnapshotsToKeep: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), keepAfter: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Requires Cassandra 3\+

Requires Cassandra 3\+

See single persistenceId overload for what is done for each persistence id
6. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#cleanupBeforeSnapshot(persistenceIds:Seq[String],nrSnapshotsToKeep:Int):scala.concurrent.Future[akka.Done] "Permalink")  def cleanupBeforeSnapshot(persistenceIds: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String], nrSnapshotsToKeep: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Requires Cassandra 3\+

Requires Cassandra 3\+

See single persistenceId overload for what is done for each persistence id
7. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#cleanupBeforeSnapshot(persistenceId:String,nrSnapshotsToKeep:Int,keepAfter:Long):scala.concurrent.Future[akka.Done] "Permalink")  def cleanupBeforeSnapshot(persistenceId: String, nrSnapshotsToKeep: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), keepAfter: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Requires Cassandra 3\+

Requires Cassandra 3\+

Deletes all events for the given persistence id from before the first after keepAfter.
If there are not enough snapshots to satisfy nrSnapshotsToKeep then snapshots before
keepAfter will also be kept.

WARNING: deleting events is generally discouraged in event sourced systems.
 once deleted the event by tag view can not be re\-built
8. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#cleanupBeforeSnapshot(persistenceId:String,nrSnapshotsToKeep:Int):scala.concurrent.Future[akka.Done] "Permalink")  def cleanupBeforeSnapshot(persistenceId: String, nrSnapshotsToKeep: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Requires Cassandra 3\+

Requires Cassandra 3\+

Deletes all but the last N snapshots and deletes all events before this snapshot
Does not delete from the tag\_views table

WARNING: deleting events is generally discouraged in event sourced systems.
 once deleted the event by tag view can not be re\-built
9. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
10. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteAll(persistenceId:String,neverUsePersistenceIdAgain:Boolean):scala.concurrent.Future[akka.Done] "Permalink")  def deleteAll(persistenceId: String, neverUsePersistenceIdAgain: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Delete everything related to one single `persistenceId`.

Delete everything related to one single `persistenceId`. All events, tagged events, and
snapshots are deleted.
11. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteAll(persistenceIds:Seq[String],neverUsePersistenceIdAgain:Boolean):scala.concurrent.Future[akka.Done] "Permalink")  def deleteAll(persistenceIds: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String], neverUsePersistenceIdAgain: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Delete everything related to the given list of `persistenceIds`.

Delete everything related to the given list of `persistenceIds`. All events, tagged events, and
snapshots are deleted.
12. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteAllEvents(persistenceId:String,neverUsePersistenceIdAgain:Boolean):scala.concurrent.Future[akka.Done] "Permalink")  def deleteAllEvents(persistenceId: String, neverUsePersistenceIdAgain: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Delete all events related to one single `persistenceId`.

Delete all events related to one single `persistenceId`. Snapshots are not deleted.
13. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteAllEvents(persistenceIds:Seq[String],neverUsePersistenceIdAgain:Boolean):scala.concurrent.Future[akka.Done] "Permalink")  def deleteAllEvents(persistenceIds: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String], neverUsePersistenceIdAgain: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Delete all events related to the given list of `persistenceIds`.

Delete all events related to the given list of `persistenceIds`. Snapshots are not deleted.
14. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteAllSnapshots(persistenceId:String):scala.concurrent.Future[akka.Done] "Permalink")  def deleteAllSnapshots(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Delete all snapshots related to one single `persistenceId`.

Delete all snapshots related to one single `persistenceId`. Events are not deleted.
15. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteAllSnapshots(persistenceIds:Seq[String]):scala.concurrent.Future[akka.Done] "Permalink")  def deleteAllSnapshots(persistenceIds: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Delete all snapshots related to the given list of `persistenceIds`.

Delete all snapshots related to the given list of `persistenceIds`. Events are not deleted.
16. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteAllTaggedEvents(persistenceId:String):scala.concurrent.Future[akka.Done] "Permalink")  def deleteAllTaggedEvents(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Delete all events from `tag_views` table related to to one single `persistenceId`.

Delete all events from `tag_views` table related to to one single `persistenceId`.
Events in `messages` (journal) table are not deleted and snapshots are not deleted.
17. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteAllTaggedEvents(persistenceIds:Seq[String]):scala.concurrent.Future[akka.Done] "Permalink")  def deleteAllTaggedEvents(persistenceIds: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Delete all events from `tag_views` table related to the given list of `persistenceIds`.

Delete all events from `tag_views` table related to the given list of `persistenceIds`.
Events in `messages` (journal) table are not deleted and snapshots are not deleted.
18. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteBeforeSnapshot(persistenceId:String,maxSnapshotsToKeep:Int):scala.concurrent.Future[Option[akka.persistence.SnapshotMetadata]] "Permalink")  def deleteBeforeSnapshot(persistenceId: String, maxSnapshotsToKeep: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SnapshotMetadata](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/SnapshotMetadata.html#akka.persistence.SnapshotMetadata)]]Requires Cassandra 3\+

Requires Cassandra 3\+

Keep N snapshots and delete all older snapshots along.

This operation is much cheaper than including the timestamp because it can use the primary key and limit.

returnsthe snapshot meta of the oldest remaining snapshot. None if there are no snapshots. This can be used to delete events from before the snapshot.
19. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteBeforeSnapshot(persistenceId:String,snapshotsToKeep:Int,keepAfterUnixTimestamp:Long):scala.concurrent.Future[Option[akka.persistence.SnapshotMetadata]] "Permalink")  def deleteBeforeSnapshot(persistenceId: String, snapshotsToKeep: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), keepAfterUnixTimestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SnapshotMetadata](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/SnapshotMetadata.html#akka.persistence.SnapshotMetadata)]]Requires Cassandra 3\+

Requires Cassandra 3\+

Keep all snapshots that occurred after `keepAfter`.
If fewer than `snapshotsToKeep` occurred after `keepAfter` at least that many
are kept. Setting this to 1 ensures that at least snapshot is kept even if it
is older than the `keepAfter`

If only N number of snapshot should be kept prefer overload without timestamp
as it is more efficient.

The returned snapshot metadata can be used to issue deletes for events older than the oldest
snapshot.

returnsthe snapshot meta of the oldest remaining snapshot. None if there are no snapshots
20. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#deleteEventsTo(persistenceId:String,toSequenceNr:Long):scala.concurrent.Future[akka.Done] "Permalink")  def deleteEventsTo(persistenceId: String, toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Requires Cassandra 3\+

Requires Cassandra 3\+

Delete all events before a sequenceNr for the given persistence id.

WARNING: deleting events is generally discouraged in event sourced systems.
 once deleted the event by tag view can not be re\-built

persistenceIdthe persistence id to delete for

toSequenceNrsequence nr (inclusive) to delete up to
21. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
23. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
24. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
25. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
28. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
29. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/CleanupSettings.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html)*
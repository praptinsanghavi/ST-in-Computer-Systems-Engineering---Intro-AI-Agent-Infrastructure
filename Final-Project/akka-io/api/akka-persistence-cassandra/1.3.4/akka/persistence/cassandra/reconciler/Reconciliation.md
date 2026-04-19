---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.reconciler.Reconciliation
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/reconciler/Reconciliation.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.reconciler.Reconciliation
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.reconciler.Reconciliation

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.reconciler.Reconciliation

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/cassandra/reconciler/index.html "Permalink")  package [reconciler](index.html)Definition Classes[cassandra](../index.html)
- Reconciliation
- [ReconciliationSettings](ReconciliationSettings.html)
c[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html).[reconciler](index.html)

# Reconciliation[**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html "Permalink")

### 

#### final  class Reconciliation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

For reconciling the `tag_views` table with the messages table. Can be used to:

\- Fix data issues caused by split brains or persistence ids running in multiple locations
\- Continue tag writes after a node crash (using [continueTagWritesForPersistenceId](#continueTagWritesForPersistenceId(persistenceId:String):scala.concurrent.Future[akka.Done]))
\- Rebuild tag views from scratch (using [rebuildTagViewForPersistenceIds](#rebuildTagViewForPersistenceIds(persistenceId:String):scala.concurrent.Future[akka.Done]))

**Important**: Most operations (delete, truncate, rebuild) should only be run when the
affected persistence ids are NOT running. Running these while actors are actively persisting
can cause data corruption or gaps in tag sequences. The exception is [continueTagWritesForPersistenceId](#continueTagWritesForPersistenceId(persistenceId:String):scala.concurrent.Future[akka.Done])
which is safe to run while the application is running.

API likely to change when a java/scaladsl is added.

Annotations@ApiMayChange() Source[Reconciliation.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/reconciler/Reconciliation.scala#L141)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Reconciliation
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider):akka.persistence.cassandra.reconciler.Reconciliation "Permalink")  new Reconciliation(systemProvider: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider))
2. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider,settings:akka.persistence.cassandra.reconciler.ReconciliationSettings):akka.persistence.cassandra.reconciler.Reconciliation "Permalink")  new Reconciliation(systemProvider: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), settings: [ReconciliationSettings](ReconciliationSettings.html))
### Value Members

1. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#allTags():akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def allTags(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[String, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Returns all the tags in the journal.

Returns all the tags in the journal. This is not an efficient query for Cassandra so it is better
to calculate tags for calls to deleteTagViewForPersistenceId another way.

Prefer to do batches of persistence ids at a time getting the tags just for that persistence id.
5. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#continueTagWritesForPersistenceId(persistenceId:String):scala.concurrent.Future[akka.Done] "Permalink")  def continueTagWritesForPersistenceId(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Continues tag writes from where they left off by only writing events that are newer
than the current progress (`seqNr > progress.sequenceNr`).

Continues tag writes from where they left off by only writing events that are newer
than the current progress (`seqNr > progress.sequenceNr`).

Use this when a node crashed or was stopped while tag writes were pending, and you want
to complete those writes without the actor having to restart. This is more efficient than
[rebuildTagViewForPersistenceIds](#rebuildTagViewForPersistenceIds(persistenceId:String):scala.concurrent.Future[akka.Done]) as it:

\- Starts reading from the minimum progress sequence number (not from 0\)
\- Only writes events that are actually missing

**Concurrency safety**: This method can be run while the corresponding actor is running.
Tag writes are idempotent because:

\- The `timeUuid` is from the original event in the main journal (immutable)
\- The `tag_pid_sequence_nr` is derived deterministically from the progress baseline

If both the running actor and this tool process the same events, they will calculate
the same `tag_pid_sequence_nr` values, resulting in the same primary key. Cassandra's
upsert behavior ensures no duplicates.
8. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#deleteTagViewForPersistenceIds(persistenceId:Set[String],tag:String):scala.concurrent.Future[akka.Done] "Permalink")  def deleteTagViewForPersistenceIds(persistenceId: Set\[String], tag: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Scans the given tag and deletes all events for the provided persistence ids.

Scans the given tag and deletes all events for the provided persistence ids.
All events for a persistence id have to be deleted as not to leave gaps in the
tag pid sequence numbers. Also deletes the tag progress for the persistence ids.

**Warning**: Do not run this while the affected persistence ids are actively running.
Concurrent writes from running actors will cause data inconsistencies.
9. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#rebuildAllPersistenceIds():scala.concurrent.Future[akka.Done] "Permalink")  def rebuildAllPersistenceIds(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]
18. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#rebuildTagViewForPersistenceIds(persistenceId:String):scala.concurrent.Future[akka.Done] "Permalink")  def rebuildTagViewForPersistenceIds(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Rebuilds the tag view for a persistence id by writing ALL events to the `tag_views` table.

Rebuilds the tag view for a persistence id by writing ALL events to the `tag_views` table.

**Important**: This method should only be used after [deleteTagViewForPersistenceIds](#deleteTagViewForPersistenceIds(persistenceId:Set[String],tag:String):scala.concurrent.Future[akka.Done])
or [truncateTagView](#truncateTagView():scala.concurrent.Future[akka.Done]) has been called. Running rebuild on existing data will create
duplicate entries with different `tag_pid_sequence_nr` values, causing gaps that will
be detected by eventsByTag queries.

**Warning**: Do not run this while the persistence id is actively running.
Stop the actor first, then rebuild.

Use this for:

\- Rebuilding after [deleteTagViewForPersistenceIds](#deleteTagViewForPersistenceIds(persistenceId:Set[String],tag:String):scala.concurrent.Future[akka.Done]) or [truncateTagView](#truncateTagView():scala.concurrent.Future[akka.Done])
\- Initial population when tag writing was previously disabled

For continuing incomplete tag writes (e.g., after a crash), use
[continueTagWritesForPersistenceId](#continueTagWritesForPersistenceId(persistenceId:String):scala.concurrent.Future[akka.Done]) instead.
19. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#tagsForPersistenceId(persistenceId:String):scala.concurrent.Future[Set[String]] "Permalink")  def tagsForPersistenceId(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Set\[String]]Select all the tags for the given persistence id.

Select all the tags for the given persistence id. This may not return tags that
have just been used for the first time.
21. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#truncateTagView():scala.concurrent.Future[akka.Done] "Permalink")  def truncateTagView(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Truncate all tag related tables and all metadata so that it can be rebuilt.

Truncate all tag related tables and all metadata so that it can be rebuilt.

**Warning**: Do not run this while the application is running. Stop all
persistent actors first, then truncate, then rebuild or restart the application.
23. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/Reconciliation.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/ReconciliationSettings.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/Reconciliation.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/Reconciliation.html)*
---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.EventsByTagMigration
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/EventsByTagMigration.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.EventsByTagMigration
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.EventsByTagMigration

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.EventsByTagMigration

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/cassandra/cleanup/index.html "Permalink")  package [cleanup](cleanup/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/compaction/index.html "Permalink")  package [compaction](compaction/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/example/index.html "Permalink")  package [example](example/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/healthcheck/index.html "Permalink")  package [healthcheck](healthcheck/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/journal/index.html "Permalink")  package [journal](journal/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/query/index.html "Permalink")  package [query](query/index.html)Definition Classes[cassandra](index.html)
- [**](../../../akka/persistence/cassandra/reconciler/index.html "Permalink")  package [reconciler](reconciler/index.html)Definition Classes[cassandra](index.html)
- EventsByTagMigration
- [KeyspaceAndTableStatements](KeyspaceAndTableStatements.html "Definitions of keyspace and table creation statements.")
[c](EventsByTagMigration$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[cassandra](index.html)

# [EventsByTagMigration](EventsByTagMigration$.html "See companion object")[**](../../../akka/persistence/cassandra/EventsByTagMigration.html "Permalink")

### Companion [object EventsByTagMigration](EventsByTagMigration$.html "See companion object")

#### class EventsByTagMigration extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[EventsByTagMigration.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/EventsByTagMigration.scala#L73)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsByTagMigration
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider,pluginConfigPath:String):akka.persistence.cassandra.EventsByTagMigration "Permalink")  new EventsByTagMigration(systemProvider: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), pluginConfigPath: String \= "akka.persistence.cassandra")pluginConfigPathThe config namespace where the plugin is configured, default is `akka.persistence.cassandra`
### Value Members

1. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#addTagsColumn():scala.concurrent.Future[akka.Done] "Permalink")  def addTagsColumn(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]
5. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#createTables():scala.concurrent.Future[akka.Done] "Permalink")  def createTables(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]
8. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#ec:scala.concurrent.ExecutionContext "Permalink") implicit  val ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)
9. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#migratePidsToTagViews(pids:Seq[akka.persistence.cassandra.journal.CassandraJournal.PersistenceId],periodicFlush:Int,flushTimeout:akka.util.Timeout):scala.concurrent.Future[akka.Done] "Permalink")  def migratePidsToTagViews(pids: Seq\[PersistenceId], periodicFlush: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, flushTimeout: [Timeout](https://doc.akka.io/api/akka-core/2.10.11/akka/util/Timeout.html#akka.util.Timeout) \= [Timeout(30\.seconds)](../../index.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Migrates the given persistenceIds from the `messages` table to the
new `tags_view` table.

Migrates the given persistenceIds from the `messages` table to the
new `tags_view` table. `tag_view` table must exist before calling this
and can be created manually or via \[createTagsTable]

This is useful if there there is a more efficient way of getting all the
persistenceIds than \[CassandraReadJournal.currentPersistenceIds] which does
a distinct query on the `messages` table.

This can also be used to do partial migrations e.g. test a persistenceId in
production before migrating everything.

It is recommended you use this if the `messages` table is large.

Events are batched with the given `periodicFlush`. By default the value equals
configured `events-by-tag.max-message-batch-size`.

pidsPersistenceIds to migrate

returnsA Future that completes when the migration is complete
15. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#migrateToTagViews(periodicFlush:Int,filter:String=>Boolean,flushTimeout:akka.util.Timeout):scala.concurrent.Future[akka.Done] "Permalink")  def migrateToTagViews(periodicFlush: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, filter: (String) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= \_ \=\> true, flushTimeout: [Timeout](https://doc.akka.io/api/akka-core/2.10.11/akka/util/Timeout.html#akka.util.Timeout) \= [Timeout(30\.seconds)](../../index.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Migrates the entire `messages` table to the the new `tag_views` table.

Migrates the entire `messages` table to the the new `tag_views` table.

Before running this you must run the migration of the `all_persistence_ids`
table as described in https://doc.akka.io/libraries/akka\-persistence\-cassandra/current/migrations.html\#all\-persistenceIds\-query

Uses \[CassandraReadJournal.currentPersistenceIds] to find all persistenceIds.
Note that this is a very inefficient cassandra query so might timeout. If so
the version of this method can be used where the persistenceIds are provided.

Persistence ids can be excluded (e.g. useful if you know certain persistenceIds
don't use tags.

Events are batched with the given `periodicFlush`. By default the value equals
configured `events-by-tag.max-message-batch-size`.

returnsA Future that completes when the migration is complete.
16. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
19. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#session:akka.stream.alpakka.cassandra.scaladsl.CassandraSession "Permalink")  lazy val session: [CassandraSession](https://doc.akka.io/api/alpakka/10.0.0/akka/stream/alpakka/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#akka.stream.alpakka.cassandra.scaladsl.CassandraSession)
20. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/persistence/cassandra/EventsByTagMigration.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Timeout.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/EventsByTagMigration$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/EventsByTagMigration.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/KeyspaceAndTableStatements.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/example/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/healthcheck/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/journal/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html
- https://doc.akka.io/api/alpakka/10.0.0/akka/stream/alpakka/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/EventsByTagMigration.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/EventsByTagMigration.html)*
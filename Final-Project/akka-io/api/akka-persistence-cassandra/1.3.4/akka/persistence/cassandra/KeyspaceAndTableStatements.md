---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.KeyspaceAndTableStatements
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/KeyspaceAndTableStatements.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.KeyspaceAndTableStatements
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.KeyspaceAndTableStatements

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.KeyspaceAndTableStatements

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
- [EventsByTagMigration](EventsByTagMigration.html)
- KeyspaceAndTableStatements
c[akka](../../index.html).[persistence](../index.html).[cassandra](index.html)

# KeyspaceAndTableStatements[**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html "Permalink")

### 

#### class KeyspaceAndTableStatements extends CassandraStatements

Definitions of keyspace and table creation statements.

Source[KeyspaceAndTableStatements.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/KeyspaceAndTableStatements.scala#L15)Linear SupertypesCassandraStatements, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. KeyspaceAndTableStatements
2. CassandraStatements
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider,configPath:String,settings:akka.persistence.cassandra.PluginSettings):akka.persistence.cassandra.KeyspaceAndTableStatements "Permalink")  new KeyspaceAndTableStatements(systemProvider: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), configPath: String, settings: PluginSettings)
### Value Members

1. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#createJournalKeyspaceStatement:String "Permalink")  def createJournalKeyspaceStatement: StringThe Cassandra Statement that can be used to create the configured keyspace.

The Cassandra Statement that can be used to create the configured keyspace.

This can be queried in for example a startup script without accessing the actual
Cassandra plugin actor.
7. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#createJournalTablesStatements:Seq[String] "Permalink")  def createJournalTablesStatements: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Scala API: The Cassandra statements that can be used to create the configured tables.

Scala API: The Cassandra statements that can be used to create the configured tables.

This can be queried in for example a startup script without accessing the actual
Cassandra plugin actor.
8. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#createSnapshotKeyspaceStatement:String "Permalink")  def createSnapshotKeyspaceStatement: StringThe Cassandra Statement that can be used to create the configured keyspace.

The Cassandra Statement that can be used to create the configured keyspace.

This can be queried in for example a startup script without accessing the actual
Cassandra plugin actor.
9. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#createSnapshotTablesStatements:Seq[String] "Permalink")  def createSnapshotTablesStatements: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Scala API: The Cassandra statements that can be used to create the configured tables.

Scala API: The Cassandra statements that can be used to create the configured tables.

This can be queried in for example a startup script without accessing the actual
Cassandra plugin actor.
10. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#executeAllCreateKeyspaceAndTables(session:com.datastax.oss.driver.api.core.CqlSession,log:akka.event.LoggingAdapter)(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[akka.Done] "Permalink")  def executeAllCreateKeyspaceAndTables(session: CqlSession, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Execute creation of keyspace and tables if that is enabled in config.

Execute creation of keyspace and tables if that is enabled in config.
Avoid calling this from several threads at the same time to
reduce the risk of (annoying) "Column family ID mismatch" exception.

Exceptions will be logged but will not fail the returned Future.

Definition ClassesCassandraStatements
13. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#getCreateJournalTablesStatements:java.util.List[String] "Permalink")  def getCreateJournalTablesStatements: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[String]Java API: The Cassandra statements that can be used to create the configured tables.

Java API: The Cassandra statements that can be used to create the configured tables.

This can be queried in for example a startup script without accessing the actual
Cassandra plugin actor.
15. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#getCreateSnapshotTablesStatements:java.util.List[String] "Permalink")  def getCreateSnapshotTablesStatements: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[String]Java API: The Cassandra statements that can be used to create the configured tables.

Java API: The Cassandra statements that can be used to create the configured tables.

This can be queried in for example a startup script without accessing the actual
Cassandra plugin actor.
16. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#journalStatements:akka.persistence.cassandra.journal.CassandraJournalStatements "Permalink")  val journalStatements: CassandraJournalStatementsDefinition ClassesCassandraStatements
19. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
21. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
22. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#settings:akka.persistence.cassandra.PluginSettings "Permalink")  val settings: PluginSettingsDefinition ClassesCassandraStatements
23. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#snapshotStatements:akka.persistence.cassandra.snapshot.CassandraSnapshotStatements "Permalink")  val snapshotStatements: CassandraSnapshotStatementsDefinition ClassesCassandraStatements
24. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/persistence/cassandra/KeyspaceAndTableStatements.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from CassandraStatements

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
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

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/KeyspaceAndTableStatements.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/KeyspaceAndTableStatements.html)*
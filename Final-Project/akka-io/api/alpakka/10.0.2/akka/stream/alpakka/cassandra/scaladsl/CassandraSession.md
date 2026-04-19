---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSession
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSession
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSession

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSession

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[cassandra](../index.html)
- [CassandraFlow](CassandraFlow$.html "Scala API to create Cassandra flows.")
- CassandraSession
- [CassandraSessionRegistry](CassandraSessionRegistry.html)
- [CassandraSource](CassandraSource$.html "Scala API.")
c[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[cassandra](../index.html).[scaladsl](index.html)

# CassandraSession[**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html "Permalink")

### 

#### final  class CassandraSession extends [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded)

Data Access Object for Cassandra. The statements are expressed in
[Apache Cassandra Query Language](https://cassandra.apache.org/doc/latest/cql/)
(CQL) syntax.

See even [CQL for Datastax Enterprise](https://docs.datastax.com/en/dse/6.7/cql/).

The `init` hook is called before the underlying session is used by other methods,
so it can be used for things like creating the keyspace and tables.

All methods are non\-blocking.

Source[CassandraSession.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.scala#L36)Linear Supertypes[NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraSession
2. NoSerializationVerificationNeeded
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#<init>(system:akka.actor.ActorSystem,sessionProvider:akka.stream.alpakka.cassandra.CqlSessionProvider,executionContext:scala.concurrent.ExecutionContext,log:akka.event.LoggingAdapter,metricsCategory:String,init:com.datastax.oss.driver.api.core.CqlSession=>scala.concurrent.Future[akka.Done],onClose:()=>Unit):akka.stream.alpakka.cassandra.scaladsl.CassandraSession "Permalink")  new CassandraSession(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), sessionProvider: [CqlSessionProvider](../CqlSessionProvider.html), executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), metricsCategory: String, init: ([CqlSession](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/CqlSession.html#com.datastax.oss.driver.api.core.CqlSession)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)], onClose: () \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))
### Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#close(executionContext:scala.concurrent.ExecutionContext):scala.concurrent.Future[akka.Done] "Permalink")  def close(executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Closes the underlying Cassandra session.

Closes the underlying Cassandra session.

executionContextwhen used after actor system termination, the a different execution context must be provided
7. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#executeDDL(stmt:String):scala.concurrent.Future[akka.Done] "Permalink")  def executeDDL(stmt: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Execute [CQL commands](https://docs.datastax.com/en/dse/6.7/cql/)
to manage database resources (create, replace, alter, and drop tables, indexes, user\-defined types, etc).

Execute [CQL commands](https://docs.datastax.com/en/dse/6.7/cql/)
to manage database resources (create, replace, alter, and drop tables, indexes, user\-defined types, etc).

The returned `Future` is completed when the command is done, or if the statement fails.
10. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#executeWrite(stmt:String,bindValues:AnyRef*):scala.concurrent.Future[akka.Done] "Permalink")  def executeWrite(stmt: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Prepare, bind and execute one statement in one go.

Prepare, bind and execute one statement in one go.

See [Inserting and updating data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/useInsertDataTOC.html).

The configured write consistency level is used.

The returned `Future` is completed when the statement has been
successfully executed, or if it fails.
11. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#executeWrite(stmt:com.datastax.oss.driver.api.core.cql.Statement[_]):scala.concurrent.Future[akka.Done] "Permalink")  def executeWrite(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Execute one statement.

Execute one statement. First you must `prepare` the
statement and bind its parameters.

See [Inserting and updating data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/useInsertDataTOC.html).

The configured write consistency level is used if a specific consistency
level has not been set on the `Statement`.

The returned `Future` is completed when the statement has been
successfully executed, or if it fails.
12. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#executeWriteBatch(batch:com.datastax.oss.driver.api.core.cql.BatchStatement):scala.concurrent.Future[akka.Done] "Permalink")  def executeWriteBatch(batch: [BatchStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BatchStatement.html#com.datastax.oss.driver.api.core.cql.BatchStatement)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Execute several statements in a batch.

Execute several statements in a batch. First you must `prepare` the
statements and bind its parameters.

See [Batching data insertion and updates](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/useBatchTOC.html).

The configured write consistency level is used if a specific consistency
level has not been set on the `BatchStatement`.

The returned `Future` is completed when the batch has been
successfully executed, or if it fails.
13. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
19. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#prepare(stmt:String):scala.concurrent.Future[com.datastax.oss.driver.api.core.cql.PreparedStatement] "Permalink")  def prepare(stmt: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[PreparedStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/PreparedStatement.html#com.datastax.oss.driver.api.core.cql.PreparedStatement)]Create a `PreparedStatement` that can be bound and used in
`executeWrite` or `select` multiple times.
20. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#select(stmt:String,bindValues:AnyRef*):akka.stream.scaladsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def select(stmt: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Prepare, bind and execute a select statement in one go.

Prepare, bind and execute a select statement in one go.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).

The configured read consistency level is used.

Note that you have to connect a `Sink` that consumes the messages from
this `Source` and then `run` the stream.
21. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#select(stmt:scala.concurrent.Future[com.datastax.oss.driver.api.core.cql.Statement[_]]):akka.stream.scaladsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def select(stmt: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]]): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Execute a select statement created by `prepare`.

Execute a select statement created by `prepare`.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).

The configured read consistency level is used if a specific consistency
level has not been set on the `Statement`.

Note that you have to connect a `Sink` that consumes the messages from
this `Source` and then `run` the stream.
22. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#select(stmt:com.datastax.oss.driver.api.core.cql.Statement[_]):akka.stream.scaladsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def select(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Execute a select statement.

Execute a select statement. First you must `prepare` the
statement and bind its parameters.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).

The configured read consistency level is used if a specific consistency
level has not been set on the `Statement`.

Note that you have to connect a `Sink` that consumes the messages from
this `Source` and then `run` the stream.
23. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#selectAll(stmt:String,bindValues:AnyRef*):scala.concurrent.Future[Seq[com.datastax.oss.driver.api.core.cql.Row]] "Permalink")  def selectAll(stmt: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row)]]Prepare, bind and execute a select statement in one go.

Prepare, bind and execute a select statement in one go. Only use this method
when you know that the result is small, e.g. includes a `LIMIT` clause.
Otherwise you should use the `select` method that returns a `Source`.

The configured read consistency level is used.

The returned `Future` is completed with the found rows.
24. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#selectAll(stmt:com.datastax.oss.driver.api.core.cql.Statement[_]):scala.concurrent.Future[Seq[com.datastax.oss.driver.api.core.cql.Row]] "Permalink")  def selectAll(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row)]]Execute a select statement.

Execute a select statement. First you must `prepare` the statement and
bind its parameters. Only use this method when you know that the result
is small, e.g. includes a `LIMIT` clause. Otherwise you should use the
`select` method that returns a `Source`.

The configured read consistency level is used if a specific consistency
level has not been set on the `Statement`.

The returned `Future` is completed with the found rows.
25. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#selectOne(stmt:String,bindValues:AnyRef*):scala.concurrent.Future[Option[com.datastax.oss.driver.api.core.cql.Row]] "Permalink")  def selectOne(stmt: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row)]]Prepare, bind and execute a select statement that returns one row.

Prepare, bind and execute a select statement that returns one row.

The configured read consistency level is used.

The returned `Future` is completed with the first row,
if any.
26. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#selectOne(stmt:com.datastax.oss.driver.api.core.cql.Statement[_]):scala.concurrent.Future[Option[com.datastax.oss.driver.api.core.cql.Row]] "Permalink")  def selectOne(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row)]]Execute a select statement that returns one row.

Execute a select statement that returns one row. First you must `prepare` the
statement and bind its parameters.

The configured read consistency level is used if a specific consistency
level has not been set on the `Statement`.

The returned `Future` is completed with the first row,
if any.
27. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#serverMetaData:scala.concurrent.Future[akka.stream.alpakka.cassandra.CassandraServerMetaData] "Permalink")  def serverMetaData: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[CassandraServerMetaData](../CassandraServerMetaData.html)]Meta data about the Cassandra server, such as its version.
28. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#underlying():scala.concurrent.Future[com.datastax.oss.driver.api.core.CqlSession] "Permalink")  def underlying(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[CqlSession](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/CqlSession.html#com.datastax.oss.driver.api.core.CqlSession)]The `Session` of the underlying
[Datastax Java Driver](https://docs.datastax.com/en/developer/java-driver/).

The `Session` of the underlying
[Datastax Java Driver](https://docs.datastax.com/en/developer/java-driver/).
Can be used in case you need to do something that is not provided by the
API exposed by this class. Be careful to not use blocking calls.
31. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraServerMetaData.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CqlSessionProvider.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html)*
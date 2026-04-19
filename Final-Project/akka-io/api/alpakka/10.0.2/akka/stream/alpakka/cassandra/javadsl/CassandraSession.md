---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl.CassandraSession
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/javadsl/CassandraSession.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl.CassandraSession
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl.CassandraSession

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl.CassandraSession

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[cassandra](../index.html)
- [CassandraFlow](CassandraFlow$.html "Java API to create Cassandra flows.")
- CassandraSession
- [CassandraSessionRegistry](CassandraSessionRegistry.html)
- [CassandraSource](CassandraSource$.html "Java API.")
c[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[cassandra](../index.html).[javadsl](index.html)

# CassandraSession[**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html "Permalink")

### 

#### final  class CassandraSession extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Data Access Object for Cassandra. The statements are expressed in
[Apache Cassandra Query Language](https://cassandra.apache.org/doc/latest/cql/)
(CQL) syntax.

See even [CQL for Datastax Enterprise](https://docs.datastax.com/en/dse/6.7/cql/).

The `init` hook is called before the underlying session is used by other methods,
so it can be used for things like creating the keyspace and tables.

All methods are non\-blocking.

Source[CassandraSession.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/javadsl/CassandraSession.scala#L43)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraSession
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#<init>(system:akka.actor.ClassicActorSystemProvider,sessionProvider:akka.stream.alpakka.cassandra.CqlSessionProvider,executionContext:scala.concurrent.ExecutionContext,log:akka.event.LoggingAdapter,metricsCategory:String,init:java.util.function.Function[com.datastax.oss.driver.api.core.CqlSession,java.util.concurrent.CompletionStage[akka.Done]],onClose:Runnable):akka.stream.alpakka.cassandra.javadsl.CassandraSession "Permalink")  new CassandraSession(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), sessionProvider: [CqlSessionProvider](../CqlSessionProvider.html), executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), metricsCategory: String, init: [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[CqlSession](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/CqlSession.html#com.datastax.oss.driver.api.core.CqlSession), [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]], onClose: [Runnable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))Use this constructor if you want to create a stand\-alone `CassandraSession`.
2. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#<init>(system:akka.actor.ActorSystem,sessionProvider:akka.stream.alpakka.cassandra.CqlSessionProvider,executionContext:scala.concurrent.ExecutionContext,log:akka.event.LoggingAdapter,metricsCategory:String,init:java.util.function.Function[com.datastax.oss.driver.api.core.CqlSession,java.util.concurrent.CompletionStage[akka.Done]],onClose:Runnable):akka.stream.alpakka.cassandra.javadsl.CassandraSession "Permalink")  new CassandraSession(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), sessionProvider: [CqlSessionProvider](../CqlSessionProvider.html), executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), metricsCategory: String, init: [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[CqlSession](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/CqlSession.html#com.datastax.oss.driver.api.core.CqlSession), [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]], onClose: [Runnable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))Use this constructor if you want to create a stand\-alone `CassandraSession`.
3. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#<init>(delegate:akka.stream.alpakka.cassandra.scaladsl.CassandraSession):akka.stream.alpakka.cassandra.javadsl.CassandraSession "Permalink")  new CassandraSession(delegate: [scaladsl.CassandraSession](../scaladsl/CassandraSession.html))
### Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#close(executor:java.util.concurrent.Executor):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def close(executor: [Executor](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Closes the underlying Cassandra session.

Closes the underlying Cassandra session.

executoras this might be used after actor system termination, the actor systems dispatcher can't be used
7. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#executeDDL(stmt:String):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def executeDDL(stmt: String): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Execute [CQL commands](https://docs.datastax.com/en/dse/6.7/cql/)
to manage database resources (create, replace, alter, and drop tables, indexes, user\-defined types, etc).

Execute [CQL commands](https://docs.datastax.com/en/dse/6.7/cql/)
to manage database resources (create, replace, alter, and drop tables, indexes, user\-defined types, etc).

The returned `CompletionStage` is completed when the command is done, or if the statement fails.
10. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#executeWrite(stmt:String,bindValues:AnyRef*):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def executeWrite(stmt: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Prepare, bind and execute one statement in one go.

Prepare, bind and execute one statement in one go.

See [Inserting and updating data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/useInsertDataTOC.html).

The configured write consistency level is used.

The returned `CompletionStage` is completed when the statement has been
successfully executed, or if it fails.

Annotations@varargs()
11. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#executeWrite(stmt:com.datastax.oss.driver.api.core.cql.Statement[_]):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def executeWrite(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Execute one statement.

Execute one statement. First you must `prepare` the
statement and bind its parameters.

See [Inserting and updating data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/useInsertDataTOC.html).

The configured write consistency level is used if a specific consistency
level has not been set on the `Statement`.

The returned `CompletionStage` is completed when the statement has been
successfully executed, or if it fails.
12. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#executeWriteBatch(batch:com.datastax.oss.driver.api.core.cql.BatchStatement):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def executeWriteBatch(batch: [BatchStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BatchStatement.html#com.datastax.oss.driver.api.core.cql.BatchStatement)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Execute several statements in a batch.

Execute several statements in a batch. First you must `prepare` the
statements and bind its parameters.

See [Batching data insertion and updates](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/useBatchTOC.html).

The configured write consistency level is used if a specific consistency
level has not been set on the `BatchStatement`.

The returned `CompletionStage` is completed when the batch has been
successfully executed, or if it fails.
13. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
19. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#prepare(stmt:String):java.util.concurrent.CompletionStage[com.datastax.oss.driver.api.core.cql.PreparedStatement] "Permalink")  def prepare(stmt: String): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[PreparedStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/PreparedStatement.html#com.datastax.oss.driver.api.core.cql.PreparedStatement)]Create a `PreparedStatement` that can be bound and used in
`executeWrite` or `select` multiple times.
20. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#select(stmt:String,bindValues:AnyRef*):akka.stream.javadsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def select(stmt: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Prepare, bind and execute a select statement in one go.

Prepare, bind and execute a select statement in one go.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).

The configured read consistency level is used.

Note that you have to connect a `Sink` that consumes the messages from
this `Source` and then `run` the stream.

Annotations@varargs()
21. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#select(stmt:java.util.concurrent.CompletionStage[com.datastax.oss.driver.api.core.cql.Statement[_]]):akka.stream.javadsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def select(stmt: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]]): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Execute a select statement.

Execute a select statement. First you must `prepare` the
statement and bind its parameters.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).

The configured read consistency level is used if a specific consistency
level has not been set on the `Statement`.

Note that you have to connect a `Sink` that consumes the messages from
this `Source` and then `run` the stream.
22. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#select(stmt:com.datastax.oss.driver.api.core.cql.Statement[_]):akka.stream.javadsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def select(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Execute a select statement.

Execute a select statement. First you must `prepare` the
statement and bind its parameters.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).

The configured read consistency level is used if a specific consistency
level has not been set on the `Statement`.

Note that you have to connect a `Sink` that consumes the messages from
this `Source` and then `run` the stream.
23. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#selectAll(stmt:String,bindValues:AnyRef*):java.util.concurrent.CompletionStage[java.util.List[com.datastax.oss.driver.api.core.cql.Row]] "Permalink")  def selectAll(stmt: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row)]]Prepare, bind and execute a select statement in one go.

Prepare, bind and execute a select statement in one go. Only use this method
when you know that the result is small, e.g. includes a `LIMIT` clause.
Otherwise you should use the `select` method that returns a `Source`.

The configured read consistency level is used.

The returned `CompletionStage` is completed with the found rows.

Annotations@varargs()
24. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#selectAll(stmt:com.datastax.oss.driver.api.core.cql.Statement[_]):java.util.concurrent.CompletionStage[java.util.List[com.datastax.oss.driver.api.core.cql.Row]] "Permalink")  def selectAll(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row)]]Execute a select statement.

Execute a select statement. First you must `prepare` the statement and
bind its parameters. Only use this method when you know that the result
is small, e.g. includes a `LIMIT` clause. Otherwise you should use the
`select` method that returns a `Source`.

The configured read consistency level is used if a specific consistency
level has not been set on the `Statement`.

The returned `CompletionStage` is completed with the found rows.
25. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#selectOne(stmt:String,bindValues:AnyRef*):java.util.concurrent.CompletionStage[java.util.Optional[com.datastax.oss.driver.api.core.cql.Row]] "Permalink")  def selectOne(stmt: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row)]]Prepare, bind and execute a select statement that returns one row.

Prepare, bind and execute a select statement that returns one row.

The configured read consistency level is used.

The returned `CompletionStage` is completed with the first row,
if any.

Annotations@varargs()
26. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#selectOne(stmt:com.datastax.oss.driver.api.core.cql.Statement[_]):java.util.concurrent.CompletionStage[java.util.Optional[com.datastax.oss.driver.api.core.cql.Row]] "Permalink")  def selectOne(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row)]]Execute a select statement that returns one row.

Execute a select statement that returns one row. First you must `prepare` the
statement and bind its parameters.

The configured read consistency level is used if a specific consistency
level has not been set on the `Statement`.

The returned `CompletionStage` is completed with the first row,
if any.
27. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#serverMetaData:java.util.concurrent.CompletionStage[akka.stream.alpakka.cassandra.CassandraServerMetaData] "Permalink")  def serverMetaData: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[CassandraServerMetaData](../CassandraServerMetaData.html)]Meta data about the Cassandra server, such as its version.
28. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#underlying():java.util.concurrent.CompletionStage[com.datastax.oss.driver.api.core.CqlSession] "Permalink")  def underlying(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[CqlSession](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/CqlSession.html#com.datastax.oss.driver.api.core.CqlSession)]The `Session` of the underlying
[Datastax Java Driver](https://docs.datastax.com/en/developer/java-driver/).

The `Session` of the underlying
[Datastax Java Driver](https://docs.datastax.com/en/developer/java-driver/).
Can be used in case you need to do something that is not provided by the
API exposed by this class. Be careful to not use blocking calls.
31. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraServerMetaData.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CqlSessionProvider.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSession.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSession.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSession.html)*
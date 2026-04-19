---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl.CassandraFlow
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl.CassandraFlow
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl.CassandraFlow

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl.CassandraFlow

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[cassandra](../index.html)
- CassandraFlow
- [CassandraSession](CassandraSession.html "Data Access Object for Cassandra.")
- [CassandraSessionRegistry](CassandraSessionRegistry.html)
- [CassandraSource](CassandraSource$.html "Java API.")
o[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[cassandra](../index.html).[javadsl](index.html)

# CassandraFlow[**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html "Permalink")

### 

#### object CassandraFlow

Java API to create Cassandra flows.

Source[CassandraFlow.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/javadsl/CassandraFlow.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraFlow
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#create[T](session:akka.stream.alpakka.cassandra.javadsl.CassandraSession,writeSettings:akka.stream.alpakka.cassandra.CassandraWriteSettings,cqlStatement:String,statementBinder:akka.japi.Function2[T,com.datastax.oss.driver.api.core.cql.PreparedStatement,com.datastax.oss.driver.api.core.cql.BoundStatement]):akka.stream.javadsl.Flow[T,T,akka.NotUsed] "Permalink")  def create\[T](session: [CassandraSession](CassandraSession.html), writeSettings: [CassandraWriteSettings](../CassandraWriteSettings.html), cqlStatement: String, statementBinder: [Function2](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function2.html#akka.japi.Function2)\[T, [PreparedStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/PreparedStatement.html#com.datastax.oss.driver.api.core.cql.PreparedStatement), [BoundStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BoundStatement.html#com.datastax.oss.driver.api.core.cql.BoundStatement)]): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[T, T, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]A flow writing to Cassandra for every stream element.

A flow writing to Cassandra for every stream element.
The element to be persisted is emitted unchanged.

Tstream element type

sessionCassandra session from `CassandraSessionRegistry`

writeSettingssettings to configure the write operation

cqlStatementraw CQL statement

statementBinderfunction to bind data from the stream element to the prepared statement
7. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#createUnloggedBatch[T,K](session:akka.stream.alpakka.cassandra.javadsl.CassandraSession,writeSettings:akka.stream.alpakka.cassandra.CassandraWriteSettings,cqlStatement:String,statementBinder:(T,com.datastax.oss.driver.api.core.cql.PreparedStatement)=>com.datastax.oss.driver.api.core.cql.BoundStatement,groupingKey:akka.japi.Function[T,K]):akka.stream.javadsl.Flow[T,T,akka.NotUsed] "Permalink")  def createUnloggedBatch\[T, K](session: [CassandraSession](CassandraSession.html), writeSettings: [CassandraWriteSettings](../CassandraWriteSettings.html), cqlStatement: String, statementBinder: (T, [PreparedStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/PreparedStatement.html#com.datastax.oss.driver.api.core.cql.PreparedStatement)) \=\> [BoundStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BoundStatement.html#com.datastax.oss.driver.api.core.cql.BoundStatement), groupingKey: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function.html#akka.japi.Function)\[T, K]): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[T, T, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Creates a flow that uses [com.datastax.oss.driver.api.core.cql.BatchStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BatchStatement.html) and groups the
elements internally into batches using the `writeSettings` and per `groupingKey`.

Creates a flow that uses [com.datastax.oss.driver.api.core.cql.BatchStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BatchStatement.html) and groups the
elements internally into batches using the `writeSettings` and per `groupingKey`.
Use this when most of the elements in the stream share the same partition key.

Cassandra batches that share the same partition key will only
resolve to one write internally in Cassandra, boosting write performance.

"A LOGGED batch to a single partition will be converted to an UNLOGGED batch as an optimization."
([Batch CQL](https://cassandra.apache.org/doc/latest/cql/dml.html#batch))

Be aware that this stage does NOT preserve the upstream order.

Tstream element type

Kextracted key type for grouping into batches

sessionimplicit Cassandra session from `CassandraSessionRegistry`

writeSettingssettings to configure the batching and the write operation

cqlStatementraw CQL statement

statementBinderfunction to bind data from the stream element to the prepared statement

groupingKeygroups the elements to go into the same batch
8. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#withContext[T,Ctx](session:akka.stream.alpakka.cassandra.javadsl.CassandraSession,writeSettings:akka.stream.alpakka.cassandra.CassandraWriteSettings,cqlStatement:String,statementBinder:akka.japi.Function2[T,com.datastax.oss.driver.api.core.cql.PreparedStatement,com.datastax.oss.driver.api.core.cql.BoundStatement]):akka.stream.javadsl.FlowWithContext[T,Ctx,T,Ctx,akka.NotUsed] "Permalink")  def withContext\[T, Ctx](session: [CassandraSession](CassandraSession.html), writeSettings: [CassandraWriteSettings](../CassandraWriteSettings.html), cqlStatement: String, statementBinder: [Function2](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function2.html#akka.japi.Function2)\[T, [PreparedStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/PreparedStatement.html#com.datastax.oss.driver.api.core.cql.PreparedStatement), [BoundStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BoundStatement.html#com.datastax.oss.driver.api.core.cql.BoundStatement)]): [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/FlowWithContext.html#akka.stream.javadsl.FlowWithContext)\[T, Ctx, T, Ctx, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]A flow writing to Cassandra for every stream element, passing context along.

A flow writing to Cassandra for every stream element, passing context along.
The element (to be persisted) and the context are emitted unchanged.

Tstream element type

Ctxcontext type

sessionCassandra session from `CassandraSessionRegistry`

writeSettingssettings to configure the write operation

cqlStatementraw CQL statement

statementBinderfunction to bind data from the stream element to the prepared statement
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function2.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraWriteSettings.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSession.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html)*
---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraFlow
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraFlow
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraFlow

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraFlow

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[cassandra](../index.html)
- CassandraFlow
- [CassandraSession](CassandraSession.html "Data Access Object for Cassandra.")
- [CassandraSessionRegistry](CassandraSessionRegistry.html)
- [CassandraSource](CassandraSource$.html "Scala API.")
o[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[cassandra](../index.html).[scaladsl](index.html)

# CassandraFlow[**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html "Permalink")

### 

#### object CassandraFlow

Scala API to create Cassandra flows.

Source[CassandraFlow.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/scaladsl/CassandraFlow.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#create[T](writeSettings:akka.stream.alpakka.cassandra.CassandraWriteSettings,cqlStatement:String,statementBinder:(T,com.datastax.oss.driver.api.core.cql.PreparedStatement)=>com.datastax.oss.driver.api.core.cql.BoundStatement)(implicitsession:akka.stream.alpakka.cassandra.scaladsl.CassandraSession):akka.stream.scaladsl.Flow[T,T,akka.NotUsed] "Permalink")  def create\[T](writeSettings: [CassandraWriteSettings](../CassandraWriteSettings.html), cqlStatement: String, statementBinder: (T, [PreparedStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/PreparedStatement.html#com.datastax.oss.driver.api.core.cql.PreparedStatement)) \=\> [BoundStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BoundStatement.html#com.datastax.oss.driver.api.core.cql.BoundStatement))(implicit session: [CassandraSession](CassandraSession.html)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[T, T, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]A flow writing to Cassandra for every stream element.

A flow writing to Cassandra for every stream element.
The element to be persisted is emitted unchanged.

Tstream element type

writeSettingssettings to configure the write operation

cqlStatementraw CQL statement

statementBinderfunction to bind data from the stream element to the prepared statement

sessionimplicit Cassandra session from `CassandraSessionRegistry`
7. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#createBatch[T,K](writeSettings:akka.stream.alpakka.cassandra.CassandraWriteSettings,cqlStatement:String,statementBinder:(T,com.datastax.oss.driver.api.core.cql.PreparedStatement)=>com.datastax.oss.driver.api.core.cql.BoundStatement,groupingKey:T=>K)(implicitsession:akka.stream.alpakka.cassandra.scaladsl.CassandraSession):akka.stream.scaladsl.Flow[T,T,akka.NotUsed] "Permalink")  def createBatch\[T, K](writeSettings: [CassandraWriteSettings](../CassandraWriteSettings.html), cqlStatement: String, statementBinder: (T, [PreparedStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/PreparedStatement.html#com.datastax.oss.driver.api.core.cql.PreparedStatement)) \=\> [BoundStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BoundStatement.html#com.datastax.oss.driver.api.core.cql.BoundStatement), groupingKey: (T) \=\> K)(implicit session: [CassandraSession](CassandraSession.html)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[T, T, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Creates a flow that uses [com.datastax.oss.driver.api.core.cql.BatchStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BatchStatement.html) and groups the
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

writeSettingssettings to configure the batching and the write operation

cqlStatementraw CQL statement

statementBinderfunction to bind data from the stream element to the prepared statement

groupingKeygroups the elements to go into the same batch

sessionimplicit Cassandra session from `CassandraSessionRegistry`
8. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#withContext[T,Ctx](writeSettings:akka.stream.alpakka.cassandra.CassandraWriteSettings,cqlStatement:String,statementBinder:(T,com.datastax.oss.driver.api.core.cql.PreparedStatement)=>com.datastax.oss.driver.api.core.cql.BoundStatement)(implicitsession:akka.stream.alpakka.cassandra.scaladsl.CassandraSession):akka.stream.scaladsl.FlowWithContext[T,Ctx,T,Ctx,akka.NotUsed] "Permalink")  def withContext\[T, Ctx](writeSettings: [CassandraWriteSettings](../CassandraWriteSettings.html), cqlStatement: String, statementBinder: (T, [PreparedStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/PreparedStatement.html#com.datastax.oss.driver.api.core.cql.PreparedStatement)) \=\> [BoundStatement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BoundStatement.html#com.datastax.oss.driver.api.core.cql.BoundStatement))(implicit session: [CassandraSession](CassandraSession.html)): [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/FlowWithContext.html#akka.stream.scaladsl.FlowWithContext)\[T, Ctx, T, Ctx, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]A flow writing to Cassandra for every stream element, passing context along.

A flow writing to Cassandra for every stream element, passing context along.
The element (to be persisted) and the context are emitted unchanged.

Tstream element type

Ctxcontext type

writeSettingssettings to configure the write operation

cqlStatementraw CQL statement

statementBinderfunction to bind data from the stream element to the prepared statement

sessionimplicit Cassandra session from `CassandraSessionRegistry`
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraWriteSettings.html
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
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html)*
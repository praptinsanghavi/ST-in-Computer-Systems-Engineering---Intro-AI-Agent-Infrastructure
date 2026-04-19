---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.CassandraWriteSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:22:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/CassandraWriteSettings.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.CassandraWriteSettings
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.CassandraWriteSettings

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.CassandraWriteSettings

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/stream/index.html "Permalink")  package [stream](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../index.html)Definition Classes[stream](../../index.html)
- [**](../../../../akka/stream/alpakka/cassandra/index.html "Permalink")  package [cassandra](index.html)Definition Classes[alpakka](../index.html)
- [**](../../../../akka/stream/alpakka/cassandra/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[cassandra](index.html)
- [**](../../../../akka/stream/alpakka/cassandra/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[cassandra](index.html)
- [CassandraMetricsRegistry](CassandraMetricsRegistry.html "Retrieves Cassandra metrics registry for an actor system")
- [CassandraServerMetaData](CassandraServerMetaData.html)
- [CassandraSessionSettings](CassandraSessionSettings.html)
- CassandraWriteSettings
- [CqlSessionProvider](CqlSessionProvider.html "The implementation of the SessionProvider is used for creating the Cassandra Session.")
- [DefaultSessionProvider](DefaultSessionProvider.html "Builds a CqlSession from the given config via DriverConfigLoaderFromConfig.")
- [DriverConfigLoaderFromConfig](DriverConfigLoaderFromConfig.html "DriverConfigLoader that reads the settings of the Cassandra driver from a given Config.")
[c](CassandraWriteSettings$.html "See companion object")[akka](../../../index.html).[stream](../../index.html).[alpakka](../index.html).[cassandra](index.html)

# [CassandraWriteSettings](CassandraWriteSettings$.html "See companion object")[**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html "Permalink")

### Companion [object CassandraWriteSettings](CassandraWriteSettings$.html "See companion object")

#### class CassandraWriteSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[CassandraWriteSettings.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/CassandraWriteSettings.scala#L12)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraWriteSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#batchType:com.datastax.oss.driver.api.core.cql.BatchType "Permalink")  val batchType: [BatchType](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BatchType.html#com.datastax.oss.driver.api.core.cql.BatchType)
6. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#maxBatchSize:Int "Permalink")  val maxBatchSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
13. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#maxBatchWait:scala.concurrent.duration.FiniteDuration "Permalink")  val maxBatchWait: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
14. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#parallelism:Int "Permalink")  val parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
18. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#toString():String "Permalink")  def toString(): StringDefinition ClassesCassandraWriteSettings → AnyRef → Any
20. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#withBatchType(value:com.datastax.oss.driver.api.core.cql.BatchType):akka.stream.alpakka.cassandra.CassandraWriteSettings "Permalink")  def withBatchType(value: [BatchType](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/BatchType.html#com.datastax.oss.driver.api.core.cql.BatchType)): CassandraWriteSettings
24. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#withMaxBatchSize(maxBatchSize:Int):akka.stream.alpakka.cassandra.CassandraWriteSettings "Permalink")  def withMaxBatchSize(maxBatchSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): CassandraWriteSettingsBatch size for `CassandraFlow.createUnloggedBatch`.
25. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#withMaxBatchWait(maxBatchWait:java.time.Duration):akka.stream.alpakka.cassandra.CassandraWriteSettings "Permalink")  def withMaxBatchWait(maxBatchWait: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): CassandraWriteSettingsJava API: Batch grouping time for `CassandraFlow.createUnloggedBatch`.
26. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#withMaxBatchWait(maxBatchWait:scala.concurrent.duration.FiniteDuration):akka.stream.alpakka.cassandra.CassandraWriteSettings "Permalink")  def withMaxBatchWait(maxBatchWait: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): CassandraWriteSettingsBatch grouping time for `CassandraFlow.createUnloggedBatch`.
27. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#withParallelism(value:Int):akka.stream.alpakka.cassandra.CassandraWriteSettings "Permalink")  def withParallelism(value: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): CassandraWriteSettingsWARNING: setting a write parallelism other than 1 will lead to out\-of\-order updates
### Deprecated Value Members

1. [**](../../../../akka/stream/alpakka/cassandra/CassandraWriteSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraMetricsRegistry.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraServerMetaData.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraWriteSettings$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraWriteSettings.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CqlSessionProvider$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CqlSessionProvider.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DefaultSessionProvider.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DriverConfigLoaderFromConfig$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DriverConfigLoaderFromConfig.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraWriteSettings.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraWriteSettings.html)*
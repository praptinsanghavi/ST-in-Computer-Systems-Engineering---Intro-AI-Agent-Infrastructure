---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.CassandraMetricsRegistry
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:22:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.CassandraMetricsRegistry
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.CassandraMetricsRegistry

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.CassandraMetricsRegistry

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
- [CassandraWriteSettings](CassandraWriteSettings.html)
- [CqlSessionProvider](CqlSessionProvider.html "The implementation of the SessionProvider is used for creating the Cassandra Session.")
- [DefaultSessionProvider](DefaultSessionProvider.html "Builds a CqlSession from the given config via DriverConfigLoaderFromConfig.")
- [DriverConfigLoaderFromConfig](DriverConfigLoaderFromConfig.html "DriverConfigLoader that reads the settings of the Cassandra driver from a given Config.")
[o](CassandraMetricsRegistry.html "See companion class")[akka](../../../index.html).[stream](../../index.html).[alpakka](../index.html).[cassandra](index.html)

# [CassandraMetricsRegistry](CassandraMetricsRegistry.html "See companion class")[**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html "Permalink")

### Companion [class CassandraMetricsRegistry](CassandraMetricsRegistry.html "See companion class")

#### object CassandraMetricsRegistry extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[CassandraMetricsRegistry](CassandraMetricsRegistry.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)

Source[CassandraMetricsRegistry.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/CassandraMetricsRegistry.scala#L37)Linear Supertypes[ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider), [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[CassandraMetricsRegistry](CassandraMetricsRegistry.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraMetricsRegistry
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CassandraMetricsRegistry](CassandraMetricsRegistry.html)Definition ClassesExtensionId
5. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [CassandraMetricsRegistry](CassandraMetricsRegistry.html)Definition ClassesExtensionId
6. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.stream.alpakka.cassandra.CassandraMetricsRegistry "Permalink")  def createExtension(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem)): [CassandraMetricsRegistry](CassandraMetricsRegistry.html)Definition ClassesCassandraMetricsRegistry → ExtensionId
9. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesExtensionId → AnyRef → Any
11. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.stream.alpakka.cassandra.CassandraMetricsRegistry "Permalink")  def get(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CassandraMetricsRegistry](CassandraMetricsRegistry.html)Java API.

Java API.
Get the CassandraMetricsRegistry extension with the classic actors API.

Definition ClassesCassandraMetricsRegistry → ExtensionId
12. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#get(system:akka.actor.ActorSystem):akka.stream.alpakka.cassandra.CassandraMetricsRegistry "Permalink")  def get(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [CassandraMetricsRegistry](CassandraMetricsRegistry.html)Java API.

Java API.
Get the CassandraMetricsRegistry extension with the classic actors API.

Definition ClassesCassandraMetricsRegistry → ExtensionId
13. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesExtensionId → AnyRef → Any
15. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#lookup:akka.stream.alpakka.cassandra.CassandraMetricsRegistry.type "Permalink")  def lookup: CassandraMetricsRegistryDefinition ClassesCassandraMetricsRegistry → ExtensionIdProvider
17. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
19. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
20. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)

### Inherited from [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[CassandraMetricsRegistry](CassandraMetricsRegistry.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
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
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraMetricsRegistry$.html)*
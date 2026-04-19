---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[cassandra](../index.html)
- [CassandraFlow](CassandraFlow$.html "Scala API to create Cassandra flows.")
- [CassandraSession](CassandraSession.html "Data Access Object for Cassandra.")
- [CassandraSessionRegistry](CassandraSessionRegistry.html)
- [CassandraSource](CassandraSource$.html "Scala API.")
[o](CassandraSessionRegistry.html "See companion class")[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[cassandra](../index.html).[scaladsl](index.html)

# [CassandraSessionRegistry](CassandraSessionRegistry.html "See companion class")[**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html "Permalink")

### Companion [class CassandraSessionRegistry](CassandraSessionRegistry.html "See companion class")

#### object CassandraSessionRegistry extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[CassandraSessionRegistry](CassandraSessionRegistry.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)

This Cassandra session registry makes it possible to share Cassandra sessions between multiple use sites
in the same `ActorSystem` (important for the Cassandra Akka Persistence plugin where it is shared between journal,
query plugin and snapshot plugin)

Source[CassandraSessionRegistry.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.scala#L25)Linear Supertypes[ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider), [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[CassandraSessionRegistry](CassandraSessionRegistry.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraSessionRegistry
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CassandraSessionRegistry](CassandraSessionRegistry.html)Definition ClassesExtensionId
5. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [CassandraSessionRegistry](CassandraSessionRegistry.html)Definition ClassesExtensionId
6. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#createExtension(system:akka.actor.ClassicActorSystemProvider):akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry "Permalink")  def createExtension(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CassandraSessionRegistry](CassandraSessionRegistry.html)
9. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry "Permalink")  def createExtension(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem)): [CassandraSessionRegistry](CassandraSessionRegistry.html)Definition ClassesCassandraSessionRegistry → ExtensionId
10. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesExtensionId → AnyRef → Any
12. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#get(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def get(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CassandraSessionRegistry](CassandraSessionRegistry.html)Definition ClassesExtensionId
13. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#get(system:akka.actor.ActorSystem):T "Permalink")  def get(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [CassandraSessionRegistry](CassandraSessionRegistry.html)Definition ClassesExtensionId
14. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesExtensionId → AnyRef → Any
16. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#lookup:akka.actor.ExtensionId[akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry] "Permalink")  def lookup: [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[CassandraSessionRegistry](CassandraSessionRegistry.html)]Definition ClassesCassandraSessionRegistry → ExtensionIdProvider
18. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
20. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
21. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)

### Inherited from [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[CassandraSessionRegistry](CassandraSessionRegistry.html)]

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
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html)*
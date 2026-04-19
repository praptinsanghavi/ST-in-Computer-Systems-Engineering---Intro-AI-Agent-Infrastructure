---
description: Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:22:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html
title: Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy
---

# Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/external/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[external](index.html)
- [**](../../../../akka/cluster/sharding/external/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[external](index.html)
- [ClientTimeoutException](ClientTimeoutException.html)
- [ExternalShardAllocation](ExternalShardAllocation.html)
- [ExternalShardAllocationStrategy](ExternalShardAllocationStrategy.html)
- [ShardLocations](ShardLocations.html)
[o](ExternalShardAllocationStrategy.html "See companion class")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[external](index.html)

# [ExternalShardAllocationStrategy](ExternalShardAllocationStrategy.html "See companion class")[**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html "Permalink")

### Companion [class ExternalShardAllocationStrategy](ExternalShardAllocationStrategy.html "See companion class")

#### object ExternalShardAllocationStrategy

Source[ExternalShardAllocationStrategy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/external/ExternalShardAllocationStrategy.scala#L33)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExternalShardAllocationStrategy
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html "Permalink") final  case class [ShardLocation](ExternalShardAllocationStrategy$$ShardLocation.html)(address: [Address](../../../actor/Address.html)) extends [NoSerializationVerificationNeeded](../../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#ShardRegion=akka.actor.ActorRef "Permalink")  type ShardRegion \= [ActorRef](../../../actor/ActorRef.html)
### Value Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#apply(systemProvider:akka.actor.ClassicActorSystemProvider,typeName:String):akka.cluster.sharding.external.ExternalShardAllocationStrategy "Permalink")  def apply(systemProvider: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html), typeName: String): [ExternalShardAllocationStrategy](ExternalShardAllocationStrategy.html)Scala API
5. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#create(systemProvider:akka.actor.ClassicActorSystemProvider,typeName:String):akka.cluster.sharding.external.ExternalShardAllocationStrategy "Permalink")  def create(systemProvider: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html), typeName: String): [ExternalShardAllocationStrategy](ExternalShardAllocationStrategy.html)Java API
8. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ClientTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ShardLocations.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html)*
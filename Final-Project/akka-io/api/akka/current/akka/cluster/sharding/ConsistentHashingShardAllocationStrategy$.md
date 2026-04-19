---
description: Akka 2.10.17 - akka.cluster.sharding.ConsistentHashingShardAllocationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
title: Akka 2.10.17 - akka.cluster.sharding.ConsistentHashingShardAllocationStrategy
---

# Akka 2.10.17 - akka.cluster.sharding.ConsistentHashingShardAllocationStrategy

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ConsistentHashingShardAllocationStrategy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](external/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[sharding](index.html)
- [ClusterSharding](ClusterSharding.html)
- [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "INTERNAL API (ctr)")
- [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html)
- [ClusterShardingSerializable](ClusterShardingSerializable.html "Marker trait for remote messages and persistent events/snapshots with special serializer.")
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy that is using consistent hashing.")
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
[o](ConsistentHashingShardAllocationStrategy.html "See companion class")[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "See companion class")[**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html "Permalink")

### Companion [class ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "See companion class")

#### object ConsistentHashingShardAllocationStrategy

Source[ConsistentHashingShardAllocationStrategy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsistentHashingShardAllocationStrategy
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html)*
---
description: Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSerializable
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:22:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ClusterShardingSerializable.html
title: Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSerializable
---

# Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSerializable

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSerializable

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
- ClusterShardingSerializable
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy that is using consistent hashing.")
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
t[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# ClusterShardingSerializable[**](../../../akka/cluster/sharding/ClusterShardingSerializable.html "Permalink")

### 

#### trait ClusterShardingSerializable extends Serializable

Marker trait for remote messages and persistent events/snapshots with special serializer.

Source[ClusterShardingSerializable.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ClusterShardingSerializable.scala#L10)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ClusterShardingStats](ShardRegion$$ClusterShardingStats.html), [CurrentRegions](ShardRegion$$CurrentRegions.html), [CurrentShardRegionState](ShardRegion$$CurrentShardRegionState.html), [GetClusterShardingStats](ShardRegion$$GetClusterShardingStats.html), [GetCurrentRegions](ShardRegion$$GetCurrentRegions$.html), [GetShardRegionState](ShardRegion$$GetShardRegionState$.html), [GetShardRegionStats](ShardRegion$$GetShardRegionStats$.html), [ShardRegionStats](ShardRegion$$ShardRegionStats.html), [StartEntity](ShardRegion$$StartEntity.html), [StartEntityAck](ShardRegion$$StartEntityAck.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterShardingSerializable
2. Serializable
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterShardingSerializable toany2stringadd\[ClusterShardingSerializable] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterShardingSerializable, B)ImplicitThis member is added by an implicit conversion from ClusterShardingSerializable toArrowAssoc\[ClusterShardingSerializable] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterShardingSerializable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingSerializableImplicitThis member is added by an implicit conversion from ClusterShardingSerializable toEnsuring\[ClusterShardingSerializable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterShardingSerializable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingSerializableImplicitThis member is added by an implicit conversion from ClusterShardingSerializable toEnsuring\[ClusterShardingSerializable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingSerializableImplicitThis member is added by an implicit conversion from ClusterShardingSerializable toEnsuring\[ClusterShardingSerializable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingSerializableImplicitThis member is added by an implicit conversion from ClusterShardingSerializable toEnsuring\[ClusterShardingSerializable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterShardingSerializable toStringFormat\[ClusterShardingSerializable] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterShardingSerializable, B)ImplicitThis member is added by an implicit conversion from ClusterShardingSerializable toArrowAssoc\[ClusterShardingSerializable] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterShardingSerializable to any2stringadd\[ClusterShardingSerializable]

### Inherited by implicit conversion StringFormat fromClusterShardingSerializable to StringFormat\[ClusterShardingSerializable]

### Inherited by implicit conversion Ensuring fromClusterShardingSerializable to Ensuring\[ClusterShardingSerializable]

### Inherited by implicit conversion ArrowAssoc fromClusterShardingSerializable to ArrowAssoc\[ClusterShardingSerializable]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$CurrentRegions.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GetClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GetCurrentRegions$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GetShardRegionState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GetShardRegionStats$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ShardRegionStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$StartEntity.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$StartEntityAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSerializable.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSerializable.html)*
---
description: Akka 2.10.17 - akka.cluster.sharding.JoinConfigCompatCheckSharding
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:22:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
title: Akka 2.10.17 - akka.cluster.sharding.JoinConfigCompatCheckSharding
---

# Akka 2.10.17 - akka.cluster.sharding.JoinConfigCompatCheckSharding

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.JoinConfigCompatCheckSharding

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
- JoinConfigCompatCheckSharding
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
c[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# JoinConfigCompatCheckSharding[**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html "Permalink")

### 

#### final  class JoinConfigCompatCheckSharding extends [JoinConfigCompatChecker](../JoinConfigCompatChecker.html)

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)() Source[JoinConfigCompatCheckSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/JoinConfigCompatCheckSharding.scala#L18)Linear Supertypes[JoinConfigCompatChecker](../JoinConfigCompatChecker.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JoinConfigCompatCheckSharding
2. JoinConfigCompatChecker
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
### Instance Constructors

1. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#<init>():akka.cluster.sharding.JoinConfigCompatCheckSharding "Permalink")  new JoinConfigCompatCheckSharding()
### Value Members

1. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JoinConfigCompatCheckSharding toany2stringadd\[JoinConfigCompatCheckSharding] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JoinConfigCompatCheckSharding, B)ImplicitThis member is added by an implicit conversion from JoinConfigCompatCheckSharding toArrowAssoc\[JoinConfigCompatCheckSharding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#check(toCheck:com.typesafe.config.Config,actualConfig:com.typesafe.config.Config):akka.cluster.ConfigValidation "Permalink")  def check(toCheck: Config, actualConfig: Config): [ConfigValidation](../ConfigValidation.html)Runs the Config check.

Runs the Config check.

Implementers are free to define what makes Config entry compatible or not.
We do provide some pre\-build checks tough: [JoinConfigCompatChecker.exists](../JoinConfigCompatChecker$.html#exists(requiredKeys:Seq[String],toCheck:com.typesafe.config.Config):akka.cluster.ConfigValidation) and [JoinConfigCompatChecker.fullMatch](../JoinConfigCompatChecker$.html#fullMatch(requiredKeys:Seq[String],toCheck:com.typesafe.config.Config,actualConfig:com.typesafe.config.Config):akka.cluster.ConfigValidation)

toCheck\- the Config instance to be checked

actualConfig\- the Config instance containing the actual values

returnsa [ConfigValidation](../ConfigValidation.html). Can be [Valid](../Valid$.html) or [Invalid](../Invalid.html), the later must contain a descriptive list of error messages.

Definition ClassesJoinConfigCompatCheckSharding → [JoinConfigCompatChecker](../JoinConfigCompatChecker.html)
8. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JoinConfigCompatCheckSharding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JoinConfigCompatCheckShardingImplicitThis member is added by an implicit conversion from JoinConfigCompatCheckSharding toEnsuring\[JoinConfigCompatCheckSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JoinConfigCompatCheckSharding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JoinConfigCompatCheckShardingImplicitThis member is added by an implicit conversion from JoinConfigCompatCheckSharding toEnsuring\[JoinConfigCompatCheckSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JoinConfigCompatCheckShardingImplicitThis member is added by an implicit conversion from JoinConfigCompatCheckSharding toEnsuring\[JoinConfigCompatCheckSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JoinConfigCompatCheckShardingImplicitThis member is added by an implicit conversion from JoinConfigCompatCheckSharding toEnsuring\[JoinConfigCompatCheckSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#requiredKeys:Seq[String] "Permalink")  def requiredKeys: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]The configuration keys that are required for this checker

The configuration keys that are required for this checker

Definition ClassesJoinConfigCompatCheckSharding → [JoinConfigCompatChecker](../JoinConfigCompatChecker.html)
22. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JoinConfigCompatCheckSharding toStringFormat\[JoinConfigCompatCheckSharding] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JoinConfigCompatCheckSharding, B)ImplicitThis member is added by an implicit conversion from JoinConfigCompatCheckSharding toArrowAssoc\[JoinConfigCompatCheckSharding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [JoinConfigCompatChecker](../JoinConfigCompatChecker.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromJoinConfigCompatCheckSharding to any2stringadd\[JoinConfigCompatCheckSharding]

### Inherited by implicit conversion StringFormat fromJoinConfigCompatCheckSharding to StringFormat\[JoinConfigCompatCheckSharding]

### Inherited by implicit conversion Ensuring fromJoinConfigCompatCheckSharding to Ensuring\[JoinConfigCompatCheckSharding]

### Inherited by implicit conversion ArrowAssoc fromJoinConfigCompatCheckSharding to ArrowAssoc\[JoinConfigCompatCheckSharding]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ConfigValidation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Invalid.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Valid$.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/JoinConfigCompatCheckSharding.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/JoinConfigCompatCheckSharding.html)*
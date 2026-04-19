---
description: Akka 2.10.17 - akka.cluster.sharding.external.scaladsl.ExternalShardAllocationClient
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:22:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html
title: Akka 2.10.17 - akka.cluster.sharding.external.scaladsl.ExternalShardAllocationClient
---

# Akka 2.10.17 - akka.cluster.sharding.external.scaladsl.ExternalShardAllocationClient

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.external.scaladsl.ExternalShardAllocationClient

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/external/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[external](../index.html)
- ExternalShardAllocationClient
t[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[external](../index.html).[scaladsl](index.html)

# ExternalShardAllocationClient[**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html "Permalink")

### 

#### trait ExternalShardAllocationClient extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Not for user extension

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[ExternalShardAllocationClient.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExternalShardAllocationClient
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#shardLocations():scala.concurrent.Future[akka.cluster.sharding.external.ShardLocations] "Permalink") abstract  def shardLocations(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ShardLocations](../ShardLocations.html)]Get all the current shard locations that have been set via updateShardLocation
2. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#updateShardLocation(shard:akka.cluster.sharding.ShardRegion.ShardId,location:akka.actor.Address):scala.concurrent.Future[akka.Done] "Permalink") abstract  def updateShardLocation(shard: [ShardId](../../ShardRegion$.html#ShardId=String), location: [Address](../../../../actor/Address.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../../../Done.html)]Update the given shard's location.

Update the given shard's location. The Address should
match one of the nodes in the cluster. If the node has not joined
the cluster yet it will be moved to that node after the first cluster
sharding rebalance it does.

shardThe shard identifier

locationLocation (akka node) to allocate the shard to

returnsConfirmation that the update has been propagated to a majority of cluster nodes
3. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#updateShardLocations(locations:Map[akka.cluster.sharding.ShardRegion.ShardId,akka.actor.Address]):scala.concurrent.Future[akka.Done] "Permalink") abstract  def updateShardLocations(locations: Map\[[ShardId](../../ShardRegion$.html#ShardId=String), [Address](../../../../actor/Address.html)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../../../Done.html)]Update all of the provided ShardLocations.

Update all of the provided ShardLocations.
The Address should match one of the nodes in the cluster. If the node has not joined
the cluster yet it will be moved to that node after the first cluster
sharding rebalance it does.

locationsto update

returnsConfirmation that the update has been propagates to a majority of cluster nodes
### Concrete Value Members

1. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ExternalShardAllocationClient toany2stringadd\[ExternalShardAllocationClient] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ExternalShardAllocationClient, B)ImplicitThis member is added by an implicit conversion from ExternalShardAllocationClient toArrowAssoc\[ExternalShardAllocationClient] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ExternalShardAllocationClient) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExternalShardAllocationClientImplicitThis member is added by an implicit conversion from ExternalShardAllocationClient toEnsuring\[ExternalShardAllocationClient] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ExternalShardAllocationClient) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExternalShardAllocationClientImplicitThis member is added by an implicit conversion from ExternalShardAllocationClient toEnsuring\[ExternalShardAllocationClient] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExternalShardAllocationClientImplicitThis member is added by an implicit conversion from ExternalShardAllocationClient toEnsuring\[ExternalShardAllocationClient] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExternalShardAllocationClientImplicitThis member is added by an implicit conversion from ExternalShardAllocationClient toEnsuring\[ExternalShardAllocationClient] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ExternalShardAllocationClient toStringFormat\[ExternalShardAllocationClient] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ExternalShardAllocationClient, B)ImplicitThis member is added by an implicit conversion from ExternalShardAllocationClient toArrowAssoc\[ExternalShardAllocationClient] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromExternalShardAllocationClient to any2stringadd\[ExternalShardAllocationClient]

### Inherited by implicit conversion StringFormat fromExternalShardAllocationClient to StringFormat\[ExternalShardAllocationClient]

### Inherited by implicit conversion Ensuring fromExternalShardAllocationClient to Ensuring\[ExternalShardAllocationClient]

### Inherited by implicit conversion ArrowAssoc fromExternalShardAllocationClient to ArrowAssoc\[ExternalShardAllocationClient]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ShardLocations.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html)*
---
description: Akka 2.10.17 - akka.cluster.sharding.external.ShardLocations
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/external/ShardLocations.html
title: Akka 2.10.17 - akka.cluster.sharding.external.ShardLocations
---

# Akka 2.10.17 - akka.cluster.sharding.external.ShardLocations

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.external.ShardLocations

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
- ShardLocations
c[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[external](index.html)

# ShardLocations[**](../../../../akka/cluster/sharding/external/ShardLocations.html "Permalink")

### 

#### final  class ShardLocations extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ShardLocations.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/external/ShardLocations.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardLocations
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
### Instance Constructors

1. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#<init>(locations:Map[akka.cluster.sharding.ShardRegion.ShardId,akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation]):akka.cluster.sharding.external.ShardLocations "Permalink")  new ShardLocations(locations: Map\[[ShardId](../ShardRegion$.html#ShardId=String), [ShardLocation](ExternalShardAllocationStrategy$$ShardLocation.html)])
### Value Members

1. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/external/ShardLocations.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardLocations toany2stringadd\[ShardLocations] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardLocations, B)ImplicitThis member is added by an implicit conversion from ShardLocations toArrowAssoc\[ShardLocations] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardLocations) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardLocationsImplicitThis member is added by an implicit conversion from ShardLocations toEnsuring\[ShardLocations] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardLocations) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardLocationsImplicitThis member is added by an implicit conversion from ShardLocations toEnsuring\[ShardLocations] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardLocationsImplicitThis member is added by an implicit conversion from ShardLocations toEnsuring\[ShardLocations] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardLocationsImplicitThis member is added by an implicit conversion from ShardLocations toEnsuring\[ShardLocations] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#getShardLocations():java.util.Map[akka.cluster.sharding.ShardRegion.ShardId,akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation] "Permalink")  def getShardLocations(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[ShardId](../ShardRegion$.html#ShardId=String), [ShardLocation](ExternalShardAllocationStrategy$$ShardLocation.html)]Java API
16. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#locations:Map[akka.cluster.sharding.ShardRegion.ShardId,akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation] "Permalink")  val locations: Map\[[ShardId](../ShardRegion$.html#ShardId=String), [ShardLocation](ExternalShardAllocationStrategy$$ShardLocation.html)]
19. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardLocations toStringFormat\[ShardLocations] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/external/ShardLocations.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardLocations, B)ImplicitThis member is added by an implicit conversion from ShardLocations toArrowAssoc\[ShardLocations] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardLocations to any2stringadd\[ShardLocations]

### Inherited by implicit conversion StringFormat fromShardLocations to StringFormat\[ShardLocations]

### Inherited by implicit conversion Ensuring fromShardLocations to Ensuring\[ShardLocations]

### Inherited by implicit conversion ArrowAssoc fromShardLocations to ArrowAssoc\[ShardLocations]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ClientTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ExternalShardAllocation$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ShardLocations.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ShardLocations.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/ShardLocations.html)*
---
description: Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:01:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html
title: Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation
---

# Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html "Permalink")  object [ExternalShardAllocationStrategy](ExternalShardAllocationStrategy$.html)Definition Classes[external](index.html)
- ShardLocation
c[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[external](index.html).[ExternalShardAllocationStrategy](ExternalShardAllocationStrategy$.html)

# ShardLocation[**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html "Permalink")

### 

#### final  case class ShardLocation(address: [Address](../../../actor/Address.html)) extends [NoSerializationVerificationNeeded](../../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[ExternalShardAllocationStrategy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/external/ExternalShardAllocationStrategy.scala#L56)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [NoSerializationVerificationNeeded](../../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardLocation
2. Serializable
3. Product
4. Equals
5. NoSerializationVerificationNeeded
6. AnyRef
7. Any
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

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#<init>(address:akka.actor.Address):akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation "Permalink")  new ShardLocation(address: [Address](../../../actor/Address.html))
### Value Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardLocation toany2stringadd\[ShardLocation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardLocation, B)ImplicitThis member is added by an implicit conversion from ShardLocation toArrowAssoc\[ShardLocation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#address:akka.actor.Address "Permalink")  val address: [Address](../../../actor/Address.html)
7. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardLocation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardLocationImplicitThis member is added by an implicit conversion from ShardLocation toEnsuring\[ShardLocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardLocation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardLocationImplicitThis member is added by an implicit conversion from ShardLocation toEnsuring\[ShardLocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardLocationImplicitThis member is added by an implicit conversion from ShardLocation toEnsuring\[ShardLocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardLocationImplicitThis member is added by an implicit conversion from ShardLocation toEnsuring\[ShardLocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardLocation toStringFormat\[ShardLocation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardLocation, B)ImplicitThis member is added by an implicit conversion from ShardLocation toArrowAssoc\[ShardLocation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [NoSerializationVerificationNeeded](../../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardLocation to any2stringadd\[ShardLocation]

### Inherited by implicit conversion StringFormat fromShardLocation to StringFormat\[ShardLocation]

### Inherited by implicit conversion Ensuring fromShardLocation to Ensuring\[ShardLocation]

### Inherited by implicit conversion ArrowAssoc fromShardLocation to ArrowAssoc\[ShardLocation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html)*
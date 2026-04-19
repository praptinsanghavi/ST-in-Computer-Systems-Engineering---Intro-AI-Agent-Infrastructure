---
description: Akka 2.10.17 - akka.cluster.UniqueAddress
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:54:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/UniqueAddress.html
title: Akka 2.10.17 - akka.cluster.UniqueAddress
---

# Akka 2.10.17 - akka.cluster.UniqueAddress

> **Summary:** Akka 2.10.17 - akka.cluster.UniqueAddress

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/ddata/index.html "Permalink")  package [ddata](ddata/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/metrics/index.html "Permalink")  package [metrics](metrics/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/sbr/index.html "Permalink")  package [sbr](sbr/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/sharding/index.html "Permalink")  package [sharding](sharding/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/singleton/index.html "Permalink")  package [singleton](singleton/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[cluster](index.html)
- [Cluster](Cluster.html "This module is responsible cluster membership information.")
- [ClusterEvent](ClusterEvent$.html "Domain events published to the event bus.")
- [ClusterLogMarker](ClusterLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [ClusterMessage](ClusterMessage.html "Base trait for all cluster messages.")
- [ClusterNodeMBean](ClusterNodeMBean.html "Interface for the cluster JMX MBean.")
- [ClusterScope](ClusterScope.html)
- [ClusterSettings](ClusterSettings.html)
- [ConfigValidation](ConfigValidation.html)
- [DowningProvider](DowningProvider.html "API for plugins that will handle downing of cluster nodes.")
- [GossipEnvelope](GossipEnvelope$.html)
- [Invalid](Invalid.html)
- [JoinConfigCompatCheckCluster](JoinConfigCompatCheckCluster.html "INTERNAL API")
- [JoinConfigCompatChecker](JoinConfigCompatChecker.html)
- [Member](Member.html "Represents the address, current status, and roles of a cluster member node.")
- [MemberStatus](MemberStatus.html "Defines the current status of a cluster member node")
- [NoDowning](NoDowning.html "Default downing provider used when no provider is configured.")
- UniqueAddress
- [Valid](Valid$.html)
- [VectorClock](VectorClock.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
[c](UniqueAddress$.html "See companion object")[akka](../index.html).[cluster](index.html)

# [UniqueAddress](UniqueAddress$.html "See companion object")[**](../../akka/cluster/UniqueAddress.html "Permalink")

### Companion [object UniqueAddress](UniqueAddress$.html "See companion object")

#### final  class UniqueAddress extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable with Ordered\[UniqueAddress]

Member identifier consisting of address and random `uid`.
The `uid` is needed to be able to distinguish different
incarnations of a member with same hostname and port.

Annotations@SerialVersionUID() Source[Member.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/Member.scala#L329)Linear Supertypes[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress], [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[UniqueAddress], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UniqueAddress
2. Ordered
3. Comparable
4. Serializable
5. Product
6. Equals
7. AnyRef
8. Any
Implicitly  
1. by orderingToOrdered
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/cluster/UniqueAddress.html#<init>(address:akka.actor.Address,longUid:Long):akka.cluster.UniqueAddress "Permalink")  new UniqueAddress(address: [Address](../actor/Address.html), longUid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))
2. [**](../../akka/cluster/UniqueAddress.html#<init>(address:akka.actor.Address,uid:Int):akka.cluster.UniqueAddress "Permalink")  new UniqueAddress(address: [Address](../actor/Address.html), uid: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))Annotations@deprecated Deprecated*(Since version 2\.4\.11\)* Use Long UID constructor instead
### Value Members

1. [**](../../akka/cluster/UniqueAddress.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/UniqueAddress.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/UniqueAddress.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UniqueAddress toany2stringadd\[UniqueAddress] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/UniqueAddress.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UniqueAddress, B)ImplicitThis member is added by an implicit conversion from UniqueAddress toArrowAssoc\[UniqueAddress] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/UniqueAddress.html#<(that:A):Boolean "Permalink")  def \<(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
6. [**](../../akka/cluster/UniqueAddress.html#<=(that:A):Boolean "Permalink")  def \<\=(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
7. [**](../../akka/cluster/UniqueAddress.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/cluster/UniqueAddress.html#>(that:A):Boolean "Permalink")  def \>(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
9. [**](../../akka/cluster/UniqueAddress.html#>=(that:A):Boolean "Permalink")  def \>\=(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
10. [**](../../akka/cluster/UniqueAddress.html#address:akka.actor.Address "Permalink")  val address: [Address](../actor/Address.html)
11. [**](../../akka/cluster/UniqueAddress.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/cluster/UniqueAddress.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesUniqueAddress → Equals
13. [**](../../akka/cluster/UniqueAddress.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/cluster/UniqueAddress.html#compare(that:akka.cluster.UniqueAddress):Int "Permalink")  def compare(that: UniqueAddress): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesUniqueAddress → Ordered
15. [**](../../akka/cluster/UniqueAddress.html#compareTo(that:A):Int "Permalink")  def compareTo(that: UniqueAddress): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesOrdered → Comparable
16. [**](../../akka/cluster/UniqueAddress.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UniqueAddress) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UniqueAddressImplicitThis member is added by an implicit conversion from UniqueAddress toEnsuring\[UniqueAddress] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/cluster/UniqueAddress.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UniqueAddress) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UniqueAddressImplicitThis member is added by an implicit conversion from UniqueAddress toEnsuring\[UniqueAddress] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/cluster/UniqueAddress.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UniqueAddressImplicitThis member is added by an implicit conversion from UniqueAddress toEnsuring\[UniqueAddress] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/cluster/UniqueAddress.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UniqueAddressImplicitThis member is added by an implicit conversion from UniqueAddress toEnsuring\[UniqueAddress] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/cluster/UniqueAddress.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/cluster/UniqueAddress.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesUniqueAddress → Equals → AnyRef → Any
22. [**](../../akka/cluster/UniqueAddress.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/cluster/UniqueAddress.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesUniqueAddress → AnyRef → Any
24. [**](../../akka/cluster/UniqueAddress.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/cluster/UniqueAddress.html#longUid:Long "Permalink")  val longUid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
26. [**](../../akka/cluster/UniqueAddress.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../akka/cluster/UniqueAddress.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/cluster/UniqueAddress.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/cluster/UniqueAddress.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesUniqueAddress → Product
30. [**](../../akka/cluster/UniqueAddress.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesUniqueAddress → Product
31. [**](../../akka/cluster/UniqueAddress.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
32. [**](../../akka/cluster/UniqueAddress.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
33. [**](../../akka/cluster/UniqueAddress.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
34. [**](../../akka/cluster/UniqueAddress.html#productPrefix:String "Permalink")  def productPrefix: StringDefinition ClassesProduct
35. [**](../../akka/cluster/UniqueAddress.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../akka/cluster/UniqueAddress.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesUniqueAddress → AnyRef → Any
37. [**](../../akka/cluster/UniqueAddress.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../akka/cluster/UniqueAddress.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../akka/cluster/UniqueAddress.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../akka/cluster/UniqueAddress.html#<(that:A):Boolean "Permalink")  def \<(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).<(that)
```
Definition ClassesOrdered
2. [**](../../akka/cluster/UniqueAddress.html#<=(that:A):Boolean "Permalink")  def \<\=(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).<=(that)
```
Definition ClassesOrdered
3. [**](../../akka/cluster/UniqueAddress.html#>(that:A):Boolean "Permalink")  def \>(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).>(that)
```
Definition ClassesOrdered
4. [**](../../akka/cluster/UniqueAddress.html#>=(that:A):Boolean "Permalink")  def \>\=(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).>=(that)
```
Definition ClassesOrdered
5. [**](../../akka/cluster/UniqueAddress.html#compare(that:A):Int "Permalink")  def compare(that: UniqueAddress): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).compare(that)
```
Definition ClassesOrdered
6. [**](../../akka/cluster/UniqueAddress.html#compareTo(that:A):Int "Permalink")  def compareTo(that: UniqueAddress): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).compareTo(that)
```
Definition ClassesOrdered → Comparable
### Deprecated Value Members

1. [**](../../akka/cluster/UniqueAddress.html#copy(address:akka.actor.Address,uid:Int):akka.cluster.UniqueAddress "Permalink")  def copy(address: [Address](../actor/Address.html) \= address, uid: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= uid): UniqueAddressFor binary compatibility
Stops `copy(Address, Long)` copy from being generated, use `apply` instead.

For binary compatibility
Stops `copy(Address, Long)` copy from being generated, use `apply` instead.

Annotations@deprecated Deprecated*(Since version 2\.4\.11\)* Use Long UID constructor instead
2. [**](../../akka/cluster/UniqueAddress.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../akka/cluster/UniqueAddress.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UniqueAddress toStringFormat\[UniqueAddress] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../akka/cluster/UniqueAddress.html#uid:Int "Permalink")  def uid: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Annotations@deprecated Deprecated*(Since version 2\.4\.11\)* Use longUid instead
5. [**](../../akka/cluster/UniqueAddress.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UniqueAddress, B)ImplicitThis member is added by an implicit conversion from UniqueAddress toArrowAssoc\[UniqueAddress] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress]

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[UniqueAddress]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion orderingToOrdered fromUniqueAddress to [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress]

### Inherited by implicit conversion any2stringadd fromUniqueAddress to any2stringadd\[UniqueAddress]

### Inherited by implicit conversion StringFormat fromUniqueAddress to StringFormat\[UniqueAddress]

### Inherited by implicit conversion Ensuring fromUniqueAddress to Ensuring\[UniqueAddress]

### Inherited by implicit conversion ArrowAssoc fromUniqueAddress to ArrowAssoc\[UniqueAddress]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterMessage.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterNodeMBean.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterScope$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterScope.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ConfigValidation.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/GossipEnvelope$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Invalid.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/JoinConfigCompatCheckCluster.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Member$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/MemberStatus$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/NoDowning.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/UniqueAddress$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Valid$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/VectorClock.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/cluster/UniqueAddress.html](https://doc.akka.io/api/akka-core/current/akka/cluster/UniqueAddress.html)*
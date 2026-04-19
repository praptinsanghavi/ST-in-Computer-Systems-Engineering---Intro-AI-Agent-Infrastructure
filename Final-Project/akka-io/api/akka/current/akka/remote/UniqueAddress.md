---
description: Akka 2.10.17 - akka.remote.UniqueAddress
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:44:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/UniqueAddress.html
title: Akka 2.10.17 - akka.remote.UniqueAddress
---

# Akka 2.10.17 - akka.remote.UniqueAddress

> **Summary:** Akka 2.10.17 - akka.remote.UniqueAddress

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/artery/index.html "Permalink")  package [artery](artery/index.html)Definition Classes[remote](index.html)
- [**](../../akka/remote/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[remote](index.html)
- [**](../../akka/remote/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[remote](index.html)
- [**](../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](testconductor/index.html)Definition Classes[remote](index.html)
- [**](../../akka/remote/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[remote](index.html)
- [AddressUidExtension](AddressUidExtension.html)
- [ArteryControlFormats](ArteryControlFormats.html)
- [BoundAddressesExtension](BoundAddressesExtension.html)
- [ContainerFormats](ContainerFormats.html)
- [DeadlineFailureDetector](DeadlineFailureDetector.html "Implementation of failure detector using an absolute timeout of missing heartbeats to trigger unavailability.")
- [DefaultFailureDetectorRegistry](DefaultFailureDetectorRegistry.html "A lock-less thread-safe implementation of akka.remote.FailureDetectorRegistry.")
- [FailureDetector](FailureDetector.html "A failure detector must be a thread-safe mutable construct that registers heartbeat events of a resource and is able to decide the availability of that monitored resource.")
- [FailureDetectorRegistry](FailureDetectorRegistry.html "Interface for a registry of Akka failure detectors.")
- [NotAllowedClassRemoteDeploymentAttemptException](NotAllowedClassRemoteDeploymentAttemptException.html "INTERNAL API")
- [PhiAccrualFailureDetector](PhiAccrualFailureDetector.html "Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al.")
- [RemoteLogMarker](RemoteLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [RemoteScope](RemoteScope.html)
- [RemoteSettings](RemoteSettings.html)
- [RemoteTransportException](RemoteTransportException.html "RemoteTransportException represents a general failure within a RemoteTransport, such as inability to start, wrong configuration etc.")
- [RemoteTransportExceptionNoStackTrace](RemoteTransportExceptionNoStackTrace.html "RemoteTransportException without stack trace.")
- [SystemMessageFormats](SystemMessageFormats.html)
- UniqueAddress
- [WireFormats](WireFormats.html)
c[akka](../index.html).[remote](index.html)

# UniqueAddress[**](../../akka/remote/UniqueAddress.html "Permalink")

### 

#### final  case class UniqueAddress(address: [Address](../actor/Address.html), uid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends Ordered\[UniqueAddress] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@SerialVersionUID() Source[UniqueAddress.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/UniqueAddress.scala#L10)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress], [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[UniqueAddress], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UniqueAddress
2. Serializable
3. Product
4. Equals
5. Ordered
6. Comparable
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

1. [**](../../akka/remote/UniqueAddress.html#<init>(address:akka.actor.Address,uid:Long):akka.remote.UniqueAddress "Permalink")  new UniqueAddress(address: [Address](../actor/Address.html), uid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))
### Value Members

1. [**](../../akka/remote/UniqueAddress.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/remote/UniqueAddress.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/remote/UniqueAddress.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UniqueAddress toany2stringadd\[UniqueAddress] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/remote/UniqueAddress.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UniqueAddress, B)ImplicitThis member is added by an implicit conversion from UniqueAddress toArrowAssoc\[UniqueAddress] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/remote/UniqueAddress.html#<(that:A):Boolean "Permalink")  def \<(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
6. [**](../../akka/remote/UniqueAddress.html#<=(that:A):Boolean "Permalink")  def \<\=(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
7. [**](../../akka/remote/UniqueAddress.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/remote/UniqueAddress.html#>(that:A):Boolean "Permalink")  def \>(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
9. [**](../../akka/remote/UniqueAddress.html#>=(that:A):Boolean "Permalink")  def \>\=(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
10. [**](../../akka/remote/UniqueAddress.html#address:akka.actor.Address "Permalink")  val address: [Address](../actor/Address.html)
11. [**](../../akka/remote/UniqueAddress.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/remote/UniqueAddress.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/remote/UniqueAddress.html#compare(that:akka.remote.UniqueAddress):Int "Permalink")  def compare(that: UniqueAddress): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesUniqueAddress → Ordered
14. [**](../../akka/remote/UniqueAddress.html#compareTo(that:A):Int "Permalink")  def compareTo(that: UniqueAddress): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesOrdered → Comparable
15. [**](../../akka/remote/UniqueAddress.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UniqueAddress) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UniqueAddressImplicitThis member is added by an implicit conversion from UniqueAddress toEnsuring\[UniqueAddress] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/remote/UniqueAddress.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UniqueAddress) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UniqueAddressImplicitThis member is added by an implicit conversion from UniqueAddress toEnsuring\[UniqueAddress] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/remote/UniqueAddress.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UniqueAddressImplicitThis member is added by an implicit conversion from UniqueAddress toEnsuring\[UniqueAddress] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/remote/UniqueAddress.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UniqueAddressImplicitThis member is added by an implicit conversion from UniqueAddress toEnsuring\[UniqueAddress] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/remote/UniqueAddress.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/remote/UniqueAddress.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/remote/UniqueAddress.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesUniqueAddress → AnyRef → Any
22. [**](../../akka/remote/UniqueAddress.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../akka/remote/UniqueAddress.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/remote/UniqueAddress.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/remote/UniqueAddress.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/remote/UniqueAddress.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
27. [**](../../akka/remote/UniqueAddress.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../akka/remote/UniqueAddress.html#toString():String "Permalink")  def toString(): StringDefinition ClassesUniqueAddress → AnyRef → Any
29. [**](../../akka/remote/UniqueAddress.html#uid:Long "Permalink")  val uid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
30. [**](../../akka/remote/UniqueAddress.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/remote/UniqueAddress.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../akka/remote/UniqueAddress.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../akka/remote/UniqueAddress.html#<(that:A):Boolean "Permalink")  def \<(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).<(that)
```
Definition ClassesOrdered
2. [**](../../akka/remote/UniqueAddress.html#<=(that:A):Boolean "Permalink")  def \<\=(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).<=(that)
```
Definition ClassesOrdered
3. [**](../../akka/remote/UniqueAddress.html#>(that:A):Boolean "Permalink")  def \>(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).>(that)
```
Definition ClassesOrdered
4. [**](../../akka/remote/UniqueAddress.html#>=(that:A):Boolean "Permalink")  def \>\=(that: UniqueAddress): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).>=(that)
```
Definition ClassesOrdered
5. [**](../../akka/remote/UniqueAddress.html#compare(that:A):Int "Permalink")  def compare(that: UniqueAddress): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).compare(that)
```
Definition ClassesOrdered
6. [**](../../akka/remote/UniqueAddress.html#compareTo(that:A):Int "Permalink")  def compareTo(that: UniqueAddress): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from UniqueAddress to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(uniqueAddress: Ordered[UniqueAddress]).compareTo(that)
```
Definition ClassesOrdered → Comparable
### Deprecated Value Members

1. [**](../../akka/remote/UniqueAddress.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/remote/UniqueAddress.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UniqueAddress toStringFormat\[UniqueAddress] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/remote/UniqueAddress.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UniqueAddress, B)ImplicitThis member is added by an implicit conversion from UniqueAddress toArrowAssoc\[UniqueAddress] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress]

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[UniqueAddress]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion orderingToOrdered fromUniqueAddress to [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[UniqueAddress]

### Inherited by implicit conversion any2stringadd fromUniqueAddress to any2stringadd\[UniqueAddress]

### Inherited by implicit conversion StringFormat fromUniqueAddress to StringFormat\[UniqueAddress]

### Inherited by implicit conversion Ensuring fromUniqueAddress to Ensuring\[UniqueAddress]

### Inherited by implicit conversion ArrowAssoc fromUniqueAddress to ArrowAssoc\[UniqueAddress]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/api/akka/current/akka/remote/AddressUidExtension.html
- https://doc.akka.io/api/akka/current/akka/remote/ArteryControlFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/api/akka/current/akka/remote/BoundAddressesExtension.html
- https://doc.akka.io/api/akka/current/akka/remote/ContainerFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/DeadlineFailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/DefaultFailureDetectorRegistry.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector$.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/api/akka/current/akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html
- https://doc.akka.io/api/akka/current/akka/remote/PhiAccrualFailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteScope.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteSettings.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteTransportException.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteTransportExceptionNoStackTrace.html
- https://doc.akka.io/api/akka/current/akka/remote/SystemMessageFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/remote/WireFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/routing/index.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html](https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html)*
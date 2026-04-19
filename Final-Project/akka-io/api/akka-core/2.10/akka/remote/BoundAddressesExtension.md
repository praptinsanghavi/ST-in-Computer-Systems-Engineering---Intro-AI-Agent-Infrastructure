---
description: Akka 2.10.17 - akka.remote.BoundAddressesExtension
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/BoundAddressesExtension.html
title: Akka 2.10.17 - akka.remote.BoundAddressesExtension
---

# Akka 2.10.17 - akka.remote.BoundAddressesExtension

> **Summary:** Akka 2.10.17 - akka.remote.BoundAddressesExtension

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
- BoundAddressesExtension
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
- [UniqueAddress](UniqueAddress.html)
- [WireFormats](WireFormats.html)
[c](BoundAddressesExtension$.html "See companion object")[akka](../index.html).[remote](index.html)

# [BoundAddressesExtension](BoundAddressesExtension$.html "See companion object")[**](../../akka/remote/BoundAddressesExtension.html "Permalink")

### Companion [object BoundAddressesExtension](BoundAddressesExtension$.html "See companion object")

#### class BoundAddressesExtension extends [Extension](../actor/Extension.html)

Source[BoundAddressesExtension.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/BoundAddressesExtension.scala#L29)Linear Supertypes[Extension](../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BoundAddressesExtension
2. Extension
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

1. [**](../../akka/remote/BoundAddressesExtension.html#<init>(system:akka.actor.ExtendedActorSystem):akka.remote.BoundAddressesExtension "Permalink")  new BoundAddressesExtension(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../akka/remote/BoundAddressesExtension.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/remote/BoundAddressesExtension.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/remote/BoundAddressesExtension.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BoundAddressesExtension toany2stringadd\[BoundAddressesExtension] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/remote/BoundAddressesExtension.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BoundAddressesExtension, B)ImplicitThis member is added by an implicit conversion from BoundAddressesExtension toArrowAssoc\[BoundAddressesExtension] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/remote/BoundAddressesExtension.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/remote/BoundAddressesExtension.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/remote/BoundAddressesExtension.html#boundAddresses:Map[String,Set[akka.actor.Address]] "Permalink")  def boundAddresses: Map\[String, Set\[[Address](../actor/Address.html)]]Returns a mapping from a protocol to a set of bound addresses.
8. [**](../../akka/remote/BoundAddressesExtension.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/remote/BoundAddressesExtension.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BoundAddressesExtension) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BoundAddressesExtensionImplicitThis member is added by an implicit conversion from BoundAddressesExtension toEnsuring\[BoundAddressesExtension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/remote/BoundAddressesExtension.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BoundAddressesExtension) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BoundAddressesExtensionImplicitThis member is added by an implicit conversion from BoundAddressesExtension toEnsuring\[BoundAddressesExtension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/remote/BoundAddressesExtension.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BoundAddressesExtensionImplicitThis member is added by an implicit conversion from BoundAddressesExtension toEnsuring\[BoundAddressesExtension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/remote/BoundAddressesExtension.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BoundAddressesExtensionImplicitThis member is added by an implicit conversion from BoundAddressesExtension toEnsuring\[BoundAddressesExtension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/remote/BoundAddressesExtension.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/remote/BoundAddressesExtension.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/remote/BoundAddressesExtension.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/remote/BoundAddressesExtension.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/remote/BoundAddressesExtension.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/remote/BoundAddressesExtension.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/remote/BoundAddressesExtension.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/remote/BoundAddressesExtension.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/remote/BoundAddressesExtension.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/remote/BoundAddressesExtension.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)
23. [**](../../akka/remote/BoundAddressesExtension.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/remote/BoundAddressesExtension.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/remote/BoundAddressesExtension.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/remote/BoundAddressesExtension.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/remote/BoundAddressesExtension.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/remote/BoundAddressesExtension.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BoundAddressesExtension toStringFormat\[BoundAddressesExtension] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/remote/BoundAddressesExtension.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BoundAddressesExtension, B)ImplicitThis member is added by an implicit conversion from BoundAddressesExtension toArrowAssoc\[BoundAddressesExtension] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBoundAddressesExtension to any2stringadd\[BoundAddressesExtension]

### Inherited by implicit conversion StringFormat fromBoundAddressesExtension to StringFormat\[BoundAddressesExtension]

### Inherited by implicit conversion Ensuring fromBoundAddressesExtension to Ensuring\[BoundAddressesExtension]

### Inherited by implicit conversion ArrowAssoc fromBoundAddressesExtension to ArrowAssoc\[BoundAddressesExtension]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/AddressUidExtension.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/ArteryControlFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/BoundAddressesExtension.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/ContainerFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/DeadlineFailureDetector.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/DefaultFailureDetectorRegistry.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/FailureDetector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/FailureDetector.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/PhiAccrualFailureDetector.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteScope.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteTransportException.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteTransportExceptionNoStackTrace.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/SystemMessageFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/WireFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/BoundAddressesExtension.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/BoundAddressesExtension.html)*
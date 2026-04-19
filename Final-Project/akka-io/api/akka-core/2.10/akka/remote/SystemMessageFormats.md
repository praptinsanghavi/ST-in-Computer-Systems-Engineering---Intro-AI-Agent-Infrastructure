---
description: Akka 2.10.17 - akka.remote.SystemMessageFormats
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/SystemMessageFormats.html
title: Akka 2.10.17 - akka.remote.SystemMessageFormats
---

# Akka 2.10.17 - akka.remote.SystemMessageFormats

> **Summary:** Akka 2.10.17 - akka.remote.SystemMessageFormats

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
- SystemMessageFormats
- [UniqueAddress](UniqueAddress.html)
- [WireFormats](WireFormats.html)
c[akka](../index.html).[remote](index.html)

# SystemMessageFormats[**](../../akka/remote/SystemMessageFormats.html "Permalink")

### 

#### final  class SystemMessageFormats extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[SystemMessageFormats.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/java/akka/remote/SystemMessageFormats.java#L10)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SystemMessageFormats
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
### Value Members

1. [**](../../akka/remote/SystemMessageFormats.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/remote/SystemMessageFormats.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/remote/SystemMessageFormats.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SystemMessageFormats toany2stringadd\[SystemMessageFormats] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/remote/SystemMessageFormats.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SystemMessageFormats, B)ImplicitThis member is added by an implicit conversion from SystemMessageFormats toArrowAssoc\[SystemMessageFormats] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/remote/SystemMessageFormats.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/remote/SystemMessageFormats.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/remote/SystemMessageFormats.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/remote/SystemMessageFormats.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SystemMessageFormats) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SystemMessageFormatsImplicitThis member is added by an implicit conversion from SystemMessageFormats toEnsuring\[SystemMessageFormats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/remote/SystemMessageFormats.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SystemMessageFormats) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SystemMessageFormatsImplicitThis member is added by an implicit conversion from SystemMessageFormats toEnsuring\[SystemMessageFormats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/remote/SystemMessageFormats.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SystemMessageFormatsImplicitThis member is added by an implicit conversion from SystemMessageFormats toEnsuring\[SystemMessageFormats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/remote/SystemMessageFormats.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SystemMessageFormatsImplicitThis member is added by an implicit conversion from SystemMessageFormats toEnsuring\[SystemMessageFormats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/remote/SystemMessageFormats.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/remote/SystemMessageFormats.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/remote/SystemMessageFormats.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/remote/SystemMessageFormats.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/remote/SystemMessageFormats.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/remote/SystemMessageFormats.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/remote/SystemMessageFormats.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/remote/SystemMessageFormats.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/remote/SystemMessageFormats.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/remote/SystemMessageFormats.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/remote/SystemMessageFormats.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/remote/SystemMessageFormats.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/remote/SystemMessageFormats.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/remote/SystemMessageFormats.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/remote/SystemMessageFormats.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SystemMessageFormats toStringFormat\[SystemMessageFormats] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/remote/SystemMessageFormats.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SystemMessageFormats, B)ImplicitThis member is added by an implicit conversion from SystemMessageFormats toArrowAssoc\[SystemMessageFormats] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSystemMessageFormats to any2stringadd\[SystemMessageFormats]

### Inherited by implicit conversion StringFormat fromSystemMessageFormats to StringFormat\[SystemMessageFormats]

### Inherited by implicit conversion Ensuring fromSystemMessageFormats to Ensuring\[SystemMessageFormats]

### Inherited by implicit conversion ArrowAssoc fromSystemMessageFormats to ArrowAssoc\[SystemMessageFormats]

### Ungrouped

## Related Pages (Internal Links)

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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/SystemMessageFormats.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/SystemMessageFormats.html)*
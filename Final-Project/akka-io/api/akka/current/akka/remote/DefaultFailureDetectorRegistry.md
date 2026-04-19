---
description: Akka 2.10.17 - akka.remote.DefaultFailureDetectorRegistry
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:44:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/DefaultFailureDetectorRegistry.html
title: Akka 2.10.17 - akka.remote.DefaultFailureDetectorRegistry
---

# Akka 2.10.17 - akka.remote.DefaultFailureDetectorRegistry

> **Summary:** Akka 2.10.17 - akka.remote.DefaultFailureDetectorRegistry

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
- DefaultFailureDetectorRegistry
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
c[akka](../index.html).[remote](index.html)

# DefaultFailureDetectorRegistry[**](../../akka/remote/DefaultFailureDetectorRegistry.html "Permalink")

### 

#### class DefaultFailureDetectorRegistry\[A] extends [FailureDetectorRegistry](FailureDetectorRegistry.html)\[A]

A lock\-less thread\-safe implementation of [akka.remote.FailureDetectorRegistry](FailureDetectorRegistry.html).

Source[DefaultFailureDetectorRegistry.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/DefaultFailureDetectorRegistry.scala#L20)Linear Supertypes[FailureDetectorRegistry](FailureDetectorRegistry.html)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DefaultFailureDetectorRegistry
2. FailureDetectorRegistry
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

1. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#<init>(detectorFactory:()=>akka.remote.FailureDetector):akka.remote.DefaultFailureDetectorRegistry[A] "Permalink")  new DefaultFailureDetectorRegistry(detectorFactory: () \=\> [FailureDetector](FailureDetector.html))detectorFactory
 By\-name parameter that returns the failure detector instance to be used by a newly registered resource
### Value Members

1. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/remote/DefaultFailureDetectorRegistry.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DefaultFailureDetectorRegistry\[A] toany2stringadd\[DefaultFailureDetectorRegistry\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DefaultFailureDetectorRegistry\[A], B)ImplicitThis member is added by an implicit conversion from DefaultFailureDetectorRegistry\[A] toArrowAssoc\[DefaultFailureDetectorRegistry\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DefaultFailureDetectorRegistry\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DefaultFailureDetectorRegistry\[A]ImplicitThis member is added by an implicit conversion from DefaultFailureDetectorRegistry\[A] toEnsuring\[DefaultFailureDetectorRegistry\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DefaultFailureDetectorRegistry\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DefaultFailureDetectorRegistry\[A]ImplicitThis member is added by an implicit conversion from DefaultFailureDetectorRegistry\[A] toEnsuring\[DefaultFailureDetectorRegistry\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DefaultFailureDetectorRegistry\[A]ImplicitThis member is added by an implicit conversion from DefaultFailureDetectorRegistry\[A] toEnsuring\[DefaultFailureDetectorRegistry\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DefaultFailureDetectorRegistry\[A]ImplicitThis member is added by an implicit conversion from DefaultFailureDetectorRegistry\[A] toEnsuring\[DefaultFailureDetectorRegistry\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#heartbeat(resource:A):Unit "Permalink") final  def heartbeat(resource: A): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Records a heartbeat for a resource.

Records a heartbeat for a resource. If the resource is not yet registered (i.e. this is the first heartbeat) then
it is automatically registered.

Definition ClassesDefaultFailureDetectorRegistry → [FailureDetectorRegistry](FailureDetectorRegistry.html)
17. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#isAvailable(resource:A):Boolean "Permalink") final  def isAvailable(resource: A): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if the resource is considered to be up and healthy and returns false otherwise.

Returns true if the resource is considered to be up and healthy and returns false otherwise.
For unregistered resources it returns true.

Definition ClassesDefaultFailureDetectorRegistry → [FailureDetectorRegistry](FailureDetectorRegistry.html)
18. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#isMonitoring(resource:A):Boolean "Permalink") final  def isMonitoring(resource: A): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if the failure detector has received any heartbeats and started monitoring
of the resource.

Returns true if the failure detector has received any heartbeats and started monitoring
of the resource.

Definition ClassesDefaultFailureDetectorRegistry → [FailureDetectorRegistry](FailureDetectorRegistry.html)
20. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#remove(resource:A):Unit "Permalink") final  def remove(resource: A): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Removes the heartbeat management for a resource.

Removes the heartbeat management for a resource.

Definition ClassesDefaultFailureDetectorRegistry → [FailureDetectorRegistry](FailureDetectorRegistry.html)Annotations@tailrec()
24. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#reset():Unit "Permalink") final  def reset(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Removes all resources and any associated failure detector state.

Removes all resources and any associated failure detector state.

Definition ClassesDefaultFailureDetectorRegistry → [FailureDetectorRegistry](FailureDetectorRegistry.html)Annotations@tailrec()
25. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DefaultFailureDetectorRegistry\[A] toStringFormat\[DefaultFailureDetectorRegistry\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/remote/DefaultFailureDetectorRegistry.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DefaultFailureDetectorRegistry\[A], B)ImplicitThis member is added by an implicit conversion from DefaultFailureDetectorRegistry\[A] toArrowAssoc\[DefaultFailureDetectorRegistry\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [FailureDetectorRegistry](FailureDetectorRegistry.html)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDefaultFailureDetectorRegistry\[A] to any2stringadd\[DefaultFailureDetectorRegistry\[A]]

### Inherited by implicit conversion StringFormat fromDefaultFailureDetectorRegistry\[A] to StringFormat\[DefaultFailureDetectorRegistry\[A]]

### Inherited by implicit conversion Ensuring fromDefaultFailureDetectorRegistry\[A] to Ensuring\[DefaultFailureDetectorRegistry\[A]]

### Inherited by implicit conversion ArrowAssoc fromDefaultFailureDetectorRegistry\[A] to ArrowAssoc\[DefaultFailureDetectorRegistry\[A]]

### Ungrouped

## Related Pages (Internal Links)

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
*Source: [https://doc.akka.io/api/akka/current/akka/remote/DefaultFailureDetectorRegistry.html](https://doc.akka.io/api/akka/current/akka/remote/DefaultFailureDetectorRegistry.html)*
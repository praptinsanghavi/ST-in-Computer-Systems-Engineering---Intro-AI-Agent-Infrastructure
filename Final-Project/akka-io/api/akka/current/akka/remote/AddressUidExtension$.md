---
description: Akka 2.10.17 - akka.remote.AddressUidExtension
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:44:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/AddressUidExtension$.html
title: Akka 2.10.17 - akka.remote.AddressUidExtension
---

# Akka 2.10.17 - akka.remote.AddressUidExtension

> **Summary:** Akka 2.10.17 - akka.remote.AddressUidExtension

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
- [UniqueAddress](UniqueAddress.html)
- [WireFormats](WireFormats.html)
[o](AddressUidExtension.html "See companion class")[akka](../index.html).[remote](index.html)

# [AddressUidExtension](AddressUidExtension.html "See companion class")[**](../../akka/remote/AddressUidExtension$.html "Permalink")

### Companion [class AddressUidExtension](AddressUidExtension.html "See companion class")

#### object AddressUidExtension extends [ExtensionId](../actor/ExtensionId.html)\[[AddressUidExtension](AddressUidExtension.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

Extension that holds a uid that is assigned as a random `Long`.

The uid is intended to be used together with an [akka.actor.Address](../actor/Address.html)
to be able to distinguish restarted actor system using the same host
and port.

Annotations@deprecated Deprecated*(Since version 2\.8\.0\)* Use ExtendedActorSystem.uid instead.

Source[AddressUidExtension.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/AddressUidExtension.scala#L22)Linear Supertypes[ExtensionIdProvider](../actor/ExtensionIdProvider.html), [ExtensionId](../actor/ExtensionId.html)\[[AddressUidExtension](AddressUidExtension.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AddressUidExtension
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/remote/AddressUidExtension$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/remote/AddressUidExtension$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/remote/AddressUidExtension$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/remote/AddressUidExtension$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [AddressUidExtension](AddressUidExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
5. [**](../../akka/remote/AddressUidExtension$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../actor/ActorSystem.html)): [AddressUidExtension](AddressUidExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
6. [**](../../akka/remote/AddressUidExtension$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/remote/AddressUidExtension$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/remote/AddressUidExtension$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.remote.AddressUidExtension "Permalink")  def createExtension(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)): [AddressUidExtension](AddressUidExtension.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesAddressUidExtension → [ExtensionId](../actor/ExtensionId.html)
9. [**](../../akka/remote/AddressUidExtension$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/remote/AddressUidExtension$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../akka/remote/AddressUidExtension$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.remote.AddressUidExtension "Permalink")  def get(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [AddressUidExtension](AddressUidExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesAddressUidExtension → [ExtensionId](../actor/ExtensionId.html)
12. [**](../../akka/remote/AddressUidExtension$.html#get(system:akka.actor.ActorSystem):akka.remote.AddressUidExtension "Permalink")  def get(system: [ActorSystem](../actor/ActorSystem.html)): [AddressUidExtension](AddressUidExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesAddressUidExtension → [ExtensionId](../actor/ExtensionId.html)
13. [**](../../akka/remote/AddressUidExtension$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/remote/AddressUidExtension$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../akka/remote/AddressUidExtension$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/remote/AddressUidExtension$.html#lookup:akka.remote.AddressUidExtension.type "Permalink")  def lookup: AddressUidExtensionReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesAddressUidExtension → [ExtensionIdProvider](../actor/ExtensionIdProvider.html)
17. [**](../../akka/remote/AddressUidExtension$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/remote/AddressUidExtension$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/remote/AddressUidExtension$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/remote/AddressUidExtension$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/remote/AddressUidExtension$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/remote/AddressUidExtension$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/remote/AddressUidExtension$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/remote/AddressUidExtension$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/remote/AddressUidExtension$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../actor/ExtensionId.html)\[[AddressUidExtension](AddressUidExtension.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/remote/AddressUidExtension$.html](https://doc.akka.io/api/akka/current/akka/remote/AddressUidExtension$.html)*
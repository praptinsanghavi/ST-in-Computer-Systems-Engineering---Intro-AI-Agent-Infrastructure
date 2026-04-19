---
description: Akka 2.10.17 - akka.coordination.lease.javadsl.LeaseProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:59:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/javadsl/LeaseProvider$.html
title: Akka 2.10.17 - akka.coordination.lease.javadsl.LeaseProvider
---

# Akka 2.10.17 - akka.coordination.lease.javadsl.LeaseProvider

> **Summary:** Akka 2.10.17 - akka.coordination.lease.javadsl.LeaseProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/coordination/index.html "Permalink")  package [coordination](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/coordination/lease/index.html "Permalink")  package [lease](../index.html)Definition Classes[coordination](../../index.html)
- [**](../../../../akka/coordination/lease/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[lease](../index.html)
- [Lease](Lease.html)
- [LeaseProvider](LeaseProvider.html)
[o](LeaseProvider.html "See companion class")[akka](../../../index.html).[coordination](../../index.html).[lease](../index.html).[javadsl](index.html)

# [LeaseProvider](LeaseProvider.html "See companion class")[**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html "Permalink")

### Companion [class LeaseProvider](LeaseProvider.html "See companion class")

#### object LeaseProvider extends [ExtensionId](../../../actor/ExtensionId.html)\[[LeaseProvider](LeaseProvider.html)] with [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html)

Source[LeaseProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/scala/akka/coordination/lease/javadsl/LeaseProvider.scala#L13)Linear Supertypes[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html), [ExtensionId](../../../actor/ExtensionId.html)\[[LeaseProvider](LeaseProvider.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeaseProvider
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html)): [LeaseProvider](LeaseProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../../actor/ExtensionId.html)
5. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../../../actor/ActorSystem.html)): [LeaseProvider](LeaseProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../../actor/ExtensionId.html)
6. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.coordination.lease.javadsl.LeaseProvider "Permalink")  def createExtension(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html)): [LeaseProvider](LeaseProvider.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesLeaseProvider → [ExtensionId](../../../actor/ExtensionId.html)
9. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.coordination.lease.javadsl.LeaseProvider "Permalink")  def get(system: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html)): [LeaseProvider](LeaseProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesLeaseProvider → [ExtensionId](../../../actor/ExtensionId.html)
12. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#get(system:akka.actor.ActorSystem):akka.coordination.lease.javadsl.LeaseProvider "Permalink")  def get(system: [ActorSystem](../../../actor/ActorSystem.html)): [LeaseProvider](LeaseProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesLeaseProvider → [ExtensionId](../../../actor/ExtensionId.html)
13. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#lookup:akka.coordination.lease.javadsl.LeaseProvider.type "Permalink")  def lookup: LeaseProviderReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesLeaseProvider → [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html)
17. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../../../actor/ExtensionId.html)\[[LeaseProvider](LeaseProvider.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/Lease.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider$.html)*
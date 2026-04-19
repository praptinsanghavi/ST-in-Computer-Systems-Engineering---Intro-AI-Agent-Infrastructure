---
description: Akka 2.10.11 - akka.remote.testconductor.TestConductor
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/TestConductor$.html
title: Akka 2.10.11 - akka.remote.testconductor.TestConductor
---

# Akka 2.10.11 - akka.remote.testconductor.TestConductor

> **Summary:** Akka 2.10.11 - akka.remote.testconductor.TestConductor

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](index.html)Definition Classes[remote](../index.html)
- [Conductor](Conductor.html "The conductor is the one orchestrating the test: it governs the akka.remote.testconductor.Controller’s port to which all akka.remote.testconductor.Players connect, it issues commands to their akka.remote.testconductor.NetworkFailureInjector and provides support for barriers using the akka.remote.testconductor.BarrierCoordinator.")
- [Player](Player.html "The Player is the client component of the akka.remote.testconductor.TestConductorExt extension.")
- [RoleName](RoleName.html)
- TestConductor
- [TestConductorExt](TestConductorExt.html "This binds together the akka.remote.testconductor.Conductor and akka.remote.testconductor.Player roles inside an Akka akka.actor.Extension.")
- [TestConductorProtocol](TestConductorProtocol.html)
o[akka](../../index.html).[remote](../index.html).[testconductor](index.html)

# TestConductor[**](../../../akka/remote/testconductor/TestConductor$.html "Permalink")

### 

#### object TestConductor extends [ExtensionId](../../actor/ExtensionId.html)\[[TestConductorExt](TestConductorExt.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

Access to the [akka.remote.testconductor.TestConductorExt](TestConductorExt.html) extension:

```
val tc = TestConductor(system)
tc.startController(numPlayers)
// OR
tc.startClient(conductorPort)
```
Source[Extension.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-multi-node-testkit/src/main/scala/akka/remote/testconductor/Extension.scala#L25)Linear Supertypes[ExtensionIdProvider](../../actor/ExtensionIdProvider.html), [ExtensionId](../../actor/ExtensionId.html)\[[TestConductorExt](TestConductorExt.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestConductor
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/remote/testconductor/TestConductor$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testconductor/TestConductor$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testconductor/TestConductor$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/remote/testconductor/TestConductor$.html#apply()(implicitctx:akka.actor.ActorContext):akka.remote.testconductor.TestConductorExt "Permalink")  def apply()(implicit ctx: [ActorContext](../../actor/ActorContext.html)): [TestConductorExt](TestConductorExt.html)
5. [**](../../../akka/remote/testconductor/TestConductor$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [TestConductorExt](TestConductorExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
6. [**](../../../akka/remote/testconductor/TestConductor$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../../actor/ActorSystem.html)): [TestConductorExt](TestConductorExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
7. [**](../../../akka/remote/testconductor/TestConductor$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/remote/testconductor/TestConductor$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/remote/testconductor/TestConductor$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.remote.testconductor.TestConductorExt "Permalink")  def createExtension(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html)): [TestConductorExt](TestConductorExt.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesTestConductor → [ExtensionId](../../actor/ExtensionId.html)
10. [**](../../../akka/remote/testconductor/TestConductor$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../akka/remote/testconductor/TestConductor$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
12. [**](../../../akka/remote/testconductor/TestConductor$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.remote.testconductor.TestConductorExt "Permalink")  def get(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [TestConductorExt](TestConductorExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesTestConductor → [ExtensionId](../../actor/ExtensionId.html)
13. [**](../../../akka/remote/testconductor/TestConductor$.html#get(system:akka.actor.ActorSystem):akka.remote.testconductor.TestConductorExt "Permalink")  def get(system: [ActorSystem](../../actor/ActorSystem.html)): [TestConductorExt](TestConductorExt.html)Java API: retrieve the TestConductor extension for the given system.

Java API: retrieve the TestConductor extension for the given system.

Definition ClassesTestConductor → [ExtensionId](../../actor/ExtensionId.html)
14. [**](../../../akka/remote/testconductor/TestConductor$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/remote/testconductor/TestConductor$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
16. [**](../../../akka/remote/testconductor/TestConductor$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/remote/testconductor/TestConductor$.html#lookup:akka.remote.testconductor.TestConductor.type "Permalink")  def lookup: TestConductorReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesTestConductor → [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
18. [**](../../../akka/remote/testconductor/TestConductor$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/remote/testconductor/TestConductor$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/remote/testconductor/TestConductor$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/remote/testconductor/TestConductor$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/remote/testconductor/TestConductor$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/remote/testconductor/TestConductor$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/remote/testconductor/TestConductor$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/remote/testconductor/TestConductor$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testconductor/TestConductor$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../../actor/ExtensionId.html)\[[TestConductorExt](TestConductorExt.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/Player$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/Player.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/TestConductor$.html](https://doc.akka.io/api/akka-core/2.10.11/akka/remote/testconductor/TestConductor$.html)*
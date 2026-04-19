---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.SnapshotTestKit.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:59:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.SnapshotTestKit.Settings
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.SnapshotTestKit.Settings

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.SnapshotTestKit.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$.html "Permalink")  object [SnapshotTestKit](SnapshotTestKit$.html)Definition Classes[scaladsl](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- [Settings](SnapshotTestKit$$Settings.html)
[o](SnapshotTestKit$$Settings.html "See companion class")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html).[SnapshotTestKit](SnapshotTestKit$.html)

# [Settings](SnapshotTestKit$$Settings.html "See companion class")[**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html "Permalink")

### Companion [class Settings](SnapshotTestKit$$Settings.html "See companion class")

#### object Settings extends [ExtensionId](../../../actor/ExtensionId.html)\[[Settings](SnapshotTestKit$$Settings.html)]

Source[PersistenceTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/PersistenceTestKit.scala#L407)Linear Supertypes[ExtensionId](../../../actor/ExtensionId.html)\[[Settings](SnapshotTestKit$$Settings.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Settings
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html)): [Settings](SnapshotTestKit$$Settings.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../../actor/ExtensionId.html)
5. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../../../actor/ActorSystem.html)): [Settings](SnapshotTestKit$$Settings.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../../actor/ExtensionId.html)
6. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#configPath:String "Permalink")  val configPath: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
9. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.persistence.testkit.scaladsl.SnapshotTestKit.Settings "Permalink")  def createExtension(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html)): [Settings](SnapshotTestKit$$Settings.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesSettings → [ExtensionId](../../../actor/ExtensionId.html)
10. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../../actor/ExtensionId.html) → AnyRef → Any
12. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#get(system:akka.actor.ActorSystem):akka.persistence.testkit.scaladsl.SnapshotTestKit.Settings "Permalink")  def get(system: [ActorSystem](../../../actor/ActorSystem.html)): [Settings](SnapshotTestKit$$Settings.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesSettings → [ExtensionId](../../../actor/ExtensionId.html)
13. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#get(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def get(system: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html)): [Settings](SnapshotTestKit$$Settings.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition Classes[ExtensionId](../../../actor/ExtensionId.html)
14. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../../actor/ExtensionId.html) → AnyRef → Any
16. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](../../../actor/ExtensionId.html)\[[Settings](SnapshotTestKit$$Settings.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/SnapshotTestKit$$Settings$.html)*
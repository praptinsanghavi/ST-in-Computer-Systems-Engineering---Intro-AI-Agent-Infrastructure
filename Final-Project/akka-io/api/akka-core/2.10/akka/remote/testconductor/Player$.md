---
description: Akka 2.10.17 - akka.remote.testconductor.Player
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/Player$.html
title: Akka 2.10.17 - akka.remote.testconductor.Player
---

# Akka 2.10.17 - akka.remote.testconductor.Player

> **Summary:** Akka 2.10.17 - akka.remote.testconductor.Player

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](index.html)Definition Classes[remote](../index.html)
- [Conductor](Conductor.html "The conductor is the one orchestrating the test: it governs the akka.remote.testconductor.Controller’s port to which all akka.remote.testconductor.Players connect, it issues commands to their akka.remote.testconductor.NetworkFailureInjector and provides support for barriers using the akka.remote.testconductor.BarrierCoordinator.")
- [Player](Player.html "The Player is the client component of the akka.remote.testconductor.TestConductorExt extension.")
- [RoleName](RoleName.html)
- [TestConductor](TestConductor$.html "Access to the akka.remote.testconductor.TestConductorExt extension:")
- [TestConductorExt](TestConductorExt.html "This binds together the akka.remote.testconductor.Conductor and akka.remote.testconductor.Player roles inside an Akka akka.actor.Extension.")
- [TestConductorProtocol](TestConductorProtocol.html)
[o](Player.html "See companion trait")[akka](../../index.html).[remote](../index.html).[testconductor](index.html)

# [Player](Player.html "See companion trait")[**](../../../akka/remote/testconductor/Player$.html "Permalink")

### Companion [trait Player](Player.html "See companion trait")

#### object Player

Source[Player.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testconductor/Player.scala#L41)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Player
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/remote/testconductor/Player$$Waiter.html "Permalink") final  class [Waiter](Player$$Waiter.html) extends [Actor](../../actor/Actor.html) with [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[UnboundedMessageQueueSemantics](../../dispatch/UnboundedMessageQueueSemantics.html)]
### Value Members

1. [**](../../../akka/remote/testconductor/Player$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testconductor/Player$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testconductor/Player$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/remote/testconductor/Player$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/remote/testconductor/Player$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/remote/testconductor/Player$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/remote/testconductor/Player$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/remote/testconductor/Player$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/remote/testconductor/Player$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/remote/testconductor/Player$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/remote/testconductor/Player$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/remote/testconductor/Player$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/remote/testconductor/Player$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/remote/testconductor/Player$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/remote/testconductor/Player$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/remote/testconductor/Player$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/remote/testconductor/Player$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/remote/testconductor/Player$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/remote/testconductor/Player$.html#waiterProps:akka.actor.Props "Permalink")  def waiterProps: [Props](../../actor/Props.html)
### Deprecated Value Members

1. [**](../../../akka/remote/testconductor/Player$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player$$Waiter.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player$.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player$.html)*
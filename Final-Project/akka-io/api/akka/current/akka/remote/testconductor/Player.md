---
description: Akka 2.10.17 - akka.remote.testconductor.Player
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/Player.html
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
- Player
- [RoleName](RoleName.html)
- [TestConductor](TestConductor$.html "Access to the akka.remote.testconductor.TestConductorExt extension:")
- [TestConductorExt](TestConductorExt.html "This binds together the akka.remote.testconductor.Conductor and akka.remote.testconductor.Player roles inside an Akka akka.actor.Extension.")
- [TestConductorProtocol](TestConductorProtocol.html)
[t](Player$.html "See companion object")[akka](../../index.html).[remote](../index.html).[testconductor](index.html)

# [Player](Player$.html "See companion object")[**](../../../akka/remote/testconductor/Player.html "Permalink")

### Companion [object Player](Player$.html "See companion object")

#### trait Player extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

The Player is the client component of the
[akka.remote.testconductor.TestConductorExt](TestConductorExt.html) extension. It registers with
the [akka.remote.testconductor.Conductor](Conductor.html)’s akka.remote.testconductor.Controller
in order to participate in barriers and enable network failure injection.

Self Type[TestConductorExt](TestConductorExt.html)Source[Player.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testconductor/Player.scala#L75)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[TestConductorExt](TestConductorExt.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Player
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

1. [**](../../../akka/remote/testconductor/Player.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testconductor/Player.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testconductor/Player.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Player toany2stringadd\[Player] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testconductor/Player.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Player, B)ImplicitThis member is added by an implicit conversion from Player toArrowAssoc\[Player] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testconductor/Player.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testconductor/Player.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/testconductor/Player.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/remote/testconductor/Player.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Player) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PlayerImplicitThis member is added by an implicit conversion from Player toEnsuring\[Player] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/remote/testconductor/Player.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Player) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PlayerImplicitThis member is added by an implicit conversion from Player toEnsuring\[Player] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/remote/testconductor/Player.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PlayerImplicitThis member is added by an implicit conversion from Player toEnsuring\[Player] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/testconductor/Player.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PlayerImplicitThis member is added by an implicit conversion from Player toEnsuring\[Player] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/testconductor/Player.html#enter(timeout:akka.util.Timeout,name:Seq[String]):Unit "Permalink")  def enter(timeout: [Timeout](../../util/Timeout.html), name: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Enter the named barriers, one after the other, in the order given.

Enter the named barriers, one after the other, in the order given. Will
throw an exception in case of timeouts or other errors.
13. [**](../../../akka/remote/testconductor/Player.html#enter(name:String*):Unit "Permalink")  def enter(name: String\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Enter the named barriers, one after the other, in the order given.

Enter the named barriers, one after the other, in the order given. Will
throw an exception in case of timeouts or other errors.
14. [**](../../../akka/remote/testconductor/Player.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/remote/testconductor/Player.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/remote/testconductor/Player.html#getAddressFor(name:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.actor.Address] "Permalink")  def getAddressFor(name: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Address](../../actor/Address.html)]Query remote transport address of named node.
17. [**](../../../akka/remote/testconductor/Player.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/remote/testconductor/Player.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/testconductor/Player.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/remote/testconductor/Player.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/remote/testconductor/Player.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/remote/testconductor/Player.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/remote/testconductor/Player.html#startClient(name:akka.remote.testconductor.RoleName,controllerAddr:java.net.InetSocketAddress):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def startClient(name: [RoleName](RoleName.html), controllerAddr: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Connect to the conductor on the given port (the host is taken from setting
`akka.testconductor.host`).

Connect to the conductor on the given port (the host is taken from setting
`akka.testconductor.host`). The connection is made asynchronously, but you
should await completion of the returned Future because that implies that
all expected participants of this test have successfully connected (i.e.
this is a first barrier in itself). The number of expected participants is
set in [akka.remote.testconductor.Conductor](Conductor.html)`.startController()`.
24. [**](../../../akka/remote/testconductor/Player.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/remote/testconductor/Player.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/remote/testconductor/Player.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/remote/testconductor/Player.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/remote/testconductor/Player.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testconductor/Player.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testconductor/Player.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Player toStringFormat\[Player] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testconductor/Player.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Player, B)ImplicitThis member is added by an implicit conversion from Player toArrowAssoc\[Player] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPlayer to any2stringadd\[Player]

### Inherited by implicit conversion StringFormat fromPlayer to StringFormat\[Player]

### Inherited by implicit conversion Ensuring fromPlayer to Ensuring\[Player]

### Inherited by implicit conversion ArrowAssoc fromPlayer to ArrowAssoc\[Player]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/Player$.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/Player.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka/current/akka/util/Timeout.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/testconductor/Player.html](https://doc.akka.io/api/akka/current/akka/remote/testconductor/Player.html)*
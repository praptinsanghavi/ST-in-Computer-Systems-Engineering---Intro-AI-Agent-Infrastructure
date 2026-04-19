---
description: Akka 2.10.17 - akka.remote.testconductor.TestConductorProtocol
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/TestConductorProtocol.html
title: Akka 2.10.17 - akka.remote.testconductor.TestConductorProtocol
---

# Akka 2.10.17 - akka.remote.testconductor.TestConductorProtocol

> **Summary:** Akka 2.10.17 - akka.remote.testconductor.TestConductorProtocol

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
- TestConductorProtocol
c[akka](../../index.html).[remote](../index.html).[testconductor](index.html)

# TestConductorProtocol[**](../../../akka/remote/testconductor/TestConductorProtocol.html "Permalink")

### 

#### final  class TestConductorProtocol extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[TestConductorProtocol.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/java/akka/remote/testconductor/TestConductorProtocol.java#L10)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestConductorProtocol
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

1. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testconductor/TestConductorProtocol.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestConductorProtocol toany2stringadd\[TestConductorProtocol] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestConductorProtocol, B)ImplicitThis member is added by an implicit conversion from TestConductorProtocol toArrowAssoc\[TestConductorProtocol] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestConductorProtocol) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestConductorProtocolImplicitThis member is added by an implicit conversion from TestConductorProtocol toEnsuring\[TestConductorProtocol] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestConductorProtocol) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestConductorProtocolImplicitThis member is added by an implicit conversion from TestConductorProtocol toEnsuring\[TestConductorProtocol] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestConductorProtocolImplicitThis member is added by an implicit conversion from TestConductorProtocol toEnsuring\[TestConductorProtocol] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestConductorProtocolImplicitThis member is added by an implicit conversion from TestConductorProtocol toEnsuring\[TestConductorProtocol] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestConductorProtocol toStringFormat\[TestConductorProtocol] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testconductor/TestConductorProtocol.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestConductorProtocol, B)ImplicitThis member is added by an implicit conversion from TestConductorProtocol toArrowAssoc\[TestConductorProtocol] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestConductorProtocol to any2stringadd\[TestConductorProtocol]

### Inherited by implicit conversion StringFormat fromTestConductorProtocol to StringFormat\[TestConductorProtocol]

### Inherited by implicit conversion Ensuring fromTestConductorProtocol to Ensuring\[TestConductorProtocol]

### Inherited by implicit conversion ArrowAssoc fromTestConductorProtocol to ArrowAssoc\[TestConductorProtocol]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.html)*
---
description: Akka 2.10.17 - akka.remote.testconductor.RoleName
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:19:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/RoleName.html
title: Akka 2.10.17 - akka.remote.testconductor.RoleName
---

# Akka 2.10.17 - akka.remote.testconductor.RoleName

> **Summary:** Akka 2.10.17 - akka.remote.testconductor.RoleName

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](index.html)Definition Classes[remote](../index.html)
- [Conductor](Conductor.html "The conductor is the one orchestrating the test: it governs the akka.remote.testconductor.Controller’s port to which all akka.remote.testconductor.Players connect, it issues commands to their akka.remote.testconductor.NetworkFailureInjector and provides support for barriers using the akka.remote.testconductor.BarrierCoordinator.")
- [Player](Player.html "The Player is the client component of the akka.remote.testconductor.TestConductorExt extension.")
- RoleName
- [TestConductor](TestConductor$.html "Access to the akka.remote.testconductor.TestConductorExt extension:")
- [TestConductorExt](TestConductorExt.html "This binds together the akka.remote.testconductor.Conductor and akka.remote.testconductor.Player roles inside an Akka akka.actor.Extension.")
- [TestConductorProtocol](TestConductorProtocol.html)
c[akka](../../index.html).[remote](../index.html).[testconductor](index.html)

# RoleName[**](../../../akka/remote/testconductor/RoleName.html "Permalink")

### 

#### final  case class RoleName(name: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[DataTypes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testconductor/DataTypes.scala#L18)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RoleName
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../akka/remote/testconductor/RoleName.html#<init>(name:String):akka.remote.testconductor.RoleName "Permalink")  new RoleName(name: String)
### Value Members

1. [**](../../../akka/remote/testconductor/RoleName.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testconductor/RoleName.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testconductor/RoleName.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RoleName toany2stringadd\[RoleName] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testconductor/RoleName.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RoleName, B)ImplicitThis member is added by an implicit conversion from RoleName toArrowAssoc\[RoleName] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testconductor/RoleName.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testconductor/RoleName.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/testconductor/RoleName.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/remote/testconductor/RoleName.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RoleName) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RoleNameImplicitThis member is added by an implicit conversion from RoleName toEnsuring\[RoleName] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/remote/testconductor/RoleName.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RoleName) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoleNameImplicitThis member is added by an implicit conversion from RoleName toEnsuring\[RoleName] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/remote/testconductor/RoleName.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RoleNameImplicitThis member is added by an implicit conversion from RoleName toEnsuring\[RoleName] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/testconductor/RoleName.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoleNameImplicitThis member is added by an implicit conversion from RoleName toEnsuring\[RoleName] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/testconductor/RoleName.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/remote/testconductor/RoleName.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/remote/testconductor/RoleName.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/remote/testconductor/RoleName.html#name:String "Permalink")  val name: String
16. [**](../../../akka/remote/testconductor/RoleName.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/remote/testconductor/RoleName.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/remote/testconductor/RoleName.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/testconductor/RoleName.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../akka/remote/testconductor/RoleName.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/remote/testconductor/RoleName.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/remote/testconductor/RoleName.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/remote/testconductor/RoleName.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testconductor/RoleName.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testconductor/RoleName.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RoleName toStringFormat\[RoleName] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testconductor/RoleName.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RoleName, B)ImplicitThis member is added by an implicit conversion from RoleName toArrowAssoc\[RoleName] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRoleName to any2stringadd\[RoleName]

### Inherited by implicit conversion StringFormat fromRoleName to StringFormat\[RoleName]

### Inherited by implicit conversion Ensuring fromRoleName to Ensuring\[RoleName]

### Inherited by implicit conversion ArrowAssoc fromRoleName to ArrowAssoc\[RoleName]

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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/RoleName.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/RoleName.html)*
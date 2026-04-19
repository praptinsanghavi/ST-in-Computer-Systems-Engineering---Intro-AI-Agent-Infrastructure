---
description: Akka 2.10.17 - akka.remote.testkit.SetThrottle
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testkit/SetThrottle.html
title: Akka 2.10.17 - akka.remote.testkit.SetThrottle
---

# Akka 2.10.17 - akka.remote.testkit.SetThrottle

> **Summary:** Akka 2.10.17 - akka.remote.testkit.SetThrottle

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[remote](../index.html)
- [Blackhole](Blackhole$.html)
- [Direction](Direction.html)
- [ForceDisassociate](ForceDisassociate.html "Management Command to force disassociation of an address.")
- [ForceDisassociateAck](ForceDisassociateAck$.html)
- [MultiNodeConfig](MultiNodeConfig.html "Configure the role names and participants of the test, including configuration settings.")
- [MultiNodeSpec](MultiNodeSpec.html "Note: To be able to run tests with everything ignored or excluded by tags you must not use testconductor, or helper methods that use testconductor, from the constructor of your test class.")
- [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec and call these methods or by creating a trait that calls them and then mixing that trait with your test together with MultiNodeSpec.")
- SetThrottle
- [SetThrottleAck](SetThrottleAck$.html)
- [ThrottleMode](ThrottleMode.html)
- [TokenBucket](TokenBucket.html)
- [Unthrottled](Unthrottled$.html)
c[akka](../../index.html).[remote](../index.html).[testkit](index.html)

# SetThrottle[**](../../../akka/remote/testkit/SetThrottle.html "Permalink")

### 

#### final  case class SetThrottle(address: [Address](../../actor/Address.html), direction: [Direction](Direction.html), mode: [ThrottleMode](ThrottleMode.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@SerialVersionUID() Source[TestTransportCommands.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/testkit/TestTransportCommands.scala#L76)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SetThrottle
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

1. [**](../../../akka/remote/testkit/SetThrottle.html#<init>(address:akka.actor.Address,direction:akka.remote.testkit.Direction,mode:akka.remote.testkit.ThrottleMode):akka.remote.testkit.SetThrottle "Permalink")  new SetThrottle(address: [Address](../../actor/Address.html), direction: [Direction](Direction.html), mode: [ThrottleMode](ThrottleMode.html))
### Value Members

1. [**](../../../akka/remote/testkit/SetThrottle.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testkit/SetThrottle.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testkit/SetThrottle.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SetThrottle toany2stringadd\[SetThrottle] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testkit/SetThrottle.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SetThrottle, B)ImplicitThis member is added by an implicit conversion from SetThrottle toArrowAssoc\[SetThrottle] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testkit/SetThrottle.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testkit/SetThrottle.html#address:akka.actor.Address "Permalink")  val address: [Address](../../actor/Address.html)
7. [**](../../../akka/remote/testkit/SetThrottle.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/remote/testkit/SetThrottle.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/remote/testkit/SetThrottle.html#direction:akka.remote.testkit.Direction "Permalink")  val direction: [Direction](Direction.html)
10. [**](../../../akka/remote/testkit/SetThrottle.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SetThrottle) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SetThrottleImplicitThis member is added by an implicit conversion from SetThrottle toEnsuring\[SetThrottle] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/testkit/SetThrottle.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SetThrottle) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SetThrottleImplicitThis member is added by an implicit conversion from SetThrottle toEnsuring\[SetThrottle] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/testkit/SetThrottle.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SetThrottleImplicitThis member is added by an implicit conversion from SetThrottle toEnsuring\[SetThrottle] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/remote/testkit/SetThrottle.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SetThrottleImplicitThis member is added by an implicit conversion from SetThrottle toEnsuring\[SetThrottle] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/remote/testkit/SetThrottle.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/remote/testkit/SetThrottle.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/remote/testkit/SetThrottle.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/remote/testkit/SetThrottle.html#mode:akka.remote.testkit.ThrottleMode "Permalink")  val mode: [ThrottleMode](ThrottleMode.html)
18. [**](../../../akka/remote/testkit/SetThrottle.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/remote/testkit/SetThrottle.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/remote/testkit/SetThrottle.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/remote/testkit/SetThrottle.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../akka/remote/testkit/SetThrottle.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/remote/testkit/SetThrottle.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/remote/testkit/SetThrottle.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/remote/testkit/SetThrottle.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testkit/SetThrottle.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testkit/SetThrottle.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SetThrottle toStringFormat\[SetThrottle] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testkit/SetThrottle.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SetThrottle, B)ImplicitThis member is added by an implicit conversion from SetThrottle toArrowAssoc\[SetThrottle] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSetThrottle to any2stringadd\[SetThrottle]

### Inherited by implicit conversion StringFormat fromSetThrottle to StringFormat\[SetThrottle]

### Inherited by implicit conversion Ensuring fromSetThrottle to Ensuring\[SetThrottle]

### Inherited by implicit conversion ArrowAssoc fromSetThrottle to ArrowAssoc\[SetThrottle]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Direction$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ForceDisassociateAck$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/SetThrottleAck$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ThrottleMode$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/SetThrottle.html](https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/SetThrottle.html)*
---
description: Akka 2.10.17 - akka.remote.testkit.Direction
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testkit/Direction.html
title: Akka 2.10.17 - akka.remote.testkit.Direction
---

# Akka 2.10.17 - akka.remote.testkit.Direction

> **Summary:** Akka 2.10.17 - akka.remote.testkit.Direction

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[remote](../index.html)
- [Blackhole](Blackhole$.html)
- Direction
- [ForceDisassociate](ForceDisassociate.html "Management Command to force disassociation of an address.")
- [ForceDisassociateAck](ForceDisassociateAck$.html)
- [MultiNodeConfig](MultiNodeConfig.html "Configure the role names and participants of the test, including configuration settings.")
- [MultiNodeSpec](MultiNodeSpec.html "Note: To be able to run tests with everything ignored or excluded by tags you must not use testconductor, or helper methods that use testconductor, from the constructor of your test class.")
- [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec and call these methods or by creating a trait that calls them and then mixing that trait with your test together with MultiNodeSpec.")
- [SetThrottle](SetThrottle.html)
- [SetThrottleAck](SetThrottleAck$.html)
- [ThrottleMode](ThrottleMode.html)
- [TokenBucket](TokenBucket.html)
- [Unthrottled](Unthrottled$.html)
[t](Direction$.html "See companion object")[akka](../../index.html).[remote](../index.html).[testkit](index.html)

# [Direction](Direction$.html "See companion object")[**](../../../akka/remote/testkit/Direction.html "Permalink")

### Companion [object Direction](Direction$.html "See companion object")

#### sealed  trait Direction extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[TestTransportCommands.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/testkit/TestTransportCommands.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Both](Direction$$Both$.html), [Receive](Direction$$Receive$.html), [Send](Direction$$Send$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Direction
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
### Abstract Value Members

1. [**](../../../akka/remote/testkit/Direction.html#includes(other:akka.remote.testkit.Direction):Boolean "Permalink") abstract  def includes(other: Direction): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
### Concrete Value Members

1. [**](../../../akka/remote/testkit/Direction.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testkit/Direction.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testkit/Direction.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Direction toany2stringadd\[Direction] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testkit/Direction.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Direction, B)ImplicitThis member is added by an implicit conversion from Direction toArrowAssoc\[Direction] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testkit/Direction.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testkit/Direction.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/testkit/Direction.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/remote/testkit/Direction.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Direction) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DirectionImplicitThis member is added by an implicit conversion from Direction toEnsuring\[Direction] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/remote/testkit/Direction.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Direction) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DirectionImplicitThis member is added by an implicit conversion from Direction toEnsuring\[Direction] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/remote/testkit/Direction.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DirectionImplicitThis member is added by an implicit conversion from Direction toEnsuring\[Direction] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/testkit/Direction.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DirectionImplicitThis member is added by an implicit conversion from Direction toEnsuring\[Direction] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/testkit/Direction.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/remote/testkit/Direction.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/remote/testkit/Direction.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/remote/testkit/Direction.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/remote/testkit/Direction.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/remote/testkit/Direction.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/remote/testkit/Direction.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/testkit/Direction.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/remote/testkit/Direction.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/remote/testkit/Direction.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/remote/testkit/Direction.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/remote/testkit/Direction.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/remote/testkit/Direction.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testkit/Direction.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testkit/Direction.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Direction toStringFormat\[Direction] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testkit/Direction.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Direction, B)ImplicitThis member is added by an implicit conversion from Direction toArrowAssoc\[Direction] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDirection to any2stringadd\[Direction]

### Inherited by implicit conversion StringFormat fromDirection to StringFormat\[Direction]

### Inherited by implicit conversion Ensuring fromDirection to Ensuring\[Direction]

### Inherited by implicit conversion ArrowAssoc fromDirection to ArrowAssoc\[Direction]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction$$Both$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction$$Receive$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction$$Send$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ForceDisassociateAck$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/SetThrottleAck$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ThrottleMode$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction.html](https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction.html)*
---
description: Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec.AwaitHelper
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:19:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testkit/MultiNodeSpec$AwaitHelper.html
title: Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec.AwaitHelper
---

# Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec.AwaitHelper

> **Summary:** Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec.AwaitHelper

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testkit/MultiNodeSpec.html "Permalink") abstract  class [MultiNodeSpec](MultiNodeSpec.html "Note: To be able to run tests with everything ignored or excluded by tags you must not use testconductor, or helper methods that use testconductor, from the constructor of your test class.") extends [TestKit](../../testkit/TestKit.html) with [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html)Note: To be able to run tests with everything ignored or excluded by tags
you must not use `testconductor`, or helper methods that use `testconductor`,
from the constructor of your test class.

Note: To be able to run tests with everything ignored or excluded by tags
you must not use `testconductor`, or helper methods that use `testconductor`,
from the constructor of your test class. Otherwise the controller node might
be shutdown before other nodes have completed and you will see errors like:
`AskTimeoutException: sending to terminated ref breaks promises`. Using lazy
val is fine.

Definition Classes[testkit](index.html)
- AwaitHelper
c[akka](../../index.html).[remote](../index.html).[testkit](index.html).[MultiNodeSpec](MultiNodeSpec.html)

# AwaitHelper[**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html "Permalink")

### 

#### class AwaitHelper\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[MultiNodeSpec.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testkit/MultiNodeSpec.scala#L338)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AwaitHelper
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
### Instance Constructors

1. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#<init>(w:scala.concurrent.Awaitable[T]):MultiNodeSpec.this.AwaitHelper[T] "Permalink")  new AwaitHelper(w: [Awaitable](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Awaitable.html#scala.concurrent.Awaitable)\[T])
### Value Members

1. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AwaitHelper\[T] toany2stringadd\[AwaitHelper\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AwaitHelper\[T], B)ImplicitThis member is added by an implicit conversion from AwaitHelper\[T] toArrowAssoc\[AwaitHelper\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#await:T "Permalink")  def await: T
8. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AwaitHelper\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AwaitHelper\[T]ImplicitThis member is added by an implicit conversion from AwaitHelper\[T] toEnsuring\[AwaitHelper\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AwaitHelper\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AwaitHelper\[T]ImplicitThis member is added by an implicit conversion from AwaitHelper\[T] toEnsuring\[AwaitHelper\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AwaitHelper\[T]ImplicitThis member is added by an implicit conversion from AwaitHelper\[T] toEnsuring\[AwaitHelper\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AwaitHelper\[T]ImplicitThis member is added by an implicit conversion from AwaitHelper\[T] toEnsuring\[AwaitHelper\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AwaitHelper\[T] toStringFormat\[AwaitHelper\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AwaitHelper\[T], B)ImplicitThis member is added by an implicit conversion from AwaitHelper\[T] toArrowAssoc\[AwaitHelper\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAwaitHelper\[T] to any2stringadd\[AwaitHelper\[T]]

### Inherited by implicit conversion StringFormat fromAwaitHelper\[T] to StringFormat\[AwaitHelper\[T]]

### Inherited by implicit conversion Ensuring fromAwaitHelper\[T] to Ensuring\[AwaitHelper\[T]]

### Inherited by implicit conversion ArrowAssoc fromAwaitHelper\[T] to ArrowAssoc\[AwaitHelper\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec$AwaitHelper.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec$AwaitHelper.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec$AwaitHelper.html)*
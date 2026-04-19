---
description: Akka 2.10.17 - akka.remote.FailureDetector.Clock
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/FailureDetector$$Clock.html
title: Akka 2.10.17 - akka.remote.FailureDetector.Clock
---

# Akka 2.10.17 - akka.remote.FailureDetector.Clock

> **Summary:** Akka 2.10.17 - akka.remote.FailureDetector.Clock

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/FailureDetector$.html "Permalink")  object [FailureDetector](FailureDetector$.html)Definition Classes[remote](index.html)
- Clock
c[akka](../index.html).[remote](index.html).[FailureDetector](FailureDetector$.html)

# Clock[**](../../akka/remote/FailureDetector$$Clock.html "Permalink")

### 

#### abstract  class Clock extends () \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)

Abstraction of a clock that returns time in milliseconds. Clock can only be used to measure elapsed
time and is not related to any other notion of system or wall\-clock time.

Source[FailureDetector.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/FailureDetector.scala#L41)Linear Supertypes() \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Clock
2. Function0
3. AnyRef
4. Any
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

1. [**](../../akka/remote/FailureDetector$$Clock.html#<init>():akka.remote.FailureDetector.Clock "Permalink")  new Clock()
### Abstract Value Members

1. [**](../../akka/remote/FailureDetector$$Clock.html#apply():R "Permalink") abstract  def apply(): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesFunction0
### Concrete Value Members

1. [**](../../akka/remote/FailureDetector$$Clock.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/remote/FailureDetector$$Clock.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/remote/FailureDetector$$Clock.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Clock toany2stringadd\[Clock] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/remote/FailureDetector$$Clock.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Clock, B)ImplicitThis member is added by an implicit conversion from Clock toArrowAssoc\[Clock] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/remote/FailureDetector$$Clock.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/remote/FailureDetector$$Clock.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/remote/FailureDetector$$Clock.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/remote/FailureDetector$$Clock.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Clock) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClockImplicitThis member is added by an implicit conversion from Clock toEnsuring\[Clock] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/remote/FailureDetector$$Clock.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Clock) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClockImplicitThis member is added by an implicit conversion from Clock toEnsuring\[Clock] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/remote/FailureDetector$$Clock.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClockImplicitThis member is added by an implicit conversion from Clock toEnsuring\[Clock] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/remote/FailureDetector$$Clock.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClockImplicitThis member is added by an implicit conversion from Clock toEnsuring\[Clock] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/remote/FailureDetector$$Clock.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/remote/FailureDetector$$Clock.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/remote/FailureDetector$$Clock.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/remote/FailureDetector$$Clock.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/remote/FailureDetector$$Clock.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/remote/FailureDetector$$Clock.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/remote/FailureDetector$$Clock.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/remote/FailureDetector$$Clock.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/remote/FailureDetector$$Clock.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/remote/FailureDetector$$Clock.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction0 → AnyRef → Any
22. [**](../../akka/remote/FailureDetector$$Clock.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/remote/FailureDetector$$Clock.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/remote/FailureDetector$$Clock.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/remote/FailureDetector$$Clock.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/remote/FailureDetector$$Clock.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Clock toStringFormat\[Clock] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/remote/FailureDetector$$Clock.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Clock, B)ImplicitThis member is added by an implicit conversion from Clock toArrowAssoc\[Clock] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from () \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClock to any2stringadd\[Clock]

### Inherited by implicit conversion StringFormat fromClock to StringFormat\[Clock]

### Inherited by implicit conversion Ensuring fromClock to Ensuring\[Clock]

### Inherited by implicit conversion ArrowAssoc fromClock to ArrowAssoc\[Clock]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector$$Clock.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector$.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/FailureDetector$$Clock.html](https://doc.akka.io/api/akka/current/akka/remote/FailureDetector$$Clock.html)*
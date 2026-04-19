---
description: Akka 2.10.17 - akka.stream.FanOutShape.Init
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:33:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape$$Init.html
title: Akka 2.10.17 - akka.stream.FanOutShape.Init
---

# Akka 2.10.17 - akka.stream.FanOutShape.Init

> **Summary:** Akka 2.10.17 - akka.stream.FanOutShape.Init

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/FanOutShape$.html "Permalink")  object [FanOutShape](FanOutShape$.html)Definition Classes[stream](index.html)
- Init
- [Name](FanOutShape$$Name.html)
- [Ports](FanOutShape$$Ports.html)
t[akka](../index.html).[stream](index.html).[FanOutShape](FanOutShape$.html)

# Init[**](../../akka/stream/FanOutShape$$Init.html "Permalink")

### 

#### sealed  trait Init\[I] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[FanOutShape.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/FanOutShape.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Name](FanOutShape$$Name.html), [Ports](FanOutShape$$Ports.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Init
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

1. [**](../../akka/stream/FanOutShape$$Init.html#inlet:akka.stream.Inlet[I] "Permalink") abstract  def inlet: [Inlet](Inlet.html)\[I]
2. [**](../../akka/stream/FanOutShape$$Init.html#name:String "Permalink") abstract  def name: String
3. [**](../../akka/stream/FanOutShape$$Init.html#outlets:Seq[akka.stream.Outlet[_]] "Permalink") abstract  def outlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Outlet](Outlet.html)\[\_]]
### Concrete Value Members

1. [**](../../akka/stream/FanOutShape$$Init.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/FanOutShape$$Init.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/FanOutShape$$Init.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Init\[I] toany2stringadd\[Init\[I]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/FanOutShape$$Init.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Init\[I], B)ImplicitThis member is added by an implicit conversion from Init\[I] toArrowAssoc\[Init\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/FanOutShape$$Init.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/FanOutShape$$Init.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/FanOutShape$$Init.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/FanOutShape$$Init.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Init\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Init\[I]ImplicitThis member is added by an implicit conversion from Init\[I] toEnsuring\[Init\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/FanOutShape$$Init.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Init\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Init\[I]ImplicitThis member is added by an implicit conversion from Init\[I] toEnsuring\[Init\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/FanOutShape$$Init.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Init\[I]ImplicitThis member is added by an implicit conversion from Init\[I] toEnsuring\[Init\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/FanOutShape$$Init.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Init\[I]ImplicitThis member is added by an implicit conversion from Init\[I] toEnsuring\[Init\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/FanOutShape$$Init.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/FanOutShape$$Init.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/stream/FanOutShape$$Init.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/FanOutShape$$Init.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/stream/FanOutShape$$Init.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/stream/FanOutShape$$Init.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/stream/FanOutShape$$Init.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/FanOutShape$$Init.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/FanOutShape$$Init.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/stream/FanOutShape$$Init.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/stream/FanOutShape$$Init.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/stream/FanOutShape$$Init.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/stream/FanOutShape$$Init.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/FanOutShape$$Init.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/FanOutShape$$Init.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Init\[I] toStringFormat\[Init\[I]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/FanOutShape$$Init.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Init\[I], B)ImplicitThis member is added by an implicit conversion from Init\[I] toArrowAssoc\[Init\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromInit\[I] to any2stringadd\[Init\[I]]

### Inherited by implicit conversion StringFormat fromInit\[I] to StringFormat\[Init\[I]]

### Inherited by implicit conversion Ensuring fromInit\[I] to Ensuring\[Init\[I]]

### Inherited by implicit conversion ArrowAssoc fromInit\[I] to ArrowAssoc\[Init\[I]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape$$Init.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape$$Name.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape$$Ports.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape$.html
- https://doc.akka.io/api/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/FanOutShape$$Init.html](https://doc.akka.io/api/akka/current/akka/stream/FanOutShape$$Init.html)*
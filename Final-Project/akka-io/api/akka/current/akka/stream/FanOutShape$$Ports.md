---
description: Akka 2.10.17 - akka.stream.FanOutShape.Ports
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:33:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape$$Ports.html
title: Akka 2.10.17 - akka.stream.FanOutShape.Ports
---

# Akka 2.10.17 - akka.stream.FanOutShape.Ports

> **Summary:** Akka 2.10.17 - akka.stream.FanOutShape.Ports

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/FanOutShape$.html "Permalink")  object [FanOutShape](FanOutShape$.html)Definition Classes[stream](index.html)
- [Init](FanOutShape$$Init.html)
- [Name](FanOutShape$$Name.html)
- Ports
c[akka](../index.html).[stream](index.html).[FanOutShape](FanOutShape$.html)

# Ports[**](../../akka/stream/FanOutShape$$Ports.html "Permalink")

### 

#### final  case class Ports\[I](inlet: [Inlet](Inlet.html)\[I], outlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Outlet](Outlet.html)\[\_]]) extends [Init](FanOutShape$$Init.html)\[I] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[FanOutShape.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/FanOutShape.scala#L20)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Init](FanOutShape$$Init.html)\[I], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Ports
2. Serializable
3. Product
4. Equals
5. Init
6. AnyRef
7. Any
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

1. [**](../../akka/stream/FanOutShape$$Ports.html#<init>(inlet:akka.stream.Inlet[I],outlets:Seq[akka.stream.Outlet[_]]):akka.stream.FanOutShape.Ports[I] "Permalink")  new Ports(inlet: [Inlet](Inlet.html)\[I], outlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Outlet](Outlet.html)\[\_]])
### Value Members

1. [**](../../akka/stream/FanOutShape$$Ports.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/FanOutShape$$Ports.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/FanOutShape$$Ports.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Ports\[I] toany2stringadd\[Ports\[I]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/FanOutShape$$Ports.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Ports\[I], B)ImplicitThis member is added by an implicit conversion from Ports\[I] toArrowAssoc\[Ports\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/FanOutShape$$Ports.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/FanOutShape$$Ports.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/FanOutShape$$Ports.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/FanOutShape$$Ports.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Ports\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Ports\[I]ImplicitThis member is added by an implicit conversion from Ports\[I] toEnsuring\[Ports\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/FanOutShape$$Ports.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Ports\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Ports\[I]ImplicitThis member is added by an implicit conversion from Ports\[I] toEnsuring\[Ports\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/FanOutShape$$Ports.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Ports\[I]ImplicitThis member is added by an implicit conversion from Ports\[I] toEnsuring\[Ports\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/FanOutShape$$Ports.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Ports\[I]ImplicitThis member is added by an implicit conversion from Ports\[I] toEnsuring\[Ports\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/FanOutShape$$Ports.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/FanOutShape$$Ports.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/FanOutShape$$Ports.html#inlet:akka.stream.Inlet[I] "Permalink")  val inlet: [Inlet](Inlet.html)\[I]Definition ClassesPorts → [Init](FanOutShape$$Init.html)
15. [**](../../akka/stream/FanOutShape$$Ports.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/stream/FanOutShape$$Ports.html#name:String "Permalink")  def name: StringDefinition ClassesPorts → [Init](FanOutShape$$Init.html)
17. [**](../../akka/stream/FanOutShape$$Ports.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/stream/FanOutShape$$Ports.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/FanOutShape$$Ports.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/FanOutShape$$Ports.html#outlets:Seq[akka.stream.Outlet[_]] "Permalink")  val outlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Outlet](Outlet.html)\[\_]]Definition ClassesPorts → [Init](FanOutShape$$Init.html)
21. [**](../../akka/stream/FanOutShape$$Ports.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../akka/stream/FanOutShape$$Ports.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/stream/FanOutShape$$Ports.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/stream/FanOutShape$$Ports.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/stream/FanOutShape$$Ports.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/FanOutShape$$Ports.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/FanOutShape$$Ports.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Ports\[I] toStringFormat\[Ports\[I]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/FanOutShape$$Ports.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Ports\[I], B)ImplicitThis member is added by an implicit conversion from Ports\[I] toArrowAssoc\[Ports\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Init](FanOutShape$$Init.html)\[I]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPorts\[I] to any2stringadd\[Ports\[I]]

### Inherited by implicit conversion StringFormat fromPorts\[I] to StringFormat\[Ports\[I]]

### Inherited by implicit conversion Ensuring fromPorts\[I] to Ensuring\[Ports\[I]]

### Inherited by implicit conversion ArrowAssoc fromPorts\[I] to ArrowAssoc\[Ports\[I]]

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
*Source: [https://doc.akka.io/api/akka/current/akka/stream/FanOutShape$$Ports.html](https://doc.akka.io/api/akka/current/akka/stream/FanOutShape$$Ports.html)*
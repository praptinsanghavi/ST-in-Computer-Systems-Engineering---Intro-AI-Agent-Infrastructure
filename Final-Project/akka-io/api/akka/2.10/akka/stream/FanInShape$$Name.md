---
description: Akka 2.10.17 - akka.stream.FanInShape.Name
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:00:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape$$Name.html
title: Akka 2.10.17 - akka.stream.FanInShape.Name
---

# Akka 2.10.17 - akka.stream.FanInShape.Name

> **Summary:** Akka 2.10.17 - akka.stream.FanInShape.Name

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/FanInShape$.html "Permalink")  object [FanInShape](FanInShape$.html)Definition Classes[stream](index.html)
- [Init](FanInShape$$Init.html)
- Name
- [Ports](FanInShape$$Ports.html)
c[akka](../index.html).[stream](index.html).[FanInShape](FanInShape$.html)

# Name[**](../../akka/stream/FanInShape$$Name.html "Permalink")

### 

#### final  case class Name\[O](name: String) extends [Init](FanInShape$$Init.html)\[O] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[FanInShape.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/FanInShape.scala#L16)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Init](FanInShape$$Init.html)\[O], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Name
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

1. [**](../../akka/stream/FanInShape$$Name.html#<init>(name:String):akka.stream.FanInShape.Name[O] "Permalink")  new Name(name: String)
### Value Members

1. [**](../../akka/stream/FanInShape$$Name.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/FanInShape$$Name.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/FanInShape$$Name.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Name\[O] toany2stringadd\[Name\[O]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/FanInShape$$Name.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Name\[O], B)ImplicitThis member is added by an implicit conversion from Name\[O] toArrowAssoc\[Name\[O]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/FanInShape$$Name.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/FanInShape$$Name.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/FanInShape$$Name.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/FanInShape$$Name.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Name\[O]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Name\[O]ImplicitThis member is added by an implicit conversion from Name\[O] toEnsuring\[Name\[O]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/FanInShape$$Name.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Name\[O]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Name\[O]ImplicitThis member is added by an implicit conversion from Name\[O] toEnsuring\[Name\[O]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/FanInShape$$Name.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Name\[O]ImplicitThis member is added by an implicit conversion from Name\[O] toEnsuring\[Name\[O]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/FanInShape$$Name.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Name\[O]ImplicitThis member is added by an implicit conversion from Name\[O] toEnsuring\[Name\[O]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/FanInShape$$Name.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/FanInShape$$Name.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/FanInShape$$Name.html#inlets:Seq[akka.stream.Inlet[_]] "Permalink")  def inlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inlet](Inlet.html)\[\_]]Definition ClassesName → [Init](FanInShape$$Init.html)
15. [**](../../akka/stream/FanInShape$$Name.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/stream/FanInShape$$Name.html#name:String "Permalink")  val name: StringDefinition ClassesName → [Init](FanInShape$$Init.html)
17. [**](../../akka/stream/FanInShape$$Name.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/stream/FanInShape$$Name.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/FanInShape$$Name.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/FanInShape$$Name.html#outlet:akka.stream.Outlet[O] "Permalink")  def outlet: [Outlet](Outlet.html)\[O]Definition ClassesName → [Init](FanInShape$$Init.html)
21. [**](../../akka/stream/FanInShape$$Name.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../akka/stream/FanInShape$$Name.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/stream/FanInShape$$Name.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/stream/FanInShape$$Name.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/stream/FanInShape$$Name.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/FanInShape$$Name.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/FanInShape$$Name.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Name\[O] toStringFormat\[Name\[O]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/FanInShape$$Name.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Name\[O], B)ImplicitThis member is added by an implicit conversion from Name\[O] toArrowAssoc\[Name\[O]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Init](FanInShape$$Init.html)\[O]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromName\[O] to any2stringadd\[Name\[O]]

### Inherited by implicit conversion StringFormat fromName\[O] to StringFormat\[Name\[O]]

### Inherited by implicit conversion Ensuring fromName\[O] to Ensuring\[Name\[O]]

### Inherited by implicit conversion ArrowAssoc fromName\[O] to ArrowAssoc\[Name\[O]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape$$Init.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape$$Name.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape$$Ports.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape$$Name.html](https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape$$Name.html)*
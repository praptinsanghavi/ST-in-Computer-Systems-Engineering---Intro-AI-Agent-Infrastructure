---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpCharsetRange.One
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange$$One.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpCharsetRange.One
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpCharsetRange.One

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpCharsetRange.One

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$.html "Permalink")  object [HttpCharsetRange](HttpCharsetRange$.html)Definition Classes[model](index.html)
- [\*](HttpCharsetRange$$$times.html)
- One
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[HttpCharsetRange](HttpCharsetRange$.html)

# One[**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html "Permalink")

### 

#### final  case class One(charset: [HttpCharset](HttpCharset.html), qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)) extends [HttpCharsetRange](HttpCharsetRange.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[HttpCharset.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpCharset.scala#L40)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [HttpCharsetRange](HttpCharsetRange.html), [WithQValue](WithQValue.html)\[[HttpCharsetRange](HttpCharsetRange.html)], ValueRenderable, ToStringRenderable, Renderable, [javadsl.model.HttpCharsetRange](../../javadsl/model/HttpCharsetRange.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. One
2. Serializable
3. Product
4. Equals
5. HttpCharsetRange
6. WithQValue
7. ValueRenderable
8. ToStringRenderable
9. Renderable
10. HttpCharsetRange
11. AnyRef
12. Any
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

1. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#<init>(charset:akka.http.scaladsl.model.HttpCharset,qValue:Float):akka.http.scaladsl.model.HttpCharsetRange.One "Permalink")  new One(charset: [HttpCharset](HttpCharset.html), qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float))
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from One toany2stringadd\[One] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (One, B)ImplicitThis member is added by an implicit conversion from One toArrowAssoc\[One] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#charset:akka.http.scaladsl.model.HttpCharset "Permalink")  val charset: [HttpCharset](HttpCharset.html)
8. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (One) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OneImplicitThis member is added by an implicit conversion from One toEnsuring\[One] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (One) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OneImplicitThis member is added by an implicit conversion from One toEnsuring\[One] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OneImplicitThis member is added by an implicit conversion from One toEnsuring\[One] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OneImplicitThis member is added by an implicit conversion from One toEnsuring\[One] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#matches(charset:akka.http.scaladsl.model.HttpCharset):Boolean "Permalink")  def matches(charset: [HttpCharset](HttpCharset.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOne → [HttpCharsetRange](HttpCharsetRange.html)
17. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#matches(charset:akka.http.javadsl.model.HttpCharset):Boolean "Permalink")  def matches(charset: [javadsl.model.HttpCharset](../../javadsl/model/HttpCharset.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Java API

Java API

Definition Classes[HttpCharsetRange](HttpCharsetRange.html) → [HttpCharsetRange](../../javadsl/model/HttpCharsetRange.html)
18. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#qValue:Float "Permalink")  val qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)The qValue for this range.

The qValue for this range.

Definition ClassesOne → [HttpCharsetRange](HttpCharsetRange.html) → [HttpCharsetRange](../../javadsl/model/HttpCharsetRange.html)
23. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesOne → Renderable
24. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
26. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#value:String "Permalink")  def value: StringDefinition ClassesValueRenderable
27. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#withQValue(qValue:Float):akka.http.scaladsl.model.HttpCharsetRange.One "Permalink")  def withQValue(qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): OneReturns a copy of this range with the given qValue.

Returns a copy of this range with the given qValue.

Definition ClassesOne → [WithQValue](WithQValue.html) → [HttpCharsetRange](../../javadsl/model/HttpCharsetRange.html)
31. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#withQValue(qValue:Double):T "Permalink")  def withQValue(qValue: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [HttpCharsetRange](HttpCharsetRange.html)truncates Double qValue to float and returns a new instance with this qValue set

truncates Double qValue to float and returns a new instance with this qValue set

Definition Classes[WithQValue](WithQValue.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from One toStringFormat\[One] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$$One.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (One, B)ImplicitThis member is added by an implicit conversion from One toArrowAssoc\[One] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [HttpCharsetRange](HttpCharsetRange.html)

### Inherited from [WithQValue](WithQValue.html)\[[HttpCharsetRange](HttpCharsetRange.html)]

### Inherited from ValueRenderable

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.HttpCharsetRange](../../javadsl/model/HttpCharsetRange.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOne to any2stringadd\[One]

### Inherited by implicit conversion StringFormat fromOne to StringFormat\[One]

### Inherited by implicit conversion Ensuring fromOne to Ensuring\[One]

### Inherited by implicit conversion ArrowAssoc fromOne to ArrowAssoc\[One]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$$$times$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$$$times.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$$One.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$$One.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$$One.html)*
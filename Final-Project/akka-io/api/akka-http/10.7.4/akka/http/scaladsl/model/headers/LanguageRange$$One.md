---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LanguageRange.One
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:45:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/LanguageRange$$One.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LanguageRange.One
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LanguageRange.One

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LanguageRange.One

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$.html "Permalink")  object [LanguageRange](LanguageRange$.html)Definition Classes[headers](index.html)
- [\*](LanguageRange$$$times.html)
- One
c[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html).[LanguageRange](LanguageRange$.html)

# One[**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html "Permalink")

### 

#### final  case class One(language: [Language](Language.html), qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)) extends [LanguageRange](LanguageRange.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[LanguageRange.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/LanguageRange.scala#L42)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [LanguageRange](LanguageRange.html), [WithQValue](../WithQValue.html)\[[LanguageRange](LanguageRange.html)], ValueRenderable, ToStringRenderable, Renderable, [javadsl.model.headers.LanguageRange](../../../javadsl/model/headers/LanguageRange.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. One
2. Serializable
3. Product
4. Equals
5. LanguageRange
6. WithQValue
7. ValueRenderable
8. ToStringRenderable
9. Renderable
10. LanguageRange
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

1. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#<init>(language:akka.http.scaladsl.model.headers.Language,qValue:Float):akka.http.scaladsl.model.headers.LanguageRange.One "Permalink")  new One(language: [Language](Language.html), qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float))
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from One toany2stringadd\[One] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (One, B)ImplicitThis member is added by an implicit conversion from One toArrowAssoc\[One] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (One) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OneImplicitThis member is added by an implicit conversion from One toEnsuring\[One] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (One) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OneImplicitThis member is added by an implicit conversion from One toEnsuring\[One] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OneImplicitThis member is added by an implicit conversion from One toEnsuring\[One] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OneImplicitThis member is added by an implicit conversion from One toEnsuring\[One] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#getSubTags():Iterable[String] "Permalink")  def getSubTags(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String]Definition Classes[LanguageRange](LanguageRange.html) → [LanguageRange](../../../javadsl/model/headers/LanguageRange.html)
15. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#language:akka.http.scaladsl.model.headers.Language "Permalink")  val language: [Language](Language.html)
17. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#matches(l:akka.http.scaladsl.model.headers.Language):Boolean "Permalink")  def matches(l: [Language](Language.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOne → [LanguageRange](LanguageRange.html)
18. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#matches(language:akka.http.javadsl.model.headers.Language):Boolean "Permalink")  def matches(language: [javadsl.model.headers.Language](../../../javadsl/model/headers/Language.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Java API

Java API

Definition Classes[LanguageRange](LanguageRange.html) → [LanguageRange](../../../javadsl/model/headers/LanguageRange.html)
19. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#primaryTag():String "Permalink")  def primaryTag(): StringDefinition ClassesOne → [LanguageRange](LanguageRange.html) → [LanguageRange](../../../javadsl/model/headers/LanguageRange.html)
23. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#qValue:Float "Permalink")  val qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)Definition ClassesOne → [LanguageRange](LanguageRange.html) → [LanguageRange](../../../javadsl/model/headers/LanguageRange.html)
25. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink") final  def render\[R \<: Rendering](r: R): r.typeDefinition Classes[LanguageRange](LanguageRange.html) → Renderable
26. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#subTags:Seq[String] "Permalink")  def subTags: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Definition ClassesOne → [LanguageRange](LanguageRange.html)
27. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
29. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#value:String "Permalink")  def value: StringDefinition ClassesValueRenderable
30. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#withQValue(qValue:Float):akka.http.scaladsl.model.headers.LanguageRange.One "Permalink")  def withQValue(qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): OneDefinition ClassesOne → [WithQValue](../WithQValue.html) → [LanguageRange](../../../javadsl/model/headers/LanguageRange.html)
34. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#withQValue(qValue:Double):T "Permalink")  def withQValue(qValue: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [LanguageRange](LanguageRange.html)truncates Double qValue to float and returns a new instance with this qValue set

truncates Double qValue to float and returns a new instance with this qValue set

Definition Classes[WithQValue](../WithQValue.html)
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from One toStringFormat\[One] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/headers/LanguageRange$$One.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (One, B)ImplicitThis member is added by an implicit conversion from One toArrowAssoc\[One] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [LanguageRange](LanguageRange.html)

### Inherited from [WithQValue](../WithQValue.html)\[[LanguageRange](LanguageRange.html)]

### Inherited from ValueRenderable

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.headers.LanguageRange](../../../javadsl/model/headers/LanguageRange.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOne to any2stringadd\[One]

### Inherited by implicit conversion StringFormat fromOne to StringFormat\[One]

### Inherited by implicit conversion Ensuring fromOne to Ensuring\[One]

### Inherited by implicit conversion ArrowAssoc fromOne to ArrowAssoc\[One]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Language.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/LanguageRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Language.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange$$$times$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange$$$times.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange$$One.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange$$One.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange$$One.html)*
---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaRanges.PredefinedMediaRange
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaRanges.PredefinedMediaRange
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaRanges.PredefinedMediaRange

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaRanges.PredefinedMediaRange

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/MediaRanges$.html "Permalink")  object [MediaRanges](MediaRanges$.html) extends ObjectRegistry\[String, [MediaRange](MediaRange.html)]Definition Classes[model](index.html)
- PredefinedMediaRange
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[MediaRanges](MediaRanges$.html)

# PredefinedMediaRange[**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html "Permalink")

### 

#### sealed abstract  case class PredefinedMediaRange extends [MediaRange](MediaRange.html) with LazyValueBytesRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[MediaRange.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/MediaRange.scala#L115)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), LazyValueBytesRenderable, [MediaRange](MediaRange.html), [WithQValue](WithQValue.html)\[[MediaRange](MediaRange.html)], Renderable, [javadsl.model.MediaRange](../../javadsl/model/MediaRange.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PredefinedMediaRange
2. Serializable
3. Product
4. Equals
5. LazyValueBytesRenderable
6. MediaRange
7. WithQValue
8. Renderable
9. MediaRange
10. AnyRef
11. Any
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

1. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#matches(mediaType:akka.http.scaladsl.model.MediaType):Boolean "Permalink") abstract  def matches(mediaType: [MediaType](MediaType.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PredefinedMediaRange toany2stringadd\[PredefinedMediaRange] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PredefinedMediaRange, B)ImplicitThis member is added by an implicit conversion from PredefinedMediaRange toArrowAssoc\[PredefinedMediaRange] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PredefinedMediaRange) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PredefinedMediaRangeImplicitThis member is added by an implicit conversion from PredefinedMediaRange toEnsuring\[PredefinedMediaRange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PredefinedMediaRange) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PredefinedMediaRangeImplicitThis member is added by an implicit conversion from PredefinedMediaRange toEnsuring\[PredefinedMediaRange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PredefinedMediaRangeImplicitThis member is added by an implicit conversion from PredefinedMediaRange toEnsuring\[PredefinedMediaRange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PredefinedMediaRangeImplicitThis member is added by an implicit conversion from PredefinedMediaRange toEnsuring\[PredefinedMediaRange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#getParams():java.util.Map[String,String] "Permalink")  def getParams(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]Java API

Java API

Definition Classes[MediaRange](MediaRange.html) → [MediaRange](../../javadsl/model/MediaRange.html)
15. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isApplication:Boolean "Permalink")  def isApplication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
16. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isAudio:Boolean "Permalink")  def isAudio: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
17. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isImage:Boolean "Permalink")  def isImage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
18. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isMessage:Boolean "Permalink")  def isMessage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
20. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isMultipart:Boolean "Permalink")  def isMultipart: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
21. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isText:Boolean "Permalink")  def isText: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
22. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isVideo:Boolean "Permalink")  def isVideo: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
23. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#isWildcard:Boolean "Permalink")  def isWildcard: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaRange](MediaRange.html)
24. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#mainType:String "Permalink")  val mainType: StringReturns the main\-type this media\-range matches.
25. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#matches(mediaType:akka.http.javadsl.model.MediaType):Boolean "Permalink")  def matches(mediaType: [javadsl.model.MediaType](../../javadsl/model/MediaType.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Java API

Java API

Definition Classes[MediaRange](MediaRange.html) → [MediaRange](../../javadsl/model/MediaRange.html)
26. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#params:scala.collection.immutable.Map[String,Nothing] "Permalink")  def params: [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[String, [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]Definition ClassesPredefinedMediaRange → [MediaRange](MediaRange.html)
30. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
31. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#qValue():Float "Permalink")  def qValue(): [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)Returns the qValue of this media\-range.

Returns the qValue of this media\-range.

Definition ClassesPredefinedMediaRange → [MediaRange](MediaRange.html) → [MediaRange](../../javadsl/model/MediaRange.html)
32. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesLazyValueBytesRenderable → Renderable
33. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#toString():String "Permalink")  def toString(): StringDefinition ClassesLazyValueBytesRenderable → AnyRef → Any
35. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#value:String "Permalink")  val value: StringDefinition ClassesPredefinedMediaRange → LazyValueBytesRenderable → [MediaRange](MediaRange.html)
36. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
38. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#withCharsetRange(charsetRange:akka.http.scaladsl.model.HttpCharsetRange):akka.http.scaladsl.model.ContentTypeRange "Permalink")  def withCharsetRange(charsetRange: [HttpCharsetRange](HttpCharsetRange.html)): [ContentTypeRange](ContentTypeRange.html)Constructs a `ContentTypeRange` from this instance and the given charset.

Constructs a `ContentTypeRange` from this instance and the given charset.

Definition Classes[MediaRange](MediaRange.html)
40. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#withParams(params:Map[String,String]):akka.http.scaladsl.model.MediaRange "Permalink")  def withParams(params: Map\[String, String]): [MediaRange](MediaRange.html)Returns a copy of this instance with the params replaced by the given ones.

Returns a copy of this instance with the params replaced by the given ones.
If the given map contains a "q" value the `qValue` member is (also) updated.

Definition ClassesPredefinedMediaRange → [MediaRange](MediaRange.html)
41. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#withQValue(qValue:Float):akka.http.scaladsl.model.MediaRange "Permalink")  def withQValue(qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [MediaRange](MediaRange.html)Returns a copy of this instance with a changed qValue.

Returns a copy of this instance with a changed qValue.

Definition ClassesPredefinedMediaRange → [WithQValue](WithQValue.html) → [MediaRange](../../javadsl/model/MediaRange.html)
42. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#withQValue(qValue:Double):T "Permalink")  def withQValue(qValue: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [MediaRange](MediaRange.html)truncates Double qValue to float and returns a new instance with this qValue set

truncates Double qValue to float and returns a new instance with this qValue set

Definition Classes[WithQValue](WithQValue.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PredefinedMediaRange toStringFormat\[PredefinedMediaRange] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PredefinedMediaRange, B)ImplicitThis member is added by an implicit conversion from PredefinedMediaRange toArrowAssoc\[PredefinedMediaRange] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from LazyValueBytesRenderable

### Inherited from [MediaRange](MediaRange.html)

### Inherited from [WithQValue](WithQValue.html)\[[MediaRange](MediaRange.html)]

### Inherited from Renderable

### Inherited from [javadsl.model.MediaRange](../../javadsl/model/MediaRange.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPredefinedMediaRange to any2stringadd\[PredefinedMediaRange]

### Inherited by implicit conversion StringFormat fromPredefinedMediaRange to StringFormat\[PredefinedMediaRange]

### Inherited by implicit conversion Ensuring fromPredefinedMediaRange to Ensuring\[PredefinedMediaRange]

### Inherited by implicit conversion ArrowAssoc fromPredefinedMediaRange to ArrowAssoc\[PredefinedMediaRange]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRanges$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRanges$$PredefinedMediaRange.html)*
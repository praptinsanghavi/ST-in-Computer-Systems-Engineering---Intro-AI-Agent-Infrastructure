---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.ByteRange.Suffix
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/ByteRange$$Suffix.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.ByteRange.Suffix
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.ByteRange.Suffix

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.ByteRange.Suffix

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$.html "Permalink")  object [ByteRange](ByteRange$.html)Definition Classes[headers](index.html)
- [FromOffset](ByteRange$$FromOffset.html)
- [Slice](ByteRange$$Slice.html)
- Suffix
c[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html).[ByteRange](ByteRange$.html)

# Suffix[**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html "Permalink")

### 

#### final  case class Suffix(length: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [ByteRange](ByteRange.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Used to specify the last `length` bytes of an entity. If the entity is shorter than the given `length`, then the
range spans the entire entity.

Source[ByteRange.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/ByteRange.scala#L65)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ByteRange](ByteRange.html), ValueRenderable, ToStringRenderable, Renderable, [javadsl.model.headers.ByteRange](../../../javadsl/model/headers/ByteRange.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Suffix
2. Serializable
3. Product
4. Equals
5. ByteRange
6. ValueRenderable
7. ToStringRenderable
8. Renderable
9. ByteRange
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
### Instance Constructors

1. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#<init>(length:Long):akka.http.scaladsl.model.headers.ByteRange.Suffix "Permalink")  new Suffix(length: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Suffix toany2stringadd\[Suffix] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Suffix, B)ImplicitThis member is added by an implicit conversion from Suffix toArrowAssoc\[Suffix] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Suffix) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SuffixImplicitThis member is added by an implicit conversion from Suffix toEnsuring\[Suffix] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Suffix) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SuffixImplicitThis member is added by an implicit conversion from Suffix toEnsuring\[Suffix] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SuffixImplicitThis member is added by an implicit conversion from Suffix toEnsuring\[Suffix] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SuffixImplicitThis member is added by an implicit conversion from Suffix toEnsuring\[Suffix] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#getOffset():java.util.OptionalLong "Permalink")  def getOffset(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

Definition Classes[ByteRange](ByteRange.html) → [ByteRange](../../../javadsl/model/headers/ByteRange.html)
15. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#getSliceFirst():java.util.OptionalLong "Permalink")  def getSliceFirst(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

Definition Classes[ByteRange](ByteRange.html) → [ByteRange](../../../javadsl/model/headers/ByteRange.html)
16. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#getSliceLast():java.util.OptionalLong "Permalink")  def getSliceLast(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

Definition Classes[ByteRange](ByteRange.html) → [ByteRange](../../../javadsl/model/headers/ByteRange.html)
17. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#getSuffixLength():java.util.OptionalLong "Permalink")  def getSuffixLength(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

Definition ClassesSuffix → [ByteRange](ByteRange.html) → [ByteRange](../../../javadsl/model/headers/ByteRange.html)
18. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#isFromOffset():Boolean "Permalink")  def isFromOffset(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Java API

Java API

Definition Classes[ByteRange](ByteRange.html) → [ByteRange](../../../javadsl/model/headers/ByteRange.html)
19. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#isSlice():Boolean "Permalink")  def isSlice(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Java API

Java API

Definition Classes[ByteRange](ByteRange.html) → [ByteRange](../../../javadsl/model/headers/ByteRange.html)
21. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#isSuffix():Boolean "Permalink")  def isSuffix(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Java API

Java API

Definition ClassesSuffix → [ByteRange](ByteRange.html) → [ByteRange](../../../javadsl/model/headers/ByteRange.html)
22. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#length:Long "Permalink")  val length: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
23. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
27. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesSuffix → Renderable
28. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
30. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#value:String "Permalink")  def value: StringDefinition ClassesValueRenderable
31. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Suffix toStringFormat\[Suffix] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/headers/ByteRange$$Suffix.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Suffix, B)ImplicitThis member is added by an implicit conversion from Suffix toArrowAssoc\[Suffix] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ByteRange](ByteRange.html)

### Inherited from ValueRenderable

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.headers.ByteRange](../../../javadsl/model/headers/ByteRange.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSuffix to any2stringadd\[Suffix]

### Inherited by implicit conversion StringFormat fromSuffix to StringFormat\[Suffix]

### Inherited by implicit conversion Ensuring fromSuffix to Ensuring\[Suffix]

### Inherited by implicit conversion ArrowAssoc fromSuffix to ArrowAssoc\[Suffix]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange$$FromOffset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange$$Slice.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange$$Suffix.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange$$Suffix.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange$$Suffix.html)*
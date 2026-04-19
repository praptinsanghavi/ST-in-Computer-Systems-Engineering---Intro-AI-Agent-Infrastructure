---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ContentType.WithMissingCharset
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType$$WithMissingCharset.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ContentType.WithMissingCharset
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.ContentType.WithMissingCharset

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.ContentType.WithMissingCharset

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/ContentType$.html "Permalink")  object [ContentType](ContentType$.html)Definition Classes[model](index.html)
- [Binary](ContentType$$Binary.html "Represents a content-type which we know not to contain text (will never have have a charset)")
- [NonBinary](ContentType$$NonBinary.html "Represents a content-type which we know to contain text, and has a specified charset.")
- [WithCharset](ContentType$$WithCharset.html "Represents a content-type which we know to contain text, and the charset is known at runtime.")
- [WithFixedCharset](ContentType$$WithFixedCharset.html "Represents a content-type which we know to contain text, where the charset always has the same predefined value.")
- WithMissingCharset
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[ContentType](ContentType$.html)

# WithMissingCharset[**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html "Permalink")

### 

#### final  case class WithMissingCharset(mediaType: [WithOpenCharset](MediaType$$WithOpenCharset.html)) extends [javadsl.model.ContentType.WithMissingCharset](../../javadsl/model/ContentType$$WithMissingCharset.html) with [ContentType](ContentType.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Represents a content\-type which we know to contain text, and would be better off having a charset,
but the client or server hasn't provided that. For example, "text/xml" without a charset parameter.

Source[ContentType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/ContentType.scala#L96)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ContentType](ContentType.html), ValueRenderable, ToStringRenderable, Renderable, [javadsl.model.ContentType.WithMissingCharset](../../javadsl/model/ContentType$$WithMissingCharset.html), [javadsl.model.ContentType](../../javadsl/model/ContentType.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WithMissingCharset
2. Serializable
3. Product
4. Equals
5. ContentType
6. ValueRenderable
7. ToStringRenderable
8. Renderable
9. WithMissingCharset
10. ContentType
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

1. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#<init>(mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset):akka.http.scaladsl.model.ContentType.WithMissingCharset "Permalink")  new WithMissingCharset(mediaType: [WithOpenCharset](MediaType$$WithOpenCharset.html))
### Value Members

1. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WithMissingCharset toany2stringadd\[WithMissingCharset] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WithMissingCharset, B)ImplicitThis member is added by an implicit conversion from WithMissingCharset toArrowAssoc\[WithMissingCharset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#binary:Boolean "Permalink")  def binary: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)True if this ContentType is non\-textual.

True if this ContentType is non\-textual.

Definition ClassesWithMissingCharset → [ContentType](../../javadsl/model/ContentType.html)
8. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#charsetOption:None.type "Permalink")  def charsetOption: [None](https://www.scala-lang.org/api/2.13.17/scala/None$.html#scala.None)Definition ClassesWithMissingCharset → [ContentType](ContentType.html)
9. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WithMissingCharset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WithMissingCharsetImplicitThis member is added by an implicit conversion from WithMissingCharset toEnsuring\[WithMissingCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WithMissingCharset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithMissingCharsetImplicitThis member is added by an implicit conversion from WithMissingCharset toEnsuring\[WithMissingCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WithMissingCharsetImplicitThis member is added by an implicit conversion from WithMissingCharset toEnsuring\[WithMissingCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithMissingCharsetImplicitThis member is added by an implicit conversion from WithMissingCharset toEnsuring\[WithMissingCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#getCharsetOption:java.util.Optional[akka.http.javadsl.model.HttpCharset] "Permalink")  def getCharsetOption: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[javadsl.model.HttpCharset](../../javadsl/model/HttpCharset.html)]Java API

Java API

Definition Classes[ContentType](ContentType.html) → [ContentType](../../javadsl/model/ContentType.html)
16. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val mediaType: [WithOpenCharset](MediaType$$WithOpenCharset.html)The media\-type of this content\-type.

The media\-type of this content\-type.

Definition ClassesWithMissingCharset → [ContentType](ContentType.html) → [ContentType](../../javadsl/model/ContentType.html)
19. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#toString():String "Permalink")  def toString(): StringDefinition Classes[ContentType](ContentType.html) → ToStringRenderable → AnyRef → Any
25. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#value:String "Permalink")  def value: StringDefinition ClassesValueRenderable
26. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WithMissingCharset toStringFormat\[WithMissingCharset] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/ContentType$$WithMissingCharset.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WithMissingCharset, B)ImplicitThis member is added by an implicit conversion from WithMissingCharset toArrowAssoc\[WithMissingCharset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ContentType](ContentType.html)

### Inherited from ValueRenderable

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.ContentType.WithMissingCharset](../../javadsl/model/ContentType$$WithMissingCharset.html)

### Inherited from [javadsl.model.ContentType](../../javadsl/model/ContentType.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWithMissingCharset to any2stringadd\[WithMissingCharset]

### Inherited by implicit conversion StringFormat fromWithMissingCharset to StringFormat\[WithMissingCharset]

### Inherited by implicit conversion Ensuring fromWithMissingCharset to Ensuring\[WithMissingCharset]

### Inherited by implicit conversion ArrowAssoc fromWithMissingCharset to ArrowAssoc\[WithMissingCharset]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$WithMissingCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$Binary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$WithCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$WithMissingCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$WithOpenCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$WithMissingCharset.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$WithMissingCharset.html)*
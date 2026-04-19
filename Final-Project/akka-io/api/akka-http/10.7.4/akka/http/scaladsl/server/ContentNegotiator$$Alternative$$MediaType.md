---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.ContentNegotiator.Alternative.MediaType
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.ContentNegotiator.Alternative.MediaType
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.ContentNegotiator.Alternative.MediaType

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.ContentNegotiator.Alternative.MediaType

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/ContentNegotiator$.html "Permalink")  object [ContentNegotiator](ContentNegotiator$.html)Definition Classes[server](index.html)
- [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$.html "Permalink")  object [Alternative](ContentNegotiator$$Alternative$.html)Definition Classes[ContentNegotiator](ContentNegotiator$.html)
- [ContentType](ContentNegotiator$$Alternative$$ContentType.html)
- MediaType
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[ContentNegotiator](ContentNegotiator$.html).[Alternative](ContentNegotiator$$Alternative$.html)

# MediaType[**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html "Permalink")

### 

#### final  case class MediaType(mediaType: [WithOpenCharset](../model/MediaType$$WithOpenCharset.html)) extends [Alternative](ContentNegotiator$$Alternative.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[ContentNegotation.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/ContentNegotation.scala#L146)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Alternative](ContentNegotiator$$Alternative.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MediaType
2. Serializable
3. Product
4. Equals
5. Alternative
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

1. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#<init>(mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset):akka.http.scaladsl.server.ContentNegotiator.Alternative.MediaType "Permalink")  new MediaType(mediaType: [WithOpenCharset](../model/MediaType$$WithOpenCharset.html))
### Value Members

1. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MediaType toany2stringadd\[MediaType] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MediaType, B)ImplicitThis member is added by an implicit conversion from MediaType toArrowAssoc\[MediaType] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MediaType) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MediaTypeImplicitThis member is added by an implicit conversion from MediaType toEnsuring\[MediaType] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MediaType) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MediaTypeImplicitThis member is added by an implicit conversion from MediaType toEnsuring\[MediaType] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MediaTypeImplicitThis member is added by an implicit conversion from MediaType toEnsuring\[MediaType] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MediaTypeImplicitThis member is added by an implicit conversion from MediaType toEnsuring\[MediaType] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#format:String "Permalink")  def format: StringDefinition ClassesMediaType → [Alternative](ContentNegotiator$$Alternative.html)
14. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val mediaType: [WithOpenCharset](../model/MediaType$$WithOpenCharset.html)Definition ClassesMediaType → [Alternative](ContentNegotiator$$Alternative.html)
17. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MediaType toStringFormat\[MediaType] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MediaType, B)ImplicitThis member is added by an implicit conversion from MediaType toArrowAssoc\[MediaType] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Alternative](ContentNegotiator$$Alternative.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMediaType to any2stringadd\[MediaType]

### Inherited by implicit conversion StringFormat fromMediaType to StringFormat\[MediaType]

### Inherited by implicit conversion Ensuring fromMediaType to Ensuring\[MediaType]

### Inherited by implicit conversion ArrowAssoc fromMediaType to ArrowAssoc\[MediaType]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$WithOpenCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html)*
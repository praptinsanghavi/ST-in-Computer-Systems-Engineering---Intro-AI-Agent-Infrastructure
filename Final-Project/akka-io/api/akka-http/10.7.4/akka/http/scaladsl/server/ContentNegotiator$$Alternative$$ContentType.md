---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.ContentNegotiator.Alternative.ContentType
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.ContentNegotiator.Alternative.ContentType
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.ContentNegotiator.Alternative.ContentType

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.ContentNegotiator.Alternative.ContentType

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/ContentNegotiator$.html "Permalink")  object [ContentNegotiator](ContentNegotiator$.html)Definition Classes[server](index.html)
- [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$.html "Permalink")  object [Alternative](ContentNegotiator$$Alternative$.html)Definition Classes[ContentNegotiator](ContentNegotiator$.html)
- ContentType
- [MediaType](ContentNegotiator$$Alternative$$MediaType.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[ContentNegotiator](ContentNegotiator$.html).[Alternative](ContentNegotiator$$Alternative$.html)

# ContentType[**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html "Permalink")

### 

#### final  case class ContentType(contentType: [model.ContentType](../model/ContentType.html)) extends [Alternative](ContentNegotiator$$Alternative.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[ContentNegotation.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/ContentNegotation.scala#L142)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Alternative](ContentNegotiator$$Alternative.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ContentType
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

1. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#<init>(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.server.ContentNegotiator.Alternative.ContentType "Permalink")  new ContentType(contentType: [model.ContentType](../model/ContentType.html))
### Value Members

1. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ContentType toany2stringadd\[ContentType] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ContentType, B)ImplicitThis member is added by an implicit conversion from ContentType toArrowAssoc\[ContentType] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#contentType:akka.http.scaladsl.model.ContentType "Permalink")  val contentType: [model.ContentType](../model/ContentType.html)
9. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ContentType) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ContentTypeImplicitThis member is added by an implicit conversion from ContentType toEnsuring\[ContentType] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ContentType) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ContentTypeImplicitThis member is added by an implicit conversion from ContentType toEnsuring\[ContentType] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ContentTypeImplicitThis member is added by an implicit conversion from ContentType toEnsuring\[ContentType] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ContentTypeImplicitThis member is added by an implicit conversion from ContentType toEnsuring\[ContentType] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#format:String "Permalink")  def format: StringDefinition ClassesContentType → [Alternative](ContentNegotiator$$Alternative.html)
15. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#mediaType:akka.http.scaladsl.model.MediaType "Permalink")  def mediaType: [model.MediaType](../model/MediaType.html)Definition ClassesContentType → [Alternative](ContentNegotiator$$Alternative.html)
18. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ContentType toStringFormat\[ContentType] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ContentType, B)ImplicitThis member is added by an implicit conversion from ContentType toArrowAssoc\[ContentType] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Alternative](ContentNegotiator$$Alternative.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromContentType to any2stringadd\[ContentType]

### Inherited by implicit conversion StringFormat fromContentType to StringFormat\[ContentType]

### Inherited by implicit conversion Ensuring fromContentType to Ensuring\[ContentType]

### Inherited by implicit conversion ArrowAssoc fromContentType to ArrowAssoc\[ContentType]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$$Alternative$$ContentType.html)*
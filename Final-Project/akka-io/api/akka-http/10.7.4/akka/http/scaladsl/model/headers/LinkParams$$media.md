---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LinkParams.media
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/LinkParams$$media.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LinkParams.media
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LinkParams.media

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LinkParams.media

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$.html "Permalink")  object [LinkParams](LinkParams$.html)Definition Classes[headers](index.html)
- [anchor](LinkParams$$anchor.html "For a more detailed breakdown of the anchor link parameter, see http://tools.ietf.org/html/rfc5988#section-5.2")
- [hreflang](LinkParams$$hreflang.html "For a more detailed breakdown of the dereferenced language hint link parameter http://tools.ietf.org/html/rfc5988#section-5.4")
- media
- [rel](LinkParams$$rel.html "This can be either a bare word, an absolute URI, or a quoted, space-separated string of zero-or-more of either")
- [rev](LinkParams$$rev.html "This can be either a bare word, an absolute URI, or a quoted, space-separated string of zero-or-more of either.")
- [title](LinkParams$$title.html "For a more detailed breakdown of how to use the dereferenced language hint link parameter, see http://tools.ietf.org/html/rfc5988#section-5.4")
- [title\*](LinkParams$$title$times.html "For a more detailed breakdown of how to use the dereferenced language hint link parameter, see http://tools.ietf.org/html/rfc5988#section-5.4")
- [type](LinkParams$$type.html "For a more detailed breakdown of how to use the dereferenced language hint link parameter, see http://tools.ietf.org/html/rfc5988#section-5.4")
c[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html).[LinkParams](LinkParams$.html)

# media[**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html "Permalink")

### 

#### final  case class media(desc: String) extends [LinkParam](LinkParam.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

For a more detailed breakdown of how to use the dereferenced language hint link parameter, see
http://tools.ietf.org/html/rfc5988\#section\-5\.4

Source[LinkValue.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/LinkValue.scala#L104)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [LinkParam](LinkParam.html), ToStringRenderable, Renderable, [javadsl.model.headers.LinkParam](../../../javadsl/model/headers/LinkParam.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. media
2. Serializable
3. Product
4. Equals
5. LinkParam
6. ToStringRenderable
7. Renderable
8. LinkParam
9. AnyRef
10. Any
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

1. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#<init>(desc:String):akka.http.scaladsl.model.headers.LinkParams.media "Permalink")  new media(desc: String)
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from media toany2stringadd\[media] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (media, B)ImplicitThis member is added by an implicit conversion from media toArrowAssoc\[media] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#desc:String "Permalink")  val desc: String
9. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (media) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): mediaImplicitThis member is added by an implicit conversion from media toEnsuring\[media] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (media) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): mediaImplicitThis member is added by an implicit conversion from media toEnsuring\[media] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): mediaImplicitThis member is added by an implicit conversion from media toEnsuring\[media] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): mediaImplicitThis member is added by an implicit conversion from media toEnsuring\[media] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#key:String "Permalink")  val key: StringDefinition Classes[LinkParam](LinkParam.html) → [LinkParam](../../../javadsl/model/headers/LinkParam.html)
17. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition Classesmedia → Renderable
22. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
24. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#value():AnyRef "Permalink")  def value(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classesmedia → [LinkParam](LinkParam.html) → [LinkParam](../../../javadsl/model/headers/LinkParam.html)
25. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from media toStringFormat\[media] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$media.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (media, B)ImplicitThis member is added by an implicit conversion from media toArrowAssoc\[media] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [LinkParam](LinkParam.html)

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.headers.LinkParam](../../../javadsl/model/headers/LinkParam.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd frommedia to any2stringadd\[media]

### Inherited by implicit conversion StringFormat frommedia to StringFormat\[media]

### Inherited by implicit conversion Ensuring frommedia to Ensuring\[media]

### Inherited by implicit conversion ArrowAssoc frommedia to ArrowAssoc\[media]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/LinkParam.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParam.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$anchor.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$hreflang.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$media.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$rel.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$rev.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$title$times.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$title.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$type.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$media.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$media.html)*
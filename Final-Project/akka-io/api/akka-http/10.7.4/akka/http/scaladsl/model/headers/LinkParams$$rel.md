---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LinkParams.rel
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/LinkParams$$rel.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LinkParams.rel
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LinkParams.rel

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.LinkParams.rel

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
- [media](LinkParams$$media.html "For a more detailed breakdown of how to use the dereferenced language hint link parameter, see http://tools.ietf.org/html/rfc5988#section-5.4")
- rel
- [rev](LinkParams$$rev.html "This can be either a bare word, an absolute URI, or a quoted, space-separated string of zero-or-more of either.")
- [title](LinkParams$$title.html "For a more detailed breakdown of how to use the dereferenced language hint link parameter, see http://tools.ietf.org/html/rfc5988#section-5.4")
- [title\*](LinkParams$$title$times.html "For a more detailed breakdown of how to use the dereferenced language hint link parameter, see http://tools.ietf.org/html/rfc5988#section-5.4")
- [type](LinkParams$$type.html "For a more detailed breakdown of how to use the dereferenced language hint link parameter, see http://tools.ietf.org/html/rfc5988#section-5.4")
c[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html).[LinkParams](LinkParams$.html)

# rel[**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html "Permalink")

### 

#### final  case class rel(value: String) extends [LinkParam](LinkParam.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

This can be either a bare word, an absolute URI, or a quoted, space\-separated string of zero\-or\-more of either

For a more detailed breakdown of the relation type link parameter, see
http://tools.ietf.org/html/rfc5988\#section\-5\.3

Source[LinkValue.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/LinkValue.scala#L60)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [LinkParam](LinkParam.html), ToStringRenderable, Renderable, [javadsl.model.headers.LinkParam](../../../javadsl/model/headers/LinkParam.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. rel
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

1. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#<init>(value:String):akka.http.scaladsl.model.headers.LinkParams.rel "Permalink")  new rel(value: String)
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from rel toany2stringadd\[rel] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (rel, B)ImplicitThis member is added by an implicit conversion from rel toArrowAssoc\[rel] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (rel) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): relImplicitThis member is added by an implicit conversion from rel toEnsuring\[rel] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (rel) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): relImplicitThis member is added by an implicit conversion from rel toEnsuring\[rel] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): relImplicitThis member is added by an implicit conversion from rel toEnsuring\[rel] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): relImplicitThis member is added by an implicit conversion from rel toEnsuring\[rel] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#key:String "Permalink")  val key: StringDefinition Classes[LinkParam](LinkParam.html) → [LinkParam](../../../javadsl/model/headers/LinkParam.html)
16. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition Classesrel → Renderable
21. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
23. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#value:String "Permalink")  val value: StringDefinition Classesrel → [LinkParam](LinkParam.html) → [LinkParam](../../../javadsl/model/headers/LinkParam.html)
24. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from rel toStringFormat\[rel] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/headers/LinkParams$$rel.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (rel, B)ImplicitThis member is added by an implicit conversion from rel toArrowAssoc\[rel] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [LinkParam](LinkParam.html)

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.headers.LinkParam](../../../javadsl/model/headers/LinkParam.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromrel to any2stringadd\[rel]

### Inherited by implicit conversion StringFormat fromrel to StringFormat\[rel]

### Inherited by implicit conversion Ensuring fromrel to Ensuring\[rel]

### Inherited by implicit conversion ArrowAssoc fromrel to ArrowAssoc\[rel]

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$rel.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/LinkParams$$rel.html)*
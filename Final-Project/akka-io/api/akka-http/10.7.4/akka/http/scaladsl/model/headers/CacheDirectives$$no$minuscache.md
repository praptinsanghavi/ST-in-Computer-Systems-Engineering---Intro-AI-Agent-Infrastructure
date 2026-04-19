---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirectives.no
  - cache
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirectives.no-cache
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirectives.no-cache

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirectives.no - cache

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html "Permalink")  object [CacheDirectives](CacheDirectives$.html)Definition Classes[headers](index.html)
- [immutableDirective](CacheDirectives$$immutableDirective$.html "https://tools.ietf.org/html/rfc8246")
- [max\-age](CacheDirectives$$max$minusage.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.1 and http://tools.ietf.org/html/rfc7234#section-5.2.2.8")
- [max\-stale](CacheDirectives$$max$minusstale.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.2")
- [min\-fresh](CacheDirectives$$min$minusfresh.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.3")
- [must\-revalidate](CacheDirectives$$must$minusrevalidate$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.1")
- no\-cache
- [no\-store](CacheDirectives$$no$minusstore$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.5 and http://tools.ietf.org/html/rfc7234#section-5.2.2.3")
- [no\-transform](CacheDirectives$$no$minustransform$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.6 and http://tools.ietf.org/html/rfc7234#section-5.2.2.4")
- [only\-if\-cached](CacheDirectives$$only$minusif$minuscached$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.7")
- [private](CacheDirectives$$private.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.6")
- [proxy\-revalidate](CacheDirectives$$proxy$minusrevalidate$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.7")
- [public](CacheDirectives$$public$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.5")
- [s\-maxage](CacheDirectives$$s$minusmaxage.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.9")
[c](CacheDirectives$$no$minuscache$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html).[CacheDirectives](CacheDirectives$.html)

# [no\-cache](CacheDirectives$$no$minuscache$.html "See companion object")[**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html "Permalink")

### Companion [object no\-cache](CacheDirectives$$no$minuscache$.html "See companion object")

#### final  case class no\-cache(fieldNames: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]) extends [FieldNamesDirective](CacheDirective$$FieldNamesDirective.html) with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

For a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.2

Source[CacheDirective.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/CacheDirective.scala#L124)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [ResponseDirective](CacheDirective$$ResponseDirective.html), [CacheDirective](CacheDirective.html), [javadsl.model.headers.CacheDirective](../../../javadsl/model/headers/CacheDirective.html), [FieldNamesDirective](CacheDirective$$FieldNamesDirective.html), ValueRenderable, ToStringRenderable, Renderable, [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. no\-cache
2. Serializable
3. ResponseDirective
4. CacheDirective
5. CacheDirective
6. FieldNamesDirective
7. ValueRenderable
8. ToStringRenderable
9. Renderable
10. Product
11. Equals
12. AnyRef
13. Any
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

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#<init>(fieldNames:Seq[String]):akka.http.scaladsl.model.headers.CacheDirectives.no-cache "Permalink")  new no\-cache(fieldNames: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String])
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from no\-cache toany2stringadd\[no\-cache] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (no\-cache, B)ImplicitThis member is added by an implicit conversion from no\-cache toArrowAssoc\[no\-cache] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (no\-cache) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): no\-cacheImplicitThis member is added by an implicit conversion from no\-cache toEnsuring\[no\-cache] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (no\-cache) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): no\-cacheImplicitThis member is added by an implicit conversion from no\-cache toEnsuring\[no\-cache] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): no\-cacheImplicitThis member is added by an implicit conversion from no\-cache toEnsuring\[no\-cache] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): no\-cacheImplicitThis member is added by an implicit conversion from no\-cache toEnsuring\[no\-cache] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#fieldNames:Seq[String] "Permalink")  val fieldNames: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Definition Classesno\-cache → [FieldNamesDirective](CacheDirective$$FieldNamesDirective.html)
14. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink") final  def render\[R \<: Rendering](r: R): r.typeDefinition Classes[FieldNamesDirective](CacheDirective$$FieldNamesDirective.html) → Renderable
21. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
23. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#value:String "Permalink")  def value: StringDefinition ClassesValueRenderable
24. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from no\-cache toStringFormat\[no\-cache] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (no\-cache, B)ImplicitThis member is added by an implicit conversion from no\-cache toArrowAssoc\[no\-cache] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [ResponseDirective](CacheDirective$$ResponseDirective.html)

### Inherited from [CacheDirective](CacheDirective.html)

### Inherited from [javadsl.model.headers.CacheDirective](../../../javadsl/model/headers/CacheDirective.html)

### Inherited from [FieldNamesDirective](CacheDirective$$FieldNamesDirective.html)

### Inherited from ValueRenderable

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromno\-cache to any2stringadd\[no\-cache]

### Inherited by implicit conversion StringFormat fromno\-cache to StringFormat\[no\-cache]

### Inherited by implicit conversion Ensuring fromno\-cache to Ensuring\[no\-cache]

### Inherited by implicit conversion ArrowAssoc fromno\-cache to ArrowAssoc\[no\-cache]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/CacheDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$FieldNamesDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$ResponseDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$immutableDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$max$minusage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$max$minusstale.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$min$minusfresh.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$must$minusrevalidate$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$no$minusstore$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$no$minustransform$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$only$minusif$minuscached$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$private$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$private.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$proxy$minusrevalidate$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$public$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$s$minusmaxage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html)*
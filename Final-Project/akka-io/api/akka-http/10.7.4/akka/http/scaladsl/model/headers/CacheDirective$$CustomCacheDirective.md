---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$.html "Permalink")  object [CacheDirective](CacheDirective$.html)Definition Classes[headers](index.html)
- CustomCacheDirective
- [FieldNamesDirective](CacheDirective$$FieldNamesDirective.html)
- [RequestDirective](CacheDirective$$RequestDirective.html)
- [ResponseDirective](CacheDirective$$ResponseDirective.html)
c[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html).[CacheDirective](CacheDirective$.html)

# CustomCacheDirective[**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html "Permalink")

### 

#### final  case class CustomCacheDirective(name: String, content: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]) extends [RequestDirective](CacheDirective$$RequestDirective.html) with [ResponseDirective](CacheDirective$$ResponseDirective.html) with ValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[CacheDirective.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/CacheDirective.scala#L23)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), ValueRenderable, ToStringRenderable, [ResponseDirective](CacheDirective$$ResponseDirective.html), [RequestDirective](CacheDirective$$RequestDirective.html), [CacheDirective](CacheDirective.html), [javadsl.model.headers.CacheDirective](../../../javadsl/model/headers/CacheDirective.html), Renderable, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CustomCacheDirective
2. Serializable
3. Product
4. Equals
5. ValueRenderable
6. ToStringRenderable
7. ResponseDirective
8. RequestDirective
9. CacheDirective
10. CacheDirective
11. Renderable
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

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#<init>(name:String,content:Option[String]):akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective "Permalink")  new CustomCacheDirective(name: String, content: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String])
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CustomCacheDirective toany2stringadd\[CustomCacheDirective] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CustomCacheDirective, B)ImplicitThis member is added by an implicit conversion from CustomCacheDirective toArrowAssoc\[CustomCacheDirective] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#content:Option[String] "Permalink")  val content: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
9. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CustomCacheDirective) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CustomCacheDirectiveImplicitThis member is added by an implicit conversion from CustomCacheDirective toEnsuring\[CustomCacheDirective] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CustomCacheDirective) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CustomCacheDirectiveImplicitThis member is added by an implicit conversion from CustomCacheDirective toEnsuring\[CustomCacheDirective] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CustomCacheDirectiveImplicitThis member is added by an implicit conversion from CustomCacheDirective toEnsuring\[CustomCacheDirective] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CustomCacheDirectiveImplicitThis member is added by an implicit conversion from CustomCacheDirective toEnsuring\[CustomCacheDirective] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#name:String "Permalink")  val name: String
17. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesCustomCacheDirective → Renderable
22. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
24. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#value:String "Permalink")  def value: StringDefinition ClassesValueRenderable
25. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CustomCacheDirective toStringFormat\[CustomCacheDirective] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CustomCacheDirective, B)ImplicitThis member is added by an implicit conversion from CustomCacheDirective toArrowAssoc\[CustomCacheDirective] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from ValueRenderable

### Inherited from ToStringRenderable

### Inherited from [ResponseDirective](CacheDirective$$ResponseDirective.html)

### Inherited from [RequestDirective](CacheDirective$$RequestDirective.html)

### Inherited from [CacheDirective](CacheDirective.html)

### Inherited from [javadsl.model.headers.CacheDirective](../../../javadsl/model/headers/CacheDirective.html)

### Inherited from Renderable

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCustomCacheDirective to any2stringadd\[CustomCacheDirective]

### Inherited by implicit conversion StringFormat fromCustomCacheDirective to StringFormat\[CustomCacheDirective]

### Inherited by implicit conversion Ensuring fromCustomCacheDirective to Ensuring\[CustomCacheDirective]

### Inherited by implicit conversion ArrowAssoc fromCustomCacheDirective to ArrowAssoc\[CustomCacheDirective]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/CacheDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$FieldNamesDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$RequestDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$ResponseDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$CustomCacheDirective.html)*
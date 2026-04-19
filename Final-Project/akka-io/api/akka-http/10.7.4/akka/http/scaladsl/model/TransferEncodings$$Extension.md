---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.TransferEncodings.Extension
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/TransferEncodings$$Extension.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.TransferEncodings.Extension
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.TransferEncodings.Extension

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.TransferEncodings.Extension

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/TransferEncodings$.html "Permalink")  object [TransferEncodings](TransferEncodings$.html)Definition Classes[model](index.html)
- Extension
- [Predefined](TransferEncodings$$Predefined.html)
- [chunked](TransferEncodings$$chunked$.html)
- [compress](TransferEncodings$$compress$.html)
- [deflate](TransferEncodings$$deflate$.html)
- [gzip](TransferEncodings$$gzip$.html)
- [trailers](TransferEncodings$$trailers$.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[TransferEncodings](TransferEncodings$.html)

# Extension[**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html "Permalink")

### 

#### final  case class Extension(name: String, params: Map\[String, String] \= Map.empty) extends [TransferEncoding](TransferEncoding.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[TransferEncoding.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/TransferEncoding.scala#L29)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [TransferEncoding](TransferEncoding.html), Renderable, [javadsl.model.TransferEncoding](../../javadsl/model/TransferEncoding.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Extension
2. Serializable
3. Product
4. Equals
5. TransferEncoding
6. Renderable
7. TransferEncoding
8. AnyRef
9. Any
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

1. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#<init>(name:String,params:Map[String,String]):akka.http.scaladsl.model.TransferEncodings.Extension "Permalink")  new Extension(name: String, params: Map\[String, String] \= Map.empty)
### Value Members

1. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Extension toany2stringadd\[Extension] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Extension, B)ImplicitThis member is added by an implicit conversion from Extension toArrowAssoc\[Extension] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Extension) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExtensionImplicitThis member is added by an implicit conversion from Extension toEnsuring\[Extension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Extension) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExtensionImplicitThis member is added by an implicit conversion from Extension toEnsuring\[Extension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExtensionImplicitThis member is added by an implicit conversion from Extension toEnsuring\[Extension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExtensionImplicitThis member is added by an implicit conversion from Extension toEnsuring\[Extension] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#getParams():java.util.Map[String,String] "Permalink")  def getParams(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]Definition Classes[TransferEncoding](TransferEncoding.html) → [TransferEncoding](../../javadsl/model/TransferEncoding.html)
15. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#name:String "Permalink")  val name: StringDefinition ClassesExtension → [TransferEncoding](TransferEncoding.html) → [TransferEncoding](../../javadsl/model/TransferEncoding.html)
17. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#params:Map[String,String] "Permalink")  val params: Map\[String, String]Definition ClassesExtension → [TransferEncoding](TransferEncoding.html)
21. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesExtension → Renderable
23. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Extension toStringFormat\[Extension] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$Extension.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Extension, B)ImplicitThis member is added by an implicit conversion from Extension toArrowAssoc\[Extension] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [TransferEncoding](TransferEncoding.html)

### Inherited from Renderable

### Inherited from [javadsl.model.TransferEncoding](../../javadsl/model/TransferEncoding.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromExtension to any2stringadd\[Extension]

### Inherited by implicit conversion StringFormat fromExtension to StringFormat\[Extension]

### Inherited by implicit conversion Ensuring fromExtension to Ensuring\[Extension]

### Inherited by implicit conversion ArrowAssoc fromExtension to ArrowAssoc\[Extension]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/TransferEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$Extension.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$Predefined.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$chunked$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$compress$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$deflate$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$gzip$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$trailers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$Extension.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$Extension.html)*
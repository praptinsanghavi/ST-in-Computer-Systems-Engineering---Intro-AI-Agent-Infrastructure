---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.TransferEncodings.compress
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/TransferEncodings$$compress$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.TransferEncodings.compress
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.TransferEncodings.compress

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.TransferEncodings.compress

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/TransferEncodings$.html "Permalink")  object [TransferEncodings](TransferEncodings$.html)Definition Classes[model](index.html)
- [Extension](TransferEncodings$$Extension.html)
- [Predefined](TransferEncodings$$Predefined.html)
- [chunked](TransferEncodings$$chunked$.html)
- compress
- [deflate](TransferEncodings$$deflate$.html)
- [gzip](TransferEncodings$$gzip$.html)
- [trailers](TransferEncodings$$trailers$.html)
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[TransferEncodings](TransferEncodings$.html)

# compress[**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html "Permalink")

### 

#### case object compress extends [Predefined](TransferEncodings$$Predefined.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[TransferEncoding.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/TransferEncoding.scala#L25)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Predefined](TransferEncodings$$Predefined.html), SingletonValueRenderable, [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [TransferEncoding](TransferEncoding.html), Renderable, [javadsl.model.TransferEncoding](../../javadsl/model/TransferEncoding.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. compress
2. Serializable
3. Predefined
4. SingletonValueRenderable
5. Product
6. Equals
7. TransferEncoding
8. Renderable
9. TransferEncoding
10. AnyRef
11. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#getParams():java.util.Map[String,String] "Permalink")  def getParams(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]Definition Classes[TransferEncoding](TransferEncoding.html) → [TransferEncoding](../../javadsl/model/TransferEncoding.html)
10. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#name():String "Permalink")  def name(): StringDefinition Classes[Predefined](TransferEncodings$$Predefined.html) → [TransferEncoding](TransferEncoding.html) → [TransferEncoding](../../javadsl/model/TransferEncoding.html)
12. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#params:Map[String,String] "Permalink")  def params: Map\[String, String]Definition Classes[Predefined](TransferEncodings$$Predefined.html) → [TransferEncoding](TransferEncoding.html)
16. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
17. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
18. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesSingletonValueRenderable → Renderable
19. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#value:String "Permalink")  def value: StringDefinition ClassesSingletonValueRenderable
21. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/TransferEncodings$$compress$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Predefined](TransferEncodings$$Predefined.html)

### Inherited from SingletonValueRenderable

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [TransferEncoding](TransferEncoding.html)

### Inherited from Renderable

### Inherited from [javadsl.model.TransferEncoding](../../javadsl/model/TransferEncoding.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$compress$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/TransferEncodings$$compress$.html)*
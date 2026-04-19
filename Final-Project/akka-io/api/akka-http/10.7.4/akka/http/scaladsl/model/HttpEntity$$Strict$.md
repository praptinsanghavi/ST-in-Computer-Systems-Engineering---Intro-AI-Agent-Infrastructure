---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.Strict
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:39:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$Strict$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.Strict
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.Strict

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.Strict

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/HttpEntity$.html "Permalink")  object [HttpEntity](HttpEntity$.html)Definition Classes[model](index.html)
- [Chunk](HttpEntity$$Chunk.html "An intermediate entity chunk guaranteed to carry non-empty data.")
- [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html "An element of the HttpEntity data stream.")
- [Chunked](HttpEntity$$Chunked.html "The model for the entity of a chunked HTTP message (with Transfer-Encoding: chunked).")
- [CloseDelimited](HttpEntity$$CloseDelimited.html "The model for the entity of an HTTP response that is terminated by the server closing the connection.")
- [Default](HttpEntity$$Default.html "The model for the entity of a \"regular\" unchunked HTTP message with a known non-zero length.")
- [DiscardedEntity](HttpEntity$$DiscardedEntity.html "Represents the currently being-drained HTTP Entity which triggers completion of the contained Future once the entity has been drained for the given HttpMessage completely.")
- [HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html "Adds Scala DSL idiomatic methods to HttpEntity, e.g.")
- [IndefiniteLength](HttpEntity$$IndefiniteLength.html "The model for the entity of a BodyPart with an indefinite length.")
- [LastChunk](HttpEntity$$LastChunk.html "The final chunk of a chunk stream.")
- [Strict](HttpEntity$$Strict.html "The model for the entity of a \"regular\" unchunked HTTP message with known, fixed data.")
[o](HttpEntity$$Strict.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[HttpEntity](HttpEntity$.html)

# [Strict](HttpEntity$$Strict.html "See companion class")[**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html "Permalink")

### Companion [class Strict](HttpEntity$$Strict.html "See companion class")

#### object Strict extends [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[ContentType](ContentType.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Strict](HttpEntity$$Strict.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[HttpEntity.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpEntity.scala#L339)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[ContentType](ContentType.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Strict](HttpEntity$$Strict.html)], ([ContentType](ContentType.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)) \=\> [Strict](HttpEntity$$Strict.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Strict
2. Serializable
3. AbstractFunction2
4. Function2
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#apply(contentType:akka.http.scaladsl.model.ContentType,data:akka.util.ByteString,reportContentLength:Boolean):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def apply(contentType: [ContentType](ContentType.html), data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), reportContentLength: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Strict](HttpEntity$$Strict.html)
5. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#apply(contentType:akka.http.scaladsl.model.ContentType,data:akka.util.ByteString):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def apply(contentType: [ContentType](ContentType.html), data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [Strict](HttpEntity$$Strict.html)Definition ClassesStrict → Function2
6. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#curried:T1=>(T2=>R) "Permalink")  def curried: ([ContentType](ContentType.html)) \=\> ([ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)) \=\> [Strict](HttpEntity$$Strict.html)Definition ClassesFunction2Annotations@unspecialized()
9. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction2 → AnyRef → Any
19. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#tupled:((T1,T2))=>R "Permalink")  def tupled: (([ContentType](ContentType.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString))) \=\> [Strict](HttpEntity$$Strict.html)Definition ClassesFunction2Annotations@unspecialized()
20. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#unapply(strict:akka.http.scaladsl.model.HttpEntity.Strict):Option[(akka.http.scaladsl.model.ContentType,akka.util.ByteString)] "Permalink")  def unapply(strict: [Strict](HttpEntity$$Strict.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([ContentType](ContentType.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString))]
21. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[ContentType](ContentType.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Strict](HttpEntity$$Strict.html)]

### Inherited from ([ContentType](ContentType.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)) \=\> [Strict](HttpEntity$$Strict.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunk$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunk.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$ChunkStreamPart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$ChunkStreamPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunked$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunked.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$CloseDelimited.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Default.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$DiscardedEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$HttpEntityScalaDSLSugar.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$LastChunk$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$LastChunk.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict$.html)*
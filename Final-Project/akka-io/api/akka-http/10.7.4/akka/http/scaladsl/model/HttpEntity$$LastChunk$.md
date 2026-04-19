---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.LastChunk
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:39:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$LastChunk$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.LastChunk
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.LastChunk

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.LastChunk

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
[o](HttpEntity$$LastChunk.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[HttpEntity](HttpEntity$.html)

# [LastChunk](HttpEntity$$LastChunk.html "See companion class")[**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html "Permalink")

### Companion [class LastChunk](HttpEntity$$LastChunk.html "See companion class")

#### object LastChunk extends [LastChunk](HttpEntity$$LastChunk.html)

Source[HttpEntity.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpEntity.scala#L657)Linear Supertypes[LastChunk](HttpEntity$$LastChunk.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html), javadsl.model.HttpEntity.ChunkStreamPart, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LastChunk
2. LastChunk
3. Serializable
4. Product
5. Equals
6. ChunkStreamPart
7. ChunkStreamPart
8. AnyRef
9. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#data():akka.util.ByteString "Permalink")  def data(): [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)Returns the byte data of this chunk.

Returns the byte data of this chunk. Will be non\-empty for every regular
chunk. Will be empty for the last chunk.

Definition Classes[LastChunk](HttpEntity$$LastChunk.html) → [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html) → ChunkStreamPart
7. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#extension:String "Permalink")  val extension: StringReturns extensions data for this chunk.

Returns extensions data for this chunk.

Definition Classes[LastChunk](HttpEntity$$LastChunk.html) → [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html) → ChunkStreamPart
9. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#getTrailerHeaders():Iterable[akka.http.javadsl.model.HttpHeader] "Permalink")  def getTrailerHeaders(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]Java API

Java API

Definition Classes[LastChunk](HttpEntity$$LastChunk.html) → ChunkStreamPart
11. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#isLastChunk():Boolean "Permalink")  def isLastChunk(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this is the last chunk

Returns if this is the last chunk

Definition Classes[LastChunk](HttpEntity$$LastChunk.html) → [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html) → ChunkStreamPart
13. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
17. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#trailer:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink")  val trailer: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]Definition Classes[LastChunk](HttpEntity$$LastChunk.html)
19. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [LastChunk](HttpEntity$$LastChunk.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html)

### Inherited from javadsl.model.HttpEntity.ChunkStreamPart

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$LastChunk$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$LastChunk$.html)*
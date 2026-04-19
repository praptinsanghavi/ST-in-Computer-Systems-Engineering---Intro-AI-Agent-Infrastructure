---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.Strict
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:10:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$Strict.html
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
- Strict
[c](HttpEntity$$Strict$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[HttpEntity](HttpEntity$.html)

# [Strict](HttpEntity$$Strict$.html "See companion object")[**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html "Permalink")

### Companion [object Strict](HttpEntity$$Strict$.html "See companion object")

#### final  class Strict extends javadsl.model.HttpEntity.Strict with [UniversalEntity](UniversalEntity.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

The model for the entity of a "regular" unchunked HTTP message with known, fixed data.

Source[HttpEntity.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpEntity.scala#L354)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [UniversalEntity](UniversalEntity.html), [BodyPartEntity](BodyPartEntity.html), [RequestEntity](RequestEntity.html), [ResponseEntity](ResponseEntity.html), [HttpEntity](HttpEntity.html), javadsl.model.HttpEntity.Strict, [javadsl.model.UniversalEntity](../../javadsl/model/UniversalEntity.html), [javadsl.model.BodyPartEntity](../../javadsl/model/BodyPartEntity.html), [javadsl.model.RequestEntity](../../javadsl/model/RequestEntity.html), [javadsl.model.ResponseEntity](../../javadsl/model/ResponseEntity.html), [javadsl.model.HttpEntity](../../javadsl/model/HttpEntity.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Strict
2. Serializable
3. Product
4. Equals
5. UniversalEntity
6. BodyPartEntity
7. RequestEntity
8. ResponseEntity
9. HttpEntity
10. Strict
11. UniversalEntity
12. BodyPartEntity
13. RequestEntity
14. ResponseEntity
15. HttpEntity
16. AnyRef
17. Any
Implicitly  
1. by fromJava
2. by HttpEntityScalaDSLSugar
3. by HttpEntityScalaDSLSugar
4. by any2stringadd
5. by StringFormat
6. by Ensuring
7. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#<init>(contentType:akka.http.scaladsl.model.ContentType,data:akka.util.ByteString):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  new Strict(contentType: [ContentType](ContentType.html), data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString))
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#<init>(contentType:akka.http.scaladsl.model.ContentType,data:akka.util.ByteString,reportContentLength:Boolean):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  new Strict(contentType: [ContentType](ContentType.html), data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), reportContentLength: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))reportContentLengthOnly applies for HTTP/2 responses, if false, do not produce a Content\-Length header
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Strict toany2stringadd\[Strict] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Strict, B)ImplicitThis member is added by an implicit conversion from Strict toArrowAssoc\[Strict] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#canEqual(o:Any):Boolean "Permalink")  def canEqual(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesStrict → Equals
8. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#contentLength:Long "Permalink")  def contentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesStrict → [UniversalEntity](UniversalEntity.html)
10. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#contentLengthOption:Option[Long] "Permalink")  def contentLengthOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Some(content length) if a length is defined for this entity, None otherwise.

Some(content length) if a length is defined for this entity, None otherwise.
A length is only defined for Strict and Default entity types.

In many cases it's dangerous to rely on the (non\-)existence of a content\-length.
HTTP intermediaries like (transparent) proxies are allowed to change the transfer\-encoding
which can result in the entity being delivered as another type as expected.

Definition ClassesStrict → [UniversalEntity](UniversalEntity.html) → [HttpEntity](HttpEntity.html)
11. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#contentType:akka.http.scaladsl.model.ContentType "Permalink")  val contentType: [ContentType](ContentType.html)The `ContentType` associated with this entity.

The `ContentType` associated with this entity.

Definition ClassesStrict → [HttpEntity](HttpEntity.html)
12. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#copy(contentType:akka.http.scaladsl.model.ContentType,data:akka.util.ByteString):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def copy(contentType: [ContentType](ContentType.html) \= contentType, data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString) \= data): Strict
13. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#data:akka.util.ByteString "Permalink")  val data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)
14. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#dataBytes:akka.stream.scaladsl.Source[akka.util.ByteString,akka.NotUsed] "Permalink")  def dataBytes: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]A stream of the data of this entity.

A stream of the data of this entity.

Definition ClassesStrict → [HttpEntity](HttpEntity.html)
15. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#discardBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
16. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#discardBytes(mat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)
as otherwise the lack of consuming of the data will trigger back\-pressure to the underlying TCP connection
(as designed), however possibly leading to an idle\-timeout that will close the connection, instead of
just having ignored the data.

Warning: It is not allowed to discard and/or consume the `entity.dataBytes` more than once
as the stream is directly attached to the "live" incoming data source from the underlying TCP connection.
Allowing it to be consumable twice would require buffering the incoming data, thus defeating the purpose
of its streaming nature. If the dataBytes source is materialized a second time, it will fail with an
"stream can cannot be materialized more than once" exception.

When called on `Strict` entities or sources whose values can be buffered in memory,
the above warnings can be ignored. Repeated materialization is not necessary in this case, avoiding
the mentioned exceptions due to the data being held in memory.

In future versions, more automatic ways to warn or resolve these situations may be introduced, see issue \#18716\.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
17. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Strict) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Strict) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesStrict → Equals → AnyRef → Any
23. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#getContentLengthOption():java.util.OptionalLong "Permalink")  def getContentLengthOption(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
25. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#getContentType():akka.http.javadsl.model.ContentType "Permalink")  def getContentType(): [javadsl.model.ContentType](../../javadsl/model/ContentType.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
26. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#getData():akka.util.ByteString "Permalink")  def getData(): [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)Java API

Java API

Definition ClassesStrict → Strict
27. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#getDataBytes():akka.stream.javadsl.Source[akka.util.ByteString,AnyRef] "Permalink")  def getDataBytes(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
28. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesStrict → AnyRef → Any
29. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isChunked():Boolean "Permalink")  def isChunked(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityChunked.

Returns if this entity is a subtype of HttpEntityChunked.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
30. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isCloseDelimited():Boolean "Permalink")  def isCloseDelimited(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityCloseDelimited.

Returns if this entity is a subtype of HttpEntityCloseDelimited.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
31. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isDefault():Boolean "Permalink")  def isDefault(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityDefault.

Returns if this entity is a subtype of HttpEntityDefault.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
32. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isIndefiniteLength():Boolean "Permalink")  def isIndefiniteLength(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
33. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
34. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isKnownEmpty():Boolean "Permalink")  def isKnownEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Determines whether this entity is known to be empty.

Determines whether this entity is known to be empty.

Definition ClassesStrict → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
35. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isStrict():Boolean "Permalink")  def isStrict(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityStrict.

Returns if this entity is a subtype of HttpEntityStrict.

Definition ClassesStrict → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
36. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
37. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
39. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesStrict → Product
40. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesStrict → Product
41. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
42. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
43. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
44. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#productPrefix:String "Permalink")  def productPrefix: StringDefinition ClassesStrict → Product
45. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#reportContentLength:Boolean "Permalink")  val reportContentLength: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
46. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
47. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Strict]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes
as configured in `akka.http.parsing.max-to-strict-bytes`. Not that this method does not support different
defaults for client\- and server use: if you want that, use the `toStrict` method and pass in an explicit
maximum number of bytes.

Definition ClassesStrict → [HttpEntity](HttpEntity.html)
48. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
49. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
50. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeoutMillis:Long,maxBytes:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
51. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
52. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Strict]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes.

Definition Classes[HttpEntity](HttpEntity.html)
53. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toString():String "Permalink")  def toString(): StringDefinition ClassesStrict → AnyRef → Any
54. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#transformDataBytes(transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.MessageEntity "Permalink")  def transformDataBytes(transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.

Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.
For a `Chunked` entity, the chunks will be transformed one by one keeping the chunk metadata (but may introduce an
extra chunk before the `LastChunk` if `transformer.onTermination` returns additional data).

This method may only throw an exception if the `transformer` function throws an exception while creating the transformer.
Any other errors are reported through the new entity data stream.

Definition ClassesStrict → [RequestEntity](RequestEntity.html) → [ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html)
55. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#transformDataBytes(newContentLength:Long,transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.UniversalEntity "Permalink")  def transformDataBytes(newContentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [UniversalEntity](UniversalEntity.html)Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

Definition Classes[HttpEntity](HttpEntity.html)
56. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
57. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
58. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
59. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withContentType(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def withContentType(contentType: [ContentType](ContentType.html)): StrictCreates a copy of this HttpEntity with the `contentType` overridden with the given one.

Creates a copy of this HttpEntity with the `contentType` overridden with the given one.

Definition ClassesStrict → [UniversalEntity](UniversalEntity.html) → [BodyPartEntity](BodyPartEntity.html) → [RequestEntity](RequestEntity.html) → [ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html)
60. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withContentType(contentType:akka.http.javadsl.model.ContentType):akka.http.scaladsl.model.HttpEntity "Permalink")  def withContentType(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html)): [HttpEntity](HttpEntity.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
61. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.UniversalEntity "Permalink")  def withSizeLimit(maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [UniversalEntity](UniversalEntity.html)See [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity).

See [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity).

Definition ClassesStrict → [UniversalEntity](UniversalEntity.html) → [BodyPartEntity](BodyPartEntity.html) → [RequestEntity](RequestEntity.html) → [ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
62. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withoutContentLengthReporting():akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def withoutContentLengthReporting(): StrictOnly applies for HTTP/2 responses, leads to a response without Content\-Length header

Only applies for HTTP/2 responses, leads to a response without Content\-Length header

Definition ClassesStrict → Strict
63. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withoutSizeLimit():akka.http.scaladsl.model.UniversalEntity "Permalink")  def withoutSizeLimit(): [UniversalEntity](UniversalEntity.html)See [HttpEntity\#withoutSizeLimit](HttpEntity.html#withoutSizeLimit():akka.http.scaladsl.model.HttpEntity)

See [HttpEntity\#withoutSizeLimit](HttpEntity.html#withoutSizeLimit():akka.http.scaladsl.model.HttpEntity)

Definition ClassesStrict → [UniversalEntity](UniversalEntity.html) → [BodyPartEntity](BodyPartEntity.html) → [RequestEntity](RequestEntity.html) → [ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#contentLengthOption:Option[Long] "Permalink")  def contentLengthOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Some(content length) if a length is defined for this entity, None otherwise.

Some(content length) if a length is defined for this entity, None otherwise.
A length is only defined for Strict and Default entity types.

In many cases it's dangerous to rely on the (non\-)existence of a content\-length.
HTTP intermediaries like (transparent) proxies are allowed to change the transfer\-encoding
which can result in the entity being delivered as another type as expected.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).contentLengthOption
```
Definition Classes[HttpEntity](HttpEntity.html)
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#contentType:akka.http.scaladsl.model.ContentType "Permalink")  def contentType: [ContentType](ContentType.html)The `ContentType` associated with this entity.

The `ContentType` associated with this entity.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).contentType
```
Definition Classes[HttpEntity](HttpEntity.html)
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#dataBytes:akka.stream.scaladsl.Source[akka.util.ByteString,Any] "Permalink")  def dataBytes: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]A stream of the data of this entity.

A stream of the data of this entity.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).dataBytes
```
Definition Classes[HttpEntity](HttpEntity.html)
4. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#discardBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).discardBytes(system)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
5. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#discardBytes(mat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)
as otherwise the lack of consuming of the data will trigger back\-pressure to the underlying TCP connection
(as designed), however possibly leading to an idle\-timeout that will close the connection, instead of
just having ignored the data.

Warning: It is not allowed to discard and/or consume the `entity.dataBytes` more than once
as the stream is directly attached to the "live" incoming data source from the underlying TCP connection.
Allowing it to be consumable twice would require buffering the incoming data, thus defeating the purpose
of its streaming nature. If the dataBytes source is materialized a second time, it will fail with an
"stream can cannot be materialized more than once" exception.

When called on `Strict` entities or sources whose values can be buffered in memory,
the above warnings can be ignored. Repeated materialization is not necessary in this case, avoiding
the mentioned exceptions due to the data being held in memory.

In future versions, more automatic ways to warn or resolve these situations may be introduced, see issue \#18716\.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).discardBytes(mat)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
6. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#discardBytes()(implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes()(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)
as otherwise the lack of consuming of the data will trigger back\-pressure to the underlying TCP connection
(as designed), however possibly leading to an idle\-timeout that will close the connection, instead of
just having ignored the data.

Warning: It is not allowed to discard and/or consume the `entity.dataBytes` more than once
as the stream is directly attached to the "live" incoming data source from the underlying TCP connection.
Allowing it to be consumable twice would require buffering the incoming data, thus defeating the purpose
of its streaming nature. If the dataBytes source is materialized a second time, it will fail with an
"stream can cannot be materialized more than once" exception.

In future versions, more automatic ways to warn or resolve these situations may be introduced, see issue \#18716\.

ImplicitThis member is added by an implicit conversion from Strict to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: HttpEntityScalaDSLSugar).discardBytes()(mat)
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
7. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#discardBytes()(implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes()(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)
as otherwise the lack of consuming of the data will trigger back\-pressure to the underlying TCP connection
(as designed), however possibly leading to an idle\-timeout that will close the connection, instead of
just having ignored the data.

Warning: It is not allowed to discard and/or consume the `entity.dataBytes` more than once
as the stream is directly attached to the "live" incoming data source from the underlying TCP connection.
Allowing it to be consumable twice would require buffering the incoming data, thus defeating the purpose
of its streaming nature. If the dataBytes source is materialized a second time, it will fail with an
"stream can cannot be materialized more than once" exception.

In future versions, more automatic ways to warn or resolve these situations may be introduced, see issue \#18716\.

ImplicitThis member is added by an implicit conversion from Strict to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: HttpEntityScalaDSLSugar).discardBytes()(mat)
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
8. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#getContentLengthOption():java.util.OptionalLong "Permalink")  def getContentLengthOption(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).getContentLengthOption()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
9. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#getContentType():akka.http.javadsl.model.ContentType "Permalink")  def getContentType(): [javadsl.model.ContentType](../../javadsl/model/ContentType.html)Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).getContentType()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
10. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#getDataBytes():akka.stream.javadsl.Source[akka.util.ByteString,AnyRef] "Permalink")  def getDataBytes(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).getDataBytes()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
11. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#httpEntity:akka.http.scaladsl.model.HttpEntity "Permalink")  val httpEntity: [HttpEntity](HttpEntity.html)ImplicitThis member is added by an implicit conversion from Strict to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: HttpEntityScalaDSLSugar).httpEntity
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
12. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#httpEntity:akka.http.scaladsl.model.HttpEntity "Permalink")  val httpEntity: [HttpEntity](HttpEntity.html)ImplicitThis member is added by an implicit conversion from Strict to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: HttpEntityScalaDSLSugar).httpEntity
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
13. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isChunked():Boolean "Permalink")  def isChunked(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityChunked.

Returns if this entity is a subtype of HttpEntityChunked.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).isChunked()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
14. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isCloseDelimited():Boolean "Permalink")  def isCloseDelimited(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityCloseDelimited.

Returns if this entity is a subtype of HttpEntityCloseDelimited.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).isCloseDelimited()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
15. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isDefault():Boolean "Permalink")  def isDefault(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityDefault.

Returns if this entity is a subtype of HttpEntityDefault.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).isDefault()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
16. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isIndefiniteLength():Boolean "Permalink")  def isIndefiniteLength(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Returns if this entity is a subtype of HttpEntityIndefiniteLength.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).isIndefiniteLength()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
17. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isKnownEmpty():Boolean "Permalink")  def isKnownEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Determines whether this entity is known to be empty.

Determines whether this entity is known to be empty.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).isKnownEmpty()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
18. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#isStrict():Boolean "Permalink")  def isStrict(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityStrict.

Returns if this entity is a subtype of HttpEntityStrict.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).isStrict()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
19. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).toStrict(timeoutMillis, maxBytes, system)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
20. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).toStrict(timeoutMillis, system)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
21. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeoutMillis:Long,maxBytes:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).toStrict(timeoutMillis, maxBytes, materializer)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
22. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).toStrict(timeoutMillis, materializer)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
23. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Strict]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).toStrict(timeout, maxBytes)(fm)
```
Definition Classes[HttpEntity](HttpEntity.html)
24. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Strict]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes
as configured in `akka.http.parsing.max-to-strict-bytes`. Not that this method does not support different
defaults for client\- and server use: if you want that, use the `toStrict` method and pass in an explicit
maximum number of bytes.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).toStrict(timeout)(fm)
```
Definition Classes[HttpEntity](HttpEntity.html)
25. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#transformDataBytes(newContentLength:Long,transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.UniversalEntity "Permalink")  def transformDataBytes(newContentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [UniversalEntity](UniversalEntity.html)Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).transformDataBytes(newContentLength, transformer)
```
Definition Classes[HttpEntity](HttpEntity.html)
26. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#transformDataBytes(transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.ResponseEntity "Permalink")  def transformDataBytes(transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [ResponseEntity](ResponseEntity.html)Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.

Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.
For a `Chunked` entity, the chunks will be transformed one by one keeping the chunk metadata (but may introduce an
extra chunk before the `LastChunk` if `transformer.onTermination` returns additional data).

This method may only throw an exception if the `transformer` function throws an exception while creating the transformer.
Any other errors are reported through the new entity data stream.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).transformDataBytes(transformer)
```
Definition Classes[ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html)
27. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withContentType(contentType:akka.http.javadsl.model.ContentType):akka.http.scaladsl.model.HttpEntity "Permalink")  def withContentType(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html)): [HttpEntity](HttpEntity.html)Java API

Java API

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).withContentType(contentType)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
28. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withContentType(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.model.ResponseEntity "Permalink")  def withContentType(contentType: [ContentType](ContentType.html)): [ResponseEntity](ResponseEntity.html)Creates a copy of this HttpEntity with the `contentType` overridden with the given one.

Creates a copy of this HttpEntity with the `contentType` overridden with the given one.

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).withContentType(contentType)
```
Definition Classes[ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html)
29. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.ResponseEntity "Permalink")  def withSizeLimit(maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [ResponseEntity](ResponseEntity.html)See [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity).

See [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity).

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).withSizeLimit(maxBytes)
```
Definition Classes[ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
30. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#withoutSizeLimit():akka.http.scaladsl.model.ResponseEntity "Permalink")  def withoutSizeLimit(): [ResponseEntity](ResponseEntity.html)See [HttpEntity\#withoutSizeLimit](HttpEntity.html#withoutSizeLimit():akka.http.scaladsl.model.HttpEntity)

See [HttpEntity\#withoutSizeLimit](HttpEntity.html#withoutSizeLimit():akka.http.scaladsl.model.HttpEntity)

ImplicitThis member is added by an implicit conversion from Strict to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(strict: ResponseEntity).withoutSizeLimit()
```
Definition Classes[ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Strict toStringFormat\[Strict] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Strict, B)ImplicitThis member is added by an implicit conversion from Strict toArrowAssoc\[Strict] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [UniversalEntity](UniversalEntity.html)

### Inherited from [BodyPartEntity](BodyPartEntity.html)

### Inherited from [RequestEntity](RequestEntity.html)

### Inherited from [ResponseEntity](ResponseEntity.html)

### Inherited from [HttpEntity](HttpEntity.html)

### Inherited from javadsl.model.HttpEntity.Strict

### Inherited from [javadsl.model.UniversalEntity](../../javadsl/model/UniversalEntity.html)

### Inherited from [javadsl.model.BodyPartEntity](../../javadsl/model/BodyPartEntity.html)

### Inherited from [javadsl.model.RequestEntity](../../javadsl/model/RequestEntity.html)

### Inherited from [javadsl.model.ResponseEntity](../../javadsl/model/ResponseEntity.html)

### Inherited from [javadsl.model.HttpEntity](../../javadsl/model/HttpEntity.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion fromJava fromStrict to [ResponseEntity](ResponseEntity.html)

### Inherited by implicit conversion HttpEntityScalaDSLSugar fromStrict to [HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)

### Inherited by implicit conversion HttpEntityScalaDSLSugar fromStrict to [HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)

### Inherited by implicit conversion any2stringadd fromStrict to any2stringadd\[Strict]

### Inherited by implicit conversion StringFormat fromStrict to StringFormat\[Strict]

### Inherited by implicit conversion Ensuring fromStrict to Ensuring\[Strict]

### Inherited by implicit conversion ArrowAssoc fromStrict to ArrowAssoc\[Strict]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/UniversalEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ResponseEntity$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/UniversalEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html)*
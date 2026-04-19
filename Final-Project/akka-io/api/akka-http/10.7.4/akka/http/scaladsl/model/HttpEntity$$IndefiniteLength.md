---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.IndefiniteLength
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:39:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.IndefiniteLength
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.IndefiniteLength

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity.IndefiniteLength

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
- IndefiniteLength
- [LastChunk](HttpEntity$$LastChunk.html "The final chunk of a chunk stream.")
- [Strict](HttpEntity$$Strict.html "The model for the entity of a \"regular\" unchunked HTTP message with known, fixed data.")
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[HttpEntity](HttpEntity$.html)

# IndefiniteLength[**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html "Permalink")

### 

#### final  case class IndefiniteLength(contentType: [ContentType](ContentType.html), data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends javadsl.model.HttpEntity.IndefiniteLength with [BodyPartEntity](BodyPartEntity.html) with WithoutKnownLength with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

The model for the entity of a BodyPart with an indefinite length.
Note that this type of HttpEntity can only be used for BodyParts.

Source[HttpEntity.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpEntity.scala#L520)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), WithoutKnownLength, [BodyPartEntity](BodyPartEntity.html), [HttpEntity](HttpEntity.html), javadsl.model.HttpEntity.IndefiniteLength, [javadsl.model.BodyPartEntity](../../javadsl/model/BodyPartEntity.html), [javadsl.model.HttpEntity](../../javadsl/model/HttpEntity.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. IndefiniteLength
2. Serializable
3. Product
4. Equals
5. WithoutKnownLength
6. BodyPartEntity
7. HttpEntity
8. IndefiniteLength
9. BodyPartEntity
10. HttpEntity
11. AnyRef
12. Any
Implicitly  
1. by HttpEntityScalaDSLSugar
2. by HttpEntityScalaDSLSugar
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#<init>(contentType:akka.http.scaladsl.model.ContentType,data:akka.stream.scaladsl.Source[akka.util.ByteString,Any]):akka.http.scaladsl.model.HttpEntity.IndefiniteLength "Permalink")  new IndefiniteLength(contentType: [ContentType](ContentType.html), data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)])
### Type Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#Self=akka.http.scaladsl.model.HttpEntity.IndefiniteLength "Permalink")  type Self \= IndefiniteLengthDefinition ClassesIndefiniteLength → WithoutKnownLength
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from IndefiniteLength toany2stringadd\[IndefiniteLength] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (IndefiniteLength, B)ImplicitThis member is added by an implicit conversion from IndefiniteLength toArrowAssoc\[IndefiniteLength] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#contentLengthOption:Option[Long] "Permalink")  def contentLengthOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Some(content length) if a length is defined for this entity, None otherwise.

Some(content length) if a length is defined for this entity, None otherwise.
A length is only defined for Strict and Default entity types.

In many cases it's dangerous to rely on the (non\-)existence of a content\-length.
HTTP intermediaries like (transparent) proxies are allowed to change the transfer\-encoding
which can result in the entity being delivered as another type as expected.

Definition ClassesWithoutKnownLength → [HttpEntity](HttpEntity.html)
9. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#contentType:akka.http.scaladsl.model.ContentType "Permalink")  val contentType: [ContentType](ContentType.html)The `ContentType` associated with this entity.

The `ContentType` associated with this entity.

Definition ClassesIndefiniteLength → WithoutKnownLength → [HttpEntity](HttpEntity.html)
10. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#data:akka.stream.scaladsl.Source[akka.util.ByteString,Any] "Permalink")  val data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesIndefiniteLength → WithoutKnownLength
11. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#dataBytes:akka.stream.scaladsl.Source[akka.util.ByteString,Any] "Permalink")  def dataBytes: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]A stream of the data of this entity.

A stream of the data of this entity.

Definition ClassesWithoutKnownLength → [HttpEntity](HttpEntity.html)
12. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#discardBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
13. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#discardBytes(mat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

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
14. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (IndefiniteLength) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): IndefiniteLengthImplicitThis member is added by an implicit conversion from IndefiniteLength toEnsuring\[IndefiniteLength] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (IndefiniteLength) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): IndefiniteLengthImplicitThis member is added by an implicit conversion from IndefiniteLength toEnsuring\[IndefiniteLength] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): IndefiniteLengthImplicitThis member is added by an implicit conversion from IndefiniteLength toEnsuring\[IndefiniteLength] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): IndefiniteLengthImplicitThis member is added by an implicit conversion from IndefiniteLength toEnsuring\[IndefiniteLength] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#getContentLengthOption():java.util.OptionalLong "Permalink")  def getContentLengthOption(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
21. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#getContentType():akka.http.javadsl.model.ContentType "Permalink")  def getContentType(): [javadsl.model.ContentType](../../javadsl/model/ContentType.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
22. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#getDataBytes():akka.stream.javadsl.Source[akka.util.ByteString,AnyRef] "Permalink")  def getDataBytes(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
23. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#isChunked():Boolean "Permalink")  def isChunked(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityChunked.

Returns if this entity is a subtype of HttpEntityChunked.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
24. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#isCloseDelimited():Boolean "Permalink")  def isCloseDelimited(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityCloseDelimited.

Returns if this entity is a subtype of HttpEntityCloseDelimited.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
25. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#isDefault():Boolean "Permalink")  def isDefault(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityDefault.

Returns if this entity is a subtype of HttpEntityDefault.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
26. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#isIndefiniteLength():Boolean "Permalink")  def isIndefiniteLength(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Definition ClassesIndefiniteLength → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
27. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#isKnownEmpty():Boolean "Permalink")  def isKnownEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Determines whether this entity is known to be empty.

Determines whether this entity is known to be empty.

Definition ClassesWithoutKnownLength → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
29. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#isStrict():Boolean "Permalink")  def isStrict(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityStrict.

Returns if this entity is a subtype of HttpEntityStrict.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
30. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
34. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#productPrefix:String "Permalink")  def productPrefix: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesIndefiniteLength → Product
35. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
37. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
38. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#toStrict(timeoutMillis:Long,maxBytes:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
39. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.HttpEntity.Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
40. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Strict](HttpEntity$$Strict.html)]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes.

Definition Classes[HttpEntity](HttpEntity.html)
41. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Strict](HttpEntity$$Strict.html)]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes
as configured in `akka.http.parsing.max-to-strict-bytes`. Not that this method does not support different
defaults for client\- and server use: if you want that, use the `toStrict` method and pass in an explicit
maximum number of bytes.

Definition Classes[HttpEntity](HttpEntity.html)
42. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#toString():String "Permalink")  def toString(): StringDefinition ClassesIndefiniteLength → AnyRef → Any
43. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#transformDataBytes(transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):WithoutKnownLength.this.Self "Permalink")  def transformDataBytes(transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Self](#Self=akka.http.scaladsl.model.HttpEntity.IndefiniteLength)Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.

Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.
For a `Chunked` entity, the chunks will be transformed one by one keeping the chunk metadata (but may introduce an
extra chunk before the `LastChunk` if `transformer.onTermination` returns additional data).

This method may only throw an exception if the `transformer` function throws an exception while creating the transformer.
Any other errors are reported through the new entity data stream.

Definition ClassesWithoutKnownLength → [HttpEntity](HttpEntity.html)
44. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#transformDataBytes(newContentLength:Long,transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.UniversalEntity "Permalink")  def transformDataBytes(newContentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [UniversalEntity](UniversalEntity.html)Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

Definition Classes[HttpEntity](HttpEntity.html)
45. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
46. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
47. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
48. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#withContentType(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.model.HttpEntity.IndefiniteLength "Permalink")  def withContentType(contentType: [ContentType](ContentType.html)): IndefiniteLengthCreates a copy of this HttpEntity with the `contentType` overridden with the given one.

Creates a copy of this HttpEntity with the `contentType` overridden with the given one.

Definition ClassesIndefiniteLength → [BodyPartEntity](BodyPartEntity.html) → [HttpEntity](HttpEntity.html)
49. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#withContentType(contentType:akka.http.javadsl.model.ContentType):akka.http.scaladsl.model.HttpEntity "Permalink")  def withContentType(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html)): [HttpEntity](HttpEntity.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
50. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#withData(data:akka.stream.scaladsl.Source[akka.util.ByteString,Any]):akka.http.scaladsl.model.HttpEntity.IndefiniteLength "Permalink")  def withData(data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): IndefiniteLengthDefinition ClassesIndefiniteLength → WithoutKnownLength
51. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#withSizeLimit(maxBytes:Long):WithoutKnownLength.this.Self "Permalink")  def withSizeLimit(maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Self](#Self=akka.http.scaladsl.model.HttpEntity.IndefiniteLength)Apply the given size limit to this entity by returning a new entity instance which automatically verifies that the
data stream encapsulated by this instance produces at most `maxBytes` data bytes.

Apply the given size limit to this entity by returning a new entity instance which automatically verifies that the
data stream encapsulated by this instance produces at most `maxBytes` data bytes. In case this verification fails
the respective stream will be terminated with an `EntityStreamException` either directly at materialization
time (if the Content\-Length is known) or whenever more data bytes than allowed have been read.

When called on `Strict` entities the method will return the entity itself if the length is within the bound,
otherwise a `Default` entity with a single element data stream. This allows for potential refinement of the
entity size limit at a later point (before materialization of the data stream).

By default all message entities produced by the HTTP layer automatically carry the limit that is defined in the
application's `max-content-length` config setting. If the entity is transformed in a way that changes the
Content\-Length and then another limit is applied then this new limit will be evaluated against the new
Content\-Length. If the entity is transformed in a way that changes the Content\-Length and no new limit is applied
then the previous limit will be applied against the previous Content\-Length.

Definition ClassesWithoutKnownLength → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
52. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#withoutSizeLimit():WithoutKnownLength.this.Self "Permalink")  def withoutSizeLimit(): [Self](#Self=akka.http.scaladsl.model.HttpEntity.IndefiniteLength)Lift the size limit from this entity by returning a new entity instance which skips the size verification.

Lift the size limit from this entity by returning a new entity instance which skips the size verification.

By default all message entities produced by the HTTP layer automatically carry the limit that is defined in the
application's `max-content-length` config setting. It is recommended to always keep an upper limit on accepted
entities to avoid potential attackers flooding you with too large requests/responses, so use this method with caution.

See [withSizeLimit](#withSizeLimit(maxBytes:Long):WithoutKnownLength.this.Self) for more details.

Definition ClassesWithoutKnownLength → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#discardBytes()(implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes()(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

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

ImplicitThis member is added by an implicit conversion from IndefiniteLength to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(indefiniteLength: HttpEntityScalaDSLSugar).discardBytes()(mat)
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#discardBytes()(implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes()(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpMessage.DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

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

ImplicitThis member is added by an implicit conversion from IndefiniteLength to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(indefiniteLength: HttpEntityScalaDSLSugar).discardBytes()(mat)
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#httpEntity:akka.http.scaladsl.model.HttpEntity "Permalink")  val httpEntity: [HttpEntity](HttpEntity.html)ImplicitThis member is added by an implicit conversion from IndefiniteLength to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(indefiniteLength: HttpEntityScalaDSLSugar).httpEntity
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
4. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#httpEntity:akka.http.scaladsl.model.HttpEntity "Permalink")  val httpEntity: [HttpEntity](HttpEntity.html)ImplicitThis member is added by an implicit conversion from IndefiniteLength to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(indefiniteLength: HttpEntityScalaDSLSugar).httpEntity
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from IndefiniteLength toStringFormat\[IndefiniteLength] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (IndefiniteLength, B)ImplicitThis member is added by an implicit conversion from IndefiniteLength toArrowAssoc\[IndefiniteLength] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from WithoutKnownLength

### Inherited from [BodyPartEntity](BodyPartEntity.html)

### Inherited from [HttpEntity](HttpEntity.html)

### Inherited from javadsl.model.HttpEntity.IndefiniteLength

### Inherited from [javadsl.model.BodyPartEntity](../../javadsl/model/BodyPartEntity.html)

### Inherited from [javadsl.model.HttpEntity](../../javadsl/model/HttpEntity.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion HttpEntityScalaDSLSugar fromIndefiniteLength to [HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)

### Inherited by implicit conversion HttpEntityScalaDSLSugar fromIndefiniteLength to [HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)

### Inherited by implicit conversion any2stringadd fromIndefiniteLength to any2stringadd\[IndefiniteLength]

### Inherited by implicit conversion StringFormat fromIndefiniteLength to StringFormat\[IndefiniteLength]

### Inherited by implicit conversion Ensuring fromIndefiniteLength to Ensuring\[IndefiniteLength]

### Inherited by implicit conversion ArrowAssoc fromIndefiniteLength to ArrowAssoc\[IndefiniteLength]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/UniversalEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html)*
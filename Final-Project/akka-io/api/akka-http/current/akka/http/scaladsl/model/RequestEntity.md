---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.RequestEntity
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:52:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.RequestEntity
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.RequestEntity

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.RequestEntity

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/http2/index.html "Permalink")  package [http2](http2/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)Definition Classes[model](index.html)
- [AttributeKey](AttributeKey.html)
- [AttributeKeys](AttributeKeys$.html)
- [BodyPartEntity](BodyPartEntity.html)
- [ByteContentRange](ByteContentRange.html)
- [ContentRange](ContentRange.html)
- [ContentType](ContentType.html "A ContentType represents a specific MediaType / HttpCharset combination.")
- [ContentTypeRange](ContentTypeRange.html)
- [ContentTypes](ContentTypes$.html)
- [DateTime](DateTime.html "Immutable, fast and efficient Date + Time implementation without any dependencies.")
- [EntityStreamException](EntityStreamException.html)
- [EntityStreamSizeException](EntityStreamSizeException.html "This exception is thrown when the size of the HTTP Entity exceeds the configured limit.")
- [ErrorInfo](ErrorInfo.html "Two-level model of error information.")
- [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "Marker for exceptions that provide an ErrorInfo")
- [FormData](FormData.html "Simple model for application/x-www-form-urlencoded form data.")
- [HttpCharset](HttpCharset.html)
- [HttpCharsetRange](HttpCharsetRange.html "A charset range as encountered in Accept-Charset.")
- [HttpCharsets](HttpCharsets$.html)
- [HttpEntity](HttpEntity.html "Models the entity (aka \"body\" or \"content\") of an HTTP message.")
- [HttpHeader](HttpHeader.html "The model of an HTTP header.")
- [HttpMessage](HttpMessage.html "Common base class of HttpRequest and HttpResponse.")
- [HttpMethod](HttpMethod.html "The method of an HTTP request.")
- [HttpMethods](HttpMethods$.html)
- [HttpProtocol](HttpProtocol.html "The protocol of an HTTP message")
- [HttpProtocols](HttpProtocols$.html)
- [HttpRequest](HttpRequest.html "The immutable model HTTP request model.")
- [HttpResponse](HttpResponse.html "The immutable HTTP response model.")
- [IllegalHeaderException](IllegalHeaderException.html)
- [IllegalRequestException](IllegalRequestException.html)
- [IllegalResponseException](IllegalResponseException.html)
- [IllegalUriException](IllegalUriException.html)
- [InvalidContentLengthException](InvalidContentLengthException.html)
- [MediaRange](MediaRange.html)
- [MediaRanges](MediaRanges$.html)
- [MediaType](MediaType.html "A MediaType describes the type of the content of an HTTP message entity.")
- [MediaTypes](MediaTypes$.html)
- [Multipart](Multipart.html "The model of multipart content for media-types multipart/\* (general multipart content), multipart/form-data and multipart/byteranges.")
- [OptHttpRequest](OptHttpRequest.html)
- [OptHttpResponse](OptHttpResponse.html)
- [ParsingException](ParsingException.html)
- [RemoteAddress](RemoteAddress.html)
- RequestEntity
- [RequestEntityAcceptance](RequestEntityAcceptance.html)
- [RequestResponseAssociation](RequestResponseAssociation.html "A marker trait for attribute values that should be (automatically) carried over from request to response.")
- [RequestTimeoutException](RequestTimeoutException.html)
- [ResponseEntity](ResponseEntity.html "An HttpEntity that can be used for responses.")
- [ResponsePromise](ResponsePromise.html "An association for completing a future when the response arrives.")
- [SensitiveHttpHeader](SensitiveHttpHeader.html "Marker trait for headers which contain portentially secret / sensitive information.")
- [SimpleRequestResponseAttribute](SimpleRequestResponseAttribute.html "A simple value holder class implementing RequestResponseAssociation.")
- [SslSessionInfo](SslSessionInfo.html)
- [StatusCode](StatusCode.html "The result status code of an HTTP response.")
- [StatusCodes](StatusCodes$.html)
- [Trailer](Trailer.html)
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings$.html)
- [UniversalEntity](UniversalEntity.html)
- [Uri](Uri.html "An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986.")
- [UriRendering](UriRendering$.html)
- [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")
t[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# RequestEntity[**](../../../../akka/http/scaladsl/model/RequestEntity.html "Permalink")

### 

#### sealed  trait RequestEntity extends [HttpEntity](HttpEntity.html) with [javadsl.model.RequestEntity](../../javadsl/model/RequestEntity.html) with [ResponseEntity](ResponseEntity.html)

An [HttpEntity](HttpEntity.html) that can be used for requests.
Note that all entities that can be used for requests can also be used for responses.
(But not the other way around, since [HttpEntity.CloseDelimited](HttpEntity$$CloseDelimited.html) can only be used for responses!)

Source[HttpEntity.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpEntity.scala#L226)Linear Supertypes[ResponseEntity](ResponseEntity.html), [javadsl.model.RequestEntity](../../javadsl/model/RequestEntity.html), [javadsl.model.ResponseEntity](../../javadsl/model/ResponseEntity.html), [HttpEntity](HttpEntity.html), [javadsl.model.HttpEntity](../../javadsl/model/HttpEntity.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Chunked](HttpEntity$$Chunked.html), [Default](HttpEntity$$Default.html), [Strict](HttpEntity$$Strict.html), [UniversalEntity](UniversalEntity.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RequestEntity
2. ResponseEntity
3. RequestEntity
4. ResponseEntity
5. HttpEntity
6. HttpEntity
7. AnyRef
8. Any
Implicitly  
1. by fromJava
2. by HttpEntityScalaDSLSugar
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#contentLengthOption:Option[Long] "Permalink") abstract  def contentLengthOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Some(content length) if a length is defined for this entity, None otherwise.

Some(content length) if a length is defined for this entity, None otherwise.
A length is only defined for Strict and Default entity types.

In many cases it's dangerous to rely on the (non\-)existence of a content\-length.
HTTP intermediaries like (transparent) proxies are allowed to change the transfer\-encoding
which can result in the entity being delivered as another type as expected.

Definition Classes[HttpEntity](HttpEntity.html)
2. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#contentType:akka.http.scaladsl.model.ContentType "Permalink") abstract  def contentType: [ContentType](ContentType.html)The `ContentType` associated with this entity.

The `ContentType` associated with this entity.

Definition Classes[HttpEntity](HttpEntity.html)
3. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#dataBytes:akka.stream.scaladsl.Source[akka.util.ByteString,Any] "Permalink") abstract  def dataBytes: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]A stream of the data of this entity.

A stream of the data of this entity.

Definition Classes[HttpEntity](HttpEntity.html)
4. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isKnownEmpty():Boolean "Permalink") abstract  def isKnownEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Determines whether this entity is known to be empty.

Determines whether this entity is known to be empty.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
5. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#transformDataBytes(transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.RequestEntity "Permalink") abstract  def transformDataBytes(transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): RequestEntityReturns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.

Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.
For a `Chunked` entity, the chunks will be transformed one by one keeping the chunk metadata (but may introduce an
extra chunk before the `LastChunk` if `transformer.onTermination` returns additional data).

This method may only throw an exception if the `transformer` function throws an exception while creating the transformer.
Any other errors are reported through the new entity data stream.

Definition ClassesRequestEntity → [ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html)
6. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#withContentType(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.model.RequestEntity "Permalink") abstract  def withContentType(contentType: [ContentType](ContentType.html)): RequestEntityCreates a copy of this HttpEntity with the `contentType` overridden with the given one.

Creates a copy of this HttpEntity with the `contentType` overridden with the given one.

Definition ClassesRequestEntity → [ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html)
7. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.RequestEntity "Permalink") abstract  def withSizeLimit(maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): RequestEntitySee [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity).

See [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity).

Definition ClassesRequestEntity → [ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
8. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#withoutSizeLimit():akka.http.scaladsl.model.RequestEntity "Permalink") abstract  def withoutSizeLimit(): RequestEntitySee [HttpEntity\#withoutSizeLimit](HttpEntity.html#withoutSizeLimit():akka.http.scaladsl.model.HttpEntity).

See [HttpEntity\#withoutSizeLimit](HttpEntity.html#withoutSizeLimit():akka.http.scaladsl.model.HttpEntity).

Definition ClassesRequestEntity → [ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/RequestEntity.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RequestEntity toany2stringadd\[RequestEntity] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RequestEntity, B)ImplicitThis member is added by an implicit conversion from RequestEntity toArrowAssoc\[RequestEntity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#discardBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
9. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#discardBytes(mat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

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
10. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RequestEntity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RequestEntityImplicitThis member is added by an implicit conversion from RequestEntity toEnsuring\[RequestEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RequestEntity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RequestEntityImplicitThis member is added by an implicit conversion from RequestEntity toEnsuring\[RequestEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RequestEntityImplicitThis member is added by an implicit conversion from RequestEntity toEnsuring\[RequestEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RequestEntityImplicitThis member is added by an implicit conversion from RequestEntity toEnsuring\[RequestEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#getContentLengthOption():java.util.OptionalLong "Permalink")  def getContentLengthOption(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
18. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#getContentType():akka.http.javadsl.model.ContentType "Permalink")  def getContentType(): [javadsl.model.ContentType](../../javadsl/model/ContentType.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
19. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#getDataBytes():akka.stream.javadsl.Source[akka.util.ByteString,AnyRef] "Permalink")  def getDataBytes(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
20. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#httpEntity:akka.http.scaladsl.model.HttpEntity "Permalink")  val httpEntity: [HttpEntity](HttpEntity.html)ImplicitThis member is added by an implicit conversion from RequestEntity to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
22. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isChunked():Boolean "Permalink")  def isChunked(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityChunked.

Returns if this entity is a subtype of HttpEntityChunked.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
23. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isCloseDelimited():Boolean "Permalink")  def isCloseDelimited(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityCloseDelimited.

Returns if this entity is a subtype of HttpEntityCloseDelimited.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
24. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isDefault():Boolean "Permalink")  def isDefault(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityDefault.

Returns if this entity is a subtype of HttpEntityDefault.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
25. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isIndefiniteLength():Boolean "Permalink")  def isIndefiniteLength(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
26. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
27. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isStrict():Boolean "Permalink")  def isStrict(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityStrict.

Returns if this entity is a subtype of HttpEntityStrict.

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
28. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
33. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
34. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeoutMillis:Long,maxBytes:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
35. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
36. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Strict](HttpEntity$$Strict.html)]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes.

Definition Classes[HttpEntity](HttpEntity.html)
37. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Strict](HttpEntity$$Strict.html)]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes
as configured in `akka.http.parsing.max-to-strict-bytes`. Not that this method does not support different
defaults for client\- and server use: if you want that, use the `toStrict` method and pass in an explicit
maximum number of bytes.

Definition Classes[HttpEntity](HttpEntity.html)
38. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#transformDataBytes(newContentLength:Long,transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.UniversalEntity "Permalink")  def transformDataBytes(newContentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [UniversalEntity](UniversalEntity.html)Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

Definition Classes[HttpEntity](HttpEntity.html)
40. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#withContentType(contentType:akka.http.javadsl.model.ContentType):akka.http.scaladsl.model.HttpEntity "Permalink")  def withContentType(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html)): [HttpEntity](HttpEntity.html)Java API

Java API

Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#contentLengthOption:Option[Long] "Permalink")  def contentLengthOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Some(content length) if a length is defined for this entity, None otherwise.

Some(content length) if a length is defined for this entity, None otherwise.
A length is only defined for Strict and Default entity types.

In many cases it's dangerous to rely on the (non\-)existence of a content\-length.
HTTP intermediaries like (transparent) proxies are allowed to change the transfer\-encoding
which can result in the entity being delivered as another type as expected.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).contentLengthOption
```
Definition Classes[HttpEntity](HttpEntity.html)
2. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#contentType:akka.http.scaladsl.model.ContentType "Permalink")  def contentType: [ContentType](ContentType.html)The `ContentType` associated with this entity.

The `ContentType` associated with this entity.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).contentType
```
Definition Classes[HttpEntity](HttpEntity.html)
3. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#dataBytes:akka.stream.scaladsl.Source[akka.util.ByteString,Any] "Permalink")  def dataBytes: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]A stream of the data of this entity.

A stream of the data of this entity.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).dataBytes
```
Definition Classes[HttpEntity](HttpEntity.html)
4. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#discardBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).discardBytes(system)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
5. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#discardBytes(mat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

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

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).discardBytes(mat)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
6. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#discardBytes()(implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardBytes()(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this `entity`.

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

ImplicitThis member is added by an implicit conversion from RequestEntity to[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html) performed by method HttpEntityScalaDSLSugar in [akka.http.scaladsl.model.HttpEntity](HttpEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: HttpEntityScalaDSLSugar).discardBytes()(mat)
```
Definition Classes[HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)
7. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#getContentLengthOption():java.util.OptionalLong "Permalink")  def getContentLengthOption(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).getContentLengthOption()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
8. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#getContentType():akka.http.javadsl.model.ContentType "Permalink")  def getContentType(): [javadsl.model.ContentType](../../javadsl/model/ContentType.html)Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).getContentType()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
9. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#getDataBytes():akka.stream.javadsl.Source[akka.util.ByteString,AnyRef] "Permalink")  def getDataBytes(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).getDataBytes()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
10. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isChunked():Boolean "Permalink")  def isChunked(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityChunked.

Returns if this entity is a subtype of HttpEntityChunked.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).isChunked()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
11. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isCloseDelimited():Boolean "Permalink")  def isCloseDelimited(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityCloseDelimited.

Returns if this entity is a subtype of HttpEntityCloseDelimited.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).isCloseDelimited()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
12. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isDefault():Boolean "Permalink")  def isDefault(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityDefault.

Returns if this entity is a subtype of HttpEntityDefault.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).isDefault()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
13. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isIndefiniteLength():Boolean "Permalink")  def isIndefiniteLength(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Returns if this entity is a subtype of HttpEntityIndefiniteLength.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).isIndefiniteLength()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
14. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isKnownEmpty():Boolean "Permalink")  def isKnownEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Determines whether this entity is known to be empty.

Determines whether this entity is known to be empty.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).isKnownEmpty()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
15. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#isStrict():Boolean "Permalink")  def isStrict(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityStrict.

Returns if this entity is a subtype of HttpEntityStrict.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).isStrict()
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
16. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).toStrict(timeoutMillis, maxBytes, system)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
17. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).toStrict(timeoutMillis, system)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
18. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeoutMillis:Long,maxBytes:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).toStrict(timeoutMillis, maxBytes, materializer)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
19. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).toStrict(timeoutMillis, materializer)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
20. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Strict](HttpEntity$$Strict.html)]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).toStrict(timeout, maxBytes)(fm)
```
Definition Classes[HttpEntity](HttpEntity.html)
21. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Strict](HttpEntity$$Strict.html)]Collects all possible parts and returns a potentially future Strict entity for easier processing.

Collects all possible parts and returns a potentially future Strict entity for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout,
or with a EntityStreamException when the end of the entity is not reached within the maximum number of bytes
as configured in `akka.http.parsing.max-to-strict-bytes`. Not that this method does not support different
defaults for client\- and server use: if you want that, use the `toStrict` method and pass in an explicit
maximum number of bytes.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).toStrict(timeout)(fm)
```
Definition Classes[HttpEntity](HttpEntity.html)
22. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#transformDataBytes(newContentLength:Long,transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.UniversalEntity "Permalink")  def transformDataBytes(newContentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [UniversalEntity](UniversalEntity.html)Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

Transforms this' entities data bytes with a transformer that will produce exactly the number of bytes given as
`newContentLength`.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).transformDataBytes(newContentLength, transformer)
```
Definition Classes[HttpEntity](HttpEntity.html)
23. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#transformDataBytes(transformer:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,Any]):akka.http.scaladsl.model.ResponseEntity "Permalink")  def transformDataBytes(transformer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [ResponseEntity](ResponseEntity.html)Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.

Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.
For a `Chunked` entity, the chunks will be transformed one by one keeping the chunk metadata (but may introduce an
extra chunk before the `LastChunk` if `transformer.onTermination` returns additional data).

This method may only throw an exception if the `transformer` function throws an exception while creating the transformer.
Any other errors are reported through the new entity data stream.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).transformDataBytes(transformer)
```
Definition Classes[ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html)
24. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#withContentType(contentType:akka.http.javadsl.model.ContentType):akka.http.scaladsl.model.HttpEntity "Permalink")  def withContentType(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html)): [HttpEntity](HttpEntity.html)Java API

Java API

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).withContentType(contentType)
```
Definition Classes[HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
25. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#withContentType(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.model.ResponseEntity "Permalink")  def withContentType(contentType: [ContentType](ContentType.html)): [ResponseEntity](ResponseEntity.html)Creates a copy of this HttpEntity with the `contentType` overridden with the given one.

Creates a copy of this HttpEntity with the `contentType` overridden with the given one.

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).withContentType(contentType)
```
Definition Classes[ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html)
26. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.ResponseEntity "Permalink")  def withSizeLimit(maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [ResponseEntity](ResponseEntity.html)See [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity).

See [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity).

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).withSizeLimit(maxBytes)
```
Definition Classes[ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
27. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#withoutSizeLimit():akka.http.scaladsl.model.ResponseEntity "Permalink")  def withoutSizeLimit(): [ResponseEntity](ResponseEntity.html)See [HttpEntity\#withoutSizeLimit](HttpEntity.html#withoutSizeLimit():akka.http.scaladsl.model.HttpEntity)

See [HttpEntity\#withoutSizeLimit](HttpEntity.html#withoutSizeLimit():akka.http.scaladsl.model.HttpEntity)

ImplicitThis member is added by an implicit conversion from RequestEntity to[ResponseEntity](ResponseEntity.html) performed by method fromJava in [akka.http.scaladsl.model.ResponseEntity](ResponseEntity$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestEntity: ResponseEntity).withoutSizeLimit()
```
Definition Classes[ResponseEntity](ResponseEntity.html) → [HttpEntity](HttpEntity.html) → [HttpEntity](../../javadsl/model/HttpEntity.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RequestEntity toStringFormat\[RequestEntity] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/RequestEntity.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RequestEntity, B)ImplicitThis member is added by an implicit conversion from RequestEntity toArrowAssoc\[RequestEntity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ResponseEntity](ResponseEntity.html)

### Inherited from [javadsl.model.RequestEntity](../../javadsl/model/RequestEntity.html)

### Inherited from [javadsl.model.ResponseEntity](../../javadsl/model/ResponseEntity.html)

### Inherited from [HttpEntity](HttpEntity.html)

### Inherited from [javadsl.model.HttpEntity](../../javadsl/model/HttpEntity.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion fromJava fromRequestEntity to [ResponseEntity](ResponseEntity.html)

### Inherited by implicit conversion HttpEntityScalaDSLSugar fromRequestEntity to [HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html)

### Inherited by implicit conversion any2stringadd fromRequestEntity to any2stringadd\[RequestEntity]

### Inherited by implicit conversion StringFormat fromRequestEntity to StringFormat\[RequestEntity]

### Inherited by implicit conversion Ensuring fromRequestEntity to Ensuring\[RequestEntity]

### Inherited by implicit conversion ArrowAssoc fromRequestEntity to ArrowAssoc\[RequestEntity]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypes$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ErrorInfo$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsets$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$Chunked.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$CloseDelimited.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$Default.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$HttpEntityScalaDSLSugar.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/RequestEntity.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/RequestEntity.html)*
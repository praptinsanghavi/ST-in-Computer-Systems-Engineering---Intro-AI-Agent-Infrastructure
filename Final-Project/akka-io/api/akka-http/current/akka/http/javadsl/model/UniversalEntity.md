---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.UniversalEntity
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:10:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/UniversalEntity.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.UniversalEntity
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.UniversalEntity

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.UniversalEntity

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/javadsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/javadsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)Definition Classes[model](index.html)
- [AttributeKey](AttributeKey.html)
- [AttributeKeys](AttributeKeys.html)
- [Authority](Authority.html "Represents a hostname, port and user info.")
- [BodyPartEntity](BodyPartEntity.html "Marker-interface for entity types that can be used in a body part")
- [ContentRange](ContentRange.html)
- [ContentType](ContentType.html "Represents an Http content-type.")
- [ContentTypeRange](ContentTypeRange.html "A data structure that combines an acceptable media range and an acceptable charset range into one structure to be used with unmarshalling.")
- [ContentTypes](ContentTypes.html "Contains the set of predefined content-types for convenience.")
- [DateTime](DateTime.html "Immutable, fast and efficient Date + Time implementation without any dependencies.")
- [FormData](FormData.html "Simple model for application/x-www-form-urlencoded form data.")
- [Host](Host.html "Represents a host in a URI or a Host header.")
- [HttpCharset](HttpCharset.html "Represents a charset in Http.")
- [HttpCharsetRange](HttpCharsetRange.html "Represents an Http charset range.")
- [HttpCharsetRanges](HttpCharsetRanges.html "Contains constructors to create a HttpCharsetRange.")
- [HttpCharsets](HttpCharsets.html "Contains a set of predefined charsets.")
- [HttpEntities](HttpEntities.html "Constructors for HttpEntity instances")
- [HttpEntity](HttpEntity.html "Represents the entity of an Http message.")
- [HttpHeader](HttpHeader.html "The base type representing Http headers.")
- [HttpMessage](HttpMessage.html "The base type for an Http message (request or response).")
- [HttpMethod](HttpMethod.html "Represents an HTTP request method.")
- [HttpMethods](HttpMethods.html "Contains static constants for predefined method types.")
- [HttpProtocol](HttpProtocol.html "Represents an Http protocol (currently only HTTP/1.0 or HTTP/1.1).")
- [HttpProtocols](HttpProtocols.html "Contains constants of the supported Http protocols.")
- [HttpRequest](HttpRequest.html "Represents an Http request.")
- [HttpResponse](HttpResponse.html "Represents an Http response.")
- [MediaRange](MediaRange.html "Represents an Http media-range.")
- [MediaRanges](MediaRanges.html "Contains a set of predefined media-ranges and static methods to create custom ones.")
- [MediaType](MediaType.html)
- [MediaTypes](MediaTypes.html "Contains the set of predefined media-types.")
- [Multipart](Multipart.html "The model of multipart content for media-types multipart/\* (general multipart content), multipart/form-data and multipart/byteranges.")
- [Multiparts](Multiparts.html "Constructors for Multipart instances")
- [Query](Query.html)
- [RemoteAddress](RemoteAddress.html)
- [RemoteAddresses](RemoteAddresses.html)
- [RequestEntity](RequestEntity.html "Marker-interface for entity types that can be used in a request")
- [RequestEntityAcceptance](RequestEntityAcceptance.html)
- [RequestEntityAcceptances](RequestEntityAcceptances.html)
- [RequestResponseAssociation](RequestResponseAssociation.html "A marker trait for attribute values that should be (automatically) carried over from request to response.")
- [ResponseEntity](ResponseEntity.html "Marker-interface for entity types that can be used in a response")
- [ResponseFuture](ResponseFuture.html "An association for completing a future when the response arrives.")
- [SslSessionInfo](SslSessionInfo.html)
- [StatusCode](StatusCode.html "Represents an Http status-code and message.")
- [StatusCodes](StatusCodes.html "Contains the set of predefined status-codes along with static methods to access and create custom status-codes.")
- [Trailer](Trailer.html "Trailing headers for HTTP/2 responses")
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings.html)
- UniversalEntity
- [Uri](Uri.html "Represents an Uri.")
t[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[model](index.html)

# UniversalEntity[**](../../../../akka/http/javadsl/model/UniversalEntity.html "Permalink")

### 

#### trait UniversalEntity extends [RequestEntity](RequestEntity.html) with [ResponseEntity](ResponseEntity.html) with [BodyPartEntity](BodyPartEntity.html)

Marker\-interface for entity types that can be used in any context

Source[UniversalEntity.java](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/java/akka/http/javadsl/model/UniversalEntity.java#L8)Linear Supertypes[BodyPartEntity](BodyPartEntity.html), [RequestEntity](RequestEntity.html), [ResponseEntity](ResponseEntity.html), [HttpEntity](HttpEntity.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Default](../../scaladsl/model/HttpEntity$$Default.html), [Strict](../../scaladsl/model/HttpEntity$$Strict.html), [UniversalEntity](../../scaladsl/model/UniversalEntity.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UniversalEntity
2. BodyPartEntity
3. RequestEntity
4. ResponseEntity
5. HttpEntity
6. AnyRef
7. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#discardBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.javadsl.model.HttpMessage.DiscardedEntity "Permalink") abstract  def discardBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): DiscardedEntityDiscards the entities data bytes by running the `dataBytes` Source contained in this entity.

Discards the entities data bytes by running the `dataBytes` Source contained in this entity.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html)
as otherwise the lack of consuming of the data will trigger back\-pressure to the underlying TCP connection
(as designed), however possibly leading to an idle\-timeout that will close the connection, instead of
just having ignored the data.

Warning: It is not allowed to discard and/or consume the `dataBytes` more than once
as the stream is directly attached to the "live" incoming data source from the underlying TCP connection.
Allowing it to be consumable twice would require buffering the incoming data, thus defeating the purpose
of its streaming nature. If the dataBytes source is materialized a second time, it will fail with an
"stream can cannot be materialized more than once" exception.

When called on `Strict` entities or sources whose values can be buffered in memory,
the above warnings can be ignored. Repeated materialization is not necessary in this case, avoiding
the mentioned exceptions due to the data being held in memory.

In future versions, more automatic ways to warn or resolve these situations may be introduced, see issue \#18716\.

Definition Classes[HttpEntity](HttpEntity.html)
2. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#discardBytes(materializer:akka.stream.Materializer):akka.http.javadsl.model.HttpMessage.DiscardedEntity "Permalink") abstract  def discardBytes(materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): DiscardedEntityDiscards the entities data bytes by running the `dataBytes` Source contained in this entity.

Discards the entities data bytes by running the `dataBytes` Source contained in this entity.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html)
as otherwise the lack of consuming of the data will trigger back\-pressure to the underlying TCP connection
(as designed), however possibly leading to an idle\-timeout that will close the connection, instead of
just having ignored the data.

Warning: It is not allowed to discard and/or consume the `dataBytes` more than once
as the stream is directly attached to the "live" incoming data source from the underlying TCP connection.
Allowing it to be consumable twice would require buffering the incoming data, thus defeating the purpose
of its streaming nature. If the dataBytes source is materialized a second time, it will fail with an
"stream can cannot be materialized more than once" exception.

When called on `Strict` entities or sources whose values can be buffered in memory,
the above warnings can be ignored. Repeated materialization is not necessary in this case, avoiding
the mentioned exceptions due to the data being held in memory.

In future versions, more automatic ways to warn or resolve these situations may be introduced, see issue \#18716\.

Definition Classes[HttpEntity](HttpEntity.html)
3. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#getContentLengthOption():java.util.OptionalLong "Permalink") abstract  def getContentLengthOption(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Returns Some(contentLength) if the length is defined and none otherwise.

Returns Some(contentLength) if the length is defined and none otherwise.

Definition Classes[HttpEntity](HttpEntity.html)
4. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#getContentType():akka.http.javadsl.model.ContentType "Permalink") abstract  def getContentType(): [ContentType](ContentType.html)Returns the content\-type of this entity

Returns the content\-type of this entity

Definition Classes[HttpEntity](HttpEntity.html)
5. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#getDataBytes():akka.stream.javadsl.Source[akka.util.ByteString,Object] "Permalink") abstract  def getDataBytes(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Returns a stream of data bytes this entity consists of.

Returns a stream of data bytes this entity consists of.

Definition Classes[HttpEntity](HttpEntity.html)
6. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#isChunked():Boolean "Permalink") abstract  def isChunked(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityChunked.

Returns if this entity is a subtype of HttpEntityChunked.

Definition Classes[HttpEntity](HttpEntity.html)
7. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#isCloseDelimited():Boolean "Permalink") abstract  def isCloseDelimited(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityCloseDelimited.

Returns if this entity is a subtype of HttpEntityCloseDelimited.

Definition Classes[HttpEntity](HttpEntity.html)
8. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#isDefault():Boolean "Permalink") abstract  def isDefault(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityDefault.

Returns if this entity is a subtype of HttpEntityDefault.

Definition Classes[HttpEntity](HttpEntity.html)
9. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#isIndefiniteLength():Boolean "Permalink") abstract  def isIndefiniteLength(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Returns if this entity is a subtype of HttpEntityIndefiniteLength.

Definition Classes[HttpEntity](HttpEntity.html)
10. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#isKnownEmpty():Boolean "Permalink") abstract  def isKnownEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is known to be empty.

Returns if this entity is known to be empty. Open\-ended entity types like
HttpEntityChunked and HttpCloseDelimited will always return false here.

Definition Classes[HttpEntity](HttpEntity.html)
11. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#isStrict():Boolean "Permalink") abstract  def isStrict(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this entity is a subtype of HttpEntityStrict.

Returns if this entity is a subtype of HttpEntityStrict.

Definition Classes[HttpEntity](HttpEntity.html)
12. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Returns a CompletionStage of a strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected.

Returns a CompletionStage of a strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected. As the
duration of receiving the complete entity cannot be predicted, a timeout needs to
be specified to guard the process against running and keeping resources infinitely.

Use getDataBytes and stream processing instead if the expected data is big or
is likely to take a long time.

Definition Classes[HttpEntity](HttpEntity.html)
13. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Returns a CompletionStage of a strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected.

Returns a CompletionStage of a strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected. As the
duration of receiving the complete entity cannot be predicted, a timeout needs to
be specified to guard the process against running and keeping resources infinitely.

Use getDataBytes and stream processing instead if the expected data is big or
is likely to take a long time.

Definition Classes[HttpEntity](HttpEntity.html)
14. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#toStrict(timeoutMillis:Long,maxBytes:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Returns a CompletionStage of a strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected.

Returns a CompletionStage of a strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected. As the
duration of receiving the complete entity cannot be predicted, a timeout needs to
be specified to guard the process against running and keeping resources infinitely.

Use getDataBytes and stream processing instead if the expected data is big or
is likely to take a long time.

Definition Classes[HttpEntity](HttpEntity.html)
15. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpEntity.Strict] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Returns a CompletionStage of a strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected.

Returns a CompletionStage of a strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected. As the
duration of receiving the complete entity cannot be predicted, a timeout needs to
be specified to guard the process against running and keeping resources infinitely.

Use getDataBytes and stream processing instead if the expected data is big or
is likely to take a long time.

Definition Classes[HttpEntity](HttpEntity.html)
16. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#withContentType(contentType:akka.http.javadsl.model.ContentType):akka.http.javadsl.model.HttpEntity "Permalink") abstract  def withContentType(contentType: [ContentType](ContentType.html)): [HttpEntity](HttpEntity.html)Returns a copy of this entity with new content type./

Returns a copy of this entity with new content type./

Definition Classes[HttpEntity](HttpEntity.html)
17. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#withSizeLimit(maxBytes:Long):akka.http.javadsl.model.HttpEntity "Permalink") abstract  def withSizeLimit(maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [HttpEntity](HttpEntity.html)Apply the given size limit to this entity by returning a new entity instance which automatically verifies that the
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

Definition Classes[HttpEntity](HttpEntity.html)
18. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#withoutSizeLimit():akka.http.javadsl.model.HttpEntity "Permalink") abstract  def withoutSizeLimit(): [HttpEntity](HttpEntity.html)Lift the size limit from this entity by returning a new entity instance which skips the size verification.

Lift the size limit from this entity by returning a new entity instance which skips the size verification.

By default all message entities produced by the HTTP layer automatically carry the limit that is defined in the
application's `max-content-length` config setting. It is recommended to always keep an upper limit on accepted
entities to avoid potential attackers flooding you with too large requests/responses, so use this method with caution.

See [withSizeLimit](#withSizeLimit(maxBytes:Long):akka.http.javadsl.model.HttpEntity) for more details.

Definition Classes[HttpEntity](HttpEntity.html)
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/model/UniversalEntity.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UniversalEntity toany2stringadd\[UniversalEntity] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UniversalEntity, B)ImplicitThis member is added by an implicit conversion from UniversalEntity toArrowAssoc\[UniversalEntity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UniversalEntity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UniversalEntityImplicitThis member is added by an implicit conversion from UniversalEntity toEnsuring\[UniversalEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UniversalEntity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UniversalEntityImplicitThis member is added by an implicit conversion from UniversalEntity toEnsuring\[UniversalEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UniversalEntityImplicitThis member is added by an implicit conversion from UniversalEntity toEnsuring\[UniversalEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UniversalEntityImplicitThis member is added by an implicit conversion from UniversalEntity toEnsuring\[UniversalEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UniversalEntity toStringFormat\[UniversalEntity] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/model/UniversalEntity.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UniversalEntity, B)ImplicitThis member is added by an implicit conversion from UniversalEntity toArrowAssoc\[UniversalEntity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BodyPartEntity](BodyPartEntity.html)

### Inherited from [RequestEntity](RequestEntity.html)

### Inherited from [ResponseEntity](ResponseEntity.html)

### Inherited from [HttpEntity](HttpEntity.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUniversalEntity to any2stringadd\[UniversalEntity]

### Inherited by implicit conversion StringFormat fromUniversalEntity to StringFormat\[UniversalEntity]

### Inherited by implicit conversion Ensuring fromUniversalEntity to Ensuring\[UniversalEntity]

### Inherited by implicit conversion ArrowAssoc fromUniversalEntity to ArrowAssoc\[UniversalEntity]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentTypes.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsetRanges.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpEntities.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaRanges.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Multiparts.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Query.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RemoteAddresses.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptances.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseFuture$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseFuture.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/SslSessionInfo$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/UniversalEntity.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/UniversalEntity.html)*
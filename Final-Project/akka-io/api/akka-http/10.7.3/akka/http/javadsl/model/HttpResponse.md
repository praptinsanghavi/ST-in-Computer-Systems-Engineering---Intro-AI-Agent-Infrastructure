---
description: Akka HTTP 10.7.3 - akka.http.javadsl.model.HttpResponse
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpResponse.html
title: Akka HTTP 10.7.3 - akka.http.javadsl.model.HttpResponse
---

# Akka HTTP 10.7.3 - akka.http.javadsl.model.HttpResponse

> **Summary:** Akka HTTP 10.7.3 - akka.http.javadsl.model.HttpResponse

## Content

Akka HTTP10\.7\.3 \< Back****# Packages

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
- HttpResponse
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
- [UniversalEntity](UniversalEntity.html "Marker-interface for entity types that can be used in any context")
- [Uri](Uri.html "Represents an Uri.")
c[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[model](index.html)

# HttpResponse[**](../../../../akka/http/javadsl/model/HttpResponse.html "Permalink")

### 

#### abstract  class HttpResponse extends [HttpMessage](HttpMessage.html) with MessageTransformations\[HttpResponse]

Represents an Http response.

Source[HttpResponse.java](https://github.com/akka/akka-http/tree/v10.7.3/akka-http-core/src/main/java/akka/http/javadsl/model/HttpResponse.java#L13)Linear SupertypesMessageTransformations\[HttpResponse], [HttpMessage](HttpMessage.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[HttpResponse](../../scaladsl/model/HttpResponse.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpResponse
2. MessageTransformations
3. HttpMessage
4. AnyRef
5. Any
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

1. [**](../../../../akka/http/javadsl/model/HttpResponse.html#<init>():akka.http.javadsl.model.HttpResponse "Permalink")  new HttpResponse()
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/model/HttpResponse.html#addAttribute[T](key:akka.http.javadsl.model.AttributeKey[T],value:T):Self "Permalink") abstract  def addAttribute\[T](key: [AttributeKey](AttributeKey.html)\[T], value: T): HttpResponseDefinition ClassesMessageTransformations
2. [**](../../../../akka/http/javadsl/model/HttpResponse.html#addCredentials(credentials:akka.http.javadsl.model.headers.HttpCredentials):Self "Permalink") abstract  def addCredentials(credentials: [HttpCredentials](headers/HttpCredentials.html)): HttpResponseReturns a copy of this message with the given http credential header added to the list of headers.

Returns a copy of this message with the given http credential header added to the list of headers.

Definition ClassesMessageTransformations
3. [**](../../../../akka/http/javadsl/model/HttpResponse.html#addHeader(header:akka.http.javadsl.model.HttpHeader):Self "Permalink") abstract  def addHeader(header: [HttpHeader](HttpHeader.html)): HttpResponseReturns a copy of this message with the given header added to the list of headers.

Returns a copy of this message with the given header added to the list of headers.

Definition ClassesMessageTransformations
4. [**](../../../../akka/http/javadsl/model/HttpResponse.html#addHeaders(headers:Iterable[akka.http.javadsl.model.HttpHeader]):Self "Permalink") abstract  def addHeaders(headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](HttpHeader.html)]): HttpResponseReturns a copy of this message with the given headers added to the list of headers.

Returns a copy of this message with the given headers added to the list of headers.

Definition ClassesMessageTransformations
5. [**](../../../../akka/http/javadsl/model/HttpResponse.html#discardEntityBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.javadsl.model.HttpMessage.DiscardedEntity "Permalink") abstract  def discardEntityBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): DiscardedEntityDiscards the entities data bytes by running the `dataBytes` Source contained by the `entity`
of this HTTP message.

Discards the entities data bytes by running the `dataBytes` Source contained by the `entity`
of this HTTP message.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html)
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

Definition Classes[HttpMessage](HttpMessage.html)
6. [**](../../../../akka/http/javadsl/model/HttpResponse.html#discardEntityBytes(materializer:akka.stream.Materializer):akka.http.javadsl.model.HttpMessage.DiscardedEntity "Permalink") abstract  def discardEntityBytes(materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): DiscardedEntityDiscards the entities data bytes by running the `dataBytes` Source contained by the `entity`
of this HTTP message.

Discards the entities data bytes by running the `dataBytes` Source contained by the `entity`
of this HTTP message.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html)
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

Definition Classes[HttpMessage](HttpMessage.html)
7. [**](../../../../akka/http/javadsl/model/HttpResponse.html#encoding():akka.http.javadsl.model.headers.HttpEncoding "Permalink") abstract  def encoding(): [HttpEncoding](headers/HttpEncoding.html)Returns the content encoding as specified by the Content\-Encoding header.

Returns the content encoding as specified by the Content\-Encoding header. If no Content\-Encoding header is present the
default value 'identity' is returned.
8. [**](../../../../akka/http/javadsl/model/HttpResponse.html#entity():akka.http.javadsl.model.ResponseEntity "Permalink") abstract  def entity(): [ResponseEntity](ResponseEntity.html)Returns the entity of this response.

Returns the entity of this response.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
9. [**](../../../../akka/http/javadsl/model/HttpResponse.html#getAttribute[T](key:akka.http.javadsl.model.AttributeKey[T]):java.util.Optional[T] "Permalink") abstract  def getAttribute\[T](key: [AttributeKey](AttributeKey.html)\[T]): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]Try to find the attribute for the given key and return
Optional.of(attribute), otherwise this method returns an empty Optional.

Try to find the attribute for the given key and return
Optional.of(attribute), otherwise this method returns an empty Optional.

Definition Classes[HttpMessage](HttpMessage.html)
10. [**](../../../../akka/http/javadsl/model/HttpResponse.html#getHeader[T<:akka.http.javadsl.model.HttpHeader](headerClass:Class[T]):java.util.Optional[T] "Permalink") abstract  def getHeader\[T \<: [HttpHeader](HttpHeader.html)](headerClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[T]): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]Try to find the first header of the given class and return
Optional.of(header), otherwise this method returns an empty Optional.

Try to find the first header of the given class and return
Optional.of(header), otherwise this method returns an empty Optional.

Definition Classes[HttpMessage](HttpMessage.html)Exceptions thrown`IllegalArgumentException` if headerClass is a custom header.
11. [**](../../../../akka/http/javadsl/model/HttpResponse.html#getHeader(headerName:String):java.util.Optional[akka.http.javadsl.model.HttpHeader] "Permalink") abstract  def getHeader(headerName: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpHeader](HttpHeader.html)]Try to find the first header with the given name (case\-insensitive) and return
Optional.of(header), otherwise this method returns an empty Optional.

Try to find the first header with the given name (case\-insensitive) and return
Optional.of(header), otherwise this method returns an empty Optional.

Definition Classes[HttpMessage](HttpMessage.html)
12. [**](../../../../akka/http/javadsl/model/HttpResponse.html#getHeaders[T<:akka.http.javadsl.model.HttpHeader](headerClass:Class[T]):Iterable[T] "Permalink") abstract  def getHeaders\[T \<: [HttpHeader](HttpHeader.html)](headerClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[T]): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[T]An iterable containing all headers of the given class
of this message.

An iterable containing all headers of the given class
of this message.

Definition Classes[HttpMessage](HttpMessage.html)
13. [**](../../../../akka/http/javadsl/model/HttpResponse.html#getHeaders():Iterable[akka.http.javadsl.model.HttpHeader] "Permalink") abstract  def getHeaders(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](HttpHeader.html)]An iterable containing the headers of this message.

An iterable containing the headers of this message.

Definition Classes[HttpMessage](HttpMessage.html)
14. [**](../../../../akka/http/javadsl/model/HttpResponse.html#isRequest():Boolean "Permalink") abstract  def isRequest(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this instance a request.

Is this instance a request.

Definition Classes[HttpMessage](HttpMessage.html)
15. [**](../../../../akka/http/javadsl/model/HttpResponse.html#isResponse():Boolean "Permalink") abstract  def isResponse(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this instance a response.

Is this instance a response.

Definition Classes[HttpMessage](HttpMessage.html)
16. [**](../../../../akka/http/javadsl/model/HttpResponse.html#protocol():akka.http.javadsl.model.HttpProtocol "Permalink") abstract  def protocol(): [HttpProtocol](HttpProtocol.html)The protocol of this message.

The protocol of this message.

Definition Classes[HttpMessage](HttpMessage.html)
17. [**](../../../../akka/http/javadsl/model/HttpResponse.html#removeAttribute(key:akka.http.javadsl.model.AttributeKey[_]):Self "Permalink") abstract  def removeAttribute(key: [AttributeKey](AttributeKey.html)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): HttpResponseReturns a copy of this message with the attribute with this key (if any) removed.

Returns a copy of this message with the attribute with this key (if any) removed.

Definition ClassesMessageTransformations
18. [**](../../../../akka/http/javadsl/model/HttpResponse.html#removeHeader(headerName:String):Self "Permalink") abstract  def removeHeader(headerName: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): HttpResponseReturns a copy of this message with all headers of the given name (case\-insensitively) removed.

Returns a copy of this message with all headers of the given name (case\-insensitively) removed.

Definition ClassesMessageTransformations
19. [**](../../../../akka/http/javadsl/model/HttpResponse.html#status():akka.http.javadsl.model.StatusCode "Permalink") abstract  def status(): [StatusCode](StatusCode.html)Returns the status\-code of this response.
20. [**](../../../../akka/http/javadsl/model/HttpResponse.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[_<:Self] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[\_ \<: HttpResponse]Returns a CompletionStage of Self message with strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected.

Returns a CompletionStage of Self message with strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected. As the
duration of receiving the complete entity cannot be predicted, a timeout needs to
be specified to guard the process against running and keeping resources infinitely.

Use getEntity().getDataBytes and stream processing instead if the expected data is big or
is likely to take a long time.

Definition ClassesMessageTransformations
21. [**](../../../../akka/http/javadsl/model/HttpResponse.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[_<:Self] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[\_ \<: HttpResponse]Returns a CompletionStage of Self message with strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected.

Returns a CompletionStage of Self message with strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected. As the
duration of receiving the complete entity cannot be predicted, a timeout needs to
be specified to guard the process against running and keeping resources infinitely.

Use getEntity().getDataBytes and stream processing instead if the expected data is big or
is likely to take a long time.

Definition ClassesMessageTransformations
22. [**](../../../../akka/http/javadsl/model/HttpResponse.html#toStrict(timeoutMillis:Long,maxBytes:Long,ec:java.util.concurrent.Executor,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[_<:Self] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ec: [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[\_ \<: HttpResponse]Returns a CompletionStage of Self message with strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected.

Returns a CompletionStage of Self message with strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected. As the
duration of receiving the complete entity cannot be predicted, a timeout needs to
be specified to guard the process against running and keeping resources infinitely.

Use getEntity().getDataBytes and stream processing instead if the expected data is big or
is likely to take a long time.

Definition ClassesMessageTransformations
23. [**](../../../../akka/http/javadsl/model/HttpResponse.html#toStrict(timeoutMillis:Long,ec:java.util.concurrent.Executor,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[_<:Self] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ec: [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[\_ \<: HttpResponse]Returns a CompletionStage of Self message with strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected.

Returns a CompletionStage of Self message with strict entity that contains the same data as this entity
which is only completed when the complete entity has been collected. As the
duration of receiving the complete entity cannot be predicted, a timeout needs to
be specified to guard the process against running and keeping resources infinitely.

Use getEntity().getDataBytes and stream processing instead if the expected data is big or
is likely to take a long time.

Definition ClassesMessageTransformations
24. [**](../../../../akka/http/javadsl/model/HttpResponse.html#transformEntityDataBytes[T](transformer:akka.stream.Graph[akka.stream.FlowShape[akka.util.ByteString,akka.util.ByteString],T]):Self "Permalink") abstract  def transformEntityDataBytes\[T](transformer: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)], T]): HttpResponseReturns a copy of Self message after applying the given transformation

Returns a copy of Self message after applying the given transformation

Definition ClassesMessageTransformations
25. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(entity:akka.http.javadsl.model.ResponseEntity):akka.http.javadsl.model.HttpResponse "Permalink") abstract  def withEntity(entity: [ResponseEntity](ResponseEntity.html)): HttpResponseReturns a copy of this instance with a new entity.
26. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(entity:akka.http.javadsl.model.RequestEntity):Self "Permalink") abstract  def withEntity(entity: [RequestEntity](RequestEntity.html)): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesMessageTransformations
27. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(type:akka.http.javadsl.model.ContentType,file:java.nio.file.Path):Self "Permalink") abstract  def withEntity(type: [ContentType](ContentType.html), file: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesMessageTransformations
28. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(type:akka.http.javadsl.model.ContentType,file:java.io.File):Self "Permalink") abstract  def withEntity(type: [ContentType](ContentType.html), file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesMessageTransformations
29. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(type:akka.http.javadsl.model.ContentType,bytes:akka.util.ByteString):Self "Permalink") abstract  def withEntity(type: [ContentType](ContentType.html), bytes: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesMessageTransformations
30. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(type:akka.http.javadsl.model.ContentType,bytes:Array[Byte]):Self "Permalink") abstract  def withEntity(type: [ContentType](ContentType.html), bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesMessageTransformations
31. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(type:akka.http.javadsl.model.ContentType.NonBinary,string:String):Self "Permalink") abstract  def withEntity(type: [NonBinary](ContentType$$NonBinary.html), string: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesMessageTransformations
32. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(bytes:akka.util.ByteString):Self "Permalink") abstract  def withEntity(bytes: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesMessageTransformations
33. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(bytes:Array[Byte]):Self "Permalink") abstract  def withEntity(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesMessageTransformations
34. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withEntity(string:String):Self "Permalink") abstract  def withEntity(string: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): HttpResponseReturns a copy of this message with a new entity.

Returns a copy of this message with a new entity.

Definition ClassesMessageTransformations
35. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withHeaders(headers:Iterable[akka.http.javadsl.model.HttpHeader]):Self "Permalink") abstract  def withHeaders(headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](HttpHeader.html)]): HttpResponseReturns a copy of this message with new headers.

Returns a copy of this message with new headers.

Definition ClassesMessageTransformations
36. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withProtocol(protocol:akka.http.javadsl.model.HttpProtocol):Self "Permalink") abstract  def withProtocol(protocol: [HttpProtocol](HttpProtocol.html)): HttpResponseReturns a copy of this message with a new protocol.

Returns a copy of this message with a new protocol.

Definition ClassesMessageTransformations
37. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withStatus(statusCode:Int):akka.http.javadsl.model.HttpResponse "Permalink") abstract  def withStatus(statusCode: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): HttpResponseReturns a copy of this instance with a new status\-code.
38. [**](../../../../akka/http/javadsl/model/HttpResponse.html#withStatus(statusCode:akka.http.javadsl.model.StatusCode):akka.http.javadsl.model.HttpResponse "Permalink") abstract  def withStatus(statusCode: [StatusCode](StatusCode.html)): HttpResponseReturns a copy of this instance with a new status\-code.
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/model/HttpResponse.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/model/HttpResponse.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/model/HttpResponse.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpResponse toany2stringadd\[HttpResponse] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/model/HttpResponse.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpResponse, B)ImplicitThis member is added by an implicit conversion from HttpResponse toArrowAssoc\[HttpResponse] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/model/HttpResponse.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/model/HttpResponse.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/model/HttpResponse.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/model/HttpResponse.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpResponse) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpResponseImplicitThis member is added by an implicit conversion from HttpResponse toEnsuring\[HttpResponse] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/model/HttpResponse.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpResponse) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpResponseImplicitThis member is added by an implicit conversion from HttpResponse toEnsuring\[HttpResponse] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/model/HttpResponse.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpResponseImplicitThis member is added by an implicit conversion from HttpResponse toEnsuring\[HttpResponse] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/model/HttpResponse.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpResponseImplicitThis member is added by an implicit conversion from HttpResponse toEnsuring\[HttpResponse] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/model/HttpResponse.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/model/HttpResponse.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/model/HttpResponse.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/model/HttpResponse.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/model/HttpResponse.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/model/HttpResponse.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/model/HttpResponse.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/model/HttpResponse.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/model/HttpResponse.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/model/HttpResponse.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/model/HttpResponse.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/model/HttpResponse.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/model/HttpResponse.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/model/HttpResponse.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/model/HttpResponse.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpResponse toStringFormat\[HttpResponse] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/model/HttpResponse.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpResponse, B)ImplicitThis member is added by an implicit conversion from HttpResponse toArrowAssoc\[HttpResponse] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from MessageTransformations\[HttpResponse]

### Inherited from [HttpMessage](HttpMessage.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpResponse to any2stringadd\[HttpResponse]

### Inherited by implicit conversion StringFormat fromHttpResponse to StringFormat\[HttpResponse]

### Inherited by implicit conversion Ensuring fromHttpResponse to Ensuring\[HttpResponse]

### Inherited by implicit conversion ArrowAssoc fromHttpResponse to ArrowAssoc\[HttpResponse]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/ContentType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/ContentTypes.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/Host.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpCharsetRanges.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpEntities.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/MediaRanges.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/MediaType$.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/Multiparts.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/Query.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/RemoteAddresses.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/RequestEntityAcceptances.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/ResponseEntity.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpResponse.html](https://doc.akka.io/api/akka-http/10.7.3/akka/http/javadsl/model/HttpResponse.html)*
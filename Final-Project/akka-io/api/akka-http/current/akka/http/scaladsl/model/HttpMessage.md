---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:51:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage

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
- HttpMessage
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
- [RequestEntity](RequestEntity.html "An HttpEntity that can be used for requests.")
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
[t](HttpMessage$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [HttpMessage](HttpMessage$.html "See companion object")[**](../../../../akka/http/scaladsl/model/HttpMessage.html "Permalink")

### Companion [object HttpMessage](HttpMessage$.html "See companion object")

#### sealed  trait HttpMessage extends [javadsl.model.HttpMessage](../../javadsl/model/HttpMessage.html)

Common base class of HttpRequest and HttpResponse.

Source[HttpMessage.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpMessage.scala#L39)Linear Supertypes[javadsl.model.HttpMessage](../../javadsl/model/HttpMessage.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[HttpRequest](HttpRequest.html), [HttpResponse](HttpResponse.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpMessage
2. HttpMessage
3. AnyRef
4. Any
Implicitly  
1. by HttpMessageScalaDSLSugar
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self} "Permalink") abstract  type Self \<: HttpMessage { type Self \= HttpMessage.this.Self }
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#attributes:Map[akka.http.scaladsl.model.AttributeKey[_],_] "Permalink") abstract  def attributes: Map\[[AttributeKey](AttributeKey.html)\[\_], \_]
2. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#entity():akka.http.scaladsl.model.ResponseEntity "Permalink") abstract  def entity(): [ResponseEntity](ResponseEntity.html)The entity of this message.

The entity of this message.

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
3. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#headers:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink") abstract  def headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]
4. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#isRequest():Boolean "Permalink") abstract  def isRequest(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this instance a request.

Is this instance a request.

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
5. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#isResponse():Boolean "Permalink") abstract  def isResponse(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this instance a response.

Is this instance a response.

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
6. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#protocol():akka.http.scaladsl.model.HttpProtocol "Permalink") abstract  def protocol(): [HttpProtocol](HttpProtocol.html)The protocol of this message.

The protocol of this message.

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
7. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#self:HttpMessage.this.Self "Permalink") abstract  def self: [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
8. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#transformEntityDataBytes[M](transformer:akka.stream.Graph[akka.stream.FlowShape[akka.util.ByteString,akka.util.ByteString],M]):HttpMessage.this.Self "Permalink") abstract  def transformEntityDataBytes\[M](transformer: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)], M]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
9. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withAttributes(headers:Map[akka.http.scaladsl.model.AttributeKey[_],_]):HttpMessage.this.Self "Permalink") abstract  def withAttributes(headers: Map\[[AttributeKey](AttributeKey.html)\[\_], \_]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Returns a copy of this message with the attributes set to the given ones.
10. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(entity:akka.http.scaladsl.model.MessageEntity):HttpMessage.this.Self "Permalink") abstract  def withEntity(entity: [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Returns a copy of this message with the entity set to the given one.
11. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withHeaders(headers:Seq[akka.http.scaladsl.model.HttpHeader]):HttpMessage.this.Self "Permalink") abstract  def withHeaders(headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Returns a copy of this message with the list of headers set to the given ones.
12. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withHeadersAndEntity(headers:Seq[akka.http.scaladsl.model.HttpHeader],entity:akka.http.scaladsl.model.MessageEntity):HttpMessage.this.Self "Permalink") abstract  def withHeadersAndEntity(headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)], entity: [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Returns a copy of this message with the entity and headers set to the given ones.
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpMessage.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpMessage toany2stringadd\[HttpMessage] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpMessage, B)ImplicitThis member is added by an implicit conversion from HttpMessage toArrowAssoc\[HttpMessage] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#addAttribute[T](key:akka.http.javadsl.model.AttributeKey[T],value:T):HttpMessage.this.Self "Permalink")  def addAttribute\[T](key: [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T], value: T): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
7. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#addCredentials(credentials:akka.http.javadsl.model.headers.HttpCredentials):HttpMessage.this.Self "Permalink")  def addCredentials(credentials: [HttpCredentials](../../javadsl/model/headers/HttpCredentials.html)): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
8. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#addHeader(header:akka.http.javadsl.model.HttpHeader):HttpMessage.this.Self "Permalink")  def addHeader(header: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Return a new instance with the given header added to the headers sequence.

Return a new instance with the given header added to the headers sequence. It's undefined where the header is added to the sequence
9. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#addHeaders(headers:Iterable[akka.http.javadsl.model.HttpHeader]):HttpMessage.this.Self "Permalink")  def addHeaders(headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Java API
10. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#attribute[T](key:akka.http.javadsl.model.AttributeKey[T])(implicitev:akka.http.impl.util.JavaMapping[akka.http.javadsl.model.AttributeKey[T],akka.http.scaladsl.model.AttributeKey[T]]):Option[T] "Permalink")  def attribute\[T](key: [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T])(implicit ev: JavaMapping\[[javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T], [AttributeKey](AttributeKey.html)\[T]]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]
12. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#connectionCloseExpected:Boolean "Permalink")  def connectionCloseExpected: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if this message is an:

Returns true if this message is an:

	- HttpRequest and the client does not want to reuse the connection after the response for this request has been received
	- HttpResponse and the server will close the connection after this response
14. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#discardEntityBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardEntityBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Java API

Java API

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
15. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#discardEntityBytes(mat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardEntityBytes(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this HttpMessage.

Discards the entities data bytes by running the `dataBytes` Source contained in this HttpMessage.

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

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
16. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#encoding:akka.http.scaladsl.model.headers.HttpEncoding "Permalink")  def encoding: [HttpEncoding](headers/HttpEncoding.html)The content encoding as specified by the Content\-Encoding header.

The content encoding as specified by the Content\-Encoding header. If no Content\-Encoding header is present the
default value 'identity' is returned.
17. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpMessage) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpMessageImplicitThis member is added by an implicit conversion from HttpMessage toEnsuring\[HttpMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpMessage) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpMessageImplicitThis member is added by an implicit conversion from HttpMessage toEnsuring\[HttpMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpMessageImplicitThis member is added by an implicit conversion from HttpMessage toEnsuring\[HttpMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpMessageImplicitThis member is added by an implicit conversion from HttpMessage toEnsuring\[HttpMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#getAttribute[T](attributeKey:akka.http.javadsl.model.AttributeKey[T]):java.util.Optional[T] "Permalink")  def getAttribute\[T](attributeKey: [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T]): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]Java API

Java API

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
24. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#getHeader(headerName:String):java.util.Optional[akka.http.javadsl.model.HttpHeader] "Permalink")  def getHeader(headerName: String): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]Java API

Java API

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
26. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#getHeader[T<:akka.http.javadsl.model.HttpHeader](headerClass:Class[T]):java.util.Optional[T] "Permalink")  def getHeader\[T \<: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)](headerClass: Class\[T]): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]Java API

Java API

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
27. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#getHeaders[T<:akka.http.javadsl.model.HttpHeader](headerClass:Class[T]):Iterable[T] "Permalink")  def getHeaders\[T \<: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)](headerClass: Class\[T]): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[T]Java API

Java API

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
28. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#getHeaders():Iterable[akka.http.javadsl.model.HttpHeader] "Permalink")  def getHeaders(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]Java API

Java API

Definition ClassesHttpMessage → [HttpMessage](../../javadsl/model/HttpMessage.html)
29. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#header(headerName:String):Option[akka.http.scaladsl.model.HttpHeader] "Permalink")  def header(headerName: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpHeader](HttpHeader.html)]
31. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#header[T>:Null<:akka.http.javadsl.model.HttpHeader](implicitevidence$1:scala.reflect.ClassTag[T]):Option[T] "Permalink")  def header\[T \>: Null \<: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Returns the first header of the given type if there is one

Returns the first header of the given type if there is one

Exceptions thrown`IllegalArgumentException` if headerClass is a custom header.
32. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#headers[T<:akka.http.javadsl.model.HttpHeader](implicitevidence$2:scala.reflect.ClassTag[T]):Seq[T] "Permalink")  def headers\[T \<: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Returns all the headers of the given type \*
33. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#httpMessage:akka.http.scaladsl.model.HttpMessage "Permalink")  val httpMessage: HttpMessageImplicitThis member is added by an implicit conversion from HttpMessage to[HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html) performed by method HttpMessageScalaDSLSugar in [akka.http.scaladsl.model.HttpMessage](HttpMessage$.html).Definition Classes[HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html)
34. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
35. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#mapAttributes(f:Map[akka.http.scaladsl.model.AttributeKey[_],_]=>Map[akka.http.scaladsl.model.AttributeKey[_],_]):HttpMessage.this.Self "Permalink")  def mapAttributes(f: (Map\[[AttributeKey](AttributeKey.html)\[\_], \_]) \=\> Map\[[AttributeKey](AttributeKey.html)\[\_], \_]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Returns a copy of this message with the attributes transformed by the given function
36. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#mapHeaders(f:Seq[akka.http.scaladsl.model.HttpHeader]=>Seq[akka.http.scaladsl.model.HttpHeader]):HttpMessage.this.Self "Permalink")  def mapHeaders(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Returns a copy of this message with the list of headers transformed by the given function
37. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
38. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
39. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
40. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#removeAttribute(key:akka.http.javadsl.model.AttributeKey[_]):HttpMessage.this.Self "Permalink")  def removeAttribute(key: [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[\_]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
41. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#removeHeader(headerName:String):HttpMessage.this.Self "Permalink")  def removeHeader(headerName: String): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Removes the header with the given name (case\-insensitive)
42. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
43. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[HttpMessage.this.Self] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})]Java API
44. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[HttpMessage.this.Self] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})]Java API
45. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#toStrict(timeoutMillis:Long,maxBytes:Long,ec:java.util.concurrent.Executor,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[HttpMessage.this.Self] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ec: [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})]Java API
46. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#toStrict(timeoutMillis:Long,ec:java.util.concurrent.Executor,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[HttpMessage.this.Self] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ec: [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})]Java API
47. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long)(implicitec:scala.concurrent.ExecutionContext,implicitfm:akka.stream.Materializer):scala.concurrent.Future[HttpMessage.this.Self] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})]Returns a shareable and serializable copy of this message with a strict entity.
48. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitec:scala.concurrent.ExecutionContext,implicitfm:akka.stream.Materializer):scala.concurrent.Future[HttpMessage.this.Self] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})]Returns a shareable and serializable copy of this message with a strict entity.
49. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
50. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
51. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
52. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
53. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withDefaultHeaders(firstHeader:akka.http.scaladsl.model.HttpHeader,otherHeaders:akka.http.scaladsl.model.HttpHeader*):HttpMessage.this.Self "Permalink")  def withDefaultHeaders(firstHeader: [HttpHeader](HttpHeader.html), otherHeaders: [HttpHeader](HttpHeader.html)\*): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
54. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withDefaultHeaders(defaultHeaders:Seq[akka.http.scaladsl.model.HttpHeader]):HttpMessage.this.Self "Permalink")  def withDefaultHeaders(defaultHeaders: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Returns a new message that contains all of the given default headers which didn't already
exist (by case\-insensitive header name) in this message.
55. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(contentType:akka.http.javadsl.model.ContentType,file:java.nio.file.Path):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html), file: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
56. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(contentType:akka.http.javadsl.model.ContentType,file:java.io.File):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html), file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
57. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(contentType:akka.http.javadsl.model.ContentType,bytes:akka.util.ByteString):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html), bytes: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
58. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(contentType:akka.http.javadsl.model.ContentType,bytes:Array[Byte]):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html), bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
59. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(contentType:akka.http.javadsl.model.ContentType.NonBinary,string:String):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [NonBinary](../../javadsl/model/ContentType$$NonBinary.html), string: String): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
60. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(bytes:akka.util.ByteString):HttpMessage.this.Self "Permalink")  def withEntity(bytes: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
61. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(bytes:Array[Byte]):HttpMessage.this.Self "Permalink")  def withEntity(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
62. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withEntity(string:String):HttpMessage.this.Self "Permalink")  def withEntity(string: String): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
63. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withHeaders(firstHeader:akka.http.scaladsl.model.HttpHeader,otherHeaders:akka.http.scaladsl.model.HttpHeader*):HttpMessage.this.Self "Permalink")  def withHeaders(firstHeader: [HttpHeader](HttpHeader.html), otherHeaders: [HttpHeader](HttpHeader.html)\*): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})
64. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#withHeaders(headers:Iterable[akka.http.javadsl.model.HttpHeader]):HttpMessage.this.Self "Permalink")  def withHeaders(headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]): [Self](#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Java API
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#discardEntityBytes()(implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardEntityBytes()(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained by the `entity` of this HTTP message.

Discards the entities data bytes by running the `dataBytes` Source contained by the `entity` of this HTTP message.

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

ImplicitThis member is added by an implicit conversion from HttpMessage to[HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html) performed by method HttpMessageScalaDSLSugar in [akka.http.scaladsl.model.HttpMessage](HttpMessage$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(httpMessage: HttpMessageScalaDSLSugar).discardEntityBytes()(mat)
```
Definition Classes[HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpMessage toStringFormat\[HttpMessage] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/HttpMessage.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpMessage, B)ImplicitThis member is added by an implicit conversion from HttpMessage toArrowAssoc\[HttpMessage] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.model.HttpMessage](../../javadsl/model/HttpMessage.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion HttpMessageScalaDSLSugar fromHttpMessage to [HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html)

### Inherited by implicit conversion any2stringadd fromHttpMessage to any2stringadd\[HttpMessage]

### Inherited by implicit conversion StringFormat fromHttpMessage to StringFormat\[HttpMessage]

### Inherited by implicit conversion Ensuring fromHttpMessage to Ensuring\[HttpMessage]

### Inherited by implicit conversion ArrowAssoc fromHttpMessage to ArrowAssoc\[HttpMessage]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType$$NonBinary.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html)*
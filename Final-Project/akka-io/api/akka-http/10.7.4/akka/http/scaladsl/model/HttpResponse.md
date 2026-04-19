---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpResponse
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpResponse
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpResponse

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpResponse

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
- HttpResponse
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
[c](HttpResponse$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [HttpResponse](HttpResponse$.html "See companion object")[**](../../../../akka/http/scaladsl/model/HttpResponse.html "Permalink")

### Companion [object HttpResponse](HttpResponse$.html "See companion object")

#### final  class HttpResponse extends [javadsl.model.HttpResponse](../../javadsl/model/HttpResponse.html) with [HttpMessage](HttpMessage.html)

The immutable HTTP response model.

Source[HttpMessage.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpMessage.scala#L520)Linear Supertypes[HttpMessage](HttpMessage.html), [javadsl.model.HttpResponse](../../javadsl/model/HttpResponse.html), MessageTransformations\[[javadsl.model.HttpResponse](../../javadsl/model/HttpResponse.html)], [javadsl.model.HttpMessage](../../javadsl/model/HttpMessage.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpResponse
2. HttpMessage
3. HttpResponse
4. MessageTransformations
5. HttpMessage
6. AnyRef
7. Any
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
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#<init>(status:akka.http.scaladsl.model.StatusCode,headers:Seq[akka.http.scaladsl.model.HttpHeader],attributes:Map[akka.http.scaladsl.model.AttributeKey[_],_],entity:akka.http.scaladsl.model.ResponseEntity,protocol:akka.http.scaladsl.model.HttpProtocol):akka.http.scaladsl.model.HttpResponse "Permalink")  new HttpResponse(status: [StatusCode](StatusCode.html), headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)], attributes: Map\[[AttributeKey](AttributeKey.html)\[\_], \_], entity: [ResponseEntity](ResponseEntity.html), protocol: [HttpProtocol](HttpProtocol.html))
### Type Members

1. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#Self=akka.http.scaladsl.model.HttpResponse "Permalink")  type Self \= HttpResponseDefinition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpResponse.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpResponse toany2stringadd\[HttpResponse] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpResponse, B)ImplicitThis member is added by an implicit conversion from HttpResponse toArrowAssoc\[HttpResponse] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#_1:akka.http.scaladsl.model.StatusCode "Permalink")  def \_1: [StatusCode](StatusCode.html)
7. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#_2:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink")  def \_2: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]
8. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#_3:akka.http.scaladsl.model.ResponseEntity "Permalink")  def \_3: [ResponseEntity](ResponseEntity.html)
9. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#_4:akka.http.scaladsl.model.HttpProtocol "Permalink")  def \_4: [HttpProtocol](HttpProtocol.html)
10. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#addAttribute[T](key:akka.http.javadsl.model.AttributeKey[T],value:T):HttpMessage.this.Self "Permalink")  def addAttribute\[T](key: [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T], value: T): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
11. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#addCredentials(credentials:akka.http.javadsl.model.headers.HttpCredentials):HttpMessage.this.Self "Permalink")  def addCredentials(credentials: [HttpCredentials](../../javadsl/model/headers/HttpCredentials.html)): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
12. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#addHeader(header:akka.http.javadsl.model.HttpHeader):HttpMessage.this.Self "Permalink")  def addHeader(header: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Return a new instance with the given header added to the headers sequence.

Return a new instance with the given header added to the headers sequence. It's undefined where the header is added to the sequence

Definition Classes[HttpMessage](HttpMessage.html)
13. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#addHeaders(headers:Iterable[akka.http.javadsl.model.HttpHeader]):HttpMessage.this.Self "Permalink")  def addHeaders(headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html)
14. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
15. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#attribute[T](key:akka.http.javadsl.model.AttributeKey[T])(implicitev:akka.http.impl.util.JavaMapping[akka.http.javadsl.model.AttributeKey[T],akka.http.scaladsl.model.AttributeKey[T]]):Option[T] "Permalink")  def attribute\[T](key: [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T])(implicit ev: JavaMapping\[[javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T], [AttributeKey](AttributeKey.html)\[T]]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Definition Classes[HttpMessage](HttpMessage.html)
16. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#attributes:Map[akka.http.scaladsl.model.AttributeKey[_],_] "Permalink")  val attributes: Map\[[AttributeKey](AttributeKey.html)\[\_], \_]Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
17. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#connectionCloseExpected:Boolean "Permalink")  def connectionCloseExpected: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if this message is an:

Returns true if this message is an:

	- HttpRequest and the client does not want to reuse the connection after the response for this request has been received
	- HttpResponse and the server will close the connection after this responseDefinition Classes[HttpMessage](HttpMessage.html)
19. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#discardEntityBytes(system:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardEntityBytes(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
20. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#discardEntityBytes(mat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardEntityBytes(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained in this HttpMessage.

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

Definition Classes[HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
21. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#encoding:akka.http.scaladsl.model.headers.HttpEncoding "Permalink")  def encoding: [HttpEncoding](headers/HttpEncoding.html)The content encoding as specified by the Content\-Encoding header.

The content encoding as specified by the Content\-Encoding header. If no Content\-Encoding header is present the
default value 'identity' is returned.

Definition Classes[HttpMessage](HttpMessage.html)
22. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpResponse) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpResponseImplicitThis member is added by an implicit conversion from HttpResponse toEnsuring\[HttpResponse] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpResponse) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpResponseImplicitThis member is added by an implicit conversion from HttpResponse toEnsuring\[HttpResponse] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpResponseImplicitThis member is added by an implicit conversion from HttpResponse toEnsuring\[HttpResponse] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpResponseImplicitThis member is added by an implicit conversion from HttpResponse toEnsuring\[HttpResponse] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
26. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#entity:akka.http.scaladsl.model.ResponseEntity "Permalink")  val entity: [ResponseEntity](ResponseEntity.html)The entity of this message.

The entity of this message.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html) → [HttpResponse](../../javadsl/model/HttpResponse.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
27. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesHttpResponse → AnyRef → Any
29. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#getAttribute[T](attributeKey:akka.http.javadsl.model.AttributeKey[T]):java.util.Optional[T] "Permalink")  def getAttribute\[T](attributeKey: [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T]): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
30. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#getHeader(headerName:String):java.util.Optional[akka.http.javadsl.model.HttpHeader] "Permalink")  def getHeader(headerName: String): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
32. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#getHeader[T<:akka.http.javadsl.model.HttpHeader](headerClass:Class[T]):java.util.Optional[T] "Permalink")  def getHeader\[T \<: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)](headerClass: Class\[T]): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
33. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#getHeaders[T<:akka.http.javadsl.model.HttpHeader](headerClass:Class[T]):Iterable[T] "Permalink")  def getHeaders\[T \<: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)](headerClass: Class\[T]): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[T]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
34. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#getHeaders():Iterable[akka.http.javadsl.model.HttpHeader] "Permalink")  def getHeaders(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
35. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHttpResponse → AnyRef → Any
36. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#header(headerName:String):Option[akka.http.scaladsl.model.HttpHeader] "Permalink")  def header(headerName: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpHeader](HttpHeader.html)]Definition Classes[HttpMessage](HttpMessage.html)
37. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#header[T>:Null<:akka.http.javadsl.model.HttpHeader](implicitevidence$1:scala.reflect.ClassTag[T]):Option[T] "Permalink")  def header\[T \>: Null \<: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Returns the first header of the given type if there is one

Returns the first header of the given type if there is one

Definition Classes[HttpMessage](HttpMessage.html)Exceptions thrown`IllegalArgumentException` if headerClass is a custom header.
38. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#headers[T<:akka.http.javadsl.model.HttpHeader](implicitevidence$2:scala.reflect.ClassTag[T]):Seq[T] "Permalink")  def headers\[T \<: [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Returns all the headers of the given type \*

Returns all the headers of the given type \*

Definition Classes[HttpMessage](HttpMessage.html)
39. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#headers:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink")  val headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
40. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#httpMessage:akka.http.scaladsl.model.HttpMessage "Permalink")  val httpMessage: [HttpMessage](HttpMessage.html)ImplicitThis member is added by an implicit conversion from HttpResponse to[HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html) performed by method HttpMessageScalaDSLSugar in [akka.http.scaladsl.model.HttpMessage](HttpMessage$.html).Definition Classes[HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html)
41. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
42. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#isRequest():Boolean "Permalink")  def isRequest(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this instance a request.

Is this instance a request.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
43. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#isResponse():Boolean "Permalink")  def isResponse(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this instance a response.

Is this instance a response.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
44. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#mapAttributes(f:Map[akka.http.scaladsl.model.AttributeKey[_],_]=>Map[akka.http.scaladsl.model.AttributeKey[_],_]):HttpMessage.this.Self "Permalink")  def mapAttributes(f: (Map\[[AttributeKey](AttributeKey.html)\[\_], \_]) \=\> Map\[[AttributeKey](AttributeKey.html)\[\_], \_]): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Returns a copy of this message with the attributes transformed by the given function

Returns a copy of this message with the attributes transformed by the given function

Definition Classes[HttpMessage](HttpMessage.html)
45. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#mapEntity(f:akka.http.scaladsl.model.ResponseEntity=>akka.http.scaladsl.model.ResponseEntity):akka.http.scaladsl.model.HttpResponse "Permalink")  def mapEntity(f: ([ResponseEntity](ResponseEntity.html)) \=\> [ResponseEntity](ResponseEntity.html)): HttpResponse
46. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#mapHeaders(f:Seq[akka.http.scaladsl.model.HttpHeader]=>Seq[akka.http.scaladsl.model.HttpHeader]):HttpMessage.this.Self "Permalink")  def mapHeaders(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Returns a copy of this message with the list of headers transformed by the given function

Returns a copy of this message with the list of headers transformed by the given function

Definition Classes[HttpMessage](HttpMessage.html)
47. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
48. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
49. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
50. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#protocol:akka.http.scaladsl.model.HttpProtocol "Permalink")  val protocol: [HttpProtocol](HttpProtocol.html)The protocol of this message.

The protocol of this message.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html) → [HttpMessage](../../javadsl/model/HttpMessage.html)
51. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#removeAttribute(key:akka.http.javadsl.model.AttributeKey[_]):HttpMessage.this.Self "Permalink")  def removeAttribute(key: [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[\_]): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
52. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#removeHeader(headerName:String):HttpMessage.this.Self "Permalink")  def removeHeader(headerName: String): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Removes the header with the given name (case\-insensitive)

Removes the header with the given name (case\-insensitive)

Definition Classes[HttpMessage](HttpMessage.html)
53. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#self:akka.http.scaladsl.model.HttpResponse "Permalink")  def self: HttpResponseDefinition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
54. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#status:akka.http.scaladsl.model.StatusCode "Permalink")  val status: [StatusCode](StatusCode.html)Returns the status\-code of this response.

Returns the status\-code of this response.

Definition ClassesHttpResponse → [HttpResponse](../../javadsl/model/HttpResponse.html)
55. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
56. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#toStrict(timeoutMillis:Long,maxBytes:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[HttpMessage.this.Self] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Self](#Self=akka.http.scaladsl.model.HttpResponse)]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html)
57. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#toStrict(timeoutMillis:Long,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[HttpMessage.this.Self] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Self](#Self=akka.http.scaladsl.model.HttpResponse)]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html)
58. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#toStrict(timeoutMillis:Long,maxBytes:Long,ec:java.util.concurrent.Executor,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[HttpMessage.this.Self] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ec: [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Self](#Self=akka.http.scaladsl.model.HttpResponse)]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html)
59. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#toStrict(timeoutMillis:Long,ec:java.util.concurrent.Executor,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[HttpMessage.this.Self] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ec: [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Self](#Self=akka.http.scaladsl.model.HttpResponse)]Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html)
60. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long)(implicitec:scala.concurrent.ExecutionContext,implicitfm:akka.stream.Materializer):scala.concurrent.Future[HttpMessage.this.Self] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Self](#Self=akka.http.scaladsl.model.HttpResponse)]Returns a shareable and serializable copy of this message with a strict entity.

Returns a shareable and serializable copy of this message with a strict entity.

Definition Classes[HttpMessage](HttpMessage.html)
61. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitec:scala.concurrent.ExecutionContext,implicitfm:akka.stream.Materializer):scala.concurrent.Future[HttpMessage.this.Self] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Self](#Self=akka.http.scaladsl.model.HttpResponse)]Returns a shareable and serializable copy of this message with a strict entity.

Returns a shareable and serializable copy of this message with a strict entity.

Definition Classes[HttpMessage](HttpMessage.html)
62. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesHttpResponse → AnyRef → Any
63. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#transformEntityDataBytes[T](transformer:akka.stream.Graph[akka.stream.FlowShape[akka.util.ByteString,akka.util.ByteString],T]):akka.http.scaladsl.model.HttpResponse "Permalink")  def transformEntityDataBytes\[T](transformer: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)], T]): HttpResponseReturns a copy of Self message after applying the given transformation

Returns a copy of Self message after applying the given transformation

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html) → MessageTransformations
64. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
65. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
66. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
67. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withAttributes(attributes:Map[akka.http.scaladsl.model.AttributeKey[_],_]):akka.http.scaladsl.model.HttpResponse "Permalink")  def withAttributes(attributes: Map\[[AttributeKey](AttributeKey.html)\[\_], \_]): HttpResponseReturns a copy of this message with the attributes set to the given ones.

Returns a copy of this message with the attributes set to the given ones.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
68. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withDefaultHeaders(firstHeader:akka.http.scaladsl.model.HttpHeader,otherHeaders:akka.http.scaladsl.model.HttpHeader*):HttpMessage.this.Self "Permalink")  def withDefaultHeaders(firstHeader: [HttpHeader](HttpHeader.html), otherHeaders: [HttpHeader](HttpHeader.html)\*): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
69. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withDefaultHeaders(defaultHeaders:Seq[akka.http.scaladsl.model.HttpHeader]):HttpMessage.this.Self "Permalink")  def withDefaultHeaders(defaultHeaders: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Returns a new message that contains all of the given default headers which didn't already
exist (by case\-insensitive header name) in this message.

Returns a new message that contains all of the given default headers which didn't already
exist (by case\-insensitive header name) in this message.

Definition Classes[HttpMessage](HttpMessage.html)
70. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(entity:akka.http.javadsl.model.RequestEntity):akka.http.scaladsl.model.HttpResponse "Permalink")  def withEntity(entity: [javadsl.model.RequestEntity](../../javadsl/model/RequestEntity.html)): HttpResponseReturns a copy of Self message with a new entity.

Returns a copy of Self message with a new entity.

Definition ClassesHttpResponse → MessageTransformations
71. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(entity:akka.http.scaladsl.model.MessageEntity):akka.http.scaladsl.model.HttpResponse "Permalink")  def withEntity(entity: [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)): HttpResponseReturns a copy of this message with the entity set to the given one.

Returns a copy of this message with the entity set to the given one.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
72. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(entity:akka.http.javadsl.model.ResponseEntity):akka.http.scaladsl.model.HttpResponse "Permalink")  def withEntity(entity: [javadsl.model.ResponseEntity](../../javadsl/model/ResponseEntity.html)): HttpResponseReturns a copy of this instance with a new entity.

Returns a copy of this instance with a new entity.

Definition ClassesHttpResponse → [HttpResponse](../../javadsl/model/HttpResponse.html)
73. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(contentType:akka.http.javadsl.model.ContentType,file:java.nio.file.Path):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html), file: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
74. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(contentType:akka.http.javadsl.model.ContentType,file:java.io.File):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html), file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
75. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(contentType:akka.http.javadsl.model.ContentType,bytes:akka.util.ByteString):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html), bytes: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
76. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(contentType:akka.http.javadsl.model.ContentType,bytes:Array[Byte]):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [javadsl.model.ContentType](../../javadsl/model/ContentType.html), bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
77. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(contentType:akka.http.javadsl.model.ContentType.NonBinary,string:String):HttpMessage.this.Self "Permalink")  def withEntity(contentType: [NonBinary](../../javadsl/model/ContentType$$NonBinary.html), string: String): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
78. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(bytes:akka.util.ByteString):HttpMessage.this.Self "Permalink")  def withEntity(bytes: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
79. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(bytes:Array[Byte]):HttpMessage.this.Self "Permalink")  def withEntity(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
80. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withEntity(string:String):HttpMessage.this.Self "Permalink")  def withEntity(string: String): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
81. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withHeaders(headers:Seq[akka.http.scaladsl.model.HttpHeader]):akka.http.scaladsl.model.HttpResponse "Permalink")  def withHeaders(headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]): HttpResponseReturns a copy of this message with the list of headers set to the given ones.

Returns a copy of this message with the list of headers set to the given ones.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
82. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withHeaders(firstHeader:akka.http.scaladsl.model.HttpHeader,otherHeaders:akka.http.scaladsl.model.HttpHeader*):HttpMessage.this.Self "Permalink")  def withHeaders(firstHeader: [HttpHeader](HttpHeader.html), otherHeaders: [HttpHeader](HttpHeader.html)\*): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Definition Classes[HttpMessage](HttpMessage.html)
83. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withHeaders(headers:Iterable[akka.http.javadsl.model.HttpHeader]):HttpMessage.this.Self "Permalink")  def withHeaders(headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]): [Self](#Self=akka.http.scaladsl.model.HttpResponse)Java API

Java API

Definition Classes[HttpMessage](HttpMessage.html)
84. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withHeadersAndEntity(headers:Seq[akka.http.scaladsl.model.HttpHeader],entity:akka.http.scaladsl.model.ResponseEntity):akka.http.scaladsl.model.HttpResponse "Permalink")  def withHeadersAndEntity(headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)], entity: [ResponseEntity](ResponseEntity.html)): HttpResponse
85. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withHeadersAndEntity(headers:Seq[akka.http.scaladsl.model.HttpHeader],entity:akka.http.scaladsl.model.MessageEntity):akka.http.scaladsl.model.HttpResponse "Permalink")  def withHeadersAndEntity(headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)], entity: [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)): HttpResponseReturns a copy of this message with the entity and headers set to the given ones.

Returns a copy of this message with the entity and headers set to the given ones.

Definition ClassesHttpResponse → [HttpMessage](HttpMessage.html)
86. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withProtocol(protocol:akka.http.scaladsl.model.HttpProtocol):akka.http.scaladsl.model.HttpResponse "Permalink")  def withProtocol(protocol: [HttpProtocol](HttpProtocol.html)): HttpResponse
87. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withProtocol(protocol:akka.http.javadsl.model.HttpProtocol):akka.http.javadsl.model.HttpResponse "Permalink")  def withProtocol(protocol: [javadsl.model.HttpProtocol](../../javadsl/model/HttpProtocol.html)): [javadsl.model.HttpResponse](../../javadsl/model/HttpResponse.html)Returns a copy of this message with a new protocol.

Returns a copy of this message with a new protocol.

Definition ClassesHttpResponse → MessageTransformations
88. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withStatus(statusCode:akka.http.javadsl.model.StatusCode):akka.http.scaladsl.model.HttpResponse "Permalink")  def withStatus(statusCode: [javadsl.model.StatusCode](../../javadsl/model/StatusCode.html)): HttpResponseReturns a copy of this instance with a new status\-code.

Returns a copy of this instance with a new status\-code.

Definition ClassesHttpResponse → [HttpResponse](../../javadsl/model/HttpResponse.html)
89. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#withStatus(statusCode:Int):akka.http.scaladsl.model.HttpResponse "Permalink")  def withStatus(statusCode: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): HttpResponseReturns a copy of this instance with a new status\-code.

Returns a copy of this instance with a new status\-code.

Definition ClassesHttpResponse → [HttpResponse](../../javadsl/model/HttpResponse.html)
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#discardEntityBytes()(implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardEntityBytes()(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained by the `entity` of this HTTP message.

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

ImplicitThis member is added by an implicit conversion from HttpResponse to[HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html) performed by method HttpMessageScalaDSLSugar in [akka.http.scaladsl.model.HttpMessage](HttpMessage$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(httpResponse: HttpMessageScalaDSLSugar).discardEntityBytes()(mat)
```
Definition Classes[HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#copy(status:akka.http.scaladsl.model.StatusCode,headers:Seq[akka.http.scaladsl.model.HttpHeader],entity:akka.http.scaladsl.model.ResponseEntity,protocol:akka.http.scaladsl.model.HttpProtocol):akka.http.scaladsl.model.HttpResponse "Permalink")  def copy(status: [StatusCode](StatusCode.html) \= status, headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)] \= headers, entity: [ResponseEntity](ResponseEntity.html) \= entity, protocol: [HttpProtocol](HttpProtocol.html) \= protocol): HttpResponseAnnotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use the `withXYZ` methods instead
2. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpResponse toStringFormat\[HttpResponse] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../../../akka/http/scaladsl/model/HttpResponse.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpResponse, B)ImplicitThis member is added by an implicit conversion from HttpResponse toArrowAssoc\[HttpResponse] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [HttpMessage](HttpMessage.html)

### Inherited from [javadsl.model.HttpResponse](../../javadsl/model/HttpResponse.html)

### Inherited from MessageTransformations\[[javadsl.model.HttpResponse](../../javadsl/model/HttpResponse.html)]

### Inherited from [javadsl.model.HttpMessage](../../javadsl/model/HttpMessage.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion HttpMessageScalaDSLSugar fromHttpResponse to [HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html)

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
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypes$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/DateTime$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ErrorInfo$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsets$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html)*
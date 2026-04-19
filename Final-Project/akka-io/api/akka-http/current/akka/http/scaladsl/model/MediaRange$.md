---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaRange
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:52:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaRange$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaRange
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaRange

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaRange

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
[o](MediaRange.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [MediaRange](MediaRange.html "See companion class")[**](../../../../akka/http/scaladsl/model/MediaRange$.html "Permalink")

### Companion [class MediaRange](MediaRange.html "See companion class")

#### object MediaRange

Source[MediaRange.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/MediaRange.scala#L50)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MediaRange
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/MediaRange$$One.html "Permalink") final  case class [One](MediaRange$$One.html)(mediaType: [MediaType](MediaType.html), qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)) extends [MediaRange](MediaRange.html) with ValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/MediaRange$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#apply(mediaType:akka.http.scaladsl.model.MediaType,qValue:Float):akka.http.scaladsl.model.MediaRange "Permalink")  def apply(mediaType: [MediaType](MediaType.html), qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float) \= 1\.0f): [MediaRange](MediaRange.html)
5. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#apply(mediaType:akka.http.scaladsl.model.MediaType):akka.http.scaladsl.model.MediaRange "Permalink") implicit  def apply(mediaType: [MediaType](MediaType.html)): [MediaRange](MediaRange.html)
6. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#custom(mainType:String,params:Map[String,String],qValue:Float):akka.http.scaladsl.model.MediaRange "Permalink")  def custom(mainType: String, params: Map\[String, String] \= Map.empty, qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float) \= 1\.0f): [MediaRange](MediaRange.html)
9. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaRange$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpProtocols$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalRequestException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalRequestException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalResponseException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalResponseException.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaRange$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaRange$.html)*
---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType

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
[o](MediaType.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [MediaType](MediaType.html "See companion class")[**](../../../../akka/http/scaladsl/model/MediaType$.html "Permalink")

### Companion [class MediaType](MediaType.html "See companion class")

#### object MediaType

Source[MediaType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/MediaType.scala#L76)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MediaType
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/MediaType$$Binary.html "Permalink") sealed abstract  class [Binary](MediaType$$Binary.html) extends [MediaType](MediaType.html) with [javadsl.model.MediaType.Binary](../../javadsl/model/MediaType$$Binary.html)Annotations@DoNotInherit()
2. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html "Permalink") sealed  class [Compressibility](MediaType$$Compressibility.html) extends [javadsl.model.MediaType.Compressibility](../../javadsl/model/MediaType$$Compressibility.html)
3. [**](../../../../akka/http/scaladsl/model/MediaType$$Multipart.html "Permalink") final  class [Multipart](MediaType$$Multipart.html) extends [Binary](MediaType$$Binary.html) with [javadsl.model.MediaType.Multipart](../../javadsl/model/MediaType$$Multipart.html)
4. [**](../../../../akka/http/scaladsl/model/MediaType$$NonBinary.html "Permalink") sealed abstract  class [NonBinary](MediaType$$NonBinary.html) extends [MediaType](MediaType.html) with [javadsl.model.MediaType.NonBinary](../../javadsl/model/MediaType$$NonBinary.html)Annotations@DoNotInherit()
5. [**](../../../../akka/http/scaladsl/model/MediaType$$NonMultipartWithOpenCharset.html "Permalink") sealed abstract  class [NonMultipartWithOpenCharset](MediaType$$NonMultipartWithOpenCharset.html) extends [WithOpenCharset](MediaType$$WithOpenCharset.html)Annotations@DoNotInherit()
6. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html "Permalink") sealed abstract  class [WithFixedCharset](MediaType$$WithFixedCharset.html) extends [NonBinary](MediaType$$NonBinary.html) with [javadsl.model.MediaType.WithFixedCharset](../../javadsl/model/MediaType$$WithFixedCharset.html)Annotations@DoNotInherit()
7. [**](../../../../akka/http/scaladsl/model/MediaType$$WithOpenCharset.html "Permalink") sealed abstract  class [WithOpenCharset](MediaType$$WithOpenCharset.html) extends [NonBinary](MediaType$$NonBinary.html) with [javadsl.model.MediaType.WithOpenCharset](../../javadsl/model/MediaType$$WithOpenCharset.html)Annotations@DoNotInherit()
### Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaType$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/MediaType$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/MediaType$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/MediaType$.html#applicationBinary(subType:String,comp:akka.http.scaladsl.model.MediaType.Compressibility,fileExtensions:String*):akka.http.scaladsl.model.MediaType.Binary "Permalink")  def applicationBinary(subType: String, comp: [Compressibility](MediaType$$Compressibility.html), fileExtensions: String\*): [Binary](MediaType$$Binary.html)
5. [**](../../../../akka/http/scaladsl/model/MediaType$.html#applicationWithFixedCharset(subType:String,charset:akka.http.scaladsl.model.HttpCharset,fileExtensions:String*):akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  def applicationWithFixedCharset(subType: String, charset: [HttpCharset](HttpCharset.html), fileExtensions: String\*): [WithFixedCharset](MediaType$$WithFixedCharset.html)
6. [**](../../../../akka/http/scaladsl/model/MediaType$.html#applicationWithOpenCharset(subType:String,fileExtensions:String*):akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  def applicationWithOpenCharset(subType: String, fileExtensions: String\*): [WithOpenCharset](MediaType$$WithOpenCharset.html)
7. [**](../../../../akka/http/scaladsl/model/MediaType$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/model/MediaType$.html#audio(subType:String,comp:akka.http.scaladsl.model.MediaType.Compressibility,fileExtensions:String*):akka.http.scaladsl.model.MediaType.Binary "Permalink")  def audio(subType: String, comp: [Compressibility](MediaType$$Compressibility.html), fileExtensions: String\*): [Binary](MediaType$$Binary.html)
9. [**](../../../../akka/http/scaladsl/model/MediaType$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/model/MediaType$.html#custom(value:String,binary:Boolean,comp:akka.http.scaladsl.model.MediaType.Compressibility,fileExtensions:List[String]):akka.http.scaladsl.model.MediaType "Permalink")  def custom(value: String, binary: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), comp: [Compressibility](MediaType$$Compressibility.html) \= [Compressible](MediaType$$Compressible$.html), fileExtensions: List\[String] \= Nil): [MediaType](MediaType.html)
11. [**](../../../../akka/http/scaladsl/model/MediaType$.html#customBinary(mainType:String,subType:String,comp:akka.http.scaladsl.model.MediaType.Compressibility,fileExtensions:List[String],params:Map[String,String],allowArbitrarySubtypes:Boolean):akka.http.scaladsl.model.MediaType.Binary "Permalink")  def customBinary(mainType: String, subType: String, comp: [Compressibility](MediaType$$Compressibility.html), fileExtensions: List\[String] \= Nil, params: Map\[String, String] \= Map.empty, allowArbitrarySubtypes: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Binary](MediaType$$Binary.html)
12. [**](../../../../akka/http/scaladsl/model/MediaType$.html#customMultipart(subType:String,params:Map[String,String]):akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def customMultipart(subType: String, params: Map\[String, String]): [Multipart](MediaType$$Multipart.html)
13. [**](../../../../akka/http/scaladsl/model/MediaType$.html#customWithFixedCharset(mainType:String,subType:String,charset:akka.http.scaladsl.model.HttpCharset,fileExtensions:List[String],params:Map[String,String],allowArbitrarySubtypes:Boolean):akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  def customWithFixedCharset(mainType: String, subType: String, charset: [HttpCharset](HttpCharset.html), fileExtensions: List\[String] \= Nil, params: Map\[String, String] \= Map.empty, allowArbitrarySubtypes: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [WithFixedCharset](MediaType$$WithFixedCharset.html)
14. [**](../../../../akka/http/scaladsl/model/MediaType$.html#customWithOpenCharset(mainType:String,subType:String,fileExtensions:List[String],params:Map[String,String],allowArbitrarySubtypes:Boolean):akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  def customWithOpenCharset(mainType: String, subType: String, fileExtensions: List\[String] \= Nil, params: Map\[String, String] \= Map.empty, allowArbitrarySubtypes: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [WithOpenCharset](MediaType$$WithOpenCharset.html)
15. [**](../../../../akka/http/scaladsl/model/MediaType$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/http/scaladsl/model/MediaType$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../../akka/http/scaladsl/model/MediaType$.html#font(subType:String,comp:akka.http.scaladsl.model.MediaType.Compressibility,fileExtensions:String*):akka.http.scaladsl.model.MediaType.Binary "Permalink")  def font(subType: String, comp: [Compressibility](MediaType$$Compressibility.html), fileExtensions: String\*): [Binary](MediaType$$Binary.html)
18. [**](../../../../akka/http/scaladsl/model/MediaType$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/model/MediaType$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/model/MediaType$.html#image(subType:String,comp:akka.http.scaladsl.model.MediaType.Compressibility,fileExtensions:String*):akka.http.scaladsl.model.MediaType.Binary "Permalink")  def image(subType: String, comp: [Compressibility](MediaType$$Compressibility.html), fileExtensions: String\*): [Binary](MediaType$$Binary.html)
21. [**](../../../../akka/http/scaladsl/model/MediaType$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/model/MediaType$.html#message(subType:String,comp:akka.http.scaladsl.model.MediaType.Compressibility,fileExtensions:String*):akka.http.scaladsl.model.MediaType.Binary "Permalink")  def message(subType: String, comp: [Compressibility](MediaType$$Compressibility.html), fileExtensions: String\*): [Binary](MediaType$$Binary.html)
23. [**](../../../../akka/http/scaladsl/model/MediaType$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/model/MediaType$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/model/MediaType$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/model/MediaType$.html#parse(value:String):Either[List[akka.http.scaladsl.model.ErrorInfo],akka.http.scaladsl.model.MediaType] "Permalink")  def parse(value: String): Either\[List\[[ErrorInfo](ErrorInfo.html)], [MediaType](MediaType.html)]Tries to parse a `MediaType` value from the given String.

Tries to parse a `MediaType` value from the given String.
Returns `Right(mediaType)` if successful and `Left(errors)` otherwise.
27. [**](../../../../akka/http/scaladsl/model/MediaType$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/model/MediaType$.html#text(subType:String,fileExtensions:String*):akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  def text(subType: String, fileExtensions: String\*): [WithOpenCharset](MediaType$$WithOpenCharset.html)
29. [**](../../../../akka/http/scaladsl/model/MediaType$.html#textWithFixedCharset(subType:String,charset:akka.http.scaladsl.model.HttpCharset,fileExtensions:String*):akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  def textWithFixedCharset(subType: String, charset: [HttpCharset](HttpCharset.html), fileExtensions: String\*): [WithFixedCharset](MediaType$$WithFixedCharset.html)
30. [**](../../../../akka/http/scaladsl/model/MediaType$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../akka/http/scaladsl/model/MediaType$.html#unapply(mediaType:akka.http.scaladsl.model.MediaType):Option[String] "Permalink")  def unapply(mediaType: [MediaType](MediaType.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
32. [**](../../../../akka/http/scaladsl/model/MediaType$.html#video(subType:String,comp:akka.http.scaladsl.model.MediaType.Compressibility,fileExtensions:String*):akka.http.scaladsl.model.MediaType.Binary "Permalink")  def video(subType: String, comp: [Compressibility](MediaType$$Compressibility.html), fileExtensions: String\*): [Binary](MediaType$$Binary.html)
33. [**](../../../../akka/http/scaladsl/model/MediaType$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/http/scaladsl/model/MediaType$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../../akka/http/scaladsl/model/MediaType$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressible$.html "Permalink")  case object [Compressible](MediaType$$Compressible$.html) extends [Compressibility](MediaType$$Compressibility.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
37. [**](../../../../akka/http/scaladsl/model/MediaType$$Gzipped$.html "Permalink")  case object [Gzipped](MediaType$$Gzipped$.html) extends [Compressibility](MediaType$$Compressibility.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
38. [**](../../../../akka/http/scaladsl/model/MediaType$$NotCompressible$.html "Permalink")  case object [NotCompressible](MediaType$$NotCompressible$.html) extends [Compressibility](MediaType$$Compressibility.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaType$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Binary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Compressibility.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$WithOpenCharset.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocols$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$.html)*
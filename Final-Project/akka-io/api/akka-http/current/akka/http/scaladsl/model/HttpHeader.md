---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpHeader
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpHeader
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpHeader

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpHeader

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
- HttpHeader
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
[c](HttpHeader$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [HttpHeader](HttpHeader$.html "See companion object")[**](../../../../akka/http/scaladsl/model/HttpHeader.html "Permalink")

### Companion [object HttpHeader](HttpHeader$.html "See companion object")

#### abstract  class HttpHeader extends [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html) with ToStringRenderable

The model of an HTTP header. In its most basic form headers are simple name\-value pairs. Header names
are compared in a case\-insensitive way.

Source[HttpHeader.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpHeader.scala#L37)Linear SupertypesToStringRenderable, Renderable, [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Accept](../../javadsl/model/headers/Accept.html), [AcceptCharset](../../javadsl/model/headers/AcceptCharset.html), [AcceptEncoding](../../javadsl/model/headers/AcceptEncoding.html), [AcceptLanguage](../../javadsl/model/headers/AcceptLanguage.html), [AcceptRanges](../../javadsl/model/headers/AcceptRanges.html), [AccessControlAllowCredentials](../../javadsl/model/headers/AccessControlAllowCredentials.html), [AccessControlAllowHeaders](../../javadsl/model/headers/AccessControlAllowHeaders.html), [AccessControlAllowMethods](../../javadsl/model/headers/AccessControlAllowMethods.html), [AccessControlAllowOrigin](../../javadsl/model/headers/AccessControlAllowOrigin.html), [AccessControlExposeHeaders](../../javadsl/model/headers/AccessControlExposeHeaders.html), [AccessControlMaxAge](../../javadsl/model/headers/AccessControlMaxAge.html), [AccessControlRequestHeaders](../../javadsl/model/headers/AccessControlRequestHeaders.html), [AccessControlRequestMethod](../../javadsl/model/headers/AccessControlRequestMethod.html), [Age](../../javadsl/model/headers/Age.html), [Allow](../../javadsl/model/headers/Allow.html), [Authorization](../../javadsl/model/headers/Authorization.html), [CacheControl](../../javadsl/model/headers/CacheControl.html), [Connection](../../javadsl/model/headers/Connection.html), [ContentDisposition](../../javadsl/model/headers/ContentDisposition.html), [ContentEncoding](../../javadsl/model/headers/ContentEncoding.html), [ContentLength](../../javadsl/model/headers/ContentLength.html), [ContentLocation](../../javadsl/model/headers/ContentLocation.html), [ContentRange](../../javadsl/model/headers/ContentRange.html), [ContentType](../../javadsl/model/headers/ContentType.html), [Cookie](../../javadsl/model/headers/Cookie.html), [CustomHeader](../../javadsl/model/headers/CustomHeader.html), [Date](../../javadsl/model/headers/Date.html), [ETag](../../javadsl/model/headers/ETag.html), [Expires](../../javadsl/model/headers/Expires.html), [Host](../../javadsl/model/headers/Host.html), [IfMatch](../../javadsl/model/headers/IfMatch.html), [IfModifiedSince](../../javadsl/model/headers/IfModifiedSince.html), [IfNoneMatch](../../javadsl/model/headers/IfNoneMatch.html), [IfUnmodifiedSince](../../javadsl/model/headers/IfUnmodifiedSince.html), [LastEventId](../../javadsl/model/headers/LastEventId.html), [LastModified](../../javadsl/model/headers/LastModified.html), [Link](../../javadsl/model/headers/Link.html), [Location](../../javadsl/model/headers/Location.html), [ModeledCustomHeader](../../javadsl/model/headers/ModeledCustomHeader.html), [Origin](../../javadsl/model/headers/Origin.html), [ProxyAuthenticate](../../javadsl/model/headers/ProxyAuthenticate.html), [ProxyAuthorization](../../javadsl/model/headers/ProxyAuthorization.html), [Range](../../javadsl/model/headers/Range.html), [RawHeader](../../javadsl/model/headers/RawHeader.html), [RawRequestURI](../../javadsl/model/headers/RawRequestURI.html), [Referer](../../javadsl/model/headers/Referer.html), [RetryAfter](../../javadsl/model/headers/RetryAfter.html), [SecWebSocketProtocol](../../javadsl/model/headers/SecWebSocketProtocol.html), [Server](../../javadsl/model/headers/Server.html), [SetCookie](../../javadsl/model/headers/SetCookie.html), [StrictTransportSecurity](../../javadsl/model/headers/StrictTransportSecurity.html), [TE](../../javadsl/model/headers/TE.html), [TimeoutAccess](../../javadsl/model/headers/TimeoutAccess.html), [TlsSessionInfo](../../javadsl/model/headers/TlsSessionInfo.html), [TransferEncoding](../../javadsl/model/headers/TransferEncoding.html), [UserAgent](../../javadsl/model/headers/UserAgent.html), [WWWAuthenticate](../../javadsl/model/headers/WWWAuthenticate.html), [XForwardedFor](../../javadsl/model/headers/XForwardedFor.html), [XForwardedHost](../../javadsl/model/headers/XForwardedHost.html), [XForwardedProto](../../javadsl/model/headers/XForwardedProto.html), [XRealIp](../../javadsl/model/headers/XRealIp.html), [Accept](headers/Accept.html), [Accept\-Charset](headers/Accept$minusCharset.html), [Accept\-Encoding](headers/Accept$minusEncoding.html), [Accept\-Language](headers/Accept$minusLanguage.html), [Accept\-Ranges](headers/Accept$minusRanges.html), [Access\-Control\-Allow\-Credentials](headers/Access$minusControl$minusAllow$minusCredentials.html), [Access\-Control\-Allow\-Headers](headers/Access$minusControl$minusAllow$minusHeaders.html), [Access\-Control\-Allow\-Methods](headers/Access$minusControl$minusAllow$minusMethods.html), [Access\-Control\-Allow\-Origin](headers/Access$minusControl$minusAllow$minusOrigin.html), [Access\-Control\-Expose\-Headers](headers/Access$minusControl$minusExpose$minusHeaders.html), [Access\-Control\-Max\-Age](headers/Access$minusControl$minusMax$minusAge.html), [Access\-Control\-Request\-Headers](headers/Access$minusControl$minusRequest$minusHeaders.html), [Access\-Control\-Request\-Method](headers/Access$minusControl$minusRequest$minusMethod.html), [Age](headers/Age.html), [Allow](headers/Allow.html), [Authorization](headers/Authorization.html), [Cache\-Control](headers/Cache$minusControl.html), [Connection](headers/Connection.html), [Content\-Disposition](headers/Content$minusDisposition.html), [Content\-Encoding](headers/Content$minusEncoding.html), [Content\-Length](headers/Content$minusLength.html), [Content\-Location](headers/Content$minusLocation.html), [Content\-Range](headers/Content$minusRange.html), [Content\-Type](headers/Content$minusType.html), [Cookie](headers/Cookie.html), [CustomHeader](headers/CustomHeader.html), [Date](headers/Date.html), [ETag](headers/ETag.html), [Expect](headers/Expect.html), [Expires](headers/Expires.html), [Host](headers/Host.html), [If\-Match](headers/If$minusMatch.html), [If\-Modified\-Since](headers/If$minusModified$minusSince.html), [If\-None\-Match](headers/If$minusNone$minusMatch.html), [If\-Range](headers/If$minusRange.html), [If\-Unmodified\-Since](headers/If$minusUnmodified$minusSince.html), [Last\-Event\-ID](headers/Last$minusEvent$minusID.html), [Last\-Modified](headers/Last$minusModified.html), [Link](headers/Link.html), [Location](headers/Location.html), [ModeledCustomHeader](headers/ModeledCustomHeader.html), [ModeledHeader](headers/ModeledHeader.html), [Origin](headers/Origin.html), [Proxy\-Authenticate](headers/Proxy$minusAuthenticate.html), [Proxy\-Authorization](headers/Proxy$minusAuthorization.html), [Range](headers/Range.html), [Raw\-Request\-URI](headers/Raw$minusRequest$minusURI.html), [RawHeader](headers/RawHeader.html), [Referer](headers/Referer.html), [Retry\-After](headers/Retry$minusAfter.html), [Server](headers/Server.html), [Set\-Cookie](headers/Set$minusCookie.html), [Strict\-Transport\-Security](headers/Strict$minusTransport$minusSecurity.html), [TE](headers/TE.html), [Timeout\-Access](headers/Timeout$minusAccess.html), [Tls\-Session\-Info](headers/Tls$minusSession$minusInfo.html), [Transfer\-Encoding](headers/Transfer$minusEncoding.html), [Upgrade](headers/Upgrade.html), [User\-Agent](headers/User$minusAgent.html), [WWW\-Authenticate](headers/WWW$minusAuthenticate.html), [X\-Forwarded\-For](headers/X$minusForwarded$minusFor.html), [X\-Forwarded\-Host](headers/X$minusForwarded$minusHost.html), [X\-Forwarded\-Proto](headers/X$minusForwarded$minusProto.html), [X\-Real\-Ip](headers/X$minusReal$minusIp.html), [RemoteAddress](../../javadsl/model/headers/RemoteAddress.html), [UpgradeToWebSocket](../../javadsl/model/ws/UpgradeToWebSocket.html), [Remote\-Address](headers/Remote$minusAddress.html), [UpgradeToWebSocket](ws/UpgradeToWebSocket.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpHeader
2. ToStringRenderable
3. Renderable
4. HttpHeader
5. AnyRef
6. Any
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

1. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#<init>():akka.http.scaladsl.model.HttpHeader "Permalink")  new HttpHeader()
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#lowercaseName():String "Permalink") abstract  def lowercaseName(): StringReturns the lower\-cased name of the header.

Returns the lower\-cased name of the header.

Definition ClassesHttpHeader → [HttpHeader](../../javadsl/model/HttpHeader.html)
2. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#name():String "Permalink") abstract  def name(): StringReturns the name of the header.

Returns the name of the header.

Definition ClassesHttpHeader → [HttpHeader](../../javadsl/model/HttpHeader.html)
3. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#renderInRequests():Boolean "Permalink") abstract  def renderInRequests(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in requests.

Returns true if and only if the header is to be rendered in requests.

Definition Classes[HttpHeader](../../javadsl/model/HttpHeader.html)
4. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#renderInResponses():Boolean "Permalink") abstract  def renderInResponses(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in responses.

Returns true if and only if the header is to be rendered in responses.

Definition Classes[HttpHeader](../../javadsl/model/HttpHeader.html)
5. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#value():String "Permalink") abstract  def value(): StringReturns the String representation of the value of the header.

Returns the String representation of the value of the header.

Definition ClassesHttpHeader → [HttpHeader](../../javadsl/model/HttpHeader.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpHeader.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpHeader toany2stringadd\[HttpHeader] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpHeader, B)ImplicitThis member is added by an implicit conversion from HttpHeader toArrowAssoc\[HttpHeader] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpHeader) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpHeaderImplicitThis member is added by an implicit conversion from HttpHeader toEnsuring\[HttpHeader] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpHeader) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpHeaderImplicitThis member is added by an implicit conversion from HttpHeader toEnsuring\[HttpHeader] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpHeaderImplicitThis member is added by an implicit conversion from HttpHeader toEnsuring\[HttpHeader] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpHeaderImplicitThis member is added by an implicit conversion from HttpHeader toEnsuring\[HttpHeader] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#is(nameInLowerCase:String):Boolean "Permalink")  def is(nameInLowerCase: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if nameInLowerCase.equals(lowercaseName()).

Returns true if and only if nameInLowerCase.equals(lowercaseName()).

Definition ClassesHttpHeader → [HttpHeader](../../javadsl/model/HttpHeader.html)
17. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#isNot(nameInLowerCase:String):Boolean "Permalink")  def isNot(nameInLowerCase: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns !is(nameInLowerCase).

Returns !is(nameInLowerCase).

Definition ClassesHttpHeader → [HttpHeader](../../javadsl/model/HttpHeader.html)
19. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
24. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#unsafeToString:String "Permalink")  def unsafeToString: String
25. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpHeader toStringFormat\[HttpHeader] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/HttpHeader.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpHeader, B)ImplicitThis member is added by an implicit conversion from HttpHeader toArrowAssoc\[HttpHeader] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpHeader to any2stringadd\[HttpHeader]

### Inherited by implicit conversion StringFormat fromHttpHeader to StringFormat\[HttpHeader]

### Inherited by implicit conversion Ensuring fromHttpHeader to Ensuring\[HttpHeader]

### Inherited by implicit conversion ArrowAssoc fromHttpHeader to ArrowAssoc\[HttpHeader]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Accept.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AcceptCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AcceptEncoding.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AcceptLanguage.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AcceptRanges.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AccessControlAllowCredentials.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AccessControlAllowHeaders.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AccessControlAllowMethods.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AccessControlAllowOrigin.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AccessControlExposeHeaders.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AccessControlMaxAge.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AccessControlRequestHeaders.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/AccessControlRequestMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Age.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Allow.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Authorization.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/CacheControl.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Connection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ContentDisposition.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ContentEncoding.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ContentLength.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ContentLocation.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Cookie.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Date.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ETag.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Expires.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/IfMatch.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/IfModifiedSince.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/IfNoneMatch.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/IfUnmodifiedSince.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/LastEventId.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/LastModified.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Link.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Location.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Origin.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ProxyAuthenticate.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/ProxyAuthorization.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Range.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/RawHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/RawRequestURI.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Referer.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/RemoteAddress.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/RetryAfter.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html)*
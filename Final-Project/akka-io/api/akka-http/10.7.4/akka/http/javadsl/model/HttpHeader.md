---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.HttpHeader
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpHeader.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.HttpHeader
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.HttpHeader

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.HttpHeader

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
- HttpHeader
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
- [UniversalEntity](UniversalEntity.html "Marker-interface for entity types that can be used in any context")
- [Uri](Uri.html "Represents an Uri.")
c[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[model](index.html)

# HttpHeader[**](../../../../akka/http/javadsl/model/HttpHeader.html "Permalink")

### 

#### abstract  class HttpHeader extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

The base type representing Http headers. All actual header values will be instances
of one of the subtypes defined in the `headers` packages. Unknown headers will be subtypes
of `[akka.http.javadsl.model.headers.RawHeader](headers/RawHeader.html)`. Not for user extension.

Annotations@DoNotInherit() Source[HttpHeader.java](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/java/akka/http/javadsl/model/HttpHeader.java#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Accept](headers/Accept.html), [AcceptCharset](headers/AcceptCharset.html), [AcceptEncoding](headers/AcceptEncoding.html), [AcceptLanguage](headers/AcceptLanguage.html), [AcceptRanges](headers/AcceptRanges.html), [AccessControlAllowCredentials](headers/AccessControlAllowCredentials.html), [AccessControlAllowHeaders](headers/AccessControlAllowHeaders.html), [AccessControlAllowMethods](headers/AccessControlAllowMethods.html), [AccessControlAllowOrigin](headers/AccessControlAllowOrigin.html), [AccessControlExposeHeaders](headers/AccessControlExposeHeaders.html), [AccessControlMaxAge](headers/AccessControlMaxAge.html), [AccessControlRequestHeaders](headers/AccessControlRequestHeaders.html), [AccessControlRequestMethod](headers/AccessControlRequestMethod.html), [Age](headers/Age.html), [Allow](headers/Allow.html), [Authorization](headers/Authorization.html), [CacheControl](headers/CacheControl.html), [Connection](headers/Connection.html), [ContentDisposition](headers/ContentDisposition.html), [ContentEncoding](headers/ContentEncoding.html), [ContentLength](headers/ContentLength.html), [ContentLocation](headers/ContentLocation.html), [ContentRange](headers/ContentRange.html), [ContentType](headers/ContentType.html), [Cookie](headers/Cookie.html), [CustomHeader](headers/CustomHeader.html), [Date](headers/Date.html), [ETag](headers/ETag.html), [Expires](headers/Expires.html), [Host](headers/Host.html), [IfMatch](headers/IfMatch.html), [IfModifiedSince](headers/IfModifiedSince.html), [IfNoneMatch](headers/IfNoneMatch.html), [IfUnmodifiedSince](headers/IfUnmodifiedSince.html), [LastEventId](headers/LastEventId.html), [LastModified](headers/LastModified.html), [Link](headers/Link.html), [Location](headers/Location.html), [ModeledCustomHeader](headers/ModeledCustomHeader.html), [Origin](headers/Origin.html), [ProxyAuthenticate](headers/ProxyAuthenticate.html), [ProxyAuthorization](headers/ProxyAuthorization.html), [Range](headers/Range.html), [RawHeader](headers/RawHeader.html), [RawRequestURI](headers/RawRequestURI.html), [Referer](headers/Referer.html), [RetryAfter](headers/RetryAfter.html), [SecWebSocketProtocol](headers/SecWebSocketProtocol.html), [Server](headers/Server.html), [SetCookie](headers/SetCookie.html), [StrictTransportSecurity](headers/StrictTransportSecurity.html), [TE](headers/TE.html), [TimeoutAccess](headers/TimeoutAccess.html), [TlsSessionInfo](headers/TlsSessionInfo.html), [TransferEncoding](headers/TransferEncoding.html), [UserAgent](headers/UserAgent.html), [WWWAuthenticate](headers/WWWAuthenticate.html), [XForwardedFor](headers/XForwardedFor.html), [XForwardedHost](headers/XForwardedHost.html), [XForwardedProto](headers/XForwardedProto.html), [XRealIp](headers/XRealIp.html), [HttpHeader](../../scaladsl/model/HttpHeader.html), [Accept](../../scaladsl/model/headers/Accept.html), [Accept\-Charset](../../scaladsl/model/headers/Accept$minusCharset.html), [Accept\-Encoding](../../scaladsl/model/headers/Accept$minusEncoding.html), [Accept\-Language](../../scaladsl/model/headers/Accept$minusLanguage.html), [Accept\-Ranges](../../scaladsl/model/headers/Accept$minusRanges.html), [Access\-Control\-Allow\-Credentials](../../scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials.html), [Access\-Control\-Allow\-Headers](../../scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders.html), [Access\-Control\-Allow\-Methods](../../scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html), [Access\-Control\-Allow\-Origin](../../scaladsl/model/headers/Access$minusControl$minusAllow$minusOrigin.html), [Access\-Control\-Expose\-Headers](../../scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders.html), [Access\-Control\-Max\-Age](../../scaladsl/model/headers/Access$minusControl$minusMax$minusAge.html), [Access\-Control\-Request\-Headers](../../scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html), [Access\-Control\-Request\-Method](../../scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod.html), [Age](../../scaladsl/model/headers/Age.html), [Allow](../../scaladsl/model/headers/Allow.html), [Authorization](../../scaladsl/model/headers/Authorization.html), [Cache\-Control](../../scaladsl/model/headers/Cache$minusControl.html), [Connection](../../scaladsl/model/headers/Connection.html), [Content\-Disposition](../../scaladsl/model/headers/Content$minusDisposition.html), [Content\-Encoding](../../scaladsl/model/headers/Content$minusEncoding.html), [Content\-Length](../../scaladsl/model/headers/Content$minusLength.html), [Content\-Location](../../scaladsl/model/headers/Content$minusLocation.html), [Content\-Range](../../scaladsl/model/headers/Content$minusRange.html), [Content\-Type](../../scaladsl/model/headers/Content$minusType.html), [Cookie](../../scaladsl/model/headers/Cookie.html), [CustomHeader](../../scaladsl/model/headers/CustomHeader.html), [Date](../../scaladsl/model/headers/Date.html), [ETag](../../scaladsl/model/headers/ETag.html), [Expect](../../scaladsl/model/headers/Expect.html), [Expires](../../scaladsl/model/headers/Expires.html), [Host](../../scaladsl/model/headers/Host.html), [If\-Match](../../scaladsl/model/headers/If$minusMatch.html), [If\-Modified\-Since](../../scaladsl/model/headers/If$minusModified$minusSince.html), [If\-None\-Match](../../scaladsl/model/headers/If$minusNone$minusMatch.html), [If\-Range](../../scaladsl/model/headers/If$minusRange.html), [If\-Unmodified\-Since](../../scaladsl/model/headers/If$minusUnmodified$minusSince.html), [Last\-Event\-ID](../../scaladsl/model/headers/Last$minusEvent$minusID.html), [Last\-Modified](../../scaladsl/model/headers/Last$minusModified.html), [Link](../../scaladsl/model/headers/Link.html), [Location](../../scaladsl/model/headers/Location.html), [ModeledCustomHeader](../../scaladsl/model/headers/ModeledCustomHeader.html), [ModeledHeader](../../scaladsl/model/headers/ModeledHeader.html), [Origin](../../scaladsl/model/headers/Origin.html), [Proxy\-Authenticate](../../scaladsl/model/headers/Proxy$minusAuthenticate.html), [Proxy\-Authorization](../../scaladsl/model/headers/Proxy$minusAuthorization.html), [Range](../../scaladsl/model/headers/Range.html), [Raw\-Request\-URI](../../scaladsl/model/headers/Raw$minusRequest$minusURI.html), [RawHeader](../../scaladsl/model/headers/RawHeader.html), [Referer](../../scaladsl/model/headers/Referer.html), [Retry\-After](../../scaladsl/model/headers/Retry$minusAfter.html), [Server](../../scaladsl/model/headers/Server.html), [Set\-Cookie](../../scaladsl/model/headers/Set$minusCookie.html), [Strict\-Transport\-Security](../../scaladsl/model/headers/Strict$minusTransport$minusSecurity.html), [TE](../../scaladsl/model/headers/TE.html), [Timeout\-Access](../../scaladsl/model/headers/Timeout$minusAccess.html), [Tls\-Session\-Info](../../scaladsl/model/headers/Tls$minusSession$minusInfo.html), [Transfer\-Encoding](../../scaladsl/model/headers/Transfer$minusEncoding.html), [Upgrade](../../scaladsl/model/headers/Upgrade.html), [User\-Agent](../../scaladsl/model/headers/User$minusAgent.html), [WWW\-Authenticate](../../scaladsl/model/headers/WWW$minusAuthenticate.html), [X\-Forwarded\-For](../../scaladsl/model/headers/X$minusForwarded$minusFor.html), [X\-Forwarded\-Host](../../scaladsl/model/headers/X$minusForwarded$minusHost.html), [X\-Forwarded\-Proto](../../scaladsl/model/headers/X$minusForwarded$minusProto.html), [X\-Real\-Ip](../../scaladsl/model/headers/X$minusReal$minusIp.html), [RemoteAddress](headers/RemoteAddress.html), [UpgradeToWebSocket](ws/UpgradeToWebSocket.html), [Remote\-Address](../../scaladsl/model/headers/Remote$minusAddress.html), [UpgradeToWebSocket](../../scaladsl/model/ws/UpgradeToWebSocket.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpHeader
2. AnyRef
3. Any
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

1. [**](../../../../akka/http/javadsl/model/HttpHeader.html#<init>():akka.http.javadsl.model.HttpHeader "Permalink")  new HttpHeader()
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/model/HttpHeader.html#is(nameInLowerCase:String):Boolean "Permalink") abstract  def is(nameInLowerCase: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if nameInLowerCase.equals(lowercaseName()).
2. [**](../../../../akka/http/javadsl/model/HttpHeader.html#isNot(nameInLowerCase:String):Boolean "Permalink") abstract  def isNot(nameInLowerCase: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns !is(nameInLowerCase).
3. [**](../../../../akka/http/javadsl/model/HttpHeader.html#lowercaseName():String "Permalink") abstract  def lowercaseName(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns the lower\-cased name of the header.
4. [**](../../../../akka/http/javadsl/model/HttpHeader.html#name():String "Permalink") abstract  def name(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns the name of the header.
5. [**](../../../../akka/http/javadsl/model/HttpHeader.html#renderInRequests():Boolean "Permalink") abstract  def renderInRequests(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in requests.
6. [**](../../../../akka/http/javadsl/model/HttpHeader.html#renderInResponses():Boolean "Permalink") abstract  def renderInResponses(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in responses.
7. [**](../../../../akka/http/javadsl/model/HttpHeader.html#value():String "Permalink") abstract  def value(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns the String representation of the value of the header.
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/model/HttpHeader.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/model/HttpHeader.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/model/HttpHeader.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpHeader toany2stringadd\[HttpHeader] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/model/HttpHeader.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpHeader, B)ImplicitThis member is added by an implicit conversion from HttpHeader toArrowAssoc\[HttpHeader] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/model/HttpHeader.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/model/HttpHeader.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/model/HttpHeader.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/model/HttpHeader.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpHeader) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpHeaderImplicitThis member is added by an implicit conversion from HttpHeader toEnsuring\[HttpHeader] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/model/HttpHeader.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpHeader) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpHeaderImplicitThis member is added by an implicit conversion from HttpHeader toEnsuring\[HttpHeader] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/model/HttpHeader.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpHeaderImplicitThis member is added by an implicit conversion from HttpHeader toEnsuring\[HttpHeader] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/model/HttpHeader.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpHeaderImplicitThis member is added by an implicit conversion from HttpHeader toEnsuring\[HttpHeader] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/model/HttpHeader.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/model/HttpHeader.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/model/HttpHeader.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/model/HttpHeader.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/model/HttpHeader.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/model/HttpHeader.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/model/HttpHeader.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/model/HttpHeader.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/model/HttpHeader.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/model/HttpHeader.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/model/HttpHeader.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/model/HttpHeader.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/model/HttpHeader.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/model/HttpHeader.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/model/HttpHeader.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpHeader toStringFormat\[HttpHeader] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/model/HttpHeader.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpHeader, B)ImplicitThis member is added by an implicit conversion from HttpHeader toArrowAssoc\[HttpHeader] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpHeader to any2stringadd\[HttpHeader]

### Inherited by implicit conversion StringFormat fromHttpHeader to StringFormat\[HttpHeader]

### Inherited by implicit conversion Ensuring fromHttpHeader to Ensuring\[HttpHeader]

### Inherited by implicit conversion ArrowAssoc fromHttpHeader to ArrowAssoc\[HttpHeader]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentTypes.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpEntities.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Multiparts.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Query.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RemoteAddresses.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntityAcceptances.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseFuture$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseFuture.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/SslSessionInfo$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/SslSessionInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Trailer$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html)*
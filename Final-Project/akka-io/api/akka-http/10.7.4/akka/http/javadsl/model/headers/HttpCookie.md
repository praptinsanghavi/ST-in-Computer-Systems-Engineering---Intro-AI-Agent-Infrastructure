---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.headers.HttpCookie
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:21:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/HttpCookie.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.headers.HttpCookie
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.headers.HttpCookie

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.headers.HttpCookie

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/model/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[model](../index.html)
- [Accept](Accept.html "Model for the Accept header.")
- [AcceptCharset](AcceptCharset.html "Model for the Accept-Charset header.")
- [AcceptEncoding](AcceptEncoding.html "Model for the Accept-Encoding header.")
- [AcceptLanguage](AcceptLanguage.html "Model for the Accept-Language header.")
- [AcceptRanges](AcceptRanges.html "Model for the Accept-Ranges header.")
- [AccessControlAllowCredentials](AccessControlAllowCredentials.html "Model for the Access-Control-Allow-Credentials header.")
- [AccessControlAllowHeaders](AccessControlAllowHeaders.html "Model for the Access-Control-Allow-Headers header.")
- [AccessControlAllowMethods](AccessControlAllowMethods.html "Model for the Access-Control-Allow-Methods header.")
- [AccessControlAllowOrigin](AccessControlAllowOrigin.html "Model for the Access-Control-Allow-Origin header.")
- [AccessControlExposeHeaders](AccessControlExposeHeaders.html "Model for the Access-Control-Expose-Headers header.")
- [AccessControlMaxAge](AccessControlMaxAge.html "Model for the Access-Control-Max-Age header.")
- [AccessControlRequestHeaders](AccessControlRequestHeaders.html "Model for the Access-Control-Request-Headers header.")
- [AccessControlRequestMethod](AccessControlRequestMethod.html "Model for the Access-Control-Request-Method header.")
- [Age](Age.html "Model for the Age header.")
- [Allow](Allow.html "Model for the Allow header.")
- [Authorization](Authorization.html "Model for the Authorization header.")
- [BasicHttpCredentials](BasicHttpCredentials.html)
- [ByteRange](ByteRange.html)
- [CacheControl](CacheControl.html "Model for the Cache-Control header.")
- [CacheDirective](CacheDirective.html)
- [CacheDirectives](CacheDirectives.html)
- [Connection](Connection.html "Model for the Connection header.")
- [ContentDisposition](ContentDisposition.html "Model for the Content-Disposition header.")
- [ContentDispositionType](ContentDispositionType.html)
- [ContentDispositionTypes](ContentDispositionTypes.html)
- [ContentEncoding](ContentEncoding.html "Model for the Content-Encoding header.")
- [ContentLength](ContentLength.html "Model for the Content-Length header.")
- [ContentLocation](ContentLocation.html "Model for the ContentLocation header.")
- [ContentRange](ContentRange.html "Model for the Content-Range header.")
- [ContentType](ContentType.html "Model for the Content-Type header.")
- [Cookie](Cookie.html "Model for the Cookie header.")
- [CustomHeader](CustomHeader.html "The model of an HTTP header.")
- [Date](Date.html "Model for the Date header.")
- [ETag](ETag.html "Model for the ETag header.")
- [EntityTag](EntityTag.html)
- [EntityTagRange](EntityTagRange.html)
- [EntityTagRanges](EntityTagRanges.html)
- [Expires](Expires.html "Model for the Expires header.")
- [Host](Host.html)
- [HttpChallenge](HttpChallenge.html)
- HttpCookie
- [HttpCookiePair](HttpCookiePair.html "Represents a cookie pair as used in the Cookie header as specified in http://tools.ietf.org/search/rfc6265#section-4.2.1")
- [HttpCredentials](HttpCredentials.html)
- [HttpEncoding](HttpEncoding.html)
- [HttpEncodingRange](HttpEncodingRange.html)
- [HttpEncodingRanges](HttpEncodingRanges.html)
- [HttpEncodings](HttpEncodings.html)
- [HttpOrigin](HttpOrigin.html)
- [HttpOriginRange](HttpOriginRange.html)
- [HttpOriginRanges](HttpOriginRanges.html)
- [IfMatch](IfMatch.html "Model for the If-Match header.")
- [IfModifiedSince](IfModifiedSince.html "Model for the If-Modified-Since header.")
- [IfNoneMatch](IfNoneMatch.html "Model for the If-None-Match header.")
- [IfUnmodifiedSince](IfUnmodifiedSince.html "Model for the If-Unmodified-Since header.")
- [Language](Language.html)
- [LanguageRange](LanguageRange.html)
- [LanguageRanges](LanguageRanges.html)
- [LastEventId](LastEventId.html "The Last-Event-ID header is sent by a client to the server to signal the ID of the last sever-sent event received.")
- [LastModified](LastModified.html "Model for the Last-Modified header.")
- [Link](Link.html "Model for the Link header.")
- [LinkParam](LinkParam.html)
- [LinkParams](LinkParams.html)
- [LinkValue](LinkValue.html)
- [Location](Location.html "Model for the Location header.")
- [ModeledCustomHeader](ModeledCustomHeader.html "Support class for building user-defined custom headers defined by implementing name and value.")
- [ModeledCustomHeaderFactory](ModeledCustomHeaderFactory.html "Companion class for the ModeledCustomHeader class.")
- [OAuth2BearerToken](OAuth2BearerToken.html)
- [Origin](Origin.html "Model for the Origin header.")
- [ProductVersion](ProductVersion.html)
- [ProxyAuthenticate](ProxyAuthenticate.html "Model for the Proxy-Authenticate header.")
- [ProxyAuthorization](ProxyAuthorization.html "Model for the Proxy-Authorization header.")
- [Range](Range.html "Model for the Range header.")
- [RangeUnit](RangeUnit.html)
- [RangeUnits](RangeUnits.html)
- [RawHeader](RawHeader.html "A header in its 'raw' name/value form, not parsed into a modelled header class.")
- [RawRequestURI](RawRequestURI.html "Model for the Raw-Request-URI header.")
- [Referer](Referer.html "Model for the Referer header.")
- [RemoteAddress](RemoteAddress.html "Model for the Remote-Address header.")
- [RetryAfter](RetryAfter.html "Model for the Retry-After header.")
- [SameSite](SameSite.html "The Cookie SameSite attribute as defined by RFC6265bis and Incrementally Better Cookies.")
- [SecWebSocketProtocol](SecWebSocketProtocol.html "Model for the Sec-WebSocket-Protocol header.")
- [Server](Server.html "Model for the Server header.")
- [SetCookie](SetCookie.html "Model for the Set-Cookie header.")
- [StrictTransportSecurity](StrictTransportSecurity.html "Model for the Strict-Transport-Security header.")
- [TE](TE.html "Model for the Transfer-Encoding header.")
- [TimeoutAccess](TimeoutAccess.html "Model for the synthetic Timeout-Access header.")
- [TlsSessionInfo](TlsSessionInfo.html "Model for the synthetic Tls-Session-Info header which carries the SSLSession of the connection the message carrying this header was received with.")
- [TransferEncoding](TransferEncoding.html "Model for the Transfer-Encoding header.")
- [UserAgent](UserAgent.html "Model for the User-Agent header.")
- [WWWAuthenticate](WWWAuthenticate.html "Model for the WWW-Authenticate header.")
- [XForwardedFor](XForwardedFor.html "Model for the X-Forwarded-For header.")
- [XForwardedHost](XForwardedHost.html "Model for the X-Forwarded-Host header.")
- [XForwardedProto](XForwardedProto.html "Model for the X-Forwarded-Proto header.")
- [XRealIp](XRealIp.html "Model for the X-Real-Ip header.")
c[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[model](../index.html).[headers](index.html)

# HttpCookie[**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html "Permalink")

### 

#### abstract  class HttpCookie extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@DoNotInherit() Source[HttpCookie.java](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/java/akka/http/javadsl/model/headers/HttpCookie.java#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[HttpCookie](../../../scaladsl/model/headers/HttpCookie.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpCookie
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

1. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#<init>():akka.http.javadsl.model.headers.HttpCookie "Permalink")  new HttpCookie()
### Abstract Value Members

1. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#getDomain():java.util.Optional[String] "Permalink") abstract  def getDomain(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]
2. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#getExpires():java.util.Optional[akka.http.javadsl.model.DateTime] "Permalink") abstract  def getExpires(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[DateTime](../DateTime.html)]
3. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#getExtension():java.util.Optional[String] "Permalink") abstract  def getExtension(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]
4. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#getMaxAge():java.util.OptionalLong "Permalink") abstract  def getMaxAge(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)
5. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#getPath():java.util.Optional[String] "Permalink") abstract  def getPath(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]
6. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#getSameSite():java.util.Optional[akka.http.javadsl.model.headers.SameSite] "Permalink") abstract  def getSameSite(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[SameSite](SameSite.html)]
7. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#httpOnly():Boolean "Permalink") abstract  def httpOnly(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
8. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#name():String "Permalink") abstract  def name(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
9. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#pair():akka.http.javadsl.model.headers.HttpCookiePair "Permalink") abstract  def pair(): [HttpCookiePair](HttpCookiePair.html)
10. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#secure():Boolean "Permalink") abstract  def secure(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
11. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#value():String "Permalink") abstract  def value(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
12. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withDomain(domain:String):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withDomain(domain: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): HttpCookieReturns a copy of this HttpCookie instance with the given domain set.
13. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withExpires(dateTime:akka.http.javadsl.model.DateTime):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withExpires(dateTime: [DateTime](../DateTime.html)): HttpCookieReturns a copy of this HttpCookie instance with the given expiration set.
14. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withExtension(extension:String):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withExtension(extension: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): HttpCookieReturns a copy of this HttpCookie instance with the given extension set.
15. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withHttpOnly(httpOnly:Boolean):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withHttpOnly(httpOnly: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpCookieReturns a copy of this HttpCookie instance with the given http\-only flag set.
16. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withMaxAge(maxAge:Long):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withMaxAge(maxAge: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): HttpCookieReturns a copy of this HttpCookie instance with the given max age set.
17. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withPath(path:String):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withPath(path: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): HttpCookieReturns a copy of this HttpCookie instance with the given path set.
18. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withSameSite(sameSite:java.util.Optional[akka.http.javadsl.model.headers.SameSite]):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withSameSite(sameSite: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[SameSite](SameSite.html)]): HttpCookieReturns a copy of this HttpCookie instance with the given Optional `[SameSite](SameSite.html)` set.
19. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withSameSite(sameSite:akka.http.javadsl.model.headers.SameSite):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withSameSite(sameSite: [SameSite](SameSite.html)): HttpCookieReturns a copy of this HttpCookie instance with the given `[SameSite](SameSite.html)` set.
20. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#withSecure(secure:Boolean):akka.http.javadsl.model.headers.HttpCookie "Permalink") abstract  def withSecure(secure: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpCookieReturns a copy of this HttpCookie instance with the given secure flag set.
### Concrete Value Members

1. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpCookie toany2stringadd\[HttpCookie] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpCookie, B)ImplicitThis member is added by an implicit conversion from HttpCookie toArrowAssoc\[HttpCookie] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpCookie) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpCookieImplicitThis member is added by an implicit conversion from HttpCookie toEnsuring\[HttpCookie] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpCookie) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpCookieImplicitThis member is added by an implicit conversion from HttpCookie toEnsuring\[HttpCookie] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpCookieImplicitThis member is added by an implicit conversion from HttpCookie toEnsuring\[HttpCookie] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpCookieImplicitThis member is added by an implicit conversion from HttpCookie toEnsuring\[HttpCookie] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpCookie toStringFormat\[HttpCookie] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/model/headers/HttpCookie.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpCookie, B)ImplicitThis member is added by an implicit conversion from HttpCookie toArrowAssoc\[HttpCookie] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpCookie to any2stringadd\[HttpCookie]

### Inherited by implicit conversion StringFormat fromHttpCookie to StringFormat\[HttpCookie]

### Inherited by implicit conversion Ensuring fromHttpCookie to Ensuring\[HttpCookie]

### Inherited by implicit conversion ArrowAssoc fromHttpCookie to ArrowAssoc\[HttpCookie]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Accept.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AcceptCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AcceptEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AcceptLanguage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AcceptRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AccessControlAllowCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AccessControlAllowHeaders.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AccessControlAllowMethods.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AccessControlAllowOrigin.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AccessControlExposeHeaders.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AccessControlMaxAge.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AccessControlRequestHeaders.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/AccessControlRequestMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Age.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Allow.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Authorization.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/CacheControl.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/CacheDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/CacheDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Connection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentDisposition.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentDispositionType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentDispositionTypes.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentLength.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentLocation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Cookie.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Date.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ETag.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTagRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTagRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Expires.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpChallenge.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodingRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodingRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodings.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html)*
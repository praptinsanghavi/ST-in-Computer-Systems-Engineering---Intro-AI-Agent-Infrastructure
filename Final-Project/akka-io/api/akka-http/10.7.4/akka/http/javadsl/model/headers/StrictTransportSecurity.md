---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.headers.StrictTransportSecurity
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:30:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/StrictTransportSecurity.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.headers.StrictTransportSecurity
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.headers.StrictTransportSecurity

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.headers.StrictTransportSecurity

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
- [HttpCookie](HttpCookie.html)
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
- StrictTransportSecurity
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

# StrictTransportSecurity[**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html "Permalink")

### 

#### abstract  class StrictTransportSecurity extends [scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html)

 Model for the `Strict-Transport-Security` header.
 Specification: https://tools.ietf.org/html/rfc6797

Source[StrictTransportSecurity.java](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/java/akka/http/javadsl/model/headers/StrictTransportSecurity.java#L11)Linear Supertypes[scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html), ToStringRenderable, Renderable, [HttpHeader](../HttpHeader.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Strict\-Transport\-Security](../../../scaladsl/model/headers/Strict$minusTransport$minusSecurity.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StrictTransportSecurity
2. HttpHeader
3. ToStringRenderable
4. Renderable
5. HttpHeader
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
### Instance Constructors

1. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#<init>():akka.http.javadsl.model.headers.StrictTransportSecurity "Permalink")  new StrictTransportSecurity()
### Abstract Value Members

1. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#includeSubDomains():Boolean "Permalink") abstract  def includeSubDomains(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
2. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#lowercaseName():String "Permalink") abstract  def lowercaseName(): StringReturns the lower\-cased name of the header.

Returns the lower\-cased name of the header.

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
3. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#maxAge():Long "Permalink") abstract  def maxAge(): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
4. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#name():String "Permalink") abstract  def name(): StringReturns the name of the header.

Returns the name of the header.

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
5. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#renderInRequests():Boolean "Permalink") abstract  def renderInRequests(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in requests.

Returns true if and only if the header is to be rendered in requests.

Definition Classes[HttpHeader](../HttpHeader.html)
6. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#renderInResponses():Boolean "Permalink") abstract  def renderInResponses(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in responses.

Returns true if and only if the header is to be rendered in responses.

Definition Classes[HttpHeader](../HttpHeader.html)
7. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#value():String "Permalink") abstract  def value(): StringReturns the String representation of the value of the header.

Returns the String representation of the value of the header.

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
### Concrete Value Members

1. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StrictTransportSecurity toany2stringadd\[StrictTransportSecurity] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StrictTransportSecurity, B)ImplicitThis member is added by an implicit conversion from StrictTransportSecurity toArrowAssoc\[StrictTransportSecurity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StrictTransportSecurity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictTransportSecurityImplicitThis member is added by an implicit conversion from StrictTransportSecurity toEnsuring\[StrictTransportSecurity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StrictTransportSecurity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictTransportSecurityImplicitThis member is added by an implicit conversion from StrictTransportSecurity toEnsuring\[StrictTransportSecurity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictTransportSecurityImplicitThis member is added by an implicit conversion from StrictTransportSecurity toEnsuring\[StrictTransportSecurity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictTransportSecurityImplicitThis member is added by an implicit conversion from StrictTransportSecurity toEnsuring\[StrictTransportSecurity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#is(nameInLowerCase:String):Boolean "Permalink")  def is(nameInLowerCase: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if nameInLowerCase.equals(lowercaseName()).

Returns true if and only if nameInLowerCase.equals(lowercaseName()).

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
17. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#isNot(nameInLowerCase:String):Boolean "Permalink")  def isNot(nameInLowerCase: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns !is(nameInLowerCase).

Returns !is(nameInLowerCase).

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
19. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
24. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#unsafeToString:String "Permalink")  def unsafeToString: StringDefinition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html)
25. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StrictTransportSecurity toStringFormat\[StrictTransportSecurity] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/model/headers/StrictTransportSecurity.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StrictTransportSecurity, B)ImplicitThis member is added by an implicit conversion from StrictTransportSecurity toArrowAssoc\[StrictTransportSecurity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html)

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [HttpHeader](../HttpHeader.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStrictTransportSecurity to any2stringadd\[StrictTransportSecurity]

### Inherited by implicit conversion StringFormat fromStrictTransportSecurity to StringFormat\[StrictTransportSecurity]

### Inherited by implicit conversion Ensuring fromStrictTransportSecurity to Ensuring\[StrictTransportSecurity]

### Inherited by implicit conversion ArrowAssoc fromStrictTransportSecurity to ArrowAssoc\[StrictTransportSecurity]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/StrictTransportSecurity.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/StrictTransportSecurity.html)*
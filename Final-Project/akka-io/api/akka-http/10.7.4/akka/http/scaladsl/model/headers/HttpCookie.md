---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.HttpCookie
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.HttpCookie
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.HttpCookie

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.HttpCookie

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[model](../index.html)
- [Accept](Accept.html)
- [Accept\-Charset](Accept$minusCharset.html)
- [Accept\-Encoding](Accept$minusEncoding.html)
- [Accept\-Language](Accept$minusLanguage.html)
- [Accept\-Ranges](Accept$minusRanges.html)
- [Access\-Control\-Allow\-Credentials](Access$minusControl$minusAllow$minusCredentials.html)
- [Access\-Control\-Allow\-Headers](Access$minusControl$minusAllow$minusHeaders.html)
- [Access\-Control\-Allow\-Methods](Access$minusControl$minusAllow$minusMethods.html)
- [Access\-Control\-Allow\-Origin](Access$minusControl$minusAllow$minusOrigin.html)
- [Access\-Control\-Expose\-Headers](Access$minusControl$minusExpose$minusHeaders.html)
- [Access\-Control\-Max\-Age](Access$minusControl$minusMax$minusAge.html)
- [Access\-Control\-Request\-Headers](Access$minusControl$minusRequest$minusHeaders.html)
- [Access\-Control\-Request\-Method](Access$minusControl$minusRequest$minusMethod.html)
- [Age](Age.html)
- [Allow](Allow.html)
- [Authorization](Authorization.html)
- [BasicHttpCredentials](BasicHttpCredentials.html)
- [ByteRange](ByteRange.html)
- [Cache\-Control](Cache$minusControl.html)
- [CacheDirective](CacheDirective.html)
- [CacheDirectives](CacheDirectives$.html)
- [Connection](Connection.html)
- [Content\-Disposition](Content$minusDisposition.html)
- [Content\-Encoding](Content$minusEncoding.html)
- [Content\-Length](Content$minusLength.html "Instances of this class will only be created transiently during header parsing and will never appear in HttpMessage.header.")
- [Content\-Location](Content$minusLocation.html)
- [Content\-Range](Content$minusRange.html)
- [Content\-Type](Content$minusType.html "Instances of this class will only be created transiently during header parsing and will never appear in HttpMessage.header.")
- [ContentDispositionType](ContentDispositionType.html)
- [ContentDispositionTypes](ContentDispositionTypes$.html)
- [Cookie](Cookie.html)
- [CustomHeader](CustomHeader.html "Superclass for user-defined custom headers defined by implementing name and value.")
- [Date](Date.html)
- [ETag](ETag.html)
- [EntityTag](EntityTag.html)
- [EntityTagRange](EntityTagRange.html)
- [Expect](Expect.html)
- [Expires](Expires.html)
- [GenericHttpCredentials](GenericHttpCredentials.html)
- [Host](Host.html)
- [HttpChallenge](HttpChallenge.html "Note: the token of challenge is stored in the params Map as a parameter whose name is empty String(\"\") for binary compatibility, but it will be parsed and rendered correctly.")
- [HttpChallenges](HttpChallenges$.html)
- HttpCookie
- [HttpCookiePair](HttpCookiePair.html "for a full definition of the http cookie header fields, see http://tools.ietf.org/html/rfc6265 This class is sealed abstract to prevent generation of default apply method in companion")
- [HttpCredentials](HttpCredentials.html)
- [HttpEncoding](HttpEncoding.html)
- [HttpEncodingRange](HttpEncodingRange.html)
- [HttpEncodings](HttpEncodings$.html)
- [HttpOrigin](HttpOrigin.html)
- [HttpOriginRange](HttpOriginRange.html)
- [If\-Match](If$minusMatch.html)
- [If\-Modified\-Since](If$minusModified$minusSince.html)
- [If\-None\-Match](If$minusNone$minusMatch.html)
- [If\-Range](If$minusRange.html)
- [If\-Unmodified\-Since](If$minusUnmodified$minusSince.html)
- [IgnoredDirective](IgnoredDirective.html)
- [IncludeSubDomains](IncludeSubDomains$.html)
- [Language](Language.html)
- [LanguageRange](LanguageRange.html)
- [Last\-Event\-ID](Last$minusEvent$minusID.html)
- [Last\-Modified](Last$minusModified.html)
- [Link](Link.html)
- [LinkParam](LinkParam.html)
- [LinkParams](LinkParams$.html)
- [LinkValue](LinkValue.html)
- [Location](Location.html)
- [MaxAge](MaxAge.html)
- [ModeledCompanion](ModeledCompanion.html)
- [ModeledCustomHeader](ModeledCustomHeader.html "Support class for building user-defined custom headers defined by implementing name and value.")
- [ModeledCustomHeaderCompanion](ModeledCustomHeaderCompanion.html "To be extended by companion object of a custom header extending ModeledCustomHeader.")
- [ModeledHeader](ModeledHeader.html)
- [OAuth2BearerToken](OAuth2BearerToken.html)
- [Origin](Origin.html)
- [ProductVersion](ProductVersion.html)
- [Proxy\-Authenticate](Proxy$minusAuthenticate.html)
- [Proxy\-Authorization](Proxy$minusAuthorization.html)
- [Range](Range.html)
- [RangeUnit](RangeUnit.html)
- [RangeUnits](RangeUnits$.html)
- [Raw\-Request\-URI](Raw$minusRequest$minusURI.html)
- [RawHeader](RawHeader.html)
- [Referer](Referer.html)
- [Remote\-Address](Remote$minusAddress.html)
- [Retry\-After](Retry$minusAfter.html)
- [RetryAfterDateTime](RetryAfterDateTime.html)
- [RetryAfterDuration](RetryAfterDuration.html)
- [RetryAfterParameter](RetryAfterParameter.html "Defines different values admitted to define a `Retry-After` header.")
- [SameSite](SameSite.html "The Cookie SameSite attribute as defined by RFC6265bis and Incrementally Better Cookies.")
- [Server](Server.html)
- [Set\-Cookie](Set$minusCookie.html)
- [Strict\-Transport\-Security](Strict$minusTransport$minusSecurity.html)
- [StrictTransportSecurityDirective](StrictTransportSecurityDirective.html "Not for user extension")
- [TE](TE.html)
- [Timeout\-Access](Timeout$minusAccess.html)
- [Tls\-Session\-Info](Tls$minusSession$minusInfo.html)
- [Transfer\-Encoding](Transfer$minusEncoding.html)
- [Upgrade](Upgrade.html)
- [UpgradeProtocol](UpgradeProtocol.html)
- [User\-Agent](User$minusAgent.html)
- [WWW\-Authenticate](WWW$minusAuthenticate.html)
- [WebSocketExtension](WebSocketExtension.html "A websocket extension as defined in http://tools.ietf.org/html/rfc6455#section-4.3")
- [X\-Forwarded\-For](X$minusForwarded$minusFor.html)
- [X\-Forwarded\-Host](X$minusForwarded$minusHost.html "De-facto standard as per https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Host")
- [X\-Forwarded\-Proto](X$minusForwarded$minusProto.html "de-facto standard as per https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Proto")
- [X\-Real\-Ip](X$minusReal$minusIp.html)
[c](HttpCookie$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html)

# [HttpCookie](HttpCookie$.html "See companion object")[**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html "Permalink")

### Companion [object HttpCookie](HttpCookie$.html "See companion object")

#### final  class HttpCookie extends [javadsl.model.headers.HttpCookie](../../../javadsl/model/headers/HttpCookie.html) with ToStringRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable with [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

for a full definition of the http cookie header fields, see
http://tools.ietf.org/html/rfc6265

Source[HttpCookie.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/HttpCookie.scala#L59)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), ToStringRenderable, Renderable, [javadsl.model.headers.HttpCookie](../../../javadsl/model/headers/HttpCookie.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpCookie
2. Serializable
3. Product
4. Equals
5. ToStringRenderable
6. Renderable
7. HttpCookie
8. AnyRef
9. Any
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

1. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#<init>(name:String,value:String,expires:Option[akka.http.scaladsl.model.DateTime],maxAge:Option[Long],domain:Option[String],path:Option[String],secure:Boolean,httpOnly:Boolean,extension:Option[String]):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  new HttpCookie(name: String, value: String, expires: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DateTime](../DateTime.html)] \= None, maxAge: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)] \= None, domain: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, path: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, secure: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, httpOnly: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, extension: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None)Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Please use HttpCookie(name, value).withXxx()
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpCookie toany2stringadd\[HttpCookie] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpCookie, B)ImplicitThis member is added by an implicit conversion from HttpCookie toArrowAssoc\[HttpCookie] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesHttpCookie → Equals
8. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#domain:Option[String] "Permalink")  val domain: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
10. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpCookie) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpCookieImplicitThis member is added by an implicit conversion from HttpCookie toEnsuring\[HttpCookie] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpCookie) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpCookieImplicitThis member is added by an implicit conversion from HttpCookie toEnsuring\[HttpCookie] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpCookieImplicitThis member is added by an implicit conversion from HttpCookie toEnsuring\[HttpCookie] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpCookieImplicitThis member is added by an implicit conversion from HttpCookie toEnsuring\[HttpCookie] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesHttpCookie → Equals → AnyRef → Any
16. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#expires:Option[akka.http.scaladsl.model.DateTime] "Permalink")  val expires: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DateTime](../DateTime.html)]
17. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#extension:Option[String] "Permalink")  val extension: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
18. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#getDomain():java.util.Optional[String] "Permalink")  def getDomain(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Java API

Java API

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
20. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#getExpires():java.util.Optional[akka.http.javadsl.model.DateTime] "Permalink")  def getExpires(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[javadsl.model.DateTime](../../../javadsl/model/DateTime.html)]Java API

Java API

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
21. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#getExtension():java.util.Optional[String] "Permalink")  def getExtension(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Java API

Java API

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
22. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#getMaxAge():java.util.OptionalLong "Permalink")  def getMaxAge(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)Java API

Java API

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
23. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#getPath():java.util.Optional[String] "Permalink")  def getPath(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Java API

Java API

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
24. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#getSameSite():java.util.Optional[akka.http.javadsl.model.headers.SameSite] "Permalink")  def getSameSite(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[javadsl.model.headers.SameSite](../../../javadsl/model/headers/SameSite.html)]Java API

Java API

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
25. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#httpOnly:Boolean "Permalink")  val httpOnly: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
27. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#maxAge:Option[Long] "Permalink")  val maxAge: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
29. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#name:String "Permalink")  val name: StringDefinition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
30. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#pair():akka.http.scaladsl.model.headers.HttpCookiePair "Permalink")  def pair(): [HttpCookiePair](HttpCookiePair.html)Returns the name/value pair for this cookie, to be used in [Cookie](Cookie.html) headers.

Returns the name/value pair for this cookie, to be used in [Cookie](Cookie.html) headers.

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
34. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#path:Option[String] "Permalink")  val path: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
35. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHttpCookie → Product
36. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesHttpCookie → Product
37. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
38. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
39. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
40. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#productPrefix:String "Permalink")  def productPrefix: StringDefinition ClassesProduct
41. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesHttpCookie → Renderable
42. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#sameSite:Option[akka.http.scaladsl.model.headers.SameSite] "Permalink")  val sameSite: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SameSite](SameSite.html)]
43. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#secure:Boolean "Permalink")  val secure: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
44. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
45. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
46. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#value:String "Permalink")  val value: StringDefinition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
47. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
48. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
49. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
50. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withDomain(domain:String):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withDomain(domain: String): HttpCookieReturns a copy of this HttpCookie instance with the given domain set.

Returns a copy of this HttpCookie instance with the given domain set.

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
51. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withExpires(dateTime:akka.http.javadsl.model.DateTime):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withExpires(dateTime: [javadsl.model.DateTime](../../../javadsl/model/DateTime.html)): HttpCookieJava API

Java API

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
52. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withExpires(dateTime:akka.http.scaladsl.model.DateTime):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withExpires(dateTime: [DateTime](../DateTime.html)): HttpCookieScala API
53. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withExtension(extension:String):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withExtension(extension: String): HttpCookieReturns a copy of this HttpCookie instance with the given extension set.

Returns a copy of this HttpCookie instance with the given extension set.

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
54. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withHttpOnly(httpOnly:Boolean):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withHttpOnly(httpOnly: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpCookieReturns a copy of this HttpCookie instance with the given http\-only flag set.

Returns a copy of this HttpCookie instance with the given http\-only flag set.

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
55. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withMaxAge(maxAge:Long):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withMaxAge(maxAge: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): HttpCookieReturns a copy of this HttpCookie instance with the given max age set.

Returns a copy of this HttpCookie instance with the given max age set.

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
56. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withName(name:String):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withName(name: String): HttpCookie
57. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withPath(path:String):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withPath(path: String): HttpCookieReturns a copy of this HttpCookie instance with the given path set.

Returns a copy of this HttpCookie instance with the given path set.

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
58. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withSameSite(sameSite:java.util.Optional[akka.http.javadsl.model.headers.SameSite]):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withSameSite(sameSite: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[javadsl.model.headers.SameSite](../../../javadsl/model/headers/SameSite.html)]): HttpCookieReturns a copy of this HttpCookie instance with the given Optional `[SameSite](SameSite.html)` set.

Returns a copy of this HttpCookie instance with the given Optional `[SameSite](SameSite.html)` set.

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
59. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withSameSite(sameSite:akka.http.javadsl.model.headers.SameSite):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withSameSite(sameSite: [javadsl.model.headers.SameSite](../../../javadsl/model/headers/SameSite.html)): HttpCookieJava API

Java API

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
60. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withSameSite(sameSite:Option[akka.http.scaladsl.model.headers.SameSite]):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withSameSite(sameSite: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SameSite](SameSite.html)]): HttpCookie
61. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withSameSite(sameSite:akka.http.scaladsl.model.headers.SameSite):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withSameSite(sameSite: [SameSite](SameSite.html)): HttpCookieScala API
62. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withSecure(secure:Boolean):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withSecure(secure: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpCookieReturns a copy of this HttpCookie instance with the given secure flag set.

Returns a copy of this HttpCookie instance with the given secure flag set.

Definition ClassesHttpCookie → [HttpCookie](../../../javadsl/model/headers/HttpCookie.html)
63. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#withValue(value:String):akka.http.scaladsl.model.headers.HttpCookie "Permalink")  def withValue(value: String): HttpCookie
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpCookie toStringFormat\[HttpCookie] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/headers/HttpCookie.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpCookie, B)ImplicitThis member is added by an implicit conversion from HttpCookie toArrowAssoc\[HttpCookie] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.headers.HttpCookie](../../../javadsl/model/headers/HttpCookie.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpCookie to any2stringadd\[HttpCookie]

### Inherited by implicit conversion StringFormat fromHttpCookie to StringFormat\[HttpCookie]

### Inherited by implicit conversion Ensuring fromHttpCookie to Ensuring\[HttpCookie]

### Inherited by implicit conversion ArrowAssoc fromHttpCookie to ArrowAssoc\[HttpCookie]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/SameSite.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusCharset$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusEncoding$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusLanguage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusLanguage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusRanges$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusOrigin$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusOrigin.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusMax$minusAge$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusMax$minusAge.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Age$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Age.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Allow$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Allow.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Authorization$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Authorization.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/BasicHttpCredentials$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Cache$minusControl$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Cache$minusControl.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Connection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Content$minusDisposition$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html)*
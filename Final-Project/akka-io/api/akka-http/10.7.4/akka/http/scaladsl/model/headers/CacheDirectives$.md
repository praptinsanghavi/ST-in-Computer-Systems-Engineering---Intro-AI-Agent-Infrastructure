---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:59:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.CacheDirectives

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
- CacheDirectives
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
- [HttpCookie](HttpCookie.html "for a full definition of the http cookie header fields, see http://tools.ietf.org/html/rfc6265")
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
o[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html)

# CacheDirectives[**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html "Permalink")

### 

#### object CacheDirectives

Source[CacheDirective.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/CacheDirective.scala#L50)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CacheDirectives
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$max$minusage.html "Permalink") final  case class [max\-age](CacheDirectives$$max$minusage.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.1 and http://tools.ietf.org/html/rfc7234#section-5.2.2.8")(deltaSeconds: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [RequestDirective](CacheDirective$$RequestDirective.html) with [ResponseDirective](CacheDirective$$ResponseDirective.html) with ValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.1\.1 and
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.8
2. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$max$minusstale.html "Permalink") final  case class [max\-stale](CacheDirectives$$max$minusstale.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.2")(deltaSeconds: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]) extends [RequestDirective](CacheDirective$$RequestDirective.html) with ValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.1\.2
3. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$min$minusfresh.html "Permalink") final  case class [min\-fresh](CacheDirectives$$min$minusfresh.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.3")(deltaSeconds: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [RequestDirective](CacheDirective$$RequestDirective.html) with ValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.1\.3
4. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache.html "Permalink") final  case class [no\-cache](CacheDirectives$$no$minuscache.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.2")(fieldNames: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]) extends [FieldNamesDirective](CacheDirective$$FieldNamesDirective.html) with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.2
5. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$private.html "Permalink") final  case class [private](CacheDirectives$$private.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.6")(fieldNames: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]) extends [FieldNamesDirective](CacheDirective$$FieldNamesDirective.html) with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.6
6. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$s$minusmaxage.html "Permalink") final  case class [s\-maxage](CacheDirectives$$s$minusmaxage.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.9")(deltaSeconds: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [ResponseDirective](CacheDirective$$ResponseDirective.html) with ValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.9
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#createPrivate(fieldNames:String*):akka.http.scaladsl.model.headers.CacheDirective.ResponseDirective "Permalink")  def createPrivate(fieldNames: String\*): [ResponseDirective](CacheDirective$$ResponseDirective.html)Java API

Java API

Annotations@varargs()
7. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#getImmutable:akka.http.scaladsl.model.headers.CacheDirective.ResponseDirective "Permalink")  def getImmutable: [ResponseDirective](CacheDirective$$ResponseDirective.html)Java API
11. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#getPublic:akka.http.scaladsl.model.headers.CacheDirective.ResponseDirective "Permalink")  def getPublic: [ResponseDirective](CacheDirective$$ResponseDirective.html)Java API
12. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$immutableDirective$.html "Permalink")  case object [immutableDirective](CacheDirectives$$immutableDirective$.html "https://tools.ietf.org/html/rfc8246") extends SingletonValueRenderable with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializablehttps://tools.ietf.org/html/rfc8246

https://tools.ietf.org/html/rfc8246

Annotations@ApiMayChange()
23. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$must$minusrevalidate$.html "Permalink")  case object [must\-revalidate](CacheDirectives$$must$minusrevalidate$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.1") extends SingletonValueRenderable with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.1
24. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minuscache$.html "Permalink")  case object [no\-cache](CacheDirectives$$no$minuscache$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.4") extends SingletonValueRenderable with [RequestDirective](CacheDirective$$RequestDirective.html) with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.1\.4
25. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minusstore$.html "Permalink")  case object [no\-store](CacheDirectives$$no$minusstore$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.5 and http://tools.ietf.org/html/rfc7234#section-5.2.2.3") extends SingletonValueRenderable with [RequestDirective](CacheDirective$$RequestDirective.html) with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.1\.5 and
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.3
26. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$no$minustransform$.html "Permalink")  case object [no\-transform](CacheDirectives$$no$minustransform$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.6 and http://tools.ietf.org/html/rfc7234#section-5.2.2.4") extends SingletonValueRenderable with [RequestDirective](CacheDirective$$RequestDirective.html) with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.1\.6 and
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.4
27. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$only$minusif$minuscached$.html "Permalink")  case object [only\-if\-cached](CacheDirectives$$only$minusif$minuscached$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.1.7") extends SingletonValueRenderable with [RequestDirective](CacheDirective$$RequestDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.1\.7
28. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$private$.html "Permalink")  object [private](CacheDirectives$$private$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
29. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$proxy$minusrevalidate$.html "Permalink")  case object [proxy\-revalidate](CacheDirectives$$proxy$minusrevalidate$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.7") extends SingletonValueRenderable with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.7
30. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$$public$.html "Permalink")  case object [public](CacheDirectives$$public$.html "For a fuller description of the use case, see http://tools.ietf.org/html/rfc7234#section-5.2.2.5") extends SingletonValueRenderable with [ResponseDirective](CacheDirective$$ResponseDirective.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor a fuller description of the use case, see
http://tools.ietf.org/html/rfc7234\#section\-5\.2\.2\.5
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/CacheDirectives$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$FieldNamesDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$RequestDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$$ResponseDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$immutableDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$max$minusage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$max$minusstale.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$min$minusfresh.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$$must$minusrevalidate$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CacheDirectives$.html)*
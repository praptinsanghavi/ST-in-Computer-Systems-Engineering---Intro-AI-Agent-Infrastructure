---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.Accept
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/Accept.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.Accept
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.Accept

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.headers.Accept

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[model](../index.html)
- Accept
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
[c](Accept$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[headers](index.html)

# [Accept](Accept$.html "See companion object")[**](../../../../../akka/http/scaladsl/model/headers/Accept.html "Permalink")

### Companion [object Accept](Accept$.html "See companion object")

#### final  case class Accept(mediaRanges: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[MediaRange](../MediaRange.html)]) extends [javadsl.model.headers.Accept](../../../javadsl/model/headers/Accept.html) with RequestHeader with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[headers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/headers/headers.scala#L147)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), RequestHeader, [ModeledHeader](ModeledHeader.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [javadsl.model.headers.Accept](../../../javadsl/model/headers/Accept.html), [HttpHeader](../HttpHeader.html), ToStringRenderable, Renderable, [javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Accept
2. Product
3. Equals
4. RequestHeader
5. ModeledHeader
6. Serializable
7. Accept
8. HttpHeader
9. ToStringRenderable
10. Renderable
11. HttpHeader
12. AnyRef
13. Any
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

1. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#<init>(mediaRanges:Seq[akka.http.scaladsl.model.MediaRange]):akka.http.scaladsl.model.headers.Accept "Permalink")  new Accept(mediaRanges: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[MediaRange](../MediaRange.html)])
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Accept toany2stringadd\[Accept] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Accept, B)ImplicitThis member is added by an implicit conversion from Accept toArrowAssoc\[Accept] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#acceptsAll():Boolean "Permalink")  def acceptsAll(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAccept → [Accept](../../../javadsl/model/headers/Accept.html)
7. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#companion:akka.http.scaladsl.model.headers.Accept.type "Permalink")  def companion: [Accept](Accept$.html)Attributesprotected Definition ClassesAccept → [ModeledHeader](ModeledHeader.html)
10. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Accept) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AcceptImplicitThis member is added by an implicit conversion from Accept toEnsuring\[Accept] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Accept) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AcceptImplicitThis member is added by an implicit conversion from Accept toEnsuring\[Accept] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AcceptImplicitThis member is added by an implicit conversion from Accept toEnsuring\[Accept] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AcceptImplicitThis member is added by an implicit conversion from Accept toEnsuring\[Accept] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#getMediaRanges():Iterable[akka.http.javadsl.model.MediaRange] "Permalink")  def getMediaRanges(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.MediaRange](../../../javadsl/model/MediaRange.html)]Java API

Java API

Definition ClassesAccept → [Accept](../../../javadsl/model/headers/Accept.html)
17. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#is(nameInLowerCase:String):Boolean "Permalink")  def is(nameInLowerCase: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if nameInLowerCase.equals(lowercaseName()).

Returns true if and only if nameInLowerCase.equals(lowercaseName()).

Definition Classes[HttpHeader](../HttpHeader.html) → [HttpHeader](../../../javadsl/model/HttpHeader.html)
18. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#isNot(nameInLowerCase:String):Boolean "Permalink")  def isNot(nameInLowerCase: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns !is(nameInLowerCase).

Returns !is(nameInLowerCase).

Definition Classes[HttpHeader](../HttpHeader.html) → [HttpHeader](../../../javadsl/model/HttpHeader.html)
20. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#lowercaseName():String "Permalink")  def lowercaseName(): StringReturns the lower\-cased name of the header.

Returns the lower\-cased name of the header.

Definition Classes[ModeledHeader](ModeledHeader.html) → [HttpHeader](../HttpHeader.html) → [HttpHeader](../../../javadsl/model/HttpHeader.html)
21. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#mediaRanges:Seq[akka.http.scaladsl.model.MediaRange] "Permalink")  val mediaRanges: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[MediaRange](../MediaRange.html)]
22. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#name():String "Permalink")  def name(): StringReturns the name of the header.

Returns the name of the header.

Definition Classes[ModeledHeader](ModeledHeader.html) → [HttpHeader](../HttpHeader.html) → [HttpHeader](../../../javadsl/model/HttpHeader.html)
23. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
27. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink") final  def render\[R \<: Rendering](r: R): r.typeDefinition Classes[ModeledHeader](ModeledHeader.html) → Renderable
28. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#renderInRequests():Boolean "Permalink")  def renderInRequests(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in requests.

Returns true if and only if the header is to be rendered in requests.

Definition ClassesRequestHeader → [ModeledHeader](ModeledHeader.html) → [HttpHeader](../../../javadsl/model/HttpHeader.html)
29. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#renderInResponses():Boolean "Permalink")  def renderInResponses(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in responses.

Returns true if and only if the header is to be rendered in responses.

Definition Classes[ModeledHeader](ModeledHeader.html) → [HttpHeader](../../../javadsl/model/HttpHeader.html)
30. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#renderValue[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def renderValue\[R \<: Rendering](r: R): r.typeDefinition ClassesAccept → [ModeledHeader](ModeledHeader.html)
31. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
33. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#unsafeToString:String "Permalink")  def unsafeToString: StringDefinition Classes[HttpHeader](../HttpHeader.html)
34. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#value():String "Permalink")  def value(): StringReturns the String representation of the value of the header.

Returns the String representation of the value of the header.

Definition Classes[ModeledHeader](ModeledHeader.html) → [HttpHeader](../HttpHeader.html) → [HttpHeader](../../../javadsl/model/HttpHeader.html)
35. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Accept toStringFormat\[Accept] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/headers/Accept.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Accept, B)ImplicitThis member is added by an implicit conversion from Accept toArrowAssoc\[Accept] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from RequestHeader

### Inherited from [ModeledHeader](ModeledHeader.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [javadsl.model.headers.Accept](../../../javadsl/model/headers/Accept.html)

### Inherited from [HttpHeader](../HttpHeader.html)

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAccept to any2stringadd\[Accept]

### Inherited by implicit conversion StringFormat fromAccept to StringFormat\[Accept]

### Inherited by implicit conversion Ensuring fromAccept to Ensuring\[Accept]

### Inherited by implicit conversion ArrowAssoc fromAccept to ArrowAssoc\[Accept]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Accept.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRange.html
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

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html)*
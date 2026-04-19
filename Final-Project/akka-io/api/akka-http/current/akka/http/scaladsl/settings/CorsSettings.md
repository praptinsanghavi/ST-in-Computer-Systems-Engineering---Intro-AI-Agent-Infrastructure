---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.CorsSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:11:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.CorsSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.CorsSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.CorsSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[scaladsl](../index.html)
- [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing")
- [ConnectionPoolSettings](ConnectionPoolSettings.html "Public API but not intended for subclassing")
- CorsSettings
- [Http2ClientSettings](Http2ClientSettings.html)
- [Http2ServerSettings](Http2ServerSettings.html)
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- [ParserSettings](ParserSettings.html "Public API but not intended for subclassing")
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [WebSocketSettings](WebSocketSettings.html)
[t](CorsSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# [CorsSettings](CorsSettings$.html "See companion object")[**](../../../../akka/http/scaladsl/settings/CorsSettings.html "Permalink")

### Companion [object CorsSettings](CorsSettings$.html "See companion object")

#### trait CorsSettings extends [javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html)

Settings for the CORS support

This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.

Not for user extension

Self TypeCorsSettingsImplAnnotations@ApiMayChange() @DoNotInherit() Source[CorsSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/settings/CorsSettings.scala#L24)Linear Supertypes[javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CorsSettings
2. CorsSettings
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#allowCredentials:Boolean "Permalink") abstract  def allowCredentials: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)If enabled, the header `Access-Control-Allow-Credentials`
is included in the response, indicating that the actual request can include user credentials.

If enabled, the header `Access-Control-Allow-Credentials`
is included in the response, indicating that the actual request can include user credentials. Examples of user
credentials are: cookies, HTTP authentication or client\-side certificates.

Definition ClassesCorsSettings → [CorsSettings](../../javadsl/settings/CorsSettings.html)
2. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#allowGenericHttpRequests:Boolean "Permalink") abstract  def allowGenericHttpRequests: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Allow generic requests, that are outside the scope of the specification, for example lacking an `Origin` header
to pass through the directive.

Allow generic requests, that are outside the scope of the specification, for example lacking an `Origin` header
to pass through the directive.

When false strict CORS filtering is applied and any invalid request will be rejected.

Definition ClassesCorsSettings → [CorsSettings](../../javadsl/settings/CorsSettings.html)
3. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#allowedHeaders:Set[String] "Permalink") abstract  def allowedHeaders: Set\[String]Set of request headers that are allowed when making an actual request.

Set of request headers that are allowed when making an actual request.

Controls the content of the `Access-Control-Allow-Headers` header in a preflight response: If set to a single `*`,
the headers from `Access-Control-Request-Headers` are echoed. Otherwise specified list of header names is returned
as part of the header.
4. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#allowedMethods:Set[akka.http.scaladsl.model.HttpMethod] "Permalink") abstract  def allowedMethods: Set\[[HttpMethod](../model/HttpMethod.html)]List of methods allowed when making an actual request.

List of methods allowed when making an actual request. The listed headers are returned as part of the
`Access-Control-Allow-Methods` preflight response header.

The preflight request will be rejected if the `Access-Control-Request-Method` header's method is not part of the
list.
5. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#allowedOrigins:Set[String] "Permalink") abstract  def allowedOrigins: Set\[String]List of origins that the CORS filter must allow.

List of origins that the CORS filter must allow.

Can also be set to a single `*` to allow access to the resource from any origin.

Controls the content of the `Access-Control-Allow-Origin` response header: if parameter is `*` and
credentials are not allowed, a `*` is returned in `Access-Control-Allow-Origin`. Otherwise, the origins given in the
`Origin` request header are echoed.

Hostname starting with `*.` will match any sub\-domain. The scheme and the port are always strictly matched.

The actual or preflight request is rejected if any of the origins from the request is not allowed.
6. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#exposedHeaders:Set[String] "Permalink") abstract  def exposedHeaders: Set\[String]Set of headers (other than simple response headers) that browsers are allowed to access.

Set of headers (other than simple response headers) that browsers are allowed to access. If not empty, the listed
headers are returned as part of the `Access-Control-Expose-Headers` header in responses.
7. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#maxAge:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def maxAge: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)The time the browser is allowed to cache the results of a preflight request.

The time the browser is allowed to cache the results of a preflight request. This value is
returned as part of the `Access-Control-Max-Age` preflight response header. If `scala.concurrent.duration.Duration.Zero`,
the header is not added to the preflight response.
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CorsSettings toany2stringadd\[CorsSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CorsSettings, B)ImplicitThis member is added by an implicit conversion from CorsSettings toArrowAssoc\[CorsSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CorsSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CorsSettingsImplicitThis member is added by an implicit conversion from CorsSettings toEnsuring\[CorsSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CorsSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CorsSettingsImplicitThis member is added by an implicit conversion from CorsSettings toEnsuring\[CorsSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CorsSettingsImplicitThis member is added by an implicit conversion from CorsSettings toEnsuring\[CorsSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CorsSettingsImplicitThis member is added by an implicit conversion from CorsSettings toEnsuring\[CorsSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#getAllowedHeaders:java.util.Set[String] "Permalink")  def getAllowedHeaders: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Set of request headers that are allowed when making an actual request.

Set of request headers that are allowed when making an actual request.

Controls the content of the `Access-Control-Allow-Headers` header in a preflight response: If set to a single `*`,
the headers from `Access-Control-Request-Headers` are echoed. Otherwise specified list of header names is returned
as part of the header.

Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
15. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#getAllowedMethods:java.util.Set[akka.http.javadsl.model.HttpMethod] "Permalink")  def getAllowedMethods: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[HttpMethod](../../javadsl/model/HttpMethod.html)]List of methods allowed when making an actual request.

List of methods allowed when making an actual request. The listed headers are returned as part of the
`Access-Control-Allow-Methods` preflight response header.

The preflight request will be rejected if the `Access-Control-Request-Method` header's method is not part of the
list.

Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
16. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#getAllowedOrigins:java.util.Set[String] "Permalink")  def getAllowedOrigins: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]List of origins that the CORS filter must allow.

List of origins that the CORS filter must allow.

Can also be set to a single `*` to allow access to the resource from any origin.

Controls the content of the `Access-Control-Allow-Origin` response header: if parameter is `*` and
credentials are not allowed, a `*` is returned in `Access-Control-Allow-Origin`. Otherwise, the origins given in the
`Origin` request header are echoed.

Hostname starting with `*.` will match any sub\-domain. The scheme and the port are always strictly matched.

The actual or preflight request is rejected if any of the origins from the request is not allowed.

Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
17. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#getExposedHeaders:java.util.Set[String] "Permalink")  def getExposedHeaders: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Set of headers (other than simple response headers) that browsers are allowed to access.

Set of headers (other than simple response headers) that browsers are allowed to access. If not empty, the listed
headers are returned as part of the `Access-Control-Expose-Headers` header in responses.

Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
19. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#getMaxAge:java.time.Duration "Permalink")  def getMaxAge: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)The time the browser is allowed to cache the results of a preflight request.

The time the browser is allowed to cache the results of a preflight request. This value is
returned as part of the `Access-Control-Max-Age` preflight response header. If `java.time.Duration.ZERO`,
the header is not added to the preflight response.

Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
20. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowAnyHeader():akka.http.scaladsl.settings.CorsSettings "Permalink")  def withAllowAnyHeader(): CorsSettingsDefinition ClassesCorsSettings → [CorsSettings](../../javadsl/settings/CorsSettings.html)
31. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowAnyOrigin():akka.http.scaladsl.settings.CorsSettings "Permalink")  def withAllowAnyOrigin(): CorsSettingsDefinition ClassesCorsSettings → [CorsSettings](../../javadsl/settings/CorsSettings.html)
32. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowCredentials(allow:Boolean):akka.http.scaladsl.settings.CorsSettings "Permalink")  def withAllowCredentials(allow: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CorsSettingsDefinition ClassesCorsSettings → [CorsSettings](../../javadsl/settings/CorsSettings.html)
33. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowGenericHttpRequests(allow:Boolean):akka.http.scaladsl.settings.CorsSettings "Permalink")  def withAllowGenericHttpRequests(allow: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CorsSettingsDefinition ClassesCorsSettings → [CorsSettings](../../javadsl/settings/CorsSettings.html)
34. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowedHeaders(headerNames:Set[String]):akka.http.scaladsl.settings.CorsSettings "Permalink")  def withAllowedHeaders(headerNames: Set\[String]): CorsSettings
35. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowedHeaders(headerNames:java.util.Set[String]):akka.http.javadsl.settings.CorsSettings "Permalink")  def withAllowedHeaders(headerNames: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html)Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
36. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowedMethods(methods:Set[akka.http.scaladsl.model.HttpMethod]):akka.http.scaladsl.settings.CorsSettings "Permalink")  def withAllowedMethods(methods: Set\[[HttpMethod](../model/HttpMethod.html)]): CorsSettings
37. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowedMethods(methods:java.util.Set[akka.http.javadsl.model.HttpMethod]):akka.http.javadsl.settings.CorsSettings "Permalink")  def withAllowedMethods(methods: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[HttpMethod](../../javadsl/model/HttpMethod.html)]): [javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html)Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
38. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowedOrigins(origins:Set[String]):akka.http.scaladsl.settings.CorsSettings "Permalink")  def withAllowedOrigins(origins: Set\[String]): CorsSettings
39. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withAllowedOrigins(origins:java.util.Set[String]):akka.http.javadsl.settings.CorsSettings "Permalink")  def withAllowedOrigins(origins: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html)Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
40. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withExposedHeaders(headerNames:Set[String]):akka.http.scaladsl.settings.CorsSettings "Permalink")  def withExposedHeaders(headerNames: Set\[String]): CorsSettings
41. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withExposedHeaders(headerNames:java.util.Set[String]):akka.http.javadsl.settings.CorsSettings "Permalink")  def withExposedHeaders(headerNames: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html)Definition Classes[CorsSettings](../../javadsl/settings/CorsSettings.html)
42. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#withMaxAge(maxAge:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.CorsSettings "Permalink")  def withMaxAge(maxAge: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): CorsSettings
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CorsSettings toStringFormat\[CorsSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/settings/CorsSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CorsSettings, B)ImplicitThis member is added by an implicit conversion from CorsSettings toArrowAssoc\[CorsSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCorsSettings to any2stringadd\[CorsSettings]

### Inherited by implicit conversion StringFormat fromCorsSettings to StringFormat\[CorsSettings]

### Inherited by implicit conversion Ensuring fromCorsSettings to Ensuring\[CorsSettings]

### Inherited by implicit conversion ArrowAssoc fromCorsSettings to ArrowAssoc\[CorsSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html)*
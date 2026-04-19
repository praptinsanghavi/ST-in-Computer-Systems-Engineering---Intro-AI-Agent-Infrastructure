---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.SecurityDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:17:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/directives/SecurityDirectives.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.SecurityDirectives
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.SecurityDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.SecurityDirectives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- [BasicDirectives](BasicDirectives.html)
- [CacheConditionDirectives](CacheConditionDirectives.html)
- [CachingDirectives](CachingDirectives$.html)
- [CodingDirectives](CodingDirectives.html)
- [ContentTypeResolver](ContentTypeResolver.html "Implement this interface to provide a custom mapping from a file name to a akka.http.javadsl.model.ContentType.")
- [CookieDirectives](CookieDirectives.html)
- [CorrespondsTo](CorrespondsTo.html)
- [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.")
- [DebuggingDirectives](DebuggingDirectives.html)
- [DirectoryListing](DirectoryListing.html)
- [DirectoryRenderer](DirectoryRenderer.html)
- [ExecutionDirectives](ExecutionDirectives.html)
- [FileAndResourceDirectives](FileAndResourceDirectives.html "Directives that load files and resources.")
- [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")
- [FileUploadDirectives](FileUploadDirectives.html)
- [FormFieldDirectives](FormFieldDirectives.html)
- [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "EXPERIMENTAL API")
- [FutureDirectives](FutureDirectives.html)
- [HeaderDirectives](HeaderDirectives.html)
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [ParameterDirectives](ParameterDirectives.html)
- [PathDirectives](PathDirectives.html "Only path prefixes are matched by these methods, since any kind of chaining path extractions in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java.")
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- [RouteAdapter](RouteAdapter.html "INTERNAL API")
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- SecurityDirectives
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
[c](SecurityDirectives$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[server](../index.html).[directives](index.html)

# [SecurityDirectives](SecurityDirectives$.html "See companion object")[**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html "Permalink")

### Companion [object SecurityDirectives](SecurityDirectives$.html "See companion object")

#### abstract  class SecurityDirectives extends [SchemeDirectives](SchemeDirectives.html)

Source[SecurityDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/server/directives/SecurityDirectives.scala#L47)Linear Supertypes[SchemeDirectives](SchemeDirectives.html), [RouteDirectives](RouteDirectives.html), [RespondWithDirectives](RespondWithDirectives.html), [RangeDirectives](RangeDirectives.html), [PathDirectives](PathDirectives.html), [ParameterDirectives](ParameterDirectives.html), [MiscDirectives](MiscDirectives.html), [MethodDirectives](MethodDirectives.html), [MarshallingDirectives](MarshallingDirectives.html), [HostDirectives](HostDirectives.html), [AttributeDirectives](AttributeDirectives.html), [HeaderDirectives](HeaderDirectives.html), [FutureDirectives](FutureDirectives.html), [FormFieldDirectives](FormFieldDirectives.html), [FileUploadDirectives](FileUploadDirectives.html), [FileAndResourceDirectives](FileAndResourceDirectives.html), [ExecutionDirectives](ExecutionDirectives.html), [DebuggingDirectives](DebuggingDirectives.html), [CookieDirectives](CookieDirectives.html), [CodingDirectives](CodingDirectives.html), [CacheConditionDirectives](CacheConditionDirectives.html), [BasicDirectives](BasicDirectives.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AllDirectives](../AllDirectives.html), [Directives](../Directives$.html), [CorsDirectives](CorsDirectives.html), [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html), [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives$.html), [TimeoutDirectives](TimeoutDirectives.html), [TlsDirectives](TlsDirectives.html), [WebSocketDirectives](WebSocketDirectives.html), [JUnitRouteTest](../../testkit/JUnitRouteTest.html), [JUnitRouteTestBase](../../testkit/JUnitRouteTestBase.html), [RouteTest](../../testkit/RouteTest.html), [HttpApp](../HttpApp.html)Type Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. SecurityDirectives
2. SchemeDirectives
3. RouteDirectives
4. RespondWithDirectives
5. RangeDirectives
6. PathDirectives
7. ParameterDirectives
8. MiscDirectives
9. MethodDirectives
10. MarshallingDirectives
11. HostDirectives
12. AttributeDirectives
13. HeaderDirectives
14. FutureDirectives
15. FormFieldDirectives
16. FileUploadDirectives
17. FileAndResourceDirectives
18. ExecutionDirectives
19. DebuggingDirectives
20. CookieDirectives
21. CodingDirectives
22. CacheConditionDirectives
23. BasicDirectives
24. AnyRef
25. Any
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

1. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#<init>():akka.http.javadsl.server.directives.SecurityDirectives "Permalink")  new SecurityDirectives()
### Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SecurityDirectives toany2stringadd\[SecurityDirectives] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SecurityDirectives, B)ImplicitThis member is added by an implicit conversion from SecurityDirectives toArrowAssoc\[SecurityDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#attribute[T](key:akka.http.javadsl.model.AttributeKey[T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def attribute\[T](key: [AttributeKey](../../model/AttributeKey.html)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the value of the request attribute with the given key.

Extracts the value of the request attribute with the given key.
If no attribute is found the request is rejected with a [akka.http.javadsl.server.MissingAttributeRejection](../MissingAttributeRejection.html).

Definition Classes[AttributeDirectives](AttributeDirectives.html)
8. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateBasic[T](realm:String,authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.Optional[T]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateBasic\[T](realm: String, authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.

Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is required in this variant, i.e. the request is rejected if \[authenticator] returns Optional.empty.
9. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateBasicAsync[T](realm:String,authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.concurrent.CompletionStage[java.util.Optional[T]]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateBasicAsync\[T](realm: String, authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Wraps the inner route with Http Basic authentication support.

Wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is required in this variant, i.e. the request is rejected if \[authenticator] returns Optional.empty.
10. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateBasicAsyncOptional[T](realm:String,authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.concurrent.CompletionStage[java.util.Optional[T]]],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateBasicAsyncOptional\[T](realm: String, authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [Route](../Route.html)Wraps the inner route with Http Basic authentication support.

Wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is optional in this variant.

Annotations@[CorrespondsTo](CorrespondsTo.html)()
11. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateBasicOptional[T](realm:String,authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.Optional[T]],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateBasicOptional\[T](realm: String, authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [Route](../Route.html)Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.

Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is optional in this variant.

Annotations@[CorrespondsTo](CorrespondsTo.html)()
12. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateBasicPF[T](realm:String,authenticator:PartialFunction[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateBasicPF\[T](realm: String, authenticator: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Wraps the inner route with Http Basic authentication support.

Wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is required in this variant, i.e. the request is rejected if \[authenticator] returns Optional.empty.
13. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateBasicPFAsync[T](realm:String,authenticator:PartialFunction[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.concurrent.CompletionStage[T]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateBasicPFAsync\[T](realm: String, authenticator: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Wraps the inner route with Http Basic authentication support.

Wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is required in this variant, i.e. the request is rejected if \[authenticator] returns Optional.empty.
14. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateOAuth2[T](realm:String,authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.Optional[T]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateOAuth2\[T](realm: String, authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is required in this variant, i.e. the request is rejected if \[authenticator] returns Optional.empty.
15. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateOAuth2Async[T](realm:String,authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.concurrent.CompletionStage[java.util.Optional[T]]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateOAuth2Async\[T](realm: String, authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is required in this variant, i.e. the request is rejected if \[authenticator] returns Optional.empty.
16. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateOAuth2AsyncOptional[T](realm:String,authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.concurrent.CompletionStage[java.util.Optional[T]]],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateOAuth2AsyncOptional\[T](realm: String, authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [Route](../Route.html)A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is optional in this variant.

Annotations@[CorrespondsTo](CorrespondsTo.html)()
17. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateOAuth2Optional[T](realm:String,authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials],java.util.Optional[T]],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateOAuth2Optional\[T](realm: String, authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ProvidedCredentials](SecurityDirectives$$ProvidedCredentials.html)], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [Route](../Route.html)A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Authentication is optional in this variant.

Annotations@[CorrespondsTo](CorrespondsTo.html)()
18. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateOrRejectWithChallenge[C<:akka.http.javadsl.model.headers.HttpCredentials,T](c:Class[C],authenticator:java.util.function.Function[java.util.Optional[C],java.util.concurrent.CompletionStage[Either[akka.http.javadsl.model.headers.HttpChallenge,T]]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateOrRejectWithChallenge\[C \<: [HttpCredentials](../../model/headers/HttpCredentials.html), T](c: Class\[C], authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[C], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Either\[[HttpChallenge](../../model/headers/HttpChallenge.html), T]]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Lifts an authenticator function into a directive.

Lifts an authenticator function into a directive. Same as `authenticateOrRejectWithChallenge`
but only applies the authenticator function with a certain type of credentials.
19. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authenticateOrRejectWithChallenge[T](authenticator:java.util.function.Function[java.util.Optional[akka.http.javadsl.model.headers.HttpCredentials],java.util.concurrent.CompletionStage[Either[akka.http.javadsl.model.headers.HttpChallenge,T]]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authenticateOrRejectWithChallenge\[T](authenticator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpCredentials](../../model/headers/HttpCredentials.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Either\[[HttpChallenge](../../model/headers/HttpChallenge.html), T]]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Lifts an authenticator function into a directive.

Lifts an authenticator function into a directive. The authenticator function gets passed in credentials from the
[akka.http.javadsl.model.headers.Authorization](../../model/headers/Authorization.html) header of the request. If the function returns `Right(user)` the user object is provided
to the inner route. If the function returns `Left(challenge)` the request is rejected with an
[akka.http.javadsl.server.AuthenticationFailedRejection](../AuthenticationFailedRejection.html) that contains this challenge to be added to the response.
20. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authorize(check:java.util.function.Supplier[Boolean],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authorize(check: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Applies the given authorization check to the request.

Applies the given authorization check to the request.
If the check fails the route is rejected with an [akka.http.javadsl.server.AuthorizationFailedRejection](../AuthorizationFailedRejection.html).
21. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authorizeAsync(check:java.util.function.Supplier[java.util.concurrent.CompletionStage[Boolean]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authorizeAsync(check: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Applies the given authorization check to the request.

Applies the given authorization check to the request.
If the check fails the route is rejected with an [akka.http.javadsl.server.AuthorizationFailedRejection](../AuthorizationFailedRejection.html).
22. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authorizeAsyncWithRequestContext(check:akka.japi.function.Function[akka.http.javadsl.server.RequestContext,java.util.concurrent.CompletionStage[Boolean]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authorizeAsyncWithRequestContext(check: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[RequestContext](../RequestContext.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Asynchronous version of [authorize](#authorize(check:java.util.function.Supplier[Boolean],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route).

Asynchronous version of [authorize](#authorize(check:java.util.function.Supplier[Boolean],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route).
If the CompletionStage fails or is completed with `false`
authorization fails and the route is rejected with an [akka.http.javadsl.server.AuthorizationFailedRejection](../AuthorizationFailedRejection.html).

Annotations@[CorrespondsTo](CorrespondsTo.html)()
23. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#authorizeWithRequestContext(check:akka.japi.function.Function[akka.http.javadsl.server.RequestContext,Boolean],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def authorizeWithRequestContext(check: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[RequestContext](../RequestContext.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Applies the given authorization check to the request.

Applies the given authorization check to the request.
If the check fails the route is rejected with an [akka.http.javadsl.server.AuthorizationFailedRejection](../AuthorizationFailedRejection.html).

Annotations@[CorrespondsTo](CorrespondsTo.html)()
24. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#cancelRejection(rejection:akka.http.javadsl.server.Rejection,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejection(rejection: [Rejection](../Rejection.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
25. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#cancelRejections(filter:java.util.function.Predicate[akka.http.javadsl.server.Rejection],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejections(filter: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[[Rejection](../Rejection.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
26. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#cancelRejections(classes:Iterable[Class[_]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejections(classes: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[Class\[\_]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
27. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#checkSameOrigin(allowed:akka.http.javadsl.model.headers.HttpOriginRange,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def checkSameOrigin(allowed: [HttpOriginRange](../../model/headers/HttpOriginRange.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Checks that request comes from the same origin.

Checks that request comes from the same origin. Extracts the Origin header value and verifies that
allowed range contains the obtained value. In the case of absent of the Origin header rejects
with [MissingHeaderRejection](../MissingHeaderRejection.html). If the origin value is not in the allowed range
rejects with an [InvalidOriginRejection](../InvalidOriginRejection.html) and StatusCodes.FORBIDDEN status.

Definition Classes[HeaderDirectives](HeaderDirectives.html)
28. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
29. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(entity:akka.http.javadsl.model.RequestEntity):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(entity: [RequestEntity](../../model/RequestEntity.html)): [RouteAdapter](RouteAdapter.html)Completes the request as HTTP 200 OK with the given value as response entity.

Completes the request as HTTP 200 OK with the given value as response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
30. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(entity:akka.http.javadsl.model.ResponseEntity):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(entity: [ResponseEntity](../../model/ResponseEntity.html)): [RouteAdapter](RouteAdapter.html)Completes the request as HTTP 200 OK with the given value as response entity.

Completes the request as HTTP 200 OK with the given value as response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
31. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(headers:Iterable[akka.http.javadsl.model.HttpHeader],entity:akka.http.javadsl.model.RequestEntity):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](../../model/HttpHeader.html)], entity: [RequestEntity](../../model/RequestEntity.html)): [RouteAdapter](RouteAdapter.html)Completes the request as HTTP 200 OK, adding the given headers and response entity.

Completes the request as HTTP 200 OK, adding the given headers and response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
32. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(headers:Iterable[akka.http.javadsl.model.HttpHeader],entity:akka.http.javadsl.model.ResponseEntity):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](../../model/HttpHeader.html)], entity: [ResponseEntity](../../model/ResponseEntity.html)): [RouteAdapter](RouteAdapter.html)Completes the request as HTTP 200 OK, adding the given headers and response entity.

Completes the request as HTTP 200 OK, adding the given headers and response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
33. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete[T](headers:Iterable[akka.http.javadsl.model.HttpHeader],value:T,marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.RequestEntity]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete\[T](headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](../../model/HttpHeader.html)], value: T, marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [RequestEntity](../../model/RequestEntity.html)]): [RouteAdapter](RouteAdapter.html)Completes the request as HTTP 200 OK, adding the given headers, and marshalling the given value as response entity.

Completes the request as HTTP 200 OK, adding the given headers, and marshalling the given value as response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
34. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(status:akka.http.javadsl.model.StatusCode,entity:String):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(status: [StatusCode](../../model/StatusCode.html), entity: String): [RouteAdapter](RouteAdapter.html)Completes the request using the given status code and the given body as UTF\-8\.

Completes the request using the given status code and the given body as UTF\-8\.

Definition Classes[RouteDirectives](RouteDirectives.html)
35. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(status:akka.http.javadsl.model.StatusCode,entity:akka.http.javadsl.model.RequestEntity):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(status: [StatusCode](../../model/StatusCode.html), entity: [RequestEntity](../../model/RequestEntity.html)): [RouteAdapter](RouteAdapter.html)Completes the request using the given status code and response entity.

Completes the request using the given status code and response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
36. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(status:akka.http.javadsl.model.StatusCode,entity:akka.http.javadsl.model.ResponseEntity):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(status: [StatusCode](../../model/StatusCode.html), entity: [ResponseEntity](../../model/ResponseEntity.html)): [RouteAdapter](RouteAdapter.html)Completes the request using the given status code and response entity.

Completes the request using the given status code and response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
37. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete[T](status:akka.http.javadsl.model.StatusCode,value:T,marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.RequestEntity]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete\[T](status: [StatusCode](../../model/StatusCode.html), value: T, marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [RequestEntity](../../model/RequestEntity.html)]): [RouteAdapter](RouteAdapter.html)Completes the request using the given status code, marshalling the given value as response entity.

Completes the request using the given status code, marshalling the given value as response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
38. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(status:akka.http.javadsl.model.StatusCode,headers:Iterable[akka.http.javadsl.model.HttpHeader],entity:akka.http.javadsl.model.RequestEntity):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(status: [StatusCode](../../model/StatusCode.html), headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](../../model/HttpHeader.html)], entity: [RequestEntity](../../model/RequestEntity.html)): [RouteAdapter](RouteAdapter.html)Completes the request using the given status code, headers, and response entity.

Completes the request using the given status code, headers, and response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
39. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(status:akka.http.javadsl.model.StatusCode,headers:Iterable[akka.http.javadsl.model.HttpHeader],entity:akka.http.javadsl.model.ResponseEntity):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete(status: [StatusCode](../../model/StatusCode.html), headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](../../model/HttpHeader.html)], entity: [ResponseEntity](../../model/ResponseEntity.html)): [RouteAdapter](RouteAdapter.html)Completes the request using the given status code, headers, and response entity.

Completes the request using the given status code, headers, and response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
40. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete[T](status:akka.http.javadsl.model.StatusCode,headers:Iterable[akka.http.javadsl.model.HttpHeader],value:T,marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.RequestEntity]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete\[T](status: [StatusCode](../../model/StatusCode.html), headers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](../../model/HttpHeader.html)], value: T, marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [RequestEntity](../../model/RequestEntity.html)]): [RouteAdapter](RouteAdapter.html)Completes the request using the given status code and headers, marshalling the given value as response entity.

Completes the request using the given status code and headers, marshalling the given value as response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
41. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete[T](value:T,marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.HttpResponse]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def complete\[T](value: T, marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [HttpResponse](../../model/HttpResponse.html)]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given value into an http response.

Completes the request by marshalling the given value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)
42. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(status:akka.http.javadsl.model.StatusCode):akka.http.javadsl.server.Route "Permalink")  def complete(status: [StatusCode](../../model/StatusCode.html)): [Route](../Route.html)Completes the request using the given status code.

Completes the request using the given status code.

Definition Classes[RouteDirectives](RouteDirectives.html)
43. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(response:akka.http.javadsl.model.HttpResponse):akka.http.javadsl.server.Route "Permalink")  def complete(response: [HttpResponse](../../model/HttpResponse.html)): [Route](../Route.html)Completes the request using the given http response.

Completes the request using the given http response.

Definition Classes[RouteDirectives](RouteDirectives.html)
44. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#complete(body:String):akka.http.javadsl.server.Route "Permalink")  def complete(body: String): [Route](../Route.html)Completes the request using an HTTP 200 OK status code and the given body as UTF\-8 entity.

Completes the request using an HTTP 200 OK status code and the given body as UTF\-8 entity.

Definition Classes[RouteDirectives](RouteDirectives.html)
45. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeOK[T](value:T,marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.RequestEntity]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeOK\[T](value: T, marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [RequestEntity](../../model/RequestEntity.html)]): [RouteAdapter](RouteAdapter.html)Completes the request as HTTP 200 OK, marshalling the given value as response entity.

Completes the request as HTTP 200 OK, marshalling the given value as response entity.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
46. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeOKWithFuture[T](value:java.util.concurrent.CompletionStage[T],marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.RequestEntity]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeOKWithFuture\[T](value: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T], marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [RequestEntity](../../model/RequestEntity.html)]): [RouteAdapter](RouteAdapter.html)Completes the request with an `OK` status code by marshalling the given value into an http response.

Completes the request with an `OK` status code by marshalling the given value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
47. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeOKWithFuture(value:java.util.concurrent.CompletionStage[akka.http.javadsl.model.RequestEntity]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeOKWithFuture(value: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RequestEntity](../../model/RequestEntity.html)]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given future value into an http response.

Completes the request by marshalling the given future value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
48. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeOKWithFuture[T](value:scala.concurrent.Future[T],marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.RequestEntity]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeOKWithFuture\[T](value: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [RequestEntity](../../model/RequestEntity.html)]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given value into an http response.

Completes the request by marshalling the given value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
49. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeOKWithFutureString(value:java.util.concurrent.CompletionStage[String]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeOKWithFutureString(value: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[String]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given future value into an http response.

Completes the request by marshalling the given future value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
50. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeOKWithFutureString(value:scala.concurrent.Future[String]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeOKWithFutureString(value: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[String]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given future value into an http response.

Completes the request by marshalling the given future value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
51. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeOrRecoverWith[T](f:java.util.function.Supplier[java.util.concurrent.CompletionStage[T]],marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.RequestEntity],inner:java.util.function.Function[Throwable,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def completeOrRecoverWith\[T](f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [RequestEntity](../../model/RequestEntity.html)], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Throwable, [Route](../Route.html)]): [Route](../Route.html)"Unwraps" a `CompletionStage<T>` and runs the inner route when the stage has failed
with the stage's failure exception as an extraction of type `Throwable`.

"Unwraps" a `CompletionStage<T>` and runs the inner route when the stage has failed
with the stage's failure exception as an extraction of type `Throwable`.
If the completion stage succeeds the request is completed using the values marshaller
(This directive therefore requires a marshaller for the completion stage value type to be
provided.)

Definition Classes[FutureDirectives](FutureDirectives.html)
52. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeWith[T](marshaller:akka.http.javadsl.marshalling.Marshaller[T,_<:akka.http.javadsl.model.HttpResponse],inner:java.util.function.Consumer[java.util.function.Consumer[T]]):akka.http.javadsl.server.Route "Permalink")  def completeWith\[T](marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, \_ \<: [HttpResponse](../../model/HttpResponse.html)], inner: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[[Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[T]]): [Route](../Route.html)Uses the marshaller for the given type to produce a completion function that is passed to its inner function.

Uses the marshaller for the given type to produce a completion function that is passed to its inner function.
You can use it do decouple marshaller resolution from request completion.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
53. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeWithFuture[T](value:java.util.concurrent.CompletionStage[T],marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.HttpResponse]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeWithFuture\[T](value: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T], marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [HttpResponse](../../model/HttpResponse.html)]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given value into an http response.

Completes the request by marshalling the given value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
54. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeWithFuture(value:java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeWithFuture(value: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](../../model/HttpResponse.html)]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given future value into an http response.

Completes the request by marshalling the given future value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
55. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeWithFuture[T](value:scala.concurrent.Future[T],marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.HttpResponse]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeWithFuture\[T](value: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [HttpResponse](../../model/HttpResponse.html)]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given value into an http response.

Completes the request by marshalling the given value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
56. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeWithFutureResponse(value:scala.concurrent.Future[akka.http.javadsl.model.HttpResponse]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def completeWithFutureResponse(value: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../../model/HttpResponse.html)]): [RouteAdapter](RouteAdapter.html)Completes the request by marshalling the given future value into an http response.

Completes the request by marshalling the given future value into an http response.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
57. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeWithFutureStatus(status:java.util.concurrent.CompletionStage[akka.http.javadsl.model.StatusCode]):akka.http.javadsl.server.Route "Permalink")  def completeWithFutureStatus(status: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[StatusCode](../../model/StatusCode.html)]): [Route](../Route.html)Completes the request using the given future status code.

Completes the request using the given future status code.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
58. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#completeWithFutureStatus(status:scala.concurrent.Future[akka.http.javadsl.model.StatusCode]):akka.http.javadsl.server.Route "Permalink")  def completeWithFutureStatus(status: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[StatusCode](../../model/StatusCode.html)]): [Route](../Route.html)Completes the request using the given future status code.

Completes the request using the given future status code.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
59. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#concat(first:akka.http.javadsl.server.Route,alternatives:akka.http.javadsl.server.Route*):akka.http.javadsl.server.Route "Permalink")  def concat(first: [Route](../Route.html), alternatives: [Route](../Route.html)\*): [Route](../Route.html)Used to chain multiple alternate routes using comma,
rather than having to explicitly call route1\.orElse(route2\).orElse(route3\).

Used to chain multiple alternate routes using comma,
rather than having to explicitly call route1\.orElse(route2\).orElse(route3\).

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@varargs()
60. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#conditional(eTag:java.util.Optional[akka.http.javadsl.model.headers.EntityTag],lastModified:java.util.Optional[akka.http.javadsl.model.DateTime],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def conditional(eTag: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[EntityTag](../../model/headers/EntityTag.html)], lastModified: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[DateTime](../../model/DateTime.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](CacheConditionDirectives.html)
61. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#conditional(eTag:akka.http.javadsl.model.headers.EntityTag,lastModified:akka.http.javadsl.model.DateTime,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def conditional(eTag: [EntityTag](../../model/headers/EntityTag.html), lastModified: [DateTime](../../model/DateTime.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](CacheConditionDirectives.html)
62. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#conditional(lastModified:akka.http.javadsl.model.DateTime,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def conditional(lastModified: [DateTime](../../model/DateTime.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](CacheConditionDirectives.html)
63. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#conditional(eTag:akka.http.javadsl.model.headers.EntityTag,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def conditional(eTag: [EntityTag](../../model/headers/EntityTag.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](CacheConditionDirectives.html)
64. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#cookie(name:String,inner:java.util.function.Function[akka.http.javadsl.model.headers.HttpCookiePair,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cookie(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpCookiePair](../../model/headers/HttpCookiePair.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the HttpCookiePair with the given name.

Extracts the HttpCookiePair with the given name. If the cookie is not present the
request is rejected with a respective [akka.http.javadsl.server.MissingCookieRejection](../MissingCookieRejection.html).

Definition Classes[CookieDirectives](CookieDirectives.html)
65. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#decodeRequest(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def decodeRequest(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Decompresses the incoming request if it is `gzip` or `deflate` compressed.

Decompresses the incoming request if it is `gzip` or `deflate` compressed.
Uncompressed requests are passed through untouched.
If the request encoded with another encoding the request is rejected with an `UnsupportedRequestEncodingRejection`.

Definition Classes[CodingDirectives](CodingDirectives.html)
66. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#decodeRequestWith(coders:Iterable[akka.http.javadsl.coding.Coder],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def decodeRequestWith(coders: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Coder](../../coding/Coder.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Decodes the incoming request if it is encoded with one of the given
encoders.

Decodes the incoming request if it is encoded with one of the given
encoders. If the request encoding doesn't match one of the given encoders
the request is rejected with an `UnsupportedRequestEncodingRejection`.
If no decoders are given the default encoders (`Gzip`, `Deflate`, `NoCoding`) are used.

Definition Classes[CodingDirectives](CodingDirectives.html)
67. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#decodeRequestWith(coder:akka.http.javadsl.coding.Coder,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def decodeRequestWith(coder: [Coder](../../coding/Coder.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Decodes the incoming request using the given Decoder.

Decodes the incoming request using the given Decoder.
If the request encoding doesn't match the request is rejected with an `UnsupportedRequestEncodingRejection`.

Definition Classes[CodingDirectives](CodingDirectives.html)
68. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#defaultContentTypeResolver:akka.http.javadsl.server.directives.ContentTypeResolver "Permalink")  def defaultContentTypeResolver: [ContentTypeResolver](ContentTypeResolver.html)Default [ContentTypeResolver](ContentTypeResolver.html).

Default [ContentTypeResolver](ContentTypeResolver.html).

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
69. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#defaultDirectoryRenderer:akka.http.javadsl.server.directives.DirectoryRenderer "Permalink")  def defaultDirectoryRenderer: [DirectoryRenderer](DirectoryRenderer.html)Default [DirectoryRenderer](DirectoryRenderer.html) to be used with directory listing directives.

Default [DirectoryRenderer](DirectoryRenderer.html) to be used with directory listing directives.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
70. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#delete(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def delete(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[MethodDirectives](MethodDirectives.html)
71. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#deleteCookie(name:String,domain:String,path:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(name: String, domain: String, path: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the cookie with the given properties.

Adds a Set\-Cookie response header expiring the cookie with the given properties.

nameName of the cookie to match

domainDomain of the cookie to match, or empty string to match any domain

pathPath of the cookie to match, or empty string to match any path

Definition Classes[CookieDirectives](CookieDirectives.html)
72. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#deleteCookie(name:String,domain:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(name: String, domain: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the cookie with the given properties.

Adds a Set\-Cookie response header expiring the cookie with the given properties.

nameName of the cookie to match

domainDomain of the cookie to match, or empty string to match any domain

Definition Classes[CookieDirectives](CookieDirectives.html)
73. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#deleteCookie(name:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(name: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the cookie with the given properties.

Adds a Set\-Cookie response header expiring the cookie with the given properties.

nameName of the cookie to match

Definition Classes[CookieDirectives](CookieDirectives.html)
74. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#deleteCookie(cookies:Iterable[akka.http.javadsl.model.headers.HttpCookie],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(cookies: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpCookie](../../model/headers/HttpCookie.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the given cookies.

Adds a Set\-Cookie response header expiring the given cookies.

Definition Classes[CookieDirectives](CookieDirectives.html)
75. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#deleteCookie(cookie:akka.http.javadsl.model.headers.HttpCookie,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(cookie: [HttpCookie](../../model/headers/HttpCookie.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the given cookie.

Adds a Set\-Cookie response header expiring the given cookie.

Definition Classes[CookieDirectives](CookieDirectives.html)
76. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#encodeResponse(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def encodeResponse(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header.

Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header. The response encoding is determined by the rules specified in
http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.

If the `Accept-Encoding` header is missing or empty or specifies an encoding other than
identity, gzip or deflate then no encoding is used.

Definition Classes[CodingDirectives](CodingDirectives.html)
77. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#encodeResponseWith(coders:Iterable[akka.http.javadsl.coding.Coder],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def encodeResponseWith(coders: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Coder](../../coding/Coder.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header.

Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header. The response encoding is determined by the rules specified in
http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.

If the `Accept-Encoding` header is missing then the response is encoded using the `first`
encoder.

If the `Accept-Encoding` header is empty and `NoCoding` is part of the encoders then no
response encoding is used. Otherwise the request is rejected.

If \[encoders] is empty, no encoding is performed.

Definition Classes[CodingDirectives](CodingDirectives.html)
78. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SecurityDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SecurityDirectivesImplicitThis member is added by an implicit conversion from SecurityDirectives toEnsuring\[SecurityDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
79. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SecurityDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SecurityDirectivesImplicitThis member is added by an implicit conversion from SecurityDirectives toEnsuring\[SecurityDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
80. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SecurityDirectivesImplicitThis member is added by an implicit conversion from SecurityDirectives toEnsuring\[SecurityDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
81. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SecurityDirectivesImplicitThis member is added by an implicit conversion from SecurityDirectives toEnsuring\[SecurityDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
82. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#entity[T](unmarshaller:akka.http.javadsl.unmarshalling.Unmarshaller[_>:akka.http.javadsl.model.HttpEntity,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def entity\[T](unmarshaller: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[\_ \>: [HttpEntity](../../model/HttpEntity.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Unmarshalls the requests entity using the given unmarshaller, and passes the result to \[inner].

Unmarshalls the requests entity using the given unmarshaller, and passes the result to \[inner].
If there is a problem with unmarshalling the request is rejected with the [akka.http.javadsl.server.Rejection](../Rejection.html)
produced by the unmarshaller.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
83. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
84. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
85. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extract[T](extract:java.util.function.Function[akka.http.javadsl.server.RequestContext,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extract\[T](extract: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Extracts a single value using the given function.

Extracts a single value using the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
86. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractActorSystem(inner:java.util.function.Function[akka.actor.ActorSystem,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractActorSystem(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), [Route](../Route.html)]): [Route](../Route.html)Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).

Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).
Otherwise throws an exception as it won't be able to extract the system from arbitrary materializers.

Definition Classes[BasicDirectives](BasicDirectives.html)
87. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractClientIP(inner:java.util.function.Function[akka.http.javadsl.model.RemoteAddress,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractClientIP(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RemoteAddress](../../model/RemoteAddress.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the client's IP from either the X\-Forwarded\-For, Remote\-Address, X\-Real\-IP header
or akka.http.javadsl.model.AttributeKeys.remoteAddress attribute
(in that order of priority).

Extracts the client's IP from either the X\-Forwarded\-For, Remote\-Address, X\-Real\-IP header
or akka.http.javadsl.model.AttributeKeys.remoteAddress attribute
(in that order of priority).

Definition Classes[MiscDirectives](MiscDirectives.html)
88. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractCredentials(inner:java.util.function.Function[java.util.Optional[akka.http.javadsl.model.headers.HttpCredentials],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractCredentials(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpCredentials](../../model/headers/HttpCredentials.html)], [Route](../Route.html)]): [Route](../Route.html)Extracts the potentially present HttpCredentials provided with the request's [akka.http.javadsl.model.headers.Authorization](../../model/headers/Authorization.html) header.
89. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractDataBytes(inner:java.util.function.Function[akka.stream.javadsl.Source[akka.util.ByteString,Any],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractDataBytes(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the entities `dataBytes` [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Extracts the entities `dataBytes` [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
90. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractEntity(inner:java.util.function.Function[akka.http.javadsl.model.RequestEntity,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractEntity(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestEntity](../../model/RequestEntity.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the current http request entity.

Extracts the current http request entity.

Definition Classes[BasicDirectives](BasicDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
91. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractExecutionContext(inner:java.util.function.Function[scala.concurrent.ExecutionContextExecutor,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractExecutionContext(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor), [Route](../Route.html)]): [Route](../Route.html)Extracts the ExecutionContextExecutor from the [RequestContext](../RequestContext.html).

Extracts the ExecutionContextExecutor from the [RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
92. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractHost(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractHost(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Extracts the hostname part of the Host request header value.

Extracts the hostname part of the Host request header value.

Definition Classes[HostDirectives](HostDirectives.html)
93. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractLog(inner:java.util.function.Function[akka.event.LoggingAdapter,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractLog(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), [Route](../Route.html)]): [Route](../Route.html)Extracts the LoggingAdapter

Extracts the LoggingAdapter

Definition Classes[BasicDirectives](BasicDirectives.html)
94. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractMatchedPath(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractMatchedPath(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the already matched path from the RequestContext.

Extracts the already matched path from the RequestContext.

Definition Classes[BasicDirectives](BasicDirectives.html)
95. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractMaterializer(inner:java.util.function.Function[akka.stream.Materializer,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractMaterializer(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer), [Route](../Route.html)]): [Route](../Route.html)Extracts the Materializer from the [RequestContext](../RequestContext.html).

Extracts the Materializer from the [RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
96. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractMethod(inner:java.util.function.Function[akka.http.javadsl.model.HttpMethod,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractMethod(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpMethod](../../model/HttpMethod.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Definition Classes[MethodDirectives](MethodDirectives.html)
97. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractParserSettings(inner:java.util.function.Function[akka.http.javadsl.settings.ParserSettings,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractParserSettings(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ParserSettings](../../settings/ParserSettings.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the [akka.http.javadsl.settings.ParserSettings](../../settings/ParserSettings.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Extracts the [akka.http.javadsl.settings.ParserSettings](../../settings/ParserSettings.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
98. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractRequest(inner:java.util.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractRequest(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the current HttpRequest instance.

Extracts the current HttpRequest instance.

Definition Classes[BasicDirectives](BasicDirectives.html)
99. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractRequestContext(inner:java.util.function.Function[akka.http.javadsl.server.RequestContext,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractRequestContext(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself.

Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself.

Definition Classes[BasicDirectives](BasicDirectives.html)
100. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractRequestEntity(inner:java.util.function.Function[akka.http.javadsl.model.RequestEntity,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractRequestEntity(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestEntity](../../model/RequestEntity.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the [akka.http.javadsl.model.RequestEntity](../../model/RequestEntity.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Extracts the [akka.http.javadsl.model.RequestEntity](../../model/RequestEntity.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
101. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractScheme(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractScheme(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Extracts the Uri scheme from the request.

Extracts the Uri scheme from the request.

Definition Classes[SchemeDirectives](SchemeDirectives.html)
102. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractSettings(inner:java.util.function.Function[akka.http.javadsl.settings.RoutingSettings,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractSettings(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RoutingSettings](../../settings/RoutingSettings.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the RoutingSettings from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Extracts the RoutingSettings from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
103. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long,inner:java.util.function.Function[akka.http.javadsl.model.HttpEntity.Strict,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Strict, [Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.javadsl.server.RequestContext](../RequestContext.html) into an
akka.http.javadsl.model.HttpEntity.Strict and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
104. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,inner:java.util.function.Function[akka.http.javadsl.model.HttpEntity.Strict,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Strict, [Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.javadsl.server.RequestContext](../RequestContext.html) into an
akka.http.javadsl.model.HttpEntity.Strict and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
105. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractUnmatchedPath(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractUnmatchedPath(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the yet unmatched path from the RequestContext.

Extracts the yet unmatched path from the RequestContext.

Definition Classes[BasicDirectives](BasicDirectives.html)
106. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#extractUri(inner:java.util.function.Function[akka.http.javadsl.model.Uri,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractUri(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Uri](../../model/Uri.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the complete request URI.

Extracts the complete request URI.

Definition Classes[BasicDirectives](BasicDirectives.html)
107. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#failWith(error:Throwable):akka.http.javadsl.server.Route "Permalink")  def failWith(error: Throwable): [Route](../Route.html)Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`
directive and its ExceptionHandler.

Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`
directive and its ExceptionHandler.

Definition Classes[RouteDirectives](RouteDirectives.html)
108. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#fileUpload(fieldName:String,inner:java.util.function.BiFunction[akka.http.javadsl.server.directives.FileInfo,akka.stream.javadsl.Source[akka.util.ByteString,Any],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def fileUpload(fieldName: String, inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[FileInfo](FileInfo.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], [Route](../Route.html)]): [Route](../Route.html)Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere.

Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere. If there is no such field the request will be rejected,
if there are multiple file parts with the same name, the first one will be used and the subsequent
ones ignored.

Definition Classes[FileUploadDirectives](FileUploadDirectives.html)
109. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#fileUploadAll(fieldName:String,inner:java.util.function.Function[java.util.List[java.util.Map.Entry[akka.http.javadsl.server.directives.FileInfo,akka.stream.javadsl.Source[akka.util.ByteString,Any]]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def fileUploadAll(fieldName: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Entry\[[FileInfo](FileInfo.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]], [Route](../Route.html)]): [Route](../Route.html)Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere.

Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere. If there is no such field the request will be rejected.
Files are buffered into temporary files on disk so in\-memory buffers don't overflow. The temporary
files are cleaned up once materialized, or on exit if the stream is not consumed.

Definition Classes[FileUploadDirectives](FileUploadDirectives.html)
110. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formField[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formField\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)
111. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formField(name:String,inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formField(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)
112. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formFieldList(inner:java.util.function.Function[java.util.List[java.util.Map.Entry[String,String]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldList(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Entry\[String, String]], [Route](../Route.html)]): [Route](../Route.html)Extracts HTTP form fields from the request as a `Map.Entry<String, String>>`.

Extracts HTTP form fields from the request as a `Map.Entry<String, String>>`.

Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
113. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formFieldList[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[java.util.List[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldList\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
114. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formFieldList(name:String,inner:java.util.function.Function[java.util.List[String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldList(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[String], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
115. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formFieldMap(inner:java.util.function.Function[java.util.Map[String,String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldMap(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String], [Route](../Route.html)]): [Route](../Route.html)Extracts HTTP form fields from the request as a `Map<String, String>`.

Extracts HTTP form fields from the request as a `Map<String, String>`.

Definition Classes[FormFieldDirectives](FormFieldDirectives.html)
116. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formFieldMultiMap(inner:java.util.function.Function[java.util.Map[String,java.util.List[String]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldMultiMap(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[String]], [Route](../Route.html)]): [Route](../Route.html)Extracts HTTP form fields from the request as a `Map<String, List<String>>`.

Extracts HTTP form fields from the request as a `Map<String, List<String>>`.

Definition Classes[FormFieldDirectives](FormFieldDirectives.html)
117. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formFieldOptional[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldOptional\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
118. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formFieldOptional(name:String,inner:java.util.function.Function[java.util.Optional[String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldOptional(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
119. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#get(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def get(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[MethodDirectives](MethodDirectives.html)
120. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
121. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromBrowseableDirectories(directories:String*):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: String\*): [Route](../Route.html)Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)Annotations@varargs()
122. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromBrowseableDirectories(directories:Iterable[String],resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
123. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromBrowseableDirectories(directories:Iterable[String],renderer:akka.http.javadsl.server.directives.DirectoryRenderer):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], renderer: [DirectoryRenderer](DirectoryRenderer.html)): [Route](../Route.html)Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
124. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromBrowseableDirectories(directories:Iterable[String],renderer:akka.http.javadsl.server.directives.DirectoryRenderer,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], renderer: [DirectoryRenderer](DirectoryRenderer.html), resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
125. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromBrowseableDirectory(directory:String):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String): [Route](../Route.html)Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
126. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromBrowseableDirectory(directory:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
127. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromBrowseableDirectory(directory:String,renderer:akka.http.javadsl.server.directives.DirectoryRenderer):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String, renderer: [DirectoryRenderer](DirectoryRenderer.html)): [Route](../Route.html)Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
128. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromBrowseableDirectory(directory:String,renderer:akka.http.javadsl.server.directives.DirectoryRenderer,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String, renderer: [DirectoryRenderer](DirectoryRenderer.html), resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
129. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromDirectory(directoryPath:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromDirectory(directoryPath: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Completes GET requests with the content of a file underneath the given directory, using the given content\-type resolver.

Completes GET requests with the content of a file underneath the given directory, using the given content\-type resolver.
If the file cannot be read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
130. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromDirectory(directoryPath:String):akka.http.javadsl.server.Route "Permalink")  def getFromDirectory(directoryPath: String): [Route](../Route.html)Completes GET requests with the content of a file underneath the given directory, using the default content\-type resolver.

Completes GET requests with the content of a file underneath the given directory, using the default content\-type resolver.
If the file cannot be read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
131. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromFile(file:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Completes GET requests with the content of the given file, resolving the content type using the given resolver.

Completes GET requests with the content of the given file, resolving the content type using the given resolver.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
132. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromFile(file:String):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: String): [Route](../Route.html)Completes GET requests with the content of the given file, resolving the content type using the default resolver.

Completes GET requests with the content of the given file, resolving the content type using the default resolver.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
133. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromFile(file:java.io.File,contentType:akka.http.javadsl.model.ContentType):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), contentType: [ContentType](../../model/ContentType.html)): [Route](../Route.html)Completes GET requests with the content of the given file, using the content type.

Completes GET requests with the content of the given file, using the content type.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
134. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromFile(file:java.io.File,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Completes GET requests with the content of the given file, resolving the content type using the given resolver.

Completes GET requests with the content of the given file, resolving the content type using the given resolver.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
135. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromFile(file:java.io.File):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): [Route](../Route.html)Completes GET requests with the content of the given file, resolving the content type using the default resolver.

Completes GET requests with the content of the given file, resolving the content type using the default resolver.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
136. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromResource(path:String,contentType:akka.http.javadsl.model.ContentType,classLoader:ClassLoader):akka.http.javadsl.server.Route "Permalink")  def getFromResource(path: String, contentType: [ContentType](../../model/ContentType.html), classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)): [Route](../Route.html)Completes GET requests with the content of the given resource loaded from the given ClassLoader,
with the given content type.

Completes GET requests with the content of the given resource loaded from the given ClassLoader,
with the given content type.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
137. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromResource(path:String,contentType:akka.http.javadsl.model.ContentType):akka.http.javadsl.server.Route "Permalink")  def getFromResource(path: String, contentType: [ContentType](../../model/ContentType.html)): [Route](../Route.html)Completes GET requests with the content of the given resource loaded from the default ClassLoader,
with the given content type.

Completes GET requests with the content of the given resource loaded from the default ClassLoader,
with the given content type.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
138. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromResource(path:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromResource(path: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Completes GET requests with the content of the given resource loaded from the default ClassLoader,
using the given content type resolver.

Completes GET requests with the content of the given resource loaded from the default ClassLoader,
using the given content type resolver.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
139. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromResource(path:String):akka.http.javadsl.server.Route "Permalink")  def getFromResource(path: String): [Route](../Route.html)Completes GET requests with the content of the given resource loaded from the default ClassLoader,
using the default content type resolver.

Completes GET requests with the content of the given resource loaded from the default ClassLoader,
using the default content type resolver.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
140. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromResourceDirectory(directoryName:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver,classLoader:ClassLoader):akka.http.javadsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String, resolver: [ContentTypeResolver](ContentTypeResolver.html), classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)): [Route](../Route.html)Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the given ClassLoader, resolving content type using the given content type
resolver.

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the given ClassLoader, resolving content type using the given content type
resolver.

If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
141. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromResourceDirectory(directoryName:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the default ClassLoader, resolving content type using the given content type
resolver.

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the default ClassLoader, resolving content type using the given content type
resolver.

If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
142. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromResourceDirectory(directoryName:String,classLoader:ClassLoader):akka.http.javadsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String, classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)): [Route](../Route.html)Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the given ClassLoader, resolving content type using the default content type
resolver.

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the given ClassLoader, resolving content type using the default content type
resolver.

If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
143. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#getFromResourceDirectory(directoryName:String):akka.http.javadsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String): [Route](../Route.html)Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the default ClassLoader, resolving content type using the default content type
resolver.

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the default ClassLoader, resolving content type using the default content type
resolver.

If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
144. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#handle(handler:akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]]):akka.http.javadsl.server.Route "Permalink")  def handle(handler: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](../../model/HttpResponse.html)]]): [Route](../Route.html)Handle the request using a function.

Handle the request using a function.

Definition Classes[RouteDirectives](RouteDirectives.html)
145. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#handleExceptions(handler:akka.http.javadsl.server.ExceptionHandler,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def handleExceptions(handler: [ExceptionHandler](../ExceptionHandler.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Transforms exceptions thrown during evaluation of its inner route using the given
[akka.http.javadsl.server.ExceptionHandler](../ExceptionHandler.html).

Transforms exceptions thrown during evaluation of its inner route using the given
[akka.http.javadsl.server.ExceptionHandler](../ExceptionHandler.html).

Definition Classes[ExecutionDirectives](ExecutionDirectives.html)
146. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#handleRejections(handler:akka.http.javadsl.server.RejectionHandler,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def handleRejections(handler: [RejectionHandler](../RejectionHandler.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Transforms rejections produced by its inner route using the given
[akka.http.scaladsl.server.RejectionHandler](../../../scaladsl/server/RejectionHandler.html).

Transforms rejections produced by its inner route using the given
[akka.http.scaladsl.server.RejectionHandler](../../../scaladsl/server/RejectionHandler.html).

Definition Classes[ExecutionDirectives](ExecutionDirectives.html)
147. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#handleSync(handler:akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse]):akka.http.javadsl.server.Route "Permalink")  def handleSync(handler: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html)]): [Route](../Route.html)Handle the request using a function.

Handle the request using a function.

Definition Classes[RouteDirectives](RouteDirectives.html)
148. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#handleWith[T,R](unmarshaller:akka.http.javadsl.unmarshalling.Unmarshaller[_>:akka.http.javadsl.model.HttpEntity,T],marshaller:akka.http.javadsl.marshalling.Marshaller[R,_<:akka.http.javadsl.model.HttpResponse],inner:java.util.function.Function[T,R]):akka.http.javadsl.server.Route "Permalink")  def handleWith\[T, R](unmarshaller: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[\_ \>: [HttpEntity](../../model/HttpEntity.html), T], marshaller: [Marshaller](../../marshalling/Marshaller.html)\[R, \_ \<: [HttpResponse](../../model/HttpResponse.html)], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, R]): [Route](../Route.html)Completes the request using the given function.

Completes the request using the given function. The input to the function is produced with the in\-scope
entity unmarshaller and the result value of the function is marshalled with the in\-scope marshaller.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
149. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
150. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#head(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def head(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[MethodDirectives](MethodDirectives.html)
151. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#headerValue[T](f:java.util.function.Function[akka.http.javadsl.model.HttpHeader,java.util.Optional[T]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def headerValue\[T](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpHeader](../../model/HttpHeader.html), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts an HTTP header value using the given function.

Extracts an HTTP header value using the given function. If the function result is undefined for all headers the
request is rejected with an empty rejection set. If the given function throws an exception the request is rejected
with a [akka.http.javadsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
152. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#headerValueByName(headerName:String,inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def headerValueByName(headerName: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the value of the first HTTP request header with the given name.

Extracts the value of the first HTTP request header with the given name.
If no header with a matching name is found the request is rejected with a [akka.http.javadsl.server.MissingHeaderRejection](../MissingHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
153. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#headerValueByType[T<:akka.http.javadsl.model.HttpHeader](t:Class[T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def headerValueByType\[T \<: [HttpHeader](../../model/HttpHeader.html)](t: Class\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the first HTTP request header of the given type.

Extracts the first HTTP request header of the given type.
If no header with a matching type is found the request is rejected with a [akka.http.javadsl.server.MissingHeaderRejection](../MissingHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
154. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#headerValuePF[T](pf:PartialFunction[akka.http.javadsl.model.HttpHeader,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def headerValuePF\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpHeader](../../model/HttpHeader.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts an HTTP header value using the given partial function.

Extracts an HTTP header value using the given partial function. If the function is undefined for all headers the
request is rejected with an empty rejection set.

Definition Classes[HeaderDirectives](HeaderDirectives.html)
155. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#host(regex:java.util.regex.Pattern,inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def host(regex: [Pattern](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#java.util.regex.Pattern), inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Rejects all requests with a host name that doesn't have a prefix matching the given regular expression.

Rejects all requests with a host name that doesn't have a prefix matching the given regular expression.
For all matching requests the prefix string matching the regex is extracted and passed to the inner route.
If the regex contains a capturing group only the string matched by this group is extracted.
If the regex contains more than one capturing group an IllegalArgumentException is thrown.

Definition Classes[HostDirectives](HostDirectives.html)
156. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#host(predicate:java.util.function.Predicate[String],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def host(predicate: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[String], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects all requests for whose host name the given predicate function returns false.

Rejects all requests for whose host name the given predicate function returns false.

Definition Classes[HostDirectives](HostDirectives.html)
157. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#host(hostName:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def host(hostName: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects all requests with a host name different from the given one.

Rejects all requests with a host name different from the given one.

Definition Classes[HostDirectives](HostDirectives.html)
158. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#host(hostNames:Iterable[String],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def host(hostNames: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects all requests with a host name different from the given ones.

Rejects all requests with a host name different from the given ones.

Definition Classes[HostDirectives](HostDirectives.html)
159. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#ignoreTrailingSlash(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def ignoreTrailingSlash(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Tries to match the inner route and if it fails with an empty rejection, it tries it again
adding (or removing) the trailing slash on the given path.

Tries to match the inner route and if it fails with an empty rejection, it tries it again
adding (or removing) the trailing slash on the given path.

Definition Classes[PathDirectives](PathDirectives.html)
160. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
161. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#listDirectoryContents(directoryRenderer:akka.http.javadsl.server.directives.DirectoryRenderer,directories:String*):akka.http.javadsl.server.Route "Permalink")  def listDirectoryContents(directoryRenderer: [DirectoryRenderer](DirectoryRenderer.html), directories: String\*): [Route](../Route.html)Completes GET requests with a unified listing of the contents of all given directories.

Completes GET requests with a unified listing of the contents of all given directories.
The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)Annotations@varargs()
162. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#listDirectoryContents(directories:String*):akka.http.javadsl.server.Route "Permalink")  def listDirectoryContents(directories: String\*): [Route](../Route.html)Completes GET requests with a unified listing of the contents of all given directories.

Completes GET requests with a unified listing of the contents of all given directories.
The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)Annotations@varargs()
163. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#logRequest(show:java.util.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.server.directives.LogEntry],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logRequest(show: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [LogEntry](LogEntry.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every incoming request.

Produces a log entry for every incoming request.

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
164. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#logRequest(marker:String,level:akka.event.Logging.LogLevel,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logRequest(marker: String, level: LogLevel, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every incoming request.

Produces a log entry for every incoming request.

levelOne of the log levels defined in akka.event.Logging

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
165. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#logRequest(marker:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logRequest(marker: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every incoming request.

Produces a log entry for every incoming request.

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
166. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#logRequestResult(showSuccess:java.util.function.BiFunction[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,akka.http.javadsl.server.directives.LogEntry],showRejection:java.util.function.BiFunction[akka.http.javadsl.model.HttpRequest,java.util.List[akka.http.javadsl.server.Rejection],akka.http.javadsl.server.directives.LogEntry],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def logRequestResult(showSuccess: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html), [LogEntry](LogEntry.html)], showRejection: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[HttpRequest](../../model/HttpRequest.html), [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [LogEntry](LogEntry.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Produces a log entry for every request/response combination.

Produces a log entry for every request/response combination.

showSuccessFunction invoked when the route result was successful and yielded an HTTP response

showRejectionFunction invoked when the route yielded a rejection

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
167. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#logRequestResultOptional(showSuccess:java.util.function.BiFunction[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.Optional[akka.http.javadsl.server.directives.LogEntry]],showRejection:java.util.function.BiFunction[akka.http.javadsl.model.HttpRequest,java.util.List[akka.http.javadsl.server.Rejection],java.util.Optional[akka.http.javadsl.server.directives.LogEntry]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def logRequestResultOptional(showSuccess: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[LogEntry](LogEntry.html)]], showRejection: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[HttpRequest](../../model/HttpRequest.html), [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[LogEntry](LogEntry.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Optionally produces a log entry for every request/response combination.

Optionally produces a log entry for every request/response combination.

showSuccessFunction invoked when the route result was successful and yielded an HTTP response

showRejectionFunction invoked when the route yielded a rejection

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
168. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#logResult(showSuccess:java.util.function.Function[akka.http.javadsl.model.HttpResponse,akka.http.javadsl.server.directives.LogEntry],showRejection:java.util.function.Function[java.util.List[akka.http.javadsl.server.Rejection],akka.http.javadsl.server.directives.LogEntry],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def logResult(showSuccess: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpResponse](../../model/HttpResponse.html), [LogEntry](LogEntry.html)], showRejection: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [LogEntry](LogEntry.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Produces a log entry for every route result.

Produces a log entry for every route result.

showSuccessFunction invoked when the route result was successful and yielded an HTTP response

showRejectionFunction invoked when the route yielded a rejection

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
169. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#logResult(marker:String,level:akka.event.Logging.LogLevel,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logResult(marker: String, level: LogLevel, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every route result.

Produces a log entry for every route result.

levelOne of the log levels defined in akka.event.Logging

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
170. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#logResult(marker:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logResult(marker: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every route result.

Produces a log entry for every route result.

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
171. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapInnerRoute(f:java.util.function.Function[akka.http.javadsl.server.Route,akka.http.javadsl.server.Route],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapInnerRoute(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Route](../Route.html), [Route](../Route.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
172. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapRejections(f:java.util.function.Function[java.util.List[akka.http.javadsl.server.Rejection],java.util.List[akka.http.javadsl.server.Rejection]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRejections(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
173. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapRequest(f:java.util.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpRequest],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRequest(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [HttpRequest](../../model/HttpRequest.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
174. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapRequestContext(f:java.util.function.Function[akka.http.javadsl.server.RequestContext,akka.http.javadsl.server.RequestContext],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRequestContext(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), [RequestContext](../RequestContext.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
175. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapResponse(f:java.util.function.Function[akka.http.javadsl.model.HttpResponse,akka.http.javadsl.model.HttpResponse],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponse(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpResponse](../../model/HttpResponse.html), [HttpResponse](../../model/HttpResponse.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
176. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapResponseEntity(f:java.util.function.Function[akka.http.javadsl.model.ResponseEntity,akka.http.javadsl.model.ResponseEntity],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponseEntity(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ResponseEntity](../../model/ResponseEntity.html), [ResponseEntity](../../model/ResponseEntity.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
177. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapResponseHeaders(f:java.util.function.Function[java.util.List[akka.http.javadsl.model.HttpHeader],java.util.List[akka.http.javadsl.model.HttpHeader]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponseHeaders(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[HttpHeader](../../model/HttpHeader.html)], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[HttpHeader](../../model/HttpHeader.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
178. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapRouteResult(f:java.util.function.Function[akka.http.javadsl.server.RouteResult,akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResult(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RouteResult](../RouteResult.html), [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
179. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapRouteResultFuture(f:java.util.function.Function[java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult],java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultFuture(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
180. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapRouteResultPF(f:PartialFunction[akka.http.javadsl.server.RouteResult,akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](../RouteResult.html), [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
181. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapRouteResultWith(f:java.util.function.Function[akka.http.javadsl.server.RouteResult,java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultWith(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RouteResult](../RouteResult.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
182. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapRouteResultWithPF(f:PartialFunction[akka.http.javadsl.server.RouteResult,java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultWithPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](../RouteResult.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
183. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapSettings(f:java.util.function.Function[akka.http.javadsl.settings.RoutingSettings,akka.http.javadsl.settings.RoutingSettings],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapSettings(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RoutingSettings](../../settings/RoutingSettings.html), [RoutingSettings](../../settings/RoutingSettings.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs the inner route with settings mapped by the given function.

Runs the inner route with settings mapped by the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
184. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#mapUnmatchedPath(f:java.util.function.Function[String,String],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapUnmatchedPath(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, String], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Transforms the unmatchedPath of the RequestContext using the given function.

Transforms the unmatchedPath of the RequestContext using the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
185. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#method(method:akka.http.javadsl.model.HttpMethod,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def method(method: [HttpMethod](../../model/HttpMethod.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[MethodDirectives](MethodDirectives.html)
186. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
187. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
188. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
189. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#onComplete[T](cs:java.util.concurrent.CompletionStage[T],inner:java.util.function.Function[scala.util.Try[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onComplete\[T](cs: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage<T>` and runs the inner route after future
completion with the future's value as an extraction of type `Try<T>`.

"Unwraps" a `CompletionStage<T>` and runs the inner route after future
completion with the future's value as an extraction of type `Try<T>`.

Definition Classes[FutureDirectives](FutureDirectives.html)
190. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#onComplete[T](f:java.util.function.Supplier[java.util.concurrent.CompletionStage[T]],inner:java.util.function.Function[scala.util.Try[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onComplete\[T](f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage<T>` and runs the inner route after future
completion with the future's value as an extraction of type `Try<T>`.

"Unwraps" a `CompletionStage<T>` and runs the inner route after future
completion with the future's value as an extraction of type `Try<T>`.

Definition Classes[FutureDirectives](FutureDirectives.html)
191. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#onCompleteWithBreaker[T](breaker:akka.pattern.CircuitBreaker,f:java.util.function.Supplier[java.util.concurrent.CompletionStage[T]],inner:java.util.function.Function[scala.util.Try[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onCompleteWithBreaker\[T](breaker: [CircuitBreaker](https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreaker.html#akka.pattern.CircuitBreaker), f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage[T]` and runs the inner route after future
completion with the future's value as an extraction of type `T` if
the supplied `CircuitBreaker` is closed.

"Unwraps" a `CompletionStage[T]` and runs the inner route after future
completion with the future's value as an extraction of type `T` if
the supplied `CircuitBreaker` is closed.

If the supplied CircuitBreaker is open the request is rejected
with a [akka.http.javadsl.server.CircuitBreakerOpenRejection](../CircuitBreakerOpenRejection.html).

Definition Classes[FutureDirectives](FutureDirectives.html)
192. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#onSuccess[T](cs:java.util.concurrent.CompletionStage[T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onSuccess\[T](cs: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage<T>` and runs the inner route after stage
completion with the stage's value as an extraction of type `T`.

"Unwraps" a `CompletionStage<T>` and runs the inner route after stage
completion with the stage's value as an extraction of type `T`.
If the stage fails its failure Throwable is bubbled up to the nearest
ExceptionHandler.

Definition Classes[FutureDirectives](FutureDirectives.html)
193. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#onSuccess[T](f:java.util.function.Supplier[java.util.concurrent.CompletionStage[T]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onSuccess\[T](f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage<T>` and runs the inner route after stage
completion with the stage's value as an extraction of type `T`.

"Unwraps" a `CompletionStage<T>` and runs the inner route after stage
completion with the stage's value as an extraction of type `T`.
If the stage fails its failure Throwable is bubbled up to the nearest
ExceptionHandler.

Definition Classes[FutureDirectives](FutureDirectives.html)
194. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#optionalAttribute[T](key:akka.http.javadsl.model.AttributeKey[T],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalAttribute\[T](key: [AttributeKey](../../model/AttributeKey.html)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the value of the optional request attribute with the given key.

Extracts the value of the optional request attribute with the given key.

Definition Classes[AttributeDirectives](AttributeDirectives.html)
195. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#optionalCookie(name:String,inner:java.util.function.Function[java.util.Optional[akka.http.javadsl.model.headers.HttpCookiePair],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def optionalCookie(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpCookiePair](../../model/headers/HttpCookiePair.html)], [Route](../Route.html)]): [Route](../Route.html)Extracts the HttpCookiePair with the given name as an `Option[HttpCookiePair]`.

Extracts the HttpCookiePair with the given name as an `Option[HttpCookiePair]`.
If the cookie is not present a value of `None` is extracted.

Definition Classes[CookieDirectives](CookieDirectives.html)
196. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#optionalHeaderValue[T](f:java.util.function.Function[akka.http.javadsl.model.HttpHeader,java.util.Optional[T]],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalHeaderValue\[T](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpHeader](../../model/HttpHeader.html), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts an optional HTTP header value using the given function.

Extracts an optional HTTP header value using the given function.
If the given function throws an exception the request is rejected
with a [akka.http.javadsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
197. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#optionalHeaderValueByName(headerName:String,inner:java.util.function.Function[java.util.Optional[String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalHeaderValueByName(headerName: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the value of the optional HTTP request header with the given name.

Extracts the value of the optional HTTP request header with the given name.

Definition Classes[HeaderDirectives](HeaderDirectives.html)
198. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#optionalHeaderValueByType[T<:akka.http.javadsl.model.HttpHeader](t:Class[T],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalHeaderValueByType\[T \<: [HttpHeader](../../model/HttpHeader.html)](t: Class\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)FIXME: WARNING: Custom headers don't work yet with this directive!

FIXME: WARNING: Custom headers don't work yet with this directive!

Extract the header value of the optional HTTP request header with the given type.

Definition Classes[HeaderDirectives](HeaderDirectives.html)
199. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#optionalHeaderValuePF[T](pf:PartialFunction[akka.http.javadsl.model.HttpHeader,T],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalHeaderValuePF\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpHeader](../../model/HttpHeader.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts an optional HTTP header value using the given partial function.

Extracts an optional HTTP header value using the given partial function.
If the given function throws an exception the request is rejected
with a [akka.http.javadsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
200. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#options(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def options(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[MethodDirectives](MethodDirectives.html)
201. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#overrideMethodWithParameter(paramName:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def overrideMethodWithParameter(paramName: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Changes the HTTP method of the request to the value of the specified query string parameter.

Changes the HTTP method of the request to the value of the specified query string parameter. If the query string
parameter is not specified this directive has no effect. If the query string is specified as something that is not
a HTTP method, then this directive completes the request with a `501 Not Implemented` response.

This directive is useful for:

	- Use in combination with JSONP (JSONP only supports GET)
	- Supporting older browsers that lack support for certain HTTP methods. E.g. IE8 does not support PATCHDefinition Classes[MethodDirectives](MethodDirectives.html)
202. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameter[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameter\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)
203. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameter(name:String,inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameter(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)
204. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterList(inner:java.util.function.Function[java.util.List[java.util.Map.Entry[String,String]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterList(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Entry\[String, String]], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
205. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterList[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[java.util.List[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterList\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
206. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterList(name:String,inner:java.util.function.Function[java.util.List[String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterList(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[String], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
207. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterMap(inner:java.util.function.Function[java.util.Map[String,String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterMap(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)
208. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterMultiMap(inner:java.util.function.Function[java.util.Map[String,java.util.List[String]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterMultiMap(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[String]], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)
209. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterOptional[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterOptional\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
210. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterOptional(name:String,inner:java.util.function.Function[java.util.Optional[String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterOptional(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
211. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterOrDefault[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],defaultValue:T,name:String,inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterOrDefault\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], defaultValue: T, name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
212. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#parameterRequiredValue[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],requiredValue:T,name:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def parameterRequiredValue\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], requiredValue: T, name: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[ParameterDirectives](ParameterDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
213. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pass(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pass(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Always passes the request on to its inner route
(i.e.

Always passes the request on to its inner route
(i.e. does nothing with the request or the response).

Definition Classes[BasicDirectives](BasicDirectives.html)
214. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#patch(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def patch(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[MethodDirectives](MethodDirectives.html)
215. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#path[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def path\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Consumes a leading slash and extracts the next path segment, unmarshalling it and passing the result to the inner function,
expecting the full path to have been consumed then.

Consumes a leading slash and extracts the next path segment, unmarshalling it and passing the result to the inner function,
expecting the full path to have been consumed then.

Definition Classes[PathDirectives](PathDirectives.html)
216. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#path[T1,T2](p:akka.http.javadsl.server.PathMatcher2[T1,T2],inner:java.util.function.BiFunction[T1,T2,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def path\[T1, T2](p: [PathMatcher2](../PathMatcher2.html)\[T1, T2], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[T1, T2, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
217. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#path[T](p:akka.http.javadsl.server.PathMatcher1[T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def path\[T](p: [PathMatcher1](../PathMatcher1.html)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
218. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#path(p:akka.http.javadsl.server.PathMatcher0,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def path(p: [PathMatcher0](../PathMatcher0.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Applies the given [PathMatcher0](../PathMatcher0.html) to the remaining unmatched path after consuming a leading slash.

Applies the given [PathMatcher0](../PathMatcher0.html) to the remaining unmatched path after consuming a leading slash.
The matcher has to match the remaining path completely.
If matched the value extracted by the [PathMatcher0](../PathMatcher0.html) is extracted on the directive level.

Definition Classes[PathDirectives](PathDirectives.html)
219. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#path(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def path(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
220. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#path(segment:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def path(segment: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Matches a prefix to the remaining unmatched path after consuming a leading slash.

Matches a prefix to the remaining unmatched path after consuming a leading slash.
The matcher has to match the remaining path completely.
If matched the value matching the prefix is extracted on the directive level.

Definition Classes[PathDirectives](PathDirectives.html)
221. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathEnd(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathEnd(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects the request if the unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html) is non\-empty,
or said differently: only passes on the request to its inner route if the request path
has been matched completely.

Rejects the request if the unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html) is non\-empty,
or said differently: only passes on the request to its inner route if the request path
has been matched completely.

Definition Classes[PathDirectives](PathDirectives.html)
222. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathEndOrSingleSlash(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathEndOrSingleSlash(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Only passes on the request to its inner route if the request path has been matched
completely or only consists of exactly one remaining slash.

Only passes on the request to its inner route if the request path has been matched
completely or only consists of exactly one remaining slash.

Note that trailing slash and non\-trailing slash URLs are **not** the same, although they often serve
the same content. It is recommended to serve only one URL version and make the other redirect to it using
[\#redirectToTrailingSlashIfMissing](#redirectToTrailingSlashIfMissing(redirectionType:akka.http.javadsl.model.StatusCode,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route) or [\#redirectToNoTrailingSlashIfPresent](#redirectToNoTrailingSlashIfPresent(redirectionType:akka.http.javadsl.model.StatusCode,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route) directive.

For example:

```
def route = {
  // redirect '/users/' to '/users', '/users/:userId/' to '/users/:userId'
  redirectToNoTrailingSlashIfPresent(Found) {
    pathPrefix("users") {
      concat(
        pathEnd {
          // user list ...
        },
        path(UUID) { userId =>
          // user profile ...
        }
      )
    }
  }
}
```
For further information, refer to: http://googlewebmastercentral.blogspot.de/2010/04/to\-slash\-or\-not\-to\-slash.html

Definition Classes[PathDirectives](PathDirectives.html)
223. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefix[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefix\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Consumes a leading slash and extracts the next path segment, unmarshalling it and passing the result to the inner function.

Consumes a leading slash and extracts the next path segment, unmarshalling it and passing the result to the inner function.

Definition Classes[PathDirectives](PathDirectives.html)
224. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefix[T1,T2](p:akka.http.javadsl.server.PathMatcher2[T1,T2],inner:java.util.function.BiFunction[T1,T2,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefix\[T1, T2](p: [PathMatcher2](../PathMatcher2.html)\[T1, T2], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[T1, T2, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
225. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefix[T](p:akka.http.javadsl.server.PathMatcher1[T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefix\[T](p: [PathMatcher1](../PathMatcher1.html)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
226. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefix(p:akka.http.javadsl.server.PathMatcher0,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefix(p: [PathMatcher0](../PathMatcher0.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Applies the given [PathMatcher0](../PathMatcher0.html) to the remaining unmatched path after consuming a leading slash.

Applies the given [PathMatcher0](../PathMatcher0.html) to the remaining unmatched path after consuming a leading slash.
The matcher has to match a prefix of the remaining path.
If matched the value extracted by the PathMatcher is extracted on the directive level.

Definition Classes[PathDirectives](PathDirectives.html)
227. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefix(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefix(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
228. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefix(segment:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefix(segment: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Matches a prefix to the remaining unmatched path after consuming a leading slash.

Matches a prefix to the remaining unmatched path after consuming a leading slash.
The matcher has to match a prefix of the remaining path.
If matched the value matching the prefix is extracted on the directive level.

Definition Classes[PathDirectives](PathDirectives.html)
229. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefixTest[T1,T2](pm:akka.http.javadsl.server.PathMatcher2[T1,T2],inner:java.util.function.BiFunction[T1,T2,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefixTest\[T1, T2](pm: [PathMatcher2](../PathMatcher2.html)\[T1, T2], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[T1, T2, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
230. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefixTest[T1](pm:akka.http.javadsl.server.PathMatcher1[T1],inner:java.util.function.Function[T1,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefixTest\[T1](pm: [PathMatcher1](../PathMatcher1.html)\[T1], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T1, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
231. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefixTest(pm:akka.http.javadsl.server.PathMatcher0,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefixTest(pm: [PathMatcher0](../PathMatcher0.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
232. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathPrefixTest(segment:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathPrefixTest(segment: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Checks whether the unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html) has a prefix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html) has a prefix matched by the
given PathMatcher. In analogy to the `pathPrefix` directive a leading slash is implied.

Definition Classes[PathDirectives](PathDirectives.html)
233. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSingleSlash(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSingleSlash(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Only passes on the request to its inner route if the request path
consists of exactly one remaining slash.

Only passes on the request to its inner route if the request path
consists of exactly one remaining slash.

Definition Classes[PathDirectives](PathDirectives.html)
234. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSuffix[T1,T2](pm:akka.http.javadsl.server.PathMatcher2[T1,T2],inner:java.util.function.BiFunction[T1,T2,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSuffix\[T1, T2](pm: [PathMatcher2](../PathMatcher2.html)\[T1, T2], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[T1, T2, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
235. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSuffix[T1](pm:akka.http.javadsl.server.PathMatcher1[T1],inner:java.util.function.Function[T1,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSuffix\[T1](pm: [PathMatcher1](../PathMatcher1.html)\[T1], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T1, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
236. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSuffix(pm:akka.http.javadsl.server.PathMatcher0,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSuffix(pm: [PathMatcher0](../PathMatcher0.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
237. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSuffix(segment:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSuffix(segment: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Applies the given [akka.http.scaladsl.server.PathMatcher](../../../scaladsl/server/PathMatcher.html) to a suffix of the remaining unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Applies the given [akka.http.scaladsl.server.PathMatcher](../../../scaladsl/server/PathMatcher.html) to a suffix of the remaining unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html).
If matched the value extracted by the [akka.http.javadsl.server.PathMatcher0](../PathMatcher0.html) is extracted and the matched parts of the path are consumed.
Note that, for efficiency reasons, the given [akka.http.javadsl.server.PathMatcher0](../PathMatcher0.html) must match the desired suffix in reversed\-segment
order, i.e. `pathSuffix("baz" / "bar")` would match `/foo/bar/baz`!

Definition Classes[PathDirectives](PathDirectives.html)
238. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSuffixTest[T1,T2](pm:akka.http.javadsl.server.PathMatcher2[T1,T2],inner:java.util.function.BiFunction[T1,T2,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSuffixTest\[T1, T2](pm: [PathMatcher2](../PathMatcher2.html)\[T1, T2], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[T1, T2, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
239. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSuffixTest[T1](pm:akka.http.javadsl.server.PathMatcher1[T1],inner:java.util.function.Function[T1,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSuffixTest\[T1](pm: [PathMatcher1](../PathMatcher1.html)\[T1], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T1, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
240. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSuffixTest(pm:akka.http.javadsl.server.PathMatcher0,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSuffixTest(pm: [PathMatcher0](../PathMatcher0.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
241. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#pathSuffixTest(segment:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pathSuffixTest(segment: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Checks whether the unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html) has a suffix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html) has a suffix matched by the
given PathMatcher. However, as opposed to the pathSuffix directive the matched path is not
actually "consumed".
Note that, for efficiency reasons, the given PathMatcher must match the desired suffix in reversed\-segment
order, i.e. `pathSuffixTest("baz" / "bar")` would match `/foo/bar/baz`!

Definition Classes[PathDirectives](PathDirectives.html)
242. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#post(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def post(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[MethodDirectives](MethodDirectives.html)
243. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#provide[T](t:T,inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def provide\[T](t: T, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Injects the given value into a directive.

Injects the given value into a directive.

Definition Classes[BasicDirectives](BasicDirectives.html)
244. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#put(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def put(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[MethodDirectives](MethodDirectives.html)
245. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rawPathPrefix[T1,T2](pm:akka.http.javadsl.server.PathMatcher2[T1,T2],inner:java.util.function.BiFunction[T1,T2,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rawPathPrefix\[T1, T2](pm: [PathMatcher2](../PathMatcher2.html)\[T1, T2], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[T1, T2, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
246. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rawPathPrefix[T1](pm:akka.http.javadsl.server.PathMatcher1[T1],inner:java.util.function.Function[T1,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rawPathPrefix\[T1](pm: [PathMatcher1](../PathMatcher1.html)\[T1], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T1, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
247. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rawPathPrefix(pm:akka.http.javadsl.server.PathMatcher0,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rawPathPrefix(pm: [PathMatcher0](../PathMatcher0.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
248. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rawPathPrefix(segment:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rawPathPrefix(segment: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Applies the given matcher directly to a prefix of the unmatched path of the
[akka.http.javadsl.server.RequestContext](../RequestContext.html) (i.e.

Applies the given matcher directly to a prefix of the unmatched path of the
[akka.http.javadsl.server.RequestContext](../RequestContext.html) (i.e. without implicitly consuming a leading slash).
The matcher has to match a prefix of the remaining path.
If matched the value extracted by the PathMatcher is extracted on the directive level.

Definition Classes[PathDirectives](PathDirectives.html)
249. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rawPathPrefixTest[T1,T2](pm:akka.http.javadsl.server.PathMatcher2[T1,T2],inner:java.util.function.BiFunction[T1,T2,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rawPathPrefixTest\[T1, T2](pm: [PathMatcher2](../PathMatcher2.html)\[T1, T2], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[T1, T2, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
250. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rawPathPrefixTest[T1](pm:akka.http.javadsl.server.PathMatcher1[T1],inner:java.util.function.Function[T1,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rawPathPrefixTest\[T1](pm: [PathMatcher1](../PathMatcher1.html)\[T1], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T1, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
251. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rawPathPrefixTest(pm:akka.http.javadsl.server.PathMatcher0,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rawPathPrefixTest(pm: [PathMatcher0](../PathMatcher0.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[PathDirectives](PathDirectives.html)
252. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rawPathPrefixTest(segment:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rawPathPrefixTest(segment: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Checks whether the unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html) has a prefix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [akka.http.javadsl.server.RequestContext](../RequestContext.html) has a prefix matched by the
given PathMatcher. However, as opposed to the `pathPrefix` directive the matched path is not
actually "consumed".

Definition Classes[PathDirectives](PathDirectives.html)
253. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#recoverRejections(f:java.util.function.Function[Iterable[akka.http.javadsl.server.Rejection],akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def recoverRejections(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Rejection](../Rejection.html)], [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
254. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#recoverRejectionsWith(f:java.util.function.Function[Iterable[akka.http.javadsl.server.Rejection],java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def recoverRejectionsWith(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Rejection](../Rejection.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
255. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#redirect(uri:akka.http.javadsl.model.Uri,redirectionType:akka.http.javadsl.model.StatusCode):akka.http.javadsl.server.Route "Permalink")  def redirect(uri: [Uri](../../model/Uri.html), redirectionType: [StatusCode](../../model/StatusCode.html)): [Route](../Route.html)Completes the request with redirection response of the given type to the given URI.

Completes the request with redirection response of the given type to the given URI.

redirectionTypeA status code from StatusCodes, which must be a redirection type.

Definition Classes[RouteDirectives](RouteDirectives.html)
256. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#redirectToNoTrailingSlashIfPresent(redirectionType:akka.http.javadsl.model.StatusCode,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def redirectToNoTrailingSlashIfPresent(redirectionType: [StatusCode](../../model/StatusCode.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)If the request path ends with a slash, redirect to the same uri without trailing slash in the path.

If the request path ends with a slash, redirect to the same uri without trailing slash in the path.

**Caveat**: [\#pathSingleSlash](#pathSingleSlash(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route) directive will not match inside of this directive.

redirectionTypeA status code from StatusCodes, which must be a redirection type.

Definition Classes[PathDirectives](PathDirectives.html)
257. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#redirectToTrailingSlashIfMissing(redirectionType:akka.http.javadsl.model.StatusCode,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def redirectToTrailingSlashIfMissing(redirectionType: [StatusCode](../../model/StatusCode.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)If the request path doesn't end with a slash, redirect to the same uri with trailing slash in the path.

If the request path doesn't end with a slash, redirect to the same uri with trailing slash in the path.

**Caveat**: [\#path](#path[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route) without trailing slash and [\#pathEnd](#pathEnd(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route) directives will not match inside of this directive.

redirectionTypeA status code from StatusCodes, which must be a redirection type.

Definition Classes[PathDirectives](PathDirectives.html)
258. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#reject():akka.http.javadsl.server.Route "Permalink")  def reject(): [Route](../Route.html)Rejects the request with an empty rejection (usually used for "no directive matched").

Rejects the request with an empty rejection (usually used for "no directive matched").

Definition Classes[RouteDirectives](RouteDirectives.html)
259. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#reject(rejection:akka.http.javadsl.server.Rejection,rejections:akka.http.javadsl.server.Rejection*):akka.http.javadsl.server.Route "Permalink")  def reject(rejection: [Rejection](../Rejection.html), rejections: [Rejection](../Rejection.html)\*): [Route](../Route.html)Rejects the request with the given rejections, or with an empty set of rejections if no rejections are given.

Rejects the request with the given rejections, or with an empty set of rejections if no rejections are given.

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@varargs()
260. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#rejectEmptyResponse(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def rejectEmptyResponse(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Converts responses with an empty entity into (empty) rejections.

Converts responses with an empty entity into (empty) rejections.
This way you can, for example, have the marshalling of a *None* option
be treated as if the request could not be matched.

Definition Classes[MiscDirectives](MiscDirectives.html)
261. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#request[T](unmarshaller:akka.http.javadsl.unmarshalling.Unmarshaller[_>:akka.http.javadsl.model.HttpRequest,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def request\[T](unmarshaller: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[\_ \>: [HttpRequest](../../model/HttpRequest.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Unmarshalls the request using the given unmarshaller, and passes the result to \[inner].

Unmarshalls the request using the given unmarshaller, and passes the result to \[inner].
If there is a problem with unmarshalling the request is rejected with the [akka.http.javadsl.server.Rejection](../Rejection.html)
produced by the unmarshaller.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
262. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#requestEncodedWith(encoding:akka.http.javadsl.model.headers.HttpEncoding,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def requestEncodedWith(encoding: [HttpEncoding](../../model/headers/HttpEncoding.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.

Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.

Definition Classes[CodingDirectives](CodingDirectives.html)
263. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#requestEntityEmpty(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def requestEntityEmpty(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects if the request entity is non\-empty.

Rejects if the request entity is non\-empty.

Definition Classes[MiscDirectives](MiscDirectives.html)
264. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#requestEntityPresent(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def requestEntityPresent(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects with a [RequestEntityExpectedRejection](../RequestEntityExpectedRejection.html) if the request entity is empty.

Rejects with a [RequestEntityExpectedRejection](../RequestEntityExpectedRejection.html) if the request entity is empty.
Non\-empty requests are passed on unchanged to the inner route.

Definition Classes[MiscDirectives](MiscDirectives.html)
265. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#respondWithDefaultHeader(responseHeader:akka.http.javadsl.model.HttpHeader,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def respondWithDefaultHeader(responseHeader: [HttpHeader](../../model/HttpHeader.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds the given response header to all HTTP responses of its inner Route,
if the response from the inner Route doesn't already contain a header with the same name.

Adds the given response header to all HTTP responses of its inner Route,
if the response from the inner Route doesn't already contain a header with the same name.

Definition Classes[RespondWithDirectives](RespondWithDirectives.html)
266. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#respondWithDefaultHeaders(responseHeaders:Iterable[akka.http.javadsl.model.HttpHeader],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def respondWithDefaultHeaders(responseHeaders: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](../../model/HttpHeader.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds the given response headers to all HTTP responses of its inner Route,
if a header already exists it is not added again.

Adds the given response headers to all HTTP responses of its inner Route,
if a header already exists it is not added again.

Definition Classes[RespondWithDirectives](RespondWithDirectives.html)
267. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#respondWithHeader(responseHeader:akka.http.javadsl.model.HttpHeader,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def respondWithHeader(responseHeader: [HttpHeader](../../model/HttpHeader.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Unconditionally adds the given response header to all HTTP responses of its inner Route.

Unconditionally adds the given response header to all HTTP responses of its inner Route.

Definition Classes[RespondWithDirectives](RespondWithDirectives.html)
268. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#respondWithHeaders(responseHeaders:Iterable[akka.http.javadsl.model.HttpHeader],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def respondWithHeaders(responseHeaders: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpHeader](../../model/HttpHeader.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Unconditionally adds the given response headers to all HTTP responses of its inner Route.

Unconditionally adds the given response headers to all HTTP responses of its inner Route.

Definition Classes[RespondWithDirectives](RespondWithDirectives.html)
269. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#responseEncodingAccepted(encoding:akka.http.javadsl.model.headers.HttpEncoding,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def responseEncodingAccepted(encoding: [HttpEncoding](../../model/headers/HttpEncoding.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects the request with an UnacceptedResponseEncodingRejection
if the given response encoding is not accepted by the client.

Rejects the request with an UnacceptedResponseEncodingRejection
if the given response encoding is not accepted by the client.

Definition Classes[CodingDirectives](CodingDirectives.html)
270. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#scheme(name:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def scheme(name: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects all requests whose Uri scheme does not match the given one.

Rejects all requests whose Uri scheme does not match the given one.

Definition Classes[SchemeDirectives](SchemeDirectives.html)
271. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#selectPreferredLanguage(languages:Iterable[akka.http.javadsl.model.headers.Language],inner:java.util.function.Function[akka.http.javadsl.model.headers.Language,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def selectPreferredLanguage(languages: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Language](../../model/headers/Language.html)], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Language](../../model/headers/Language.html), [Route](../Route.html)]): [Route](../Route.html)Inspects the request's `Accept-Language` header and determines,
which of the given language alternatives is preferred by the client.

Inspects the request's `Accept-Language` header and determines,
which of the given language alternatives is preferred by the client.
(See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.5 for more details on the
negotiation logic.)
If there are several best language alternatives that the client
has equal preference for (even if this preference is zero!)
the order of the arguments is used as a tie breaker (First one wins).

If \[languages] is empty, the route is rejected.

Definition Classes[MiscDirectives](MiscDirectives.html)
272. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#setCookie(cookies:Iterable[akka.http.javadsl.model.headers.HttpCookie],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def setCookie(cookies: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpCookie](../../model/headers/HttpCookie.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header with the given cookies.

Adds a Set\-Cookie response header with the given cookies.

Definition Classes[CookieDirectives](CookieDirectives.html)
273. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#setCookie(cookie:akka.http.javadsl.model.headers.HttpCookie,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def setCookie(cookie: [HttpCookie](../../model/headers/HttpCookie.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header with the given cookie.

Adds a Set\-Cookie response header with the given cookie.

Definition Classes[CookieDirectives](CookieDirectives.html)
274. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#storeUploadedFile(fieldName:String,destFn:java.util.function.Function[akka.http.javadsl.server.directives.FileInfo,java.io.File],inner:java.util.function.BiFunction[akka.http.javadsl.server.directives.FileInfo,java.io.File,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def storeUploadedFile(fieldName: String, destFn: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[FileInfo](FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[FileInfo](FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), [Route](../Route.html)]): [Route](../Route.html)Streams the bytes of the file submitted using multipart with the given file name into a designated file on disk.

Streams the bytes of the file submitted using multipart with the given file name into a designated file on disk.
If there is an error writing to disk the request will be failed with the thrown exception, if there is no such
field the request will be rejected, if there are multiple file parts with the same name, the first one will be
used and the subsequent ones ignored.

Definition Classes[FileUploadDirectives](FileUploadDirectives.html)
275. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#storeUploadedFiles(fieldName:String,destFn:java.util.function.Function[akka.http.javadsl.server.directives.FileInfo,java.io.File],inner:java.util.function.Function[java.util.List[java.util.Map.Entry[akka.http.javadsl.server.directives.FileInfo,java.io.File]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def storeUploadedFiles(fieldName: String, destFn: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[FileInfo](FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Entry\[[FileInfo](FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)]], [Route](../Route.html)]): [Route](../Route.html)Streams the bytes of the file submitted using multipart with the given field name into designated files on disk.

Streams the bytes of the file submitted using multipart with the given field name into designated files on disk.
If there is an error writing to disk the request will be failed with the thrown exception, if there is no such
field the request will be rejected. Stored files are cleaned up on exit but not on failure.

Definition Classes[FileUploadDirectives](FileUploadDirectives.html)
276. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
277. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
278. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
279. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
280. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#validate(check:java.util.function.BooleanSupplier,errorMsg:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def validate(check: [BooleanSupplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BooleanSupplier.html#java.util.function.BooleanSupplier), errorMsg: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Checks the given condition before running its inner route.

Checks the given condition before running its inner route.
If the condition fails the route is rejected with a [ValidationRejection](../ValidationRejection.html).

Definition Classes[MiscDirectives](MiscDirectives.html)
281. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
282. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
283. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
284. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#withExecutionContext(ec:scala.concurrent.ExecutionContextExecutor,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withExecutionContext(ec: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
285. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#withLog(log:akka.event.LoggingAdapter,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withLog(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative LoggingAdapter.

Runs its inner route with the given alternative LoggingAdapter.

Definition Classes[BasicDirectives](BasicDirectives.html)
286. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#withMaterializer(mat:akka.stream.Materializer,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withMaterializer(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).

Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
287. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#withPrecompressedMediaTypeSupport(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withPrecompressedMediaTypeSupport(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Inspects the response entity and adds a `Content-Encoding: gzip` response header if
the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

Inspects the response entity and adds a `Content-Encoding: gzip` response header if
the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

Definition Classes[CodingDirectives](CodingDirectives.html)
288. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#withRangeSupport(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withRangeSupport(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Answers GET requests with an `Accept-Ranges: bytes` header and converts HttpResponses coming back from its inner
route into partial responses if the initial request contained a valid `Range` request header.

Answers GET requests with an `Accept-Ranges: bytes` header and converts HttpResponses coming back from its inner
route into partial responses if the initial request contained a valid `Range` request header. The requested
byte\-ranges may be coalesced.
This directive is transparent to non\-GET requests
Rejects requests with unsatisfiable ranges `UnsatisfiableRangeRejection`.
Rejects requests with too many expected ranges.

Note: if you want to combine this directive with `conditional(...)` you need to put
it on the \*inside\* of the `conditional(...)` directive, i.e. `conditional(...)` must be
on a higher level in your route structure in order to function correctly.

For more information, see: https://tools.ietf.org/html/rfc7233

Definition Classes[RangeDirectives](RangeDirectives.html)
289. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#withSettings(s:akka.http.javadsl.settings.RoutingSettings,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withSettings(s: [RoutingSettings](../../settings/RoutingSettings.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative RoutingSettings.

Runs its inner route with the given alternative RoutingSettings.

Definition Classes[BasicDirectives](BasicDirectives.html)
290. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#withSizeLimit(maxBytes:Long,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withSizeLimit(maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Fails the stream with [akka.http.scaladsl.model.EntityStreamSizeException](../../../scaladsl/model/EntityStreamSizeException.html) if its request entity size exceeds
given limit.

Fails the stream with [akka.http.scaladsl.model.EntityStreamSizeException](../../../scaladsl/model/EntityStreamSizeException.html) if its request entity size exceeds
given limit. Limit given as parameter overrides limit configured with `akka.http.parsing.max-content-length`.

Beware that request entity size check is executed when entity is consumed.

Definition Classes[MiscDirectives](MiscDirectives.html)
291. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#withoutSizeLimit(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withoutSizeLimit(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Disables the size limit (configured by `akka.http.parsing.max-content-length` by default) checking on the incoming
[akka.http.javadsl.model.HttpRequest](../../model/HttpRequest.html) entity.

Disables the size limit (configured by `akka.http.parsing.max-content-length` by default) checking on the incoming
[akka.http.javadsl.model.HttpRequest](../../model/HttpRequest.html) entity.
Can be useful when handling arbitrarily large data uploads in specific parts of your routes.

Definition Classes[MiscDirectives](MiscDirectives.html)NoteUsage of `withoutSizeLimit` is not recommended as it turns off the too large payload protection. Therefore,
 we highly encourage using `withSizeLimit` instead, providing it with a value high enough to successfully
 handle the route in need of big entities.
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SecurityDirectives toStringFormat\[SecurityDirectives] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#route(alternatives:akka.http.javadsl.server.Route*):akka.http.javadsl.server.Route "Permalink")  def route(alternatives: [Route](../Route.html)\*): [Route](../Route.html)Java\-specific call added so you can chain together multiple alternate routes using comma,
rather than having to explicitly call route1\.orElse(route2\).orElse(route3\).

Java\-specific call added so you can chain together multiple alternate routes using comma,
rather than having to explicitly call route1\.orElse(route2\).orElse(route3\).

Definition Classes[RouteDirectives](RouteDirectives.html)Annotations@Deprecated @deprecated @[CorrespondsTo](CorrespondsTo.html)() @varargs() Deprecated*(Since version 10\.1\.6\)* Use the RouteDirectives.concat method instead.
4. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SecurityDirectives, B)ImplicitThis member is added by an implicit conversion from SecurityDirectives toArrowAssoc\[SecurityDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [SchemeDirectives](SchemeDirectives.html)

### Inherited from [RouteDirectives](RouteDirectives.html)

### Inherited from [RespondWithDirectives](RespondWithDirectives.html)

### Inherited from [RangeDirectives](RangeDirectives.html)

### Inherited from [PathDirectives](PathDirectives.html)

### Inherited from [ParameterDirectives](ParameterDirectives.html)

### Inherited from [MiscDirectives](MiscDirectives.html)

### Inherited from [MethodDirectives](MethodDirectives.html)

### Inherited from [MarshallingDirectives](MarshallingDirectives.html)

### Inherited from [HostDirectives](HostDirectives.html)

### Inherited from [AttributeDirectives](AttributeDirectives.html)

### Inherited from [HeaderDirectives](HeaderDirectives.html)

### Inherited from [FutureDirectives](FutureDirectives.html)

### Inherited from [FormFieldDirectives](FormFieldDirectives.html)

### Inherited from [FileUploadDirectives](FileUploadDirectives.html)

### Inherited from [FileAndResourceDirectives](FileAndResourceDirectives.html)

### Inherited from [ExecutionDirectives](ExecutionDirectives.html)

### Inherited from [DebuggingDirectives](DebuggingDirectives.html)

### Inherited from [CookieDirectives](CookieDirectives.html)

### Inherited from [CodingDirectives](CodingDirectives.html)

### Inherited from [CacheConditionDirectives](CacheConditionDirectives.html)

### Inherited from [BasicDirectives](BasicDirectives.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSecurityDirectives to any2stringadd\[SecurityDirectives]

### Inherited by implicit conversion StringFormat fromSecurityDirectives to StringFormat\[SecurityDirectives]

### Inherited by implicit conversion Ensuring fromSecurityDirectives to Ensuring\[SecurityDirectives]

### Inherited by implicit conversion ArrowAssoc fromSecurityDirectives to ArrowAssoc\[SecurityDirectives]

### future

### header

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/Coder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Authorization.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpChallenge.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpOriginRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Language.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AllDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AuthorizationFailedRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingAttributeRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingCookieRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives.html)*
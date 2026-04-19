---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directives
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:46:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](directives/index.html)Definition Classes[server](index.html)
- [**](../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](util/index.html)Definition Classes[server](index.html)
- [AuthenticationFailedRejection](AuthenticationFailedRejection.html "Rejection created by the various akka.http.scaladsl.server.directives.SecurityDirectives.")
- [AuthorizationFailedRejection](AuthorizationFailedRejection$.html "Rejection created by the 'authorize' directive.")
- [CharsetNegotiator](CharsetNegotiator.html)
- [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "Rejection created by the onCompleteWithBreaker directive.")
- [ConjunctionMagnet](ConjunctionMagnet.html)
- [ContentNegotiator](ContentNegotiator.html)
- [CorsRejection](CorsRejection.html "Rejection created by the CORS directives.")
- [Directive](Directive.html "A directive that provides a tuple of values of type L to create an inner route.")
- [Directives](Directives.html "Collects all default directives into one trait for simple importing.")
- [EncodingNegotiator](EncodingNegotiator.html)
- [ExceptionHandler](ExceptionHandler.html)
- [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html "Rejection created when a websocket request was expected but none was found.")
- [HttpApp](HttpApp.html "DEPRECATED, consider https://doc.akka.io/docs/akka-http/current/quickstart-scala/ instead")
- [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
- [InvalidOriginRejection](InvalidOriginRejection.html "Rejection created by akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin.")
- [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "Rejection created by parameter filters.")
- [LanguageNegotiator](LanguageNegotiator.html)
- [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html)
- [LowerPriorityRoutingLogImplicits](LowerPriorityRoutingLogImplicits.html)
- [MalformedFormFieldRejection](MalformedFormFieldRejection.html "Rejection created by form field filters.")
- [MalformedHeaderRejection](MalformedHeaderRejection.html "Rejection created by header directives.")
- [MalformedQueryParamRejection](MalformedQueryParamRejection.html "Rejection created by parameter filters.")
- [MalformedRequestContentRejection](MalformedRequestContentRejection.html "Rejection created by unmarshallers.")
- [MediaTypeNegotiator](MediaTypeNegotiator.html)
- [MethodRejection](MethodRejection.html "Rejection created by method filters.")
- [MissingAttributeRejection](MissingAttributeRejection.html "Rejection created by attribute directives.")
- [MissingCookieRejection](MissingCookieRejection.html "Rejection created by the cookie directive.")
- [MissingFormFieldRejection](MissingFormFieldRejection.html "Rejection created by form field filters.")
- [MissingHeaderRejection](MissingHeaderRejection.html "Rejection created by header directives.")
- [MissingQueryParamRejection](MissingQueryParamRejection.html "Rejection created by parameter filters.")
- [PathMatcher](PathMatcher.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatcher.Unmatched.")
- [PathMatchers](PathMatchers.html)
- [Rejection](Rejection.html "A rejection encapsulates a specific reason why a Route was not able to handle a request.")
- [RejectionError](RejectionError.html "A Throwable wrapping a Rejection.")
- [RejectionHandler](RejectionHandler.html)
- [RejectionWithOptionalCause](RejectionWithOptionalCause.html)
- [RequestContext](RequestContext.html "This class is not meant to be extended by user code.")
- [RequestEntityExpectedRejection](RequestEntityExpectedRejection$.html "Rejection created by unmarshallers.")
- [Route](Route$.html)
- [RouteConcatenation](RouteConcatenation.html)
- [RouteResult](RouteResult.html "The result of handling a request.")
- [RoutingLog](RoutingLog.html)
- [SchemeRejection](SchemeRejection.html "Rejection created by scheme filters.")
- [StandardRoute](StandardRoute.html "A Route that can be implicitly converted into a Directive (fitting any signature).")
- [TlsClientIdentityRejection](TlsClientIdentityRejection.html)
- [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html)
- [TooManyRangesRejection](TooManyRangesRejection.html "Rejection created by range directives.")
- [TransformationRejection](TransformationRejection.html "A special Rejection that serves as a container for a transformation function on rejections.")
- [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "Rejection created by marshallers.")
- [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "Rejection created by encoding filters.")
- [UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "Rejection created by range directives.")
- [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "Rejection created by unmarshallers.")
- [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "Rejection created by decoding filters.")
- [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "Rejection created when a websocket request was not handled because none of the given subprotocols was supported.")
- [ValidationRejection](ValidationRejection.html "Rejection created by the validation directive as well as for IllegalArgumentExceptions thrown by domain model constructors (e.g.")
[o](Directives.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [Directives](Directives.html "See companion trait")[**](../../../../akka/http/scaladsl/server/Directives$.html "Permalink")

### Companion [trait Directives](Directives.html "See companion trait")

#### object Directives extends [Directives](Directives.html)

Collects all default directives into one object for simple importing.

See [akka.http.javadsl.server.Directives](../../javadsl/server/Directives$.html) for JavaDSL equivalent of this trait.

Source[Directives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/Directives.scala#L49)Linear Supertypes[Directives](Directives.html), [TlsDirectives](directives/TlsDirectives.html), [CorsDirectives](directives/CorsDirectives.html), [AttributeDirectives](directives/AttributeDirectives.html), [FramedEntityStreamingDirectives](directives/FramedEntityStreamingDirectives.html), [WebSocketDirectives](directives/WebSocketDirectives.html), [SecurityDirectives](directives/SecurityDirectives.html), [SchemeDirectives](directives/SchemeDirectives.html), [RouteDirectives](directives/RouteDirectives.html), [RespondWithDirectives](directives/RespondWithDirectives.html), [RangeDirectives](directives/RangeDirectives.html), [PathDirectives](directives/PathDirectives.html), [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html), [PathMatchers](PathMatchers.html), [TimeoutDirectives](directives/TimeoutDirectives.html), [ParameterDirectives](directives/ParameterDirectives.html), [ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html), [MiscDirectives](directives/MiscDirectives.html), [MethodDirectives](directives/MethodDirectives.html), [MarshallingDirectives](directives/MarshallingDirectives.html), [HostDirectives](directives/HostDirectives.html), [HeaderDirectives](directives/HeaderDirectives.html), [FutureDirectives](directives/FutureDirectives.html), [FormFieldDirectives](directives/FormFieldDirectives.html), ToNameReceptacleEnhancements, [FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html), [FileUploadDirectives](directives/FileUploadDirectives.html), [FileAndResourceDirectives](directives/FileAndResourceDirectives.html), [ExecutionDirectives](directives/ExecutionDirectives.html), [CodingDirectives](directives/CodingDirectives.html), [DebuggingDirectives](directives/DebuggingDirectives.html), [CookieDirectives](directives/CookieDirectives.html), [CacheConditionDirectives](directives/CacheConditionDirectives.html), [BasicDirectives](directives/BasicDirectives.html), [RouteConcatenation](RouteConcatenation.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. Directives
2. Directives
3. TlsDirectives
4. CorsDirectives
5. AttributeDirectives
6. FramedEntityStreamingDirectives
7. WebSocketDirectives
8. SecurityDirectives
9. SchemeDirectives
10. RouteDirectives
11. RespondWithDirectives
12. RangeDirectives
13. PathDirectives
14. ImplicitPathMatcherConstruction
15. PathMatchers
16. TimeoutDirectives
17. ParameterDirectives
18. ParameterDirectivesInstances
19. MiscDirectives
20. MethodDirectives
21. MarshallingDirectives
22. HostDirectives
23. HeaderDirectives
24. FutureDirectives
25. FormFieldDirectives
26. ToNameReceptacleEnhancements
27. FormFieldDirectivesInstances
28. FileUploadDirectives
29. FileAndResourceDirectives
30. ExecutionDirectives
31. CodingDirectives
32. DebuggingDirectives
33. CookieDirectives
34. CacheConditionDirectives
35. BasicDirectives
36. RouteConcatenation
37. AnyRef
38. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/server/Directives$.html#AsyncAuthenticator[T]=akka.http.scaladsl.server.directives.Credentials=>scala.concurrent.Future[Option[T]] "Permalink")  type AsyncAuthenticator\[T] \= ([Credentials](directives/Credentials.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
2. [**](../../../../akka/http/scaladsl/server/Directives$.html#AsyncAuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,scala.concurrent.Future[T]] "Permalink")  type AsyncAuthenticatorPF\[T] \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Credentials](directives/Credentials.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
3. [**](../../../../akka/http/scaladsl/server/Directives$.html#AuthenticationResult[+T]=Either[akka.http.scaladsl.model.headers.HttpChallenge,T] "Permalink")  type AuthenticationResult\[\+T] \= [Either](https://www.scala-lang.org/api/2.13.17/scala/util/Either.html#scala.util.Either)\[[HttpChallenge](../model/headers/HttpChallenge.html), T]The result of an HTTP authentication attempt is either the user object or
an HttpChallenge to present to the browser.

The result of an HTTP authentication attempt is either the user object or
an HttpChallenge to present to the browser.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
4. [**](../../../../akka/http/scaladsl/server/Directives$.html#Authenticator[T]=akka.http.scaladsl.server.directives.Credentials=>Option[T] "Permalink")  type Authenticator\[T] \= ([Credentials](directives/Credentials.html)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
5. [**](../../../../akka/http/scaladsl/server/Directives$.html#AuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,T] "Permalink")  type AuthenticatorPF\[T] \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Credentials](directives/Credentials.html), T]Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
6. [**](../../../../akka/http/scaladsl/server/Directives$.html#RequestToSourceUnmarshaller[T]=akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[akka.stream.scaladsl.Source[T,akka.NotUsed]] "Permalink")  type RequestToSourceUnmarshaller\[T] \= [Unmarshaller](../unmarshalling/Unmarshaller.html)\[[HttpRequest](../model/HttpRequest.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]]Definition Classes[FramedEntityStreamingDirectives](directives/FramedEntityStreamingDirectives.html)
7. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html "Permalink") abstract  class [NumberMatcher](PathMatchers$NumberMatcher.html)\[T] extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Definition Classes[PathMatchers](PathMatchers.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/server/Directives$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/Directives$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/Directives$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/server/Directives$.html#DoubleNumber:akka.http.scaladsl.server.PathMatcher1[Double] "Permalink")  val DoubleNumber: [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]A PathMatcher that matches and extracts a Double value.

A PathMatcher that matches and extracts a Double value. The matched string representation is the pure decimal,
optionally signed form of a double value, i.e. without exponent.

Definition Classes[PathMatchers](PathMatchers.html)
5. [**](../../../../akka/http/scaladsl/server/Directives$.html#JavaUUID:akka.http.scaladsl.server.PathMatcher1[java.util.UUID] "Permalink")  val JavaUUID: [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)]A PathMatcher that matches and extracts a java.util.UUID instance.

A PathMatcher that matches and extracts a java.util.UUID instance.

Definition Classes[PathMatchers](PathMatchers.html)
6. [**](../../../../akka/http/scaladsl/server/Directives$.html#Neutral:akka.http.scaladsl.server.PathMatcher0 "Permalink")  val Neutral: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that always matches, doesn't consume anything and extracts nothing.

A PathMatcher that always matches, doesn't consume anything and extracts nothing.
Serves mainly as a neutral element in PathMatcher composition.

Definition Classes[PathMatchers](PathMatchers.html)
7. [**](../../../../akka/http/scaladsl/server/Directives$.html#Segments(min:Int,max:Int):akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  def Segments(min: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches between `min` and `max` (both inclusively) path segments (separated by slashes)
as a List\[String].

A PathMatcher that matches between `min` and `max` (both inclusively) path segments (separated by slashes)
as a List\[String]. If there are more than `count` segments present the remaining ones will be left unmatched.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](PathMatchers.html)
8. [**](../../../../akka/http/scaladsl/server/Directives$.html#Segments(count:Int):akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  def Segments(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches the given number of path segments (separated by slashes) as a List\[String].

A PathMatcher that matches the given number of path segments (separated by slashes) as a List\[String].
If there are more than `count` segments present the remaining ones will be left unmatched.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](PathMatchers.html)
9. [**](../../../../akka/http/scaladsl/server/Directives$.html#Segments:akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  val Segments: [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches up to 128 remaining segments as a List\[String].

A PathMatcher that matches up to 128 remaining segments as a List\[String].
This can also be no segments resulting in the empty list.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](PathMatchers.html)
10. [**](../../../../akka/http/scaladsl/server/Directives$.html#_defaultClassLoader:ClassLoader "Permalink")  def \_defaultClassLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)Attributesprotected\[[http](../../index.html)] Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
11. [**](../../../../akka/http/scaladsl/server/Directives$.html#_enhanceRouteWithConcatenation(route:akka.http.scaladsl.server.Route):akka.http.scaladsl.server.RouteConcatenation.RouteWithConcatenation "Permalink") implicit  def \_enhanceRouteWithConcatenation(route: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): [RouteWithConcatenation](RouteConcatenation$$RouteWithConcatenation.html)Definition Classes[RouteConcatenation](RouteConcatenation.html)
12. [**](../../../../akka/http/scaladsl/server/Directives$.html#_regex2PathMatcher(regex:scala.util.matching.Regex):akka.http.scaladsl.server.PathMatcher1[String] "Permalink") implicit  def \_regex2PathMatcher(regex: [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]Creates a PathMatcher that consumes (a prefix of) the first path segment
if the path begins with a segment (a prefix of) which matches the given regex.

Creates a PathMatcher that consumes (a prefix of) the first path segment
if the path begins with a segment (a prefix of) which matches the given regex.
Extracts either the complete match (if the regex doesn't contain a capture group) or
the capture group (if the regex contains exactly one).
If the regex contains more than one capture group the method throws an IllegalArgumentException.

Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
13. [**](../../../../akka/http/scaladsl/server/Directives$.html#_segmentStringToPathMatcher(segment:String):akka.http.scaladsl.server.PathMatcher0 "Permalink") implicit  def \_segmentStringToPathMatcher(segment: String): [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment).

Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment).

Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
14. [**](../../../../akka/http/scaladsl/server/Directives$.html#_string2NR(string:String):akka.http.scaladsl.common.NameReceptacle[String] "Permalink") implicit  def \_string2NR(string: String): [NameReceptacle](../common/NameReceptacle.html)\[String]Definition ClassesToNameReceptacleEnhancementsAnnotations@implicitAmbiguous()
15. [**](../../../../akka/http/scaladsl/server/Directives$.html#_stringExtractionPair2PathMatcher[T](tuple:(String,T)):akka.http.scaladsl.server.PathMatcher1[T] "Permalink") implicit  def \_stringExtractionPair2PathMatcher\[T](tuple: (String, T)): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment) and extracts a given value.

Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment) and extracts a given value.

Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
16. [**](../../../../akka/http/scaladsl/server/Directives$.html#_stringNameOptionReceptacle2PathMatcher(nr:akka.http.scaladsl.common.NameOptionReceptacle[String]):akka.http.scaladsl.server.PathMatcher0 "Permalink") implicit  def \_stringNameOptionReceptacle2PathMatcher(nr: [NameOptionReceptacle](../common/NameOptionReceptacle.html)\[String]): [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
17. [**](../../../../akka/http/scaladsl/server/Directives$.html#_symbol2NR(symbol:Symbol):akka.http.scaladsl.common.NameReceptacle[String] "Permalink") implicit  def \_symbol2NR(symbol: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol)): [NameReceptacle](../common/NameReceptacle.html)\[String]Definition ClassesToNameReceptacleEnhancements
18. [**](../../../../akka/http/scaladsl/server/Directives$.html#_valueMap2PathMatcher[T](valueMap:Map[String,T]):akka.http.scaladsl.server.PathMatcher1[T] "Permalink") implicit  def \_valueMap2PathMatcher\[T](valueMap: Map\[String, T]): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Creates a PathMatcher from the given Map of path segments (prefixes) to extracted values.

Creates a PathMatcher from the given Map of path segments (prefixes) to extracted values.
If the unmatched path starts with a segment having one of the maps keys as a prefix
the matcher consumes this path segment (prefix) and extracts the corresponding map value.
For keys sharing a common prefix the longest matching prefix is selected.

Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
19. [**](../../../../akka/http/scaladsl/server/Directives$.html#as[T](implicitum:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T]):akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T] "Permalink")  def as\[T](implicit um: [FromRequestUnmarshaller](../unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T])\[T]): [FromRequestUnmarshaller](../unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T])\[T]Returns the in\-scope FromRequestUnmarshaller for the given type.

Returns the in\-scope FromRequestUnmarshaller for the given type.

Definition Classes[MarshallingDirectives](directives/MarshallingDirectives.html)
20. [**](../../../../akka/http/scaladsl/server/Directives$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/server/Directives$.html#asSourceOf[T](support:akka.http.scaladsl.common.EntityStreamingSupport)(implicitum:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T]):FramedEntityStreamingDirectives.this.RequestToSourceUnmarshaller[T] "Permalink") final  def asSourceOf\[T](support: [EntityStreamingSupport](../common/EntityStreamingSupport.html))(implicit um: [FromByteStringUnmarshaller](../unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T]): [RequestToSourceUnmarshaller](#RequestToSourceUnmarshaller[T]=akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[akka.stream.scaladsl.Source[T,akka.NotUsed]])\[T]Extracts entity as [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements of type `T`.

Extracts entity as [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements of type `T`.
This is achieved by applying the implicitly provided (in the following order):

\- 1st: chunk\-up the incoming ByteStrings by applying the `Content-Type`\-aware framing
\- 2nd: apply the Unmarshaller (from ByteString to `T`) for each of the respective "chunks" (e.g. for each JSON element contained within an array).

The request will be rejected with an [akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html) if
its ContentType is not supported by the used `framing` or `unmarshaller`.

Cancelling extracted [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) closes the connection abruptly (same as cancelling the `entity.dataBytes`).

See also MiscDirectives.withoutSizeLimit as you may want to allow streaming infinite streams of data in this route.
By default the uploaded data is limited by the `akka.http.parsing.max-content-length`.

Definition Classes[FramedEntityStreamingDirectives](directives/FramedEntityStreamingDirectives.html)
22. [**](../../../../akka/http/scaladsl/server/Directives$.html#asSourceOf[T](implicitum:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T],implicitsupport:akka.http.scaladsl.common.EntityStreamingSupport):FramedEntityStreamingDirectives.this.RequestToSourceUnmarshaller[T] "Permalink") final  def asSourceOf\[T](implicit um: [FromByteStringUnmarshaller](../unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T], support: [EntityStreamingSupport](../common/EntityStreamingSupport.html)): [RequestToSourceUnmarshaller](#RequestToSourceUnmarshaller[T]=akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[akka.stream.scaladsl.Source[T,akka.NotUsed]])\[T]Extracts entity as [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements of type `T`.

Extracts entity as [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements of type `T`.
This is achieved by applying the implicitly provided (in the following order):

\- 1st: chunk\-up the incoming ByteStrings by applying the `Content-Type`\-aware framing
\- 2nd: apply the Unmarshaller (from ByteString to `T`) for each of the respective "chunks" (e.g. for each JSON element contained within an array).

The request will be rejected with an [akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html) if
its ContentType is not supported by the used `framing` or `unmarshaller`.

Cancelling extracted [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) closes the connection abruptly (same as cancelling the `entity.dataBytes`).

See also MiscDirectives.withoutSizeLimit as you may want to allow streaming infinite streams of data in this route.
By default the uploaded data is limited by the `akka.http.parsing.max-content-length`.

Definition Classes[FramedEntityStreamingDirectives](directives/FramedEntityStreamingDirectives.html)
23. [**](../../../../akka/http/scaladsl/server/Directives$.html#attribute[T](key:akka.http.scaladsl.model.AttributeKey[T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def attribute\[T](key: [AttributeKey](../model/AttributeKey.html)\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts a request attribute value for the given key.

Extracts a request attribute value for the given key.

Definition Classes[AttributeDirectives](directives/AttributeDirectives.html)
24. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateBasic[T](realm:String,authenticator:SecurityDirectives.this.Authenticator[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateBasic\[T](realm: String, authenticator: [Authenticator](#Authenticator[T]=akka.http.scaladsl.server.directives.Credentials=>Option[T])\[T]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.

Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
25. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateBasicAsync[T](realm:String,authenticator:SecurityDirectives.this.AsyncAuthenticator[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateBasicAsync\[T](realm: String, authenticator: [AsyncAuthenticator](#AsyncAuthenticator[T]=akka.http.scaladsl.server.directives.Credentials=>scala.concurrent.Future[Option[T]])\[T]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]Wraps the inner route with Http Basic authentication support.

Wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
26. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateBasicPF[T](realm:String,authenticator:SecurityDirectives.this.AuthenticatorPF[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateBasicPF\[T](realm: String, authenticator: [AuthenticatorPF](#AuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,T])\[T]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]A directive that wraps the inner route with Http Basic authentication support.

A directive that wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
27. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateBasicPFAsync[T](realm:String,authenticator:SecurityDirectives.this.AsyncAuthenticatorPF[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateBasicPFAsync\[T](realm: String, authenticator: [AsyncAuthenticatorPF](#AsyncAuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,scala.concurrent.Future[T]])\[T]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]A directive that wraps the inner route with Http Basic authentication support.

A directive that wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
28. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateOAuth2[T](realm:String,authenticator:SecurityDirectives.this.Authenticator[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOAuth2\[T](realm: String, authenticator: [Authenticator](#Authenticator[T]=akka.http.scaladsl.server.directives.Credentials=>Option[T])\[T]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
29. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateOAuth2Async[T](realm:String,authenticator:SecurityDirectives.this.AsyncAuthenticator[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOAuth2Async\[T](realm: String, authenticator: [AsyncAuthenticator](#AsyncAuthenticator[T]=akka.http.scaladsl.server.directives.Credentials=>scala.concurrent.Future[Option[T]])\[T]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
30. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateOAuth2PF[T](realm:String,authenticator:SecurityDirectives.this.AuthenticatorPF[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOAuth2PF\[T](realm: String, authenticator: [AuthenticatorPF](#AuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,T])\[T]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
31. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateOAuth2PFAsync[T](realm:String,authenticator:SecurityDirectives.this.AsyncAuthenticatorPF[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOAuth2PFAsync\[T](realm: String, authenticator: [AsyncAuthenticatorPF](#AsyncAuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,scala.concurrent.Future[T]])\[T]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
32. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateOrRejectWithChallenge[C<:akka.http.scaladsl.model.headers.HttpCredentials,T](authenticator:Option[C]=>scala.concurrent.Future[SecurityDirectives.this.AuthenticationResult[T]])(implicitevidence$1:scala.reflect.ClassTag[C]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOrRejectWithChallenge\[C \<: [HttpCredentials](../model/headers/HttpCredentials.html), T](authenticator: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[C]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AuthenticationResult](#AuthenticationResult[+T]=Either[akka.http.scaladsl.model.headers.HttpChallenge,T])\[T]])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[C]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]Lifts an authenticator function into a directive.

Lifts an authenticator function into a directive. Same as `authenticateOrRejectWithChallenge`
but only applies the authenticator function with a certain type of credentials.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
33. [**](../../../../akka/http/scaladsl/server/Directives$.html#authenticateOrRejectWithChallenge[T](authenticator:Option[akka.http.scaladsl.model.headers.HttpCredentials]=>scala.concurrent.Future[SecurityDirectives.this.AuthenticationResult[T]]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOrRejectWithChallenge\[T](authenticator: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpCredentials](../model/headers/HttpCredentials.html)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AuthenticationResult](#AuthenticationResult[+T]=Either[akka.http.scaladsl.model.headers.HttpChallenge,T])\[T]]): [AuthenticationDirective](directives/AuthenticationDirective.html)\[T]Lifts an authenticator function into a directive.

Lifts an authenticator function into a directive. The authenticator function gets passed in credentials from the
Authorization header of the request. If the function returns `Right(user)` the user object is provided
to the inner route. If the function returns `Left(challenge)` the request is rejected with an
[AuthenticationFailedRejection](AuthenticationFailedRejection.html) that contains this challenge to be added to the response.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
34. [**](../../../../akka/http/scaladsl/server/Directives$.html#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0 "Permalink")  def authorize(check: ([RequestContext](RequestContext.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Applies the given authorization check to the request.

Applies the given authorization check to the request.
If the check fails the route is rejected with an [AuthorizationFailedRejection](AuthorizationFailedRejection$.html).

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
35. [**](../../../../akka/http/scaladsl/server/Directives$.html#authorize(check:=>Boolean):akka.http.scaladsl.server.Directive0 "Permalink")  def authorize(check: \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Applies the given authorization check to the request.

Applies the given authorization check to the request.
If the check fails the route is rejected with an [AuthorizationFailedRejection](AuthorizationFailedRejection$.html).

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
36. [**](../../../../akka/http/scaladsl/server/Directives$.html#authorizeAsync(check:akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[Boolean]):akka.http.scaladsl.server.Directive0 "Permalink")  def authorizeAsync(check: ([RequestContext](RequestContext.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Asynchronous version of [authorize](#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0).

Asynchronous version of [authorize](#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0).
If the Future fails or is completed with `false`
authorization fails and the route is rejected with an [AuthorizationFailedRejection](AuthorizationFailedRejection$.html).

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
37. [**](../../../../akka/http/scaladsl/server/Directives$.html#authorizeAsync(check:=>scala.concurrent.Future[Boolean]):akka.http.scaladsl.server.Directive0 "Permalink")  def authorizeAsync(check: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Asynchronous version of [authorize](#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0).

Asynchronous version of [authorize](#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0).
If the Future fails or is completed with `false`
authorization fails and the route is rejected with an [AuthorizationFailedRejection](AuthorizationFailedRejection$.html).

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
38. [**](../../../../akka/http/scaladsl/server/Directives$.html#cancelRejection(rejection:akka.http.scaladsl.server.Rejection):akka.http.scaladsl.server.Directive0 "Permalink")  def cancelRejection(rejection: [Rejection](Rejection.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
39. [**](../../../../akka/http/scaladsl/server/Directives$.html#cancelRejections(cancelFilter:akka.http.scaladsl.server.Rejection=>Boolean):akka.http.scaladsl.server.Directive0 "Permalink")  def cancelRejections(cancelFilter: ([Rejection](Rejection.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
40. [**](../../../../akka/http/scaladsl/server/Directives$.html#cancelRejections(classes:Class[_]*):akka.http.scaladsl.server.Directive0 "Permalink")  def cancelRejections(classes: Class\[\_]\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
41. [**](../../../../akka/http/scaladsl/server/Directives$.html#checkSameOrigin(allowed:akka.http.scaladsl.model.headers.HttpOriginRange.Default):akka.http.scaladsl.server.Directive0 "Permalink")  def checkSameOrigin(allowed: [Default](../model/headers/HttpOriginRange$$Default.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Checks that request comes from the same origin.

Checks that request comes from the same origin. Extracts the Origin header value and verifies that
allowed range contains the obtained value. In the case of absent of the Origin header rejects
with [MissingHeaderRejection](MissingHeaderRejection.html). If the origin value is not in the allowed range
rejects with an [InvalidOriginRejection](InvalidOriginRejection.html) and StatusCodes.Forbidden status.

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
42. [**](../../../../akka/http/scaladsl/server/Directives$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
43. [**](../../../../akka/http/scaladsl/server/Directives$.html#complete[T](status:akka.http.scaladsl.model.StatusCode,headers:Seq[akka.http.scaladsl.model.HttpHeader],v:=>T)(implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.server.StandardRoute "Permalink")  def complete\[T](status: [StatusCode](../model/StatusCode.html), headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)], v: \=\> T)(implicit m: [ToEntityMarshaller](../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [StandardRoute](StandardRoute.html)Completes the request using the given arguments.

Completes the request using the given arguments.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
44. [**](../../../../akka/http/scaladsl/server/Directives$.html#complete[T](status:akka.http.scaladsl.model.StatusCode,v:=>T)(implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.server.StandardRoute "Permalink")  def complete\[T](status: [StatusCode](../model/StatusCode.html), v: \=\> T)(implicit m: [ToEntityMarshaller](../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [StandardRoute](StandardRoute.html)Completes the request using the given arguments.

Completes the request using the given arguments.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
45. [**](../../../../akka/http/scaladsl/server/Directives$.html#complete(m:=>akka.http.scaladsl.marshalling.ToResponseMarshallable):akka.http.scaladsl.server.StandardRoute "Permalink")  def complete(m: \=\> [ToResponseMarshallable](../marshalling/ToResponseMarshallable.html)): [StandardRoute](StandardRoute.html)Completes the request using the given arguments.

Completes the request using the given arguments.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
46. [**](../../../../akka/http/scaladsl/server/Directives$.html#completeOrRecoverWith(magnet:akka.http.scaladsl.server.directives.CompleteOrRecoverWithMagnet):akka.http.scaladsl.server.Directive1[Throwable] "Permalink")  def completeOrRecoverWith(magnet: [CompleteOrRecoverWithMagnet](directives/CompleteOrRecoverWithMagnet.html)): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[Throwable]"Unwraps" a `Future[T]` and runs the inner route when the future has failed
with the future's failure exception as an extraction of type `Throwable`.

"Unwraps" a `Future[T]` and runs the inner route when the future has failed
with the future's failure exception as an extraction of type `Throwable`.
If the future succeeds the request is completed using the values marshaller
(This directive therefore requires a marshaller for the futures type to be
implicitly available.)

Definition Classes[FutureDirectives](directives/FutureDirectives.html)
47. [**](../../../../akka/http/scaladsl/server/Directives$.html#completeWith[T](marshaller:akka.http.scaladsl.marshalling.ToResponseMarshaller[T])(inner:(T=>Unit)=>Unit):akka.http.scaladsl.server.Route "Permalink")  def completeWith\[T](marshaller: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T])(inner: ((T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Uses the marshaller for the given type to produce a completion function that is passed to its inner function.

Uses the marshaller for the given type to produce a completion function that is passed to its inner function.
You can use it do decouple marshaller resolution from request completion.

Definition Classes[MarshallingDirectives](directives/MarshallingDirectives.html)
48. [**](../../../../akka/http/scaladsl/server/Directives$.html#concat(routes:akka.http.scaladsl.server.Route*):akka.http.scaladsl.server.Route "Permalink")  def concat(routes: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])\*): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Tries the supplied routes in sequence, returning the result of the first route that doesn't reject the request.

Tries the supplied routes in sequence, returning the result of the first route that doesn't reject the request.
This is an alternative to direct usage of the infix \~ operator. The \~ can be prone to programmer error, because if
it is omitted, the program will still be syntactically correct, but will not actually attempt to match multiple
routes, as intended.

routessubroutes to concatenate

returnsthe concatenated route

Definition Classes[RouteConcatenation](RouteConcatenation.html)
49. [**](../../../../akka/http/scaladsl/server/Directives$.html#conditional(eTag:Option[akka.http.scaladsl.model.headers.EntityTag],lastModified:Option[akka.http.scaladsl.model.DateTime]):akka.http.scaladsl.server.Directive0 "Permalink")  def conditional(eTag: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[EntityTag](../model/headers/EntityTag.html)], lastModified: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DateTime](../model/DateTime.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](directives/CacheConditionDirectives.html)
50. [**](../../../../akka/http/scaladsl/server/Directives$.html#conditional(eTag:akka.http.scaladsl.model.headers.EntityTag,lastModified:akka.http.scaladsl.model.DateTime):akka.http.scaladsl.server.Directive0 "Permalink")  def conditional(eTag: [EntityTag](../model/headers/EntityTag.html), lastModified: [DateTime](../model/DateTime.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](directives/CacheConditionDirectives.html)
51. [**](../../../../akka/http/scaladsl/server/Directives$.html#conditional(lastModified:akka.http.scaladsl.model.DateTime):akka.http.scaladsl.server.Directive0 "Permalink")  def conditional(lastModified: [DateTime](../model/DateTime.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](directives/CacheConditionDirectives.html)
52. [**](../../../../akka/http/scaladsl/server/Directives$.html#conditional(eTag:akka.http.scaladsl.model.headers.EntityTag):akka.http.scaladsl.server.Directive0 "Permalink")  def conditional(eTag: [EntityTag](../model/headers/EntityTag.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](directives/CacheConditionDirectives.html)
53. [**](../../../../akka/http/scaladsl/server/Directives$.html#cookie(name:String):akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.headers.HttpCookiePair] "Permalink")  def cookie(name: String): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[HttpCookiePair](../model/headers/HttpCookiePair.html)]Extracts the HttpCookiePair with the given name.

Extracts the HttpCookiePair with the given name. If the cookie is not present the
request is rejected with a respective [MissingCookieRejection](MissingCookieRejection.html).

Definition Classes[CookieDirectives](directives/CookieDirectives.html)
54. [**](../../../../akka/http/scaladsl/server/Directives$.html#cors(settings:akka.http.scaladsl.settings.CorsSettings):akka.http.scaladsl.server.Directive0 "Permalink")  def cors(settings: [CorsSettings](../settings/CorsSettings.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Wraps its inner route with support for the CORS mechanism, enabling cross origin requests using the given cors
settings.

Wraps its inner route with support for the CORS mechanism, enabling cross origin requests using the given cors
settings.

Definition Classes[CorsDirectives](directives/CorsDirectives.html)
55. [**](../../../../akka/http/scaladsl/server/Directives$.html#cors():akka.http.scaladsl.server.Directive0 "Permalink")  def cors(): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Wraps its inner route with support for the CORS mechanism, enabling cross origin requests using the default cors
configuration from the actor system.

Wraps its inner route with support for the CORS mechanism, enabling cross origin requests using the default cors
configuration from the actor system.

Definition Classes[CorsDirectives](directives/CorsDirectives.html)
56. [**](../../../../akka/http/scaladsl/server/Directives$.html#decodeRequest:akka.http.scaladsl.server.Directive0 "Permalink")  def decodeRequest: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Decompresses the incoming request if it is `gzip` or `deflate` compressed.

Decompresses the incoming request if it is `gzip` or `deflate` compressed.
Uncompressed requests are passed through untouched.
If the request encoded with another encoding the request is rejected with an `UnsupportedRequestEncodingRejection`.

Definition Classes[CodingDirectives](directives/CodingDirectives.html)
57. [**](../../../../akka/http/scaladsl/server/Directives$.html#decodeRequestWith(decoders:akka.http.scaladsl.coding.Decoder*):akka.http.scaladsl.server.Directive0 "Permalink")  def decodeRequestWith(decoders: [Decoder](../coding/Decoder.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Decodes the incoming request if it is encoded with one of the given
encoders.

Decodes the incoming request if it is encoded with one of the given
encoders. If the request encoding doesn't match one of the given encoders
the request is rejected with an `UnsupportedRequestEncodingRejection`.
If no decoders are given the default encoders (`Gzip`, `Deflate`, `NoCoding`) are used.

Definition Classes[CodingDirectives](directives/CodingDirectives.html)
58. [**](../../../../akka/http/scaladsl/server/Directives$.html#decodeRequestWith(decoder:akka.http.scaladsl.coding.Decoder):akka.http.scaladsl.server.Directive0 "Permalink")  def decodeRequestWith(decoder: [Decoder](../coding/Decoder.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Decodes the incoming request using the given Decoder.

Decodes the incoming request using the given Decoder.
If the request encoding doesn't match the request is rejected with an `UnsupportedRequestEncodingRejection`.

Definition Classes[CodingDirectives](directives/CodingDirectives.html)
59. [**](../../../../akka/http/scaladsl/server/Directives$.html#delete:akka.http.scaladsl.server.Directive0 "Permalink")  def delete: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-DELETE requests.

Rejects all non\-DELETE requests.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
60. [**](../../../../akka/http/scaladsl/server/Directives$.html#deleteCookie(name:String,domain:String,path:String):akka.http.scaladsl.server.Directive0 "Permalink")  def deleteCookie(name: String, domain: String \= "", path: String \= ""): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a Set\-Cookie response header expiring the cookie with the given properties.

Adds a Set\-Cookie response header expiring the cookie with the given properties.

Definition Classes[CookieDirectives](directives/CookieDirectives.html)
61. [**](../../../../akka/http/scaladsl/server/Directives$.html#deleteCookie(first:akka.http.scaladsl.model.headers.HttpCookie,more:akka.http.scaladsl.model.headers.HttpCookie*):akka.http.scaladsl.server.Directive0 "Permalink")  def deleteCookie(first: [HttpCookie](../model/headers/HttpCookie.html), more: [HttpCookie](../model/headers/HttpCookie.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a Set\-Cookie response header expiring the given cookies.

Adds a Set\-Cookie response header expiring the given cookies.

Definition Classes[CookieDirectives](directives/CookieDirectives.html)
62. [**](../../../../akka/http/scaladsl/server/Directives$.html#encodeResponse:akka.http.scaladsl.server.Directive0 "Permalink")  def encodeResponse: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header.

Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header. The response encoding is determined by the rules specified in
http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.

If the `Accept-Encoding` header is missing or empty or specifies an encoding other than
identity, gzip or deflate then no encoding is used.

Definition Classes[CodingDirectives](directives/CodingDirectives.html)
63. [**](../../../../akka/http/scaladsl/server/Directives$.html#encodeResponseWith(first:akka.http.scaladsl.coding.Encoder,more:akka.http.scaladsl.coding.Encoder*):akka.http.scaladsl.server.Directive0 "Permalink")  def encodeResponseWith(first: [Encoder](../coding/Encoder.html), more: [Encoder](../coding/Encoder.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header.

Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header. The response encoding is determined by the rules specified in
http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.

If the `Accept-Encoding` header is missing then the response is encoded using the `first`
encoder.

If the `Accept-Encoding` header is empty and `NoCoding` is part of the encoders then no
response encoding is used. Otherwise the request is rejected.

Definition Classes[CodingDirectives](directives/CodingDirectives.html)
64. [**](../../../../akka/http/scaladsl/server/Directives$.html#entity[T](um:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def entity\[T](um: [FromRequestUnmarshaller](../unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T])\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Unmarshalls the requests entity to the given type passes it to its inner Route.

Unmarshalls the requests entity to the given type passes it to its inner Route.
If there is a problem with unmarshalling the request is rejected with the [Rejection](Rejection.html)
produced by the unmarshaller.

Definition Classes[MarshallingDirectives](directives/MarshallingDirectives.html)
65. [**](../../../../akka/http/scaladsl/server/Directives$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
66. [**](../../../../akka/http/scaladsl/server/Directives$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
67. [**](../../../../akka/http/scaladsl/server/Directives$.html#extract[T](f:akka.http.scaladsl.server.RequestContext=>T):akka.http.scaladsl.server.Directive1[T] "Permalink")  def extract\[T](f: ([RequestContext](RequestContext.html)) \=\> T): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts a single value using the given function.

Extracts a single value using the given function.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
68. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractActorSystem:akka.http.scaladsl.server.Directive1[akka.actor.ActorSystem] "Permalink")  def extractActorSystem: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)]Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).

Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).
Otherwise throws an exception as it won't be able to extract the system from arbitrary materializers.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
69. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractClientCertificate:akka.http.scaladsl.server.Directive1[java.security.cert.X509Certificate] "Permalink")  def extractClientCertificate: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[X509Certificate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/cert/X509Certificate.html#java.security.cert.X509Certificate)]Extract the client certificate, or reject the request with a [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html).

Extract the client certificate, or reject the request with a [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html).

Using this directives requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on`

The [javax.net.ssl.SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html) for the server needs to be set up with `setWantClientAuth(true)` or `setNeedClientAuth(true)`
or else every request will be failed.

Definition Classes[TlsDirectives](directives/TlsDirectives.html)
70. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractClientIP:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.RemoteAddress] "Permalink")  def extractClientIP: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[RemoteAddress](../model/RemoteAddress.html)]Extracts the client's IP from either the X\-Forwarded\-For, Remote\-Address, X\-Real\-IP header
or [akka.http.scaladsl.model.AttributeKeys.remoteAddress](../model/AttributeKeys$.html#remoteAddress:akka.http.scaladsl.model.AttributeKey[akka.http.scaladsl.model.RemoteAddress]) attribute
(in that order of priority).

Extracts the client's IP from either the X\-Forwarded\-For, Remote\-Address, X\-Real\-IP header
or [akka.http.scaladsl.model.AttributeKeys.remoteAddress](../model/AttributeKeys$.html#remoteAddress:akka.http.scaladsl.model.AttributeKey[akka.http.scaladsl.model.RemoteAddress]) attribute
(in that order of priority).

Definition Classes[MiscDirectives](directives/MiscDirectives.html)
71. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractCredentials:akka.http.scaladsl.server.Directive1[Option[akka.http.scaladsl.model.headers.HttpCredentials]] "Permalink")  def extractCredentials: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpCredentials](../model/headers/HttpCredentials.html)]]Extracts the potentially present HttpCredentials provided with the request's Authorization header.

Extracts the potentially present HttpCredentials provided with the request's Authorization header.

Definition Classes[SecurityDirectives](directives/SecurityDirectives.html)
72. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractDataBytes:akka.http.scaladsl.server.Directive1[akka.stream.scaladsl.Source[akka.util.ByteString,Any]] "Permalink")  def extractDataBytes: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]Extracts the entities `dataBytes` [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Extracts the entities `dataBytes` [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
73. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractExecutionContext:akka.http.scaladsl.server.Directive1[scala.concurrent.ExecutionContextExecutor] "Permalink")  def extractExecutionContext: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)]Extracts the [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Extracts the [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
74. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractHost:akka.http.scaladsl.server.Directive1[String] "Permalink")  def extractHost: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]Extracts the hostname part of the Host request header value.

Extracts the hostname part of the Host request header value.

Definition Classes[HostDirectives](directives/HostDirectives.html)
75. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractLog:akka.http.scaladsl.server.Directive1[akka.event.LoggingAdapter] "Permalink")  def extractLog: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)]Extracts the [akka.event.LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Extracts the [akka.event.LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
76. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractMatchedPath:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.Uri.Path] "Permalink")  def extractMatchedPath: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Path](../model/Uri$$Path.html)]Extracts the already matched path from the RequestContext.

Extracts the already matched path from the RequestContext.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
77. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractMaterializer:akka.http.scaladsl.server.Directive1[akka.stream.Materializer] "Permalink")  def extractMaterializer: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)]Extracts the [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Extracts the [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
78. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractMethod:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.HttpMethod] "Permalink")  def extractMethod: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[HttpMethod](../model/HttpMethod.html)]Extracts the request method.

Extracts the request method.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
79. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractOfferedWsProtocols:akka.http.scaladsl.server.Directive1[Seq[String]] "Permalink")  def extractOfferedWsProtocols: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]]Extract the list of WebSocket subprotocols as offered by the client in the Sec\-WebSocket\-Protocol header if
this is a WebSocket request.

Extract the list of WebSocket subprotocols as offered by the client in the Sec\-WebSocket\-Protocol header if
this is a WebSocket request. Rejects with an [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html), otherwise.

Definition Classes[WebSocketDirectives](directives/WebSocketDirectives.html)
80. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractParserSettings:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.settings.ParserSettings] "Permalink")  def extractParserSettings: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[ParserSettings](../settings/ParserSettings.html)]Extracts the [akka.http.scaladsl.settings.ParserSettings](../settings/ParserSettings.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Extracts the [akka.http.scaladsl.settings.ParserSettings](../settings/ParserSettings.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
81. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractRequest:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.HttpRequest] "Permalink")  def extractRequest: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[HttpRequest](../model/HttpRequest.html)]Extracts the current HttpRequest instance.

Extracts the current HttpRequest instance.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
82. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractRequestContext:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.server.RequestContext] "Permalink")  def extractRequestContext: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[RequestContext](RequestContext.html)]Extracts the [akka.http.scaladsl.server.RequestContext](RequestContext.html) itself.

Extracts the [akka.http.scaladsl.server.RequestContext](RequestContext.html) itself.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
83. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractRequestEntity:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.RequestEntity] "Permalink")  def extractRequestEntity: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[RequestEntity](../model/RequestEntity.html)]Extracts the [akka.http.scaladsl.model.RequestEntity](../model/RequestEntity.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Extracts the [akka.http.scaladsl.model.RequestEntity](../model/RequestEntity.html) from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
84. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractRequestTimeout:akka.http.scaladsl.server.Directive1[scala.concurrent.duration.Duration] "Permalink")  def extractRequestTimeout: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)]Return the currently set request timeout.

Return the currently set request timeout.

Note that this may be changed in inner directives.

Definition Classes[TimeoutDirectives](directives/TimeoutDirectives.html)
85. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractScheme:akka.http.scaladsl.server.Directive1[String] "Permalink")  def extractScheme: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]Extracts the Uri scheme from the request.

Extracts the Uri scheme from the request.

Definition Classes[SchemeDirectives](directives/SchemeDirectives.html)
86. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractSettings:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.settings.RoutingSettings] "Permalink")  def extractSettings: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[RoutingSettings](../settings/RoutingSettings.html)]Extracts the RoutingSettings from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Extracts the RoutingSettings from the [akka.http.scaladsl.server.RequestContext](RequestContext.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
87. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractSslSession:akka.http.scaladsl.server.Directive1[javax.net.ssl.SSLSession] "Permalink")  def extractSslSession: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)]Extract the current SSLSession.

Extract the current SSLSession.

Note: Using this directives requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on`

Definition Classes[TlsDirectives](directives/TlsDirectives.html)
88. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long):akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Strict](../model/HttpEntity$$Strict.html)]WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.scaladsl.server.RequestContext](RequestContext.html) into an
[akka.http.scaladsl.model.HttpEntity.Strict](../model/HttpEntity$$Strict.html) and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
89. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Strict](../model/HttpEntity$$Strict.html)]WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.scaladsl.server.RequestContext](RequestContext.html) into an
[akka.http.scaladsl.model.HttpEntity.Strict](../model/HttpEntity$$Strict.html) and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
90. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractUnmatchedPath:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.Uri.Path] "Permalink")  def extractUnmatchedPath: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Path](../model/Uri$$Path.html)]Extracts the yet unmatched path from the RequestContext.

Extracts the yet unmatched path from the RequestContext.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
91. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractUri:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.Uri] "Permalink")  def extractUri: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Uri](../model/Uri.html)]Extracts the complete request URI.

Extracts the complete request URI.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
92. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractWebSocketUpgrade:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.ws.WebSocketUpgrade] "Permalink")  def extractWebSocketUpgrade: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[WebSocketUpgrade](../model/ws/WebSocketUpgrade.html)]Extract the WebSocketUpgrade attribute if this is a WebSocket request.

Extract the WebSocketUpgrade attribute if this is a WebSocket request.
Rejects with an [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html), otherwise.

Definition Classes[WebSocketDirectives](directives/WebSocketDirectives.html)
93. [**](../../../../akka/http/scaladsl/server/Directives$.html#failWith(error:Throwable):akka.http.scaladsl.server.StandardRoute "Permalink")  def failWith(error: Throwable): [StandardRoute](StandardRoute.html)Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`
directive and its ExceptionHandler.

Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`
directive and its ExceptionHandler.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
94. [**](../../../../akka/http/scaladsl/server/Directives$.html#fileUpload(fieldName:String):akka.http.scaladsl.server.Directive1[(akka.http.scaladsl.server.directives.FileInfo,akka.stream.scaladsl.Source[akka.util.ByteString,Any])] "Permalink")  def fileUpload(fieldName: String): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[([FileInfo](directives/FileInfo.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)])]Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere.

Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere. If there is no such field the request will be rejected,
if there are multiple file parts with the same name, the first one will be used and the subsequent
ones ignored.

Definition Classes[FileUploadDirectives](directives/FileUploadDirectives.html)
95. [**](../../../../akka/http/scaladsl/server/Directives$.html#fileUploadAll(fieldName:String):akka.http.scaladsl.server.Directive1[Seq[(akka.http.scaladsl.server.directives.FileInfo,akka.stream.scaladsl.Source[akka.util.ByteString,Any])]] "Permalink")  def fileUploadAll(fieldName: String): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[([FileInfo](directives/FileInfo.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)])]]Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere.

Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere. If there is no such field the request will be rejected.
Files are buffered into temporary files on disk so in\-memory buffers don't overflow. The temporary
files are cleaned up once materialized, or on exit if the stream is not consumed.

Definition Classes[FileUploadDirectives](directives/FileUploadDirectives.html)
96. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef19:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef20:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef21:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef22:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out,pdef21.Out,pdef22.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef19: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef20: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef21: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef22: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
97. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef19:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef20:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef21:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out,pdef21.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef19: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef20: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef21: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
98. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef19:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef20:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef19: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef20: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
99. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef19:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef19: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
100. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
101. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
102. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
103. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
104. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
105. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
106. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
107. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
108. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
109. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
110. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
111. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
112. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
113. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
114. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
115. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
116. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
117. [**](../../../../akka/http/scaladsl/server/Directives$.html#formField(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,)] "Permalink")  def formField(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
118. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFieldMap:akka.http.scaladsl.server.Directive1[Map[String,String]] "Permalink")  def formFieldMap: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[Map\[String, String]]Extracts HTTP form fields from the request as a `Map[String, String]`.

Extracts HTTP form fields from the request as a `Map[String, String]`.

Definition Classes[FormFieldDirectives](directives/FormFieldDirectives.html)
119. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFieldMultiMap:akka.http.scaladsl.server.Directive1[Map[String,List[String]]] "Permalink")  def formFieldMultiMap: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[Map\[String, List\[String]]]Extracts HTTP form fields from the request as a `Map[String, List[String]]`.

Extracts HTTP form fields from the request as a `Map[String, List[String]]`.

Definition Classes[FormFieldDirectives](directives/FormFieldDirectives.html)
120. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFieldSeq:akka.http.scaladsl.server.Directive1[Seq[(String,String)]] "Permalink")  def formFieldSeq: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(String, String)]]Extracts HTTP form fields from the request as a `Seq[(String, String)]`.

Extracts HTTP form fields from the request as a `Seq[(String, String)]`.

Definition Classes[FormFieldDirectives](directives/FormFieldDirectives.html)
121. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef19:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef20:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef21:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef22:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out,pdef21.Out,pdef22.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef19: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef20: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef21: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef22: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
122. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef19:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef20:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef21:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out,pdef21.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef19: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef20: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef21: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
123. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef19:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef20:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef19: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef20: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
124. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef19:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef19: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
125. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef18:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef18: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
126. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef17:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef17: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
127. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef16:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef16: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
128. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef15:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef15: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
129. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef14:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef14: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
130. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef13:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef13: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
131. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef12:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef12: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
132. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef11:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef11: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
133. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef10:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef10: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
134. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef9:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef9: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
135. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef8:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef8: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
136. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef7:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef7: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
137. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef6:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef6: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
138. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef5:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef5: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
139. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef4:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef4: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
140. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef3:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef3: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
141. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,pdef2:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html), pdef2: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out), [Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
142. [**](../../../../akka/http/scaladsl/server/Directives$.html#formFields(pdef1:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,)] "Permalink")  def formFields(pdef1: [FieldSpec](directives/FormFieldDirectives$$FieldSpec.html)): [Directive](Directive.html)\[([Out](directives/FormFieldDirectives$$FieldSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)
143. [**](../../../../akka/http/scaladsl/server/Directives$.html#get:akka.http.scaladsl.server.Directive0 "Permalink")  def get: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-GET requests.

Rejects all non\-GET requests.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
144. [**](../../../../akka/http/scaladsl/server/Directives$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
145. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromBrowseableDirectories(directories:String*)(implicitrenderer:akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer,implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: String\*)(implicit renderer: [DirectoryRenderer](directives/FileAndResourceDirectives$$DirectoryRenderer.html), resolver: [ContentTypeResolver](directives/ContentTypeResolver.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
146. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromBrowseableDirectory(directory:String)(implicitrenderer:akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer,implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String)(implicit renderer: [DirectoryRenderer](directives/FileAndResourceDirectives$$DirectoryRenderer.html), resolver: [ContentTypeResolver](directives/ContentTypeResolver.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
147. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromDirectory(directoryName:String)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromDirectory(directoryName: String)(implicit resolver: [ContentTypeResolver](directives/ContentTypeResolver.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of a file underneath the given directory.

Completes GET requests with the content of a file underneath the given directory.
If the file cannot be read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
148. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromFile(file:java.io.File,contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), contentType: [ContentType](../model/ContentType.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given file.

Completes GET requests with the content of the given file.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
149. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromFile(file:java.io.File)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File))(implicit resolver: [ContentTypeResolver](directives/ContentTypeResolver.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given file.

Completes GET requests with the content of the given file.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
150. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromFile(fileName:String)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromFile(fileName: String)(implicit resolver: [ContentTypeResolver](directives/ContentTypeResolver.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given file.

Completes GET requests with the content of the given file.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
151. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromResource(resourceName:String,contentType:akka.http.scaladsl.model.ContentType,classLoader:ClassLoader):akka.http.scaladsl.server.Route "Permalink")  def getFromResource(resourceName: String, contentType: [ContentType](../model/ContentType.html), classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader) \= [\_defaultClassLoader](directives/FileAndResourceDirectives.html#_defaultClassLoader:ClassLoader)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given resource.

Completes GET requests with the content of the given resource.
If the resource is a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
152. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromResource(resourceName:String)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromResource(resourceName: String)(implicit resolver: [ContentTypeResolver](directives/ContentTypeResolver.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given class\-path resource.

Completes GET requests with the content of the given class\-path resource.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
153. [**](../../../../akka/http/scaladsl/server/Directives$.html#getFromResourceDirectory(directoryName:String,classLoader:ClassLoader)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String, classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader) \= [\_defaultClassLoader](directives/FileAndResourceDirectives.html#_defaultClassLoader:ClassLoader))(implicit resolver: [ContentTypeResolver](directives/ContentTypeResolver.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory".

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory".
If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
154. [**](../../../../akka/http/scaladsl/server/Directives$.html#handle(handler:PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]],rejections:Seq[akka.http.scaladsl.server.Rejection]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handle(handler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](../model/HttpRequest.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../model/HttpResponse.html)]], rejections: Seq\[[Rejection](Rejection.html)]): [StandardRoute](StandardRoute.html)Handle the request using an asynchronous partial function.

Handle the request using an asynchronous partial function.

This directive can be used to include external components request processing components defined as PartialFunction
(like those provided by akka\-grpc) into a routing tree defined as routes.

rejectionsThe list of rejections to reject with if the handler is not defined for a request.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
155. [**](../../../../akka/http/scaladsl/server/Directives$.html#handle(handler:PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handle(handler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](../model/HttpRequest.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../model/HttpResponse.html)]]): [StandardRoute](StandardRoute.html)Handle the request using an asynchronous partial function.

Handle the request using an asynchronous partial function.

This directive can be used to include external components request processing components defined as PartialFunction
(like those provided by akka\-grpc) into a routing tree defined as routes.

When the partial function is not defined for a request, the request is rejected with an empty list of rejections
which is equivalent to a "Not Found" rejection.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
156. [**](../../../../akka/http/scaladsl/server/Directives$.html#handle(handler:akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handle(handler: ([HttpRequest](../model/HttpRequest.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../model/HttpResponse.html)]): [StandardRoute](StandardRoute.html)Handle the request using a function.

Handle the request using a function.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
157. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleExceptions(handler:akka.http.scaladsl.server.ExceptionHandler):akka.http.scaladsl.server.Directive0 "Permalink")  def handleExceptions(handler: [ExceptionHandler](ExceptionHandler.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Transforms exceptions thrown during evaluation of its inner route using the given
[akka.http.scaladsl.server.ExceptionHandler](ExceptionHandler.html).

Transforms exceptions thrown during evaluation of its inner route using the given
[akka.http.scaladsl.server.ExceptionHandler](ExceptionHandler.html).

Definition Classes[ExecutionDirectives](directives/ExecutionDirectives.html)
158. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleRejections(handler:akka.http.scaladsl.server.RejectionHandler):akka.http.scaladsl.server.Directive0 "Permalink")  def handleRejections(handler: [RejectionHandler](RejectionHandler.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Transforms rejections produced by its inner route using the given
[akka.http.scaladsl.server.RejectionHandler](RejectionHandler.html).

Transforms rejections produced by its inner route using the given
[akka.http.scaladsl.server.RejectionHandler](RejectionHandler.html).

Definition Classes[ExecutionDirectives](directives/ExecutionDirectives.html)
159. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleSync(handler:PartialFunction[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse],rejections:Seq[akka.http.scaladsl.server.Rejection]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handleSync(handler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](../model/HttpRequest.html), [HttpResponse](../model/HttpResponse.html)], rejections: Seq\[[Rejection](Rejection.html)]): [StandardRoute](StandardRoute.html)Handle the request using a synchronous partial function.

Handle the request using a synchronous partial function.

This directive can be used to include external components request processing components defined as PartialFunction
(like those provided by akka\-grpc) into a routing tree defined as routes.

rejectionsThe list of rejections to reject with if the handler is not defined for a request.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
160. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleSync(handler:PartialFunction[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handleSync(handler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](../model/HttpRequest.html), [HttpResponse](../model/HttpResponse.html)]): [StandardRoute](StandardRoute.html)Handle the request using a synchronous partial function.

Handle the request using a synchronous partial function.

This directive can be used to include external components request processing components defined as PartialFunction
(like those provided by akka\-grpc) into a routing tree defined as routes.

When the partial function is not defined for a request, the request is rejected with an empty list of rejections
which is equivalent to a "Not Found" rejection.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
161. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleSync(handler:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpResponse):akka.http.scaladsl.server.StandardRoute "Permalink")  def handleSync(handler: ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpResponse](../model/HttpResponse.html)): [StandardRoute](StandardRoute.html)Handle the request using a function.

Handle the request using a function.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
162. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleWebSocketMessages(handler:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message,Any]):akka.http.scaladsl.server.Route "Permalink")  def handleWebSocketMessages(handler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[Message](../model/ws/Message.html), [Message](../model/ws/Message.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Handles WebSocket requests with the given handler and rejects other requests with an
[ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html).

Handles WebSocket requests with the given handler and rejects other requests with an
[ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html).

Definition Classes[WebSocketDirectives](directives/WebSocketDirectives.html)
163. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleWebSocketMessagesForOptionalProtocol(handler:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message,Any],subprotocol:Option[String]):akka.http.scaladsl.server.Route "Permalink")  def handleWebSocketMessagesForOptionalProtocol(handler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[Message](../model/ws/Message.html), [Message](../model/ws/Message.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], subprotocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Handles WebSocket requests with the given handler and rejects other requests with an
[ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html).

Handles WebSocket requests with the given handler and rejects other requests with an
[ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html).

If the `subprotocol` parameter is None any WebSocket request is accepted. If the `subprotocol` parameter is
`Some(protocol)` a WebSocket request is only accepted if the list of subprotocols supported by the client (as
announced in the WebSocket request) contains `protocol`. If the client did not offer the protocol in question
the request is rejected with an [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html) rejection.

To support several subprotocols you may chain several `handleWebSocketMessagesForOptionalProtocol` routes.

Definition Classes[WebSocketDirectives](directives/WebSocketDirectives.html)
164. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleWebSocketMessagesForProtocol(handler:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message,Any],subprotocol:String):akka.http.scaladsl.server.Route "Permalink")  def handleWebSocketMessagesForProtocol(handler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[Message](../model/ws/Message.html), [Message](../model/ws/Message.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], subprotocol: String): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Handles WebSocket requests with the given handler if the given subprotocol is offered in the request and
rejects other requests with an [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html) or an [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html).

Handles WebSocket requests with the given handler if the given subprotocol is offered in the request and
rejects other requests with an [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html) or an [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html).

Definition Classes[WebSocketDirectives](directives/WebSocketDirectives.html)
165. [**](../../../../akka/http/scaladsl/server/Directives$.html#handleWith[A,B](f:A=>B)(implicitum:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[A],implicitm:akka.http.scaladsl.marshalling.ToResponseMarshaller[B]):akka.http.scaladsl.server.Route "Permalink")  def handleWith\[A, B](f: (A) \=\> B)(implicit um: [FromRequestUnmarshaller](../unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T])\[A], m: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[B]): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes the request using the given function.

Completes the request using the given function. The input to the function is produced with the in\-scope
entity unmarshaller and the result value of the function is marshalled with the in\-scope marshaller.

Definition Classes[MarshallingDirectives](directives/MarshallingDirectives.html)
166. [**](../../../../akka/http/scaladsl/server/Directives$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
167. [**](../../../../akka/http/scaladsl/server/Directives$.html#head:akka.http.scaladsl.server.Directive0 "Permalink")  def head: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-HEAD requests.

Rejects all non\-HEAD requests.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
168. [**](../../../../akka/http/scaladsl/server/Directives$.html#headerValue[T](f:akka.http.scaladsl.model.HttpHeader=>Option[T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def headerValue\[T](f: ([HttpHeader](../model/HttpHeader.html)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts an HTTP header value using the given function.

Extracts an HTTP header value using the given function. If the function result is undefined for all headers the
request is rejected with an empty rejection set. If the given function throws an exception the request is rejected
with a [akka.http.scaladsl.server.MalformedHeaderRejection](MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
169. [**](../../../../akka/http/scaladsl/server/Directives$.html#headerValueByName(headerName:String):akka.http.scaladsl.server.Directive1[String] "Permalink")  def headerValueByName(headerName: String): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]Extracts the value of the HTTP request header with the given name.

Extracts the value of the HTTP request header with the given name.
If no header with a matching name is found the request is rejected with a [akka.http.scaladsl.server.MissingHeaderRejection](MissingHeaderRejection.html).

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
170. [**](../../../../akka/http/scaladsl/server/Directives$.html#headerValueByType[T](magnet:akka.http.scaladsl.server.directives.HeaderMagnet[T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def headerValueByType\[T](magnet: [HeaderMagnet](directives/HeaderMagnet.html)\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts the first HTTP request header of the given type.

Extracts the first HTTP request header of the given type.
If no header with a matching type is found the request is rejected with a [akka.http.scaladsl.server.MissingHeaderRejection](MissingHeaderRejection.html).

Custom headers will only be matched by this directive if they extend ModeledCustomHeader
and provide a companion extending ModeledCustomHeaderCompanion.

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
171. [**](../../../../akka/http/scaladsl/server/Directives$.html#headerValuePF[T](pf:PartialFunction[akka.http.scaladsl.model.HttpHeader,T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def headerValuePF\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpHeader](../model/HttpHeader.html), T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts an HTTP header value using the given partial function.

Extracts an HTTP header value using the given partial function. If the function is undefined for all headers the
request is rejected with an empty rejection set.

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
172. [**](../../../../akka/http/scaladsl/server/Directives$.html#host(regex:scala.util.matching.Regex):akka.http.scaladsl.server.Directive1[String] "Permalink")  def host(regex: [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]Rejects all requests with a host name that doesn't have a prefix matching the given regular expression.

Rejects all requests with a host name that doesn't have a prefix matching the given regular expression.
For all matching requests the prefix string matching the regex is extracted and passed to the inner route.
If the regex contains a capturing group only the string matched by this group is extracted.
If the regex contains more than one capturing group an IllegalArgumentException is thrown.

Definition Classes[HostDirectives](directives/HostDirectives.html)
173. [**](../../../../akka/http/scaladsl/server/Directives$.html#host(predicate:String=>Boolean):akka.http.scaladsl.server.Directive0 "Permalink")  def host(predicate: (String) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all requests for whose host name the given predicate function returns false.

Rejects all requests for whose host name the given predicate function returns false.

Definition Classes[HostDirectives](directives/HostDirectives.html)
174. [**](../../../../akka/http/scaladsl/server/Directives$.html#host(hostNames:String*):akka.http.scaladsl.server.Directive0 "Permalink")  def host(hostNames: String\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all requests with a host name different from the given ones.

Rejects all requests with a host name different from the given ones.

Definition Classes[HostDirectives](directives/HostDirectives.html)
175. [**](../../../../akka/http/scaladsl/server/Directives$.html#ignoreTrailingSlash:akka.http.scaladsl.server.Directive0 "Permalink")  def ignoreTrailingSlash: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Tries to match the inner route and if it fails with an empty rejection, it tries it again
adding (or removing) the trailing slash on the given path.

Tries to match the inner route and if it fails with an empty rejection, it tries it again
adding (or removing) the trailing slash on the given path.

Definition Classes[PathDirectives](directives/PathDirectives.html)
176. [**](../../../../akka/http/scaladsl/server/Directives$.html#instanceOf[T](implicitm:akka.http.scaladsl.marshalling.ToResponseMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink")  def instanceOf\[T](implicit m: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]): [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Returns the in\-scope Marshaller for the given type.

Returns the in\-scope Marshaller for the given type.

Definition Classes[MarshallingDirectives](directives/MarshallingDirectives.html)
177. [**](../../../../akka/http/scaladsl/server/Directives$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
178. [**](../../../../akka/http/scaladsl/server/Directives$.html#listDirectoryContents(directories:String*)(implicitrenderer:akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer):akka.http.scaladsl.server.Route "Permalink")  def listDirectoryContents(directories: String\*)(implicit renderer: [DirectoryRenderer](directives/FileAndResourceDirectives$$DirectoryRenderer.html)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with a unified listing of the contents of all given directories.

Completes GET requests with a unified listing of the contents of all given directories.
The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.

Definition Classes[FileAndResourceDirectives](directives/FileAndResourceDirectives.html)
179. [**](../../../../akka/http/scaladsl/server/Directives$.html#logRequest(magnet:akka.http.scaladsl.server.directives.LoggingMagnet[akka.http.scaladsl.model.HttpRequest=>Unit]):akka.http.scaladsl.server.Directive0 "Permalink")  def logRequest(magnet: [LoggingMagnet](directives/LoggingMagnet.html)\[([HttpRequest](../model/HttpRequest.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Produces a log entry for every incoming request.

Produces a log entry for every incoming request.

Definition Classes[DebuggingDirectives](directives/DebuggingDirectives.html)
180. [**](../../../../akka/http/scaladsl/server/Directives$.html#logRequestResult(magnet:akka.http.scaladsl.server.directives.LoggingMagnet[akka.http.scaladsl.model.HttpRequest=>(akka.http.scaladsl.server.RouteResult=>Unit)]):akka.http.scaladsl.server.Directive0 "Permalink")  def logRequestResult(magnet: [LoggingMagnet](directives/LoggingMagnet.html)\[([HttpRequest](../model/HttpRequest.html)) \=\> ([RouteResult](RouteResult.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Produces a log entry for every incoming request and [RouteResult](RouteResult.html).

Produces a log entry for every incoming request and [RouteResult](RouteResult.html).

Definition Classes[DebuggingDirectives](directives/DebuggingDirectives.html)
181. [**](../../../../akka/http/scaladsl/server/Directives$.html#logResult(magnet:akka.http.scaladsl.server.directives.LoggingMagnet[akka.http.scaladsl.server.RouteResult=>Unit]):akka.http.scaladsl.server.Directive0 "Permalink")  def logResult(magnet: [LoggingMagnet](directives/LoggingMagnet.html)\[([RouteResult](RouteResult.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Produces a log entry for every [RouteResult](RouteResult.html).

Produces a log entry for every [RouteResult](RouteResult.html).

Definition Classes[DebuggingDirectives](directives/DebuggingDirectives.html)
182. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapInnerRoute(f:akka.http.scaladsl.server.Route=>akka.http.scaladsl.server.Route):akka.http.scaladsl.server.Directive0 "Permalink")  def mapInnerRoute(f: ([Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
183. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapRejections(f:Seq[akka.http.scaladsl.server.Rejection]=>Seq[akka.http.scaladsl.server.Rejection]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRejections(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
184. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapRequest(f:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRequest(f: ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
185. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapRequestContext(f:akka.http.scaladsl.server.RequestContext=>akka.http.scaladsl.server.RequestContext):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRequestContext(f: ([RequestContext](RequestContext.html)) \=\> [RequestContext](RequestContext.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
186. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapResponse(f:akka.http.scaladsl.model.HttpResponse=>akka.http.scaladsl.model.HttpResponse):akka.http.scaladsl.server.Directive0 "Permalink")  def mapResponse(f: ([HttpResponse](../model/HttpResponse.html)) \=\> [HttpResponse](../model/HttpResponse.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
187. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapResponseEntity(f:akka.http.scaladsl.model.ResponseEntity=>akka.http.scaladsl.model.ResponseEntity):akka.http.scaladsl.server.Directive0 "Permalink")  def mapResponseEntity(f: ([ResponseEntity](../model/ResponseEntity.html)) \=\> [ResponseEntity](../model/ResponseEntity.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
188. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapResponseHeaders(f:Seq[akka.http.scaladsl.model.HttpHeader]=>Seq[akka.http.scaladsl.model.HttpHeader]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapResponseHeaders(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
189. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapRouteResult(f:akka.http.scaladsl.server.RouteResult=>akka.http.scaladsl.server.RouteResult):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResult(f: ([RouteResult](RouteResult.html)) \=\> [RouteResult](RouteResult.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
190. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapRouteResultFuture(f:scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResultFuture(f: ([Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
191. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapRouteResultPF(f:PartialFunction[akka.http.scaladsl.server.RouteResult,akka.http.scaladsl.server.RouteResult]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResultPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](RouteResult.html), [RouteResult](RouteResult.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
192. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapRouteResultWith(f:akka.http.scaladsl.server.RouteResult=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResultWith(f: ([RouteResult](RouteResult.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
193. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapRouteResultWithPF(f:PartialFunction[akka.http.scaladsl.server.RouteResult,scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResultWithPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](RouteResult.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
194. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapSettings(f:akka.http.scaladsl.settings.RoutingSettings=>akka.http.scaladsl.settings.RoutingSettings):akka.http.scaladsl.server.Directive0 "Permalink")  def mapSettings(f: ([RoutingSettings](../settings/RoutingSettings.html)) \=\> [RoutingSettings](../settings/RoutingSettings.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs the inner route with settings mapped by the given function.

Runs the inner route with settings mapped by the given function.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
195. [**](../../../../akka/http/scaladsl/server/Directives$.html#mapUnmatchedPath(f:akka.http.scaladsl.model.Uri.Path=>akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.server.Directive0 "Permalink")  def mapUnmatchedPath(f: ([Path](../model/Uri$$Path.html)) \=\> [Path](../model/Uri$$Path.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Transforms the unmatchedPath of the RequestContext using the given function.

Transforms the unmatchedPath of the RequestContext using the given function.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
196. [**](../../../../akka/http/scaladsl/server/Directives$.html#method(httpMethod:akka.http.scaladsl.model.HttpMethod):akka.http.scaladsl.server.Directive0 "Permalink")  def method(httpMethod: [HttpMethod](../model/HttpMethod.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all requests whose HTTP method does not match the given one.

Rejects all requests whose HTTP method does not match the given one.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
197. [**](../../../../akka/http/scaladsl/server/Directives$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
198. [**](../../../../akka/http/scaladsl/server/Directives$.html#not(self:akka.http.scaladsl.server.PathMatcher[_]):akka.http.scaladsl.server.PathMatcher0 "Permalink")  def not(self: [PathMatcher](PathMatcher.html)\[\_]): [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Definition Classes[PathMatchers](PathMatchers.html)
199. [**](../../../../akka/http/scaladsl/server/Directives$.html#nothingMatcher[L](implicitevidence$19:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def nothingMatcher\[L](implicit arg0: [Tuple](util/Tuple.html)\[L]): [PathMatcher](PathMatcher.html)\[L]A PathMatcher that never matches anything.

A PathMatcher that never matches anything.

Definition Classes[PathMatchers](PathMatchers.html)
200. [**](../../../../akka/http/scaladsl/server/Directives$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
201. [**](../../../../akka/http/scaladsl/server/Directives$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
202. [**](../../../../akka/http/scaladsl/server/Directives$.html#onComplete[T](future:=>scala.concurrent.Future[T]):akka.http.scaladsl.server.Directive1[scala.util.Try[T]] "Permalink")  def onComplete\[T](future: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]]"Unwraps" a `Future[T]` and runs the inner route after future
completion with the future's value as an extraction of type `Try[T]`.

"Unwraps" a `Future[T]` and runs the inner route after future
completion with the future's value as an extraction of type `Try[T]`.

Definition Classes[FutureDirectives](directives/FutureDirectives.html)
203. [**](../../../../akka/http/scaladsl/server/Directives$.html#onCompleteWithBreaker[T](breaker:akka.pattern.CircuitBreaker)(future:=>scala.concurrent.Future[T]):akka.http.scaladsl.server.Directive1[scala.util.Try[T]] "Permalink")  def onCompleteWithBreaker\[T](breaker: [CircuitBreaker](https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreaker.html#akka.pattern.CircuitBreaker))(future: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]]"Unwraps" a `Future[T]` and runs the inner route after future
completion with the future's value as an extraction of type `T` if
the supplied `CircuitBreaker` is closed.

"Unwraps" a `Future[T]` and runs the inner route after future
completion with the future's value as an extraction of type `T` if
the supplied `CircuitBreaker` is closed.

If the supplied CircuitBreaker is open the request is rejected
with a [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html).

Definition Classes[FutureDirectives](directives/FutureDirectives.html)
204. [**](../../../../akka/http/scaladsl/server/Directives$.html#onSuccess(magnet:akka.http.scaladsl.server.directives.OnSuccessMagnet):akka.http.scaladsl.server.Directive[magnet.Out] "Permalink")  def onSuccess(magnet: [OnSuccessMagnet](directives/OnSuccessMagnet.html)): [Directive](Directive.html)\[[Out](directives/OnSuccessMagnet.html#Out)]"Unwraps" a `Future[T]` and runs the inner route after future
completion with the future's value as an extraction of type `T`.

"Unwraps" a `Future[T]` and runs the inner route after future
completion with the future's value as an extraction of type `T`.
If the future fails its failure Throwable is bubbled up to the nearest
ExceptionHandler.
If type `T` is already a Tuple it is directly expanded into the respective
number of extractions.

Definition Classes[FutureDirectives](directives/FutureDirectives.html)
205. [**](../../../../akka/http/scaladsl/server/Directives$.html#optionalAttribute[T](key:akka.http.scaladsl.model.AttributeKey[T]):akka.http.scaladsl.server.Directive1[Option[T]] "Permalink")  def optionalAttribute\[T](key: [AttributeKey](../model/AttributeKey.html)\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Extracts an optional request attribute for the given key.

Extracts an optional request attribute for the given key.

Definition Classes[AttributeDirectives](directives/AttributeDirectives.html)
206. [**](../../../../akka/http/scaladsl/server/Directives$.html#optionalCookie(name:String):akka.http.scaladsl.server.Directive1[Option[akka.http.scaladsl.model.headers.HttpCookiePair]] "Permalink")  def optionalCookie(name: String): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpCookiePair](../model/headers/HttpCookiePair.html)]]Extracts the HttpCookiePair with the given name as an `Option[HttpCookiePair]`.

Extracts the HttpCookiePair with the given name as an `Option[HttpCookiePair]`.
If the cookie is not present a value of `None` is extracted.

Definition Classes[CookieDirectives](directives/CookieDirectives.html)
207. [**](../../../../akka/http/scaladsl/server/Directives$.html#optionalHeaderValue[T](f:akka.http.scaladsl.model.HttpHeader=>Option[T]):akka.http.scaladsl.server.Directive1[Option[T]] "Permalink")  def optionalHeaderValue\[T](f: ([HttpHeader](../model/HttpHeader.html)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Extracts an optional HTTP header value using the given function.

Extracts an optional HTTP header value using the given function.
If the given function throws an exception the request is rejected
with a [akka.http.scaladsl.server.MalformedHeaderRejection](MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
208. [**](../../../../akka/http/scaladsl/server/Directives$.html#optionalHeaderValueByName(headerName:String):akka.http.scaladsl.server.Directive1[Option[String]] "Permalink")  def optionalHeaderValueByName(headerName: String): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]]Extracts the value of the optional HTTP request header with the given name.

Extracts the value of the optional HTTP request header with the given name.

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
209. [**](../../../../akka/http/scaladsl/server/Directives$.html#optionalHeaderValueByType[T<:akka.http.scaladsl.model.HttpHeader](magnet:akka.http.scaladsl.server.directives.HeaderMagnet[T]):akka.http.scaladsl.server.Directive1[Option[T]] "Permalink")  def optionalHeaderValueByType\[T \<: [HttpHeader](../model/HttpHeader.html)](magnet: [HeaderMagnet](directives/HeaderMagnet.html)\[T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Extract the header value of the optional HTTP request header with the given type.

Extract the header value of the optional HTTP request header with the given type.

Custom headers will only be matched by this directive if they extend ModeledCustomHeader
and provide a companion extending ModeledCustomHeaderCompanion.

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
210. [**](../../../../akka/http/scaladsl/server/Directives$.html#optionalHeaderValuePF[T](pf:PartialFunction[akka.http.scaladsl.model.HttpHeader,T]):akka.http.scaladsl.server.Directive1[Option[T]] "Permalink")  def optionalHeaderValuePF\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpHeader](../model/HttpHeader.html), T]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Extracts an optional HTTP header value using the given partial function.

Extracts an optional HTTP header value using the given partial function.
If the given function throws an exception the request is rejected
with a [akka.http.scaladsl.server.MalformedHeaderRejection](MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)
211. [**](../../../../akka/http/scaladsl/server/Directives$.html#options:akka.http.scaladsl.server.Directive0 "Permalink")  def options: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-OPTIONS requests.

Rejects all non\-OPTIONS requests.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
212. [**](../../../../akka/http/scaladsl/server/Directives$.html#overrideMethodWithParameter(paramName:String):akka.http.scaladsl.server.Directive0 "Permalink")  def overrideMethodWithParameter(paramName: String): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Changes the HTTP method of the request to the value of the specified query string parameter.

Changes the HTTP method of the request to the value of the specified query string parameter. If the query string
parameter is not specified this directive has no effect. If the query string is specified as something that is not
a HTTP method, then this directive completes the request with a `501 Not Implemented` response.

This directive is useful for:

	- Use in combination with JSONP (JSONP only supports GET)
	- Supporting older browsers that lack support for certain HTTP methods. E.g. IE8 does not support PATCHDefinition Classes[MethodDirectives](directives/MethodDirectives.html)
213. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef19:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef20:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef21:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef22:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out,pdef21.Out,pdef22.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef19: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef20: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef21: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef22: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
214. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef19:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef20:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef21:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out,pdef21.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef19: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef20: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef21: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
215. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef19:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef20:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef19: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef20: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
216. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef19:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef19: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
217. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
218. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
219. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
220. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
221. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
222. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
223. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
224. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
225. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
226. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
227. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
228. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
229. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
230. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
231. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
232. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
233. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
234. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameter(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,)] "Permalink")  def parameter(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
235. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameterMap:akka.http.scaladsl.server.Directive1[Map[String,String]] "Permalink")  def parameterMap: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[Map\[String, String]]Extracts the request's query parameters as a `Map[String, String]`.

Extracts the request's query parameters as a `Map[String, String]`.

Definition Classes[ParameterDirectives](directives/ParameterDirectives.html)
236. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameterMultiMap:akka.http.scaladsl.server.Directive1[Map[String,List[String]]] "Permalink")  def parameterMultiMap: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[Map\[String, List\[String]]]Extracts the request's query parameters as a `Map[String, List[String]]`.

Extracts the request's query parameters as a `Map[String, List[String]]`.

Definition Classes[ParameterDirectives](directives/ParameterDirectives.html)
237. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameterSeq:akka.http.scaladsl.server.Directive1[Seq[(String,String)]] "Permalink")  def parameterSeq: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(String, String)]]Extracts the request's query parameters as a `Seq[(String, String)]`.

Extracts the request's query parameters as a `Seq[(String, String)]`.

Definition Classes[ParameterDirectives](directives/ParameterDirectives.html)
238. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef19:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef20:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef21:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef22:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out,pdef21.Out,pdef22.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef19: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef20: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef21: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef22: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
239. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef19:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef20:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef21:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out,pdef21.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef19: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef20: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef21: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
240. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef19:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef20:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out,pdef20.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef19: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef20: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
241. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef19:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out,pdef19.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef19: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
242. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef18:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out,pdef18.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef18: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
243. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef17:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out,pdef17.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef17: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
244. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef16:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out,pdef16.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef16: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
245. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef15:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out,pdef15.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef15: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
246. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef14:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out,pdef14.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef14: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
247. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef13:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out,pdef13.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef13: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
248. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef12:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out,pdef12.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef12: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
249. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef11:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out,pdef11.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef11: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
250. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef10:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out,pdef10.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef10: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
251. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef9:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out,pdef9.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef9: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
252. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef8:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out,pdef8.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef8: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
253. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef7:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out,pdef7.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef7: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
254. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef6:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out,pdef6.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef6: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
255. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef5:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out,pdef5.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef5: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
256. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef4:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out,pdef4.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef4: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
257. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef3:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out,pdef3.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef3: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
258. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,pdef2:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,pdef2.Out)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html), pdef2: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out), [Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
259. [**](../../../../akka/http/scaladsl/server/Directives$.html#parameters(pdef1:akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec):akka.http.scaladsl.server.Directive[(pdef1.Out,)] "Permalink")  def parameters(pdef1: [ParamSpec](directives/ParameterDirectives$$ParamSpec.html)): [Directive](Directive.html)\[([Out](directives/ParameterDirectives$$ParamSpec.html#Out))]Extracts query parameter values from the request.

Extracts query parameter values from the request.
Rejects the request if the defined query parameter matcher(s) don't match.

Definition Classes[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)
260. [**](../../../../akka/http/scaladsl/server/Directives$.html#pass:akka.http.scaladsl.server.Directive0 "Permalink")  def pass: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])A Directive0 that always passes the request on to its inner route
(i.e.

A Directive0 that always passes the request on to its inner route
(i.e. does nothing with the request or the response).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
261. [**](../../../../akka/http/scaladsl/server/Directives$.html#patch:akka.http.scaladsl.server.Directive0 "Permalink")  def patch: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-PATCH requests.

Rejects all non\-PATCH requests.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
262. [**](../../../../akka/http/scaladsl/server/Directives$.html#path[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def path\[L](pm: [PathMatcher](PathMatcher.html)\[L]): [Directive](Directive.html)\[L]Applies the given [PathMatcher](PathMatcher.html) to the remaining unmatched path after consuming a leading slash.

Applies the given [PathMatcher](PathMatcher.html) to the remaining unmatched path after consuming a leading slash.
The matcher has to match the remaining path completely.
If matched the value extracted by the [PathMatcher](PathMatcher.html) is extracted on the directive level.

Definition Classes[PathDirectives](directives/PathDirectives.html)
263. [**](../../../../akka/http/scaladsl/server/Directives$.html#pathEnd:akka.http.scaladsl.server.Directive0 "Permalink")  def pathEnd: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects the request if the unmatchedPath of the [RequestContext](RequestContext.html) is non\-empty,
or said differently: only passes on the request to its inner route if the request path
has been matched completely.

Rejects the request if the unmatchedPath of the [RequestContext](RequestContext.html) is non\-empty,
or said differently: only passes on the request to its inner route if the request path
has been matched completely.

Definition Classes[PathDirectives](directives/PathDirectives.html)
264. [**](../../../../akka/http/scaladsl/server/Directives$.html#pathEndOrSingleSlash:akka.http.scaladsl.server.Directive0 "Permalink")  def pathEndOrSingleSlash: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Only passes on the request to its inner route if the request path has been matched
completely or only consists of exactly one remaining slash.

Only passes on the request to its inner route if the request path has been matched
completely or only consists of exactly one remaining slash.

Note that trailing slash and non\-trailing slash URLs are **not** the same, although they often serve
the same content. It is recommended to serve only one URL version and make the other redirect to it using
[redirectToTrailingSlashIfMissing](#redirectToTrailingSlashIfMissing(redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.Directive0) or [redirectToNoTrailingSlashIfPresent](#redirectToNoTrailingSlashIfPresent(redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.Directive0) directive.

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
For further information, refer to:

Definition Classes[PathDirectives](directives/PathDirectives.html)See also[https://webmasters.googleblog.com/2010/04/to\-slash\-or\-not\-to\-slash.html](https://webmasters.googleblog.com/2010/04/to-slash-or-not-to-slash.html)
265. [**](../../../../akka/http/scaladsl/server/Directives$.html#pathPrefix[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def pathPrefix\[L](pm: [PathMatcher](PathMatcher.html)\[L]): [Directive](Directive.html)\[L]Applies the given [PathMatcher](PathMatcher.html) to a prefix of the remaining unmatched path after consuming a leading slash.

Applies the given [PathMatcher](PathMatcher.html) to a prefix of the remaining unmatched path after consuming a leading slash.
The matcher has to match a prefix of the remaining path.
If matched the value extracted by the PathMatcher is extracted on the directive level.

Definition Classes[PathDirectives](directives/PathDirectives.html)
266. [**](../../../../akka/http/scaladsl/server/Directives$.html#pathPrefixTest[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def pathPrefixTest\[L](pm: [PathMatcher](PathMatcher.html)\[L]): [Directive](Directive.html)\[L]Checks whether the unmatchedPath of the [RequestContext](RequestContext.html) has a prefix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [RequestContext](RequestContext.html) has a prefix matched by the
given PathMatcher. In analogy to the `pathPrefix` directive a leading slash is implied.

Definition Classes[PathDirectives](directives/PathDirectives.html)
267. [**](../../../../akka/http/scaladsl/server/Directives$.html#pathSingleSlash:akka.http.scaladsl.server.Directive0 "Permalink")  def pathSingleSlash: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Only passes on the request to its inner route if the request path
consists of exactly one remaining slash.

Only passes on the request to its inner route if the request path
consists of exactly one remaining slash.

Definition Classes[PathDirectives](directives/PathDirectives.html)
268. [**](../../../../akka/http/scaladsl/server/Directives$.html#pathSuffix[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def pathSuffix\[L](pm: [PathMatcher](PathMatcher.html)\[L]): [Directive](Directive.html)\[L]Applies the given [PathMatcher](PathMatcher.html) to a suffix of the remaining unmatchedPath of the [RequestContext](RequestContext.html).

Applies the given [PathMatcher](PathMatcher.html) to a suffix of the remaining unmatchedPath of the [RequestContext](RequestContext.html).
If matched the value extracted by the [PathMatcher](PathMatcher.html) is extracted and the matched parts of the path are consumed.
Note that, for efficiency reasons, the given [PathMatcher](PathMatcher.html) must match the desired suffix in reversed\-segment
order, i.e. `pathSuffix("baz" / "bar")` would match `/foo/bar/baz`!

Definition Classes[PathDirectives](directives/PathDirectives.html)
269. [**](../../../../akka/http/scaladsl/server/Directives$.html#pathSuffixTest[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def pathSuffixTest\[L](pm: [PathMatcher](PathMatcher.html)\[L]): [Directive](Directive.html)\[L]Checks whether the unmatchedPath of the [RequestContext](RequestContext.html) has a suffix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [RequestContext](RequestContext.html) has a suffix matched by the
given PathMatcher. However, as opposed to the pathSuffix directive the matched path is not
actually "consumed".
Note that, for efficiency reasons, the given PathMatcher must match the desired suffix in reversed\-segment
order, i.e. `pathSuffixTest("baz" / "bar")` would match `/foo/bar/baz`!

Definition Classes[PathDirectives](directives/PathDirectives.html)
270. [**](../../../../akka/http/scaladsl/server/Directives$.html#post:akka.http.scaladsl.server.Directive0 "Permalink")  def post: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-POST requests.

Rejects all non\-POST requests.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
271. [**](../../../../akka/http/scaladsl/server/Directives$.html#provide[T](value:T):akka.http.scaladsl.server.Directive1[T] "Permalink")  def provide\[T](value: T): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Injects the given value into a directive.

Injects the given value into a directive.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
272. [**](../../../../akka/http/scaladsl/server/Directives$.html#put:akka.http.scaladsl.server.Directive0 "Permalink")  def put: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-PUT requests.

Rejects all non\-PUT requests.

Definition Classes[MethodDirectives](directives/MethodDirectives.html)
273. [**](../../../../akka/http/scaladsl/server/Directives$.html#rawPathPrefix[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def rawPathPrefix\[L](pm: [PathMatcher](PathMatcher.html)\[L]): [Directive](Directive.html)\[L]Applies the given matcher directly to a prefix of the unmatched path of the
[RequestContext](RequestContext.html) (i.e.

Applies the given matcher directly to a prefix of the unmatched path of the
[RequestContext](RequestContext.html) (i.e. without implicitly consuming a leading slash).
The matcher has to match a prefix of the remaining path.
If matched the value extracted by the PathMatcher is extracted on the directive level.

Definition Classes[PathDirectives](directives/PathDirectives.html)
274. [**](../../../../akka/http/scaladsl/server/Directives$.html#rawPathPrefixTest[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def rawPathPrefixTest\[L](pm: [PathMatcher](PathMatcher.html)\[L]): [Directive](Directive.html)\[L]Checks whether the unmatchedPath of the [RequestContext](RequestContext.html) has a prefix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [RequestContext](RequestContext.html) has a prefix matched by the
given PathMatcher. However, as opposed to the `pathPrefix` directive the matched path is not
actually "consumed".

Definition Classes[PathDirectives](directives/PathDirectives.html)
275. [**](../../../../akka/http/scaladsl/server/Directives$.html#recoverRejections(f:Seq[akka.http.scaladsl.server.Rejection]=>akka.http.scaladsl.server.RouteResult):akka.http.scaladsl.server.Directive0 "Permalink")  def recoverRejections(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) \=\> [RouteResult](RouteResult.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
276. [**](../../../../akka/http/scaladsl/server/Directives$.html#recoverRejectionsWith(f:Seq[akka.http.scaladsl.server.Rejection]=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]):akka.http.scaladsl.server.Directive0 "Permalink")  def recoverRejectionsWith(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](directives/BasicDirectives.html)
277. [**](../../../../akka/http/scaladsl/server/Directives$.html#redirect(uri:akka.http.scaladsl.model.Uri,redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.StandardRoute "Permalink")  def redirect(uri: [Uri](../model/Uri.html), redirectionType: [Redirection](../model/StatusCodes$$Redirection.html)): [StandardRoute](StandardRoute.html)Completes the request with redirection response of the given type to the given URI.

Completes the request with redirection response of the given type to the given URI.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
278. [**](../../../../akka/http/scaladsl/server/Directives$.html#redirectToNoTrailingSlashIfPresent(redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.Directive0 "Permalink")  def redirectToNoTrailingSlashIfPresent(redirectionType: [Redirection](../model/StatusCodes$$Redirection.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])If the request path ends with a slash, redirect to the same uri without trailing slash in the path.

If the request path ends with a slash, redirect to the same uri without trailing slash in the path.

Note, however, that this directive doesn't apply to a URI consisting of just a single slash.
HTTP does not support empty target paths, so that browsers will convert
a URI such as `http://example.org` to `http://example.org/` adding the trailing slash.

Redirecting the single slash path URI would lead to a redirection loop.

**Caveat**: [pathSingleSlash](#pathSingleSlash:akka.http.scaladsl.server.Directive0) directive will only match on the root path level inside of this directive.

Definition Classes[PathDirectives](directives/PathDirectives.html)
279. [**](../../../../akka/http/scaladsl/server/Directives$.html#redirectToTrailingSlashIfMissing(redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.Directive0 "Permalink")  def redirectToTrailingSlashIfMissing(redirectionType: [Redirection](../model/StatusCodes$$Redirection.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])If the request path doesn't end with a slash, redirect to the same uri with trailing slash in the path.

If the request path doesn't end with a slash, redirect to the same uri with trailing slash in the path.

**Caveat**: [path](#path[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L]) without trailing slash and [pathEnd](#pathEnd:akka.http.scaladsl.server.Directive0) directives will not match inside of this directive.

Definition Classes[PathDirectives](directives/PathDirectives.html)
280. [**](../../../../akka/http/scaladsl/server/Directives$.html#reject(rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.StandardRoute "Permalink")  def reject(rejections: [Rejection](Rejection.html)\*): [StandardRoute](StandardRoute.html)Rejects the request with the given rejections.

Rejects the request with the given rejections.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
281. [**](../../../../akka/http/scaladsl/server/Directives$.html#reject:akka.http.scaladsl.server.StandardRoute "Permalink")  def reject: [StandardRoute](StandardRoute.html)Rejects the request with an empty set of rejections.

Rejects the request with an empty set of rejections.

Definition Classes[RouteDirectives](directives/RouteDirectives.html)
282. [**](../../../../akka/http/scaladsl/server/Directives$.html#rejectEmptyResponse:akka.http.scaladsl.server.Directive0 "Permalink")  def rejectEmptyResponse: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Converts responses with an empty entity into (empty) rejections.

Converts responses with an empty entity into (empty) rejections.
This way you can, for example, have the marshalling of a *None* option
be treated as if the request could not be matched.

Definition Classes[MiscDirectives](directives/MiscDirectives.html)
283. [**](../../../../akka/http/scaladsl/server/Directives$.html#requestEncodedWith(encoding:akka.http.scaladsl.model.headers.HttpEncoding):akka.http.scaladsl.server.Directive0 "Permalink")  def requestEncodedWith(encoding: [HttpEncoding](../model/headers/HttpEncoding.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.

Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.

Definition Classes[CodingDirectives](directives/CodingDirectives.html)
284. [**](../../../../akka/http/scaladsl/server/Directives$.html#requestEntityEmpty:akka.http.scaladsl.server.Directive0 "Permalink")  def requestEntityEmpty: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects if the request entity is non\-empty.

Rejects if the request entity is non\-empty.

Definition Classes[MiscDirectives](directives/MiscDirectives.html)
285. [**](../../../../akka/http/scaladsl/server/Directives$.html#requestEntityPresent:akka.http.scaladsl.server.Directive0 "Permalink")  def requestEntityPresent: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects with a [RequestEntityExpectedRejection](RequestEntityExpectedRejection$.html) if the request entity is empty.

Rejects with a [RequestEntityExpectedRejection](RequestEntityExpectedRejection$.html) if the request entity is empty.
Non\-empty requests are passed on unchanged to the inner route.

Definition Classes[MiscDirectives](directives/MiscDirectives.html)
286. [**](../../../../akka/http/scaladsl/server/Directives$.html#requireClientCertificateIdentity(cnRegex:scala.util.matching.Regex):akka.http.scaladsl.server.Directive0 "Permalink")  def requireClientCertificateIdentity(cnRegex: [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Require the client to be authenticated, if not reject the request with a [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html), also require
the one of the client certificate `ip` or `dns` SANs (Subject Alternative Name) or if non exists, the CN (Common Name)
to match the given regular expression, if not the request is rejected with a [TlsClientIdentityRejection](TlsClientIdentityRejection.html)

Require the client to be authenticated, if not reject the request with a [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html), also require
the one of the client certificate `ip` or `dns` SANs (Subject Alternative Name) or if non exists, the CN (Common Name)
to match the given regular expression, if not the request is rejected with a [TlsClientIdentityRejection](TlsClientIdentityRejection.html)

Using this directives requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on`

The [javax.net.ssl.SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html) for the server needs to be set up with `setWantClientAuth(true)` or `setNeedClientAuth(true)`
or else every request will be failed.

Definition Classes[TlsDirectives](directives/TlsDirectives.html)
287. [**](../../../../akka/http/scaladsl/server/Directives$.html#respondWithDefaultHeader(responseHeader:akka.http.scaladsl.model.HttpHeader):akka.http.scaladsl.server.Directive0 "Permalink")  def respondWithDefaultHeader(responseHeader: [HttpHeader](../model/HttpHeader.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds the given response header to all HTTP responses of its inner Route,
if the response from the inner Route doesn't already contain a header with the same name.

Adds the given response header to all HTTP responses of its inner Route,
if the response from the inner Route doesn't already contain a header with the same name.

Definition Classes[RespondWithDirectives](directives/RespondWithDirectives.html)
288. [**](../../../../akka/http/scaladsl/server/Directives$.html#respondWithDefaultHeaders(firstHeader:akka.http.scaladsl.model.HttpHeader,otherHeaders:akka.http.scaladsl.model.HttpHeader*):akka.http.scaladsl.server.Directive0 "Permalink")  def respondWithDefaultHeaders(firstHeader: [HttpHeader](../model/HttpHeader.html), otherHeaders: [HttpHeader](../model/HttpHeader.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[RespondWithDirectives](directives/RespondWithDirectives.html)
289. [**](../../../../akka/http/scaladsl/server/Directives$.html#respondWithDefaultHeaders(responseHeaders:Seq[akka.http.scaladsl.model.HttpHeader]):akka.http.scaladsl.server.Directive0 "Permalink")  def respondWithDefaultHeaders(responseHeaders: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds the given response headers to all HTTP responses of its inner Route,
if a header already exists it is not added again.

Adds the given response headers to all HTTP responses of its inner Route,
if a header already exists it is not added again.

Definition Classes[RespondWithDirectives](directives/RespondWithDirectives.html)
290. [**](../../../../akka/http/scaladsl/server/Directives$.html#respondWithHeader(responseHeader:akka.http.scaladsl.model.HttpHeader):akka.http.scaladsl.server.Directive0 "Permalink")  def respondWithHeader(responseHeader: [HttpHeader](../model/HttpHeader.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Unconditionally adds the given response header to all HTTP responses of its inner Route.

Unconditionally adds the given response header to all HTTP responses of its inner Route.

Definition Classes[RespondWithDirectives](directives/RespondWithDirectives.html)
291. [**](../../../../akka/http/scaladsl/server/Directives$.html#respondWithHeaders(firstHeader:akka.http.scaladsl.model.HttpHeader,otherHeaders:akka.http.scaladsl.model.HttpHeader*):akka.http.scaladsl.server.Directive0 "Permalink")  def respondWithHeaders(firstHeader: [HttpHeader](../model/HttpHeader.html), otherHeaders: [HttpHeader](../model/HttpHeader.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[RespondWithDirectives](directives/RespondWithDirectives.html)
292. [**](../../../../akka/http/scaladsl/server/Directives$.html#respondWithHeaders(responseHeaders:Seq[akka.http.scaladsl.model.HttpHeader]):akka.http.scaladsl.server.Directive0 "Permalink")  def respondWithHeaders(responseHeaders: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Unconditionally adds the given response headers to all HTTP responses of its inner Route.

Unconditionally adds the given response headers to all HTTP responses of its inner Route.

Definition Classes[RespondWithDirectives](directives/RespondWithDirectives.html)
293. [**](../../../../akka/http/scaladsl/server/Directives$.html#responseEncodingAccepted(encoding:akka.http.scaladsl.model.headers.HttpEncoding):akka.http.scaladsl.server.Directive0 "Permalink")  def responseEncodingAccepted(encoding: [HttpEncoding](../model/headers/HttpEncoding.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects the request with an UnacceptedResponseEncodingRejection
if the given response encoding is not accepted by the client.

Rejects the request with an UnacceptedResponseEncodingRejection
if the given response encoding is not accepted by the client.

Definition Classes[CodingDirectives](directives/CodingDirectives.html)
294. [**](../../../../akka/http/scaladsl/server/Directives$.html#scheme(name:String):akka.http.scaladsl.server.Directive0 "Permalink")  def scheme(name: String): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all requests whose Uri scheme does not match the given one.

Rejects all requests whose Uri scheme does not match the given one.

Definition Classes[SchemeDirectives](directives/SchemeDirectives.html)
295. [**](../../../../akka/http/scaladsl/server/Directives$.html#selectPreferredLanguage(first:akka.http.scaladsl.model.headers.Language,more:akka.http.scaladsl.model.headers.Language*):akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.headers.Language] "Permalink")  def selectPreferredLanguage(first: [Language](../model/headers/Language.html), more: [Language](../model/headers/Language.html)\*): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Language](../model/headers/Language.html)]Inspects the request's `Accept-Language` header and determines,
which of the given language alternatives is preferred by the client.

Inspects the request's `Accept-Language` header and determines,
which of the given language alternatives is preferred by the client.
(See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.5 for more details on the
negotiation logic.)
If there are several best language alternatives that the client
has equal preference for (even if this preference is zero!)
the order of the arguments is used as a tie breaker (First one wins).

Definition Classes[MiscDirectives](directives/MiscDirectives.html)
296. [**](../../../../akka/http/scaladsl/server/Directives$.html#separateOnSlashes(string:String):akka.http.scaladsl.server.PathMatcher0 "Permalink")  def separateOnSlashes(string: String): [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Converts a path string containing slashes into a PathMatcher that interprets slashes as
path segment separators.

Converts a path string containing slashes into a PathMatcher that interprets slashes as
path segment separators.

Definition Classes[PathMatchers](PathMatchers.html)
297. [**](../../../../akka/http/scaladsl/server/Directives$.html#setCookie(first:akka.http.scaladsl.model.headers.HttpCookie,more:akka.http.scaladsl.model.headers.HttpCookie*):akka.http.scaladsl.server.Directive0 "Permalink")  def setCookie(first: [HttpCookie](../model/headers/HttpCookie.html), more: [HttpCookie](../model/headers/HttpCookie.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a Set\-Cookie response header with the given cookies.

Adds a Set\-Cookie response header with the given cookies.

Definition Classes[CookieDirectives](directives/CookieDirectives.html)
298. [**](../../../../akka/http/scaladsl/server/Directives$.html#storeUploadedFile(fieldName:String,destFn:akka.http.scaladsl.server.directives.FileInfo=>java.io.File):akka.http.scaladsl.server.Directive[(akka.http.scaladsl.server.directives.FileInfo,java.io.File)] "Permalink")  def storeUploadedFile(fieldName: String, destFn: ([FileInfo](directives/FileInfo.html)) \=\> [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): [Directive](Directive.html)\[([FileInfo](directives/FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File))]Streams the bytes of the file submitted using multipart with the given file name into a designated file on disk.

Streams the bytes of the file submitted using multipart with the given file name into a designated file on disk.
If there is an error writing to disk the request will be failed with the thrown exception, if there is no such
field the request will be rejected, if there are multiple file parts with the same name, the first one will be
used and the subsequent ones ignored.

Definition Classes[FileUploadDirectives](directives/FileUploadDirectives.html)
299. [**](../../../../akka/http/scaladsl/server/Directives$.html#storeUploadedFiles(fieldName:String,destFn:akka.http.scaladsl.server.directives.FileInfo=>java.io.File):akka.http.scaladsl.server.Directive1[Seq[(akka.http.scaladsl.server.directives.FileInfo,java.io.File)]] "Permalink")  def storeUploadedFiles(fieldName: String, destFn: ([FileInfo](directives/FileInfo.html)) \=\> [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[([FileInfo](directives/FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File))]]Streams the bytes of the file submitted using multipart with the given field name into designated files on disk.

Streams the bytes of the file submitted using multipart with the given field name into designated files on disk.
If there is an error writing to disk the request will be failed with the thrown exception, if there is no such
field the request will be rejected. Stored files are cleaned up on exit but not on failure.

Definition Classes[FileUploadDirectives](directives/FileUploadDirectives.html)
300. [**](../../../../akka/http/scaladsl/server/Directives$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
301. [**](../../../../akka/http/scaladsl/server/Directives$.html#textract[L](f:akka.http.scaladsl.server.RequestContext=>L)(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def textract\[L](f: ([RequestContext](RequestContext.html)) \=\> L)(implicit arg0: [Tuple](util/Tuple.html)\[L]): [Directive](Directive.html)\[L]Extracts a number of values using the given function.

Extracts a number of values using the given function.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
302. [**](../../../../akka/http/scaladsl/server/Directives$.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long):akka.http.scaladsl.server.Directive0 "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.scaladsl.server.RequestContext](RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
303. [**](../../../../akka/http/scaladsl/server/Directives$.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.server.Directive0 "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.scaladsl.server.RequestContext](RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
304. [**](../../../../akka/http/scaladsl/server/Directives$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
305. [**](../../../../akka/http/scaladsl/server/Directives$.html#tprovide[L](values:L)(implicitevidence$1:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def tprovide\[L](values: L)(implicit arg0: [Tuple](util/Tuple.html)\[L]): [Directive](Directive.html)\[L]Injects the given values into a directive.

Injects the given values into a directive.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
306. [**](../../../../akka/http/scaladsl/server/Directives$.html#validate(check:=>Boolean,errorMsg:String):akka.http.scaladsl.server.Directive0 "Permalink")  def validate(check: \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), errorMsg: String): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Checks the given condition before running its inner route.

Checks the given condition before running its inner route.
If the condition fails the route is rejected with a [ValidationRejection](ValidationRejection.html).

Definition Classes[MiscDirectives](directives/MiscDirectives.html)
307. [**](../../../../akka/http/scaladsl/server/Directives$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
308. [**](../../../../akka/http/scaladsl/server/Directives$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
309. [**](../../../../akka/http/scaladsl/server/Directives$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
310. [**](../../../../akka/http/scaladsl/server/Directives$.html#withExecutionContext(ec:scala.concurrent.ExecutionContextExecutor):akka.http.scaladsl.server.Directive0 "Permalink")  def withExecutionContext(ec: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
311. [**](../../../../akka/http/scaladsl/server/Directives$.html#withLog(log:akka.event.LoggingAdapter):akka.http.scaladsl.server.Directive0 "Permalink")  def withLog(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs its inner route with the given alternative [akka.event.LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html).

Runs its inner route with the given alternative [akka.event.LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
312. [**](../../../../akka/http/scaladsl/server/Directives$.html#withMaterializer(materializer:akka.stream.Materializer):akka.http.scaladsl.server.Directive0 "Permalink")  def withMaterializer(materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).

Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
313. [**](../../../../akka/http/scaladsl/server/Directives$.html#withPrecompressedMediaTypeSupport:akka.http.scaladsl.server.Directive0 "Permalink")  def withPrecompressedMediaTypeSupport: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Inspects the response entity and adds a `Content-Encoding: gzip` response header if
the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

Inspects the response entity and adds a `Content-Encoding: gzip` response header if
the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

Definition Classes[CodingDirectives](directives/CodingDirectives.html)
314. [**](../../../../akka/http/scaladsl/server/Directives$.html#withRangeSupport:akka.http.scaladsl.server.Directive0 "Permalink")  def withRangeSupport: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Answers GET requests with an `Accept-Ranges: bytes` header and converts HttpResponses coming back from its inner
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

Definition Classes[RangeDirectives](directives/RangeDirectives.html)See also<https://tools.ietf.org/html/rfc7233>
315. [**](../../../../akka/http/scaladsl/server/Directives$.html#withRequestTimeout(timeout:scala.concurrent.duration.Duration,handler:Option[akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpResponse]):akka.http.scaladsl.server.Directive0 "Permalink")  def withRequestTimeout(timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), handler: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([HttpRequest](../model/HttpRequest.html)) \=\> [HttpResponse](../model/HttpResponse.html)]): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Tries to set a new request timeout and handler (if provided) at the same time.

Tries to set a new request timeout and handler (if provided) at the same time.

Due to the inherent raciness it is not guaranteed that the update will be applied before
the previously set timeout has expired!

handleroptional custom "timeout response" function. If left None, the default timeout HttpResponse will be used.

Definition Classes[TimeoutDirectives](directives/TimeoutDirectives.html)
316. [**](../../../../akka/http/scaladsl/server/Directives$.html#withRequestTimeout(timeout:scala.concurrent.duration.Duration,handler:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpResponse):akka.http.scaladsl.server.Directive0 "Permalink")  def withRequestTimeout(timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), handler: ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpResponse](../model/HttpResponse.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Tries to set a new request timeout and handler (if provided) at the same time.

Tries to set a new request timeout and handler (if provided) at the same time.

Due to the inherent raciness it is not guaranteed that the update will be applied before
the previously set timeout has expired!

handleroptional custom "timeout response" function. If left None, the default timeout HttpResponse will be used.

Definition Classes[TimeoutDirectives](directives/TimeoutDirectives.html)
317. [**](../../../../akka/http/scaladsl/server/Directives$.html#withRequestTimeout(timeout:scala.concurrent.duration.Duration):akka.http.scaladsl.server.Directive0 "Permalink")  def withRequestTimeout(timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Tries to set a new request timeout and handler (if provided) at the same time.

Tries to set a new request timeout and handler (if provided) at the same time.

Due to the inherent raciness it is not guaranteed that the update will be applied before
the previously set timeout has expired!

Definition Classes[TimeoutDirectives](directives/TimeoutDirectives.html)
318. [**](../../../../akka/http/scaladsl/server/Directives$.html#withRequestTimeoutResponse(handler:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpResponse):akka.http.scaladsl.server.Directive0 "Permalink")  def withRequestTimeoutResponse(handler: ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpResponse](../model/HttpResponse.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Tries to set a new request timeout handler, which produces the timeout response for a
given request.

Tries to set a new request timeout handler, which produces the timeout response for a
given request. Note that the handler must produce the response synchronously and shouldn't block!

Due to the inherent raciness it is not guaranteed that the update will be applied before
the previously set timeout has expired!

Definition Classes[TimeoutDirectives](directives/TimeoutDirectives.html)
319. [**](../../../../akka/http/scaladsl/server/Directives$.html#withSettings(settings:akka.http.scaladsl.settings.RoutingSettings):akka.http.scaladsl.server.Directive0 "Permalink")  def withSettings(settings: [RoutingSettings](../settings/RoutingSettings.html)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs its inner route with the given alternative RoutingSettings.

Runs its inner route with the given alternative RoutingSettings.

Definition Classes[BasicDirectives](directives/BasicDirectives.html)
320. [**](../../../../akka/http/scaladsl/server/Directives$.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.server.Directive0 "Permalink")  def withSizeLimit(maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Fails the stream with [akka.http.scaladsl.model.EntityStreamSizeException](../model/EntityStreamSizeException.html) if its request entity size exceeds
given limit.

Fails the stream with [akka.http.scaladsl.model.EntityStreamSizeException](../model/EntityStreamSizeException.html) if its request entity size exceeds
given limit. Limit given as parameter overrides limit configured with `akka.http.parsing.max-content-length`.

Beware that request entity size check is executed when entity is consumed.

Definition Classes[MiscDirectives](directives/MiscDirectives.html)
321. [**](../../../../akka/http/scaladsl/server/Directives$.html#withoutRequestTimeout:akka.http.scaladsl.server.Directive0 "Permalink")  def withoutRequestTimeout: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[TimeoutDirectives](directives/TimeoutDirectives.html)
322. [**](../../../../akka/http/scaladsl/server/Directives$.html#withoutSizeLimit:akka.http.scaladsl.server.Directive0 "Permalink")  def withoutSizeLimit: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Disables the size limit (configured by `akka.http.parsing.max-content-length` by default) checking on the incoming
HttpRequest entity.

Disables the size limit (configured by `akka.http.parsing.max-content-length` by default) checking on the incoming
HttpRequest entity.
Can be useful when handling arbitrarily large data uploads in specific parts of your routes.

Definition Classes[MiscDirectives](directives/MiscDirectives.html)NoteUsage of `withoutSizeLimit` is not recommended as it turns off the too large payload protection. Therefore,
 we highly encourage using `withSizeLimit` instead, providing it with a value high enough to successfully
 handle the route in need of big entities.
323. [**](../../../../akka/http/scaladsl/server/PathMatchers$HexIntNumber$.html "Permalink")  object [HexIntNumber](PathMatchers$HexIntNumber$.html "A PathMatcher that efficiently matches a number of hex-digits and extracts their (non-negative) Int value.") extends [NumberMatcher](PathMatchers$NumberMatcher.html)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Int value.

A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Int value.
The matcher will not match 0 digits or a sequence of digits that would represent an Int value larger
than Int.MaxValue.

Definition Classes[PathMatchers](PathMatchers.html)
324. [**](../../../../akka/http/scaladsl/server/PathMatchers$HexLongNumber$.html "Permalink")  object [HexLongNumber](PathMatchers$HexLongNumber$.html "A PathMatcher that efficiently matches a number of hex-digits and extracts their (non-negative) Long value.") extends [NumberMatcher](PathMatchers$NumberMatcher.html)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Long value.

A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Long value.
The matcher will not match 0 digits or a sequence of digits that would represent an Long value larger
than Long.MaxValue.

Definition Classes[PathMatchers](PathMatchers.html)
325. [**](../../../../akka/http/scaladsl/server/PathMatchers$IntNumber$.html "Permalink")  object [IntNumber](PathMatchers$IntNumber$.html "A PathMatcher that efficiently matches a number of digits and extracts their (non-negative) Int value.") extends [NumberMatcher](PathMatchers$NumberMatcher.html)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Int value.

A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Int value.
The matcher will not match 0 digits or a sequence of digits that would represent an Int value larger
than Int.MaxValue.

Definition Classes[PathMatchers](PathMatchers.html)
326. [**](../../../../akka/http/scaladsl/server/PathMatchers$LongNumber$.html "Permalink")  object [LongNumber](PathMatchers$LongNumber$.html "A PathMatcher that efficiently matches a number of digits and extracts their (non-negative) Long value.") extends [NumberMatcher](PathMatchers$NumberMatcher.html)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Long value.

A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Long value.
The matcher will not match 0 digits or a sequence of digits that would represent an Long value larger
than Long.MaxValue.

Definition Classes[PathMatchers](PathMatchers.html)
327. [**](../../../../akka/http/scaladsl/server/PathMatchers$PathEnd$.html "Permalink")  object [PathEnd](PathMatchers$PathEnd$.html "A PathMatcher that matches the very end of the requests URI path.") extends [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that matches the very end of the requests URI path.

A PathMatcher that matches the very end of the requests URI path.

Definition Classes[PathMatchers](PathMatchers.html)
328. [**](../../../../akka/http/scaladsl/server/PathMatchers$Remaining$.html "Permalink")  object [Remaining](PathMatchers$Remaining$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path as an (encoded!) String.") extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path as an (encoded!) String.

A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path as an (encoded!) String.
If you need access to the remaining unencoded elements of the path
use the `RemainingPath` matcher!

Definition Classes[PathMatchers](PathMatchers.html)
329. [**](../../../../akka/http/scaladsl/server/PathMatchers$RemainingPath$.html "Permalink")  object [RemainingPath](PathMatchers$RemainingPath$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path.") extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[Path](../model/Uri$$Path.html)]A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path.

A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path.

Definition Classes[PathMatchers](PathMatchers.html)
330. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html "Permalink")  object [Segment](PathMatchers$Segment$.html "A PathMatcher that matches if the unmatched path starts with a path segment.") extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]A PathMatcher that matches if the unmatched path starts with a path segment.

A PathMatcher that matches if the unmatched path starts with a path segment.
If so the path segment is extracted as a String.

Definition Classes[PathMatchers](PathMatchers.html)
331. [**](../../../../akka/http/scaladsl/server/PathMatchers$Slash$.html "Permalink")  object [Slash](PathMatchers$Slash$.html "A PathMatcher that matches a single slash character ('/').") extends [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that matches a single slash character ('/').

A PathMatcher that matches a single slash character ('/').

Definition Classes[PathMatchers](PathMatchers.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/Directives$.html#extractUpgradeToWebSocket:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.ws.UpgradeToWebSocket] "Permalink")  def extractUpgradeToWebSocket: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[UpgradeToWebSocket](../model/ws/UpgradeToWebSocket.html)]Extract the UpgradeToWebSocket header if existent.

Extract the UpgradeToWebSocket header if existent. Rejects with an [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html), otherwise.

Definition Classes[WebSocketDirectives](directives/WebSocketDirectives.html)Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* use `extractWebSocketUpgrade` instead
2. [**](../../../../akka/http/scaladsl/server/Directives$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../../akka/http/scaladsl/server/Directives$.html#headerValueByName(headerName:Symbol):akka.http.scaladsl.server.Directive1[String] "Permalink")  def headerValueByName(headerName: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol)): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]Extracts the value of the first HTTP request header with the given name.

Extracts the value of the first HTTP request header with the given name.
If no header with a matching name is found the request is rejected with a [akka.http.scaladsl.server.MissingHeaderRejection](MissingHeaderRejection.html).

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use string argument version or `headerValueByType`, e.g. instead of `headerValueByName('Referer)` use `headerValueByType(Referer)`
4. [**](../../../../akka/http/scaladsl/server/Directives$.html#optionalHeaderValueByName(headerName:Symbol):akka.http.scaladsl.server.Directive1[Option[String]] "Permalink")  def optionalHeaderValueByName(headerName: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol)): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]]Extracts the value of the optional HTTP request header with the given name.

Extracts the value of the optional HTTP request header with the given name.

Definition Classes[HeaderDirectives](directives/HeaderDirectives.html)Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use string argument version or `headerValueByType`, e.g. instead of `optionalHeaderValueByName('Referer)` use `optionalHeaderValueByType(Referer)`
### Inherited from [Directives](Directives.html)

### Inherited from [TlsDirectives](directives/TlsDirectives.html)

### Inherited from [CorsDirectives](directives/CorsDirectives.html)

### Inherited from [AttributeDirectives](directives/AttributeDirectives.html)

### Inherited from [FramedEntityStreamingDirectives](directives/FramedEntityStreamingDirectives.html)

### Inherited from [WebSocketDirectives](directives/WebSocketDirectives.html)

### Inherited from [SecurityDirectives](directives/SecurityDirectives.html)

### Inherited from [SchemeDirectives](directives/SchemeDirectives.html)

### Inherited from [RouteDirectives](directives/RouteDirectives.html)

### Inherited from [RespondWithDirectives](directives/RespondWithDirectives.html)

### Inherited from [RangeDirectives](directives/RangeDirectives.html)

### Inherited from [PathDirectives](directives/PathDirectives.html)

### Inherited from [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)

### Inherited from [PathMatchers](PathMatchers.html)

### Inherited from [TimeoutDirectives](directives/TimeoutDirectives.html)

### Inherited from [ParameterDirectives](directives/ParameterDirectives.html)

### Inherited from [ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html)

### Inherited from [MiscDirectives](directives/MiscDirectives.html)

### Inherited from [MethodDirectives](directives/MethodDirectives.html)

### Inherited from [MarshallingDirectives](directives/MarshallingDirectives.html)

### Inherited from [HostDirectives](directives/HostDirectives.html)

### Inherited from [HeaderDirectives](directives/HeaderDirectives.html)

### Inherited from [FutureDirectives](directives/FutureDirectives.html)

### Inherited from [FormFieldDirectives](directives/FormFieldDirectives.html)

### Inherited from ToNameReceptacleEnhancements

### Inherited from [FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html)

### Inherited from [FileUploadDirectives](directives/FileUploadDirectives.html)

### Inherited from [FileAndResourceDirectives](directives/FileAndResourceDirectives.html)

### Inherited from [ExecutionDirectives](directives/ExecutionDirectives.html)

### Inherited from [CodingDirectives](directives/CodingDirectives.html)

### Inherited from [DebuggingDirectives](directives/DebuggingDirectives.html)

### Inherited from [CookieDirectives](directives/CookieDirectives.html)

### Inherited from [CacheConditionDirectives](directives/CacheConditionDirectives.html)

### Inherited from [BasicDirectives](directives/BasicDirectives.html)

### Inherited from [RouteConcatenation](RouteConcatenation.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Basic directives

### Cache condition directives

### Cookie directives

### Debugging directives

### Coding directives

### Execution directives

### File and resource directives

### File upload directives

### Form field directives

### Future directives

### Header directives

### Host directives

### Attribute directives

### Marshalling directives

### Method directives

### Miscellaneous directives

### Parameter directives

### Timeout directives

### Path directives

### Path matchers

### Path matcher implicits

### Range directives

### Response directives

### Route directives

### Scheme directives

### Security directives

### WebSocket directives

### Route concatenation

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCodes$$Redirection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/EntityTag.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpOriginRange$$Default.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/Language.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/AuthorizationFailedRejection$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives$.html)*
---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](../client/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package serverDefinition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](directives/index.html)
- [**](../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](util/index.html)
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
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[scaladsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# server[**](../../../../akka/http/scaladsl/server/index.html "Permalink")

#### package server

Source[package.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/package.scala#L9)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. server
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](directives/index.html)
2. [**](../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](util/index.html)
### Type Members

1. [**](../../../../akka/http/scaladsl/server/AuthenticationFailedRejection.html "Permalink") final  case class [AuthenticationFailedRejection](AuthenticationFailedRejection.html "Rejection created by the various akka.http.scaladsl.server.directives.SecurityDirectives.")(cause: [Cause](AuthenticationFailedRejection$$Cause.html), challenge: [HttpChallenge](../model/headers/HttpChallenge.html)) extends [javadsl.server.AuthenticationFailedRejection](../../javadsl/server/AuthenticationFailedRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by the various [akka.http.scaladsl.server.directives.SecurityDirectives](directives/SecurityDirectives.html).

Rejection created by the various [akka.http.scaladsl.server.directives.SecurityDirectives](directives/SecurityDirectives.html).
Signals that the request was rejected because the user could not be authenticated. The reason for the rejection is
specified in the cause.
2. [**](../../../../akka/http/scaladsl/server/CharsetNegotiator.html "Permalink") final  class [CharsetNegotiator](CharsetNegotiator.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/http/scaladsl/server/CircuitBreakerOpenRejection.html "Permalink") final  case class [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "Rejection created by the onCompleteWithBreaker directive.")(cause: [CircuitBreakerOpenException](https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreakerOpenException.html#akka.pattern.CircuitBreakerOpenException)) extends [javadsl.server.CircuitBreakerOpenRejection](../../javadsl/server/CircuitBreakerOpenRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by the `onCompleteWithBreaker` directive.

Rejection created by the `onCompleteWithBreaker` directive.
Signals that the request was rejected because the supplied circuit breaker is open and requests are failing fast.
4. [**](../../../../akka/http/scaladsl/server/ConjunctionMagnet.html "Permalink")  trait [ConjunctionMagnet](ConjunctionMagnet.html)\[L] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../../akka/http/scaladsl/server/ContentNegotiator.html "Permalink") final  class [ContentNegotiator](ContentNegotiator.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../../../akka/http/scaladsl/server/CorsRejection.html "Permalink") final  case class [CorsRejection](CorsRejection.html "Rejection created by the CORS directives.")(description: String) extends [javadsl.server.CorsRejection](../../javadsl/server/CorsRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by the CORS directives.
7. [**](../../../../akka/http/scaladsl/server/Directive.html "Permalink") abstract  class [Directive](Directive.html "A directive that provides a tuple of values of type L to create an inner route.")\[L] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A directive that provides a tuple of values of type `L` to create an inner route.
8. [**](../../../../akka/http/scaladsl/server/index.html#Directive0=akka.http.scaladsl.server.Directive[Unit] "Permalink")  type Directive0 \= [Directive](Directive.html)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
9. [**](../../../../akka/http/scaladsl/server/index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)] "Permalink")  type Directive1\[T] \= [Directive](Directive.html)\[(T)]
10. [**](../../../../akka/http/scaladsl/server/Directives.html "Permalink")  trait [Directives](Directives.html "Collects all default directives into one trait for simple importing.") extends [RouteConcatenation](RouteConcatenation.html) with [BasicDirectives](directives/BasicDirectives.html) with [CacheConditionDirectives](directives/CacheConditionDirectives.html) with [CookieDirectives](directives/CookieDirectives.html) with [DebuggingDirectives](directives/DebuggingDirectives.html) with [CodingDirectives](directives/CodingDirectives.html) with [ExecutionDirectives](directives/ExecutionDirectives.html) with [FileAndResourceDirectives](directives/FileAndResourceDirectives.html) with [FileUploadDirectives](directives/FileUploadDirectives.html) with [FormFieldDirectives](directives/FormFieldDirectives.html) with [FutureDirectives](directives/FutureDirectives.html) with [HeaderDirectives](directives/HeaderDirectives.html) with [HostDirectives](directives/HostDirectives.html) with [MarshallingDirectives](directives/MarshallingDirectives.html) with [MethodDirectives](directives/MethodDirectives.html) with [MiscDirectives](directives/MiscDirectives.html) with [ParameterDirectives](directives/ParameterDirectives.html) with [TimeoutDirectives](directives/TimeoutDirectives.html) with [PathDirectives](directives/PathDirectives.html) with [RangeDirectives](directives/RangeDirectives.html) with [RespondWithDirectives](directives/RespondWithDirectives.html) with [RouteDirectives](directives/RouteDirectives.html) with [SchemeDirectives](directives/SchemeDirectives.html) with [SecurityDirectives](directives/SecurityDirectives.html) with [WebSocketDirectives](directives/WebSocketDirectives.html) with [FramedEntityStreamingDirectives](directives/FramedEntityStreamingDirectives.html) with [AttributeDirectives](directives/AttributeDirectives.html) with [CorsDirectives](directives/CorsDirectives.html) with [TlsDirectives](directives/TlsDirectives.html)Collects all default directives into one trait for simple importing.

Collects all default directives into one trait for simple importing.

See [akka.http.javadsl.server.AllDirectives](../../javadsl/server/AllDirectives.html) for JavaDSL equivalent of this trait.
11. [**](../../../../akka/http/scaladsl/server/EncodingNegotiator.html "Permalink") final  class [EncodingNegotiator](EncodingNegotiator.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html "Permalink")  trait [ExceptionHandler](ExceptionHandler.html) extends [PF](ExceptionHandler$.html#PF=PartialFunction[Throwable,akka.http.scaladsl.server.Route])
13. [**](../../../../akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html "Permalink")  trait [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
14. [**](../../../../akka/http/scaladsl/server/InvalidOriginRejection.html "Permalink") final  case class [InvalidOriginRejection](InvalidOriginRejection.html "Rejection created by akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin.")(allowedOrigins: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpOrigin](../model/headers/HttpOrigin.html)]) extends [javadsl.server.InvalidOriginRejection](../../javadsl/server/InvalidOriginRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by [akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin](directives/HeaderDirectives$.html#checkSameOrigin(allowed:akka.http.scaladsl.model.headers.HttpOriginRange.Default):akka.http.scaladsl.server.Directive0).

Rejection created by [akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin](directives/HeaderDirectives$.html#checkSameOrigin(allowed:akka.http.scaladsl.model.headers.HttpOriginRange.Default):akka.http.scaladsl.server.Directive0).
Signals that the request was rejected because `Origin` header value is invalid.
15. [**](../../../../akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html "Permalink") final  case class [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "Rejection created by parameter filters.")(parameterName: String, expectedValue: String, actualValue: String) extends [javadsl.server.InvalidRequiredValueForQueryParamRejection](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by parameter filters.

Rejection created by parameter filters.
Signals that the request was rejected because a query parameter value was not equal to required one.
16. [**](../../../../akka/http/scaladsl/server/LanguageNegotiator.html "Permalink") final  class [LanguageNegotiator](LanguageNegotiator.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
17. [**](../../../../akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html "Permalink") sealed abstract  class [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
18. [**](../../../../akka/http/scaladsl/server/LowerPriorityRoutingLogImplicits.html "Permalink") sealed abstract  class [LowerPriorityRoutingLogImplicits](LowerPriorityRoutingLogImplicits.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
19. [**](../../../../akka/http/scaladsl/server/MalformedFormFieldRejection.html "Permalink") final  case class [MalformedFormFieldRejection](MalformedFormFieldRejection.html "Rejection created by form field filters.")(fieldName: String, errorMsg: String, cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable] \= None) extends [javadsl.server.MalformedFormFieldRejection](../../javadsl/server/MalformedFormFieldRejection.html) with [RejectionWithOptionalCause](RejectionWithOptionalCause.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by form field filters.

Rejection created by form field filters.
Signals that the request was rejected because a form field could not be interpreted.
20. [**](../../../../akka/http/scaladsl/server/MalformedHeaderRejection.html "Permalink") final  case class [MalformedHeaderRejection](MalformedHeaderRejection.html "Rejection created by header directives.")(headerName: String, errorMsg: String, cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable] \= None) extends [javadsl.server.MalformedHeaderRejection](../../javadsl/server/MalformedHeaderRejection.html) with [RejectionWithOptionalCause](RejectionWithOptionalCause.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by header directives.

Rejection created by header directives.
Signals that the request was rejected because a header value is malformed.
21. [**](../../../../akka/http/scaladsl/server/MalformedQueryParamRejection.html "Permalink") final  case class [MalformedQueryParamRejection](MalformedQueryParamRejection.html "Rejection created by parameter filters.")(parameterName: String, errorMsg: String, cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable] \= None) extends [javadsl.server.MalformedQueryParamRejection](../../javadsl/server/MalformedQueryParamRejection.html) with [RejectionWithOptionalCause](RejectionWithOptionalCause.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by parameter filters.

Rejection created by parameter filters.
Signals that the request was rejected because a query parameter could not be interpreted.
22. [**](../../../../akka/http/scaladsl/server/MalformedRequestContentRejection.html "Permalink") final  case class [MalformedRequestContentRejection](MalformedRequestContentRejection.html "Rejection created by unmarshallers.")(message: String, cause: Throwable) extends [javadsl.server.MalformedRequestContentRejection](../../javadsl/server/MalformedRequestContentRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by unmarshallers.

Rejection created by unmarshallers.
Signals that the request was rejected because unmarshalling failed with an error that wasn't
an `IllegalArgumentException`. Usually that means that the request content was not of the expected format.
Note that semantic issues with the request content (e.g. because some parameter was out of range)
will usually trigger a `ValidationRejection` instead.
23. [**](../../../../akka/http/scaladsl/server/MediaTypeNegotiator.html "Permalink") final  class [MediaTypeNegotiator](MediaTypeNegotiator.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
24. [**](../../../../akka/http/scaladsl/server/MethodRejection.html "Permalink") final  case class [MethodRejection](MethodRejection.html "Rejection created by method filters.")(supported: [HttpMethod](../model/HttpMethod.html)) extends [javadsl.server.MethodRejection](../../javadsl/server/MethodRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by method filters.

Rejection created by method filters.
Signals that the request was rejected because the HTTP method is unsupported.
25. [**](../../../../akka/http/scaladsl/server/MissingAttributeRejection.html "Permalink") final  case class [MissingAttributeRejection](MissingAttributeRejection.html "Rejection created by attribute directives.")\[T](key: [AttributeKey](../model/AttributeKey.html)\[T]) extends [javadsl.server.MissingAttributeRejection](../../javadsl/server/MissingAttributeRejection.html)\[T] with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by attribute directives.

Rejection created by attribute directives.
Signals that the request was rejected because a required request attribute could not be found.
26. [**](../../../../akka/http/scaladsl/server/MissingCookieRejection.html "Permalink") final  case class [MissingCookieRejection](MissingCookieRejection.html "Rejection created by the cookie directive.")(cookieName: String) extends [javadsl.server.MissingCookieRejection](../../javadsl/server/MissingCookieRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by the `cookie` directive.

Rejection created by the `cookie` directive.
Signals that the request was rejected because a cookie was not found.
27. [**](../../../../akka/http/scaladsl/server/MissingFormFieldRejection.html "Permalink") final  case class [MissingFormFieldRejection](MissingFormFieldRejection.html "Rejection created by form field filters.")(fieldName: String) extends [javadsl.server.MissingFormFieldRejection](../../javadsl/server/MissingFormFieldRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by form field filters.

Rejection created by form field filters.
Signals that the request was rejected because a form field was not found.
28. [**](../../../../akka/http/scaladsl/server/MissingHeaderRejection.html "Permalink") final  case class [MissingHeaderRejection](MissingHeaderRejection.html "Rejection created by header directives.")(headerName: String) extends [javadsl.server.MissingHeaderRejection](../../javadsl/server/MissingHeaderRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by header directives.

Rejection created by header directives.
Signals that the request was rejected because a required header could not be found.
29. [**](../../../../akka/http/scaladsl/server/MissingQueryParamRejection.html "Permalink") final  case class [MissingQueryParamRejection](MissingQueryParamRejection.html "Rejection created by parameter filters.")(parameterName: String) extends [javadsl.server.MissingQueryParamRejection](../../javadsl/server/MissingQueryParamRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by parameter filters.

Rejection created by parameter filters.
Signals that the request was rejected because a query parameter was not found.
30. [**](../../../../akka/http/scaladsl/server/PathMatcher.html "Permalink") abstract  class [PathMatcher](PathMatcher.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatcher.Unmatched.")\[L] extends ([Path](../model/Uri$$Path.html)) \=\> [Matching](PathMatcher$$Matching.html)\[L]A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatcher.Unmatched.
31. [**](../../../../akka/http/scaladsl/server/index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit] "Permalink")  type PathMatcher0 \= [PathMatcher](PathMatcher.html)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
32. [**](../../../../akka/http/scaladsl/server/index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)] "Permalink")  type PathMatcher1\[T] \= [PathMatcher](PathMatcher.html)\[(T)]
33. [**](../../../../akka/http/scaladsl/server/PathMatchers.html "Permalink")  trait [PathMatchers](PathMatchers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
34. [**](../../../../akka/http/scaladsl/server/Rejection.html "Permalink")  trait [Rejection](Rejection.html "A rejection encapsulates a specific reason why a Route was not able to handle a request.") extends [javadsl.server.Rejection](../../javadsl/server/Rejection.html)A rejection encapsulates a specific reason why a Route was not able to handle a request.

A rejection encapsulates a specific reason why a Route was not able to handle a request. Rejections are gathered
up over the course of a Route evaluation and finally converted to [akka.http.scaladsl.model.HttpResponse](../model/HttpResponse.html)s by the
`handleRejections` directive, if there was no way for the request to be completed.
35. [**](../../../../akka/http/scaladsl/server/RejectionError.html "Permalink") final  case class [RejectionError](RejectionError.html "A Throwable wrapping a Rejection.")(rejection: [Rejection](Rejection.html)) extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA Throwable wrapping a Rejection.

A Throwable wrapping a Rejection.
Can be used for marshalling `Future[T]` or `Try[T]` instances, whose failure side is supposed to trigger a route
rejection rather than an Exception that is handled by the nearest ExceptionHandler.
(Custom marshallers can of course use it as well.)
36. [**](../../../../akka/http/scaladsl/server/RejectionHandler.html "Permalink")  trait [RejectionHandler](RejectionHandler.html) extends ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Route](#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])]
37. [**](../../../../akka/http/scaladsl/server/RejectionWithOptionalCause.html "Permalink")  trait [RejectionWithOptionalCause](RejectionWithOptionalCause.html) extends [Rejection](Rejection.html)
38. [**](../../../../akka/http/scaladsl/server/RequestContext.html "Permalink")  trait [RequestContext](RequestContext.html "This class is not meant to be extended by user code.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This class is not meant to be extended by user code.

This class is not meant to be extended by user code.

Immutable object encapsulating the context of an [akka.http.scaladsl.model.HttpRequest](../model/HttpRequest.html)
as it flows through a akka\-http Route structure.

Annotations@DoNotInherit()
39. [**](../../../../akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "Permalink")  type Route \= ([RequestContext](RequestContext.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]
40. [**](../../../../akka/http/scaladsl/server/RouteConcatenation.html "Permalink")  trait [RouteConcatenation](RouteConcatenation.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
41. [**](../../../../akka/http/scaladsl/server/index.html#RouteGenerator[T]=T=>akka.http.scaladsl.server.package.Route "Permalink")  type RouteGenerator\[T] \= (T) \=\> [Route](#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])
42. [**](../../../../akka/http/scaladsl/server/RouteResult.html "Permalink") sealed  trait [RouteResult](RouteResult.html "The result of handling a request.") extends [javadsl.server.RouteResult](../../javadsl/server/RouteResult.html)The result of handling a request.

The result of handling a request.

As a user you typically don't create RouteResult instances directly.
Instead, use the methods on the [RequestContext](RequestContext.html) to achieve the desired effect.
43. [**](../../../../akka/http/scaladsl/server/RoutingLog.html "Permalink")  trait [RoutingLog](RoutingLog.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
44. [**](../../../../akka/http/scaladsl/server/SchemeRejection.html "Permalink") final  case class [SchemeRejection](SchemeRejection.html "Rejection created by scheme filters.")(supported: String) extends [javadsl.server.SchemeRejection](../../javadsl/server/SchemeRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by scheme filters.

Rejection created by scheme filters.
Signals that the request was rejected because the Uri scheme is unsupported.
45. [**](../../../../akka/http/scaladsl/server/StandardRoute.html "Permalink") abstract  class [StandardRoute](StandardRoute.html "A Route that can be implicitly converted into a Directive (fitting any signature).") extends [Route](#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])A Route that can be implicitly converted into a Directive (fitting any signature).
46. [**](../../../../akka/http/scaladsl/server/TlsClientIdentityRejection.html "Permalink") final  case class [TlsClientIdentityRejection](TlsClientIdentityRejection.html)(description: String, requiredExpression: String, certificateCN: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], certificateSANs: Seq\[String]) extends [javadsl.server.TlsClientIdentityRejection](../../javadsl/server/TlsClientIdentityRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
47. [**](../../../../akka/http/scaladsl/server/TlsClientUnverifiedRejection.html "Permalink") final  case class [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html)(description: String) extends [javadsl.server.TlsClientUnverifiedRejection](../../javadsl/server/TlsClientUnverifiedRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
48. [**](../../../../akka/http/scaladsl/server/TooManyRangesRejection.html "Permalink") final  case class [TooManyRangesRejection](TooManyRangesRejection.html "Rejection created by range directives.")(maxRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [javadsl.server.TooManyRangesRejection](../../javadsl/server/TooManyRangesRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by range directives.

Rejection created by range directives.
Signals that the request contains too many ranges. An irregular high number of ranges
indicates a broken client or a denial of service attack.
49. [**](../../../../akka/http/scaladsl/server/TransformationRejection.html "Permalink") final  case class [TransformationRejection](TransformationRejection.html "A special Rejection that serves as a container for a transformation function on rejections.")(transform: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) extends [javadsl.server.TransformationRejection](../../javadsl/server/TransformationRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA special Rejection that serves as a container for a transformation function on rejections.

A special Rejection that serves as a container for a transformation function on rejections.
It is used by some directives to "cancel" rejections that are added by later directives of a similar type.

Consider this route structure for example:

```
put { reject(ValidationRejection("no") } ~ get { ... }
```
If this structure is applied to a PUT request the list of rejections coming back contains three elements:

1\. A ValidationRejection
2\. A MethodRejection
3\. A TransformationRejection holding a function filtering out the MethodRejection

so that in the end the RejectionHandler will only see one rejection (the ValidationRejection), because the
MethodRejection added by the `get` directive is canceled by the `put` directive (since the HTTP method
did indeed match eventually).
50. [**](../../../../akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection.html "Permalink") final  case class [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "Rejection created by marshallers.")(supported: Set\[[Alternative](ContentNegotiator$$Alternative.html)]) extends [javadsl.server.UnacceptedResponseContentTypeRejection](../../javadsl/server/UnacceptedResponseContentTypeRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by marshallers.

Rejection created by marshallers.
Signals that the request was rejected because the service is not capable of producing a response entity whose
content type is accepted by the client
51. [**](../../../../akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html "Permalink") final  case class [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "Rejection created by encoding filters.")(supported: Set\[[HttpEncoding](../model/headers/HttpEncoding.html)]) extends [javadsl.server.UnacceptedResponseEncodingRejection](../../javadsl/server/UnacceptedResponseEncodingRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by encoding filters.

Rejection created by encoding filters.
Signals that the request was rejected because the service is not capable of producing a response entity whose
content encoding is accepted by the client
52. [**](../../../../akka/http/scaladsl/server/UnsatisfiableRangeRejection.html "Permalink") final  case class [UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "Rejection created by range directives.")(unsatisfiableRanges: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ByteRange](../model/headers/ByteRange.html)], actualEntityLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [javadsl.server.UnsatisfiableRangeRejection](../../javadsl/server/UnsatisfiableRangeRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by range directives.

Rejection created by range directives.
Signals that the request was rejected because the requests contains only unsatisfiable ByteRanges.
The actualEntityLength gives the client a hint to create satisfiable ByteRanges.
53. [**](../../../../akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html "Permalink") final  class [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "Rejection created by unmarshallers.") extends [javadsl.server.UnsupportedRequestContentTypeRejection](../../javadsl/server/UnsupportedRequestContentTypeRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by unmarshallers.

Rejection created by unmarshallers.
Signals that the request was rejected because the requests content\-type is unsupported.
54. [**](../../../../akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html "Permalink") final  case class [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "Rejection created by decoding filters.")(supported: [HttpEncoding](../model/headers/HttpEncoding.html)) extends [javadsl.server.UnsupportedRequestEncodingRejection](../../javadsl/server/UnsupportedRequestEncodingRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by decoding filters.

Rejection created by decoding filters.
Signals that the request was rejected because the requests content encoding is unsupported.
55. [**](../../../../akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "Permalink") final  case class [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "Rejection created when a websocket request was not handled because none of the given subprotocols was supported.")(supportedProtocol: String) extends [javadsl.server.UnsupportedWebSocketSubprotocolRejection](../../javadsl/server/UnsupportedWebSocketSubprotocolRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created when a websocket request was not handled because none of the given subprotocols
was supported.
56. [**](../../../../akka/http/scaladsl/server/ValidationRejection.html "Permalink") final  case class [ValidationRejection](ValidationRejection.html "Rejection created by the validation directive as well as for IllegalArgumentExceptions thrown by domain model constructors (e.g.")(message: String, cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable] \= None) extends [javadsl.server.ValidationRejection](../../javadsl/server/ValidationRejection.html) with [RejectionWithOptionalCause](RejectionWithOptionalCause.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by the `validation` directive as well as for `IllegalArgumentExceptions`
thrown by domain model constructors (e.g.

Rejection created by the `validation` directive as well as for `IllegalArgumentExceptions`
thrown by domain model constructors (e.g. via `require`).
It signals that an expected value was semantically invalid.
### Deprecated Type Members

1. [**](../../../../akka/http/scaladsl/server/HttpApp.html "Permalink") abstract  class [HttpApp](HttpApp.html "DEPRECATED, consider https://doc.akka.io/docs/akka-http/current/quickstart-scala/ instead") extends [Directives](Directives.html)DEPRECATED, consider https://doc.akka.io/docs/akka\-http/current/quickstart\-scala/ instead

DEPRECATED, consider https://doc.akka.io/docs/akka\-http/current/quickstart\-scala/ instead

Bootstrap trait for Http Server. It helps booting up an akka\-http server by only defining the desired routes.
It offers additional hooks to modify the default behavior.

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* HttpApp this doesn't reflect the latest Akka APIs
### Value Members

1. [**](../../../../akka/http/scaladsl/server/index.html#FIXME:Nothing "Permalink")  def FIXME: [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)
2. [**](../../../../akka/http/scaladsl/server/AuthenticationFailedRejection$.html "Permalink")  object [AuthenticationFailedRejection](AuthenticationFailedRejection$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
3. [**](../../../../akka/http/scaladsl/server/AuthorizationFailedRejection$.html "Permalink")  case object [AuthorizationFailedRejection](AuthorizationFailedRejection$.html "Rejection created by the 'authorize' directive.") extends [javadsl.server.AuthorizationFailedRejection](../../javadsl/server/AuthorizationFailedRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by the 'authorize' directive.

Rejection created by the 'authorize' directive.
Signals that the request was rejected because the user is not authorized.
4. [**](../../../../akka/http/scaladsl/server/ConjunctionMagnet$.html "Permalink")  object [ConjunctionMagnet](ConjunctionMagnet$.html)
5. [**](../../../../akka/http/scaladsl/server/ContentNegotiator$.html "Permalink")  object [ContentNegotiator](ContentNegotiator$.html)
6. [**](../../../../akka/http/scaladsl/server/Directive$.html "Permalink")  object [Directive](Directive$.html)
7. [**](../../../../akka/http/scaladsl/server/Directives$.html "Permalink")  object [Directives](Directives$.html "Collects all default directives into one object for simple importing.") extends [Directives](Directives.html)Collects all default directives into one object for simple importing.

Collects all default directives into one object for simple importing.

See [akka.http.javadsl.server.Directives](../../javadsl/server/Directives$.html) for JavaDSL equivalent of this trait.
8. [**](../../../../akka/http/scaladsl/server/EncodingNegotiator$.html "Permalink")  object [EncodingNegotiator](EncodingNegotiator$.html)
9. [**](../../../../akka/http/scaladsl/server/ExceptionHandler$.html "Permalink")  object [ExceptionHandler](ExceptionHandler$.html)
10. [**](../../../../akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "Permalink")  case object [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html "Rejection created when a websocket request was expected but none was found.") extends [javadsl.server.ExpectedWebSocketRequestRejection](../../javadsl/server/ExpectedWebSocketRequestRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created when a websocket request was expected but none was found.
11. [**](../../../../akka/http/scaladsl/server/LanguageNegotiator$.html "Permalink")  object [LanguageNegotiator](LanguageNegotiator$.html)
12. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html "Permalink")  object [PathMatcher](PathMatcher$.html) extends [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
13. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html "Permalink")  object [PathMatchers](PathMatchers$.html) extends [PathMatchers](PathMatchers.html)
14. [**](../../../../akka/http/scaladsl/server/RejectionHandler$.html "Permalink")  object [RejectionHandler](RejectionHandler$.html)
15. [**](../../../../akka/http/scaladsl/server/RequestEntityExpectedRejection$.html "Permalink")  case object [RequestEntityExpectedRejection](RequestEntityExpectedRejection$.html "Rejection created by unmarshallers.") extends [javadsl.server.RequestEntityExpectedRejection](../../javadsl/server/RequestEntityExpectedRejection.html) with [Rejection](Rejection.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRejection created by unmarshallers.

Rejection created by unmarshallers.
Signals that the request was rejected because an message body entity was expected but not supplied.
16. [**](../../../../akka/http/scaladsl/server/Route$.html "Permalink")  object [Route](Route$.html)
17. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$.html "Permalink")  object [RouteConcatenation](RouteConcatenation$.html) extends [RouteConcatenation](RouteConcatenation.html)
18. [**](../../../../akka/http/scaladsl/server/RouteResult$.html "Permalink")  object [RouteResult](RouteResult$.html) extends [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html)
19. [**](../../../../akka/http/scaladsl/server/RoutingLog$.html "Permalink")  object [RoutingLog](RoutingLog$.html) extends [LowerPriorityRoutingLogImplicits](LowerPriorityRoutingLogImplicits.html)
20. [**](../../../../akka/http/scaladsl/server/StandardRoute$.html "Permalink")  object [StandardRoute](StandardRoute$.html)
21. [**](../../../../akka/http/scaladsl/server/UnacceptedResponseEncodingRejection$.html "Permalink")  object [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
22. [**](../../../../akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection$.html "Permalink")  object [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection$.html) extends [AbstractFunction1](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction1.html#scala.runtime.AbstractFunction1)\[Set\[[ContentTypeRange](../model/ContentTypeRange.html)], [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AllDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AuthorizationFailedRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/CorsRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/InvalidOriginRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MissingAttributeRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MissingCookieRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/MissingQueryParamRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/RequestEntityExpectedRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/SchemeRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/TlsClientIdentityRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/TlsClientUnverifiedRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/TooManyRangesRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/TransformationRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/UnacceptedResponseContentTypeRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/UnsatisfiableRangeRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/ValidationRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html)*
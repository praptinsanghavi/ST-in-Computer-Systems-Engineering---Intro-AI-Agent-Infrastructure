---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/server/index.html "Permalink")  package serverDefinition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/server/directives/index.html "Permalink")  package [directives](directives/index.html)
- [AllDirectives](AllDirectives.html)
- [AuthenticationFailedRejection](AuthenticationFailedRejection.html "Rejection created by the various akka.http.javadsl.server.directives.SecurityDirectives.")
- [AuthorizationFailedRejection](AuthorizationFailedRejection.html "Rejection created by the 'authorize' directive.")
- [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "Rejection created by the onCompleteWithBreaker directive.")
- [Complete](Complete.html)
- [CorsRejection](CorsRejection.html "Not for user extension")
- [CustomRejection](CustomRejection.html "To be extended by user-provided custom rejections, such that they may be consumed in either Java or Scala DSLs.")
- [Directives](Directives$.html "Collects all default directives into one class for simple importing of static functions.")
- [ExceptionHandler](ExceptionHandler.html "Handles exceptions by turning them into routes.")
- [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html)
- [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection.html "Rejection created when a websocket request was expected but none was found.")
- [HttpApp](HttpApp.html "DEPRECATED, consider https://doc.akka.io/docs/akka-http/current/quickstart-java/ instead")
- [InvalidOriginRejection](InvalidOriginRejection.html "Rejection created by akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin.")
- [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "Rejection created by parameter filters.")
- [JavaPathMatchers](JavaPathMatchers$.html)
- [MalformedFormFieldRejection](MalformedFormFieldRejection.html "Rejection created by form field filters.")
- [MalformedHeaderRejection](MalformedHeaderRejection.html "Rejection created by header directives.")
- [MalformedQueryParamRejection](MalformedQueryParamRejection.html "Rejection created by parameter filters.")
- [MalformedRequestContentRejection](MalformedRequestContentRejection.html "Rejection created by unmarshallers.")
- [MethodRejection](MethodRejection.html "Rejection created by method filters.")
- [MissingAttributeRejection](MissingAttributeRejection.html "Rejection created by attribute directives.")
- [MissingCookieRejection](MissingCookieRejection.html "Rejection created by the cookie directive.")
- [MissingFormFieldRejection](MissingFormFieldRejection.html "Rejection created by form field filters.")
- [MissingHeaderRejection](MissingHeaderRejection.html "Rejection created by header directives.")
- [MissingQueryParamRejection](MissingQueryParamRejection.html "Rejection created by parameter filters.")
- [PathMatcher0](PathMatcher0.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher1](PathMatcher1.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher10](PathMatcher10.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher11](PathMatcher11.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher12](PathMatcher12.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher13](PathMatcher13.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher14](PathMatcher14.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher15](PathMatcher15.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher16](PathMatcher16.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher17](PathMatcher17.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher18](PathMatcher18.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher19](PathMatcher19.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher2](PathMatcher2.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher20](PathMatcher20.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher21](PathMatcher21.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher22](PathMatcher22.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher3](PathMatcher3.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher4](PathMatcher4.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher5](PathMatcher5.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher6](PathMatcher6.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher7](PathMatcher7.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher8](PathMatcher8.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher9](PathMatcher9.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatchers](PathMatchers.html)
- [Rejected](Rejected.html)
- [Rejection](Rejection.html "A rejection encapsulates a specific reason why a Route was not able to handle a request.")
- [RejectionError](RejectionError.html "A Throwable wrapping a Rejection.")
- [RejectionHandler](RejectionHandler.html)
- [RejectionHandlerBuilder](RejectionHandlerBuilder.html)
- [Rejections](Rejections$.html)
- [RequestContext](RequestContext.html)
- [RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "Rejection created by unmarshallers.")
- [Route](Route.html "In the Java DSL, a Route can only consist of combinations of the built-in directives.")
- [RouteResult](RouteResult.html)
- [RouteResults](RouteResults$.html)
- [SchemeRejection](SchemeRejection.html "Rejection created by scheme filters.")
- [TlsClientIdentityRejection](TlsClientIdentityRejection.html "Not for user extension")
- [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html "Not for user extension")
- [TooManyRangesRejection](TooManyRangesRejection.html "Rejection created by range directives.")
- [TransformationRejection](TransformationRejection.html "A special Rejection that serves as a container for a transformation function on rejections.")
- [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "Rejection created by marshallers.")
- [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "Rejection created by encoding filters.")
- [UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "Rejection created by range directives.")
- [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "Rejection created by unmarshallers.")
- [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "Rejection created by decoding filters.")
- [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "Rejection created when a websocket request was not handled because none of the given subprotocols was supported.")
- [ValidationRejection](ValidationRejection.html "Rejection created by the validation directive as well as for IllegalArgumentExceptions thrown by domain model constructors (e.g.")
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[javadsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html)

# server[**](../../../../akka/http/javadsl/server/index.html "Permalink")

#### package server

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/http/javadsl/server/directives/index.html "Permalink")  package [directives](directives/index.html)
### Type Members

1. [**](../../../../akka/http/javadsl/server/AllDirectives.html "Permalink") abstract  class [AllDirectives](AllDirectives.html) extends [TlsDirectives](directives/TlsDirectives.html)
2. [**](../../../../akka/http/javadsl/server/AuthenticationFailedRejection.html "Permalink")  trait [AuthenticationFailedRejection](AuthenticationFailedRejection.html "Rejection created by the various akka.http.javadsl.server.directives.SecurityDirectives.") extends [Rejection](Rejection.html)Rejection created by the various [akka.http.javadsl.server.directives.SecurityDirectives](directives/SecurityDirectives.html).

Rejection created by the various [akka.http.javadsl.server.directives.SecurityDirectives](directives/SecurityDirectives.html).
Signals that the request was rejected because the user could not be authenticated. The reason for the rejection is
specified in the cause.

Annotations@DoNotInherit()
3. [**](../../../../akka/http/javadsl/server/AuthorizationFailedRejection.html "Permalink")  trait [AuthorizationFailedRejection](AuthorizationFailedRejection.html "Rejection created by the 'authorize' directive.") extends [Rejection](Rejection.html)Rejection created by the 'authorize' directive.

Rejection created by the 'authorize' directive.
Signals that the request was rejected because the user is not authorized.

Annotations@DoNotInherit()
4. [**](../../../../akka/http/javadsl/server/CircuitBreakerOpenRejection.html "Permalink")  trait [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "Rejection created by the onCompleteWithBreaker directive.") extends [Rejection](Rejection.html)Rejection created by the `onCompleteWithBreaker` directive.

Rejection created by the `onCompleteWithBreaker` directive.
Signals that the request was rejected because the supplied circuit breaker is open and requests are failing fast.

Annotations@DoNotInherit()
5. [**](../../../../akka/http/javadsl/server/Complete.html "Permalink")  trait [Complete](Complete.html) extends [RouteResult](RouteResult.html)
6. [**](../../../../akka/http/javadsl/server/CorsRejection.html "Permalink")  trait [CorsRejection](CorsRejection.html "Not for user extension") extends [Rejection](Rejection.html)Not for user extension

Not for user extension

Annotations@DoNotInherit()
7. [**](../../../../akka/http/javadsl/server/CustomRejection.html "Permalink")  trait [CustomRejection](CustomRejection.html "To be extended by user-provided custom rejections, such that they may be consumed in either Java or Scala DSLs.") extends [scaladsl.server.Rejection](../../scaladsl/server/Rejection.html)To be extended by user\-provided custom rejections, such that they may be consumed in either Java or Scala DSLs.
8. [**](../../../../akka/http/javadsl/server/ExceptionHandler.html "Permalink") final  class [ExceptionHandler](ExceptionHandler.html "Handles exceptions by turning them into routes.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Handles exceptions by turning them into routes.

Handles exceptions by turning them into routes. You can create an exception handler in Java code like the following example:

```

    ExceptionHandler myHandler = ExceptionHandler.of (ExceptionHandler.newPFBuilder()
        .match(IllegalArgumentException.class, x -> Directives.complete(StatusCodes.BAD_REQUEST))
        .build()
    ));

```
9. [**](../../../../akka/http/javadsl/server/ExceptionHandlerBuilder.html "Permalink")  class [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
10. [**](../../../../akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "Permalink")  trait [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection.html "Rejection created when a websocket request was expected but none was found.") extends [Rejection](Rejection.html)Rejection created when a websocket request was expected but none was found.

Rejection created when a websocket request was expected but none was found.

Annotations@DoNotInherit()
11. [**](../../../../akka/http/javadsl/server/InvalidOriginRejection.html "Permalink")  trait [InvalidOriginRejection](InvalidOriginRejection.html "Rejection created by akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin.") extends [Rejection](Rejection.html)Rejection created by [akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin](../../scaladsl/server/directives/HeaderDirectives$.html#checkSameOrigin(allowed:akka.http.scaladsl.model.headers.HttpOriginRange.Default):akka.http.scaladsl.server.Directive0).

Rejection created by [akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin](../../scaladsl/server/directives/HeaderDirectives$.html#checkSameOrigin(allowed:akka.http.scaladsl.model.headers.HttpOriginRange.Default):akka.http.scaladsl.server.Directive0).
Signals that the request was rejected because `Origin` header value is invalid.

Annotations@DoNotInherit()
12. [**](../../../../akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html "Permalink")  trait [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "Rejection created by parameter filters.") extends [Rejection](Rejection.html)Rejection created by parameter filters.

Rejection created by parameter filters.
Signals that the request was rejected because a query parameter value was not equal to required one.

Annotations@DoNotInherit()
13. [**](../../../../akka/http/javadsl/server/MalformedFormFieldRejection.html "Permalink")  trait [MalformedFormFieldRejection](MalformedFormFieldRejection.html "Rejection created by form field filters.") extends [Rejection](Rejection.html)Rejection created by form field filters.

Rejection created by form field filters.
Signals that the request was rejected because a form field could not be interpreted.

Annotations@DoNotInherit()
14. [**](../../../../akka/http/javadsl/server/MalformedHeaderRejection.html "Permalink")  trait [MalformedHeaderRejection](MalformedHeaderRejection.html "Rejection created by header directives.") extends [Rejection](Rejection.html)Rejection created by header directives.

Rejection created by header directives.
Signals that the request was rejected because a header value is malformed.

Annotations@DoNotInherit()
15. [**](../../../../akka/http/javadsl/server/MalformedQueryParamRejection.html "Permalink")  trait [MalformedQueryParamRejection](MalformedQueryParamRejection.html "Rejection created by parameter filters.") extends [Rejection](Rejection.html)Rejection created by parameter filters.

Rejection created by parameter filters.
Signals that the request was rejected because a query parameter could not be interpreted.

Annotations@DoNotInherit()
16. [**](../../../../akka/http/javadsl/server/MalformedRequestContentRejection.html "Permalink")  trait [MalformedRequestContentRejection](MalformedRequestContentRejection.html "Rejection created by unmarshallers.") extends [Rejection](Rejection.html)Rejection created by unmarshallers.

Rejection created by unmarshallers.
Signals that the request was rejected because unmarshalling failed with an error that wasn't
an `IllegalArgumentException`. Usually that means that the request content was not of the expected format.
Note that semantic issues with the request content (e.g. because some parameter was out of range)
will usually trigger a `ValidationRejection` instead.

Annotations@DoNotInherit()
17. [**](../../../../akka/http/javadsl/server/MethodRejection.html "Permalink")  trait [MethodRejection](MethodRejection.html "Rejection created by method filters.") extends [Rejection](Rejection.html)Rejection created by method filters.

Rejection created by method filters.
Signals that the request was rejected because the HTTP method is unsupported.

Annotations@DoNotInherit()
18. [**](../../../../akka/http/javadsl/server/MissingAttributeRejection.html "Permalink")  trait [MissingAttributeRejection](MissingAttributeRejection.html "Rejection created by attribute directives.")\[T] extends [Rejection](Rejection.html)Rejection created by attribute directives.

Rejection created by attribute directives.
Signals that the request was rejected because a required request attribute could not be found.

Annotations@DoNotInherit()
19. [**](../../../../akka/http/javadsl/server/MissingCookieRejection.html "Permalink")  trait [MissingCookieRejection](MissingCookieRejection.html "Rejection created by the cookie directive.") extends [Rejection](Rejection.html)Rejection created by the `cookie` directive.

Rejection created by the `cookie` directive.
Signals that the request was rejected because a cookie was not found.

Annotations@DoNotInherit()
20. [**](../../../../akka/http/javadsl/server/MissingFormFieldRejection.html "Permalink")  trait [MissingFormFieldRejection](MissingFormFieldRejection.html "Rejection created by form field filters.") extends [Rejection](Rejection.html)Rejection created by form field filters.

Rejection created by form field filters.
Signals that the request was rejected because a form field was not found.

Annotations@DoNotInherit()
21. [**](../../../../akka/http/javadsl/server/MissingHeaderRejection.html "Permalink")  trait [MissingHeaderRejection](MissingHeaderRejection.html "Rejection created by header directives.") extends [Rejection](Rejection.html)Rejection created by header directives.

Rejection created by header directives.
Signals that the request was rejected because a required header could not be found.

Annotations@DoNotInherit()
22. [**](../../../../akka/http/javadsl/server/MissingQueryParamRejection.html "Permalink")  trait [MissingQueryParamRejection](MissingQueryParamRejection.html "Rejection created by parameter filters.") extends [Rejection](Rejection.html)Rejection created by parameter filters.

Rejection created by parameter filters.
Signals that the request was rejected because a query parameter was not found.

Annotations@DoNotInherit()
23. [**](../../../../akka/http/javadsl/server/PathMatcher0.html "Permalink") final  class [PathMatcher0](PathMatcher0.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
24. [**](../../../../akka/http/javadsl/server/PathMatcher1.html "Permalink") final  class [PathMatcher1](PathMatcher1.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
25. [**](../../../../akka/http/javadsl/server/PathMatcher10.html "Permalink") final  class [PathMatcher10](PathMatcher10.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
26. [**](../../../../akka/http/javadsl/server/PathMatcher11.html "Permalink") final  class [PathMatcher11](PathMatcher11.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
27. [**](../../../../akka/http/javadsl/server/PathMatcher12.html "Permalink") final  class [PathMatcher12](PathMatcher12.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
28. [**](../../../../akka/http/javadsl/server/PathMatcher13.html "Permalink") final  class [PathMatcher13](PathMatcher13.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
29. [**](../../../../akka/http/javadsl/server/PathMatcher14.html "Permalink") final  class [PathMatcher14](PathMatcher14.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
30. [**](../../../../akka/http/javadsl/server/PathMatcher15.html "Permalink") final  class [PathMatcher15](PathMatcher15.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
31. [**](../../../../akka/http/javadsl/server/PathMatcher16.html "Permalink") final  class [PathMatcher16](PathMatcher16.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
32. [**](../../../../akka/http/javadsl/server/PathMatcher17.html "Permalink") final  class [PathMatcher17](PathMatcher17.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
33. [**](../../../../akka/http/javadsl/server/PathMatcher18.html "Permalink") final  class [PathMatcher18](PathMatcher18.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
34. [**](../../../../akka/http/javadsl/server/PathMatcher19.html "Permalink") final  class [PathMatcher19](PathMatcher19.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
35. [**](../../../../akka/http/javadsl/server/PathMatcher2.html "Permalink") final  class [PathMatcher2](PathMatcher2.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
36. [**](../../../../akka/http/javadsl/server/PathMatcher20.html "Permalink") final  class [PathMatcher20](PathMatcher20.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
37. [**](../../../../akka/http/javadsl/server/PathMatcher21.html "Permalink") final  class [PathMatcher21](PathMatcher21.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.

It is not possible to append more matchers with keeping their values as parameters (due to limit of Tuple22\).
38. [**](../../../../akka/http/javadsl/server/PathMatcher22.html "Permalink") final  class [PathMatcher22](PathMatcher22.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.

It is not possible to append more matchers with keeping their values as parameters (due to limit of Tuple22\).
39. [**](../../../../akka/http/javadsl/server/PathMatcher3.html "Permalink") final  class [PathMatcher3](PathMatcher3.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
40. [**](../../../../akka/http/javadsl/server/PathMatcher4.html "Permalink") final  class [PathMatcher4](PathMatcher4.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
41. [**](../../../../akka/http/javadsl/server/PathMatcher5.html "Permalink") final  class [PathMatcher5](PathMatcher5.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
42. [**](../../../../akka/http/javadsl/server/PathMatcher6.html "Permalink") final  class [PathMatcher6](PathMatcher6.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
43. [**](../../../../akka/http/javadsl/server/PathMatcher7.html "Permalink") final  class [PathMatcher7](PathMatcher7.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
44. [**](../../../../akka/http/javadsl/server/PathMatcher8.html "Permalink") final  class [PathMatcher8](PathMatcher8.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
45. [**](../../../../akka/http/javadsl/server/PathMatcher9.html "Permalink") final  class [PathMatcher9](PathMatcher9.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")\[T1, T2, T3, T4, T5, T6, T7, T8, T9] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.
46. [**](../../../../akka/http/javadsl/server/PathMatchers.html "Permalink") final  class [PathMatchers](PathMatchers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
47. [**](../../../../akka/http/javadsl/server/Rejected.html "Permalink")  trait [Rejected](Rejected.html) extends [RouteResult](RouteResult.html)
48. [**](../../../../akka/http/javadsl/server/Rejection.html "Permalink")  trait [Rejection](Rejection.html "A rejection encapsulates a specific reason why a Route was not able to handle a request.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A rejection encapsulates a specific reason why a Route was not able to handle a request.

A rejection encapsulates a specific reason why a Route was not able to handle a request. Rejections are gathered
up over the course of a Route evaluation and finally converted to [akka.http.scaladsl.model.HttpResponse](../../scaladsl/model/HttpResponse.html)s by the
`handleRejections` directive, if there was no way for the request to be completed.

If providing custom rejections, extend [CustomRejection](CustomRejection.html) instead.
49. [**](../../../../akka/http/javadsl/server/RejectionError.html "Permalink")  trait [RejectionError](RejectionError.html "A Throwable wrapping a Rejection.") extends RuntimeExceptionA Throwable wrapping a Rejection.

A Throwable wrapping a Rejection.
Can be used for marshalling `Future[T]` or `Try[T]` instances, whose failure side is supposed to trigger a route
rejection rather than an Exception that is handled by the nearest ExceptionHandler.
(Custom marshallers can of course use it as well.)
50. [**](../../../../akka/http/javadsl/server/RejectionHandler.html "Permalink") final  class [RejectionHandler](RejectionHandler.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
51. [**](../../../../akka/http/javadsl/server/RejectionHandlerBuilder.html "Permalink")  class [RejectionHandlerBuilder](RejectionHandlerBuilder.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
52. [**](../../../../akka/http/javadsl/server/RequestContext.html "Permalink")  class [RequestContext](RequestContext.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
53. [**](../../../../akka/http/javadsl/server/RequestEntityExpectedRejection.html "Permalink") abstract  class [RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "Rejection created by unmarshallers.") extends [Rejection](Rejection.html)Rejection created by unmarshallers.

Rejection created by unmarshallers.
Signals that the request was rejected because an message body entity was expected but not supplied.

Annotations@DoNotInherit()
54. [**](../../../../akka/http/javadsl/server/Route.html "Permalink")  trait [Route](Route.html "In the Java DSL, a Route can only consist of combinations of the built-in directives.") extends [HandlerProvider](../HandlerProvider.html)In the Java DSL, a Route can only consist of combinations of the built\-in directives.

In the Java DSL, a Route can only consist of combinations of the built\-in directives. A Route can not be
instantiated directly.

However, the built\-in directives may be combined methods like:

```

Route myDirective(String test, Supplier inner) {
  return
    path("fixed", () ->
      path(test),
        inner
      )
    );
}

```
The above example will invoke \[inner] whenever the path "fixed/{test}" is matched, where "{test}"
is the actual String that was given as method argument.

Annotations@DoNotInherit()
55. [**](../../../../akka/http/javadsl/server/RouteResult.html "Permalink")  trait [RouteResult](RouteResult.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
56. [**](../../../../akka/http/javadsl/server/SchemeRejection.html "Permalink")  trait [SchemeRejection](SchemeRejection.html "Rejection created by scheme filters.") extends [Rejection](Rejection.html)Rejection created by scheme filters.

Rejection created by scheme filters.
Signals that the request was rejected because the Uri scheme is unsupported.

Annotations@DoNotInherit()
57. [**](../../../../akka/http/javadsl/server/TlsClientIdentityRejection.html "Permalink")  trait [TlsClientIdentityRejection](TlsClientIdentityRejection.html "Not for user extension") extends [Rejection](Rejection.html)Not for user extension

Not for user extension

Annotations@DoNotInherit()
58. [**](../../../../akka/http/javadsl/server/TlsClientUnverifiedRejection.html "Permalink")  trait [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html "Not for user extension") extends [Rejection](Rejection.html)Not for user extension

Not for user extension

Annotations@DoNotInherit()
59. [**](../../../../akka/http/javadsl/server/TooManyRangesRejection.html "Permalink")  trait [TooManyRangesRejection](TooManyRangesRejection.html "Rejection created by range directives.") extends [Rejection](Rejection.html)Rejection created by range directives.

Rejection created by range directives.
Signals that the request contains too many ranges. An irregular high number of ranges
indicates a broken client or a denial of service attack.

Annotations@DoNotInherit()
60. [**](../../../../akka/http/javadsl/server/TransformationRejection.html "Permalink")  trait [TransformationRejection](TransformationRejection.html "A special Rejection that serves as a container for a transformation function on rejections.") extends [Rejection](Rejection.html)A special Rejection that serves as a container for a transformation function on rejections.

A special Rejection that serves as a container for a transformation function on rejections.
It is used by some directives to "cancel" rejections that are added by later directives of a similar type.

Consider this route structure for example:

 put { reject(ValidationRejection("no") } \~ get { ... }

If this structure is applied to a PUT request the list of rejections coming back contains three elements:

1\. A ValidationRejection
2\. A MethodRejection
3\. A TransformationRejection holding a function filtering out the MethodRejection

so that in the end the RejectionHandler will only see one rejection (the ValidationRejection), because the
MethodRejection added by the `get` directive is canceled by the `put` directive (since the HTTP method
did indeed match eventually).

Annotations@DoNotInherit()
61. [**](../../../../akka/http/javadsl/server/UnacceptedResponseContentTypeRejection.html "Permalink")  trait [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "Rejection created by marshallers.") extends [Rejection](Rejection.html)Rejection created by marshallers.

Rejection created by marshallers.
Signals that the request was rejected because the service is not capable of producing a response entity whose
content type is accepted by the client

Annotations@DoNotInherit()
62. [**](../../../../akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html "Permalink")  trait [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "Rejection created by encoding filters.") extends [Rejection](Rejection.html)Rejection created by encoding filters.

Rejection created by encoding filters.
Signals that the request was rejected because the service is not capable of producing a response entity whose
content encoding is accepted by the client

Annotations@DoNotInherit()
63. [**](../../../../akka/http/javadsl/server/UnsatisfiableRangeRejection.html "Permalink")  trait [UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "Rejection created by range directives.") extends [Rejection](Rejection.html)Rejection created by range directives.

Rejection created by range directives.
Signals that the request was rejected because the requests contains only unsatisfiable ByteRanges.
The actualEntityLength gives the client a hint to create satisfiable ByteRanges.

Annotations@DoNotInherit()
64. [**](../../../../akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html "Permalink")  trait [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "Rejection created by unmarshallers.") extends [Rejection](Rejection.html)Rejection created by unmarshallers.

Rejection created by unmarshallers.
Signals that the request was rejected because the requests content\-type is unsupported.

Annotations@DoNotInherit()
65. [**](../../../../akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html "Permalink")  trait [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "Rejection created by decoding filters.") extends [Rejection](Rejection.html)Rejection created by decoding filters.

Rejection created by decoding filters.
Signals that the request was rejected because the requests content encoding is unsupported.

Annotations@DoNotInherit()
66. [**](../../../../akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html "Permalink")  trait [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "Rejection created when a websocket request was not handled because none of the given subprotocols was supported.") extends [Rejection](Rejection.html)Rejection created when a websocket request was not handled because none of the given subprotocols
was supported.

Rejection created when a websocket request was not handled because none of the given subprotocols
was supported.

Annotations@DoNotInherit()
67. [**](../../../../akka/http/javadsl/server/ValidationRejection.html "Permalink")  trait [ValidationRejection](ValidationRejection.html "Rejection created by the validation directive as well as for IllegalArgumentExceptions thrown by domain model constructors (e.g.") extends [Rejection](Rejection.html)Rejection created by the `validation` directive as well as for `IllegalArgumentExceptions`
thrown by domain model constructors (e.g.

Rejection created by the `validation` directive as well as for `IllegalArgumentExceptions`
thrown by domain model constructors (e.g. via `require`).
It signals that an expected value was semantically invalid.

Annotations@DoNotInherit()
### Deprecated Type Members

1. [**](../../../../akka/http/javadsl/server/HttpApp.html "Permalink") abstract  class [HttpApp](HttpApp.html "DEPRECATED, consider https://doc.akka.io/docs/akka-http/current/quickstart-java/ instead") extends [AllDirectives](AllDirectives.html)DEPRECATED, consider https://doc.akka.io/docs/akka\-http/current/quickstart\-java/ instead

DEPRECATED, consider https://doc.akka.io/docs/akka\-http/current/quickstart\-java/ instead

Bootstrap trait for Http Server. It helps booting up an akka\-http server by only defining the desired routes.
It offers additional hooks to modify the default behavior.

Annotations@Deprecated Deprecated
### Value Members

1. [**](../../../../akka/http/javadsl/server/AuthenticationFailedRejection$.html "Permalink")  object [AuthenticationFailedRejection](AuthenticationFailedRejection$.html)
2. [**](../../../../akka/http/javadsl/server/AuthorizationFailedRejection$.html "Permalink")  object [AuthorizationFailedRejection](AuthorizationFailedRejection$.html)
3. [**](../../../../akka/http/javadsl/server/Directives$.html "Permalink")  object [Directives](Directives$.html "Collects all default directives into one class for simple importing of static functions.") extends [AllDirectives](AllDirectives.html)Collects all default directives into one class for simple importing of static functions.

Collects all default directives into one class for simple importing of static functions.

See [akka.http.scaladsl.server.Directives](../../scaladsl/server/Directives.html) for ScalaDSL equivalent of this class.
4. [**](../../../../akka/http/javadsl/server/ExceptionHandler$.html "Permalink")  object [ExceptionHandler](ExceptionHandler$.html)
5. [**](../../../../akka/http/javadsl/server/ExpectedWebSocketRequestRejection$.html "Permalink")  object [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html)
6. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html "Permalink")  object [JavaPathMatchers](JavaPathMatchers$.html)
7. [**](../../../../akka/http/javadsl/server/PathMatchers$.html "Permalink")  object [PathMatchers](PathMatchers$.html)
8. [**](../../../../akka/http/javadsl/server/RejectionHandler$.html "Permalink")  object [RejectionHandler](RejectionHandler$.html)
9. [**](../../../../akka/http/javadsl/server/Rejections$.html "Permalink")  object [Rejections](Rejections$.html)
10. [**](../../../../akka/http/javadsl/server/RequestContext$.html "Permalink")  object [RequestContext](RequestContext$.html)
11. [**](../../../../akka/http/javadsl/server/RequestEntityExpectedRejection$.html "Permalink")  object [RequestEntityExpectedRejection](RequestEntityExpectedRejection$.html)
12. [**](../../../../akka/http/javadsl/server/RouteResults$.html "Permalink")  object [RouteResults](RouteResults$.html)
13. [**](../../../../akka/http/javadsl/server/UnacceptedResponseEncodingRejection$.html "Permalink")  object [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AllDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AuthenticationFailedRejection$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AuthorizationFailedRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/Complete.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/CorsRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/CustomRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/ExceptionHandler$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/ExceptionHandlerBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/InvalidOriginRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/JavaPathMatchers$.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher10.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher11.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher12.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher13.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher14.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher15.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher16.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher17.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher18.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher19.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher2.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html)*
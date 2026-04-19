---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
title: akka.http.scaladsl.server
---

# akka.http.scaladsl.server

## Content

# Package akka.http.scaladsl.server

- Interface Summary 
| Interface | Description |
| [AuthenticationFailedRejection.Cause](AuthenticationFailedRejection.Cause.html "interface in akka.http.scaladsl.server") | Signals the cause of the failed authentication. |
| --- | --- |
| [ConjunctionMagnet](ConjunctionMagnet.html "interface in akka.http.scaladsl.server")\<L\> |  |
| [ContentNegotiator.Alternative](ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server") |  |
| [Directives](Directives.html "interface in akka.http.scaladsl.server") | Collects all default directives into one trait for simple importing. |
| [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") |  |
| [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html "interface in akka.http.scaladsl.server") |  |
| [PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")\<L,​M\> |  |
| [PathMatcher.Lift$.MOps](PathMatcher.Lift$.MOps.html "interface in akka.http.scaladsl.server")\<M\> |  |
| [PathMatcher.LowLevelLiftImplicits](PathMatcher.LowLevelLiftImplicits.html "interface in akka.http.scaladsl.server") |  |
| [PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server") |  |
| [Rejection](Rejection.html "interface in akka.http.scaladsl.server") | A rejection encapsulates a specific reason why a Route was not able to handle a request. |
| [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") |  |
| [RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server") |  |
| [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") | This class is not meant to be extended by user code. |
| [RouteConcatenation](RouteConcatenation.html "interface in akka.http.scaladsl.server") |  |
| [RouteResult](RouteResult.html "interface in akka.http.scaladsl.server") | The result of handling a request. |
| [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") |  |
- Class Summary 
| Class | Description |
| [AuthenticationFailedRejection](AuthenticationFailedRejection.html "class in akka.http.scaladsl.server") | Rejection created by the various [`SecurityDirectives`](directives/SecurityDirectives.html "interface in akka.http.scaladsl.server.directives"). |
| --- | --- |
| [AuthenticationFailedRejection.CredentialsMissing$](AuthenticationFailedRejection.CredentialsMissing$.html "class in akka.http.scaladsl.server") | Signals the cause of the rejecting was that the user could not be authenticated, because the `WWW-Authenticate`  header was not supplied. |
| [AuthenticationFailedRejection.CredentialsRejected$](AuthenticationFailedRejection.CredentialsRejected$.html "class in akka.http.scaladsl.server") | Signals the cause of the rejecting was that the user could not be authenticated, because the supplied credentials  are invalid. |
| [AuthenticationFailedRejection$](AuthenticationFailedRejection$.html "class in akka.http.scaladsl.server") |  |
| [AuthorizationFailedRejection](AuthorizationFailedRejection.html "class in akka.http.scaladsl.server") | Rejection created by the 'authorize' directive. |
| [AuthorizationFailedRejection$](AuthorizationFailedRejection$.html "class in akka.http.scaladsl.server") | Rejection created by the 'authorize' directive. |
| [CharsetNegotiator](CharsetNegotiator.html "class in akka.http.scaladsl.server") |  |
| [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "class in akka.http.scaladsl.server") | Rejection created by the `onCompleteWithBreaker` directive. |
| [CircuitBreakerOpenRejection$](CircuitBreakerOpenRejection$.html "class in akka.http.scaladsl.server") |  |
| [ConjunctionMagnet$](ConjunctionMagnet$.html "class in akka.http.scaladsl.server") |  |
| [ContentNegotiator](ContentNegotiator.html "class in akka.http.scaladsl.server") |  |
| [ContentNegotiator.Alternative$](ContentNegotiator.Alternative$.html "class in akka.http.scaladsl.server") |  |
| [ContentNegotiator.Alternative$.ContentType](ContentNegotiator.Alternative$.ContentType.html "class in akka.http.scaladsl.server") |  |
| [ContentNegotiator.Alternative$.ContentType$](ContentNegotiator.Alternative$.ContentType$.html "class in akka.http.scaladsl.server") |  |
| [ContentNegotiator.Alternative$.MediaType](ContentNegotiator.Alternative$.MediaType.html "class in akka.http.scaladsl.server") |  |
| [ContentNegotiator.Alternative$.MediaType$](ContentNegotiator.Alternative$.MediaType$.html "class in akka.http.scaladsl.server") |  |
| [ContentNegotiator$](ContentNegotiator$.html "class in akka.http.scaladsl.server") |  |
| [CorsRejection](CorsRejection.html "class in akka.http.scaladsl.server") | Rejection created by the CORS directives. |
| [CorsRejection$](CorsRejection$.html "class in akka.http.scaladsl.server") |  |
| [Directive](Directive.html "class in akka.http.scaladsl.server")\<L\> | A directive that provides a tuple of values of type `L` to create an inner route. |
| [Directive.Directive0Support](Directive.Directive0Support.html "class in akka.http.scaladsl.server") | Adds helper functions to `Directive0` |
| [Directive.Directive0Support$](Directive.Directive0Support$.html "class in akka.http.scaladsl.server") |  |
| [Directive.SingleValueModifiers](Directive.SingleValueModifiers.html "class in akka.http.scaladsl.server")\<T\> |  |
| [Directive.SingleValueTransformers](Directive.SingleValueTransformers.html "class in akka.http.scaladsl.server")\<T\> | "Standard" transformers for `Directive1`. |
| [Directive.SingleValueTransformers$](Directive.SingleValueTransformers$.html "class in akka.http.scaladsl.server") |  |
| [Directive$](Directive$.html "class in akka.http.scaladsl.server") |  |
| [Directives$](Directives$.html "class in akka.http.scaladsl.server") | Collects all default directives into one object for simple importing. |
| [EncodingNegotiator](EncodingNegotiator.html "class in akka.http.scaladsl.server") |  |
| [EncodingNegotiator$](EncodingNegotiator$.html "class in akka.http.scaladsl.server") |  |
| [ExceptionHandler$](ExceptionHandler$.html "class in akka.http.scaladsl.server") |  |
| [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection.html "class in akka.http.scaladsl.server") | Rejection created when a websocket request was expected but none was found. |
| [ExpectedWebSocketRequestRejection$](ExpectedWebSocketRequestRejection$.html "class in akka.http.scaladsl.server") | Rejection created when a websocket request was expected but none was found. |
| [HttpApp](HttpApp.html "class in akka.http.scaladsl.server") | Deprecated. HttpApp this doesn't reflect the latest Akka APIs. |
| [InvalidOriginRejection](InvalidOriginRejection.html "class in akka.http.scaladsl.server") | Rejection created by `akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin`. |
| [InvalidOriginRejection$](InvalidOriginRejection$.html "class in akka.http.scaladsl.server") |  |
| [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "class in akka.http.scaladsl.server") | Rejection created by parameter filters. |
| [InvalidRequiredValueForQueryParamRejection$](InvalidRequiredValueForQueryParamRejection$.html "class in akka.http.scaladsl.server") |  |
| [LanguageNegotiator](LanguageNegotiator.html "class in akka.http.scaladsl.server") |  |
| [LanguageNegotiator$](LanguageNegotiator$.html "class in akka.http.scaladsl.server") |  |
| [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html "class in akka.http.scaladsl.server") |  |
| [LowerPriorityRoutingLogImplicits](LowerPriorityRoutingLogImplicits.html "class in akka.http.scaladsl.server") |  |
| [MalformedFormFieldRejection](MalformedFormFieldRejection.html "class in akka.http.scaladsl.server") | Rejection created by form field filters. |
| [MalformedFormFieldRejection$](MalformedFormFieldRejection$.html "class in akka.http.scaladsl.server") |  |
| [MalformedHeaderRejection](MalformedHeaderRejection.html "class in akka.http.scaladsl.server") | Rejection created by header directives. |
| [MalformedHeaderRejection$](MalformedHeaderRejection$.html "class in akka.http.scaladsl.server") |  |
| [MalformedQueryParamRejection](MalformedQueryParamRejection.html "class in akka.http.scaladsl.server") | Rejection created by parameter filters. |
| [MalformedQueryParamRejection$](MalformedQueryParamRejection$.html "class in akka.http.scaladsl.server") |  |
| [MalformedRequestContentRejection](MalformedRequestContentRejection.html "class in akka.http.scaladsl.server") | Rejection created by unmarshallers. |
| [MalformedRequestContentRejection$](MalformedRequestContentRejection$.html "class in akka.http.scaladsl.server") |  |
| [MediaTypeNegotiator](MediaTypeNegotiator.html "class in akka.http.scaladsl.server") |  |
| [MethodRejection](MethodRejection.html "class in akka.http.scaladsl.server") | Rejection created by method filters. |
| [MethodRejection$](MethodRejection$.html "class in akka.http.scaladsl.server") |  |
| [MissingAttributeRejection](MissingAttributeRejection.html "class in akka.http.scaladsl.server")\<T\> | Rejection created by attribute directives. |
| [MissingAttributeRejection$](MissingAttributeRejection$.html "class in akka.http.scaladsl.server") |  |
| [MissingCookieRejection](MissingCookieRejection.html "class in akka.http.scaladsl.server") | Rejection created by the `cookie` directive. |
| [MissingCookieRejection$](MissingCookieRejection$.html "class in akka.http.scaladsl.server") |  |
| [MissingFormFieldRejection](MissingFormFieldRejection.html "class in akka.http.scaladsl.server") | Rejection created by form field filters. |
| [MissingFormFieldRejection$](MissingFormFieldRejection$.html "class in akka.http.scaladsl.server") |  |
| [MissingHeaderRejection](MissingHeaderRejection.html "class in akka.http.scaladsl.server") | Rejection created by header directives. |
| [MissingHeaderRejection$](MissingHeaderRejection$.html "class in akka.http.scaladsl.server") |  |
| [MissingQueryParamRejection](MissingQueryParamRejection.html "class in akka.http.scaladsl.server") | Rejection created by parameter filters. |
| [MissingQueryParamRejection$](MissingQueryParamRejection$.html "class in akka.http.scaladsl.server") |  |
| [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")\<L\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatcher.Unmatched. |
| [PathMatcher.EnhancedPathMatcher](PathMatcher.EnhancedPathMatcher.html "class in akka.http.scaladsl.server")\<L\> |  |
| [PathMatcher.Lift$](PathMatcher.Lift$.html "class in akka.http.scaladsl.server") |  |
| [PathMatcher.Lift$.MOps$](PathMatcher.Lift$.MOps$.html "class in akka.http.scaladsl.server") |  |
| [PathMatcher.Matched](PathMatcher.Matched.html "class in akka.http.scaladsl.server")\<L\> |  |
| [PathMatcher.Matched$](PathMatcher.Matched$.html "class in akka.http.scaladsl.server") |  |
| [PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")\<L\> |  |
| [PathMatcher.PathMatcher1Ops](PathMatcher.PathMatcher1Ops.html "class in akka.http.scaladsl.server")\<T\> |  |
| [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server") |  |
| [PathMatcher$](PathMatcher$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.HexIntNumber$](PathMatchers.HexIntNumber$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.HexLongNumber$](PathMatchers.HexLongNumber$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.IntNumber$](PathMatchers.IntNumber$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.LongNumber$](PathMatchers.LongNumber$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.NumberMatcher](PathMatchers.NumberMatcher.html "class in akka.http.scaladsl.server")\<T\> |  |
| [PathMatchers.PathEnd$](PathMatchers.PathEnd$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.Remaining$](PathMatchers.Remaining$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.RemainingPath$](PathMatchers.RemainingPath$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.Segment$](PathMatchers.Segment$.html "class in akka.http.scaladsl.server") |  |
| [PathMatchers.Slash$](PathMatchers.Slash$.html "class in akka.http.scaladsl.server") | A PathMatcher that matches a single slash character ('/'). |
| [PathMatchers$](PathMatchers$.html "class in akka.http.scaladsl.server") |  |
| [RejectionError$](RejectionError$.html "class in akka.http.scaladsl.server") |  |
| [RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server") |  |
| [RejectionHandler$](RejectionHandler$.html "class in akka.http.scaladsl.server") |  |
| [RequestContextImpl](RequestContextImpl.html "class in akka.http.scaladsl.server") | INTERNAL API |
| [RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "class in akka.http.scaladsl.server") | Rejection created by unmarshallers. |
| [RequestEntityExpectedRejection$](RequestEntityExpectedRejection$.html "class in akka.http.scaladsl.server") | Rejection created by unmarshallers. |
| [Route](Route.html "class in akka.http.scaladsl.server") |  |
| [Route$](Route$.html "class in akka.http.scaladsl.server") |  |
| [RouteConcatenation.RouteWithConcatenation](RouteConcatenation.RouteWithConcatenation.html "class in akka.http.scaladsl.server") |  |
| [RouteConcatenation$](RouteConcatenation$.html "class in akka.http.scaladsl.server") |  |
| [RouteResult.Complete](RouteResult.Complete.html "class in akka.http.scaladsl.server") |  |
| [RouteResult.Complete$](RouteResult.Complete$.html "class in akka.http.scaladsl.server") |  |
| [RouteResult.Rejected](RouteResult.Rejected.html "class in akka.http.scaladsl.server") |  |
| [RouteResult.Rejected$](RouteResult.Rejected$.html "class in akka.http.scaladsl.server") |  |
| [RouteResult$](RouteResult$.html "class in akka.http.scaladsl.server") |  |
| [RoutingLog$](RoutingLog$.html "class in akka.http.scaladsl.server") |  |
| [SchemeRejection](SchemeRejection.html "class in akka.http.scaladsl.server") | Rejection created by scheme filters. |
| [SchemeRejection$](SchemeRejection$.html "class in akka.http.scaladsl.server") |  |
| [StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server") | A Route that can be implicitly converted into a Directive (fitting any signature). |
| [StandardRoute$](StandardRoute$.html "class in akka.http.scaladsl.server") |  |
| [TlsClientIdentityRejection](TlsClientIdentityRejection.html "class in akka.http.scaladsl.server") |  |
| [TlsClientIdentityRejection$](TlsClientIdentityRejection$.html "class in akka.http.scaladsl.server") |  |
| [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html "class in akka.http.scaladsl.server") |  |
| [TlsClientUnverifiedRejection$](TlsClientUnverifiedRejection$.html "class in akka.http.scaladsl.server") |  |
| [TooManyRangesRejection](TooManyRangesRejection.html "class in akka.http.scaladsl.server") | Rejection created by range directives. |
| [TooManyRangesRejection$](TooManyRangesRejection$.html "class in akka.http.scaladsl.server") |  |
| [TransformationRejection](TransformationRejection.html "class in akka.http.scaladsl.server") | A special Rejection that serves as a container for a transformation function on rejections. |
| [TransformationRejection$](TransformationRejection$.html "class in akka.http.scaladsl.server") |  |
| [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "class in akka.http.scaladsl.server") | Rejection created by marshallers. |
| [UnacceptedResponseContentTypeRejection$](UnacceptedResponseContentTypeRejection$.html "class in akka.http.scaladsl.server") |  |
| [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server") | Rejection created by encoding filters. |
| [UnacceptedResponseEncodingRejection$](UnacceptedResponseEncodingRejection$.html "class in akka.http.scaladsl.server") |  |
| [UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "class in akka.http.scaladsl.server") | Rejection created by range directives. |
| [UnsatisfiableRangeRejection$](UnsatisfiableRangeRejection$.html "class in akka.http.scaladsl.server") |  |
| [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") | Rejection created by unmarshallers. |
| [UnsupportedRequestContentTypeRejection$](UnsupportedRequestContentTypeRejection$.html "class in akka.http.scaladsl.server") |  |
| [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "class in akka.http.scaladsl.server") | Rejection created by decoding filters. |
| [UnsupportedRequestEncodingRejection$](UnsupportedRequestEncodingRejection$.html "class in akka.http.scaladsl.server") |  |
| [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "class in akka.http.scaladsl.server") | Rejection created when a websocket request was not handled because none of the given subprotocols  was supported. |
| [UnsupportedWebSocketSubprotocolRejection$](UnsupportedWebSocketSubprotocolRejection$.html "class in akka.http.scaladsl.server") |  |
| [ValidationRejection](ValidationRejection.html "class in akka.http.scaladsl.server") | Rejection created by the `validation` directive as well as for `IllegalArgumentExceptions`  thrown by domain model constructors (e.g. via `require`). |
| [ValidationRejection$](ValidationRejection$.html "class in akka.http.scaladsl.server") |  |
- Exception Summary 
| Exception | Description |
| [RejectionError](RejectionError.html "class in akka.http.scaladsl.server") | A Throwable wrapping a Rejection. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection.Cause.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection.CredentialsMissing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection.CredentialsRejected$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthorizationFailedRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CharsetNegotiator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CircuitBreakerOpenRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.Alternative$.ContentType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.Alternative$.ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.Alternative$.MediaType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.Alternative$.MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.Alternative$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.Alternative.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CorsRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CorsRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.Directive0Support$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.Directive0Support.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.SingleValueModifiers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.SingleValueTransformers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.SingleValueTransformers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/EncodingNegotiator$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/EncodingNegotiator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/InvalidOriginRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/InvalidOriginRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LanguageNegotiator$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LanguageNegotiator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LowerPriorityRoutingLogImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedFormFieldRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedHeaderRejection$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html)*
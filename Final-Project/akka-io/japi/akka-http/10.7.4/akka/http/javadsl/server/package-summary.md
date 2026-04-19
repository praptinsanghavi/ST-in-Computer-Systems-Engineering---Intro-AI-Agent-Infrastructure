---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
title: akka.http.javadsl.server
---

# akka.http.javadsl.server

## Content

# Package akka.http.javadsl.server

- Interface Summary 
| Interface | Description |
| [AuthenticationFailedRejection](AuthenticationFailedRejection.html "interface in akka.http.javadsl.server") | Rejection created by the various [`SecurityDirectives`](directives/SecurityDirectives.html "class in akka.http.javadsl.server.directives"). |
| --- | --- |
| [AuthenticationFailedRejection.Cause](AuthenticationFailedRejection.Cause.html "interface in akka.http.javadsl.server") | Signals the cause of the failed authentication. |
| [AuthenticationFailedRejection.CredentialsMissing](AuthenticationFailedRejection.CredentialsMissing.html "interface in akka.http.javadsl.server") | Signals the cause of the rejecting was that the user could not be authenticated, because the `WWW-Authenticate`  header was not supplied. |
| [AuthenticationFailedRejection.CredentialsRejected](AuthenticationFailedRejection.CredentialsRejected.html "interface in akka.http.javadsl.server") | Signals the cause of the rejecting was that the user could not be authenticated, because the supplied credentials  are invalid. |
| [AuthorizationFailedRejection](AuthorizationFailedRejection.html "interface in akka.http.javadsl.server") | Rejection created by the 'authorize' directive. |
| [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "interface in akka.http.javadsl.server") | Rejection created by the `onCompleteWithBreaker` directive. |
| [Complete](Complete.html "interface in akka.http.javadsl.server") |  |
| [CorsRejection](CorsRejection.html "interface in akka.http.javadsl.server") | Not for user extension |
| [CustomRejection](CustomRejection.html "interface in akka.http.javadsl.server") | To be extended by user\-provided custom rejections, such that they may be consumed in either Java or Scala DSLs. |
| [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection.html "interface in akka.http.javadsl.server") | Rejection created when a websocket request was expected but none was found. |
| [InvalidOriginRejection](InvalidOriginRejection.html "interface in akka.http.javadsl.server") | Rejection created by `akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin`. |
| [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server") | Rejection created by parameter filters. |
| [MalformedFormFieldRejection](MalformedFormFieldRejection.html "interface in akka.http.javadsl.server") | Rejection created by form field filters. |
| [MalformedHeaderRejection](MalformedHeaderRejection.html "interface in akka.http.javadsl.server") | Rejection created by header directives. |
| [MalformedQueryParamRejection](MalformedQueryParamRejection.html "interface in akka.http.javadsl.server") | Rejection created by parameter filters. |
| [MalformedRequestContentRejection](MalformedRequestContentRejection.html "interface in akka.http.javadsl.server") | Rejection created by unmarshallers. |
| [MethodRejection](MethodRejection.html "interface in akka.http.javadsl.server") | Rejection created by method filters. |
| [MissingAttributeRejection](MissingAttributeRejection.html "interface in akka.http.javadsl.server")\<T\> | Rejection created by attribute directives. |
| [MissingCookieRejection](MissingCookieRejection.html "interface in akka.http.javadsl.server") | Rejection created by the `cookie` directive. |
| [MissingFormFieldRejection](MissingFormFieldRejection.html "interface in akka.http.javadsl.server") | Rejection created by form field filters. |
| [MissingHeaderRejection](MissingHeaderRejection.html "interface in akka.http.javadsl.server") | Rejection created by header directives. |
| [MissingQueryParamRejection](MissingQueryParamRejection.html "interface in akka.http.javadsl.server") | Rejection created by parameter filters. |
| [Rejected](Rejected.html "interface in akka.http.javadsl.server") |  |
| [Rejection](Rejection.html "interface in akka.http.javadsl.server") | A rejection encapsulates a specific reason why a Route was not able to handle a request. |
| [RejectionError](RejectionError.html "interface in akka.http.javadsl.server") | A Throwable wrapping a Rejection. |
| [Route](Route.html "interface in akka.http.javadsl.server") | In the Java DSL, a Route can only consist of combinations of the built\-in directives. |
| [RouteResult](RouteResult.html "interface in akka.http.javadsl.server") |  |
| [SchemeRejection](SchemeRejection.html "interface in akka.http.javadsl.server") | Rejection created by scheme filters. |
| [TlsClientIdentityRejection](TlsClientIdentityRejection.html "interface in akka.http.javadsl.server") | Not for user extension |
| [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html "interface in akka.http.javadsl.server") | Not for user extension |
| [TooManyRangesRejection](TooManyRangesRejection.html "interface in akka.http.javadsl.server") | Rejection created by range directives. |
| [TransformationRejection](TransformationRejection.html "interface in akka.http.javadsl.server") | A special Rejection that serves as a container for a transformation function on rejections. |
| [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "interface in akka.http.javadsl.server") | Rejection created by marshallers. |
| [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "interface in akka.http.javadsl.server") | Rejection created by encoding filters. |
| [UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "interface in akka.http.javadsl.server") | Rejection created by range directives. |
| [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server") | Rejection created by unmarshallers. |
| [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "interface in akka.http.javadsl.server") | Rejection created by decoding filters. |
| [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "interface in akka.http.javadsl.server") | Rejection created when a websocket request was not handled because none of the given subprotocols  was supported. |
| [ValidationRejection](ValidationRejection.html "interface in akka.http.javadsl.server") | Rejection created by the `validation` directive as well as for `IllegalArgumentExceptions`  thrown by domain model constructors (e.g. via `require`). |
- Class Summary 
| Class | Description |
| [AllDirectives](AllDirectives.html "class in akka.http.javadsl.server") |  |
| --- | --- |
| [AuthenticationFailedRejection$](AuthenticationFailedRejection$.html "class in akka.http.javadsl.server") |  |
| [AuthorizationFailedRejection$](AuthorizationFailedRejection$.html "class in akka.http.javadsl.server") |  |
| [Directives](Directives.html "class in akka.http.javadsl.server") | Collects all default directives into one class for simple importing of static functions. |
| [Directives$](Directives$.html "class in akka.http.javadsl.server") | Collects all default directives into one class for simple importing of static functions. |
| [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") | Handles exceptions by turning them into routes. |
| [ExceptionHandler$](ExceptionHandler$.html "class in akka.http.javadsl.server") |  |
| [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server") |  |
| [ExpectedWebSocketRequestRejection$](ExpectedWebSocketRequestRejection$.html "class in akka.http.javadsl.server") |  |
| [HttpApp](HttpApp.html "class in akka.http.javadsl.server") | Deprecated. HttpApp this doesn't reflect the latest Akka APIs, since 10\.2\.0 |
| [JavaPathMatchers](JavaPathMatchers.html "class in akka.http.javadsl.server") |  |
| [JavaPathMatchers$](JavaPathMatchers$.html "class in akka.http.javadsl.server") |  |
| [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")\<T1\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher19](PathMatcher19.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")\<T1,​T2\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher20](PathMatcher20.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher21](PathMatcher21.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher22](PathMatcher22.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")\<T1,​T2,​T3\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9\> | A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance  if matched, otherwise PathMatchers.Unmatched. |
| [PathMatchers](PathMatchers.html "class in akka.http.javadsl.server") |  |
| [PathMatchers$](PathMatchers$.html "class in akka.http.javadsl.server") |  |
| [RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") |  |
| [RejectionHandler$](RejectionHandler$.html "class in akka.http.javadsl.server") |  |
| [RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server") |  |
| [Rejections](Rejections.html "class in akka.http.javadsl.server") |  |
| [Rejections$](Rejections$.html "class in akka.http.javadsl.server") |  |
| [RequestContext](RequestContext.html "class in akka.http.javadsl.server") |  |
| [RequestContext$](RequestContext$.html "class in akka.http.javadsl.server") |  |
| [RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "class in akka.http.javadsl.server") | Rejection created by unmarshallers. |
| [RequestEntityExpectedRejection$](RequestEntityExpectedRejection$.html "class in akka.http.javadsl.server") |  |
| [RouteResults](RouteResults.html "class in akka.http.javadsl.server") |  |
| [RouteResults$](RouteResults$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping](RoutingJavaMapping.html "class in akka.http.javadsl.server") | INTERNAL API |
| [RoutingJavaMapping.convertDirectoryListing$](RoutingJavaMapping.convertDirectoryListing$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.convertDirectoryRenderer$](RoutingJavaMapping.convertDirectoryRenderer$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.convertEntityStreamingSupport$](RoutingJavaMapping.convertEntityStreamingSupport$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.convertLogEntry$](RoutingJavaMapping.convertLogEntry$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.convertParserSettings$](RoutingJavaMapping.convertParserSettings$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.convertRouteResult$](RoutingJavaMapping.convertRouteResult$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.convertRouteSettings$](RoutingJavaMapping.convertRouteSettings$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.Implicits$](RoutingJavaMapping.Implicits$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.Rejection$](RoutingJavaMapping.Rejection$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping.RequestContext$](RoutingJavaMapping.RequestContext$.html "class in akka.http.javadsl.server") |  |
| [RoutingJavaMapping$](RoutingJavaMapping$.html "class in akka.http.javadsl.server") | INTERNAL API |
| [UnacceptedResponseEncodingRejection$](UnacceptedResponseEncodingRejection$.html "class in akka.http.javadsl.server") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AllDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection.Cause.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection.CredentialsMissing.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection.CredentialsRejected.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthorizationFailedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Complete.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CorsRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CustomRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandlerBuilder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/JavaPathMatchers$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/JavaPathMatchers.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingAttributeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingCookieRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher10.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher11.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher12.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher13.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher14.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher15.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher16.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher17.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher18.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher19.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher20.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher21.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher22.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
title: Rejection
---

# Rejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Interface Rejection

- All Superinterfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`

All Known Subinterfaces:
`[CustomRejection](../../javadsl/server/CustomRejection.html "interface in akka.http.javadsl.server")`, `[RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[AuthenticationFailedRejection](AuthenticationFailedRejection.html "class in akka.http.scaladsl.server")`, `[AuthorizationFailedRejection$](AuthorizationFailedRejection$.html "class in akka.http.scaladsl.server")`, `[CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "class in akka.http.scaladsl.server")`, `[CorsRejection](CorsRejection.html "class in akka.http.scaladsl.server")`, `[ExpectedWebSocketRequestRejection$](ExpectedWebSocketRequestRejection$.html "class in akka.http.scaladsl.server")`, `[InvalidOriginRejection](InvalidOriginRejection.html "class in akka.http.scaladsl.server")`, `[InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "class in akka.http.scaladsl.server")`, `[MalformedFormFieldRejection](MalformedFormFieldRejection.html "class in akka.http.scaladsl.server")`, `[MalformedHeaderRejection](MalformedHeaderRejection.html "class in akka.http.scaladsl.server")`, `[MalformedQueryParamRejection](MalformedQueryParamRejection.html "class in akka.http.scaladsl.server")`, `[MalformedRequestContentRejection](MalformedRequestContentRejection.html "class in akka.http.scaladsl.server")`, `[MethodRejection](MethodRejection.html "class in akka.http.scaladsl.server")`, `[MissingAttributeRejection](MissingAttributeRejection.html "class in akka.http.scaladsl.server")`, `[MissingCookieRejection](MissingCookieRejection.html "class in akka.http.scaladsl.server")`, `[MissingFormFieldRejection](MissingFormFieldRejection.html "class in akka.http.scaladsl.server")`, `[MissingHeaderRejection](MissingHeaderRejection.html "class in akka.http.scaladsl.server")`, `[MissingQueryParamRejection](MissingQueryParamRejection.html "class in akka.http.scaladsl.server")`, `[PathDirectives.TrailingRetryRejection$](directives/PathDirectives.TrailingRetryRejection$.html "class in akka.http.scaladsl.server.directives")`, `[RequestEntityExpectedRejection$](RequestEntityExpectedRejection$.html "class in akka.http.scaladsl.server")`, `[SchemeRejection](SchemeRejection.html "class in akka.http.scaladsl.server")`, `[TlsClientIdentityRejection](TlsClientIdentityRejection.html "class in akka.http.scaladsl.server")`, `[TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html "class in akka.http.scaladsl.server")`, `[TooManyRangesRejection](TooManyRangesRejection.html "class in akka.http.scaladsl.server")`, `[TransformationRejection](TransformationRejection.html "class in akka.http.scaladsl.server")`, `[UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "class in akka.http.scaladsl.server")`, `[UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server")`, `[UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "class in akka.http.scaladsl.server")`, `[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")`, `[UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "class in akka.http.scaladsl.server")`, `[UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "class in akka.http.scaladsl.server")`, `[ValidationRejection](ValidationRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface Rejection
extends [Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")
```

A rejection encapsulates a specific reason why a Route was not able to handle a request. Rejections are gathered
 up over the course of a Route evaluation and finally converted to [`HttpResponse`](../model/HttpResponse.html "class in akka.http.scaladsl.model")s by the
 `handleRejections` directive, if there was no way for the request to be completed.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/CustomRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CorsRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/InvalidOriginRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingAttributeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingCookieRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionWithOptionalCause.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/SchemeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TlsClientIdentityRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TlsClientUnverifiedRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TooManyRangesRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TransformationRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsatisfiableRangeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ValidationRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/PathDirectives.TrailingRetryRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html)*
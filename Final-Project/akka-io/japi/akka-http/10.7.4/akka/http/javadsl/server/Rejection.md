---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
title: Rejection
---

# Rejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface Rejection

- All Known Subinterfaces:
`[AuthenticationFailedRejection](AuthenticationFailedRejection.html "interface in akka.http.javadsl.server")`, `[AuthorizationFailedRejection](AuthorizationFailedRejection.html "interface in akka.http.javadsl.server")`, `[CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "interface in akka.http.javadsl.server")`, `[CorsRejection](CorsRejection.html "interface in akka.http.javadsl.server")`, `[CustomRejection](CustomRejection.html "interface in akka.http.javadsl.server")`, `[ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection.html "interface in akka.http.javadsl.server")`, `[InvalidOriginRejection](InvalidOriginRejection.html "interface in akka.http.javadsl.server")`, `[InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server")`, `[MalformedFormFieldRejection](MalformedFormFieldRejection.html "interface in akka.http.javadsl.server")`, `[MalformedHeaderRejection](MalformedHeaderRejection.html "interface in akka.http.javadsl.server")`, `[MalformedQueryParamRejection](MalformedQueryParamRejection.html "interface in akka.http.javadsl.server")`, `[MalformedRequestContentRejection](MalformedRequestContentRejection.html "interface in akka.http.javadsl.server")`, `[MethodRejection](MethodRejection.html "interface in akka.http.javadsl.server")`, `[MissingAttributeRejection](MissingAttributeRejection.html "interface in akka.http.javadsl.server")<T>`, `[MissingCookieRejection](MissingCookieRejection.html "interface in akka.http.javadsl.server")`, `[MissingFormFieldRejection](MissingFormFieldRejection.html "interface in akka.http.javadsl.server")`, `[MissingHeaderRejection](MissingHeaderRejection.html "interface in akka.http.javadsl.server")`, `[MissingQueryParamRejection](MissingQueryParamRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../scaladsl/server/Rejection.html "interface in akka.http.scaladsl.server")`, `[RejectionWithOptionalCause](../../scaladsl/server/RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server")`, `[SchemeRejection](SchemeRejection.html "interface in akka.http.javadsl.server")`, `[TlsClientIdentityRejection](TlsClientIdentityRejection.html "interface in akka.http.javadsl.server")`, `[TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html "interface in akka.http.javadsl.server")`, `[TooManyRangesRejection](TooManyRangesRejection.html "interface in akka.http.javadsl.server")`, `[TransformationRejection](TransformationRejection.html "interface in akka.http.javadsl.server")`, `[UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "interface in akka.http.javadsl.server")`, `[UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "interface in akka.http.javadsl.server")`, `[UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "interface in akka.http.javadsl.server")`, `[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server")`, `[UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "interface in akka.http.javadsl.server")`, `[UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "interface in akka.http.javadsl.server")`, `[ValidationRejection](ValidationRejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[AuthenticationFailedRejection](../../scaladsl/server/AuthenticationFailedRejection.html "class in akka.http.scaladsl.server")`, `[AuthorizationFailedRejection$](../../scaladsl/server/AuthorizationFailedRejection$.html "class in akka.http.scaladsl.server")`, `[CircuitBreakerOpenRejection](../../scaladsl/server/CircuitBreakerOpenRejection.html "class in akka.http.scaladsl.server")`, `[CorsRejection](../../scaladsl/server/CorsRejection.html "class in akka.http.scaladsl.server")`, `[ExpectedWebSocketRequestRejection$](../../scaladsl/server/ExpectedWebSocketRequestRejection$.html "class in akka.http.scaladsl.server")`, `[InvalidOriginRejection](../../scaladsl/server/InvalidOriginRejection.html "class in akka.http.scaladsl.server")`, `[InvalidRequiredValueForQueryParamRejection](../../scaladsl/server/InvalidRequiredValueForQueryParamRejection.html "class in akka.http.scaladsl.server")`, `[MalformedFormFieldRejection](../../scaladsl/server/MalformedFormFieldRejection.html "class in akka.http.scaladsl.server")`, `[MalformedHeaderRejection](../../scaladsl/server/MalformedHeaderRejection.html "class in akka.http.scaladsl.server")`, `[MalformedQueryParamRejection](../../scaladsl/server/MalformedQueryParamRejection.html "class in akka.http.scaladsl.server")`, `[MalformedRequestContentRejection](../../scaladsl/server/MalformedRequestContentRejection.html "class in akka.http.scaladsl.server")`, `[MethodRejection](../../scaladsl/server/MethodRejection.html "class in akka.http.scaladsl.server")`, `[MissingAttributeRejection](../../scaladsl/server/MissingAttributeRejection.html "class in akka.http.scaladsl.server")`, `[MissingCookieRejection](../../scaladsl/server/MissingCookieRejection.html "class in akka.http.scaladsl.server")`, `[MissingFormFieldRejection](../../scaladsl/server/MissingFormFieldRejection.html "class in akka.http.scaladsl.server")`, `[MissingHeaderRejection](../../scaladsl/server/MissingHeaderRejection.html "class in akka.http.scaladsl.server")`, `[MissingQueryParamRejection](../../scaladsl/server/MissingQueryParamRejection.html "class in akka.http.scaladsl.server")`, `[PathDirectives.TrailingRetryRejection$](../../scaladsl/server/directives/PathDirectives.TrailingRetryRejection$.html "class in akka.http.scaladsl.server.directives")`, `[RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "class in akka.http.javadsl.server")`, `[RequestEntityExpectedRejection$](../../scaladsl/server/RequestEntityExpectedRejection$.html "class in akka.http.scaladsl.server")`, `[SchemeRejection](../../scaladsl/server/SchemeRejection.html "class in akka.http.scaladsl.server")`, `[TlsClientIdentityRejection](../../scaladsl/server/TlsClientIdentityRejection.html "class in akka.http.scaladsl.server")`, `[TlsClientUnverifiedRejection](../../scaladsl/server/TlsClientUnverifiedRejection.html "class in akka.http.scaladsl.server")`, `[TooManyRangesRejection](../../scaladsl/server/TooManyRangesRejection.html "class in akka.http.scaladsl.server")`, `[TransformationRejection](../../scaladsl/server/TransformationRejection.html "class in akka.http.scaladsl.server")`, `[UnacceptedResponseContentTypeRejection](../../scaladsl/server/UnacceptedResponseContentTypeRejection.html "class in akka.http.scaladsl.server")`, `[UnacceptedResponseEncodingRejection](../../scaladsl/server/UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server")`, `[UnsatisfiableRangeRejection](../../scaladsl/server/UnsatisfiableRangeRejection.html "class in akka.http.scaladsl.server")`, `[UnsupportedRequestContentTypeRejection](../../scaladsl/server/UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")`, `[UnsupportedRequestEncodingRejection](../../scaladsl/server/UnsupportedRequestEncodingRejection.html "class in akka.http.scaladsl.server")`, `[UnsupportedWebSocketSubprotocolRejection](../../scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "class in akka.http.scaladsl.server")`, `[ValidationRejection](../../scaladsl/server/ValidationRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface Rejection
```

A rejection encapsulates a specific reason why a Route was not able to handle a request. Rejections are gathered
 up over the course of a Route evaluation and finally converted to [`HttpResponse`](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")s by the
 `handleRejections` directive, if there was no way for the request to be completed.
 
 If providing custom rejections, extend [`CustomRejection`](CustomRejection.html "interface in akka.http.javadsl.server") instead.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthorizationFailedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CorsRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CustomRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html
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
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/SchemeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TlsClientIdentityRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TlsClientUnverifiedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TooManyRangesRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsatisfiableRangeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ValidationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/CorsRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidOriginRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingAttributeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingCookieRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingQueryParamRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html)*
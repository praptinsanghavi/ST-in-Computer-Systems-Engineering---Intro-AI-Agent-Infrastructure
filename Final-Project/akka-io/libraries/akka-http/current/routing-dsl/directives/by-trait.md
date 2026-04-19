---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/by-trait.html
title: Predefined Directives (by trait) • Akka HTTP
---

# Predefined Directives (by trait) • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Predefined Directives (by trait)

All predefined directives are organized into traits that form one part of the overarching [`Directives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Directives.html "akka.http.javadsl.server.Directives")[`Directives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html "akka.http.scaladsl.server.Directives") trait.

## Directives filtering or extracting from the request

[MethodDirectives](method-directives/index.html)
Filter and extract based on the request method.
[HeaderDirectives](header-directives/index.html)
Filter and extract based on request headers.
[AttributeDirectives](attribute-directives/index.html)
Filter and extract based on request attributes.
[PathDirectives](path-directives/index.html)
Filter and extract from the request URI path.
[HostDirectives](host-directives/index.html)
Filter and extract based on the target host.
[ParameterDirectives](parameter-directives/index.html), [FormFieldDirectives](form-field-directives/index.html)

Filter and extract based on query parameters or form fields (of Content\-Type `application/x-www-form-urlencoded` or `multipart/form-data`).
[CodingDirectives](coding-directives/index.html)
Filter and decode compressed request content.
[Marshalling Directives](marshalling-directives/index.html)
Extract the request entity.
[SchemeDirectives](scheme-directives/index.html)
Filter and extract based on the request scheme.
[SecurityDirectives](security-directives/index.html)
Handle authentication data from the request.
[CookieDirectives](cookie-directives/index.html)
Filter and extract cookies.
[BasicDirectives](basic-directives/index.html) and [MiscDirectives](misc-directives/index.html)

Directives handling request properties.
[FileUploadDirectives](file-upload-directives/index.html)
Handle file uploads.
[TlsDirectives](tls-directives/index.html)
Extract and require aspects of TLS/mTLS connections
[JwtDirectives](jwt-directives/index.html)
Require JWT token and extracts its claims

## Directives creating or transforming the response

[CacheConditionDirectives](cache-condition-directives/index.html)
Support for conditional requests (`304 Not Modified` responses).
[CachingDirectives](caching-directives/index.html)
Support for caching expensive operations.
[CookieDirectives](cookie-directives/index.html)
Set, modify, or delete cookies.
[CodingDirectives](coding-directives/index.html)
Compress responses.
[FileAndResourceDirectives](file-and-resource-directives/index.html)
Deliver responses from files and resources.
[RangeDirectives](range-directives/index.html)
Support for range requests (`206 Partial Content` responses).
[RespondWithDirectives](respond-with-directives/index.html)
Change response properties.
[RouteDirectives](route-directives/index.html)
Complete or reject a request with a response.
[BasicDirectives](basic-directives/index.html) and [MiscDirectives](misc-directives/index.html)

Directives handling or transforming response properties.
[TimeoutDirectives](timeout-directives/index.html)
Configure request timeouts and automatic timeout responses.

## List of predefined directives by trait

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cache-condition-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/range-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/by-trait.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/by-trait.html)*
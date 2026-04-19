---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:24Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cache-condition-directives/conditional.html
title: conditional • Akka HTTP
---

# conditional • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# conditional

## Signature

```
def conditional(eTag: EntityTag): Directive0
def conditional(lastModified: DateTime): Directive0
def conditional(eTag: EntityTag, lastModified: DateTime): Directive0
def conditional(eTag: Option[EntityTag], lastModified: Option[DateTime]): Directive0
```

## Description

Wraps its inner route with support for Conditional Requests as defined by [https://datatracker.ietf.org/doc/html/draft\-ietf\-httpbis\-p4\-conditional\-26](https://datatracker.ietf.org/doc/html/draft-ietf-httpbis-p4-conditional-26).

Depending on the given `eTag` and `lastModified` values this directive immediately responds with `304 Not Modified` or `412 Precondition Failed` (without calling its inner route) if the request comes with the respective conditional headers. Otherwise the request is simply passed on to its inner route.

The algorithm implemented by this directive closely follows what is defined in [this section](https://datatracker.ietf.org/doc/html/draft-ietf-httpbis-p4-conditional-26#section-6) of the [HTTPbis spec](https://datatracker.ietf.org/wg/httpbis/documents/).

All responses (the ones produces by this directive itself as well as the ones coming back from the inner route) are augmented with respective [`ETag`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ETag.html "akka.http.javadsl.model.headers.ETag")[`ETag`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ETag.html "akka.http.scaladsl.model.headers.ETag") and `Last-Modified` response headers.

Since this directive requires the [`EntityTag`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html "akka.http.javadsl.model.headers.EntityTag")[`EntityTag`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/EntityTag.html "akka.http.scaladsl.model.headers.EntityTag") and `lastModified` time stamp for the resource as concrete arguments it is usually used quite deep down in the route structure (i.e. close to the leaf\-level), where the exact resource targeted by the request has already been established and the respective ETag/Last\-Modified values can be determined.

The [FileAndResourceDirectives](../file-and-resource-directives/index.html) internally use the `conditional` directive for ETag and Last\-Modified support (if the `akka.http.routing.file-get-conditional` setting is enabled).

## Code Examples

### Example 1: Signature

```scala
def conditional(eTag: EntityTag): Directive0
def conditional(lastModified: DateTime): Directive0
def conditional(eTag: EntityTag, lastModified: DateTime): Directive0
def conditional(eTag: Option[EntityTag], lastModified: Option[DateTime]): Directive0
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ETag.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ETag.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cache-condition-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cache-condition-directives/conditional.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cache-condition-directives/conditional.html)*
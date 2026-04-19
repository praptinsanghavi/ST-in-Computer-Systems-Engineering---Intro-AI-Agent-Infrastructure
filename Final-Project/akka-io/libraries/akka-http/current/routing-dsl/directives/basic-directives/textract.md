---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/textract.html
title: textract • Akka HTTP
---

# textract • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

The `textract` directive is not available in the Java API.

# textract

## Signature

```
def textract[L: Tuple](f: RequestContext => L): Directive[L]
```

## Description

Extracts a tuple of values from the request context and provides them to the inner route.

The `textract` directive is used as a building block for [Custom Directives](../custom-directives.html) to extract data from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") and provide it to the inner route. To extract just one value use the [extract](extract.html) directive. To provide a constant value independent of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") use the [tprovide](tprovide.html) directive instead.

See [Providing Values to Inner Routes](index.html#providedirectives) for an overview of similar directives.

See also [extract](extract.html) for extracting a single value.

## Example

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L213-L225 "Go to snippet source")val pathAndQuery = textract { ctx =>
  val uri = ctx.request.uri
  (uri.path, uri.query())
}
val route =
  pathAndQuery { (p, query) =>
    complete(s"The path is $p and the query is $query")
  }

// tests:
Get("/abcdef?ghi=12") ~> route ~> check {
  responseAs[String] shouldEqual "The path is /abcdef and the query is ghi=12"
}
```

## Code Examples

### Example 1: Signature

```scala
def textract[L: Tuple](f: RequestContext => L): Directive[L]
```

### Example 2: Example

```scala
val pathAndQuery = textract { ctx =>
  val uri = ctx.request.uri
  (uri.path, uri.query())
}
val route =
  pathAndQuery { (p, query) =>
    complete(s"The path is $p and the query is $query")
  }

// tests:
Get("/abcdef?ghi=12") ~> route ~> check {
  responseAs[String] shouldEqual "The path is /abcdef and the query is ghi=12"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejectionsWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/toStrictEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/tprovide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/textract.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/textract.html)*
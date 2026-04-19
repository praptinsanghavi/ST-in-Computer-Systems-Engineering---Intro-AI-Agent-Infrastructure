---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/tprovide.html
title: tprovide • Akka HTTP
---

# tprovide • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

The `tprovide` directive is not available in the Java API.

# tprovide

## Signature

```
def tprovide[L: Tuple](values: L): Directive[L]
```

## Description

Provides a tuple of values to the inner route.

The `tprovide` directive is used as a building block for [Custom Directives](../custom-directives.html) to provide data to the inner route. To provide just one value use the [provide](provide.html) directive. If you want to provide values calculated from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") use the [textract](textract.html) directive instead.

See [Providing Values to Inner Routes](index.html#providedirectives) for an overview of similar directives.

See also [provide](provide.html) for providing a single value.

## Example

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L230-L239 "Go to snippet source")def provideStringAndLength(value: String) = tprovide((value, value.length))
val route =
  provideStringAndLength("test") { (value, len) =>
    complete(s"Value is $value and its length is $len")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "Value is test and its length is 4"
}
```

## Code Examples

### Example 1: Signature

```scala
def tprovide[L: Tuple](values: L): Directive[L]
```

### Example 2: Example

```scala
def provideStringAndLength(value: String) = tprovide((value, value.length))
val route =
  provideStringAndLength("test") { (value, len) =>
    complete(s"Value is $value and its length is $len")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "Value is test and its length is 4"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/provide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/textract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/toStrictEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withExecutionContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/tprovide.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/tprovide.html)*
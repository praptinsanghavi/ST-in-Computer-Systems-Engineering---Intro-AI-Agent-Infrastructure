---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html
title: extract • Akka HTTP
---

# extract • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extract

## Signature

```
def extract[T](f: RequestContext => T): Directive1[T]
```

## Description

The `extract` directive is used as a building block for [Custom Directives](../custom-directives.html) to extract data from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") and provide it to the inner route. It is a special case for extracting one value of the more general [textract](textract.html) directive that can be used to extract more than one value.

See [Providing Values to Inner Routes](index.html#providedirectives) for an overview of similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L25-L34 "Go to snippet source")val uriLength = extract(_.request.uri.toString.length)
val route =
  uriLength { len =>
    complete(s"The length of the request URI is $len")
  }

// tests:
Get("/abcdef") ~> route ~> check {
  responseAs[String] shouldEqual "The length of the request URI is 25"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L60-L272 "Go to snippet source")import static akka.http.javadsl.server.Directives.extract;

final Route route = extract(
  ctx -> ctx.getRequest().getUri().toString().length(),
  len -> complete("The length of the request URI is " + len)
);

// tests:
testRoute(route).run(HttpRequest.GET("/abcdef"))
  .assertEntity("The length of the request URI is 25");
```

## Code Examples

### Example 1: Signature

```scala
def extract[T](f: RequestContext => T): Directive1[T]
```

### Example 2: Example

```scala
val uriLength = extract(_.request.uri.toString.length)
val route =
  uriLength { len =>
    complete(s"The length of the request URI is $len")
  }

// tests:
Get("/abcdef") ~> route ~> check {
  responseAs[String] shouldEqual "The length of the request URI is 25"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extract;

final Route route = extract(
  ctx -> ctx.getRequest().getUri().toString().length(),
  len -> complete("The length of the request URI is " + len)
);

// tests:
testRoute(route).run(HttpRequest.GET("/abcdef"))
  .assertEntity("The length of the request URI is 25");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractActorSystem.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/textract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html)*
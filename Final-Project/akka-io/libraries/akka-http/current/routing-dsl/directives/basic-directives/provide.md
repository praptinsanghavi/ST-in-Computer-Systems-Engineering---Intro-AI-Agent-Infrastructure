---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/provide.html
title: provide • Akka HTTP
---

# provide • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# provide

## Signature

```
def provide[T](value: T): Directive1[T]
```

## Description

Provides a constant value to the inner route.

The *provide* directive is used as a building block for [Custom Directives](../custom-directives.html) to provide a single value to the inner route. To provide several values use the [tprovide](tprovide.html) directive.

See [Providing Values to Inner Routes](index.html#providedirectives) for an overview of similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L616-L625 "Go to snippet source")def providePrefixedString(value: String): Directive1[String] = provide("prefix:" + value)
val route =
  providePrefixedString("test") { value =>
    complete(value)
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "prefix:test"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L76-L832 "Go to snippet source")import static akka.http.javadsl.server.Directives.provide;

final Route route = providePrefixedStringRoute("test");

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("prefix:test");
```

## Code Examples

### Example 1: Signature

```scala
def provide[T](value: T): Directive1[T]
```

### Example 2: Example

```scala
def providePrefixedString(value: String): Directive1[String] = provide("prefix:" + value)
val route =
  providePrefixedString("test") { value =>
    complete(value)
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "prefix:test"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.provide;

final Route route = providePrefixedStringRoute("test");

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("prefix:test");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/pass.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/tprovide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/provide.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/provide.html)*
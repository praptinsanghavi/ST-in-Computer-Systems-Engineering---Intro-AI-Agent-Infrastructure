---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/pass.html
title: pass • Akka HTTP
---

# pass • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# pass

## Signature

```
def pass: Directive0
```

## Description

A directive that passes the request unchanged to its inner route.

It is usually used as a “neutral element” when combining directives generically.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L606-L611 "Go to snippet source")val route = pass(complete("abc"))

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "abc"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L120-L817 "Go to snippet source")import static akka.http.javadsl.server.Directives.pass;

final Route route = pass(() -> complete("abc"));

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("abc");
```

## Code Examples

### Example 1: Signature

```scala
def pass: Directive0
```

### Example 2: Example

```scala
val route = pass(complete("abc"))

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "abc"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.pass;

final Route route = pass(() -> complete("abc"));

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("abc");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/provide.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/pass.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/pass.html)*
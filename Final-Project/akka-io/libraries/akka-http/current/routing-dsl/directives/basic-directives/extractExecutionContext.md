---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractExecutionContext.html
title: extractExecutionContext • Akka HTTP
---

# extractExecutionContext • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractExecutionContext

## Signature

```
def extractExecutionContext: Directive1[ExecutionContextExecutor]
```

## Description

Extracts the `ExecutionContext` from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext").

See [withExecutionContext](withExecutionContext.html) to see how to customise the execution context provided for an inner route.

See [extract](extract.html) to learn more about how extractions work.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L132-L149 "Go to snippet source")def sample() =
  path("sample") {
    extractExecutionContext { implicit executor =>
      complete {
        Future(s"Run on ${executor.##}!") // uses the `executor` ExecutionContext
      }
    }
  }

val route =
  pathPrefix("special") {
    sample() // default execution context will be used
  }

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Run on ${system.dispatcher.##}!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L80-L390 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractExecutionContext;

final Route route = path("sample", () ->
  extractExecutionContext(executor ->
    onSuccess(
      CompletableFuture.supplyAsync(
        // uses the `executor` ExecutionContext
        () -> "Run on " + executor.hashCode() + "!", executor
      ), str -> complete(str)
    )
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Run on " + system().dispatcher().hashCode() + "!");
```

## Code Examples

### Example 1: Signature

```scala
def extractExecutionContext: Directive1[ExecutionContextExecutor]
```

### Example 2: Example

```scala
def sample() =
  path("sample") {
    extractExecutionContext { implicit executor =>
      complete {
        Future(s"Run on ${executor.##}!") // uses the `executor` ExecutionContext
      }
    }
  }

val route =
  pathPrefix("special") {
    sample() // default execution context will be used
  }

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Run on ${system.dispatcher.##}!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractExecutionContext;

final Route route = path("sample", () ->
  extractExecutionContext(executor ->
    onSuccess(
      CompletableFuture.supplyAsync(
        // uses the `executor` ExecutionContext
        () -> "Run on " + executor.hashCode() + "!", executor
      ), str -> complete(str)
    )
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Run on " + system().dispatcher().hashCode() + "!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractDataBytes.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractLog.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withExecutionContext.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractExecutionContext.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractExecutionContext.html)*
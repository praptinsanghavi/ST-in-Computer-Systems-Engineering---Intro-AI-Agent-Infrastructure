---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withExecutionContext.html
title: withExecutionContext • Akka HTTP
---

# withExecutionContext • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withExecutionContext

## Signature

```
def withExecutionContext(ec: ExecutionContextExecutor): Directive0
```

## Description

Allows running an inner route using an alternative `ExecutionContextExecutor` in place of the default one.

The execution context can be extracted in an inner route using [extractExecutionContext](extractExecutionContext.html) directly, or used by directives which internally extract the materializer without surfacing this fact in the API.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L103-L127 "Go to snippet source")val special = system.dispatchers.lookup("special")

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
    withExecutionContext(special) {
      sample() // `special` execution context will be used
    }
  } ~ sample() // default execution context will be used

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Run on ${system.dispatcher.##}!"
}
Get("/special/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Run on ${special.##}!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L84-L370 "Go to snippet source")import static akka.http.javadsl.server.Directives.withExecutionContext;

final ExecutionContextExecutor special =
  ExecutionContexts.fromExecutor(Executors.newFixedThreadPool(1));

final Route sample = path("sample", () ->
  extractExecutionContext(executor ->
    onSuccess(() ->
      CompletableFuture.supplyAsync(() ->
        "Run on " + executor.hashCode() + "!", executor
      ), Directives::complete
    )
  )
);

final Route route = Directives.concat(
  pathPrefix("special", () ->
    // `special` execution context will be used
    withExecutionContext(special, () -> sample)
  ),
  sample // default execution context will be used
);

// tests:
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Run on " + system().dispatcher().hashCode() + "!");
testRoute(route).run(HttpRequest.GET("/special/sample"))
  .assertEntity("Run on " + special.hashCode() + "!");
```

## Code Examples

### Example 1: Signature

```scala
def withExecutionContext(ec: ExecutionContextExecutor): Directive0
```

### Example 2: Example

```scala
val special = system.dispatchers.lookup("special")

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
    withExecutionContext(special) {
      sample() // `special` execution context will be used
    }
  } ~ sample() // default execution context will be used

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Run on ${system.dispatcher.##}!"
}
Get("/special/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Run on ${special.##}!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.withExecutionContext;


final ExecutionContextExecutor special =
  ExecutionContexts.fromExecutor(Executors.newFixedThreadPool(1));

final Route sample = path("sample", () ->
  extractExecutionContext(executor ->
    onSuccess(() ->
      CompletableFuture.supplyAsync(() ->
        "Run on " + executor.hashCode() + "!", executor
      ), Directives::complete
    )
  )
);

final Route route = Directives.concat(
  pathPrefix("special", () ->
    // `special` execution context will be used
    withExecutionContext(special, () -> sample)
  ),
  sample // default execution context will be used
);

// tests:
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Run on " + system().dispatcher().hashCode() + "!");
testRoute(route).run(HttpRequest.GET("/special/sample"))
  .assertEntity("Run on " + special.hashCode() + "!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractExecutionContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/tprovide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withLog.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withExecutionContext.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withExecutionContext.html)*
---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/completeOrRecoverWith.html
title: completeOrRecoverWith • Akka HTTP
---

# completeOrRecoverWith • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# completeOrRecoverWith

## Signature

```
def completeOrRecoverWith(magnet: CompleteOrRecoverWithMagnet): Directive1[Throwable]
```

## Description

If the `Future[T]``CompletionStage<T>` succeeds the request is completed using the value’s marshaller (this directive therefore requires a marshaller for the future’s parametercompletion stage value type to be implicitly availableprovided). The execution of the inner route passed to this directive is only executed if the given futurecompletion stage completed with a failure, exposing the reason of failure as an extraction of type `Throwable`.

To handle the successful case manually as well, use the [onComplete](onComplete.html) directive, instead.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FutureDirectivesExamplesSpec.scala#L141-L163 "Go to snippet source")val route =
  concat(
    path("success") {
      completeOrRecoverWith(Future { "Ok" }) { extraction =>
        failWith(extraction) // not executed.
      }
    },
    path("failure") {
      completeOrRecoverWith(Future.failed[String](TestException)) { extraction =>
        failWith(extraction)
      }
    }
  )

// tests:
Get("/success") ~> route ~> check {
  responseAs[String] shouldEqual "Ok"
}

Get("/failure") ~> Route.seal(route) ~> check {
  status shouldEqual InternalServerError
  responseAs[String] shouldEqual "Unsuccessful future!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FutureDirectivesExamplesTest.java#L38-L125 "Go to snippet source")import static akka.http.javadsl.server.Directives.completeOrRecoverWith;
import static akka.http.javadsl.server.Directives.failWith;

final Route route = path("success", () ->
        completeOrRecoverWith(
                () -> CompletableFuture.supplyAsync(() -> "Ok"),
                Marshaller.stringToEntity(),
                extraction -> failWith(extraction) // not executed
        )
).orElse(path("failure", () ->
        completeOrRecoverWith(
                () -> CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException();
                }),
                Marshaller.stringToEntity(),
                extraction -> failWith(extraction))
));

testRoute(route).run(HttpRequest.GET("/success"))
        .assertEntity("Ok");

testRoute(route).run(HttpRequest.GET("/failure"))
        .assertStatusCode(StatusCodes.InternalServerError())
        .assertEntity("There was an internal server error.");
```

## Code Examples

### Example 1: Signature

```scala
def completeOrRecoverWith(magnet: CompleteOrRecoverWithMagnet): Directive1[Throwable]
```

### Example 2: Example

```scala
val route =
  concat(
    path("success") {
      completeOrRecoverWith(Future { "Ok" }) { extraction =>
        failWith(extraction) // not executed.
      }
    },
    path("failure") {
      completeOrRecoverWith(Future.failed[String](TestException)) { extraction =>
        failWith(extraction)
      }
    }
  )

// tests:
Get("/success") ~> route ~> check {
  responseAs[String] shouldEqual "Ok"
}

Get("/failure") ~> Route.seal(route) ~> check {
  status shouldEqual InternalServerError
  responseAs[String] shouldEqual "Unsuccessful future!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.completeOrRecoverWith;
import static akka.http.javadsl.server.Directives.failWith;

final Route route = path("success", () ->
        completeOrRecoverWith(
                () -> CompletableFuture.supplyAsync(() -> "Ok"),
                Marshaller.stringToEntity(),
                extraction -> failWith(extraction) // not executed
        )
).orElse(path("failure", () ->
        completeOrRecoverWith(
                () -> CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException();
                }),
                Marshaller.stringToEntity(),
                extraction -> failWith(extraction))
));

testRoute(route).run(HttpRequest.GET("/success"))
        .assertEntity("Ok");

testRoute(route).run(HttpRequest.GET("/failure"))
        .assertStatusCode(StatusCodes.InternalServerError())
        .assertEntity("There was an internal server error.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onComplete.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onSuccess.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/completeOrRecoverWith.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/completeOrRecoverWith.html)*
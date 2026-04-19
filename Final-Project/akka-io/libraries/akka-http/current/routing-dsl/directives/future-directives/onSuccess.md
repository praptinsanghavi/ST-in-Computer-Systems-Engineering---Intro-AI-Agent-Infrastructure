---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onSuccess.html
title: onSuccess • Akka HTTP
---

# onSuccess • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# onSuccess

## Signature

```
def onSuccess(unitFuture: Future[Unit]): Directive0
def onSuccess(simpleTypeFuture: Future[T]): Directive1[T]
def onSuccess(hlistFuture: Future[T_0 :: ... T_i ... :: HNil]): Directive[T_0 :: ... T_i ... :: HNil]

```

The signature shown is simplified and written in pseudo\-syntax, the real signature uses magnets. [\[1]](#1).

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

Evaluates its parameter of type `Future[T]``CompletionStage<T>`, and once it has been completed successfully, extracts its result as a value of type `T` and passes it to the inner route.

If the future fails its failure throwable is bubbled up to the nearest [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler").

To handle the `Failure` case manually as well, use [onComplete](onComplete.html), instead.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FutureDirectivesExamplesSpec.scala#L113-L135 "Go to snippet source")val route =
  concat(
    path("success") {
      onSuccess(Future { "Ok" }) { extraction =>
        complete(extraction)
      }
    },
    path("failure") {
      onSuccess(Future.failed[String](TestException)) { extraction =>
        complete(extraction)
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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FutureDirectivesExamplesTest.java#L32-L98 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.onSuccess;
import static akka.http.javadsl.server.Directives.path;

final Route route = path("success", () ->
        onSuccess(CompletableFuture.supplyAsync(() -> "Ok"),
                extraction -> complete(extraction)
        )
).orElse(path("failure", () ->
        onSuccess(CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException();
                }),
                extraction -> complete("never reaches here"))
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
def onSuccess(unitFuture: Future[Unit]): Directive0
def onSuccess(simpleTypeFuture: Future[T]): Directive1[T]
def onSuccess(hlistFuture: Future[T_0 :: ... T_i ... :: HNil]): Directive[T_0 :: ... T_i ... :: HNil]
```

### Example 2: Example

```scala
val route =
  concat(
    path("success") {
      onSuccess(Future { "Ok" }) { extraction =>
        complete(extraction)
      }
    },
    path("failure") {
      onSuccess(Future.failed[String](TestException)) { extraction =>
        complete(extraction)
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
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.onSuccess;
import static akka.http.javadsl.server.Directives.path;

final Route route = path("success", () ->
        onSuccess(CompletableFuture.supplyAsync(() -> "Ok"),
                extraction -> complete(extraction)
        )
).orElse(path("failure", () ->
        onSuccess(CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException();
                }),
                extraction -> complete("never reaches here"))
));

testRoute(route).run(HttpRequest.GET("/success"))
        .assertEntity("Ok");

testRoute(route).run(HttpRequest.GET("/failure"))
        .assertStatusCode(StatusCodes.InternalServerError())
        .assertEntity("There was an internal server error.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/completeOrRecoverWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onComplete.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onCompleteWithBreaker.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onSuccess.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onSuccess.html)*
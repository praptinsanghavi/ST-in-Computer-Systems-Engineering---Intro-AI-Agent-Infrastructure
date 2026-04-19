---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onComplete.html
title: onComplete • Akka HTTP
---

# onComplete • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# onComplete

## Signature

```
def onComplete[T](future: => Future[T]): Directive1[Try[T]]
```

## Description

Evaluates its parameter of type `Future[T]``CompletionStage<T>`, and once it has been completed, extracts its result as a value of type `Try[T]``Try<T>` and passes it to the inner route. A `Try<T>` can either be a `Success` containing the `T` value or a `Failure` containing the `Throwable`.

To handle the `Failure` case automatically and only work with the result value, use [onSuccess](onSuccess.html).

To complete with a successful result automatically and just handle the failure result, use [completeOrRecoverWith](completeOrRecoverWith.html), instead.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FutureDirectivesExamplesSpec.scala#L32-L52 "Go to snippet source")def divide(a: Int, b: Int): Future[Int] = Future {
  a / b
}

val route =
  path("divide" / IntNumber / IntNumber) { (a, b) =>
    onComplete(divide(a, b)) {
      case Success(value) => complete(s"The result was $value")
      case Failure(ex)    => complete(InternalServerError, s"An error occurred: ${ex.getMessage}")
    }
  }

// tests:
Get("/divide/10/2") ~> route ~> check {
  responseAs[String] shouldEqual "The result was 5"
}

Get("/divide/10/0") ~> Route.seal(route) ~> check {
  status shouldEqual InternalServerError
  responseAs[String] shouldEqual "An error occurred: / by zero"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FutureDirectivesExamplesTest.java#L26-L75 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.onComplete;
import static akka.http.javadsl.server.Directives.path;

// import static scala.compat.java8.JFunction.func;
// import static akka.http.javadsl.server.PathMatchers.*;

final Route route = path(segment("divide").slash(integerSegment()).slash(integerSegment()),
        (a, b) -> onComplete(
                () -> CompletableFuture.supplyAsync(() -> a / b),
                maybeResult -> maybeResult
                        .map(result -> complete("The result was " + result))
                        .recover(new PFBuilder<Throwable, Route>()
                                .matchAny(ex -> complete(StatusCodes.InternalServerError(),
                                        "An error occurred: " + ex.getMessage())
                                )
                                .build())
                        .get()
        )
);

testRoute(route).run(HttpRequest.GET("/divide/10/2"))
        .assertEntity("The result was 5");

testRoute(route).run(HttpRequest.GET("/divide/10/0"))
        .assertStatusCode(StatusCodes.InternalServerError())
        .assertEntity("An error occurred: / by zero");
```

Note
Using the `onComplete` directive means that you’ll have to explicitly and manually handle failure cases. Doing this for every route in your app will result in a lot of boilerplate code. Most of the time you want to use the [Exception Handling](../../exception-handling.html) mechanism instead.

Note
The identically named `onComplete` method of Scala’s `Future` (from the standard library) does not work at all in this context since it’s just a method that returns `Unit` \- whereas Akka HTTP’s `onComplete` is a `Directive` that creates a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server").

## Code Examples

### Example 1: Signature

```scala
def onComplete[T](future: => Future[T]): Directive1[Try[T]]
```

### Example 2: Example

```scala
def divide(a: Int, b: Int): Future[Int] = Future {
  a / b
}

val route =
  path("divide" / IntNumber / IntNumber) { (a, b) =>
    onComplete(divide(a, b)) {
      case Success(value) => complete(s"The result was $value")
      case Failure(ex)    => complete(InternalServerError, s"An error occurred: ${ex.getMessage}")
    }
  }

// tests:
Get("/divide/10/2") ~> route ~> check {
  responseAs[String] shouldEqual "The result was 5"
}

Get("/divide/10/0") ~> Route.seal(route) ~> check {
  status shouldEqual InternalServerError
  responseAs[String] shouldEqual "An error occurred: / by zero"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.onComplete;
import static akka.http.javadsl.server.Directives.path;

// import static scala.compat.java8.JFunction.func;
// import static akka.http.javadsl.server.PathMatchers.*;

final Route route = path(segment("divide").slash(integerSegment()).slash(integerSegment()),
        (a, b) -> onComplete(
                () -> CompletableFuture.supplyAsync(() -> a / b),
                maybeResult -> maybeResult
                        .map(result -> complete("The result was " + result))
                        .recover(new PFBuilder<Throwable, Route>()
                                .matchAny(ex -> complete(StatusCodes.InternalServerError(),
                                        "An error occurred: " + ex.getMessage())
                                )
                                .build())
                        .get()
        )
);

testRoute(route).run(HttpRequest.GET("/divide/10/2"))
        .assertEntity("The result was 5");

testRoute(route).run(HttpRequest.GET("/divide/10/0"))
        .assertStatusCode(StatusCodes.InternalServerError())
        .assertEntity("An error occurred: / by zero");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/completeOrRecoverWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onCompleteWithBreaker.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onSuccess.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onComplete.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onComplete.html)*
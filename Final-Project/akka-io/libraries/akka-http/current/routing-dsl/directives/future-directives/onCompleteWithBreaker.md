---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onCompleteWithBreaker.html
title: onCompleteWithBreaker • Akka HTTP
---

# onCompleteWithBreaker • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# onCompleteWithBreaker

## Signature

```
def onCompleteWithBreaker[T](breaker: CircuitBreaker)(future: => Future[T]): Directive1[Try[T]]
```

## Description

Evaluates its parameter of type `Future[T]``CompletionStage<T>` protecting it with the specified [`CircuitBreaker`](https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker"). Refer to [Circuit Breaker](https://doc.akka.io/libraries/akka-core/2.10/common/circuitbreaker.html) for a detailed description of this pattern.

If the [`CircuitBreaker`](https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker") is open, the request is rejected with a [`CircuitBreakerOpenRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html "akka.http.javadsl.server.CircuitBreakerOpenRejection")[`CircuitBreakerOpenRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html "akka.http.scaladsl.server.CircuitBreakerOpenRejection"). Note that in this case the request’s entity databytes stream is cancelled, and the connection is closed as a consequence.

Otherwise, the same behaviour provided by [onComplete](onComplete.html) is to be expected.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FutureDirectivesExamplesSpec.scala#L62-L105 "Go to snippet source")def divide(a: Int, b: Int): Future[Int] = Future {
  a / b
}

val resetTimeout = 1.second
val breaker = new CircuitBreaker(
  system.scheduler,
  maxFailures = 1,
  callTimeout = 5.seconds,
  resetTimeout
)

val route =
  path("divide" / IntNumber / IntNumber) { (a, b) =>
    onCompleteWithBreaker(breaker)(divide(a, b)) {
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
} // opens the circuit breaker

Get("/divide/10/2") ~> route ~> check {
  rejection shouldBe a[CircuitBreakerOpenRejection]
}

Thread.sleep(resetTimeout.toMillis + 200)

Get("/divide/10/2") ~> route ~> check {
  responseAs[String] shouldEqual "The result was 5"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FutureDirectivesExamplesTest.java#L43-L188 "Go to snippet source")import static akka.http.javadsl.server.Directives.onCompleteWithBreaker;
import static akka.http.javadsl.server.Directives.path;

// import static scala.compat.java8.JFunction.func;
// import static akka.http.javadsl.server.PathMatchers.*;

final int maxFailures = 1;
final Duration callTimeout = Duration.ofSeconds(5);
final Duration resetTimeout = Duration.ofSeconds(1);
final CircuitBreaker breaker = CircuitBreaker.create(system().scheduler(), maxFailures, callTimeout, resetTimeout);

final Route route = path(segment("divide").slash(integerSegment()).slash(integerSegment()),
        (a, b) -> onCompleteWithBreaker(breaker,
                () -> CompletableFuture.supplyAsync(() -> a / b),
                maybeResult -> maybeResult
                        .map(result -> complete("The result was " + result))
                        .recover(new PFBuilder<Throwable, Route>()
                                .matchAny(ex -> complete(StatusCodes.InternalServerError(),
                                        "An error occurred: " + ex.toString())
                                )
                                .build())
                        .get()
        )
);

testRoute(route).run(HttpRequest.GET("/divide/10/2"))
        .assertEntity("The result was 5");

testRoute(route).run(HttpRequest.GET("/divide/10/0"))
        .assertStatusCode(StatusCodes.InternalServerError())
        .assertEntity("An error occurred: java.lang.ArithmeticException: / by zero");

// The circuit-breaker will eventually be opened
new TestKit(system()) {
    {
        awaitAssert(
                Duration.ofSeconds(500),
                () -> {
                    testRoute(route).run(HttpRequest.GET("/divide/10/0"))
                            .assertEntity("The server is currently unavailable (because it is overloaded or down for maintenance).")
                            .assertStatusCode(StatusCodes.ServiceUnavailable());
                    return null;
                });

        Thread.sleep(resetTimeout.toMillis());

        // circuit breaker resets after this time, but observing it
        // is timing sensitive so retry a few times within a timeout
        awaitAssert(
                Duration.ofSeconds(500),
                () -> {
                    testRoute(route).run(HttpRequest.GET("/divide/8/2"))
                            .assertEntity("The result was 4");
                    return null;
                });
    }
};
```

## Code Examples

### Example 1: Signature

```scala
def onCompleteWithBreaker[T](breaker: CircuitBreaker)(future: => Future[T]): Directive1[Try[T]]
```

### Example 2: Example

```scala
def divide(a: Int, b: Int): Future[Int] = Future {
  a / b
}

val resetTimeout = 1.second
val breaker = new CircuitBreaker(
  system.scheduler,
  maxFailures = 1,
  callTimeout = 5.seconds,
  resetTimeout
)

val route =
  path("divide" / IntNumber / IntNumber) { (a, b) =>
    onCompleteWithBreaker(breaker)(divide(a, b)) {
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
} // opens the circuit breaker

Get("/divide/10/2") ~> route ~> check {
  rejection shouldBe a[CircuitBreakerOpenRejection]
}

Thread.sleep(resetTimeout.toMillis + 200)

Get("/divide/10/2") ~> route ~> check {
  responseAs[String] shouldEqual "The result was 5"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.onCompleteWithBreaker;
import static akka.http.javadsl.server.Directives.path;

// import static scala.compat.java8.JFunction.func;
// import static akka.http.javadsl.server.PathMatchers.*;

final int maxFailures = 1;
final Duration callTimeout = Duration.ofSeconds(5);
final Duration resetTimeout = Duration.ofSeconds(1);
final CircuitBreaker breaker = CircuitBreaker.create(system().scheduler(), maxFailures, callTimeout, resetTimeout);

final Route route = path(segment("divide").slash(integerSegment()).slash(integerSegment()),
        (a, b) -> onCompleteWithBreaker(breaker,
                () -> CompletableFuture.supplyAsync(() -> a / b),
                maybeResult -> maybeResult
                        .map(result -> complete("The result was " + result))
                        .recover(new PFBuilder<Throwable, Route>()
                                .matchAny(ex -> complete(StatusCodes.InternalServerError(),
                                        "An error occurred: " + ex.toString())
                                )
                                .build())
                        .get()
        )
);

testRoute(route).run(HttpRequest.GET("/divide/10/2"))
        .assertEntity("The result was 5");

testRoute(route).run(HttpRequest.GET("/divide/10/0"))
        .assertStatusCode(StatusCodes.InternalServerError())
        .assertEntity("An error occurred: java.lang.ArithmeticException: / by zero");

// The circuit-breaker will eventually be opened
new TestKit(system()) {
    {
        awaitAssert(
                Duration.ofSeconds(500),
                () -> {
                    testRoute(route).run(HttpRequest.GET("/divide/10/0"))
                            .assertEntity("The server is currently unavailable (because it is overloaded or down for maintenance).")
                            .assertStatusCode(StatusCodes.ServiceUnavailable());
                    return null;
                });

        Thread.sleep(resetTimeout.toMillis());

        // circuit breaker resets after this time, but observing it
        // is timing sensitive so retry a few times within a timeout
        awaitAssert(
                Duration.ofSeconds(500),
                () -> {
                    testRoute(route).run(HttpRequest.GET("/divide/8/2"))
                            .assertEntity("The result was 4");
                    return null;
                });
    }
};
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/libraries/akka-core/2.10/common/circuitbreaker.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onComplete.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onSuccess.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onCompleteWithBreaker.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/onCompleteWithBreaker.html)*
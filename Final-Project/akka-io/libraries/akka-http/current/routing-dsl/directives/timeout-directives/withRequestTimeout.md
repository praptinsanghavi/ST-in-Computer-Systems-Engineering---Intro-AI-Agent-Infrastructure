---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeout.html
title: withRequestTimeout • Akka HTTP
---

# withRequestTimeout • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withRequestTimeout

## Signature

```
def withRequestTimeout(timeout: Duration): Directive0
def withRequestTimeout(timeout: Duration, handler: HttpRequest => HttpResponse): Directive0
def withRequestTimeout(timeout: Duration, handler: Option[HttpRequest => HttpResponse]): Directive0
```

## Description

This directive enables “late” (during request processing) control over the [Request timeout](../../../common/timeouts.html#request-timeout) feature in Akka HTTP.

The timeout can be either loosened or made more tight using this directive, however one should be aware that it is inherently racy (which may especially show with very tight timeouts) since a timeout may already have been triggered when this directive executes.

In case of pipelined HTTP requests (multiple requests being accepted on the same connection before sending the first response) a the request timeout failure of the `n-th` request *will shut down the connection* causing the already enqueued requests to be dropped. This is by\-design, as the request timeout feature serves as a “safety net” in case of programming errors (e.g. a Future that never completes thus potentially blocking the entire connection forever) or malicious attacks on the server.

Optionally, a timeout handler may be provided in which is called when a time\-out is triggered and must produce an [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") that will be sent back to the client instead of the “too late” response (in case it’d ever arrive). See also [withRequestTimeoutResponse](withRequestTimeoutResponse.html) if only looking to customise the timeout response without changing the timeout itself.

Warning
Please note that setting the timeout from within a directive is inherently racy (as the “point in time from which we’re measuring the timeout” is already in the past (the moment we started handling the request), so if the existing timeout already was triggered before your directive had the chance to change it, an timeout may still be logged.

It is recommended to use a larger statically configured timeout (think of it as a “safety net” against programming errors or malicious attackers) and if needed tighten it using the directives – not the other way around.

For more information about various timeouts in Akka HTTP see [Akka HTTP Timeouts](../../../common/timeouts.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/TimeoutDirectivesExamplesSpec.scala#L38-L49 "Go to snippet source")val route =
  path("timeout") {
    withRequestTimeout(1.seconds) { // modifies the global akka.http.server.request-timeout for this request
      val response: Future[String] = slowFuture() // very slow
      complete(response)
    }
  }

// check
Get("/timeout") ~!> route ~> check {
  status should ===(StatusCodes.ServiceUnavailable) // the timeout response
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/TimeoutDirectivesExamplesTest.java#L78-L89 "Go to snippet source")final Duration timeout = Duration.create(1, TimeUnit.SECONDS);
CompletionStage<String> slowFuture = new CompletableFuture<>();

final Route route = path("timeout", () ->
        withRequestTimeout(timeout, () -> {
            return completeOKWithFutureString(slowFuture); // very slow
        })
);

// test:
StatusCode statusCode = runRoute(route, "timeout").get().status();
assert (StatusCodes.SERVICE_UNAVAILABLE.equals(statusCode));
```

With setting the handler at the same time:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/TimeoutDirectivesExamplesSpec.scala#L68-L84 "Go to snippet source")val timeoutResponse = HttpResponse(
  StatusCodes.EnhanceYourCalm,
  entity = "Unable to serve response within time limit, please enhance your calm.")

val route =
  path("timeout") {
    // updates timeout and handler at
    withRequestTimeout(1.milli, request => timeoutResponse) {
      val response: Future[String] = slowFuture() // very slow
      complete(response)
    }
  }

// check
Get("/timeout") ~!> route ~> check {
  status should ===(StatusCodes.EnhanceYourCalm) // the timeout response
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/TimeoutDirectivesExamplesTest.java#L113-L128 "Go to snippet source")final Duration timeout = Duration.create(1, TimeUnit.MILLISECONDS);
CompletionStage<String> slowFuture = new CompletableFuture<>();

HttpResponse enhanceYourCalmResponse = HttpResponse.create()
        .withStatus(StatusCodes.ENHANCE_YOUR_CALM)
        .withEntity("Unable to serve response within time limit, please enhance your calm.");

final Route route = path("timeout", () ->
        withRequestTimeout(timeout, (request) -> enhanceYourCalmResponse, () -> {
            return completeOKWithFutureString(slowFuture); // very slow
        })
);

// test:
StatusCode statusCode = runRoute(route, "timeout").get().status();
assert (StatusCodes.ENHANCE_YOUR_CALM.equals(statusCode));
```

## Code Examples

### Example 1: Signature

```scala
def withRequestTimeout(timeout: Duration): Directive0
def withRequestTimeout(timeout: Duration, handler: HttpRequest => HttpResponse): Directive0
def withRequestTimeout(timeout: Duration, handler: Option[HttpRequest => HttpResponse]): Directive0
```

### Example 2: Example

```scala
val route =
  path("timeout") {
    withRequestTimeout(1.seconds) { // modifies the global akka.http.server.request-timeout for this request
      val response: Future[String] = slowFuture() // very slow
      complete(response)
    }
  }

// check
Get("/timeout") ~!> route ~> check {
  status should ===(StatusCodes.ServiceUnavailable) // the timeout response
}
```

### Example 3: Example

```java
final Duration timeout = Duration.create(1, TimeUnit.SECONDS);
CompletionStage<String> slowFuture = new CompletableFuture<>();

final Route route = path("timeout", () ->
        withRequestTimeout(timeout, () -> {
            return completeOKWithFutureString(slowFuture); // very slow
        })
);

// test:
StatusCode statusCode = runRoute(route, "timeout").get().status();
assert (StatusCodes.SERVICE_UNAVAILABLE.equals(statusCode));
```

### Example 4: Example

```scala
val timeoutResponse = HttpResponse(
  StatusCodes.EnhanceYourCalm,
  entity = "Unable to serve response within time limit, please enhance your calm.")

val route =
  path("timeout") {
    // updates timeout and handler at
    withRequestTimeout(1.milli, request => timeoutResponse) {
      val response: Future[String] = slowFuture() // very slow
      complete(response)
    }
  }

// check
Get("/timeout") ~!> route ~> check {
  status should ===(StatusCodes.EnhanceYourCalm) // the timeout response
}
```

### Example 5: Example

```java
final Duration timeout = Duration.create(1, TimeUnit.MILLISECONDS);
CompletionStage<String> slowFuture = new CompletableFuture<>();

HttpResponse enhanceYourCalmResponse = HttpResponse.create()
        .withStatus(StatusCodes.ENHANCE_YOUR_CALM)
        .withEntity("Unable to serve response within time limit, please enhance your calm.");

final Route route = path("timeout", () ->
        withRequestTimeout(timeout, (request) -> enhanceYourCalmResponse, () -> {
            return completeOKWithFutureString(slowFuture); // very slow
        })
);

// test:
StatusCode statusCode = runRoute(route, "timeout").get().status();
assert (StatusCodes.ENHANCE_YOUR_CALM.equals(statusCode));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/extractRequestTimeout.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeoutResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withoutRequestTimeout.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeout.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeout.html)*
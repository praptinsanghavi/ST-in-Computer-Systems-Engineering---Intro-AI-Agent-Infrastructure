---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeoutResponse.html
title: withRequestTimeoutResponse • Akka HTTP
---

# withRequestTimeoutResponse • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withRequestTimeoutResponse

## Signature

```
def withRequestTimeoutResponse(handler: HttpRequest => HttpResponse): Directive0
```

## Description

Allows customising the [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") that will be sent to clients in case of a [Request timeout](../../../common/timeouts.html#request-timeout).

See also [withRequestTimeout](withRequestTimeout.html) or [withoutRequestTimeout](withoutRequestTimeout.html) if interested in dynamically changing the timeout for a given route instead.

Warning
Please note that setting handler is inherently racy as the timeout is measured from starting to handle the request to its deadline, thus if the timeout triggers before the `withRequestTimeoutResponse` executed it would have emitted the default timeout HttpResponse.

In practice this can only be a problem with very tight timeouts, so with default settings of request timeouts being measured in seconds it shouldn’t be a problem in reality (though certainly a possibility still).

To learn more about various timeouts in Akka HTTP and how to configure them see [Akka HTTP Timeouts](../../../common/timeouts.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/TimeoutDirectivesExamplesSpec.scala#L91-L108 "Go to snippet source")val timeoutResponse = HttpResponse(
  StatusCodes.EnhanceYourCalm,
  entity = "Unable to serve response within time limit, please enhance your calm.")

val route =
  path("timeout") {
    withRequestTimeout(100.milli) { // racy! for a very short timeout like 1.milli you can still get 503
      withRequestTimeoutResponse(request => timeoutResponse) {
        val response: Future[String] = slowFuture() // very slow
        complete(response)
      }
    }
  }

// check
Get("/timeout") ~!> route ~> check {
  status should ===(StatusCodes.EnhanceYourCalm) // the timeout response
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/TimeoutDirectivesExamplesTest.java#L137-L154 "Go to snippet source")final Duration timeout = Duration.create(100, TimeUnit.MILLISECONDS);
CompletionStage<String> slowFuture = new CompletableFuture<>();

HttpResponse enhanceYourCalmResponse = HttpResponse.create()
        .withStatus(StatusCodes.ENHANCE_YOUR_CALM)
        .withEntity("Unable to serve response within time limit, please enhance your calm.");

final Route route = path("timeout", () ->
        withRequestTimeout(timeout, () ->
                // racy! for a very short timeout like 1.milli you can still get 503
                withRequestTimeoutResponse((request) -> enhanceYourCalmResponse, () -> {
                    return completeOKWithFutureString(slowFuture); // very slow
                }))
);

// test:
StatusCode statusCode = runRoute(route, "timeout").get().status();
assert (StatusCodes.ENHANCE_YOUR_CALM.equals(statusCode));
```

## Code Examples

### Example 1: Signature

```scala
def withRequestTimeoutResponse(handler: HttpRequest => HttpResponse): Directive0
```

### Example 2: Example

```scala
val timeoutResponse = HttpResponse(
  StatusCodes.EnhanceYourCalm,
  entity = "Unable to serve response within time limit, please enhance your calm.")

val route =
  path("timeout") {
    withRequestTimeout(100.milli) { // racy! for a very short timeout like 1.milli you can still get 503
      withRequestTimeoutResponse(request => timeoutResponse) {
        val response: Future[String] = slowFuture() // very slow
        complete(response)
      }
    }
  }

// check
Get("/timeout") ~!> route ~> check {
  status should ===(StatusCodes.EnhanceYourCalm) // the timeout response
}
```

### Example 3: Example

```java
final Duration timeout = Duration.create(100, TimeUnit.MILLISECONDS);
CompletionStage<String> slowFuture = new CompletableFuture<>();

HttpResponse enhanceYourCalmResponse = HttpResponse.create()
        .withStatus(StatusCodes.ENHANCE_YOUR_CALM)
        .withEntity("Unable to serve response within time limit, please enhance your calm.");

final Route route = path("timeout", () ->
        withRequestTimeout(timeout, () ->
                // racy! for a very short timeout like 1.milli you can still get 503
                withRequestTimeoutResponse((request) -> enhanceYourCalmResponse, () -> {
                    return completeOKWithFutureString(slowFuture); // very slow
                }))
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
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeout.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withoutRequestTimeout.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeoutResponse.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeoutResponse.html)*
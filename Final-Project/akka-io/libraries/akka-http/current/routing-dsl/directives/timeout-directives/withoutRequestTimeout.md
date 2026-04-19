---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withoutRequestTimeout.html
title: withoutRequestTimeout • Akka HTTP
---

# withoutRequestTimeout • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withoutRequestTimeout

## Signature

```
def withoutRequestTimeout: Directive0
```

## Description

This directive enables “late” (during request processing) control over the [Request timeout](../../../common/timeouts.html#request-timeout) feature in Akka HTTP.

It is not recommended to turn off request timeouts using this method as it is inherently racy and disabling request timeouts basically turns off the safety net against programming mistakes that it provides.

Warning
Please note that setting the timeout from within a directive is inherently racy (as the “point in time from which we’re measuring the timeout” is already in the past (the moment we started handling the request), so if the existing timeout already was triggered before your directive had the chance to change it, an timeout may still be logged.

For more information about various timeouts in Akka HTTP see [Akka HTTP Timeouts](../../../common/timeouts.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/TimeoutDirectivesExamplesSpec.scala#L54-L62 "Go to snippet source")val route =
  path("timeout") {
    withoutRequestTimeout {
      val response: Future[String] = slowFuture() // very slow
      complete(response)
    }
  }

// no check as there is no time-out, the future would time out failing the test
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/TimeoutDirectivesExamplesTest.java#L96-L106 "Go to snippet source")CompletionStage<String> slowFuture = new CompletableFuture<>();

final Route route = path("timeout", () ->
        withoutRequestTimeout(() -> {
            return completeOKWithFutureString(slowFuture); // very slow
        })
);

// test:
Boolean receivedReply = runRoute(route, "timeout").isPresent();
assert (!receivedReply); // timed-out
```

## Code Examples

### Example 1: Signature

```scala
def withoutRequestTimeout: Directive0
```

### Example 2: Example

```scala
val route =
  path("timeout") {
    withoutRequestTimeout {
      val response: Future[String] = slowFuture() // very slow
      complete(response)
    }
  }

// no check as there is no time-out, the future would time out failing the test
```

### Example 3: Example

```java
CompletionStage<String> slowFuture = new CompletableFuture<>();

final Route route = path("timeout", () ->
        withoutRequestTimeout(() -> {
            return completeOKWithFutureString(slowFuture); // very slow
        })
);

// test:
Boolean receivedReply = runRoute(route, "timeout").isPresent();
assert (!receivedReply); // timed-out
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeout.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeoutResponse.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withoutRequestTimeout.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withoutRequestTimeout.html)*
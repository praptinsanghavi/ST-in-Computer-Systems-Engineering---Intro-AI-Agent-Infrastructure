---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/extractRequestTimeout.html
title: extractRequestTimeout • Akka HTTP
---

# extractRequestTimeout • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractRequestTimeout

## Signature

```
def extractRequestTimeout: Directive1[Duration] = Directive { inner => ctx
```

## Description

This directive extracts the currently set request timeout. 

Warning
Please note that this extracts the request timeout at the current moment, but the timeout can be changed concurrently. See other timeout directives about raciness inherent to timeout directives. 

For more information about various timeouts in Akka HTTP see [Akka HTTP Timeouts](../../../common/timeouts.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/TimeoutDirectivesExamplesSpec.scala#L115-L131 "Go to snippet source")val timeout1 = 500.millis
val timeout2 = 1000.millis
val route =
  path("timeout") {
    withRequestTimeout(timeout1) {
      extractRequestTimeout { t1 =>
        withRequestTimeout(timeout2) {
          extractRequestTimeout { t2 =>
            complete(
              if (t1 == timeout1 && t2 == timeout2) StatusCodes.OK
              else StatusCodes.InternalServerError
            )
          }
        }
      }
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/TimeoutDirectivesExamplesTest.java#L161-L177 "Go to snippet source")Duration timeout1 = Duration.create(500, TimeUnit.MILLISECONDS);
Duration timeout2 = Duration.create(1000, TimeUnit.MILLISECONDS);
Route route =
  path("timeout", () ->
    withRequestTimeout(timeout1, () ->
      extractRequestTimeout( t1 ->
        withRequestTimeout(timeout2, () ->
          extractRequestTimeout( t2 -> {
            if (t1 == timeout1 && t2 == timeout2)
              return complete(StatusCodes.OK);
            else
              return complete(StatusCodes.INTERNAL_SERVER_ERROR);
          })
        )
      )
    )
  );
```

## Code Examples

### Example 1: Signature

```scala
def extractRequestTimeout: Directive1[Duration] = Directive { inner => ctx
```

### Example 2: Example

```scala
val timeout1 = 500.millis
val timeout2 = 1000.millis
val route =
  path("timeout") {
    withRequestTimeout(timeout1) {
      extractRequestTimeout { t1 =>
        withRequestTimeout(timeout2) {
          extractRequestTimeout { t2 =>
            complete(
              if (t1 == timeout1 && t2 == timeout2) StatusCodes.OK
              else StatusCodes.InternalServerError
            )
          }
        }
      }
    }
  }
```

### Example 3: Example

```java
Duration timeout1 = Duration.create(500, TimeUnit.MILLISECONDS);
Duration timeout2 = Duration.create(1000, TimeUnit.MILLISECONDS);
Route route =
  path("timeout", () ->
    withRequestTimeout(timeout1, () ->
      extractRequestTimeout( t1 ->
        withRequestTimeout(timeout2, () ->
          extractRequestTimeout( t2 -> {
            if (t1 == timeout1 && t2 == timeout2)
              return complete(StatusCodes.OK);
            else
              return complete(StatusCodes.INTERNAL_SERVER_ERROR);
          })
        )
      )
    )
  );
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/withRequestTimeout.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/extractRequestTimeout.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/extractRequestTimeout.html)*
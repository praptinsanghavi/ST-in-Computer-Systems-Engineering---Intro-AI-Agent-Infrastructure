---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withLog.html
title: withLog • Akka HTTP
---

# withLog • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withLog

## Signature

```
def withLog(log: LoggingAdapter): Directive0
```

## Description

Allows running an inner route using an alternative [`LoggingAdapter`](https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") in place of the default one.

The logging adapter can be extracted in an inner route using [extractLog](extractLog.html) directly, or used by directives which internally extract the materializer without surfacing this fact in the API.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L154-L180 "Go to snippet source")val special = Logging(system, "SpecialRoutes")

def sample() =
  path("sample") {
    extractLog { implicit log =>
      complete {
        val msg = s"Logging using $log!"
        log.debug(msg)
        msg
      }
    }
  }

val route =
  pathPrefix("special") {
    withLog(special) {
      sample() // `special` logging adapter will be used
    }
  } ~ sample() // default logging adapter will be used

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Logging using ${system.log}!"
}
Get("/special/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Logging using $special!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L88-L420 "Go to snippet source")import static akka.http.javadsl.server.Directives.withLog;

final LoggingAdapter special = Logging.getLogger(system(), "SpecialRoutes");

final Route sample = path("sample", () ->
  extractLog(log -> {
    final String msg = "Logging using " + log + "!";
    log.debug(msg);
    return complete(msg);
  }
  )
);

final Route route = Directives.concat(
  pathPrefix("special", () ->
    withLog(special, () -> sample)
  ),
  sample
);

// tests:
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Logging using " + system().log() + "!");

testRoute(route).run(HttpRequest.GET("/special/sample"))
  .assertEntity("Logging using " + special + "!");
```

## Code Examples

### Example 1: Signature

```scala
def withLog(log: LoggingAdapter): Directive0
```

### Example 2: Example

```scala
val special = Logging(system, "SpecialRoutes")

def sample() =
  path("sample") {
    extractLog { implicit log =>
      complete {
        val msg = s"Logging using $log!"
        log.debug(msg)
        msg
      }
    }
  }

val route =
  pathPrefix("special") {
    withLog(special) {
      sample() // `special` logging adapter will be used
    }
  } ~ sample() // default logging adapter will be used

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Logging using ${system.log}!"
}
Get("/special/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Logging using $special!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.withLog;

final LoggingAdapter special = Logging.getLogger(system(), "SpecialRoutes");

final Route sample = path("sample", () ->
  extractLog(log -> {
    final String msg = "Logging using " + log + "!";
    log.debug(msg);
    return complete(msg);
  }
  )
);

final Route route = Directives.concat(
  pathPrefix("special", () ->
    withLog(special, () -> sample)
  ),
  sample
);

// tests:
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Logging using " + system().log() + "!");

testRoute(route).run(HttpRequest.GET("/special/sample"))
  .assertEntity("Logging using " + special + "!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractLog.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withExecutionContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withMaterializer.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withLog.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withLog.html)*
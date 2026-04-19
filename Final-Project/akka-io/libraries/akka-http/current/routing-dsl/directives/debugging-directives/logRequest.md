---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:34Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequest.html
title: logRequest • Akka HTTP
---

# logRequest • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# logRequest

## Signature

```
def logRequest(marker: String): Directive0
def logRequest(marker: String, level: LogLevel): Directive0
def logRequest(show: HttpRequest => String): Directive0
def logRequest(show: HttpRequest => LogEntry): Directive0
def logRequest(magnet: LoggingMagnet[HttpRequest => Unit]): Directive0

```

The signature shown is simplified, the real signature uses magnets. [\[1]](#1)

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

Logs the request using the supplied `LoggingMagnet[HttpRequest => Unit]` using the [`LoggingAdapter`](https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext"). The `LoggingMagnet` is a wrapped function `HttpRequest => Unit` that can be implicitly created from the different constructors shown above. These constructors build a `LoggingMagnet` from these components: Logs the request. The directive is available with the following parameters:

- A marker to prefix each log message with.
- A log level.
- A `show` function that calculates a string representation for a request.
- A function that creates a [`LogEntry`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html "akka.http.javadsl.server.directives.LogEntry")[`LogEntry`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/LogEntry.html "akka.http.scaladsl.server.directives.LogEntry") which is a combination of the elements above.

- A marker to prefix each log message with.
- A log level.
- A function that creates a [`LogEntry`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html "akka.http.javadsl.server.directives.LogEntry")[`LogEntry`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/LogEntry.html "akka.http.scaladsl.server.directives.LogEntry") which is a combination of the elements above.

It is also possible to use any other function `HttpRequest => Unit` for logging by wrapping it with `LoggingMagnet`. See the examples for ways to use the `logRequest` directive.

Use `logResult` for logging the response, or `logRequestResult` for logging both.

To change the logger, wrap this directive by [withLog](../basic-directives/withLog.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/DebuggingDirectivesExamplesSpec.scala#L19-L43 "Go to snippet source")// different possibilities of using logRequest

// The first alternatives use an implicitly available LoggingContext for logging
// marks with "get-user", log with debug level, HttpRequest.toString
DebuggingDirectives.logRequest("get-user")

// marks with "get-user", log with info level, HttpRequest.toString
DebuggingDirectives.logRequest(("get-user", Logging.InfoLevel))

// logs just the request method at debug level
def requestMethod(req: HttpRequest): String = req.method.name
DebuggingDirectives.logRequest(requestMethod _)

// logs just the request method at info level
def requestMethodAsInfo(req: HttpRequest): LogEntry = LogEntry(req.method.name, Logging.InfoLevel)
DebuggingDirectives.logRequest(requestMethodAsInfo _)

// This one doesn't use the implicit LoggingContext but uses `println` for logging
def printRequestMethod(req: HttpRequest): Unit = println(req.method.name)
val logRequestPrintln = DebuggingDirectives.logRequest(LoggingMagnet(_ => printRequestMethod))

// tests:
Get("/") ~> logRequestPrintln(complete("logged")) ~> check {
  responseAs[String] shouldEqual "logged"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/DebuggingDirectivesExamplesTest.java#L29-L65 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.logRequest;

// logs request with "get-user"
final Route routeBasicLogRequest = get(() ->
  logRequest("get-user", () -> complete("logged")));

// logs request with "get-user" as Info
final Route routeBasicLogRequestAsInfo = get(() ->
  logRequest("get-user", InfoLevel(), () -> complete("logged")));

// logs just the request method at info level
Function<HttpRequest, LogEntry> requestMethodAsInfo = (request) ->
  LogEntry.create(request.method().name(), InfoLevel());

final Route routeUsingFunction = get(() ->
  logRequest(requestMethodAsInfo, () -> complete("logged")));

// tests:
testRoute(routeBasicLogRequest).run(HttpRequest.GET("/"))
  .assertEntity("logged");
```

## Code Examples

### Example 1: Signature

```scala
def logRequest(marker: String): Directive0
def logRequest(marker: String, level: LogLevel): Directive0
def logRequest(show: HttpRequest => String): Directive0
def logRequest(show: HttpRequest => LogEntry): Directive0
def logRequest(magnet: LoggingMagnet[HttpRequest => Unit]): Directive0
```

### Example 2: Example

```scala
// different possibilities of using logRequest

// The first alternatives use an implicitly available LoggingContext for logging
// marks with "get-user", log with debug level, HttpRequest.toString
DebuggingDirectives.logRequest("get-user")

// marks with "get-user", log with info level, HttpRequest.toString
DebuggingDirectives.logRequest(("get-user", Logging.InfoLevel))

// logs just the request method at debug level
def requestMethod(req: HttpRequest): String = req.method.name
DebuggingDirectives.logRequest(requestMethod _)

// logs just the request method at info level
def requestMethodAsInfo(req: HttpRequest): LogEntry = LogEntry(req.method.name, Logging.InfoLevel)
DebuggingDirectives.logRequest(requestMethodAsInfo _)

// This one doesn't use the implicit LoggingContext but uses `println` for logging
def printRequestMethod(req: HttpRequest): Unit = println(req.method.name)
val logRequestPrintln = DebuggingDirectives.logRequest(LoggingMagnet(_ => printRequestMethod))

// tests:
Get("/") ~> logRequestPrintln(complete("logged")) ~> check {
  responseAs[String] shouldEqual "logged"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.logRequest;

// logs request with "get-user"
final Route routeBasicLogRequest = get(() ->
  logRequest("get-user", () -> complete("logged")));

// logs request with "get-user" as Info
final Route routeBasicLogRequestAsInfo = get(() ->
  logRequest("get-user", InfoLevel(), () -> complete("logged")));

// logs just the request method at info level
Function<HttpRequest, LogEntry> requestMethodAsInfo = (request) ->
  LogEntry.create(request.method().name(), InfoLevel());

final Route routeUsingFunction = get(() ->
  logRequest(requestMethodAsInfo, () -> complete("logged")));

// tests:
testRoute(routeBasicLogRequest).run(HttpRequest.GET("/"))
  .assertEntity("logged");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/LogEntry.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withLog.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequestResult.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequest.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequest.html)*
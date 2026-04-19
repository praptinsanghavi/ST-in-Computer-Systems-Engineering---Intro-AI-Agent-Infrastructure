---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logResult.html
title: logResult • Akka HTTP
---

# logResult • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# logResult

## Signature

```
def logResult(marker: String): Directive0
def logResult(marker: String, level: LogLevel): Directive0
def logResult(show: RouteResult => String): Directive0
def logResult(show: RouteResult => LogEntry): Directive0
def logResult(magnet: LoggingMagnet[RouteResult => Unit]): Directive0

```

The signature shown is simplified, the real signature uses magnets. [\[1]](#1)

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

Logs the response using the [`LoggingAdapter`](https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext").

See [logRequest](logRequest.html) for the general description how these directives work. This directive is different as it requires a `LoggingMagnet[RouteResult => Unit]`. Instead of just logging `HttpResponses`, `logResult` is able to log any [RouteResult](../../routes.html#routeresult) coming back from the inner route.

Use `logRequest` for logging the request, or `logRequestResult` for logging both.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/DebuggingDirectivesExamplesSpec.scala#L84-L111 "Go to snippet source")// different possibilities of using logResponse

// The first alternatives use an implicitly available LoggingContext for logging
// marks with "get-user", log with debug level, HttpResponse.toString
DebuggingDirectives.logResult("get-user")

// marks with "get-user", log with info level, HttpResponse.toString
DebuggingDirectives.logResult(("get-user", Logging.InfoLevel))

// logs just the response status at debug level
def responseStatus(res: RouteResult): String = res match {
  case RouteResult.Complete(x)          => x.status.toString
  case RouteResult.Rejected(rejections) => "Rejected: " + rejections.mkString(", ")
}
DebuggingDirectives.logResult(responseStatus _)

// logs just the response status at info level
def responseStatusAsInfo(res: RouteResult): LogEntry = LogEntry(responseStatus(res), Logging.InfoLevel)
DebuggingDirectives.logResult(responseStatusAsInfo _)

// This one doesn't use the implicit LoggingContext but uses `println` for logging
def printResponseStatus(res: RouteResult): Unit = println(responseStatus(res))
val logResultPrintln = DebuggingDirectives.logResult(LoggingMagnet(_ => printResponseStatus))

// tests:
Get("/") ~> logResultPrintln(complete("logged")) ~> check {
  responseAs[String] shouldEqual "logged"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/DebuggingDirectivesExamplesTest.java#L39-L133 "Go to snippet source")import static akka.http.javadsl.server.Directives.logResult;

// logs result with "get-user"
final Route routeBasicLogResult = get(() ->
  logResult("get-user", () -> complete("logged")));

// logs result with "get-user" as Info
final Route routeBasicLogResultAsInfo = get(() ->
  logResult("get-user", InfoLevel(), () -> complete("logged")));

// logs the result and the rejections as LogEntry
Function<HttpResponse, LogEntry> showSuccessAsInfo = (response) ->
  LogEntry.create(String.format("Response code '%d'", response.status().intValue()),
    InfoLevel());

Function<List<Rejection>, LogEntry> showRejectionAsInfo = (rejections) ->
  LogEntry.create(
    rejections
      .stream()
      .map(rejection -> rejection.toString())
      .collect(Collectors.joining(", ")),
    InfoLevel());

final Route routeUsingFunction = get(() ->
  logResult(showSuccessAsInfo, showRejectionAsInfo, () -> complete("logged")));
// tests:
testRoute(routeBasicLogResult).run(HttpRequest.GET("/"))
  .assertEntity("logged");
```

## Code Examples

### Example 1: Signature

```scala
def logResult(marker: String): Directive0
def logResult(marker: String, level: LogLevel): Directive0
def logResult(show: RouteResult => String): Directive0
def logResult(show: RouteResult => LogEntry): Directive0
def logResult(magnet: LoggingMagnet[RouteResult => Unit]): Directive0
```

### Example 2: Example

```scala
// different possibilities of using logResponse

// The first alternatives use an implicitly available LoggingContext for logging
// marks with "get-user", log with debug level, HttpResponse.toString
DebuggingDirectives.logResult("get-user")

// marks with "get-user", log with info level, HttpResponse.toString
DebuggingDirectives.logResult(("get-user", Logging.InfoLevel))

// logs just the response status at debug level
def responseStatus(res: RouteResult): String = res match {
  case RouteResult.Complete(x)          => x.status.toString
  case RouteResult.Rejected(rejections) => "Rejected: " + rejections.mkString(", ")
}
DebuggingDirectives.logResult(responseStatus _)

// logs just the response status at info level
def responseStatusAsInfo(res: RouteResult): LogEntry = LogEntry(responseStatus(res), Logging.InfoLevel)
DebuggingDirectives.logResult(responseStatusAsInfo _)

// This one doesn't use the implicit LoggingContext but uses `println` for logging
def printResponseStatus(res: RouteResult): Unit = println(responseStatus(res))
val logResultPrintln = DebuggingDirectives.logResult(LoggingMagnet(_ => printResponseStatus))

// tests:
Get("/") ~> logResultPrintln(complete("logged")) ~> check {
  responseAs[String] shouldEqual "logged"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.logResult;

// logs result with "get-user"
final Route routeBasicLogResult = get(() ->
  logResult("get-user", () -> complete("logged")));

// logs result with "get-user" as Info
final Route routeBasicLogResultAsInfo = get(() ->
  logResult("get-user", InfoLevel(), () -> complete("logged")));

// logs the result and the rejections as LogEntry
Function<HttpResponse, LogEntry> showSuccessAsInfo = (response) ->
  LogEntry.create(String.format("Response code '%d'", response.status().intValue()),
    InfoLevel());

Function<List<Rejection>, LogEntry> showRejectionAsInfo = (rejections) ->
  LogEntry.create(
    rejections
      .stream()
      .map(rejection -> rejection.toString())
      .collect(Collectors.joining(", ")),
    InfoLevel());

final Route routeUsingFunction = get(() ->
  logResult(showSuccessAsInfo, showRejectionAsInfo, () -> complete("logged")));
// tests:
testRoute(routeBasicLogResult).run(HttpRequest.GET("/"))
  .assertEntity("logged");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequestResult.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logResult.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logResult.html)*
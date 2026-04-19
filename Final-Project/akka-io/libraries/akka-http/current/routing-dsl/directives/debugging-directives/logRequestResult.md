---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:34Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequestResult.html
title: logRequestResult • Akka HTTP
---

# logRequestResult • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# logRequestResult

## Signature

```
def logRequestResult(marker: String)(implicit log: LoggingContext): Directive0
def logRequestResult(marker: String, level: LogLevel)(implicit log: LoggingContext): Directive0
def logRequestResult(show: HttpRequest => RouteResult => Option[LogEntry])(implicit log: LoggingContext): Directive0

```

The signature shown is simplified, the real signature uses magnets. [\[1]](#1)

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

Logs both the request and the response using the [`LoggingAdapter`](https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext").

This directive is a combination of [logRequest](logRequest.html) and [logResult](logResult.html).

See [logRequest](logRequest.html) for the general description how these directives work.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/DebuggingDirectivesExamplesSpec.scala#L48-L79 "Go to snippet source")// different possibilities of using logRequestResult

// The first alternatives use an implicitly available LoggingContext for logging
// marks with "get-user", log with debug level, HttpRequest.toString, HttpResponse.toString
DebuggingDirectives.logRequestResult("get-user")

// marks with "get-user", log with info level, HttpRequest.toString, HttpResponse.toString
DebuggingDirectives.logRequestResult(("get-user", Logging.InfoLevel))

// logs just the request method and response status at info level
def requestMethodAndResponseStatusAsInfo(req: HttpRequest): RouteResult => Option[LogEntry] = {
  case RouteResult.Complete(res) => Some(LogEntry(req.method.name + ": " + res.status, Logging.InfoLevel))
  case _                         => None // no log entries for rejections
}
DebuggingDirectives.logRequestResult(requestMethodAndResponseStatusAsInfo _)

// This one will only log rejections
val rejectionLogger: HttpRequest => RouteResult => Option[LogEntry] = req => {
  case Rejected(rejections) => Some(LogEntry(s"Request: $req\nwas rejected with rejections:\n$rejections", Logging.DebugLevel))
  case _                    => None
}
DebuggingDirectives.logRequestResult(rejectionLogger)

// This one doesn't use the implicit LoggingContext but uses `println` for logging
def printRequestMethodAndResponseStatus(req: HttpRequest)(res: RouteResult): Unit =
  println(requestMethodAndResponseStatusAsInfo(req)(res).map(_.obj.toString).getOrElse(""))
val logRequestResultPrintln = DebuggingDirectives.logRequestResult(LoggingMagnet(_ => printRequestMethodAndResponseStatus))

// tests:
Get("/") ~> logRequestResultPrintln(complete("logged")) ~> check {
  responseAs[String] shouldEqual "logged"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/DebuggingDirectivesExamplesTest.java#L35-L101 "Go to snippet source")import static akka.http.javadsl.server.Directives.logRequestResultOptional;

// using logRequestResult
// handle request to optionally generate a log entry
BiFunction<HttpRequest, HttpResponse, Optional<LogEntry>> requestMethodAsInfo =
  (request, response) ->
    (response.status().isSuccess()) ?
      Optional.of(
        LogEntry.create(
          request.method().name() + ":" + response.status().intValue(),
          InfoLevel()))
      : Optional.empty(); // not a successful response

// handle rejections to optionally generate a log entry
BiFunction<HttpRequest, List<Rejection>, Optional<LogEntry>> rejectionsAsInfo =
  (request, rejections) ->
    (!rejections.isEmpty()) ?
      Optional.of(
        LogEntry.create(
          rejections
            .stream()
            .map(Rejection::toString)
            .collect(Collectors.joining(", ")),
          InfoLevel()))
      : Optional.empty(); // no rejections

final Route route = get(() -> logRequestResultOptional(
  requestMethodAsInfo,
  rejectionsAsInfo,
  () -> complete("logged")));
// tests:
testRoute(route).run(HttpRequest.GET("/")).assertEntity("logged");
```

## Building Advanced Directives

This example will showcase the advanced logging using the [`DebuggingDirectives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DebuggingDirectives.html "akka.http.javadsl.server.directives.DebuggingDirectives")[`DebuggingDirectives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html "akka.http.scaladsl.server.directives.DebuggingDirectives"). The built *logResponseTime* directive will log the request time (or rejection reason):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/DebuggingDirectivesExamplesSpec.scala#L116-L141 "Go to snippet source")  
def akkaResponseTimeLoggingFunction(
  loggingAdapter:   LoggingAdapter,
  requestTimestamp: Long,
  level:            LogLevel       = Logging.InfoLevel)(req: HttpRequest)(res: RouteResult): Unit = {
  val entry = res match {
    case Complete(resp) =>
      val responseTimestamp: Long = System.nanoTime
      val elapsedTime: Long = (responseTimestamp - requestTimestamp) / 1000000
      val loggingString = s"""Logged Request:${req.method}:${req.uri}:${resp.status}:$elapsedTime"""
      LogEntry(loggingString, level)
    case Rejected(reason) =>
      LogEntry(s"Rejected Reason: ${reason.mkString(",")}", level)
  }
  entry.logTo(loggingAdapter)
}
def printResponseTime(log: LoggingAdapter) = {
  val requestTimestamp = System.nanoTime
  akkaResponseTimeLoggingFunction(log, requestTimestamp)_
}

val logResponseTime = DebuggingDirectives.logRequestResult(LoggingMagnet(printResponseTime))

Get("/") ~> logResponseTime(complete("logged")) ~> check {
  responseAs[String] shouldEqual "logged"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/DebuggingDirectivesExamplesTest.java#L138-L170 "Go to snippet source")// using logRequestResultOptional for generating Response Time
// handle request to optionally generate a log entry
BiFunction<HttpRequest, HttpResponse, Optional<LogEntry>> requestMethodAsInfo() {
  Long requestTime = System.nanoTime();
  return new BiFunction<HttpRequest, HttpResponse, Optional<LogEntry>>() {
    @Override
    public Optional<LogEntry> apply(HttpRequest request, HttpResponse response) {
      return printResponseTime(request, response, requestTime);
    }
  };
}

@Test
public void testLogRequestResultWithResponseTime() {
  // handle rejections to optionally generate a log entry
  BiFunction<HttpRequest, List<Rejection>, Optional<LogEntry>> rejectionsAsInfo =
    (request, rejections) ->
      (!rejections.isEmpty()) ?
        Optional.of(
          LogEntry.create(
            rejections
              .stream()
              .map(Rejection::toString)
              .collect(Collectors.joining(", ")),
            InfoLevel()))
        : Optional.empty(); // no rejections

  final Route route = get(() -> logRequestResultOptional(
    requestMethodAsInfo(),
    rejectionsAsInfo,
    () -> complete("logged")));
  // tests:
  testRoute(route).run(HttpRequest.GET("/")).assertEntity("logged");
```

## Code Examples

### Example 1: Signature

```scala
def logRequestResult(marker: String)(implicit log: LoggingContext): Directive0
def logRequestResult(marker: String, level: LogLevel)(implicit log: LoggingContext): Directive0
def logRequestResult(show: HttpRequest => RouteResult => Option[LogEntry])(implicit log: LoggingContext): Directive0
```

### Example 2: Example

```scala
// different possibilities of using logRequestResult

// The first alternatives use an implicitly available LoggingContext for logging
// marks with "get-user", log with debug level, HttpRequest.toString, HttpResponse.toString
DebuggingDirectives.logRequestResult("get-user")

// marks with "get-user", log with info level, HttpRequest.toString, HttpResponse.toString
DebuggingDirectives.logRequestResult(("get-user", Logging.InfoLevel))

// logs just the request method and response status at info level
def requestMethodAndResponseStatusAsInfo(req: HttpRequest): RouteResult => Option[LogEntry] = {
  case RouteResult.Complete(res) => Some(LogEntry(req.method.name + ": " + res.status, Logging.InfoLevel))
  case _                         => None // no log entries for rejections
}
DebuggingDirectives.logRequestResult(requestMethodAndResponseStatusAsInfo _)

// This one will only log rejections
val rejectionLogger: HttpRequest => RouteResult => Option[LogEntry] = req => {
  case Rejected(rejections) => Some(LogEntry(s"Request: $req\nwas rejected with rejections:\n$rejections", Logging.DebugLevel))
  case _                    => None
}
DebuggingDirectives.logRequestResult(rejectionLogger)

// This one doesn't use the implicit LoggingContext but uses `println` for logging
def printRequestMethodAndResponseStatus(req: HttpRequest)(res: RouteResult): Unit =
  println(requestMethodAndResponseStatusAsInfo(req)(res).map(_.obj.toString).getOrElse(""))
val logRequestResultPrintln = DebuggingDirectives.logRequestResult(LoggingMagnet(_ => printRequestMethodAndResponseStatus))

// tests:
Get("/") ~> logRequestResultPrintln(complete("logged")) ~> check {
  responseAs[String] shouldEqual "logged"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.logRequestResultOptional;

// using logRequestResult
// handle request to optionally generate a log entry
BiFunction<HttpRequest, HttpResponse, Optional<LogEntry>> requestMethodAsInfo =
  (request, response) ->
    (response.status().isSuccess()) ?
      Optional.of(
        LogEntry.create(
          request.method().name() + ":" + response.status().intValue(),
          InfoLevel()))
      : Optional.empty(); // not a successful response

// handle rejections to optionally generate a log entry
BiFunction<HttpRequest, List<Rejection>, Optional<LogEntry>> rejectionsAsInfo =
  (request, rejections) ->
    (!rejections.isEmpty()) ?
      Optional.of(
        LogEntry.create(
          rejections
            .stream()
            .map(Rejection::toString)
            .collect(Collectors.joining(", ")),
          InfoLevel()))
      : Optional.empty(); // no rejections

final Route route = get(() -> logRequestResultOptional(
  requestMethodAsInfo,
  rejectionsAsInfo,
  () -> complete("logged")));
// tests:
testRoute(route).run(HttpRequest.GET("/")).assertEntity("logged");
```

### Example 4: Building Advanced Directives

```scala
def akkaResponseTimeLoggingFunction(
  loggingAdapter:   LoggingAdapter,
  requestTimestamp: Long,
  level:            LogLevel       = Logging.InfoLevel)(req: HttpRequest)(res: RouteResult): Unit = {
  val entry = res match {
    case Complete(resp) =>
      val responseTimestamp: Long = System.nanoTime
      val elapsedTime: Long = (responseTimestamp - requestTimestamp) / 1000000
      val loggingString = s"""Logged Request:${req.method}:${req.uri}:${resp.status}:$elapsedTime"""
      LogEntry(loggingString, level)
    case Rejected(reason) =>
      LogEntry(s"Rejected Reason: ${reason.mkString(",")}", level)
  }
  entry.logTo(loggingAdapter)
}
def printResponseTime(log: LoggingAdapter) = {
  val requestTimestamp = System.nanoTime
  akkaResponseTimeLoggingFunction(log, requestTimestamp)_
}

val logResponseTime = DebuggingDirectives.logRequestResult(LoggingMagnet(printResponseTime))

Get("/") ~> logResponseTime(complete("logged")) ~> check {
  responseAs[String] shouldEqual "logged"
}
```

### Example 5: Building Advanced Directives

```java
// using logRequestResultOptional for generating Response Time
// handle request to optionally generate a log entry
BiFunction<HttpRequest, HttpResponse, Optional<LogEntry>> requestMethodAsInfo() {
  Long requestTime = System.nanoTime();
  return new BiFunction<HttpRequest, HttpResponse, Optional<LogEntry>>() {
    @Override
    public Optional<LogEntry> apply(HttpRequest request, HttpResponse response) {
      return printResponseTime(request, response, requestTime);
    }
  };
}

@Test
public void testLogRequestResultWithResponseTime() {
  // handle rejections to optionally generate a log entry
  BiFunction<HttpRequest, List<Rejection>, Optional<LogEntry>> rejectionsAsInfo =
    (request, rejections) ->
      (!rejections.isEmpty()) ?
        Optional.of(
          LogEntry.create(
            rejections
              .stream()
              .map(Rejection::toString)
              .collect(Collectors.joining(", ")),
            InfoLevel()))
        : Optional.empty(); // no rejections

  final Route route = get(() -> logRequestResultOptional(
    requestMethodAsInfo(),
    rejectionsAsInfo,
    () -> complete("logged")));
  // tests:
  testRoute(route).run(HttpRequest.GET("/")).assertEntity("logged");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logResult.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequestResult.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/logRequestResult.html)*
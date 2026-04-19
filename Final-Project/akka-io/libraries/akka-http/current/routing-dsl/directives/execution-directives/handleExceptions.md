---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleExceptions.html
title: handleExceptions • Akka HTTP
---

# handleExceptions • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# handleExceptions

## Signature

```
def handleExceptions(handler: ExceptionHandler): Directive0
```

## Description

Catches exceptions thrown by the inner route and handles them using the specified [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler").

Using this directive is an alternative to using a global implicitly defined [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") that applies to the complete route.

See [Exception Handling](../../exception-handling.html) for general information about options for handling exceptions.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ExecutionDirectivesExamplesSpec.scala#L14-L31 "Go to snippet source")val divByZeroHandler = ExceptionHandler {
  case _: ArithmeticException => complete(StatusCodes.BadRequest, "You've got your arithmetic wrong, fool!")
}
val route =
  path("divide" / IntNumber / IntNumber) { (a, b) =>
    handleExceptions(divByZeroHandler) {
      complete(s"The result is ${a / b}")
    }
  }

// tests:
Get("/divide/10/5") ~> route ~> check {
  responseAs[String] shouldEqual "The result is 2"
}
Get("/divide/10/0") ~> route ~> check {
  status shouldEqual StatusCodes.BadRequest
  responseAs[String] shouldEqual "You've got your arithmetic wrong, fool!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ExecutionDirectivesExamplesTest.java#L21-L65 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.handleExceptions;
import static akka.http.javadsl.server.Directives.path;

final ExceptionHandler divByZeroHandler = ExceptionHandler.newBuilder()
  .match(ArithmeticException.class, x ->
    complete(StatusCodes.BAD_REQUEST, "You've got your arithmetic wrong, fool!"))
  .build();

final Route route =
  path(PathMatchers.segment("divide").slash(integerSegment()).slash(integerSegment()), (a, b) ->
    handleExceptions(divByZeroHandler, () -> complete("The result is " + (a / b)))
  );

// tests:
testRoute(route).run(HttpRequest.GET("/divide/10/5"))
  .assertEntity("The result is 2");
testRoute(route).run(HttpRequest.GET("/divide/10/0"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("You've got your arithmetic wrong, fool!");
```

## Code Examples

### Example 1: Signature

```scala
def handleExceptions(handler: ExceptionHandler): Directive0
```

### Example 2: Example

```scala
val divByZeroHandler = ExceptionHandler {
  case _: ArithmeticException => complete(StatusCodes.BadRequest, "You've got your arithmetic wrong, fool!")
}
val route =
  path("divide" / IntNumber / IntNumber) { (a, b) =>
    handleExceptions(divByZeroHandler) {
      complete(s"The result is ${a / b}")
    }
  }

// tests:
Get("/divide/10/5") ~> route ~> check {
  responseAs[String] shouldEqual "The result is 2"
}
Get("/divide/10/0") ~> route ~> check {
  status shouldEqual StatusCodes.BadRequest
  responseAs[String] shouldEqual "You've got your arithmetic wrong, fool!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.handleExceptions;
import static akka.http.javadsl.server.Directives.path;

final ExceptionHandler divByZeroHandler = ExceptionHandler.newBuilder()
  .match(ArithmeticException.class, x ->
    complete(StatusCodes.BAD_REQUEST, "You've got your arithmetic wrong, fool!"))
  .build();

final Route route =
  path(PathMatchers.segment("divide").slash(integerSegment()).slash(integerSegment()), (a, b) ->
    handleExceptions(divByZeroHandler, () -> complete("The result is " + (a / b)))
  );

// tests:
testRoute(route).run(HttpRequest.GET("/divide/10/5"))
  .assertEntity("The result is 2");
testRoute(route).run(HttpRequest.GET("/divide/10/0"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("You've got your arithmetic wrong, fool!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleExceptions.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleExceptions.html)*
---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/failWith.html
title: failWith • Akka HTTP
---

# failWith • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# failWith

## Signature

```
def failWith(error: Throwable): StandardRoute
```

## Description

Bubbles up the given error through the route structure where it is dealt with by the closest `handleExceptions` directive and its [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler").

`failWith` explicitly raises an exception that gets bubbled up through the route structure to be picked up by the nearest `handleExceptions` directive. Using `failWith` rather than simply throwing an exception enables the route structure’s [Exception Handling](../../exception-handling.html) mechanism to deal with the exception even if the current route is executed asynchronously on another thread (e.g. in a `Future` or separate actor).

If no `handleExceptions` is present above the respective location in the route structure the top\-level routing logic will handle the exception and translate it into a corresponding [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") using the in\-scope [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler"). See the [Exception Handling](../../exception-handling.html) chapter for more details.

There is one notable special case: If the given exception is a [`RejectionError`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionError.html "akka.http.javadsl.server.RejectionError")[`RejectionError`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionError.html "akka.http.scaladsl.server.RejectionError") exception it is *not* bubbled up, but rather the wrapped exception is unpacked and “executed”. This allows the “tunneling” of a rejection via an exception.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RouteDirectivesExamplesSpec.scala#L166-L175 "Go to snippet source")val route =
  path("foo") {
    failWith(new RuntimeException("Oops."))
  }

// tests:
Get("/foo") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.InternalServerError
  responseAs[String] shouldEqual "There was an internal server error."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RouteDirectivesExamplesTest.java#L42-L162 "Go to snippet source")import static akka.http.javadsl.server.Directives.failWith;
import static akka.http.javadsl.server.Directives.path;

final Route route = path("foo", () ->
  failWith(new RuntimeException("Oops."))
);

// tests:
testRoute(route).run(HttpRequest.GET("/foo"))
  .assertStatusCode(StatusCodes.INTERNAL_SERVER_ERROR)
  .assertEntity("There was an internal server error.");
```

## Code Examples

### Example 1: Signature

```scala
def failWith(error: Throwable): StandardRoute
```

### Example 2: Example

```scala
val route =
  path("foo") {
    failWith(new RuntimeException("Oops."))
  }

// tests:
Get("/foo") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.InternalServerError
  responseAs[String] shouldEqual "There was an internal server error."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.failWith;
import static akka.http.javadsl.server.Directives.path;

final Route route = path("foo", () ->
  failWith(new RuntimeException("Oops."))
);

// tests:
testRoute(route).run(HttpRequest.GET("/foo"))
  .assertStatusCode(StatusCodes.INTERNAL_SERVER_ERROR)
  .assertEntity("There was an internal server error.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionError.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionError.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/complete.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handle.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/failWith.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/failWith.html)*
---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:27Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
title: handleRejections • Akka HTTP
---

# handleRejections • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# handleRejections

## Signature

```
def handleRejections(handler: RejectionHandler): Directive0
```

## Description

Using this directive is an alternative to using a global implicitly defined `RejectionHandler` that applies to the complete route.

See [Rejections](../../rejections.html) for general information about options for handling rejections.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ExecutionDirectivesExamplesSpec.scala#L36-L63 "Go to snippet source")val totallyMissingHandler = RejectionHandler.newBuilder()
  .handleNotFound { complete(StatusCodes.NotFound, "Oh man, what you are looking for is long gone.") }
  .handle { case ValidationRejection(msg, _) => complete(StatusCodes.InternalServerError, msg) }
  .result()
val route =
  pathPrefix("handled") {
    handleRejections(totallyMissingHandler) {
      path("existing")(complete("This path exists")) ~
        path("boom")(reject(new ValidationRejection("This didn't work.")))
    }
  }

// tests:
Get("/handled/existing") ~> route ~> check {
  responseAs[String] shouldEqual "This path exists"
}
Get("/missing") ~> Route.seal(route) /* applies default handler */ ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "The requested resource could not be found."
}
Get("/handled/missing") ~> route ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Oh man, what you are looking for is long gone."
}
Get("/handled/boom") ~> route ~> check {
  status shouldEqual StatusCodes.InternalServerError
  responseAs[String] shouldEqual "This didn't work."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ExecutionDirectivesExamplesTest.java#L27-L98 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.handleRejections;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.reject;

final RejectionHandler totallyMissingHandler = RejectionHandler.newBuilder()
  .handleNotFound(complete(StatusCodes.NOT_FOUND, "Oh man, what you are looking for is long gone."))
  .handle(ValidationRejection.class, r -> complete(StatusCodes.INTERNAL_SERVER_ERROR, r.message()))
  .build();

final Route route = pathPrefix("handled", () ->
  handleRejections(totallyMissingHandler, () ->
    Directives.concat(
      path("existing", () -> complete("This path exists")),
      path("boom", () -> reject(Rejections.validationRejection("This didn't work.")))
    )
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/handled/existing"))
  .assertEntity("This path exists");
// applies default handler
testRoute(route).run(HttpRequest.GET("/missing"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The requested resource could not be found.");
testRoute(route).run(HttpRequest.GET("/handled/missing"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Oh man, what you are looking for is long gone.");
testRoute(route).run(HttpRequest.GET("/handled/boom"))
  .assertStatusCode(StatusCodes.INTERNAL_SERVER_ERROR)
  .assertEntity("This didn't work.");
```

## Code Examples

### Example 1: Signature

```scala
def handleRejections(handler: RejectionHandler): Directive0
```

### Example 2: Example

```scala
val totallyMissingHandler = RejectionHandler.newBuilder()
  .handleNotFound { complete(StatusCodes.NotFound, "Oh man, what you are looking for is long gone.") }
  .handle { case ValidationRejection(msg, _) => complete(StatusCodes.InternalServerError, msg) }
  .result()
val route =
  pathPrefix("handled") {
    handleRejections(totallyMissingHandler) {
      path("existing")(complete("This path exists")) ~
        path("boom")(reject(new ValidationRejection("This didn't work.")))
    }
  }

// tests:
Get("/handled/existing") ~> route ~> check {
  responseAs[String] shouldEqual "This path exists"
}
Get("/missing") ~> Route.seal(route) /* applies default handler */ ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "The requested resource could not be found."
}
Get("/handled/missing") ~> route ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Oh man, what you are looking for is long gone."
}
Get("/handled/boom") ~> route ~> check {
  status shouldEqual StatusCodes.InternalServerError
  responseAs[String] shouldEqual "This didn't work."
}
```

### Example 3: Example

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.handleRejections;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.reject;

final RejectionHandler totallyMissingHandler = RejectionHandler.newBuilder()
  .handleNotFound(complete(StatusCodes.NOT_FOUND, "Oh man, what you are looking for is long gone."))
  .handle(ValidationRejection.class, r -> complete(StatusCodes.INTERNAL_SERVER_ERROR, r.message()))
  .build();

final Route route = pathPrefix("handled", () ->
  handleRejections(totallyMissingHandler, () ->
    Directives.concat(
      path("existing", () -> complete("This path exists")),
      path("boom", () -> reject(Rejections.validationRejection("This didn't work.")))
    )
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/handled/existing"))
  .assertEntity("This path exists");
// applies default handler
testRoute(route).run(HttpRequest.GET("/missing"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The requested resource could not be found.");
testRoute(route).run(HttpRequest.GET("/handled/missing"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Oh man, what you are looking for is long gone.");
testRoute(route).run(HttpRequest.GET("/handled/boom"))
  .assertStatusCode(StatusCodes.INTERNAL_SERVER_ERROR)
  .assertEntity("This didn't work.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleExceptions.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html)*
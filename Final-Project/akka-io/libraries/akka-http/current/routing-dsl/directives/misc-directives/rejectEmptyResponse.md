---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/rejectEmptyResponse.html
title: rejectEmptyResponse • Akka HTTP
---

# rejectEmptyResponse • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# rejectEmptyResponse

## Signature

```
def rejectEmptyResponse: Directive0
```

## Description

Replaces a response with no content with an empty rejection.

The `rejectEmptyResponse` directive is mostly used together with marshallers that serialize to an empty response under certain circumstances. For example serialization of `None`. In many cases this empty serialization should instead be handled as `404 Not Found` which is the effect of using `rejectEmptyResponse`.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L32-L49 "Go to snippet source")val route = rejectEmptyResponse {
  path("even" / IntNumber) { i =>
    complete {
      // returns Some(evenNumberDescription) or None
      Option(i).filter(_ % 2 == 0).map { num =>
        s"Number $num is even."
      }
    }
  }
}

// tests:
Get("/even/23") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.NotFound
}
Get("/even/28") ~> route ~> check {
  responseAs[String] shouldEqual "Number 28 is even."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MiscDirectivesExamplesTest.java#L61-L242 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.rejectEmptyResponse;

final Route route = rejectEmptyResponse(() ->
        path(PathMatchers.segment("even").slash(PathMatchers.integerSegment()), (value) -> {
                  String response = "";
                  if (value % 2 == 0) {
                    response = "Number " + value + " is even";
                  }
                  return complete(response);
                }
        ));

// tests:
testRoute(route).run(HttpRequest.GET("/even/24"))
  .assertEntity("Number 24 is even");
testRoute(route).run(HttpRequest.GET("/even/23"))
  .assertStatusCode(StatusCodes.NOT_FOUND);

```

## Code Examples

### Example 1: Signature

```scala
def rejectEmptyResponse: Directive0
```

### Example 2: Example

```scala
val route = rejectEmptyResponse {
  path("even" / IntNumber) { i =>
    complete {
      // returns Some(evenNumberDescription) or None
      Option(i).filter(_ % 2 == 0).map { num =>
        s"Number $num is even."
      }
    }
  }
}

// tests:
Get("/even/23") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.NotFound
}
Get("/even/28") ~> route ~> check {
  responseAs[String] shouldEqual "Number 28 is even."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.rejectEmptyResponse;

final Route route = rejectEmptyResponse(() ->
        path(PathMatchers.segment("even").slash(PathMatchers.integerSegment()), (value) -> {
                  String response = "";
                  if (value % 2 == 0) {
                    response = "Number " + value + " is even";
                  }
                  return complete(response);
                }
        ));

// tests:
testRoute(route).run(HttpRequest.GET("/even/24"))
  .assertEntity("Number 24 is even");
testRoute(route).run(HttpRequest.GET("/even/23"))
  .assertStatusCode(StatusCodes.NOT_FOUND);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/extractClientIP.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityEmpty.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/rejectEmptyResponse.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/rejectEmptyResponse.html)*
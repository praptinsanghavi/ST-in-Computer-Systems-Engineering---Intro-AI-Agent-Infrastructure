---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/checkSameOrigin.html
title: checkSameOrigin • Akka HTTP
---

# checkSameOrigin • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# checkSameOrigin

## Signature

```
def checkSameOrigin(allowed: HttpOriginRange.Default): Directive0
```

## Description

Checks that request comes from the same origin. Extracts the [`Origin`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Origin.html "akka.http.javadsl.model.headers.Origin")[`Origin`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Origin.html "akka.http.scaladsl.model.headers.Origin") header value and verifies that allowed range contains the obtained value. In the case of absent of the [`Origin`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Origin.html "akka.http.javadsl.model.headers.Origin")[`Origin`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Origin.html "akka.http.scaladsl.model.headers.Origin") header rejects with a [`MissingHeaderRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html "akka.http.javadsl.server.MissingHeaderRejection")[`MissingHeaderRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html "akka.http.scaladsl.server.MissingHeaderRejection"). If the origin value is not in the allowed range rejects with an `InvalidOriginHeaderRejection` and `StatusCodes.Forbidden``StatusCodes.FORBIDDEN` status.

## Example

Checking the [`Origin`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Origin.html "akka.http.javadsl.model.headers.Origin")[`Origin`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Origin.html "akka.http.scaladsl.model.headers.Origin") header:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L229-L260 "Go to snippet source")val correctOrigin = HttpOrigin("http://localhost:8080")
val route = checkSameOrigin(HttpOriginRange(correctOrigin)) {
  complete("Result")
}

// tests:
// handle request with correct origin headers
Get("abc") ~> Origin(correctOrigin) ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Result"
}

// reject request with missed origin header
Get("abc") ~> route ~> check {
  inside(rejection) {
    case MissingHeaderRejection(headerName) => headerName shouldEqual Origin.name
  }
}

// rejects request with invalid origin headers
val invalidHttpOrigin = HttpOrigin("http://invalid.com")
val invalidOriginHeader = Origin(invalidHttpOrigin)
Get("abc") ~> invalidOriginHeader ~> route ~> check {
  inside(rejection) {
    case InvalidOriginRejection(allowedOrigins) =>
      allowedOrigins shouldEqual Seq(correctOrigin)
  }
}
Get("abc") ~> invalidOriginHeader ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.Forbidden
  responseAs[String] should include(s"${correctOrigin.value}")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L76-L340 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.checkSameOrigin;

final HttpOrigin validOriginHeader =
  HttpOrigin.create("http://localhost", Host.create("8080"));

final HttpOriginRange validOriginRange = HttpOriginRange.create(validOriginHeader);

final TestRoute route = testRoute(
  checkSameOrigin(validOriginRange,
    () -> complete("Result")));

route
  .run(HttpRequest.create().addHeader(Origin.create(validOriginHeader)))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("Result");

route
  .run(HttpRequest.create())
  .assertStatusCode(StatusCodes.BAD_REQUEST);

final HttpOrigin invalidOriginHeader =
  HttpOrigin.create("http://invalid.com", Host.create("8080"));

route
  .run(HttpRequest.create().addHeader(Origin.create(invalidOriginHeader)))
  .assertStatusCode(StatusCodes.FORBIDDEN);
```

## Code Examples

### Example 1: Signature

```scala
def checkSameOrigin(allowed: HttpOriginRange.Default): Directive0
```

### Example 2: Example

```scala
val correctOrigin = HttpOrigin("http://localhost:8080")
val route = checkSameOrigin(HttpOriginRange(correctOrigin)) {
  complete("Result")
}

// tests:
// handle request with correct origin headers
Get("abc") ~> Origin(correctOrigin) ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Result"
}

// reject request with missed origin header
Get("abc") ~> route ~> check {
  inside(rejection) {
    case MissingHeaderRejection(headerName) => headerName shouldEqual Origin.name
  }
}

// rejects request with invalid origin headers
val invalidHttpOrigin = HttpOrigin("http://invalid.com")
val invalidOriginHeader = Origin(invalidHttpOrigin)
Get("abc") ~> invalidOriginHeader ~> route ~> check {
  inside(rejection) {
    case InvalidOriginRejection(allowedOrigins) =>
      allowedOrigins shouldEqual Seq(correctOrigin)
  }
}
Get("abc") ~> invalidOriginHeader ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.Forbidden
  responseAs[String] should include(s"${correctOrigin.value}")
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.checkSameOrigin;

final HttpOrigin validOriginHeader =
  HttpOrigin.create("http://localhost", Host.create("8080"));

final HttpOriginRange validOriginRange = HttpOriginRange.create(validOriginHeader);

final TestRoute route = testRoute(
  checkSameOrigin(validOriginRange,
    () -> complete("Result")));

route
  .run(HttpRequest.create().addHeader(Origin.create(validOriginHeader)))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("Result");

route
  .run(HttpRequest.create())
  .assertStatusCode(StatusCodes.BAD_REQUEST);

final HttpOrigin invalidOriginHeader =
  HttpOrigin.create("http://invalid.com", Host.create("8080"));

route
  .run(HttpRequest.create().addHeader(Origin.create(invalidOriginHeader)))
  .assertStatusCode(StatusCodes.FORBIDDEN);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Origin.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Origin.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValuePF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/checkSameOrigin.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/checkSameOrigin.html)*
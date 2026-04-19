---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByName.html
title: headerValueByName • Akka HTTP
---

# headerValueByName • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# headerValueByName

## Signature

```
def headerValueByName(headerName: Symbol): Directive1[String]
def headerValueByName(headerName: String): Directive1[String]
```

## Description

Extracts the value of the HTTP request header with the given name.

If no header with a matching name is found the request is rejected with a [`MissingHeaderRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html "akka.http.javadsl.server.MissingHeaderRejection")[`MissingHeaderRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html "akka.http.scaladsl.server.MissingHeaderRejection").

If the header is expected to be missing in some cases or to customize handling when the header is missing use the [optionalHeaderValueByName](optionalHeaderValueByName.html) directive instead.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L18-L31 "Go to snippet source")val route =
  headerValueByName("X-User-Id") { userId =>
    complete(s"The user is $userId")
  }

// tests:
Get("/") ~> RawHeader("X-User-Id", "Joe42") ~> route ~> check {
  responseAs[String] shouldEqual "The user is Joe42"
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual BadRequest
  responseAs[String] shouldEqual "Request is missing required HTTP header 'X-User-Id'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L41-L148 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.headerValueByName;

final Route route = headerValueByName("X-User-Id", userId ->
  complete("The user is " + userId)
);

// tests:
final RawHeader header = RawHeader.create("X-User-Id", "Joe42");
testRoute(route).run(HttpRequest.GET("/").addHeader(header))
  .assertEntity("The user is Joe42");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("Request is missing required HTTP header 'X-User-Id'");
```

## Code Examples

### Example 1: Signature

```scala
def headerValueByName(headerName: Symbol): Directive1[String]
def headerValueByName(headerName: String): Directive1[String]
```

### Example 2: Example

```scala
val route =
  headerValueByName("X-User-Id") { userId =>
    complete(s"The user is $userId")
  }

// tests:
Get("/") ~> RawHeader("X-User-Id", "Joe42") ~> route ~> check {
  responseAs[String] shouldEqual "The user is Joe42"
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual BadRequest
  responseAs[String] shouldEqual "Request is missing required HTTP header 'X-User-Id'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.headerValueByName;

final Route route = headerValueByName("X-User-Id", userId ->
  complete("The user is " + userId)
);

// tests:
final RawHeader header = RawHeader.create("X-User-Id", "Joe42");
testRoute(route).run(HttpRequest.GET("/").addHeader(header))
  .assertEntity("The user is Joe42");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("Request is missing required HTTP header 'X-User-Id'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValue.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByType.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByName.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByName.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByName.html)*
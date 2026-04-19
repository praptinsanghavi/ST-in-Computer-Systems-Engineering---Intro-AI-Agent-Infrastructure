---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByName.html
title: optionalHeaderValueByName • Akka HTTP
---

# optionalHeaderValueByName • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# optionalHeaderValueByName

## Signature

```
def optionalHeaderValueByName(headerName: Symbol): Directive1[Option[String]]
def optionalHeaderValueByName(headerName: String): Directive1[Option[String]]
```

## Description

Optionally extracts the value of the HTTP request header with the given name.

The `optionalHeaderValueByName` directive is similar to the [headerValueByName](headerValueByName.html) directive but always extracts an `Option``Optional` value instead of rejecting the request if no matching header could be found.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L111-L131 "Go to snippet source")val route =
  optionalHeaderValueByName("X-User-Id") {
    case Some(userId) => complete(s"The user is $userId")
    case None         => complete(s"No user was provided")
  } ~ // can also be written as:
    optionalHeaderValueByName("X-User-Id") { userId =>
      complete {
        userId match {
          case Some(u) => s"The user is $u"
          case _       => "No user was provided"
        }
      }
    }

// tests:
Get("/") ~> RawHeader("X-User-Id", "Joe42") ~> route ~> check {
  responseAs[String] shouldEqual "The user is Joe42"
}
Get("/") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "No user was provided"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L61-L249 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalHeaderValueByName;

final Route route = optionalHeaderValueByName("X-User-Id", userId -> {
  if (userId.isPresent()) {
    return complete("The user is " + userId.get());
  } else {
    return complete("No user was provided");
  }
});

// tests:
final RawHeader header = RawHeader.create("X-User-Id", "Joe42");
testRoute(route).run(HttpRequest.GET("/").addHeader(header))
  .assertEntity("The user is Joe42");

testRoute(route).run(HttpRequest.GET("/")).assertEntity("No user was provided");
```

## Code Examples

### Example 1: Signature

```scala
def optionalHeaderValueByName(headerName: Symbol): Directive1[Option[String]]
def optionalHeaderValueByName(headerName: String): Directive1[Option[String]]
```

### Example 2: Example

```scala
val route =
  optionalHeaderValueByName("X-User-Id") {
    case Some(userId) => complete(s"The user is $userId")
    case None         => complete(s"No user was provided")
  } ~ // can also be written as:
    optionalHeaderValueByName("X-User-Id") { userId =>
      complete {
        userId match {
          case Some(u) => s"The user is $u"
          case _       => "No user was provided"
        }
      }
    }

// tests:
Get("/") ~> RawHeader("X-User-Id", "Joe42") ~> route ~> check {
  responseAs[String] shouldEqual "The user is Joe42"
}
Get("/") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "No user was provided"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalHeaderValueByName;

final Route route = optionalHeaderValueByName("X-User-Id", userId -> {
  if (userId.isPresent()) {
    return complete("The user is " + userId.get());
  } else {
    return complete("No user was provided");
  }
});

// tests:
final RawHeader header = RawHeader.create("X-User-Id", "Joe42");
testRoute(route).run(HttpRequest.GET("/").addHeader(header))
  .assertEntity("The user is Joe42");

testRoute(route).run(HttpRequest.GET("/")).assertEntity("No user was provided");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByName.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValue.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByType.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByName.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByName.html)*
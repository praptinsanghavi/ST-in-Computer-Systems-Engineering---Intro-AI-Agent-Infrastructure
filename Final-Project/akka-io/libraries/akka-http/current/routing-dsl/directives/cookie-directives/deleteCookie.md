---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/deleteCookie.html
title: deleteCookie • Akka HTTP
---

# deleteCookie • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# deleteCookie

## Signature

```
def deleteCookie(first: HttpCookie, more: HttpCookie*): Directive0
def deleteCookie(name: String, domain: String = "", path: String = ""): Directive0
```

## Description

Adds a header to the response to request the removal of the cookie with the given name on the client.

Use the [setCookie](setCookie.html) directive to update a cookie.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CookieDirectivesExamplesSpec.scala#L52-L61 "Go to snippet source")val route =
  deleteCookie("userName") {
    complete("The user was logged out")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "The user was logged out"
  header[`Set-Cookie`] shouldEqual Some(`Set-Cookie`(HttpCookie("userName", value = "deleted", expires = Some(DateTime.MinValue))))
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CookieDirectivesExamplesTest.java#L32-L104 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.deleteCookie;

final Route route = deleteCookie("userName", () ->
  complete("The user was logged out")
);

// tests:
final HttpHeader expected = SetCookie.create(
  HttpCookie.create(
    "userName",
    "deleted",
    Optional.of(DateTime.MinValue()),
    OptionalLong.empty(),
    Optional.empty(),
    Optional.empty(),
    false,
    false,
    Optional.empty(),
    Optional.empty()));

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("The user was logged out")
  .assertHeaderExists(expected);
```

## Code Examples

### Example 1: Signature

```scala
def deleteCookie(first: HttpCookie, more: HttpCookie*): Directive0
def deleteCookie(name: String, domain: String = "", path: String = ""): Directive0
```

### Example 2: Example

```scala
val route =
  deleteCookie("userName") {
    complete("The user was logged out")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "The user was logged out"
  header[`Set-Cookie`] shouldEqual Some(`Set-Cookie`(HttpCookie("userName", value = "deleted", expires = Some(DateTime.MinValue))))
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.deleteCookie;

final Route route = deleteCookie("userName", () ->
  complete("The user was logged out")
);

// tests:
final HttpHeader expected = SetCookie.create(
  HttpCookie.create(
    "userName",
    "deleted",
    Optional.of(DateTime.MinValue()),
    OptionalLong.empty(),
    Optional.empty(),
    Optional.empty(),
    false,
    false,
    Optional.empty(),
    Optional.empty()));

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("The user was logged out")
  .assertHeaderExists(expected);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/cookie.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/optionalCookie.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/setCookie.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/deleteCookie.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/deleteCookie.html)*
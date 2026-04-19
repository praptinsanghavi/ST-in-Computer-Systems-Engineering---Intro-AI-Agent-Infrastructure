---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:12Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/setCookie.html
title: setCookie • Akka HTTP
---

# setCookie • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# setCookie

## Signature

```
def setCookie(first: HttpCookie, more: HttpCookie*): Directive0
```

## Description

Adds a header to the response to request the update of the cookie with the given name on the client.

Use the [deleteCookie](deleteCookie.html) directive to delete a cookie.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CookieDirectivesExamplesSpec.scala#L66-L75 "Go to snippet source")val route =
  setCookie(HttpCookie("userName", value = "paul")) {
    complete("The user was logged in")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "The user was logged in"
  header[`Set-Cookie`] shouldEqual Some(`Set-Cookie`(HttpCookie("userName", value = "paul")))
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CookieDirectivesExamplesTest.java#L37-L120 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.setCookie;

final Route route = setCookie(HttpCookie.create("userName", "paul"), () ->
  complete("The user was logged in")
);

// tests:
final HttpHeader expected = SetCookie.create(HttpCookie.create("userName", "paul"));

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("The user was logged in")
  .assertHeaderExists(expected);
```

## Code Examples

### Example 1: Signature

```scala
def setCookie(first: HttpCookie, more: HttpCookie*): Directive0
```

### Example 2: Example

```scala
val route =
  setCookie(HttpCookie("userName", value = "paul")) {
    complete("The user was logged in")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "The user was logged in"
  header[`Set-Cookie`] shouldEqual Some(`Set-Cookie`(HttpCookie("userName", value = "paul")))
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.setCookie;

final Route route = setCookie(HttpCookie.create("userName", "paul"), () ->
  complete("The user was logged in")
);

// tests:
final HttpHeader expected = SetCookie.create(HttpCookie.create("userName", "paul"));

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("The user was logged in")
  .assertHeaderExists(expected);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/deleteCookie.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/optionalCookie.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cors-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/setCookie.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/setCookie.html)*
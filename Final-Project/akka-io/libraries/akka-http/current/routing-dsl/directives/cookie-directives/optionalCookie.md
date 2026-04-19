---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/optionalCookie.html
title: optionalCookie • Akka HTTP
---

# optionalCookie • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# optionalCookie

## Signature

```
def optionalCookie(name: String): Directive1[Option[HttpCookiePair]]
```

## Description

Extracts an optional cookie with a given name from a request.

Use the [cookie](cookie.html) directive instead if the inner route does not handle a missing cookie.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CookieDirectivesExamplesSpec.scala#L35-L47 "Go to snippet source")val route =
  optionalCookie("userName") {
    case Some(nameCookie) => complete(s"The logged in user is '${nameCookie.value}'")
    case None             => complete("No user logged in")
  }

// tests:
Get("/") ~> Cookie("userName" -> "paul") ~> route ~> check {
  responseAs[String] shouldEqual "The logged in user is 'paul'"
}
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "No user logged in"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CookieDirectivesExamplesTest.java#L27-L77 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalCookie;

final Route route = optionalCookie("userName", optNameCookie -> {
  if (optNameCookie.isPresent()) {
    return complete("The logged in user is '" + optNameCookie.get().value() + "'");
  } else {
    return complete("No user logged in");
  }
}
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Cookie.create("userName", "paul")))
  .assertEntity("The logged in user is 'paul'");
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("No user logged in");
```

## Code Examples

### Example 1: Signature

```scala
def optionalCookie(name: String): Directive1[Option[HttpCookiePair]]
```

### Example 2: Example

```scala
val route =
  optionalCookie("userName") {
    case Some(nameCookie) => complete(s"The logged in user is '${nameCookie.value}'")
    case None             => complete("No user logged in")
  }

// tests:
Get("/") ~> Cookie("userName" -> "paul") ~> route ~> check {
  responseAs[String] shouldEqual "The logged in user is 'paul'"
}
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "No user logged in"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalCookie;

final Route route = optionalCookie("userName", optNameCookie -> {
  if (optNameCookie.isPresent()) {
    return complete("The logged in user is '" + optNameCookie.get().value() + "'");
  } else {
    return complete("No user logged in");
  }
}
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Cookie.create("userName", "paul")))
  .assertEntity("The logged in user is 'paul'");
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("No user logged in");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/cookie.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/deleteCookie.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/setCookie.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/optionalCookie.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/optionalCookie.html)*
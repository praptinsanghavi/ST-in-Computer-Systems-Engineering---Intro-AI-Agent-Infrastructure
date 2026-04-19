---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:24Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/cookie.html
title: cookie • Akka HTTP
---

# cookie • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# cookie

## Signature

```
def cookie(name: String): Directive1[HttpCookiePair]
```

## Description

Extracts a cookie with a given name from a request or otherwise rejects the request with a [`MissingCookieRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingCookieRejection.html "akka.http.javadsl.server.MissingCookieRejection")[`MissingCookieRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingCookieRejection.html "akka.http.scaladsl.server.MissingCookieRejection") if the cookie is missing.

Use the [optionalCookie](optionalCookie.html) directive instead if you want to support missing cookies in your inner route.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CookieDirectivesExamplesSpec.scala#L15-L30 "Go to snippet source")val route =
  cookie("userName") { nameCookie =>
    complete(s"The logged in user is '${nameCookie.value}'")
  }

// tests:
Get("/") ~> Cookie("userName" -> "paul") ~> route ~> check {
  responseAs[String] shouldEqual "The logged in user is 'paul'"
}
// missing cookie
Get("/") ~> route ~> check {
  rejection shouldEqual MissingCookieRejection("userName")
}
Get("/") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "Request is missing required cookie 'userName'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CookieDirectivesExamplesTest.java#L22-L57 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.cookie;

final Route route = cookie("userName", nameCookie ->
  complete("The logged in user is '" + nameCookie.value() + "'")
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Cookie.create("userName", "paul")))
  .assertEntity("The logged in user is 'paul'");
// missing cookie
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.missingCookie("userName"));
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Request is missing required cookie 'userName'");
```

## Code Examples

### Example 1: Signature

```scala
def cookie(name: String): Directive1[HttpCookiePair]
```

### Example 2: Example

```scala
val route =
  cookie("userName") { nameCookie =>
    complete(s"The logged in user is '${nameCookie.value}'")
  }

// tests:
Get("/") ~> Cookie("userName" -> "paul") ~> route ~> check {
  responseAs[String] shouldEqual "The logged in user is 'paul'"
}
// missing cookie
Get("/") ~> route ~> check {
  rejection shouldEqual MissingCookieRejection("userName")
}
Get("/") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "Request is missing required cookie 'userName'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.cookie;

final Route route = cookie("userName", nameCookie ->
  complete("The logged in user is '" + nameCookie.value() + "'")
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Cookie.create("userName", "paul")))
  .assertEntity("The logged in user is 'paul'");
// missing cookie
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.missingCookie("userName"));
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Request is missing required cookie 'userName'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingCookieRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingCookieRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/deleteCookie.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/optionalCookie.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/cookie.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/cookie.html)*
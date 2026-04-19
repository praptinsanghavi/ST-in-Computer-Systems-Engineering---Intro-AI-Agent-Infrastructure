---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:33Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/ignoreTrailingSlash.html
title: ignoreTrailingSlash • Akka HTTP
---

# ignoreTrailingSlash • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ignoreTrailingSlash

## Signature

```
def ignoreTrailingSlash: Directive0
```

## Description

If the requested path ends with a trailing `/` character and the inner route is rejected with an empty [`Rejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html "akka.http.javadsl.server.Rejection")[`Rejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html "akka.http.scaladsl.server.Rejection") list, it retries the inner route it removing the trailing `/` character. Similarly, it retries adding a trailing `/` character if the original requested path doesn’t end with a `/` character. 

This directive will retry the inner route with a “flipped” trailing slash only if the mentioned inner route is rejected with an empty [`Rejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html "akka.http.javadsl.server.Rejection")[`Rejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html "akka.http.scaladsl.server.Rejection") list.

Note
Please note that enclosing routes with this directive might cause double evaluation in case of unhandled request paths. This may be expensive when enclosing big route trees. Use with care.

See also [redirectToNoTrailingSlashIfPresent](redirectToNoTrailingSlashIfPresent.html) and [redirectToTrailingSlashIfMissing](redirectToTrailingSlashIfMissing.html) for other ways to accomplish a similar thing. 

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L447-L479 "Go to snippet source")val route = ignoreTrailingSlash {
  concat(
    path("foo") {
      // Thanks to `ignoreTrailingSlash` it will serve both `/foo` and `/foo/`.
      complete("OK")
    },
    path("bar"./) {
      // Thanks to `ignoreTrailingSlash` it will serve both `/bar` and `/bar/`.
      complete("OK")
    }
  )
}

// tests:
Get("/foo") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

Get("/foo/") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

Get("/bar") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

Get("/bar/") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L104-L462 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.ignoreTrailingSlash;
final Route route = ignoreTrailingSlash(() ->
  concat(
    path("foo", () ->
      // Thanks to `ignoreTrailingSlash` it will serve both `/foo` and `/foo/`.
      complete("OK")),
    path(PathMatchers.segment("bar").slash(), () ->
      // Thanks to `ignoreTrailingSlash` it will serve both `/bar` and `/bar/`.
      complete("OK"))
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/foo"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");
testRoute(route).run(HttpRequest.GET("/foo/"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");

testRoute(route).run(HttpRequest.GET("/bar"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");
testRoute(route).run(HttpRequest.GET("/bar/"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");
```

## Code Examples

### Example 1: Signature

```scala
def ignoreTrailingSlash: Directive0
```

### Example 2: Example

```scala
val route = ignoreTrailingSlash {
  concat(
    path("foo") {
      // Thanks to `ignoreTrailingSlash` it will serve both `/foo` and `/foo/`.
      complete("OK")
    },
    path("bar"./) {
      // Thanks to `ignoreTrailingSlash` it will serve both `/bar` and `/bar/`.
      complete("OK")
    }
  )
}

// tests:
Get("/foo") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

Get("/foo/") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

Get("/bar") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

Get("/bar/") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.ignoreTrailingSlash;
final Route route = ignoreTrailingSlash(() ->
  concat(
    path("foo", () ->
      // Thanks to `ignoreTrailingSlash` it will serve both `/foo` and `/foo/`.
      complete("OK")),
    path(PathMatchers.segment("bar").slash(), () ->
      // Thanks to `ignoreTrailingSlash` it will serve both `/bar` and `/bar/`.
      complete("OK"))
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/foo"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");
testRoute(route).run(HttpRequest.GET("/foo/"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");

testRoute(route).run(HttpRequest.GET("/bar"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");
testRoute(route).run(HttpRequest.GET("/bar/"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToNoTrailingSlashIfPresent.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToTrailingSlashIfMissing.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/ignoreTrailingSlash.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/ignoreTrailingSlash.html)*
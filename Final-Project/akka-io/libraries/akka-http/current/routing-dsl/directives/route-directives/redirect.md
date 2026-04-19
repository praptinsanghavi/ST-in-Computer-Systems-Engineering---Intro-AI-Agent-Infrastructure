---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/redirect.html
title: redirect • Akka HTTP
---

# redirect • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# redirect

## Signature

```
def redirect(uri: Uri, redirectionType: Redirection): StandardRoute
```

## Description

Completes the request with a redirection response to a given target URI and of a given redirection type (status code).

`redirect` is a convenience helper for completing the request with a redirection response. It is equivalent to this snippet relying on the `complete` method on [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext"), and a directive is also available:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/RequestContextImpl.scala#L53-L59 "Go to snippet source")complete(HttpResponse(
  status = redirectionType,
  headers = headers.Location(uri) :: Nil,
  entity = redirectionType.htmlTemplate match {
    case ""       => HttpEntity.Empty
    case template => HttpEntity(ContentTypes.`text/html(UTF-8)`, template format uri)
  }))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RouteDirectivesExamplesTest.java#L55-L57 "Go to snippet source")rc.completeWith(HttpResponse.create()
        .withStatus(redirectionType)
        .addHeader(Location.create(uri))
```

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RouteDirectivesExamplesSpec.scala#L137-L157 "Go to snippet source")val route =
  pathPrefix("foo") {
    concat(
      pathSingleSlash {
        complete("yes")
      },
      pathEnd {
        redirect("/foo/", StatusCodes.PermanentRedirect)
      }
    )
  }

// tests:
Get("/foo/") ~> route ~> check {
  responseAs[String] shouldEqual "yes"
}

Get("/foo") ~> route ~> check {
  status shouldEqual StatusCodes.PermanentRedirect
  responseAs[String] shouldEqual """The request, and all future requests should be repeated using <a href="/foo/">this URI</a>."""
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RouteDirectivesExamplesTest.java#L35-L148 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.pathEnd;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathSingleSlash;
import static akka.http.javadsl.server.Directives.redirect;
final Route route = pathPrefix("foo", () ->
  concat(
    pathSingleSlash(() -> complete("yes")),
    pathEnd(() -> redirect(Uri.create("/foo/"), StatusCodes.PERMANENT_REDIRECT))
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/foo/"))
  .assertEntity("yes");

testRoute(route).run(HttpRequest.GET("/foo"))
  .assertStatusCode(StatusCodes.PERMANENT_REDIRECT)
  .assertEntity("The request, and all future requests should be repeated using <a href=\"/foo/\">this URI</a>.");
```

## Code Examples

### Example 1: Signature

```scala
def redirect(uri: Uri, redirectionType: Redirection): StandardRoute
```

### Example 2: Description

```scala
complete(HttpResponse(
  status = redirectionType,
  headers = headers.Location(uri) :: Nil,
  entity = redirectionType.htmlTemplate match {
    case ""       => HttpEntity.Empty
    case template => HttpEntity(ContentTypes.`text/html(UTF-8)`, template format uri)
  }))
```

### Example 3: Description

```java
rc.completeWith(HttpResponse.create()
        .withStatus(redirectionType)
        .addHeader(Location.create(uri))
```

### Example 4: Example

```scala
val route =
  pathPrefix("foo") {
    concat(
      pathSingleSlash {
        complete("yes")
      },
      pathEnd {
        redirect("/foo/", StatusCodes.PermanentRedirect)
      }
    )
  }

// tests:
Get("/foo/") ~> route ~> check {
  responseAs[String] shouldEqual "yes"
}

Get("/foo") ~> route ~> check {
  status shouldEqual StatusCodes.PermanentRedirect
  responseAs[String] shouldEqual """The request, and all future requests should be repeated using <a href="/foo/">this URI</a>."""
}
```

### Example 5: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.pathEnd;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathSingleSlash;
import static akka.http.javadsl.server.Directives.redirect;
final Route route = pathPrefix("foo", () ->
  concat(
    pathSingleSlash(() -> complete("yes")),
    pathEnd(() -> redirect(Uri.create("/foo/"), StatusCodes.PERMANENT_REDIRECT))
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/foo/"))
  .assertEntity("yes");

testRoute(route).run(HttpRequest.GET("/foo"))
  .assertStatusCode(StatusCodes.PERMANENT_REDIRECT)
  .assertEntity("The request, and all future requests should be repeated using <a href=\"/foo/\">this URI</a>.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handleSync.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/reject.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/redirect.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/redirect.html)*
---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToTrailingSlashIfMissing.html
title: redirectToTrailingSlashIfMissing • Akka HTTP
---

# redirectToTrailingSlashIfMissing • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# redirectToTrailingSlashIfMissing

## Signature

```
def redirectToTrailingSlashIfMissing(redirectionType: StatusCodes.Redirection): Directive0
```

## Description

If the requested path does not end with a trailing `/` character, redirects to the same path followed by such trailing slash.

Redirects the HTTP Client to the same resource yet followed by a trailing `/`, in case the request did not contain it. When redirecting an HttpResponse with the given redirect response code (i.e. `MovedPermanently` or `TemporaryRedirect` etc.) as well as a simple HTML page containing a “*click me to follow redirect*” link to be used in case the client can not, or refuses to for security reasons, automatically follow redirects.

Please note that the inner paths **MUST** end with an explicit trailing slash (e.g. `"things"./`) for the re\-directed\-to route to match.

See also [redirectToNoTrailingSlashIfPresent](redirectToNoTrailingSlashIfPresent.html) which achieves the opposite \- redirecting paths in case they do have a trailing slash.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L341-L392 "Go to snippet source")import akka.http.scaladsl.model.StatusCodes

val route =
  redirectToTrailingSlashIfMissing(StatusCodes.MovedPermanently) {
    concat(
      path("foo"./) {
        // We require the explicit trailing slash in the path
        complete("OK")
      },
      path("bad-1") {
        // MISTAKE!
        // Missing `/` in path, causes this path to never match,
        // because it is inside a `redirectToTrailingSlashIfMissing`
        ???
      },
      path("bad-2/") {
        // MISTAKE!
        // / should be explicit as path element separator and not *in* the path element
        // So it should be: "bad-2" /
        ???
      }
    )
  }

// tests:
// Redirected:
Get("/foo") ~> route ~> check {
  status shouldEqual StatusCodes.MovedPermanently

  // results in nice human readable message,
  // in case the redirect can't be followed automatically:
  responseAs[String] shouldEqual {
    "This and all future requests should be directed to " +
      "<a href=\"http://example.com/foo/\">this URI</a>."
  }
}

// Properly handled:
Get("/foo/") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

// MISTAKE! will never match - reason explained in routes
Get("/bad-1/") ~> route ~> check {
  handled shouldEqual false
}

// MISTAKE! will never match - reason explained in routes
Get("/bad-2/") ~> route ~> check {
  handled shouldEqual false
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L94-L397 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.redirectToTrailingSlashIfMissing;
final Route route =
    redirectToTrailingSlashIfMissing(
        StatusCodes.MOVED_PERMANENTLY, () ->
        concat(
            path(segment("foo").slash(), () -> complete("OK")),
            path(segment("bad-1"), () ->
                // MISTAKE!
                // Missing .slash() in path, causes this path to never match,
                // because it is inside a `redirectToTrailingSlashIfMissing`
                complete(StatusCodes.NOT_IMPLEMENTED)
            ),
            path(segment("bad-2/"), () ->
                // MISTAKE!
                // / should be explicit with `.slash()` and not *in* the path element
                // So it should be: segment("bad-2").slash()
                complete(StatusCodes.NOT_IMPLEMENTED)
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo"))
    .assertStatusCode(StatusCodes.MOVED_PERMANENTLY)
    .assertEntity("This and all future requests should be directed to " +
      "<a href=\"http://example.com/foo/\">this URI</a>.");

testRoute(route).run(HttpRequest.GET("/foo/"))
    .assertStatusCode(StatusCodes.OK)
    .assertEntity("OK");

testRoute(route).run(HttpRequest.GET("/bad-1/"))
    .assertStatusCode(StatusCodes.NOT_FOUND);
```

## Code Examples

### Example 1: Signature

```scala
def redirectToTrailingSlashIfMissing(redirectionType: StatusCodes.Redirection): Directive0
```

### Example 2: Example

```scala
import akka.http.scaladsl.model.StatusCodes

val route =
  redirectToTrailingSlashIfMissing(StatusCodes.MovedPermanently) {
    concat(
      path("foo"./) {
        // We require the explicit trailing slash in the path
        complete("OK")
      },
      path("bad-1") {
        // MISTAKE!
        // Missing `/` in path, causes this path to never match,
        // because it is inside a `redirectToTrailingSlashIfMissing`
        ???
      },
      path("bad-2/") {
        // MISTAKE!
        // / should be explicit as path element separator and not *in* the path element
        // So it should be: "bad-2" /
        ???
      }
    )
  }

// tests:
// Redirected:
Get("/foo") ~> route ~> check {
  status shouldEqual StatusCodes.MovedPermanently

  // results in nice human readable message,
  // in case the redirect can't be followed automatically:
  responseAs[String] shouldEqual {
    "This and all future requests should be directed to " +
      "<a href=\"http://example.com/foo/\">this URI</a>."
  }
}

// Properly handled:
Get("/foo/") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

// MISTAKE! will never match - reason explained in routes
Get("/bad-1/") ~> route ~> check {
  handled shouldEqual false
}

// MISTAKE! will never match - reason explained in routes
Get("/bad-2/") ~> route ~> check {
  handled shouldEqual false
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.redirectToTrailingSlashIfMissing;
final Route route =
    redirectToTrailingSlashIfMissing(
        StatusCodes.MOVED_PERMANENTLY, () ->
        concat(
            path(segment("foo").slash(), () -> complete("OK")),
            path(segment("bad-1"), () ->
                // MISTAKE!
                // Missing .slash() in path, causes this path to never match,
                // because it is inside a `redirectToTrailingSlashIfMissing`
                complete(StatusCodes.NOT_IMPLEMENTED)
            ),
            path(segment("bad-2/"), () ->
                // MISTAKE!
                // / should be explicit with `.slash()` and not *in* the path element
                // So it should be: segment("bad-2").slash()
                complete(StatusCodes.NOT_IMPLEMENTED)
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo"))
    .assertStatusCode(StatusCodes.MOVED_PERMANENTLY)
    .assertEntity("This and all future requests should be directed to " +
      "<a href=\"http://example.com/foo/\">this URI</a>.");

testRoute(route).run(HttpRequest.GET("/foo/"))
    .assertStatusCode(StatusCodes.OK)
    .assertEntity("OK");

testRoute(route).run(HttpRequest.GET("/bad-1/"))
    .assertStatusCode(StatusCodes.NOT_FOUND);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/ignoreTrailingSlash.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToNoTrailingSlashIfPresent.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToTrailingSlashIfMissing.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToTrailingSlashIfMissing.html)*
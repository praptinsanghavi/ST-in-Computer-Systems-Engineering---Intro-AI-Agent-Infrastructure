---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:02Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToNoTrailingSlashIfPresent.html
title: redirectToNoTrailingSlashIfPresent • Akka HTTP
---

# redirectToNoTrailingSlashIfPresent • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# redirectToNoTrailingSlashIfPresent

## Signature

```
def redirectToNoTrailingSlashIfPresent(redirectionType: StatusCodes.Redirection): Directive0
```

## Description

If the requested path does end with a trailing `/` character, redirects to the same path without that trailing slash..

Redirects the HTTP Client to the same resource yet without the trailing `/`, in case the request contained it. When redirecting an HttpResponse with the given redirect response code (i.e. `MovedPermanently` or `TemporaryRedirect` etc.) as well as a simple HTML page containing a “*click me to follow redirect*” link to be used in case the client can not, or refuses to for security reasons, automatically follow redirects.

Please note that the inner paths **MUST NOT** end with an explicit trailing slash (e.g. `"things"./`) for the re\-directed\-to route to match.

A good read on the subject of how to deal with trailing slashes is available on [Google Webmaster Central \- To Slash or not to Slash](https://webmasters.googleblog.com/2010/04/to-slash-or-not-to-slash.html).

See also [redirectToTrailingSlashIfMissing](redirectToTrailingSlashIfMissing.html) which achieves the opposite \- redirecting paths in case they do *not* have a trailing slash.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L398-L441 "Go to snippet source")import akka.http.scaladsl.model.StatusCodes

val route =
  redirectToNoTrailingSlashIfPresent(StatusCodes.MovedPermanently) {
    concat(
      path("foo") {
        // We require to not have a trailing slash in the path
        complete("OK")
      },
      path("bad"./) {
        // MISTAKE!
        // Since inside a `redirectToNoTrailingSlashIfPresent` directive
        // the matched path here will never contain a trailing slash,
        // thus this path will never match.
        //
        // It should be `path("bad")` instead.
        ???
      }
    )
  }

// tests:
// Redirected:
Get("/foo/") ~> route ~> check {
  status shouldEqual StatusCodes.MovedPermanently

  // results in nice human readable message,
  // in case the redirect can't be followed automatically:
  responseAs[String] shouldEqual {
    "This and all future requests should be directed to " +
      "<a href=\"http://example.com/foo\">this URI</a>."
  }
}

// Properly handled:
Get("/foo") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

// MISTAKE! will never match - reason explained in routes
Get("/bad") ~> route ~> check {
  handled shouldEqual false
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L99-L431 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.redirectToNoTrailingSlashIfPresent;
final Route route =
    redirectToNoTrailingSlashIfPresent(
        StatusCodes.MOVED_PERMANENTLY, () ->
        concat(
            path("foo", () -> complete("OK")),
            path(segment("bad").slash(), () ->
                // MISTAKE!
                // Since inside a `redirectToNoTrailingSlashIfPresent` directive
                // the matched path here will never contain a trailing slash,
                // thus this path will never match.
                //
                // It should be `path("bad")` instead.
                 complete(StatusCodes.NOT_IMPLEMENTED)
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo/"))
    .assertStatusCode(StatusCodes.MOVED_PERMANENTLY)
    .assertEntity("This and all future requests should be directed to " +
      "<a href=\"http://example.com/foo\">this URI</a>.");

testRoute(route).run(HttpRequest.GET("/foo"))
    .assertStatusCode(StatusCodes.OK)
    .assertEntity("OK");

testRoute(route).run(HttpRequest.GET("/bad"))
    .assertStatusCode(StatusCodes.NOT_FOUND);
```

## Code Examples

### Example 1: Signature

```scala
def redirectToNoTrailingSlashIfPresent(redirectionType: StatusCodes.Redirection): Directive0
```

### Example 2: Example

```scala
import akka.http.scaladsl.model.StatusCodes

val route =
  redirectToNoTrailingSlashIfPresent(StatusCodes.MovedPermanently) {
    concat(
      path("foo") {
        // We require to not have a trailing slash in the path
        complete("OK")
      },
      path("bad"./) {
        // MISTAKE!
        // Since inside a `redirectToNoTrailingSlashIfPresent` directive
        // the matched path here will never contain a trailing slash,
        // thus this path will never match.
        //
        // It should be `path("bad")` instead.
        ???
      }
    )
  }

// tests:
// Redirected:
Get("/foo/") ~> route ~> check {
  status shouldEqual StatusCodes.MovedPermanently

  // results in nice human readable message,
  // in case the redirect can't be followed automatically:
  responseAs[String] shouldEqual {
    "This and all future requests should be directed to " +
      "<a href=\"http://example.com/foo\">this URI</a>."
  }
}

// Properly handled:
Get("/foo") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

// MISTAKE! will never match - reason explained in routes
Get("/bad") ~> route ~> check {
  handled shouldEqual false
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.redirectToNoTrailingSlashIfPresent;
final Route route =
    redirectToNoTrailingSlashIfPresent(
        StatusCodes.MOVED_PERMANENTLY, () ->
        concat(
            path("foo", () -> complete("OK")),
            path(segment("bad").slash(), () ->
                // MISTAKE!
                // Since inside a `redirectToNoTrailingSlashIfPresent` directive
                // the matched path here will never contain a trailing slash,
                // thus this path will never match.
                //
                // It should be `path("bad")` instead.
                 complete(StatusCodes.NOT_IMPLEMENTED)
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo/"))
    .assertStatusCode(StatusCodes.MOVED_PERMANENTLY)
    .assertEntity("This and all future requests should be directed to " +
      "<a href=\"http://example.com/foo\">this URI</a>.");

testRoute(route).run(HttpRequest.GET("/foo"))
    .assertStatusCode(StatusCodes.OK)
    .assertEntity("OK");

testRoute(route).run(HttpRequest.GET("/bad"))
    .assertStatusCode(StatusCodes.NOT_FOUND);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToTrailingSlashIfMissing.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToNoTrailingSlashIfPresent.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToNoTrailingSlashIfPresent.html)*
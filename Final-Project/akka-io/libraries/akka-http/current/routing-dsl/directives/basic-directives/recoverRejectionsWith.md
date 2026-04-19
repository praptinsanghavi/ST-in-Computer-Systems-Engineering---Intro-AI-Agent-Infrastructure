---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:02Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejectionsWith.html
title: recoverRejectionsWith • Akka HTTP
---

# recoverRejectionsWith • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# recoverRejectionsWith

## Signature

```
def recoverRejectionsWith(f: immutable.Seq[Rejection] => Future[RouteResult]): Directive0
```

## Description

**Low level directive** – unless you’re sure you need to be working on this low\-level you might instead want to try the [handleRejections](../execution-directives/handleRejections.html) directive which provides a nicer DSL for building rejection handlers.

Transforms rejections from the inner route with an `immutable.Seq[Rejection] => Future[RouteResult]` functiona `Function<Iterable<Rejection>, CompletionStage<RouteResult>>`.

Asynchronous version of [recoverRejections](recoverRejections.html).

See [recoverRejections](recoverRejections.html) (the synchronous equivalent of this directive) for a detailed description.

Note
To learn more about how and why rejections work read the [Rejections](../../rejections.html) section of the documentation.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L470-L496 "Go to snippet source")val authRejectionsToNothingToSeeHere = recoverRejectionsWith { rejections =>
  Future {
    // imagine checking rejections takes a longer time:
    if (rejections.exists(_.isInstanceOf[AuthenticationFailedRejection]))
      Complete(HttpResponse(entity = "Nothing to see here, move along."))
    else
      Rejected(rejections)
  }
}
val neverAuth: Authenticator[String] = creds => None

val route =
  authRejectionsToNothingToSeeHere {
    pathPrefix("auth") {
      path("never") {
        authenticateBasic("my-realm", neverAuth) { user =>
          complete("Welcome to the bat-cave!")
        }
      }
    }
  }

// tests:
Get("/auth/never") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Nothing to see here, move along."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L203-L708 "Go to snippet source")import akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials;

import static akka.http.javadsl.server.Directives.authenticateBasic;
import static akka.http.javadsl.server.Directives.recoverRejectionsWith;

final Function<Optional<ProvidedCredentials>, Optional<Object>> neverAuth =
  creds -> Optional.empty();

final Route originalRoute = pathPrefix("auth", () ->
  path("never", () ->
    authenticateBasic("my-realm", neverAuth, obj ->  complete("Welcome to the bat-cave!"))
  )
);

final Function<Iterable<Rejection>, Boolean> existsAuthenticationFailedRejection =
  rejections ->
    StreamSupport.stream(rejections.spliterator(), false)
      .anyMatch(r -> r instanceof AuthenticationFailedRejection);

final Route route = recoverRejectionsWith(
  rejections -> CompletableFuture.supplyAsync(() -> {
    if (existsAuthenticationFailedRejection.apply(rejections)) {
      return RouteResults.complete(
          HttpResponse.create().withEntity("Nothing to see here, move along."));
    } else {
      return RouteResults.rejected(rejections);
    }
}), () -> originalRoute);

// tests:
testRoute(route).run(HttpRequest.GET("/auth/never"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("Nothing to see here, move along.");
```

## Code Examples

### Example 1: Signature

```scala
def recoverRejectionsWith(f: immutable.Seq[Rejection] => Future[RouteResult]): Directive0
```

### Example 2: Example

```scala
val authRejectionsToNothingToSeeHere = recoverRejectionsWith { rejections =>
  Future {
    // imagine checking rejections takes a longer time:
    if (rejections.exists(_.isInstanceOf[AuthenticationFailedRejection]))
      Complete(HttpResponse(entity = "Nothing to see here, move along."))
    else
      Rejected(rejections)
  }
}
val neverAuth: Authenticator[String] = creds => None

val route =
  authRejectionsToNothingToSeeHere {
    pathPrefix("auth") {
      path("never") {
        authenticateBasic("my-realm", neverAuth) { user =>
          complete("Welcome to the bat-cave!")
        }
      }
    }
  }

// tests:
Get("/auth/never") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Nothing to see here, move along."
}
```

### Example 3: Example

```java
import akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials;

import static akka.http.javadsl.server.Directives.authenticateBasic;
import static akka.http.javadsl.server.Directives.recoverRejectionsWith;

final Function<Optional<ProvidedCredentials>, Optional<Object>> neverAuth =
  creds -> Optional.empty();

final Route originalRoute = pathPrefix("auth", () ->
  path("never", () ->
    authenticateBasic("my-realm", neverAuth, obj ->  complete("Welcome to the bat-cave!"))
  )
);

final Function<Iterable<Rejection>, Boolean> existsAuthenticationFailedRejection =
  rejections ->
    StreamSupport.stream(rejections.spliterator(), false)
      .anyMatch(r -> r instanceof AuthenticationFailedRejection);

final Route route = recoverRejectionsWith(
  rejections -> CompletableFuture.supplyAsync(() -> {
    if (existsAuthenticationFailedRejection.apply(rejections)) {
      return RouteResults.complete(
          HttpResponse.create().withEntity("Nothing to see here, move along."));
    } else {
      return RouteResults.rejected(rejections);
    }
}), () -> originalRoute);

// tests:
testRoute(route).run(HttpRequest.GET("/auth/never"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("Nothing to see here, move along.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/textract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejectionsWith.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejectionsWith.html)*
---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejections.html
title: recoverRejections • Akka HTTP
---

# recoverRejections • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# recoverRejections

## Signature

```
def recoverRejections(f: immutable.Seq[Rejection] => RouteResult): Directive0
```

## Description

**Low level directive** – unless you’re sure you need to be working on this low\-level you might instead want to try the [handleRejections](../execution-directives/handleRejections.html) directive which provides a nicer DSL for building rejection handlers.

Transforms rejections from the inner route with an `immutable.Seq[Rejection] => RouteResult` function. a `Function<Iterable<Rejection>, RouteResult>`. A [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") is either a `Complete(HttpResponse(...))` `Complete` containing the [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") or a `Rejected(rejections)`. `Rejected` containing the rejections.

Note
To learn more about how and why rejections work read the [Rejections](../../rejections.html) section of the documentation.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L424-L465 "Go to snippet source")val authRejectionsToNothingToSeeHere = recoverRejections { rejections =>
  if (rejections.exists(_.isInstanceOf[AuthenticationFailedRejection]))
    Complete(HttpResponse(entity = "Nothing to see here, move along."))
  else if (rejections == Nil) // see "Empty Rejections" for more details
    Complete(HttpResponse(StatusCodes.NotFound, entity = "Literally nothing to see here."))
  else
    Rejected(rejections)
}
val neverAuth: Authenticator[String] = creds => None
val alwaysAuth: Authenticator[String] = creds => Some("id")

val route =
  authRejectionsToNothingToSeeHere {
    pathPrefix("auth") {
      concat(
        path("never") {
          authenticateBasic("my-realm", neverAuth) { user =>
            complete("Welcome to the bat-cave!")
          }
        },
        path("always") {
          authenticateBasic("my-realm", alwaysAuth) { user =>
            complete("Welcome to the secret place!")
          }
        }
      )
    }
  }

// tests:
Get("/auth/never") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Nothing to see here, move along."
}
Get("/auth/always") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Welcome to the secret place!"
}
Get("/auth/does_not_exist") ~> route ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Literally nothing to see here."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L196-L674 "Go to snippet source")import akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials;

import static akka.http.javadsl.server.Directives.authenticateBasic;
import static akka.http.javadsl.server.Directives.recoverRejections;

final Function<Optional<ProvidedCredentials>, Optional<Object>> neverAuth =
  creds -> Optional.empty();
final Function<Optional<ProvidedCredentials>, Optional<Object>> alwaysAuth =
  creds -> Optional.of("id");

final Route originalRoute = pathPrefix("auth", () ->
  Directives.concat(
    path("never", () ->
      authenticateBasic("my-realm", neverAuth, obj ->  complete("Welcome to the bat-cave!"))
    ),
    path("always", () ->
      authenticateBasic("my-realm", alwaysAuth, obj -> complete("Welcome to the secret place!"))
    )
  )
);

final Function<Iterable<Rejection>, Boolean> existsAuthenticationFailedRejection =
  rejections ->
    StreamSupport.stream(rejections.spliterator(), false)
      .anyMatch(r -> r instanceof AuthenticationFailedRejection);

final Route route = recoverRejections(rejections -> {
  if (existsAuthenticationFailedRejection.apply(rejections)) {
    return RouteResults.complete(
      HttpResponse.create().withEntity("Nothing to see here, move along."));
  } else if (!rejections.iterator().hasNext()) { // see "Empty Rejections" for more details
    return RouteResults.complete(
        HttpResponse.create().withStatus(StatusCodes.NOT_FOUND)
          .withEntity("Literally nothing to see here."));
  } else {
    return RouteResults.rejected(rejections);
  }
}, () -> originalRoute);

// tests:
testRoute(route).run(HttpRequest.GET("/auth/never"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("Nothing to see here, move along.");
testRoute(route).run(HttpRequest.GET("/auth/always"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("Welcome to the secret place!");
testRoute(route).run(HttpRequest.GET("/auth/does_not_exist"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Literally nothing to see here.");
```

## Code Examples

### Example 1: Signature

```scala
def recoverRejections(f: immutable.Seq[Rejection] => RouteResult): Directive0
```

### Example 2: Example

```scala
val authRejectionsToNothingToSeeHere = recoverRejections { rejections =>
  if (rejections.exists(_.isInstanceOf[AuthenticationFailedRejection]))
    Complete(HttpResponse(entity = "Nothing to see here, move along."))
  else if (rejections == Nil) // see "Empty Rejections" for more details
    Complete(HttpResponse(StatusCodes.NotFound, entity = "Literally nothing to see here."))
  else
    Rejected(rejections)
}
val neverAuth: Authenticator[String] = creds => None
val alwaysAuth: Authenticator[String] = creds => Some("id")

val route =
  authRejectionsToNothingToSeeHere {
    pathPrefix("auth") {
      concat(
        path("never") {
          authenticateBasic("my-realm", neverAuth) { user =>
            complete("Welcome to the bat-cave!")
          }
        },
        path("always") {
          authenticateBasic("my-realm", alwaysAuth) { user =>
            complete("Welcome to the secret place!")
          }
        }
      )
    }
  }

// tests:
Get("/auth/never") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Nothing to see here, move along."
}
Get("/auth/always") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Welcome to the secret place!"
}
Get("/auth/does_not_exist") ~> route ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Literally nothing to see here."
}
```

### Example 3: Example

```java
import akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials;

import static akka.http.javadsl.server.Directives.authenticateBasic;
import static akka.http.javadsl.server.Directives.recoverRejections;

final Function<Optional<ProvidedCredentials>, Optional<Object>> neverAuth =
  creds -> Optional.empty();
final Function<Optional<ProvidedCredentials>, Optional<Object>> alwaysAuth =
  creds -> Optional.of("id");

final Route originalRoute = pathPrefix("auth", () ->
  Directives.concat(
    path("never", () ->
      authenticateBasic("my-realm", neverAuth, obj ->  complete("Welcome to the bat-cave!"))
    ),
    path("always", () ->
      authenticateBasic("my-realm", alwaysAuth, obj -> complete("Welcome to the secret place!"))
    )
  )
);

final Function<Iterable<Rejection>, Boolean> existsAuthenticationFailedRejection =
  rejections ->
    StreamSupport.stream(rejections.spliterator(), false)
      .anyMatch(r -> r instanceof AuthenticationFailedRejection);

final Route route = recoverRejections(rejections -> {
  if (existsAuthenticationFailedRejection.apply(rejections)) {
    return RouteResults.complete(
      HttpResponse.create().withEntity("Nothing to see here, move along."));
  } else if (!rejections.iterator().hasNext()) { // see "Empty Rejections" for more details
    return RouteResults.complete(
        HttpResponse.create().withStatus(StatusCodes.NOT_FOUND)
          .withEntity("Literally nothing to see here."));
  } else {
    return RouteResults.rejected(rejections);
  }
}, () -> originalRoute);

// tests:
testRoute(route).run(HttpRequest.GET("/auth/never"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("Nothing to see here, move along.");
testRoute(route).run(HttpRequest.GET("/auth/always"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("Welcome to the secret place!");
testRoute(route).run(HttpRequest.GET("/auth/does_not_exist"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Literally nothing to see here.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/provide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejectionsWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejections.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejections.html)*
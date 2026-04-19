---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/complete.html
title: complete • Akka HTTP
---

# complete • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# complete

## Signature

```
def complete[T :ToResponseMarshaller](value: T): StandardRoute
def complete(response: HttpResponse): StandardRoute
def complete(status: StatusCode): StandardRoute
def complete[T :Marshaller](status: StatusCode, value: T): StandardRoute
def complete[T :Marshaller](status: Int, value: T): StandardRoute
def complete[T :Marshaller](status: StatusCode, headers: Seq[HttpHeader], value: T): StandardRoute
def complete[T :Marshaller](status: Int, headers: Seq[HttpHeader], value: T): StandardRoute

```

The signature shown is simplified, the real signature uses magnets. [\[1]](#1)

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

Completes the request using the given argument(s).

`complete` uses the given arguments to construct a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") which simply calls `complete` on the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") with the respective [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") instance. Completing the request will send the response “back up” the route structure where all the logic runs that wrapping directives have potentially chained into the [RouteResult](../../routes.html#routeresult) future transformation chain.

Please note that the `complete` directive has multiple variants, like the ones shown in the examples.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RouteDirectivesExamplesSpec.scala#L14-L103 "Go to snippet source")import akka.http.scaladsl.model._
import akka.http.scaladsl.model.ContentTypes._
import akka.http.scaladsl.model.headers.`Access-Control-Allow-Origin`

val route =
  concat(
    path("a") {
      complete(HttpResponse(entity = "foo"))
    },
    path("b") {
      complete(StatusCodes.OK)
    },
    path("c") {
      complete(StatusCodes.Created -> "bar")
    },
    path("d") {
      complete(201 -> "bar")
    },
    path("e") {
      complete(StatusCodes.Created, List(`Access-Control-Allow-Origin`.`*`), "bar")
    },
    path("f") {
      complete(201, List(`Access-Control-Allow-Origin`.`*`), "bar")
    },
    path("g") {
      complete(Future { StatusCodes.Created -> "bar" })
    },
    (path("h") & complete("baz")) // `&` also works with `complete` as the 2nd argument
  )

// tests:
Get("/a") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "foo"
}

Get("/b") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

Get("/c") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  responseAs[String] shouldEqual "bar"
}

Get("/d") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  responseAs[String] shouldEqual "bar"
}

Get("/e") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  header[`Access-Control-Allow-Origin`] shouldEqual Some(`Access-Control-Allow-Origin`.`*`)
  responseAs[String] shouldEqual "bar"
}

Get("/f") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  header[`Access-Control-Allow-Origin`] shouldEqual Some(`Access-Control-Allow-Origin`.`*`)
  responseAs[String] shouldEqual "bar"
}

Get("/g") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  responseAs[String] shouldEqual "bar"
}

Get("/h") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "baz"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RouteDirectivesExamplesTest.java#L22-L110 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;

final Route route = concat(
  path("a", () -> complete(HttpResponse.create().withEntity("foo"))),
  path("b", () -> complete(StatusCodes.OK)),
  path("c", () -> complete(StatusCodes.CREATED, "bar")),
  path("d", () -> complete(StatusCodes.get(201), "bar")),
  path("e", () ->
    complete(StatusCodes.CREATED,
             Collections.singletonList(ContentType.create(ContentTypes.TEXT_PLAIN_UTF8)),
             HttpEntities.create("bar"))),
  path("f", () ->
    complete(StatusCodes.get(201),
             Collections.singletonList(ContentType.create(ContentTypes.TEXT_PLAIN_UTF8)),
             HttpEntities.create("bar"))),
  path("g", () -> complete("baz"))
);

// tests:
testRoute(route).run(HttpRequest.GET("/a"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("foo");

testRoute(route).run(HttpRequest.GET("/b"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");

testRoute(route).run(HttpRequest.GET("/c"))
  .assertStatusCode(StatusCodes.CREATED)
  .assertEntity("bar");

testRoute(route).run(HttpRequest.GET("/d"))
  .assertStatusCode(StatusCodes.CREATED)
  .assertEntity("bar");

testRoute(route).run(HttpRequest.GET("/e"))
  .assertStatusCode(StatusCodes.CREATED)
  .assertHeaderExists(ContentType.create(ContentTypes.TEXT_PLAIN_UTF8))
  .assertEntity("bar");

testRoute(route).run(HttpRequest.GET("/f"))
  .assertStatusCode(StatusCodes.CREATED)
  .assertHeaderExists(ContentType.create(ContentTypes.TEXT_PLAIN_UTF8))
  .assertEntity("bar");

testRoute(route).run(HttpRequest.GET("/g"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("baz");
```

## Code Examples

### Example 1: Signature

```scala
def complete[T :ToResponseMarshaller](value: T): StandardRoute
def complete(response: HttpResponse): StandardRoute
def complete(status: StatusCode): StandardRoute
def complete[T :Marshaller](status: StatusCode, value: T): StandardRoute
def complete[T :Marshaller](status: Int, value: T): StandardRoute
def complete[T :Marshaller](status: StatusCode, headers: Seq[HttpHeader], value: T): StandardRoute
def complete[T :Marshaller](status: Int, headers: Seq[HttpHeader], value: T): StandardRoute
```

### Example 2: Example

```scala
import akka.http.scaladsl.model._
import akka.http.scaladsl.model.ContentTypes._
import akka.http.scaladsl.model.headers.`Access-Control-Allow-Origin`

val route =
  concat(
    path("a") {
      complete(HttpResponse(entity = "foo"))
    },
    path("b") {
      complete(StatusCodes.OK)
    },
    path("c") {
      complete(StatusCodes.Created -> "bar")
    },
    path("d") {
      complete(201 -> "bar")
    },
    path("e") {
      complete(StatusCodes.Created, List(`Access-Control-Allow-Origin`.`*`), "bar")
    },
    path("f") {
      complete(201, List(`Access-Control-Allow-Origin`.`*`), "bar")
    },
    path("g") {
      complete(Future { StatusCodes.Created -> "bar" })
    },
    (path("h") & complete("baz")) // `&` also works with `complete` as the 2nd argument
  )

// tests:
Get("/a") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "foo"
}

Get("/b") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "OK"
}

Get("/c") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  responseAs[String] shouldEqual "bar"
}

Get("/d") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  responseAs[String] shouldEqual "bar"
}

Get("/e") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  header[`Access-Control-Allow-Origin`] shouldEqual Some(`Access-Control-Allow-Origin`.`*`)
  responseAs[String] shouldEqual "bar"
}

Get("/f") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  header[`Access-Control-Allow-Origin`] shouldEqual Some(`Access-Control-Allow-Origin`.`*`)
  responseAs[String] shouldEqual "bar"
}

Get("/g") ~> route ~> check {
  status shouldEqual StatusCodes.Created
  responseAs[String] shouldEqual "bar"
}

Get("/h") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "baz"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;

final Route route = concat(
  path("a", () -> complete(HttpResponse.create().withEntity("foo"))),
  path("b", () -> complete(StatusCodes.OK)),
  path("c", () -> complete(StatusCodes.CREATED, "bar")),
  path("d", () -> complete(StatusCodes.get(201), "bar")),
  path("e", () ->
    complete(StatusCodes.CREATED,
             Collections.singletonList(ContentType.create(ContentTypes.TEXT_PLAIN_UTF8)),
             HttpEntities.create("bar"))),
  path("f", () ->
    complete(StatusCodes.get(201),
             Collections.singletonList(ContentType.create(ContentTypes.TEXT_PLAIN_UTF8)),
             HttpEntities.create("bar"))),
  path("g", () -> complete("baz"))
);

// tests:
testRoute(route).run(HttpRequest.GET("/a"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("foo");

testRoute(route).run(HttpRequest.GET("/b"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("OK");

testRoute(route).run(HttpRequest.GET("/c"))
  .assertStatusCode(StatusCodes.CREATED)
  .assertEntity("bar");

testRoute(route).run(HttpRequest.GET("/d"))
  .assertStatusCode(StatusCodes.CREATED)
  .assertEntity("bar");

testRoute(route).run(HttpRequest.GET("/e"))
  .assertStatusCode(StatusCodes.CREATED)
  .assertHeaderExists(ContentType.create(ContentTypes.TEXT_PLAIN_UTF8))
  .assertEntity("bar");

testRoute(route).run(HttpRequest.GET("/f"))
  .assertStatusCode(StatusCodes.CREATED)
  .assertHeaderExists(ContentType.create(ContentTypes.TEXT_PLAIN_UTF8))
  .assertEntity("bar");

testRoute(route).run(HttpRequest.GET("/g"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("baz");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/failWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/complete.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/complete.html)*
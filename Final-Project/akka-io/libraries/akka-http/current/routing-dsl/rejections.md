---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html
title: Rejections • Akka HTTP
---

# Rejections • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Rejections

In the chapter about constructing [Routes](routes.html) the `~` operator`RouteDirectives.route()` method was introduced, which connects two or more routes in a way that allows the next specified route to get a go at a request if the first route “rejected” it. The concept of “rejections” is used by Akka HTTP for maintaining a more functional overall architecture and in order to be able to properly handle all kinds of error scenarios.

When a filtering directive, like the [get](directives/method-directives/get.html) directive, cannot let the request pass through to its inner route because the filter condition is not satisfied (e.g. because the incoming request is not a GET request) the directive doesn’t immediately complete the request with an error response. Doing so would make it impossible for other routes chained in after the failing filter to get a chance to handle the request. Rather, failing filters “reject” the request in the same way as by explicitly calling `requestContext.reject(...)`.

After having been rejected by a route the request will continue to flow through the routing structure and possibly find another route that can complete it. If there are more rejections all of them will be picked up and collected.

If the request cannot be completed by (a branch of) the route structure an enclosing [handleRejections](directives/execution-directives/handleRejections.html) directive can be used to convert a set of rejections into an [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") \- which typically would be an error response. `Route.seal()` internally wraps its argument route with the [handleRejections](directives/execution-directives/handleRejections.html) directive in order to “catch” and handle any rejection.

## Predefined Rejections

A rejection encapsulates a specific reason why a route was not able to handle a request. It is modeled as an object of type [`Rejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html "akka.http.javadsl.server.Rejection")[`Rejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html "akka.http.scaladsl.server.Rejection"). Akka HTTP comes with a set of [`predefined rejections`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html "akka.http.scaladsl.server.Rejection")[`predefined rejections`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejections.html "akka.http.javadsl.server.Rejections"), which are used by the many [predefined directives](directives/alphabetically.html).

Rejections are gathered up over the course of a Route evaluation and finally converted to [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") replies by the [handleRejections](directives/execution-directives/handleRejections.html) directive if there was no way for the request to be completed.

## The RejectionHandler

The [handleRejections](directives/execution-directives/handleRejections.html) directive delegates the actual job of converting a list of rejections to the provided [`RejectionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html "akka.http.scaladsl.server.RejectionHandler")[`RejectionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html "akka.http.javadsl.server.RejectionHandler"), so it can choose whether it would like to handle the current set of rejections or not. Unhandled rejections will simply continue to flow through the route structure.

The default `RejectionHandler` applied by the top\-level glue code that turns a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") into a [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") or async handler function for the [low\-level API](../server-side/low-level-api.html) (via `Route.toFlow` or `Route.toFunction`) will handle *all* rejections that reach it.

Note
Please note that since version `10.1.2`, the default `RejectionHandler` will also discard the entity bytes automatically. If you want to change this behavior, please refer to [Customising rejection HTTP Responses](rejections.html#customising-rejections); however, might cause connections to stall if the entity is not properly rejected or cancelled on the client side.

## Rejection Cancellation

As mentioned above, the `RejectionHandler` doesn’t handle single rejections but a whole list of them. This is because some route structure produce several “reasons” why a request could not be handled.

Take this route structure for example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/RejectionHandlerExamplesSpec.scala#L78-L92 "Go to snippet source")import akka.http.scaladsl.coding.Coders

val route =
  path("order") {
    concat(
      get {
        complete("Received GET")
      },
      post {
        decodeRequestWith(Coders.Gzip) {
          complete("Received compressed POST")
        }
      }
    )
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/RejectionHandlerExamplesTest.java#L24-L62 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.decodeRequestWith;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.post;
final Route route = path("order", () ->
  concat(
    get(() ->
      complete("Received GET")
    ),
    post(() ->
      decodeRequestWith(Coder.Gzip, () ->
        complete("Received compressed POST")
      )
    )
  ));
```

For uncompressed POST requests this route structure would initially yield two rejections:

- a [`MethodRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html "akka.http.javadsl.server.MethodRejection")[`MethodRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html "akka.http.scaladsl.server.MethodRejection") produced by the [get](directives/method-directives/get.html) directive (which rejected because the request is not a GET request)
- an [`UnsupportedRequestEncodingRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html "akka.http.javadsl.server.UnsupportedRequestEncodingRejection")[`UnsupportedRequestEncodingRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html "akka.http.scaladsl.server.UnsupportedRequestEncodingRejection") produced by the [decodeRequestWith](directives/coding-directives/decodeRequestWith.html) directive (which only accepts gzip\-compressed requests here)

In reality the route even generates one more rejection, a [`TransformationRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html "akka.http.javadsl.server.TransformationRejection")[`TransformationRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html "akka.http.scaladsl.server.TransformationRejection") produced by the [post](directives/method-directives/post.html) directive. It “cancels” all other potentially existing *MethodRejections*, since they are invalid after the [post](directives/method-directives/post.html) directive allowed the request to pass (after all, the route structure *can* deal with POST requests). These types of rejection cancellations are resolved *before* a `RejectionHandler` is called with any rejection. So, for the example above the `RejectionHandler` will be presented with only one single rejection, the [`UnsupportedRequestEncodingRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html "akka.http.javadsl.server.UnsupportedRequestEncodingRejection")[`UnsupportedRequestEncodingRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html "akka.http.scaladsl.server.UnsupportedRequestEncodingRejection").

## Empty Rejections

Internally rejections are stored in an immutable list, so you might ask yourself what the semantics of an empty rejection list are. In fact, empty rejection lists have well defined semantics. They signal that a request was not handled because the respective resource could not be found. Akka HTTP reserves the special status of “empty rejection” to this most common failure a service is likely to produce.

So, for example, if the [path](directives/path-directives/path.html) directive rejects a request it does so with an empty rejection list. The [host](directives/host-directives/host.html) directive behaves in the same way.

## Customizing Rejection Handling

If you’d like to customize the way certain rejections are handled you’ll have to write a custom [RejectionHandler](#the-rejectionhandler). Here is an example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/RejectionHandlerExamplesSpec.scala#L15-L52 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server._
import StatusCodes._
import Directives._

object MyApp extends App {
  def myRejectionHandler =
    RejectionHandler.newBuilder()
      .handle {
        case MissingCookieRejection(cookieName) =>
          complete(HttpResponse(BadRequest, entity = "No cookies, no service!!!"))
      }
      .handle {
        case AuthorizationFailedRejection =>
          complete(Forbidden, "You're out of your depth!")
      }
      .handle {
        case ValidationRejection(msg, _) =>
          complete(InternalServerError, "That wasn't valid! " + msg)
      }
      .handleAll[MethodRejection] { methodRejections =>
        val names = methodRejections.map(_.supported.name)
        complete(MethodNotAllowed, s"Can't do that! Supported: ${names mkString " or "}!")
      }
      .handleNotFound { complete((NotFound, "Not here!")) }
      .result()

  implicit val system: ActorSystem = ActorSystem()

  val route: Route = handleRejections(myRejectionHandler) {
    // ... some route structure
  }

  Http().newServerAt("localhost", 8080).bind(route)
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/RejectionHandlerExamplesTest.java#L31-L89 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.handleRejections;

final RejectionHandler rejectionHandler = RejectionHandler.newBuilder()
  .handle(MissingCookieRejection.class, rej ->
    complete(StatusCodes.BAD_REQUEST, "No cookies, no service!!!")
  )
  .handle(AuthorizationFailedRejection.class, rej ->
    complete(StatusCodes.FORBIDDEN, "You're out of your depth!")
  )
  .handle(ValidationRejection.class, rej ->
    complete(StatusCodes.INTERNAL_SERVER_ERROR, "That wasn't valid! " + rej.message())
  )
  .handleAll(MethodRejection.class, rejections -> {
    String supported = rejections.stream()
      .map(rej -> rej.supported().name())
      .collect(Collectors.joining(" or "));
    return complete(StatusCodes.METHOD_NOT_ALLOWED, "Can't do that! Supported: " + supported + "!");
  })
  .handleNotFound(complete(StatusCodes.NOT_FOUND, "Not here!"))
  .build();

// Route that will be bound to the Http
final Route wrapped = handleRejections(rejectionHandler,
  this::getRoute); // Some route structure for this Server
```

The easiest way to construct a `RejectionHandler` is with `RejectionHandler.newBuilder()` that Akka HTTP provides. After having created a new `Builder` instance you can attach handling logic for certain types of rejections through three helper methods:

handle(PartialFunction\[Rejection, Route])handle(Class, Function\<T, Route\>)

Handles the provided type of rejections with the given function. The provided function simply produces a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") which is run when the rejection is “caught”. This makes the full power of the Routing DSL available for defining rejection handlers and even allows for recursing back into the main route structure if required.
handleAll\[T \<: Rejection: ClassTag](f: immutable.Seq\[T] \=\> Route)handleAll(Class, Function\<List, Route\>)

Handles all rejections of a certain type at the same time. This is useful for cases where your need access to more than the first rejection of a certain type, e.g. for producing the error message to an unsupported request method.
handleNotFound(Route)
 
As described [above](#empty-rejections) “Resource Not Found” is special as it is represented with an empty rejection set. The `handleNotFound` helper let’s you specify the “recovery route” for this case.

Even though you could handle several different rejection types in a single partial function supplied to `handle` by “listening” to the `Rejection.class`, it is recommended to split these up into distinct `handle` attachments instead. This way the priority between rejections is properly defined via the order of your `handle` clauses rather than the (sometimes hard to predict or control) order of rejections in the rejection set.

Once you have defined your custom `RejectionHandler` you have two options for “activating” it:

1. Bring it into implicit scope at the top\-levelPass it to the `seal()` method of the [`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") class
2. Supply it as an argument to the [handleRejections](directives/execution-directives/handleRejections.html) directive

In the first case your handler will be “sealed” (which means that it will receive the default handler as a fallback for all cases your handler doesn’t handle itself) and used for all rejections that are not handled within the route structure itself.

The second case allows you to restrict the applicability of your handler to certain branches of your route structure.

### Customising rejection HTTP Responses

It is also possible to customise just the responses that are returned by a defined rejection handler. This can be useful for example if you like the rejection messages and status codes of the default handler, however you’d like to wrap those responses in JSON or some other content type.

Please note that since those are not 200 responses, a different content type than the one that was sent in a client’s [`Accept`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Accept.html "akka.http.javadsl.model.headers.Accept")[`Accept`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html "akka.http.scaladsl.model.headers.Accept") header *is* legal. Thus the default handler renders such rejections as `text/plain`.

In order to customise the HTTP Responses of an existing handler you can call the `mapRejectionResponse` method on such handler as shown in the example below:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/RejectionHandlerExamplesSpec.scala#L98-L163 "Go to snippet source")import akka.http.scaladsl.model._
import akka.http.scaladsl.server.RejectionHandler

implicit def myRejectionHandler: RejectionHandler =
  RejectionHandler.default
    .mapRejectionResponse {
      case res @ HttpResponse(_, _, ent: HttpEntity.Strict, _) =>
        // since all Akka default rejection responses are Strict this will handle all rejections
        val message = ent.data.utf8String.replaceAll("\"", """\"""")

        // we copy the response in order to keep all headers and status code, wrapping the message as hand rolled JSON
        // you could the entity using your favourite marshalling library (e.g. spray json or anything else)
        res.withEntity(HttpEntity(ContentTypes.`application/json`, s"""{"rejection": "$message"}"""))

      case x => x // pass through all other types of responses
    }

val route =
  Route.seal(
    path("hello") {
      complete("Hello there")
    }
  )

// tests:
Get("/nope") ~> route ~> check {
  status shouldEqual StatusCodes.NotFound
  contentType shouldEqual ContentTypes.`application/json`
  responseAs[String] shouldEqual """{"rejection": "The requested resource could not be found."}"""
}

val anotherRoute =
  Route.seal(
    validate(check = false, "Whoops, bad request!") {
      complete("Hello there")
    }
  )

// tests:
Get("/hello") ~> anotherRoute ~> check {
  status shouldEqual StatusCodes.BadRequest
  contentType shouldEqual ContentTypes.`application/json`
  responseAs[String] shouldEqual """{"rejection": "Whoops, bad request!"}"""
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/RejectionHandlerExamplesTest.java#L37-L139 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.handleRejections;
import static akka.http.javadsl.server.Directives.validate;

final RejectionHandler rejectionHandler = RejectionHandler.defaultHandler()
  .mapRejectionResponse(response -> {
    if (response.entity() instanceof HttpEntity.Strict) {
      // since all Akka default rejection responses are Strict this will handle all rejections
      String message = ((HttpEntity.Strict) response.entity()).getData().utf8String()
        .replaceAll("\"", "\\\"");
      // we create a new copy the response in order to keep all headers and status code,
      // replacing the original entity with a custom message as hand rolled JSON you could the
      // entity using your favourite marshalling library (e.g. spray json or anything else)
      return response.withEntity(ContentTypes.APPLICATION_JSON,
        "{\"rejection\": \"" + message + "\"}");
    } else {
      // pass through all other types of responses
      return response;
    }
  });

Route route = handleRejections(rejectionHandler, () ->
  path("hello", () ->
    complete("Hello there")
  ));

// tests:
testRoute(route)
  .run(HttpRequest.GET("/nope"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertContentType(ContentTypes.APPLICATION_JSON)
  .assertEntity("{\"rejection\": \"The requested resource could not be found.\"}");

Route anotherOne = handleRejections(rejectionHandler, () ->
  validate(() -> false, "Whoops, bad request!", () ->
    complete("Hello there")
));

// tests:
testRoute(anotherOne)
  .run(HttpRequest.GET("/hello"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertContentType(ContentTypes.APPLICATION_JSON)
  .assertEntity("{\"rejection\": \"Whoops, bad request!\"}");
```

#### Adding the unmatched route in handleNotFound

Since rejection handlers are routes themselves, it is possible to do anything you could possibly want inside such handler. For example you may want to include the path which was not found in the response to the client, this is as simple as using the `extractUnmatchedPath` and completing the route with it.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/RejectionHandlerExamplesSpec.scala#L59-L70 "Go to snippet source")import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server._
import Directives._

implicit def myRejectionHandler: RejectionHandler =
  RejectionHandler.newBuilder()
    .handleNotFound {
      extractUnmatchedPath { p =>
        complete(NotFound, s"The path you requested [${p}] does not exist.")
      }
    }
    .result()
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ExecutionDirectivesExamplesTest.java#L36-L131 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractUnmatchedPath;
import static akka.http.javadsl.server.Directives.handleRejections;
import static akka.http.javadsl.server.Directives.reject;

final RejectionHandler totallyMissingHandler = RejectionHandler.newBuilder()
  .handleNotFound(
    extractUnmatchedPath(path ->
      complete(StatusCodes.NOT_FOUND, "The path " + path + " was not found!")
    )
  )
  .build();

final Route route = 
  handleRejections(totallyMissingHandler, () ->
  pathPrefix("handled", () ->
    Directives.concat(
      path("existing", () -> complete("This path exists"))
    )
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/handled/existing"))
  .assertEntity("This path exists");
// applies default handler
testRoute(route).run(HttpRequest.GET("/missing"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The path /missing was not found!");
testRoute(route).run(HttpRequest.GET("/handled/missing"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The path /handled/missing was not found!");
```

If you want to add even more information you can obtain the full request by using `extractRequest` as well.

## Code Examples

### Example 1: Rejection Cancellation

```scala
import akka.http.scaladsl.coding.Coders

val route =
  path("order") {
    concat(
      get {
        complete("Received GET")
      },
      post {
        decodeRequestWith(Coders.Gzip) {
          complete("Received compressed POST")
        }
      }
    )
  }
```

### Example 2: Rejection Cancellation

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.decodeRequestWith;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.post;
final Route route = path("order", () ->
  concat(
    get(() ->
      complete("Received GET")
    ),
    post(() ->
      decodeRequestWith(Coder.Gzip, () ->
        complete("Received compressed POST")
      )
    )
  ));
```

### Example 3: Customizing Rejection Handling

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server._
import StatusCodes._
import Directives._

object MyApp extends App {
  def myRejectionHandler =
    RejectionHandler.newBuilder()
      .handle {
        case MissingCookieRejection(cookieName) =>
          complete(HttpResponse(BadRequest, entity = "No cookies, no service!!!"))
      }
      .handle {
        case AuthorizationFailedRejection =>
          complete(Forbidden, "You're out of your depth!")
      }
      .handle {
        case ValidationRejection(msg, _) =>
          complete(InternalServerError, "That wasn't valid! " + msg)
      }
      .handleAll[MethodRejection] { methodRejections =>
        val names = methodRejections.map(_.supported.name)
        complete(MethodNotAllowed, s"Can't do that! Supported: ${names mkString " or "}!")
      }
      .handleNotFound { complete((NotFound, "Not here!")) }
      .result()

  implicit val system: ActorSystem = ActorSystem()

  val route: Route = handleRejections(myRejectionHandler) {
    // ... some route structure
  }

  Http().newServerAt("localhost", 8080).bind(route)
}
```

### Example 4: Customizing Rejection Handling

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.handleRejections;

final RejectionHandler rejectionHandler = RejectionHandler.newBuilder()
  .handle(MissingCookieRejection.class, rej ->
    complete(StatusCodes.BAD_REQUEST, "No cookies, no service!!!")
  )
  .handle(AuthorizationFailedRejection.class, rej ->
    complete(StatusCodes.FORBIDDEN, "You're out of your depth!")
  )
  .handle(ValidationRejection.class, rej ->
    complete(StatusCodes.INTERNAL_SERVER_ERROR, "That wasn't valid! " + rej.message())
  )
  .handleAll(MethodRejection.class, rejections -> {
    String supported = rejections.stream()
      .map(rej -> rej.supported().name())
      .collect(Collectors.joining(" or "));
    return complete(StatusCodes.METHOD_NOT_ALLOWED, "Can't do that! Supported: " + supported + "!");
  })
  .handleNotFound(complete(StatusCodes.NOT_FOUND, "Not here!"))
  .build();

// Route that will be bound to the Http
final Route wrapped = handleRejections(rejectionHandler,
  this::getRoute); // Some route structure for this Server
```

### Example 5: Customising rejection HTTP Responses

```scala
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.RejectionHandler

implicit def myRejectionHandler: RejectionHandler =
  RejectionHandler.default
    .mapRejectionResponse {
      case res @ HttpResponse(_, _, ent: HttpEntity.Strict, _) =>
        // since all Akka default rejection responses are Strict this will handle all rejections
        val message = ent.data.utf8String.replaceAll("\"", """\"""")

        // we copy the response in order to keep all headers and status code, wrapping the message as hand rolled JSON
        // you could the entity using your favourite marshalling library (e.g. spray json or anything else)
        res.withEntity(HttpEntity(ContentTypes.`application/json`, s"""{"rejection": "$message"}"""))

      case x => x // pass through all other types of responses
    }

val route =
  Route.seal(
    path("hello") {
      complete("Hello there")
    }
  )

// tests:
Get("/nope") ~> route ~> check {
  status shouldEqual StatusCodes.NotFound
  contentType shouldEqual ContentTypes.`application/json`
  responseAs[String] shouldEqual """{"rejection": "The requested resource could not be found."}"""
}

val anotherRoute =
  Route.seal(
    validate(check = false, "Whoops, bad request!") {
      complete("Hello there")
    }
  )

// tests:
Get("/hello") ~> anotherRoute ~> check {
  status shouldEqual StatusCodes.BadRequest
  contentType shouldEqual ContentTypes.`application/json`
  responseAs[String] shouldEqual """{"rejection": "Whoops, bad request!"}"""
}
```

### Example 6: Customising rejection HTTP Responses

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.handleRejections;
import static akka.http.javadsl.server.Directives.validate;

final RejectionHandler rejectionHandler = RejectionHandler.defaultHandler()
  .mapRejectionResponse(response -> {
    if (response.entity() instanceof HttpEntity.Strict) {
      // since all Akka default rejection responses are Strict this will handle all rejections
      String message = ((HttpEntity.Strict) response.entity()).getData().utf8String()
        .replaceAll("\"", "\\\"");
      // we create a new copy the response in order to keep all headers and status code,
      // replacing the original entity with a custom message as hand rolled JSON you could the
      // entity using your favourite marshalling library (e.g. spray json or anything else)
      return response.withEntity(ContentTypes.APPLICATION_JSON,
        "{\"rejection\": \"" + message + "\"}");
    } else {
      // pass through all other types of responses
      return response;
    }
  });

Route route = handleRejections(rejectionHandler, () ->
  path("hello", () ->
    complete("Hello there")
  ));

// tests:
testRoute(route)
  .run(HttpRequest.GET("/nope"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertContentType(ContentTypes.APPLICATION_JSON)
  .assertEntity("{\"rejection\": \"The requested resource could not be found.\"}");

Route anotherOne = handleRejections(rejectionHandler, () ->
  validate(() -> false, "Whoops, bad request!", () ->
    complete("Hello there")
));

// tests:
testRoute(anotherOne)
  .run(HttpRequest.GET("/hello"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertContentType(ContentTypes.APPLICATION_JSON)
  .assertEntity("{\"rejection\": \"Whoops, bad request!\"}");
```

### Example 7: Adding the unmatched route in handleNotFound

```scala
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server._
import Directives._

implicit def myRejectionHandler: RejectionHandler =
  RejectionHandler.newBuilder()
    .handleNotFound {
      extractUnmatchedPath { p =>
        complete(NotFound, s"The path you requested [${p}] does not exist.")
      }
    }
    .result()
```

### Example 8: Adding the unmatched route in handleNotFound

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractUnmatchedPath;
import static akka.http.javadsl.server.Directives.handleRejections;
import static akka.http.javadsl.server.Directives.reject;

final RejectionHandler totallyMissingHandler = RejectionHandler.newBuilder()
  .handleNotFound(
    extractUnmatchedPath(path ->
      complete(StatusCodes.NOT_FOUND, "The path " + path + " was not found!")
    )
  )
  .build();

final Route route = 
  handleRejections(totallyMissingHandler, () ->
  pathPrefix("handled", () ->
    Directives.concat(
      path("existing", () -> complete("This path exists"))
    )
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/handled/existing"))
  .assertEntity("This path exists");
// applies default handler
testRoute(route).run(HttpRequest.GET("/missing"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The path /missing was not found!");
testRoute(route).run(HttpRequest.GET("/handled/missing"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The path /handled/missing was not found!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Accept.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejections.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequestWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/host.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/get.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/post.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/path.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html
- https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html)*
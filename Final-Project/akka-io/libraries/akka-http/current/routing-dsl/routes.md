---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html
title: Routes • Akka HTTP
---

# Routes • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Routes

The “Route” is the central concept of Akka HTTP’s Routing DSL. All the structures you build with the DSL, no matter whether they consists of a single line or span several hundred lines, are `type``function` turning a [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") into a `Future[RouteResult]``CompletionStage<RouteResult>`.

```
type Route = RequestContext => Future[RouteResult]

```

It’s a simple alias for a function turning a [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") into a `Future[RouteResult]`.

A [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") itself is a function that operates on a [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") and returns a [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult"). The [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") is a data structure that contains the current request and auxiliary data like the so far unmatched path of the request URI that gets passed through the route structure. It also contains the current `ExecutionContext` and [`Materializer`](https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer"), so that these don’t have to be passed around manually.

Generally when a route receives a request (or rather a [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") for it) it can do one of these things:

- Complete the request by returning the value of `requestContext.complete(...)`
- Reject the request by returning the value of `requestContext.reject(...)` (see [Rejections](rejections.html#rejections))
- Fail the request by returning the value of `requestContext.fail(...)` or by just throwing an exception (see [Exception Handling](exception-handling.html#exception-handling))
- Do any kind of asynchronous processing and instantly return a `Future[RouteResult]``CompletionStage<RouteResult>` to be eventually completed later

The first case is pretty clear, by calling `complete` a given response is sent to the client as reaction to the request. In the second case “reject” means that the route does not want to handle the request. You’ll see further down in the section about route composition what this is good for.

A [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") can be “sealed” using `Route.seal`, which relies on the in\-scope `RejectionHandler` and [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") instances to convert rejections and exceptions into appropriate HTTP responses for the client. [Sealing a Route](routes.html#sealing-a-route) is described more in detail later. 

Using `Route.toFlow` or `Route.toFunction` a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") can be lifted into a handler [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") or async handler function to be used with a `bindAndHandleXXX` call from the [Core Server API](../server-side/low-level-api.html).

Note: There is also an implicit conversion from [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") to [`Flow<HttpRequest, HttpResponse, Unit>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[HttpRequest, HttpResponse, Unit]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") defined in the [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") companion, which relies on `Route.toFlow`.

## RequestContext

The request context wraps an [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") instance to enrich it with additional information that are typically required by the routing logic, like an `ExecutionContext`, [`Materializer`](https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer"), [`LoggingAdapter`](https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") and the configured [`RoutingSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html "akka.http.javadsl.settings.RoutingSettings")[`RoutingSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html "akka.http.scaladsl.settings.RoutingSettings"). It also contains the `unmatchedPath`, a value that describes how much of the request URI has not yet been matched by a [Path Directive](directives/path-directives/index.html#pathdirectives).

The [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") itself is immutable but contains several helper methods which allow for convenient creation of modified copies.

## RouteResult

[`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") is a simple algebraic data type (ADT) that models the possible non\-error results of a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route"). It is defined as such:

```
sealed trait RouteResult

object RouteResult {
  final case class Complete(response: HttpResponse) extends RouteResult
  final case class Rejected(rejections: immutable.Seq[Rejection]) extends RouteResult
}

```

Usually you don’t create any [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") instances yourself, but rather rely on the pre\-defined [RouteDirectives](directives/route-directives/index.html#routedirectives) (like [complete](directives/route-directives/complete.html#complete), [reject](directives/route-directives/reject.html#reject) or [redirect](directives/route-directives/redirect.html#redirect)) or the respective methods on the [RequestContext](#requestcontext) instead.

## Composing Routes

There are three basic operations we need for building more complex routes from simpler ones:

- Route transformation, which delegates processing to another, “inner” route but in the process changes some properties of either the incoming request, the outgoing response or both
- Route filtering, which only lets requests satisfying a given filter condition pass and rejects all others
- Route chaining, which tries a second route if a given first one was rejected

The first two points are provided by so\-called [Directives](directives/index.html#directives) of which a large number is already predefined by Akka HTTP and is extensible with user code.

The last point is achieved with the `concat` method.

[Directives](directives/index.html#directives) deliver most of Akka HTTP’s power and flexibility.

## The Routing Tree

Essentially, when you combine directives and custom routes via the `concat` method, you build a routing structure that forms a tree. When a request comes in it is injected into this tree at the root and flows down through all the branches in a depth\-first manner until either some node completes it or it is fully rejected.

Consider this schematic example:

```
val route =
  a {
    concat(
      b {
        concat(
          c {
            ... // route 1
          },
          d {
            ... // route 2
          },
          ... // route 3
        )
      },
      e {
        ... // route 4
      }
    )
  }

```

```
import static akka.http.javadsl.server.Directives.*;

Route route =
  directiveA(concat(() ->
    directiveB(concat(() ->
      directiveC(
        ... // route 1
      ),
      directiveD(
        ... // route 2
      ),
      ... // route 3
    )),
    directiveE(
      ... // route 4
    )
  ));

```

Here five directives form a routing tree.

- Route 1 will only be reached if directives `a`, `b` and `c` all let the request pass through.
- Route 2 will run if `a` and `b` pass, `c` rejects and `d` passes.
- Route 3 will run if `a` and `b` pass, but `c` and `d` reject.

Route 3 can therefore be seen as a “catch\-all” route that only kicks in, if routes chained into preceding positions reject. This mechanism can make complex filtering logic quite easy to implement: simply put the most specific cases up front and the most general cases in the back.

## Sealing a Route

A sealed route has these properties:

- The result of the route will always be a complete response, i.e. the result of the future is a `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route.
- Consequently, no route alternatives will be tried that were combined with this route.

As described in [Rejections](rejections.html) and [Exception Handling](exception-handling.html), there are generally two ways to handle rejections and exceptions.

- Bring rejection/exception handlers `into implicit scope at the top-level``seal()` method of the [`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route")
- Supply handlers as arguments to [handleRejections](directives/execution-directives/handleRejections.html#handlerejections) and [handleExceptions](directives/execution-directives/handleExceptions.html#handleexceptions) directives

In the first case your handlers will be “sealed”, (which means that it will receive the default handler as a fallback for all cases your handler doesn’t handle itself) and used for all rejections/exceptions that are not handled within the route structure itself.

### Route.seal() method to modify HttpResponse

In application code, unlike [test code](testkit.html#testing-sealed-routes), you don’t need to use the `Route.seal()` method to seal a route. As long as you bring implicit rejection and/or exception handlers to the top\-level scope, your route is sealed. 

However, you can use `Route.seal()` to perform modification on [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse$.html "akka.http.scaladsl.model.HttpResponse") from the route. For example, if you want to add a special header, but still use the default rejection handler, then you can do the following. In the below case, the special header is added to rejected responses which did not match the route, as well as successful responses which matched the route.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/RouteSealExampleSpec.scala#L15-L25 "Go to snippet source")val route = respondWithHeader(RawHeader("special-header", "you always have this even in 404")) {
  Route.seal(
    get {
      pathSingleSlash {
        complete {
          "Captain on the bridge!"
        }
      }
    }
  )
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/RouteSealExample.java#L17-L41 "Go to snippet source")public class RouteSealExample extends AllDirectives {

  public static void main(String [] args) {
    RouteSealExample app = new RouteSealExample();
    app.runServer();
  }

  public void runServer(){
    ActorSystem system = ActorSystem.create();

    Route sealedRoute = get(
      () -> pathSingleSlash( () ->
        complete("Captain on the bridge!")
      )
    ).seal();

    Route route = respondWithHeader(
      RawHeader.create("special-header", "you always have this even in 404"),
      () -> sealedRoute
    );

    final Http http = Http.get(system);
    final CompletionStage<ServerBinding> binding = http.newServerAt("localhost", 8080).bind(route);
  }
}
```

### Converting routes between Java and Scala DSLs

In some cases when building reusable libraries that expose routes, it may be useful to be able to convert routes between their Java and Scala DSL representations. You can do so using the `asScala` method on a Java DSL route, or by using an `RouteAdapter` to wrap an Scala DSL route. 

Converting Scala DSL routes to Java DSL:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/RouteJavaScalaDslConversionSpec.scala#L33-L39 "Go to snippet source")val scalaRoute: akka.http.scaladsl.server.Route =
  akka.http.scaladsl.server.Directives.get {
    akka.http.scaladsl.server.Directives.complete("OK")
  }

val javaRoute: akka.http.javadsl.server.Route =
  akka.http.javadsl.server.directives.RouteAdapter.asJava(scalaRoute)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/java/docs/http/javadsl/server/RouteJavaScalaDslConversionTest.java#L20-L25 "Go to snippet source")scala.Function1<
    akka.http.scaladsl.server.RequestContext,
    scala.concurrent.Future<akka.http.scaladsl.server.RouteResult>> scalaRoute = someRoute();

akka.http.javadsl.server.Route javaRoute =
    RouteAdapter.asJava(scalaRoute);
```

Converting Java DSL routes to Scala DSL:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/RouteJavaScalaDslConversionSpec.scala#L20-L27 "Go to snippet source")val javaRoute =
  akka.http.javadsl.server.Directives.get(new Supplier[akka.http.javadsl.server.Route] {
    override def get(): Route = akka.http.javadsl.server.Directives.complete("ok")
  })

// Remember that Route in Scala is just a type alias:
//   type Route = RequestContext => Future[RouteResult]
val scalaRoute: akka.http.scaladsl.server.Route = javaRoute.asScala
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/java/docs/http/javadsl/server/RouteJavaScalaDslConversionTest.java#L31-L36 "Go to snippet source")Route javaRoute = Directives.get(() ->
    Directives.complete("okey")
);

scala.Function1<RequestContext, Future<RouteResult>> scalaRoute =
    javaRoute.asScala();
```

## Code Examples

### Example 1: Routes

```scala
type Route = RequestContext => Future[RouteResult]
```

### Example 2: RouteResult

```scala
sealed trait RouteResult

object RouteResult {
  final case class Complete(response: HttpResponse) extends RouteResult
  final case class Rejected(rejections: immutable.Seq[Rejection]) extends RouteResult
}
```

### Example 3: The Routing Tree

```scala
val route =
  a {
    concat(
      b {
        concat(
          c {
            ... // route 1
          },
          d {
            ... // route 2
          },
          ... // route 3
        )
      },
      e {
        ... // route 4
      }
    )
  }
```

### Example 4: The Routing Tree

```java
import static akka.http.javadsl.server.Directives.*;

Route route =
  directiveA(concat(() ->
    directiveB(concat(() ->
      directiveC(
        ... // route 1
      ),
      directiveD(
        ... // route 2
      ),
      ... // route 3
    )),
    directiveE(
      ... // route 4
    )
  ));
```

### Example 5: Route.seal() method to modify HttpResponse

```scala
val route = respondWithHeader(RawHeader("special-header", "you always have this even in 404")) {
  Route.seal(
    get {
      pathSingleSlash {
        complete {
          "Captain on the bridge!"
        }
      }
    }
  )
}
```

### Example 6: Route.seal() method to modify HttpResponse

```java
public class RouteSealExample extends AllDirectives {

  public static void main(String [] args) {
    RouteSealExample app = new RouteSealExample();
    app.runServer();
  }

  public void runServer(){
    ActorSystem system = ActorSystem.create();

    Route sealedRoute = get(
      () -> pathSingleSlash( () ->
        complete("Captain on the bridge!")
      )
    ).seal();

    Route route = respondWithHeader(
      RawHeader.create("special-header", "you always have this even in 404"),
      () -> sealedRoute
    );

    final Http http = Http.get(system);
    final CompletionStage<ServerBinding> binding = http.newServerAt("localhost", 8080).bind(route);
  }
}
```

### Example 7: Converting routes between Java and Scala DSLs

```scala
val scalaRoute: akka.http.scaladsl.server.Route =
  akka.http.scaladsl.server.Directives.get {
    akka.http.scaladsl.server.Directives.complete("OK")
  }

val javaRoute: akka.http.javadsl.server.Route =
  akka.http.javadsl.server.directives.RouteAdapter.asJava(scalaRoute)
```

### Example 8: Converting routes between Java and Scala DSLs

```java
scala.Function1<
    akka.http.scaladsl.server.RequestContext,
    scala.concurrent.Future<akka.http.scaladsl.server.RouteResult>> scalaRoute = someRoute();

akka.http.javadsl.server.Route javaRoute =
    RouteAdapter.asJava(scalaRoute);
```

### Example 9: Converting routes between Java and Scala DSLs

```scala
val javaRoute =
  akka.http.javadsl.server.Directives.get(new Supplier[akka.http.javadsl.server.Route] {
    override def get(): Route = akka.http.javadsl.server.Directives.complete("ok")
  })

// Remember that Route in Scala is just a type alias:
//   type Route = RequestContext => Future[RouteResult]
val scalaRoute: akka.http.scaladsl.server.Route = javaRoute.asScala
```

### Example 10: Converting routes between Java and Scala DSLs

```java
Route javaRoute = Directives.get(() ->
    Directives.complete("okey")
);

scala.Function1<RequestContext, Future<RouteResult>> scalaRoute =
    javaRoute.asScala();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleExceptions.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/complete.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/redirect.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/reject.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/play-comparison.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/testkit.html
- https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html)*
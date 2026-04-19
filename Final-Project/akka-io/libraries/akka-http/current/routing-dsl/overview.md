---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/overview.html
title: Routing DSL Overview • Akka HTTP
---

# Routing DSL Overview • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Routing DSL Overview

The Akka HTTP [Core Server API](../server-side/low-level-api.html) provides a [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow")\- or `Function`\-level interface that allows an application to respond to incoming HTTP requests by mapping requests to responses (excerpt from [Low\-level server side example](../server-side/low-level-api.html#http-low-level-server-side-example)):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerLowLevel.scala "Go to snippet source")/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._

import scala.concurrent.ExecutionContext
import scala.io.StdIn

object HttpServerLowLevel {

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem(Behaviors.empty, "lowlevel")
    // needed for the future map/flatmap in the end
    implicit val executionContext: ExecutionContext = system.executionContext

    val requestHandler: HttpRequest => HttpResponse = {
      case HttpRequest(GET, Uri.Path("/"), _, _, _) =>
        HttpResponse(entity = HttpEntity(
          ContentTypes.`text/html(UTF-8)`,
          "<html><body>Hello world!</body></html>"))

      case HttpRequest(GET, Uri.Path("/ping"), _, _, _) =>
        HttpResponse(entity = "PONG!")

      case HttpRequest(GET, Uri.Path("/crash"), _, _, _) =>
        sys.error("BOOM!")

      case r: HttpRequest =>
        r.discardEntityBytes() // important to drain incoming HTTP Entity stream
        HttpResponse(404, entity = "Unknown resource!")
    }

    val bindingFuture = Http().newServerAt("localhost", 8080).bindSync(requestHandler)
    println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done

  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L164-L196 "Go to snippet source")final Function<HttpRequest, HttpResponse> requestHandler =
  new Function<HttpRequest, HttpResponse>() {
    private final HttpResponse NOT_FOUND =
      HttpResponse.create()
        .withStatus(404)
        .withEntity("Unknown resource!");

    @Override
    public HttpResponse apply(HttpRequest request) throws Exception {
      Uri uri = request.getUri();
      if (request.method() == HttpMethods.GET) {
        if (uri.path().equals("/")) {
          return
            HttpResponse.create()
              .withEntity(ContentTypes.TEXT_HTML_UTF8,
                "<html><body>Hello world!</body></html>");
        } else if (uri.path().equals("/hello")) {
          String name = uri.query().get("name").orElse("Mister X");

          return
            HttpResponse.create()
              .withEntity("Hello " + name + "!");
        } else if (uri.path().equals("/ping")) {
          return HttpResponse.create().withEntity("PONG!");
        } else {
          return NOT_FOUND;
        }
      } else {
        return NOT_FOUND;
      }
    }
  };
```

While it’d be perfectly possible to define a complete REST API service purely by pattern\-matching againstinspecting the incoming [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") (maybe with the help of a few extractors in the way of [Unfiltered](https://unfiltered.ws/)) this approach becomes somewhat unwieldy for larger services due to the amount of syntax “ceremony” required. Also, it doesn’t help in keeping your service definition as [DRY](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself) as you might like.

As an alternative Akka HTTP provides a flexible DSL for expressing your service behavior as a structure of composable elements (called [Directives](directives/index.html)) in a concise and readable way. Directives are assembled into a so called *route structure* which, at its top\-level, can be used to create a handler [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") or async handler function that can be directly supplied to a `bind` call. The conversion from [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server") to flow can either be invoked explicitly using `Route.toFlow` or, otherwise, the conversion is also provided implicitly by `RouteResult.routeToFlow` [\[1]](#1).

Here’s the complete example rewritten using the composable high\-level API:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerHighLevel.scala "Go to snippet source")/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ ContentTypes, HttpEntity }
import akka.http.scaladsl.server.Directives._
import scala.io.StdIn

object HttpServerHighLevel {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext = system.dispatcher

    val route =
      get {
        concat(
          pathSingleSlash {
            complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<html><body>Hello world!</body></html>"))
          },
          path("ping") {
            complete("PONG!")
          },
          path("crash") {
            sys.error("BOOM!")
          }
        )
      }

    // `route` will be implicitly converted to an async handler
    val bindingFuture = Http().newServerAt("localhost", 8080).bind(route)
    println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HighLevelServerExample.java#L8-L67 "Go to snippet source")  
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.ContentTypes;
import akka.http.javadsl.model.HttpEntities;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class HighLevelServerExample extends AllDirectives {
  public static void main(String[] args) throws IOException {
    // boot up server using the route as defined below
    ActorSystem system = ActorSystem.create();

    final HighLevelServerExample app = new HighLevelServerExample();

    final Http http = Http.get(system);

    final CompletionStage<ServerBinding> binding = http.newServerAt("localhost", 8080).bind(app.createRoute());

    System.out.println("Type RETURN to exit");
    System.in.read();

    binding
      .thenCompose(ServerBinding::unbind)
      .thenAccept(unbound -> system.terminate());
  }

  public Route createRoute() {
    // This handler generates responses to `/hello?name=XXX` requests
    Route helloRoute =
      parameterOptional("name", optName -> {
        String name = optName.orElse("Mister X");
        return complete("Hello " + name + "!");
      });

    return
      // here the complete behavior for this server is defined

      // only handle GET requests
      get(() -> concat(
        // matches the empty path
        pathSingleSlash(() ->
          // return a constant string with a certain content type
          complete(HttpEntities.create(ContentTypes.TEXT_HTML_UTF8, "<html><body>Hello world!</body></html>"))
        ),
        path("ping", () ->
          // return a simple `text/plain` response
          complete("PONG!")
        ),
        path("hello", () ->
          // uses the route defined above
          helloRoute
        )
      ));
  }
}
```

The core of the Routing DSL becomes available with a single import:

Scala

```
import akka.http.scaladsl.server.Directives._

```

Java

```
import static akka.http.javadsl.server.Directives.*;

```

Or by extending the `akka.http.javadsl.server.AllDirectives` class which brings together all directives into a single class for easier access:

```
extends AllDirectives

```

Of course it is possible to directly import only the directives you need (i.e. [`WebSocketDirectives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/WebSocketDirectives.html "akka.http.javadsl.server.directives.WebSocketDirectives")[`WebSocketDirectives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/WebSocketDirectives.html "akka.http.scaladsl.server.directives.WebSocketDirectives") etc).

This example also relies on the pre\-defined support for Scala XML with:

```
import akka.http.scaladsl.marshallers.xml.ScalaXmlSupport._

```

The very short example shown here is certainly not the best for illustrating the savings in “ceremony” and improvements in conciseness and readability that the Routing DSL promises. The [Long Example](index.html#longer-example) might do a better job in this regard.

For learning how to work with the Routing DSL you should first understand the concept of [Routes](routes.html).

> [\[1]](#^1) To be picked up automatically, the implicit conversion needs to be provided in the companion object of the source type. However, as [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") is just a type alias for `RequestContext => Future[RouteResult]`, there’s no companion object for [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route"). Fortunately, the [implicit scope](https://www.scala-lang.org/files/archive/spec/2.11/07-implicits.html#implicit-parameters) for finding an implicit conversion also includes all types that are “associated with any part” of the source type which in this case means that the implicit conversion will also be picked up from `RouteResult.routeToFlow` automatically.

## Code Examples

### Example 1: Routing DSL Overview

```scala
/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._

import scala.concurrent.ExecutionContext
import scala.io.StdIn

object HttpServerLowLevel {

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem(Behaviors.empty, "lowlevel")
    // needed for the future map/flatmap in the end
    implicit val executionContext: ExecutionContext = system.executionContext

    val requestHandler: HttpRequest => HttpResponse = {
      case HttpRequest(GET, Uri.Path("/"), _, _, _) =>
        HttpResponse(entity = HttpEntity(
          ContentTypes.`text/html(UTF-8)`,
          "<html><body>Hello world!</body></html>"))

      case HttpRequest(GET, Uri.Path("/ping"), _, _, _) =>
        HttpResponse(entity = "PONG!")

      case HttpRequest(GET, Uri.Path("/crash"), _, _, _) =>
        sys.error("BOOM!")

      case r: HttpRequest =>
        r.discardEntityBytes() // important to drain incoming HTTP Entity stream
        HttpResponse(404, entity = "Unknown resource!")
    }

    val bindingFuture = Http().newServerAt("localhost", 8080).bindSync(requestHandler)
    println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done

  }
}
```

### Example 2: Routing DSL Overview

```java
final Function<HttpRequest, HttpResponse> requestHandler =
  new Function<HttpRequest, HttpResponse>() {
    private final HttpResponse NOT_FOUND =
      HttpResponse.create()
        .withStatus(404)
        .withEntity("Unknown resource!");


    @Override
    public HttpResponse apply(HttpRequest request) throws Exception {
      Uri uri = request.getUri();
      if (request.method() == HttpMethods.GET) {
        if (uri.path().equals("/")) {
          return
            HttpResponse.create()
              .withEntity(ContentTypes.TEXT_HTML_UTF8,
                "<html><body>Hello world!</body></html>");
        } else if (uri.path().equals("/hello")) {
          String name = uri.query().get("name").orElse("Mister X");

          return
            HttpResponse.create()
              .withEntity("Hello " + name + "!");
        } else if (uri.path().equals("/ping")) {
          return HttpResponse.create().withEntity("PONG!");
        } else {
          return NOT_FOUND;
        }
      } else {
        return NOT_FOUND;
      }
    }
  };
```

### Example 3: Routing DSL Overview

```scala
/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ ContentTypes, HttpEntity }
import akka.http.scaladsl.server.Directives._
import scala.io.StdIn

object HttpServerHighLevel {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext = system.dispatcher

    val route =
      get {
        concat(
          pathSingleSlash {
            complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<html><body>Hello world!</body></html>"))
          },
          path("ping") {
            complete("PONG!")
          },
          path("crash") {
            sys.error("BOOM!")
          }
        )
      }

    // `route` will be implicitly converted to an async handler
    val bindingFuture = Http().newServerAt("localhost", 8080).bind(route)
    println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}
```

### Example 4: Routing DSL Overview

```java
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.ContentTypes;
import akka.http.javadsl.model.HttpEntities;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class HighLevelServerExample extends AllDirectives {
  public static void main(String[] args) throws IOException {
    // boot up server using the route as defined below
    ActorSystem system = ActorSystem.create();

    final HighLevelServerExample app = new HighLevelServerExample();

    final Http http = Http.get(system);

    final CompletionStage<ServerBinding> binding = http.newServerAt("localhost", 8080).bind(app.createRoute());

    System.out.println("Type RETURN to exit");
    System.in.read();

    binding
      .thenCompose(ServerBinding::unbind)
      .thenAccept(unbound -> system.terminate());
  }

  public Route createRoute() {
    // This handler generates responses to `/hello?name=XXX` requests
    Route helloRoute =
      parameterOptional("name", optName -> {
        String name = optName.orElse("Mister X");
        return complete("Hello " + name + "!");
      });

    return
      // here the complete behavior for this server is defined

      // only handle GET requests
      get(() -> concat(
        // matches the empty path
        pathSingleSlash(() ->
          // return a constant string with a certain content type
          complete(HttpEntities.create(ContentTypes.TEXT_HTML_UTF8, "<html><body>Hello world!</body></html>"))
        ),
        path("ping", () ->
          // return a simple `text/plain` response
          complete("PONG!")
        ),
        path("hello", () ->
          // uses the route defined above
          helloRoute
        )
      ));
  }
}
```

### Example 5: Routing DSL Overview

```scala
import akka.http.scaladsl.server.Directives._
```

### Example 6: Routing DSL Overview

```java
import static akka.http.javadsl.server.Directives.*;
```

### Example 7: Routing DSL Overview

```java
extends AllDirectives
```

### Example 8: Routing DSL Overview

```scala
import akka.http.scaladsl.marshallers.xml.ScalaXmlSupport._
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/WebSocketDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/WebSocketDirectives.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/play-comparison.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html
- https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/overview.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/overview.html)*
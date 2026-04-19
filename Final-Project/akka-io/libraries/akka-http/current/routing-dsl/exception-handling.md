---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:11:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html
title: Exception Handling • Akka HTTP
---

# Exception Handling • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Exception Handling

Exceptions thrown during route execution bubble up through the route structure to the next enclosing [handleExceptions](directives/execution-directives/handleExceptions.html) directive or the top of your route structure.

Similarly to the way that [Rejections](rejections.html) are handled the [handleExceptions](directives/execution-directives/handleExceptions.html) directive delegates the actual job of converting an exception to its argument, an [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler"), which is defined like this:.

```
trait ExceptionHandler extends PartialFunction[Throwable, Route]

```

Since an [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") is a partial function, it can choose which exceptions it would like to handle and which not. Unhandled exceptions will simply continue to bubble up in the route structure. At the root of the route tree any still unhandled exception will be dealt with by the top\-level handler which always handles *all* exceptions.

`Route.seal` internally wraps its argument route with the [handleExceptions](directives/execution-directives/handleExceptions.html) directive in order to “catch” and handle any exception.

So, if you’d like to customize the way certain exceptions are handled you need to write a custom [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler"). Once you have defined your custom [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") you have two options for “activating” it:

1. Bring it into implicit scope at the top\-level.Pass it to the `seal()` method of the [`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route")
2. Supply it as argument to the [handleExceptions](directives/execution-directives/handleExceptions.html) directive.

In the first case your handler will be “sealed” (which means that it will receive the default handler as a fallback for all cases your handler doesn’t handle itself) and used for all exceptions that are not handled within the route structure itself. Here you can see an example of it:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/ExceptionHandlerExamplesSpec.scala#L84-L106 "Go to snippet source")import akka.http.scaladsl.model.HttpResponse
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server._
import Directives._

object SealedRouteWithCustomExceptionHandler {

  implicit def myExceptionHandler: ExceptionHandler =
    ExceptionHandler {
      case _: ArithmeticException =>
        extractUri { uri =>
          println(s"Request to $uri could not be handled normally")
          complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
        }
    }

  val route: Route = Route.seal(
    path("divide") {
      complete((1 / 0).toString) //Will throw ArithmeticException
    }
  ) // this one takes `myExceptionHandler` implicitly

}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ExceptionHandlerInSealExample.java#L8-L31 "Go to snippet source")import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.ExceptionHandler;
import akka.http.javadsl.server.PathMatchers;
import akka.http.javadsl.server.RejectionHandler;
import akka.http.javadsl.server.Route;

import static akka.http.javadsl.server.PathMatchers.integerSegment;

public class ExceptionHandlerInSealExample extends AllDirectives {

  public Route createRoute() {
    final ExceptionHandler divByZeroHandler = ExceptionHandler.newBuilder()
      .match(ArithmeticException.class, x ->
        complete(StatusCodes.BAD_REQUEST, "You've got your arithmetic wrong, fool!"))
      .build();

    final RejectionHandler defaultHandler = RejectionHandler.defaultHandler();

    return path(PathMatchers.segment("divide").slash(integerSegment()).slash(integerSegment()), (a, b) ->
      complete("The result is " + (a / b))
    ).seal(defaultHandler, divByZeroHandler);
  }
}
```

The second case allows you to restrict the applicability of your handler to certain branches of your route structure.

Here is an example for wiring up a custom handler via [handleExceptions](directives/execution-directives/handleExceptions.html):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/ExceptionHandlerExamplesSpec.scala#L17-L44 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import StatusCodes._
import akka.http.scaladsl.server._
import Directives._

val myExceptionHandler = ExceptionHandler {
  case _: ArithmeticException =>
    extractUri { uri =>
      println(s"Request to $uri could not be handled normally")
      complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
    }
}

object MyApp extends App {

  implicit val system: ActorSystem = ActorSystem()

  val route: Route =
    handleExceptions(myExceptionHandler) {
      // ... some route structure
    }

  Http().newServerAt("localhost", 8080).bind(route)
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ExceptionHandlerExample.java#L8-L43 "Go to snippet source")  
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.ExceptionHandler;
import akka.http.javadsl.server.PathMatchers;
import akka.http.javadsl.server.Route;

import java.util.concurrent.CompletionStage;

import static akka.http.javadsl.server.PathMatchers.integerSegment;

public class ExceptionHandlerExample extends AllDirectives {
  public static void main(String[] args) {
    final ActorSystem system = ActorSystem.create();
    final Http http = Http.get(system);

    final ExceptionHandlerExample app = new ExceptionHandlerExample();

    final CompletionStage<ServerBinding> binding = http.newServerAt("localhost", 8080).bind(app.createRoute());
  }

  public Route createRoute() {
    final ExceptionHandler divByZeroHandler = ExceptionHandler.newBuilder()
      .match(ArithmeticException.class, x ->
        complete(StatusCodes.BAD_REQUEST, "You've got your arithmetic wrong, fool!"))
      .build();

    return path(PathMatchers.segment("divide").slash(integerSegment()).slash(integerSegment()), (a, b) ->
      handleExceptions(divByZeroHandler, () -> complete("The result is " + (a / b)))
    );
  }
}
```

And this is how to do it implicitly:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/ExceptionHandlerExamplesSpec.scala#L51-L77 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import StatusCodes._
import akka.http.scaladsl.server._
import Directives._

implicit def myExceptionHandler: ExceptionHandler =
  ExceptionHandler {
    case _: ArithmeticException =>
      extractUri { uri =>
        println(s"Request to $uri could not be handled normally")
        complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
      }
  }

object MyApp extends App {

  implicit val system: ActorSystem = ActorSystem()

  val route: Route =
  // ... some route structure

  Http().newServerAt("localhost", 8080).bind(route)
}

```

## Default Exception Handler

A default [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") is used if no custom instance is provided.

It will handle every `NonFatal` throwable, write its stack trace and complete the request with `InternalServerError` `(500)` status code.

The message body will contain a string obtained via `Throwable#getMessage` call on the exception caught.

In case `getMessage` returns `null` (which is true for e.g. `NullPointerException` instances), the class name and a remark about the message being null are included in the response body.

Note that `IllegalRequestException`s’ stack traces are not logged, since instances of this class normally contain enough information to provide a useful error message.

Note
Users are strongly encouraged not to rely on using the [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") as a means of handling errors. By errors, we mean things that are an expected part of normal operations: for example, issues discovered during input validation. The [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") is meant to be a means of handling failures. See [Failure vs Error](https://www.reactivemanifesto.org/glossary#Failure) in the glossary of the [Reactive Manifesto](https://www.reactivemanifesto.org).

Distinguishing between errors and failures (i.e. thrown `Exceptions` handled via the [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler")) provides a much better mental model but also leads to performance improvements.

This is because exceptions are known to have a negative performance impact for cases when the depth of the call stack is significant (stack trace construction cost) and when the handler is located far from the place of the throwable instantiation (stack unwinding costs).

In a typical Akka application both these conditions are frequently true, so as a rule of thumb, you should try to minimize the number of `Throwable` instances reaching the exception handler.

To understand the performance implications of (mis\-)using exceptions, have a read at this excellent post by A. Shipilёv: [The Exceptional Performance of Lil’ Exception](https://shipilev.net/blog/2014/exceptional-performance/).

Note
Please note that since version `10.1.6`, the default `ExceptionHandler` will also discard the entity bytes automatically. If you want to change this behavior, please refer to [the section above](exception-handling.html#exception-handling); however, might cause connections to stall if the entity is not properly rejected or cancelled on the client side.

## Including sensitive data in exceptions

To prevent certain types of attack, it is not recommended to include arbitrary invalid user input in the response. However, sometimes it can be useful to include it in the exception and logging for diagnostic reasons. In such cases, you can use exceptions that extend `ExceptionWithErrorInfo`, such as `IllegalHeaderException`:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/ExceptionHandlerExamplesSpec.scala#L201-L211 "Go to snippet source")import akka.http.scaladsl.model.IllegalHeaderException

val route = get {
  throw IllegalHeaderException("Value of header Foo was illegal", "Found illegal value \"<script>alert('evil_xss_or_xsrf_reflection')</script>\"")
}

// Test:
Get("/") ~> route ~> check {
  responseAs[String] should include("header Foo was illegal")
  responseAs[String] shouldNot include("evil_xss_or_xsrf_reflection")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/RespondWithHeaderHandlerExampleTest.java#L38-L50 "Go to snippet source")TestRoute route = testRoute(
  get(() -> {
      throw new IllegalHeaderException(new ErrorInfo(
        "Value of header Foo was illegal",
        "Found illegal value \"<script>alert('evil_xss_or_xsrf_reflection')</script>\""));
  })
);

String response = route
  .run(HttpRequest.GET("/"))
  .entityString();
assertTrue(response.contains("header Foo was illegal"));
assertTrue(!response.contains("evil_xss_or_xsrf_reflection"));
```

## Respond with headers and Exception Handler

If you wrap an ExceptionHandler inside a different directive, then that directive will still apply. Example below shows that wrapping an ExceptionHandler inside a respondWithHeader directive will still add the header to the response. 

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/ExceptionHandlerExamplesSpec.scala#L113-L156 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpResponse
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.model.headers.RawHeader
import akka.http.scaladsl.server._
import Directives._
import akka.http.scaladsl.Http
import RespondWithHeaderExceptionHandler.route

object RespondWithHeaderExceptionHandler {
  def myExceptionHandler: ExceptionHandler =
    ExceptionHandler {
      case _: ArithmeticException =>
        extractUri { uri =>
          println(s"Request to $uri could not be handled normally")
          complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
        }
    }

  val greetingRoutes: Route = path("greetings") {
    complete("Hello!")
  }

  val divideRoutes: Route = path("divide") {
    complete((1 / 0).toString) //Will throw ArithmeticException
  }

  val route: Route =
    respondWithHeader(RawHeader("X-Outer-Header", "outer")) { // will apply, since it gets the response from the handler
      handleExceptions(myExceptionHandler) {
        greetingRoutes ~ divideRoutes ~ respondWithHeader(RawHeader("X-Inner-Header", "inner")) {
          throw new Exception("Boom!") //Will cause Internal server error,
          // only ArithmeticExceptions are handled by myExceptionHandler.
        }
      }
    }
}

object MyApp extends App {
  implicit val system: ActorSystem = ActorSystem()

  Http().newServerAt("localhost", 8080).bind(route)
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/RespondWithHeaderHandlerExampleTest.java#L8-L85 "Go to snippet source")  
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.model.headers.RawHeader;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.ExceptionHandler;
import akka.http.javadsl.server.Route;
import akka.http.javadsl.testkit.JUnitRouteTest;
import akka.http.javadsl.testkit.TestRoute;
import akka.http.scaladsl.model.ErrorInfo;
import akka.http.scaladsl.model.IllegalHeaderException;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

import static junit.framework.TestCase.assertTrue;

class RespondWithHeaderHandlerExample extends AllDirectives {
    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create();
        final Http http = Http.get(system);

        final RespondWithHeaderHandlerExample app = new RespondWithHeaderHandlerExample();

        final CompletionStage<ServerBinding> binding = http.newServerAt("localhost", 8080).bind(app.createRoute());
    }

    public Route createRoute() {
        final ExceptionHandler divByZeroHandler = ExceptionHandler.newBuilder()
                .match(ArithmeticException.class, x ->
                        complete(StatusCodes.BAD_REQUEST, "Error! You tried to divide with zero!"))
                .build();

        return respondWithHeader(RawHeader.create("X-Outer-Header", "outer"), () -> //will apply for handled exceptions
                handleExceptions(divByZeroHandler, () -> concat(
                        path("greetings", () -> complete("Hello!")),
                        path("divide", () -> complete("Dividing with zero: " + (1 / 0))),
                        respondWithHeader(RawHeader.create("X-Inner-Header", "inner"), () -> {
                            // Will cause Internal server error,
                            // only ArithmeticExceptions are handled by divByZeroHandler.
                            throw new RuntimeException("Boom!");
                        })
                ))
        );
    }
}
```

## Code Examples

### Example 1: Exception Handling

```scala
trait ExceptionHandler extends PartialFunction[Throwable, Route]
```

### Example 2: Exception Handling

```scala
import akka.http.scaladsl.model.HttpResponse
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server._
import Directives._

object SealedRouteWithCustomExceptionHandler {

  implicit def myExceptionHandler: ExceptionHandler =
    ExceptionHandler {
      case _: ArithmeticException =>
        extractUri { uri =>
          println(s"Request to $uri could not be handled normally")
          complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
        }
    }

  val route: Route = Route.seal(
    path("divide") {
      complete((1 / 0).toString) //Will throw ArithmeticException
    }
  ) // this one takes `myExceptionHandler` implicitly

}
```

### Example 3: Exception Handling

```java
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.ExceptionHandler;
import akka.http.javadsl.server.PathMatchers;
import akka.http.javadsl.server.RejectionHandler;
import akka.http.javadsl.server.Route;

import static akka.http.javadsl.server.PathMatchers.integerSegment;

public class ExceptionHandlerInSealExample extends AllDirectives {

  public Route createRoute() {
    final ExceptionHandler divByZeroHandler = ExceptionHandler.newBuilder()
      .match(ArithmeticException.class, x ->
        complete(StatusCodes.BAD_REQUEST, "You've got your arithmetic wrong, fool!"))
      .build();

    final RejectionHandler defaultHandler = RejectionHandler.defaultHandler();

    return path(PathMatchers.segment("divide").slash(integerSegment()).slash(integerSegment()), (a, b) ->
      complete("The result is " + (a / b))
    ).seal(defaultHandler, divByZeroHandler);
  }
}
```

### Example 4: Exception Handling

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import StatusCodes._
import akka.http.scaladsl.server._
import Directives._

val myExceptionHandler = ExceptionHandler {
  case _: ArithmeticException =>
    extractUri { uri =>
      println(s"Request to $uri could not be handled normally")
      complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
    }
}

object MyApp extends App {

  implicit val system: ActorSystem = ActorSystem()

  val route: Route =
    handleExceptions(myExceptionHandler) {
      // ... some route structure
    }

  Http().newServerAt("localhost", 8080).bind(route)
}
```

### Example 5: Exception Handling

```java
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.ExceptionHandler;
import akka.http.javadsl.server.PathMatchers;
import akka.http.javadsl.server.Route;

import java.util.concurrent.CompletionStage;

import static akka.http.javadsl.server.PathMatchers.integerSegment;

public class ExceptionHandlerExample extends AllDirectives {
  public static void main(String[] args) {
    final ActorSystem system = ActorSystem.create();
    final Http http = Http.get(system);

    final ExceptionHandlerExample app = new ExceptionHandlerExample();

    final CompletionStage<ServerBinding> binding = http.newServerAt("localhost", 8080).bind(app.createRoute());
  }


  public Route createRoute() {
    final ExceptionHandler divByZeroHandler = ExceptionHandler.newBuilder()
      .match(ArithmeticException.class, x ->
        complete(StatusCodes.BAD_REQUEST, "You've got your arithmetic wrong, fool!"))
      .build();

    return path(PathMatchers.segment("divide").slash(integerSegment()).slash(integerSegment()), (a, b) ->
      handleExceptions(divByZeroHandler, () -> complete("The result is " + (a / b)))
    );
  }
}
```

### Example 6: Exception Handling

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import StatusCodes._
import akka.http.scaladsl.server._
import Directives._

implicit def myExceptionHandler: ExceptionHandler =
  ExceptionHandler {
    case _: ArithmeticException =>
      extractUri { uri =>
        println(s"Request to $uri could not be handled normally")
        complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
      }
  }

object MyApp extends App {

  implicit val system: ActorSystem = ActorSystem()

  val route: Route =
  // ... some route structure

  Http().newServerAt("localhost", 8080).bind(route)
}
```

### Example 7: Including sensitive data in exceptions

```scala
import akka.http.scaladsl.model.IllegalHeaderException

val route = get {
  throw IllegalHeaderException("Value of header Foo was illegal", "Found illegal value \"<script>alert('evil_xss_or_xsrf_reflection')</script>\"")
}

// Test:
Get("/") ~> route ~> check {
  responseAs[String] should include("header Foo was illegal")
  responseAs[String] shouldNot include("evil_xss_or_xsrf_reflection")
}
```

### Example 8: Including sensitive data in exceptions

```java
TestRoute route = testRoute(
  get(() -> {
      throw new IllegalHeaderException(new ErrorInfo(
        "Value of header Foo was illegal",
        "Found illegal value \"<script>alert('evil_xss_or_xsrf_reflection')</script>\""));
  })
);

String response = route
  .run(HttpRequest.GET("/"))
  .entityString();
assertTrue(response.contains("header Foo was illegal"));
assertTrue(!response.contains("evil_xss_or_xsrf_reflection"));
```

### Example 9: Respond with headers and Exception Handler

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpResponse
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.model.headers.RawHeader
import akka.http.scaladsl.server._
import Directives._
import akka.http.scaladsl.Http
import RespondWithHeaderExceptionHandler.route


object RespondWithHeaderExceptionHandler {
  def myExceptionHandler: ExceptionHandler =
    ExceptionHandler {
      case _: ArithmeticException =>
        extractUri { uri =>
          println(s"Request to $uri could not be handled normally")
          complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
        }
    }

  val greetingRoutes: Route = path("greetings") {
    complete("Hello!")
  }

  val divideRoutes: Route = path("divide") {
    complete((1 / 0).toString) //Will throw ArithmeticException
  }

  val route: Route =
    respondWithHeader(RawHeader("X-Outer-Header", "outer")) { // will apply, since it gets the response from the handler
      handleExceptions(myExceptionHandler) {
        greetingRoutes ~ divideRoutes ~ respondWithHeader(RawHeader("X-Inner-Header", "inner")) {
          throw new Exception("Boom!") //Will cause Internal server error,
          // only ArithmeticExceptions are handled by myExceptionHandler.
        }
      }
    }
}

object MyApp extends App {
  implicit val system: ActorSystem = ActorSystem()

  Http().newServerAt("localhost", 8080).bind(route)
}
```

### Example 10: Respond with headers and Exception Handler

```java
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.model.headers.RawHeader;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.ExceptionHandler;
import akka.http.javadsl.server.Route;
import akka.http.javadsl.testkit.JUnitRouteTest;
import akka.http.javadsl.testkit.TestRoute;
import akka.http.scaladsl.model.ErrorInfo;
import akka.http.scaladsl.model.IllegalHeaderException;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

import static junit.framework.TestCase.assertTrue;

class RespondWithHeaderHandlerExample extends AllDirectives {
    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create();
        final Http http = Http.get(system);

        final RespondWithHeaderHandlerExample app = new RespondWithHeaderHandlerExample();

        final CompletionStage<ServerBinding> binding = http.newServerAt("localhost", 8080).bind(app.createRoute());
    }

    public Route createRoute() {
        final ExceptionHandler divByZeroHandler = ExceptionHandler.newBuilder()
                .match(ArithmeticException.class, x ->
                        complete(StatusCodes.BAD_REQUEST, "Error! You tried to divide with zero!"))
                .build();

        return respondWithHeader(RawHeader.create("X-Outer-Header", "outer"), () -> //will apply for handled exceptions
                handleExceptions(divByZeroHandler, () -> concat(
                        path("greetings", () -> complete("Hello!")),
                        path("divide", () -> complete("Dividing with zero: " + (1 / 0))),
                        respondWithHeader(RawHeader.create("X-Inner-Header", "inner"), () -> {
                            // Will cause Internal server error,
                            // only ArithmeticExceptions are handled by divByZeroHandler.
                            throw new RuntimeException("Boom!");
                        })
                ))
        );
    }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/case-class-extraction.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleExceptions.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html)*
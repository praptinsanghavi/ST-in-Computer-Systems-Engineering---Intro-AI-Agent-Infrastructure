---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/testkit.html
title: Route TestKit • Akka HTTP
---

# Route TestKit • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Route TestKit

One of Akka HTTP’s design goals is good testability of the created services. For services built with the Routing DSL Akka HTTP provides a dedicated testkit that makes efficient testing of route logic easy and convenient. This “route test DSL” is made available with the *akka\-http\-testkit* module.

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka HTTP TestKit, add the module to your project:

sbt
```
val AkkaVersion = "2.10.11"
val AkkaHttpVersion = "10.7.4"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % AkkaHttpVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-http-testkit_${versions.ScalaBinary}"
}
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-testkit_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

## Usage

Here is an example of what a simple test with the routing testkit might look like using the built\-in support for [scalatest](https://www.scalatest.org) and [specs2](https://etorreborre.github.io/specs2/):

ScalaTest

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/FullTestKitExampleSpec.scala#L8-L62 "Go to snippet source")import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.server._
import Directives._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FullTestKitExampleSpec extends AnyWordSpec with Matchers with ScalatestRouteTest {

  val smallRoute =
    get {
      concat(
        pathSingleSlash {
          complete {
            "Captain on the bridge!"
          }
        },
        path("ping") {
          complete("PONG!")
        }
      )
    }

  "The service" should {

    "return a greeting for GET requests to the root path" in {
      // tests:
      Get() ~> smallRoute ~> check {
        responseAs[String] shouldEqual "Captain on the bridge!"
      }
    }

    "return a 'PONG!' response for GET requests to /ping" in {
      // tests:
      Get("/ping") ~> smallRoute ~> check {
        responseAs[String] shouldEqual "PONG!"
      }
    }

    "leave GET requests to other paths unhandled" in {
      // tests:
      Get("/kermit") ~> smallRoute ~> check {
        handled shouldBe false
      }
    }

    "return a MethodNotAllowed error for PUT requests to the root path" in {
      // tests:
      Put() ~> Route.seal(smallRoute) ~> check {
        status shouldEqual StatusCodes.MethodNotAllowed
        responseAs[String] shouldEqual "HTTP method not allowed, supported methods: GET"
      }
    }
  }
}
```

specs2

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/FullSpecs2TestKitExampleSpec.scala#L8-L61 "Go to snippet source")import org.specs2.mutable.Specification
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.Specs2RouteTest
import akka.http.scaladsl.server._
import Directives._

class FullSpecs2TestKitExampleSpec extends Specification with Specs2RouteTest {

  val smallRoute =
    get {
      concat(
        pathSingleSlash {
          complete {
            "Captain on the bridge!"
          }
        },
        path("ping") {
          complete("PONG!")
        }
      )
    }

  "The service" should {

    "return a greeting for GET requests to the root path" in {
      // tests:
      Get() ~> smallRoute ~> check {
        responseAs[String] shouldEqual "Captain on the bridge!"
      }
    }

    "return a 'PONG!' response for GET requests to /ping" in {
      // tests:
      Get("/ping") ~> smallRoute ~> check {
        responseAs[String] shouldEqual "PONG!"
      }
    }

    "leave GET requests to other paths unhandled" in {
      // tests:
      Get("/kermit") ~> smallRoute ~> check {
        handled should beFalse
      }
    }

    "return a MethodNotAllowed error for PUT requests to the root path" in {
      // tests:
      Put() ~> Route.seal(smallRoute) ~> check {
        status shouldEqual StatusCodes.MethodNotAllowed
        responseAs[String] shouldEqual "HTTP method not allowed, supported methods: GET"
      }
    }
  }
}
```

The basic structure of a test built with the testkit is this (expression placeholder in all\-caps):

```
REQUEST ~> ROUTE ~> check {
  ASSERTIONS
}

```

In this template *REQUEST* is an expression evaluating to an [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") instance. In most cases your test will, in one way or another, extend from [`RouteTest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/testkit/RouteTest.html "akka.http.javadsl.testkit.RouteTest")[`RouteTest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest.html "akka.http.scaladsl.testkit.RouteTest") which itself mixes in the `akka.http.scaladsl.client.RequestBuilding` trait, which gives you a concise and convenient way of constructing test requests. [\[1]](#1)

*ROUTE* is an expression evaluating to a [Route](routes.html). You can specify one inline or simply refer to the route structure defined in your service.

The final element of the `~>` chain is a `check` call, which takes a block of assertions as parameter. In this block you define your requirements onto the result produced by your route after having processed the given request. Typically you use one of the defined “inspectors” to retrieve a particular element of the routes response and express assertions against it using the test DSL provided by your test framework. For example, with [scalatest](https://www.scalatest.org), in order to verify that your route responds to the request with a status 200 response, you’d use the `status` inspector and express an assertion like this:

```
status shouldEqual 200

```

The following inspectors are defined:

### Table of Inspectors

| Inspector | Description |
| --- | --- |
| `charset: HttpCharset` | Identical to `contentType.charset` |
| `chunks: Seq[HttpEntity.ChunkStreamPart]` | Returns the entity chunks produced by the route. If the entity is not `chunked` returns `Nil`. |
| `closingExtension: String` | Returns chunk extensions the route produced with its last response chunk. If the response entity is unchunked returns the empty string. |
| `contentType: ContentType` | Identical to `responseEntity.contentType` |
| `definedCharset: Option[HttpCharset]` | Identical to `contentType.definedCharset` |
| `entityAs[T :FromEntityUnmarshaller]: T` | Unmarshals the response entity using the in\-scope `FromEntityUnmarshaller` for the given type. Any errors in the process trigger a test failure. |
| `handled: Boolean` | Indicates whether the route produced an [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") for the request. If the route rejected the request `handled` evaluates to `false`. |
| `header(name: String): Option[HttpHeader]` | Returns the response header with the given name or `None` if no such header is present in the response. |
| `header[T <: HttpHeader]: Option[T]` | Identical to `response.header[T]` |
| `headers: Seq[HttpHeader]` | Identical to `response.headers` |
| `mediaType: MediaType` | Identical to `contentType.mediaType` |
| `rejection: Rejection` | The rejection produced by the route. If the route did not produce exactly one rejection a test failure is triggered. |
| `rejections: Seq[Rejection]` | The rejections produced by the route. If the route did not reject the request a test failure is triggered. |
| `response: HttpResponse` | The [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") returned by the route. If the route did not return an [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") instance (e.g. because it rejected the request) a test failure is triggered. |
| `responseAs[T: FromResponseUnmarshaller]: T` | Unmarshals the response entity using the in\-scope `FromResponseUnmarshaller` for the given type. Any errors in the process trigger a test failure. |
| `responseEntity: HttpEntity` | Returns the response entity. |
| `status: StatusCode` | Identical to `response.status` |
| `trailer: Seq[HttpHeader]` | Returns the list of trailer headers the route produced with its last chunk. If the response entity is unchunked returns `Nil`. |

> [\[1]](#^1) If the request URI is relative it will be made absolute using an implicitly available instance of `DefaultHostInfo` whose value is “<http://example.com>” by default. This mirrors the behavior of akka\-http\-core which always produces absolute URIs for incoming request based on the request URI and the `Host`\-header of the request. You can customize this behavior by bringing a custom instance of `DefaultHostInfo` into scope.

To use the testkit you need to take these steps:

- add a dependency to the `akka-http-testkit` module
- derive the test class from `JUnitRouteTest`
- wrap the route under test with `RouteTest.testRoute` to create a `TestRoute`
- run requests against the route using `TestRoute.run(request)` which will return a `TestResponse`
- use the methods of `TestResponse` to assert on properties of the response

## Example

To see the testkit in action consider the following simple calculator app service:

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/MyAppService.java#L8-L49 "Go to snippet source")  
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;
import akka.http.javadsl.server.examples.simple.SimpleServerApp;
import akka.http.javadsl.unmarshalling.StringUnmarshallers;

import java.io.IOException;

public class MyAppService extends AllDirectives {

  public String add(double x, double y) {
    return "x + y = " + (x + y);
  }

  public Route createRoute() {
    return
      get(() ->
        pathPrefix("calculator", () ->
          path("add", () ->
            parameter(StringUnmarshallers.DOUBLE, "x", x ->
              parameter(StringUnmarshallers.DOUBLE, "y", y ->
                complete(add(x, y))
              )
            )
          )
        )
      );
  }

  public static void main(String[] args) throws IOException {
    final ActorSystem system = ActorSystem.create();

    final SimpleServerApp app = new SimpleServerApp();

    Http.get(system).newServerAt("127.0.0.1", 8080).bind(app.createRoute());

    System.console().readLine("Type RETURN to exit...");
    system.terminate();
  }
}
```

`MyAppService` extends from `AllDirectives` which brings all of the directives into scope. We define a method called `createRoute` that provides the routes to serve to `bind`.

Here’s how you would test that service:

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/TestkitExampleTest.java#L8-L35 "Go to snippet source")import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.testkit.JUnitRouteTest;
import akka.http.javadsl.testkit.TestRoute;
import org.junit.Test;

public class TestkitExampleTest extends JUnitRouteTest {
    TestRoute appRoute = testRoute(new MyAppService().createRoute());

    @Test
    public void testCalculatorAdd() {
        // test happy path
        appRoute.run(HttpRequest.GET("/calculator/add?x=4.2&y=2.3"))
            .assertStatusCode(200)
            .assertEntity("x + y = 6.5");

        // test responses to potential errors
        appRoute.run(HttpRequest.GET("/calculator/add?x=3.2"))
            .assertStatusCode(StatusCodes.NOT_FOUND) // 404
            .assertEntity("Request is missing required query parameter 'y'");

        // test responses to potential errors
        appRoute.run(HttpRequest.GET("/calculator/add?x=3.2&y=three"))
            .assertStatusCode(StatusCodes.BAD_REQUEST)
            .assertEntity("The query parameter 'y' was malformed:\n" +
                    "'three' is not a valid 64-bit floating point value");
    }
}
```

## Writing Asserting against the HttpResponse

The testkit supports a fluent DSL to write compact assertions on the response by chaining assertions using “dot\-syntax”. To simplify working with streamed responses the entity of the response is first “strictified”, i.e. entity data is collected into a single [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString") and provided the entity is supplied as an `HttpEntityStrict`. This allows to write several assertions against the same entity data which wouldn’t (necessarily) be possible for the streamed version.

All of the defined assertions provide HTTP specific error messages aiding in diagnosing problems.

Currently, these methods are defined on `TestResponse` to assert on the response:

| Inspector | Description |
| --- | --- |
| `assertStatusCode(int expectedCode)` | Asserts that the numeric response status code equals the expected one |
| `assertStatusCode(StatusCode expectedCode)` | Asserts that the response [`StatusCode`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html "akka.http.javadsl.model.StatusCode")[`StatusCode`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html "akka.http.scaladsl.model.StatusCode") equals the expected one |
| `assertMediaType(String expectedType)` | Asserts that the media type part of the response’s content type matches the given String |
| `assertMediaType(MediaType expectedType)` | Asserts that the media type part of the response’s content type matches the given [`MediaType`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html "akka.http.javadsl.model.MediaType")[`MediaType`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html "akka.http.scaladsl.model.MediaType") |
| `assertEntity(String expectedStringContent)` | Asserts that the entity data interpreted as UTF8 equals the expected String |
| `assertEntityBytes(ByteString expectedBytes)` | Asserts that the entity data bytes equal the expected ones |
| `assertEntityAs(Unmarshaller<T> unmarshaller, expectedValue: T)` | Asserts that the entity data if unmarshalled with the given marshaller equals the given value |
| `assertHeaderExists(HttpHeader expectedHeader)` | Asserts that the response contains an HttpHeader instance equal to the expected one |
| `assertHeaderKindExists(String expectedHeaderName)` | Asserts that the response contains a header with the expected name |
| `assertHeader(String name, String expectedValue)` | Asserts that the response contains a header with the given name and value. |

It’s, of course, possible to use any other means of writing assertions by inspecting the properties the response manually. As written above, `TestResponse.entity` and `TestResponse.response` return strict versions of the entity data.

## Supporting Custom Test Frameworks

Adding support for a custom test framework is achieved by creating new superclass analogous to `JUnitRouteTest` for writing tests with the custom test framework deriving from `akka.http.javadsl.testkit.RouteTest` and implementing its abstract methods. This will allow users of the test framework to use `testRoute` and to write assertions using the assertion methods defined on `TestResponse`.

## Testing sealed Routes

The section above describes how to test a “regular” branch of your route structure, which reacts to incoming requests with HTTP response parts or rejections. Sometimes, however, you will want to verify that your service also translates [Rejections](rejections.html) to HTTP responses in the way you expect.

You do this by calling the `Route.seal()` method. The `Route.seal()` method applies the logic of the in\-scope [ExceptionHandler](exception-handling.html) and [RejectionHandler](rejections.html#the-rejectionhandler) passed as method arguments to all exceptions and rejections coming back from the route, and translates them to the respective [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse").

Note that explicit call on the `Route.seal` method is needed in test code, but in your application code it is not necessary. As described in [Sealing a Route](routes.html#sealing-a-route), your application code only needs to bring implicit rejection and exception handlers in scope.

## Testing Route fragments

Since the testkit is request\-based, you cannot test requests that are illegal or impossible in HTTP. One such instance is testing a route that begins with the `pathEnd` directive, such as `routeFragment` here:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/TestKitFragmentSpec.scala#L21-L27 "Go to snippet source")pathEnd {
  get {
    complete {
      "Fragments of imagination"
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/MyAppFragment.java#L15-L19 "Go to snippet source")pathEnd(() ->
        get(() ->
                complete("Fragments of imagination")
        )
);
```

You might create a route such as this to be able to compose it into another route such as:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/FragmentExample.scala#L8-L23 "Go to snippet source")import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

object RouteFragment {
  val route: Route = pathEnd {
    get {
      complete("example")
    }
  }
}

object API {
  pathPrefix("version") {
    RouteFragment.route
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/MyAppFragment.java#L7-L23 "Go to snippet source")import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

public class MyAppFragment extends AllDirectives {

    public Route createRoute() {
        return
                pathEnd(() ->
                        get(() ->
                                complete("Fragments of imagination")
                        )
                );
    }

}
```

However, it is impossible to unit test this Route directly using testkit, since it is impossible to create an empty HTTP request. To test this type of route, embed it in a synthetic route in your test, such as `testRoute` in the example above.

This is what the full working test looks like:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/TestKitFragmentSpec.scala#L10-L52 "Go to snippet source")import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.server._
import Directives._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class TestKitFragmentSpec extends AnyWordSpec with Matchers with ScalatestRouteTest {

  val routeFragment =
      pathEnd {
        get {
          complete {
            "Fragments of imagination"
          }
        }
      }

  // Synthetic route to enable pathEnd testing
  val testRoute = {
    pathPrefix("test") {
      routeFragment
    }
  }

  "The service" should {
    "return a greeting for GET requests" in {
      // tests:
      Get("/test") ~> testRoute ~> check {
        responseAs[String] shouldEqual "Fragments of imagination"
      }
    }

    "return a MethodNotAllowed error for PUT requests to the root path" in {
      // tests:
      Put("/test") ~> Route.seal(testRoute) ~> check {
        status shouldEqual StatusCodes.MethodNotAllowed
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/TestKitFragmentTest.java#L8-L38 "Go to snippet source")import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;
import akka.http.javadsl.testkit.JUnitRouteTest;
import akka.http.javadsl.testkit.TestRoute;
import org.junit.Test;

public class TestKitFragmentTest extends JUnitRouteTest {
    class FragmentTester extends AllDirectives {
        public Route createRoute(Route fragment) {
            return
                    pathPrefix("test", () ->
                            fragment
                    );
        }
    }

    TestRoute fragment = testRoute(new MyAppFragment().createRoute());
    TestRoute testRoute = testRoute(new FragmentTester().createRoute(fragment.underlying()));

    @Test
    public void testFragment() {
        testRoute.run(HttpRequest.GET("/test"))
                .assertStatusCode(200)
                .assertEntity("Fragments of imagination");

        testRoute.run(HttpRequest.PUT("/test"))
                .assertStatusCode(StatusCodes.METHOD_NOT_ALLOWED);
    }
}
```

## Accounting for Slow Test Systems

The timeouts you consciously defined on your lightning fast development environment might be too tight for your, most probably, high\-loaded Continuous Integration server, invariably causing spurious failures. To account for such situations, timeout durations can be scaled by a given factor on such environments. Check the [Akka Docs](https://doc.akka.io/libraries/akka-core/2.10/testing.html#accounting-for-slow-test-systems) for further information.

## Increase Timeout

The default timeout when testing your routes using the testkit is 1 second3 seconds second. Sometimes, though, this might not be enough. In order to extend this default timeout, to say 5 seconds, just add the following implicit in scope:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/TestKitFragmentSpec.scala#L57-L61 "Go to snippet source")import scala.concurrent.duration._
import akka.http.scaladsl.testkit.RouteTestTimeout
import akka.testkit.TestDuration

implicit val timeout: RouteTestTimeout = RouteTestTimeout(5.seconds.dilated)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/WithTimeoutTest.java#L15-L18 "Go to snippet source")@Override
public FiniteDuration awaitDuration() {
    return FiniteDuration.create(5, TimeUnit.SECONDS);
}
```

Remember to configure the timeout using `dilated` if you want to account for slow test systems.

## Testing Actor integration

The `ScalatestRouteTest``JUnitRouteTest` still provides a Classic [`ActorSystem`](https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem"), so if you are not using the Classic API you will need to adapt it:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/TestKitWithActorSpec.scala#L8-L54 "Go to snippet source")import scala.concurrent.duration._
import scala.util.{ Failure, Success }

import akka.{ actor => untyped }
import akka.actor.testkit.typed.scaladsl.TestProbe
import akka.actor.typed.{ ActorRef, ActorSystem, Scheduler }
import akka.actor.typed.scaladsl.AskPattern._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.util.Timeout

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

object RouteUnderTest {
  case class Ping(replyTo: ActorRef[String])

  // Your route under test, scheduler is only needed as ask is used
  def route(someActor: ActorRef[Ping])(implicit scheduler: Scheduler, timeout: Timeout) = get {
    path("ping") {
      complete(someActor ? Ping.apply)
    }
  }
}

class TestKitWithActorSpec extends AnyWordSpec with Matchers with ScalatestRouteTest {
  import RouteUnderTest._

  // This test does not use the classic APIs,
  // so it needs to adapt the system:
  import akka.actor.typed.scaladsl.adapter._
  implicit val typedSystem: ActorSystem[_] = system.toTyped
  implicit val timeout: Timeout = Timeout(500.milliseconds)
  implicit val scheduler: untyped.Scheduler = system.scheduler

  "The service" should {
    "return a 'PONG!' response for GET requests to /ping" in {
      val probe = TestProbe[Ping]()
      val test = Get("/ping") ~> RouteUnderTest.route(probe.ref)
      val ping = probe.expectMessageType[Ping]
      ping.replyTo ! "PONG!"
      test ~> check {
        responseAs[String] shouldEqual "PONG!"
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/TestKitWithActorTest.java#L8-L34 "Go to snippet source")import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Adapter;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.testkit.JUnitRouteTest;

import akka.http.javadsl.testkit.TestRoute;
import akka.http.javadsl.testkit.TestRouteResult;
import org.junit.Test;

public class TestKitWithActorTest extends JUnitRouteTest {

    @Test
    public void returnPongForGetPing() {
        // This test does not use the classic APIs,
        // so it needs to adapt the system:
        ActorSystem<Void> system = Adapter.toTyped(system());

        TestProbe<MyAppWithActor.Ping> probe = TestProbe.create(system);
        TestRoute testRoute = testRoute(new MyAppWithActor().createRoute(probe.getRef(), system.scheduler()));

        TestRouteResult result = testRoute.run(HttpRequest.GET("/ping"));
        MyAppWithActor.Ping ping = probe.expectMessageClass(MyAppWithActor.Ping.class);
        ping.replyTo.tell("PONG!");
        result.assertEntity("PONG!");
    }
}
```

## Integration Testing Routes

Use `~!>` to test a route running in full HTTP server mode:

```
REQUEST ~!> ROUTE ~> check {
  ASSERTIONS
}

```

Certain routes can only be tested with `~!>`, for example routes that use the `withRequestTimeout` directive.

Note
Using `~!>` adds considerable extra overhead since each test will start a server and bind to a port so use it only when necessary.

## Examples

A great pool of examples are the tests for all the predefined directives in Akka HTTP. They can be found [here](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/server/directives)[here](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/java/akka/http/javadsl/server/directives).

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.11"
val AkkaHttpVersion = "10.7.4"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % AkkaHttpVersion
)
```

### Example 2: Dependency

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-http-testkit_${versions.ScalaBinary}"
}
```

### Example 3: Dependency

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-testkit_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 4: Usage

```scala
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.server._
import Directives._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FullTestKitExampleSpec extends AnyWordSpec with Matchers with ScalatestRouteTest {

  val smallRoute =
    get {
      concat(
        pathSingleSlash {
          complete {
            "Captain on the bridge!"
          }
        },
        path("ping") {
          complete("PONG!")
        }
      )
    }

  "The service" should {

    "return a greeting for GET requests to the root path" in {
      // tests:
      Get() ~> smallRoute ~> check {
        responseAs[String] shouldEqual "Captain on the bridge!"
      }
    }

    "return a 'PONG!' response for GET requests to /ping" in {
      // tests:
      Get("/ping") ~> smallRoute ~> check {
        responseAs[String] shouldEqual "PONG!"
      }
    }

    "leave GET requests to other paths unhandled" in {
      // tests:
      Get("/kermit") ~> smallRoute ~> check {
        handled shouldBe false
      }
    }

    "return a MethodNotAllowed error for PUT requests to the root path" in {
      // tests:
      Put() ~> Route.seal(smallRoute) ~> check {
        status shouldEqual StatusCodes.MethodNotAllowed
        responseAs[String] shouldEqual "HTTP method not allowed, supported methods: GET"
      }
    }
  }
}
```

### Example 5: Usage

```scala
import org.specs2.mutable.Specification
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.Specs2RouteTest
import akka.http.scaladsl.server._
import Directives._

class FullSpecs2TestKitExampleSpec extends Specification with Specs2RouteTest {

  val smallRoute =
    get {
      concat(
        pathSingleSlash {
          complete {
            "Captain on the bridge!"
          }
        },
        path("ping") {
          complete("PONG!")
        }
      )
    }

  "The service" should {

    "return a greeting for GET requests to the root path" in {
      // tests:
      Get() ~> smallRoute ~> check {
        responseAs[String] shouldEqual "Captain on the bridge!"
      }
    }

    "return a 'PONG!' response for GET requests to /ping" in {
      // tests:
      Get("/ping") ~> smallRoute ~> check {
        responseAs[String] shouldEqual "PONG!"
      }
    }

    "leave GET requests to other paths unhandled" in {
      // tests:
      Get("/kermit") ~> smallRoute ~> check {
        handled should beFalse
      }
    }

    "return a MethodNotAllowed error for PUT requests to the root path" in {
      // tests:
      Put() ~> Route.seal(smallRoute) ~> check {
        status shouldEqual StatusCodes.MethodNotAllowed
        responseAs[String] shouldEqual "HTTP method not allowed, supported methods: GET"
      }
    }
  }
}
```

### Example 6: Usage

```text
REQUEST ~> ROUTE ~> check {
  ASSERTIONS
}
```

### Example 7: Usage

```scala
status shouldEqual 200
```

### Example 8: Example

```java
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;
import akka.http.javadsl.server.examples.simple.SimpleServerApp;
import akka.http.javadsl.unmarshalling.StringUnmarshallers;

import java.io.IOException;

public class MyAppService extends AllDirectives {

  public String add(double x, double y) {
    return "x + y = " + (x + y);
  }

  public Route createRoute() {
    return
      get(() ->
        pathPrefix("calculator", () ->
          path("add", () ->
            parameter(StringUnmarshallers.DOUBLE, "x", x ->
              parameter(StringUnmarshallers.DOUBLE, "y", y ->
                complete(add(x, y))
              )
            )
          )
        )
      );
  }

  public static void main(String[] args) throws IOException {
    final ActorSystem system = ActorSystem.create();

    final SimpleServerApp app = new SimpleServerApp();

    Http.get(system).newServerAt("127.0.0.1", 8080).bind(app.createRoute());

    System.console().readLine("Type RETURN to exit...");
    system.terminate();
  }
}
```

### Example 9: Example

```java
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.testkit.JUnitRouteTest;
import akka.http.javadsl.testkit.TestRoute;
import org.junit.Test;

public class TestkitExampleTest extends JUnitRouteTest {
    TestRoute appRoute = testRoute(new MyAppService().createRoute());

    @Test
    public void testCalculatorAdd() {
        // test happy path
        appRoute.run(HttpRequest.GET("/calculator/add?x=4.2&y=2.3"))
            .assertStatusCode(200)
            .assertEntity("x + y = 6.5");

        // test responses to potential errors
        appRoute.run(HttpRequest.GET("/calculator/add?x=3.2"))
            .assertStatusCode(StatusCodes.NOT_FOUND) // 404
            .assertEntity("Request is missing required query parameter 'y'");

        // test responses to potential errors
        appRoute.run(HttpRequest.GET("/calculator/add?x=3.2&y=three"))
            .assertStatusCode(StatusCodes.BAD_REQUEST)
            .assertEntity("The query parameter 'y' was malformed:\n" +
                    "'three' is not a valid 64-bit floating point value");
    }
}
```

### Example 10: Testing Route fragments

```scala
pathEnd {
  get {
    complete {
      "Fragments of imagination"
    }
  }
}
```

### Example 11: Testing Route fragments

```java
pathEnd(() ->
        get(() ->
                complete("Fragments of imagination")
        )
);
```

### Example 12: Testing Route fragments

```scala
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

object RouteFragment {
  val route: Route = pathEnd {
    get {
      complete("example")
    }
  }
}

object API {
  pathPrefix("version") {
    RouteFragment.route
  }
}
```

### Example 13: Testing Route fragments

```java
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

public class MyAppFragment extends AllDirectives {

    public Route createRoute() {
        return
                pathEnd(() ->
                        get(() ->
                                complete("Fragments of imagination")
                        )
                );
    }

}
```

### Example 14: Testing Route fragments

```scala
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.server._
import Directives._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class TestKitFragmentSpec extends AnyWordSpec with Matchers with ScalatestRouteTest {

  val routeFragment =
      pathEnd {
        get {
          complete {
            "Fragments of imagination"
          }
        }
      }

  // Synthetic route to enable pathEnd testing
  val testRoute = {
    pathPrefix("test") {
      routeFragment
    }
  }

  "The service" should {
    "return a greeting for GET requests" in {
      // tests:
      Get("/test") ~> testRoute ~> check {
        responseAs[String] shouldEqual "Fragments of imagination"
      }
    }

    "return a MethodNotAllowed error for PUT requests to the root path" in {
      // tests:
      Put("/test") ~> Route.seal(testRoute) ~> check {
        status shouldEqual StatusCodes.MethodNotAllowed
      }
    }
  }
}
```

### Example 15: Testing Route fragments

```java
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;
import akka.http.javadsl.testkit.JUnitRouteTest;
import akka.http.javadsl.testkit.TestRoute;
import org.junit.Test;

public class TestKitFragmentTest extends JUnitRouteTest {
    class FragmentTester extends AllDirectives {
        public Route createRoute(Route fragment) {
            return
                    pathPrefix("test", () ->
                            fragment
                    );
        }
    }

    TestRoute fragment = testRoute(new MyAppFragment().createRoute());
    TestRoute testRoute = testRoute(new FragmentTester().createRoute(fragment.underlying()));

    @Test
    public void testFragment() {
        testRoute.run(HttpRequest.GET("/test"))
                .assertStatusCode(200)
                .assertEntity("Fragments of imagination");

        testRoute.run(HttpRequest.PUT("/test"))
                .assertStatusCode(StatusCodes.METHOD_NOT_ALLOWED);
    }
}
```

### Example 16: Increase Timeout

```scala
import scala.concurrent.duration._
import akka.http.scaladsl.testkit.RouteTestTimeout
import akka.testkit.TestDuration

implicit val timeout: RouteTestTimeout = RouteTestTimeout(5.seconds.dilated)
```

### Example 17: Increase Timeout

```java
@Override
public FiniteDuration awaitDuration() {
    return FiniteDuration.create(5, TimeUnit.SECONDS);
}
```

### Example 18: Testing Actor integration

```scala
import scala.concurrent.duration._
import scala.util.{ Failure, Success }

import akka.{ actor => untyped }
import akka.actor.testkit.typed.scaladsl.TestProbe
import akka.actor.typed.{ ActorRef, ActorSystem, Scheduler }
import akka.actor.typed.scaladsl.AskPattern._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.util.Timeout

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

object RouteUnderTest {
  case class Ping(replyTo: ActorRef[String])

  // Your route under test, scheduler is only needed as ask is used
  def route(someActor: ActorRef[Ping])(implicit scheduler: Scheduler, timeout: Timeout) = get {
    path("ping") {
      complete(someActor ? Ping.apply)
    }
  }
}

class TestKitWithActorSpec extends AnyWordSpec with Matchers with ScalatestRouteTest {
  import RouteUnderTest._

  // This test does not use the classic APIs,
  // so it needs to adapt the system:
  import akka.actor.typed.scaladsl.adapter._
  implicit val typedSystem: ActorSystem[_] = system.toTyped
  implicit val timeout: Timeout = Timeout(500.milliseconds)
  implicit val scheduler: untyped.Scheduler = system.scheduler

  "The service" should {
    "return a 'PONG!' response for GET requests to /ping" in {
      val probe = TestProbe[Ping]()
      val test = Get("/ping") ~> RouteUnderTest.route(probe.ref)
      val ping = probe.expectMessageType[Ping]
      ping.replyTo ! "PONG!"
      test ~> check {
        responseAs[String] shouldEqual "PONG!"
      }
    }
  }
}
```

### Example 19: Testing Actor integration

```java
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Adapter;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.testkit.JUnitRouteTest;

import akka.http.javadsl.testkit.TestRoute;
import akka.http.javadsl.testkit.TestRouteResult;
import org.junit.Test;

public class TestKitWithActorTest extends JUnitRouteTest {

    @Test
    public void returnPongForGetPing() {
        // This test does not use the classic APIs,
        // so it needs to adapt the system:
        ActorSystem<Void> system = Adapter.toTyped(system());

        TestProbe<MyAppWithActor.Ping> probe = TestProbe.create(system);
        TestRoute testRoute = testRoute(new MyAppWithActor().createRoute(probe.getRef(), system.scheduler()));

        TestRouteResult result = testRoute.run(HttpRequest.GET("/ping"));
        MyAppWithActor.Ping ping = probe.expectMessageClass(MyAppWithActor.Ping.class);
        ping.replyTo.tell("PONG!");
        result.assertEntity("PONG!");
    }
}
```

### Example 20: Integration Testing Routes

```text
REQUEST ~!> ROUTE ~> check {
  ASSERTIONS
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/testkit/RouteTest.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/2.10/testing.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/style-guide.html
- https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/testkit.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/testkit.html)*
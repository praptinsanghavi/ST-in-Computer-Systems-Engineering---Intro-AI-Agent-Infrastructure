---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeaders.html
title: respondWithDefaultHeaders • Akka HTTP
---

# respondWithDefaultHeaders • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# respondWithDefaultHeaders

## Signature

```
def respondWithDefaultHeaders(responseHeaders: HttpHeader*): Directive0
def respondWithDefaultHeaders(firstHeader: HttpHeader, otherHeaders: HttpHeader*): Directive0
def respondWithDefaultHeaders(responseHeaders: immutable.Seq[HttpHeader]): Directive0
```

## Description

Adds the given HTTP headers to all responses coming back from its inner route only if a respective header with the same name doesn’t exist yet in the response.

This directive transforms [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") and `ChunkedResponseStart` messages coming back from its inner route by potentially adding the given [`HttpHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html "akka.http.javadsl.model.HttpHeader")[`HttpHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html "akka.http.scaladsl.model.HttpHeader") instances to the headers list. A header is only added if there is no header instance with the same name (case insensitively) already present in the response.

See also [respondWithDefaultHeader](respondWithDefaultHeader.html) if you’d like to add only a single header.

## Example

The `respondWithDefaultHeaders` directive is equivalent to the `respondWithDefaultHeader` directive which is shown in the example below, however it allows including multiple default headers at once in the directive, like so:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RespondWithDirectivesExamplesSpec.scala#L15-L17 "Go to snippet source")respondWithDefaultHeaders(
  Origin(HttpOrigin("http://akka.io")),
  RawHeader("X-Fish-Name", "Blippy")) { ??? }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RespondWithDirectivesExamplesTest.java#L20-L61 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeaders;

final List<HttpHeader> headers = Arrays.asList(
        Origin.create(HttpOrigin.parse("http://akka.io")),
        RawHeader.create("X-Fish-Name", "Blippy"));
respondWithDefaultHeaders(headers, () ->
        /*...*/
        complete("Blip!"));
```

The semantics remain the same however, as explained by the following example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RespondWithDirectivesExamplesSpec.scala#L40-L75 "Go to snippet source")// custom headers
val blippy = RawHeader("X-Fish-Name", "Blippy")
val elTonno = RawHeader("X-Fish-Name", "El Tonno")

// format: OFF
// by default always include the Blippy header,
// unless a more specific X-Fish-Name is given by the inner route
val route =
  respondWithDefaultHeader(blippy) {  //  blippy
    respondWithHeader(elTonno) {      // /  el tonno
      path("el-tonno") {              // | /
        complete("¡Ay blippy!")       // | |- el tonno
      } ~                             // | |
      path("los-tonnos") {            // | |
        complete("¡Ay ay blippy!")    // | |- el tonno
      }                               // | |
    } ~                               // | x
    complete("Blip!")                 // |- blippy
  } // x
// format: ON

// tests:
Get("/") ~> route ~> check {
  header("X-Fish-Name") shouldEqual Some(RawHeader("X-Fish-Name", "Blippy"))
  responseAs[String] shouldEqual "Blip!"
}

Get("/el-tonno") ~> route ~> check {
  header("X-Fish-Name") shouldEqual Some(RawHeader("X-Fish-Name", "El Tonno"))
  responseAs[String] shouldEqual "¡Ay blippy!"
}

Get("/los-tonnos") ~> route ~> check {
  header("X-Fish-Name") shouldEqual Some(RawHeader("X-Fish-Name", "El Tonno"))
  responseAs[String] shouldEqual "¡Ay ay blippy!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RespondWithDirectivesExamplesTest.java#L45-L177 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeaders;
import static akka.http.javadsl.server.Directives.respondWithHeader;

//custom headers
final RawHeader blippy = RawHeader.create("X-Fish-Name", "Blippy");
final HttpHeader akka = Origin.create(HttpOrigin.parse("http://akka.io"));
final List<HttpHeader> defaultHeaders = Arrays.asList(blippy, akka);
final RawHeader elTonno = RawHeader.create("X-Fish-Name", "El Tonno");

// format: OFF
// by default always include the Blippy and Akka headers,
// unless a more specific X-Fish-Name is given by the inner route
final Route route =
        respondWithDefaultHeaders(defaultHeaders, () ->            // blippy and akka
                respondWithHeader(elTonno, () ->                   // / el tonno
                        path("el-tonno", () ->                     // | /
                                complete("¡Ay blippy!")            // | |- el tonno
                        ).orElse(                                  // | |
                                path("los-tonnos", () ->           // | |
                                        complete("¡Ay ay blippy!") // | |- el tonno
                                )                                  // | |
                        )                                          // | |
                ).orElse(                                          // | x
                        complete("Blip!")                          // |- blippy and akka
                )                                                  // x
        );
//format: ON

testRoute(route).run(HttpRequest.GET("/"))
        .assertHeaderExists("X-Fish-Name", "Blippy")
        .assertHeaderExists("Origin", "http://akka.io")
        .assertEntity("Blip!");

testRoute(route).run(HttpRequest.GET("/el-tonno"))
        .assertHeaderExists("X-Fish-Name", "El Tonno")
        .assertEntity("¡Ay blippy!");

testRoute(route).run(HttpRequest.GET("/los-tonnos"))
        .assertHeaderExists("X-Fish-Name", "El Tonno")
        .assertEntity("¡Ay ay blippy!");
```

See the [respondWithDefaultHeader](respondWithDefaultHeader.html) directive for an example with only one header.

## Code Examples

### Example 1: Signature

```scala
def respondWithDefaultHeaders(responseHeaders: HttpHeader*): Directive0
def respondWithDefaultHeaders(firstHeader: HttpHeader, otherHeaders: HttpHeader*): Directive0
def respondWithDefaultHeaders(responseHeaders: immutable.Seq[HttpHeader]): Directive0
```

### Example 2: Example

```scala
respondWithDefaultHeaders(
  Origin(HttpOrigin("http://akka.io")),
  RawHeader("X-Fish-Name", "Blippy")) { ??? }
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeaders;

final List<HttpHeader> headers = Arrays.asList(
        Origin.create(HttpOrigin.parse("http://akka.io")),
        RawHeader.create("X-Fish-Name", "Blippy"));
respondWithDefaultHeaders(headers, () ->
        /*...*/
        complete("Blip!"));
```

### Example 4: Example

```scala
// custom headers
val blippy = RawHeader("X-Fish-Name", "Blippy")
val elTonno = RawHeader("X-Fish-Name", "El Tonno")

// format: OFF
// by default always include the Blippy header,
// unless a more specific X-Fish-Name is given by the inner route
val route =
  respondWithDefaultHeader(blippy) {  //  blippy
    respondWithHeader(elTonno) {      // /  el tonno
      path("el-tonno") {              // | /
        complete("¡Ay blippy!")       // | |- el tonno
      } ~                             // | |
      path("los-tonnos") {            // | |
        complete("¡Ay ay blippy!")    // | |- el tonno
      }                               // | |
    } ~                               // | x
    complete("Blip!")                 // |- blippy
  } // x
// format: ON

// tests:
Get("/") ~> route ~> check {
  header("X-Fish-Name") shouldEqual Some(RawHeader("X-Fish-Name", "Blippy"))
  responseAs[String] shouldEqual "Blip!"
}

Get("/el-tonno") ~> route ~> check {
  header("X-Fish-Name") shouldEqual Some(RawHeader("X-Fish-Name", "El Tonno"))
  responseAs[String] shouldEqual "¡Ay blippy!"
}

Get("/los-tonnos") ~> route ~> check {
  header("X-Fish-Name") shouldEqual Some(RawHeader("X-Fish-Name", "El Tonno"))
  responseAs[String] shouldEqual "¡Ay ay blippy!"
}
```

### Example 5: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeaders;
import static akka.http.javadsl.server.Directives.respondWithHeader;

//custom headers
final RawHeader blippy = RawHeader.create("X-Fish-Name", "Blippy");
final HttpHeader akka = Origin.create(HttpOrigin.parse("http://akka.io"));
final List<HttpHeader> defaultHeaders = Arrays.asList(blippy, akka);
final RawHeader elTonno = RawHeader.create("X-Fish-Name", "El Tonno");

// format: OFF
// by default always include the Blippy and Akka headers,
// unless a more specific X-Fish-Name is given by the inner route
final Route route =
        respondWithDefaultHeaders(defaultHeaders, () ->            // blippy and akka
                respondWithHeader(elTonno, () ->                   // / el tonno
                        path("el-tonno", () ->                     // | /
                                complete("¡Ay blippy!")            // | |- el tonno
                        ).orElse(                                  // | |
                                path("los-tonnos", () ->           // | |
                                        complete("¡Ay ay blippy!") // | |- el tonno
                                )                                  // | |
                        )                                          // | |
                ).orElse(                                          // | x
                        complete("Blip!")                          // |- blippy and akka
                )                                                  // x
        );
//format: ON

testRoute(route).run(HttpRequest.GET("/"))
        .assertHeaderExists("X-Fish-Name", "Blippy")
        .assertHeaderExists("Origin", "http://akka.io")
        .assertEntity("Blip!");

testRoute(route).run(HttpRequest.GET("/el-tonno"))
        .assertHeaderExists("X-Fish-Name", "El Tonno")
        .assertEntity("¡Ay blippy!");

testRoute(route).run(HttpRequest.GET("/los-tonnos"))
        .assertHeaderExists("X-Fish-Name", "El Tonno")
        .assertEntity("¡Ay ay blippy!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeader.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeader.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeaders.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeaders.html)*
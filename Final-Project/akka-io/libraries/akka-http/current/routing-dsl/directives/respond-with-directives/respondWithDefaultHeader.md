---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeader.html
title: respondWithDefaultHeader • Akka HTTP
---

# respondWithDefaultHeader • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# respondWithDefaultHeader

## Signature

```
def respondWithDefaultHeader(responseHeader: HttpHeader): Directive0
```

## Description

Adds a given HTTP header to all responses coming back from its inner route only if a header with the same name doesn’t exist yet in the response.

This directive transforms [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") and `ChunkedResponseStart` messages coming back from its inner route by potentially adding the given [`HttpHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html "akka.http.javadsl.model.HttpHeader")[`HttpHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html "akka.http.scaladsl.model.HttpHeader") instance to the headers list. The header is only added if there is no header instance with the same name (case insensitively) already present in the response.

See also [respondWithDefaultHeaders](respondWithDefaultHeaders.html) if you’d like to add more than one header.

## Example

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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RespondWithDirectivesExamplesTest.java#L31-L114 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeader;
import static akka.http.javadsl.server.Directives.respondWithHeader;

//custom headers
final RawHeader blippy = RawHeader.create("X-Fish-Name", "Blippy");
final RawHeader elTonno = RawHeader.create("X-Fish-Name", "El Tonno");

// format: OFF
// by default always include the Blippy header,
// unless a more specific X-Fish-Name is given by the inner route
final Route route =
        respondWithDefaultHeader(blippy, () ->                      // blippy
                respondWithHeader(elTonno, () ->                    // / el tonno
                        path("el-tonno", () ->                      // | /
                                complete("¡Ay blippy!")             // | |- el tonno
                        ).orElse(                                   // | |
                                path("los-tonnos", () ->            // | |
                                        complete("¡Ay ay blippy!")  // | |- el tonno
                                )                                   // | |
                        )                                           // | |
                ).orElse(                                           // | x
                        complete("Blip!")                           // |- blippy
                )                                                   // x
        );
//format: ON

testRoute(route).run(HttpRequest.GET("/"))
        .assertHeaderExists("X-Fish-Name", "Blippy")
        .assertEntity("Blip!");

testRoute(route).run(HttpRequest.GET("/el-tonno"))
        .assertHeaderExists("X-Fish-Name", "El Tonno")
        .assertEntity("¡Ay blippy!");

testRoute(route).run(HttpRequest.GET("/los-tonnos"))
        .assertHeaderExists("X-Fish-Name", "El Tonno")
        .assertEntity("¡Ay ay blippy!");
```

## Code Examples

### Example 1: Signature

```scala
def respondWithDefaultHeader(responseHeader: HttpHeader): Directive0
```

### Example 2: Example

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

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeader;
import static akka.http.javadsl.server.Directives.respondWithHeader;

//custom headers
final RawHeader blippy = RawHeader.create("X-Fish-Name", "Blippy");
final RawHeader elTonno = RawHeader.create("X-Fish-Name", "El Tonno");

// format: OFF
// by default always include the Blippy header,
// unless a more specific X-Fish-Name is given by the inner route
final Route route =
        respondWithDefaultHeader(blippy, () ->                      // blippy
                respondWithHeader(elTonno, () ->                    // / el tonno
                        path("el-tonno", () ->                      // | /
                                complete("¡Ay blippy!")             // | |- el tonno
                        ).orElse(                                   // | |
                                path("los-tonnos", () ->            // | |
                                        complete("¡Ay ay blippy!")  // | |- el tonno
                                )                                   // | |
                        )                                           // | |
                ).orElse(                                           // | x
                        complete("Blip!")                           // |- blippy
                )                                                   // x
        );
//format: ON

testRoute(route).run(HttpRequest.GET("/"))
        .assertHeaderExists("X-Fish-Name", "Blippy")
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
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeaders.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeader.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeader.html)*
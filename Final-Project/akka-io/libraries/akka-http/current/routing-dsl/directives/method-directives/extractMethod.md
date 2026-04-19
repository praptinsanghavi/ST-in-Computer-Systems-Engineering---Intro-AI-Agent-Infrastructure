---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/extractMethod.html
title: extractMethod • Akka HTTP
---

# extractMethod • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractMethod

## Signature

```
def extractMethod: Directive1[HttpMethod]
```

## Description

Extracts the [`HttpMethod`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html "akka.http.javadsl.model.HttpMethod")[`HttpMethod`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html "akka.http.scaladsl.model.HttpMethod") from the request context and provides it for use for other directives explicitly.

## Example

In the below example our route first matches all `GET` requests, and if an incoming request wasn’t a `GET`, the matching continues and the extractMethod route will be applied which we can use to programatically print what type of request it was \- independent of what actual HttpMethod it was:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L109-L129 "Go to snippet source")val route =
  concat(
    get {
      complete("This is a GET request.")
    },
    extractMethod { method =>
      complete(s"This ${method.name} request, clearly is not a GET!")
    }
  )

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is a GET request."
}

Put("/") ~> route ~> check {
  responseAs[String] shouldEqual "This PUT request, clearly is not a GET!"
}
Head("/") ~> route ~> check {
  responseAs[String] shouldEqual "This HEAD request, clearly is not a GET!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L51-L169 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.extractMethod;

final Route route = concat(
    get(() ->
        complete("This is a GET request.")
    ),
    extractMethod(method ->
        complete("This " + method.value() + " request, clearly is not a GET!")
    )
);

testRoute(route).run(HttpRequest.GET("/")).assertEntity(
    "This is a GET request.");

testRoute(route).run(HttpRequest.PUT("/").withEntity("put content"))
    .assertEntity("This PUT request, clearly is not a GET!");

testRoute(route).run(HttpRequest.HEAD("/")).assertEntity(
    "This HEAD request, clearly is not a GET!");
```

## Custom Http Method

When you define a custom HttpMethod, you can define a route using extractMethod.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CustomHttpMethodSpec.scala#L26-L45 "Go to snippet source")import akka.http.scaladsl.settings.{ ParserSettings, ServerSettings }

// define custom method type:
val BOLT = HttpMethod.custom("BOLT", safe = false,
  idempotent = true, requestEntityAcceptance = Expected, contentLengthAllowed = true)

// add custom method to parser settings:
val parserSettings = ParserSettings.forServer(system).withCustomMethods(BOLT)
val serverSettings = ServerSettings(system).withParserSettings(parserSettings)

val routes = extractMethod { method =>
  complete(s"This is a ${method.name} method request.")
}
val binding = Http().newServerAt(host, port).withSettings(serverSettings).bind(routes)

val request = HttpRequest(BOLT, s"http://$host:$port/", protocol = `HTTP/1.1`)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CustomHttpMethodExamplesTest.java#L32-L75 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractMethod;

// define custom method type:
HttpMethod BOLT =
  HttpMethods.custom("BOLT", false, true, Expected);

// add custom method to parser settings:
final ParserSettings parserSettings =
  ParserSettings.forServer(system).withCustomMethods(BOLT);
final ServerSettings serverSettings =
  ServerSettings.create(system).withParserSettings(parserSettings);

final Route routes = concat(
  extractMethod( method ->
    complete( "This is a " + method.name() + " request.")
  )
);
final Http http = Http.get(system);
final CompletionStage<ServerBinding> binding =
  http.newServerAt(host, port)
      .withSettings(serverSettings)
      .logTo(loggingAdapter)
      .bind(routes);

HttpRequest request = HttpRequest.create()
  .withUri("http://" + host + ":" + Integer.toString(port))
  .withMethod(BOLT)
  .withProtocol(HTTP_1_1);

CompletionStage<HttpResponse> response = http.singleRequest(request);
```

## Code Examples

### Example 1: Signature

```scala
def extractMethod: Directive1[HttpMethod]
```

### Example 2: Example

```scala
val route =
  concat(
    get {
      complete("This is a GET request.")
    },
    extractMethod { method =>
      complete(s"This ${method.name} request, clearly is not a GET!")
    }
  )

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is a GET request."
}

Put("/") ~> route ~> check {
  responseAs[String] shouldEqual "This PUT request, clearly is not a GET!"
}
Head("/") ~> route ~> check {
  responseAs[String] shouldEqual "This HEAD request, clearly is not a GET!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.extractMethod;


final Route route = concat(
    get(() ->
        complete("This is a GET request.")
    ),
    extractMethod(method ->
        complete("This " + method.value() + " request, clearly is not a GET!")
    )
);

testRoute(route).run(HttpRequest.GET("/")).assertEntity(
    "This is a GET request.");

testRoute(route).run(HttpRequest.PUT("/").withEntity("put content"))
    .assertEntity("This PUT request, clearly is not a GET!");

testRoute(route).run(HttpRequest.HEAD("/")).assertEntity(
    "This HEAD request, clearly is not a GET!");
```

### Example 4: Custom Http Method

```scala
import akka.http.scaladsl.settings.{ ParserSettings, ServerSettings }

// define custom method type:
val BOLT = HttpMethod.custom("BOLT", safe = false,
  idempotent = true, requestEntityAcceptance = Expected, contentLengthAllowed = true)

// add custom method to parser settings:
val parserSettings = ParserSettings.forServer(system).withCustomMethods(BOLT)
val serverSettings = ServerSettings(system).withParserSettings(parserSettings)

val routes = extractMethod { method =>
  complete(s"This is a ${method.name} method request.")
}
val binding = Http().newServerAt(host, port).withSettings(serverSettings).bind(routes)

val request = HttpRequest(BOLT, s"http://$host:$port/", protocol = `HTTP/1.1`)
```

### Example 5: Custom Http Method

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractMethod;


// define custom method type:
HttpMethod BOLT =
  HttpMethods.custom("BOLT", false, true, Expected);

// add custom method to parser settings:
final ParserSettings parserSettings =
  ParserSettings.forServer(system).withCustomMethods(BOLT);
final ServerSettings serverSettings =
  ServerSettings.create(system).withParserSettings(parserSettings);

final Route routes = concat(
  extractMethod( method ->
    complete( "This is a " + method.name() + " request.")
  )
);
final Http http = Http.get(system);
final CompletionStage<ServerBinding> binding =
  http.newServerAt(host, port)
      .withSettings(serverSettings)
      .logTo(loggingAdapter)
      .bind(routes);

HttpRequest request = HttpRequest.create()
  .withUri("http://" + host + ":" + Integer.toString(port))
  .withMethod(BOLT)
  .withProtocol(HTTP_1_1);

CompletionStage<HttpResponse> response = http.singleRequest(request);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/delete.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/get.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/extractMethod.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/extractMethod.html)*
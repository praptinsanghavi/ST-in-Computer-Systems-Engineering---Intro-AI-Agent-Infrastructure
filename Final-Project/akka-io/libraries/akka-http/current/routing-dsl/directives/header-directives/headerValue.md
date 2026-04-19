---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValue.html
title: headerValue • Akka HTTP
---

# headerValue • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# headerValue

## Signature

```
def headerValue[T](f: HttpHeader => Option[T]): Directive1[T]
```

## Description

Traverses the list of request headers with the specified function and extracts the first value the function returns as `Some(value)`a non empty `Optional<T>`.

The headerValue directive is a mixture of `map` and `find` on the list of request headers. The specified function is called once for each header until the function returns `Some(value)`a non empty `Optional<T>`. This value is extracted and presented to the inner route. If the function throws an exception the request is rejected with a [`MalformedHeaderRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html "akka.http.javadsl.server.MalformedHeaderRejection")[`MalformedHeaderRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedHeaderRejection.html "akka.http.scaladsl.server.MalformedHeaderRejection"). If the function returns `None``Optional.empty()` for every header the request is rejected as “NotFound”.

This directive is the basis for building other request header related directives.

See also [headerValuePF](headerValuePF.html) for a nicer syntactic alternative.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L36-L53 "Go to snippet source")def extractHostPort: HttpHeader => Option[Int] = {
  case h: `Host` => Some(h.port)
  case x         => None
}

val route =
  headerValue(extractHostPort) { port =>
    complete(s"The port was $port")
  }

// tests:
Get("/") ~> Host("example.com", 5043) ~> route ~> check {
  responseAs[String] shouldEqual "The port was 5043"
}
Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual NotFound
  responseAs[String] shouldEqual "The requested resource could not be found."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L30-L104 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.headerValue;

final Function<HttpHeader, Optional<Host>> extractHostPort = header -> {
  if (header instanceof Host) {
    return Optional.of((Host) header);
  } else {
    return Optional.empty();
  }
};

final Route route = headerValue(extractHostPort, host ->
  complete("The port was " + host.port())
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("example.com", 5043)))
  .assertEntity("The port was 5043");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The requested resource could not be found.");
```

### Get headerValue or return a default value

Using [provide](../basic-directives/provide.html) and [composing directives](../index.html#composing-directives) one can build a pattern where a headerValue is extracted if available or a default is returned. 

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L58-L76 "Go to snippet source")val exampleHeaderValue = "exampleHeaderValue".toLowerCase
def extractExampleHeader: HttpHeader => Option[String] = {
  case HttpHeader(`exampleHeaderValue`, value) => Some(value)
  case _                                       => None
}

val route =
  (headerValue(extractExampleHeader) | provide("newValue")) { value =>
    complete(s"headerValue $value")
  }

// tests:
Get("/") ~> RawHeader("exampleHeaderValue", "theHeaderValue") ~> route ~> check {
  responseAs[String] shouldEqual "headerValue theHeaderValue"
}

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "headerValue newValue"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L35-L130 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.anyOf;
final Function<HttpHeader, Optional<String>> extractExampleHeader = header -> {
  if (header.is("x-example-header")) {
    return Optional.of(header.value());
  } else {
    return Optional.empty();
  }
};

final Route route = anyOf(
  bindParameter(Directives::headerValue, extractExampleHeader),
  bindParameter(Directives::provide, "newValue"),
  (String value) -> complete("header is " + value));

// tests:
final RawHeader exampleHeader = RawHeader.create("X-Example-Header", "theHeaderValue");
testRoute(route).run(HttpRequest.GET("/").addHeader(exampleHeader))
  .assertEntity("header is theHeaderValue");

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("header is newValue");
```

## Code Examples

### Example 1: Signature

```scala
def headerValue[T](f: HttpHeader => Option[T]): Directive1[T]
```

### Example 2: Example

```scala
def extractHostPort: HttpHeader => Option[Int] = {
  case h: `Host` => Some(h.port)
  case x         => None
}

val route =
  headerValue(extractHostPort) { port =>
    complete(s"The port was $port")
  }

// tests:
Get("/") ~> Host("example.com", 5043) ~> route ~> check {
  responseAs[String] shouldEqual "The port was 5043"
}
Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual NotFound
  responseAs[String] shouldEqual "The requested resource could not be found."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.headerValue;

final Function<HttpHeader, Optional<Host>> extractHostPort = header -> {
  if (header instanceof Host) {
    return Optional.of((Host) header);
  } else {
    return Optional.empty();
  }
};

final Route route = headerValue(extractHostPort, host ->
  complete("The port was " + host.port())
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("example.com", 5043)))
  .assertEntity("The port was 5043");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The requested resource could not be found.");
```

### Example 4: Get headerValue or return a default value

```scala
val exampleHeaderValue = "exampleHeaderValue".toLowerCase
def extractExampleHeader: HttpHeader => Option[String] = {
  case HttpHeader(`exampleHeaderValue`, value) => Some(value)
  case _                                       => None
}

val route =
  (headerValue(extractExampleHeader) | provide("newValue")) { value =>
    complete(s"headerValue $value")
  }

// tests:
Get("/") ~> RawHeader("exampleHeaderValue", "theHeaderValue") ~> route ~> check {
  responseAs[String] shouldEqual "headerValue theHeaderValue"
}

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "headerValue newValue"
}
```

### Example 5: Get headerValue or return a default value

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.anyOf;
final Function<HttpHeader, Optional<String>> extractExampleHeader = header -> {
  if (header.is("x-example-header")) {
    return Optional.of(header.value());
  } else {
    return Optional.empty();
  }
};

final Route route = anyOf(
  bindParameter(Directives::headerValue, extractExampleHeader),
  bindParameter(Directives::provide, "newValue"),
  (String value) -> complete("header is " + value));

// tests:
final RawHeader exampleHeader = RawHeader.create("X-Example-Header", "theHeaderValue");
testRoute(route).run(HttpRequest.GET("/").addHeader(exampleHeader))
  .assertEntity("header is theHeaderValue");

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("header is newValue");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/provide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByName.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValuePF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValue.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValue.html)*
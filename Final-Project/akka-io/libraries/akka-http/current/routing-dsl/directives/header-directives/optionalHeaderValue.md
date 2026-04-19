---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValue.html
title: optionalHeaderValue • Akka HTTP
---

# optionalHeaderValue • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# optionalHeaderValue

## Signature

```
def optionalHeaderValue[T](f: HttpHeader => Option[T]): Directive1[Option[T]]
```

## Description

Traverses the list of request headers with the specified function and extracts the first value the function returns as `Some(value)`a non empty `Optional<T>`.

The `optionalHeaderValue` directive is similar to the [headerValue](headerValue.html) directive but always extracts an `Option``Optional` value instead of rejecting the request if no matching header could be found.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L81-L106 "Go to snippet source")def extractHostPort: HttpHeader => Option[Int] = {
  case h: `Host` => Some(h.port)
  case x         => None
}

val route =
  optionalHeaderValue(extractHostPort) {
    case Some(port) => complete(s"The port was $port")
    case None       => complete(s"The port was not provided explicitly")
  } ~ // can also be written as:
    optionalHeaderValue(extractHostPort) { port =>
      complete {
        port match {
          case Some(p) => s"The port was $p"
          case _       => "The port was not provided explicitly"
        }
      }
    }

// tests:
Get("/") ~> Host("example.com", 5043) ~> route ~> check {
  responseAs[String] shouldEqual "The port was 5043"
}
Get("/") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The port was not provided explicitly"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L56-L229 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalHeaderValue;

final Function<HttpHeader, Optional<Integer>> extractHostPort = header -> {
  if (header instanceof Host) {
    return Optional.of(((Host) header).port());
  } else {
    return Optional.empty();
  }
};

final Route route = optionalHeaderValue(extractHostPort, port -> {
  if (port.isPresent()) {
    return complete("The port was " + port.get());
  } else {
    return complete("The port was not provided explicitly");
  }
});

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("example.com", 5043)))
  .assertEntity("The port was 5043");

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("The port was not provided explicitly");
```

## Code Examples

### Example 1: Signature

```scala
def optionalHeaderValue[T](f: HttpHeader => Option[T]): Directive1[Option[T]]
```

### Example 2: Example

```scala
def extractHostPort: HttpHeader => Option[Int] = {
  case h: `Host` => Some(h.port)
  case x         => None
}

val route =
  optionalHeaderValue(extractHostPort) {
    case Some(port) => complete(s"The port was $port")
    case None       => complete(s"The port was not provided explicitly")
  } ~ // can also be written as:
    optionalHeaderValue(extractHostPort) { port =>
      complete {
        port match {
          case Some(p) => s"The port was $p"
          case _       => "The port was not provided explicitly"
        }
      }
    }

// tests:
Get("/") ~> Host("example.com", 5043) ~> route ~> check {
  responseAs[String] shouldEqual "The port was 5043"
}
Get("/") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The port was not provided explicitly"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalHeaderValue;

final Function<HttpHeader, Optional<Integer>> extractHostPort = header -> {
  if (header instanceof Host) {
    return Optional.of(((Host) header).port());
  } else {
    return Optional.empty();
  }
};

final Route route = optionalHeaderValue(extractHostPort, port -> {
  if (port.isPresent()) {
    return complete("The port was " + port.get());
  } else {
    return complete("The port was not provided explicitly");
  }
});

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("example.com", 5043)))
  .assertEntity("The port was 5043");

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("The port was not provided explicitly");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValue.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValuePF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByName.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValue.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValue.html)*
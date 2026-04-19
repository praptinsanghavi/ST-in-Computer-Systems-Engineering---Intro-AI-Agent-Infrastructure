---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValuePF.html
title: optionalHeaderValuePF • Akka HTTP
---

# optionalHeaderValuePF • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# optionalHeaderValuePF

## Signature

```
def optionalHeaderValuePF[T](pf: PartialFunction[HttpHeader, T]): Directive1[Option[T]]
```

## Description

Calls the specified partial function with the first request header the function is `isDefinedAt` and extracts the result of calling the function.

The `optionalHeaderValuePF` directive is similar to the [headerValuePF](headerValuePF.html) directive but always extracts an `Option``Optional` value instead of rejecting the request if no matching header could be found.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L157-L181 "Go to snippet source")def extractHostPort: PartialFunction[HttpHeader, Int] = {
  case h: `Host` => h.port
}

val route =
  optionalHeaderValuePF(extractHostPort) {
    case Some(port) => complete(s"The port was $port")
    case None       => complete(s"The port was not provided explicitly")
  } ~ // can also be written as:
    optionalHeaderValuePF(extractHostPort) { port =>
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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L71-L310 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalHeaderValuePF;

final PartialFunction<HttpHeader, Integer> extractHostPort =
  new JavaPartialFunction<HttpHeader, Integer>() {
    @Override
    public Integer apply(HttpHeader x, boolean isCheck) throws Exception {
      if (x instanceof Host) {
        if (isCheck) {
          return null;
        } else {
          return ((Host) x).port();
        }
      } else {
        throw noMatch();
      }
    }
  };

final Route route = optionalHeaderValuePF(extractHostPort, port -> {
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
def optionalHeaderValuePF[T](pf: PartialFunction[HttpHeader, T]): Directive1[Option[T]]
```

### Example 2: Example

```scala
def extractHostPort: PartialFunction[HttpHeader, Int] = {
  case h: `Host` => h.port
}

val route =
  optionalHeaderValuePF(extractHostPort) {
    case Some(port) => complete(s"The port was $port")
    case None       => complete(s"The port was not provided explicitly")
  } ~ // can also be written as:
    optionalHeaderValuePF(extractHostPort) { port =>
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
import static akka.http.javadsl.server.Directives.optionalHeaderValuePF;

final PartialFunction<HttpHeader, Integer> extractHostPort =
  new JavaPartialFunction<HttpHeader, Integer>() {
    @Override
    public Integer apply(HttpHeader x, boolean isCheck) throws Exception {
      if (x instanceof Host) {
        if (isCheck) {
          return null;
        } else {
          return ((Host) x).port();
        }
      } else {
        throw noMatch();
      }
    }
  };

final Route route = optionalHeaderValuePF(extractHostPort, port -> {
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
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/checkSameOrigin.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValuePF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByType.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValuePF.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValuePF.html)*
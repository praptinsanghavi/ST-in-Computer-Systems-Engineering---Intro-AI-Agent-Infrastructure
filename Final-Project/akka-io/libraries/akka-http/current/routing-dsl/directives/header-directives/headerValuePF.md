---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:32Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValuePF.html
title: headerValuePF • Akka HTTP
---

# headerValuePF • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# headerValuePF

## Signature

```
def headerValuePF[T](pf: PartialFunction[HttpHeader, T]): Directive1[T]
```

## Description

Calls the specified partial function with the first request header the function is `isDefinedAt` and extracts the result of calling the function.

The `headerValuePF` directive is an alternative syntax version of [headerValue](headerValue.html).

If the function throws an exception the request is rejected with a [`MalformedHeaderRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html "akka.http.javadsl.server.MalformedHeaderRejection")[`MalformedHeaderRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedHeaderRejection.html "akka.http.scaladsl.server.MalformedHeaderRejection").

If the function is not defined for any header the request is rejected as “NotFound”.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L136-L152 "Go to snippet source")def extractHostPort: PartialFunction[HttpHeader, Int] = {
  case h: `Host` => h.port
}

val route =
  headerValuePF(extractHostPort) { port =>
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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L51-L201 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.headerValuePF;

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

final Route route = headerValuePF(extractHostPort, port ->
  complete("The port was " + port)
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("example.com", 5043)))
  .assertEntity("The port was 5043");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The requested resource could not be found.");
```

## Code Examples

### Example 1: Signature

```scala
def headerValuePF[T](pf: PartialFunction[HttpHeader, T]): Directive1[T]
```

### Example 2: Example

```scala
def extractHostPort: PartialFunction[HttpHeader, Int] = {
  case h: `Host` => h.port
}

val route =
  headerValuePF(extractHostPort) { port =>
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
import static akka.http.javadsl.server.Directives.headerValuePF;

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

final Route route = headerValuePF(extractHostPort, port ->
  complete("The port was " + port)
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("example.com", 5043)))
  .assertEntity("The port was 5043");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("The requested resource could not be found.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValue.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByType.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValue.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValuePF.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValuePF.html)*
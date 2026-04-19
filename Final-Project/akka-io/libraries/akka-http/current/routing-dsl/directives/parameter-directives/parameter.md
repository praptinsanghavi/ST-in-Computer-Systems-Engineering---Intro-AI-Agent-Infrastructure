---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameter.html
title: parameter • Akka HTTP
---

# parameter • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# parameter

## Description

Extracts a *query* parameter value from the requestrequest and provides it to the inner route as a `String`.

In the Scala API, `parameter` is an alias for `parameters` and you can use both directives to extract any number of parameter values. For a detailed description about how to extract one or more parameters see [parameters](parameters.html).

See [When to use which parameter directive?](index.html#which-parameter-directive) to understand when to use which directive.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L16-L29 "Go to snippet source")val route =
  parameter("color") { color =>
    complete(s"The color is '$color'")
  }

// tests:
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue'"
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Request is missing required query parameter 'color'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ParameterDirectivesExamplesTest.java#L19-L75 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameter;

final Route route = parameter("color", color ->
  complete("The color is '" + color + "'")
);

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue"))
  .assertEntity("The color is 'blue'");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Request is missing required query parameter 'color'");
```

## Code Examples

### Example 1: Example

```scala
val route =
  parameter("color") { color =>
    complete(s"The color is '$color'")
  }

// tests:
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue'"
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Request is missing required query parameter 'color'"
}
```

### Example 2: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameter;

final Route route = parameter("color", color ->
  complete("The color is '" + color + "'")
);

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue"))
  .assertEntity("The color is 'blue'");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Request is missing required query parameter 'color'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameter.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameter.html)*
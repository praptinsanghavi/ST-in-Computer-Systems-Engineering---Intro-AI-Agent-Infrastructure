---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/overrideMethodWithParameter.html
title: overrideMethodWithParameter • Akka HTTP
---

# overrideMethodWithParameter • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# overrideMethodWithParameter

## Signature

```
def overrideMethodWithParameter(paramName: String): Directive0
```

## Description

Changes the request method to the value of the specified query parameter.

Changes the HTTP method of the request to the value of the specified query string parameter. If the query string parameter is not specified this directive has no effect.

If the query string is specified as something that is not an HTTP method, then this directive completes the request with a `501 Not Implemented` response.

This directive is useful for:

- Use in combination with JSONP (JSONP only supports GET)
- Supporting older browsers that lack support for certain HTTP methods. E.g. IE8 does not support PATCH

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L135-L157 "Go to snippet source")val route =
  overrideMethodWithParameter("method") {
    concat(
      get {
        complete("This looks like a GET request.")
      },
      post {
        complete("This looks like a POST request.")
      }
    )
  }

// tests:
Get("/?method=POST") ~> route ~> check {
  responseAs[String] shouldEqual "This looks like a POST request."
}
Post("/?method=get") ~> route ~> check {
  responseAs[String] shouldEqual "This looks like a GET request."
}

Get("/?method=hallo") ~> route ~> check {
  status shouldEqual StatusCodes.NotImplemented
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L57-L196 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.post;
import static akka.http.javadsl.server.Directives.overrideMethodWithParameter;

final Route route = concat(
    overrideMethodWithParameter("method", () ->
      concat(
        get(() -> complete("This looks like a GET request.")),
        post(() -> complete("This looks like a POST request."))
      )
    )
);

// tests:
testRoute(route).run(HttpRequest.GET("/?method=POST")).assertEntity(
    "This looks like a POST request.");

testRoute(route).run(HttpRequest.POST("/?method=get"))
    .assertEntity("This looks like a GET request.");

testRoute(route).run(HttpRequest.GET("/?method=hallo")).assertEntity(
    "The server either does not recognize the request method, or it lacks the ability to fulfill the request.");

```

## Code Examples

### Example 1: Signature

```scala
def overrideMethodWithParameter(paramName: String): Directive0
```

### Example 2: Example

```scala
val route =
  overrideMethodWithParameter("method") {
    concat(
      get {
        complete("This looks like a GET request.")
      },
      post {
        complete("This looks like a POST request.")
      }
    )
  }

// tests:
Get("/?method=POST") ~> route ~> check {
  responseAs[String] shouldEqual "This looks like a POST request."
}
Post("/?method=get") ~> route ~> check {
  responseAs[String] shouldEqual "This looks like a GET request."
}

Get("/?method=hallo") ~> route ~> check {
  status shouldEqual StatusCodes.NotImplemented
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.post;
import static akka.http.javadsl.server.Directives.overrideMethodWithParameter;


final Route route = concat(
    overrideMethodWithParameter("method", () ->
      concat(
        get(() -> complete("This looks like a GET request.")),
        post(() -> complete("This looks like a POST request."))
      )
    )
);


// tests:
testRoute(route).run(HttpRequest.GET("/?method=POST")).assertEntity(
    "This looks like a POST request.");

testRoute(route).run(HttpRequest.POST("/?method=get"))
    .assertEntity("This looks like a GET request.");

testRoute(route).run(HttpRequest.GET("/?method=hallo")).assertEntity(
    "The server either does not recognize the request method, or it lacks the ability to fulfill the request.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/options.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/patch.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/overrideMethodWithParameter.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/overrideMethodWithParameter.html)*
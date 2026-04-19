---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByType.html
title: headerValueByType • Akka HTTP
---

# headerValueByType • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# headerValueByType

## Signature

```
def headerValueByType[T <: HttpHeader: ClassTag](): Directive1[T]

```

The signature shown is simplified, the real signature uses magnets. [\[1]](#1)

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

Traverses the list of request headers and extracts the first header of the given type.

The `headerValueByType` directive finds a header of the given type in the list of request header. If no header of the given type is found the request is rejected with a [`MissingHeaderRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html "akka.http.javadsl.server.MissingHeaderRejection")[`MissingHeaderRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html "akka.http.scaladsl.server.MissingHeaderRejection").

If the header is expected to be missing in some cases or to customize handling when the header is missing use the [optionalHeaderValueByType](optionalHeaderValueByType.html) directive instead.

Note
Custom headers will only be matched by this directive if they extend [`ModeledCustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html "akka.http.javadsl.model.headers.ModeledCustomHeader")[`ModeledCustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html "akka.http.scaladsl.model.headers.ModeledCustomHeader") and provide a companion extending `ModeledCustomHeaderCompanion`, otherwise the routing infrastructure does now know where to search for the needed companion and header name. from the Scala DSL and there is currently no API for the Java DSL ([Issue 219](https://github.com/akka/akka-http/issues/219))

To learn more about defining custom headers, read: [Custom Headers](../../../common/http-model.html#custom-headers).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L186-L202 "Go to snippet source")val route =
  headerValueByType(Origin) { origin =>
    complete(s"The first origin was ${origin.origins.head}")
  }

val originHeader = Origin(HttpOrigin("http://localhost:8080"))

// tests:
// extract a header if the type is matching
Get("abc") ~> originHeader ~> route ~> check {
  responseAs[String] shouldEqual "The first origin was http://localhost:8080"
}

// reject a request if no header of the given type is present
Get("abc") ~> route ~> check {
  inside(rejection) { case MissingHeaderRejection("Origin") => }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L46-L168 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.headerValueByType;

final Route route = headerValueByType(Origin.class, origin ->
  complete("The first origin was " + origin.getOrigins().iterator().next())
);

// tests:
final Host host = Host.create("localhost", 8080);
final Origin originHeader = Origin.create(HttpOrigin.create("http", host));

testRoute(route).run(HttpRequest.GET("abc").addHeader(originHeader))
  .assertEntity("The first origin was http://localhost:8080");

testRoute(route).run(HttpRequest.GET("abc"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("Request is missing required HTTP header 'Origin'");
```

## Code Examples

### Example 1: Signature

```scala
def headerValueByType[T <: HttpHeader: ClassTag](): Directive1[T]
```

### Example 2: Example

```scala
val route =
  headerValueByType(Origin) { origin =>
    complete(s"The first origin was ${origin.origins.head}")
  }

val originHeader = Origin(HttpOrigin("http://localhost:8080"))

// tests:
// extract a header if the type is matching
Get("abc") ~> originHeader ~> route ~> check {
  responseAs[String] shouldEqual "The first origin was http://localhost:8080"
}

// reject a request if no header of the given type is present
Get("abc") ~> route ~> check {
  inside(rejection) { case MissingHeaderRejection("Origin") => }
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.headerValueByType;

final Route route = headerValueByType(Origin.class, origin ->
  complete("The first origin was " + origin.getOrigins().iterator().next())
);

// tests:
final Host host = Host.create("localhost", 8080);
final Origin originHeader = Origin.create(HttpOrigin.create("http", host));

testRoute(route).run(HttpRequest.GET("abc").addHeader(originHeader))
  .assertEntity("The first origin was http://localhost:8080");

testRoute(route).run(HttpRequest.GET("abc"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("Request is missing required HTTP header 'Origin'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByName.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValuePF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByType.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByType.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByType.html)*
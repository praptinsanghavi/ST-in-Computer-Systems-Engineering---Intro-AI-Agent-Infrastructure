---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByType.html
title: optionalHeaderValueByType • Akka HTTP
---

# optionalHeaderValueByType • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# optionalHeaderValueByType

## Signature

```
def optionalHeaderValueByType[T <: HttpHeader: ClassTag](): Directive1[Option[T]]

```

The signature shown is simplified, the real signature uses magnets. [\[1]](#1)

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

Optionally extracts the value of the HTTP request header of the given type.

The `optionalHeaderValueByType` directive is similar to the [headerValueByType](headerValueByType.html) directive but always extracts an `Option``Optional` value instead of rejecting the request if no matching header could be found.

Note
Custom headers will only be matched by this directive if they extend [`ModeledCustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html "akka.http.javadsl.model.headers.ModeledCustomHeader")[`ModeledCustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html "akka.http.scaladsl.model.headers.ModeledCustomHeader") and provide a companion extending `ModeledCustomHeaderCompanion`, otherwise the routing infrastructure does now know where to search for the needed companion and header name. from the Scala DSL and there is currently no API for the Java DSL ([Issue 219](https://github.com/akka/akka-http/issues/219))

To learn more about defining custom headers, read: [Custom Headers](../../../common/http-model.html#custom-headers).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HeaderDirectivesExamplesSpec.scala#L207-L224 "Go to snippet source")val route =
  optionalHeaderValueByType(Origin) {
    case Some(origin) => complete(s"The first origin was ${origin.origins.head}")
    case None         => complete("No Origin header found.")
  }

val originHeader = Origin(HttpOrigin("http://localhost:8080"))

// tests:
// extract Some(header) if the type is matching
Get("abc") ~> originHeader ~> route ~> check {
  responseAs[String] shouldEqual "The first origin was http://localhost:8080"
}

// extract None if no header of the given type is present
Get("abc") ~> route ~> check {
  responseAs[String] shouldEqual "No Origin header found."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HeaderDirectivesExamplesTest.java#L66-L274 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalHeaderValueByType;

final Route route = optionalHeaderValueByType(Origin.class, origin -> {
  if (origin.isPresent()) {
    return complete("The first origin was " + origin.get().getOrigins().iterator().next());
  } else {
    return complete("No Origin header found.");
  }
});

// tests:

// extract Some(header) if the type is matching
Host host = Host.create("localhost", 8080);
Origin originHeader = Origin.create(HttpOrigin.create("http", host));
testRoute(route).run(HttpRequest.GET("abc").addHeader(originHeader))
  .assertEntity("The first origin was http://localhost:8080");

// extract None if no header of the given type is present
testRoute(route).run(HttpRequest.GET("abc")).assertEntity("No Origin header found.");

```

## Code Examples

### Example 1: Signature

```scala
def optionalHeaderValueByType[T <: HttpHeader: ClassTag](): Directive1[Option[T]]
```

### Example 2: Example

```scala
val route =
  optionalHeaderValueByType(Origin) {
    case Some(origin) => complete(s"The first origin was ${origin.origins.head}")
    case None         => complete("No Origin header found.")
  }

val originHeader = Origin(HttpOrigin("http://localhost:8080"))

// tests:
// extract Some(header) if the type is matching
Get("abc") ~> originHeader ~> route ~> check {
  responseAs[String] shouldEqual "The first origin was http://localhost:8080"
}

// extract None if no header of the given type is present
Get("abc") ~> route ~> check {
  responseAs[String] shouldEqual "No Origin header found."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.optionalHeaderValueByType;

final Route route = optionalHeaderValueByType(Origin.class, origin -> {
  if (origin.isPresent()) {
    return complete("The first origin was " + origin.get().getOrigins().iterator().next());
  } else {
    return complete("No Origin header found.");
  }
});

// tests:

// extract Some(header) if the type is matching
Host host = Host.create("localhost", 8080);
Origin originHeader = Origin.create(HttpOrigin.create("http", host));
testRoute(route).run(HttpRequest.GET("abc").addHeader(originHeader))
  .assertEntity("The first origin was http://localhost:8080");

// extract None if no header of the given type is present
testRoute(route).run(HttpRequest.GET("abc")).assertEntity("No Origin header found.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/headerValueByType.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByName.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValuePF.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByType.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/header-directives/optionalHeaderValueByType.html)*
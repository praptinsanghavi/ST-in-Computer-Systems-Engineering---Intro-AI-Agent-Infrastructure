---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withoutSizeLimit.html
title: withoutSizeLimit • Akka HTTP
---

# withoutSizeLimit • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withoutSizeLimit

## Signature

```
def withoutSizeLimit: Directive0
```

## Description

Skips request entity size verification.

The whole mechanism of entity size checking is intended to prevent certain Denial\-of\-Service attacks. So suggested setup is to have `akka.http.parsing.max-content-length` relatively low and use `withoutSizeLimit` directive just for endpoints for which size verification should not be performed.

Caution
Usage of `withoutSizeLimit` is not recommended as it turns off the too large payload protection. Therefore, we highly encourage using `withSizeLimit` instead, providing it with a value high enough to successfully handle the route in need of big entities.

See also [withSizeLimit](withSizeLimit.html) for setting request entity size limit.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L185-L199 "Go to snippet source")val route =
  withoutSizeLimit {
    entity(as[String]) { _ =>
      complete(HttpResponse())
    }
  }

// tests:
def entityOfSize(size: Int) =
  HttpEntity(ContentTypes.`text/plain(UTF-8)`, List.fill(size)('0').mkString)

// will work even if you have configured akka.http.parsing.max-content-length = 500
Post("/abc", entityOfSize(501)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MiscDirectivesExamplesTest.java#L22-L89 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;
import static akka.http.javadsl.server.Directives.withSizeLimit;

final Route route = withSizeLimit(500, () ->
  entity(Unmarshaller.entityToString(), (entity) ->
    complete("ok")
  )
);

Function<Integer, HttpRequest> withEntityOfSize = (sizeLimit) -> {
  char[] charArray = new char[sizeLimit];
  Arrays.fill(charArray, '0');
  return HttpRequest.POST("/").withEntity(new String(charArray));
};

// tests:
testRoute(route).run(withEntityOfSize.apply(500))
  .assertStatusCode(StatusCodes.OK);

testRoute(route).run(withEntityOfSize.apply(501))
  .assertStatusCode(StatusCodes.CONTENT_TOO_LARGE);
```

## Code Examples

### Example 1: Signature

```scala
def withoutSizeLimit: Directive0
```

### Example 2: Example

```scala
val route =
  withoutSizeLimit {
    entity(as[String]) { _ =>
      complete(HttpResponse())
    }
  }

// tests:
def entityOfSize(size: Int) =
  HttpEntity(ContentTypes.`text/plain(UTF-8)`, List.fill(size)('0').mkString)

// will work even if you have configured akka.http.parsing.max-content-length = 500
Post("/abc", entityOfSize(501)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;
import static akka.http.javadsl.server.Directives.withSizeLimit;

final Route route = withSizeLimit(500, () ->
  entity(Unmarshaller.entityToString(), (entity) ->
    complete("ok")
  )
);

Function<Integer, HttpRequest> withEntityOfSize = (sizeLimit) -> {
  char[] charArray = new char[sizeLimit];
  Arrays.fill(charArray, '0');
  return HttpRequest.POST("/").withEntity(new String(charArray));
};

// tests:
testRoute(route).run(withEntityOfSize.apply(500))
  .assertStatusCode(StatusCodes.OK);

testRoute(route).run(withEntityOfSize.apply(501))
  .assertStatusCode(StatusCodes.CONTENT_TOO_LARGE);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/validate.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withSizeLimit.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withoutSizeLimit.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withoutSizeLimit.html)*
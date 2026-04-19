---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withSizeLimit.html
title: withSizeLimit • Akka HTTP
---

# withSizeLimit • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withSizeLimit

## Signature

```
def withSizeLimit(maxBytes: Long): Directive0
```

## Description

Fails the stream with `EntityStreamSizeException` if its request entity size exceeds given limit. Limit given as parameter overrides limit configured with `akka.http.parsing.max-content-length`.

The whole mechanism of entity size checking is intended to prevent certain Denial\-of\-Service attacks. So suggested setup is to have `akka.http.parsing.max-content-length` relatively low and use `withSizeLimit` directive for endpoints which expects bigger entities.

See also [withoutSizeLimit](withoutSizeLimit.html) for skipping request entity size check.

## Examples

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L118-L135 "Go to snippet source")val route = withSizeLimit(500) {
  entity(as[String]) { _ =>
    complete(HttpResponse())
  }
}

// tests:
def entityOfSize(size: Int) =
  HttpEntity(ContentTypes.`text/plain(UTF-8)`, List.fill(size)('0').mkString)

Post("/abc", entityOfSize(500)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}

Post("/abc", entityOfSize(501)) ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.ContentTooLarge
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

Beware that request entity size check is executed when entity is consumed. Therefore in the following example even request with entity greater than argument to `withSizeLimit` will succeed (because this route does not consume entity):

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L141-L155 "Go to snippet source")val route = withSizeLimit(500) {
  complete(HttpResponse())
}

// tests:
def entityOfSize(size: Int) =
  HttpEntity(ContentTypes.`text/plain(UTF-8)`, List.fill(size)('0').mkString)

Post("/abc", entityOfSize(500)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}

Post("/abc", entityOfSize(501)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

Directive `withSizeLimit` is implemented in terms of `HttpEntity.withSizeLimit` which means that in case of nested `withSizeLimit` directives the innermost is applied:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L161-L179 "Go to snippet source")val route =
  withSizeLimit(500) {
    withSizeLimit(800) {
      entity(as[String]) { _ =>
        complete(HttpResponse())
      }
    }
  }

// tests:
def entityOfSize(size: Int) =
  HttpEntity(ContentTypes.`text/plain(UTF-8)`, List.fill(size)('0').mkString)
Post("/abc", entityOfSize(800)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}

Post("/abc", entityOfSize(801)) ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.ContentTooLarge
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MiscDirectivesExamplesTest.java#L28-L114 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;
import static akka.http.javadsl.server.Directives.withSizeLimit;

final Route route = withSizeLimit(500, () ->
        withSizeLimit(800, () ->
        entity(Unmarshaller.entityToString(), (entity) ->
                complete("ok")
        ))
);

Function<Integer, HttpRequest> withEntityOfSize = (sizeLimit) -> {
  char[] charArray = new char[sizeLimit];
  Arrays.fill(charArray, '0');
  return HttpRequest.POST("/").withEntity(new String(charArray));
};

// tests:
testRoute(route).run(withEntityOfSize.apply(800))
        .assertStatusCode(StatusCodes.OK);

testRoute(route).run(withEntityOfSize.apply(801))
        .assertStatusCode(StatusCodes.CONTENT_TOO_LARGE);
```

## Code Examples

### Example 1: Signature

```scala
def withSizeLimit(maxBytes: Long): Directive0
```

### Example 2: Examples

```scala
val route = withSizeLimit(500) {
  entity(as[String]) { _ =>
    complete(HttpResponse())
  }
}

// tests:
def entityOfSize(size: Int) =
  HttpEntity(ContentTypes.`text/plain(UTF-8)`, List.fill(size)('0').mkString)

Post("/abc", entityOfSize(500)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}

Post("/abc", entityOfSize(501)) ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.ContentTooLarge
}
```

### Example 3: Examples

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

### Example 4: Examples

```scala
val route = withSizeLimit(500) {
  complete(HttpResponse())
}

// tests:
def entityOfSize(size: Int) =
  HttpEntity(ContentTypes.`text/plain(UTF-8)`, List.fill(size)('0').mkString)

Post("/abc", entityOfSize(500)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}

Post("/abc", entityOfSize(501)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

### Example 5: Examples

```scala
val route =
  withSizeLimit(500) {
    withSizeLimit(800) {
      entity(as[String]) { _ =>
        complete(HttpResponse())
      }
    }
  }

// tests:
def entityOfSize(size: Int) =
  HttpEntity(ContentTypes.`text/plain(UTF-8)`, List.fill(size)('0').mkString)
Post("/abc", entityOfSize(800)) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}

Post("/abc", entityOfSize(801)) ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.ContentTooLarge
}
```

### Example 6: Examples

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;
import static akka.http.javadsl.server.Directives.withSizeLimit;

final Route route = withSizeLimit(500, () ->
        withSizeLimit(800, () ->
        entity(Unmarshaller.entityToString(), (entity) ->
                complete("ok")
        ))
);

Function<Integer, HttpRequest> withEntityOfSize = (sizeLimit) -> {
  char[] charArray = new char[sizeLimit];
  Arrays.fill(charArray, '0');
  return HttpRequest.POST("/").withEntity(new String(charArray));
};

// tests:
testRoute(route).run(withEntityOfSize.apply(800))
        .assertStatusCode(StatusCodes.OK);

testRoute(route).run(withEntityOfSize.apply(801))
        .assertStatusCode(StatusCodes.CONTENT_TOO_LARGE);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withoutSizeLimit.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withSizeLimit.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withSizeLimit.html)*
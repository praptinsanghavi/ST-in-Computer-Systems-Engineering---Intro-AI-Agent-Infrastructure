---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestEntity.html
title: extractRequestEntity • Akka HTTP
---

# extractRequestEntity • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractRequestEntity

## Signature

```
def extractRequestEntity: Directive1[RequestEntity]
```

## Description

Extracts the [`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext").

The directive returns a [`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") without unmarshalling the request. To extract domain entity, [entity](../marshalling-directives/entity.html) should be used.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L829-L838 "Go to snippet source")val route =
  extractRequestEntity { entity =>
    complete(s"Request entity content-type is ${entity.contentType}")
  }

// tests:
val httpEntity = HttpEntity(ContentTypes.`text/plain(UTF-8)`, "req")
Post("/abc", httpEntity) ~> route ~> check {
  responseAs[String] shouldEqual "Request entity content-type is text/plain; charset=UTF-8"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L252-L1030 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractRequestEntity;

final Route route = extractRequestEntity(entity ->
  complete("Request entity content-type is " + entity.getContentType())
);

// tests:
testRoute(route).run(
  HttpRequest.POST("/abc")
    .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, "req"))
).assertEntity("Request entity content-type is text/plain; charset=UTF-8");
```

## Code Examples

### Example 1: Signature

```scala
def extractRequestEntity: Directive1[RequestEntity]
```

### Example 2: Example

```scala
val route =
  extractRequestEntity { entity =>
    complete(s"Request entity content-type is ${entity.contentType}")
  }

// tests:
val httpEntity = HttpEntity(ContentTypes.`text/plain(UTF-8)`, "req")
Post("/abc", httpEntity) ~> route ~> check {
  responseAs[String] shouldEqual "Request entity content-type is text/plain; charset=UTF-8"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractRequestEntity;

final Route route = extractRequestEntity(entity ->
  complete("Request entity content-type is " + entity.getContentType())
);

// tests:
testRoute(route).run(
  HttpRequest.POST("/abc")
    .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, "req"))
).assertEntity("Request entity content-type is text/plain; charset=UTF-8");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/entity.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestEntity.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestEntity.html)*
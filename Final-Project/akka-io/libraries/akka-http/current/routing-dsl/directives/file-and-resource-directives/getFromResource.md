---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResource.html
title: getFromResource • Akka HTTP
---

# getFromResource • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# getFromResource

## Signature

```
def getFromResource(resourceName: String)(implicit resolver: ContentTypeResolver): Route
def getFromResource(resourceName: String, contentType: ContentType, classLoader: ClassLoader = _defaultClassLoader): Route
```

## Description

Completes `GET` requests with the content of the given classpath resource.

For details refer to [getFromFile](getFromFile.html) which works the same way but obtaining the file from the filesystem instead of the applications classpath.

Note that it’s not required to wrap this directive with `get` as this directive will only respond to `GET` requests.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileAndResourceDirectivesExamplesSpec.scala#L33-L44 "Go to snippet source")import akka.http.scaladsl.server.directives._
import ContentTypeResolver.Default

val route =
  path("logs" / Segment) { name =>
    getFromResource(s"$name.log") // uses implicit ContentTypeResolver
  }

// tests:
Get("/logs/example") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileAndResourceDirectivesExamplesTest.java#L25-L83 "Go to snippet source")import static akka.http.javadsl.server.Directives.getFromResource;
import static akka.http.javadsl.server.Directives.path;

final Route route = path(PathMatchers.segment("logs").slash(segment()), name ->
  getFromResource(name + ".log")
);

// tests:
testRoute(route).run(HttpRequest.GET("/logs/example"))
  .assertEntity("example file contents");
```

## Code Examples

### Example 1: Signature

```scala
def getFromResource(resourceName: String)(implicit resolver: ContentTypeResolver): Route
def getFromResource(resourceName: String, contentType: ContentType, classLoader: ClassLoader = _defaultClassLoader): Route
```

### Example 2: Example

```scala
import akka.http.scaladsl.server.directives._
import ContentTypeResolver.Default

val route =
  path("logs" / Segment) { name =>
    getFromResource(s"$name.log") // uses implicit ContentTypeResolver
  }

// tests:
Get("/logs/example") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.getFromResource;
import static akka.http.javadsl.server.Directives.path;

final Route route = path(PathMatchers.segment("logs").slash(segment()), name ->
  getFromResource(name + ".log")
);

// tests:
testRoute(route).run(HttpRequest.GET("/logs/example"))
  .assertEntity("example file contents");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromFile.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResourceDirectory.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResource.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResource.html)*
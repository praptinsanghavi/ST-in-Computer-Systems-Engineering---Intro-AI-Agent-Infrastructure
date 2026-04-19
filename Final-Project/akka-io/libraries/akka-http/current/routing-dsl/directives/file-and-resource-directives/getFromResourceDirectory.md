---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResourceDirectory.html
title: getFromResourceDirectory • Akka HTTP
---

# getFromResourceDirectory • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# getFromResourceDirectory

## Signature

```
def getFromResourceDirectory(directoryName: String, classLoader: ClassLoader = _defaultClassLoader)(implicit resolver: ContentTypeResolver): Route
```

## Description

Completes `GET` requests with the content of the given classpath resource directory.

For details refer to [getFromDirectory](getFromDirectory.html) which works the same way but obtaining the file from the filesystem instead of the applications classpath.

Note that it’s not required to wrap this directive with `get` as this directive will only respond to `GET` requests.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileAndResourceDirectivesExamplesSpec.scala#L110-L118 "Go to snippet source")val route =
  pathPrefix("examples") {
    getFromResourceDirectory("examples")
  }

// tests:
Get("/examples/example-1") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileAndResourceDirectivesExamplesTest.java#L52-L160 "Go to snippet source")import static akka.http.javadsl.server.Directives.getFromResourceDirectory;
import static akka.http.javadsl.server.Directives.pathPrefix;

final Route route = pathPrefix("examples", () ->
  getFromResourceDirectory("/examples")
);

// tests:
testRoute(route).run(HttpRequest.GET("/examples/example-1"))
  .assertEntity("example file contents");
```

## Code Examples

### Example 1: Signature

```scala
def getFromResourceDirectory(directoryName: String, classLoader: ClassLoader = _defaultClassLoader)(implicit resolver: ContentTypeResolver): Route
```

### Example 2: Example

```scala
val route =
  pathPrefix("examples") {
    getFromResourceDirectory("examples")
  }

// tests:
Get("/examples/example-1") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.getFromResourceDirectory;
import static akka.http.javadsl.server.Directives.pathPrefix;

final Route route = pathPrefix("examples", () ->
  getFromResourceDirectory("/examples")
);

// tests:
testRoute(route).run(HttpRequest.GET("/examples/example-1"))
  .assertEntity("example file contents");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromDirectory.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResource.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/listDirectoryContents.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResourceDirectory.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResourceDirectory.html)*
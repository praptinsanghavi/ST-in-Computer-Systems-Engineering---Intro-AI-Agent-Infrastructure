---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromFile.html
title: getFromFile • Akka HTTP
---

# getFromFile • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# getFromFile

## Signature

```
def getFromFile(fileName: String)(implicit resolver: ContentTypeResolver): Route
def getFromFile(file: File)(implicit resolver: ContentTypeResolver): Route
def getFromFile(file: File, contentType: ContentType): Route
```

## Description

Allows exposing a file to be streamed to the client issuing the request.

The `unmatchedPath` (see [extractUnmatchedPath](../basic-directives/extractUnmatchedPath.html)) of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") is first transformed by the given `pathRewriter` function, before being appended to the given directory name to build the final file name.

To files from a given directory use [getFromDirectory](getFromDirectory.html). To serve browsable directory listings use [getFromBrowseableDirectories](getFromBrowseableDirectories.html). To serve files from a classpath directory use [getFromResourceDirectory](getFromResourceDirectory.html) instead.

Note that it’s not required to wrap this directive with `get` as this directive will only respond to `GET` requests.

Note
The file’s contents will be read using an Akka Streams *`Source`* which *automatically uses a pre\-configured dedicated blocking io dispatcher*, which separates the blocking file operations from the rest of the stream.

Note also that thanks to using Akka Streams internally, the file will be served at the highest speed reachable by the client, and not faster – i.e. the file will *not* end up being loaded in full into memory before writing it to the client.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileAndResourceDirectivesExamplesSpec.scala#L17-L28 "Go to snippet source")import akka.http.scaladsl.server.directives._
import ContentTypeResolver.Default

val route =
  path("logs" / Segment) { name =>
    getFromFile(s"$name.log") // uses implicit ContentTypeResolver
  }

// tests:
Get("/logs/example") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileAndResourceDirectivesExamplesTest.java#L20-L69 "Go to snippet source")import static akka.http.javadsl.server.Directives.getFromFile;
import static akka.http.javadsl.server.Directives.path;

final Route route = path(PathMatchers.segment("logs").slash(segment()), name ->
  getFromFile(name + ".log")
);

// tests:
testRoute(route).run(HttpRequest.GET("/logs/example"))
  .assertEntity("example file contents");
```

## Code Examples

### Example 1: Signature

```scala
def getFromFile(fileName: String)(implicit resolver: ContentTypeResolver): Route
def getFromFile(file: File)(implicit resolver: ContentTypeResolver): Route
def getFromFile(file: File, contentType: ContentType): Route
```

### Example 2: Example

```scala
import akka.http.scaladsl.server.directives._
import ContentTypeResolver.Default

val route =
  path("logs" / Segment) { name =>
    getFromFile(s"$name.log") // uses implicit ContentTypeResolver
  }

// tests:
Get("/logs/example") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.getFromFile;
import static akka.http.javadsl.server.Directives.path;

final Route route = path(PathMatchers.segment("logs").slash(segment()), name ->
  getFromFile(name + ".log")
);

// tests:
testRoute(route).run(HttpRequest.GET("/logs/example"))
  .assertEntity("example file contents");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectories.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromDirectory.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResource.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResourceDirectory.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromFile.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromFile.html)*
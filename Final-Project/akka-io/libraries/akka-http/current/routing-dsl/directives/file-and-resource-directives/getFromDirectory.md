---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromDirectory.html
title: getFromDirectory • Akka HTTP
---

# getFromDirectory • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# getFromDirectory

## Signature

```
def getFromDirectory(directoryName: String)(implicit resolver: ContentTypeResolver): Route
```

## Description

Allows exposing a directory’s files for `GET` requests for its contents.

The `unmatchedPath` (see [extractUnmatchedPath](../basic-directives/extractUnmatchedPath.html)) of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") is first transformed by the given `pathRewriter` function, before being appended to the given directory name to build the final file name.

To serve a single file use [getFromFile](getFromFile.html). To serve browsable directory listings use [getFromBrowseableDirectories](getFromBrowseableDirectories.html). To serve files from a classpath directory use [getFromResourceDirectory](getFromResourceDirectory.html) instead.

Note that it’s not required to wrap this directive with `get` as this directive will only respond to `GET` requests.

Note
The file’s contents will be read using an Akka Streams *`Source`* which *automatically uses a pre\-configured dedicated blocking io dispatcher*, which separates the blocking file operations from the rest of the stream.

Note also that thanks to using Akka Streams internally, the file will be served at the highest speed reachable by the client, and not faster – i.e. the file will *not* end up being loaded in full into memory before writing it to the client.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileAndResourceDirectivesExamplesSpec.scala#L97-L105 "Go to snippet source")val route =
  pathPrefix("tmp") {
    getFromDirectory("/tmp")
  }

// tests:
Get("/tmp/example") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileAndResourceDirectivesExamplesTest.java#L47-L146 "Go to snippet source")import static akka.http.javadsl.server.Directives.getFromDirectory;
import static akka.http.javadsl.server.Directives.pathPrefix;

final Route route = pathPrefix("tmp", () ->
  getFromDirectory("/tmp")
);

// tests:
testRoute(route).run(HttpRequest.GET("/tmp/example"))
  .assertEntity("example file contents");
```

## Code Examples

### Example 1: Signature

```scala
def getFromDirectory(directoryName: String)(implicit resolver: ContentTypeResolver): Route
```

### Example 2: Example

```scala
val route =
  pathPrefix("tmp") {
    getFromDirectory("/tmp")
  }

// tests:
Get("/tmp/example") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.getFromDirectory;
import static akka.http.javadsl.server.Directives.pathPrefix;

final Route route = pathPrefix("tmp", () ->
  getFromDirectory("/tmp")
);

// tests:
testRoute(route).run(HttpRequest.GET("/tmp/example"))
  .assertEntity("example file contents");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectories.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectory.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromFile.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResourceDirectory.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromDirectory.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromDirectory.html)*
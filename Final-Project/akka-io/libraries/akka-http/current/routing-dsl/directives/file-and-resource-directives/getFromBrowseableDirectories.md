---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectories.html
title: getFromBrowseableDirectories • Akka HTTP
---

# getFromBrowseableDirectories • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# getFromBrowseableDirectories

## Signature

```
def getFromBrowseableDirectories(directories: String*)(implicit renderer: DirectoryRenderer, resolver: ContentTypeResolver): Route
```

## Description

The `getFromBrowseableDirectories` is a combination of serving files from the specified directories (like `getFromDirectory`) and listing a browseable directory with `listDirectoryContents`.

Nesting this directive beneath `get` is not necessary as this directive will only respond to `GET` requests.

Use `getFromBrowseableDirectory` to serve only one directory.

Use `getFromDirectory` if directory browsing isn’t required.

For more details refer to [getFromBrowseableDirectory](getFromBrowseableDirectory.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileAndResourceDirectivesExamplesSpec.scala#L84-L92 "Go to snippet source")val route =
  path("tmp") {
    getFromBrowseableDirectories("/main", "/backups")
  }

// tests:
Get("/tmp") ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileAndResourceDirectivesExamplesTest.java#L42-L132 "Go to snippet source")import static akka.http.javadsl.server.Directives.getFromBrowseableDirectories;
import static akka.http.javadsl.server.Directives.path;

final Route route = path("tmp", () ->
  getFromBrowseableDirectories("/main", "/backups")
);

// tests:
testRoute(route).run(HttpRequest.GET("/tmp"))
  .assertStatusCode(StatusCodes.OK);
```

## Code Examples

### Example 1: Signature

```scala
def getFromBrowseableDirectories(directories: String*)(implicit renderer: DirectoryRenderer, resolver: ContentTypeResolver): Route
```

### Example 2: Example

```scala
val route =
  path("tmp") {
    getFromBrowseableDirectories("/main", "/backups")
  }

// tests:
Get("/tmp") ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.getFromBrowseableDirectories;
import static akka.http.javadsl.server.Directives.path;

final Route route = path("tmp", () ->
  getFromBrowseableDirectories("/main", "/backups")
);

// tests:
testRoute(route).run(HttpRequest.GET("/tmp"))
  .assertStatusCode(StatusCodes.OK);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectory.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectories.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectories.html)*
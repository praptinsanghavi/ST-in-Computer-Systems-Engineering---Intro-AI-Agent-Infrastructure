---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectory.html
title: getFromBrowseableDirectory • Akka HTTP
---

# getFromBrowseableDirectory • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# getFromBrowseableDirectory

## Signature

```
def getFromBrowseableDirectory(directory: String)(implicit renderer: DirectoryRenderer, resolver: ContentTypeResolver): Route
```

## Description

The `getFromBrowseableDirectories` is a combination of serving files from the specified directories (like `getFromDirectory`) and listing a browseable directory with `listDirectoryContents`.

Nesting this directive beneath `get` is not necessary as this directive will only respond to `GET` requests.

Use `getFromBrowseableDirectory` to serve only one directory.

Use `getFromDirectory` if directory browsing isn’t required.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileAndResourceDirectivesExamplesSpec.scala#L71-L79 "Go to snippet source")val route =
  path("tmp") {
    getFromBrowseableDirectory("/tmp")
  }

// tests:
Get("/tmp") ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileAndResourceDirectivesExamplesTest.java#L37-L118 "Go to snippet source")import static akka.http.javadsl.server.Directives.getFromBrowseableDirectory;
import static akka.http.javadsl.server.Directives.path;

final Route route = path("tmp", () ->
  getFromBrowseableDirectory("/tmp")
);

// tests:
testRoute(route).run(HttpRequest.GET("/tmp"))
  .assertStatusCode(StatusCodes.OK);
```

### Default file listing page example

Directives which list directories (e.g. `getFromBrowsableDirectory`) use an implicit `DirectoryRenderer` instance to perform the actual rendering of the file listing. This rendered can be easily overridden by simply providing one in\-scope for the directives to use, so you can build your custom directory listings.

The default renderer is `akka.http.scaladsl.server.directives.FileAndResourceDirectives.defaultDirectoryRenderer`, and renders a listing which looks like this:

![akka-http-file-listing.png](../../../akka-http-file-listing.png)

> Example page rendered by the `defaultDirectoryRenderer`.

It’s possible to turn off rendering the footer stating which version of Akka HTTP is rendering this page by configuring the `akka.http.routing.render-vanity-footer` configuration option to `off`.

## Code Examples

### Example 1: Signature

```scala
def getFromBrowseableDirectory(directory: String)(implicit renderer: DirectoryRenderer, resolver: ContentTypeResolver): Route
```

### Example 2: Example

```scala
val route =
  path("tmp") {
    getFromBrowseableDirectory("/tmp")
  }

// tests:
Get("/tmp") ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.getFromBrowseableDirectory;
import static akka.http.javadsl.server.Directives.path;

final Route route = path("tmp", () ->
  getFromBrowseableDirectory("/tmp")
);

// tests:
testRoute(route).run(HttpRequest.GET("/tmp"))
  .assertStatusCode(StatusCodes.OK);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectories.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromDirectory.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectory.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectory.html)*
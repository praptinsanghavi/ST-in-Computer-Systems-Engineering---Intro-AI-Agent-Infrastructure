---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:33Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/listDirectoryContents.html
title: listDirectoryContents • Akka HTTP
---

# listDirectoryContents • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# listDirectoryContents

## Signature

```
def listDirectoryContents(directories: String*)(implicit renderer: DirectoryRenderer): Route
```

## Description

Completes `GET` requests with a unified listing of the contents of all given directories. The actual rendering of the directory contents is performed by the in\-scope [`Marshaller<DirectoryListing>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[DirectoryListing]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller").

To just serve files use [getFromDirectory](getFromDirectory.html).

To serve files and provide a browseable directory listing use [getFromBrowseableDirectories](getFromBrowseableDirectories.html) instead.

The rendering can be overridden by providing a custom [`Marshaller<DirectoryListing>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[DirectoryListing]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller")`DirectoryRenderer` implementation, you can read more about it in [getFromDirectory](getFromDirectory.html) ’s documentation.

Note that it’s not required to wrap this directive with `get` as this directive will only respond to `GET` requests.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileAndResourceDirectivesExamplesSpec.scala#L49-L66 "Go to snippet source")val route =
  concat(
    path("tmp") {
      listDirectoryContents("/tmp")
    },
    path("custom") {
      // implement your custom renderer here
      val renderer = new DirectoryRenderer {
        override def marshaller(renderVanityFooter: Boolean): ToEntityMarshaller[DirectoryListing] = ???
      }
      listDirectoryContents("/tmp")(renderer)
    }
  )

// tests:
Get("/logs/example") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileAndResourceDirectivesExamplesTest.java#L30-L104 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.listDirectoryContents;
import static akka.http.javadsl.server.Directives.path;

final Route route = Directives.concat(
  path("tmp", () -> listDirectoryContents("/tmp")),
  path("custom", () -> {
    // implement your custom renderer here
    final DirectoryRenderer renderer = renderVanityFooter -> {
      throw new NotImplementedError();
    };
    return listDirectoryContents(renderer, "/tmp");
  })
);

// tests:
testRoute(route).run(HttpRequest.GET("/logs/example"))
  .assertEntity("example file contents");
```

## Code Examples

### Example 1: Signature

```scala
def listDirectoryContents(directories: String*)(implicit renderer: DirectoryRenderer): Route
```

### Example 2: Example

```scala
val route =
  concat(
    path("tmp") {
      listDirectoryContents("/tmp")
    },
    path("custom") {
      // implement your custom renderer here
      val renderer = new DirectoryRenderer {
        override def marshaller(renderVanityFooter: Boolean): ToEntityMarshaller[DirectoryListing] = ???
      }
      listDirectoryContents("/tmp")(renderer)
    }
  )

// tests:
Get("/logs/example") ~> route ~> check {
  responseAs[String] shouldEqual "example file contents"
}
```

### Example 3: Example

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.listDirectoryContents;
import static akka.http.javadsl.server.Directives.path;

final Route route = Directives.concat(
  path("tmp", () -> listDirectoryContents("/tmp")),
  path("custom", () -> {
    // implement your custom renderer here
    final DirectoryRenderer renderer = renderVanityFooter -> {
      throw new NotImplementedError();
    };
    return listDirectoryContents(renderer, "/tmp");
  })
);

// tests:
testRoute(route).run(HttpRequest.GET("/logs/example"))
  .assertEntity("example file contents");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectories.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromDirectory.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromResourceDirectory.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/listDirectoryContents.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/listDirectoryContents.html)*
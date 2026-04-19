---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFiles.html
title: storeUploadedFiles • Akka HTTP
---

# storeUploadedFiles • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# storeUploadedFiles

## Signature

```
def storeUploadedFiles(fieldName: String, destFn: FileInfo => File): Directive1[immutable.Seq[(FileInfo, File)]]
```

## Description

Streams the contents of all files uploaded in a multipart form into files on disk and provides a list of each file and metadata about the upload.

If there is an error writing to disk the request will be failed with the thrown exception. If there is no field with the given name the request will be rejected.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileUploadDirectivesExamplesSpec.scala#L61-L92 "Go to snippet source")  
def tempDestination(fileInfo: FileInfo): File =
  Files.createTempFile(fileInfo.fileName, ".tmp").toFile

val route =
  storeUploadedFiles("csv", tempDestination) { files =>
    val finalStatus = files.foldLeft(StatusCodes.OK) {
      case (status, (metadata, file)) =>
        // do something with the file and file metadata ...
        file.delete()
        status
    }

    complete(finalStatus)
  }

// tests:
val multipartForm =
  Multipart.FormData(
    Multipart.FormData.BodyPart.Strict(
      "csv",
      HttpEntity(ContentTypes.`text/plain(UTF-8)`, "2,3,5\n7,11,13,17,23\n29,31,37\n"),
      Map("filename" -> "primesA.csv")),
    Multipart.FormData.BodyPart.Strict(
      "csv",
      HttpEntity(ContentTypes.`text/plain(UTF-8)`, "41,43,47\n53,59,6167,71\n73,79,83\n"),
      Map("filename" -> "primesB.csv")))

Post("/", multipartForm) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileUploadDirectivesExamplesTest.java#L38-L136 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.storeUploadedFiles;

    final Function<FileInfo, File> temporaryDestination = info -> {
      try {
        return Files.createTempFile(info.getFileName(), ".tmp").toFile();
      } catch (Exception e) {
        return null;
      }
    };

    final Route route = storeUploadedFiles("csv", temporaryDestination, files -> {
      files.forEach(item -> {
        // do something with the file and file metadata ...
        FileInfo info = item.getKey();
        File file = item.getValue();
        file.delete();
      });
      return complete(StatusCodes.OK);
    });

    Map<String, String> filenameMappingA = new HashMap<>();
    Map<String, String> filenameMappingB = new HashMap<>();
    filenameMappingA.put("filename", "primesA.csv");
    filenameMappingB.put("filename", "primesB.csv");

    akka.http.javadsl.model.Multipart.FormData multipartForm =
      Multiparts.createStrictFormDataFromParts(
        Multiparts.createFormDataBodyPartStrict("csv",
          HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8,
            "2,3,5\n7,11,13,17,23\n29,31,37\n"), filenameMappingA),
        Multiparts.createFormDataBodyPartStrict("csv",
          HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8,
            "41,43,47\n53,59,61,67,71\n73,79,83\n"), filenameMappingB));

    // test:
    testRoute(route).run(HttpRequest.POST("/")
      .withEntity(
        multipartForm.toEntity(BodyPartRenderer
		  .randomBoundaryWithDefaults())))
      .assertStatusCode(StatusCodes.OK);
```

## Code Examples

### Example 1: Signature

```scala
def storeUploadedFiles(fieldName: String, destFn: FileInfo => File): Directive1[immutable.Seq[(FileInfo, File)]]
```

### Example 2: Example

```scala
def tempDestination(fileInfo: FileInfo): File =
  Files.createTempFile(fileInfo.fileName, ".tmp").toFile

val route =
  storeUploadedFiles("csv", tempDestination) { files =>
    val finalStatus = files.foldLeft(StatusCodes.OK) {
      case (status, (metadata, file)) =>
        // do something with the file and file metadata ...
        file.delete()
        status
    }

    complete(finalStatus)
  }

// tests:
val multipartForm =
  Multipart.FormData(
    Multipart.FormData.BodyPart.Strict(
      "csv",
      HttpEntity(ContentTypes.`text/plain(UTF-8)`, "2,3,5\n7,11,13,17,23\n29,31,37\n"),
      Map("filename" -> "primesA.csv")),
    Multipart.FormData.BodyPart.Strict(
      "csv",
      HttpEntity(ContentTypes.`text/plain(UTF-8)`, "41,43,47\n53,59,6167,71\n73,79,83\n"),
      Map("filename" -> "primesB.csv")))

Post("/", multipartForm) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.storeUploadedFiles;

    final Function<FileInfo, File> temporaryDestination = info -> {
      try {
        return Files.createTempFile(info.getFileName(), ".tmp").toFile();
      } catch (Exception e) {
        return null;
      }
    };

    final Route route = storeUploadedFiles("csv", temporaryDestination, files -> {
      files.forEach(item -> {
        // do something with the file and file metadata ...
        FileInfo info = item.getKey();
        File file = item.getValue();
        file.delete();
      });
      return complete(StatusCodes.OK);
    });

    Map<String, String> filenameMappingA = new HashMap<>();
    Map<String, String> filenameMappingB = new HashMap<>();
    filenameMappingA.put("filename", "primesA.csv");
    filenameMappingB.put("filename", "primesB.csv");

    akka.http.javadsl.model.Multipart.FormData multipartForm =
      Multiparts.createStrictFormDataFromParts(
        Multiparts.createFormDataBodyPartStrict("csv",
          HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8,
            "2,3,5\n7,11,13,17,23\n29,31,37\n"), filenameMappingA),
        Multiparts.createFormDataBodyPartStrict("csv",
          HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8,
            "41,43,47\n53,59,61,67,71\n73,79,83\n"), filenameMappingB));

    // test:
    testRoute(route).run(HttpRequest.POST("/")
      .withEntity(
        multipartForm.toEntity(BodyPartRenderer
		  .randomBoundaryWithDefaults())))
      .assertStatusCode(StatusCodes.OK);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFile.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFiles.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFiles.html)*
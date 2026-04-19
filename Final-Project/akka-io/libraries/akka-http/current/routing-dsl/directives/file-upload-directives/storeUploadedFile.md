---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFile.html
title: storeUploadedFile • Akka HTTP
---

# storeUploadedFile • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# storeUploadedFile

## Signature

```
def storeUploadedFile(fieldName: String, destFn: FileInfo => File): Directive[(FileInfo, File)]
```

## Description

Streams the contents of a file uploaded as a multipart form into a file on disk and provides the file and metadata about the upload.

If there is an error writing to disk the request will be failed with the thrown exception. If there is no field with the given name the request will be rejected. If there are multiple file parts with the same name, the first one will be used and the subsequent ones ignored.

Note
This directive will stream contents of the request into a file, however one can not start processing these until the file has been written completely. For streaming APIs it is preferred to use the [fileUpload](fileUpload.html#fileupload) directive, as it allows for streaming handling of the incoming data bytes.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileUploadDirectivesExamplesSpec.scala#L32-L55 "Go to snippet source")  
def tempDestination(fileInfo: FileInfo): File =
  Files.createTempFile(fileInfo.fileName, ".tmp").toFile

val route =
  storeUploadedFile("csv", tempDestination) {
    case (metadata, file) =>
      // do something with the file and file metadata ...
      file.delete()
      complete(StatusCodes.OK)
  }

// tests:
val multipartForm =
  Multipart.FormData(
    Multipart.FormData.BodyPart.Strict(
      "csv",
      HttpEntity(ContentTypes.`text/plain(UTF-8)`, "2,3,5\n7,11,13,17,23\n29,31,37\n"),
      Map("filename" -> "primes.csv")))

Post("/", multipartForm) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileUploadDirectivesExamplesTest.java#L33-L92 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.storeUploadedFile;

    final Function<FileInfo, File> temporaryDestination = (info) -> {
      try {
        return Files.createTempFile(info.getFileName(), ".tmp").toFile();
      } catch (Exception e) {
        return null;
      }
    };

    final Route route = storeUploadedFile("csv", temporaryDestination, (info, file) -> {
      // do something with the file and file metadata ...
      file.delete();
      return complete(StatusCodes.OK);
    });

    Map<String, String> filenameMapping = new HashMap<>();
    filenameMapping.put("filename", "primes.csv");

    akka.http.javadsl.model.Multipart.FormData multipartForm =
      Multiparts.createStrictFormDataFromParts(Multiparts.createFormDataBodyPartStrict("csv",
        HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8,
          "2,3,5\n7,11,13,17,23\n29,31,37\n"), filenameMapping));

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
def storeUploadedFile(fieldName: String, destFn: FileInfo => File): Directive[(FileInfo, File)]
```

### Example 2: Example

```scala
def tempDestination(fileInfo: FileInfo): File =
  Files.createTempFile(fileInfo.fileName, ".tmp").toFile

val route =
  storeUploadedFile("csv", tempDestination) {
    case (metadata, file) =>
      // do something with the file and file metadata ...
      file.delete()
      complete(StatusCodes.OK)
  }

// tests:
val multipartForm =
  Multipart.FormData(
    Multipart.FormData.BodyPart.Strict(
      "csv",
      HttpEntity(ContentTypes.`text/plain(UTF-8)`, "2,3,5\n7,11,13,17,23\n29,31,37\n"),
      Map("filename" -> "primes.csv")))

Post("/", multipartForm) ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.storeUploadedFile;

    final Function<FileInfo, File> temporaryDestination = (info) -> {
      try {
        return Files.createTempFile(info.getFileName(), ".tmp").toFile();
      } catch (Exception e) {
        return null;
      }
    };

    final Route route = storeUploadedFile("csv", temporaryDestination, (info, file) -> {
      // do something with the file and file metadata ...
      file.delete();
      return complete(StatusCodes.OK);
    });

    Map<String, String> filenameMapping = new HashMap<>();
    filenameMapping.put("filename", "primes.csv");

    akka.http.javadsl.model.Multipart.FormData multipartForm =
      Multiparts.createStrictFormDataFromParts(Multiparts.createFormDataBodyPartStrict("csv",
        HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8,
          "2,3,5\n7,11,13,17,23\n29,31,37\n"), filenameMapping));

    // test:
    testRoute(route).run(HttpRequest.POST("/")
      .withEntity(
        multipartForm.toEntity(BodyPartRenderer
		  .randomBoundaryWithDefaults())))
      .assertStatusCode(StatusCodes.OK);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUpload.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUploadAll.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFiles.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFile.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFile.html)*
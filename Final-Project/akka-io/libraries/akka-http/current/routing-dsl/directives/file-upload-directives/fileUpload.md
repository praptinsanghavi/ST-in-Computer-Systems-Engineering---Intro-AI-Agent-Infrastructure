---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUpload.html
title: fileUpload • Akka HTTP
---

# fileUpload • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# fileUpload

## Signature

```
def fileUpload(fieldName: String): Directive1[(FileInfo, Source[ByteString, Any])]
```

## Description

Simple access to the stream of bytes for a file uploaded as a multipart form together with metadata about the upload.

If there is no field with the given name the request will be rejected. If there are multiple file parts with the same name, the first one will be used and the subsequent ones ignored.

Note
This directive will only upload one file with a given name. To upload multiple files with the same name you should use the [fileUploadAll](fileUploadAll.html#fileuploadall) directive, though all files will be buffered to disk, even if there is only one.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileUploadDirectivesExamplesSpec.scala#L98-L130 "Go to snippet source")  
// adding integers as a service
val route =
  extractRequestContext { ctx =>
    implicit val materializer = ctx.materializer

    fileUpload("csv") {
      case (metadata, byteSource) =>

        val sumF: Future[Int] =
          // sum the numbers as they arrive so that we can
          // accept any size of file
          byteSource.via(Framing.delimiter(ByteString("\n"), 1024))
            .mapConcat(_.utf8String.split(",").toVector)
            .map(_.toInt)
            .runFold(0) { (acc, n) => acc + n }

        onSuccess(sumF) { sum => complete(s"Sum: $sum") }
    }
  }

// tests:
val multipartForm =
  Multipart.FormData(Multipart.FormData.BodyPart.Strict(
    "csv",
    HttpEntity(ContentTypes.`text/plain(UTF-8)`, "2,3,5\n7,11,13,17,23\n29,31,37\n"),
    Map("filename" -> "primes.csv")))

Post("/", multipartForm) ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Sum: 178"
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileUploadDirectivesExamplesTest.java#L43-L168 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractRequestContext;
import static akka.http.javadsl.server.Directives.fileUpload;
import static akka.http.javadsl.server.Directives.onSuccess;

final Route route = extractRequestContext(ctx -> {
  return fileUpload("csv", (metadata, byteSource) -> {
    // sum the numbers as they arrive
    CompletionStage<Integer> sumF = byteSource.via(Framing.delimiter(
      ByteString.fromString("\n"), 1024))
        .mapConcat(bs -> Arrays.asList(bs.utf8String().split(",")))
        .map(s -> Integer.parseInt(s))
        .runFold(0, (acc, n) -> acc + n, ctx.getMaterializer());
    return onSuccess(sumF, sum -> complete("Sum: " + sum));
  });
});

Map<String, String> filenameMapping = new HashMap<>();
filenameMapping.put("filename", "primes.csv");

akka.http.javadsl.model.Multipart.FormData multipartForm =
  Multiparts.createStrictFormDataFromParts(
    Multiparts.createFormDataBodyPartStrict("csv",
      HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8,
        "2,3,5\n7,11,13,17,23\n29,31,37\n"), filenameMapping));

// test:
testRoute(route).run(HttpRequest.POST("/").withEntity(
  multipartForm.toEntity(BodyPartRenderer.randomBoundaryWithDefaults())))
  .assertStatusCode(StatusCodes.OK)
  .assertEntityAs(Unmarshaller.entityToString(), "Sum: 178");
```

## Code Examples

### Example 1: Signature

```scala
def fileUpload(fieldName: String): Directive1[(FileInfo, Source[ByteString, Any])]
```

### Example 2: Example

```scala
// adding integers as a service
val route =
  extractRequestContext { ctx =>
    implicit val materializer = ctx.materializer

    fileUpload("csv") {
      case (metadata, byteSource) =>

        val sumF: Future[Int] =
          // sum the numbers as they arrive so that we can
          // accept any size of file
          byteSource.via(Framing.delimiter(ByteString("\n"), 1024))
            .mapConcat(_.utf8String.split(",").toVector)
            .map(_.toInt)
            .runFold(0) { (acc, n) => acc + n }

        onSuccess(sumF) { sum => complete(s"Sum: $sum") }
    }
  }

// tests:
val multipartForm =
  Multipart.FormData(Multipart.FormData.BodyPart.Strict(
    "csv",
    HttpEntity(ContentTypes.`text/plain(UTF-8)`, "2,3,5\n7,11,13,17,23\n29,31,37\n"),
    Map("filename" -> "primes.csv")))

Post("/", multipartForm) ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Sum: 178"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractRequestContext;
import static akka.http.javadsl.server.Directives.fileUpload;
import static akka.http.javadsl.server.Directives.onSuccess;

final Route route = extractRequestContext(ctx -> {
  return fileUpload("csv", (metadata, byteSource) -> {
    // sum the numbers as they arrive
    CompletionStage<Integer> sumF = byteSource.via(Framing.delimiter(
      ByteString.fromString("\n"), 1024))
        .mapConcat(bs -> Arrays.asList(bs.utf8String().split(",")))
        .map(s -> Integer.parseInt(s))
        .runFold(0, (acc, n) -> acc + n, ctx.getMaterializer());
    return onSuccess(sumF, sum -> complete("Sum: " + sum));
  });
});

Map<String, String> filenameMapping = new HashMap<>();
filenameMapping.put("filename", "primes.csv");

akka.http.javadsl.model.Multipart.FormData multipartForm =
  Multiparts.createStrictFormDataFromParts(
    Multiparts.createFormDataBodyPartStrict("csv",
      HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8,
        "2,3,5\n7,11,13,17,23\n29,31,37\n"), filenameMapping));

// test:
testRoute(route).run(HttpRequest.POST("/").withEntity(
  multipartForm.toEntity(BodyPartRenderer.randomBoundaryWithDefaults())))
  .assertStatusCode(StatusCodes.OK)
  .assertEntityAs(Unmarshaller.entityToString(), "Sum: 178");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUploadAll.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUpload.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUpload.html)*
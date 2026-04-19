---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUploadAll.html
title: fileUploadAll • Akka HTTP
---

# fileUploadAll • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# fileUploadAll

## Signature

```
def fileUploadAll(fieldName: String): Directive1[immutable.Seq[(FileInfo, Source[ByteString, Any])]]
```

## Description

Simple access to streams of bytes for all files uploaded in a multipart form together with metadata about each upload.

If there is no field with the given name the request will be rejected.

Note
This directive buffers all files to temporary files on disk in files prefixed `akka-http-upload`. This is to work around limitations of the HTTP multipart format. To upload only one file it may be preferred to use the [fileUpload](fileUpload.html#fileupload) directive, as it streams the file directly without buffering.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FileUploadDirectivesExamplesSpec.scala#L136-L176 "Go to snippet source")  
// adding integers as a service
val route =
  extractRequestContext { ctx =>
    implicit val materializer = ctx.materializer

    fileUploadAll("csv") {
      case byteSources =>
        // accumulate the sum of each file
        val sumF: Future[Int] = byteSources.foldLeft(Future.successful(0)) {
          case (accF, (metadata, byteSource)) =>
            // sum the numbers as they arrive
            val intF = byteSource.via(Framing.delimiter(ByteString("\n"), 1024))
              .mapConcat(_.utf8String.split(",").toVector)
              .map(_.toInt)
              .runFold(0) { (acc, n) => acc + n }

            accF.flatMap(acc => intF.map(acc + _))
        }

        onSuccess(sumF) { sum => complete(s"Sum: $sum") }
    }
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
      HttpEntity(ContentTypes.`text/plain(UTF-8)`, "41,43,47\n53,59,61,67,71\n73,79,83\n"),
      Map("filename" -> "primesB.csv")))

Post("/", multipartForm) ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Sum: 855"
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FileUploadDirectivesExamplesTest.java#L49-L213 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractRequestContext;
import static akka.http.javadsl.server.Directives.fileUploadAll;
import static akka.http.javadsl.server.Directives.onSuccess;

final Route route = extractRequestContext(ctx -> {
  return fileUploadAll("csv", byteSources -> {
    // accumulate the sum of each file
    CompletionStage<Integer> sumF = byteSources.stream()
      .map(item -> {
        // sum the numbers as they arrive
        return item.getValue().via(Framing.delimiter(
          ByteString.fromString("\n"), 1024))
            .mapConcat(bs -> Arrays.asList(bs.utf8String().split(",")))
            .map(s -> Integer.parseInt(s))
            .runFold(0, (acc, n) -> acc + n, ctx.getMaterializer());
      })
      .reduce(CompletableFuture.completedFuture(0), (accF, intF) -> {
        return accF.thenCombine(intF, (a, b) -> a + b);
      });

    return onSuccess(sumF, sum -> complete("Sum: " + sum));
  });
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
testRoute(route).run(HttpRequest.POST("/").withEntity(
  multipartForm.toEntity(BodyPartRenderer.randomBoundaryWithDefaults())))
  .assertStatusCode(StatusCodes.OK)
  .assertEntityAs(Unmarshaller.entityToString(), "Sum: 855");
```

## Code Examples

### Example 1: Signature

```scala
def fileUploadAll(fieldName: String): Directive1[immutable.Seq[(FileInfo, Source[ByteString, Any])]]
```

### Example 2: Example

```scala
// adding integers as a service
val route =
  extractRequestContext { ctx =>
    implicit val materializer = ctx.materializer

    fileUploadAll("csv") {
      case byteSources =>
        // accumulate the sum of each file
        val sumF: Future[Int] = byteSources.foldLeft(Future.successful(0)) {
          case (accF, (metadata, byteSource)) =>
            // sum the numbers as they arrive
            val intF = byteSource.via(Framing.delimiter(ByteString("\n"), 1024))
              .mapConcat(_.utf8String.split(",").toVector)
              .map(_.toInt)
              .runFold(0) { (acc, n) => acc + n }

            accF.flatMap(acc => intF.map(acc + _))
        }

        onSuccess(sumF) { sum => complete(s"Sum: $sum") }
    }
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
      HttpEntity(ContentTypes.`text/plain(UTF-8)`, "41,43,47\n53,59,61,67,71\n73,79,83\n"),
      Map("filename" -> "primesB.csv")))

Post("/", multipartForm) ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "Sum: 855"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractRequestContext;
import static akka.http.javadsl.server.Directives.fileUploadAll;
import static akka.http.javadsl.server.Directives.onSuccess;

final Route route = extractRequestContext(ctx -> {
  return fileUploadAll("csv", byteSources -> {
    // accumulate the sum of each file
    CompletionStage<Integer> sumF = byteSources.stream()
      .map(item -> {
        // sum the numbers as they arrive
        return item.getValue().via(Framing.delimiter(
          ByteString.fromString("\n"), 1024))
            .mapConcat(bs -> Arrays.asList(bs.utf8String().split(",")))
            .map(s -> Integer.parseInt(s))
            .runFold(0, (acc, n) -> acc + n, ctx.getMaterializer());
      })
      .reduce(CompletableFuture.completedFuture(0), (accF, intF) -> {
        return accF.thenCombine(intF, (a, b) -> a + b);
      });

    return onSuccess(sumF, sum -> complete("Sum: " + sum));
  });
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
testRoute(route).run(HttpRequest.POST("/").withEntity(
  multipartForm.toEntity(BodyPartRenderer.randomBoundaryWithDefaults())))
  .assertStatusCode(StatusCodes.OK)
  .assertEntityAs(Unmarshaller.entityToString(), "Sum: 855");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUpload.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/storeUploadedFile.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUploadAll.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/fileUploadAll.html)*
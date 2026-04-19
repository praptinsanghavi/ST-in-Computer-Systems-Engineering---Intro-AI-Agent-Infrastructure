---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromPath.html
title: FileIO.fromPath • Akka core
---

# FileIO.fromPath • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# FileIO.fromPath

Emits the contents of a file from the given path.

[File IO Sinks and Sources](../index.html#file-io-sinks-and-sources)

## Signature

[`FileIO.fromPath`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html#fromPath(java.nio.file.Path,int,long) "akka.stream.javadsl.FileIO")[`FileIO.fromPath`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html#fromPath(f:java.nio.file.Path,chunkSize:Int,startPosition:Long):akka.stream.scaladsl.Source[akka.util.ByteString,scala.concurrent.Future[akka.stream.IOResult]] "akka.stream.scaladsl.FileIO")

## Description

Emits the contents of a file from the given path, as `ByteString`s, materializes into a `Future` `CompletionStage` which will be completed with a `IOResult` upon reaching the end of the file or if there is a failure.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/io/StreamFileDocSpec.scala#L33-L57 "Go to snippet source")import akka.stream.scaladsl._
val file = Paths.get("example.csv")

val foreach: Future[IOResult] = FileIO.fromPath(file).to(Sink.ignore).run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/io/StreamFileDocTest.java#L48-L67 "Go to snippet source")final Path file = Paths.get("example.csv");
  Sink<ByteString, CompletionStage<Done>> printlnSink =
      Sink.<ByteString>foreach(chunk -> System.out.println(chunk.utf8String()));

  CompletionStage<IOResult> ioResult = FileIO.fromPath(file).to(printlnSink).run(system);
```

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl._
val file = Paths.get("example.csv")

val foreach: Future[IOResult] = FileIO.fromPath(file).to(Sink.ignore).run()
```

### Example 2: Example

```java
final Path file = Paths.get("example.csv");
  Sink<ByteString, CompletionStage<Done>> printlnSink =
      Sink.<ByteString>foreach(chunk -> System.out.println(chunk.utf8String()));

  CompletionStage<IOResult> ioResult = FileIO.fromPath(file).to(printlnSink).run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromPublisher.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromOutputStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromPath.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromPath.html)*
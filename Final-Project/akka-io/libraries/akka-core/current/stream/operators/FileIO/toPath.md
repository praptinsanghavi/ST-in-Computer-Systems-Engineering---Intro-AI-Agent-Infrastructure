---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:16Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toPath.html
title: FileIO.toPath • Akka core
---

# FileIO.toPath • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# FileIO.toPath

Create a sink which will write incoming `ByteString` s to a given file path.

[File IO Sinks and Sources](../index.html#file-io-sinks-and-sources)

## Signature

[`FileIO.toPath`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html#toPath(java.nio.file.Path,java.util.Set,long) "akka.stream.javadsl.FileIO")[`FileIO.toPath`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html#toPath(f:java.nio.file.Path,options:Set[java.nio.file.OpenOption],startPosition:Long):akka.stream.scaladsl.Sink[akka.util.ByteString,scala.concurrent.Future[akka.stream.IOResult]] "akka.stream.scaladsl.FileIO")

## Description

Creates a Sink which writes incoming `ByteString` elements to the given file path. Overwrites existing files by truncating their contents as default. Materializes a `Future` `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion, and a possible exception if IO operation was not completed successfully.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/io/StreamFileDocSpec.scala#L46-L70 "Go to snippet source")val file = Paths.get("greeting.txt")
val text = Source.single("Hello Akka Stream!")
val result: Future[IOResult] = text.map(t => ByteString(t)).runWith(FileIO.toPath(file))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/io/StreamFileDocTest.java#L54-L99 "Go to snippet source")final Path file = Paths.get("greeting.txt");
  Sink<ByteString, CompletionStage<IOResult>> fileSink = FileIO.toPath(file);
  Source<String, NotUsed> textSource = Source.single("Hello Akka Stream!");

  CompletionStage<IOResult> ioResult =
      textSource.map(ByteString::fromString).runWith(fileSink, system);
```

## Code Examples

### Example 1: Example

```scala
val file = Paths.get("greeting.txt")
val text = Source.single("Hello Akka Stream!")
val result: Future[IOResult] = text.map(t => ByteString(t)).runWith(FileIO.toPath(file))
```

### Example 2: Example

```java
final Path file = Paths.get("greeting.txt");
  Sink<ByteString, CompletionStage<IOResult>> fileSink = FileIO.toPath(file);
  Source<String, NotUsed> textSource = Source.single("Hello Akka Stream!");

  CompletionStage<IOResult> ioResult =
      textSource.map(ByteString::fromString).runWith(fileSink, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toFile.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfold.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toPath.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toPath.html)*
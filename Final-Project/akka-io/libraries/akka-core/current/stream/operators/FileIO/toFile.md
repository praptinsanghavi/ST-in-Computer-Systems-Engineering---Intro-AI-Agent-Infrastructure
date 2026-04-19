---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toFile.html
title: FileIO.toFile • Akka core
---

# FileIO.toFile • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# FileIO.toFile

Create a sink which will write incoming `ByteString` s to a given file.

[File IO Sinks and Sources](../index.html#file-io-sinks-and-sources)

Warning
The `toFile` operator has been deprecated, use [toPath](toPath.html) instead. 

## Signature

[`FileIO.toFile`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html#toFile(java.io.File,java.util.Set) "akka.stream.javadsl.FileIO")[`FileIO.toFile`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html#toFile(f:java.io.File,options:Set[java.nio.file.OpenOption]):akka.stream.scaladsl.Sink[akka.util.ByteString,scala.concurrent.Future[akka.stream.IOResult]] "akka.stream.scaladsl.FileIO")

## Description

Creates a Sink which writes incoming `ByteString` elements to the given file path. Overwrites existing files by truncating their contents as default. Materializes a `Future` `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion, and a possible exception if IO operation was not completed successfully.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toPath.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/tick.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toFile.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toFile.html)*
---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromFile.html
title: FileIO.fromFile • Akka core
---

# FileIO.fromFile • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# FileIO.fromFile

Emits the contents of a file.

[File IO Sinks and Sources](../index.html#file-io-sinks-and-sources)

Warning
The `fromFile` operator has been deprecated, use [fromPath](fromPath.html) instead. 

## Signature

[`FileIO.fromFile`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html#fromFile(java.io.File) "akka.stream.javadsl.FileIO")[`FileIO.fromFile`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html#fromFile(f:java.io.File,chunkSize:Int):akka.stream.scaladsl.Source[akka.util.ByteString,scala.concurrent.Future[akka.stream.IOResult]] "akka.stream.scaladsl.FileIO")

## Description

Emits the contents of a file, as `ByteString`s, materializes into a `Future` `CompletionStage` which will be completed with a `IOResult` upon reaching the end of the file or if there is a failure.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromPath.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromCompletionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFuture.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromFile.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromFile.html)*
---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gunzip.html
title: Compression.gunzip • Akka core
---

# Compression.gunzip • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Compression.gunzip

Creates a flow that gzip\-decompresses a stream of ByteStrings. 

[Compression operators](../index.html#compression-operators)

## Signature

[`Compression.gunzip`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html#gunzip(int) "akka.stream.javadsl.Compression")[`Compression.gunzip`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html#gunzip(maxBytesPerChunk:Int):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "akka.stream.scaladsl.Compression")

## Description

Creates a flow that gzip\-decompresses a stream of ByteStrings. If the input is truncated, uses invalid compression method or is invalid (failed CRC checks) this operator fails with a `java.util.zip.ZipException`. 

## Reactive Streams semantics

**emits** when the decompression algorithm produces output for the received `ByteString` (the emitted `ByteString` is of `maxBytesPerChunk` maximum length)

**backpressures** when downstream backpressures

**completes** when upstream completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gzip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gunzip.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gunzip.html)*
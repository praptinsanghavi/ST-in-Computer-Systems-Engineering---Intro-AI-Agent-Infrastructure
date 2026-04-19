---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/inflate.html
title: Compression.inflate • Akka core
---

# Compression.inflate • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Compression.inflate

Creates a flow that deflate\-decompresses a stream of ByteStrings. 

[Compression operators](../index.html#compression-operators)

## Signature

[`Compression.indeflate`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html#inflate(int,boolean) "akka.stream.javadsl.Compression")[`Compression.indeflate`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html#inflate(maxBytesPerChunk:Int,nowrap:Boolean):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "akka.stream.scaladsl.Compression")

## Description

Creates a flow that deflate\-decompresses a stream of ByteStrings.

## Reactive Streams semantics

**emits** when the compression algorithm produces output for the received `ByteString` (the emitted `ByteString` is of `maxBytesPerChunk` maximum length)

**backpressures** when downstream backpressures

**completes** when upstream completes (may emit finishing bytes in an extra `ByteString` )

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/ignore.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialDelay.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/inflate.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/inflate.html)*
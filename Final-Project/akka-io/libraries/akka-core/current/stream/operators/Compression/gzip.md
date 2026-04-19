---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gzip.html
title: Compression.gzip • Akka core
---

# Compression.gzip • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Compression.gzip

Creates a flow that gzip\-compresses a stream of ByteStrings. 

[Compression operators](../index.html#compression-operators)

## Signature

[`Compression.gzip`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html#gzip() "akka.stream.javadsl.Compression")[`Compression.gzip`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html#gzip:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "akka.stream.scaladsl.Compression")

## Description

Creates a flow that gzip\-compresses a stream of ByteStrings. Note that the compressor will SYNC\_FLUSH after every [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") so that it is guaranteed that every [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") coming out of the flow can be fully decompressed without waiting for additional data. This may come at a compression performance cost for very small chunks.

Use the overload method to control the compression level.

## Reactive Streams semantics

**emits** when the compression algorithm produces output for the received `ByteString`

**backpressures** when downstream backpressures

**completes** when upstream completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gunzip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/head.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gzip.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gzip.html)*
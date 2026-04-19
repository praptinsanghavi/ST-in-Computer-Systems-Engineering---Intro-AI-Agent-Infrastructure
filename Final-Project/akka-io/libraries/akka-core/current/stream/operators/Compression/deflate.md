---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/deflate.html
title: Compression.deflate • Akka core
---

# Compression.deflate • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Compression.deflate

Creates a flow that deflate\-compresses a stream of ByteStrings. 

[Compression operators](../index.html#compression-operators)

## Signature

[`Compression.deflate`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html#deflate() "akka.stream.javadsl.Compression")[`Compression.deflate`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html#deflate:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "akka.stream.scaladsl.Compression")

## Description

Creates a flow that deflate\-compresses a stream of ByteStrings. Note that the compressor will SYNC\_FLUSH after every [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") so that it is guaranteed that every [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") coming out of the flow can be fully decompressed without waiting for additional data. This may come at a compression performance cost for very small chunks.

Use the overload method with parameters to control the compression level and compatibility with GZip. 

## Reactive Streams semantics

**emits** when the compression algorithm produces output for the received `ByteString`

**backpressures** when downstream backpressures

**completes** when upstream completes (may emit finishing bytes in an extra `ByteString` )

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/delay.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/cycle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/deflate.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/deflate.html)*
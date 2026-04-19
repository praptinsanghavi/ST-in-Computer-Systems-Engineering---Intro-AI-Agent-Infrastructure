---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollectorParallelUnordered.html
title: StreamConverters.javaCollectorParallelUnordered • Akka core
---

# StreamConverters.javaCollectorParallelUnordered • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StreamConverters.javaCollectorParallelUnordered

Create a sink which materializes into a `Future` `CompletionStage` which will be completed with a result of the Java 8 `Collector` transformation and reduction operations.

[Additional Sink and Source converters](../index.html#additional-sink-and-source-converters)

## Signature

[`StreamConverters.javaCollectorParallelUnordered`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html#javaCollectorParallelUnordered(int,akka.japi.function.Creator) "akka.stream.javadsl.StreamConverters")[`StreamConverters.javaCollectorParallelUnordered`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html#javaCollectorParallelUnordered[T,R](parallelism:Int)(collectorFactory:()=>java.util.stream.Collector[T,_,R]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[R]] "akka.stream.scaladsl.StreamConverters")

## Description

TODO: We would welcome help on contributing descriptions and examples, see: [https://github.com/akka/akka\-core/issues/25646](https://github.com/akka/akka-core/issues/25646)

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/keepAlive.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollector.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollectorParallelUnordered.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollectorParallelUnordered.html)*
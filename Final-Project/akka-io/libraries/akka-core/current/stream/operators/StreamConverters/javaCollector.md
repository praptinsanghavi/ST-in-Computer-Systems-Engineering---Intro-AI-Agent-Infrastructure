---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollector.html
title: StreamConverters.javaCollector • Akka core
---

# StreamConverters.javaCollector • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StreamConverters.javaCollector

Create a sink which materializes into a `Future` `CompletionStage` which will be completed with a result of the Java 8 `Collector` transformation and reduction operations.

[Additional Sink and Source converters](../index.html#additional-sink-and-source-converters)

## Signature

[`StreamConverters.javaCollector`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html#javaCollector(akka.japi.function.Creator) "akka.stream.javadsl.StreamConverters")[`StreamConverters.javaCollector`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html#javaCollector[T,R](collectorFactory:()=>java.util.stream.Collector[T,_,R]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[R]] "akka.stream.scaladsl.StreamConverters")

## Description

TODO: We would welcome help on contributing descriptions and examples, see: [https://github.com/akka/akka\-core/issues/25646](https://github.com/akka/akka-core/issues/25646)

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/intersperse.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollectorParallelUnordered.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollector.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollector.html)*
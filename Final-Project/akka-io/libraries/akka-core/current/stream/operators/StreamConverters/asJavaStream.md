---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asJavaStream.html
title: StreamConverters.asJavaStream • Akka core
---

# StreamConverters.asJavaStream • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StreamConverters.asJavaStream

Create a sink which materializes into Java 8 `Stream` that can be run to trigger demand through the sink.

[Additional Sink and Source converters](../index.html#additional-sink-and-source-converters)

## Signature

[`StreamConverters`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html#asJavaStream() "akka.stream.javadsl.StreamConverters")[`StreamConverters`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html#asJavaStream[T]():akka.stream.scaladsl.Sink[T,java.util.stream.Stream[T]] "akka.stream.scaladsl.StreamConverters")

## Description

Create a sink which materializes into Java 8 `Stream` that can be run to trigger demand through the sink. Elements emitted through the stream will be available for reading through the Java 8 `Stream`.

The Java 8 `Stream` will be ended when the stream flowing into this `Sink` completes, and closing the Java `Stream` will cancel the inflow of this `Sink`. If the Java `Stream` throws an exception, the Akka stream is cancelled.

Be aware that Java `Stream` blocks current thread while waiting on next element from downstream.

## Example

Here is an example of a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") that materializes into a [`java.util.stream.Stream`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html "java.util.stream.Stream"). 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/converters/StreamConvertersToJava.scala#L8-L15 "Go to snippet source")import java.util.stream
import java.util.stream.IntStream

import akka.NotUsed
import akka.stream.scaladsl.Keep
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.StreamConverters
val source: Source[Int, NotUsed] = Source(0 to 9).filter(_ % 2 == 0)

val sink: Sink[Int, stream.Stream[Int]] = StreamConverters.asJavaStream[Int]()

val jStream: java.util.stream.Stream[Int] = source.runWith(sink)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/converters/StreamConvertersToJava.java#L10-L21 "Go to snippet source")import akka.japi.function.Creator;
import akka.stream.Materializer;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.StreamConverters;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

Source<Integer, NotUsed> source = Source.range(0, 9).filter(i -> i % 2 == 0);

Sink<Integer, java.util.stream.Stream<Integer>> sink = StreamConverters.<Integer>asJavaStream();

Stream<Integer> jStream = source.runWith(sink, system);

```

## Reactive Streams semantics

**cancels** when the Java Stream is closed

**backpressures** when no read is pending on the Java Stream

## Code Examples

### Example 1: Example

```scala
import java.util.stream
import java.util.stream.IntStream

import akka.NotUsed
import akka.stream.scaladsl.Keep
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.StreamConverters
val source: Source[Int, NotUsed] = Source(0 to 9).filter(_ % 2 == 0)

val sink: Sink[Int, stream.Stream[Int]] = StreamConverters.asJavaStream[Int]()

val jStream: java.util.stream.Stream[Int] = source.runWith(sink)
```

### Example 2: Example

```java
import akka.japi.function.Creator;
import akka.stream.Materializer;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.StreamConverters;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

Source<Integer, NotUsed> source = Source.range(0, 9).filter(i -> i % 2 == 0);

Sink<Integer, java.util.stream.Stream<Integer>> sink = StreamConverters.<Integer>asJavaStream();

Stream<Integer> jStream = source.runWith(sink, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/ask.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asInputStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asJavaStream.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asJavaStream.html)*
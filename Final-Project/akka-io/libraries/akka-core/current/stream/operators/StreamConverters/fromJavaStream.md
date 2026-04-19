---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromJavaStream.html
title: StreamConverters.fromJavaStream • Akka core
---

# StreamConverters.fromJavaStream • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StreamConverters.fromJavaStream

Create a source that wraps a Java 8 `java.util.stream.Stream`.

[Additional Sink and Source converters](../index.html#additional-sink-and-source-converters)

## Signature

[`StreamConverters`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html#fromJavaStream(akka.japi.function.Creator) "akka.stream.javadsl.StreamConverters")[`StreamConverters`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html#fromJavaStream[T,S%3C:java.util.stream.BaseStream[T,S]](stream:()=%3Ejava.util.stream.BaseStream[T,S]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.StreamConverters")

## Example

Here is an example of a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") created from a [`java.util.stream.Stream`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html "java.util.stream.Stream").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/converters/StreamConvertersToJava.scala#L8-L15 "Go to snippet source")import java.util.stream
import java.util.stream.IntStream

import akka.NotUsed
import akka.stream.scaladsl.Keep
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.StreamConverters
def factory(): IntStream = IntStream.rangeClosed(0, 9)
val source: Source[Int, NotUsed] = StreamConverters.fromJavaStream(() => factory()).map(_.intValue())
val sink: Sink[Int, Future[immutable.Seq[Int]]] = Sink.seq[Int]

val futureInts: Future[immutable.Seq[Int]] = source.toMat(sink)(Keep.right).run()

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

Creator<BaseStream<Integer, IntStream>> creator = () -> IntStream.rangeClosed(0, 9);
Source<Integer, NotUsed> source = StreamConverters.fromJavaStream(creator);

Sink<Integer, CompletionStage<Integer>> sink = Sink.last();

CompletionStage<Integer> integerCompletionStage = source.runWith(sink, system);
```

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
def factory(): IntStream = IntStream.rangeClosed(0, 9)
val source: Source[Int, NotUsed] = StreamConverters.fromJavaStream(() => factory()).map(_.intValue())
val sink: Sink[Int, Future[immutable.Seq[Int]]] = Sink.seq[Int]

val futureInts: Future[immutable.Seq[Int]] = source.toMat(sink)(Keep.right).run()
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

Creator<BaseStream<Integer, IntStream>> creator = () -> IntStream.rangeClosed(0, 9);
Source<Integer, NotUsed> source = StreamConverters.fromJavaStream(creator);

Sink<Integer, CompletionStage<Integer>> sink = Sink.last();

CompletionStage<Integer> integerCompletionStage = source.runWith(sink, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fromMaterializer.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromJavaStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromJavaStream.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromJavaStream.html)*
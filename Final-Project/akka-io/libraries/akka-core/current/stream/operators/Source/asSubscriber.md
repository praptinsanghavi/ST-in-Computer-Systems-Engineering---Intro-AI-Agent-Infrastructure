---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSubscriber.html
title: Source.asSubscriber • Akka core
---

# Source.asSubscriber • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.asSubscriber

Integration with Reactive Streams, materializes into a [`Subscriber`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Subscriber.html "java.util.concurrent.Flow.Subscriber").

[Source operators](../index.html#source-operators)

## Signature

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/JavaFlowSupport.scala#L54 "Go to snippet source")def asSubscriber[T]: Source[T, java.util.concurrent.Flow.Subscriber[T]] =
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java-jdk9-only/jdocs/stream/operators/source/AsSubscriber.java#L26 "Go to snippet source")static <T> akka.stream.javadsl.Source<T, Subscriber<T>> asSubscriber()
```

## Description

If you want to create a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that gets its elements from another library that supports [Reactive Streams](https://www.reactive-streams.org/), you can use `JavaFlowSupport.Source.asSubscriber`. Each time this [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") is materialized, it produces a materialized value of type [`java.util.concurrent.Flow.Subscriber`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Subscriber.html "java.util.concurrent.Flow.Subscriber"). This [`Subscriber`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Subscriber.html "java.util.concurrent.Flow.Subscriber") can be attached to a [Reactive Streams](https://www.reactive-streams.org/) [`Publisher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Publisher.html "java.util.concurrent.Flow.Publisher") to populate it.

If the API you want to consume elements from provides a [`Publisher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Publisher.html "java.util.concurrent.Flow.Publisher") instead of accepting a [`Subscriber`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Subscriber.html "java.util.concurrent.Flow.Subscriber"), see [fromPublisher](fromPublisher.html).

Note
For JDK 8 users: since [`java.util.concurrent.Flow`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.html "java.util.concurrent.Flow") was introduced in JDK version 9, if you are still on version 8 you may use the [org.reactivestreams](https://github.com/reactive-streams/reactive-streams-jvm#reactive-streams) library with [`Source.asSubscriber`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#asSubscriber() "akka.stream.javadsl.Source")[`Source.asSubscriber`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#asSubscriber[T]:akka.stream.scaladsl.Source[T,org.reactivestreams.Subscriber[T]] "akka.stream.scaladsl.Source").

## Example

Suppose we use a database client that supports [Reactive Streams](https://www.reactive-streams.org/), we could create a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that queries the database for its rows. That [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") can then be used for further processing, for example creating a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that contains the names of the rows.

Note that since the database is queried for each materialization, the `rowSource` can be safely re\-used. Because both the database driver and Akka Streams support [Reactive Streams](https://www.reactive-streams.org/), backpressure is applied throughout the stream, preventing us from running out of memory when the database rows are consumed slower than they are produced by the database.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala-jdk9-only/docs/stream/operators/source/AsSubscriber.scala#L8-L14 "Go to snippet source")import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Publisher;

import akka.NotUsed;
import akka.stream.scaladsl.Source;
import akka.stream.scaladsl.JavaFlowSupport;

val rowSource: Source[Row, NotUsed] =
  JavaFlowSupport.Source.asSubscriber
    .mapMaterializedValue(
      (subscriber: Subscriber[Row]) => {
        // For each materialization, fetch the rows from the database:
        val rows: Publisher[Row] = databaseClient.fetchRows()
        rows.subscribe(subscriber)
        NotUsed
      });

val names: Source[String, NotUsed] =
  // rowSource can be re-used, since it will start a new
  // query for each materialization, fully supporting backpressure
  // for each materialized stream:
  rowSource.map(row => row.name);
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java-jdk9-only/jdocs/stream/operators/source/AsSubscriber.java#L8-L14 "Go to snippet source")import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Publisher;

import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.JavaFlowSupport;

class Example {
    Source<Row, NotUsed> rowSource =
            JavaFlowSupport.Source.<Row>asSubscriber()
                    .mapMaterializedValue(
                            subscriber -> {
                                // For each materialization, fetch the rows from the database:
                                Publisher<Row> rows = databaseClient.fetchRows();
                                rows.subscribe(subscriber);

                                return NotUsed.getInstance();
                            });

    public Source<String, NotUsed> names() {
        // rowSource can be re-used, since it will start a new
        // query for each materialization, fully supporting backpressure
        // for each materialized stream:
        return rowSource.map(row -> row.getField("name"));
    }
}
```

## Code Examples

### Example 1: Signature

```scala
def asSubscriber[T]: Source[T, java.util.concurrent.Flow.Subscriber[T]] =
```

### Example 2: Signature

```java
static <T> akka.stream.javadsl.Source<T, Subscriber<T>> asSubscriber()
```

### Example 3: Example

```scala
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Publisher;

import akka.NotUsed;
import akka.stream.scaladsl.Source;
import akka.stream.scaladsl.JavaFlowSupport;

val rowSource: Source[Row, NotUsed] =
  JavaFlowSupport.Source.asSubscriber
    .mapMaterializedValue(
      (subscriber: Subscriber[Row]) => {
        // For each materialization, fetch the rows from the database:
        val rows: Publisher[Row] = databaseClient.fetchRows()
        rows.subscribe(subscriber)
        NotUsed
      });

val names: Source[String, NotUsed] =
  // rowSource can be re-used, since it will start a new
  // query for each materialization, fully supporting backpressure
  // for each materialized stream:
  rowSource.map(row => row.name);
```

### Example 4: Example

```java
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Publisher;

import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.JavaFlowSupport;

class Example {
    Source<Row, NotUsed> rowSource =
            JavaFlowSupport.Source.<Row>asSubscriber()
                    .mapMaterializedValue(
                            subscriber -> {
                                // For each materialization, fetch the rows from the database:
                                Publisher<Row> rows = databaseClient.fetchRows();
                                rows.subscribe(subscriber);

                                return NotUsed.getInstance();
                            });

    public Source<String, NotUsed> names() {
        // rowSource can be re-used, since it will start a new
        // query for each materialization, fully supporting backpressure
        // for each materialized stream:
        return rowSource.map(row -> row.getField("name"));
    }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/backpressureTimeout.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSourceWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromPublisher.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSubscriber.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSubscriber.html)*
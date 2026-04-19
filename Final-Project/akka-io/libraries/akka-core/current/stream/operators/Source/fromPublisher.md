---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromPublisher.html
title: Source.fromPublisher • Akka core
---

# Source.fromPublisher • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.fromPublisher

Integration with Reactive Streams, subscribes to a [`Publisher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Publisher.html "java.util.concurrent.Flow.Publisher").

[Source operators](../index.html#source-operators)

## Signature

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/JavaFlowSupport.scala#L42 "Go to snippet source")def fromPublisher[T](publisher: java.util.concurrent.Flow.Publisher[T]): Source[T, NotUsed] =
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java-jdk9-only/jdocs/stream/operators/source/FromPublisher.java#L25 "Go to snippet source")static <T> akka.stream.javadsl.Source<T, NotUsed> fromPublisher(Publisher<T> publisher)
```

## Description

If you want to create a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that gets its elements from another library that supports [Reactive Streams](https://www.reactive-streams.org/), you can use `JavaFlowSupport.Source.fromPublisher`. This source will produce the elements from the [`Publisher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Publisher.html "java.util.concurrent.Flow.Publisher"), and coordinate backpressure as needed.

If the API you want to consume elements from accepts a [`Subscriber`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Subscriber.html "java.util.concurrent.Flow.Subscriber") instead of providing a [`Publisher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Publisher.html "java.util.concurrent.Flow.Publisher"), see [asSubscriber](asSubscriber.html).

Note
For JDK 8 users: since [`java.util.concurrent.Flow`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.html "java.util.concurrent.Flow") was introduced in JDK version 9, if you are still on version 8 you may use the [org.reactivestreams](https://github.com/reactive-streams/reactive-streams-jvm#reactive-streams) library with [`Source.fromPublisher`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#fromPublisher(org.reactivestreams.Publisher) "akka.stream.javadsl.Source")[`Source.fromPublisher`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#fromPublisher[T](publisher:org.reactivestreams.Publisher[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source").

## Example

Suppose we use a database client that supports [Reactive Streams](https://www.reactive-streams.org/), we could create a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that queries the database for its rows. That [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") can then be used for further processing, for example creating a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that contains the names of the rows.

Because both the database driver and Akka Streams support [Reactive Streams](https://www.reactive-streams.org/), backpressure is applied throughout the stream, preventing us from running out of memory when the database rows are consumed slower than they are produced by the database.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala-jdk9-only/docs/stream/operators/source/FromPublisher.scala#L8-L14 "Go to snippet source")import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Publisher;

import akka.NotUsed;
import akka.stream.scaladsl.Source;
import akka.stream.scaladsl.JavaFlowSupport;

val names: Source[String, NotUsed] =
  // A new subscriber will subscribe to the supplied publisher for each
  // materialization, so depending on whether the database client supports
  // this the Source can be materialized more than once.
  JavaFlowSupport.Source.fromPublisher(databaseClient.fetchRows())
    .map(row => row.name);
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java-jdk9-only/jdocs/stream/operators/source/FromPublisher.java#L8-L13 "Go to snippet source")import java.util.concurrent.Flow.Publisher;

import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.JavaFlowSupport;

class Example {
    public Source<String, NotUsed> names() {
        // A new subscriber will subscribe to the supplied publisher for each
        // materialization, so depending on whether the database client supports
        // this the Source can be materialized more than once.
        return JavaFlowSupport.Source.<Row>fromPublisher(databaseClient.fetchRows())
            .map(row -> row.getField("name"));
    }
}
```

## Code Examples

### Example 1: Signature

```scala
def fromPublisher[T](publisher: java.util.concurrent.Flow.Publisher[T]): Source[T, NotUsed] =
```

### Example 2: Signature

```java
static <T> akka.stream.javadsl.Source<T, NotUsed> fromPublisher(Publisher<T> publisher)
```

### Example 3: Example

```scala
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Publisher;

import akka.NotUsed;
import akka.stream.scaladsl.Source;
import akka.stream.scaladsl.JavaFlowSupport;

val names: Source[String, NotUsed] =
  // A new subscriber will subscribe to the supplied publisher for each
  // materialization, so depending on whether the database client supports
  // this the Source can be materialized more than once.
  JavaFlowSupport.Source.fromPublisher(databaseClient.fetchRows())
    .map(row => row.name);
```

### Example 4: Example

```java
import java.util.concurrent.Flow.Publisher;

import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.JavaFlowSupport;

class Example {
    public Source<String, NotUsed> names() {
        // A new subscriber will subscribe to the supplied publisher for each
        // materialization, so depending on whether the database client supports
        // this the Source can be materialized more than once.
        return JavaFlowSupport.Source.<Row>fromPublisher(databaseClient.fetchRows())
            .map(row -> row.getField("name"));
    }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromPath.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/fromSinkAndSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSubscriber.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromPublisher.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromPublisher.html)*
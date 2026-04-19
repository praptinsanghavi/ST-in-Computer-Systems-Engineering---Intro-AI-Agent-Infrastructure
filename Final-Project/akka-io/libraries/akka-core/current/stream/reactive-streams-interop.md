---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/reactive-streams-interop.html
title: Reactive Streams Interop • Akka core
---

# Reactive Streams Interop • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Reactive Streams Interop

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Streams, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

## Overview

Akka Streams implements the [Reactive Streams](https://www.reactive-streams.org/) standard for asynchronous stream processing with non\-blocking back pressure. 

Since Java 9 the APIs of Reactive Streams has been included in the Java Standard library, under the `java.util.concurrent.Flow` namespace. For Java 8 there is instead a separate Reactive Streams artifact with the same APIs in the package `org.reactivestreams`.

Akka streams provides interoperability for both these two API versions, the Reactive Streams interfaces directly through factories on the regular `Source` and `Sink` APIs. For the Java 9 and later built in interfaces there is a separate set of factories in `akka.stream.scaladsl.JavaFlowSupport``akka.stream.javadsl.JavaFlowSupport`.

In the following samples the standalone Reactive Stream API factories has been used but each such call can be replaced with the corresponding method from `JavaFlowSupport` and the JDK `java.util.concurrent.Flow._``java.util.concurrent.Flow.*` interfaces.

Note that it is not possible to use `JavaFlowSupport` on Java 8 since the needed interfaces simply is not available in the Java standard library.

The two most important interfaces in Reactive Streams are the `Publisher` and `Subscriber`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L19-L21 "Go to snippet source")import org.reactivestreams.Publisher
import org.reactivestreams.Subscriber
import org.reactivestreams.Processor
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L22-L24 "Go to snippet source")import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Processor;
```

Let us assume that a library provides a publisher of tweets:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L31 "Go to snippet source")def tweets: Publisher[Tweet]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L67 "Go to snippet source")Publisher<Tweet> tweets();
```

and another library knows how to store author handles in a database:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L35 "Go to snippet source")def storage: Subscriber[Author]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L71 "Go to snippet source")Subscriber<Author> storage();
```

Using an Akka Streams `Flow` we can transform the stream and connect those:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L26-L27 "Go to snippet source")val authors = Flow[Tweet].filter(_.hashtags.contains(akkaTag)).map(_.author)

Source.fromPublisher(tweets).via(authors).to(Sink.fromSubscriber(storage)).run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L59-L61 "Go to snippet source")final Flow<Tweet, Author, NotUsed> authors =
    Flow.of(Tweet.class).filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

Source.fromPublisher(rs.tweets()).via(authors).to(Sink.fromSubscriber(rs.storage()));
```

The `Publisher` is used as an input `Source` to the flow and the `Subscriber` is used as an output `Sink`.

A `Flow` can also be converted to a `RunnableGraph[Processor[In, Out]]` which materializes to a `Processor` when `run()` is called. `run()` itself can be called multiple times, resulting in a new `Processor` instance each time.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L81-L84 "Go to snippet source")val processor: Processor[Tweet, Author] = authors.toProcessor.run()

tweets.subscribe(processor)
processor.subscribe(storage)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L154-L157 "Go to snippet source")final Processor<Tweet, Author> processor = authors.toProcessor().run(system);

rs.tweets().subscribe(processor);
processor.subscribe(rs.storage());
```

A publisher can be connected to a subscriber with the `subscribe` method.

It is also possible to expose a `Source` as a `Publisher` by using the Publisher\-`Sink`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L95-L98 "Go to snippet source")val authorPublisher: Publisher[Author] =
  Source.fromPublisher(tweets).via(authors).runWith(Sink.asPublisher(fanout = false))

authorPublisher.subscribe(storage)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L172-L177 "Go to snippet source")final Publisher<Author> authorPublisher =
    Source.fromPublisher(rs.tweets())
        .via(authors)
        .runWith(Sink.asPublisher(AsPublisher.WITHOUT_FANOUT), system);

authorPublisher.subscribe(rs.storage());
```

A publisher that is created with `Sink.asPublisher(fanout = false)``Sink.asPublisher(AsPublisher.WITHOUT_FANOUT)` supports only a single subscription. Additional subscription attempts will be rejected with an `IllegalStateException`.

A publisher that supports multiple subscribers using fan\-out/broadcasting is created as follows:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L39 "Go to snippet source")def alert: Subscriber[Author]
def storage: Subscriber[Author]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L75 "Go to snippet source")Subscriber<Author> alert();
Subscriber<Author> storage();
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L110-L114 "Go to snippet source")val authorPublisher: Publisher[Author] =
  Source.fromPublisher(tweets).via(authors).runWith(Sink.asPublisher(fanout = true))

authorPublisher.subscribe(storage)
authorPublisher.subscribe(alert)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L192-L198 "Go to snippet source")final Publisher<Author> authorPublisher =
    Source.fromPublisher(rs.tweets())
        .via(authors)
        .runWith(Sink.asPublisher(AsPublisher.WITH_FANOUT), system);

authorPublisher.subscribe(rs.storage());
authorPublisher.subscribe(rs.alert());
```

The input buffer size of the operator controls how far apart the slowest subscriber can be from the fastest subscriber before slowing down the stream.

To make the picture complete, it is also possible to expose a `Sink` as a `Subscriber` by using the Subscriber\-`Source`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L127-L130 "Go to snippet source")val tweetSubscriber: Subscriber[Tweet] =
  authors.to(Sink.fromSubscriber(storage)).runWith(Source.asSubscriber[Tweet])

tweets.subscribe(tweetSubscriber)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L213-L218 "Go to snippet source")final Subscriber<Author> storage = rs.storage();

final Subscriber<Tweet> tweetSubscriber =
    authors.to(Sink.fromSubscriber(storage)).runWith(Source.asSubscriber(), system);

rs.tweets().subscribe(tweetSubscriber);
```

It is also possible to use re\-wrap `Processor` instances as a `Flow` by passing a factory function that will create the `Processor` instances:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L139-L142 "Go to snippet source")// An example Processor factory
def createProcessor: Processor[Int, Int] = Flow[Int].toProcessor.run()

val flow: Flow[Int, Int, NotUsed] = Flow.fromProcessor(() => createProcessor)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L231-L240 "Go to snippet source")// An example Processor factory
final Creator<Processor<Integer, Integer>> factory =
    new Creator<Processor<Integer, Integer>>() {
      public Processor<Integer, Integer> create() {
        return Flow.of(Integer.class).toProcessor().run(system);
      }
    };

final Flow<Integer, Integer, NotUsed> flow = Flow.fromProcessor(factory);

```

Please note that a factory is necessary to achieve reusability of the resulting `Flow`.

## Other implementations

Implementing Reactive Streams makes it possible to plug Akka Streams together with other stream libraries that adhere to the standard. An incomplete list of other implementations:

- [Reactor (1\.1\+)](https://github.com/reactor/reactor)
- [RxJava](https://github.com/ReactiveX/RxJavaReactiveStreams)
- [Ratpack](https://www.ratpack.io/manual/current/streams.html)
- [Slick](https://scala-slick.org/)

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

### Example 4: Overview

```scala
import org.reactivestreams.Publisher
import org.reactivestreams.Subscriber
import org.reactivestreams.Processor
```

### Example 5: Overview

```java
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Processor;
```

### Example 6: Overview

```scala
def tweets: Publisher[Tweet]
```

### Example 7: Overview

```java
Publisher<Tweet> tweets();
```

### Example 8: Overview

```scala
def storage: Subscriber[Author]
```

### Example 9: Overview

```java
Subscriber<Author> storage();
```

### Example 10: Overview

```scala
val authors = Flow[Tweet].filter(_.hashtags.contains(akkaTag)).map(_.author)

Source.fromPublisher(tweets).via(authors).to(Sink.fromSubscriber(storage)).run()
```

### Example 11: Overview

```java
final Flow<Tweet, Author, NotUsed> authors =
    Flow.of(Tweet.class).filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

Source.fromPublisher(rs.tweets()).via(authors).to(Sink.fromSubscriber(rs.storage()));
```

### Example 12: Overview

```scala
val processor: Processor[Tweet, Author] = authors.toProcessor.run()

tweets.subscribe(processor)
processor.subscribe(storage)
```

### Example 13: Overview

```java
final Processor<Tweet, Author> processor = authors.toProcessor().run(system);

rs.tweets().subscribe(processor);
processor.subscribe(rs.storage());
```

### Example 14: Overview

```scala
val authorPublisher: Publisher[Author] =
  Source.fromPublisher(tweets).via(authors).runWith(Sink.asPublisher(fanout = false))

authorPublisher.subscribe(storage)
```

### Example 15: Overview

```java
final Publisher<Author> authorPublisher =
    Source.fromPublisher(rs.tweets())
        .via(authors)
        .runWith(Sink.asPublisher(AsPublisher.WITHOUT_FANOUT), system);

authorPublisher.subscribe(rs.storage());
```

### Example 16: Overview

```scala
def alert: Subscriber[Author]
def storage: Subscriber[Author]
```

### Example 17: Overview

```java
Subscriber<Author> alert();
Subscriber<Author> storage();
```

### Example 18: Overview

```scala
val authorPublisher: Publisher[Author] =
  Source.fromPublisher(tweets).via(authors).runWith(Sink.asPublisher(fanout = true))

authorPublisher.subscribe(storage)
authorPublisher.subscribe(alert)
```

### Example 19: Overview

```java
final Publisher<Author> authorPublisher =
    Source.fromPublisher(rs.tweets())
        .via(authors)
        .runWith(Sink.asPublisher(AsPublisher.WITH_FANOUT), system);

authorPublisher.subscribe(rs.storage());
authorPublisher.subscribe(rs.alert());
```

### Example 20: Overview

```scala
val tweetSubscriber: Subscriber[Tweet] =
  authors.to(Sink.fromSubscriber(storage)).runWith(Source.asSubscriber[Tweet])

tweets.subscribe(tweetSubscriber)
```

### Example 21: Overview

```java
final Subscriber<Author> storage = rs.storage();

final Subscriber<Tweet> tweetSubscriber =
    authors.to(Sink.fromSubscriber(storage)).runWith(Source.asSubscriber(), system);

rs.tweets().subscribe(tweetSubscriber);
```

### Example 22: Overview

```scala
// An example Processor factory
def createProcessor: Processor[Int, Int] = Flow[Int].toProcessor.run()

val flow: Flow[Int, Int, NotUsed] = Flow.fromProcessor(() => createProcessor)
```

### Example 23: Overview

```java
// An example Processor factory
final Creator<Processor<Integer, Integer>> factory =
    new Creator<Processor<Integer, Integer>>() {
      public Processor<Integer, Integer> create() {
        return Flow.of(Integer.class).toProcessor().run(system);
      }
    };

final Flow<Integer, Integer, NotUsed> flow = Flow.fromProcessor(factory);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/actor-interop.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-error.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/reactive-streams-interop.html](https://doc.akka.io/libraries/akka-core/current/stream/reactive-streams-interop.html)*
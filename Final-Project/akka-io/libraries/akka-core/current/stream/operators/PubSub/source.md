---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/source.html
title: PubSub.source • Akka core
---

# PubSub.source • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# PubSub.source

A source that will subscribe to a [`Topic`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html "akka.actor.typed.pubsub.Topic")[`Topic`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html "akka.actor.typed.pubsub.Topic") and stream messages published to the topic. 

[Actor interop operators](../index.html#actor-interop-operators)

The source can be materialized multiple times, each materialized stream will stream messages published to the topic after the stream has started.

Note that it is not possible to propagate the backpressure from the running stream to the pub sub topic, if the stream is backpressuring published messages are buffered up to a limit and if the limit is hit the configurable `OverflowStrategy` decides what happens. It is not possible to use the `Backpressure` strategy.

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

This operator is included in:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream-typed" % AkkaVersion
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
    <artifactId>akka-stream-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-stream-typed_${versions.ScalaBinary}"
}
```

## Signature

[`PubSub.source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/PubSub.html#source(akka.actor.typed.Topic) "akka.stream.typed.javadsl.PubSub")[`PubSub.source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/PubSub$.html#source[T](topic:akka.actor.typed.Toppic[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.typed.scaladsl.PubSub")

## Reactive Streams semantics

**emits** a message published to the topic is emitted as soon as there is demand from downstream

**completes** when the topic actor terminates

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream-typed" % AkkaVersion
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
    <artifactId>akka-stream-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-stream-typed_${versions.ScalaBinary}"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/PubSub$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/PubSub.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/sliding.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitAfter.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/source.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/source.html)*
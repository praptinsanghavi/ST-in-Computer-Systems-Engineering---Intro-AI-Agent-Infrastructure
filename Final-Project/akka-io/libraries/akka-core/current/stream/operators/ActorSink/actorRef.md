---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRef.html
title: ActorSink.actorRef • Akka core
---

# ActorSink.actorRef • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ActorSink.actorRef

Sends the elements of the stream to the given `ActorRef<T>``ActorRef[T]` of the new actors API, without considering backpressure.

[Actor interop operators](../index.html#actor-interop-operators)

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

[`ActorSink.actorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSink.html#actorRef(akka.actor.typed.ActorRef,java.lang.Object,akka.japi.function.Function) "akka.stream.typed.javadsl.ActorSink")[`ActorSink.actorRef`](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSink$.html#actorRef[T](ref:akka.actor.typed.ActorRef[T],onCompleteMessage:T,onFailureMessage:Throwable=>T):akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.typed.scaladsl.ActorSink")

## Description

Sends the elements of the stream to the given `ActorRef`. If the target actor terminates the stream will be canceled. When the stream completes successfully the given `onCompleteMessage` will be sent to the destination actor. When the stream completes with failure the throwable that was signaled to the stream is adapted to the Actor’s protocol using `onFailureMessage` and then sent to the destination actor.

It will request at most `maxInputBufferSize` number of elements from upstream, but there is no back\-pressure signal from the destination actor, i.e. if the actor is not consuming the messages fast enough the mailbox of the actor will grow. For potentially slow consumer actors it is recommended to use a bounded mailbox with zero `mailbox-push-timeout-time` or use a rate limiting operator in front of this `Sink`.

See also:

- [`ActorSink.actorRefWithBackpressure`](actorRefWithBackpressure.html) Send elements to an actor of the new actors API supporting backpressure
- [`Sink.actorRef`](../Sink/actorRef.html) The corresponding operator for the classic actors API
- [`Sink.actorRefWithBackpressue`](../Sink/actorRefWithBackpressure.html) Send elements to an actor of the classic actors API supporting backpressure

## Reactive Streams semantics

**cancels** when the actor terminates

**backpressures** never

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
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRef.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRef.html)*
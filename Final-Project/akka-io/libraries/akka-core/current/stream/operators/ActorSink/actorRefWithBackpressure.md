---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html
title: ActorSink.actorRefWithBackpressure • Akka core
---

# ActorSink.actorRefWithBackpressure • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ActorSink.actorRefWithBackpressure

Sends the elements of the stream to the given `ActorRef<T>``ActorRef[T]` of the new actors API with backpressure, to be able to signal demand when the actor is ready to receive more elements.

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

[`ActorSink.actorRefWithBackpressure`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSink.html#actorRefWithBackpressure(akka.actor.typed.ActorRef,akka.japi.function.Function2,akka.japi.function.Function,java.lang.Object,java.lang.Object,akka.japi.function.Function) "akka.stream.typed.javadsl.ActorSink")[`ActorSink.actorRefWithBackpressure`](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSink$.html#actorRefWithBackpressure[T,M,A](ref:akka.actor.typed.ActorRef[M],messageAdapter:(akka.actor.typed.ActorRef[A],T)=>M,onInitMessage:akka.actor.typed.ActorRef[A]=>M,ackMessage:A,onCompleteMessage:M,onFailureMessage:Throwable=>M):akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.typed.scaladsl.ActorSink")

## Description

Sends the elements of the stream to the given `ActorRef<T>``ActorRef[T]` with backpressure, to be able to signal demand when the actor is ready to receive more elements. There is also a variant without a concrete acknowledge message accepting any message as such.

See also:

- [`ActorSink.actorRef`](actorRefWithBackpressure.html) Send elements to an actor of the new actors API, without considering backpressure
- [`Sink.actorRef`](../Sink/actorRef.html) Send elements to an actor of the classic actors API, without considering backpressure
- [`Sink.actorRefWithBackpressue`](../Sink/actorRefWithBackpressure.html) The corresponding operator for the classic actors API

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/test/scala/docs/akka/stream/typed/ActorSourceSinkExample.scala#L148-L171 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.stream.scaladsl.{ Sink, Source }
import akka.stream.typed.scaladsl.ActorSink

trait Ack
object Ack extends Ack

trait Protocol
case class Init(ackTo: ActorRef[Ack]) extends Protocol
case class Message(ackTo: ActorRef[Ack], msg: String) extends Protocol
case object Complete extends Protocol
case class Fail(ex: Throwable) extends Protocol

val actor: ActorRef[Protocol] = targetActor()

val sink: Sink[String, NotUsed] = ActorSink.actorRefWithBackpressure(
  ref = actor,
  messageAdapter = (responseActorRef: ActorRef[Ack], element) => Message(responseActorRef, element),
  onInitMessage = (responseActorRef: ActorRef[Ack]) => Init(responseActorRef),
  ackMessage = Ack,
  onCompleteMessage = Complete,
  onFailureMessage = (exception) => Fail(exception))

Source.single("msg1").runWith(sink)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/test/java/docs/akka/stream/typed/ActorSinkWithAckExample.java#L8-L75 "Go to snippet source")import akka.NotUsed;
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.typed.javadsl.ActorSink;

enum Ack {
  INSTANCE;
}

interface Protocol {}

class Init implements Protocol {
  private final ActorRef<Ack> ack;

  public Init(ActorRef<Ack> ack) {
    this.ack = ack;
  }
}

class Message implements Protocol {
  private final ActorRef<Ack> ackTo;
  private final String msg;

  public Message(ActorRef<Ack> ackTo, String msg) {
    this.ackTo = ackTo;
    this.msg = msg;
  }
}

class Complete implements Protocol {}

class Fail implements Protocol {
  private final Throwable ex;

  public Fail(Throwable ex) {
    this.ex = ex;
  }
}

  final ActorRef<Protocol> actorRef = // spawned actor

  final Complete completeMessage = new Complete();

  final Sink<String, NotUsed> sink =
      ActorSink.actorRefWithBackpressure(
          actorRef,
          (responseActorRef, element) -> new Message(responseActorRef, element),
          (responseActorRef) -> new Init(responseActorRef),
          Ack.INSTANCE,
          completeMessage,
          (exception) -> new Fail(exception));

  Source.single("msg1").runWith(sink, system);
```

## Reactive Streams semantics

**cancels** when the actor terminates

**backpressures** when the actor acknowledgement has not arrived

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

### Example 4: Examples

```scala
import akka.actor.typed.ActorRef
import akka.stream.scaladsl.{ Sink, Source }
import akka.stream.typed.scaladsl.ActorSink

trait Ack
object Ack extends Ack

trait Protocol
case class Init(ackTo: ActorRef[Ack]) extends Protocol
case class Message(ackTo: ActorRef[Ack], msg: String) extends Protocol
case object Complete extends Protocol
case class Fail(ex: Throwable) extends Protocol

val actor: ActorRef[Protocol] = targetActor()

val sink: Sink[String, NotUsed] = ActorSink.actorRefWithBackpressure(
  ref = actor,
  messageAdapter = (responseActorRef: ActorRef[Ack], element) => Message(responseActorRef, element),
  onInitMessage = (responseActorRef: ActorRef[Ack]) => Init(responseActorRef),
  ackMessage = Ack,
  onCompleteMessage = Complete,
  onFailureMessage = (exception) => Fail(exception))

Source.single("msg1").runWith(sink)
```

### Example 5: Examples

```java
import akka.NotUsed;
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.typed.javadsl.ActorSink;


enum Ack {
  INSTANCE;
}

interface Protocol {}

class Init implements Protocol {
  private final ActorRef<Ack> ack;

  public Init(ActorRef<Ack> ack) {
    this.ack = ack;
  }
}

class Message implements Protocol {
  private final ActorRef<Ack> ackTo;
  private final String msg;

  public Message(ActorRef<Ack> ackTo, String msg) {
    this.ackTo = ackTo;
    this.msg = msg;
  }
}

class Complete implements Protocol {}

class Fail implements Protocol {
  private final Throwable ex;

  public Fail(Throwable ex) {
    this.ex = ex;
  }
}

  final ActorRef<Protocol> actorRef = // spawned actor

  final Complete completeMessage = new Complete();

  final Sink<String, NotUsed> sink =
      ActorSink.actorRefWithBackpressure(
          actorRef,
          (responseActorRef, element) -> new Message(responseActorRef, element),
          (responseActorRef) -> new Init(responseActorRef),
          Ack.INSTANCE,
          completeMessage,
          (exception) -> new Fail(exception));

  Source.single("msg1").runWith(sink, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/aggregateWithBoundary.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html)*
---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithStatus.html
title: ActorFlow.askWithStatus • Akka core
---

# ActorFlow.askWithStatus • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ActorFlow.askWithStatus

Use the “Ask Pattern” to send each stream element as an `ask` to the target actor (of the new actors API), and expect a reply of Type `StatusReply[T]``StatusReply<T>` where the T will be unwrapped and emitted downstream.

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
  <akka.version>2.10.17</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.17",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

## Signature

[`ActorFlow.askWithStatus`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorFlow.html#askWithStatus[I,Q,A](parallelism:Int,ref:akka.actor.typed.ActorRef[Q],timeout:java.time.Duration,makeMessage:java.util.function.BiFunction[I,akka.actor.typed.ActorRef[akka.pattern.StatusReply[A]],Q]):akka.stream.javadsl.Flow[I,A,akka.NotUsed] "akka.stream.typed.javadsl.ActorFlow")[`ActorFlow.askWithStatus`](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html#askWithStatus[I,Q,A](parallelism:Int)(ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[akka.pattern.StatusReply[A]])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[I,A,akka.NotUsed] "akka.stream.typed.scaladsl.ActorFlow") [`ActorFlow.askWithStatus`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorFlow.html#askWithStatus[I,Q,A](ref:akka.actor.typed.ActorRef[Q],timeout:java.time.Duration,makeMessage:java.util.function.BiFunction[I,akka.actor.typed.ActorRef[akka.pattern.StatusReply[A]],Q]):akka.stream.javadsl.Flow[I,A,akka.NotUsed] "akka.stream.typed.javadsl.ActorFlow")[`ActorFlow.askWithStatus`](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html#askWithStatus[I,Q,A](ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[akka.pattern.StatusReply[A]])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[I,A,akka.NotUsed] "akka.stream.typed.scaladsl.ActorFlow")

## Description

Use the [Ask pattern](../../../typed/interaction-patterns.html#request-response-with-ask-from-outside-an-actor) to send a request\-reply message to the target `ref` actor when you expect the reply to be `akka.pattern.StatusReply`. If any of the asks times out it will fail the stream with an [`AskTimeoutException`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html "akka.pattern.AskTimeoutException")[`AskTimeoutException`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html "akka.pattern.AskTimeoutException").

The `askWithStatus` operator requires

- the actor `ref`,
- a `makeMessage` function to create the message sent to the actor from the incoming element, and the actor ref accepting the actor’s reply message
- a timeout.

## Examples

The `ActorFlow.askWithStatus` sends a message to the actor. The actor expects `AskingWithStatus` messages which contain the actor ref for replies of type `StatusReply[String]``StatusReply<String>`. When the actor for replies receives a reply, the `ActorFlow.askWithStatus` stream stage emits the reply and the `map` extracts the message `String`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/test/scala/docs/scaladsl/ActorFlowSpec.scala#L11-L16 "Go to snippet source")import akka.stream.scaladsl.{ Flow, Sink, Source }
import akka.stream.typed.scaladsl.ActorFlow
import akka.actor.typed.ActorRef
import akka.actor.typed.scaladsl.Behaviors
import akka.util.Timeout

final case class Asking(s: String, replyTo: ActorRef[Reply])
final case class Reply(msg: String)

final case class AskingWithStatus(s: String, replyTo: ActorRef[StatusReply[String]])

    val ref = spawn(Behaviors.receiveMessage[Asking] { asking =>
      asking.replyTo ! Reply(asking.s + "!!!")
      Behaviors.same
    })

implicit val timeout: Timeout = 1.second

val askFlow: Flow[String, Reply, NotUsed] =
  ActorFlow.ask(ref)(Asking.apply)

// explicit creation of the sent message
val askFlowExplicit: Flow[String, Reply, NotUsed] =
  ActorFlow.ask(ref)(makeMessage = (el, replyTo: ActorRef[Reply]) => Asking(el, replyTo))

val in: Future[immutable.Seq[String]] =
  Source(1 to 50).map(_.toString).via(askFlow).map(_.msg).runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/test/java/docs/javadsl/ActorFlowCompileTest.java#L9-L56 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.pattern.StatusReply;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.typed.javadsl.ActorFlow;

class Asking {
  final String payload;
  final ActorRef<Reply> replyTo;

  public Asking(String payload, ActorRef<Reply> replyTo) {
    this.payload = payload;
    this.replyTo = replyTo;
  }
}

static class AskingWithStatus {
  final String payload;
  final ActorRef<StatusReply<String>> replyTo;

  public AskingWithStatus(String payload, ActorRef<StatusReply<String>> replyTo) {
    this.payload = payload;
    this.replyTo = replyTo;
  }
}

class Reply {
  public final String msg;

  public Reply(String msg) {
    this.msg = msg;
  }
}

final ActorRef<Asking> actorRef = // ???
final ActorRef<AskingWithStatus> actorWithStatusRef = // ???
Duration timeout = Duration.ofSeconds(1);

// method reference notation
Flow<String, Reply, NotUsed> askFlow = ActorFlow.ask(actorRef, timeout, Asking::new);

// explicit creation of the sent message
Flow<String, Reply, NotUsed> askFlowExplicit =
    ActorFlow.ask(actorRef, timeout, (msg, replyTo) -> new Asking(msg, replyTo));

Flow<String, String, NotUsed> askFlowExplicitWithStatus =
    ActorFlow.askWithStatus(
        actorWithStatusRef, timeout, (msg, replyTo) -> new AskingWithStatus(msg, replyTo));

Source.repeat("hello").via(askFlow).map(reply -> reply.msg).runWith(Sink.seq(), system);
```

## Reactive Streams semantics

**emits** when the futures (in submission order) created by the ask pattern internally are completed

**backpressures** when the number of futures reaches the configured parallelism and the downstream backpressures

**completes** when upstream completes and all futures have been completed and all elements have been emitted

**fails** when the passed\-in actor terminates, or when any of the `askWithStatus`s exceed a timeout

**cancels** when downstream cancels

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream-typed" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <akka.version>2.10.17</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  AkkaVersion: "2.10.17",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Examples

```scala
import akka.stream.scaladsl.{ Flow, Sink, Source }
import akka.stream.typed.scaladsl.ActorFlow
import akka.actor.typed.ActorRef
import akka.actor.typed.scaladsl.Behaviors
import akka.util.Timeout

final case class Asking(s: String, replyTo: ActorRef[Reply])
final case class Reply(msg: String)

final case class AskingWithStatus(s: String, replyTo: ActorRef[StatusReply[String]])

    val ref = spawn(Behaviors.receiveMessage[Asking] { asking =>
      asking.replyTo ! Reply(asking.s + "!!!")
      Behaviors.same
    })

implicit val timeout: Timeout = 1.second

val askFlow: Flow[String, Reply, NotUsed] =
  ActorFlow.ask(ref)(Asking.apply)

// explicit creation of the sent message
val askFlowExplicit: Flow[String, Reply, NotUsed] =
  ActorFlow.ask(ref)(makeMessage = (el, replyTo: ActorRef[Reply]) => Asking(el, replyTo))

val in: Future[immutable.Seq[String]] =
  Source(1 to 50).map(_.toString).via(askFlow).map(_.msg).runWith(Sink.seq)
```

### Example 5: Examples

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.pattern.StatusReply;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.typed.javadsl.ActorFlow;

class Asking {
  final String payload;
  final ActorRef<Reply> replyTo;

  public Asking(String payload, ActorRef<Reply> replyTo) {
    this.payload = payload;
    this.replyTo = replyTo;
  }
}

static class AskingWithStatus {
  final String payload;
  final ActorRef<StatusReply<String>> replyTo;

  public AskingWithStatus(String payload, ActorRef<StatusReply<String>> replyTo) {
    this.payload = payload;
    this.replyTo = replyTo;
  }
}

class Reply {
  public final String msg;

  public Reply(String msg) {
    this.msg = msg;
  }
}

final ActorRef<Asking> actorRef = // ???
final ActorRef<AskingWithStatus> actorWithStatusRef = // ???
Duration timeout = Duration.ofSeconds(1);

// method reference notation
Flow<String, Reply, NotUsed> askFlow = ActorFlow.ask(actorRef, timeout, Asking::new);

// explicit creation of the sent message
Flow<String, Reply, NotUsed> askFlowExplicit =
    ActorFlow.ask(actorRef, timeout, (msg, replyTo) -> new Asking(msg, replyTo));

Flow<String, String, NotUsed> askFlowExplicitWithStatus =
    ActorFlow.askWithStatus(
        actorWithStatusRef, timeout, (msg, replyTo) -> new AskingWithStatus(msg, replyTo));

Source.repeat("hello").via(askFlow).map(reply -> reply.msg).runWith(Sink.seq(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithStatusAndContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/typed/interaction-patterns.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithStatus.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithStatus.html)*
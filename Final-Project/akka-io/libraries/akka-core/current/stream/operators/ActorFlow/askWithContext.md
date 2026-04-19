---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithContext.html
title: ActorFlow.askWithContext • Akka core
---

# ActorFlow.askWithContext • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ActorFlow.askWithContext

Use the “Ask Pattern” to send each stream element (without the context) as an `ask` to the target actor (of the new actors API), and expect a reply that will be emitted downstream.

[Actor interop operators](../index.html#actor-interop-operators)

## Dependency

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

[`ActorFlow.askWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorFlow.html#askWithContext(akka.actor.typed.ActorRef,java.time.Duration,java.util.function.BiFunction) "akka.stream.typed.javadsl.ActorFlow")[`ActorFlow.askWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html#askWithContext[I,Q,A,Ctx](ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[A])=%3EQ)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[(I,Ctx),(A,Ctx),akka.NotUsed] "akka.stream.typed.scaladsl.ActorFlow")

## Description

Use the [Ask pattern](../../../typed/interaction-patterns.html#request-response-with-ask-from-outside-an-actor) to send a request\-reply message to the target `ref` actor. The stream context is not sent, instead it is locally recombined to the actor’s reply.

If any of the asks times out it will fail the stream with an [`AskTimeoutException`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html "akka.pattern.AskTimeoutException")[`AskTimeoutException`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html "akka.pattern.AskTimeoutException").

The `ask` operator requires

- the actor `ref`,
- a `makeMessage` function to create the message sent to the actor from the incoming element, and the actor ref accepting the actor’s reply message
- a timeout.

## Reactive Streams semantics

**emits** when the futures (in submission order) created by the ask pattern internally are completed

**backpressures** when the number of futures reaches the configured parallelism and the downstream backpressures

**completes** when upstream completes and all futures have been completed and all elements have been emitted

**fails** when the passed\-in actor terminates, or when any of the `ask`s exceed a timeout

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
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/ask.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithStatus.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/typed/interaction-patterns.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithContext.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithContext.html)*
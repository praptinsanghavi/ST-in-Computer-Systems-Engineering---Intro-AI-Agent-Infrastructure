---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html
title: ActorSource.actorRef • Akka core
---

# ActorSource.actorRef • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ActorSource.actorRef

Materialize an `ActorRef<T>``ActorRef[T]` of the new actors API; sending messages to it will emit them on the stream only if they are of the same type as the stream.

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

[`ActorSource.actorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSource.html#actorRef(java.util.function.Predicate,akka.japi.function.Function,int,akka.stream.OverflowStrategy) "akka.stream.typed.javadsl.ActorSource")[`ActorSource.actorRef`](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSource$.html#actorRef[T](completionMatcher:PartialFunction[T,Unit],failureMatcher:PartialFunction[T,Throwable],bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.scaladsl.Source[T,akka.actor.typed.ActorRef[T]] "akka.stream.typed.scaladsl.ActorSource")

## Description

Materialize an `ActorRef<T>``ActorRef[T]` which only accepts messages that are of the same type as the stream.

See also:

- [ActorSource.actorRefWithBackpressure](actorRefWithBackpressure.html) This operator, but with backpressure control
- [Source.actorRef](../Source/actorRef.html) The corresponding operator for the classic actors API
- [Source.actorRefWithBackpressure](../Source/actorRefWithBackpressure.html) The operator for the classic actors API with backpressure control
- [Source.queue](../Source/queue.html) Materialize a `SourceQueue` onto which elements can be pushed for emitting from the source

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/test/scala/docs/akka/stream/typed/ActorSourceSinkExample.scala#L17-L41 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.stream.OverflowStrategy
import akka.stream.scaladsl.{ Sink, Source }
import akka.stream.typed.scaladsl.ActorSource

trait Protocol
case class Message(msg: String) extends Protocol
case object Complete extends Protocol
case class Fail(ex: Exception) extends Protocol

val source: Source[Protocol, ActorRef[Protocol]] = ActorSource.actorRef[Protocol](completionMatcher = {
  case Complete =>
}, failureMatcher = {
  case Fail(ex) => ex
}, bufferSize = 8, overflowStrategy = OverflowStrategy.fail)

val ref = source
  .collect {
    case Message(msg) => msg
  }
  .to(Sink.foreach(println))
  .run()

ref ! Message("msg1")
// ref ! "msg2" Does not compile
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/test/java/docs/akka/stream/typed/ActorSourceExample.java#L8-L71 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.japi.JavaPartialFunction;
import akka.stream.OverflowStrategy;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.typed.javadsl.ActorSource;
import java.util.Optional;

interface Protocol {}

class Message implements Protocol {
  private final String msg;

  public Message(String msg) {
    this.msg = msg;
  }
}

class Complete implements Protocol {}

class Fail implements Protocol {
  private final Exception ex;

  public Fail(Exception ex) {
    this.ex = ex;
  }
}

  final Source<Protocol, ActorRef<Protocol>> source =
      ActorSource.actorRef(
          (m) -> m instanceof Complete,
          (m) -> (m instanceof Fail) ? Optional.of(((Fail) m).ex) : Optional.empty(),
          8,
          OverflowStrategy.fail());

  final ActorRef<Protocol> ref =
      source
          .collect(
              new JavaPartialFunction<Protocol, String>() {
                public String apply(Protocol p, boolean isCheck) {
                  if (p instanceof Message) {
                    return ((Message) p).msg;
                  } else {
                    throw noMatch();
                  }
                }
              })
          .to(Sink.foreach(System.out::println))
          .run(system);

  ref.tell(new Message("msg1"));
  // ref.tell("msg2"); Does not compile
```

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
import akka.stream.OverflowStrategy
import akka.stream.scaladsl.{ Sink, Source }
import akka.stream.typed.scaladsl.ActorSource

trait Protocol
case class Message(msg: String) extends Protocol
case object Complete extends Protocol
case class Fail(ex: Exception) extends Protocol

val source: Source[Protocol, ActorRef[Protocol]] = ActorSource.actorRef[Protocol](completionMatcher = {
  case Complete =>
}, failureMatcher = {
  case Fail(ex) => ex
}, bufferSize = 8, overflowStrategy = OverflowStrategy.fail)

val ref = source
  .collect {
    case Message(msg) => msg
  }
  .to(Sink.foreach(println))
  .run()

ref ! Message("msg1")
// ref ! "msg2" Does not compile
```

### Example 5: Examples

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.japi.JavaPartialFunction;
import akka.stream.OverflowStrategy;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.typed.javadsl.ActorSource;
import java.util.Optional;


interface Protocol {}

class Message implements Protocol {
  private final String msg;

  public Message(String msg) {
    this.msg = msg;
  }
}

class Complete implements Protocol {}

class Fail implements Protocol {
  private final Exception ex;

  public Fail(Exception ex) {
    this.ex = ex;
  }
}

  final Source<Protocol, ActorRef<Protocol>> source =
      ActorSource.actorRef(
          (m) -> m instanceof Complete,
          (m) -> (m instanceof Fail) ? Optional.of(((Fail) m).ex) : Optional.empty(),
          8,
          OverflowStrategy.fail());

  final ActorRef<Protocol> ref =
      source
          .collect(
              new JavaPartialFunction<Protocol, String>() {
                public String apply(Protocol p, boolean isCheck) {
                  if (p instanceof Message) {
                    return ((Message) p).msg;
                  } else {
                    throw noMatch();
                  }
                }
              })
          .to(Sink.foreach(System.out::println))
          .run(system);

  ref.tell(new Message("msg1"));
  // ref.tell("msg2"); Does not compile
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSource$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html)*
---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldAsync.html
title: Source.unfoldAsync • Akka core
---

# Source.unfoldAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.unfoldAsync

Just like `unfold` but the fold function returns a `Future` `CompletionStage`.

[Source operators](../index.html#source-operators)

## Signature

[`Source.unfoldAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#unfoldAsync(java.lang.Object,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.unfoldAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#unfoldAsync[S,E](s:S)(f:S=>scala.concurrent.Future[Option[(S,E)]]):akka.stream.scaladsl.Source[E,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Just like `unfold` but the fold function returns a `Future` `CompletionStage` which will cause the source to complete or emit when it completes.

Can be used to implement many stateful sources without having to touch the more low level [`GraphStage`](../../stream-customize.html) API.

## Examples

In this example we are asking an imaginary actor for chunks of bytes from an offset with a protocol like this: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/UnfoldAsync.scala#L23-L26 "Go to snippet source")object DataActor {
  sealed trait Command
  case class FetchChunk(offset: Long, replyTo: ActorRef[Chunk]) extends Command
  case class Chunk(bytes: ByteString)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/UnfoldAsync.java#L21-L40 "Go to snippet source")class DataActor {
  interface Command {}

  static final class FetchChunk implements Command {
    public final long offset;
    public final ActorRef<Chunk> replyTo;

    public FetchChunk(long offset, ActorRef<Chunk> replyTo) {
      this.offset = offset;
      this.replyTo = replyTo;
    }
  }

  static final class Chunk {
    public final ByteString bytes;

    public Chunk(ByteString bytes) {
      this.bytes = bytes;
    }
  }
```

The actor will reply with the `Chunk` message, if we ask for an offset outside of the end of the data the actor will respond with an empty `ByteString`

We want to represent this as a stream of `ByteString`s that complete when we reach the end, to achieve this we use the offset as the state passed between `unfoldAsync` invocations:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/UnfoldAsync.scala#L34-L51 "Go to snippet source")// actor we can query for data with an offset
val dataActor: ActorRef[DataActor.Command] = ???
import system.executionContext

implicit val askTimeout: Timeout = 3.seconds
val startOffset = 0L
val byteSource: Source[ByteString, NotUsed] =
  Source.unfoldAsync(startOffset) { currentOffset =>
    // ask for next chunk
    val nextChunkFuture: Future[DataActor.Chunk] =
      dataActor.ask(DataActor.FetchChunk(currentOffset, _))

    nextChunkFuture.map { chunk =>
      val bytes = chunk.bytes
      if (bytes.isEmpty) None // end of data
      else Some((currentOffset + bytes.length, bytes))
    }
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/UnfoldAsync.java#L47-L70 "Go to snippet source")ActorRef<DataActor.Command> dataActor = null; // let's say we got it from somewhere

Duration askTimeout = Duration.ofSeconds(3);
long startOffset = 0L;
Source<ByteString, NotUsed> byteSource =
    Source.unfoldAsync(
        startOffset,
        currentOffset -> {
          // ask for next chunk
          CompletionStage<DataActor.Chunk> nextChunkCS =
              AskPattern.ask(
                  dataActor,
                  (ActorRef<DataActor.Chunk> ref) ->
                      new DataActor.FetchChunk(currentOffset, ref),
                  askTimeout,
                  system.scheduler());

          return nextChunkCS.thenApply(
              chunk -> {
                ByteString bytes = chunk.bytes;
                if (bytes.isEmpty()) return Optional.empty();
                else return Optional.of(Pair.create(currentOffset + bytes.size(), bytes));
              });
        });
```

## Reactive Streams semantics

**emits** when there is demand and unfold state returned future completes with some value

**completes** when the future CompletionStage returned by the unfold function completes with an empty value

## Code Examples

### Example 1: Examples

```scala
object DataActor {
  sealed trait Command
  case class FetchChunk(offset: Long, replyTo: ActorRef[Chunk]) extends Command
  case class Chunk(bytes: ByteString)
```

### Example 2: Examples

```java
class DataActor {
  interface Command {}

  static final class FetchChunk implements Command {
    public final long offset;
    public final ActorRef<Chunk> replyTo;

    public FetchChunk(long offset, ActorRef<Chunk> replyTo) {
      this.offset = offset;
      this.replyTo = replyTo;
    }
  }

  static final class Chunk {
    public final ByteString bytes;

    public Chunk(ByteString bytes) {
      this.bytes = bytes;
    }
  }
```

### Example 3: Examples

```scala
// actor we can query for data with an offset
val dataActor: ActorRef[DataActor.Command] = ???
import system.executionContext

implicit val askTimeout: Timeout = 3.seconds
val startOffset = 0L
val byteSource: Source[ByteString, NotUsed] =
  Source.unfoldAsync(startOffset) { currentOffset =>
    // ask for next chunk
    val nextChunkFuture: Future[DataActor.Chunk] =
      dataActor.ask(DataActor.FetchChunk(currentOffset, _))

    nextChunkFuture.map { chunk =>
      val bytes = chunk.bytes
      if (bytes.isEmpty) None // end of data
      else Some((currentOffset + bytes.length, bytes))
    }
  }
```

### Example 4: Examples

```java
ActorRef<DataActor.Command> dataActor = null; // let's say we got it from somewhere

Duration askTimeout = Duration.ofSeconds(3);
long startOffset = 0L;
Source<ByteString, NotUsed> byteSource =
    Source.unfoldAsync(
        startOffset,
        currentOffset -> {
          // ask for next chunk
          CompletionStage<DataActor.Chunk> nextChunkCS =
              AskPattern.ask(
                  dataActor,
                  (ActorRef<DataActor.Chunk> ref) ->
                      new DataActor.FetchChunk(currentOffset, ref),
                  askTimeout,
                  system.scheduler());

          return nextChunkCS.thenApply(
              chunk -> {
                ByteString bytes = chunk.bytes;
                if (bytes.isEmpty()) return Optional.empty();
                else return Optional.of(Pair.create(currentOffset + bytes.size(), bytes));
              });
        });
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfold.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-customize.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldAsync.html)*
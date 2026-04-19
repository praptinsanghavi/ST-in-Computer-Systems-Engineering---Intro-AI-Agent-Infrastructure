---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncPartitioned.html
title: mapAsyncPartitioned • Akka core
---

# mapAsyncPartitioned • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapAsyncPartitioned

Pass incoming elements to a function that extracts a partitioning key from the element, then to a function that returns a `Future` `CompletionStage` result, bounding the number of incomplete Futures CompletionStages per partitioning key.

[Asynchronous operators](../index.html#asynchronous-operators)

## Signature

[`Source.mapAsyncPartitioned`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapAsyncPartitioned(int,int,akka.japi.function.Function,java.util.function.BiFunction "akka.stream.javadsl.Source")[`Source.mapAsyncPartitioned`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=%3EP)(f:(Out,P)=%3Escala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.mapAsyncPartitioned`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mapAsyncPartitioned(int,int,akka.japi.function.Function,java.util.function.BiFunction "akka.stream.javadsl.Flow")[`Flow.mapAsyncPartitioned`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=%3EP)(f:(Out,P)=%3Escala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Pass incoming elements to a function that assigns a partitioning key, then to function that returns a `Future` `CompletionStage` result. When the Future CompletionStage completes successfully, the result is passed downstream.

Up to `parallelism` futures can be processed concurrently; additionally no more than `perPartition` Futures CompletionStages with the same partitioning key will be incomplete at any time. When `perPartition` is limiting elements, the operator will still pull in and buffer up to a total `parallelism` of elements before it applies backpressure upstream.

Regardless of completion order, results will be emitted in order of the incoming elements which gave rise to the future `CompletionStage`.

If a `Future` `CompletionStage` completes with `null`, that result is dropped and not emitted. If a `Future` `CompletionStage` completes with failure, the stream’s is failed.

If `parallelism` is 1 this stage is equivalent to [`mapAsyncUnordered`](mapAsyncUnordered.html) which should be preferred for such uses. It is not possible to specify a `perPartition` greater or equal to `parallelism`, for such scenarios with no limit per partition, instead use [`mapAsync`](mapAsync.html).

## Examples

Imagine you are consuming messages from a broker (for instance, Apache Kafka via [Alpakka Kafka](https://doc.akka.io/libraries/alpakka-kafka/current/)). This broker’s semantics are such that acknowledging one message implies an acknowledgement of all messages delivered before that message; this in turn means that in order to ensure at\-least\-once processing of messages from the broker, they must be acknowledged in the order they were received. These messages represent business events produced by some other service(s) and each concerns a particular entity. You may process messages for different entities simultaneously, but can only process one message for a given entity at a time:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MapAsyncs.scala#L173-L199 "Go to snippet source")val eventsForEntities: Source[EntityEvent, NotUsed] =
  Consumer.committableSource(settings, subscription).take(1000)

val partitioner: EntityEvent => Int = { event =>
  val partition = event.entityId
  println(s"Assigned event $event to partition $partition")
  partition
}

eventsForEntities.zipWithIndex
  .map {
    case (event, count) =>
      println(s"Received event $event at offset $count from message broker")
      event
  }
  .mapAsyncPartitioned(parallelism = 10, perPartition = 1)(partitioner) { (event, partition) =>
    println(s"Processing event $event from partition $partition")

    // processing result is "partition-sequenceNr"
    // val processEvent: (EntityEvent, Int) => Future[String]
    processEvent(event, partition).map { x =>
      println(s"Completed processing $x")
      x
    }
  }
  // for the purpose of this example, will print every element, prepended with "`mapAsyncPartitioned` emitted "
  .runWith(Committer.sink(commitSettings))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MapAsyncs.java#L113-L149 "Go to snippet source")Function<EntityEvent, Integer> partitioner =
    (event) -> {
      Integer partition = Integer.valueOf(event.entityId);
      System.out.println("Assigned event " + event + " to partition " + event.entityId);
      return partition;
    };

Consumer.committableSource(settings, subscription)
    .take(1000)
    .statefulMap(
        () -> Integer.valueOf(0),
        (count, event) -> {
          System.out.println(
              "Received event " + event + " at offset " + count + " from message broker");
          return Pair.create(count + 1, event);
        },
        (count) -> Optional.empty())
    .mapAsyncPartitioned(
        10, // parallelism
        1, // perPartition
        partitioner,
        (event, partition) -> {
          System.out.println("Processing event " + event + " from partition " + partition);

          // processing result is "partition-sequenceNr"
          // public CompletionStage<String> processEvent(EntityEvent event, Integer partition)
          CompletionStage<String> cs = processEvent(event, partition);

          return cs.thenApply(
              s -> {
                System.out.println("Completed processing " + s);
                return s;
              });
        })
    // for the purpose of this example, will print every element, prepended with
    // "`mapAsyncPartitioned` emitted "
    .runWith(Committer.sink(commitSettings), system);
```

We can see from the (annotated) logs the order of consumption, processing, and emission:

```
Received event EntityEvent(0,1) at offset 0 from message broker
Assigned event EntityEvent(0,1) to partition 0
Processing event EntityEvent(0,1) from partition 0
Received event EntityEvent(0,2) at offset 1 from message broker
Assigned event EntityEvent(0,2) to partition 0                   # see note 1
Received event EntityEvent(0,3) at offset 2 from message broker
Assigned event EntityEvent(0,3) to partition 0
Received event EntityEvent(3,1) at offset 3 from message broker
Assigned event EntityEvent(3,1) to partition 3
Processing event EntityEvent(3,1) from partition 3              # see note 2
Received event EntityEvent(3,2) at offset 4 from message broker
Assigned event EntityEvent(3,2) to partition 3
Received event EntityEvent(2,1) at offset 5 from message broker
Assigned event EntityEvent(2,1) to partition 2
Processing event EntityEvent(2,1) from partition 2
Received event EntityEvent(6,1) at offset 6 from message broker
Assigned event EntityEvent(6,1) to partition 6
Completed processing 3-1                                        # see note 3
Processing event EntityEvent(6,1) from partition 6
Received event EntityEvent(1,1) at offset 7 from message broker
Assigned event EntityEvent(1,1) to partition 1
Processing event EntityEvent(1,1) from partition 1
Received event EntityEvent(1,2) at offset 8 from message broker
Assigned event EntityEvent(1,2) to partition 1
Received event EntityEvent(5,1) at offset 9 from message broker
Assigned event EntityEvent(5,1) to partition 5
Processing event EntityEvent(5,1) from partition 5
Completed processing 5-1
Processing event EntityEvent(3,2) from partition 3
Completed processing 2-1
Completed processing 0-1
Processing event EntityEvent(0,2) from partition 0                # see note 4
`mapAsyncPartitioned` emitted 0-1                                 # see note 5
Received event EntityEvent(3,3) at offset 10 from message broker
Assigned event EntityEvent(3,3) to partition 3
Completed processing 0-2
Processing event EntityEvent(0,3) from partition 0
`mapAsyncPartitioned` emitted 0-2                                 # see note 6
Received event EntityEvent(0,4) at offset 11 from message broker
Assigned event EntityEvent(0,4) to partition 0
Completed processing 3-2
Processing event EntityEvent(3,3) from partition 3
Completed processing 3-3
Completed processing 1-1
Processing event EntityEvent(1,2) from partition 1
Completed processing 1-2
Completed processing 6-1
Completed processing 0-3
Processing event EntityEvent(0,4) from partition 0
Completed processing 0-4
`mapAsyncPartitioned` emitted 0-3
`mapAsyncPartitioned` emitted 3-1                                # see note 7
Received event EntityEvent(4,1) at offset 12 from message broker
Assigned event EntityEvent(4,1) to partition 4
Processing event EntityEvent(4,1) from partition 4
`mapAsyncPartitioned` emitted 3-2
Received event EntityEvent(8,1) at offset 13 from message broker
Assigned event EntityEvent(8,1) to partition 8
Processing event EntityEvent(8,1) from partition 8
`mapAsyncPartitioned` emitted 2-1
Completed processing 8-1
Received event EntityEvent(9,1) at offset 14 from message broker
Assigned event EntityEvent(9,1) to partition 9
Processing event EntityEvent(9,1) from partition 9
`mapAsyncPartitioned` emitted 6-1
Received event EntityEvent(1,3) at offset 15 from message broker

```

Notes:

1. The second (offset 1\) message received is for the same entity as the earlier (offset 0\) message. Because that earlier message’s processing has not yet completed, processing of this message (beyond assigning it to a partition corresponding to the entity, which always happens immediately in `mapAsyncPartitioned`) has not started.
2. The fourth (offset 3\) message received is for a different entity from the previous messages. It therefore starts processing immediately, even though the messages at offsets 1 and 2 are waiting to start processing.
3. That fourth message completes processing before any other message, but its result will not be emitted until all earlier results are emitted.
4. Once the first message is completed, processing of the next message in its partition (in this case, from offset 1\) can begin.
5. The first result emitted arose from the first message received, which allows the 11th message (offset 10\) to be consumed from the message broker, ensuring that no more than 10 messages are being processed asynchronously at any given time.
6. The second result emitted arose from the second message received.
7. Immediately after the result of processing the third message received is emitted, the result of processing the fourth message is emitted.

## Reactive Streams semantics

**emits** when the next in order `Future` `CompletionStage` returned by the provided function completes successfully

**backpressures** when downstream backgpressures and completed and incomplete `Future` `CompletionStage` has reached the configured `parallelism`

**completes** when upstream completes and all Futures CompletionStages have completed and all results have been emitted

## Code Examples

### Example 1: Examples

```scala
val eventsForEntities: Source[EntityEvent, NotUsed] =
  Consumer.committableSource(settings, subscription).take(1000)

val partitioner: EntityEvent => Int = { event =>
  val partition = event.entityId
  println(s"Assigned event $event to partition $partition")
  partition
}

eventsForEntities.zipWithIndex
  .map {
    case (event, count) =>
      println(s"Received event $event at offset $count from message broker")
      event
  }
  .mapAsyncPartitioned(parallelism = 10, perPartition = 1)(partitioner) { (event, partition) =>
    println(s"Processing event $event from partition $partition")

    // processing result is "partition-sequenceNr"
    // val processEvent: (EntityEvent, Int) => Future[String]
    processEvent(event, partition).map { x =>
      println(s"Completed processing $x")
      x
    }
  }
  // for the purpose of this example, will print every element, prepended with "`mapAsyncPartitioned` emitted "
  .runWith(Committer.sink(commitSettings))
```

### Example 2: Examples

```java
Function<EntityEvent, Integer> partitioner =
    (event) -> {
      Integer partition = Integer.valueOf(event.entityId);
      System.out.println("Assigned event " + event + " to partition " + event.entityId);
      return partition;
    };

Consumer.committableSource(settings, subscription)
    .take(1000)
    .statefulMap(
        () -> Integer.valueOf(0),
        (count, event) -> {
          System.out.println(
              "Received event " + event + " at offset " + count + " from message broker");
          return Pair.create(count + 1, event);
        },
        (count) -> Optional.empty())
    .mapAsyncPartitioned(
        10, // parallelism
        1, // perPartition
        partitioner,
        (event, partition) -> {
          System.out.println("Processing event " + event + " from partition " + partition);

          // processing result is "partition-sequenceNr"
          // public CompletionStage<String> processEvent(EntityEvent event, Integer partition)
          CompletionStage<String> cs = processEvent(event, partition);

          return cs.thenApply(
              s -> {
                System.out.println("Completed processing " + s);
                return s;
              });
        })
    // for the purpose of this example, will print every element, prepended with
    // "`mapAsyncPartitioned` emitted "
    .runWith(Committer.sink(commitSettings), system);
```

### Example 3: Examples

```text
Received event EntityEvent(0,1) at offset 0 from message broker
Assigned event EntityEvent(0,1) to partition 0
Processing event EntityEvent(0,1) from partition 0
Received event EntityEvent(0,2) at offset 1 from message broker
Assigned event EntityEvent(0,2) to partition 0                   # see note 1
Received event EntityEvent(0,3) at offset 2 from message broker
Assigned event EntityEvent(0,3) to partition 0
Received event EntityEvent(3,1) at offset 3 from message broker
Assigned event EntityEvent(3,1) to partition 3
Processing event EntityEvent(3,1) from partition 3              # see note 2
Received event EntityEvent(3,2) at offset 4 from message broker
Assigned event EntityEvent(3,2) to partition 3
Received event EntityEvent(2,1) at offset 5 from message broker
Assigned event EntityEvent(2,1) to partition 2
Processing event EntityEvent(2,1) from partition 2
Received event EntityEvent(6,1) at offset 6 from message broker
Assigned event EntityEvent(6,1) to partition 6
Completed processing 3-1                                        # see note 3
Processing event EntityEvent(6,1) from partition 6
Received event EntityEvent(1,1) at offset 7 from message broker
Assigned event EntityEvent(1,1) to partition 1
Processing event EntityEvent(1,1) from partition 1
Received event EntityEvent(1,2) at offset 8 from message broker
Assigned event EntityEvent(1,2) to partition 1
Received event EntityEvent(5,1) at offset 9 from message broker
Assigned event EntityEvent(5,1) to partition 5
Processing event EntityEvent(5,1) from partition 5
Completed processing 5-1
Processing event EntityEvent(3,2) from partition 3
Completed processing 2-1
Completed processing 0-1
Processing event EntityEvent(0,2) from partition 0                # see note 4
`mapAsyncPartitioned` emitted 0-1                                 # see note 5
Received event EntityEvent(3,3) at offset 10 from message broker
Assigned event EntityEvent(3,3) to partition 3
Completed processing 0-2
Processing event EntityEvent(0,3) from partition 0
`mapAsyncPartitioned` emitted 0-2                                 # see note 6
Received event EntityEvent(0,4) at offset 11 from message broker
Assigned event EntityEvent(0,4) to partition 0
Completed processing 3-2
Processing event EntityEvent(3,3) from partition 3
Completed processing 3-3
Completed processing 1-1
Processing event EntityEvent(1,2) from partition 1
Completed processing 1-2
Completed processing 6-1
Completed processing 0-3
Processing event EntityEvent(0,4) from partition 0
Completed processing 0-4
`mapAsyncPartitioned` emitted 0-3
`mapAsyncPartitioned` emitted 3-1                                # see note 7
Received event EntityEvent(4,1) at offset 12 from message broker
Assigned event EntityEvent(4,1) to partition 4
Processing event EntityEvent(4,1) from partition 4
`mapAsyncPartitioned` emitted 3-2
Received event EntityEvent(8,1) at offset 13 from message broker
Assigned event EntityEvent(8,1) to partition 8
Processing event EntityEvent(8,1) from partition 8
`mapAsyncPartitioned` emitted 2-1
Completed processing 8-1
Received event EntityEvent(9,1) at offset 14 from message broker
Assigned event EntityEvent(9,1) to partition 9
Processing event EntityEvent(9,1) from partition 9
`mapAsyncPartitioned` emitted 6-1
Received event EntityEvent(1,3) at offset 15 from message broker
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncUnordered.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/alpakka-kafka/current/

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncPartitioned.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncPartitioned.html)*
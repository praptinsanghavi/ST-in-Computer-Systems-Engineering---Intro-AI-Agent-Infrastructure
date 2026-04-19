---
description: React on Kafka rebalancing the partitions assigned to an Alpakka Kafka
  consumer.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:34Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/consumer-rebalance.html
title: React on Partition Assignment • Alpakka Kafka Documentation
---

# React on Partition Assignment • Alpakka Kafka Documentation

> **Summary:** React on Kafka rebalancing the partitions assigned to an Alpakka Kafka consumer.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# React on Partition Assignment

Alpakka Kafka allows to react to the Kafka broker’s balancing of partitions within a consumer group in two ways:

1. callbacks to the [`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html "akka.kafka.javadsl.PartitionAssignmentHandler")[`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html "akka.kafka.scaladsl.PartitionAssignmentHandler")
2. messages to a [rebalance listener actor](consumer-rebalance.html#listening-for-rebalance-events)

## Partition Assignment Handler

Kafka balances partitions between all consumers within a consumer group. When new consumers join or leave the group partitions are revoked from and assigned to those consumers.

API may change
This [`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html "akka.kafka.javadsl.PartitionAssignmentHandler")[`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html "akka.kafka.scaladsl.PartitionAssignmentHandler") API was introduced in Alpakka Kafka 2\.0\.0 and may still be subject to change.

Please give input on its usefulness in [Issue \#985](https://github.com/akka/alpakka-kafka/issues/985).

Alpakka Kafka’s [`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html "akka.kafka.javadsl.PartitionAssignmentHandler")[`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html "akka.kafka.scaladsl.PartitionAssignmentHandler") expects callbacks to be implemented, all are called with a set of [`TopicPartition`](https://kafka.apache.org/41/javadoc/org/apache/kafka/common/TopicPartition.html "org.apache.kafka.common.TopicPartition")s and a reference to the [`RestrictedConsumer`](/api/alpakka-kafka/8.0.1/akka/kafka/RestrictedConsumer.html "akka.kafka.RestrictedConsumer")[`RestrictedConsumer`](/api/alpakka-kafka/8.0.1/akka/kafka/RestrictedConsumer.html "akka.kafka.RestrictedConsumer") which allows some access to the Kafka [`Consumer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/Consumer.html "org.apache.kafka.clients.consumer.Consumer") instance used internally by Alpakka Kafka.

1. `onRevoke` is called when the Kafka broker revokes partitions from this consumer
2. `onAssign` is called when the Kafka broker assigns partitions to this consumer
3. `onLost` is called when partition metadata has changed and partitions no longer exist. This can occur if a topic is deleted or if the leader’s metadata is stale. For details see [KIP\-429 Incremental Rebalance Protocol](https://cwiki.apache.org/confluence/display/KAFKA/KIP-429%3A+Kafka+Consumer+Incremental+Rebalance+Protocol).
4. `onStop` is called when the Alpakka Kafka consumer source is about to stop

Rebalancing starts with revoking partitions from all consumers in a consumer group and assigning all partitions to consumers in a second phase. During rebalance no consumer within that consumer group receives any messages.

The [`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html "akka.kafka.javadsl.PartitionAssignmentHandler")[`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html "akka.kafka.scaladsl.PartitionAssignmentHandler") is Alpakka Kafka’s replacement of the Kafka client library’s [`ConsumerRebalanceListener`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html "org.apache.kafka.clients.consumer.ConsumerRebalanceListener").

Warning
All methods on the [`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html "akka.kafka.javadsl.PartitionAssignmentHandler")[`PartitionAssignmentHandler`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html "akka.kafka.scaladsl.PartitionAssignmentHandler") are called synchronously during Kafka’s poll and rebalance logic. They block any other activity for that consumer.

If any of these methods take longer than the timeout configured in `akka.kafka.consumer.partition-handler-warning` (default 5 seconds) a warning will be logged.

This example shows an implementation of the `PartitionAssignmentHandler` and how it is passed to the consumer via the `Subscription`.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L456-L481 "Go to snippet source")val assignmentHandler = new PartitionAssignmentHandler {
  override def onRevoke(revokedTps: Set[TopicPartition], consumer: RestrictedConsumer): Unit = // ???
  override def onAssign(assignedTps: Set[TopicPartition], consumer: RestrictedConsumer): Unit = // ???
  override def onLost(lostTps: Set[TopicPartition], consumer: RestrictedConsumer): Unit = // ???
  override def onStop(currentTps: Set[TopicPartition], consumer: RestrictedConsumer): Unit = // ???
}

val subscription = Subscriptions
  .topics(topic)
  .withPartitionAssignmentHandler(assignmentHandler)

```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L586-L610 "Go to snippet source")PartitionAssignmentHandler assignmentHandler =
    new PartitionAssignmentHandler() {
      public void onRevoke(Set<TopicPartition> revokedTps, RestrictedConsumer consumer) {
      }

      public void onAssign(Set<TopicPartition> assignedTps, RestrictedConsumer consumer) {
      }

      public void onLost(Set<TopicPartition> lostTps, RestrictedConsumer consumer) {}

      public void onStop(Set<TopicPartition> currentTps, RestrictedConsumer consumer) {
      }
    };

Subscription subscription =
    Subscriptions.topics(topic).withPartitionAssignmentHandler(assignmentHandler);
```

## Listening for rebalance events

You may set up an rebalance event listener actor that will be notified when your consumer will be assigned or revoked from consuming from specific topic partitions. Two kinds of messages will be sent to this listener actor:

- [`TopicPartitionsAssigned`](/api/alpakka-kafka/8.0.1/akka/kafka/TopicPartitionsAssigned.html "akka.kafka.TopicPartitionsAssigned")[`TopicPartitionsAssigned`](/api/alpakka-kafka/8.0.1/akka/kafka/TopicPartitionsAssigned.html "akka.kafka.TopicPartitionsAssigned")
- [`TopicPartitionsRevoked`](/api/alpakka-kafka/8.0.1/akka/kafka/TopicPartitionsRevoked.html "akka.kafka.TopicPartitionsRevoked")[`TopicPartitionsRevoked`](/api/alpakka-kafka/8.0.1/akka/kafka/TopicPartitionsRevoked.html "akka.kafka.TopicPartitionsRevoked")

You can use a typed [`ActorRef`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") to implement your rebalance event listener by converting it into a classic actor ref. See the example below and read the [Coexistence](https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html) page of the Akka Documentation for more details on Akka Classic and Typed interoperability.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L388-L428 "Go to snippet source")import akka.kafka.{TopicPartitionsAssigned, TopicPartitionsRevoked}

def rebalanceListener(): Behavior[ConsumerRebalanceEvent] = Behaviors.receive {
  case (context, TopicPartitionsAssigned(subscription, topicPartitions)) =>
    context.log.info("Assigned: {}", topicPartitions)
    Behaviors.same

  case (context, TopicPartitionsRevoked(subscription, topicPartitions)) =>
    context.log.info("Revoked: {}", topicPartitions)
    Behaviors.same
}

val typedRef: akka.actor.typed.ActorRef[ConsumerRebalanceEvent] =
  context.spawn(rebalanceListener(), "rebalance-listener")

// adds support for actors to a classic actor system and context
import akka.actor.typed.scaladsl.adapter._
  
val classicRef: akka.actor.ActorRef = typedRef.toClassic  

val subscription = Subscriptions
  .topics(topic)
  // additionally, pass the actor reference:
  .withRebalanceListener(classicRef)

// use the subscription as usual:
Consumer
  .plainSource(consumerSettings, subscription)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L23-L559 "Go to snippet source")import akka.actor.typed.javadsl.Behaviors;

Function<ActorContext<ConsumerRebalanceEvent>, Behavior<ConsumerRebalanceEvent>>
    rebalanceListener =
        (ActorContext<ConsumerRebalanceEvent> context) ->
            Behaviors.receive(ConsumerRebalanceEvent.class)
                .onMessage(
                    TopicPartitionsAssigned.class,
                    assigned -> {
                      context.getLog().info("Assigned: {}", assigned);
                      return Behaviors.same();
                    })
                .onMessage(
                    TopicPartitionsRevoked.class,
                    revoked -> {
                      context.getLog().info("Revoked: {}", revoked);
                      return Behaviors.same();
                    })
                .build();

          Behavior<ConsumerRebalanceEvent> listener =
              Behaviors.setup(ctx -> rebalanceListener.apply(ctx));

          akka.actor.typed.ActorRef<ConsumerRebalanceEvent> typedRef =
              guardianCtx.spawn(listener, "rebalance-listener");

          akka.actor.ActorRef classicRef = Adapter.toClassic(typedRef);

          Subscription subscription =
              Subscriptions.topics(topic)
                  // additionally, pass the actor reference:
                  .withRebalanceListener(classicRef);

          Consumer.DrainingControl<List<ConsumerRecord<String, String>>> control =
              // use the subscription as usual:
              Consumer.plainSource(consumerSettings, subscription)
                  .toMat(Sink.seq(), Consumer::createDrainingControl)
                  .run(system);
```

Or with Classic Actors

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L339-L369 "Go to snippet source")import akka.kafka.{TopicPartitionsAssigned, TopicPartitionsRevoked}

class RebalanceListener extends Actor with ActorLogging {
  def receive: Receive = {
    case TopicPartitionsAssigned(subscription, topicPartitions) =>
      log.info("Assigned: {}", topicPartitions)

    case TopicPartitionsRevoked(subscription, topicPartitions) =>
      log.info("Revoked: {}", topicPartitions)
  }
}

val rebalanceListener = system.actorOf(Props(new RebalanceListener))
val subscription = Subscriptions
  .topics(topic)
  // additionally, pass the actor reference:
  .withRebalanceListener(rebalanceListener)

// use the subscription as usual:
  Consumer
    .plainSource(consumerSettings, subscription)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L457-L499 "Go to snippet source")static class RebalanceListener extends AbstractLoggingActor {

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            TopicPartitionsAssigned.class,
            assigned -> {
              log().info("Assigned: {}", assigned);
            })
        .match(
            TopicPartitionsRevoked.class,
            revoked -> {
              log().info("Revoked: {}", revoked);
            })
        .build();
  }
}

  ActorRef rebalanceListener = system.actorOf(Props.create(RebalanceListener.class));

  Subscription subscription =
      Subscriptions.topics(topic)
          // additionally, pass the actor reference:
          .withRebalanceListener(rebalanceListener);

  // use the subscription as usual:
  Consumer.DrainingControl<List<ConsumerRecord<String, String>>> control =
      Consumer.plainSource(consumerSettings, subscription)
          .toMat(Sink.seq(), Consumer::createDrainingControl)
          .run(system);
```

## Code Examples

### Example 1: Partition Assignment Handler

```scala
val assignmentHandler = new PartitionAssignmentHandler {
  override def onRevoke(revokedTps: Set[TopicPartition], consumer: RestrictedConsumer): Unit = // ???
  override def onAssign(assignedTps: Set[TopicPartition], consumer: RestrictedConsumer): Unit = // ???
  override def onLost(lostTps: Set[TopicPartition], consumer: RestrictedConsumer): Unit = // ???
  override def onStop(currentTps: Set[TopicPartition], consumer: RestrictedConsumer): Unit = // ???
}

val subscription = Subscriptions
  .topics(topic)
  .withPartitionAssignmentHandler(assignmentHandler)
```

### Example 2: Partition Assignment Handler

```java
PartitionAssignmentHandler assignmentHandler =
    new PartitionAssignmentHandler() {
      public void onRevoke(Set<TopicPartition> revokedTps, RestrictedConsumer consumer) {
      }

      public void onAssign(Set<TopicPartition> assignedTps, RestrictedConsumer consumer) {
      }

      public void onLost(Set<TopicPartition> lostTps, RestrictedConsumer consumer) {}

      public void onStop(Set<TopicPartition> currentTps, RestrictedConsumer consumer) {
      }
    };

Subscription subscription =
    Subscriptions.topics(topic).withPartitionAssignmentHandler(assignmentHandler);
```

### Example 3: Listening for rebalance events

```scala
import akka.kafka.{TopicPartitionsAssigned, TopicPartitionsRevoked}

def rebalanceListener(): Behavior[ConsumerRebalanceEvent] = Behaviors.receive {
  case (context, TopicPartitionsAssigned(subscription, topicPartitions)) =>
    context.log.info("Assigned: {}", topicPartitions)
    Behaviors.same

  case (context, TopicPartitionsRevoked(subscription, topicPartitions)) =>
    context.log.info("Revoked: {}", topicPartitions)
    Behaviors.same
}

val typedRef: akka.actor.typed.ActorRef[ConsumerRebalanceEvent] =
  context.spawn(rebalanceListener(), "rebalance-listener")

// adds support for actors to a classic actor system and context
import akka.actor.typed.scaladsl.adapter._
  
val classicRef: akka.actor.ActorRef = typedRef.toClassic  

val subscription = Subscriptions
  .topics(topic)
  // additionally, pass the actor reference:
  .withRebalanceListener(classicRef)

// use the subscription as usual:
Consumer
  .plainSource(consumerSettings, subscription)
```

### Example 4: Listening for rebalance events

```java
import akka.actor.typed.javadsl.Behaviors;

Function<ActorContext<ConsumerRebalanceEvent>, Behavior<ConsumerRebalanceEvent>>
    rebalanceListener =
        (ActorContext<ConsumerRebalanceEvent> context) ->
            Behaviors.receive(ConsumerRebalanceEvent.class)
                .onMessage(
                    TopicPartitionsAssigned.class,
                    assigned -> {
                      context.getLog().info("Assigned: {}", assigned);
                      return Behaviors.same();
                    })
                .onMessage(
                    TopicPartitionsRevoked.class,
                    revoked -> {
                      context.getLog().info("Revoked: {}", revoked);
                      return Behaviors.same();
                    })
                .build();

          Behavior<ConsumerRebalanceEvent> listener =
              Behaviors.setup(ctx -> rebalanceListener.apply(ctx));

          akka.actor.typed.ActorRef<ConsumerRebalanceEvent> typedRef =
              guardianCtx.spawn(listener, "rebalance-listener");

          akka.actor.ActorRef classicRef = Adapter.toClassic(typedRef);

          Subscription subscription =
              Subscriptions.topics(topic)
                  // additionally, pass the actor reference:
                  .withRebalanceListener(classicRef);

          Consumer.DrainingControl<List<ConsumerRecord<String, String>>> control =
              // use the subscription as usual:
              Consumer.plainSource(consumerSettings, subscription)
                  .toMat(Sink.seq(), Consumer::createDrainingControl)
                  .run(system);
```

### Example 5: Listening for rebalance events

```scala
import akka.kafka.{TopicPartitionsAssigned, TopicPartitionsRevoked}

class RebalanceListener extends Actor with ActorLogging {
  def receive: Receive = {
    case TopicPartitionsAssigned(subscription, topicPartitions) =>
      log.info("Assigned: {}", topicPartitions)

    case TopicPartitionsRevoked(subscription, topicPartitions) =>
      log.info("Revoked: {}", topicPartitions)
  }
}

val rebalanceListener = system.actorOf(Props(new RebalanceListener))
val subscription = Subscriptions
  .topics(topic)
  // additionally, pass the actor reference:
  .withRebalanceListener(rebalanceListener)

// use the subscription as usual:
  Consumer
    .plainSource(consumerSettings, subscription)
```

### Example 6: Listening for rebalance events

```java
static class RebalanceListener extends AbstractLoggingActor {

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            TopicPartitionsAssigned.class,
            assigned -> {
              log().info("Assigned: {}", assigned);
            })
        .match(
            TopicPartitionsRevoked.class,
            revoked -> {
              log().info("Revoked: {}", revoked);
            })
        .build();
  }
}

  ActorRef rebalanceListener = system.actorOf(Props.create(RebalanceListener.class));

  Subscription subscription =
      Subscriptions.topics(topic)
          // additionally, pass the actor reference:
          .withRebalanceListener(rebalanceListener);

  // use the subscription as usual:
  Consumer.DrainingControl<List<ConsumerRecord<String, String>>> control =
      Consumer.plainSource(consumerSettings, subscription)
          .toMat(Sink.seq(), Consumer::createDrainingControl)
          .run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/RestrictedConsumer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/TopicPartitionsAssigned.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/TopicPartitionsRevoked.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html
- https://doc.akka.io/docs/alpakka-kafka/current/consumer-metadata.html
- https://doc.akka.io/docs/alpakka-kafka/current/consumer-rebalance.html
- https://doc.akka.io/docs/alpakka-kafka/current/subscription.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html

---
*Source: [https://doc.akka.io/docs/alpakka-kafka/current/consumer-rebalance.html](https://doc.akka.io/docs/alpakka-kafka/current/consumer-rebalance.html)*
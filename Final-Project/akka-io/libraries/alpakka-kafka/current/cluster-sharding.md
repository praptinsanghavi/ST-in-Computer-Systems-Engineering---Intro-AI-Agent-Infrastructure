---
description: Alpakka Kafka provides a module to use Kafka with Akka Cluster External
  Sharding.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/cluster-sharding.html
title: Akka Cluster Sharding • Alpakka Kafka Documentation
---

# Akka Cluster Sharding • Alpakka Kafka Documentation

> **Summary:** Alpakka Kafka provides a module to use Kafka with Akka Cluster External Sharding.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Cluster Sharding

Akka Cluster allows the user to use an [external shard allocation](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html#external-shard-allocation) strategy in order to give the user more control over how many shards are created and what cluster nodes they are assigned to. If you consume Kafka messages into your Akka Cluster application then it’s possible to run an Alpakka Kafka Consumer on each cluster node and co\-locate Kafka partitions with Akka Cluster shards. When partitions and shards are co\-located together then there is less chance that a message must be transmitted over the network by the Akka Cluster Shard Coordinator to a destination user sharded entity.

## Project Info

| Project Info: Alpakka Kafka Cluster Sharding | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-stream\-kafka\-cluster\-sharding 8\.0\.1 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.kafka.cluster.sharding |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka-kafka/v8.0.1/LICENSE) |
| Readiness level | [Incubating](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#incubating) Since 2\.0\.3, 2020\-03\-05 Note: The API of the cluster sharding is experimental and may change even for minor versions. |
| Home page | [https://doc.akka.io/libraries/alpakka\-kafka/current](https://doc.akka.io/libraries/alpakka-kafka/current) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) |
| Release notes | [In the documentation](https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/index.html) |
| Issues | [Github issues](https://github.com/akka/alpakka-kafka/issues) |
| Sources | [https://github.com/akka/alpakka\-kafka](https://github.com/akka/alpakka-kafka) |

## Dependency

Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka-cluster-sharding_${scala.binary.version}</artifactId>
    <version>8.0.1</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-kafka-cluster-sharding" % "8.0.1",
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream-kafka-cluster-sharding_${versions.ScalaBinary}:8.0.1"
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

This module contains an Akka extension called `KafkaClusterSharding` and depends on `akka-cluster-sharding-typed`.

## Setup

There are two steps required to setup the cluster sharding module.

- Initialize Akka Cluster Sharding with a [`ShardingMessageExtractor`](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html "akka.cluster.sharding.typed.ShardingMessageExtractor") to route Kafka consumed messages to the correct Akka Cluster shard and user entity.
- Use a provided Rebalance Listener in your [`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html "akka.kafka.ConsumerSettings") to update the external shard allocation at runtime when Kafka Consumer Group rebalances occur.

Note
A complete example of using this module exists in an [`akka/samples`](https://github.com/akka/akka/tree/main/samples) project called [`akka-sample-kafka-sharding`](https://github.com/akka/akka/tree/main/samples/akka-sample-kafka-to-sharding-scala).  
It’s a self\-contained example that can run on a developer’s laptop.

## Sharding Message Extractors

To setup the [`ShardingMessageExtractor`](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html "akka.cluster.sharding.typed.ShardingMessageExtractor") pick a factory method in the `KafkaClusterSharding` Akka extension that best fits your use case. This module provides two kinds of extractors, extractors for entities that are within a [`ShardingEnvelope`](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html "akka.cluster.sharding.typed.ShardingEnvelope") and without.  
They’re called `messageExtractor` and `messageExtractorNoEnvelope` respectively.

To route Kafka messages to the correct user entity we must use the same algorithm used to define the Kafka partition for the consumed message. This module implements the Murmur2\-based hashing algorithm that’s used in the Kafka [`DefaultPartitioner`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/Partitioner.html "org.apache.kafka.clients.producer.Partitioner") that’s used by default in the Kafka Producer. The input to this algorithm is the entity key and the number of partitions used in the topic the message was consumed from. Therefore it’s critical to use the same Kafka message key (sharded entity id) and number of Kafka topic partitions (shards). The message extractors can optionally look up the number of shards given a topic name, or the user can provide the number of shards explicitly.

To get the [`ShardingMessageExtractor`](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html "akka.cluster.sharding.typed.ShardingMessageExtractor") call the `messageExtractor` overload that’s suitable for your use case.  
In the following example we asynchronously request an extractor that does not use a sharding envelope and will use the same number of partitions as the given topic name.

Given a user entity.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ClusterShardingExample.scala#L41 "Go to snippet source")final case class User(id: String, name: String)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ClusterShardingExample.java#L34-L43 "Go to snippet source")static final class User {
  public final String id;
  public final String mame;

  User(String id, String mame) {
    this.id = id;
    this.mame = mame;
  }
}

```

Create a `MessageExtractor`.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ClusterShardingExample.scala#L45-L53 "Go to snippet source")// automatically retrieving the number of partitions requires a round trip to a Kafka broker
val messageExtractor: Future[KafkaClusterSharding.KafkaShardingNoEnvelopeExtractor[User]] =
  KafkaClusterSharding(system.toClassic).messageExtractorNoEnvelope(
    timeout = 10.seconds,
    topic = "user-topic",
    entityIdExtractor = (msg: User) => msg.id,
    settings = ConsumerSettings(system.toClassic, new StringDeserializer, new StringDeserializer)
      .withBootstrapServers(kafkaBootstrapServers)
  )
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ClusterShardingExample.java#L59-L67 "Go to snippet source")// automatically retrieving the number of partitions requires a round trip to a Kafka broker
CompletionStage<KafkaClusterSharding.KafkaShardingNoEnvelopeExtractor<User>> messageExtractor =
    KafkaClusterSharding.get(system)
        .messageExtractorNoEnvelope(
            "user-topic",
            Duration.ofSeconds(10),
            (User msg) -> msg.id,
            ConsumerSettings.create(
                Adapter.toClassic(system), new StringDeserializer(), new StringDeserializer()));
```

Setup Akka Typed Cluster Sharding.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ClusterShardingExample.scala#L57-L70 "Go to snippet source")// create an Akka Cluster Sharding `EntityTypeKey` for `User` for this Kafka Consumer Group
val groupId = "user-topic-group-id"
val typeKey = EntityTypeKey[User](groupId)

messageExtractor.onComplete {
  case Success(extractor) =>
    ClusterSharding(system).init(
      Entity(typeKey)(createBehavior = _ => userBehaviour())
        .withAllocationStrategy(new ExternalShardAllocationStrategy(system, typeKey.name))
        .withMessageExtractor(extractor)
        .withSettings(ClusterShardingSettings(system))
    )
  case Failure(ex) => system.log.error("An error occurred while obtaining the message extractor", ex)
}
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ClusterShardingExample.java#L71-L83 "Go to snippet source")  
String groupId = "user-topic-group-id";
EntityTypeKey<User> typeKey = EntityTypeKey.create(User.class, groupId);

messageExtractor.thenAccept(
    extractor ->
        ClusterSharding.get(system)
            .init(
                Entity.of(typeKey, ctx -> userBehaviour())
                    .withAllocationStrategy(
                        new ExternalShardAllocationStrategy(
                            system, typeKey.name(), Timeout.create(Duration.ofSeconds(5))))
                    .withMessageExtractor(extractor)));
```

## Rebalance Listener

The Rebalance Listener is a pre\-defined Actor that will handle [`ConsumerRebalanceEvents`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerRebalanceEvent.html "akka.kafka.ConsumerRebalanceEvent") that will update the Akka Cluster External Sharding strategy when subscribed partitions are re\-assigned to consumers running on different cluster nodes. This makes sure that shards remain local to Kafka Consumers after a consumer group rebalance. The Rebalance Listener is returned as a Typed [`ActorRef[ConsumerRebalanceEvent]`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") and must be converted to a classic [`ActorRef`](https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") before being passed to [`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html "akka.kafka.ConsumerSettings").

Note
It’s recommended to use the same value for both the Kafka Consumer Group ID and the [`EntityTypeKey`](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html "akka.cluster.sharding.typed.scaladsl.EntityTypeKey"). This allows you to create multiple Kafka Consumer Groups that consume the same type of messages from the same topic, but are routed to different [`Behaviors`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") to be processed in a different way.

For example, a `user-events` topic is consumed by two consumer groups. One consumer group is used to maintain an up\-to\-date view of the user’s profile and the other is used to represent an aggregate history of the types of user events. The same message type is used by separate Alpakka Kafka consumers, but the messages are routed to different Akka Cluster Sharding Coordinators that are setup to use separate [`Behaviors`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior"). 

Create the rebalance listener using the extension and pass it into an Alpakka Kafka [`Subscription`](/api/alpakka-kafka/8.0.1/akka/kafka/Subscription.html "akka.kafka.Subscription").

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ClusterShardingExample.scala#L74-L96 "Go to snippet source")// obtain an Akka classic ActorRef that will handle consumer group rebalance events
val rebalanceListener: akka.actor.typed.ActorRef[ConsumerRebalanceEvent] =
  KafkaClusterSharding(system.toClassic).rebalanceListener(typeKey)

// convert the rebalance listener to a classic ActorRef until Alpakka Kafka supports Akka Typed
import akka.actor.typed.scaladsl.adapter._
val rebalanceListenerClassic: akka.actor.ActorRef = rebalanceListener.toClassic

val consumerSettings =
  ConsumerSettings(system.toClassic, new StringDeserializer, new ByteArrayDeserializer)
    .withBootstrapServers(kafkaBootstrapServers)
    .withGroupId(typeKey.name) // use the same group id as we used in the `EntityTypeKey` for `User`

// pass the rebalance listener to the topic subscription
val subscription = Subscriptions
  .topics("user-topic")
  .withRebalanceListener(rebalanceListenerClassic)

// run & materialize the stream
val consumer = Consumer
  .plainSource(consumerSettings, subscription)
  .via(userBusiness())
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ClusterShardingExample.java#L87-L106 "Go to snippet source")akka.actor.typed.ActorRef<ConsumerRebalanceEvent> rebalanceListener =
    KafkaClusterSharding.get(system).rebalanceListener(typeKey);

ConsumerSettings<String, byte[]> consumerSettings =
    ConsumerSettings.create(
            Adapter.toClassic(system), new StringDeserializer(), new ByteArrayDeserializer())
        .withBootstrapServers(kafkaBootstrapServers)
        .withGroupId(
            typeKey
                .name()); // use the same group id as we used in the `EntityTypeKey` for `User`

// pass the rebalance listener to the topic subscription
AutoSubscription subscription =
    Subscriptions.topics("user-topic")
        .withRebalanceListener(Adapter.toClassic(rebalanceListener));

// run & materialize the stream
Consumer.plainSource(consumerSettings, subscription)
    .via(userBusiness())
    .runWith(Sink.ignore(), system);
```

## Code Examples

### Example 1: Dependency

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka-cluster-sharding_${scala.binary.version}</artifactId>
    <version>8.0.1</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 2: Dependency

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-kafka-cluster-sharding" % "8.0.1",
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion
)
```

### Example 3: Dependency

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream-kafka-cluster-sharding_${versions.ScalaBinary}:8.0.1"
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Sharding Message Extractors

```scala
final case class User(id: String, name: String)
```

### Example 5: Sharding Message Extractors

```java
static final class User {
  public final String id;
  public final String mame;

  User(String id, String mame) {
    this.id = id;
    this.mame = mame;
  }
}
```

### Example 6: Sharding Message Extractors

```scala
// automatically retrieving the number of partitions requires a round trip to a Kafka broker
val messageExtractor: Future[KafkaClusterSharding.KafkaShardingNoEnvelopeExtractor[User]] =
  KafkaClusterSharding(system.toClassic).messageExtractorNoEnvelope(
    timeout = 10.seconds,
    topic = "user-topic",
    entityIdExtractor = (msg: User) => msg.id,
    settings = ConsumerSettings(system.toClassic, new StringDeserializer, new StringDeserializer)
      .withBootstrapServers(kafkaBootstrapServers)
  )
```

### Example 7: Sharding Message Extractors

```java
// automatically retrieving the number of partitions requires a round trip to a Kafka broker
CompletionStage<KafkaClusterSharding.KafkaShardingNoEnvelopeExtractor<User>> messageExtractor =
    KafkaClusterSharding.get(system)
        .messageExtractorNoEnvelope(
            "user-topic",
            Duration.ofSeconds(10),
            (User msg) -> msg.id,
            ConsumerSettings.create(
                Adapter.toClassic(system), new StringDeserializer(), new StringDeserializer()));
```

### Example 8: Sharding Message Extractors

```scala
// create an Akka Cluster Sharding `EntityTypeKey` for `User` for this Kafka Consumer Group
val groupId = "user-topic-group-id"
val typeKey = EntityTypeKey[User](groupId)

messageExtractor.onComplete {
  case Success(extractor) =>
    ClusterSharding(system).init(
      Entity(typeKey)(createBehavior = _ => userBehaviour())
        .withAllocationStrategy(new ExternalShardAllocationStrategy(system, typeKey.name))
        .withMessageExtractor(extractor)
        .withSettings(ClusterShardingSettings(system))
    )
  case Failure(ex) => system.log.error("An error occurred while obtaining the message extractor", ex)
}
```

### Example 9: Sharding Message Extractors

```java
String groupId = "user-topic-group-id";
EntityTypeKey<User> typeKey = EntityTypeKey.create(User.class, groupId);

messageExtractor.thenAccept(
    extractor ->
        ClusterSharding.get(system)
            .init(
                Entity.of(typeKey, ctx -> userBehaviour())
                    .withAllocationStrategy(
                        new ExternalShardAllocationStrategy(
                            system, typeKey.name(), Timeout.create(Duration.ofSeconds(5))))
                    .withMessageExtractor(extractor)));
```

### Example 10: Rebalance Listener

```scala
// obtain an Akka classic ActorRef that will handle consumer group rebalance events
val rebalanceListener: akka.actor.typed.ActorRef[ConsumerRebalanceEvent] =
  KafkaClusterSharding(system.toClassic).rebalanceListener(typeKey)

// convert the rebalance listener to a classic ActorRef until Alpakka Kafka supports Akka Typed
import akka.actor.typed.scaladsl.adapter._
val rebalanceListenerClassic: akka.actor.ActorRef = rebalanceListener.toClassic

val consumerSettings =
  ConsumerSettings(system.toClassic, new StringDeserializer, new ByteArrayDeserializer)
    .withBootstrapServers(kafkaBootstrapServers)
    .withGroupId(typeKey.name) // use the same group id as we used in the `EntityTypeKey` for `User`

// pass the rebalance listener to the topic subscription
val subscription = Subscriptions
  .topics("user-topic")
  .withRebalanceListener(rebalanceListenerClassic)

// run & materialize the stream
val consumer = Consumer
  .plainSource(consumerSettings, subscription)
  .via(userBusiness())
  .runWith(Sink.ignore)
```

### Example 11: Rebalance Listener

```java
akka.actor.typed.ActorRef<ConsumerRebalanceEvent> rebalanceListener =
    KafkaClusterSharding.get(system).rebalanceListener(typeKey);

ConsumerSettings<String, byte[]> consumerSettings =
    ConsumerSettings.create(
            Adapter.toClassic(system), new StringDeserializer(), new ByteArrayDeserializer())
        .withBootstrapServers(kafkaBootstrapServers)
        .withGroupId(
            typeKey
                .name()); // use the same group id as we used in the `EntityTypeKey` for `User`

// pass the rebalance listener to the topic subscription
AutoSubscription subscription =
    Subscriptions.topics("user-topic")
        .withRebalanceListener(Adapter.toClassic(rebalanceListener));

// run & materialize the stream
Consumer.plainSource(consumerSettings, subscription)
    .via(userBusiness())
    .runWith(Sink.ignore(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerRebalanceEvent.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscription.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html
- https://doc.akka.io/libraries/alpakka-kafka/current
- https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html
- https://doc.akka.io/libraries/alpakka-kafka/current/errorhandling.html
- https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/index.html
- https://doc.akka.io/libraries/alpakka-kafka/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/cluster-sharding.html](https://doc.akka.io/libraries/alpakka-kafka/current/cluster-sharding.html)*
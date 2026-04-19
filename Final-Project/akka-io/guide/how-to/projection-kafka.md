---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:22Z'
section: guide
site: akka-io
source_url: https://doc.akka.io/libraries/guide/how-to/projection-kafka.html
title: 'Use Kafka between two services :: Akka Guide'
---

# Use Kafka between two services :: Akka Guide

## Content

# Use Kafka between two services

Language

This guide describes how to use Kafka for communication between 2 services. It assumes that you created the project using the [Implementing Microservices with Akka tutorial](../microservices-tutorial/index.html), and it describes the changes required to replace the Projection over gRPC used for Service\-to\-service Eventing that is used in the tutorial to make the Shopping Cart events available to the Analytics Service. It focuses on the Kafka producer in the `PublishEventsProjection` and the Kafka consumer in `ShoppingAnalyticsService`. On this page you will learn how to:

- send messages to a Kafka topic from a Projection
- consume messages from a Kafka topic

## Source downloads

If you prefer to simply view and run the example, download a zip file containing the completed code:

Java

- [Source](_attachments/shopping-cart-kafka-java.zip) that includes the full `shopping-cart-service` and `shopping-analytics-service` examples from the tutorial completed with the steps from this page.

Scala

- [Source](_attachments/shopping-cart-kafka-scala.zip) that includes the full `shopping-cart-service` example from the tutorial completed with the steps from this page.

## Producer side

We will need to change our `shopping-cart-service` to send the events to a Kafka topic instead of making them available over gRPC. We will use the same public external representation for the events specified in `shopping_cart_events.proto` and write them to a Kafka topic.

### Send to Kafka from a Projection

We will use the [Alpakka Kafka ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/alpakka-kafka/current/) connector to send the events to Kafka. The Alpakka project implements a stream\-aware and reactive integration pipelines for Java and Scala. It is built on top of Akka Streams, and has been designed from the ground up to understand streaming natively and provide a DSL for reactive and stream\-oriented programming, with built\-in support for backpressure.

1. Start by adding the required dependency on Alpakka Kafka:

pom.xml:

```
<dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka_${scala.binary.version}</artifactId>
</dependency>
```

build.sbt:

```
val AlpakkaKafkaVersion = "8.0.0"
libraryDependencies ++= Seq(
  // ...
  "com.typesafe.akka" %% "akka-stream-kafka" % AlpakkaKafkaVersion
```
2. Add a `PublishEventsProjectionFlow` class that creates a `FlowWithContext` for processing and converting the events:

Java

src/main/java/shopping/cart/PublishEventsProjectionFlow.java:

```
package shopping.cart;

import akka.Done;
import akka.NotUsed;
import akka.actor.typed.ActorSystem;
import akka.kafka.ProducerMessage;
import akka.kafka.ProducerSettings;
import akka.kafka.javadsl.Producer;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.ProjectionContext;
import akka.stream.javadsl.FlowWithContext;
import com.google.protobuf.Any;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.ByteArraySerializer;
import org.apache.kafka.common.serialization.StringSerializer;

public final class PublishEventsProjectionFlow {

  public static FlowWithContext<
          EventEnvelope<ShoppingCart.Event>, ProjectionContext, Done, ProjectionContext, NotUsed>
      createProducerFlow(String topic, ActorSystem<?> system) {
    var producerSettings =
        ProducerSettings.create(system, new StringSerializer(), new ByteArraySerializer());

    (1)
    return FlowWithContext.<EventEnvelope<ShoppingCart.Event>, ProjectionContext>create()
        .map(
            envelope -> {
              ShoppingCart.Event event = envelope.event();

              // using the cartId as the key and `DefaultPartitioner` will select partition based on
              // the key so that events for same cart always ends up in same partition
              String key = event.cartId();
              var producerRecord = new ProducerRecord<>(topic, key, serialize(event)); (2)
              system.log().info("Publishing event [{}] to topic {}", envelope.event(), topic);
              return ProducerMessage.single(producerRecord);
            })
        .via(Producer.flowWithContext(producerSettings))
        .map(__ -> Done.getInstance());
  }

  private static byte[] serialize(ShoppingCart.Event event) {
    var pbEvent =
        switch (event) {
          case ShoppingCart.ItemAdded(String cartId, String itemId, int qtd) ->
              shopping.cart.proto.ItemAdded.newBuilder()
                  .setCartId(cartId)
                  .setItemId(itemId)
                  .setQuantity(qtd)
                  .build();
          case ShoppingCart.CheckedOut(String cartId, var __) ->
              shopping.cart.proto.CheckedOut.newBuilder().setCartId(cartId).build();
          case null ->
              throw new IllegalArgumentException("Unknown event type: " + event.getClass());
        };

    // pack in Any so that type information is included for deserialization
    return Any.pack(pbEvent).toByteArray(); (3)
  }
}
```

| **1** | Using a `Producer.flowWithContext` from Alpakka Kafka. |
| --- | --- |
| **2** | The events are serialized to Protobuf and sent to the given topic. |
| **3** | Wrap in Protobuf `Any` to include type information. |

Scala

src/main/scala/shopping/cart/PublishEventsProjectionFlow.scala:

```
package shopping.cart

import akka.Done
import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.kafka.ProducerMessage
import akka.kafka.ProducerSettings
import akka.kafka.scaladsl.Producer
import akka.persistence.query.typed.EventEnvelope
import akka.projection.ProjectionContext
import akka.stream.scaladsl.FlowWithContext
import com.google.protobuf.any.{ Any => ScalaPBAny }
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.serialization.ByteArraySerializer
import org.apache.kafka.common.serialization.StringSerializer
import org.slf4j.LoggerFactory

object PublishEventsProjectionFlow {
  private val log = LoggerFactory.getLogger(getClass)

  def createProducerFlow(
      topic: String,
      system: ActorSystem[_]): FlowWithContext[
    EventEnvelope[ShoppingCart.Event],
    ProjectionContext,
    Done,
    ProjectionContext,
    NotUsed] = {

    val producerSettings =
      ProducerSettings(system, new StringSerializer, new ByteArraySerializer)

    (1)
    FlowWithContext[EventEnvelope[ShoppingCart.Event], ProjectionContext]
      .map(envelope => {
        // using the cartId as the key and `DefaultPartitioner` will select partition based on the key
        // so that events for same cart always ends up in same partition
        val key = envelope.event.cartId
        val record =
          new ProducerRecord(topic, key, serialize(envelope.event)) (2)
        log.info("Publishing event [{}] to topic {}", envelope.event, topic)
        ProducerMessage.single(record)
      })
      .via(Producer.flowWithContext(producerSettings))
      .map(_ => Done)
  }

  private def serialize(event: ShoppingCart.Event): Array[Byte] = {
    val protoMessage = event match {
      case ShoppingCart.ItemAdded(cartId, itemId, quantity) =>
        proto.ItemAdded(cartId, itemId, quantity)
      case ShoppingCart.CheckedOut(cartId, _) =>
        proto.CheckedOut(cartId)
    }
    // pack in Any so that type information is included for deserialization
    ScalaPBAny.pack(protoMessage).toByteArray (3)
  }
}
```

| **1** | Using a `Producer.flowWithContext` from Alpakka Kafka. |
| --- | --- |
| **2** | The events are serialized to Protobuf and sent to the given topic. |
| **3** | Wrap in Protobuf `Any` to include type information. |

The serialization converts the `ShoppingCart.Event` classes to the Protobuf representation. Since several types of messages are sent to the same topic we must include some type information that the consumers of the topic can use when deserializing the messages. Protobuf provides a built\-in type called `Any` for this purpose. That is why it is wrapped with `ScalaPBAny.pack`.

### Initialize the Projection

Now, we will use a similar projection as before, but this time we will send the events to the recently created Kafka handler.

1. Place the initialization code of the Projection in a `PublishEventsProjection` object class:

Java

src/main/java/shopping/cart/PublishEventsProjection.java:

```
package shopping.cart;

import static shopping.cart.PublishEventsProjectionFlow.createProducerFlow;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.AtLeastOnceFlowProjection;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import java.util.List;
import java.util.Optional;

public class PublishEventsProjection {

  private PublishEventsProjection() {}

  public static void init(ActorSystem<?> system) {

    String topic = system.settings().config().getString("shopping-cart-service.kafka.topic");

    ShardedDaemonProcess.get(system)
        .initWithContext( (1)
            ProjectionBehavior.Command.class,
            "PublishEventsProjection",
            4,
            daemonContext -> {
              List<Pair<Integer, Integer>> sliceRanges = (2)
                  EventSourcedProvider.sliceRanges(
                      system, R2dbcReadJournal.Identifier(), daemonContext.totalProcesses());
              Pair<Integer, Integer> sliceRange = sliceRanges.get(daemonContext.processNumber());
              return ProjectionBehavior.create(createProjection(system, sliceRange, topic));
            },
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static AtLeastOnceFlowProjection<Offset, EventEnvelope<ShoppingCart.Event>>
      createProjection(ActorSystem<?> system, Pair<Integer, Integer> sliceRange, String topic) {

    int minSlice = sliceRange.first();
    int maxSlice = sliceRange.second();

    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider = (3)
        EventSourcedProvider.eventsBySlices(
            system,
            R2dbcReadJournal.Identifier(), (4)
            "ShoppingCart",
            minSlice,
            maxSlice);

    String slice = "carts-" + minSlice + "-" + maxSlice;
    Optional<R2dbcProjectionSettings> settings = Optional.empty();
    return R2dbcProjection.atLeastOnceFlow( (5)
        ProjectionId.of("PublishEventsProjection", slice),
        settings,
        sourceProvider,
        createProducerFlow(topic, system), (6)
        system);
  }
}
```

| **1** | `ShardedDaemonProcess` manages the Projection instances. It ensures the Projection instances are always running and distributes them over the nodes in the Akka Cluster. |
| --- | --- |
| **2** | The slice ranges are calculated based on the number active Projection instances, given by `daemonContext.totalProcesses()`. Then, the specific slice range for this instance is identified by its `processNumber`. |
| **3** | The source of the Projection is `EventSourcedProvider.eventsBySlices` with the selected slice range, defined by a `minSlice` and a `maxSlice`. |
| **4** | Using the R2DBC event journal. |
| **5** | Using R2DBC for offset storage of the Projection using `exactly-once` strategy. Offset and projected model will be persisted in the same transaction. |
| **6** | Defining a Projection `Handler` factory for the handler we wrote in the beginning of this part. |

Scala

src/main/scala/shopping/cart/PublishEventsProjection.scala:

```
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.query.Offset
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.SourceProvider
import akka.projection.{ Projection, ProjectionBehavior, ProjectionId }

object PublishEventsProjection {

  def init(system: ActorSystem[_]): Unit = {

    val topic =
      system.settings.config.getString("shopping-cart-service.kafka.topic")

    def sourceProvider(sliceRange: Range)
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
      EventSourcedProvider (1)
        .eventsBySlices[ShoppingCart.Event](
          system,
          readJournalPluginId = R2dbcReadJournal.Identifier, (2)
          "ShoppingCart",
          sliceRange.min,
          sliceRange.max)

    def projection(
        sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
      val minSlice = sliceRange.min
      val maxSlice = sliceRange.max
      val projectionId =
        ProjectionId("PublishEventsProjection", s"carts-$minSlice-$maxSlice")

      R2dbcProjection.atLeastOnceFlow( (3)
        projectionId,
        settings = None,
        sourceProvider(sliceRange),
        handler =
          PublishEventsProjectionFlow.createProducerFlow(topic, system) (4)
      )(system)
    }

    ShardedDaemonProcess(system).initWithContext( (5)
      name = "PublishEventsProjection",
      initialNumberOfInstances = 4,
      behaviorFactory = { daemonContext =>
        val sliceRanges = (6)
          EventSourcedProvider.sliceRanges(
            system,
            R2dbcReadJournal.Identifier,
            daemonContext.totalProcesses)
        val sliceRange = sliceRanges(daemonContext.processNumber)
        ProjectionBehavior(projection(sliceRange))
      },
      ShardedDaemonProcessSettings(system),
      stopMessage = ProjectionBehavior.Stop)
  }
}
```

| **1** | The source of the Projection is `EventSourcedProvider.eventsBySlices` with the selected slice range, defined by a `minSlice` and a `maxSlice`. |
| --- | --- |
| **2** | Using the R2DBC event journal. |
| **3** | Using R2DBC for offset storage of the Projection using `exactly-once` strategy. Offset and projected model will be persisted in the same transaction. |
| **4** | Defining a Projection `Handler` factory for the handler we wrote in the beginning of this part. |
| **5** | `ShardedDaemonProcess` manages the Projection instances. It ensures the Projection instances are always running and distributes them over the nodes in the Akka Cluster. |
| **6** | The slice ranges are calculated based on the number active Projection instances, given by `daemonContext.totalProcesses()`. Then, the specific slice range for this instance is identified by its `processNumber`. |

The `SendProducer` is initialized using some configuration that we need to add. It defines how to connect to the Kafka broker.
2. Add the following to a new `src/main/resources/kafka.conf` file:

```
shopping-cart-service {
  kafka.topic = "shopping-cart-events"
}

# common config for akka.kafka.producer.kafka-clients and akka.kafka.consumer.kafka-clients
kafka-connection-settings {
  # This and other connection settings may have to be changed depending on environment.
  bootstrap.servers = "localhost:9092"
}
akka.kafka.producer {
  kafka-clients = ${kafka-connection-settings}
}
akka.kafka.consumer {
  kafka-clients = ${kafka-connection-settings}
}
```
3. Include `kafka.conf` in `application.conf`.
4. For local development add the following to `src/main/resources/local-shared.conf`, which is loaded when running locally:

```
# common config for akka.kafka.producer.kafka-clients and akka.kafka.consumer.kafka-clients
kafka-connection-settings {
  bootstrap.servers = "localhost:9092"
}
akka.kafka.producer {
  kafka-clients = ${kafka-connection-settings}
}
akka.kafka.consumer {
  kafka-clients = ${kafka-connection-settings}
}
```
5. Call `PublishEventsProjection.init` from `Main`:

Java

```
PublishEventsProjection.init(system);
```

Scala

```
PublishEventsProjection.init(system)
```

|  | In this scenario, the Projection over gRPC is not used anymore. You can remove it by deleting `PublishEventsGrpc`, removing the initialization code from `Main` and the associated parameter in `ShoppingCartServer`. |
| --- | --- |

## Consume the events

We need to update our `shopping-analytics-service` to consume the events from the Kafka topic instead.

The service will still receive the events in the Protobuf format defined in the `shopping_cart_events.proto` from the `shopping-cart-service` so we can keep it.

|  | Different services should not share code, but we can copy the Protobuf specification since that is the published interface of the service. |
| --- | --- |

To add the service, follow these steps:

1. Open the `shopping-analytics-service` in IntelliJ just as you did with [the shopping\-cart\-service](../microservices-tutorial/template.html#intellij).
2. Copy the `shopping_cart_events.proto` from the `shopping-cart-service` to the `shopping-analytics-service/src/main/protobuf` and generate code by compiling the project:

```
sbt compile
```

```
mvn compile
```
3. Modify the `ShoppingCartEventConsumer` object class in `shopping-analytics-service`. It should run an Akka Stream with a Kafka `Consumer.committableSource` from Alpakka Kafka.

Java

src/main/java/shopping/analytics/ShoppingCartEventConsumer.java:

```
package shopping.analytics;

import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.kafka.CommitterSettings;
import akka.kafka.ConsumerSettings;
import akka.kafka.Subscriptions;
import akka.kafka.javadsl.Committer;
import akka.kafka.javadsl.Consumer;
import akka.stream.RestartSettings;
import akka.stream.javadsl.RestartSource;
import com.google.protobuf.Any;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.ByteArrayDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.CheckedOut;
import shopping.cart.proto.ItemAdded;
import shopping.cart.proto.ItemQuantityAdjusted;
import shopping.cart.proto.ItemRemoved;

class ShoppingCartEventConsumer {
  private static final Logger log = LoggerFactory.getLogger(ShoppingCartEventConsumer.class);

  static void init(ActorSystem<?> system) {
    String topic =
        system
            .settings()
            .config()
            .getString("shopping-analytics-service.shopping-cart-kafka-topic");
    ConsumerSettings<String, byte[]> consumerSettings =
        ConsumerSettings.create(system, new StringDeserializer(), new ByteArrayDeserializer())
            .withGroupId("shopping-cart-analytics");
    CommitterSettings committerSettings = CommitterSettings.create(system);

    Duration minBackoff = Duration.ofSeconds(1);
    Duration maxBackoff = Duration.ofSeconds(30);
    double randomFactor = 0.1;

    RestartSource (1)
        .onFailuresWithBackoff(
            RestartSettings.create(minBackoff, maxBackoff, randomFactor),
            () -> {
              return Consumer.committableSource(
                      consumerSettings, Subscriptions.topics(topic)) (2)
                  .mapAsync(
                      1,
                      msg -> handleRecord(msg.record()).thenApply(done -> msg.committableOffset()))
                  .via(Committer.flow(committerSettings)); (3)
            })
        .run(system);
  }

  private static CompletionStage<Done> handleRecord(ConsumerRecord<String, byte[]> record)
      throws InvalidProtocolBufferException {
    byte[] bytes = record.value();
    Any x = Any.parseFrom(bytes); (4)
    String typeUrl = x.getTypeUrl();
    CodedInputStream inputBytes = x.getValue().newCodedInput();
    try {
      switch (typeUrl) {
        case "shopping-cart-service/shoppingcart.ItemAdded":
          {
            ItemAdded event = ItemAdded.parseFrom(inputBytes);
            log.info(
                "ItemAdded: {} {} to cart {}",
                event.getQuantity(),
                event.getItemId(),
                event.getCartId());
            break;
          }
        case "shopping-cart-service/shoppingcart.CheckedOut":
          {
            CheckedOut event = CheckedOut.parseFrom(inputBytes);
            log.info("CheckedOut: cart {} checked out", event.getCartId());
            break;
          }
        default:
          throw new IllegalArgumentException("unknown record type " + typeUrl);
      }
    } catch (Exception e) {
      log.error("Could not process event of type [{}]", typeUrl, e);
      // continue with next
    }
    return CompletableFuture.completedFuture(Done.getInstance());
  }
}
```

| **1** | `RestartSource` will restart the stream in case of failures. |
| --- | --- |
| **2** | Kafka Consumer stream. |
| **3** | Offset is committed to Kafka when records have been processed. |
| **4** | Protobuf `Any` for type information. |

Scala

src/main/scala/shopping/analytics/ShoppingCartEventConsumer.scala:

```
package shopping.analytics

import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.control.NonFatal
import akka.Done
import akka.actor.typed.ActorSystem
import akka.kafka.CommitterSettings
import akka.kafka.ConsumerSettings
import akka.kafka.Subscriptions
import akka.kafka.scaladsl.{ Committer, Consumer }
import akka.stream.RestartSettings
import akka.stream.scaladsl.RestartSource
import com.google.protobuf.any.{ Any => ScalaPBAny }
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.serialization.ByteArrayDeserializer
import org.apache.kafka.common.serialization.StringDeserializer
import org.slf4j.LoggerFactory
import shopping.cart.proto

object ShoppingCartEventConsumer {

  private val log =
    LoggerFactory.getLogger("shopping.analytics.ShoppingCartEventConsumer")

  def init(system: ActorSystem[_]): Unit = {
    implicit val sys: ActorSystem[_] = system
    implicit val ec: ExecutionContext =
      system.executionContext

    val topic = system.settings.config
      .getString("shopping-analytics-service.shopping-cart-kafka-topic")
    val consumerSettings =
      ConsumerSettings(
        system,
        new StringDeserializer,
        new ByteArrayDeserializer).withGroupId("shopping-cart-analytics")
    val committerSettings = CommitterSettings(system)

    RestartSource (1)
      .onFailuresWithBackoff(
        RestartSettings(
          minBackoff = 1.second,
          maxBackoff = 30.seconds,
          randomFactor = 0.1)) { () =>
        Consumer
          .committableSource(
            consumerSettings,
            Subscriptions.topics(topic)
          ) (2)
          .mapAsync(1) { msg =>
            handleRecord(msg.record).map(_ => msg.committableOffset)
          }
          .via(Committer.flow(committerSettings)) (3)
      }
      .run()
  }

  private def handleRecord(
      record: ConsumerRecord[String, Array[Byte]]): Future[Done] = {
    val bytes = record.value()
    val x = ScalaPBAny.parseFrom(bytes) (4)
    val typeUrl = x.typeUrl
    try {
      val inputBytes = x.value.newCodedInput()
      val event =
        typeUrl match {
          case "shopping-cart-service/shoppingcart.ItemAdded" =>
            proto.ItemAdded.parseFrom(inputBytes)
          case "shopping-cart-service/shoppingcart.CheckedOut" =>
            proto.CheckedOut.parseFrom(inputBytes)
          case _ =>
            throw new IllegalArgumentException(
              s"unknown record type [$typeUrl]")
        }

      event match {
        case proto.ItemAdded(cartId, itemId, quantity, _) =>
          log.info("ItemAdded: {} {} to cart {}", quantity, itemId, cartId)
        case proto.CheckedOut(cartId, _) =>
          log.info("CheckedOut: cart {} checked out", cartId)
      }

      Future.successful(Done)
    } catch {
      case NonFatal(e) =>
        log.error("Could not process event of type [{}]", typeUrl, e)
        // continue with next
        Future.successful(Done)
    }
  }

}
```

| **1** | `RestartSource` will restart the stream in case of failures. |
| --- | --- |
| **2** | Kafka Consumer stream. |
| **3** | Offset is committed to Kafka when records have been processed. |
| **4** | Protobuf `Any` for type information. |

|  | The deserialization is using the type information from the Protobuf `Any` to decide which type of event to deserialize. |
| --- | --- |

### Configuration

We need to add configuration to initialize the `Consumer` and define how to connect to the Kafka broker.

Add the following to a new `src/main/resources/kafka.conf` file in `shopping-analytics-service`:

```
shopping-analytics-service {
  shopping-cart-kafka-topic = "shopping-cart-events"
}

# common config for akka.kafka.producer.kafka-clients and akka.kafka.consumer.kafka-clients
kafka-connection-settings {
  # This and other connection settings may have to be changed depending on environment.
  bootstrap.servers = "localhost:9092"
}
akka.kafka.producer {
  kafka-clients = ${kafka-connection-settings}
}
akka.kafka.consumer {
  kafka-clients = ${kafka-connection-settings}
  kafka-clients {
    auto.offset.reset = "earliest"
  }
}
```

Include `kafka.conf` from `application.conf`.

And for local development add the following to `src/main/resources/local-shared.conf`, which is loaded when running locally:

```
shopping-analytics-service.kafka.bootstrap-servers = "localhost:9092"
```

### Main

Edit the `Main` class that is included from the template project. It should initialize the `ActorSystem` and the `ShoppingCartEventConsumer` like this:

Java

```
package shopping.analytics;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.management.cluster.bootstrap.ClusterBootstrap;
import akka.management.javadsl.AkkaManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "ShoppingAnalyticsService");
    try {
      init(system);
    } catch (Exception e) {
      logger.error("Terminating due to initialization failure.", e);
      system.terminate();
    }
  }

  public static void init(ActorSystem<Void> system) {
    AkkaManagement.get(system).start();
    ClusterBootstrap.get(system).start();

    ShoppingCartEventConsumer.init(system);
  }
}
```

Scala

```
package shopping.analytics

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.ActorSystem
import akka.management.cluster.bootstrap.ClusterBootstrap
import akka.management.scaladsl.AkkaManagement
import org.slf4j.LoggerFactory
import scala.util.control.NonFatal

object Main {

  val logger = LoggerFactory.getLogger("shopping.analytics.Main")

  def main(args: Array[String]): Unit = {
    val system =
      ActorSystem[Nothing](Behaviors.empty, "ShoppingAnalyticsService")
    try {
      init(system)
    } catch {
      case NonFatal(e) =>
        logger.error("Terminating due to initialization failure.", e)
        system.terminate()
    }
  }

  def init(system: ActorSystem[_]): Unit = {
    AkkaManagement(system).start()
    ClusterBootstrap(system).start()

    ShoppingCartEventConsumer.init(system)
  }

}
```

## Run locally

In addition to PostgreSQL we now also need Kafka. The `docker-compose` script starts PostgreSQL and Kafka:

1. Start PostgreSQL and Kafka, unless it’s already running, from the `shopping-cart-service`:

```
docker compose up -d
```
2. Run the `shopping-cart-service` with:

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

```
sbt -Dconfig.resource=local1.conf run
```
3. In another terminal, run the new `shopping-analytics-service` with:

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

```
sbt -Dconfig.resource=local1.conf run
```

### Exercise the service

Use `[grpcurl](https://github.com/fullstorydev/grpcurl)` to exercise the service:

1. Start another terminal, and use `grpcurl` to add 1 pencil to a cart:

```
grpcurl -d '{"cartId":"cart4", "itemId":"pencil", "quantity":1}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
2. Look at the log output in the terminal of the `shopping-analytics-service`. You should see the logging from the `AddItem`, showing that the new service consumed the event from Kafka:

```
ItemAdded: 1 pencil to cart cart4
```

### Stop the service

When finished, stop the `shopping-cart-service` and `shopping-analytics-service` with `ctrl-c`. Stop PostgreSQL and Kafka with:

```
docker compose stop
```

## Learn more

- [Internal and External Communication concepts](../concepts/internal-and-external-communication.html).
- [Akka Projection reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/).
- [Alpakka Kafka reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/alpakka-kafka/current/).

## Code Examples

### Example 1: Send to Kafka from a Projection

```java
<dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka_${scala.binary.version}</artifactId>
</dependency>
```

### Example 2: Send to Kafka from a Projection

```java
val AlpakkaKafkaVersion = "8.0.0"
libraryDependencies ++= Seq(
  // ...
  "com.typesafe.akka" %% "akka-stream-kafka" % AlpakkaKafkaVersion
```

### Example 3: Send to Kafka from a Projection

```java
package shopping.cart;

import akka.Done;
import akka.NotUsed;
import akka.actor.typed.ActorSystem;
import akka.kafka.ProducerMessage;
import akka.kafka.ProducerSettings;
import akka.kafka.javadsl.Producer;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.ProjectionContext;
import akka.stream.javadsl.FlowWithContext;
import com.google.protobuf.Any;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.ByteArraySerializer;
import org.apache.kafka.common.serialization.StringSerializer;

public final class PublishEventsProjectionFlow {

  public static FlowWithContext<
          EventEnvelope<ShoppingCart.Event>, ProjectionContext, Done, ProjectionContext, NotUsed>
      createProducerFlow(String topic, ActorSystem<?> system) {
    var producerSettings =
        ProducerSettings.create(system, new StringSerializer(), new ByteArraySerializer());

    (1)
    return FlowWithContext.<EventEnvelope<ShoppingCart.Event>, ProjectionContext>create()
        .map(
            envelope -> {
              ShoppingCart.Event event = envelope.event();

              // using the cartId as the key and `DefaultPartitioner` will select partition based on
              // the key so that events for same cart always ends up in same partition
              String key = event.cartId();
              var producerRecord = new ProducerRecord<>(topic, key, serialize(event)); (2)
              system.log().info("Publishing event [{}] to topic {}", envelope.event(), topic);
              return ProducerMessage.single(producerRecord);
            })
        .via(Producer.flowWithContext(producerSettings))
        .map(__ -> Done.getInstance());
  }

  private static byte[] serialize(ShoppingCart.Event event) {
    var pbEvent =
        switch (event) {
          case ShoppingCart.ItemAdded(String cartId, String itemId, int qtd) ->
              shopping.cart.proto.ItemAdded.newBuilder()
                  .setCartId(cartId)
                  .setItemId(itemId)
                  .setQuantity(qtd)
                  .build();
          case ShoppingCart.CheckedOut(String cartId, var __) ->
              shopping.cart.proto.CheckedOut.newBuilder().setCartId(cartId).build();
          case null ->
              throw new IllegalArgumentException("Unknown event type: " + event.getClass());
        };

    // pack in Any so that type information is included for deserialization
    return Any.pack(pbEvent).toByteArray(); (3)
  }
}
```

### Example 4: Send to Kafka from a Projection

```scala
package shopping.cart

import akka.Done
import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.kafka.ProducerMessage
import akka.kafka.ProducerSettings
import akka.kafka.scaladsl.Producer
import akka.persistence.query.typed.EventEnvelope
import akka.projection.ProjectionContext
import akka.stream.scaladsl.FlowWithContext
import com.google.protobuf.any.{ Any => ScalaPBAny }
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.serialization.ByteArraySerializer
import org.apache.kafka.common.serialization.StringSerializer
import org.slf4j.LoggerFactory

object PublishEventsProjectionFlow {
  private val log = LoggerFactory.getLogger(getClass)

  def createProducerFlow(
      topic: String,
      system: ActorSystem[_]): FlowWithContext[
    EventEnvelope[ShoppingCart.Event],
    ProjectionContext,
    Done,
    ProjectionContext,
    NotUsed] = {

    val producerSettings =
      ProducerSettings(system, new StringSerializer, new ByteArraySerializer)

    (1)
    FlowWithContext[EventEnvelope[ShoppingCart.Event], ProjectionContext]
      .map(envelope => {
        // using the cartId as the key and `DefaultPartitioner` will select partition based on the key
        // so that events for same cart always ends up in same partition
        val key = envelope.event.cartId
        val record =
          new ProducerRecord(topic, key, serialize(envelope.event)) (2)
        log.info("Publishing event [{}] to topic {}", envelope.event, topic)
        ProducerMessage.single(record)
      })
      .via(Producer.flowWithContext(producerSettings))
      .map(_ => Done)
  }

  private def serialize(event: ShoppingCart.Event): Array[Byte] = {
    val protoMessage = event match {
      case ShoppingCart.ItemAdded(cartId, itemId, quantity) =>
        proto.ItemAdded(cartId, itemId, quantity)
      case ShoppingCart.CheckedOut(cartId, _) =>
        proto.CheckedOut(cartId)
    }
    // pack in Any so that type information is included for deserialization
    ScalaPBAny.pack(protoMessage).toByteArray (3)
  }
}
```

### Example 5: Initialize the Projection

```java
package shopping.cart;

import static shopping.cart.PublishEventsProjectionFlow.createProducerFlow;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.AtLeastOnceFlowProjection;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import java.util.List;
import java.util.Optional;

public class PublishEventsProjection {

  private PublishEventsProjection() {}

  public static void init(ActorSystem<?> system) {

    String topic = system.settings().config().getString("shopping-cart-service.kafka.topic");

    ShardedDaemonProcess.get(system)
        .initWithContext( (1)
            ProjectionBehavior.Command.class,
            "PublishEventsProjection",
            4,
            daemonContext -> {
              List<Pair<Integer, Integer>> sliceRanges = (2)
                  EventSourcedProvider.sliceRanges(
                      system, R2dbcReadJournal.Identifier(), daemonContext.totalProcesses());
              Pair<Integer, Integer> sliceRange = sliceRanges.get(daemonContext.processNumber());
              return ProjectionBehavior.create(createProjection(system, sliceRange, topic));
            },
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static AtLeastOnceFlowProjection<Offset, EventEnvelope<ShoppingCart.Event>>
      createProjection(ActorSystem<?> system, Pair<Integer, Integer> sliceRange, String topic) {

    int minSlice = sliceRange.first();
    int maxSlice = sliceRange.second();

    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider = (3)
        EventSourcedProvider.eventsBySlices(
            system,
            R2dbcReadJournal.Identifier(), (4)
            "ShoppingCart",
            minSlice,
            maxSlice);

    String slice = "carts-" + minSlice + "-" + maxSlice;
    Optional<R2dbcProjectionSettings> settings = Optional.empty();
    return R2dbcProjection.atLeastOnceFlow( (5)
        ProjectionId.of("PublishEventsProjection", slice),
        settings,
        sourceProvider,
        createProducerFlow(topic, system), (6)
        system);
  }
}
```

### Example 6: Initialize the Projection

```scala
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.query.Offset
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.SourceProvider
import akka.projection.{ Projection, ProjectionBehavior, ProjectionId }

object PublishEventsProjection {

  def init(system: ActorSystem[_]): Unit = {

    val topic =
      system.settings.config.getString("shopping-cart-service.kafka.topic")

    def sourceProvider(sliceRange: Range)
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
      EventSourcedProvider (1)
        .eventsBySlices[ShoppingCart.Event](
          system,
          readJournalPluginId = R2dbcReadJournal.Identifier, (2)
          "ShoppingCart",
          sliceRange.min,
          sliceRange.max)

    def projection(
        sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
      val minSlice = sliceRange.min
      val maxSlice = sliceRange.max
      val projectionId =
        ProjectionId("PublishEventsProjection", s"carts-$minSlice-$maxSlice")

      R2dbcProjection.atLeastOnceFlow( (3)
        projectionId,
        settings = None,
        sourceProvider(sliceRange),
        handler =
          PublishEventsProjectionFlow.createProducerFlow(topic, system) (4)
      )(system)
    }

    ShardedDaemonProcess(system).initWithContext( (5)
      name = "PublishEventsProjection",
      initialNumberOfInstances = 4,
      behaviorFactory = { daemonContext =>
        val sliceRanges = (6)
          EventSourcedProvider.sliceRanges(
            system,
            R2dbcReadJournal.Identifier,
            daemonContext.totalProcesses)
        val sliceRange = sliceRanges(daemonContext.processNumber)
        ProjectionBehavior(projection(sliceRange))
      },
      ShardedDaemonProcessSettings(system),
      stopMessage = ProjectionBehavior.Stop)
  }
}
```

### Example 7: Initialize the Projection

```hocon
shopping-cart-service {
  kafka.topic = "shopping-cart-events"
}

# common config for akka.kafka.producer.kafka-clients and akka.kafka.consumer.kafka-clients
kafka-connection-settings {
  # This and other connection settings may have to be changed depending on environment.
  bootstrap.servers = "localhost:9092"
}
akka.kafka.producer {
  kafka-clients = ${kafka-connection-settings}
}
akka.kafka.consumer {
  kafka-clients = ${kafka-connection-settings}
}
```

### Example 8: Initialize the Projection

```hocon
# common config for akka.kafka.producer.kafka-clients and akka.kafka.consumer.kafka-clients
kafka-connection-settings {
  bootstrap.servers = "localhost:9092"
}
akka.kafka.producer {
  kafka-clients = ${kafka-connection-settings}
}
akka.kafka.consumer {
  kafka-clients = ${kafka-connection-settings}
}
```

### Example 9: Initialize the Projection

```java
PublishEventsProjection.init(system);
```

### Example 10: Initialize the Projection

```scala
PublishEventsProjection.init(system)
```

### Example 11: Consume the events

```shell
sbt compile
```

### Example 12: Consume the events

```shell
mvn compile
```

### Example 13: Consume the events

```java
package shopping.analytics;

import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.kafka.CommitterSettings;
import akka.kafka.ConsumerSettings;
import akka.kafka.Subscriptions;
import akka.kafka.javadsl.Committer;
import akka.kafka.javadsl.Consumer;
import akka.stream.RestartSettings;
import akka.stream.javadsl.RestartSource;
import com.google.protobuf.Any;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.ByteArrayDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.CheckedOut;
import shopping.cart.proto.ItemAdded;
import shopping.cart.proto.ItemQuantityAdjusted;
import shopping.cart.proto.ItemRemoved;

class ShoppingCartEventConsumer {
  private static final Logger log = LoggerFactory.getLogger(ShoppingCartEventConsumer.class);

  static void init(ActorSystem<?> system) {
    String topic =
        system
            .settings()
            .config()
            .getString("shopping-analytics-service.shopping-cart-kafka-topic");
    ConsumerSettings<String, byte[]> consumerSettings =
        ConsumerSettings.create(system, new StringDeserializer(), new ByteArrayDeserializer())
            .withGroupId("shopping-cart-analytics");
    CommitterSettings committerSettings = CommitterSettings.create(system);

    Duration minBackoff = Duration.ofSeconds(1);
    Duration maxBackoff = Duration.ofSeconds(30);
    double randomFactor = 0.1;

    RestartSource (1)
        .onFailuresWithBackoff(
            RestartSettings.create(minBackoff, maxBackoff, randomFactor),
            () -> {
              return Consumer.committableSource(
                      consumerSettings, Subscriptions.topics(topic)) (2)
                  .mapAsync(
                      1,
                      msg -> handleRecord(msg.record()).thenApply(done -> msg.committableOffset()))
                  .via(Committer.flow(committerSettings)); (3)
            })
        .run(system);
  }

  private static CompletionStage<Done> handleRecord(ConsumerRecord<String, byte[]> record)
      throws InvalidProtocolBufferException {
    byte[] bytes = record.value();
    Any x = Any.parseFrom(bytes); (4)
    String typeUrl = x.getTypeUrl();
    CodedInputStream inputBytes = x.getValue().newCodedInput();
    try {
      switch (typeUrl) {
        case "shopping-cart-service/shoppingcart.ItemAdded":
          {
            ItemAdded event = ItemAdded.parseFrom(inputBytes);
            log.info(
                "ItemAdded: {} {} to cart {}",
                event.getQuantity(),
                event.getItemId(),
                event.getCartId());
            break;
          }
        case "shopping-cart-service/shoppingcart.CheckedOut":
          {
            CheckedOut event = CheckedOut.parseFrom(inputBytes);
            log.info("CheckedOut: cart {} checked out", event.getCartId());
            break;
          }
        default:
          throw new IllegalArgumentException("unknown record type " + typeUrl);
      }
    } catch (Exception e) {
      log.error("Could not process event of type [{}]", typeUrl, e);
      // continue with next
    }
    return CompletableFuture.completedFuture(Done.getInstance());
  }
}
```

### Example 14: Consume the events

```scala
package shopping.analytics

import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.control.NonFatal
import akka.Done
import akka.actor.typed.ActorSystem
import akka.kafka.CommitterSettings
import akka.kafka.ConsumerSettings
import akka.kafka.Subscriptions
import akka.kafka.scaladsl.{ Committer, Consumer }
import akka.stream.RestartSettings
import akka.stream.scaladsl.RestartSource
import com.google.protobuf.any.{ Any => ScalaPBAny }
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.serialization.ByteArrayDeserializer
import org.apache.kafka.common.serialization.StringDeserializer
import org.slf4j.LoggerFactory
import shopping.cart.proto

object ShoppingCartEventConsumer {

  private val log =
    LoggerFactory.getLogger("shopping.analytics.ShoppingCartEventConsumer")

  def init(system: ActorSystem[_]): Unit = {
    implicit val sys: ActorSystem[_] = system
    implicit val ec: ExecutionContext =
      system.executionContext

    val topic = system.settings.config
      .getString("shopping-analytics-service.shopping-cart-kafka-topic")
    val consumerSettings =
      ConsumerSettings(
        system,
        new StringDeserializer,
        new ByteArrayDeserializer).withGroupId("shopping-cart-analytics")
    val committerSettings = CommitterSettings(system)

    RestartSource (1)
      .onFailuresWithBackoff(
        RestartSettings(
          minBackoff = 1.second,
          maxBackoff = 30.seconds,
          randomFactor = 0.1)) { () =>
        Consumer
          .committableSource(
            consumerSettings,
            Subscriptions.topics(topic)
          ) (2)
          .mapAsync(1) { msg =>
            handleRecord(msg.record).map(_ => msg.committableOffset)
          }
          .via(Committer.flow(committerSettings)) (3)
      }
      .run()
  }

  private def handleRecord(
      record: ConsumerRecord[String, Array[Byte]]): Future[Done] = {
    val bytes = record.value()
    val x = ScalaPBAny.parseFrom(bytes) (4)
    val typeUrl = x.typeUrl
    try {
      val inputBytes = x.value.newCodedInput()
      val event =
        typeUrl match {
          case "shopping-cart-service/shoppingcart.ItemAdded" =>
            proto.ItemAdded.parseFrom(inputBytes)
          case "shopping-cart-service/shoppingcart.CheckedOut" =>
            proto.CheckedOut.parseFrom(inputBytes)
          case _ =>
            throw new IllegalArgumentException(
              s"unknown record type [$typeUrl]")
        }

      event match {
        case proto.ItemAdded(cartId, itemId, quantity, _) =>
          log.info("ItemAdded: {} {} to cart {}", quantity, itemId, cartId)
        case proto.CheckedOut(cartId, _) =>
          log.info("CheckedOut: cart {} checked out", cartId)
      }

      Future.successful(Done)
    } catch {
      case NonFatal(e) =>
        log.error("Could not process event of type [{}]", typeUrl, e)
        // continue with next
        Future.successful(Done)
    }
  }

}
```

### Example 15: Configuration

```hocon
shopping-analytics-service {
  shopping-cart-kafka-topic = "shopping-cart-events"
}

# common config for akka.kafka.producer.kafka-clients and akka.kafka.consumer.kafka-clients
kafka-connection-settings {
  # This and other connection settings may have to be changed depending on environment.
  bootstrap.servers = "localhost:9092"
}
akka.kafka.producer {
  kafka-clients = ${kafka-connection-settings}
}
akka.kafka.consumer {
  kafka-clients = ${kafka-connection-settings}
  kafka-clients {
    auto.offset.reset = "earliest"
  }
}
```

### Example 16: Configuration

```hocon
shopping-analytics-service.kafka.bootstrap-servers = "localhost:9092"
```

### Example 17: Main

```java
package shopping.analytics;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.management.cluster.bootstrap.ClusterBootstrap;
import akka.management.javadsl.AkkaManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "ShoppingAnalyticsService");
    try {
      init(system);
    } catch (Exception e) {
      logger.error("Terminating due to initialization failure.", e);
      system.terminate();
    }
  }

  public static void init(ActorSystem<Void> system) {
    AkkaManagement.get(system).start();
    ClusterBootstrap.get(system).start();

    ShoppingCartEventConsumer.init(system);
  }
}
```

### Example 18: Main

```scala
package shopping.analytics

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.ActorSystem
import akka.management.cluster.bootstrap.ClusterBootstrap
import akka.management.scaladsl.AkkaManagement
import org.slf4j.LoggerFactory
import scala.util.control.NonFatal

object Main {

  val logger = LoggerFactory.getLogger("shopping.analytics.Main")

  def main(args: Array[String]): Unit = {
    val system =
      ActorSystem[Nothing](Behaviors.empty, "ShoppingAnalyticsService")
    try {
      init(system)
    } catch {
      case NonFatal(e) =>
        logger.error("Terminating due to initialization failure.", e)
        system.terminate()
    }
  }

  def init(system: ActorSystem[_]): Unit = {
    AkkaManagement(system).start()
    ClusterBootstrap(system).start()

    ShoppingCartEventConsumer.init(system)
  }

}
```

### Example 19: Run locally

```shell
docker compose up -d
```

### Example 20: Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 21: Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 22: Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 23: Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 24: Exercise the service

```shell
grpcurl -d '{"cartId":"cart4", "itemId":"pencil", "quantity":1}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 25: Stop the service

```shell
docker compose stop
```

## Related Pages (Internal Links)

- https://doc.akka.io/guide/concepts/internal-and-external-communication.html
- https://doc.akka.io/guide/how-to/_attachments/shopping-cart-kafka-java.zip
- https://doc.akka.io/guide/how-to/_attachments/shopping-cart-kafka-scala.zip
- https://doc.akka.io/guide/microservices-tutorial/index.html
- https://doc.akka.io/guide/microservices-tutorial/template.html
- https://doc.akka.io/libraries/akka-projection/current/
- https://doc.akka.io/libraries/alpakka-kafka/current/

---
*Source: [https://doc.akka.io/guide/how-to/projection-kafka.html](https://doc.akka.io/guide/how-to/projection-kafka.html)*
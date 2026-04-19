---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/projection-over-grpc.html
title: 'Section 7: Service-to-Service Eventing :: Akka Guide'
---

# Section 7: Service-to-Service Eventing :: Akka Guide

## Content

# Section 7: Service\-to\-Service Eventing

Language

When looking to fully replicate events across different services, we can do service\-to\-service eventing using a Projection over gRPC. This is the simplest solution since it avoids relying on an external broker like Kafka, while providing for lower latency (see [Benchmarking Kafka vs Akka Brokerless Pub/Sub](https://akka.io/blog/benchmarking-kafka-vs-akka-brokerless-pub-sub)).

![Example Service-to-Service Eventing](_images/example-s2s.drawio.svg)

In this part, we will make the shopping events available to the Analytics service. To accomplish this, we will add another Projection from the events of the `ShoppingCart` entity. The new Projection over gRPC makes the events available to be consumed by an external service. On this page, you will:

- create a public representation for the internal events
- configure a service that makes the events accessible over gRPC
- add an Analytics service and configure it to consume the events from the referred projection

A different option would be to use Kafka as a broker between the services in this step. See [How to Use Kafka between two services](../how-to/projection-kafka.html) for more information.

## Source downloads

If you prefer to simply view and run the example, download a zip file containing the completed code:

Java

- [Source](_attachments/4-shopping-cart-projection-java.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/5-shopping-cart-projection-s2s-java.zip) with the steps on this page completed.

Scala

- [Source](_attachments/4-shopping-cart-projection-scala.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/5-shopping-cart-projection-s2s-scala.zip) with the steps on this page completed.

## 1\. External representation of the events

For external APIs of a service, be it events consumed by other services or messages to a Kafka topic, it is good to have a well\-defined data format decoupled from the internal representation. Therefore, we define event data formats in Protobuf rather than using the internal event representation. This also makes it easier to evolve the representation of events over time without breaking downstream consumers.

To define the external representation:

1. Add a new `shopping_cart_events.proto` with the specification of the events:

src/main/protobuf/ShoppingCartEvents.proto:

```
syntax = "proto3";

package shoppingcart;

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

// Events published to the outside world

message ItemAdded {
  string cart_id = 1;
  string item_id = 2;
  int32 quantity = 3;
}

message ItemQuantityAdjusted {
  string cart_id = 1;
  string item_id = 2;
  int32 quantity = 3;
}

message ItemRemoved {
  string cart_id = 1;
  string item_id = 2;
}

message CheckedOut {
  string cart_id = 1;
}
```
2. Generate code by compiling the project:

```
sbt compile
```

```
mvn compile
```

## 2\. Transform events for public consumption

Add a `PublishEventsGrpc` object class that transforms internal events into its publicly consumable counterpart:

Java

src/main/java/shopping/cart/PublishEventsGrpc.java:

```
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import akka.persistence.query.typed.EventEnvelope;
import akka.persistence.typed.PersistenceId;
import akka.projection.grpc.producer.EventProducerSettings;
import akka.projection.grpc.producer.javadsl.EventProducer;
import akka.projection.grpc.producer.javadsl.EventProducerSource;
import akka.projection.grpc.producer.javadsl.Transformation;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public class PublishEventsGrpc {

  public static Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService(
      ActorSystem<?> system) {
    Transformation transformation =
        Transformation.empty() (1)
            .registerEnvelopeMapper(
                ShoppingCart.ItemAdded.class, envelope -> Optional.of(transformItemAdded(envelope)))
            .registerEnvelopeMapper(
                ShoppingCart.CheckedOut.class,
                envelope -> Optional.of(transformCheckedOut(envelope)))
        ;

    EventProducerSource eventProducerSource =
        new EventProducerSource(
            "ShoppingCart", (2)
            "cart", (3)
            transformation, (4)
            EventProducerSettings.create(system));

    return EventProducer.grpcServiceHandler(system, eventProducerSource);
  }

  private static shopping.cart.proto.ItemAdded transformItemAdded(
      EventEnvelope<ShoppingCart.ItemAdded> envelope) {
    var itemUpdated = envelope.event();
    return shopping.cart.proto.ItemAdded.newBuilder()
        .setCartId(PersistenceId.extractEntityId(envelope.persistenceId()))
        .setItemId(itemUpdated.itemId())
        .setQuantity(itemUpdated.quantity())
        .build();
  }

  private static shopping.cart.proto.CheckedOut transformCheckedOut(
      EventEnvelope<ShoppingCart.CheckedOut> envelope) {
    return shopping.cart.proto.CheckedOut.newBuilder()
        .setCartId(PersistenceId.extractEntityId(envelope.persistenceId()))
        .build();
  }

}
```

| **1** | Register mapping between an internal event and a function to convert such event into its external representation. |
| --- | --- |
| **2** | The internal `entityType` for the entity which events we want to subscribe and transform. |
| **3** | A public, logical, stream id that consumers will use to consume this source. |
| **4** | The set of converters (i.e. a `Transformation`) to be used. These converters will turn the `ShoppingCart.Event` classes into its Protobuf representation. |

Scala

src/main/scala/shopping/cart/PublishEventsGrpc.scala:

```
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.http.scaladsl.model.{ HttpRequest, HttpResponse }
import akka.persistence.query.typed
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.typed.PersistenceId
import akka.projection.grpc.producer.EventProducerSettings
import akka.projection.grpc.producer.scaladsl.EventProducer
import akka.projection.grpc.producer.scaladsl.EventProducer.Transformation

import scala.concurrent.Future

object PublishEventsGrpc {

  def eventProducerService(system: ActorSystem[_])
      : PartialFunction[HttpRequest, Future[HttpResponse]] = {
    val transformation = Transformation.identity (1)
      .registerEnvelopeMapper[ShoppingCart.ItemAdded, proto.ItemAdded](
        envelope => Some(transformItemUpdated(envelope)))
      .registerEnvelopeMapper[ShoppingCart.CheckedOut, proto.CheckedOut](
        envelope => Some(transformCheckedOut(envelope)))

    val eventProducerSource = EventProducer.EventProducerSource(
      "ShoppingCart", (2)
      "cart", (3)
      transformation, (4)
      EventProducerSettings(system))

    EventProducer.grpcServiceHandler(eventProducerSource)(system)
  }
  private def transformItemUpdated(
      envelope: EventEnvelope[ShoppingCart.ItemAdded]): proto.ItemAdded = {
    val event = envelope.event
    proto.ItemAdded(
      cartId = PersistenceId.extractEntityId(envelope.persistenceId),
      itemId = event.itemId,
      quantity = event.quantity)
  }

  private def transformCheckedOut(
      envelope: typed.EventEnvelope[ShoppingCart.CheckedOut])
      : proto.CheckedOut =
    proto.CheckedOut(PersistenceId.extractEntityId(envelope.persistenceId))

}
```

| **1** | Register mapping between an internal event and a function to convert such event into its external representation. |
| --- | --- |
| **2** | The internal `entityType` for the entity which events we want to subscribe and transform. |
| **3** | A public, logical, stream id that consumers will use to consume this source. |
| **4** | The set of converters (i.e. a `Transformation`) to be used. These converters will turn the `ShoppingCart.Event` classes into its Protobuf representation. |

## 3\. Expose the stream

For the stream of events to be available to external consumers, we need to expose it over gRPC. To do this, we can add the following code in `Main` inside `init` method:

Java

src/main/java/shopping/cart/Main.java:

```
import akka.http.javadsl.model.HttpRequest; (1)
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function; (2)
    // ...
    Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService =
        PublishEventsGrpc.eventProducerService(system);
```

| **1** | Make sure to import from the `javadsl` package for `HttpRequest` and `HttpResponse`. |
| --- | --- |
| **2** | Note that this `Function` is not the regular Java one, but the `akka.japi.function.Function`, which allows for throwing checked exceptions. |

Scala

src/main/scala/shopping/cart/Main.scala:

```
val eventProducerService = PublishEventsGrpc.eventProducerService(system)
```

Then, we can add it as a parameter to `ShoppingCartServer.start` such that we can add it to the list of service handlers:

Java

src/main/java/shopping/cart/ShoppingCartServer.java:

```
static void start(
    String host,
    int port,
    ActorSystem<?> system,
    ShoppingCartService grpcService,
    Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService) {
  @SuppressWarnings("unchecked")
  Function<HttpRequest, CompletionStage<HttpResponse>> service =
      ServiceHandler.concatOrNotFound(
          eventProducerService,
          ShoppingCartServiceHandlerFactory.create(grpcService, system),
          // ...
```

Scala

src/main/scala/shopping/cart/ShoppingCartServer.scala:

```
def start(
    interface: String,
    port: Int,
    system: ActorSystem[_],
    grpcService: proto.ShoppingCartService,
    eventProducerService: PartialFunction[HttpRequest, Future[HttpResponse]])
    : Unit = {
  implicit val sys: ActorSystem[_] = system
  implicit val ec: ExecutionContext =
    system.executionContext

  val service: HttpRequest => Future[HttpResponse] =
    ServiceHandler.concatOrNotFound(
      eventProducerService,
      proto.ShoppingCartServiceHandler.partial(grpcService),
      // ...
```

## 4\. Consume the events

Let’s add another service that consumes the events from this stream. The [template download](template.html#seed-template) (or other source downloads) includes a directory named `shopping-analytics-service`. This service will receive the events in the Protobuf format defined in the `shopping_cart_events.proto` from the `shopping-cart-service` so we can copy the `.proto` file we created earlier.

|  | Different services should not share code, but we can copy the Protobuf specification since that is the published interface of the service. |
| --- | --- |

To add the service, follow these steps:

1. Open the `shopping-analytics-service` in IntelliJ just as you did with [the shopping\-cart\-service](template.html#intellij).
2. Copy the `shopping_cart_events.proto` from the `shopping-cart-service` to the `shopping-analytics-service/src/main/protobuf` and generate code by compiling the project:

```
sbt compile
```

```
mvn compile
```
3. Create a `ShoppingCartEventConsumer` object class in `shopping-analytics-service`. It will use an Akka Projection to consume the events from the `shopping-cart-service`, log them and count how many were received. Start by adding the following:

Java

src/main/java/shopping/analytics/ShoppingCartEventConsumer.java:

```
package shopping.analytics;

import static akka.Done.done;

import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.Persistence;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.grpc.consumer.javadsl.GrpcReadJournal;
import akka.projection.javadsl.Handler;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.*;

class ShoppingCartEventConsumer {
  private static final Logger log = LoggerFactory.getLogger(ShoppingCartEventConsumer.class);

  public static void init(ActorSystem<?> system) {
    int numberOfProjectionInstances = 4; (1)
    String projectionName = "cart-events";
    List<Pair<Integer, Integer>> sliceRanges =
        Persistence.get(system).getSliceRanges(numberOfProjectionInstances); (2)

    GrpcReadJournal eventsBySlicesQuery =
        GrpcReadJournal.create(system, List.of(ShoppingCartEvents.getDescriptor()));

    ShardedDaemonProcess.get(system)
        .init(
            ProjectionBehavior.Command.class,
            projectionName,
            numberOfProjectionInstances,
            idx -> {
              Pair<Integer, Integer> sliceRange = sliceRanges.get(idx);
              String projectionKey =
                  eventsBySlicesQuery.streamId()
                      + "-"
                      + sliceRange.first()
                      + "-"
                      + sliceRange.second(); (3)
              ProjectionId projectionId = ProjectionId.of(projectionName, projectionKey);

              SourceProvider<Offset, EventEnvelope<Object>> sourceProvider =
                  EventSourcedProvider.eventsBySlices(
                      system,
                      eventsBySlicesQuery,
                      eventsBySlicesQuery.streamId(),
                      sliceRange.first(),
                      sliceRange.second());

              return ProjectionBehavior.create(
                  R2dbcProjection.atLeastOnceAsync( (4)
                      projectionId,
                      Optional.empty(),
                      sourceProvider,
                      () -> new EventHandler(projectionId), (5)
                      system));
            },
            ProjectionBehavior.stopMessage());
  }
}
```

| **1** | Number of projection instances we want to have running and consuming the stream. |
| --- | --- |
| **2** | Slice ranges are calculated based on the number of instances. |
| **3** | The projection key uses not only the slices range but also the `streamId`. |
| **4** | `atLeastOnceAsync` as the delivery guarantee means events are redelivered if the consumer any error happens when processing. |
| **5** | Declare the event handler responsible for handling each event and acknowledge processing. |

Scala

src/main/scala/shopping/analytics/ShoppingCartEventConsumer.scala:

```
package shopping.analytics

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.Persistence
import akka.persistence.query.typed.EventEnvelope
import akka.projection.{ ProjectionBehavior, ProjectionId }
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory
import shopping.cart.proto._

import scala.concurrent.Future

object ShoppingCartEventConsumer {

  private val log =
    LoggerFactory.getLogger("shopping.analytics.ShoppingCartEventConsumer")
  def init(system: ActorSystem[_]): Unit = {
    implicit val sys: ActorSystem[_] = system
    val numberOfProjectionInstances = 4 (1)
    val projectionName: String = "cart-events"
    val sliceRanges =
      Persistence(system).sliceRanges(numberOfProjectionInstances) (2)

    val eventsBySlicesQuery =
      GrpcReadJournal(List(ShoppingCartEventsProto.javaDescriptor))

    ShardedDaemonProcess(system).init(
      projectionName,
      numberOfProjectionInstances,
      { idx =>
        val sliceRange = sliceRanges(idx)
        val projectionKey =
          s"${eventsBySlicesQuery.streamId}-${sliceRange.min}-${sliceRange.max}" (3)
        val projectionId = ProjectionId.of(projectionName, projectionKey)

        val sourceProvider = EventSourcedProvider.eventsBySlices[AnyRef](
          system,
          eventsBySlicesQuery,
          eventsBySlicesQuery.streamId,
          sliceRange.min,
          sliceRange.max)

        ProjectionBehavior(
          R2dbcProjection.atLeastOnceAsync( (4)
            projectionId,
            None,
            sourceProvider,
            () =>
              new EventHandler( (5)
                projectionId)))
      })
  }

}
```

| **1** | Number of projection instances we want to have running and consuming the stream. |
| --- | --- |
| **2** | Slice ranges are calculated based on the number of instances. |
| **3** | The projection key uses not only the slices range but also the `streamId`. |
| **4** | `atLeastOnceAsync` as the delivery guarantee means events are redelivered if the consumer any error happens when processing. |
| **5** | Declare the event handler responsible for handling each event and acknowledge processing. |

Complete the consumer by adding the event handler inside `ShoppingCartEventConsumer`:

Java

src/main/java/shopping/analytics/ShoppingCartEventConsumer.java:

```
static class EventHandler extends Handler<EventEnvelope<Object>> {
  private final ProjectionId projectionId;

  private long totalCount = 0;

  EventHandler(ProjectionId projectionId) {
    this.projectionId = projectionId;
  }

  @Override
  public CompletionStage<Done> start() {
    log.info("Started Projection [{}].", projectionId.id());
    return super.start();
  }

  @Override
  public CompletionStage<Done> stop() {
    log.info("Stopped Projection [{}]. Consumed [{}] events.", projectionId.id(), totalCount);
    return super.stop();
  }

  @Override
  public CompletionStage<Done> process(EventEnvelope<Object> envelope) {
    Object event = envelope.getEvent();
    totalCount++;

    switch (event) {
      case ItemAdded itemAdded:
        log.info(
            "Projection [{}] consumed ItemAdded for cart {}, added {} {}. Total [{}] events.",
            projectionId.id(),
            itemAdded.getCartId(),
            itemAdded.getQuantity(),
            itemAdded.getItemId(),
            totalCount);
        break;
      case CheckedOut checkedOut:
        log.info(
            "Projection [{}] consumed CheckedOut for cart {}. Total [{}] events.",
            projectionId.id(),
            checkedOut.getCartId(),
            totalCount);
        break;
      default:
        throw new IllegalArgumentException("Unknown event " + event);
    }
    return CompletableFuture.completedFuture(done());
  }
}
```

Scala

src/main/scala/shopping/analytics/ShoppingCartEventConsumer.scala:

```
private class EventHandler(projectionId: ProjectionId)
    extends Handler[EventEnvelope[AnyRef]] {

  private var totalCount = 0

  override def start(): Future[Done] = {
    log.info("Started Projection [{}].", projectionId.id)
    super.start()
  }

  override def stop(): Future[Done] = {
    log.info("Stopped Projection [{}]", projectionId.id)
    super.stop()
  }

  override def process(envelope: EventEnvelope[AnyRef]): Future[Done] = {
    val event = envelope.event
    totalCount += 1

    event match {
      case itemAdded: ItemAdded =>
        log.info(
          "Projection [{}] consumed ItemAdded for cart {}, added {} {}. Total [{}] events.",
          projectionId.id,
          itemAdded.cartId,
          itemAdded.quantity,
          itemAdded.itemId,
          totalCount)
      case checkedOut: CheckedOut =>
        log.info(
          "Projection [{}] consumed CheckedOut for cart {}. Total [{}] events.",
          projectionId.id,
          checkedOut.cartId,
          totalCount)
      case unknown =>
        throw new IllegalArgumentException(s"Unknown event $unknown")
    }
    Future.successful(Done)
  }
}
```

|  | Only 2 types of events are being handled above. For any other event, an exception is thrown causing the delivery of such event to be repeated until successful handling. |
| --- | --- |

### 4\.1\. Configuration

We need to add configuration to initialize the `Consumer` and define how to connect to the `shopping-cart-service` and the stream to consume.

Add the following to a new `src/main/resources/grpc.conf` file in `shopping-analytics-service`:

```
akka.http.server.enable-http2 = on

akka.projection.grpc.consumer {
  client {
    host = "127.0.0.1"
    host = ${?SHOPPING_CART_SERVICE_GRPC_HOST}
    port = 8101
    port = ${?SHOPPING_CART_SERVICE_GRPC_PORT}
    use-tls = false
  }
  stream-id = "cart"
}
```

Include `grpc.conf` from `application.conf`.

### 4\.2\. Main

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
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "shopping-analytics-service");
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

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
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

## 5\. Run locally

1. Start PostgreSQL, unless it’s already running, from the `shopping-cart-service`:

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

### 5\.1\. Exercise the service

Use `[grpcurl](https://github.com/fullstorydev/grpcurl)` to exercise the service:

1. Start another terminal, and use `grpcurl` to add 1 pencil to a cart:

```
grpcurl -d '{"cartId":"cart4", "itemId":"pencil", "quantity":1}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
2. Look at the log output in the terminal of the `shopping-analytics-service`. You should see the logging from the `AddItem`, showing that the new service consumed the event:

```
ItemAdded: 1 pencil to cart cart4
```

### 5\.2\. Stop the service

When finished, stop the `shopping-cart-service` and `shopping-analytics-service` with `ctrl-c`. Stop PostgreSQL with:

```
docker compose stop
```

## Learn more

- [Internal and External Communication concepts](../concepts/internal-and-external-communication.html).
- [Akka Projection gRPC reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/grpc.html).

## Code Examples

### Example 1: 1. External representation of the events

```protobuf
syntax = "proto3";

package shoppingcart;

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

// Events published to the outside world

message ItemAdded {
  string cart_id = 1;
  string item_id = 2;
  int32 quantity = 3;
}

message ItemQuantityAdjusted {
  string cart_id = 1;
  string item_id = 2;
  int32 quantity = 3;
}

message ItemRemoved {
  string cart_id = 1;
  string item_id = 2;
}

message CheckedOut {
  string cart_id = 1;
}
```

### Example 2: 1. External representation of the events

```shell
sbt compile
```

### Example 3: 1. External representation of the events

```shell
mvn compile
```

### Example 4: 2. Transform events for public consumption

```java
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import akka.persistence.query.typed.EventEnvelope;
import akka.persistence.typed.PersistenceId;
import akka.projection.grpc.producer.EventProducerSettings;
import akka.projection.grpc.producer.javadsl.EventProducer;
import akka.projection.grpc.producer.javadsl.EventProducerSource;
import akka.projection.grpc.producer.javadsl.Transformation;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public class PublishEventsGrpc {

  public static Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService(
      ActorSystem<?> system) {
    Transformation transformation =
        Transformation.empty() (1)
            .registerEnvelopeMapper(
                ShoppingCart.ItemAdded.class, envelope -> Optional.of(transformItemAdded(envelope)))
            .registerEnvelopeMapper(
                ShoppingCart.CheckedOut.class,
                envelope -> Optional.of(transformCheckedOut(envelope)))
        ;

    EventProducerSource eventProducerSource =
        new EventProducerSource(
            "ShoppingCart", (2)
            "cart", (3)
            transformation, (4)
            EventProducerSettings.create(system));

    return EventProducer.grpcServiceHandler(system, eventProducerSource);
  }

  private static shopping.cart.proto.ItemAdded transformItemAdded(
      EventEnvelope<ShoppingCart.ItemAdded> envelope) {
    var itemUpdated = envelope.event();
    return shopping.cart.proto.ItemAdded.newBuilder()
        .setCartId(PersistenceId.extractEntityId(envelope.persistenceId()))
        .setItemId(itemUpdated.itemId())
        .setQuantity(itemUpdated.quantity())
        .build();
  }

  private static shopping.cart.proto.CheckedOut transformCheckedOut(
      EventEnvelope<ShoppingCart.CheckedOut> envelope) {
    return shopping.cart.proto.CheckedOut.newBuilder()
        .setCartId(PersistenceId.extractEntityId(envelope.persistenceId()))
        .build();
  }

}
```

### Example 5: 2. Transform events for public consumption

```scala
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.http.scaladsl.model.{ HttpRequest, HttpResponse }
import akka.persistence.query.typed
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.typed.PersistenceId
import akka.projection.grpc.producer.EventProducerSettings
import akka.projection.grpc.producer.scaladsl.EventProducer
import akka.projection.grpc.producer.scaladsl.EventProducer.Transformation

import scala.concurrent.Future

object PublishEventsGrpc {

  def eventProducerService(system: ActorSystem[_])
      : PartialFunction[HttpRequest, Future[HttpResponse]] = {
    val transformation = Transformation.identity (1)
      .registerEnvelopeMapper[ShoppingCart.ItemAdded, proto.ItemAdded](
        envelope => Some(transformItemUpdated(envelope)))
      .registerEnvelopeMapper[ShoppingCart.CheckedOut, proto.CheckedOut](
        envelope => Some(transformCheckedOut(envelope)))

    val eventProducerSource = EventProducer.EventProducerSource(
      "ShoppingCart", (2)
      "cart", (3)
      transformation, (4)
      EventProducerSettings(system))

    EventProducer.grpcServiceHandler(eventProducerSource)(system)
  }
  private def transformItemUpdated(
      envelope: EventEnvelope[ShoppingCart.ItemAdded]): proto.ItemAdded = {
    val event = envelope.event
    proto.ItemAdded(
      cartId = PersistenceId.extractEntityId(envelope.persistenceId),
      itemId = event.itemId,
      quantity = event.quantity)
  }

  private def transformCheckedOut(
      envelope: typed.EventEnvelope[ShoppingCart.CheckedOut])
      : proto.CheckedOut =
    proto.CheckedOut(PersistenceId.extractEntityId(envelope.persistenceId))

}
```

### Example 6: 3. Expose the stream

```java
import akka.http.javadsl.model.HttpRequest; (1)
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function; (2)
    // ...
    Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService =
        PublishEventsGrpc.eventProducerService(system);
```

### Example 7: 3. Expose the stream

```scala
val eventProducerService = PublishEventsGrpc.eventProducerService(system)
```

### Example 8: 3. Expose the stream

```java
static void start(
    String host,
    int port,
    ActorSystem<?> system,
    ShoppingCartService grpcService,
    Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService) {
  @SuppressWarnings("unchecked")
  Function<HttpRequest, CompletionStage<HttpResponse>> service =
      ServiceHandler.concatOrNotFound(
          eventProducerService,
          ShoppingCartServiceHandlerFactory.create(grpcService, system),
          // ...
```

### Example 9: 3. Expose the stream

```scala
def start(
    interface: String,
    port: Int,
    system: ActorSystem[_],
    grpcService: proto.ShoppingCartService,
    eventProducerService: PartialFunction[HttpRequest, Future[HttpResponse]])
    : Unit = {
  implicit val sys: ActorSystem[_] = system
  implicit val ec: ExecutionContext =
    system.executionContext

  val service: HttpRequest => Future[HttpResponse] =
    ServiceHandler.concatOrNotFound(
      eventProducerService,
      proto.ShoppingCartServiceHandler.partial(grpcService),
      // ...
```

### Example 10: 4. Consume the events

```shell
sbt compile
```

### Example 11: 4. Consume the events

```shell
mvn compile
```

### Example 12: 4. Consume the events

```java
package shopping.analytics;

import static akka.Done.done;

import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.Persistence;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.grpc.consumer.javadsl.GrpcReadJournal;
import akka.projection.javadsl.Handler;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.*;

class ShoppingCartEventConsumer {
  private static final Logger log = LoggerFactory.getLogger(ShoppingCartEventConsumer.class);

  public static void init(ActorSystem<?> system) {
    int numberOfProjectionInstances = 4; (1)
    String projectionName = "cart-events";
    List<Pair<Integer, Integer>> sliceRanges =
        Persistence.get(system).getSliceRanges(numberOfProjectionInstances); (2)

    GrpcReadJournal eventsBySlicesQuery =
        GrpcReadJournal.create(system, List.of(ShoppingCartEvents.getDescriptor()));

    ShardedDaemonProcess.get(system)
        .init(
            ProjectionBehavior.Command.class,
            projectionName,
            numberOfProjectionInstances,
            idx -> {
              Pair<Integer, Integer> sliceRange = sliceRanges.get(idx);
              String projectionKey =
                  eventsBySlicesQuery.streamId()
                      + "-"
                      + sliceRange.first()
                      + "-"
                      + sliceRange.second(); (3)
              ProjectionId projectionId = ProjectionId.of(projectionName, projectionKey);

              SourceProvider<Offset, EventEnvelope<Object>> sourceProvider =
                  EventSourcedProvider.eventsBySlices(
                      system,
                      eventsBySlicesQuery,
                      eventsBySlicesQuery.streamId(),
                      sliceRange.first(),
                      sliceRange.second());

              return ProjectionBehavior.create(
                  R2dbcProjection.atLeastOnceAsync( (4)
                      projectionId,
                      Optional.empty(),
                      sourceProvider,
                      () -> new EventHandler(projectionId), (5)
                      system));
            },
            ProjectionBehavior.stopMessage());
  }
}
```

### Example 13: 4. Consume the events

```scala
package shopping.analytics

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.Persistence
import akka.persistence.query.typed.EventEnvelope
import akka.projection.{ ProjectionBehavior, ProjectionId }
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory
import shopping.cart.proto._

import scala.concurrent.Future

object ShoppingCartEventConsumer {

  private val log =
    LoggerFactory.getLogger("shopping.analytics.ShoppingCartEventConsumer")
  def init(system: ActorSystem[_]): Unit = {
    implicit val sys: ActorSystem[_] = system
    val numberOfProjectionInstances = 4 (1)
    val projectionName: String = "cart-events"
    val sliceRanges =
      Persistence(system).sliceRanges(numberOfProjectionInstances) (2)

    val eventsBySlicesQuery =
      GrpcReadJournal(List(ShoppingCartEventsProto.javaDescriptor))

    ShardedDaemonProcess(system).init(
      projectionName,
      numberOfProjectionInstances,
      { idx =>
        val sliceRange = sliceRanges(idx)
        val projectionKey =
          s"${eventsBySlicesQuery.streamId}-${sliceRange.min}-${sliceRange.max}" (3)
        val projectionId = ProjectionId.of(projectionName, projectionKey)

        val sourceProvider = EventSourcedProvider.eventsBySlices[AnyRef](
          system,
          eventsBySlicesQuery,
          eventsBySlicesQuery.streamId,
          sliceRange.min,
          sliceRange.max)

        ProjectionBehavior(
          R2dbcProjection.atLeastOnceAsync( (4)
            projectionId,
            None,
            sourceProvider,
            () =>
              new EventHandler( (5)
                projectionId)))
      })
  }

}
```

### Example 14: 4. Consume the events

```java
static class EventHandler extends Handler<EventEnvelope<Object>> {
  private final ProjectionId projectionId;

  private long totalCount = 0;


  EventHandler(ProjectionId projectionId) {
    this.projectionId = projectionId;
  }

  @Override
  public CompletionStage<Done> start() {
    log.info("Started Projection [{}].", projectionId.id());
    return super.start();
  }

  @Override
  public CompletionStage<Done> stop() {
    log.info("Stopped Projection [{}]. Consumed [{}] events.", projectionId.id(), totalCount);
    return super.stop();
  }

  @Override
  public CompletionStage<Done> process(EventEnvelope<Object> envelope) {
    Object event = envelope.getEvent();
    totalCount++;

    switch (event) {
      case ItemAdded itemAdded:
        log.info(
            "Projection [{}] consumed ItemAdded for cart {}, added {} {}. Total [{}] events.",
            projectionId.id(),
            itemAdded.getCartId(),
            itemAdded.getQuantity(),
            itemAdded.getItemId(),
            totalCount);
        break;
      case CheckedOut checkedOut:
        log.info(
            "Projection [{}] consumed CheckedOut for cart {}. Total [{}] events.",
            projectionId.id(),
            checkedOut.getCartId(),
            totalCount);
        break;
      default:
        throw new IllegalArgumentException("Unknown event " + event);
    }
    return CompletableFuture.completedFuture(done());
  }
}
```

### Example 15: 4. Consume the events

```scala
private class EventHandler(projectionId: ProjectionId)
    extends Handler[EventEnvelope[AnyRef]] {

  private var totalCount = 0


  override def start(): Future[Done] = {
    log.info("Started Projection [{}].", projectionId.id)
    super.start()
  }

  override def stop(): Future[Done] = {
    log.info("Stopped Projection [{}]", projectionId.id)
    super.stop()
  }

  override def process(envelope: EventEnvelope[AnyRef]): Future[Done] = {
    val event = envelope.event
    totalCount += 1

    event match {
      case itemAdded: ItemAdded =>
        log.info(
          "Projection [{}] consumed ItemAdded for cart {}, added {} {}. Total [{}] events.",
          projectionId.id,
          itemAdded.cartId,
          itemAdded.quantity,
          itemAdded.itemId,
          totalCount)
      case checkedOut: CheckedOut =>
        log.info(
          "Projection [{}] consumed CheckedOut for cart {}. Total [{}] events.",
          projectionId.id,
          checkedOut.cartId,
          totalCount)
      case unknown =>
        throw new IllegalArgumentException(s"Unknown event $unknown")
    }
    Future.successful(Done)
  }
}
```

### Example 16: 4.1. Configuration

```hocon
akka.http.server.enable-http2 = on

akka.projection.grpc.consumer {
  client {
    host = "127.0.0.1"
    host = ${?SHOPPING_CART_SERVICE_GRPC_HOST}
    port = 8101
    port = ${?SHOPPING_CART_SERVICE_GRPC_PORT}
    use-tls = false
  }
  stream-id = "cart"
}
```

### Example 17: 4.2. Main

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
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "shopping-analytics-service");
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

### Example 18: 4.2. Main

```scala
package shopping.analytics

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
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

### Example 19: 5. Run locally

```shell
docker compose up -d
```

### Example 20: 5. Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 21: 5. Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 22: 5. Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 23: 5. Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 24: 5.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart4", "itemId":"pencil", "quantity":1}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 25: 5.2. Stop the service

```shell
docker compose stop
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-projection/current/grpc.html
- https://doc.akka.io/libraries/guide/concepts/internal-and-external-communication.html
- https://doc.akka.io/libraries/guide/how-to/projection-kafka.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/4-shopping-cart-projection-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/4-shopping-cart-projection-scala.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/5-shopping-cart-projection-s2s-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/5-shopping-cart-projection-s2s-scala.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/template.html

---
*Source: [https://doc.akka.io/libraries/guide/microservices-tutorial/projection-over-grpc.html](https://doc.akka.io/libraries/guide/microservices-tutorial/projection-over-grpc.html)*
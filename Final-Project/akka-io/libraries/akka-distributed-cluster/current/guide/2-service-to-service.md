---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/2-service-to-service.html
title: 'Part 2: Service to Service eventing • Akka Distributed Cluster'
---

# Part 2: Service to Service eventing • Akka Distributed Cluster

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 2: Service to Service eventing

[Akka Projection](https://doc.akka.io/libraries/akka-projection/1.6/) allows for creating read side views, or projections, that are eventually consistent representations of the events for an entity. Such views have historically been possible to define in the same service that owns the entity. For an example of this, see the [popularity projection in the Akka Microservice Guide](https://doc.akka.io/libraries/guide/microservices-tutorial/).

[Akka Projection gRPC](https://doc.akka.io/libraries/akka-projection/1.6/grpc.html) defines a gRPC service in the service where the entity lives and that makes the events available for other, separately deployed services, to consume events with an effectively once delivery guarantee, this without requiring a message broker in between services. Each of the services has its own lifecycle and is deployed separately, possibly in different data centers or cloud regions.

To implement Service to Service eventing, we will use two services, the shopping cart defined in the previous step and a downstream analytics service.

## gRPC transport for consuming events

![Diagram showing the internals of Akka Projection gRPC step for step](../images/service-to-service-overview.png)

1. An Entity stores events in its journal in service A.
2. Consumer in service B starts an Akka Projection which locally reads its offset for service A’s replication stream.
3. Service B establishes a replication stream from service A.
4. Events are read from the journal.
5. Event is emitted to the replication stream.
6. Event is handled.
7. Offset is stored.
8. Producer continues to read new events from the journal and emit to the stream. As an optimization, events can also be published directly from the entity to the producer.

## Publish the events of the shopping cart

The cart itself does not need any changes for publishing persisted events, but we need to configure and bind a producer service for it to allow other services to consume the events.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/PublishEvents.scala#L4-L61 "Go to snippet source")import akka.actor.typed.ActorSystem
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import akka.persistence.query.typed
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.typed.PersistenceId
import akka.projection.grpc.producer.EventProducerSettings
import akka.projection.grpc.producer.scaladsl.EventProducer
import akka.projection.grpc.producer.scaladsl.EventProducer.Transformation

import scala.concurrent.Future

object PublishEvents {

  def eventProducerService(system: ActorSystem[_])
      : PartialFunction[HttpRequest, Future[HttpResponse]] = {
    val transformation = Transformation.empty
      .registerAsyncEnvelopeMapper[ShoppingCart.ItemUpdated, proto.ItemQuantityAdjusted](envelope =>
        Future.successful(Some(transformItemUpdated(envelope))))
      .registerAsyncEnvelopeMapper[ShoppingCart.CheckedOut, proto.CheckedOut](envelope =>
        Future.successful(Some(transformCheckedOut(envelope))))

    val eventProducerSource = EventProducer
      .EventProducerSource(
        "ShoppingCart",
        "cart",
        transformation,
        EventProducerSettings(system))

    EventProducer.grpcServiceHandler(eventProducerSource)(system)
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/PublishEvents.java#L4-L71 "Go to snippet source")import akka.actor.typed.ActorSystem;
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
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class PublishEvents {

  public static Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService(ActorSystem<?> system) {
    Transformation transformation =
        Transformation.empty()
            .registerAsyncEnvelopeMapper(ShoppingCart.ItemUpdated.class, envelope -> CompletableFuture.completedFuture(Optional.of(transformItemQuantityAdjusted(envelope))))
            .registerAsyncEnvelopeMapper(ShoppingCart.CheckedOut.class, envelope -> CompletableFuture.completedFuture(Optional.of(transformCheckedOut(envelope))));

    EventProducerSource eventProducerSource = new EventProducerSource(
        "ShoppingCart",
        "cart",
        transformation,
        EventProducerSettings.create(system)
    );

    return EventProducer.grpcServiceHandler(system, eventProducerSource);
  }
}
```

Events can be transformed by application specific code on the producer side. The purpose is to be able to have a different public representation from the internal representation (stored in journal). The transformation functions are registered when creating the `EventProducer` service. Here is an example of one of those transformation functions accessing the projection envelope to include the shopping cart id in the public message type passed to consumers:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/PublishEvents.scala#L47-L54 "Go to snippet source")def transformItemUpdated(
    envelope: EventEnvelope[ShoppingCart.ItemUpdated]): proto.ItemQuantityAdjusted = {
  val event = envelope.event
  proto.ItemQuantityAdjusted(
    cartId = PersistenceId.extractEntityId(envelope.persistenceId),
    itemId = event.itemId,
    quantity = event.quantity)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/PublishEvents.java#L55-L62 "Go to snippet source")private static shopping.cart.proto.ItemQuantityAdjusted transformItemQuantityAdjusted(EventEnvelope<ShoppingCart.ItemUpdated> envelope) {
  var itemUpdated = envelope.event();
  return shopping.cart.proto.ItemQuantityAdjusted.newBuilder()
      .setCartId(PersistenceId.extractEntityId(envelope.persistenceId()))
      .setItemId(itemUpdated.itemId)
      .setQuantity(itemUpdated.quantity)
      .build();
}
```

To omit an event the transformation function can return `None``Optional.empty()`.

That `EventProducer` service is started in an Akka gRPC server like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCartServer.scala#L4-L98 "Go to snippet source")import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.Failure
import scala.util.Success

import akka.actor.typed.ActorSystem
import akka.grpc.scaladsl.ServerReflection
import akka.grpc.scaladsl.ServiceHandler
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse

object ShoppingCartServer {

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
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.partial(List(proto.ShoppingCartService)))

    val bound =
      Http()
        .newServerAt(interface, port)
        .bind(service)
        .map(_.addToCoordinatedShutdown(3.seconds))

    bound.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        system.log.info(
          "Shopping online at gRPC server {}:{}",
          address.getHostString,
          address.getPort)
      case Failure(ex) =>
        system.log.error("Failed to bind gRPC endpoint, terminating system", ex)
        system.terminate()
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCartServer.java#L4-L91 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.grpc.javadsl.ServerReflection;
import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.CompletionStage;
import shopping.cart.proto.ShoppingCartService;
import shopping.cart.proto.ShoppingCartServiceHandlerFactory;

public final class ShoppingCartServer {

  private ShoppingCartServer() {}

  static void start(String host, int port, ActorSystem<?> system, ShoppingCartService grpcService, Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService) {
    @SuppressWarnings("unchecked")
    Function<HttpRequest, CompletionStage<HttpResponse>> service =
        ServiceHandler.concatOrNotFound(
            eventProducerService,
            ShoppingCartServiceHandlerFactory.create(grpcService, system),
            // ServerReflection enabled to support grpcurl without import-path and proto parameters
            ServerReflection.create(
                Collections.singletonList(ShoppingCartService.description), system));

    CompletionStage<ServerBinding> bound =
        Http.get(system).newServerAt(host, port).bind(service::apply);

    bound.whenComplete(
        (binding, ex) -> {
          if (binding != null) {
            binding.addToCoordinatedShutdown(Duration.ofSeconds(3), system);
            InetSocketAddress address = binding.localAddress();
            system
                .log()
                .info(
                    "Shopping online at gRPC server {}:{}",
                    address.getHostString(),
                    address.getPort());
          } else {
            system.log().error("Failed to bind gRPC endpoint, terminating system", ex);
            system.terminate();
          }
        });
  }

}
```

## Consume events

The consumer is defined in a separate mavensbt project in the shopping analytics service.

The analytics service runs in a separate Akka cluster which is deployed and scaled separately from the shopping cart service. When running it will have its own separate database from the shopping cart service. It may run in the same region as the shopping cart, but it could also run in a completely different location.

On the consumer side the `Projection` is a [SourceProvider for eventsBySlices](https://doc.akka.io/libraries/akka-projection/1.6/eventsourced.html#sourceprovider-for-eventsbyslices) that is using `eventsBySlices` from the GrpcReadJournal. We use [ShardedDaemonProcess](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html) to distribute the instances of the Projection across the cluster.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-scala/src/main/scala/shopping/analytics/ShoppingCartEventConsumer.scala#L4-L148 "Go to snippet source")import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.Persistence
import akka.persistence.query.typed.EventEnvelope
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.grpc.consumer.ConsumerFilter
import akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory
import shoppingcart.CheckedOut
import shoppingcart.ItemQuantityAdjusted
import shoppingcart.ShoppingCartEventsProto

object ShoppingCartEventConsumer {
  def init(system: ActorSystem[_]): Unit = {
    implicit val sys: ActorSystem[_] = system
    val numberOfProjectionInstances = 4
    val projectionName: String = "cart-events"
    val sliceRanges =
      Persistence(system).sliceRanges(numberOfProjectionInstances)

    val eventsBySlicesQuery =
      GrpcReadJournal(List(ShoppingCartEventsProto.javaDescriptor))

    ShardedDaemonProcess(system).init(
      projectionName,
      numberOfProjectionInstances,
      { idx =>
        val sliceRange = sliceRanges(idx)
        val projectionKey =
          s"${eventsBySlicesQuery.streamId}-${sliceRange.min}-${sliceRange.max}"
        val projectionId = ProjectionId.of(projectionName, projectionKey)

        val sourceProvider = EventSourcedProvider.eventsBySlices[AnyRef](
          system,
          eventsBySlicesQuery,
          eventsBySlicesQuery.streamId,
          sliceRange.min,
          sliceRange.max)

        ProjectionBehavior(
          R2dbcProjection.atLeastOnceAsync(
            projectionId,
            None,
            sourceProvider,
            () =>
              new EventHandler(
                projectionId,
                eventsBySlicesQuery.streamId,
                sys)))
      })
  }

}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-java/src/main/java/shopping/analytics/ShoppingCartEventConsumer.java#L4-L154 "Go to snippet source")import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.Persistence;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.grpc.consumer.javadsl.GrpcReadJournal;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import shopping.cart.proto.ShoppingCartEvents;

class ShoppingCartEventConsumer {
  public static void init(ActorSystem<?> system) {
    int numberOfProjectionInstances = 4;
    String projectionName = "cart-events";
    List<Pair<Integer, Integer>> sliceRanges = Persistence.get(system).getSliceRanges(numberOfProjectionInstances);

    GrpcReadJournal eventsBySlicesQuery = GrpcReadJournal.create(
        system,
        List.of(ShoppingCartEvents.getDescriptor()));

    ShardedDaemonProcess.get(system).init(
        ProjectionBehavior.Command.class,
        projectionName,
        numberOfProjectionInstances,
        idx -> {
          Pair<Integer, Integer> sliceRange = sliceRanges.get(idx);
          String projectionKey = eventsBySlicesQuery.streamId() + "-" + sliceRange.first() + "-" + sliceRange.second();
          ProjectionId projectionId = ProjectionId.of(projectionName, projectionKey);

          SourceProvider<Offset, EventEnvelope<Object>> sourceProvider = EventSourcedProvider.eventsBySlices(
              system,
              eventsBySlicesQuery,
              eventsBySlicesQuery.streamId(),
              sliceRange.first(),
              sliceRange.second());

          return ProjectionBehavior.create(
              R2dbcProjection.atLeastOnceAsync(
                  projectionId,
                  Optional.empty(),
                  sourceProvider,
                  () -> new EventHandler(projectionId),
                  system));

        },
        ProjectionBehavior.stopMessage());
  }

}
```

The Protobuf descriptors are defined when the GrpcReadJournal is created. The descriptors are used when deserializing the received events. The `protobufDescriptors` is a list of the `javaDescriptor` for the used protobuf messages. It is defined in the ScalaPB generated `Proto` companion object. Note that GrpcReadJournal should be created with the GrpcReadJournal `apply``create` factory method and not from configuration via `GrpcReadJournalProvider` when using Protobuf serialization.

The gRPC connection to the producer is defined in the [consumer configuration](https://doc.akka.io/libraries/akka-projection/1.6/grpc.html#consumer-configuration).

The [R2dbcProjection](https://doc.akka.io/libraries/akka-projection/1.6/r2dbc.html) has support for storing the offset in a relational database using R2DBC.

The event handler for this sample is just logging the events rather than for example actually building its own read side in a database for querying:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-scala/src/main/scala/shopping/analytics/ShoppingCartEventConsumer.scala#L30-L89 "Go to snippet source")private class EventHandler(
    projectionId: ProjectionId,
    streamId: String,
    system: ActorSystem[_])
    extends Handler[EventEnvelope[AnyRef]] {
  private var totalCount = 0
  private var throughputStartTime = System.nanoTime()
  private var throughputCount = 0

  override def start(): Future[Done] = {
    log.info("Started Projection [{}].", projectionId.id)
    super.start()
  }
  override def stop(): Future[Done] = {
    log.info(
      "Stopped Projection [{}]. Consumed [{}] events.",
      projectionId.id,
      totalCount)
    super.stop()
  }

  override def process(envelope: EventEnvelope[AnyRef]): Future[Done] = {
    val event = envelope.event
    totalCount += 1

    event match {
      case quantityAdjusted: ItemQuantityAdjusted =>
        log.info(
          "Projection [{}] consumed ItemQuantityAdjusted for cart {}, changed {} {}. Total [{}] events.",
          projectionId.id,
          quantityAdjusted.cartId,
          quantityAdjusted.quantity,
          quantityAdjusted.itemId,
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

    throughputCount += 1
    val durationMs: Long =
      (System.nanoTime - throughputStartTime) / 1000 / 1000
    if (throughputCount >= 1000 || durationMs >= 10000) {
      log.info(
        "Projection [{}] throughput [{}] events/s in [{}] ms",
        projectionId.id,
        1000L * throughputCount / durationMs,
        durationMs)
      throughputCount = 0
      throughputStartTime = System.nanoTime
    }
    Future.successful(Done)
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-java/src/main/java/shopping/analytics/ShoppingCartEventConsumer.java#L46-L95 "Go to snippet source")static class EventHandler extends Handler<EventEnvelope<Object>> {
  private final ProjectionId projectionId;

  private long totalCount = 0;

  private long throughputStartTime = System.nanoTime();
  private int throughputCount = 0;

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

   if (event instanceof ItemQuantityAdjusted) {
      ItemQuantityAdjusted itemQuantityAdjusted = (ItemQuantityAdjusted) event;
      log.info("Projection [{}] consumed ItemQuantityAdjusted for cart {}, changed {} {}. Total [{}] events.",
          projectionId.id(), itemQuantityAdjusted.getCartId(), itemQuantityAdjusted.getQuantity(), itemQuantityAdjusted.getItemId(), totalCount);
    } else if (event instanceof CheckedOut) {
      CheckedOut checkedOut = (CheckedOut) event;
      log.info("Projection [{}] consumed CheckedOut for cart {}. Total [{}] events.", projectionId.id(), checkedOut.getCartId(), totalCount);
    } else {
      throw new IllegalArgumentException("Unknown event " + event);
    }

    throughputCount++;
    long durationMs = (System.nanoTime() - throughputStartTime) / 1000 / 1000;
    if (throughputCount >= 1000 || durationMs >= 10000) {
      log.info("Projection [{}] throughput [{}] events/s in [{}] ms", projectionId.id(), 1000L * throughputCount / durationMs, durationMs);
      throughputCount = 0;
      throughputStartTime = System.nanoTime();
    }

    return CompletableFuture.completedFuture(done());
  }
}
```

The configuration for the `GrpcReadJournal`, for ease of running locally without TLS, may look like this:

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-java/src/main/resources/grpc.conf "Go to snippet source")akka.http.server.enable-http2 = on

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

The `client` section in the configuration defines where the producer is running. It is an [Akka gRPC configuration](https://doc.akka.io/libraries/akka-grpc/2.5/client/configuration.html#by-configuration) with several connection options.

## Filters

Events can be filtered to control what set of events are propagated to the consumers. What is filtered can be managed in two ways, on the producer side or on the consumer side:

### Producer

The producer may define a filter function on the `EventProducerSource`.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/PublishEvents.scala#L27-L38 "Go to snippet source")val eventProducerSource = EventProducer
  .EventProducerSource(
    "ShoppingCart",
    "cart",
    transformation,
    EventProducerSettings(system))
  .withProducerFilter[ShoppingCart.Event] { envelope =>
    val tags = envelope.tags
    tags.contains(ShoppingCart.MediumQuantityTag) ||
    tags.contains(ShoppingCart.LargeQuantityTag)
  }
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/PublishEvents.java#L29-L40 "Go to snippet source")EventProducerSource eventProducerSource = new EventProducerSource(
    "ShoppingCart",
    "cart",
    transformation,
    EventProducerSettings.create(system)
)
.withProducerFilter(envelope -> {
  Set<String> tags = envelope.getTags();
  return tags.contains(ShoppingCart.MEDIUM_QUANTITY_TAG) ||
      tags.contains(ShoppingCart.LARGE_QUANTITY_TAG);
});
```

In this example the decision is based on tags, but the filter function can use anything in the [`EventEnvelope`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html "akka.persistence.query.typed.EventEnvelope")[`EventEnvelope`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html "akka.persistence.query.typed.EventEnvelope") parameter or the event itself. Here, the entity sets the tag based on the total quantity of the shopping cart, which requires the full state of the shopping cart and is not known from an individual event.

[Topic filters](https://doc.akka.io/libraries/akka-projection/1.6/grpc.html#topics) can be defined in similar way, using `withTopicProducerFilter`.

Note that the purpose of `withProducerFilter` and `withTopicProducerFilter` is to toggle if all events for the entity are to be emitted or not. If the purpose is to filter out certain events you should instead use the `Transformation`.

The producer filter is evaluated before the transformation function, i.e. the event is the original event and not the transformed event.

### Consumer

The consumer may define declarative filters that are sent to the producer and evaluated on the producer side before emitting the events.

Consumer filters consists of exclude and include criteria. In short, the exclude criteria are evaluated first and may be overridden by an include criteria. For more details about the consumer filtering capabilities, see [Akka Projection gRPC](https://doc.akka.io/libraries/akka-projection/1.6/grpc.html#filters)

The filter is updated with the [`ConsumerFilter`](https://doc.akka.io/api/akka-projection/1.6/akka/projection/grpc/consumer/ConsumerFilter.html "akka.projection.grpc.consumer.ConsumerFilter")[`ConsumerFilter`](https://doc.akka.io/api/akka-projection/1.6/akka/projection/grpc/consumer/ConsumerFilter.html "akka.projection.grpc.consumer.ConsumerFilter") extension.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-scala/src/main/scala/shopping/analytics/ShoppingCartEventConsumer.scala#L134-L144 "Go to snippet source")def updateConsumerFilter(
    system: ActorSystem[_],
    excludeTags: Set[String],
    includeTags: Set[String]): Unit = {
  val streamId = system.settings.config
    .getString("akka.projection.grpc.consumer.stream-id")
  val criteria = Vector(
    ConsumerFilter.ExcludeTags(excludeTags),
    ConsumerFilter.IncludeTags(includeTags))
  ConsumerFilter(system).ref ! ConsumerFilter.UpdateFilter(streamId, criteria)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-java/src/main/java/shopping/analytics/ShoppingCartEventConsumer.java#L19-L150 "Go to snippet source")import akka.projection.grpc.consumer.ConsumerFilter;

static void updateConsumerFilter(
    ActorSystem<?> system,
    Set<String> excludeTags,
    Set<String> includeTags) {
  String streamId = system.settings().config()
      .getString("akka.projection.grpc.consumer.stream-id");

  List<ConsumerFilter.FilterCriteria> criteria = List.of(
      new ConsumerFilter.ExcludeTags(excludeTags),
      new ConsumerFilter.IncludeTags(includeTags));

  ConsumerFilter.get(system).ref().tell(new ConsumerFilter.UpdateFilter(streamId, criteria));
}
```

Note that the `streamId` must match what is used when initializing the `GrpcReadJournal`, which by default is from the config property `akka.projection.grpc.consumer.stream-id`.

The filters can be dynamically changed in runtime without restarting the Projections or the `GrpcReadJournal`. The updates are incremental. For example if you first add an `IncludeTags` of tag `"medium"` and then update the filter with another `IncludeTags` of tag `"large"`, the full filter consists of both `"medium"` and `"large"`.

To remove a filter criteria you would use the corresponding [`RemoveCriteria`](https://doc.akka.io/api/akka-projection/1.6/akka/projection/grpc/consumer/ConsumerFilter$$RemoveCriteria.html "akka.projection.grpc.consumer.ConsumerFilter.RemoveCriteria")[`RemoveCriteria`](https://doc.akka.io/api/akka-projection/1.6/akka/projection/grpc/consumer/ConsumerFilter$$RemoveCriteria.html "akka.projection.grpc.consumer.ConsumerFilter.RemoveCriteria"), for example `RemoveIncludeTags`.

The updated filter is kept and remains after restarts of the Projection instances. If the consumer side is running with Akka Cluster the filter is propagated to other nodes in the cluster automatically with Akka Distributed Data. You only have to update at one place and it will be applied to all running Projections with the given `streamId`.

Warning
The filters will be cleared in case of a full Cluster stop, which means that you need to take care of populating the initial filters at startup.

See [`ConsumerFilter`](https://doc.akka.io/api/akka-projection/1.6/akka/projection/grpc/consumer/ConsumerFilter.html "akka.projection.grpc.consumer.ConsumerFilter")[`ConsumerFilter`](https://doc.akka.io/api/akka-projection/1.6/akka/projection/grpc/consumer/ConsumerFilter.html "akka.projection.grpc.consumer.ConsumerFilter") for full API documentation.

## Complete Sample Projects

The complete sample can be downloaded:

- Scala: [shopping\-scala.zip](../attachments/shopping-scala.zip)
- Java: [shopping\-java.zip](../attachments/shopping-java.zip)

## Running the sample code locally

With a copy of each of the two sample projects for the language of your liking you can run the two services locally on your own workstation. Docker, a JDK and mavensbt is all that needs to be installed.

### The Shopping Cart

1. Start a local PostgresSQL server on default port 5432\. The `docker-compose.yml` included in the shopping\-cart project starts everything required for running locally.

```
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql

```
2. Start a first node:

```
sbt -Dconfig.resource=local1.conf run

```
3. (Optional) Start another node with different ports:

```
sbt -Dconfig.resource=local2.conf run

```
4. (Optional) More can be started:

```
sbt -Dconfig.resource=local3.conf run

```
5. Check for service readiness

```
curl http://localhost:9101/ready

```
6. Try it with [grpcurl](https://github.com/fullstorydev/grpcurl). Add at least a total quantity of 10 to the cart, smaller carts are excluded by the event filter.

```
# add item to cart
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# update quantity of item
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout

```

or same `grpcurl` commands to port 8102 to reach node 2\.

1. Start a local PostgresSQL server on default port 5432\. The included `docker-compose.yml` starts everything required for running locally.

```
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql

```
2. Make sure you have compiled the project

```
mvn compile 

```
3. Start a first node:

```
mvn compile exec:exec -DAPP_CONFIG=local1.conf

```
4. (Optional) Start another node with different ports:

```
mvn compile exec:exec -DAPP_CONFIG=local2.conf

```
5. (Optional) More can be started:

```
mvn compile exec:exec -DAPP_CONFIG=local3.conf

```
6. Check for service readiness

```
curl http://localhost:9101/ready

```
7. Try it with [grpcurl](https://github.com/fullstorydev/grpcurl):

```
# add item to cart
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# update quantity of item
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout

```

or same `grpcurl` commands to port 8102 to reach node 2\.

### The analytics service

1. Start a local PostgresSQL server on default port 5432\. The included `docker-compose.yml` starts everything required for running locally. Note that for convenience this service and the shopping cart service is sharing the same database, in an actual service consuming events the consuming services are expected to have their own separate databases.

```
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql

```
2. Start a first node:

```
sbt -Dconfig.resource=local1.conf run

```
3. Start `shopping-cart-service` and add item to cart
4. Add at least a total quantity of 10 to the cart, smaller carts are excluded by the event filter.
5. Notice the log output in the terminal of the `shopping-analytics-service`

1. Start a local PostgresSQL server on default port 5432\. The included `docker-compose.yml` starts everything required for running locally. Note that for convenience this service and the shopping cart service is sharing the same database, in an actual service consuming events the consuming services are expected to have their own separate databases.

```
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql

```
2. Start a first node:

```
mvn compile exec:exec -DAPP_CONFIG=local1.conf

```
3. Start `shopping-cart-service` and add item to cart
4. Notice the log output in the terminal of the `shopping-analytics-service`

## What’s next?

- Turning the shopping cart highly available through Active\-Active

## Code Examples

### Example 1: Publish the events of the shopping cart

```scala
import akka.actor.typed.ActorSystem
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import akka.persistence.query.typed
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.typed.PersistenceId
import akka.projection.grpc.producer.EventProducerSettings
import akka.projection.grpc.producer.scaladsl.EventProducer
import akka.projection.grpc.producer.scaladsl.EventProducer.Transformation

import scala.concurrent.Future

object PublishEvents {

  def eventProducerService(system: ActorSystem[_])
      : PartialFunction[HttpRequest, Future[HttpResponse]] = {
    val transformation = Transformation.empty
      .registerAsyncEnvelopeMapper[ShoppingCart.ItemUpdated, proto.ItemQuantityAdjusted](envelope =>
        Future.successful(Some(transformItemUpdated(envelope))))
      .registerAsyncEnvelopeMapper[ShoppingCart.CheckedOut, proto.CheckedOut](envelope =>
        Future.successful(Some(transformCheckedOut(envelope))))

    val eventProducerSource = EventProducer
      .EventProducerSource(
        "ShoppingCart",
        "cart",
        transformation,
        EventProducerSettings(system))

    EventProducer.grpcServiceHandler(eventProducerSource)(system)
  }
}
```

### Example 2: Publish the events of the shopping cart

```java
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
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class PublishEvents {

  public static Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService(ActorSystem<?> system) {
    Transformation transformation =
        Transformation.empty()
            .registerAsyncEnvelopeMapper(ShoppingCart.ItemUpdated.class, envelope -> CompletableFuture.completedFuture(Optional.of(transformItemQuantityAdjusted(envelope))))
            .registerAsyncEnvelopeMapper(ShoppingCart.CheckedOut.class, envelope -> CompletableFuture.completedFuture(Optional.of(transformCheckedOut(envelope))));

    EventProducerSource eventProducerSource = new EventProducerSource(
        "ShoppingCart",
        "cart",
        transformation,
        EventProducerSettings.create(system)
    );

    return EventProducer.grpcServiceHandler(system, eventProducerSource);
  }
}
```

### Example 3: Publish the events of the shopping cart

```scala
def transformItemUpdated(
    envelope: EventEnvelope[ShoppingCart.ItemUpdated]): proto.ItemQuantityAdjusted = {
  val event = envelope.event
  proto.ItemQuantityAdjusted(
    cartId = PersistenceId.extractEntityId(envelope.persistenceId),
    itemId = event.itemId,
    quantity = event.quantity)
}
```

### Example 4: Publish the events of the shopping cart

```java
private static shopping.cart.proto.ItemQuantityAdjusted transformItemQuantityAdjusted(EventEnvelope<ShoppingCart.ItemUpdated> envelope) {
  var itemUpdated = envelope.event();
  return shopping.cart.proto.ItemQuantityAdjusted.newBuilder()
      .setCartId(PersistenceId.extractEntityId(envelope.persistenceId()))
      .setItemId(itemUpdated.itemId)
      .setQuantity(itemUpdated.quantity)
      .build();
}
```

### Example 5: Publish the events of the shopping cart

```scala
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.Failure
import scala.util.Success

import akka.actor.typed.ActorSystem
import akka.grpc.scaladsl.ServerReflection
import akka.grpc.scaladsl.ServiceHandler
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse

object ShoppingCartServer {

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
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.partial(List(proto.ShoppingCartService)))

    val bound =
      Http()
        .newServerAt(interface, port)
        .bind(service)
        .map(_.addToCoordinatedShutdown(3.seconds))

    bound.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        system.log.info(
          "Shopping online at gRPC server {}:{}",
          address.getHostString,
          address.getPort)
      case Failure(ex) =>
        system.log.error("Failed to bind gRPC endpoint, terminating system", ex)
        system.terminate()
    }
  }


}
```

### Example 6: Publish the events of the shopping cart

```java
import akka.actor.typed.ActorSystem;
import akka.grpc.javadsl.ServerReflection;
import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.CompletionStage;
import shopping.cart.proto.ShoppingCartService;
import shopping.cart.proto.ShoppingCartServiceHandlerFactory;

public final class ShoppingCartServer {

  private ShoppingCartServer() {}

  static void start(String host, int port, ActorSystem<?> system, ShoppingCartService grpcService, Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService) {
    @SuppressWarnings("unchecked")
    Function<HttpRequest, CompletionStage<HttpResponse>> service =
        ServiceHandler.concatOrNotFound(
            eventProducerService,
            ShoppingCartServiceHandlerFactory.create(grpcService, system),
            // ServerReflection enabled to support grpcurl without import-path and proto parameters
            ServerReflection.create(
                Collections.singletonList(ShoppingCartService.description), system));

    CompletionStage<ServerBinding> bound =
        Http.get(system).newServerAt(host, port).bind(service::apply);

    bound.whenComplete(
        (binding, ex) -> {
          if (binding != null) {
            binding.addToCoordinatedShutdown(Duration.ofSeconds(3), system);
            InetSocketAddress address = binding.localAddress();
            system
                .log()
                .info(
                    "Shopping online at gRPC server {}:{}",
                    address.getHostString(),
                    address.getPort());
          } else {
            system.log().error("Failed to bind gRPC endpoint, terminating system", ex);
            system.terminate();
          }
        });
  }

}
```

### Example 7: Consume events

```scala
import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.Persistence
import akka.persistence.query.typed.EventEnvelope
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.grpc.consumer.ConsumerFilter
import akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory
import shoppingcart.CheckedOut
import shoppingcart.ItemQuantityAdjusted
import shoppingcart.ShoppingCartEventsProto

object ShoppingCartEventConsumer {
  def init(system: ActorSystem[_]): Unit = {
    implicit val sys: ActorSystem[_] = system
    val numberOfProjectionInstances = 4
    val projectionName: String = "cart-events"
    val sliceRanges =
      Persistence(system).sliceRanges(numberOfProjectionInstances)

    val eventsBySlicesQuery =
      GrpcReadJournal(List(ShoppingCartEventsProto.javaDescriptor))

    ShardedDaemonProcess(system).init(
      projectionName,
      numberOfProjectionInstances,
      { idx =>
        val sliceRange = sliceRanges(idx)
        val projectionKey =
          s"${eventsBySlicesQuery.streamId}-${sliceRange.min}-${sliceRange.max}"
        val projectionId = ProjectionId.of(projectionName, projectionKey)

        val sourceProvider = EventSourcedProvider.eventsBySlices[AnyRef](
          system,
          eventsBySlicesQuery,
          eventsBySlicesQuery.streamId,
          sliceRange.min,
          sliceRange.max)

        ProjectionBehavior(
          R2dbcProjection.atLeastOnceAsync(
            projectionId,
            None,
            sourceProvider,
            () =>
              new EventHandler(
                projectionId,
                eventsBySlicesQuery.streamId,
                sys)))
      })
  }


}
```

### Example 8: Consume events

```java
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.Persistence;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.grpc.consumer.javadsl.GrpcReadJournal;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import shopping.cart.proto.ShoppingCartEvents;

class ShoppingCartEventConsumer {
  public static void init(ActorSystem<?> system) {
    int numberOfProjectionInstances = 4;
    String projectionName = "cart-events";
    List<Pair<Integer, Integer>> sliceRanges = Persistence.get(system).getSliceRanges(numberOfProjectionInstances);

    GrpcReadJournal eventsBySlicesQuery = GrpcReadJournal.create(
        system,
        List.of(ShoppingCartEvents.getDescriptor()));

    ShardedDaemonProcess.get(system).init(
        ProjectionBehavior.Command.class,
        projectionName,
        numberOfProjectionInstances,
        idx -> {
          Pair<Integer, Integer> sliceRange = sliceRanges.get(idx);
          String projectionKey = eventsBySlicesQuery.streamId() + "-" + sliceRange.first() + "-" + sliceRange.second();
          ProjectionId projectionId = ProjectionId.of(projectionName, projectionKey);

          SourceProvider<Offset, EventEnvelope<Object>> sourceProvider = EventSourcedProvider.eventsBySlices(
              system,
              eventsBySlicesQuery,
              eventsBySlicesQuery.streamId(),
              sliceRange.first(),
              sliceRange.second());

          return ProjectionBehavior.create(
              R2dbcProjection.atLeastOnceAsync(
                  projectionId,
                  Optional.empty(),
                  sourceProvider,
                  () -> new EventHandler(projectionId),
                  system));

        },
        ProjectionBehavior.stopMessage());
  }


}
```

### Example 9: Consume events

```scala
private class EventHandler(
    projectionId: ProjectionId,
    streamId: String,
    system: ActorSystem[_])
    extends Handler[EventEnvelope[AnyRef]] {
  private var totalCount = 0
  private var throughputStartTime = System.nanoTime()
  private var throughputCount = 0

  override def start(): Future[Done] = {
    log.info("Started Projection [{}].", projectionId.id)
    super.start()
  }
  override def stop(): Future[Done] = {
    log.info(
      "Stopped Projection [{}]. Consumed [{}] events.",
      projectionId.id,
      totalCount)
    super.stop()
  }

  override def process(envelope: EventEnvelope[AnyRef]): Future[Done] = {
    val event = envelope.event
    totalCount += 1

    event match {
      case quantityAdjusted: ItemQuantityAdjusted =>
        log.info(
          "Projection [{}] consumed ItemQuantityAdjusted for cart {}, changed {} {}. Total [{}] events.",
          projectionId.id,
          quantityAdjusted.cartId,
          quantityAdjusted.quantity,
          quantityAdjusted.itemId,
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

    throughputCount += 1
    val durationMs: Long =
      (System.nanoTime - throughputStartTime) / 1000 / 1000
    if (throughputCount >= 1000 || durationMs >= 10000) {
      log.info(
        "Projection [{}] throughput [{}] events/s in [{}] ms",
        projectionId.id,
        1000L * throughputCount / durationMs,
        durationMs)
      throughputCount = 0
      throughputStartTime = System.nanoTime
    }
    Future.successful(Done)
  }
}
```

### Example 10: Consume events

```java
static class EventHandler extends Handler<EventEnvelope<Object>> {
  private final ProjectionId projectionId;

  private long totalCount = 0;

  private long throughputStartTime = System.nanoTime();
  private int throughputCount = 0;

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

   if (event instanceof ItemQuantityAdjusted) {
      ItemQuantityAdjusted itemQuantityAdjusted = (ItemQuantityAdjusted) event;
      log.info("Projection [{}] consumed ItemQuantityAdjusted for cart {}, changed {} {}. Total [{}] events.",
          projectionId.id(), itemQuantityAdjusted.getCartId(), itemQuantityAdjusted.getQuantity(), itemQuantityAdjusted.getItemId(), totalCount);
    } else if (event instanceof CheckedOut) {
      CheckedOut checkedOut = (CheckedOut) event;
      log.info("Projection [{}] consumed CheckedOut for cart {}. Total [{}] events.", projectionId.id(), checkedOut.getCartId(), totalCount);
    } else {
      throw new IllegalArgumentException("Unknown event " + event);
    }

    throughputCount++;
    long durationMs = (System.nanoTime() - throughputStartTime) / 1000 / 1000;
    if (throughputCount >= 1000 || durationMs >= 10000) {
      log.info("Projection [{}] throughput [{}] events/s in [{}] ms", projectionId.id(), 1000L * throughputCount / durationMs, durationMs);
      throughputCount = 0;
      throughputStartTime = System.nanoTime();
    }

    return CompletableFuture.completedFuture(done());
  }
}
```

### Example 11: Consume events

```conf
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

### Example 12: Producer

```scala
val eventProducerSource = EventProducer
  .EventProducerSource(
    "ShoppingCart",
    "cart",
    transformation,
    EventProducerSettings(system))
  .withProducerFilter[ShoppingCart.Event] { envelope =>
    val tags = envelope.tags
    tags.contains(ShoppingCart.MediumQuantityTag) ||
    tags.contains(ShoppingCart.LargeQuantityTag)
  }
```

### Example 13: Producer

```java
EventProducerSource eventProducerSource = new EventProducerSource(
    "ShoppingCart",
    "cart",
    transformation,
    EventProducerSettings.create(system)
)
.withProducerFilter(envelope -> {
  Set<String> tags = envelope.getTags();
  return tags.contains(ShoppingCart.MEDIUM_QUANTITY_TAG) ||
      tags.contains(ShoppingCart.LARGE_QUANTITY_TAG);
});
```

### Example 14: Consumer

```scala
def updateConsumerFilter(
    system: ActorSystem[_],
    excludeTags: Set[String],
    includeTags: Set[String]): Unit = {
  val streamId = system.settings.config
    .getString("akka.projection.grpc.consumer.stream-id")
  val criteria = Vector(
    ConsumerFilter.ExcludeTags(excludeTags),
    ConsumerFilter.IncludeTags(includeTags))
  ConsumerFilter(system).ref ! ConsumerFilter.UpdateFilter(streamId, criteria)
}
```

### Example 15: Consumer

```java
import akka.projection.grpc.consumer.ConsumerFilter;

static void updateConsumerFilter(
    ActorSystem<?> system,
    Set<String> excludeTags,
    Set<String> includeTags) {
  String streamId = system.settings().config()
      .getString("akka.projection.grpc.consumer.stream-id");

  List<ConsumerFilter.FilterCriteria> criteria = List.of(
      new ConsumerFilter.ExcludeTags(excludeTags),
      new ConsumerFilter.IncludeTags(includeTags));

  ConsumerFilter.get(system).ref().tell(new ConsumerFilter.UpdateFilter(streamId, criteria));
}
```

### Example 16: The Shopping Cart

```shell
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql
```

### Example 17: The Shopping Cart

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 18: The Shopping Cart

```shell
sbt -Dconfig.resource=local2.conf run
```

### Example 19: The Shopping Cart

```shell
sbt -Dconfig.resource=local3.conf run
```

### Example 20: The Shopping Cart

```shell
curl http://localhost:9101/ready
```

### Example 21: The Shopping Cart

```shell
# add item to cart
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# update quantity of item
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

### Example 22: The Shopping Cart

```shell
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql
```

### Example 23: The Shopping Cart

```shell
mvn compile
```

### Example 24: The Shopping Cart

```shell
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 25: The Shopping Cart

```shell
mvn compile exec:exec -DAPP_CONFIG=local2.conf
```

### Example 26: The Shopping Cart

```shell
mvn compile exec:exec -DAPP_CONFIG=local3.conf
```

### Example 27: The Shopping Cart

```shell
curl http://localhost:9101/ready
```

### Example 28: The Shopping Cart

```shell
# add item to cart
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# update quantity of item
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

### Example 29: The analytics service

```shell
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql
```

### Example 30: The analytics service

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 31: The analytics service

```shell
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql
```

### Example 32: The analytics service

```shell
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6/akka/projection/grpc/consumer/ConsumerFilter$$RemoveCriteria.html
- https://doc.akka.io/api/akka-projection/1.6/akka/projection/grpc/consumer/ConsumerFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-distributed-cluster/current/attachments/shopping-java.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/current/attachments/shopping-scala.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/1-event-sourced-shopping-cart.html
- https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/3-active-active.html
- https://doc.akka.io/libraries/akka-grpc/2.5/client/configuration.html
- https://doc.akka.io/libraries/akka-projection/1.6/
- https://doc.akka.io/libraries/akka-projection/1.6/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/1.6/grpc.html
- https://doc.akka.io/libraries/akka-projection/1.6/r2dbc.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/

---
*Source: [https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/2-service-to-service.html](https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/2-service-to-service.html)*
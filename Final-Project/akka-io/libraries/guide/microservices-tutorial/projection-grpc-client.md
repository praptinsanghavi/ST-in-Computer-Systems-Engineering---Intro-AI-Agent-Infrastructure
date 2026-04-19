---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/projection-grpc-client.html
title: 'Section 8: Projection calling gRPC service :: Akka Guide'
---

# Section 8: Projection calling gRPC service :: Akka Guide

## Content

# Section 8: Projection calling gRPC service

Language

To complete the example, we need a way to handle orders. We will add another Projection from the events of the `ShoppingCart` entity. We will also create a gRPC Order Service, `ShoppingOrderService`. The Projection calls the Order Service when the shopping carts are checked out.

![Example gRPC client](_images/example-projection-grpc-client.drawio.svg)

This part of the [full example](overview.html) focuses on the gRPC client in the `SendOrderProjection`. On this page you will learn how to:

- call another service with [Akka gRPC](../concepts/akka-grpc.html)
- implement another gRPC service by adding the `ShoppingOrderService`

## Source downloads

If you prefer to simply view and run the example, download a zip file containing the completed code:

Java

- [Source](_attachments/5-shopping-cart-projection-s2s-java.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/6-shopping-cart-complete-java.zip) with the steps on this page completed.

Scala

- [Source](_attachments/5-shopping-cart-projection-s2s-scala.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/6-shopping-cart-complete-scala.zip) with the steps on this page completed.

## 1\. Add the Order gRPC service

Let’s add the service that handles shopping cart orders. The template and source downloads include a directory named `shopping-order-service` for this purpose. To add the order gRPC service, follow these steps:

1. Open the `shopping-order-service` in IntelliJ just as you did with  [the shopping\-cart\-service](template.html#intellij).
2. Define the interface of the service in a protobuf service descriptor. It should be located in the `src/main/protobuf/shoppingorder/shopping_order_service.proto` in the new `shopping-order-service` project.

src/main/protobuf/shoppingorder/shopping\_order\_service.proto

```
syntax = "proto3";

package shoppingorder;

option java_multiple_files = true;
option java_package = "shopping.order.proto";

// gRPC definition for ShoppingOrderService

service ShoppingOrderService {
  rpc Order(OrderRequest) returns (OrderResponse) {}
}

message OrderRequest {
  string cart_id = 1;
  repeated Item items = 2;
}

message Item {
  string item_id = 1;
  int32 quantity = 2;
}

message OrderResponse {
  bool ok = 1;
}
```
3. Generate code by compiling the project:

```
mvn compile
```

```
sbt compile
```
4. Implement the `ShoppingOrderService` in a new class `ShoppingOrderServiceImpl`:

Java

src/main/java/shopping/order/ShoppingOrderServiceImpl.java:

```
package shopping.order;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.order.proto.Item;
import shopping.order.proto.OrderRequest;
import shopping.order.proto.OrderResponse;
import shopping.order.proto.ShoppingOrderService;

public final class ShoppingOrderServiceImpl implements ShoppingOrderService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<OrderResponse> order(OrderRequest in) {
    int total = 0;
    for (Item item : in.getItemsList()) {
      total += item.getQuantity();
    }
    logger.info("Order {} items from cart {}.", total, in.getCartId());
    OrderResponse response = OrderResponse.newBuilder().setOk(true).build();
    return CompletableFuture.completedFuture(response);
  }
}
```

Scala

src/main/scala/shopping/order/ShoppingOrderServiceImpl.scala:

```
package shopping.order

import org.slf4j.LoggerFactory
import shopping.order.proto.{ OrderRequest, OrderResponse }

import scala.concurrent.Future

class ShoppingOrderServiceImpl extends proto.ShoppingOrderService {

  private val logger = LoggerFactory.getLogger(getClass)

  override def order(in: OrderRequest): Future[OrderResponse] = {
    val totalNumberOfItems =
      in.items.iterator.map(_.quantity).sum
    logger.info("Order {} items from cart {}.", totalNumberOfItems, in.cartId)
    Future.successful(OrderResponse(ok = true))
  }
}
```
5. Similar to the [gRPC server for the ShoppingCartService](grpc-service.html) we need to initialize the gRPC server. Add a `ShoppingOrderServer` object class:

Java

src/main/java/shopping/order/ShoppingOrderServer.java:

```
package shopping.order;

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
import shopping.order.proto.ShoppingOrderService;
import shopping.order.proto.ShoppingOrderServiceHandlerFactory;

public final class ShoppingOrderServer {

  private ShoppingOrderServer() {}

  static void start(
      String host, int port, ActorSystem<?> system, ShoppingOrderService grpcService) {
    @SuppressWarnings("unchecked")
    Function<HttpRequest, CompletionStage<HttpResponse>> service =
        ServiceHandler.concatOrNotFound(
            ShoppingOrderServiceHandlerFactory.create(grpcService, system),
            // ServerReflection enabled to support grpcurl without import-path and proto parameters
            ServerReflection.create(
                Collections.singletonList(ShoppingOrderService.description), system));

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
                    "Shopping order at gRPC server {}:{}",
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

Scala

src/main/scala/shopping/order/ShoppingOrderServer.scala:

```
package shopping.order

import akka.actor.typed.ActorSystem
import akka.grpc.scaladsl.{ ServerReflection, ServiceHandler }
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ HttpRequest, HttpResponse }

import scala.concurrent.duration._
import scala.concurrent.{ ExecutionContext, Future }
import scala.util.{ Failure, Success }

object ShoppingOrderServer {

  def start(
      interface: String,
      port: Int,
      system: ActorSystem[_],
      grpcService: proto.ShoppingOrderService): Unit = {
    implicit val sys: ActorSystem[_] = system
    implicit val ec: ExecutionContext =
      system.executionContext

    val service: HttpRequest => Future[HttpResponse] =
      ServiceHandler.concatOrNotFound(
        proto.ShoppingOrderServiceHandler.partial(grpcService),
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.partial(List(proto.ShoppingOrderService)))

    val bound =
      Http()
        .newServerAt(interface, port)
        .bind(service)
        .map(_.addToCoordinatedShutdown(3.seconds))

    bound.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        system.log.info(
          "Shopping order at gRPC server {}:{}",
          address.getHostString,
          address.getPort)
      case Failure(ex) =>
        system.log.error("Failed to bind gRPC endpoint, terminating system", ex)
        system.terminate()
    }
  }

}
```
6. Call the `ShoppingOrderServer.start` from `Main`:

Java

```
package shopping.order;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.management.cluster.bootstrap.ClusterBootstrap;
import akka.management.javadsl.AkkaManagement;
import com.typesafe.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.order.proto.ShoppingOrderService;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) throws Exception {
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "ShoppingOrderService");
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

    Config config = system.settings().config();
    String grpcInterface = config.getString("shopping-order-service.grpc.interface");
    int grpcPort = config.getInt("shopping-order-service.grpc.port");
    ShoppingOrderService grpcService = new ShoppingOrderServiceImpl();
    ShoppingOrderServer.start(grpcInterface, grpcPort, system, grpcService);
  }
}
```

Scala

```
package shopping.order

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.management.cluster.bootstrap.ClusterBootstrap
import akka.management.scaladsl.AkkaManagement
import org.slf4j.LoggerFactory

import scala.util.control.NonFatal

object Main {

  val logger = LoggerFactory.getLogger("shopping.order.Main")

  def main(args: Array[String]): Unit = {
    val system = ActorSystem[Nothing](Behaviors.empty, "ShoppingOrderService")
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

    val grpcInterface =
      system.settings.config.getString("shopping-order-service.grpc.interface")
    val grpcPort =
      system.settings.config.getInt("shopping-order-service.grpc.port")
    val grpcService = new ShoppingOrderServiceImpl
    ShoppingOrderServer.start(grpcInterface, grpcPort, system, grpcService)
  }

}
```

|  | The `grpc.port` configuration is defined in `local1.conf`, which is included in the generated template project. |
| --- | --- |

## 2\. Create the Projection

The new Projection for `shopping-cart-service` events will be similar to the one we developed to track item popularity, but when it receives `ShoppingCart.CheckedOut` events, it will call the `ShoppingOrderService`.

Create the Projection as follows:

1. Include the service definition by copying the `shopping_order_service.proto` file from the `shopping-order-service` to the `shopping-cart-service/src/main/protobuf` directory.
2. Generate code by compiling the `shopping-cart-service` project:

```
mvn compile
```

```
sbt compile
```
3. Add a `SendOrderProjectionHandler` class in the `shopping-cart-service` project. This is the Projection `Handler` for processing the events:

Java

src/main/java/shopping/cart/SendOrderProjectionHandler.java:

```
package shopping.cart;

import static akka.Done.done;

import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.r2dbc.javadsl.R2dbcHandler;
import akka.projection.r2dbc.javadsl.R2dbcSession;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.order.proto.Item;
import shopping.order.proto.OrderRequest;
import shopping.order.proto.ShoppingOrderService;

public final class SendOrderProjectionHandler
    extends R2dbcHandler<EventEnvelope<ShoppingCart.Event>> {

  private final Logger log = LoggerFactory.getLogger(getClass());
  private final ClusterSharding sharding;
  private final Duration timeout;
  private final ShoppingOrderService orderService;

  private final String slice;

  public SendOrderProjectionHandler(
      ActorSystem<?> system, ShoppingOrderService orderService, String slice) { (1)
    this.slice = slice;
    sharding = ClusterSharding.get(system);
    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    this.orderService = orderService;
  }

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, EventEnvelope<ShoppingCart.Event> envelope) {
    return envelope.event() instanceof ShoppingCart.CheckedOut checkedOut
        ? sendOrder(checkedOut)
        : CompletableFuture.completedFuture(done());
  }

  private CompletionStage<Done> sendOrder(ShoppingCart.CheckedOut checkout) {
    var entityRef = sharding.entityRefFor(ShoppingCart.ENTITY_KEY, checkout.cartId());
    var reply = entityRef.ask(ShoppingCart.Get::new, timeout);

    return reply.thenCompose(
        cart -> { (2)
          List<Item> protoItems =
              cart.items().entrySet().stream()
                  .map(
                      entry ->
                          Item.newBuilder()
                              .setItemId(entry.getKey())
                              .setQuantity(entry.getValue())
                              .build())
                  .collect(Collectors.toList());
          log.info(
              "Sending order of {} items for cart {}.", cart.items().size(), checkout.cartId());
          var orderRequest =
              OrderRequest.newBuilder()
                  .setCartId(checkout.cartId())
                  .addAllItems(protoItems)
                  .build();
          return orderService.order(orderRequest).thenApply(response -> done()); (3)
        });
  }
}
```

| **1** | `ShoppingOrderService` is the gRPC client |
| --- | --- |
| **2** | Retrieve the full shopping cart information from the entity. In the order we need to include the list of items and their quantities. That information is not included in the `ShoppingCart.CheckedOut` event, but we can retrieve it by asking the `ShoppingCart` entity for it. |
| **3** | Call the `ShoppingOrderService`. If the call to the `ShoppingOrderService` fails, the returned `CompletionStage<Done>` fails and the Projection is automatically restarted from the previously saved offset. This will result in retrying the call to the `ShoppingOrderService`. Since the Projection has `at-least-once` semantics, the `ShoppingOrderService` must be idempotent, that is, it must gracefully handle duplicate order attempts for the same `cartId`. |

Scala

src/main/scala/shopping/cart/SendOrderProjectionHandler.scala:

```
package shopping.cart

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.persistence.query.typed.EventEnvelope
import akka.projection.r2dbc.scaladsl.{ R2dbcHandler, R2dbcSession }
import akka.util.Timeout
import org.slf4j.LoggerFactory
import shopping.order.proto.{ Item, OrderRequest, ShoppingOrderService }

import scala.concurrent.{ ExecutionContext, Future }

class SendOrderProjectionHandler(
    system: ActorSystem[_],
    orderService: ShoppingOrderService) (1)
    extends R2dbcHandler[EventEnvelope[ShoppingCart.Event]] {
  private val log = LoggerFactory.getLogger(getClass)
  private implicit val ec: ExecutionContext =
    system.executionContext

  private val sharding = ClusterSharding(system)
  implicit private val timeout: Timeout =
    Timeout.create(
      system.settings.config.getDuration("shopping-cart-service.ask-timeout"))

  override def process(
      session: R2dbcSession,
      envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case checkout: ShoppingCart.CheckedOut =>
        sendOrder(checkout)

      case _ =>
        // this projection is only interested in CheckedOut events
        Future.successful(Done)
    }

  }

  private def sendOrder(checkout: ShoppingCart.CheckedOut): Future[Done] = {
    val entityRef =
      sharding.entityRefFor(ShoppingCart.EntityKey, checkout.cartId)
    entityRef.ask(ShoppingCart.Get).flatMap { cart => (2)
      val items =
        cart.items.iterator.map { case (itemId, quantity) =>
          Item(itemId, quantity)
        }.toList
      log.info(
        "Sending order of {} items for cart {}.",
        items.size,
        checkout.cartId)
      val orderReq = OrderRequest(checkout.cartId, items)
      orderService.order(orderReq).map(_ => Done) (3)
    }
  }

}
```

| **1** | `ShoppingOrderService` is the gRPC client |
| --- | --- |
| **2** | Retrieve the full shopping cart information from the entity. In the order we need to include the list of items and their quantities. That information is not included in the `ShoppingCart.CheckedOut` event, but we can retrieve it by asking the `ShoppingCart` entity for it. |
| **3** | Call the `ShoppingOrderService`. If the call to the `ShoppingOrderService` fails, the returned `Future[Done]` fails and the Projection is automatically restarted from the previously saved offset. This will result in retrying the call to the `ShoppingOrderService`. Since the Projection has `at-least-once` semantics, the `ShoppingOrderService` must be idempotent, that is, it must gracefully handle duplicate order attempts for the same `cartId`. |

## 3\. Initialize the Projection

We will follow a very similar approach to the one we used for the [query Projection](projection-query.html#projection). So, we just need to initialize it as follows:

1. Place the initialization code of the Projection in an `SendOrderProjection` object: class:

Java

src/main/java/shopping/cart/SendOrderProjection.java:

```
package shopping.cart;

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
import akka.projection.javadsl.ExactlyOnceProjection;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import java.util.List;
import java.util.Optional;
import shopping.order.proto.ShoppingOrderService;

public class SendOrderProjection {

  private SendOrderProjection() {}

  public static void init(ActorSystem<?> system, ShoppingOrderService orderService) {
    ShardedDaemonProcess.get(system)
        .initWithContext(
            ProjectionBehavior.Command.class,
            "SendOrderProjection",
            4,
            daemonContext -> {
              List<Pair<Integer, Integer>> sliceRanges =
                  EventSourcedProvider.sliceRanges(
                      system, R2dbcReadJournal.Identifier(), daemonContext.totalProcesses());
              Pair<Integer, Integer> sliceRange = sliceRanges.get(daemonContext.processNumber());
              return ProjectionBehavior.create(createProjection(system, orderService, sliceRange));
            },
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static ExactlyOnceProjection<Offset, EventEnvelope<ShoppingCart.Event>> createProjection(
      ActorSystem<?> system,
      ShoppingOrderService shoppingOrderService,
      Pair<Integer, Integer> sliceRange) {

    int minSlice = sliceRange.first();
    int maxSlice = sliceRange.second();

    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
        EventSourcedProvider.eventsBySlices(
            system, R2dbcReadJournal.Identifier(), "ShoppingCart", minSlice, maxSlice);

    String slice = "carts-" + minSlice + "-" + maxSlice;
    Optional<R2dbcProjectionSettings> settings = Optional.empty();
    return R2dbcProjection.exactlyOnce(
        ProjectionId.of("SendOrderProjection", slice),
        settings,
        sourceProvider,
        () -> new SendOrderProjectionHandler(system, shoppingOrderService, slice),
        system);
  }
}
```

Scala

src/main/scala/shopping/cart/SendOrderProjection.scala:

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
import shopping.order.proto.ShoppingOrderService

object SendOrderProjection {

  def init(system: ActorSystem[_], orderService: ShoppingOrderService): Unit = {

    def sourceProvider(sliceRange: Range)
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
      EventSourcedProvider.eventsBySlices[ShoppingCart.Event](
        system,
        readJournalPluginId = R2dbcReadJournal.Identifier,
        "ShoppingCart",
        sliceRange.min,
        sliceRange.max)

    def projection(
        sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
      val minSlice = sliceRange.min
      val maxSlice = sliceRange.max
      val projectionId =
        ProjectionId("SendOrderProjection", s"carts-$minSlice-$maxSlice")

      R2dbcProjection.atLeastOnce(
        projectionId,
        settings = None,
        sourceProvider(sliceRange),
        handler = () => new SendOrderProjectionHandler(system, orderService))(
        system)
    }

    ShardedDaemonProcess(system).initWithContext(
      name = "SendOrderProjection",
      initialNumberOfInstances = 4,
      behaviorFactory = { daemonContext =>
        val sliceRanges =
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
2. In `Main`, invoke the `SendOrderProjection.init` and create the gRPC client for the `ShoppingOrderService` like this:

Java

```
public class Main {
  public static void main(String[] args) {
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "shopping-cart-service");
    try {
      init(system, orderServiceClient(system));
    } catch (Exception e) {
      logger.error("Terminating due to initialization failure.", e);
      system.terminate();
    }
  }

  public static void init(ActorSystem<Void> system, ShoppingOrderService orderService) {
    // ...
    SendOrderProjection.init(system, orderService); (1)
    // ...
  }

  static ShoppingOrderService orderServiceClient(ActorSystem<?> system) { (2)
    GrpcClientSettings orderServiceClientSettings =
        GrpcClientSettings.connectToServiceAt(
                system.settings().config().getString("shopping-order-service.host"),
                system.settings().config().getInt("shopping-order-service.port"),
                system)
            .withTls(false);

    return ShoppingOrderServiceClient.create(orderServiceClientSettings, system);
  }
}
```

| **1** | Loads host and port for where to find the service from configuration. |
| --- | --- |
| **2** | Creates the client for the `ShoppingOrderService`. |

Scala

```
// ...
def init(system: ActorSystem[_], orderService: ShoppingOrderService): Unit = {
  // ...
  SendOrderProjection.init(system, orderService) (1)
  // ...
}

protected def orderServiceClient( (2)
    system: ActorSystem[_]): ShoppingOrderService = {
  val orderServiceClientSettings =
    GrpcClientSettings
      .connectToServiceAt(
        system.settings.config.getString("shopping-order-service.host"),
        system.settings.config.getInt("shopping-order-service.port"))(system)
      .withTls(false)
  ShoppingOrderServiceClient(orderServiceClientSettings)(system)
}
```

| **1** | Loads host and port for where to find the service from configuration. |
| --- | --- |
| **2** | Creates the client for the `ShoppingOrderService`. |
3. The gRPC client is using service discovery to locate the `ShoppingOrderService`. For local development add the following to `src/main/resources/local-shared.conf`, which is loaded when running locally:

```
shopping-order-service.host = "localhost"
shopping-order-service.port = 8301
```

## 4\. Run locally

Follow these steps to run locally and exercise the new Projection and service:

1. Start PostgreSQL, unless it is already running:

```
docker compose up -d
```
2. Run the `shopping-order-service` with:

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

```
sbt -Dconfig.resource=local1.conf run
```
3. Keep the `shopping-order-service` running, and in another terminal run the `shopping-cart-service` with:

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

```
sbt -Dconfig.resource=local1.conf run
```

### 4\.1\. Exercise the service

Use `[grpcurl](https://github.com/fullstorydev/grpcurl)` to exercise the service:

1. Try the new order service directly (on port 8301\):

```
grpcurl -d '{"cartId":"cart1", "items":[{"itemId":"socks", "quantity":3}, {"itemId":"t-shirt", "quantity":2}]}' -plaintext 127.0.0.1:8301 shoppingorder.ShoppingOrderService.Order
```
2. Use the checkout in the shopping cart service with `grpcurl` (note the different port number):

```
grpcurl -d '{"cartId":"cart1", "itemId":"scissors", "quantity":1}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

```
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```
3. In the terminal of the `shopping-order-service` you should see the log of the order:

```
Order 12 items from cart cart1
```

### 4\.2\. Stop the service

When finished:

1. Stop the `shopping-cart-service` and `shopping-order-service` with `ctrl-c`.
2. Stop PostgreSQL with:

```
docker compose stop
```

## Learn more

Congratulations, you finished the tutorial! The examples of gRPC, event sourcing, and Projections should be helpful when you create your own Reactive Microservices. The following sections go into more detail:

- [Internal and External Communication concepts](../concepts/internal-and-external-communication.html).
- [Akka gRPC client reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current/client/index.html).
- [Akka Projection reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/).

## Code Examples

### Example 1: 1. Add the Order gRPC service

```protobuf
syntax = "proto3";

package shoppingorder;

option java_multiple_files = true;
option java_package = "shopping.order.proto";

// gRPC definition for ShoppingOrderService

service ShoppingOrderService {
  rpc Order(OrderRequest) returns (OrderResponse) {}
}

message OrderRequest {
  string cart_id = 1;
  repeated Item items = 2;
}

message Item {
  string item_id = 1;
  int32 quantity = 2;
}

message OrderResponse {
  bool ok = 1;
}
```

### Example 2: 1. Add the Order gRPC service

```shell
mvn compile
```

### Example 3: 1. Add the Order gRPC service

```shell
sbt compile
```

### Example 4: 1. Add the Order gRPC service

```java
package shopping.order;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.order.proto.Item;
import shopping.order.proto.OrderRequest;
import shopping.order.proto.OrderResponse;
import shopping.order.proto.ShoppingOrderService;

public final class ShoppingOrderServiceImpl implements ShoppingOrderService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<OrderResponse> order(OrderRequest in) {
    int total = 0;
    for (Item item : in.getItemsList()) {
      total += item.getQuantity();
    }
    logger.info("Order {} items from cart {}.", total, in.getCartId());
    OrderResponse response = OrderResponse.newBuilder().setOk(true).build();
    return CompletableFuture.completedFuture(response);
  }
}
```

### Example 5: 1. Add the Order gRPC service

```scala
package shopping.order

import org.slf4j.LoggerFactory
import shopping.order.proto.{ OrderRequest, OrderResponse }

import scala.concurrent.Future

class ShoppingOrderServiceImpl extends proto.ShoppingOrderService {

  private val logger = LoggerFactory.getLogger(getClass)

  override def order(in: OrderRequest): Future[OrderResponse] = {
    val totalNumberOfItems =
      in.items.iterator.map(_.quantity).sum
    logger.info("Order {} items from cart {}.", totalNumberOfItems, in.cartId)
    Future.successful(OrderResponse(ok = true))
  }
}
```

### Example 6: 1. Add the Order gRPC service

```java
package shopping.order;

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
import shopping.order.proto.ShoppingOrderService;
import shopping.order.proto.ShoppingOrderServiceHandlerFactory;

public final class ShoppingOrderServer {

  private ShoppingOrderServer() {}

  static void start(
      String host, int port, ActorSystem<?> system, ShoppingOrderService grpcService) {
    @SuppressWarnings("unchecked")
    Function<HttpRequest, CompletionStage<HttpResponse>> service =
        ServiceHandler.concatOrNotFound(
            ShoppingOrderServiceHandlerFactory.create(grpcService, system),
            // ServerReflection enabled to support grpcurl without import-path and proto parameters
            ServerReflection.create(
                Collections.singletonList(ShoppingOrderService.description), system));

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
                    "Shopping order at gRPC server {}:{}",
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

### Example 7: 1. Add the Order gRPC service

```scala
package shopping.order

import akka.actor.typed.ActorSystem
import akka.grpc.scaladsl.{ ServerReflection, ServiceHandler }
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ HttpRequest, HttpResponse }

import scala.concurrent.duration._
import scala.concurrent.{ ExecutionContext, Future }
import scala.util.{ Failure, Success }

object ShoppingOrderServer {

  def start(
      interface: String,
      port: Int,
      system: ActorSystem[_],
      grpcService: proto.ShoppingOrderService): Unit = {
    implicit val sys: ActorSystem[_] = system
    implicit val ec: ExecutionContext =
      system.executionContext

    val service: HttpRequest => Future[HttpResponse] =
      ServiceHandler.concatOrNotFound(
        proto.ShoppingOrderServiceHandler.partial(grpcService),
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.partial(List(proto.ShoppingOrderService)))

    val bound =
      Http()
        .newServerAt(interface, port)
        .bind(service)
        .map(_.addToCoordinatedShutdown(3.seconds))

    bound.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        system.log.info(
          "Shopping order at gRPC server {}:{}",
          address.getHostString,
          address.getPort)
      case Failure(ex) =>
        system.log.error("Failed to bind gRPC endpoint, terminating system", ex)
        system.terminate()
    }
  }

}
```

### Example 8: 1. Add the Order gRPC service

```java
package shopping.order;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.management.cluster.bootstrap.ClusterBootstrap;
import akka.management.javadsl.AkkaManagement;
import com.typesafe.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.order.proto.ShoppingOrderService;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) throws Exception {
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "ShoppingOrderService");
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

    Config config = system.settings().config();
    String grpcInterface = config.getString("shopping-order-service.grpc.interface");
    int grpcPort = config.getInt("shopping-order-service.grpc.port");
    ShoppingOrderService grpcService = new ShoppingOrderServiceImpl();
    ShoppingOrderServer.start(grpcInterface, grpcPort, system, grpcService);
  }
}
```

### Example 9: 1. Add the Order gRPC service

```scala
package shopping.order

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.management.cluster.bootstrap.ClusterBootstrap
import akka.management.scaladsl.AkkaManagement
import org.slf4j.LoggerFactory

import scala.util.control.NonFatal

object Main {

  val logger = LoggerFactory.getLogger("shopping.order.Main")

  def main(args: Array[String]): Unit = {
    val system = ActorSystem[Nothing](Behaviors.empty, "ShoppingOrderService")
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

    val grpcInterface =
      system.settings.config.getString("shopping-order-service.grpc.interface")
    val grpcPort =
      system.settings.config.getInt("shopping-order-service.grpc.port")
    val grpcService = new ShoppingOrderServiceImpl
    ShoppingOrderServer.start(grpcInterface, grpcPort, system, grpcService)
  }

}
```

### Example 10: 2. Create the Projection

```shell
mvn compile
```

### Example 11: 2. Create the Projection

```shell
sbt compile
```

### Example 12: 2. Create the Projection

```java
package shopping.cart;

import static akka.Done.done;

import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.r2dbc.javadsl.R2dbcHandler;
import akka.projection.r2dbc.javadsl.R2dbcSession;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.order.proto.Item;
import shopping.order.proto.OrderRequest;
import shopping.order.proto.ShoppingOrderService;

public final class SendOrderProjectionHandler
    extends R2dbcHandler<EventEnvelope<ShoppingCart.Event>> {

  private final Logger log = LoggerFactory.getLogger(getClass());
  private final ClusterSharding sharding;
  private final Duration timeout;
  private final ShoppingOrderService orderService;

  private final String slice;

  public SendOrderProjectionHandler(
      ActorSystem<?> system, ShoppingOrderService orderService, String slice) { (1)
    this.slice = slice;
    sharding = ClusterSharding.get(system);
    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    this.orderService = orderService;
  }

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, EventEnvelope<ShoppingCart.Event> envelope) {
    return envelope.event() instanceof ShoppingCart.CheckedOut checkedOut
        ? sendOrder(checkedOut)
        : CompletableFuture.completedFuture(done());
  }

  private CompletionStage<Done> sendOrder(ShoppingCart.CheckedOut checkout) {
    var entityRef = sharding.entityRefFor(ShoppingCart.ENTITY_KEY, checkout.cartId());
    var reply = entityRef.ask(ShoppingCart.Get::new, timeout);

    return reply.thenCompose(
        cart -> { (2)
          List<Item> protoItems =
              cart.items().entrySet().stream()
                  .map(
                      entry ->
                          Item.newBuilder()
                              .setItemId(entry.getKey())
                              .setQuantity(entry.getValue())
                              .build())
                  .collect(Collectors.toList());
          log.info(
              "Sending order of {} items for cart {}.", cart.items().size(), checkout.cartId());
          var orderRequest =
              OrderRequest.newBuilder()
                  .setCartId(checkout.cartId())
                  .addAllItems(protoItems)
                  .build();
          return orderService.order(orderRequest).thenApply(response -> done()); (3)
        });
  }
}
```

### Example 13: 2. Create the Projection

```scala
package shopping.cart

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.persistence.query.typed.EventEnvelope
import akka.projection.r2dbc.scaladsl.{ R2dbcHandler, R2dbcSession }
import akka.util.Timeout
import org.slf4j.LoggerFactory
import shopping.order.proto.{ Item, OrderRequest, ShoppingOrderService }

import scala.concurrent.{ ExecutionContext, Future }

class SendOrderProjectionHandler(
    system: ActorSystem[_],
    orderService: ShoppingOrderService) (1)
    extends R2dbcHandler[EventEnvelope[ShoppingCart.Event]] {
  private val log = LoggerFactory.getLogger(getClass)
  private implicit val ec: ExecutionContext =
    system.executionContext

  private val sharding = ClusterSharding(system)
  implicit private val timeout: Timeout =
    Timeout.create(
      system.settings.config.getDuration("shopping-cart-service.ask-timeout"))

  override def process(
      session: R2dbcSession,
      envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case checkout: ShoppingCart.CheckedOut =>
        sendOrder(checkout)

      case _ =>
        // this projection is only interested in CheckedOut events
        Future.successful(Done)
    }

  }

  private def sendOrder(checkout: ShoppingCart.CheckedOut): Future[Done] = {
    val entityRef =
      sharding.entityRefFor(ShoppingCart.EntityKey, checkout.cartId)
    entityRef.ask(ShoppingCart.Get).flatMap { cart => (2)
      val items =
        cart.items.iterator.map { case (itemId, quantity) =>
          Item(itemId, quantity)
        }.toList
      log.info(
        "Sending order of {} items for cart {}.",
        items.size,
        checkout.cartId)
      val orderReq = OrderRequest(checkout.cartId, items)
      orderService.order(orderReq).map(_ => Done) (3)
    }
  }

}
```

### Example 14: 3. Initialize the Projection

```java
package shopping.cart;

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
import akka.projection.javadsl.ExactlyOnceProjection;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import java.util.List;
import java.util.Optional;
import shopping.order.proto.ShoppingOrderService;

public class SendOrderProjection {

  private SendOrderProjection() {}

  public static void init(ActorSystem<?> system, ShoppingOrderService orderService) {
    ShardedDaemonProcess.get(system)
        .initWithContext(
            ProjectionBehavior.Command.class,
            "SendOrderProjection",
            4,
            daemonContext -> {
              List<Pair<Integer, Integer>> sliceRanges =
                  EventSourcedProvider.sliceRanges(
                      system, R2dbcReadJournal.Identifier(), daemonContext.totalProcesses());
              Pair<Integer, Integer> sliceRange = sliceRanges.get(daemonContext.processNumber());
              return ProjectionBehavior.create(createProjection(system, orderService, sliceRange));
            },
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static ExactlyOnceProjection<Offset, EventEnvelope<ShoppingCart.Event>> createProjection(
      ActorSystem<?> system,
      ShoppingOrderService shoppingOrderService,
      Pair<Integer, Integer> sliceRange) {

    int minSlice = sliceRange.first();
    int maxSlice = sliceRange.second();

    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
        EventSourcedProvider.eventsBySlices(
            system, R2dbcReadJournal.Identifier(), "ShoppingCart", minSlice, maxSlice);

    String slice = "carts-" + minSlice + "-" + maxSlice;
    Optional<R2dbcProjectionSettings> settings = Optional.empty();
    return R2dbcProjection.exactlyOnce(
        ProjectionId.of("SendOrderProjection", slice),
        settings,
        sourceProvider,
        () -> new SendOrderProjectionHandler(system, shoppingOrderService, slice),
        system);
  }
}
```

### Example 15: 3. Initialize the Projection

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
import shopping.order.proto.ShoppingOrderService

object SendOrderProjection {

  def init(system: ActorSystem[_], orderService: ShoppingOrderService): Unit = {

    def sourceProvider(sliceRange: Range)
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
      EventSourcedProvider.eventsBySlices[ShoppingCart.Event](
        system,
        readJournalPluginId = R2dbcReadJournal.Identifier,
        "ShoppingCart",
        sliceRange.min,
        sliceRange.max)

    def projection(
        sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
      val minSlice = sliceRange.min
      val maxSlice = sliceRange.max
      val projectionId =
        ProjectionId("SendOrderProjection", s"carts-$minSlice-$maxSlice")

      R2dbcProjection.atLeastOnce(
        projectionId,
        settings = None,
        sourceProvider(sliceRange),
        handler = () => new SendOrderProjectionHandler(system, orderService))(
        system)
    }

    ShardedDaemonProcess(system).initWithContext(
      name = "SendOrderProjection",
      initialNumberOfInstances = 4,
      behaviorFactory = { daemonContext =>
        val sliceRanges =
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

### Example 16: 3. Initialize the Projection

```java
public class Main {
  public static void main(String[] args) {
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "shopping-cart-service");
    try {
      init(system, orderServiceClient(system));
    } catch (Exception e) {
      logger.error("Terminating due to initialization failure.", e);
      system.terminate();
    }
  }

  public static void init(ActorSystem<Void> system, ShoppingOrderService orderService) {
    // ...
    SendOrderProjection.init(system, orderService); (1)
    // ...
  }

  static ShoppingOrderService orderServiceClient(ActorSystem<?> system) { (2)
    GrpcClientSettings orderServiceClientSettings =
        GrpcClientSettings.connectToServiceAt(
                system.settings().config().getString("shopping-order-service.host"),
                system.settings().config().getInt("shopping-order-service.port"),
                system)
            .withTls(false);

    return ShoppingOrderServiceClient.create(orderServiceClientSettings, system);
  }
}
```

### Example 17: 3. Initialize the Projection

```scala
// ...
def init(system: ActorSystem[_], orderService: ShoppingOrderService): Unit = {
  // ...
  SendOrderProjection.init(system, orderService) (1)
  // ...
}

protected def orderServiceClient( (2)
    system: ActorSystem[_]): ShoppingOrderService = {
  val orderServiceClientSettings =
    GrpcClientSettings
      .connectToServiceAt(
        system.settings.config.getString("shopping-order-service.host"),
        system.settings.config.getInt("shopping-order-service.port"))(system)
      .withTls(false)
  ShoppingOrderServiceClient(orderServiceClientSettings)(system)
}
```

### Example 18: 3. Initialize the Projection

```hocon
shopping-order-service.host = "localhost"
shopping-order-service.port = 8301
```

### Example 19: 4. Run locally

```shell
docker compose up -d
```

### Example 20: 4. Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 21: 4. Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 22: 4. Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 23: 4. Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 24: 4.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "items":[{"itemId":"socks", "quantity":3}, {"itemId":"t-shirt", "quantity":2}]}' -plaintext 127.0.0.1:8301 shoppingorder.ShoppingOrderService.Order
```

### Example 25: 4.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"scissors", "quantity":1}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 26: 4.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

### Example 27: 4.2. Stop the service

```shell
docker compose stop
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-grpc/current/client/index.html
- https://doc.akka.io/libraries/akka-projection/current/
- https://doc.akka.io/libraries/guide/concepts/akka-grpc.html
- https://doc.akka.io/libraries/guide/concepts/internal-and-external-communication.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/5-shopping-cart-projection-s2s-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/5-shopping-cart-projection-s2s-scala.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/6-shopping-cart-complete-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/6-shopping-cart-complete-scala.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/grpc-service.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/overview.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/projection-query.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/template.html

---
*Source: [https://doc.akka.io/libraries/guide/microservices-tutorial/projection-grpc-client.html](https://doc.akka.io/libraries/guide/microservices-tutorial/projection-grpc-client.html)*
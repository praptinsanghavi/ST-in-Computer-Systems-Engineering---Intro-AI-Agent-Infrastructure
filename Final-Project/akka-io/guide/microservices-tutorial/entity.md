---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:56Z'
section: guide
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/entity.html
title: 'Section 4: Create the Event Sourced Cart entity :: Akka Guide'
---

# Section 4: Create the Event Sourced Cart entity :: Akka Guide

## Content

# Section 4: Create the Event Sourced Cart entity

Language

Next, we will create the Cart entity that manages the state for each shopping cart. The architectural overview shows how the entity is related to the Cart service. The Cart entity will use Event Sourcing to persist events that capture changes to the Cart’s state. The entity writes events to the event journal, which we will use later to create projections:

![Example entity](_images/example-entity.drawio.svg)

For now, we’ll implement the command to add items to the Cart. In the next part of the tutorial, we will expand it to handle more commands and events. On this page you will learn how to:

- implement an Event Sourced entity
- unit test the entity
- distribute the entities over the nodes in the Akka Cluster
- send requests from the gRPC service implementation to the entities

If you are unfamiliar with Event Sourcing, refer to the [Event Sourcing](../concepts/event-sourcing.html) section for an explanation.
The [Event Sourcing with Akka 2\.6 video ![new tab](../_images/new-tab.svg)](https://akka.io/blog/news/2020/01/07/akka-event-sourcing-video) is also a good starting point for learning Event Sourcing.

This example is using PostgreSQL for storing the events. An alternative is described in [Use Cassandra instead of PostgreSQL](../how-to/cassandra-alternative.html).

## Source downloads

If you prefer to simply view and run the example, download a zip file containing the completed code:

Java

- [Source](_attachments/1-shopping-cart-grpc-java.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/2-shopping-cart-event-sourced-java.zip) with the steps on this page completed.

Scala

- [Source](_attachments/1-shopping-cart-grpc-scala.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/2-shopping-cart-event-sourced-scala.zip) with the steps on this page completed.

## 1\. Add commands and events

Commands are the "external" API of an entity. Entity state can only be changed by commands. The results of commands are emitted as events. A command can request state changes, but different events might be generated depending on the current state of the entity. A command can also be validated and be rejected if it has invalid input or can’t be handled by current state of the entity.

To add a command and an event, follow these steps:

1. Define a `ShoppingCart` object and the `AddItem` command: Define a `ShoppingCart` class extending `EventSourcedBehaviorWithEnforcedReplies` and the `AddItem` command:

Java

src/main/java/shopping/cart/ShoppingCart.java:

```
package shopping.cart;

import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.Behaviors;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.Entity;
import akka.cluster.sharding.typed.javadsl.EntityTypeKey;
import akka.pattern.StatusReply;
import akka.persistence.typed.PersistenceId;
import akka.persistence.typed.javadsl.*;
import akka.serialization.jackson.CborSerializable;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  public sealed interface Command extends CborSerializable {}

  /**
   * A command to add an item to the cart.
   *
   * <p>It replies with `StatusReply<Summary>`, which is sent back to the caller when all the
   * events emitted by this command are successfully persisted.
   */
  record AddItem(String itemId, int quantity, ActorRef<StatusReply<Summary>> replyTo)
      implements Command {}

  /** Summary of the shopping cart state, used in reply messages. */
  public record Summary(Map<String, Integer> items) implements CborSerializable {}

}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala:

```
package shopping.cart

import akka.actor.typed.ActorRef
import akka.actor.typed.ActorSystem
import akka.actor.typed.Behavior
import akka.actor.typed.SupervisorStrategy
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.Entity
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.pattern.StatusReply
import akka.persistence.typed.PersistenceId
import akka.persistence.typed.scaladsl.Effect
import akka.persistence.typed.scaladsl.EventSourcedBehavior
import akka.persistence.typed.scaladsl.ReplyEffect
import akka.persistence.typed.scaladsl.RetentionCriteria
import akka.serialization.jackson.CborSerializable

import scala.concurrent.duration._

object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  sealed trait Command extends CborSerializable

  /**
   * A command to add an item to the cart.
   *
   * It replies with `StatusReply[Summary]`, which is sent back to the caller when
   * all the events emitted by this command are successfully persisted.
   */
  final case class AddItem(
      itemId: String,
      quantity: Int,
      replyTo: ActorRef[StatusReply[Summary]])
      extends Command

  /**
   * Summary of the shopping cart state, used in reply messages.
   */
  final case class Summary(items: Map[String, Int]) extends CborSerializable
}
```

2. Add a corresponding `ItemAdded` event:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  public sealed interface Event extends CborSerializable {
    String cartId();
  }

  record ItemAdded(String cartId, String itemId, int quantity) implements Event {}

}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  sealed trait Event extends CborSerializable {
    def cartId: String
  }

  final case class ItemAdded(cartId: String, itemId: String, quantity: Int)
      extends Event
}
```

## 2\. Add state map

Items added to the Cart are added to a `Map`. The contents of the `Map` comprise the Cart’s state. Add the `Map` to the `ShoppingCart` object class as shown:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  public record State(Map<String, Integer> items) implements CborSerializable {
    public State() {
      this(new HashMap<>());
    }

    public boolean hasItem(String itemId) {
      return items.containsKey(itemId);
    }

    public State updateItem(String itemId, int quantity) {
      Map<String, Integer> updatedItems = new HashMap<>(this.items);
      if (quantity == 0) {
        updatedItems.remove(itemId);
      } else {
        updatedItems.put(itemId, quantity);
      }
      return new State(updatedItems);
    }

    public Summary toSummary() {
      return new Summary(items);
    }

    public int itemCount(String itemId) {
      return items.get(itemId);
    }

    public boolean isEmpty() {
      return items.isEmpty();
    }
  }

}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */

  final case class State(items: Map[String, Int]) extends CborSerializable {

    def hasItem(itemId: String): Boolean =
      items.contains(itemId)

    def isEmpty: Boolean =
      items.isEmpty

    def updateItem(itemId: String, quantity: Int): State = {
      quantity match {
        case 0 => copy(items = items - itemId)
        case _ => copy(items = items + (itemId -> quantity))
      }
    }
  }
  object State {
    val empty =
      State(items = Map.empty)
  }
}
```

## 3\. Implement a command handler

The Cart entity will receive commands that request changes to Cart state. We will implement a command handler to process these commands and emit a reply. Our business logic allows only items to be added which are not in the cart yet and require a positive quantity.

Implement the Event Sourced entity with the `EventSourcedBehavior`. Define the command handlers:
Implement the `commandHandler` as required by `EventSourcedBehaviorWithEnforcedReplies`:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  @Override
  public CommandHandlerWithReply<Command, Event, State> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Event, State> builder =
        newCommandHandlerWithReplyBuilder();
    builder.forAnyState().onCommand(AddItem.class, this::onAddItem); (1)
    return builder.build();
  }

  private ReplyEffect<Event, State> onAddItem(State state, AddItem cmd) {
    if (state.hasItem(cmd.itemId)) {
      return Effect()
          .reply(
              cmd.replyTo,
              StatusReply.error(
                  "Item '" + cmd.itemId + "' was already added to this shopping cart"));
    } else if (cmd.quantity <= 0) {
      return Effect().reply(cmd.replyTo, StatusReply.error("Quantity must be greater than zero"));
    } else {
      return Effect() (2)
          .persist(new ItemAdded(cartId, cmd.itemId, cmd.quantity))
          .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
    }
  }

}
```

| **1** | Matching the `AddItem` command. |
| --- | --- |
| **2** | Persisting the `ItemAdded` event and replying to the sender. |

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  private def handleCommand(
      cartId: String,
      state: State,
      command: Command): ReplyEffect[Event, State] = {
    command match {
      case AddItem(itemId, quantity, replyTo) => (1)
        if (state.hasItem(itemId))
          Effect.reply(replyTo)(
            StatusReply.Error(
              s"Item '$itemId' was already added to this shopping cart"))
        else if (quantity <= 0)
          Effect.reply(replyTo)(
            StatusReply.Error("Quantity must be greater than zero"))
        else
          Effect
            .persist(ItemAdded(cartId, itemId, quantity)) (2)
            .thenReply(replyTo) { updatedCart =>
              StatusReply.Success(Summary(updatedCart.items))
            }
    }
  }
}
```

| **1** | Matching the `AddItem` command. |
| --- | --- |
| **2** | Persisting the `ItemAdded` event and replying to the sender. |

If an `AddItem` command is accepted, the `Effect.persist` applies an event to the cart’s state and makes sure this event is stored before replying to the command. The returned `ReplyEffect` reacts on the commands by deciding which effect they should have on the entity. If the validation fails we want to send back an error message. The reply can be a success or an error and that is the reason for using the `StatusReply`.

See all available effects in the [Akka reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html#effects-and-side-effects).

## 4\. Add the event handler

From commands, the entity creates events that represent state changes. Aligning with the command handler above, the entity’s event handler reacts to events and updates the state. The events are continuously persisted to the Event Journal datastore, while the entity state is kept in memory. Other parts of the application may listen to the events. In case of a restart, the entity recovers its latest state by replaying the events from the Event Journal.

Notice that there are no decisions on events, they are applied without any checking.

Add the event handler as follows:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  @Override
  public EventHandler<State, Event> eventHandler() {
    return newEventHandlerBuilder()
        .forAnyState()
        .onEvent(ItemAdded.class, (state, evt) -> state.updateItem(evt.itemId, evt.quantity))
        .build();
  }
}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  private def handleEvent(state: State, event: Event): State = {
    event match {
      case ItemAdded(_, itemId, quantity) =>
        state.updateItem(itemId, quantity)
    }
  }
}
```

## 5\. Add initialization

To glue the command handler, event handler, and state together, we need some initialization code. Our code will distribute the Cart entities over nodes in the Akka Cluster with [Cluster Sharding ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/cluster-sharding.html), enable snapshots to reduce recovery time when the entity is started, and restart with backoff in the case of failure.

Java

src/main/java/shopping/cart/ShoppingCart.java

```
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  static final EntityTypeKey<Command> ENTITY_KEY =
      EntityTypeKey.create(Command.class, "ShoppingCart");

  private final String cartId;

  public static void init(ActorSystem<?> system) {
    ClusterSharding.get(system)
        .init(
            Entity.of(
                ENTITY_KEY,
                entityContext -> { (1)
                  return ShoppingCart.create(entityContext.getEntityId());
                }));
  }

  public static Behavior<Command> create(String cartId) {
    return Behaviors.setup(
        ctx ->
            EventSourcedBehavior (2)
                .start(new ShoppingCart(cartId), ctx));
  }

  @Override
  public RetentionCriteria retentionCriteria() { (3)
    return RetentionCriteria.snapshotEvery(100);
  }

  private ShoppingCart(String cartId) {
    super(
        PersistenceId.of(ENTITY_KEY.name(), cartId),
        SupervisorStrategy (4)
            .restartWithBackoff(Duration.ofMillis(200), Duration.ofSeconds(5), 0.1));
    this.cartId = cartId;
  }

  @Override
  public State emptyState() {
    return new State();
  }

}
```

| **1** | The entities are distributed over the nodes in the Akka Cluster with Cluster Sharding. |
| --- | --- |
| **2** | An `EventSourcedBehavior` is created for the `ShoppingCart`. |
| **3** | Snapshotting is an optimization to reduce recovery when the entity is started. |
| **4** | Restarting with backoff in case of failures. |

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  val EntityKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("ShoppingCart")

  def init(system: ActorSystem[_]): Unit = {
    ClusterSharding(system).init(
      Entity(EntityKey)(entityContext => (1)
        ShoppingCart(entityContext.entityId)))
  }

  def apply(cartId: String): Behavior[Command] = {
    EventSourcedBehavior (2)
      .withEnforcedReplies[Command, Event, State](
        persistenceId = PersistenceId(EntityKey.name, cartId),
        emptyState = State.empty,
        commandHandler =
          (state, command) => handleCommand(cartId, state, command),
        eventHandler = (state, event) => handleEvent(state, event))
      .withRetention(
        RetentionCriteria.snapshotEvery(numberOfEvents = 100)
      ) (3)
      .onPersistFailure(
        SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1)
      ) (4)
  }
}
```

| **1** | The entities are distributed over the nodes in the Akka Cluster with Cluster Sharding. |
| --- | --- |
| **2** | Command and event handler are defined with the `EventSourcedBehavior`. |
| **3** | Snapshotting is an optimization to reduce recovery when the entity is started. |
| **4** | Restarting with backoff in case of failures. |

Then we need to call `ShoppingCart.init` from `Main`. Add the following before the gRPC `ShoppingCartServer` initialization:

Java

src/main/java/shopping/cart/Main.java:

```
ShoppingCart.init(system);
```

Scala

src/main/scala/shopping/cart/Main.scala:

```
ShoppingCart.init(system)
```

Verify that everything compiles with:

```
sbt compile
```

```
mvn compile
```

## 6\. Unit testing

To test the `ShoppingCart` entity we can write a unit test using the `EventSourcedBehaviorTestKit` `TestKitJunitResource`.

A test for the `AddItem` command looks like this in `src/test/scala/shopping/cart/ShoppingCartSpec.scala` `src/test/java/shopping/cart/ShoppingCartTest.java`:

Java

src/test/java/shopping/cart/ShoppingCartTest.java:

```
package shopping.cart;

import static akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.CommandResultWithReply;
import static org.junit.Assert.*;

import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.pattern.StatusReply;
import akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

public class ShoppingCartTest {

  private static final String CART_ID = "testCart";

  @ClassRule
  public static final TestKitJunitResource testKit =
      new TestKitJunitResource(EventSourcedBehaviorTestKit.config());

  private EventSourcedBehaviorTestKit<ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State>
      eventSourcedTestKit =
          EventSourcedBehaviorTestKit.create(testKit.system(), ShoppingCart.create(CART_ID));

  @Before
  public void beforeEach() {
    eventSourcedTestKit.clear();
  }

  @Test
  public void addAnItemToCart() {
    CommandResultWithReply<
            ShoppingCart.Command,
            ShoppingCart.Event,
            ShoppingCart.State,
            StatusReply<ShoppingCart.Summary>>
        result =
            eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
    assertTrue(result.reply().isSuccess());
    ShoppingCart.Summary summary = result.reply().getValue();
    assertEquals(1, summary.items().size());
    assertEquals(42, summary.items().get("foo").intValue());
    assertEquals(new ShoppingCart.ItemAdded(CART_ID, "foo", 42), result.event());
  }

  @Test
  public void rejectAlreadyAddedItem() {
    CommandResultWithReply<
            ShoppingCart.Command,
            ShoppingCart.Event,
            ShoppingCart.State,
            StatusReply<ShoppingCart.Summary>>
        result1 =
            eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
    assertTrue(result1.reply().isSuccess());
    CommandResultWithReply<
            ShoppingCart.Command,
            ShoppingCart.Event,
            ShoppingCart.State,
            StatusReply<ShoppingCart.Summary>>
        result2 =
            eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
    assertTrue(result2.reply().isError());
    assertTrue(result2.hasNoEvents());
  }
}
```

Scala

src/test/scala/shopping/cart/ShoppingCartSpec.scala

```
package shopping.cart

import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.pattern.StatusReply
import akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit
import org.scalatest.BeforeAndAfterEach
import org.scalatest.wordspec.AnyWordSpecLike

object ShoppingCartSpec {
  val config = EventSourcedBehaviorTestKit.config

  def summary(items: Map[String, Int]) =
    ShoppingCart.Summary(items)
}

class ShoppingCartSpec
    extends ScalaTestWithActorTestKit(ShoppingCartSpec.config)
    with AnyWordSpecLike
    with BeforeAndAfterEach {

  import ShoppingCartSpec._

  private val cartId = "testCart"

  private val eventSourcedTestKit =
    EventSourcedBehaviorTestKit[
      ShoppingCart.Command,
      ShoppingCart.Event,
      ShoppingCart.State](system, ShoppingCart("testCart"))

  override protected def beforeEach(): Unit = {
    super.beforeEach()
    eventSourcedTestKit.clear()
  }

  "The Shopping Cart" should {

    "add item" in {
      val result1 =
        eventSourcedTestKit.runCommand[StatusReply[ShoppingCart.Summary]](
          replyTo => ShoppingCart.AddItem("foo", 42, replyTo))
      result1.reply should ===(StatusReply.Success(summary(Map("foo" -> 42))))
      result1.event should ===(ShoppingCart.ItemAdded(cartId, "foo", 42))
    }
  }

}
```

Run the test with:

```
sbt test
```

```
mvn test
```

You can learn more about the `EventSourcedBehaviorTestKit` `TestKitJunitResource` in the [Akka reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/persistence-testing.html#unit-testing)

## 7\. Send commands to the entities

We want to send commands to the entities from the gRPC service implementation. In the [previous step](grpc-service.html), we wrote a dummy implementation of `addItem` in the `ShoppingCartServiceImpl`. We can now replace that and send `ShoppingCart.AddItem` commands from `ShoppingCartServiceImpl`:

Java

src/main/java/shopping/cart/ShoppingCartServiceImpl.java:

```
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.grpc.GrpcServiceException;
import io.grpc.Status;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.*;

public final class ShoppingCartServiceImpl implements ShoppingCartService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  private final Duration timeout;
  private final ClusterSharding sharding;

  public ShoppingCartServiceImpl(ActorSystem<?> system) {
    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    sharding = ClusterSharding.get(system);
  }

  @Override
  public CompletionStage<Cart> addItem(AddItemRequest in) {
    logger.info("addItem {} to cart {}", in.getItemId(), in.getCartId());
    var entityRef = sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(
            replyTo -> new ShoppingCart.AddItem(in.getItemId(), in.getQuantity(), replyTo),
            timeout);
    var cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  private static Cart toProtoCart(ShoppingCart.Summary cart) {
    List<Item> protoItems =
        cart.items().entrySet().stream()
            .map(
                entry ->
                    Item.newBuilder()
                        .setItemId(entry.getKey())
                        .setQuantity(entry.getValue())
                        .build())
            .collect(Collectors.toList());

    return Cart.newBuilder().addAllItems(protoItems).build();
  }

  private static <T> CompletionStage<T> convertError(CompletionStage<T> response) {
    return response.exceptionally(
        ex -> {
          if (ex instanceof TimeoutException) {
            throw new GrpcServiceException(
                Status.UNAVAILABLE.withDescription("Operation timed out"));
          } else {
            throw new GrpcServiceException(
                Status.INVALID_ARGUMENT.withDescription(ex.getMessage()));
          }
        });
  }
}
```

Scala

src/main/scala/shopping/cart/ShoppingCartServiceImpl.scala:

```
package shopping.cart

import java.util.concurrent.TimeoutException

import scala.concurrent.Future

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.grpc.GrpcServiceException
import akka.util.Timeout
import io.grpc.Status
import org.slf4j.LoggerFactory

class ShoppingCartServiceImpl(system: ActorSystem[_])
    extends proto.ShoppingCartService {
  import system.executionContext

  private val logger = LoggerFactory.getLogger(getClass)

  implicit private val timeout: Timeout =
    Timeout.create(
      system.settings.config.getDuration("shopping-cart-service.ask-timeout"))

  private val sharding = ClusterSharding(system)

  override def addItem(in: proto.AddItemRequest): Future[proto.Cart] = {
    logger.info("addItem {} to cart {}", in.itemId, in.cartId)
    val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
    val reply: Future[ShoppingCart.Summary] =
      entityRef.askWithStatus(ShoppingCart.AddItem(in.itemId, in.quantity, _))
    val response = reply.map(cart => toProtoCart(cart))
    convertError(response)
  }

  private def toProtoCart(cart: ShoppingCart.Summary): proto.Cart = {
    proto.Cart(cart.items.iterator.map { case (itemId, quantity) =>
      proto.Item(itemId, quantity)
    }.toSeq)
  }

  private def convertError[T](response: Future[T]): Future[T] = {
    response.recoverWith {
      case _: TimeoutException =>
        Future.failed(
          new GrpcServiceException(
            Status.UNAVAILABLE.withDescription("Operation timed out")))
      case exc =>
        Future.failed(
          new GrpcServiceException(
            Status.INVALID_ARGUMENT.withDescription(exc.getMessage)))
    }
  }

}
```

If the command is successful, the entity will reply with `StatusReply.Success` with the updated `ShoppingCart.Summary`. If the validation in the entity fails it will reply with `StatusReply.Error`, which will fail the `Future` `CompletionStage` that is returned from `askWithStatus`.

Also, we added an `ActorSystem` parameter to the constructor of `ShoppingCartServiceImpl`. Edit `Main` to include the `system` as the parameter when creating a new instance of the `ShoppingCartServiceImpl`.

## 8\. Configure Postgres

The events are stored in a PostgreSQL database and the template project includes configuration for that in the `src/main/resources/persistence.conf` file. We have to enable this configuration by including `persistence.conf` in `application.conf`:

```
include "persistence"
```

## 9\. Run locally

To run the service, we first need to start the PostgreSQL to persist the events. Then we can run the service:

1. From the root project directory, run the following command:

```
docker compose up -d
```

This command will build and run the containers. The `-d` flag starts the containers in detached mode. Containers started in detached mode exit when the root process used to run the container exits
2. Create the PostgreSQL tables from the SQL script located inside the `ddl-scripts` at the root of the project:

```
docker exec -i postgres-db psql -U shopping-cart -t < ddl-scripts/create_tables.sql
```

It creates all tables needed for Akka Persistence as well as the offset store table for Akka Projection.
3. Run the service with:

```
sbt -Dconfig.resource=local1.conf run
```

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### 9\.1\. Exercise the service

Use `[grpcurl](https://github.com/fullstorydev/grpcurl)` to exercise the service:

1. Use `grpcurl` to add 3 socks to a cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
2. Test the validation logic by trying to add the same item again, which should result in an error:

```
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
3. To verify that the events are actually saved, and the state can be recovered from the events you can stop the service with `ctrl-c` and then start it again.
4. Add 2 t\-shirts to the same cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

The returned updated cart should still contain the 3 socks.

### 9\.2\. Exercise with multiple service instances

Another fun experiment is to start several instances of the service on different ports (2552, 2553\) and then interact with different carts via the different gRPC servers (gRPC ports 8101, 8102, 8103\). To do this, you can use the other provided configuration files:

1. In a new terminal, start a second instance with local configuration \#2:

```
sbt -Dconfig.resource=local2.conf run
```

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local2.conf
```
2. Within another terminal, start a third instance with local configuration \#3:

```
sbt -Dconfig.resource=local3.conf run
```

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local3.conf
```

### 9\.3\. Stop the service

When finished, stop the service with `ctrl-c`. Leave the PostgreSQL running for the next set of steps, or stop it with:

```
docker compose stop
```

## Learn more

- [Event Sourcing concepts](../concepts/event-sourcing.html).
- [Akka Event Sourcing reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html).
- [Akka Cluster Sharding reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html).
- [Use Cassandra instead of PostgreSQL](../how-to/cassandra-alternative.html)

## Code Examples

### Example 1: 1. Add commands and events

```java
package shopping.cart;

import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.Behaviors;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.Entity;
import akka.cluster.sharding.typed.javadsl.EntityTypeKey;
import akka.pattern.StatusReply;
import akka.persistence.typed.PersistenceId;
import akka.persistence.typed.javadsl.*;
import akka.serialization.jackson.CborSerializable;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  public sealed interface Command extends CborSerializable {}

  /**
   * A command to add an item to the cart.
   *
   * <p>It replies with `StatusReply&lt;Summary&gt;`, which is sent back to the caller when all the
   * events emitted by this command are successfully persisted.
   */
  record AddItem(String itemId, int quantity, ActorRef<StatusReply<Summary>> replyTo)
      implements Command {}

  /** Summary of the shopping cart state, used in reply messages. */
  public record Summary(Map<String, Integer> items) implements CborSerializable {}

}
```

### Example 2: 1. Add commands and events

```scala
package shopping.cart

import akka.actor.typed.ActorRef
import akka.actor.typed.ActorSystem
import akka.actor.typed.Behavior
import akka.actor.typed.SupervisorStrategy
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.Entity
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.pattern.StatusReply
import akka.persistence.typed.PersistenceId
import akka.persistence.typed.scaladsl.Effect
import akka.persistence.typed.scaladsl.EventSourcedBehavior
import akka.persistence.typed.scaladsl.ReplyEffect
import akka.persistence.typed.scaladsl.RetentionCriteria
import akka.serialization.jackson.CborSerializable

import scala.concurrent.duration._

object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  sealed trait Command extends CborSerializable

  /**
   * A command to add an item to the cart.
   *
   * It replies with `StatusReply[Summary]`, which is sent back to the caller when
   * all the events emitted by this command are successfully persisted.
   */
  final case class AddItem(
      itemId: String,
      quantity: Int,
      replyTo: ActorRef[StatusReply[Summary]])
      extends Command

  /**
   * Summary of the shopping cart state, used in reply messages.
   */
  final case class Summary(items: Map[String, Int]) extends CborSerializable
}
```

### Example 3: 1. Add commands and events

```java
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  public sealed interface Event extends CborSerializable {
    String cartId();
  }

  record ItemAdded(String cartId, String itemId, int quantity) implements Event {}

}
```

### Example 4: 1. Add commands and events

```scala
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  sealed trait Event extends CborSerializable {
    def cartId: String
  }

  final case class ItemAdded(cartId: String, itemId: String, quantity: Int)
      extends Event
}
```

### Example 5: 2. Add state map

```java
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  public record State(Map<String, Integer> items) implements CborSerializable {
    public State() {
      this(new HashMap<>());
    }

    public boolean hasItem(String itemId) {
      return items.containsKey(itemId);
    }

    public State updateItem(String itemId, int quantity) {
      Map<String, Integer> updatedItems = new HashMap<>(this.items);
      if (quantity == 0) {
        updatedItems.remove(itemId);
      } else {
        updatedItems.put(itemId, quantity);
      }
      return new State(updatedItems);
    }

    public Summary toSummary() {
      return new Summary(items);
    }

    public int itemCount(String itemId) {
      return items.get(itemId);
    }

    public boolean isEmpty() {
      return items.isEmpty();
    }
  }

}
```

### Example 6: 2. Add state map

```scala
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */

  final case class State(items: Map[String, Int]) extends CborSerializable {

    def hasItem(itemId: String): Boolean =
      items.contains(itemId)

    def isEmpty: Boolean =
      items.isEmpty

    def updateItem(itemId: String, quantity: Int): State = {
      quantity match {
        case 0 => copy(items = items - itemId)
        case _ => copy(items = items + (itemId -> quantity))
      }
    }
  }
  object State {
    val empty =
      State(items = Map.empty)
  }
}
```

### Example 7: 3. Implement a command handler

```java
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  @Override
  public CommandHandlerWithReply<Command, Event, State> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Event, State> builder =
        newCommandHandlerWithReplyBuilder();
    builder.forAnyState().onCommand(AddItem.class, this::onAddItem); (1)
    return builder.build();
  }

  private ReplyEffect<Event, State> onAddItem(State state, AddItem cmd) {
    if (state.hasItem(cmd.itemId)) {
      return Effect()
          .reply(
              cmd.replyTo,
              StatusReply.error(
                  "Item '" + cmd.itemId + "' was already added to this shopping cart"));
    } else if (cmd.quantity <= 0) {
      return Effect().reply(cmd.replyTo, StatusReply.error("Quantity must be greater than zero"));
    } else {
      return Effect() (2)
          .persist(new ItemAdded(cartId, cmd.itemId, cmd.quantity))
          .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
    }
  }

}
```

### Example 8: 3. Implement a command handler

```scala
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  private def handleCommand(
      cartId: String,
      state: State,
      command: Command): ReplyEffect[Event, State] = {
    command match {
      case AddItem(itemId, quantity, replyTo) => (1)
        if (state.hasItem(itemId))
          Effect.reply(replyTo)(
            StatusReply.Error(
              s"Item '$itemId' was already added to this shopping cart"))
        else if (quantity <= 0)
          Effect.reply(replyTo)(
            StatusReply.Error("Quantity must be greater than zero"))
        else
          Effect
            .persist(ItemAdded(cartId, itemId, quantity)) (2)
            .thenReply(replyTo) { updatedCart =>
              StatusReply.Success(Summary(updatedCart.items))
            }
    }
  }
}
```

### Example 9: 4. Add the event handler

```java
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  // ...
  @Override
  public EventHandler<State, Event> eventHandler() {
    return newEventHandlerBuilder()
        .forAnyState()
        .onEvent(ItemAdded.class, (state, evt) -> state.updateItem(evt.itemId, evt.quantity))
        .build();
  }
}
```

### Example 10: 4. Add the event handler

```scala
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  private def handleEvent(state: State, event: Event): State = {
    event match {
      case ItemAdded(_, itemId, quantity) =>
        state.updateItem(itemId, quantity)
    }
  }
}
```

### Example 11: 5. Add initialization

```java
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {
  static final EntityTypeKey<Command> ENTITY_KEY =
      EntityTypeKey.create(Command.class, "ShoppingCart");

  private final String cartId;

  public static void init(ActorSystem<?> system) {
    ClusterSharding.get(system)
        .init(
            Entity.of(
                ENTITY_KEY,
                entityContext -> { (1)
                  return ShoppingCart.create(entityContext.getEntityId());
                }));
  }

  public static Behavior<Command> create(String cartId) {
    return Behaviors.setup(
        ctx ->
            EventSourcedBehavior (2)
                .start(new ShoppingCart(cartId), ctx));
  }

  @Override
  public RetentionCriteria retentionCriteria() { (3)
    return RetentionCriteria.snapshotEvery(100);
  }

  private ShoppingCart(String cartId) {
    super(
        PersistenceId.of(ENTITY_KEY.name(), cartId),
        SupervisorStrategy (4)
            .restartWithBackoff(Duration.ofMillis(200), Duration.ofSeconds(5), 0.1));
    this.cartId = cartId;
  }

  @Override
  public State emptyState() {
    return new State();
  }

}
```

### Example 12: 5. Add initialization

```scala
object ShoppingCart {

  /**
   * The current state held by the `EventSourcedBehavior`.
   */
  val EntityKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("ShoppingCart")

  def init(system: ActorSystem[_]): Unit = {
    ClusterSharding(system).init(
      Entity(EntityKey)(entityContext => (1)
        ShoppingCart(entityContext.entityId)))
  }

  def apply(cartId: String): Behavior[Command] = {
    EventSourcedBehavior (2)
      .withEnforcedReplies[Command, Event, State](
        persistenceId = PersistenceId(EntityKey.name, cartId),
        emptyState = State.empty,
        commandHandler =
          (state, command) => handleCommand(cartId, state, command),
        eventHandler = (state, event) => handleEvent(state, event))
      .withRetention(
        RetentionCriteria.snapshotEvery(numberOfEvents = 100)
      ) (3)
      .onPersistFailure(
        SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1)
      ) (4)
  }
}
```

### Example 13: 5. Add initialization

```java
ShoppingCart.init(system);
```

### Example 14: 5. Add initialization

```scala
ShoppingCart.init(system)
```

### Example 15: 5. Add initialization

```shell
sbt compile
```

### Example 16: 5. Add initialization

```shell
mvn compile
```

### Example 17: 6. Unit testing

```java
package shopping.cart;

import static akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.CommandResultWithReply;
import static org.junit.Assert.*;

import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.pattern.StatusReply;
import akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

public class ShoppingCartTest {

  private static final String CART_ID = "testCart";

  @ClassRule
  public static final TestKitJunitResource testKit =
      new TestKitJunitResource(EventSourcedBehaviorTestKit.config());

  private EventSourcedBehaviorTestKit<ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State>
      eventSourcedTestKit =
          EventSourcedBehaviorTestKit.create(testKit.system(), ShoppingCart.create(CART_ID));

  @Before
  public void beforeEach() {
    eventSourcedTestKit.clear();
  }

  @Test
  public void addAnItemToCart() {
    CommandResultWithReply<
            ShoppingCart.Command,
            ShoppingCart.Event,
            ShoppingCart.State,
            StatusReply<ShoppingCart.Summary>>
        result =
            eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
    assertTrue(result.reply().isSuccess());
    ShoppingCart.Summary summary = result.reply().getValue();
    assertEquals(1, summary.items().size());
    assertEquals(42, summary.items().get("foo").intValue());
    assertEquals(new ShoppingCart.ItemAdded(CART_ID, "foo", 42), result.event());
  }

  @Test
  public void rejectAlreadyAddedItem() {
    CommandResultWithReply<
            ShoppingCart.Command,
            ShoppingCart.Event,
            ShoppingCart.State,
            StatusReply<ShoppingCart.Summary>>
        result1 =
            eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
    assertTrue(result1.reply().isSuccess());
    CommandResultWithReply<
            ShoppingCart.Command,
            ShoppingCart.Event,
            ShoppingCart.State,
            StatusReply<ShoppingCart.Summary>>
        result2 =
            eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
    assertTrue(result2.reply().isError());
    assertTrue(result2.hasNoEvents());
  }
}
```

### Example 18: 6. Unit testing

```scala
package shopping.cart

import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.pattern.StatusReply
import akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit
import org.scalatest.BeforeAndAfterEach
import org.scalatest.wordspec.AnyWordSpecLike

object ShoppingCartSpec {
  val config = EventSourcedBehaviorTestKit.config

  def summary(items: Map[String, Int]) =
    ShoppingCart.Summary(items)
}

class ShoppingCartSpec
    extends ScalaTestWithActorTestKit(ShoppingCartSpec.config)
    with AnyWordSpecLike
    with BeforeAndAfterEach {

  import ShoppingCartSpec._

  private val cartId = "testCart"

  private val eventSourcedTestKit =
    EventSourcedBehaviorTestKit[
      ShoppingCart.Command,
      ShoppingCart.Event,
      ShoppingCart.State](system, ShoppingCart("testCart"))

  override protected def beforeEach(): Unit = {
    super.beforeEach()
    eventSourcedTestKit.clear()
  }

  "The Shopping Cart" should {

    "add item" in {
      val result1 =
        eventSourcedTestKit.runCommand[StatusReply[ShoppingCart.Summary]](
          replyTo => ShoppingCart.AddItem("foo", 42, replyTo))
      result1.reply should ===(StatusReply.Success(summary(Map("foo" -> 42))))
      result1.event should ===(ShoppingCart.ItemAdded(cartId, "foo", 42))
    }
  }

}
```

### Example 19: 6. Unit testing

```shell
sbt test
```

### Example 20: 6. Unit testing

```shell
mvn test
```

### Example 21: 7. Send commands to the entities

```java
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.grpc.GrpcServiceException;
import io.grpc.Status;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.*;

public final class ShoppingCartServiceImpl implements ShoppingCartService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  private final Duration timeout;
  private final ClusterSharding sharding;

  public ShoppingCartServiceImpl(ActorSystem<?> system) {
    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    sharding = ClusterSharding.get(system);
  }

  @Override
  public CompletionStage<Cart> addItem(AddItemRequest in) {
    logger.info("addItem {} to cart {}", in.getItemId(), in.getCartId());
    var entityRef = sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(
            replyTo -> new ShoppingCart.AddItem(in.getItemId(), in.getQuantity(), replyTo),
            timeout);
    var cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  private static Cart toProtoCart(ShoppingCart.Summary cart) {
    List<Item> protoItems =
        cart.items().entrySet().stream()
            .map(
                entry ->
                    Item.newBuilder()
                        .setItemId(entry.getKey())
                        .setQuantity(entry.getValue())
                        .build())
            .collect(Collectors.toList());

    return Cart.newBuilder().addAllItems(protoItems).build();
  }

  private static <T> CompletionStage<T> convertError(CompletionStage<T> response) {
    return response.exceptionally(
        ex -> {
          if (ex instanceof TimeoutException) {
            throw new GrpcServiceException(
                Status.UNAVAILABLE.withDescription("Operation timed out"));
          } else {
            throw new GrpcServiceException(
                Status.INVALID_ARGUMENT.withDescription(ex.getMessage()));
          }
        });
  }
}
```

### Example 22: 7. Send commands to the entities

```scala
package shopping.cart

import java.util.concurrent.TimeoutException

import scala.concurrent.Future

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.grpc.GrpcServiceException
import akka.util.Timeout
import io.grpc.Status
import org.slf4j.LoggerFactory

class ShoppingCartServiceImpl(system: ActorSystem[_])
    extends proto.ShoppingCartService {
  import system.executionContext

  private val logger = LoggerFactory.getLogger(getClass)

  implicit private val timeout: Timeout =
    Timeout.create(
      system.settings.config.getDuration("shopping-cart-service.ask-timeout"))

  private val sharding = ClusterSharding(system)

  override def addItem(in: proto.AddItemRequest): Future[proto.Cart] = {
    logger.info("addItem {} to cart {}", in.itemId, in.cartId)
    val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
    val reply: Future[ShoppingCart.Summary] =
      entityRef.askWithStatus(ShoppingCart.AddItem(in.itemId, in.quantity, _))
    val response = reply.map(cart => toProtoCart(cart))
    convertError(response)
  }

  private def toProtoCart(cart: ShoppingCart.Summary): proto.Cart = {
    proto.Cart(cart.items.iterator.map { case (itemId, quantity) =>
      proto.Item(itemId, quantity)
    }.toSeq)
  }

  private def convertError[T](response: Future[T]): Future[T] = {
    response.recoverWith {
      case _: TimeoutException =>
        Future.failed(
          new GrpcServiceException(
            Status.UNAVAILABLE.withDescription("Operation timed out")))
      case exc =>
        Future.failed(
          new GrpcServiceException(
            Status.INVALID_ARGUMENT.withDescription(exc.getMessage)))
    }
  }

}
```

### Example 23: 8. Configure Postgres

```hocon
include "persistence"
```

### Example 24: 9. Run locally

```shell
docker compose up -d
```

### Example 25: 9. Run locally

```shell
docker exec -i postgres-db psql -U shopping-cart -t < ddl-scripts/create_tables.sql
```

### Example 26: 9. Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 27: 9. Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 28: 9.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 29: 9.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 30: 9.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 31: 9.2. Exercise with multiple service instances

```shell
sbt -Dconfig.resource=local2.conf run
```

### Example 32: 9.2. Exercise with multiple service instances

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local2.conf
```

### Example 33: 9.2. Exercise with multiple service instances

```shell
sbt -Dconfig.resource=local3.conf run
```

### Example 34: 9.2. Exercise with multiple service instances

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local3.conf
```

### Example 35: 9.3. Stop the service

```shell
docker compose stop
```

## Related Pages (Internal Links)

- https://doc.akka.io/guide/concepts/event-sourcing.html
- https://doc.akka.io/guide/how-to/cassandra-alternative.html
- https://doc.akka.io/guide/microservices-tutorial/_attachments/1-shopping-cart-grpc-java.zip
- https://doc.akka.io/guide/microservices-tutorial/_attachments/1-shopping-cart-grpc-scala.zip
- https://doc.akka.io/guide/microservices-tutorial/_attachments/2-shopping-cart-event-sourced-java.zip
- https://doc.akka.io/guide/microservices-tutorial/_attachments/2-shopping-cart-event-sourced-scala.zip
- https://doc.akka.io/guide/microservices-tutorial/grpc-service.html
- https://doc.akka.io/libraries/akka-core/current/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence-testing.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html

---
*Source: [https://doc.akka.io/guide/microservices-tutorial/entity.html](https://doc.akka.io/guide/microservices-tutorial/entity.html)*
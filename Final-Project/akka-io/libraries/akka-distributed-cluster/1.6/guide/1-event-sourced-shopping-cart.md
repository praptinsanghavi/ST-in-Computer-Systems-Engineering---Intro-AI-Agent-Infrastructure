---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/1-event-sourced-shopping-cart.html
title: 'Part 1: Event Sourced Shopping Cart • Akka Distributed Cluster'
---

# Part 1: Event Sourced Shopping Cart • Akka Distributed Cluster

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 1: Event Sourced Shopping Cart

As the other features of Akka Distributed Cluster are build on top of Event Sourcing, let us start by implementing a shopping cart using the [Akka Event Sourced Behavior API](https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html). When this first step is completed, end users will be able to add and remove items to a cart and finally check it out.

We will build the cart as an Event Sourced entity, if you are unfamiliar with Event Sourcing, refer to the [Event Sourcing section in the Akka guide](https://doc.akka.io/libraries/guide/microservices-tutorial/) for an explanation. The [Event Sourcing with Akka video](https://www.youtube.com/watch?v=xWuOGqmR7ow) is also a good starting point for learning Event Sourcing.

## Implementing an Event Sourced shopping cart

### Commands

Commands are the public API of an entity that other parts of the system use to interact with it. Entity state can only be changed by commands. The results of commands are emitted as events. A command can request state changes, and different events might be generated depending on the current state of the entity. A command can also be rejected if it has invalid input or can’t be handled by the current state of the entity.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L100-L143 "Go to snippet source")/**
 * This interface defines all the commands (messages) that the ShoppingCart actor supports.
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
 * A command to remove an item from the cart.
 */
final case class RemoveItem(
    itemId: String,
    quantity: Int,
    replyTo: ActorRef[StatusReply[Summary]])
    extends Command

/**
 * A command to checkout the shopping cart.
 */
final case class Checkout(replyTo: ActorRef[StatusReply[Summary]])
    extends Command

/**
 * A command to get the current state of the shopping cart.
 */
final case class Get(replyTo: ActorRef[Summary]) extends Command

/**
 * Summary of the shopping cart state, used in reply messages.
 */
final case class Summary(
    items: Map[String, Int],
    checkedOut: Boolean)
    extends CborSerializable
/**
 * This interface defines all the events that the ShoppingCart supports.
 */
sealed trait Event extends CborSerializable

final case class ItemUpdated(itemId: String, quantity: Int) extends Event

final case class CheckedOut(eventTime: Instant) extends Event
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L112-L176 "Go to snippet source")/** This interface defines all the commands (messages) that the ShoppingCart actor supports. */
interface Command extends CborSerializable {}

/**
 * A command to add an item to the cart.
 *
 * <p>It replies with `StatusReply<Summary>`, which is sent back to the caller when all the
 * events emitted by this command are successfully persisted.
 */
public static final class AddItem implements Command {
  final String itemId;
  final int quantity;
  final ActorRef<StatusReply<Summary>> replyTo;

  public AddItem(String itemId, int quantity, ActorRef<StatusReply<Summary>> replyTo) {
    this.itemId = itemId;
    this.quantity = quantity;
    this.replyTo = replyTo;
  }
}

/** A command to remove an item from the cart. */
public static final class RemoveItem implements Command {
  final String itemId;
  final int quantity;
  final ActorRef<StatusReply<Summary>> replyTo;

  public RemoveItem(String itemId, int quantity, ActorRef<StatusReply<Summary>> replyTo) {
    this.itemId = itemId;
    this.quantity = quantity;
    this.replyTo = replyTo;
  }
}

/** A command to checkout the shopping cart. */
public static final class Checkout implements Command {
  final ActorRef<StatusReply<Summary>> replyTo;

  @JsonCreator
  public Checkout(ActorRef<StatusReply<Summary>> replyTo) {
    this.replyTo = replyTo;
  }
}

/** A command to get the current state of the shopping cart. */
public static final class Get implements Command {
  final ActorRef<Summary> replyTo;

  @JsonCreator
  public Get(ActorRef<Summary> replyTo) {
    this.replyTo = replyTo;
  }
}

/** Summary of the shopping cart state, used in reply messages. */
public static final class Summary implements CborSerializable {
  final Map<String, Integer> items;
  final boolean checkedOut;

  public Summary(Map<String, Integer> items, boolean checkedOut) {
    // defensive copy since items is a mutable object
    this.items = new HashMap<>(items);
    this.checkedOut = checkedOut;
  }
}
abstract static class Event implements CborSerializable {
}

static final class ItemUpdated extends Event {
  public final String itemId;
  public final int quantity;

  public ItemUpdated(String itemId, int quantity) {
    this.itemId = itemId;
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ItemUpdated other = (ItemUpdated) o;

    if (quantity != other.quantity) return false;
    return itemId.equals(other.itemId);
  }

  @Override
  public int hashCode() {
    int result = itemId.hashCode();
    result = 31 * result + quantity;
    return result;
  }
}

static final class CheckedOut extends Event {
  final Instant eventTime;

  @JsonCreator
  public CheckedOut(Instant eventTime) {
    this.eventTime = eventTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckedOut that = (CheckedOut) o;
    return Objects.equals(eventTime, that.eventTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime);
  }
}
```

### State

Items added to the Cart are added to a `Map`. The contents of the `Map` comprise the Cart’s state along with an optional checkout timestamp, which is set when the cart is checked out:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L46-L87 "Go to snippet source")final case class State(
    items: Map[String, Int],
    checkoutDate: Option[Instant])
    extends CborSerializable {

  def isCheckedOut: Boolean =
    checkoutDate.isDefined

  def isEmpty: Boolean =
    items.isEmpty

  def updateItem(itemId: String, quantity: Int): State = {
    val newQuantity = items.getOrElse(itemId, 0) + quantity
    if (newQuantity > 0)
      copy(items = items + (itemId -> newQuantity))
    else
      copy(items = items.removed(itemId))
  }

  def checkout(now: Instant): State =
    copy(checkoutDate = Some(now))

  def toSummary: Summary = {
    // filter out removed items
    Summary(items, isCheckedOut)
  }

  def totalQuantity: Int =
    items.map { case (_, quantity) => quantity }.sum

  def tags: Set[String] = {
    val total = totalQuantity
    if (total == 0) Set.empty
    else if (total >= 100) Set(LargeQuantityTag)
    else if (total >= 10) Set(MediumQuantityTag)
    else Set(SmallQuantityTag)
  }

}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L49-L107 "Go to snippet source")static final class State implements CborSerializable {
  final Map<String, Integer> items;

  private Optional<Instant> checkoutDate;

  public State() {
    this(new HashMap<>(), Optional.empty());
  }

  public State(Map<String, Integer> items, Optional<Instant> checkoutDate) {
    this.items = items;
    this.checkoutDate = checkoutDate;
  }

  public boolean isCheckedOut() {
    return checkoutDate.isPresent();
  }

  public State checkout(Instant now) {
    checkoutDate = Optional.of(now);
    return this;
  }

  public Summary toSummary() {
    return new Summary(items, isCheckedOut());
  }

  public State updateItem(String itemId, int quantity) {
    int newQuantity = items.getOrDefault(itemId, 0) + quantity;
    if (newQuantity > 0)
      items.put(itemId, newQuantity);
    else
      items.remove(itemId);
    return this;
  }

  public boolean isEmpty() {
    return items.isEmpty();
  }

  public int totalQuantity() {
    return items.values().stream().reduce(0, Integer::sum);
  }

  public Set<String> tags() {
    int total = totalQuantity();
    if (total == 0)
      return Collections.emptySet();
    else if (total >= 100)
      return Collections.singleton(LARGE_QUANTITY_TAG);
    else if (total >= 10)
      return Collections.singleton(MEDIUM_QUANTITY_TAG);
    else
      return Collections.singleton(SMALL_QUANTITY_TAG);
  }
}

```

### Command handler

The Cart entity will receive commands that request changes to Cart state. We will implement a command handler to process these commands and emit a reply, the handler logic selected is different depending on if the cart is checked out already, replying with an error, or if the cart is still open for adding and removing items.

The command handler for an open cart looks like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L205-L244 "Go to snippet source")private def openShoppingCart(
    state: State,
    command: Command): ReplyEffect[Event, State] = {
  command match {
    case AddItem(itemId, quantity, replyTo) =>
     if (quantity <= 0) {
        Effect.reply(replyTo)(
          StatusReply.Error("Quantity must be greater than zero"))
     } else
        Effect
          .persist(ItemUpdated(itemId, quantity))
          .thenReply(replyTo) { updatedCart =>
            StatusReply.Success(updatedCart.toSummary)
          }

    case RemoveItem(itemId, quantity, replyTo) =>
      if (quantity <= 0)
        Effect.reply(replyTo)(
          StatusReply.Error("Quantity must be greater than zero"))
      else
        Effect
          .persist(ItemUpdated(itemId, -quantity))
          .thenReply(replyTo)(updatedCart =>
            StatusReply.Success(updatedCart.toSummary))

    case Checkout(replyTo) =>
      if (state.isEmpty)
        Effect.reply(replyTo)(
          StatusReply.Error("Cannot checkout an empty shopping cart"))
      else
        Effect
          .persist(CheckedOut(Instant.now()))
          .thenReply(replyTo)(updatedCart =>
            StatusReply.Success(updatedCart.toSummary))

    case Get(replyTo) =>
      Effect.reply(replyTo)(state.toSummary)
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L287-L293 "Go to snippet source")private CommandHandlerWithReplyBuilderByState<Command, Event, State, State> openShoppingCart() {
  return newCommandHandlerWithReplyBuilder()
      .forState(state -> !state.isCheckedOut())
      .onCommand(AddItem.class, this::onAddItem)
      .onCommand(RemoveItem.class, this::onRemoveItem)
      .onCommand(Checkout.class, this::onCheckout);
}
```

The actual logic for handling the commands is implemented in methods on the `ShoppingCart` class, for example the `onAddItem` method: 

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L297-L305 "Go to snippet source")private ReplyEffect<Event, State> onAddItem(State state, AddItem cmd) {
  if (cmd.quantity <= 0) {
    return Effect().reply(cmd.replyTo, StatusReply.error("Quantity must be greater than zero"));
  } else {
    return Effect()
        .persist(new ItemUpdated(cmd.itemId, cmd.quantity))
        .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
  }
}
```

### Event handler

From commands, the entity creates events that represent state changes. Aligning with the command handler above, the entity’s event handler reacts to events and updates the state. The events are continuously persisted to the Event Journal datastore, while the entity state is kept in memory. Other parts of the application may listen to the events. In case of a restart, the entity recovers its latest state by replaying the events from the Event Journal.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L268-L275 "Go to snippet source")private def handleEvent(state: State, event: Event): State = {
  event match {
    case ItemUpdated(itemId, quantity) =>
      state.updateItem(itemId, quantity)
    case CheckedOut(eventTime) =>
      state.checkout(eventTime)
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L361-L370 "Go to snippet source")@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(
          ItemUpdated.class,
          (state, evt) -> state.updateItem(evt.itemId, evt.quantity))
      .onEvent(CheckedOut.class, (state, evt) -> state.checkout(evt.eventTime))
      .build();
}
```

### Wiring it all together

To glue the command handler, event handler, and state together, we need some initialization code. Our code will distribute the Cart entities over nodes in the Akka Cluster with [Cluster Sharding](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html), enable snapshots to reduce recovery time when the entity is started, and restart with backoff in the case of failure.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L168-L190 "Go to snippet source")def init(system: ActorSystem[_]): Unit = {
  ClusterSharding(system).init(Entity(EntityKey)(entityContext =>
    ShoppingCart(entityContext.entityId)))
}
def apply(cartId: String): Behavior[Command] = {
  EventSourcedBehavior
    .withEnforcedReplies[Command, Event, State](
      persistenceId = PersistenceId(EntityKey.name, cartId),
      emptyState = State.empty,
      commandHandler =
        (state, command) => handleCommand(state, command),
      eventHandler = (state, event) => handleEvent(state, event))
    .withTaggerForState { case (state, _) =>
      state.tags
    }
    .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100))
    .onPersistFailure(
      SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L236-L247 "Go to snippet source")static final EntityTypeKey<Command> ENTITY_KEY =
    EntityTypeKey.create(Command.class, "ShoppingCart");

public static void init(ActorSystem<?> system) {
  ClusterSharding.get(system)
      .init(
          Entity.of(
              ENTITY_KEY,
              entityContext ->
                ShoppingCart.create(entityContext.getEntityId())
              ));
}
```

## Serialization

The state, commands and events of the entity must be serializable because they are written to the datastore or sent between nodes within the Akka cluster. The sample project includes built\-in CBOR serialization using the [Akka Serialization Jackson module](https://doc.akka.io/libraries/akka-core/2.10/serialization-jackson.html). This section describes how serialization is implemented. You do not need to do anything specific to take advantage of CBOR, but this section explains how it is included. The state, commands and events are marked as `akka.serialization.jackson.CborSerializable` which is configured to use the built\-in CBOR serialization.

## Client access with Akka gRPC

To allow users to actually use the service we need a public API reachable over the internet. For this we will use [Akka gRPC](https://doc.akka.io/libraries/akka-grpc/2.5/) giving us a type safe, efficient protocol that allows clients to be written in many languages.

The service descriptor for the API is defined in protobuf and mirrors the set of commands the entity accepts:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/protobuf/ShoppingCartService.proto "Go to snippet source")syntax = "proto3";

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

package shoppingcart;

// gRPC definition for ShoppingCartService

service ShoppingCartService {
    rpc AddItem (AddItemRequest) returns (Cart) {}
    rpc RemoveItem (RemoveItemRequest) returns (Cart) {}
    rpc Checkout (CheckoutRequest) returns (Cart) {}
    rpc GetCart (GetCartRequest) returns (Cart) {}
}

message AddItemRequest {
    string cartId = 1;
    string itemId = 2;
    int32 quantity = 3;
}

message RemoveItemRequest {
    string cartId = 1;
    string itemId = 2;
    int32 quantity = 3;
}

message CheckoutRequest {
    string cartId = 1;
}

message GetCartRequest {
    string cartId = 1;
}

message Cart {
    repeated Item items = 1;
    bool checkedOut = 2;
}

message Item {
    string itemId = 1;
    int32 quantity = 2;
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/protobuf/ShoppingCartService.proto "Go to snippet source")syntax = "proto3";

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

package shoppingcart;

// gRPC definition for ShoppingCartService

service ShoppingCartService {
    rpc AddItem (AddItemRequest) returns (Cart) {}
    rpc RemoveItem (RemoveItemRequest) returns (Cart) {}
    rpc Checkout (CheckoutRequest) returns (Cart) {}
    rpc GetCart (GetCartRequest) returns (Cart) {}
}

message AddItemRequest {
    string cartId = 1;
    string itemId = 2;
    int32 quantity = 3;
}

message RemoveItemRequest {
    string cartId = 1;
    string itemId = 2;
    int32 quantity = 3;
}

message CheckoutRequest {
    string cartId = 1;
}

message GetCartRequest {
    string cartId = 1;
}

message Cart {
    repeated Item items = 1;
    bool checkedOut = 2;
}

message Item {
    string itemId = 1;
    int32 quantity = 2;
}
```

When compiling the project the Akka gRPC sbtmaven plugin generates a service interface for us to implement. Our implementation of it interacts with the entity:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCartServiceImpl.scala "Go to snippet source")package shopping.cart

import java.util.concurrent.TimeoutException

import scala.concurrent.Future

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.grpc.GrpcServiceException
import akka.util.Timeout
import io.grpc.Status
import org.slf4j.LoggerFactory

// tag::moreOperations[]
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

  override def removeItem(in: proto.RemoveItemRequest): Future[proto.Cart] = {
    logger.info("updateItem {} to cart {}", in.itemId, in.cartId)
    val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)

    val reply: Future[ShoppingCart.Summary] =
      entityRef.askWithStatus(  ShoppingCart.RemoveItem(in.itemId, in.quantity, _))
    val response = reply.map(cart => toProtoCart(cart))
    convertError(response)
  }

  override def checkout(in: proto.CheckoutRequest): Future[proto.Cart] = {
    logger.info("checkout {}", in.cartId)
    val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
    val reply: Future[ShoppingCart.Summary] =
      entityRef.askWithStatus(ShoppingCart.Checkout(_))
    val response = reply.map(cart => toProtoCart(cart))
    convertError(response)
  }

  override def getCart(in: proto.GetCartRequest): Future[proto.Cart] = {
    logger.info("getCart {}", in.cartId)
    val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
    val response =
      entityRef.ask(ShoppingCart.Get.apply).map { cart =>
        if (cart.items.isEmpty)
          throw new GrpcServiceException(
            Status.NOT_FOUND.withDescription(s"Cart ${in.cartId} not found"))
        else
          toProtoCart(cart)
      }
    convertError(response)
  }

  private def toProtoCart(cart: ShoppingCart.Summary): proto.Cart = {
    proto.Cart(
      cart.items.iterator.map { case (itemId, quantity) =>
        proto.Item(itemId, quantity)
      }.toSeq,
      cart.checkedOut)
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

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCartServiceImpl.java "Go to snippet source")package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.grpc.GrpcServiceException;
import io.grpc.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.AddItemRequest;
import shopping.cart.proto.RemoveItemRequest;
import shopping.cart.proto.Cart;
import shopping.cart.proto.CheckoutRequest;
import shopping.cart.proto.GetCartRequest;
import shopping.cart.proto.Item;
import shopping.cart.proto.ShoppingCartService;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

public final class ShoppingCartServiceImpl implements ShoppingCartService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  private final Duration timeout;
  private final ClusterSharding sharding;

  public ShoppingCartServiceImpl(
      ActorSystem<?> system) {

    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    sharding = ClusterSharding.get(system);
  }

  @Override
  public CompletionStage<Cart> addItem(AddItemRequest in) {
    logger.info("addItem {} to cart {}", in.getItemId(), in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(
            replyTo -> new ShoppingCart.AddItem(in.getItemId(), in.getQuantity(), replyTo),
            timeout);
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  @Override
  public CompletionStage<Cart> removeItem(RemoveItemRequest in) {
    logger.info("updateItem {}", in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(
            replyTo -> new ShoppingCart.RemoveItem(in.getItemId(), in.getQuantity(), replyTo),
            timeout);
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  @Override
  public CompletionStage<Cart> checkout(CheckoutRequest in) {
    logger.info("checkout {}", in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(replyTo -> new ShoppingCart.Checkout(replyTo), timeout);
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  @Override
  public CompletionStage<Cart> getCart(GetCartRequest in) {
    logger.info("getCart {}", in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.ask(replyTo -> new ShoppingCart.Get(replyTo), timeout);
    CompletionStage<Cart> protoCart =
        reply.thenApply(
            cart -> {
              if (cart.items.isEmpty())
                throw new GrpcServiceException(
                    Status.NOT_FOUND.withDescription("Cart " + in.getCartId() + " not found"));
              else return toProtoCart(cart);
            });
    return convertError(protoCart);
  }

  private static Cart toProtoCart(ShoppingCart.Summary cart) {
    List<Item> protoItems =
        cart.items.entrySet().stream()
            .map(
                entry ->
                    Item.newBuilder()
                        .setItemId(entry.getKey())
                        .setQuantity(entry.getValue())
                        .build())
            .collect(Collectors.toList());

    return Cart.newBuilder().setCheckedOut(cart.checkedOut).addAllItems(protoItems).build();
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

Finally, we need to start the HTTP server, making service implementation available for calls from external clients:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCartServer.scala#L62-L94 "Go to snippet source")def start(
    interface: String,
    port: Int,
    system: ActorSystem[_],
    grpcService: proto.ShoppingCartService): Unit = {
  implicit val sys: ActorSystem[_] = system
  implicit val ec: ExecutionContext =
    system.executionContext

  val service: HttpRequest => Future[HttpResponse] =
    ServiceHandler.concatOrNotFound(
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
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCartServer.java#L60-L88 "Go to snippet source")static void start(String host, int port, ActorSystem<?> system, ShoppingCartService grpcService) {
  @SuppressWarnings("unchecked")
  Function<HttpRequest, CompletionStage<HttpResponse>> service =
      ServiceHandler.concatOrNotFound(
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
```

The Akka HTTP server must be running with HTTP/2 to serve gRPC, this is done through config:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/resources/grpc.conf#L2 "Go to snippet source")akka.http.server.enable-http2 = on
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/resources/grpc.conf#L2 "Go to snippet source")akka.http.server.enable-http2 = on
```

## Running the sample

The complete sample can be downloaded, but note that it also includes the next step of the guide:

- Scala: [shopping\-scala.zip](../attachments/shopping-scala.zip)
- Java: [shopping\-java.zip](../attachments/shopping-java.zip)

Before running the sample locally you will need to run a PostgreSQL instance in docker, it can be started with the included `docker-compose.yml`. Run it and create the needed database schema:

```
docker compose up --wait
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql

```

To start the sample:

```
sbt -Dconfig.resource=local1.conf run

```

And optionally one or two more Akka cluster nodes:

```
sbt -Dconfig.resource=local2.conf run
sbt -Dconfig.resource=local3.conf run

```

```
mvn compile exec:exec -DAPP_CONFIG=local1.conf

```

And optionally one or two more Akka cluster nodes:

```
mvn compile exec:exec -DAPP_CONFIG=local2.conf
mvn compile exec:exec -DAPP_CONFIG=local3.conf

```

Try it with [grpcurl](https://github.com/fullstorydev/grpcurl):

```
# add item to cart
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# update quantity of item
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.UpdateItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout

```

or same `grpcurl` commands to port 8102 to reach node 2\.

## What’s next?

- Making the events of the service available for consumption in a separately deployed service

## Code Examples

### Example 1: Commands

```scala
/**
 * This interface defines all the commands (messages) that the ShoppingCart actor supports.
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
 * A command to remove an item from the cart.
 */
final case class RemoveItem(
    itemId: String,
    quantity: Int,
    replyTo: ActorRef[StatusReply[Summary]])
    extends Command

/**
 * A command to checkout the shopping cart.
 */
final case class Checkout(replyTo: ActorRef[StatusReply[Summary]])
    extends Command

/**
 * A command to get the current state of the shopping cart.
 */
final case class Get(replyTo: ActorRef[Summary]) extends Command

/**
 * Summary of the shopping cart state, used in reply messages.
 */
final case class Summary(
    items: Map[String, Int],
    checkedOut: Boolean)
    extends CborSerializable
/**
 * This interface defines all the events that the ShoppingCart supports.
 */
sealed trait Event extends CborSerializable

final case class ItemUpdated(itemId: String, quantity: Int) extends Event

final case class CheckedOut(eventTime: Instant) extends Event
```

### Example 2: Commands

```java
/** This interface defines all the commands (messages) that the ShoppingCart actor supports. */
interface Command extends CborSerializable {}

/**
 * A command to add an item to the cart.
 *
 * <p>It replies with `StatusReply&lt;Summary&gt;`, which is sent back to the caller when all the
 * events emitted by this command are successfully persisted.
 */
public static final class AddItem implements Command {
  final String itemId;
  final int quantity;
  final ActorRef<StatusReply<Summary>> replyTo;

  public AddItem(String itemId, int quantity, ActorRef<StatusReply<Summary>> replyTo) {
    this.itemId = itemId;
    this.quantity = quantity;
    this.replyTo = replyTo;
  }
}

/** A command to remove an item from the cart. */
public static final class RemoveItem implements Command {
  final String itemId;
  final int quantity;
  final ActorRef<StatusReply<Summary>> replyTo;

  public RemoveItem(String itemId, int quantity, ActorRef<StatusReply<Summary>> replyTo) {
    this.itemId = itemId;
    this.quantity = quantity;
    this.replyTo = replyTo;
  }
}

/** A command to checkout the shopping cart. */
public static final class Checkout implements Command {
  final ActorRef<StatusReply<Summary>> replyTo;

  @JsonCreator
  public Checkout(ActorRef<StatusReply<Summary>> replyTo) {
    this.replyTo = replyTo;
  }
}

/** A command to get the current state of the shopping cart. */
public static final class Get implements Command {
  final ActorRef<Summary> replyTo;

  @JsonCreator
  public Get(ActorRef<Summary> replyTo) {
    this.replyTo = replyTo;
  }
}

/** Summary of the shopping cart state, used in reply messages. */
public static final class Summary implements CborSerializable {
  final Map<String, Integer> items;
  final boolean checkedOut;

  public Summary(Map<String, Integer> items, boolean checkedOut) {
    // defensive copy since items is a mutable object
    this.items = new HashMap<>(items);
    this.checkedOut = checkedOut;
  }
}
abstract static class Event implements CborSerializable {
}

static final class ItemUpdated extends Event {
  public final String itemId;
  public final int quantity;

  public ItemUpdated(String itemId, int quantity) {
    this.itemId = itemId;
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ItemUpdated other = (ItemUpdated) o;

    if (quantity != other.quantity) return false;
    return itemId.equals(other.itemId);
  }

  @Override
  public int hashCode() {
    int result = itemId.hashCode();
    result = 31 * result + quantity;
    return result;
  }
}

static final class CheckedOut extends Event {
  final Instant eventTime;

  @JsonCreator
  public CheckedOut(Instant eventTime) {
    this.eventTime = eventTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckedOut that = (CheckedOut) o;
    return Objects.equals(eventTime, that.eventTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime);
  }
}
```

### Example 3: State

```scala
final case class State(
    items: Map[String, Int],
    checkoutDate: Option[Instant])
    extends CborSerializable {


  def isCheckedOut: Boolean =
    checkoutDate.isDefined

  def isEmpty: Boolean =
    items.isEmpty

  def updateItem(itemId: String, quantity: Int): State = {
    val newQuantity = items.getOrElse(itemId, 0) + quantity
    if (newQuantity > 0)
      copy(items = items + (itemId -> newQuantity))
    else
      copy(items = items.removed(itemId))
  }

  def checkout(now: Instant): State =
    copy(checkoutDate = Some(now))

  def toSummary: Summary = {
    // filter out removed items
    Summary(items, isCheckedOut)
  }

  def totalQuantity: Int =
    items.map { case (_, quantity) => quantity }.sum

  def tags: Set[String] = {
    val total = totalQuantity
    if (total == 0) Set.empty
    else if (total >= 100) Set(LargeQuantityTag)
    else if (total >= 10) Set(MediumQuantityTag)
    else Set(SmallQuantityTag)
  }

}
```

### Example 4: State

```java
static final class State implements CborSerializable {
  final Map<String, Integer> items;

  private Optional<Instant> checkoutDate;

  public State() {
    this(new HashMap<>(), Optional.empty());
  }

  public State(Map<String, Integer> items, Optional<Instant> checkoutDate) {
    this.items = items;
    this.checkoutDate = checkoutDate;
  }

  public boolean isCheckedOut() {
    return checkoutDate.isPresent();
  }

  public State checkout(Instant now) {
    checkoutDate = Optional.of(now);
    return this;
  }

  public Summary toSummary() {
    return new Summary(items, isCheckedOut());
  }

  public State updateItem(String itemId, int quantity) {
    int newQuantity = items.getOrDefault(itemId, 0) + quantity;
    if (newQuantity > 0)
      items.put(itemId, newQuantity);
    else
      items.remove(itemId);
    return this;
  }

  public boolean isEmpty() {
    return items.isEmpty();
  }

  public int totalQuantity() {
    return items.values().stream().reduce(0, Integer::sum);
  }

  public Set<String> tags() {
    int total = totalQuantity();
    if (total == 0)
      return Collections.emptySet();
    else if (total >= 100)
      return Collections.singleton(LARGE_QUANTITY_TAG);
    else if (total >= 10)
      return Collections.singleton(MEDIUM_QUANTITY_TAG);
    else
      return Collections.singleton(SMALL_QUANTITY_TAG);
  }
}
```

### Example 5: Command handler

```scala
private def openShoppingCart(
    state: State,
    command: Command): ReplyEffect[Event, State] = {
  command match {
    case AddItem(itemId, quantity, replyTo) =>
     if (quantity <= 0) {
        Effect.reply(replyTo)(
          StatusReply.Error("Quantity must be greater than zero"))
     } else
        Effect
          .persist(ItemUpdated(itemId, quantity))
          .thenReply(replyTo) { updatedCart =>
            StatusReply.Success(updatedCart.toSummary)
          }

    case RemoveItem(itemId, quantity, replyTo) =>
      if (quantity <= 0)
        Effect.reply(replyTo)(
          StatusReply.Error("Quantity must be greater than zero"))
      else
        Effect
          .persist(ItemUpdated(itemId, -quantity))
          .thenReply(replyTo)(updatedCart =>
            StatusReply.Success(updatedCart.toSummary))


    case Checkout(replyTo) =>
      if (state.isEmpty)
        Effect.reply(replyTo)(
          StatusReply.Error("Cannot checkout an empty shopping cart"))
      else
        Effect
          .persist(CheckedOut(Instant.now()))
          .thenReply(replyTo)(updatedCart =>
            StatusReply.Success(updatedCart.toSummary))

    case Get(replyTo) =>
      Effect.reply(replyTo)(state.toSummary)
  }
}
```

### Example 6: Command handler

```java
private CommandHandlerWithReplyBuilderByState<Command, Event, State, State> openShoppingCart() {
  return newCommandHandlerWithReplyBuilder()
      .forState(state -> !state.isCheckedOut())
      .onCommand(AddItem.class, this::onAddItem)
      .onCommand(RemoveItem.class, this::onRemoveItem)
      .onCommand(Checkout.class, this::onCheckout);
}
```

### Example 7: Command handler

```java
private ReplyEffect<Event, State> onAddItem(State state, AddItem cmd) {
  if (cmd.quantity <= 0) {
    return Effect().reply(cmd.replyTo, StatusReply.error("Quantity must be greater than zero"));
  } else {
    return Effect()
        .persist(new ItemUpdated(cmd.itemId, cmd.quantity))
        .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
  }
}
```

### Example 8: Event handler

```scala
private def handleEvent(state: State, event: Event): State = {
  event match {
    case ItemUpdated(itemId, quantity) =>
      state.updateItem(itemId, quantity)
    case CheckedOut(eventTime) =>
      state.checkout(eventTime)
  }
}
```

### Example 9: Event handler

```java
@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(
          ItemUpdated.class,
          (state, evt) -> state.updateItem(evt.itemId, evt.quantity))
      .onEvent(CheckedOut.class, (state, evt) -> state.checkout(evt.eventTime))
      .build();
}
```

### Example 10: Wiring it all together

```scala
def init(system: ActorSystem[_]): Unit = {
  ClusterSharding(system).init(Entity(EntityKey)(entityContext =>
    ShoppingCart(entityContext.entityId)))
}
def apply(cartId: String): Behavior[Command] = {
  EventSourcedBehavior
    .withEnforcedReplies[Command, Event, State](
      persistenceId = PersistenceId(EntityKey.name, cartId),
      emptyState = State.empty,
      commandHandler =
        (state, command) => handleCommand(state, command),
      eventHandler = (state, event) => handleEvent(state, event))
    .withTaggerForState { case (state, _) =>
      state.tags
    }
    .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100))
    .onPersistFailure(
      SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
}
```

### Example 11: Wiring it all together

```java
static final EntityTypeKey<Command> ENTITY_KEY =
    EntityTypeKey.create(Command.class, "ShoppingCart");

public static void init(ActorSystem<?> system) {
  ClusterSharding.get(system)
      .init(
          Entity.of(
              ENTITY_KEY,
              entityContext ->
                ShoppingCart.create(entityContext.getEntityId())
              ));
}
```

### Example 12: Client access with Akka gRPC

```proto
syntax = "proto3";

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

package shoppingcart;

// gRPC definition for ShoppingCartService

service ShoppingCartService {
    rpc AddItem (AddItemRequest) returns (Cart) {}
    rpc RemoveItem (RemoveItemRequest) returns (Cart) {}
    rpc Checkout (CheckoutRequest) returns (Cart) {}
    rpc GetCart (GetCartRequest) returns (Cart) {}
}


message AddItemRequest {
    string cartId = 1;
    string itemId = 2;
    int32 quantity = 3;
}

message RemoveItemRequest {
    string cartId = 1;
    string itemId = 2;
    int32 quantity = 3;
}

message CheckoutRequest {
    string cartId = 1;
}

message GetCartRequest {
    string cartId = 1;
}

message Cart {
    repeated Item items = 1;
    bool checkedOut = 2;
}

message Item {
    string itemId = 1;
    int32 quantity = 2;
}
```

### Example 13: Client access with Akka gRPC

```proto
syntax = "proto3";

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

package shoppingcart;

// gRPC definition for ShoppingCartService

service ShoppingCartService {
    rpc AddItem (AddItemRequest) returns (Cart) {}
    rpc RemoveItem (RemoveItemRequest) returns (Cart) {}
    rpc Checkout (CheckoutRequest) returns (Cart) {}
    rpc GetCart (GetCartRequest) returns (Cart) {}
}

message AddItemRequest {
    string cartId = 1;
    string itemId = 2;
    int32 quantity = 3;
}

message RemoveItemRequest {
    string cartId = 1;
    string itemId = 2;
    int32 quantity = 3;
}

message CheckoutRequest {
    string cartId = 1;
}

message GetCartRequest {
    string cartId = 1;
}

message Cart {
    repeated Item items = 1;
    bool checkedOut = 2;
}

message Item {
    string itemId = 1;
    int32 quantity = 2;
}
```

### Example 14: Client access with Akka gRPC

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

// tag::moreOperations[]
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

  override def removeItem(in: proto.RemoveItemRequest): Future[proto.Cart] = {
    logger.info("updateItem {} to cart {}", in.itemId, in.cartId)
    val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)

    val reply: Future[ShoppingCart.Summary] =
      entityRef.askWithStatus(  ShoppingCart.RemoveItem(in.itemId, in.quantity, _))
    val response = reply.map(cart => toProtoCart(cart))
    convertError(response)
  }

  override def checkout(in: proto.CheckoutRequest): Future[proto.Cart] = {
    logger.info("checkout {}", in.cartId)
    val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
    val reply: Future[ShoppingCart.Summary] =
      entityRef.askWithStatus(ShoppingCart.Checkout(_))
    val response = reply.map(cart => toProtoCart(cart))
    convertError(response)
  }

  override def getCart(in: proto.GetCartRequest): Future[proto.Cart] = {
    logger.info("getCart {}", in.cartId)
    val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
    val response =
      entityRef.ask(ShoppingCart.Get.apply).map { cart =>
        if (cart.items.isEmpty)
          throw new GrpcServiceException(
            Status.NOT_FOUND.withDescription(s"Cart ${in.cartId} not found"))
        else
          toProtoCart(cart)
      }
    convertError(response)
  }

  private def toProtoCart(cart: ShoppingCart.Summary): proto.Cart = {
    proto.Cart(
      cart.items.iterator.map { case (itemId, quantity) =>
        proto.Item(itemId, quantity)
      }.toSeq,
      cart.checkedOut)
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

### Example 15: Client access with Akka gRPC

```java
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.grpc.GrpcServiceException;
import io.grpc.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.AddItemRequest;
import shopping.cart.proto.RemoveItemRequest;
import shopping.cart.proto.Cart;
import shopping.cart.proto.CheckoutRequest;
import shopping.cart.proto.GetCartRequest;
import shopping.cart.proto.Item;
import shopping.cart.proto.ShoppingCartService;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

public final class ShoppingCartServiceImpl implements ShoppingCartService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  private final Duration timeout;
  private final ClusterSharding sharding;

  public ShoppingCartServiceImpl(
      ActorSystem<?> system) {

    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    sharding = ClusterSharding.get(system);
  }

  @Override
  public CompletionStage<Cart> addItem(AddItemRequest in) {
    logger.info("addItem {} to cart {}", in.getItemId(), in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(
            replyTo -> new ShoppingCart.AddItem(in.getItemId(), in.getQuantity(), replyTo),
            timeout);
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  @Override
  public CompletionStage<Cart> removeItem(RemoveItemRequest in) {
    logger.info("updateItem {}", in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(
            replyTo -> new ShoppingCart.RemoveItem(in.getItemId(), in.getQuantity(), replyTo),
            timeout);
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  @Override
  public CompletionStage<Cart> checkout(CheckoutRequest in) {
    logger.info("checkout {}", in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(replyTo -> new ShoppingCart.Checkout(replyTo), timeout);
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  @Override
  public CompletionStage<Cart> getCart(GetCartRequest in) {
    logger.info("getCart {}", in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.ask(replyTo -> new ShoppingCart.Get(replyTo), timeout);
    CompletionStage<Cart> protoCart =
        reply.thenApply(
            cart -> {
              if (cart.items.isEmpty())
                throw new GrpcServiceException(
                    Status.NOT_FOUND.withDescription("Cart " + in.getCartId() + " not found"));
              else return toProtoCart(cart);
            });
    return convertError(protoCart);
  }

  private static Cart toProtoCart(ShoppingCart.Summary cart) {
    List<Item> protoItems =
        cart.items.entrySet().stream()
            .map(
                entry ->
                    Item.newBuilder()
                        .setItemId(entry.getKey())
                        .setQuantity(entry.getValue())
                        .build())
            .collect(Collectors.toList());

    return Cart.newBuilder().setCheckedOut(cart.checkedOut).addAllItems(protoItems).build();
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

### Example 16: Client access with Akka gRPC

```scala
def start(
    interface: String,
    port: Int,
    system: ActorSystem[_],
    grpcService: proto.ShoppingCartService): Unit = {
  implicit val sys: ActorSystem[_] = system
  implicit val ec: ExecutionContext =
    system.executionContext

  val service: HttpRequest => Future[HttpResponse] =
    ServiceHandler.concatOrNotFound(
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
```

### Example 17: Client access with Akka gRPC

```java
static void start(String host, int port, ActorSystem<?> system, ShoppingCartService grpcService) {
  @SuppressWarnings("unchecked")
  Function<HttpRequest, CompletionStage<HttpResponse>> service =
      ServiceHandler.concatOrNotFound(
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
```

### Example 18: Client access with Akka gRPC

```conf
akka.http.server.enable-http2 = on
```

### Example 19: Client access with Akka gRPC

```conf
akka.http.server.enable-http2 = on
```

### Example 20: Running the sample

```shell
docker compose up --wait
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql
```

### Example 21: Running the sample

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 22: Running the sample

```shell
sbt -Dconfig.resource=local2.conf run
sbt -Dconfig.resource=local3.conf run
```

### Example 23: Running the sample

```shell
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 24: Running the sample

```shell
mvn compile exec:exec -DAPP_CONFIG=local2.conf
mvn compile exec:exec -DAPP_CONFIG=local3.conf
```

### Example 25: Running the sample

```shell
# add item to cart
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# update quantity of item
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.UpdateItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/attachments/shopping-java.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/attachments/shopping-scala.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide.html
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/2-service-to-service.html
- https://doc.akka.io/libraries/akka-grpc/2.5/
- https://doc.akka.io/libraries/guide/microservices-tutorial/

---
*Source: [https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/1-event-sourced-shopping-cart.html](https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/1-event-sourced-shopping-cart.html)*
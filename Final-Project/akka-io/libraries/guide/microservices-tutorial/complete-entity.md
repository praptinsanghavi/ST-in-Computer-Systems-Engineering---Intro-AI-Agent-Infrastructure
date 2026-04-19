---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/complete-entity.html
title: 'Section 5: Complete Event Sourced entity :: Akka Guide'
---

# Section 5: Complete Event Sourced entity :: Akka Guide

## Content

# Section 5: Complete Event Sourced entity

Language

On this page, we will complete the cart entity with more commands and events. This `ShoppingCart` entity will use Event Sourcing to persist events that represent changes to the state of the cart.

![Example entity](_images/example-entity.drawio.svg)

This part of the [full example](overview.html) will focus on the shopping cart entity.

On this page you will learn how to:

- implement an Event Sourced entity by expanding work from the [previous steps](entity.html) and adding to the `ShoppingCart`:

	- `Checkout` \- a command to checkout the shopping cart
	- `CheckedOut` \- an event to capture checkouts
	- `Get` \- a way get the current state of the shopping cart

At the end, we also provide a list of [Optional commands and events](#_optional_commands_and_events) that you can add on your own to test your knowledge.

## Source downloads

If you prefer to simply view and run the example, download a zip file containing the completed code:

Java

- [Source](_attachments/2-shopping-cart-event-sourced-java.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/3-shopping-cart-event-sourced-complete-java.zip) with the steps on this page completed.

Scala

- [Source](_attachments/2-shopping-cart-event-sourced-scala.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/3-shopping-cart-event-sourced-complete-scala.zip) with the steps on this page completed.

## 1\. Add the command and event for checkout

When the cart has been checked out it should not accept any commands that change its state. However, it should still be possible to `Get` the current state of a checked out cart. We suggest you try implementing `Checkout` on your own and then compare it with the solution shown below. Add the `Checkout` command alongside the existing `AddItem` command.

The following sections show our solution.

### 1\.1\. Checkout command

Java

src/main/java/shopping/cart/ShoppingCart.java

```
record Checkout(ActorRef<StatusReply<Summary>> replyTo) implements Command {}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
final case class Checkout(replyTo: ActorRef[StatusReply[Summary]])
    extends Command
```

### 1\.2\. CheckedOut event

The corresponding `CheckedOut` event:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
record CheckedOut(String cartId, Instant eventTime) implements Event {}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
final case class CheckedOut(cartId: String, eventTime: Instant) extends Event
```

### 1\.3\. State changes

The state should include a value for if and when the cart was checked out:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
public record State(Map<String, Integer> items, Optional<Instant> checkoutDate)
    implements CborSerializable {

  public State() {
    this(new HashMap<>(), Optional.empty());
  }

  public boolean isCheckedOut() {
    return checkoutDate.isPresent();
  }

  public State checkout(Instant now) {
    return new State(items, Optional.of(now));
  }

  public Summary toSummary() {
    return new Summary(items, isCheckedOut());
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
    return new State(updatedItems, this.checkoutDate);
  }

  public boolean isEmpty() {
    return items.isEmpty();
  }

}

public record Summary(Map<String, Integer> items, boolean checkedOut)
    implements CborSerializable {}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
final case class State(items: Map[String, Int], checkoutDate: Option[Instant])
    extends CborSerializable {

  def isCheckedOut: Boolean =
    checkoutDate.isDefined

  def checkout(now: Instant): State =
    copy(checkoutDate = Some(now))

  def toSummary: Summary =
    Summary(items, isCheckedOut)
}

object State {
  val empty =
    State(items = Map.empty, checkoutDate = None)
}

final case class Summary(items: Map[String, Int], checkedOut: Boolean)
    extends CborSerializable
```

### 1\.4\. Unit test

Add a unit test for the new `Checkout` command in `ShoppingCartSpec` `ShoppingCartTest`:

Java

src/test/java/shopping/cart/ShoppingCartTest.java

```
@Test
public void checkout() {
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
      result2 = eventSourcedTestKit.runCommand(ShoppingCart.Checkout::new);
  assertTrue(result2.reply().isSuccess());
  assertTrue(result2.event() instanceof ShoppingCart.CheckedOut);
  assertEquals(CART_ID, result2.event().cartId());

  CommandResultWithReply<
          ShoppingCart.Command,
          ShoppingCart.Event,
          ShoppingCart.State,
          StatusReply<ShoppingCart.Summary>>
      result3 =
          eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
  assertTrue(result3.reply().isError());
}
```

Scala

src/test/scala/shopping/cart/ShoppingCartSpec.scala

```
"checkout" in {
  val result1 =
    eventSourcedTestKit.runCommand[StatusReply[ShoppingCart.Summary]](
      ShoppingCart.AddItem("foo", 42, _))
  result1.reply.isSuccess should ===(true)
  val result2 = eventSourcedTestKit
    .runCommand[StatusReply[ShoppingCart.Summary]](ShoppingCart.Checkout(_))
  result2.reply should ===(
    StatusReply.Success(summary(Map("foo" -> 42), checkedOut = true)))

  val result3 =
    eventSourcedTestKit.runCommand[StatusReply[ShoppingCart.Summary]](
      ShoppingCart.AddItem("bar", 13, _))
  result3.reply.isError should ===(true)
}
```

You will also have to update the "add item" to use the new `Summary` signature.

Commands should be handled differently when the cart has been checked out. `AddItem` is no longer allowed after checkout. Therefore, we refactor the `handleCommand` `commandHandler` method into two separate methods `openShoppingCart` and `checkedOutShoppingCart` that are used depending on the `checkedOut` state. The previous code for `AddItem` goes into the `openShoppingCart` method as well as the new `Checkout` command.

Java

src/main/java/shopping/cart/ShoppingCart.java

```
@Override
public CommandHandlerWithReply<Command, Event, State> commandHandler() {
  return openShoppingCart()
      .orElse(checkedOutShoppingCart())
      .build();
}

private CommandHandlerWithReplyBuilderByState<Command, Event, State, State> openShoppingCart() {
  return newCommandHandlerWithReplyBuilder()
      .forState(state -> !state.isCheckedOut())
      .onCommand(AddItem.class, this::onAddItem)
      .onCommand(Checkout.class, this::onCheckout);
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
    return Effect()
        .persist(new ItemAdded(cartId, cmd.itemId, cmd.quantity))
        .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
  }
}

private ReplyEffect<Event, State> onCheckout(State state, Checkout cmd) {
  if (state.isEmpty()) {
    return Effect()
        .reply(cmd.replyTo, StatusReply.error("Cannot checkout an empty shopping cart"));
  } else {
    return Effect()
        .persist(new CheckedOut(cartId, Instant.now()))
        .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
  }
}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
private def handleCommand(
    cartId: String,
    state: State,
    command: Command): ReplyEffect[Event, State] = {
  // The shopping cart behavior changes if it's checked out or not.
  // The commands are handled differently for each case.
  if (state.isCheckedOut)
    checkedOutShoppingCart(cartId, state, command)
  else
    openShoppingCart(cartId, state, command)
}

private def openShoppingCart(
    cartId: String,
    state: State,
    command: Command): ReplyEffect[Event, State] = {
  command match {
    case AddItem(itemId, quantity, replyTo) =>
      if (state.hasItem(itemId))
        Effect.reply(replyTo)(
          StatusReply.Error(
            s"Item '$itemId' was already added to this shopping cart"))
      else if (quantity <= 0)
        Effect.reply(replyTo)(
          StatusReply.Error("Quantity must be greater than zero"))
      else
        Effect
          .persist(ItemAdded(cartId, itemId, quantity))
          .thenReply(replyTo) { updatedCart =>
            StatusReply.Success(updatedCart.toSummary)
          }
    case Checkout(replyTo) =>
      if (state.isEmpty)
        Effect.reply(replyTo)(
          StatusReply.Error("Cannot checkout an empty shopping cart"))
      else
        Effect
          .persist(CheckedOut(cartId, Instant.now()))
          .thenReply(replyTo)(updatedCart =>
            StatusReply.Success(updatedCart.toSummary))
  }
}
```

In `checkedOutShoppingCart` the `AddItem` and `Checkout` commands should be rejected:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
private CommandHandlerWithReplyBuilderByState<Command, Event, State, State>
    checkedOutShoppingCart() {
  return newCommandHandlerWithReplyBuilder()
      .forState(State::isCheckedOut)
      .onCommand(
          AddItem.class,
          cmd ->
              Effect()
                  .reply(
                      cmd.replyTo,
                      StatusReply.error(
                          "Can't add an item to an already checked out shopping cart")))
      .onCommand(
          Checkout.class,
          cmd ->
              Effect()
                  .reply(
                      cmd.replyTo,
                      StatusReply.error("Can't checkout already checked out shopping cart")));
}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
private def checkedOutShoppingCart(
    cartId: String,
    state: State,
    command: Command): ReplyEffect[Event, State] = {
  command match {
    case cmd: AddItem =>
      Effect.reply(cmd.replyTo)(
        StatusReply.Error(
          "Can't add an item to an already checked out shopping cart"))
    case cmd: Checkout =>
      Effect.reply(cmd.replyTo)(
        StatusReply.Error("Can't checkout already checked out shopping cart"))
  }
}
```

### 1\.5\. Event handler

We still need to add the event handler for the `CheckedOut` event in the `handleEvent` method:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(ItemAdded.class, (state, evt) -> state.updateItem(evt.itemId, evt.quantity))
      .onEvent(CheckedOut.class, (state, evt) -> state.checkout(evt.eventTime))
      .build();
}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
private def handleEvent(state: State, event: Event): State = {
  event match {
    case ItemAdded(_, itemId, quantity) =>
      state.updateItem(itemId, quantity)
    case CheckedOut(_, eventTime) =>
      state.checkout(eventTime)
  }
}
```

### 1\.6\. Run unit tests

That should cover everything for the `Checkout` command. If you shut down the service after the previous exercise you will need to restart it using `docker compose up -d` in the command line.
Let’s confirm everything by running the unit tests with:

```
sbt test
```

```
mvn test
```

## 2\. Add Get command

Add the `Get` command alongside the existing `AddItem` and `Checkout` commands:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
record Get(ActorRef<Summary> replyTo) implements Command {}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
final case class Get(replyTo: ActorRef[Summary]) extends Command
```

Add a unit test for the new `Get` command in `ShoppingCartSpec`:

Java

src/test/java/shopping/cart/ShoppingCartTest.java

```
@Test
public void get() {
  CommandResultWithReply<
          ShoppingCart.Command,
          ShoppingCart.Event,
          ShoppingCart.State,
          StatusReply<ShoppingCart.Summary>>
      result1 =
          eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
  assertTrue(result1.reply().isSuccess());

  CommandResultWithReply<
          ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State, ShoppingCart.Summary>
      result2 = eventSourcedTestKit.runCommand(ShoppingCart.Get::new);
  assertFalse(result2.reply().checkedOut());
  assertEquals(1, result2.reply().items().size());
  assertEquals(42, result2.reply().items().get("foo").intValue());
}
```

Scala

src/test/scala/shopping/cart/ShoppingCartSpec.scala

```
"get" in {
  val result1 =
    eventSourcedTestKit.runCommand[StatusReply[ShoppingCart.Summary]](
      ShoppingCart.AddItem("foo", 42, _))
  result1.reply.isSuccess should ===(true)

  val result2 = eventSourcedTestKit.runCommand[ShoppingCart.Summary](
    ShoppingCart.Get(_))
  result2.reply should ===(summary(Map("foo" -> 42), checkedOut = false))
}
```

The command handler for `Get` is independent of the `checkedOut` state, so add it to both `openShoppingCart` and `checkedOutShoppingCart` so it can be added to the command handler builder using `forAnyState()`:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
@Override
public CommandHandlerWithReply<Command, Event, State> commandHandler() {
  return openShoppingCart()
      .orElse(checkedOutShoppingCart())
      .orElse(getCommandHandler())
      .build();
}

private CommandHandlerWithReplyBuilderByState<Command, Event, State, State> getCommandHandler() {
  return newCommandHandlerWithReplyBuilder()
      .forAnyState()
      .onCommand(Get.class, (state, cmd) -> Effect().reply(cmd.replyTo, state.toSummary()));
}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
case Get(replyTo) =>
  Effect.reply(replyTo)(state.toSummary)
```

Try the new `Get` command by running the unit tests with:

```
sbt test
```

```
mvn test
```

## 3\. Add new operations to the service descriptor

In the existing `shopping_cart_service.proto` add corresponding operation definitions in the form of the two rpc calls listed below:

src/main/protobuf/shoppingcart/shopping\_cart\_service.proto

```
syntax = "proto3";

package shoppingcart;

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

// gRPC definition for ShoppingCartService

service ShoppingCartService {
  rpc AddItem(AddItemRequest) returns (Cart) {}
  rpc Checkout(CheckoutRequest) returns (Cart) {} (1)
  rpc GetCart(GetCartRequest) returns (Cart) {} (2)
}

message AddItemRequest {
  string cart_id = 1;
  string item_id = 2;
  int32 quantity = 3;
}
message CheckoutRequest {
  string cart_id = 1;
}

message GetCartRequest {
  string cart_id = 1;
}

message Cart { (3)
  repeated Item items = 1;
  bool checked_out = 2; (4)
}

message Item {
  string item_id = 1;
  int32 quantity = 2;
}
```

| **1** | Defines the `Checkout` operation. |
| --- | --- |
| **2** | Defines the `GetCart` operation. |
| **3** | For simplicity, most requests share a common response. However, for easier evolution of an interface, separate responses are often a better choice. |
| **4** | Note the new `checked_out` flag. |

Generate code by compiling the project:

```
sbt compile
```

```
mvn compile
```

You will see a compilation error in `ShoppingCartServiceImpl.scala` `ShoppingCartServiceImpl.java`, but that is expected with the changed Protobuf definition. We will fix that now.

Add implementations of the new operations in `ShoppingCartServiceImpl` in the same way as `addItem`:

Java

src/main/java/shopping/cart/ShoppingCartServiceImpl.java

```
@Override
public CompletionStage<Cart> checkout(CheckoutRequest in) {
  logger.info("checkout {}", in.getCartId());
  var entityRef = sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
  var reply =
      entityRef
          .askWithStatus(ShoppingCart.Checkout::new, timeout)
          .thenApply(ShoppingCartServiceImpl::toProtoCart);
  return convertError(reply);
}

@Override
public CompletionStage<Cart> getCart(GetCartRequest in) {
  logger.info("getCart {}", in.getCartId());
  var entityRef = sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
  var reply = entityRef.ask(ShoppingCart.Get::new, timeout);
  var protoCart =
      reply.thenApply(
          cart -> {
            if (cart.items().isEmpty())
              throw new GrpcServiceException(
                  Status.NOT_FOUND.withDescription("Cart " + in.getCartId() + " not found"));
            else return toProtoCart(cart);
          });
  return convertError(protoCart);
}
```

Scala

src/main/scala/shopping/cart/ShoppingCartServiceImpl.scala

```
override def checkout(in: proto.CheckoutRequest): Future[proto.Cart] = {
  logger.info("checkout {}", in.cartId)
  val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
  val reply: Future[ShoppingCart.Summary] =
    entityRef.askWithStatus(ShoppingCart.Checkout)
  val response = reply.map(cart => toProtoCart(cart))
  convertError(response)
}

override def getCart(in: proto.GetCartRequest): Future[proto.Cart] = {
  logger.info("getCart {}", in.cartId)
  val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
  val response =
    entityRef.ask(ShoppingCart.Get).map { cart =>
      if (cart.items.isEmpty)
        throw new GrpcServiceException(
          Status.NOT_FOUND.withDescription(s"Cart ${in.cartId} not found"))
      else
        toProtoCart(cart)
    }
  convertError(response)
}
```

We also have to include the new `checkedOut` flag when converting from `ShoppingCart.Summary` to `proto.Cart`.

Java

src/main/java/shopping/cart/ShoppingCartServiceImpl.java

```
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

  return Cart.newBuilder().setCheckedOut(cart.checkedOut()).addAllItems(protoItems).build();
}
```

Scala

src/main/scala/shopping/cart/ShoppingCartServiceImpl.scala

```
private def toProtoCart(cart: ShoppingCart.Summary): proto.Cart = {
  proto.Cart(
    cart.items.iterator.map { case (itemId, quantity) =>
      proto.Item(itemId, quantity)
    }.toSeq,
    cart.checkedOut)
}
```

## 4\. Run locally

Start the PostgreSQL database, unless it’s already running:

```
docker compose up -d
```

Run the service with:

```
sbt -Dconfig.resource=local1.conf run
```

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### 4\.1\. Exercise the service

Use `[grpcurl](https://github.com/fullstorydev/grpcurl)` to exercise the service:

1. Add an item to the cart:

```
grpcurl -d '{"cartId":"cart2", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
2. Check the quantity of the cart:

```
grpcurl -d '{"cartId":"cart2"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart
```
3. Check out cart:

```
grpcurl -d '{"cartId":"cart2"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

### 4\.2\. Stop the service

When finished, stop the service with `ctrl-c`. Leave PostgreSQL running for the next set of steps, or stop it with:

```
docker compose stop
```

## Optional commands and events

The commands and events listed in this section are not mandatory for subsequent steps of the tutorial and their details won’t be covered on this page. You can implement the commands, events, and `State` management following the pattern we used for the `AddItem` command and `ItemAdded` event in the [previous step](entity.html). This is a good exercise to help solidify your knowledge of how to implement `EventSourcedBehavior`. Optional commands and corresponding events that you can add on your own:

- `RemoveItem` \- remove an item from the cart
- `AdjustItemQuantity` \- adjust the quantity of an item in the cart
- `ItemRemoved`
- `ItemQuantityAdjusted`

After adding the optional commands, you can build and run again and try them out:

Update the quantity of an item:

```
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":6}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.UpdateItem
```

Get the cart state again:

```
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart
```

## Learn more

- [Event Sourcing concepts](../concepts/event-sourcing.html).
- [Akka Event Sourcing reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html).
- [Akka Cluster Sharding reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html).

## Code Examples

### Example 1: 1.1. Checkout command

```java
record Checkout(ActorRef<StatusReply<Summary>> replyTo) implements Command {}
```

### Example 2: 1.1. Checkout command

```scala
final case class Checkout(replyTo: ActorRef[StatusReply[Summary]])
    extends Command
```

### Example 3: 1.2. CheckedOut event

```java
record CheckedOut(String cartId, Instant eventTime) implements Event {}
```

### Example 4: 1.2. CheckedOut event

```scala
final case class CheckedOut(cartId: String, eventTime: Instant) extends Event
```

### Example 5: 1.3. State changes

```java
public record State(Map<String, Integer> items, Optional<Instant> checkoutDate)
    implements CborSerializable {

  public State() {
    this(new HashMap<>(), Optional.empty());
  }

  public boolean isCheckedOut() {
    return checkoutDate.isPresent();
  }

  public State checkout(Instant now) {
    return new State(items, Optional.of(now));
  }

  public Summary toSummary() {
    return new Summary(items, isCheckedOut());
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
    return new State(updatedItems, this.checkoutDate);
  }

  public boolean isEmpty() {
    return items.isEmpty();
  }

}

public record Summary(Map<String, Integer> items, boolean checkedOut)
    implements CborSerializable {}
```

### Example 6: 1.3. State changes

```scala
final case class State(items: Map[String, Int], checkoutDate: Option[Instant])
    extends CborSerializable {

  def isCheckedOut: Boolean =
    checkoutDate.isDefined

  def checkout(now: Instant): State =
    copy(checkoutDate = Some(now))

  def toSummary: Summary =
    Summary(items, isCheckedOut)
}

object State {
  val empty =
    State(items = Map.empty, checkoutDate = None)
}

final case class Summary(items: Map[String, Int], checkedOut: Boolean)
    extends CborSerializable
```

### Example 7: 1.4. Unit test

```java
@Test
public void checkout() {
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
      result2 = eventSourcedTestKit.runCommand(ShoppingCart.Checkout::new);
  assertTrue(result2.reply().isSuccess());
  assertTrue(result2.event() instanceof ShoppingCart.CheckedOut);
  assertEquals(CART_ID, result2.event().cartId());

  CommandResultWithReply<
          ShoppingCart.Command,
          ShoppingCart.Event,
          ShoppingCart.State,
          StatusReply<ShoppingCart.Summary>>
      result3 =
          eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
  assertTrue(result3.reply().isError());
}
```

### Example 8: 1.4. Unit test

```scala
"checkout" in {
  val result1 =
    eventSourcedTestKit.runCommand[StatusReply[ShoppingCart.Summary]](
      ShoppingCart.AddItem("foo", 42, _))
  result1.reply.isSuccess should ===(true)
  val result2 = eventSourcedTestKit
    .runCommand[StatusReply[ShoppingCart.Summary]](ShoppingCart.Checkout(_))
  result2.reply should ===(
    StatusReply.Success(summary(Map("foo" -> 42), checkedOut = true)))

  val result3 =
    eventSourcedTestKit.runCommand[StatusReply[ShoppingCart.Summary]](
      ShoppingCart.AddItem("bar", 13, _))
  result3.reply.isError should ===(true)
}
```

### Example 9: 1.4. Unit test

```java
@Override
public CommandHandlerWithReply<Command, Event, State> commandHandler() {
  return openShoppingCart()
      .orElse(checkedOutShoppingCart())
      .build();
}

private CommandHandlerWithReplyBuilderByState<Command, Event, State, State> openShoppingCart() {
  return newCommandHandlerWithReplyBuilder()
      .forState(state -> !state.isCheckedOut())
      .onCommand(AddItem.class, this::onAddItem)
      .onCommand(Checkout.class, this::onCheckout);
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
    return Effect()
        .persist(new ItemAdded(cartId, cmd.itemId, cmd.quantity))
        .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
  }
}

private ReplyEffect<Event, State> onCheckout(State state, Checkout cmd) {
  if (state.isEmpty()) {
    return Effect()
        .reply(cmd.replyTo, StatusReply.error("Cannot checkout an empty shopping cart"));
  } else {
    return Effect()
        .persist(new CheckedOut(cartId, Instant.now()))
        .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
  }
}
```

### Example 10: 1.4. Unit test

```scala
private def handleCommand(
    cartId: String,
    state: State,
    command: Command): ReplyEffect[Event, State] = {
  // The shopping cart behavior changes if it's checked out or not.
  // The commands are handled differently for each case.
  if (state.isCheckedOut)
    checkedOutShoppingCart(cartId, state, command)
  else
    openShoppingCart(cartId, state, command)
}

private def openShoppingCart(
    cartId: String,
    state: State,
    command: Command): ReplyEffect[Event, State] = {
  command match {
    case AddItem(itemId, quantity, replyTo) =>
      if (state.hasItem(itemId))
        Effect.reply(replyTo)(
          StatusReply.Error(
            s"Item '$itemId' was already added to this shopping cart"))
      else if (quantity <= 0)
        Effect.reply(replyTo)(
          StatusReply.Error("Quantity must be greater than zero"))
      else
        Effect
          .persist(ItemAdded(cartId, itemId, quantity))
          .thenReply(replyTo) { updatedCart =>
            StatusReply.Success(updatedCart.toSummary)
          }
    case Checkout(replyTo) =>
      if (state.isEmpty)
        Effect.reply(replyTo)(
          StatusReply.Error("Cannot checkout an empty shopping cart"))
      else
        Effect
          .persist(CheckedOut(cartId, Instant.now()))
          .thenReply(replyTo)(updatedCart =>
            StatusReply.Success(updatedCart.toSummary))
  }
}
```

### Example 11: 1.4. Unit test

```java
private CommandHandlerWithReplyBuilderByState<Command, Event, State, State>
    checkedOutShoppingCart() {
  return newCommandHandlerWithReplyBuilder()
      .forState(State::isCheckedOut)
      .onCommand(
          AddItem.class,
          cmd ->
              Effect()
                  .reply(
                      cmd.replyTo,
                      StatusReply.error(
                          "Can't add an item to an already checked out shopping cart")))
      .onCommand(
          Checkout.class,
          cmd ->
              Effect()
                  .reply(
                      cmd.replyTo,
                      StatusReply.error("Can't checkout already checked out shopping cart")));
}
```

### Example 12: 1.4. Unit test

```scala
private def checkedOutShoppingCart(
    cartId: String,
    state: State,
    command: Command): ReplyEffect[Event, State] = {
  command match {
    case cmd: AddItem =>
      Effect.reply(cmd.replyTo)(
        StatusReply.Error(
          "Can't add an item to an already checked out shopping cart"))
    case cmd: Checkout =>
      Effect.reply(cmd.replyTo)(
        StatusReply.Error("Can't checkout already checked out shopping cart"))
  }
}
```

### Example 13: 1.5. Event handler

```java
@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(ItemAdded.class, (state, evt) -> state.updateItem(evt.itemId, evt.quantity))
      .onEvent(CheckedOut.class, (state, evt) -> state.checkout(evt.eventTime))
      .build();
}
```

### Example 14: 1.5. Event handler

```scala
private def handleEvent(state: State, event: Event): State = {
  event match {
    case ItemAdded(_, itemId, quantity) =>
      state.updateItem(itemId, quantity)
    case CheckedOut(_, eventTime) =>
      state.checkout(eventTime)
  }
}
```

### Example 15: 1.6. Run unit tests

```shell
sbt test
```

### Example 16: 1.6. Run unit tests

```shell
mvn test
```

### Example 17: 2. Add Get command

```java
record Get(ActorRef<Summary> replyTo) implements Command {}
```

### Example 18: 2. Add Get command

```scala
final case class Get(replyTo: ActorRef[Summary]) extends Command
```

### Example 19: 2. Add Get command

```java
@Test
public void get() {
  CommandResultWithReply<
          ShoppingCart.Command,
          ShoppingCart.Event,
          ShoppingCart.State,
          StatusReply<ShoppingCart.Summary>>
      result1 =
          eventSourcedTestKit.runCommand(replyTo -> new ShoppingCart.AddItem("foo", 42, replyTo));
  assertTrue(result1.reply().isSuccess());

  CommandResultWithReply<
          ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State, ShoppingCart.Summary>
      result2 = eventSourcedTestKit.runCommand(ShoppingCart.Get::new);
  assertFalse(result2.reply().checkedOut());
  assertEquals(1, result2.reply().items().size());
  assertEquals(42, result2.reply().items().get("foo").intValue());
}
```

### Example 20: 2. Add Get command

```scala
"get" in {
  val result1 =
    eventSourcedTestKit.runCommand[StatusReply[ShoppingCart.Summary]](
      ShoppingCart.AddItem("foo", 42, _))
  result1.reply.isSuccess should ===(true)

  val result2 = eventSourcedTestKit.runCommand[ShoppingCart.Summary](
    ShoppingCart.Get(_))
  result2.reply should ===(summary(Map("foo" -> 42), checkedOut = false))
}
```

### Example 21: 2. Add Get command

```java
@Override
public CommandHandlerWithReply<Command, Event, State> commandHandler() {
  return openShoppingCart()
      .orElse(checkedOutShoppingCart())
      .orElse(getCommandHandler())
      .build();
}

private CommandHandlerWithReplyBuilderByState<Command, Event, State, State> getCommandHandler() {
  return newCommandHandlerWithReplyBuilder()
      .forAnyState()
      .onCommand(Get.class, (state, cmd) -> Effect().reply(cmd.replyTo, state.toSummary()));
}
```

### Example 22: 2. Add Get command

```scala
case Get(replyTo) =>
  Effect.reply(replyTo)(state.toSummary)
```

### Example 23: 2. Add Get command

```shell
sbt test
```

### Example 24: 2. Add Get command

```shell
mvn test
```

### Example 25: 3. Add new operations to the service descriptor

```protobuf
syntax = "proto3";

package shoppingcart;

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

// gRPC definition for ShoppingCartService

service ShoppingCartService {
  rpc AddItem(AddItemRequest) returns (Cart) {}
  rpc Checkout(CheckoutRequest) returns (Cart) {} (1)
  rpc GetCart(GetCartRequest) returns (Cart) {} (2)
}

message AddItemRequest {
  string cart_id = 1;
  string item_id = 2;
  int32 quantity = 3;
}
message CheckoutRequest {
  string cart_id = 1;
}

message GetCartRequest {
  string cart_id = 1;
}

message Cart { (3)
  repeated Item items = 1;
  bool checked_out = 2; (4)
}

message Item {
  string item_id = 1;
  int32 quantity = 2;
}
```

### Example 26: 3. Add new operations to the service descriptor

```shell
sbt compile
```

### Example 27: 3. Add new operations to the service descriptor

```shell
mvn compile
```

### Example 28: 3. Add new operations to the service descriptor

```java
@Override
public CompletionStage<Cart> checkout(CheckoutRequest in) {
  logger.info("checkout {}", in.getCartId());
  var entityRef = sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
  var reply =
      entityRef
          .askWithStatus(ShoppingCart.Checkout::new, timeout)
          .thenApply(ShoppingCartServiceImpl::toProtoCart);
  return convertError(reply);
}

@Override
public CompletionStage<Cart> getCart(GetCartRequest in) {
  logger.info("getCart {}", in.getCartId());
  var entityRef = sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
  var reply = entityRef.ask(ShoppingCart.Get::new, timeout);
  var protoCart =
      reply.thenApply(
          cart -> {
            if (cart.items().isEmpty())
              throw new GrpcServiceException(
                  Status.NOT_FOUND.withDescription("Cart " + in.getCartId() + " not found"));
            else return toProtoCart(cart);
          });
  return convertError(protoCart);
}
```

### Example 29: 3. Add new operations to the service descriptor

```scala
override def checkout(in: proto.CheckoutRequest): Future[proto.Cart] = {
  logger.info("checkout {}", in.cartId)
  val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
  val reply: Future[ShoppingCart.Summary] =
    entityRef.askWithStatus(ShoppingCart.Checkout)
  val response = reply.map(cart => toProtoCart(cart))
  convertError(response)
}

override def getCart(in: proto.GetCartRequest): Future[proto.Cart] = {
  logger.info("getCart {}", in.cartId)
  val entityRef = sharding.entityRefFor(ShoppingCart.EntityKey, in.cartId)
  val response =
    entityRef.ask(ShoppingCart.Get).map { cart =>
      if (cart.items.isEmpty)
        throw new GrpcServiceException(
          Status.NOT_FOUND.withDescription(s"Cart ${in.cartId} not found"))
      else
        toProtoCart(cart)
    }
  convertError(response)
}
```

### Example 30: 3. Add new operations to the service descriptor

```java
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

  return Cart.newBuilder().setCheckedOut(cart.checkedOut()).addAllItems(protoItems).build();
}
```

### Example 31: 3. Add new operations to the service descriptor

```scala
private def toProtoCart(cart: ShoppingCart.Summary): proto.Cart = {
  proto.Cart(
    cart.items.iterator.map { case (itemId, quantity) =>
      proto.Item(itemId, quantity)
    }.toSeq,
    cart.checkedOut)
}
```

### Example 32: 4. Run locally

```shell
docker compose up -d
```

### Example 33: 4. Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 34: 4. Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 35: 4.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart2", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 36: 4.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart2"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart
```

### Example 37: 4.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart2"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

### Example 38: 4.2. Stop the service

```shell
docker compose stop
```

### Example 39: Optional commands and events

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":6}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.UpdateItem
```

### Example 40: Optional commands and events

```shell
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
- https://doc.akka.io/libraries/guide/concepts/event-sourcing.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/2-shopping-cart-event-sourced-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/2-shopping-cart-event-sourced-scala.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/3-shopping-cart-event-sourced-complete-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/3-shopping-cart-event-sourced-complete-scala.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/entity.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/overview.html

---
*Source: [https://doc.akka.io/libraries/guide/microservices-tutorial/complete-entity.html](https://doc.akka.io/libraries/guide/microservices-tutorial/complete-entity.html)*
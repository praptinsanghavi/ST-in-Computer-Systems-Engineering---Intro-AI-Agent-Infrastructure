---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-cart.html
title: Shopping cart example • Akka core
---

# Shopping cart example • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Shopping cart example

The provided CRDT data structures can be used as the root state of a replicated `EventSourcedBehavior` but they can also be nested inside another data structure. This requires a bit more careful thinking about the eventual consistency.

In this sample we model a shopping cart as a map of product ids and the number of that product added or removed in the shopping cart. By using the [`Counter`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/crdt/Counter.html "akka.persistence.typed.crdt.Counter")[`Counter`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/Counter.html "akka.persistence.typed.crdt.Counter") CRDT and persisting its `Update` in our events we can be sure that an add or remove of items in any replica will eventually lead to all replicas ending up with the same number of each product. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedShoppingCartExampleSpec.scala#L28-L81 "Go to snippet source")object ShoppingCart {

  type ProductId = String

  sealed trait Command extends CborSerializable
  final case class AddItem(id: ProductId, count: Int) extends Command
  final case class RemoveItem(id: ProductId, count: Int) extends Command
  final case class GetCartItems(replyTo: ActorRef[CartItems]) extends Command
  final case class CartItems(items: Map[ProductId, Int]) extends CborSerializable

  sealed trait Event extends CborSerializable
  final case class ItemUpdated(id: ProductId, update: Counter.Updated) extends Event

  final case class State(items: Map[ProductId, Counter])

  def apply(entityId: String, replicaId: ReplicaId, allReplicaIds: Set[ReplicaId]): Behavior[Command] = {
    ReplicatedEventSourcing.commonJournalConfig(
      ReplicationId("cart", entityId, replicaId),
      allReplicaIds,
      PersistenceTestKitReadJournal.Identifier) { replicationContext =>
      EventSourcedBehavior[Command, Event, State](
        replicationContext.persistenceId,
        State(Map.empty),
        (state, cmd) => commandHandler(state, cmd),
        (state, event) => eventHandler(state, event))
    }
  }

  private def commandHandler(state: State, cmd: Command): Effect[Event, State] = {
    cmd match {
      case AddItem(productId, count) =>
        Effect.persist(ItemUpdated(productId, Counter.Updated(count)))
      case RemoveItem(productId, count) =>
        Effect.persist(ItemUpdated(productId, Counter.Updated(-count)))
      case GetCartItems(replyTo) =>
        val items = state.items.collect {
          case (id, counter) if counter.value > 0 => id -> counter.value.toInt
        }
        replyTo ! CartItems(items)
        Effect.none
    }
  }

  private def eventHandler(state: State, event: Event): State = {
    event match {
      case ItemUpdated(id, update) =>
        val newItems = state.items.get(id) match {
          case Some(counter) => state.items + (id -> counter.applyOperation(update))
          case None          => state.items + (id -> Counter.empty.applyOperation(update))
        }
        State(newItems)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/ReplicatedShoppingCartExample.java#L27-L155 "Go to snippet source")public final class ShoppingCart
    extends ReplicatedEventSourcedBehavior<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {

  public interface Event {}

  public static final class ItemUpdated implements Event {
    public final String productId;
    public final Counter.Updated update;

    public ItemUpdated(String productId, Counter.Updated update) {
      this.productId = productId;
      this.update = update;
    }
  }

  public interface Command {}

  public static final class AddItem implements Command {
    public final String productId;
    public final int count;

    public AddItem(String productId, int count) {
      this.productId = productId;
      this.count = count;
    }
  }

  public static final class RemoveItem implements Command {
    public final String productId;
    public final int count;

    public RemoveItem(String productId, int count) {
      this.productId = productId;
      this.count = count;
    }
  }

  public static class GetCartItems implements Command {
    public final ActorRef<CartItems> replyTo;

    public GetCartItems(ActorRef<CartItems> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static final class CartItems {
    public final Map<String, Integer> items;

    public CartItems(Map<String, Integer> items) {
      this.items = items;
    }
  }

  public static final class State {
    public final Map<String, Counter> items = new HashMap<>();
  }

  public static Behavior<Command> create(
      String entityId, ReplicaId replicaId, Set<ReplicaId> allReplicas) {
    return ReplicatedEventSourcing.commonJournalConfig(
        new ReplicationId("blog", entityId, replicaId),
        allReplicas,
        PersistenceTestKitReadJournal.Identifier(),
        ShoppingCart::new);
  }

  private ShoppingCart(ReplicationContext replicationContext) {
    super(replicationContext);
  }

  @Override
  public State emptyState() {
    return new State();
  }

  @Override
  public CommandHandler<Command, Event, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(AddItem.class, this::onAddItem)
        .onCommand(RemoveItem.class, this::onRemoveItem)
        .onCommand(GetCartItems.class, this::onGetCartItems)
        .build();
  }

  private Effect<Event, State> onAddItem(State state, AddItem command) {
    return Effect()
        .persist(new ItemUpdated(command.productId, new Counter.Updated(command.count)));
  }

  private Effect<Event, State> onRemoveItem(State state, RemoveItem command) {
    return Effect()
        .persist(new ItemUpdated(command.productId, new Counter.Updated(-command.count)));
  }

  private Effect<Event, State> onGetCartItems(State state, GetCartItems command) {
    command.replyTo.tell(new CartItems(filterEmptyAndNegative(state.items)));
    return Effect().none();
  }

  private Map<String, Integer> filterEmptyAndNegative(Map<String, Counter> cart) {
    Map<String, Integer> result = new HashMap<>();
    for (Map.Entry<String, Counter> entry : cart.entrySet()) {
      int count = entry.getValue().value().intValue();
      if (count > 0) result.put(entry.getKey(), count);
    }
    return Collections.unmodifiableMap(result);
  }

  @Override
  public EventHandler<State, Event> eventHandler() {
    return newEventHandlerBuilder()
        .forAnyState()
        .onEvent(ItemUpdated.class, this::onItemUpdated)
        .build();
  }

  private State onItemUpdated(State state, ItemUpdated event) {
    final Counter counterForProduct;
    if (state.items.containsKey(event.productId)) {
      counterForProduct = state.items.get(event.productId);
    } else {
      counterForProduct = Counter.empty();
    }
    state.items.put(event.productId, counterForProduct.applyOperation(event.update));
    return state;
  }
}
```

With this model we cannot have a `ClearCart` command as that could give different states in different replicas. It is quite easy to imagine such a scenario: commands arriving in the order `ClearCart`, `AddItem('a', 5)` in one replica and the order `AddItem('a', 5), ClearCart` in another.

To clear a cart a client would instead have to remove as many items of each product as it sees in the cart at the time of removal.

## Code Examples

### Example 1: Shopping cart example

```scala
object ShoppingCart {

  type ProductId = String

  sealed trait Command extends CborSerializable
  final case class AddItem(id: ProductId, count: Int) extends Command
  final case class RemoveItem(id: ProductId, count: Int) extends Command
  final case class GetCartItems(replyTo: ActorRef[CartItems]) extends Command
  final case class CartItems(items: Map[ProductId, Int]) extends CborSerializable

  sealed trait Event extends CborSerializable
  final case class ItemUpdated(id: ProductId, update: Counter.Updated) extends Event

  final case class State(items: Map[ProductId, Counter])

  def apply(entityId: String, replicaId: ReplicaId, allReplicaIds: Set[ReplicaId]): Behavior[Command] = {
    ReplicatedEventSourcing.commonJournalConfig(
      ReplicationId("cart", entityId, replicaId),
      allReplicaIds,
      PersistenceTestKitReadJournal.Identifier) { replicationContext =>
      EventSourcedBehavior[Command, Event, State](
        replicationContext.persistenceId,
        State(Map.empty),
        (state, cmd) => commandHandler(state, cmd),
        (state, event) => eventHandler(state, event))
    }
  }

  private def commandHandler(state: State, cmd: Command): Effect[Event, State] = {
    cmd match {
      case AddItem(productId, count) =>
        Effect.persist(ItemUpdated(productId, Counter.Updated(count)))
      case RemoveItem(productId, count) =>
        Effect.persist(ItemUpdated(productId, Counter.Updated(-count)))
      case GetCartItems(replyTo) =>
        val items = state.items.collect {
          case (id, counter) if counter.value > 0 => id -> counter.value.toInt
        }
        replyTo ! CartItems(items)
        Effect.none
    }
  }

  private def eventHandler(state: State, event: Event): State = {
    event match {
      case ItemUpdated(id, update) =>
        val newItems = state.items.get(id) match {
          case Some(counter) => state.items + (id -> counter.applyOperation(update))
          case None          => state.items + (id -> Counter.empty.applyOperation(update))
        }
        State(newItems)
    }
  }
}
```

### Example 2: Shopping cart example

```java
public final class ShoppingCart
    extends ReplicatedEventSourcedBehavior<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {

  public interface Event {}

  public static final class ItemUpdated implements Event {
    public final String productId;
    public final Counter.Updated update;

    public ItemUpdated(String productId, Counter.Updated update) {
      this.productId = productId;
      this.update = update;
    }
  }

  public interface Command {}

  public static final class AddItem implements Command {
    public final String productId;
    public final int count;

    public AddItem(String productId, int count) {
      this.productId = productId;
      this.count = count;
    }
  }

  public static final class RemoveItem implements Command {
    public final String productId;
    public final int count;

    public RemoveItem(String productId, int count) {
      this.productId = productId;
      this.count = count;
    }
  }

  public static class GetCartItems implements Command {
    public final ActorRef<CartItems> replyTo;

    public GetCartItems(ActorRef<CartItems> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static final class CartItems {
    public final Map<String, Integer> items;

    public CartItems(Map<String, Integer> items) {
      this.items = items;
    }
  }

  public static final class State {
    public final Map<String, Counter> items = new HashMap<>();
  }

  public static Behavior<Command> create(
      String entityId, ReplicaId replicaId, Set<ReplicaId> allReplicas) {
    return ReplicatedEventSourcing.commonJournalConfig(
        new ReplicationId("blog", entityId, replicaId),
        allReplicas,
        PersistenceTestKitReadJournal.Identifier(),
        ShoppingCart::new);
  }

  private ShoppingCart(ReplicationContext replicationContext) {
    super(replicationContext);
  }

  @Override
  public State emptyState() {
    return new State();
  }

  @Override
  public CommandHandler<Command, Event, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(AddItem.class, this::onAddItem)
        .onCommand(RemoveItem.class, this::onRemoveItem)
        .onCommand(GetCartItems.class, this::onGetCartItems)
        .build();
  }

  private Effect<Event, State> onAddItem(State state, AddItem command) {
    return Effect()
        .persist(new ItemUpdated(command.productId, new Counter.Updated(command.count)));
  }

  private Effect<Event, State> onRemoveItem(State state, RemoveItem command) {
    return Effect()
        .persist(new ItemUpdated(command.productId, new Counter.Updated(-command.count)));
  }

  private Effect<Event, State> onGetCartItems(State state, GetCartItems command) {
    command.replyTo.tell(new CartItems(filterEmptyAndNegative(state.items)));
    return Effect().none();
  }

  private Map<String, Integer> filterEmptyAndNegative(Map<String, Counter> cart) {
    Map<String, Integer> result = new HashMap<>();
    for (Map.Entry<String, Counter> entry : cart.entrySet()) {
      int count = entry.getValue().value().intValue();
      if (count > 0) result.put(entry.getKey(), count);
    }
    return Collections.unmodifiableMap(result);
  }

  @Override
  public EventHandler<State, Event> eventHandler() {
    return newEventHandlerBuilder()
        .forAnyState()
        .onEvent(ItemUpdated.class, this::onItemUpdated)
        .build();
  }

  private State onItemUpdated(State state, ItemUpdated event) {
    final Counter counterForProduct;
    if (state.items.containsKey(event.productId)) {
      counterForProduct = state.items.get(event.productId);
    } else {
      counterForProduct = Counter.empty();
    }
    state.items.put(event.productId, counterForProduct.applyOperation(event.update));
    return state;
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/libraries/akka-core/current/typed/index-persistence-durable-state.html
- https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-auction.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-cart.html](https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-cart.html)*
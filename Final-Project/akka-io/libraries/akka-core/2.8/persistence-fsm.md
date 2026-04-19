---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/docs/akka/current/persistence-fsm.html
title: Classic Persistent FSM • Akka Documentation
---

# Classic Persistent FSM • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Classic Persistent FSM

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

## Dependency

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

Persistent FSMs are part of Akka persistence, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.8.9</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  implementation "com.typesafe.akka:akka-persistence_${versions.ScalaBinary}"
}
```
Warning
Persistent FSM is no longer actively developed and will be replaced by [Akka Persistence Typed](typed/persistence.html). It is not advised to build new applications with Persistent FSM. Existing users of Persistent FSM [should migrate](persistence-fsm.html#migration-to-eventsourcedbehavior). 

`PersistentFSM``AbstractPersistentFSM` handles the incoming messages in an FSM like fashion. Its internal state is persisted as a sequence of changes, later referred to as domain events. Relationship between incoming messages, FSM’s states and transitions, persistence of domain events is defined by a DSL.

### A Simple Example

To demonstrate the features of the `PersistentFSM` trait`AbstractPersistentFSM`, consider an actor which represents a Web store customer. The contract of our “WebStoreCustomerFSMActor” is that it accepts the following commands:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/scala/akka/persistence/fsm/PersistentFSMSpec.scala#L437-L441 "Go to snippet source")sealed trait Command
case class AddItem(item: Item) extends Command
case object Buy extends Command
case object Leave extends Command
case object GetCurrentCart extends Command
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/java/akka/persistence/fsm/AbstractPersistentFSMTest.java#L113-L135 "Go to snippet source")public static final class AddItem implements Command {
  private final Item item;

  public AddItem(Item item) {
    this.item = item;
  }

  public Item getItem() {
    return item;
  }
}

public enum Buy implements Command {
  INSTANCE
}

public enum Leave implements Command {
  INSTANCE
}

public enum GetCurrentCart implements Command {
  INSTANCE
}
```

`AddItem` sent when the customer adds an item to a shopping cart `Buy` \- when the customer finishes the purchase `Leave` \- when the customer leaves the store without purchasing anything `GetCurrentCart` allows to query the current state of customer’s shopping cart

The customer can be in one of the following states:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/scala/akka/persistence/fsm/PersistentFSMSpec.scala#L404-L416 "Go to snippet source")sealed trait UserState extends FSMState
case object LookingAround extends UserState {
  override def identifier: String = "Looking Around"
}
case object Shopping extends UserState {
  override def identifier: String = "Shopping"
}
case object Inactive extends UserState {
  override def identifier: String = "Inactive"
}
case object Paid extends UserState {
  override def identifier: String = "Paid"
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/java/akka/persistence/fsm/AbstractPersistentFSMTest.java#L27-L43 "Go to snippet source")enum UserState implements PersistentFSM.FSMState {
  LOOKING_AROUND("Looking Around"),
  SHOPPING("Shopping"),
  INACTIVE("Inactive"),
  PAID("Paid");

  private final String stateIdentifier;

  UserState(String stateIdentifier) {
    this.stateIdentifier = stateIdentifier;
  }

  @Override
  public String identifier() {
    return stateIdentifier;
  }
}
```

`LookingAround` customer is browsing the site, but hasn’t added anything to the shopping cart `Shopping` customer has recently added items to the shopping cart `Inactive` customer has items in the shopping cart, but hasn’t added anything recently `Paid` customer has purchased the items

Note
`PersistentFSM``AbstractPersistentFSM` states must inherit from traitimplement interface `PersistentFSM.FSMState` and implement the `def identifier: String``String identifier()` method. This is required in order to simplify the serialization of FSM states. String identifiers should be unique!

Customer’s actions are “recorded” as a sequence of “domain events” which are persisted. Those events are replayed on an actor’s start in order to restore the latest customer’s state:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/scala/akka/persistence/fsm/PersistentFSMSpec.scala#L445-L449 "Go to snippet source")sealed trait DomainEvent
case class ItemAdded(item: Item) extends DomainEvent
case object OrderExecuted extends DomainEvent
case object OrderDiscarded extends DomainEvent
case object CustomerInactive extends DomainEvent
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/java/akka/persistence/fsm/AbstractPersistentFSMTest.java#L141-L159 "Go to snippet source")public static final class ItemAdded implements DomainEvent {
  private final Item item;

  public ItemAdded(Item item) {
    this.item = item;
  }

  public Item getItem() {
    return item;
  }
}

public enum OrderExecuted implements DomainEvent {
  INSTANCE
}

public enum OrderDiscarded implements DomainEvent {
  INSTANCE
}
```

Customer state data represents the items in a customer’s shopping cart:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/scala/akka/persistence/fsm/PersistentFSMSpec.scala#L420-L433 "Go to snippet source")case class Item(id: String, name: String, price: Float)

sealed trait ShoppingCart {
  def addItem(item: Item): ShoppingCart
  def empty(): ShoppingCart
}
case object EmptyShoppingCart extends ShoppingCart {
  def addItem(item: Item) = NonEmptyShoppingCart(item :: Nil)
  def empty() = this
}
case class NonEmptyShoppingCart(items: Seq[Item]) extends ShoppingCart {
  def addItem(item: Item) = NonEmptyShoppingCart(items :+ item)
  def empty() = EmptyShoppingCart
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/java/akka/persistence/fsm/AbstractPersistentFSMTest.java#L47-L107 "Go to snippet source")public static class ShoppingCart {
  private final List<Item> items = new ArrayList<>();

  public ShoppingCart(Item initialItem) {
    items.add(initialItem);
  }

  public ShoppingCart() {}

  public List<Item> getItems() {
    return Collections.unmodifiableList(items);
  }

  public ShoppingCart addItem(Item item) {
    items.add(item);
    return this;
  }

  public void empty() {
    items.clear();
  }
}

public static class Item implements Serializable {
  private final String id;
  private final String name;
  private final float price;

  Item(String id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public float getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("Item{id=%s, name=%s, price=%s}", id, price, name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Item item = (Item) o;

    return item.price == price && id.equals(item.id) && name.equals(item.name);
  }
}
```

Here is how everything is wired together:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/scala/akka/persistence/fsm/PersistentFSMSpec.scala#L488-L538 "Go to snippet source")startWith(LookingAround, EmptyShoppingCart)

when(LookingAround) {
  case Event(AddItem(item), _) =>
    goto(Shopping).applying(ItemAdded(item)).forMax(1 seconds)
  case Event(GetCurrentCart, data) =>
    stay().replying(data)
}

when(Shopping) {
  case Event(AddItem(item), _) =>
    stay().applying(ItemAdded(item)).forMax(1 seconds)
  case Event(Buy, _) =>
    goto(Paid).applying(OrderExecuted).andThen {
      case NonEmptyShoppingCart(items) =>
        reportActor ! PurchaseWasMade(items)
        saveStateSnapshot()
      case EmptyShoppingCart => saveStateSnapshot()
    }
  case Event(Leave, _) =>
    stop().applying(OrderDiscarded).andThen {
      case _ =>
        reportActor ! ShoppingCardDiscarded
        saveStateSnapshot()
    }
  case Event(GetCurrentCart, data) =>
    stay().replying(data)
  case Event(StateTimeout, _) =>
    goto(Inactive).forMax(2 seconds)
}

when(Inactive) {
  case Event(AddItem(item), _) =>
    goto(Shopping).applying(ItemAdded(item)).forMax(1 seconds)
  case Event(StateTimeout, _) =>
    stop().applying(OrderDiscarded).andThen {
      case _ => reportActor ! ShoppingCardDiscarded
    }
}

when(Paid) {
  case Event(Leave, _) => stop()
  case Event(GetCurrentCart, data) =>
    stay().replying(data)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/java/akka/persistence/fsm/AbstractPersistentFSMTest.java#L205-L278 "Go to snippet source")startWith(UserState.LOOKING_AROUND, new ShoppingCart());

when(
    UserState.LOOKING_AROUND,
    matchEvent(
            AddItem.class,
            (event, data) ->
                goTo(UserState.SHOPPING)
                    .applying(new ItemAdded(event.getItem()))
                    .forMax(Duration.ofSeconds(1)))
        .event(GetCurrentCart.class, (event, data) -> stay().replying(data)));

when(
    UserState.SHOPPING,
    matchEvent(
            AddItem.class,
            (event, data) ->
                stay().applying(new ItemAdded(event.getItem())).forMax(Duration.ofSeconds(1)))
        .event(
            Buy.class,
            (event, data) ->
                goTo(UserState.PAID)
                    .applying(OrderExecuted.INSTANCE)
                    .andThen(
                        exec(
                            cart -> {
                              reportActor.tell(new PurchaseWasMade(cart.getItems()), self());
                              saveStateSnapshot();
                            })))
        .event(
            Leave.class,
            (event, data) ->
                stop()
                    .applying(OrderDiscarded.INSTANCE)
                    .andThen(
                        exec(
                            cart -> {
                              reportActor.tell(ShoppingCardDiscarded.INSTANCE, self());
                              saveStateSnapshot();
                            })))
        .event(GetCurrentCart.class, (event, data) -> stay().replying(data))
        .event(
            StateTimeout$.class,
            (event, data) -> goTo(UserState.INACTIVE).forMax(Duration.ofSeconds(2))));

when(
    UserState.INACTIVE,
    matchEvent(
            AddItem.class,
            (event, data) ->
                goTo(UserState.SHOPPING)
                    .applying(new ItemAdded(event.getItem()))
                    .forMax(Duration.ofSeconds(1)))
        .event(GetCurrentCart.class, (event, data) -> stay().replying(data))
        .event(
            StateTimeout$.class,
            (event, data) ->
                stop()
                    .applying(OrderDiscarded.INSTANCE)
                    .andThen(
                        exec(
                            cart ->
                                reportActor.tell(ShoppingCardDiscarded.INSTANCE, self())))));

when(
    UserState.PAID,
    matchEvent(Leave.class, (event, data) -> stop())
        .event(GetCurrentCart.class, (event, data) -> stay().replying(data)));
```

Note
State data can only be modified directly on initialization. Later it’s modified only as a result of applying domain events. Override the `applyEvent` method to define how state data is affected by domain events, see the example below

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/scala/akka/persistence/fsm/PersistentFSMSpec.scala#L548-L555 "Go to snippet source")override def applyEvent(event: DomainEvent, cartBeforeEvent: ShoppingCart): ShoppingCart = {
  event match {
    case ItemAdded(item)  => cartBeforeEvent.addItem(item)
    case OrderExecuted    => cartBeforeEvent
    case OrderDiscarded   => cartBeforeEvent.empty()
    case CustomerInactive => cartBeforeEvent
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/java/akka/persistence/fsm/AbstractPersistentFSMTest.java#L289-L301 "Go to snippet source")@Override
public ShoppingCart applyEvent(DomainEvent event, ShoppingCart currentData) {
  if (event instanceof ItemAdded) {
    currentData.addItem(((ItemAdded) event).getItem());
    return currentData;
  } else if (event instanceof OrderExecuted) {
    return currentData;
  } else if (event instanceof OrderDiscarded) {
    currentData.empty();
    return currentData;
  }
  throw new RuntimeException("Unhandled");
}
```

`andThen` can be used to define actions which will be executed following event’s persistence \- convenient for “side effects” like sending a message or logging. Notice that actions defined in `andThen` block are not executed on recovery:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/scala/akka/persistence/fsm/PersistentFSMSpec.scala#L502-L509 "Go to snippet source")goto(Paid).applying(OrderExecuted).andThen {
  case NonEmptyShoppingCart(items) =>
    reportActor ! PurchaseWasMade(items)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/java/akka/persistence/fsm/AbstractPersistentFSMTest.java#L226-L236 "Go to snippet source")(event, data) ->
    goTo(UserState.PAID)
        .applying(OrderExecuted.INSTANCE)
        .andThen(
            exec(
                cart -> {
                  reportActor.tell(new PurchaseWasMade(cart.getItems()), self());
                })))
```

A snapshot of state data can be persisted by calling the `saveStateSnapshot()` method:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/scala/akka/persistence/fsm/PersistentFSMSpec.scala#L513-L517 "Go to snippet source")stop().applying(OrderDiscarded).andThen {
  case _ =>
    reportActor ! ShoppingCardDiscarded
    saveStateSnapshot()
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence/src/test/java/akka/persistence/fsm/AbstractPersistentFSMTest.java#L241-L249 "Go to snippet source")(event, data) ->
    stop()
        .applying(OrderDiscarded.INSTANCE)
        .andThen(
            exec(
                cart -> {
                  reportActor.tell(ShoppingCardDiscarded.INSTANCE, self());
                  saveStateSnapshot();
                })))
```

On recovery state data is initialized according to the latest available snapshot, then the remaining domain events are replayed, triggering the `applyEvent` method.

## Migration to EventSourcedBehavior

Persistent FSMs can be represented using [Persistence Typed](typed/persistence.html). The data stored by Persistence FSM can be read by an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") using a snapshot adapter and an event adapter. The adapters are required as Persistent FSM doesn’t store snapshots and user data directly, it wraps them in internal types that include state transition information.

Before reading the migration guide it is advised to understand [Persistence Typed](typed/persistence.html). 

### Migration steps

1. Modify or create new commands to include `replyTo` [`ActorRef`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")
2. Typically persisted events will remain the same
3. Create an `EventSourcedBehavior` that mimics the old `PersistentFSM`
4. Replace any state timeouts with `Behaviors.withTimers` either hard coded or stored in the state
5. Add an [`EventAdapter`](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventAdapter.html "akka.persistence.typed.EventAdapter")[`EventAdapter`](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/EventAdapter.html "akka.persistence.typed.EventAdapter") to convert state transition events added by `PersistentFSM` into private events or filter them
6. If snapshots are used add a [`SnapshotAdapter`](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotAdapter.html "akka.persistence.typed.SnapshotAdapter")[`SnapshotAdapter`](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/SnapshotAdapter.html "akka.persistence.typed.SnapshotAdapter") to convert PersistentFSM snapshots into the `EventSourcedBehavior`s `State`

The following is the shopping cart example above converted to an `EventSourcedBehavior`. 

The new commands, note the replyTo field for getting the current cart.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/PersistentFsmToTypedMigrationSpec.scala#L57-L62 "Go to snippet source")sealed trait Command
case class AddItem(item: Item) extends Command
case object Buy extends Command
case object Leave extends Command
case class GetCurrentCart(replyTo: ActorRef[ShoppingCart]) extends Command
private case object Timeout extends Command
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/PersistentFsmToTypedMigrationCompileOnlyTest.java#L19-L47 "Go to snippet source")interface Command {}

public static class AddItem implements Command {
  public final Item item;

  public AddItem(Item item) {
    this.item = item;
  }
}

public static class GetCurrentCart implements Command {
  public final ActorRef<ShoppingCart> replyTo;

  public GetCurrentCart(ActorRef<ShoppingCart> replyTo) {
    this.replyTo = replyTo;
  }
}

public enum Buy implements Command {
  INSTANCE
}

public enum Leave implements Command {
  INSTANCE
}

private enum Timeout implements Command {
  INSTANCE
}
```

The states of the FSM are represented using the `EventSourcedBehavior`’s state parameter along with the event and command handlers. Here are the states:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/PersistentFsmToTypedMigrationSpec.scala#L66-L70 "Go to snippet source")sealed trait State
case class LookingAround(cart: ShoppingCart) extends State
case class Shopping(cart: ShoppingCart) extends State
case class Inactive(cart: ShoppingCart) extends State
case class Paid(cart: ShoppingCart) extends State
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/PersistentFsmToTypedMigrationCompileOnlyTest.java#L51-L81 "Go to snippet source")abstract static class State {
  public final ShoppingCart cart;

  protected State(ShoppingCart cart) {
    this.cart = cart;
  }
}

public static class LookingAround extends State {
  public LookingAround(ShoppingCart cart) {
    super(cart);
  }
}

public static class Shopping extends State {
  public Shopping(ShoppingCart cart) {
    super(cart);
  }
}

public static class Inactive extends State {
  public Inactive(ShoppingCart cart) {
    super(cart);
  }
}

public static class Paid extends State {
  public Paid(ShoppingCart cart) {
    super(cart);
  }
}
```

The command handler has a separate section for each of the PersistentFSM’s states: 

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/PersistentFsmToTypedMigrationSpec.scala#L112-L157 "Go to snippet source")def commandHandler(timers: TimerScheduler[Command])(state: State, command: Command): Effect[DomainEvent, State] =
  state match {
    case LookingAround(cart) =>
      command match {
        case AddItem(item) =>
          Effect.persist(ItemAdded(item)).thenRun(_ => timers.startSingleTimer(StateTimeout, Timeout, 1.second))
        case GetCurrentCart(replyTo) =>
          replyTo ! cart
          Effect.none
        case _ =>
          Effect.none
      }
    case Shopping(cart) =>
      command match {
        case AddItem(item) =>
          Effect.persist(ItemAdded(item)).thenRun(_ => timers.startSingleTimer(StateTimeout, Timeout, 1.second))
        case Buy =>
          Effect.persist(OrderExecuted).thenRun(_ => timers.cancel(StateTimeout))
        case Leave =>
          Effect.persist(OrderDiscarded).thenStop()
        case GetCurrentCart(replyTo) =>
          replyTo ! cart
          Effect.none
        case Timeout =>
          Effect.persist(CustomerInactive)
      }
    case Inactive(_) =>
      command match {
        case AddItem(item) =>
          Effect.persist(ItemAdded(item)).thenRun(_ => timers.startSingleTimer(StateTimeout, Timeout, 1.second))
        case Timeout =>
          Effect.persist(OrderDiscarded)
        case _ =>
          Effect.none
      }
    case Paid(cart) =>
      command match {
        case Leave =>
          Effect.stop()
        case GetCurrentCart(replyTo) =>
          replyTo ! cart
          Effect.none
        case _ =>
          Effect.none
      }
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/PersistentFsmToTypedMigrationCompileOnlyTest.java#L134-L154 "Go to snippet source")  CommandHandlerBuilder<Command, DomainEvent, State> builder = newCommandHandlerBuilder();

  builder.forStateType(LookingAround.class).onCommand(AddItem.class, this::addItem);

  builder
      .forStateType(Shopping.class)
      .onCommand(AddItem.class, this::addItem)
      .onCommand(Buy.class, this::buy)
      .onCommand(Leave.class, this::discardShoppingCart)
      .onCommand(Timeout.class, this::timeoutShopping);

  builder
      .forStateType(Inactive.class)
      .onCommand(AddItem.class, this::addItem)
      .onCommand(Timeout.class, () -> Effect().persist(OrderDiscarded.INSTANCE).thenStop());

  builder.forStateType(Paid.class).onCommand(Leave.class, () -> Effect().stop());

  builder.forAnyState().onCommand(GetCurrentCart.class, this::getCurrentCart);
  return builder.build();
}
```

Note that there is no explicit support for state timeout as with PersistentFSM but the same behavior can be achieved using `Behaviors.withTimers`. If the timer is the same for all events then it can be hard coded, otherwise the old PersistentFSM timeout can be taken from the `StateChangeEvent` in the event adapter and is also available when constructing a `SnapshotAdapter`. This can be added to an internal event and then stored in the `State`. Care must also be taken to restart timers on recovery in the signal handler:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/PersistentFsmToTypedMigrationSpec.scala#L196-L203 "Go to snippet source").receiveSignal {
  case (state, RecoveryCompleted) =>
    state match {
      case _: Shopping | _: Inactive =>
        timers.startSingleTimer(StateTimeout, Timeout, 1.second)
      case _ =>
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/PersistentFsmToTypedMigrationCompileOnlyTest.java#L217-L228 "Go to snippet source")@Override
public SignalHandler<State> signalHandler() {
  return newSignalHandlerBuilder()
      .onSignal(
          RecoveryCompleted.class,
          (state, signal) -> {
            if (state instanceof Shopping || state instanceof Inactive) {
              timers.startSingleTimer(TIMEOUT_KEY, Timeout.INSTANCE, Duration.ofSeconds(1));
            }
          })
      .build();
}
```

Then the event handler:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/PersistentFsmToTypedMigrationSpec.scala#L161-L183 "Go to snippet source")def eventHandler(state: State, event: DomainEvent): State = {
  state match {
    case la @ LookingAround(cart) =>
      event match {
        case ItemAdded(item) => Shopping(cart.addItem(item))
        case _               => la
      }
    case Shopping(cart) =>
      event match {
        case ItemAdded(item)  => Shopping(cart.addItem(item))
        case OrderExecuted    => Paid(cart)
        case OrderDiscarded   => state // will be stopped
        case CustomerInactive => Inactive(cart)
      }
    case i @ Inactive(cart) =>
      event match {
        case ItemAdded(item) => Shopping(cart.addItem(item))
        case OrderDiscarded  => i // will be stopped
        case _               => i
      }
    case Paid(_) => state // no events after paid
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/PersistentFsmToTypedMigrationCompileOnlyTest.java#L185-L208 "Go to snippet source")@Override
public EventHandler<State, DomainEvent> eventHandler() {
  EventHandlerBuilder<State, DomainEvent> eventHandlerBuilder = newEventHandlerBuilder();

  eventHandlerBuilder
      .forStateType(LookingAround.class)
      .onEvent(ItemAdded.class, item -> new Shopping(new ShoppingCart(item.getItem())));

  eventHandlerBuilder
      .forStateType(Shopping.class)
      .onEvent(
          ItemAdded.class, (state, item) -> new Shopping(state.cart.addItem(item.getItem())))
      .onEvent(OrderExecuted.class, (state, item) -> new Paid(state.cart))
      .onEvent(OrderDiscarded.class, (state, item) -> state) // will be stopped
      .onEvent(CustomerInactive.class, (state, event) -> new Inactive(state.cart));

  eventHandlerBuilder
      .forStateType(Inactive.class)
      .onEvent(
          ItemAdded.class, (state, item) -> new Shopping(state.cart.addItem(item.getItem())))
      .onEvent(OrderDiscarded.class, (state, item) -> state); // will be stopped

  return eventHandlerBuilder.build();
}
```

The last step is the adapters that will allow the new [`EventSourcedBehavior`](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") to read the old data:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/PersistentFsmToTypedMigrationSpec.scala#L88-L106 "Go to snippet source")class PersistentFsmEventAdapter extends EventAdapter[DomainEvent, Any] {
  override def toJournal(e: DomainEvent): Any = e
  override def manifest(event: DomainEvent): String = ""
  @nowarn("msg=deprecated")
  override def fromJournal(journalEvent: Any, manifest: String): EventSeq[DomainEvent] = {
    journalEvent match {
      case _: StateChangeEvent =>
        // In this example the state transitions can be inferred from the events
        // Alternatively the StateChangeEvent can be converted to a private event if either the StateChangeEvent.stateIdentifier
        // or StateChangeEvent.timeout is required
        // Many use cases have the same timeout so it can be hard coded, otherwise it cane be stored in the state
        EventSeq.empty
      case other =>
        // If using a new domain event model the conversion would happen here
        EventSeq.single(other.asInstanceOf[DomainEvent])
    }

  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/PersistentFsmToTypedMigrationCompileOnlyTest.java#L85-L112 "Go to snippet source")public static class PersistentFSMEventAdapter extends EventAdapter<DomainEvent, Object> {

  @Override
  public Object toJournal(DomainEvent domainEvent) {
    // leave events as is, can't roll back to PersistentFSM
    return domainEvent;
  }

  @Override
  public String manifest(DomainEvent event) {
    return "";
  }

  @Override
  public EventSeq<DomainEvent> fromJournal(Object event, String manifest) {
    if (event instanceof akka.persistence.fsm.PersistentFSM.StateChangeEvent) {
      // In this example the state transitions can be inferred from the events
      // Alternatively the StateChangeEvent can be converted to a private event if either the
      // StateChangeEvent.stateIdentifier
      // or StateChangeEvent.timeout is required
      // Many use cases have the same timeout so it can be hard coded, otherwise it cane be stored
      // in the state
      return EventSeq.empty();
    } else {
      // If using a new domain event model the conversion would happen here
      return EventSeq.single((DomainEvent) event);
    }
  }
```

The snapshot adapter needs to adapt an internal type of PersistentFSM so a helper function is provided to build the [`SnapshotAdapter`](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotAdapter.html "akka.persistence.typed.SnapshotAdapter")[`SnapshotAdapter`](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/SnapshotAdapter.html "akka.persistence.typed.SnapshotAdapter"):

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/PersistentFsmToTypedMigrationSpec.scala#L74-L84 "Go to snippet source")val persistentFSMSnapshotAdapter: SnapshotAdapter[State] = PersistentFSMMigration.snapshotAdapter[State] {
  case (stateIdentifier, data, _) =>
    val cart = data.asInstanceOf[ShoppingCart]
    stateIdentifier match {
      case "Looking Around" => LookingAround(cart)
      case "Shopping"       => Shopping(cart)
      case "Inactive"       => Inactive(cart)
      case "Paid"           => Paid(cart)
      case id               => throw new IllegalStateException(s"Unexpected state identifier $id")
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/PersistentFsmToTypedMigrationCompileOnlyTest.java#L232-L250 "Go to snippet source")@Override
public SnapshotAdapter<State> snapshotAdapter() {
  return PersistentFSMMigration.snapshotAdapter(
      (stateIdentifier, snapshot, timeout) -> {
        ShoppingCart cart = (ShoppingCart) snapshot;
        switch (stateIdentifier) {
          case "Looking Around":
            return new LookingAround(cart);
          case "Shopping":
            return new Shopping(cart);
          case "Inactive":
            return new Inactive(cart);
          case "Paid":
            return new Paid(cart);
          default:
            throw new IllegalStateException("Unexpected state identifier " + stateIdentifier);
        }
      });
}
```

That concludes all the steps to allow an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") to read a `PersistentFSM`’s data. Once the new code has been running you can not roll back as the PersistentFSM will not be able to read data written by Persistence Typed. 

Note
There is one case where [a full shutdown and startup is required](additional/rolling-updates.html#migrating-from-persistentfsm-to-eventsourcedbehavior).

## Code Examples

### Example 1: Dependency

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Dependency

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 3: Dependency

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependency

```scala
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % AkkaVersion
```

### Example 5: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.8.9</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 6: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  implementation "com.typesafe.akka:akka-persistence_${versions.ScalaBinary}"
}
```

### Example 7: A Simple Example

```scala
sealed trait Command
case class AddItem(item: Item) extends Command
case object Buy extends Command
case object Leave extends Command
case object GetCurrentCart extends Command
```

### Example 8: A Simple Example

```java
public static final class AddItem implements Command {
  private final Item item;

  public AddItem(Item item) {
    this.item = item;
  }

  public Item getItem() {
    return item;
  }
}

public enum Buy implements Command {
  INSTANCE
}

public enum Leave implements Command {
  INSTANCE
}

public enum GetCurrentCart implements Command {
  INSTANCE
}
```

### Example 9: A Simple Example

```scala
sealed trait UserState extends FSMState
case object LookingAround extends UserState {
  override def identifier: String = "Looking Around"
}
case object Shopping extends UserState {
  override def identifier: String = "Shopping"
}
case object Inactive extends UserState {
  override def identifier: String = "Inactive"
}
case object Paid extends UserState {
  override def identifier: String = "Paid"
}
```

### Example 10: A Simple Example

```java
enum UserState implements PersistentFSM.FSMState {
  LOOKING_AROUND("Looking Around"),
  SHOPPING("Shopping"),
  INACTIVE("Inactive"),
  PAID("Paid");

  private final String stateIdentifier;

  UserState(String stateIdentifier) {
    this.stateIdentifier = stateIdentifier;
  }

  @Override
  public String identifier() {
    return stateIdentifier;
  }
}
```

### Example 11: A Simple Example

```scala
sealed trait DomainEvent
case class ItemAdded(item: Item) extends DomainEvent
case object OrderExecuted extends DomainEvent
case object OrderDiscarded extends DomainEvent
case object CustomerInactive extends DomainEvent
```

### Example 12: A Simple Example

```java
public static final class ItemAdded implements DomainEvent {
  private final Item item;

  public ItemAdded(Item item) {
    this.item = item;
  }

  public Item getItem() {
    return item;
  }
}

public enum OrderExecuted implements DomainEvent {
  INSTANCE
}

public enum OrderDiscarded implements DomainEvent {
  INSTANCE
}
```

### Example 13: A Simple Example

```scala
case class Item(id: String, name: String, price: Float)

sealed trait ShoppingCart {
  def addItem(item: Item): ShoppingCart
  def empty(): ShoppingCart
}
case object EmptyShoppingCart extends ShoppingCart {
  def addItem(item: Item) = NonEmptyShoppingCart(item :: Nil)
  def empty() = this
}
case class NonEmptyShoppingCart(items: Seq[Item]) extends ShoppingCart {
  def addItem(item: Item) = NonEmptyShoppingCart(items :+ item)
  def empty() = EmptyShoppingCart
}
```

### Example 14: A Simple Example

```java
public static class ShoppingCart {
  private final List<Item> items = new ArrayList<>();

  public ShoppingCart(Item initialItem) {
    items.add(initialItem);
  }

  public ShoppingCart() {}

  public List<Item> getItems() {
    return Collections.unmodifiableList(items);
  }

  public ShoppingCart addItem(Item item) {
    items.add(item);
    return this;
  }

  public void empty() {
    items.clear();
  }
}

public static class Item implements Serializable {
  private final String id;
  private final String name;
  private final float price;

  Item(String id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public float getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("Item{id=%s, name=%s, price=%s}", id, price, name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Item item = (Item) o;

    return item.price == price && id.equals(item.id) && name.equals(item.name);
  }
}
```

### Example 15: A Simple Example

```scala
startWith(LookingAround, EmptyShoppingCart)

when(LookingAround) {
  case Event(AddItem(item), _) =>
    goto(Shopping).applying(ItemAdded(item)).forMax(1 seconds)
  case Event(GetCurrentCart, data) =>
    stay().replying(data)
}

when(Shopping) {
  case Event(AddItem(item), _) =>
    stay().applying(ItemAdded(item)).forMax(1 seconds)
  case Event(Buy, _) =>
    goto(Paid).applying(OrderExecuted).andThen {
      case NonEmptyShoppingCart(items) =>
        reportActor ! PurchaseWasMade(items)
        saveStateSnapshot()
      case EmptyShoppingCart => saveStateSnapshot()
    }
  case Event(Leave, _) =>
    stop().applying(OrderDiscarded).andThen {
      case _ =>
        reportActor ! ShoppingCardDiscarded
        saveStateSnapshot()
    }
  case Event(GetCurrentCart, data) =>
    stay().replying(data)
  case Event(StateTimeout, _) =>
    goto(Inactive).forMax(2 seconds)
}

when(Inactive) {
  case Event(AddItem(item), _) =>
    goto(Shopping).applying(ItemAdded(item)).forMax(1 seconds)
  case Event(StateTimeout, _) =>
    stop().applying(OrderDiscarded).andThen {
      case _ => reportActor ! ShoppingCardDiscarded
    }
}

when(Paid) {
  case Event(Leave, _) => stop()
  case Event(GetCurrentCart, data) =>
    stay().replying(data)
}
```

### Example 16: A Simple Example

```java
startWith(UserState.LOOKING_AROUND, new ShoppingCart());

when(
    UserState.LOOKING_AROUND,
    matchEvent(
            AddItem.class,
            (event, data) ->
                goTo(UserState.SHOPPING)
                    .applying(new ItemAdded(event.getItem()))
                    .forMax(Duration.ofSeconds(1)))
        .event(GetCurrentCart.class, (event, data) -> stay().replying(data)));

when(
    UserState.SHOPPING,
    matchEvent(
            AddItem.class,
            (event, data) ->
                stay().applying(new ItemAdded(event.getItem())).forMax(Duration.ofSeconds(1)))
        .event(
            Buy.class,
            (event, data) ->
                goTo(UserState.PAID)
                    .applying(OrderExecuted.INSTANCE)
                    .andThen(
                        exec(
                            cart -> {
                              reportActor.tell(new PurchaseWasMade(cart.getItems()), self());
                              saveStateSnapshot();
                            })))
        .event(
            Leave.class,
            (event, data) ->
                stop()
                    .applying(OrderDiscarded.INSTANCE)
                    .andThen(
                        exec(
                            cart -> {
                              reportActor.tell(ShoppingCardDiscarded.INSTANCE, self());
                              saveStateSnapshot();
                            })))
        .event(GetCurrentCart.class, (event, data) -> stay().replying(data))
        .event(
            StateTimeout$.class,
            (event, data) -> goTo(UserState.INACTIVE).forMax(Duration.ofSeconds(2))));

when(
    UserState.INACTIVE,
    matchEvent(
            AddItem.class,
            (event, data) ->
                goTo(UserState.SHOPPING)
                    .applying(new ItemAdded(event.getItem()))
                    .forMax(Duration.ofSeconds(1)))
        .event(GetCurrentCart.class, (event, data) -> stay().replying(data))
        .event(
            StateTimeout$.class,
            (event, data) ->
                stop()
                    .applying(OrderDiscarded.INSTANCE)
                    .andThen(
                        exec(
                            cart ->
                                reportActor.tell(ShoppingCardDiscarded.INSTANCE, self())))));

when(
    UserState.PAID,
    matchEvent(Leave.class, (event, data) -> stop())
        .event(GetCurrentCart.class, (event, data) -> stay().replying(data)));
```

### Example 17: A Simple Example

```scala
override def applyEvent(event: DomainEvent, cartBeforeEvent: ShoppingCart): ShoppingCart = {
  event match {
    case ItemAdded(item)  => cartBeforeEvent.addItem(item)
    case OrderExecuted    => cartBeforeEvent
    case OrderDiscarded   => cartBeforeEvent.empty()
    case CustomerInactive => cartBeforeEvent
  }
}
```

### Example 18: A Simple Example

```java
@Override
public ShoppingCart applyEvent(DomainEvent event, ShoppingCart currentData) {
  if (event instanceof ItemAdded) {
    currentData.addItem(((ItemAdded) event).getItem());
    return currentData;
  } else if (event instanceof OrderExecuted) {
    return currentData;
  } else if (event instanceof OrderDiscarded) {
    currentData.empty();
    return currentData;
  }
  throw new RuntimeException("Unhandled");
}
```

### Example 19: A Simple Example

```scala
goto(Paid).applying(OrderExecuted).andThen {
  case NonEmptyShoppingCart(items) =>
    reportActor ! PurchaseWasMade(items)
}
```

### Example 20: A Simple Example

```java
(event, data) ->
    goTo(UserState.PAID)
        .applying(OrderExecuted.INSTANCE)
        .andThen(
            exec(
                cart -> {
                  reportActor.tell(new PurchaseWasMade(cart.getItems()), self());
                })))
```

### Example 21: A Simple Example

```scala
stop().applying(OrderDiscarded).andThen {
  case _ =>
    reportActor ! ShoppingCardDiscarded
    saveStateSnapshot()
}
```

### Example 22: A Simple Example

```java
(event, data) ->
    stop()
        .applying(OrderDiscarded.INSTANCE)
        .andThen(
            exec(
                cart -> {
                  reportActor.tell(ShoppingCardDiscarded.INSTANCE, self());
                  saveStateSnapshot();
                })))
```

### Example 23: Migration steps

```scala
sealed trait Command
case class AddItem(item: Item) extends Command
case object Buy extends Command
case object Leave extends Command
case class GetCurrentCart(replyTo: ActorRef[ShoppingCart]) extends Command
private case object Timeout extends Command
```

### Example 24: Migration steps

```java
interface Command {}

public static class AddItem implements Command {
  public final Item item;

  public AddItem(Item item) {
    this.item = item;
  }
}

public static class GetCurrentCart implements Command {
  public final ActorRef<ShoppingCart> replyTo;

  public GetCurrentCart(ActorRef<ShoppingCart> replyTo) {
    this.replyTo = replyTo;
  }
}

public enum Buy implements Command {
  INSTANCE
}

public enum Leave implements Command {
  INSTANCE
}

private enum Timeout implements Command {
  INSTANCE
}
```

### Example 25: Migration steps

```scala
sealed trait State
case class LookingAround(cart: ShoppingCart) extends State
case class Shopping(cart: ShoppingCart) extends State
case class Inactive(cart: ShoppingCart) extends State
case class Paid(cart: ShoppingCart) extends State
```

### Example 26: Migration steps

```java
abstract static class State {
  public final ShoppingCart cart;

  protected State(ShoppingCart cart) {
    this.cart = cart;
  }
}

public static class LookingAround extends State {
  public LookingAround(ShoppingCart cart) {
    super(cart);
  }
}

public static class Shopping extends State {
  public Shopping(ShoppingCart cart) {
    super(cart);
  }
}

public static class Inactive extends State {
  public Inactive(ShoppingCart cart) {
    super(cart);
  }
}

public static class Paid extends State {
  public Paid(ShoppingCart cart) {
    super(cart);
  }
}
```

### Example 27: Migration steps

```scala
def commandHandler(timers: TimerScheduler[Command])(state: State, command: Command): Effect[DomainEvent, State] =
  state match {
    case LookingAround(cart) =>
      command match {
        case AddItem(item) =>
          Effect.persist(ItemAdded(item)).thenRun(_ => timers.startSingleTimer(StateTimeout, Timeout, 1.second))
        case GetCurrentCart(replyTo) =>
          replyTo ! cart
          Effect.none
        case _ =>
          Effect.none
      }
    case Shopping(cart) =>
      command match {
        case AddItem(item) =>
          Effect.persist(ItemAdded(item)).thenRun(_ => timers.startSingleTimer(StateTimeout, Timeout, 1.second))
        case Buy =>
          Effect.persist(OrderExecuted).thenRun(_ => timers.cancel(StateTimeout))
        case Leave =>
          Effect.persist(OrderDiscarded).thenStop()
        case GetCurrentCart(replyTo) =>
          replyTo ! cart
          Effect.none
        case Timeout =>
          Effect.persist(CustomerInactive)
      }
    case Inactive(_) =>
      command match {
        case AddItem(item) =>
          Effect.persist(ItemAdded(item)).thenRun(_ => timers.startSingleTimer(StateTimeout, Timeout, 1.second))
        case Timeout =>
          Effect.persist(OrderDiscarded)
        case _ =>
          Effect.none
      }
    case Paid(cart) =>
      command match {
        case Leave =>
          Effect.stop()
        case GetCurrentCart(replyTo) =>
          replyTo ! cart
          Effect.none
        case _ =>
          Effect.none
      }
  }
```

### Example 28: Migration steps

```java
CommandHandlerBuilder<Command, DomainEvent, State> builder = newCommandHandlerBuilder();

  builder.forStateType(LookingAround.class).onCommand(AddItem.class, this::addItem);

  builder
      .forStateType(Shopping.class)
      .onCommand(AddItem.class, this::addItem)
      .onCommand(Buy.class, this::buy)
      .onCommand(Leave.class, this::discardShoppingCart)
      .onCommand(Timeout.class, this::timeoutShopping);

  builder
      .forStateType(Inactive.class)
      .onCommand(AddItem.class, this::addItem)
      .onCommand(Timeout.class, () -> Effect().persist(OrderDiscarded.INSTANCE).thenStop());

  builder.forStateType(Paid.class).onCommand(Leave.class, () -> Effect().stop());

  builder.forAnyState().onCommand(GetCurrentCart.class, this::getCurrentCart);
  return builder.build();
}
```

### Example 29: Migration steps

```scala
.receiveSignal {
  case (state, RecoveryCompleted) =>
    state match {
      case _: Shopping | _: Inactive =>
        timers.startSingleTimer(StateTimeout, Timeout, 1.second)
      case _ =>
    }
}
```

### Example 30: Migration steps

```java
@Override
public SignalHandler<State> signalHandler() {
  return newSignalHandlerBuilder()
      .onSignal(
          RecoveryCompleted.class,
          (state, signal) -> {
            if (state instanceof Shopping || state instanceof Inactive) {
              timers.startSingleTimer(TIMEOUT_KEY, Timeout.INSTANCE, Duration.ofSeconds(1));
            }
          })
      .build();
}
```

### Example 31: Migration steps

```scala
def eventHandler(state: State, event: DomainEvent): State = {
  state match {
    case la @ LookingAround(cart) =>
      event match {
        case ItemAdded(item) => Shopping(cart.addItem(item))
        case _               => la
      }
    case Shopping(cart) =>
      event match {
        case ItemAdded(item)  => Shopping(cart.addItem(item))
        case OrderExecuted    => Paid(cart)
        case OrderDiscarded   => state // will be stopped
        case CustomerInactive => Inactive(cart)
      }
    case i @ Inactive(cart) =>
      event match {
        case ItemAdded(item) => Shopping(cart.addItem(item))
        case OrderDiscarded  => i // will be stopped
        case _               => i
      }
    case Paid(_) => state // no events after paid
  }
}
```

### Example 32: Migration steps

```java
@Override
public EventHandler<State, DomainEvent> eventHandler() {
  EventHandlerBuilder<State, DomainEvent> eventHandlerBuilder = newEventHandlerBuilder();

  eventHandlerBuilder
      .forStateType(LookingAround.class)
      .onEvent(ItemAdded.class, item -> new Shopping(new ShoppingCart(item.getItem())));

  eventHandlerBuilder
      .forStateType(Shopping.class)
      .onEvent(
          ItemAdded.class, (state, item) -> new Shopping(state.cart.addItem(item.getItem())))
      .onEvent(OrderExecuted.class, (state, item) -> new Paid(state.cart))
      .onEvent(OrderDiscarded.class, (state, item) -> state) // will be stopped
      .onEvent(CustomerInactive.class, (state, event) -> new Inactive(state.cart));

  eventHandlerBuilder
      .forStateType(Inactive.class)
      .onEvent(
          ItemAdded.class, (state, item) -> new Shopping(state.cart.addItem(item.getItem())))
      .onEvent(OrderDiscarded.class, (state, item) -> state); // will be stopped

  return eventHandlerBuilder.build();
}
```

### Example 33: Migration steps

```scala
class PersistentFsmEventAdapter extends EventAdapter[DomainEvent, Any] {
  override def toJournal(e: DomainEvent): Any = e
  override def manifest(event: DomainEvent): String = ""
  @nowarn("msg=deprecated")
  override def fromJournal(journalEvent: Any, manifest: String): EventSeq[DomainEvent] = {
    journalEvent match {
      case _: StateChangeEvent =>
        // In this example the state transitions can be inferred from the events
        // Alternatively the StateChangeEvent can be converted to a private event if either the StateChangeEvent.stateIdentifier
        // or StateChangeEvent.timeout is required
        // Many use cases have the same timeout so it can be hard coded, otherwise it cane be stored in the state
        EventSeq.empty
      case other =>
        // If using a new domain event model the conversion would happen here
        EventSeq.single(other.asInstanceOf[DomainEvent])
    }

  }
}
```

### Example 34: Migration steps

```java
public static class PersistentFSMEventAdapter extends EventAdapter<DomainEvent, Object> {

  @Override
  public Object toJournal(DomainEvent domainEvent) {
    // leave events as is, can't roll back to PersistentFSM
    return domainEvent;
  }

  @Override
  public String manifest(DomainEvent event) {
    return "";
  }

  @Override
  public EventSeq<DomainEvent> fromJournal(Object event, String manifest) {
    if (event instanceof akka.persistence.fsm.PersistentFSM.StateChangeEvent) {
      // In this example the state transitions can be inferred from the events
      // Alternatively the StateChangeEvent can be converted to a private event if either the
      // StateChangeEvent.stateIdentifier
      // or StateChangeEvent.timeout is required
      // Many use cases have the same timeout so it can be hard coded, otherwise it cane be stored
      // in the state
      return EventSeq.empty();
    } else {
      // If using a new domain event model the conversion would happen here
      return EventSeq.single((DomainEvent) event);
    }
  }
```

### Example 35: Migration steps

```scala
val persistentFSMSnapshotAdapter: SnapshotAdapter[State] = PersistentFSMMigration.snapshotAdapter[State] {
  case (stateIdentifier, data, _) =>
    val cart = data.asInstanceOf[ShoppingCart]
    stateIdentifier match {
      case "Looking Around" => LookingAround(cart)
      case "Shopping"       => Shopping(cart)
      case "Inactive"       => Inactive(cart)
      case "Paid"           => Paid(cart)
      case id               => throw new IllegalStateException(s"Unexpected state identifier $id")
    }
}
```

### Example 36: Migration steps

```java
@Override
public SnapshotAdapter<State> snapshotAdapter() {
  return PersistentFSMMigration.snapshotAdapter(
      (stateIdentifier, snapshot, timeout) -> {
        ShoppingCart cart = (ShoppingCart) snapshot;
        switch (stateIdentifier) {
          case "Looking Around":
            return new LookingAround(cart);
          case "Shopping":
            return new Shopping(cart);
          case "Inactive":
            return new Inactive(cart);
          case "Paid":
            return new Paid(cart);
          default:
            throw new IllegalStateException("Unexpected state identifier " + stateIdentifier);
        }
      });
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/libraries/akka-core/2.8/additional/rolling-updates.html
- https://doc.akka.io/libraries/akka-core/2.8/persistence-fsm.html
- https://doc.akka.io/libraries/akka-core/2.8/persistence.html
- https://doc.akka.io/libraries/akka-core/2.8/testing.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/persistence.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.8/persistence-fsm.html](https://doc.akka.io/libraries/akka-core/2.8/persistence-fsm.html)*
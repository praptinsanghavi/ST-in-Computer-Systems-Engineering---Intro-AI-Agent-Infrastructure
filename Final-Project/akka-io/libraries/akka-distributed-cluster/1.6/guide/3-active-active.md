---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:03:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/3-active-active.html
title: 'Part 3: Active-active • Akka Distributed Cluster'
---

# Part 3: Active-active • Akka Distributed Cluster

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 3: Active\-active

Active\-active means that the same shopping cart is in memory in multiple locations, replicas, and can accept updates in all of those locations, so that a cloud region outage does not block users from continuing to use the service. 

![Diagram showing Replicated Ecent Sourcing over gRPC between three services](../images/res-over-grpc.svg)

[Akka Replicated Event Sourcing](https://doc.akka.io/libraries/akka-core/2.10/typed/replicated-eventsourcing.html) stores persisted events in a local database, without any need for replication capabilities in the database itself, the events are then replicated using the [Akka Replicated Event Sourcing gRPC transport](https://doc.akka.io/libraries/akka-projection/1.6/grpc-replicated-event-sourcing-transport.html).

The shopping cart will be eventually consistent, meaning that an update to the cart in one replica will not immediately be visible in the other replicas, but eventually all replicas will reach the same state. 

## Turning the shopping cart into a Replicated Entity

The API for writing a Replicated Event Sourced entity is mostly the exact same as the Event Sourced Behavior we already implemented our entity with. 

The events from other replicas will be replicated and are passed to the event handler of the entity just like events that was written by the shopping cart instance itself, however there is no global ordering of the events, so events may be seen in a different order than the wall clock order they happened, and in a different order in each replica, especially in circumstances where there are outages or connectivity problems between the replicas.

### Updating the cart contents

Because of the possibility of observing the events out of order when they have been written to different replicas, we must make sure the state ends up the same even in the face of re\-ordered events. 

This can be handled by keeping track of the quantity of an item both when it is positive and negative, so that seeing a remove of 1 item before an add 1 of the same item ends up as the item removed with a zero quantity. We have already represented add and remove as a negative or positive number in the `ItemUpdatedEvent`

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L164 "Go to snippet source")final case class ItemUpdated(itemId: String, quantity: Int) extends Event
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L228-L235 "Go to snippet source")static final class ItemUpdated extends Event {
  public final String itemId;
  public final int quantity;

  public ItemUpdated(String itemId, int quantity) {
    this.itemId = itemId;
    this.quantity = quantity;
  }
```

In the state, we keep a map from `itemId` to the current quantity for each product. For each update we see, we add the positive or negative number to the quantity, getting the same number regardless of what order the changes arrived:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L54-L69 "Go to snippet source")final case class State(
    items: Map[String, Int],
    closed: Set[ReplicaId],
    checkedOut: Option[Instant],
    vipCustomer: Boolean)
    extends CborSerializable {
  def updateItem(itemId: String, quantity: Int): State =
    copy(items = items + (itemId -> (items.getOrElse(itemId, 0) + quantity)))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L63-L92 "Go to snippet source")static final class State implements CborSerializable {
  final Map<String, Integer> items;
  final Set<ReplicaId> closed;
  private Optional<Instant> checkedOut;
  private boolean vipCustomer = false;

  public State updateItem(String itemId, int quantity) {
    items.put(itemId, items.getOrDefault(itemId, 0) + quantity);
    return this;
  }
```

### Checking the cart out

Another, more complex thing to deal with is checking out. When we had only one instance of the cart, it was safe to say that after a checkout event, no more updates could happen to the shopping cart. With a replicated cart this is no longer the case as an update could be sent to one replica, and the checkout to another, so that the update arrives to the checked out replica after it was checked out, even though at the time of the update, the cart was not yet checked out.

We can solve this by turning checkout into a two\-step process, where the initial checkout triggers storing a checkout event per replica, and letting one of the replicas get a designation as leader, completing the checkout once it has seen checkout events from all replicas.

When we receive a checkout command, we store a `Closed` event which also contains the id of the replica. We can get the “self” replica id from the [`ReplicationContext`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html "akka.persistence.typed.javadsl.ReplicationContext")[`ReplicationContext`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html "akka.persistence.typed.scaladsl.ReplicationContext"):

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L290-L295 "Go to snippet source")case Checkout(replyTo) =>
  Effect
    .persist(Closed(replicationContext.replicaId))
    .thenReply(replyTo) { updatedCart =>
      StatusReply.Success(updatedCart.toSummary)
    }
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L462-L466 "Go to snippet source")private ReplyEffect<Event, State> openOnCheckout(State state, Checkout cmd) {
  return Effect()
      .persist(new Closed(replicationContext.replicaId()))
      .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
}
```

In the state we keep a set of all replicas where the cart was closed:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L54-L78 "Go to snippet source")final case class State(
    items: Map[String, Int],
    closed: Set[ReplicaId],
    checkedOut: Option[Instant],
    vipCustomer: Boolean)
    extends CborSerializable {
  def close(replica: ReplicaId): State =
    copy(closed = closed + replica)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L63-L104 "Go to snippet source")static final class State implements CborSerializable {
  final Map<String, Integer> items;
  final Set<ReplicaId> closed;
  private Optional<Instant> checkedOut;
  private boolean vipCustomer = false;

  public State close(ReplicaId replica) {
    closed.add(replica);
    return this;
  }
```

After applying the event to the state, we check if one of the other replicas was closed, and in that case we trigger a command to the shopping cart itself to close also in this replica using the `CloseForCheckout` command. 

If all replicas are closed and this is the designated leader we trigger a `CompleteCheckout` command. Note that this logic is only triggered if the entity got the event replicated, and not if it is “recovering” \- starting after it was stopped and is replaying all events stored in the journal: 

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L346-L379 "Go to snippet source")private def handleEvent(state: State, event: Event): State = {
  val newState = event match {
    case ItemUpdated(itemId, quantity) =>
      state.updateItem(itemId, quantity)
    case CustomerMarkedVip(_) =>
      state.markCustomerVip()
    case Closed(replica) =>
      state.close(replica)
    case CheckedOut(eventTime) =>
      state.checkout(eventTime)
  }
  eventTriggers(newState, event)
  newState
}

private def eventTriggers(state: State, event: Event): Unit = {
  if (!replicationContext.recoveryRunning) {
    if (onlyReplicateVip && !state.vipCustomer) {
      // not replicated, no need to coordinate, we can close it right away
      context.self ! CompleteCheckout
    } else {
      event match {
        case _: Closed =>
          if (!state.closed(replicationContext.replicaId)) {
            context.self ! CloseForCheckout
          } else if (isLeader) {
            val allClosed = replicationContext.allReplicas.diff(state.closed).isEmpty
            if (allClosed) context.self ! CompleteCheckout
          }
        case _ =>
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L522-L554 "Go to snippet source")@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(
          ItemUpdated.class, (state, event) -> state.updateItem(event.itemId, event.quantity))
      .onEvent(CustomerMarkedVip.class, (state, event) -> state.markCustomerVip())
      .onEvent(
          Closed.class,
          (state, event) -> {
            State newState = state.close(event.replica);
            eventTriggers(newState);
            return newState;
          })
      .onEvent(CheckedOut.class, (state, event) -> state.checkout(event.eventTime))
      .build();
}

private void eventTriggers(State state) {
  if (!replicationContext.recoveryRunning()) {
    if (onlyReplicateVip && !state.vipCustomer) {
      // not replicated, no need to coordinate, we can close it right away
      context.getSelf().tell(CompleteCheckout.INSTANCE);
    } else {
      if (!state.closed.contains(replicationContext.replicaId())) {
        context.getSelf().tell(CloseForCheckout.INSTANCE);
      } else if (isLeader) {
        boolean allClosed = replicationContext.getAllReplicas().equals(state.closed);
        if (allClosed) context.getSelf().tell(CompleteCheckout.INSTANCE);
      }
    }
  }
}
```

The logic for leader makes sure to not tie all carts to the same replica as leader, but instead spreading it across the replicas, by basing it of a hash of the id of the cart. This again uses the [`ReplicationContext`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html "akka.persistence.typed.javadsl.ReplicationContext")[`ReplicationContext`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html "akka.persistence.typed.scaladsl.ReplicationContext") to access the list of all replicas:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L243-L247 "Go to snippet source")private val isLeader: Boolean = {
  val orderedReplicas = replicationContext.allReplicas.toSeq.sortBy(_.id)
  val leaderIndex = math.abs(replicationContext.entityId.hashCode % orderedReplicas.size)
  orderedReplicas(leaderIndex) == replicationContext.replicaId
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L406-L413 "Go to snippet source")private static boolean isShoppingCartLeader(ReplicationContext replicationContext) {
  List<ReplicaId> orderedReplicas =
      replicationContext.getAllReplicas().stream()
          .sorted(Comparator.comparing(ReplicaId::id))
          .collect(Collectors.toList());
  int leaderIndex = Math.abs(replicationContext.entityId().hashCode() % orderedReplicas.size());
  return orderedReplicas.get(leaderIndex) == replicationContext.replicaId();
}
```

Note that this still means that while adding and removing can be done in the face of an outage, all replicas must be online for any shopping cart to be able to close, so it does not give us complete high\-availability for the shopping cart, but it illustrates how we can coordinate when needed.

## Filters

By default, events from all Replicated Event Sourced entities are replicated.

The same kind of filters as described for [Service to Service](2-service-to-service.html#filters) can be used for Replicated Event Sourcing. Replicated Event Sourcing is bidirectional replication, and therefore you would typically have to define the same filters on both sides. That is not handled automatically. 

One way to make sure filtering is reflective is using a property of the state to tag events, an event applied to the state triggering the tag will be replicated to other nodes and lead to the same property change there, eventually causing the same filter on all replicas.

To add such filtering to the shopping cart we have added a `vipCustomer` flag on the state, which when true will lead to adding the tag `vip` to any event emitted for the cart:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L54-L105 "Go to snippet source")final case class State(
    items: Map[String, Int],
    closed: Set[ReplicaId],
    checkedOut: Option[Instant],
    vipCustomer: Boolean)
    extends CborSerializable {

  def tags: Set[String] = {
    val total = totalQuantity
    val quantityTags =
      if (total == 0) Set.empty
      else if (total >= 100) Set(LargeQuantityTag)
      else if (total >= 10) Set(MediumQuantityTag)
      else Set(SmallQuantityTag)

    quantityTags ++ (if (vipCustomer) Set(VipCustomerTag) else Set.empty)
  }
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L63-L135 "Go to snippet source")static final class State implements CborSerializable {
  final Map<String, Integer> items;
  final Set<ReplicaId> closed;
  private Optional<Instant> checkedOut;
  private boolean vipCustomer = false;

  public Set<String> tags() {
    int total = totalQuantity();
    Set<String> tags = new HashSet<>();
    if (vipCustomer) {
      tags.add(VIP_CUSTOMER_TAG);
    }
    if (total >= 100) {
      tags.add(LARGE_QUANTITY_TAG);
    } else if (total >= 10) {
      tags.add(MEDIUM_QUANTITY_TAG);
    } else {
      tags.add(SMALL_QUANTITY_TAG);
    }
    return tags;
  }
```

An alternative initialization method adds a filter looking for the `vip` tag: 

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L199-L215 "Go to snippet source")def initWithProducerFilter(implicit system: ActorSystem[_]): Replication[Command] = {
  val producerFilter: EventEnvelope[Event] => Boolean = { envelope =>
    envelope.tags.contains(VipCustomerTag)
  }
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
    .withProducerFilter(producerFilter)

  Replication.grpcReplication(replicationSettings)(ShoppingCart.applyWithProducerFilter)
}

def applyWithProducerFilter(replicatedBehaviors: ReplicatedBehaviors[Command, Event, State]): Behavior[Command] = {
  Behaviors.setup[Command] { context =>
    replicatedBehaviors.setup { replicationContext =>
      new ShoppingCart(context, replicationContext, onlyReplicateVip = true).behavior()
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L332-L356 "Go to snippet source")public static Replication<Command> initWithProducerFilter(ActorSystem<?> system) {
  Predicate<EventEnvelope<Event>> producerFilter =
      envelope -> envelope.getTags().contains(VIP_CUSTOMER_TAG);
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
          Command.class,
          ShoppingCart.ENTITY_TYPE,
          R2dbcReplication.create(system),
          system)
          .withProducerFilter(producerFilter);

  return Replication.grpcReplication(replicationSettings,  ShoppingCart::createWithProducerFilter, system);
}

public static Behavior<Command> createWithProducerFilter(
    ReplicatedBehaviors<Command, Event, State> replicatedBehaviors) {
  return Behaviors.setup(
      context ->
          replicatedBehaviors.setup(
              replicationContext -> new ShoppingCart(
                  context,
                  replicationContext,
                  true // onlyReplicateVip flag
                  )));
}
```

For carts not replicated the replica commit round triggered by check out would never complete, as the other replicas can not see events from the non\-replicated carts. 

An additional check immediately completes checkout for such carts:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L346-L379 "Go to snippet source")private def handleEvent(state: State, event: Event): State = {
  val newState = event match {
    case ItemUpdated(itemId, quantity) =>
      state.updateItem(itemId, quantity)
    case CustomerMarkedVip(_) =>
      state.markCustomerVip()
    case Closed(replica) =>
      state.close(replica)
    case CheckedOut(eventTime) =>
      state.checkout(eventTime)
  }
  eventTriggers(newState, event)
  newState
}

private def eventTriggers(state: State, event: Event): Unit = {
  if (!replicationContext.recoveryRunning) {
    if (onlyReplicateVip && !state.vipCustomer) {
      // not replicated, no need to coordinate, we can close it right away
      context.self ! CompleteCheckout
    } else {
      event match {
        case _: Closed =>
          if (!state.closed(replicationContext.replicaId)) {
            context.self ! CloseForCheckout
          } else if (isLeader) {
            val allClosed = replicationContext.allReplicas.diff(state.closed).isEmpty
            if (allClosed) context.self ! CompleteCheckout
          }
        case _ =>
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L522-L554 "Go to snippet source")@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(
          ItemUpdated.class, (state, event) -> state.updateItem(event.itemId, event.quantity))
      .onEvent(CustomerMarkedVip.class, (state, event) -> state.markCustomerVip())
      .onEvent(
          Closed.class,
          (state, event) -> {
            State newState = state.close(event.replica);
            eventTriggers(newState);
            return newState;
          })
      .onEvent(CheckedOut.class, (state, event) -> state.checkout(event.eventTime))
      .build();
}

private void eventTriggers(State state) {
  if (!replicationContext.recoveryRunning()) {
    if (onlyReplicateVip && !state.vipCustomer) {
      // not replicated, no need to coordinate, we can close it right away
      context.getSelf().tell(CompleteCheckout.INSTANCE);
    } else {
      if (!state.closed.contains(replicationContext.replicaId())) {
        context.getSelf().tell(CloseForCheckout.INSTANCE);
      } else if (isLeader) {
        boolean allClosed = replicationContext.getAllReplicas().equals(state.closed);
        if (allClosed) context.getSelf().tell(CompleteCheckout.INSTANCE);
      }
    }
  }
}
```

## Complete Sample Projects

The complete sample can be downloaded:

- Scala: [replicated\-shopping\-scala.zip](../attachments/replicated-shopping-scala.zip)
- Java: [replicated\-shopping\-java.zip](../attachments/replicated-shopping-java.zip)

## Running the sample code locally

1. Start two local PostgresSQL servers, on ports 5101 and 5201\. The included `docker-compose.yml` starts everything required for running locally.

```
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db_1 psql -U postgres -t < ddl-scripts/create_tables.sql
docker exec -i postgres_db_2 psql -U postgres -t < ddl-scripts/create_tables.sql

```
2. Start a first node for each replica:

```
sbt -Dconfig.resource=replica1-local1.conf run

```

```
sbt -Dconfig.resource=replica2-local1.conf run

```
3. (Optional) Start another node with different ports:

```
sbt -Dconfig.resource=replica1-local2.conf run

```

```
sbt -Dconfig.resource=replica2-local2.conf run

```
4. (Optional) More can be started:

```
sbt -Dconfig.resource=replica1-local3.conf run

```

```
sbt -Dconfig.resource=replica2-local3.conf run

```
5. Check for service readiness

```
curl http://localhost:9101/ready

```

```
curl http://localhost:9201/ready

```
6. Try it with [grpcurl](https://github.com/fullstorydev/grpcurl):

```
# add item to cart on the first replica
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":7}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart from first replica
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# get cart from second replica
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.GetCart

# update quantity of item on the second replica
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":2}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.RemoveItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout

or same `grpcurl` commands to port 8102/8202 to reach node 2.

```

1. Start two local PostgresSQL servers, on ports 5101 and 5201\. The included `docker-compose.yml` starts everything required for running locally.

```
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db_1 psql -U postgres -t < ddl-scripts/create_tables.sql
docker exec -i postgres_db_2 psql -U postgres -t < ddl-scripts/create_tables.sql

```
2. Make sure you have compiled the project

```
mvn compile 

```
3. Start a first node for each replica:

```
mvn compile exec:exec -DAPP_CONFIG=replica1-local1.conf

```

```
mvn compile exec:exec -DAPP_CONFIG=replica2-local1.conf

```
4. (Optional) Start another node with different ports:

```
mvn compile exec:exec -DAPP_CONFIG=replica1-local2.conf

```

```
mvn compile exec:exec -DAPP_CONFIG=replica2-local2.conf

```
5. (Optional) More can be started:

```
mvn compile exec:exec -DAPP_CONFIG=replica1-local3.conf

```

```
mvn compile exec:exec -DAPP_CONFIG=replica2-local3.conf

```
6. Check for service readiness

```
curl http://localhost:9101/ready

```

```
curl http://localhost:9201/ready

```
7. Try it with [grpcurl](https://github.com/fullstorydev/grpcurl):

```
# add item to cart on the first replica
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":7}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart from first replica
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# get cart from second replica
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.GetCart

# update quantity of item on the second replica
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":2}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.RemoveItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout

```

or same `grpcurl` commands to port 8102/8202 to reach node 2\.

## What’s next?

- Configuring and deploying the service with Kubernetes

## Code Examples

### Example 1: Updating the cart contents

```scala
final case class ItemUpdated(itemId: String, quantity: Int) extends Event
```

### Example 2: Updating the cart contents

```java
static final class ItemUpdated extends Event {
  public final String itemId;
  public final int quantity;

  public ItemUpdated(String itemId, int quantity) {
    this.itemId = itemId;
    this.quantity = quantity;
  }
```

### Example 3: Updating the cart contents

```scala
final case class State(
    items: Map[String, Int],
    closed: Set[ReplicaId],
    checkedOut: Option[Instant],
    vipCustomer: Boolean)
    extends CborSerializable {
  def updateItem(itemId: String, quantity: Int): State =
    copy(items = items + (itemId -> (items.getOrElse(itemId, 0) + quantity)))
```

### Example 4: Updating the cart contents

```java
static final class State implements CborSerializable {
  final Map<String, Integer> items;
  final Set<ReplicaId> closed;
  private Optional<Instant> checkedOut;
  private boolean vipCustomer = false;

  public State updateItem(String itemId, int quantity) {
    items.put(itemId, items.getOrDefault(itemId, 0) + quantity);
    return this;
  }
```

### Example 5: Checking the cart out

```scala
case Checkout(replyTo) =>
  Effect
    .persist(Closed(replicationContext.replicaId))
    .thenReply(replyTo) { updatedCart =>
      StatusReply.Success(updatedCart.toSummary)
    }
```

### Example 6: Checking the cart out

```java
private ReplyEffect<Event, State> openOnCheckout(State state, Checkout cmd) {
  return Effect()
      .persist(new Closed(replicationContext.replicaId()))
      .thenReply(cmd.replyTo, updatedCart -> StatusReply.success(updatedCart.toSummary()));
}
```

### Example 7: Checking the cart out

```scala
final case class State(
    items: Map[String, Int],
    closed: Set[ReplicaId],
    checkedOut: Option[Instant],
    vipCustomer: Boolean)
    extends CborSerializable {
  def close(replica: ReplicaId): State =
    copy(closed = closed + replica)
```

### Example 8: Checking the cart out

```java
static final class State implements CborSerializable {
  final Map<String, Integer> items;
  final Set<ReplicaId> closed;
  private Optional<Instant> checkedOut;
  private boolean vipCustomer = false;

  public State close(ReplicaId replica) {
    closed.add(replica);
    return this;
  }
```

### Example 9: Checking the cart out

```scala
private def handleEvent(state: State, event: Event): State = {
  val newState = event match {
    case ItemUpdated(itemId, quantity) =>
      state.updateItem(itemId, quantity)
    case CustomerMarkedVip(_) =>
      state.markCustomerVip()
    case Closed(replica) =>
      state.close(replica)
    case CheckedOut(eventTime) =>
      state.checkout(eventTime)
  }
  eventTriggers(newState, event)
  newState
}

private def eventTriggers(state: State, event: Event): Unit = {
  if (!replicationContext.recoveryRunning) {
    if (onlyReplicateVip && !state.vipCustomer) {
      // not replicated, no need to coordinate, we can close it right away
      context.self ! CompleteCheckout
    } else {
      event match {
        case _: Closed =>
          if (!state.closed(replicationContext.replicaId)) {
            context.self ! CloseForCheckout
          } else if (isLeader) {
            val allClosed = replicationContext.allReplicas.diff(state.closed).isEmpty
            if (allClosed) context.self ! CompleteCheckout
          }
        case _ =>
      }
    }
  }
}
```

### Example 10: Checking the cart out

```java
@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(
          ItemUpdated.class, (state, event) -> state.updateItem(event.itemId, event.quantity))
      .onEvent(CustomerMarkedVip.class, (state, event) -> state.markCustomerVip())
      .onEvent(
          Closed.class,
          (state, event) -> {
            State newState = state.close(event.replica);
            eventTriggers(newState);
            return newState;
          })
      .onEvent(CheckedOut.class, (state, event) -> state.checkout(event.eventTime))
      .build();
}

private void eventTriggers(State state) {
  if (!replicationContext.recoveryRunning()) {
    if (onlyReplicateVip && !state.vipCustomer) {
      // not replicated, no need to coordinate, we can close it right away
      context.getSelf().tell(CompleteCheckout.INSTANCE);
    } else {
      if (!state.closed.contains(replicationContext.replicaId())) {
        context.getSelf().tell(CloseForCheckout.INSTANCE);
      } else if (isLeader) {
        boolean allClosed = replicationContext.getAllReplicas().equals(state.closed);
        if (allClosed) context.getSelf().tell(CompleteCheckout.INSTANCE);
      }
    }
  }
}
```

### Example 11: Checking the cart out

```scala
private val isLeader: Boolean = {
  val orderedReplicas = replicationContext.allReplicas.toSeq.sortBy(_.id)
  val leaderIndex = math.abs(replicationContext.entityId.hashCode % orderedReplicas.size)
  orderedReplicas(leaderIndex) == replicationContext.replicaId
}
```

### Example 12: Checking the cart out

```java
private static boolean isShoppingCartLeader(ReplicationContext replicationContext) {
  List<ReplicaId> orderedReplicas =
      replicationContext.getAllReplicas().stream()
          .sorted(Comparator.comparing(ReplicaId::id))
          .collect(Collectors.toList());
  int leaderIndex = Math.abs(replicationContext.entityId().hashCode() % orderedReplicas.size());
  return orderedReplicas.get(leaderIndex) == replicationContext.replicaId();
}
```

### Example 13: Filters

```scala
final case class State(
    items: Map[String, Int],
    closed: Set[ReplicaId],
    checkedOut: Option[Instant],
    vipCustomer: Boolean)
    extends CborSerializable {

  def tags: Set[String] = {
    val total = totalQuantity
    val quantityTags =
      if (total == 0) Set.empty
      else if (total >= 100) Set(LargeQuantityTag)
      else if (total >= 10) Set(MediumQuantityTag)
      else Set(SmallQuantityTag)

    quantityTags ++ (if (vipCustomer) Set(VipCustomerTag) else Set.empty)
  }
```

### Example 14: Filters

```java
static final class State implements CborSerializable {
  final Map<String, Integer> items;
  final Set<ReplicaId> closed;
  private Optional<Instant> checkedOut;
  private boolean vipCustomer = false;

  public Set<String> tags() {
    int total = totalQuantity();
    Set<String> tags = new HashSet<>();
    if (vipCustomer) {
      tags.add(VIP_CUSTOMER_TAG);
    }
    if (total >= 100) {
      tags.add(LARGE_QUANTITY_TAG);
    } else if (total >= 10) {
      tags.add(MEDIUM_QUANTITY_TAG);
    } else {
      tags.add(SMALL_QUANTITY_TAG);
    }
    return tags;
  }
```

### Example 15: Filters

```scala
def initWithProducerFilter(implicit system: ActorSystem[_]): Replication[Command] = {
  val producerFilter: EventEnvelope[Event] => Boolean = { envelope =>
    envelope.tags.contains(VipCustomerTag)
  }
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
    .withProducerFilter(producerFilter)

  Replication.grpcReplication(replicationSettings)(ShoppingCart.applyWithProducerFilter)
}

def applyWithProducerFilter(replicatedBehaviors: ReplicatedBehaviors[Command, Event, State]): Behavior[Command] = {
  Behaviors.setup[Command] { context =>
    replicatedBehaviors.setup { replicationContext =>
      new ShoppingCart(context, replicationContext, onlyReplicateVip = true).behavior()
    }
  }
}
```

### Example 16: Filters

```java
public static Replication<Command> initWithProducerFilter(ActorSystem<?> system) {
  Predicate<EventEnvelope<Event>> producerFilter =
      envelope -> envelope.getTags().contains(VIP_CUSTOMER_TAG);
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
          Command.class,
          ShoppingCart.ENTITY_TYPE,
          R2dbcReplication.create(system),
          system)
          .withProducerFilter(producerFilter);

  return Replication.grpcReplication(replicationSettings,  ShoppingCart::createWithProducerFilter, system);
}

public static Behavior<Command> createWithProducerFilter(
    ReplicatedBehaviors<Command, Event, State> replicatedBehaviors) {
  return Behaviors.setup(
      context ->
          replicatedBehaviors.setup(
              replicationContext -> new ShoppingCart(
                  context,
                  replicationContext,
                  true // onlyReplicateVip flag
                  )));
}
```

### Example 17: Filters

```scala
private def handleEvent(state: State, event: Event): State = {
  val newState = event match {
    case ItemUpdated(itemId, quantity) =>
      state.updateItem(itemId, quantity)
    case CustomerMarkedVip(_) =>
      state.markCustomerVip()
    case Closed(replica) =>
      state.close(replica)
    case CheckedOut(eventTime) =>
      state.checkout(eventTime)
  }
  eventTriggers(newState, event)
  newState
}

private def eventTriggers(state: State, event: Event): Unit = {
  if (!replicationContext.recoveryRunning) {
    if (onlyReplicateVip && !state.vipCustomer) {
      // not replicated, no need to coordinate, we can close it right away
      context.self ! CompleteCheckout
    } else {
      event match {
        case _: Closed =>
          if (!state.closed(replicationContext.replicaId)) {
            context.self ! CloseForCheckout
          } else if (isLeader) {
            val allClosed = replicationContext.allReplicas.diff(state.closed).isEmpty
            if (allClosed) context.self ! CompleteCheckout
          }
        case _ =>
      }
    }
  }
}
```

### Example 18: Filters

```java
@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(
          ItemUpdated.class, (state, event) -> state.updateItem(event.itemId, event.quantity))
      .onEvent(CustomerMarkedVip.class, (state, event) -> state.markCustomerVip())
      .onEvent(
          Closed.class,
          (state, event) -> {
            State newState = state.close(event.replica);
            eventTriggers(newState);
            return newState;
          })
      .onEvent(CheckedOut.class, (state, event) -> state.checkout(event.eventTime))
      .build();
}

private void eventTriggers(State state) {
  if (!replicationContext.recoveryRunning()) {
    if (onlyReplicateVip && !state.vipCustomer) {
      // not replicated, no need to coordinate, we can close it right away
      context.getSelf().tell(CompleteCheckout.INSTANCE);
    } else {
      if (!state.closed.contains(replicationContext.replicaId())) {
        context.getSelf().tell(CloseForCheckout.INSTANCE);
      } else if (isLeader) {
        boolean allClosed = replicationContext.getAllReplicas().equals(state.closed);
        if (allClosed) context.getSelf().tell(CompleteCheckout.INSTANCE);
      }
    }
  }
}
```

### Example 19: Running the sample code locally

```shell
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db_1 psql -U postgres -t < ddl-scripts/create_tables.sql
docker exec -i postgres_db_2 psql -U postgres -t < ddl-scripts/create_tables.sql
```

### Example 20: Running the sample code locally

```shell
sbt -Dconfig.resource=replica1-local1.conf run
```

### Example 21: Running the sample code locally

```shell
sbt -Dconfig.resource=replica2-local1.conf run
```

### Example 22: Running the sample code locally

```shell
sbt -Dconfig.resource=replica1-local2.conf run
```

### Example 23: Running the sample code locally

```shell
sbt -Dconfig.resource=replica2-local2.conf run
```

### Example 24: Running the sample code locally

```shell
sbt -Dconfig.resource=replica1-local3.conf run
```

### Example 25: Running the sample code locally

```shell
sbt -Dconfig.resource=replica2-local3.conf run
```

### Example 26: Running the sample code locally

```shell
curl http://localhost:9101/ready
```

### Example 27: Running the sample code locally

```shell
curl http://localhost:9201/ready
```

### Example 28: Running the sample code locally

```shell
# add item to cart on the first replica
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":7}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart from first replica
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# get cart from second replica
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.GetCart

# update quantity of item on the second replica
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":2}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.RemoveItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout

or same `grpcurl` commands to port 8102/8202 to reach node 2.
```

### Example 29: Running the sample code locally

```shell
docker compose up --wait

# creates the tables needed for Akka Persistence
# as well as the offset store table for Akka Projection
docker exec -i postgres_db_1 psql -U postgres -t < ddl-scripts/create_tables.sql
docker exec -i postgres_db_2 psql -U postgres -t < ddl-scripts/create_tables.sql
```

### Example 30: Running the sample code locally

```shell
mvn compile
```

### Example 31: Running the sample code locally

```shell
mvn compile exec:exec -DAPP_CONFIG=replica1-local1.conf
```

### Example 32: Running the sample code locally

```shell
mvn compile exec:exec -DAPP_CONFIG=replica2-local1.conf
```

### Example 33: Running the sample code locally

```shell
mvn compile exec:exec -DAPP_CONFIG=replica1-local2.conf
```

### Example 34: Running the sample code locally

```shell
mvn compile exec:exec -DAPP_CONFIG=replica2-local2.conf
```

### Example 35: Running the sample code locally

```shell
mvn compile exec:exec -DAPP_CONFIG=replica1-local3.conf
```

### Example 36: Running the sample code locally

```shell
mvn compile exec:exec -DAPP_CONFIG=replica2-local3.conf
```

### Example 37: Running the sample code locally

```shell
curl http://localhost:9101/ready
```

### Example 38: Running the sample code locally

```shell
curl http://localhost:9201/ready
```

### Example 39: Running the sample code locally

```shell
# add item to cart on the first replica
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":7}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

# get cart from first replica
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart

# get cart from second replica
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.GetCart

# update quantity of item on the second replica
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":2}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.RemoveItem

# check out cart
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/replicated-eventsourcing.html
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/attachments/replicated-shopping-java.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/attachments/replicated-shopping-scala.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/2-service-to-service.html
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/4-deploying.html
- https://doc.akka.io/libraries/akka-projection/1.6/grpc-replicated-event-sourcing-transport.html

---
*Source: [https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/3-active-active.html](https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/3-active-active.html)*
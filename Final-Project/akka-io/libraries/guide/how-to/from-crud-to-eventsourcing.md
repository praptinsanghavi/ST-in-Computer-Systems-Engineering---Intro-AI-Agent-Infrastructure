---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:32Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/how-to/from-crud-to-eventsourcing.html
title: 'How to migrate from CRUD to Event Sourcing :: Akka Guide'
---

# How to migrate from CRUD to Event Sourcing :: Akka Guide

## Content

# How to migrate from CRUD to Event Sourcing

|  | This howto is not about [slicing the monolith into Microservices new tab](https://content.akka.io/hubfs/collateral/ebook/ebook-reactive-microservices-architecture.pdf) or the [Advantages of Event Sourcing](../concepts/event-sourcing.html#advantages). |
| --- | --- |

When developing using a traditional CRUD approach, the entities in memory are a collection of mutable classes. Similarly, the representation of that data on the database is a collection of mutable rows in several tables.

In [Event Sourcing](../concepts/event-sourcing.html), we will model data as a sequence of immutable events where each event is the necessary data to mutate the state we modelled. Therefore, instead of storing the current representation of a state like we would do on a traditional CRUD approach, in Event Sourcing we store an always increasing list of events.

If you are familiar with JPA it is worth noting that an Event Sourced Entity can be used for similar things as a JPA `@Entity` but several aspects are rather different. For example, with JPA you typically only store current state, and the history of how the state was reached is not captured. Or, a JPA `@Entity` is loaded from the database from wherever it is needed, i.e. there may be many Java object instances with the same entity identifier. In contrast, Akka provide mechanisms so there is only one instance of Event Sourced Entity with a given identifier.

The first step to migrate from CRUD to Event Sourcing is to enrich your business model:

1. identifying what causes a change on the state and
2. modelling this increment.

## CRUD State vs Event Sourcing State/Command/Event

In CRUD, your only modelling concern is the `State` representing your business. In Event Sourcing, you will have to model the `State`, the `Command` 's demanding a state mutation and the `Events`.

An initial trick to help you in this mindset shift is to separate the CRUD code into:

- `Read` operations: actions on the database that only select data
- `Create`, `Update` and `Delete` operations: operations that mutate the data

Once you’ve made that distinction you are on track to model your commands. Each operation mutating your data can be tracked back to a user intent demanding the state to change.

Imagine you are modelling a Shopping Cart (like to one on the ["Implementing Microservices with Akka" tutorial](../microservices-tutorial/index.html)). In CRUD, you would have a `SHOPPING_CART` table, then a `SHOPPING_CART_ITEMS` table with a foreign key to `SHOPPING_CART`, another foreign key to `ITEMS` and a column with an amount (how many times an item is on a shopping cart). Then, in code, we have a `ShoppingCart` class and maybe a `ShoppingCartRepository` class with the logic to read and write from the database, and the validation code over a `ShoppingCart` instance. The `ShoppingCartRepository` maybe looked something like:

```
// pseudo code
class ShoppingCartRepository {
  // fails if the cart is already checked out, or the quantity in the item field is
  // negative or zero, or the item is on the cart already
  def addItem(shoppingCartId, item): Unit

  // fails if the cart is empty or already checked out
  def checkOut(shoppingCartId): Unit
}
```

In Event Sourcing, on the other hand, there is a single table (referred to as *Journal*) where we store a collection of events. Then, in code, we have a `ShoppingCart` class. We also have a function that receives a `ShoppinCartCommand` and returns zero, one or many `ShoppingCartEvent` 's. Finally, we have a function that given a `ShoppingCart`, and a `ShoppingCartEvent` produces the new, mutated `ShoppingCart`. Presented in pseudo\-code:

```
 (State, Command) => Seq[Event]
 (State, Event) => State
```

A (very) simplified version of a `ShoppingCart` can be modelled using two commands, and two events:

```
sealed trait Command
final case class AddItem(itemId: String, quantity: Int) extends Command
case object Checkout extends Command

sealed trait Event {
  def cartId: String
}
final case class ItemAdded(cartId: String, itemId: String, quantity: Int)
    extends Event
final case class CheckedOut(cartId: String, eventTime: Instant) extends Event
```

Finally, the `ShoppingCart` (that is the `State`) will contain the code to handle a command, and the code to handle an event.

The code to handle the commands will follow two steps:

1. validate the command can be processed given the current state
2. produce the event(s) that represent the change demanded by the command given the current state

The code to handle an event, on the other hand, only needs to implement one step:

1. produce a new state given the current state and an event

In Event Sourcing, the `State` must be rebuilt in memory every time. The process to do that is reading the events for a given entity id from the *Journal* table in the database and replay them over an empty entity using the event handlers. This process may become very inefficient when the history of events of an entity grows large. A workaround to prevent this performance loss is storing a snapshot of the state now and then (e.g. every 50 events). With this trick, instead of reading all the events for an entity we can read the latest snapshot and only apply the events that occurred after taking the snapshot.

See the [step adding an Event Sourced entity](../microservices-tutorial/entity.html), and the [step completing the Event Sourced entity](../microservices-tutorial/complete-entity.html) on the tutorial for more details.

## Consistency and Availability

In order to provide data consistency, database\-centric implementations, like a traditional CRUD application, rely on transactions on the database. In some cases, to reduce the cost of the transaction, you can use [optimistic locking mechanisms](https://en.wikipedia.org/wiki/Optimistic_concurrency_control).

If you are familiar with JPA it is worth noting that an Event Sourced Entity can be used for similar things as a JPA `@Entity` but several aspects are rather different. For example, a JPA `@Entity` is loaded from the database from wherever it is needed, i.e. there may be many Java object instances with the same entity identifier. In contrast, there is only one instance of Event Sourced Entity with a given identifier. With JPA you typically only store current state, and the history of how the state was reached is not captured.

Event Sourcing applications, on the other hand, need to reconstruct the state in memory, so they can’t base the state consistency on database locking. A solution is to keep a singleton memory image of the state (e.g. using [Akka Cluster Sharding ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html)) so all writes are redirected to a single state instance which is protected by a lock so only one modification can happen simultaneously.

If you prefer Availability to Consistency, you may also use converging algorithms so concurrent modifications on multiple state instances in memory converge into a single, valid state. Read more on this option at [Akka Persistence supports Replicated Event Sourcing ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing.html).

## Code Examples

### Example 1: CRUD State vs Event Sourcing State/Command/Event

```none
// pseudo code
class ShoppingCartRepository {
  // fails if the cart is already checked out, or the quantity in the item field is
  // negative or zero, or the item is on the cart already
  def addItem(shoppingCartId, item): Unit

  // fails if the cart is empty or already checked out
  def checkOut(shoppingCartId): Unit
}
```

### Example 2: CRUD State vs Event Sourcing State/Command/Event

```none
(State, Command) => Seq[Event]
 (State, Event) => State
```

### Example 3: CRUD State vs Event Sourcing State/Command/Event

```scala
sealed trait Command
final case class AddItem(itemId: String, quantity: Int) extends Command
case object Checkout extends Command

sealed trait Event {
  def cartId: String
}
final case class ItemAdded(cartId: String, itemId: String, quantity: Int)
    extends Event
final case class CheckedOut(cartId: String, eventTime: Instant) extends Event
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing.html
- https://doc.akka.io/libraries/guide/concepts/event-sourcing.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/complete-entity.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/entity.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/index.html

---
*Source: [https://doc.akka.io/libraries/guide/how-to/from-crud-to-eventsourcing.html](https://doc.akka.io/libraries/guide/how-to/from-crud-to-eventsourcing.html)*
---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:31:06Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/classic.html
title: Akka Classic • Akka Projection
---

# Akka Classic • Akka Projection

> **Summary:** Akka Projection.

## Content

# Akka Classic

Akka Projections can be used with the [new Actor API](https://doc.akka.io/libraries/akka-core/current/typed/actors.html) or the [classic Actor API](https://doc.akka.io/libraries/akka-core/current/index-classic.html). The documentation samples show the new Actor API, and this page highlights how to use it with the classic Actor API.

## Actor System

The `ActorSystem` is a parameter in several places of the Projections API. That is the `akka.actor.typed.ActorSystem`. Given a classic `akka.actor.ActorSystem` it can be adapted to an `akka.actor.typed.ActorSystem` like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/classic/ClassicDocExample.scala#L14-L17 "Go to snippet source")import akka.actor.typed.scaladsl.adapter._

private val system = akka.actor.ActorSystem("Example")
private val typedSystem: akka.actor.typed.ActorSystem[_] = system.toTyped
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/classic/ClassicDocExample.java#L13-L14 "Go to snippet source")import akka.actor.typed.javadsl.Adapter;

akka.actor.ActorSystem system = akka.actor.ActorSystem.create("Example");
ActorSystem<Void> typedSystem = Adapter.toTyped(system);
```

## PersistentActor

[Events from Akka Classic Persistence](eventsourced.html) can be emitted from `PersistentActor` and consumed by a Projection with the [`EventSourcedProvider`](/api/akka-projection/1.5.9/akka/projection/eventsourced/javadsl/EventSourcedProvider$.html "akka.projection.eventsourced.javadsl.EventSourcedProvider")[`EventSourcedProvider`](/api/akka-projection/1.5.9/akka/projection/eventsourced/scaladsl/EventSourcedProvider$.html "akka.projection.eventsourced.scaladsl.EventSourcedProvider"). The events from the `PersistentActor` must be tagged by wrapping them in `akka.persistence.journal.Tagged`, which can be done in the `PersistentActor` or by using [Event Adapters](https://doc.akka.io/libraries/akka-core/current/persistence.html#event-adapters).

## Running

As described in [Running a Projection](running.html) the Projection is typically run with a Sharded Daemon Process. `ShardedDaemonProcess` can be used in the same way with a classic `akka.actor.ActorSystem`, after adapting it to `akka.actor.typed.ActorSystem` as described [above](classic.html#actor-system).

To [run with a local actor](running.html#running-with-local-actor) the `ProjectionBehavior` can be spawned from the classic `ActorSystem` or a classic `Actor`:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/classic/ClassicDocExample.scala#L28-L30 "Go to snippet source")import akka.actor.typed.scaladsl.adapter._

system.spawn(ProjectionBehavior(projection), "theProjection")
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/classic/ClassicDocExample.java#L13-L14 "Go to snippet source")import akka.actor.typed.javadsl.Adapter;

Adapter.spawn(system, ProjectionBehavior.create(projection), "theProjection");
```

## Code Examples

### Example 1: Actor System

```scala
import akka.actor.typed.scaladsl.adapter._

private val system = akka.actor.ActorSystem("Example")
private val typedSystem: akka.actor.typed.ActorSystem[_] = system.toTyped
```

### Example 2: Actor System

```java
import akka.actor.typed.javadsl.Adapter;

akka.actor.ActorSystem system = akka.actor.ActorSystem.create("Example");
ActorSystem<Void> typedSystem = Adapter.toTyped(system);
```

### Example 3: Running

```scala
import akka.actor.typed.scaladsl.adapter._

system.spawn(ProjectionBehavior(projection), "theProjection")
```

### Example 4: Running

```java
import akka.actor.typed.javadsl.Adapter;

Adapter.spawn(system, ProjectionBehavior.create(projection), "theProjection");
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/eventsourced/javadsl/EventSourcedProvider$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/eventsourced/scaladsl/EventSourcedProvider$.html
- https://doc.akka.io/libraries/akka-core/current/index-classic.html
- https://doc.akka.io/libraries/akka-core/current/persistence.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-projection/1.5/classic.html
- https://doc.akka.io/libraries/akka-projection/1.5/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/1.5/running.html
- https://doc.akka.io/libraries/akka-projection/1.5/snapshots.html
- https://doc.akka.io/libraries/akka-projection/1.5/testing.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/1.5/classic.html](https://doc.akka.io/libraries/akka-projection/1.5/classic.html)*
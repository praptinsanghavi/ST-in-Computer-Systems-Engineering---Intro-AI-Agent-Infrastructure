---
description: Append only event logs, snapshots and recovery with Akka event sourced
  actors.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/docs/akka/current/typed/persistence-snapshot.html
title: Snapshotting • Akka Documentation
---

# Snapshotting • Akka Documentation

> **Summary:** Append only event logs, snapshots and recovery with Akka event sourced actors.

## Content

# Snapshotting

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Akka Persistence](../persistence.html).

## Snapshots

As you model your domain using [event sourced actors](persistence.html), you may notice that some actors may be prone to accumulating extremely long event logs and experiencing long recovery times. Sometimes, the right approach may be to split out into a set of shorter lived actors. However, when this is not an option, you can use snapshots to reduce recovery times drastically.

Persistent actors can save snapshots of internal state every N events or when a given predicate of the state is fulfilled.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L261-L273 "Go to snippet source")  
import akka.persistence.typed.scaladsl.Effect

EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => state) // do something based on a particular state
  .snapshotWhen {
    case (state, BookingCompleted(_), sequenceNumber) => true
    case (state, event, sequenceNumber)               => false
  }
  .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100, keepNSnapshots = 2))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L520-L523 "Go to snippet source")@Override // override retentionCriteria in EventSourcedBehavior
public RetentionCriteria retentionCriteria() {
  return RetentionCriteria.snapshotEvery(100, 2);
}
```

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L238-L246 "Go to snippet source")EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .snapshotWhen {
    case (state, BookingCompleted(_), sequenceNumber) => true
    case (state, event, sequenceNumber)               => false
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L513-L516 "Go to snippet source")@Override // override shouldSnapshot in EventSourcedBehavior
public boolean shouldSnapshot(State state, Event event, long sequenceNr) {
  return event instanceof BookingCompleted;
}
```

When a snapshot is triggered, incoming commands are stashed until the snapshot has been saved. This means that the state can safely be mutable although the serialization and storage of the state is performed asynchronously. The state instance will not be updated by new events until after the snapshot has been saved.

During recovery, the persistent actor is using the latest saved snapshot to initialize the state. Thereafter the events after the snapshot are replayed using the event handler to recover the persistent actor to its current (i.e. latest) state.

If not specified, they default to `SnapshotSelectionCriteria.Latest``SnapshotSelectionCriteria.latest()` which selects the latest (youngest) snapshot. It’s possible to override the selection of which snapshot to use for recovery like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L250-L257 "Go to snippet source")import akka.persistence.typed.SnapshotSelectionCriteria

EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRecovery(Recovery.withSnapshotSelectionCriteria(SnapshotSelectionCriteria.none))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L572-L575 "Go to snippet source")@Override
public Recovery recovery() {
  return Recovery.withSnapshotSelectionCriteria(SnapshotSelectionCriteria.none());
}
```

To disable snapshot\-based recovery, applications can use `SnapshotSelectionCriteria.None``SnapshotSelectionCriteria.none()`. A recovery where no saved snapshot matches the specified `SnapshotSelectionCriteria` will replay all journaled events. This can be useful if snapshot serialization format has changed in an incompatible way. It should typically not be used when events have been deleted.

In order to use snapshots, a default snapshot\-store (`akka.persistence.snapshot-store.plugin`) must be configured, or you can pick a snapshot store for for a specific `EventSourcedBehavior` by defining it with `withSnapshotPluginId` of the `EventSourcedBehavior`overriding `snapshotPluginId` in the `EventSourcedBehavior`.

Because some use cases may not benefit from or need snapshots, it is perfectly valid not to not configure a snapshot store. However, Akka will log a warning message when this situation is detected and then continue to operate until an actor tries to store a snapshot, at which point the operation will fail.

## Snapshot failures

Saving snapshots can either succeed or fail – this information is reported back to the persistent actor via the `SnapshotCompleted` or `SnapshotFailed` signal. Snapshot failures are logged by default but do not cause the actor to stop or restart.

If there is a problem with recovering the state of the actor from the journal when the actor is started, `RecoveryFailed` signal is emitted (logging the error by default), and the actor will be stopped. Note that failure to load snapshot is also treated like this, but you can disable loading of snapshots if you for example know that serialization format has changed in an incompatible way.

### Optional snapshots

By default, the persistent actor will unconditionally be stopped if the snapshot can’t be loaded in the recovery. It is possible to make snapshot loading optional. This can be useful when it is alright to ignore snapshot in case of for example deserialization errors. When snapshot loading fails it will instead recover by replaying all events.

Enable this feature by setting `snapshot-is-optional = true` in the snapshot store configuration.

Warning
Don’t set `snapshot-is-optional = true` if events have been deleted because that would result in wrong recovered state if snapshot load fails.

## Snapshot deletion

To free up space, an event sourced actor can automatically delete older snapshots based on the given `RetentionCriteria`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L261-L273 "Go to snippet source")  
import akka.persistence.typed.scaladsl.Effect

EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => state) // do something based on a particular state
  .snapshotWhen {
    case (state, BookingCompleted(_), sequenceNumber) => true
    case (state, event, sequenceNumber)               => false
  }
  .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100, keepNSnapshots = 2))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L520-L523 "Go to snippet source")@Override // override retentionCriteria in EventSourcedBehavior
public RetentionCriteria retentionCriteria() {
  return RetentionCriteria.snapshotEvery(100, 2);
}
@Override // override shouldSnapshot in EventSourcedBehavior
public boolean shouldSnapshot(State state, Event event, long sequenceNr) {
  return event instanceof BookingCompleted;
}
```

Snapshot deletion is triggered after successfully saving a new snapshot.

The above example will save snapshots automatically every `numberOfEvents = 100`. Snapshots that have sequence number less than the sequence number of the saved snapshot minus `keepNSnapshots * numberOfEvents` (`100 * 2`) are automatically deleted.

In addition, it will also save a snapshot when the persisted event is `BookingCompleted`. Automatic snapshotting based on `numberOfEvents` can be used without specifying `snapshotWhen``shouldSnapshot`. Snapshots triggered by the `snapshotWhen``shouldSnapshot` predicate will not trigger deletion of old snapshots.

On async deletion, either a `DeleteSnapshotsCompleted` or `DeleteSnapshotsFailed` signal is emitted. You can react to signal outcomes by using with `receiveSignal` handler by overriding `receiveSignal`. By default, successful completion is logged by the system at log level `debug`, failures at log level `warning`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L292-L302 "Go to snippet source")  
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100, keepNSnapshots = 2))
  .receiveSignal { // optionally respond to signals
    case (state, _: SnapshotFailed)        => // react to failure
    case (state, _: DeleteSnapshotsFailed) => // react to failure
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L527-L548 "Go to snippet source")@Override
public SignalHandler<State> signalHandler() {
  return newSignalHandlerBuilder()
      .onSignal(
          SnapshotFailed.class,
          (state, completed) -> {
            throw new RuntimeException("TODO: add some on-snapshot-failed side-effect here");
          })
      .onSignal(
          DeleteSnapshotsFailed.class,
          (state, completed) -> {
            throw new RuntimeException(
                "TODO: add some on-delete-snapshot-failed side-effect here");
          })
      .onSignal(
          DeleteEventsFailed.class,
          (state, completed) -> {
            throw new RuntimeException(
                "TODO: add some on-delete-snapshot-failed side-effect here");
          })
      .build();
}
```

## Event deletion

Deleting events in Event Sourcing based applications is typically either not used at all, or used in conjunction with snapshotting. By deleting events you will lose the history of how the system changed before it reached current state, which is one of the main reasons for using Event Sourcing in the first place.

If snapshot\-based retention is enabled, after a snapshot has been successfully stored, a delete of the events (journaled by a single event sourced actor) up until the sequence number of the data held by that snapshot can be issued.

To elect to use this, enable `withDeleteEventsOnSnapshot` of the `RetentionCriteria` which is disabled by default.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L277-L288 "Go to snippet source")  
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100, keepNSnapshots = 2).withDeleteEventsOnSnapshot)
  .receiveSignal { // optionally respond to signals
    case (state, _: SnapshotFailed)        => // react to failure
    case (state, _: DeleteSnapshotsFailed) => // react to failure
    case (state, _: DeleteEventsFailed)    => // react to failure
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L559-L562 "Go to snippet source")@Override // override retentionCriteria in EventSourcedBehavior
public RetentionCriteria retentionCriteria() {
  return RetentionCriteria.snapshotEvery(100, 2).withDeleteEventsOnSnapshot();
}
```

Event deletion is triggered after saving a new snapshot. Old events would be deleted prior to old snapshots being deleted.

On async deletion, either a `DeleteEventsCompleted` or `DeleteEventsFailed` signal is emitted. You can react to signal outcomes by using with `receiveSignal` handler by overriding `receiveSignal`. By default, successful completion is logged by the system at log level `debug`, failures at log level `warning`.

Message deletion does not affect the highest sequence number of the journal, even if all messages were deleted from it after a delete occurs.

Note
It is up to the journal implementation whether events are actually removed from storage.

## Code Examples

### Example 1: Snapshots

```scala
import akka.persistence.typed.scaladsl.Effect

EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => state) // do something based on a particular state
  .snapshotWhen {
    case (state, BookingCompleted(_), sequenceNumber) => true
    case (state, event, sequenceNumber)               => false
  }
  .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100, keepNSnapshots = 2))
```

### Example 2: Snapshots

```java
@Override // override retentionCriteria in EventSourcedBehavior
public RetentionCriteria retentionCriteria() {
  return RetentionCriteria.snapshotEvery(100, 2);
}
```

### Example 3: Snapshots

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .snapshotWhen {
    case (state, BookingCompleted(_), sequenceNumber) => true
    case (state, event, sequenceNumber)               => false
  }
```

### Example 4: Snapshots

```java
@Override // override shouldSnapshot in EventSourcedBehavior
public boolean shouldSnapshot(State state, Event event, long sequenceNr) {
  return event instanceof BookingCompleted;
}
```

### Example 5: Snapshots

```scala
import akka.persistence.typed.SnapshotSelectionCriteria

EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRecovery(Recovery.withSnapshotSelectionCriteria(SnapshotSelectionCriteria.none))
```

### Example 6: Snapshots

```java
@Override
public Recovery recovery() {
  return Recovery.withSnapshotSelectionCriteria(SnapshotSelectionCriteria.none());
}
```

### Example 7: Snapshot deletion

```scala
import akka.persistence.typed.scaladsl.Effect

EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => state) // do something based on a particular state
  .snapshotWhen {
    case (state, BookingCompleted(_), sequenceNumber) => true
    case (state, event, sequenceNumber)               => false
  }
  .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100, keepNSnapshots = 2))
```

### Example 8: Snapshot deletion

```java
@Override // override retentionCriteria in EventSourcedBehavior
public RetentionCriteria retentionCriteria() {
  return RetentionCriteria.snapshotEvery(100, 2);
}
@Override // override shouldSnapshot in EventSourcedBehavior
public boolean shouldSnapshot(State state, Event event, long sequenceNr) {
  return event instanceof BookingCompleted;
}
```

### Example 9: Snapshot deletion

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100, keepNSnapshots = 2))
  .receiveSignal { // optionally respond to signals
    case (state, _: SnapshotFailed)        => // react to failure
    case (state, _: DeleteSnapshotsFailed) => // react to failure
  }
```

### Example 10: Snapshot deletion

```java
@Override
public SignalHandler<State> signalHandler() {
  return newSignalHandlerBuilder()
      .onSignal(
          SnapshotFailed.class,
          (state, completed) -> {
            throw new RuntimeException("TODO: add some on-snapshot-failed side-effect here");
          })
      .onSignal(
          DeleteSnapshotsFailed.class,
          (state, completed) -> {
            throw new RuntimeException(
                "TODO: add some on-delete-snapshot-failed side-effect here");
          })
      .onSignal(
          DeleteEventsFailed.class,
          (state, completed) -> {
            throw new RuntimeException(
                "TODO: add some on-delete-snapshot-failed side-effect here");
          })
      .build();
}
```

### Example 11: Event deletion

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100, keepNSnapshots = 2).withDeleteEventsOnSnapshot)
  .receiveSignal { // optionally respond to signals
    case (state, _: SnapshotFailed)        => // react to failure
    case (state, _: DeleteSnapshotsFailed) => // react to failure
    case (state, _: DeleteEventsFailed)    => // react to failure
  }
```

### Example 12: Event deletion

```java
@Override // override retentionCriteria in EventSourcedBehavior
public RetentionCriteria retentionCriteria() {
  return RetentionCriteria.snapshotEvery(100, 2).withDeleteEventsOnSnapshot();
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.8/persistence.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/persistence-style.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/persistence-testing.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/persistence.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.8/typed/persistence-snapshot.html](https://doc.akka.io/libraries/akka-core/2.8/typed/persistence-snapshot.html)*
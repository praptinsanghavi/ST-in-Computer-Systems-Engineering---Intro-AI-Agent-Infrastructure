---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-db-transport.html
title: Replicated Event Sourcing replication via direct access to replica databases
  • Akka core
---

# Replicated Event Sourcing replication via direct access to replica databases • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Replicated Event Sourcing replication via direct access to replica databases

Note
Since Akka 2\.8\.0 a gRPC based transport is the recommended way to set up the replication of events between the replicas.

It is possible to consume events with a direct connection to the database backing each replica. Such a setup is generally harder to set up and secure, and is less feasible unless the replication is over a private network.

To enable an entity for Replicated Event Sourcing let it extend `ReplicatedEventSourcedBehavior` instead of `EventSourcedBehavior` and use the factory methods on `akka.persistence.typed.scaladsl.ReplicatedEventSourcing``akka.persistence.typed.javadsl.ReplicatedEventSourcing`. 

All replicas need to be known up front:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedEventSourcingCompileOnlySpec.scala#L19-L21 "Go to snippet source")val DCA = ReplicaId("DC-A")
val DCB = ReplicaId("DC-B")
val AllReplicas = Set(DCA, DCB)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/MyReplicatedBehavior.java#L29-L33 "Go to snippet source")public static final ReplicaId DCA = new ReplicaId("DCA");
public static final ReplicaId DCB = new ReplicaId("DCB");

public static final Set<ReplicaId> ALL_REPLICAS =
    Collections.unmodifiableSet(new HashSet<>(Arrays.asList(DCA, DCB)));
```

Then to enable replication create the event sourced behavior with the factory method:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedEventSourcingCompileOnlySpec.scala#L48-L58 "Go to snippet source")def apply(
    system: ActorSystem[_],
    entityId: String,
    replicaId: ReplicaId): EventSourcedBehavior[Command, State, Event] = {
  ReplicatedEventSourcing.perReplicaJournalConfig(
    ReplicationId("MyReplicatedEntity", entityId, replicaId),
    Map(DCA -> "journalForDCA", DCB -> "journalForDCB")) { replicationContext =>
    EventSourcedBehavior[Command, State, Event](???, ???, ???, ???)
  }
}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/MyReplicatedBehavior.java#L18-L61 "Go to snippet source")public class MyReplicatedBehavior
    extends ReplicatedEventSourcedBehavior<
        MyReplicatedBehavior.Command, MyReplicatedBehavior.Event, MyReplicatedBehavior.State> {
  public static Behavior<Command> create(String entityId, ReplicaId replicaId) {
    Map<ReplicaId, String> allReplicasAndQueryPlugins = new HashMap<>();
    allReplicasAndQueryPlugins.put(DCA, "journalForDCA");
    allReplicasAndQueryPlugins.put(DCB, "journalForDCB");

    return ReplicatedEventSourcing.perReplicaJournalConfig(
        new ReplicationId("MyReplicatedEntity", entityId, replicaId),
        allReplicasAndQueryPlugins,
        MyReplicatedBehavior::new);
  }

  private MyReplicatedBehavior(ReplicationContext replicationContext) {
    super(replicationContext);
  }
```

The factory takes in:

- `entityId`: this will be used as part of the underlying persistenceId
- `replicaId`: Which replica this instance is
- `allReplicasAndQueryPlugins`: All Replicas and the query plugin used to read their events
- A factory function to create an instance of the `EventSourcedBehavior``ReplicatedEventSourcedBehavior`

In this scenario each replica reads from each other’s database effectively providing cross region replication for any database that has an Akka Persistence plugin. Alternatively if all the replicas use the same journal, e.g. for testing or if it is a distributed database such as Cassandra, the `withSharedJournal` factory can be used. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedEventSourcingCompileOnlySpec.scala#L32-L42 "Go to snippet source")def apply(
    system: ActorSystem[_],
    entityId: String,
    replicaId: ReplicaId): EventSourcedBehavior[Command, State, Event] = {
  ReplicatedEventSourcing.commonJournalConfig(
    ReplicationId("MyReplicatedEntity", entityId, replicaId),
    AllReplicas,
    queryPluginId) { replicationContext =>
    EventSourcedBehavior[Command, State, Event](???, ???, ???, ???)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/MyReplicatedBehavior.java#L37-L44 "Go to snippet source")public static Behavior<Command> create(
    String entityId, ReplicaId replicaId, String queryPluginId) {
  return ReplicatedEventSourcing.commonJournalConfig(
      new ReplicationId("MyReplicatedEntity", entityId, replicaId),
      ALL_REPLICAS,
      queryPluginId,
      MyReplicatedBehavior::new);
}
```

The function passed to both factory methods return an `EventSourcedBehavior` and provide access to the [`ReplicationContext`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html "akka.persistence.typed.javadsl.ReplicationContext")[`ReplicationContext`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html "akka.persistence.typed.scaladsl.ReplicationContext") that has the following methods:

- `entityId`
- `replicaId`
- `allReplicas`
- `persistenceId` \- to provide to the `EventSourcedBehavior` factory. This **must be used**.

As well as methods that **can only be** used in the event handler. The values these methods return relate to the event that is being processed.

The function passed to both factory methods is invoked with a special [`ReplicationContext`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html "akka.persistence.typed.javadsl.ReplicationContext")[`ReplicationContext`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html "akka.persistence.typed.scaladsl.ReplicationContext") that needs to be passed to the concrete `ReplicatedEventSourcedBehavior` and on to the super constructor.

The context gives access to: 

- `entityId`
- `replicaId`
- `allReplicas`
- `persistenceId`

As well as methods that **can only be** used in the event handler, accessed through `getReplicationContext`. The values these methods return relate to the event that is being processed.

- `origin`: The ReplicaId that originally created the event
- `concurrent`: Whether the event was concurrent with another event as in the second diagram above
- `recoveryRunning`: Whether a recovery is running. Can be used to send commands back to self for side effects that should only happen once.
- `currentTimeMillis`: similar to `System.currentTimeMillis` but guaranteed never to go backwards

The factory returns a `Behavior` that can be spawned like any other behavior.

## Sharded Replicated Event Sourced entities

There are two ways to integrate replicated event sourced entities with sharding:

- Ensure that each replica has a unique entity id by using the replica id as part of the entity id
- Use roles to run a full copy of sharding per replica

To simplify, the [`ReplicatedShardingExtension`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension.html "akka.cluster.sharding.typed.ReplicatedShardingExtension")[`ReplicatedShardingExtension`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension.html "akka.cluster.sharding.typed.ReplicatedShardingExtension") is available from the `akka-cluster-sharding-typed` module.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ReplicatedShardingCompileOnlySpec.scala#L31-L39 "Go to snippet source")ReplicatedEntityProvider[Command]("MyEntityType", Set(ReplicaId("DC-A"), ReplicaId("DC-B"))) {
  (entityTypeKey, replicaId) =>
    ReplicatedEntity(replicaId, Entity(entityTypeKey) { entityContext =>
      // the sharding entity id contains the business entityId, entityType, and replica id
      // which you'll need to create a ReplicatedEventSourcedBehavior
      val replicationId = ReplicationId.fromString(entityContext.entityId)
      MyEventSourcedBehavior(replicationId)
    })
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ReplicatedShardingCompileOnlySpec.java#L33-L45 "Go to snippet source")return ReplicatedEntityProvider.create(
    Command.class,
    "MyReplicatedType",
    ALL_REPLICAS,
    (entityTypeKey, replicaId) ->
        ReplicatedEntity.create(
            replicaId,
            Entity.of(
                entityTypeKey,
                entityContext ->
                    myEventSourcedBehavior(
                        ReplicationId.fromString(entityContext.getEntityId())))));

```

This will run an instance of sharding and per replica and each entity id contains the replica id and the type name. Replicas could be on the same node if they end up in the same shard or if the shards get allocated to the same node.

To prevent this roles can be used. You could for instance add a cluster role per availability zone / rack and have a replica per rack.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ReplicatedShardingCompileOnlySpec.scala#L49-L52 "Go to snippet source")val provider = ReplicatedEntityProvider.perRole("MyEntityType", Set(ReplicaId("DC-A"), ReplicaId("DC-B"))) {
  replicationId =>
    MyEventSourcedBehavior(replicationId)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ReplicatedShardingCompileOnlySpec.java#L70-L83 "Go to snippet source")return ReplicatedEntityProvider.create(
    Command.class,
    "MyReplicatedType",
    ALL_REPLICAS,
    (entityTypeKey, replicaId) ->
        ReplicatedEntity.create(
            replicaId,
            Entity.of(
                    entityTypeKey,
                    entityContext ->
                        myEventSourcedBehavior(
                            ReplicationId.fromString(entityContext.getEntityId())))
                .withRole(replicaId.id())));

```

Regardless of which replication strategy you use sending messages to the replicated entities is the same.

`init` returns an [`ReplicatedSharding`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html "akka.cluster.sharding.typed.ReplicatedSharding")[`ReplicatedSharding`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html "akka.cluster.sharding.typed.ReplicatedSharding") instance which gives access to [`EntityRef`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityRef.html "akka.cluster.sharding.typed.javadsl.EntityRef")[`EntityRef`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html "akka.cluster.sharding.typed.scaladsl.EntityRef")s for each of the replicas for arbitrary routing logic:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ReplicatedShardingCompileOnlySpec.scala#L56-L59 "Go to snippet source")val myReplicatedSharding: ReplicatedSharding[Command] =
  ReplicatedShardingExtension(system).init(provider)

val entityRefs: Map[ReplicaId, EntityRef[Command]] = myReplicatedSharding.entityRefsFor("myEntityId")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ReplicatedShardingCompileOnlySpec.java#L89-L94 "Go to snippet source")ReplicatedShardingExtension extension = ReplicatedShardingExtension.get(system);

ReplicatedSharding<Command> replicatedSharding = extension.init(provider());

Map<ReplicaId, EntityRef<Command>> myEntityId =
    replicatedSharding.getEntityRefsFor("myEntityId");
```

More advanced routing among the replicas is currently left as an exercise for the reader (or may be covered in a future release [\#29281](https://github.com/akka/akka-core/issues/29281), [\#29319](https://github.com/akka/akka-core/issues/29319)).

## Direct Replication of Events

Each replica will read the events from all the other copies from the database. When used with Cluster Sharding, and to make the sharing of events with other replicas more efficient, each replica publishes the events across the Akka cluster directly to other replicas. The delivery of events across the cluster is not guaranteed so the query to the journal is still needed but can be configured to poll the database less often since most events will arrive at the replicas through the cluster.

The direct replication of events feature is enabled by default when using Cluster Sharding. To disable this feature you first need to:

1. disable event publishing on the `EventSourcedBehavior` with `withEventPublishing(false)`overriding `withEventPublishing` from `ReplicatedEventSourcedBehavior` to return `false` , and then
2. disable direct replication through `withDirectReplication(false)` on [`ReplicatedEntityProvider`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html "akka.cluster.sharding.typed.ReplicatedEntityProvider")[`ReplicatedEntityProvider`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html "akka.cluster.sharding.typed.ReplicatedEntityProvider")

The “event publishing” feature publishes each event to the local system event bus as a side effect after it has been written.

## Hot Standby

If all writes occur to one replica and the other replicas are not started there might be many replicated events to catch up with when they are later started. Therefore it can be good to activate all replicas when there is some activity.

This can be achieved automatically when direct access to replica databases and `ReplicatedSharding` is used and direct replication of events is enabled as described in [Direct Replication of Events](replicated-eventsourcing-db-transport.html#direct-replication-of-events). When each written event is forwarded to the other replicas it will trigger them to start if they are not already started.

## Examples

More examples can be found in [Replicated Event Sourcing Examples](replicated-eventsourcing-examples.html)

## Journal Support

For a journal plugin to support replication it needs to store and read metadata for each event if it is defined in the `metadata` field. To attach the metadata after writing it, `PersistentRepr.withMetadata` is used. The [`JournalSpec`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalSpec.html "akka.persistence.journal.JournalSpec")[`JournalSpec`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalSpec.html "akka.persistence.journal.JournalSpec") in the Persistence TCK provides a capability flag `supportsMetadata` to toggle verification that metadata is handled correctly.

For a snapshot plugin to support replication it needs to store and read metadata for the snapshot if it is defined in the `metadata` field. To attach the metadata when reading the snapshot the `akka.persistence.SnapshotMetadata.apply` factory overload taking a `metadata` parameter is used. The [`SnapshotStoreSpec`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/SnapshotStoreSpec.html "akka.persistence.snapshot.SnapshotStoreSpec")[`SnapshotStoreSpec`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/snapshot/SnapshotStoreSpec.html "akka.persistence.snapshot.SnapshotStoreSpec") in the Persistence TCK provides a capability flag `supportsMetadata` to toggle verification that metadata is handled correctly.

The following plugins support Replicated Event Sourcing:

- [Akka Persistence Cassandra](https://doc.akka.io/libraries/akka-persistence-cassandra/current/index.html) versions 1\.0\.3\+
- [Akka Persistence R2DBC](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/) versions 1\.0\.0\+
- [Akka Persistence JDBC](https://doc.akka.io/libraries/akka-persistence-jdbc/current) versions 5\.0\.0\+

## Code Examples

### Example 1: Replicated Event Sourcing replication via direct access to replica databases

```scala
val DCA = ReplicaId("DC-A")
val DCB = ReplicaId("DC-B")
val AllReplicas = Set(DCA, DCB)
```

### Example 2: Replicated Event Sourcing replication via direct access to replica databases

```java
public static final ReplicaId DCA = new ReplicaId("DCA");
public static final ReplicaId DCB = new ReplicaId("DCB");

public static final Set<ReplicaId> ALL_REPLICAS =
    Collections.unmodifiableSet(new HashSet<>(Arrays.asList(DCA, DCB)));
```

### Example 3: Replicated Event Sourcing replication via direct access to replica databases

```scala
def apply(
    system: ActorSystem[_],
    entityId: String,
    replicaId: ReplicaId): EventSourcedBehavior[Command, State, Event] = {
  ReplicatedEventSourcing.perReplicaJournalConfig(
    ReplicationId("MyReplicatedEntity", entityId, replicaId),
    Map(DCA -> "journalForDCA", DCB -> "journalForDCB")) { replicationContext =>
    EventSourcedBehavior[Command, State, Event](???, ???, ???, ???)
  }
}
```

### Example 4: Replicated Event Sourcing replication via direct access to replica databases

```java
public class MyReplicatedBehavior
    extends ReplicatedEventSourcedBehavior<
        MyReplicatedBehavior.Command, MyReplicatedBehavior.Event, MyReplicatedBehavior.State> {
  public static Behavior<Command> create(String entityId, ReplicaId replicaId) {
    Map<ReplicaId, String> allReplicasAndQueryPlugins = new HashMap<>();
    allReplicasAndQueryPlugins.put(DCA, "journalForDCA");
    allReplicasAndQueryPlugins.put(DCB, "journalForDCB");

    return ReplicatedEventSourcing.perReplicaJournalConfig(
        new ReplicationId("MyReplicatedEntity", entityId, replicaId),
        allReplicasAndQueryPlugins,
        MyReplicatedBehavior::new);
  }

  private MyReplicatedBehavior(ReplicationContext replicationContext) {
    super(replicationContext);
  }
```

### Example 5: Replicated Event Sourcing replication via direct access to replica databases

```scala
def apply(
    system: ActorSystem[_],
    entityId: String,
    replicaId: ReplicaId): EventSourcedBehavior[Command, State, Event] = {
  ReplicatedEventSourcing.commonJournalConfig(
    ReplicationId("MyReplicatedEntity", entityId, replicaId),
    AllReplicas,
    queryPluginId) { replicationContext =>
    EventSourcedBehavior[Command, State, Event](???, ???, ???, ???)
  }
}
```

### Example 6: Replicated Event Sourcing replication via direct access to replica databases

```java
public static Behavior<Command> create(
    String entityId, ReplicaId replicaId, String queryPluginId) {
  return ReplicatedEventSourcing.commonJournalConfig(
      new ReplicationId("MyReplicatedEntity", entityId, replicaId),
      ALL_REPLICAS,
      queryPluginId,
      MyReplicatedBehavior::new);
}
```

### Example 7: Sharded Replicated Event Sourced entities

```scala
ReplicatedEntityProvider[Command]("MyEntityType", Set(ReplicaId("DC-A"), ReplicaId("DC-B"))) {
  (entityTypeKey, replicaId) =>
    ReplicatedEntity(replicaId, Entity(entityTypeKey) { entityContext =>
      // the sharding entity id contains the business entityId, entityType, and replica id
      // which you'll need to create a ReplicatedEventSourcedBehavior
      val replicationId = ReplicationId.fromString(entityContext.entityId)
      MyEventSourcedBehavior(replicationId)
    })
}
```

### Example 8: Sharded Replicated Event Sourced entities

```java
return ReplicatedEntityProvider.create(
    Command.class,
    "MyReplicatedType",
    ALL_REPLICAS,
    (entityTypeKey, replicaId) ->
        ReplicatedEntity.create(
            replicaId,
            Entity.of(
                entityTypeKey,
                entityContext ->
                    myEventSourcedBehavior(
                        ReplicationId.fromString(entityContext.getEntityId())))));
```

### Example 9: Sharded Replicated Event Sourced entities

```scala
val provider = ReplicatedEntityProvider.perRole("MyEntityType", Set(ReplicaId("DC-A"), ReplicaId("DC-B"))) {
  replicationId =>
    MyEventSourcedBehavior(replicationId)
}
```

### Example 10: Sharded Replicated Event Sourced entities

```java
return ReplicatedEntityProvider.create(
    Command.class,
    "MyReplicatedType",
    ALL_REPLICAS,
    (entityTypeKey, replicaId) ->
        ReplicatedEntity.create(
            replicaId,
            Entity.of(
                    entityTypeKey,
                    entityContext ->
                        myEventSourcedBehavior(
                            ReplicationId.fromString(entityContext.getEntityId())))
                .withRole(replicaId.id())));
```

### Example 11: Sharded Replicated Event Sourced entities

```scala
val myReplicatedSharding: ReplicatedSharding[Command] =
  ReplicatedShardingExtension(system).init(provider)

val entityRefs: Map[ReplicaId, EntityRef[Command]] = myReplicatedSharding.entityRefsFor("myEntityId")
```

### Example 12: Sharded Replicated Event Sourced entities

```java
ReplicatedShardingExtension extension = ReplicatedShardingExtension.get(system);

ReplicatedSharding<Command> replicatedSharding = extension.init(provider());

Map<ReplicaId, EntityRef<Command>> myEntityId =
    replicatedSharding.getEntityRefsFor("myEntityId");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/SnapshotStoreSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/snapshot/SnapshotStoreSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/libraries/akka-core/current/persistence-journals.html
- https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-db-transport.html
- https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-examples.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/index.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-db-transport.html](https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-db-transport.html)*
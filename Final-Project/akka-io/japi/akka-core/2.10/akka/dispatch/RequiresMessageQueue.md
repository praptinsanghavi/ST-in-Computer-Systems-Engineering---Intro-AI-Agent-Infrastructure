---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:30:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
title: RequiresMessageQueue
---

# RequiresMessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Interface RequiresMessageQueue\<T\>

- All Known Subinterfaces:
`[AbstractPersistentActorLike](../persistence/AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AsyncWriteProxy](../persistence/journal/AsyncWriteProxy.html "interface in akka.persistence.journal")`, `[AtLeastOnceDelivery](../persistence/AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](../persistence/AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](../persistence/Eventsourced.html "interface in akka.persistence")`, `[PersistenceStash](../persistence/PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../persistence/PersistentActor.html "interface in akka.persistence")`, `[Stash](../actor/Stash.html "interface in akka.actor")`, `[UnboundedStash](../actor/UnboundedStash.html "interface in akka.actor")`

All Known Implementing Classes:
`[AbstractActorWithStash](../actor/AbstractActorWithStash.html "class in akka.actor")`, `[AbstractActorWithUnboundedStash](../actor/AbstractActorWithUnboundedStash.html "class in akka.actor")`, `[AbstractFSMWithStash](../actor/AbstractFSMWithStash.html "class in akka.actor")`, `[AbstractPersistentActor](../persistence/AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](../persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](../persistence/AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[JavaLogger](../event/jul/JavaLogger.html "class in akka.event.jul")`, `[JournalPerfSpec.BenchActor](../persistence/journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")`, `[PersistencePluginProxy](../persistence/journal/PersistencePluginProxy.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`, `[Player.Waiter](../remote/testconductor/Player.Waiter.html "class in akka.remote.testconductor")`, `[SimpleDnsManager](../io/SimpleDnsManager.html "class in akka.io")`, `[Slf4jLogger](../event/slf4j/Slf4jLogger.html "class in akka.event.slf4j")`, `[TestEventListener](../testkit/TestEventListener.html "class in akka.testkit")`

---

```
public interface RequiresMessageQueue<T>
```

Trait to signal that an Actor requires a certain type of message queue semantics.
 
 The mailbox type will be looked up by mapping the type T via akka.actor.mailbox.requirements in the config,
 to a mailbox configuration. If no mailbox is assigned on Props or in deployment config then this one will be used.
 

 The queue type of the created mailbox will be checked against the type T and actor creation will fail if it doesn't
 fulfill the requirements.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/UnboundedStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.DefaultLogger.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/jul/JavaLogger.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsManager.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player.Waiter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestEventListener.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html)*
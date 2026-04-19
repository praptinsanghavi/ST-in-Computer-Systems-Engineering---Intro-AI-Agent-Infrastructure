---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:25:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogging.html
title: ActorLogging
---

# ActorLogging

## Content

Package [akka.actor](package-summary.html)
## Interface ActorLogging

- All Known Subinterfaces:
`[AsyncWriteProxy](../persistence/journal/AsyncWriteProxy.html "interface in akka.persistence.journal")`, `[FSM](FSM.html "interface in akka.actor")<S,​D>`, `[LeveldbCompaction](../persistence/journal/leveldb/LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbStore](../persistence/journal/leveldb/LeveldbStore.html "interface in akka.persistence.journal.leveldb")`, `[LoggingFSM](LoggingFSM.html "interface in akka.actor")<S,​D>`, `[SnapshotStore](../persistence/snapshot/SnapshotStore.html "interface in akka.persistence.snapshot")`

All Known Implementing Classes:
`[AbstractFSM](AbstractFSM.html "class in akka.actor")`, `[AbstractFSMWithStash](AbstractFSMWithStash.html "class in akka.actor")`, `[AbstractLoggingActor](AbstractLoggingActor.html "class in akka.actor")`, `[AbstractLoggingFSM](AbstractLoggingFSM.html "class in akka.actor")`, `[ClusterSingletonManager](../cluster/singleton/ClusterSingletonManager.html "class in akka.cluster.singleton")`, `[ClusterSingletonProxy](../cluster/singleton/ClusterSingletonProxy.html "class in akka.cluster.singleton")`, `[DistributedPubSubMediator](../cluster/pubsub/DistributedPubSubMediator.html "class in akka.cluster.pubsub")`, `[InetAddressDnsResolver](../io/InetAddressDnsResolver.html "class in akka.io")`, `[JournalPerfSpec.BenchActor](../persistence/journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[LmdbDurableStore](../cluster/ddata/LmdbDurableStore.html "class in akka.cluster.ddata")`, `[NoSnapshotStore](../persistence/snapshot/NoSnapshotStore.html "class in akka.persistence.snapshot")`, `[PersistencePluginProxy](../persistence/journal/PersistencePluginProxy.html "class in akka.persistence.journal")`, `[PersistenceTestKitPlugin](../persistence/testkit/PersistenceTestKitPlugin.html "class in akka.persistence.testkit")`, `[PersistenceTestKitSnapshotPlugin](../persistence/testkit/PersistenceTestKitSnapshotPlugin.html "class in akka.persistence.testkit")`, `[RemoveInternalClusterShardingData](../cluster/sharding/RemoveInternalClusterShardingData.html "class in akka.cluster.sharding")`, `[Replicator](../cluster/ddata/Replicator.html "class in akka.cluster.ddata")`, `[SharedLeveldbStore](../persistence/journal/leveldb/SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`, `[SimpleDnsManager](../io/SimpleDnsManager.html "class in akka.io")`, `[SnapshotStore](../persistence/snapshot/japi/SnapshotStore.html "class in akka.persistence.snapshot.japi")`

---

```
public interface ActorLogging
```

Scala API: Mix in ActorLogging into your Actor to easily obtain a reference to a logger,
 which is available under the name "log".
 

```

 class MyActor extends Actor with ActorLogging {
   def receive = {
     case "pigdog" => log.info("We've got yet another pigdog on our hands")
   }
 }
 
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_log_$eq](#_log_$eq(akka.event.LoggingAdapter))​([LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") x$1)` |  |
	| `[LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event")` | `[log](#log())()` |  |

- - ### Method Detail
	
	
	
		- #### \_log\_$eq
		
		
		
		```
		void _log_$eq​([LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") x$1)
		```
		- #### log
		
		
		
		```
		[LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log()
		```

## Code Examples

### Example 1: Interface ActorLogging

```text
class MyActor extends Actor with ActorLogging {
   def receive = {
     case "pigdog" => log.info("We've got yet another pigdog on our hands")
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractFSM.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/LoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LmdbDurableStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsManager.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbCompaction.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/snapshot/NoSnapshotStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/snapshot/SnapshotStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/snapshot/japi/SnapshotStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogging.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogging.html)*
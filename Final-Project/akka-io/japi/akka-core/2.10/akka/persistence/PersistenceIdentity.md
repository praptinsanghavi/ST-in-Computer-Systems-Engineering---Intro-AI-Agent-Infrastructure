---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceIdentity.html
title: PersistenceIdentity
---

# PersistenceIdentity

## Content

Package [akka.persistence](package-summary.html)
## Interface PersistenceIdentity

- All Known Subinterfaces:
`[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AtLeastOnceDelivery](AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistentActor](PersistentActor.html "interface in akka.persistence")`

All Known Implementing Classes:
`[AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[JournalPerfSpec.BenchActor](journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface PersistenceIdentity
```

Identification of [`PersistentActor`](PersistentActor.html "interface in akka.persistence").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[journalPluginId](#journalPluginId())()` | Configuration id of the journal plugin servicing this persistent actor. |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` | Id of the persistent entity for which messages should be replayed. |
	| `java.lang.String` | `[snapshotPluginId](#snapshotPluginId())()` | Configuration id of the snapshot plugin servicing this persistent actor. |

- - ### Method Detail
	
	
	
		- #### journalPluginId
		
		
		
		```
		java.lang.String journalPluginId()
		```
		
		Configuration id of the journal plugin servicing this persistent actor.
		 When empty, looks in `akka.persistence.journal.plugin` to find configuration entry path.
		 When configured, uses `journalPluginId` as absolute path to the journal configuration entry.
		 Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.
		- #### persistenceId
		
		
		
		```
		java.lang.String persistenceId()
		```
		
		Id of the persistent entity for which messages should be replayed.
		- #### snapshotPluginId
		
		
		
		```
		java.lang.String snapshotPluginId()
		```
		
		Configuration id of the snapshot plugin servicing this persistent actor.
		 When empty, looks in `akka.persistence.snapshot-store.plugin` to find configuration entry path.
		 When configured, uses `snapshotPluginId` as absolute path to the snapshot store configuration entry.
		 Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceIdentity.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceIdentity.html)*
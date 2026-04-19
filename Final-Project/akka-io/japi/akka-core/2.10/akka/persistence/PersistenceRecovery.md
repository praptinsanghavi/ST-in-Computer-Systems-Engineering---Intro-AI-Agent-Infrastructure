---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceRecovery.html
title: PersistenceRecovery
---

# PersistenceRecovery

## Content

Package [akka.persistence](package-summary.html)
## Interface PersistenceRecovery

- All Known Subinterfaces:
`[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AtLeastOnceDelivery](AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistentActor](PersistentActor.html "interface in akka.persistence")`

All Known Implementing Classes:
`[AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[JournalPerfSpec.BenchActor](journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface PersistenceRecovery
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[recovery](#recovery())()` | Called when the persistent actor is started for the first time. |

- - ### Method Detail
	
	
	
		- #### recovery
		
		
		
		```
		[Recovery](Recovery.html "class in akka.persistence") recovery()
		```
		
		Called when the persistent actor is started for the first time.
		 The returned [`Recovery`](Recovery.html "class in akka.persistence") object defines how the Actor will recover its persistent state before
		 handling the first incoming message.
		 
		 To skip recovery completely return `Recovery.none`.

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
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceRecovery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceRecovery.html)*
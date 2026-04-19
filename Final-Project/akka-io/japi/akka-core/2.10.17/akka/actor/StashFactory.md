---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashFactory.html
title: StashFactory
---

# StashFactory

## Content

Package [akka.actor](package-summary.html)
## Interface StashFactory

- All Known Subinterfaces:
`[AbstractPersistentActorLike](../persistence/AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AtLeastOnceDelivery](../persistence/AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](../persistence/AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](../persistence/Eventsourced.html "interface in akka.persistence")`, `[PersistenceStash](../persistence/PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../persistence/PersistentActor.html "interface in akka.persistence")`

All Known Implementing Classes:
`[AbstractPersistentActor](../persistence/AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](../persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](../persistence/AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[JournalPerfSpec.BenchActor](../persistence/journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface StashFactory
```

INTERNAL API.
 
 A factory for creating stashes for an actor instance.
 

See Also:
[`StashSupport`](StashSupport.html "interface in akka.actor")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[StashSupport](StashSupport.html "interface in akka.actor")` | `[createStash](#createStash(akka.actor.ActorContext,akka.actor.ActorRef))​([ActorContext](ActorContext.html "interface in akka.actor") ctx,  [ActorRef](ActorRef.html "class in akka.actor") ref)` |  |

- - ### Method Detail
	
	
	
		- #### createStash
		
		
		
		```
		[StashSupport](StashSupport.html "interface in akka.actor") createStash​([ActorContext](ActorContext.html "interface in akka.actor") ctx,
		                         [ActorRef](ActorRef.html "class in akka.actor") ref)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/JournalPerfSpec.BenchActor.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashFactory.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashFactory.html)*
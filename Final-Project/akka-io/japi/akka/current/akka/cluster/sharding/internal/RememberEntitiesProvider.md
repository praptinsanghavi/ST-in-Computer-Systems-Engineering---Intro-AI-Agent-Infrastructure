---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesProvider.html
title: RememberEntitiesProvider
---

# RememberEntitiesProvider

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Interface RememberEntitiesProvider

- ---

```
public interface RememberEntitiesProvider
```

INTERNAL API
 
 Created once for the shard guardian

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../../actor/Props.html "class in akka.actor")` | `[coordinatorStoreProps](#coordinatorStoreProps())()` | Called once per started shard coordinator to create the remember entities coordinator store. |
	| `[Props](../../../actor/Props.html "class in akka.actor")` | `[shardStoreProps](#shardStoreProps(java.lang.String))​(java.lang.String shardId)` | Called once per started shard to create the remember entities shard store |

- - ### Method Detail
	
	
	
		- #### coordinatorStoreProps
		
		
		
		```
		[Props](../../../actor/Props.html "class in akka.actor") coordinatorStoreProps()
		```
		
		Called once per started shard coordinator to create the remember entities coordinator store.
		 
		 Note that this is not used for the deprecated persistent coordinator which has its own impl for keeping track of
		 remembered shards.
		 
		
		
		
		Returns:
		an actor that handles the protocol defined in [`RememberEntitiesCoordinatorStore`](RememberEntitiesCoordinatorStore.html "class in akka.cluster.sharding.internal")
		- #### shardStoreProps
		
		
		
		```
		[Props](../../../actor/Props.html "class in akka.actor") shardStoreProps​(java.lang.String shardId)
		```
		
		Called once per started shard to create the remember entities shard store
		
		Returns:
		an actor that handles the protocol defined in [`RememberEntitiesShardStore`](RememberEntitiesShardStore.html "class in akka.cluster.sharding.internal")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesProvider.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesProvider.html)*
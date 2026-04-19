---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.html
title: RememberEntitiesCoordinatorStore
---

# RememberEntitiesCoordinatorStore

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class RememberEntitiesCoordinatorStore

- java.lang.Object
- - akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore

- ---

```
public class RememberEntitiesCoordinatorStore
extends java.lang.Object
```

INTERNAL API
 
 Could potentially become an open SPI in the future.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[RememberEntitiesCoordinatorStore.AddShard](RememberEntitiesCoordinatorStore.AddShard.html "class in akka.cluster.sharding.internal")` | Sent once for every started shard (but could be retried), should result in a response of either  UpdateDone or UpdateFailed |
	| `static class` | `[RememberEntitiesCoordinatorStore.AddShard$](RememberEntitiesCoordinatorStore.AddShard$.html "class in akka.cluster.sharding.internal")` |  |
	| `static interface` | `[RememberEntitiesCoordinatorStore.Command](RememberEntitiesCoordinatorStore.Command.html "interface in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesCoordinatorStore.GetShards$](RememberEntitiesCoordinatorStore.GetShards$.html "class in akka.cluster.sharding.internal")` | Sent once when the coordinator starts (but could be retried), should result in a response of  RememberedShards |
	| `static class` | `[RememberEntitiesCoordinatorStore.RememberedShards](RememberEntitiesCoordinatorStore.RememberedShards.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesCoordinatorStore.RememberedShards$](RememberEntitiesCoordinatorStore.RememberedShards$.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesCoordinatorStore.UpdateDone](RememberEntitiesCoordinatorStore.UpdateDone.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesCoordinatorStore.UpdateDone$](RememberEntitiesCoordinatorStore.UpdateDone$.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesCoordinatorStore.UpdateFailed](RememberEntitiesCoordinatorStore.UpdateFailed.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesCoordinatorStore.UpdateFailed$](RememberEntitiesCoordinatorStore.UpdateFailed$.html "class in akka.cluster.sharding.internal")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RememberEntitiesCoordinatorStore](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RememberEntitiesCoordinatorStore
		
		
		
		```
		public RememberEntitiesCoordinatorStore()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.AddShard$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.AddShard.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.GetShards$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.RememberedShards$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.RememberedShards.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateDone$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateDone.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateFailed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.html)*
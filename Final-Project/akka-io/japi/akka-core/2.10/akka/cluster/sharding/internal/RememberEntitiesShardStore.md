---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.html
title: RememberEntitiesShardStore
---

# RememberEntitiesShardStore

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class RememberEntitiesShardStore

- java.lang.Object
- - akka.cluster.sharding.internal.RememberEntitiesShardStore

- ---

```
public class RememberEntitiesShardStore
extends java.lang.Object
```

INTERNAL API
 
 Could potentially become an open SPI in the future.
 

 Implementations are responsible for each of the methods failing the returned future after a timeout.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[RememberEntitiesShardStore.Command](RememberEntitiesShardStore.Command.html "interface in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesShardStore.GetEntities$](RememberEntitiesShardStore.GetEntities$.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesShardStore.RememberedEntities](RememberEntitiesShardStore.RememberedEntities.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesShardStore.RememberedEntities$](RememberEntitiesShardStore.RememberedEntities$.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesShardStore.Update](RememberEntitiesShardStore.Update.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesShardStore.Update$](RememberEntitiesShardStore.Update$.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")` |  |
	| `static class` | `[RememberEntitiesShardStore.UpdateDone$](RememberEntitiesShardStore.UpdateDone$.html "class in akka.cluster.sharding.internal")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RememberEntitiesShardStore](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RememberEntitiesShardStore
		
		
		
		```
		public RememberEntitiesShardStore()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.GetEntities$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.RememberedEntities$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.RememberedEntities.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.Update$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.Update.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/internal/RememberEntitiesShardStore.html)*
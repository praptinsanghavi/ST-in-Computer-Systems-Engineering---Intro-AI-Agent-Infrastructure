---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PruningState.html
title: PruningState
---

# PruningState

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface PruningState

- All Known Implementing Classes:
`[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")`, `[PruningState.PruningPerformed](PruningState.PruningPerformed.html "class in akka.cluster.ddata")`

---

```
public interface PruningState
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[PruningState.PruningInitialized$](PruningState.PruningInitialized$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[PruningState.PruningPerformed](PruningState.PruningPerformed.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[PruningState.PruningPerformed$](PruningState.PruningPerformed$.html "class in akka.cluster.ddata")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[PruningState](PruningState.html "interface in akka.cluster.ddata")` | `[addSeen](#addSeen(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") node)` |  |
	| `int` | `[estimatedSize](#estimatedSize())()` |  |
	| `[PruningState](PruningState.html "interface in akka.cluster.ddata")` | `[merge](#merge(akka.cluster.ddata.PruningState))​([PruningState](PruningState.html "interface in akka.cluster.ddata") that)` |  |

- - ### Method Detail
	
	
	
		- #### merge
		
		
		
		```
		[PruningState](PruningState.html "interface in akka.cluster.ddata") merge​([PruningState](PruningState.html "interface in akka.cluster.ddata") that)
		```
		- #### addSeen
		
		
		
		```
		[PruningState](PruningState.html "interface in akka.cluster.ddata") addSeen​([Address](../../actor/Address.html "class in akka.actor") node)
		```
		- #### estimatedSize
		
		
		
		```
		int estimatedSize()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PruningState.PruningInitialized$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PruningState.PruningInitialized.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PruningState.PruningPerformed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PruningState.PruningPerformed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PruningState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PruningState.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PruningState.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.ZeroTag.html
title: ORMap.ZeroTag
---

# ORMap.ZeroTag

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface ORMap.ZeroTag

- All Known Implementing Classes:
`[LWWMap.LWWMapTag$](LWWMap.LWWMapTag$.html "class in akka.cluster.ddata")`, `[ORMap.VanillaORMapTag$](ORMap.VanillaORMapTag$.html "class in akka.cluster.ddata")`, `[ORMultiMap.ORMultiMapTag$](ORMultiMap.ORMultiMapTag$.html "class in akka.cluster.ddata")`, `[ORMultiMap.ORMultiMapWithValueDeltasTag$](ORMultiMap.ORMultiMapWithValueDeltasTag$.html "class in akka.cluster.ddata")`, `[PNCounterMap.PNCounterMapTag$](PNCounterMap.PNCounterMapTag$.html "class in akka.cluster.ddata")`

Enclosing class:
[ORMap](ORMap.html "class in akka.cluster.ddata")\<[A](ORMap.html "type parameter in ORMap"),​[B](ORMap.html "type parameter in ORMap") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\>

---

```
public static interface ORMap.ZeroTag
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[value](#value())()` |  |
	| `[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")` | `[zero](#zero())()` |  |

- - ### Method Detail
	
	
	
		- #### value
		
		
		
		```
		int value()
		```
		- #### zero
		
		
		
		```
		[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata") zero()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMap.LWWMapTag$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.VanillaORMapTag$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap.ORMultiMapTag$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap.ORMultiMapWithValueDeltasTag$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMap.PNCounterMapTag$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.ZeroTag.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.ZeroTag.html)*
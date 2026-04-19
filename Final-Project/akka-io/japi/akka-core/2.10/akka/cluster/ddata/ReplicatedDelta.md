---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDelta.html
title: ReplicatedDelta
---

# ReplicatedDelta

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface ReplicatedDelta

- All Superinterfaces:
`[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`

All Known Subinterfaces:
`[ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata")`, `[ORSet.DeltaOp](ORSet.DeltaOp.html "interface in akka.cluster.ddata")`, `[RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "interface in akka.cluster.ddata")`

All Known Implementing Classes:
`[GCounter](GCounter.html "class in akka.cluster.ddata")`, `[GSet](GSet.html "class in akka.cluster.ddata")`, `[PNCounter](PNCounter.html "class in akka.cluster.ddata")`

---

```
public interface ReplicatedDelta
extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
```

The delta must implement this type.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")` | `[zero](#zero())()` | The empty full state. |
	
	
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Method Detail
	
	
	
		- #### zero
		
		
		
		```
		[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata") zero()
		```
		
		The empty full state. This is used when a delta is received
		 and no existing full state exists on the receiving side. Then
		 the delta is merged into the `zero` to create the initial full state.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.DeltaOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.DeltaOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/RequiresCausalDeliveryOfDeltas.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDelta.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDelta.html)*
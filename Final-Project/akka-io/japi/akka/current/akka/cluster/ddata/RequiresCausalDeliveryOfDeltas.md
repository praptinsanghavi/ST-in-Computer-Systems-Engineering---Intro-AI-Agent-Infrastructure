---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:59:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/RequiresCausalDeliveryOfDeltas.html
title: RequiresCausalDeliveryOfDeltas
---

# RequiresCausalDeliveryOfDeltas

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface RequiresCausalDeliveryOfDeltas

- All Superinterfaces:
`[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")`

All Known Subinterfaces:
`[ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata")`, `[ORSet.DeltaOp](ORSet.DeltaOp.html "interface in akka.cluster.ddata")`

---

```
public interface RequiresCausalDeliveryOfDeltas
extends [ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")
```

Marker that specifies that the deltas must be applied in causal order.
 There is some overhead of managing the causal delivery so it should only
 be used for types that need it.
 
 Note that if the full state type `T` is different from the delta type `D`
 it is the delta `D` that should be marked with this.

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")
		
		
		`[zero](ReplicatedDelta.html#zero())`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORMap.DeltaOp.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORSet.DeltaOp.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedDelta.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/RequiresCausalDeliveryOfDeltas.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/RequiresCausalDeliveryOfDeltas.html)*
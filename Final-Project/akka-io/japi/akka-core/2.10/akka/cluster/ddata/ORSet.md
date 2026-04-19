---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.DeltaOp.html
title: ORSet.DeltaOp
---

# ORSet.DeltaOp

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface ORSet.DeltaOp

- All Superinterfaces:
`[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")`, `[RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "interface in akka.cluster.ddata")`, `java.io.Serializable`

Enclosing class:
[ORSet](ORSet.html "class in akka.cluster.ddata")\<[A](ORSet.html "type parameter in ORSet")\>

---

```
public static interface ORSet.DeltaOp
extends [ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata"), [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "interface in akka.cluster.ddata"), [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")
```

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")
		
		
		`[zero](ReplicatedDelta.html#zero())`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDelta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/RequiresCausalDeliveryOfDeltas.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.DeltaOp.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.DeltaOp.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html
title: DeltaReplicatedData
---

# DeltaReplicatedData

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface DeltaReplicatedData

- All Superinterfaces:
`[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`

All Known Implementing Classes:
`[AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "class in akka.cluster.ddata")`, `[GCounter](GCounter.html "class in akka.cluster.ddata")`, `[GSet](GSet.html "class in akka.cluster.ddata")`, `[LWWMap](LWWMap.html "class in akka.cluster.ddata")`, `[ORMap](ORMap.html "class in akka.cluster.ddata")`, `[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")`, `[ORSet](ORSet.html "class in akka.cluster.ddata")`, `[PNCounter](PNCounter.html "class in akka.cluster.ddata")`, `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")`

---

```
public interface DeltaReplicatedData
extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
```

[`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata") with additional support for delta\-CRDT replication.
 delta\-CRDT is a way to reduce the need for sending the full state
 for updates. For example adding element 'c' and 'd' to set {'a', 'b'} would
 result in sending the delta {'c', 'd'} and merge that with the state on the
 receiving side, resulting in set {'a', 'b', 'c', 'd'}.
 
 Learn more about this in the paper
 [Delta State Replicated Data Types](https://arxiv.org/abs/1603.01529).

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")>` | `[delta](#delta())()` | The accumulated delta of mutator operations since previous  [`resetDelta()`](#resetDelta()). |
	| `[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")` | `[mergeDelta](#mergeDelta(akka.cluster.ddata.DeltaReplicatedData))​([DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata") thatDelta)` | When delta is merged into the full state this method is used. |
	| `[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")` | `[resetDelta](#resetDelta())()` | Reset collection of deltas from mutator operations. |
	
	
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Method Detail
	
	
	
		- #### delta
		
		
		
		```
		scala.Option<[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")> delta()
		```
		
		The accumulated delta of mutator operations since previous
		 [`resetDelta()`](#resetDelta()). When the `Replicator` invokes the `modify` function
		 of the `Update` message and the user code is invoking one or more mutator
		 operations the data is collecting the delta of the operations and makes
		 it available for the `Replicator` with the [`delta()`](#delta()) accessor. The
		 `modify` function shall still return the full state in the same way as
		 `ReplicatedData` without support for deltas.
		- #### mergeDelta
		
		
		
		```
		[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata") mergeDelta​([DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata") thatDelta)
		```
		
		When delta is merged into the full state this method is used.
		 When the type `D` of the delta is of the same type as the full state `T`
		 this method can be implemented by delegating to `merge`.
		- #### resetDelta
		
		
		
		```
		[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata") resetDelta()
		```
		
		Reset collection of deltas from mutator operations. When the `Replicator`
		 invokes the `modify` function of the `Update` message the delta is always
		 "reset" and when the user code is invoking one or more mutator operations the
		 data is collecting the delta of the operations and makes it available for
		 the `Replicator` with the [`delta()`](#delta()) accessor. When the `Replicator` has
		 grabbed the `delta` it will invoke this method to get a clean data instance
		 without the delta.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDelta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:59:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
title: ReplicatedData
---

# ReplicatedData

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface ReplicatedData

- All Known Subinterfaces:
`[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")`, `[ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata")`, `[ORSet.DeltaOp](ORSet.DeltaOp.html "interface in akka.cluster.ddata")`, `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`, `[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")`, `[RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "interface in akka.cluster.ddata")`

All Known Implementing Classes:
`[AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "class in akka.cluster.ddata")`, `[AbstractReplicatedData](AbstractReplicatedData.html "class in akka.cluster.ddata")`, `[Flag](Flag.html "class in akka.cluster.ddata")`, `[GCounter](GCounter.html "class in akka.cluster.ddata")`, `[GSet](GSet.html "class in akka.cluster.ddata")`, `[LWWMap](LWWMap.html "class in akka.cluster.ddata")`, `[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")`, `[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")`, `[OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata")`, `[ORMap](ORMap.html "class in akka.cluster.ddata")`, `[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")`, `[ORSet](ORSet.html "class in akka.cluster.ddata")`, `[PNCounter](PNCounter.html "class in akka.cluster.ddata")`, `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")`, `[Replicator.Internal$.DeletedData$](Replicator.Internal$.DeletedData$.html "class in akka.cluster.ddata")`, `[VersionVector](VersionVector.html "class in akka.cluster.ddata")`

---

```
public interface ReplicatedData
```

Interface for implementing a state based convergent
 replicated data type (CvRDT).
 
 ReplicatedData types must be serializable with an Akka
 Serializer. It is highly recommended to implement a serializer with
 Protobuf or similar. The built in data types are marked with
 [`ReplicatedDataSerialization`](ReplicatedDataSerialization.html "interface in akka.cluster.ddata") and serialized with
 [`ReplicatedDataSerializer`](protobuf/ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf").
 

 Serialization of the data types are used in remote messages and also
 for creating message digests (SHA\-1\) to detect changes. Therefore it is
 important that the serialization produce the same bytes for the same content.
 For example sets and maps should be sorted deterministically in the serialization.
 

 ReplicatedData types should be immutable, i.e. "modifying" methods should return
 a new instance.
 

 Implement the additional methods of [`DeltaReplicatedData`](DeltaReplicatedData.html "interface in akka.cluster.ddata") if
 it has support for delta\-CRDT replication.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")` | `[merge](#merge(akka.cluster.ddata.ReplicatedData))​([ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") that)` | Monotonic merge function. |

- - ### Method Detail
	
	
	
		- #### merge
		
		
		
		```
		[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") merge​([ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") that)
		```
		
		Monotonic merge function.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORMap.DeltaOp.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORSet.DeltaOp.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/OneVersionVector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/RemovedNodePruning.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedDelta.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.Internal$.DeletedData$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/RequiresCausalDeliveryOfDeltas.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDataSerialization.html
title: ReplicatedDataSerialization
---

# ReplicatedDataSerialization

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface ReplicatedDataSerialization

- All Superinterfaces:
`java.io.Serializable`

All Known Subinterfaces:
`[ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata")`, `[ORSet.DeltaOp](ORSet.DeltaOp.html "interface in akka.cluster.ddata")`

All Known Implementing Classes:
`[Flag](Flag.html "class in akka.cluster.ddata")`, `[FlagKey](FlagKey.html "class in akka.cluster.ddata")`, `[GCounter](GCounter.html "class in akka.cluster.ddata")`, `[GCounterKey](GCounterKey.html "class in akka.cluster.ddata")`, `[GSet](GSet.html "class in akka.cluster.ddata")`, `[GSetKey](GSetKey.html "class in akka.cluster.ddata")`, `[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")`, `[LWWMap](LWWMap.html "class in akka.cluster.ddata")`, `[LWWMapKey](LWWMapKey.html "class in akka.cluster.ddata")`, `[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")`, `[LWWRegisterKey](LWWRegisterKey.html "class in akka.cluster.ddata")`, `[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")`, `[OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata")`, `[ORMap](ORMap.html "class in akka.cluster.ddata")`, `[ORMapKey](ORMapKey.html "class in akka.cluster.ddata")`, `[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")`, `[ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")`, `[ORSet](ORSet.html "class in akka.cluster.ddata")`, `[ORSetKey](ORSetKey.html "class in akka.cluster.ddata")`, `[PNCounter](PNCounter.html "class in akka.cluster.ddata")`, `[PNCounterKey](PNCounterKey.html "class in akka.cluster.ddata")`, `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")`, `[PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")`, `[Replicator.Internal$.DeletedData$](Replicator.Internal$.DeletedData$.html "class in akka.cluster.ddata")`, `[VersionVector](VersionVector.html "class in akka.cluster.ddata")`

---

```
public interface ReplicatedDataSerialization
extends java.io.Serializable
```

Marker trait for `ReplicatedData` serialized by
 [`ReplicatedDataSerializer`](protobuf/ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.DeltaOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.DeltaOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSetKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/OneVersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Internal$.DeletedData$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDataSerialization.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDataSerialization.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/RemovedNodePruning.html
title: RemovedNodePruning
---

# RemovedNodePruning

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface RemovedNodePruning

- All Superinterfaces:
`[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`

All Known Implementing Classes:
`[GCounter](GCounter.html "class in akka.cluster.ddata")`, `[LWWMap](LWWMap.html "class in akka.cluster.ddata")`, `[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")`, `[OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata")`, `[ORMap](ORMap.html "class in akka.cluster.ddata")`, `[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")`, `[ORSet](ORSet.html "class in akka.cluster.ddata")`, `[PNCounter](PNCounter.html "class in akka.cluster.ddata")`, `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")`, `[VersionVector](VersionVector.html "class in akka.cluster.ddata")`

---

```
public interface RemovedNodePruning
extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
```

[`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata") that has support for pruning of data
 belonging to a specific node may implement this interface.
 When a node is removed from the cluster these methods will be
 used by the [`Replicator`](Replicator.html "class in akka.cluster.ddata") to collapse data from the removed node
 into some other node in the cluster.
 
 See process description in the 'CRDT Garbage' section of the [`Replicator`](Replicator.html "class in akka.cluster.ddata")
 documentation.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[modifiedByNodes](#modifiedByNodes())()` | The nodes that have changed the state for this data  and would need pruning when such node is no longer part  of the cluster. |
	| `boolean` | `[needPruningFrom](#needPruningFrom(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)` | Does it have any state changes from a specific node,  which has been removed from the cluster. |
	| `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")` | `[prune](#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode,  [UniqueAddress](../UniqueAddress.html "class in akka.cluster") collapseInto)` | When the `removed` node has been removed from the cluster the state  changes from that node will be pruned by collapsing the data entries  to another node. |
	| `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")` | `[pruningCleanup](#pruningCleanup(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)` | Remove data entries from a node that has been removed from the cluster  and already been pruned. |
	
	
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Method Detail
	
	
	
		- #### modifiedByNodes
		
		
		
		```
		scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> modifiedByNodes()
		```
		
		The nodes that have changed the state for this data
		 and would need pruning when such node is no longer part
		 of the cluster.
		- #### needPruningFrom
		
		
		
		```
		boolean needPruningFrom​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)
		```
		
		Does it have any state changes from a specific node,
		 which has been removed from the cluster.
		- #### prune
		
		
		
		```
		[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata") prune​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode,
		                         [UniqueAddress](../UniqueAddress.html "class in akka.cluster") collapseInto)
		```
		
		When the `removed` node has been removed from the cluster the state
		 changes from that node will be pruned by collapsing the data entries
		 to another node.
		- #### pruningCleanup
		
		
		
		```
		[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata") pruningCleanup​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)
		```
		
		Remove data entries from a node that has been removed from the cluster
		 and already been pruned.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/OneVersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/RemovedNodePruning.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/RemovedNodePruning.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/RemovedNodePruning.html)*
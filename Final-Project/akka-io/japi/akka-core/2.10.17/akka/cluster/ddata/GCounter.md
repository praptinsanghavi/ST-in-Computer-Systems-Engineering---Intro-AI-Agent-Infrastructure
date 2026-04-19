---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/GCounter.html
title: GCounter
---

# GCounter

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class GCounter

- java.lang.Object
- - akka.cluster.ddata.GCounter

- All Implemented Interfaces:
`[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")`, `[FastMerge](FastMerge.html "interface in akka.cluster.ddata")`, `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`, `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")`, `java.io.Serializable`

---

```
public final class GCounter
extends java.lang.Object
implements [DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata"), [ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata"), [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata"), [RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata"), [FastMerge](FastMerge.html "interface in akka.cluster.ddata")
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.GCounter)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[$colon$plus](#$colon$plus(long,akka.cluster.ddata.SelfUniqueAddress))​(long n,  [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node)` | Increment the counter with the delta `n` specified. |
	| `static [GCounter](GCounter.html "class in akka.cluster.ddata")` | `[apply](#apply())()` |  |
	| `static [GCounter](GCounter.html "class in akka.cluster.ddata")` | `[create](#create())()` | Java API |
	| `scala.Option<[GCounter](GCounter.html "class in akka.cluster.ddata")>` | `[delta](#delta())()` | The accumulated delta of mutator operations since previous  [`DeltaReplicatedData.resetDelta()`](DeltaReplicatedData.html#resetDelta()). |
	| `static [GCounter](GCounter.html "class in akka.cluster.ddata")` | `[empty](#empty())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object o)` |  |
	| `java.math.BigInteger` | `[getValue](#getValue())()` | Java API: Current total value of the counter. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[increment](#increment(akka.cluster.ddata.SelfUniqueAddress,long))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  long n)` | Increment the counter with the delta `n` specified. |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[merge](#merge(akka.cluster.ddata.GCounter))​([GCounter](GCounter.html "class in akka.cluster.ddata") that)` |  |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[mergeDelta](#mergeDelta(akka.cluster.ddata.GCounter))​([GCounter](GCounter.html "class in akka.cluster.ddata") thatDelta)` |  |
	| `scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[modifiedByNodes](#modifiedByNodes())()` | The nodes that have changed the state for this data  and would need pruning when such node is no longer part  of the cluster. |
	| `boolean` | `[needPruningFrom](#needPruningFrom(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)` | Does it have any state changes from a specific node,  which has been removed from the cluster. |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[prune](#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode,  [UniqueAddress](../UniqueAddress.html "class in akka.cluster") collapseInto)` | When the `removed` node has been removed from the cluster the state  changes from that node will be pruned by collapsing the data entries  to another node. |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[pruningCleanup](#pruningCleanup(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)` | Remove data entries from a node that has been removed from the cluster  and already been pruned. |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[resetDelta](#resetDelta())()` | Reset collection of deltas from mutator operations. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.math.BigInt>` | `[unapply](#unapply(akka.cluster.ddata.GCounter))​([GCounter](GCounter.html "class in akka.cluster.ddata") c)` | Extract the [`value()`](#value()). |
	| `scala.math.BigInt` | `[value](#value())()` | Scala API: Current total value of the counter. |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[zero](#zero())()` | The empty full state. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.ddata.[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[mergeDelta](DeltaReplicatedData.html#mergeDelta(akka.cluster.ddata.DeltaReplicatedData))`
		- ### Methods inherited from interface akka.cluster.ddata.[FastMerge](FastMerge.html "interface in akka.cluster.ddata")
		
		
		`[ancestor_$eq](FastMerge.html#ancestor_$eq(akka.cluster.ddata.FastMerge)), [assignAncestor](FastMerge.html#assignAncestor(akka.cluster.ddata.ReplicatedData.T)), [clearAncestor](FastMerge.html#clearAncestor()), [isAncestorOf](FastMerge.html#isAncestorOf(akka.cluster.ddata.ReplicatedData.T))`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static [GCounter](GCounter.html "class in akka.cluster.ddata") empty()
		```
		- #### apply
		
		
		
		```
		public static [GCounter](GCounter.html "class in akka.cluster.ddata") apply()
		```
		- #### create
		
		
		
		```
		public static [GCounter](GCounter.html "class in akka.cluster.ddata") create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.math.BigInt> unapply​([GCounter](GCounter.html "class in akka.cluster.ddata") c)
		```
		
		Extract the [`value()`](#value()).
		- #### delta
		
		
		
		```
		public scala.Option<[GCounter](GCounter.html "class in akka.cluster.ddata")> delta()
		```
		
		Description copied from interface: `[DeltaReplicatedData](DeltaReplicatedData.html#delta())`
		The accumulated delta of mutator operations since previous
		 [`DeltaReplicatedData.resetDelta()`](DeltaReplicatedData.html#resetDelta()). When the `Replicator` invokes the `modify` function
		 of the `Update` message and the user code is invoking one or more mutator
		 operations the data is collecting the delta of the operations and makes
		 it available for the `Replicator` with the [`DeltaReplicatedData.delta()`](DeltaReplicatedData.html#delta()) accessor. The
		 `modify` function shall still return the full state in the same way as
		 `ReplicatedData` without support for deltas.
		
		Specified by:
		`[delta](DeltaReplicatedData.html#delta())` in interface `[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")`
		- #### value
		
		
		
		```
		public scala.math.BigInt value()
		```
		
		Scala API: Current total value of the counter.
		- #### getValue
		
		
		
		```
		public java.math.BigInteger getValue()
		```
		
		Java API: Current total value of the counter.
		- #### $colon$plus
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") $colon$plus​(long n,
		                            [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node)
		```
		
		Increment the counter with the delta `n` specified.
		 The delta must be zero or positive.
		- #### increment
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") increment​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                          long n)
		```
		
		Increment the counter with the delta `n` specified.
		 The delta `n` must be zero or positive.
		- #### merge
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") merge​([GCounter](GCounter.html "class in akka.cluster.ddata") that)
		```
		- #### mergeDelta
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") mergeDelta​([GCounter](GCounter.html "class in akka.cluster.ddata") thatDelta)
		```
		- #### zero
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") zero()
		```
		
		Description copied from interface: `[ReplicatedDelta](ReplicatedDelta.html#zero())`
		The empty full state. This is used when a delta is received
		 and no existing full state exists on the receiving side. Then
		 the delta is merged into the `zero` to create the initial full state.
		
		Specified by:
		`[zero](ReplicatedDelta.html#zero())` in interface `[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")`
		- #### resetDelta
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") resetDelta()
		```
		
		Description copied from interface: `[DeltaReplicatedData](DeltaReplicatedData.html#resetDelta())`
		Reset collection of deltas from mutator operations. When the `Replicator`
		 invokes the `modify` function of the `Update` message the delta is always
		 "reset" and when the user code is invoking one or more mutator operations the
		 data is collecting the delta of the operations and makes it available for
		 the `Replicator` with the [`DeltaReplicatedData.delta()`](DeltaReplicatedData.html#delta()) accessor. When the `Replicator` has
		 grabbed the `delta` it will invoke this method to get a clean data instance
		 without the delta.
		
		Specified by:
		`[resetDelta](DeltaReplicatedData.html#resetDelta())` in interface `[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")`
		- #### modifiedByNodes
		
		
		
		```
		public scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> modifiedByNodes()
		```
		
		Description copied from interface: `[RemovedNodePruning](RemovedNodePruning.html#modifiedByNodes())`
		The nodes that have changed the state for this data
		 and would need pruning when such node is no longer part
		 of the cluster.
		
		Specified by:
		`[modifiedByNodes](RemovedNodePruning.html#modifiedByNodes())` in interface `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`
		- #### needPruningFrom
		
		
		
		```
		public boolean needPruningFrom​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)
		```
		
		Description copied from interface: `[RemovedNodePruning](RemovedNodePruning.html#needPruningFrom(akka.cluster.UniqueAddress))`
		Does it have any state changes from a specific node,
		 which has been removed from the cluster.
		
		Specified by:
		`[needPruningFrom](RemovedNodePruning.html#needPruningFrom(akka.cluster.UniqueAddress))` in interface `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`
		- #### prune
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") prune​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode,
		                      [UniqueAddress](../UniqueAddress.html "class in akka.cluster") collapseInto)
		```
		
		Description copied from interface: `[RemovedNodePruning](RemovedNodePruning.html#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))`
		When the `removed` node has been removed from the cluster the state
		 changes from that node will be pruned by collapsing the data entries
		 to another node.
		
		Specified by:
		`[prune](RemovedNodePruning.html#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))` in interface `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`
		- #### pruningCleanup
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") pruningCleanup​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)
		```
		
		Description copied from interface: `[RemovedNodePruning](RemovedNodePruning.html#pruningCleanup(akka.cluster.UniqueAddress))`
		Remove data entries from a node that has been removed from the cluster
		 and already been pruned.
		
		Specified by:
		`[pruningCleanup](RemovedNodePruning.html#pruningCleanup(akka.cluster.UniqueAddress))` in interface `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object o)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FastMerge.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/RemovedNodePruning.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedDelta.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/GCounter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/GCounter.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:32:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap.html
title: PNCounterMap
---

# PNCounterMap

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class PNCounterMap\<A\>

- java.lang.Object
- - akka.cluster.ddata.PNCounterMap\<A\>

- All Implemented Interfaces:
`[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")`, `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`, `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `java.io.Serializable`

---

```
public final class PNCounterMap<A>
extends java.lang.Object
implements [DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata"), [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata"), [RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")
```

Map of named counters. Specialized [`ORMap`](ORMap.html "class in akka.cluster.ddata") with [`PNCounter`](PNCounter.html "class in akka.cluster.ddata") values.
 
 This class is immutable, i.e. "modifying" methods return a new instance.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.PNCounterMap)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[PNCounterMap.PNCounterMapTag$](PNCounterMap.PNCounterMapTag$.html "class in akka.cluster.ddata")` | INTERNAL API |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>` | `[apply](#apply())()` |  |
	| `boolean` | `[contains](#contains(A))​([A](PNCounterMap.html "type parameter in PNCounterMap") key)` |  |
	| `static <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>` | `[create](#create())()` | Java API |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[decrement](#decrement(akka.cluster.ddata.SelfUniqueAddress,A,long))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  [A](PNCounterMap.html "type parameter in PNCounterMap") key,  long delta)` | Decrement the counter with the delta specified. |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[decrementBy](#decrementBy(A,long,akka.cluster.ddata.SelfUniqueAddress))​([A](PNCounterMap.html "type parameter in PNCounterMap") key,  long delta,  [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node)` | Decrement the counter with the delta specified. |
	| `long` | `[decrementBy$default$2](#decrementBy$default$2())()` |  |
	| `scala.Option<[ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata")>` | `[delta](#delta())()` | The accumulated delta of mutator operations since previous  [`DeltaReplicatedData.resetDelta()`](DeltaReplicatedData.html#resetDelta()). |
	| `static <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>` | `[empty](#empty())()` |  |
	| `scala.collection.immutable.Map<[A](PNCounterMap.html "type parameter in PNCounterMap"),​scala.math.BigInt>` | `[entries](#entries())()` | Scala API |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object o)` |  |
	| `scala.Option<scala.math.BigInt>` | `[get](#get(A))​([A](PNCounterMap.html "type parameter in PNCounterMap") key)` | Scala API: The count for a key |
	| `java.util.Map<[A](PNCounterMap.html "type parameter in PNCounterMap"),​java.math.BigInteger>` | `[getEntries](#getEntries())()` | Java API |
	| `java.math.BigInteger` | `[getValue](#getValue(A))​([A](PNCounterMap.html "type parameter in PNCounterMap") key)` | Java API: The count for a key, or `null` if it doesn't exist |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[increment](#increment(akka.cluster.ddata.SelfUniqueAddress,A,long))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  [A](PNCounterMap.html "type parameter in PNCounterMap") key,  long delta)` | Increment the counter with the delta specified. |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[increment](#increment(A,long,akka.cluster.Cluster))​([A](PNCounterMap.html "type parameter in PNCounterMap") key,  long delta,  [Cluster](../Cluster.html "class in akka.cluster") node)` | Increment the counter with the delta specified. |
	| `long` | `[increment$default$2](#increment$default$2())()` |  |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[incrementBy](#incrementBy(A,long,akka.cluster.ddata.SelfUniqueAddress))​([A](PNCounterMap.html "type parameter in PNCounterMap") key,  long delta,  [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node)` | Increment the counter with the delta specified. |
	| `boolean` | `[isEmpty](#isEmpty())()` |  |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[merge](#merge(akka.cluster.ddata.PNCounterMap))​([PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> that)` |  |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[mergeDelta](#mergeDelta(akka.cluster.ddata.ORMap.DeltaOp))​([ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata") thatDelta)` |  |
	| `scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[modifiedByNodes](#modifiedByNodes())()` | The nodes that have changed the state for this data  and would need pruning when such node is no longer part  of the cluster. |
	| `boolean` | `[needPruningFrom](#needPruningFrom(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)` | Does it have any state changes from a specific node,  which has been removed from the cluster. |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[prune](#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode,  [UniqueAddress](../UniqueAddress.html "class in akka.cluster") collapseInto)` | When the `removed` node has been removed from the cluster the state  changes from that node will be pruned by collapsing the data entries  to another node. |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[pruningCleanup](#pruningCleanup(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)` | Remove data entries from a node that has been removed from the cluster  and already been pruned. |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[remove](#remove(A,akka.cluster.ddata.SelfUniqueAddress))​([A](PNCounterMap.html "type parameter in PNCounterMap") key,  [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node)` | Removes an entry from the map. |
	| `[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")>` | `[resetDelta](#resetDelta())()` | Reset collection of deltas from mutator operations. |
	| `int` | `[size](#size())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <A> scala.Option<scala.collection.immutable.Map<A,​scala.math.BigInt>>` | `[unapply](#unapply(akka.cluster.ddata.PNCounterMap))​([PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> m)` | Extract the [`entries()`](#entries()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.ddata.[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[mergeDelta](DeltaReplicatedData.html#mergeDelta(akka.cluster.ddata.DeltaReplicatedData))`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> empty()
		```
		- #### apply
		
		
		
		```
		public static <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> apply()
		```
		- #### create
		
		
		
		```
		public static <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public static <A> scala.Option<scala.collection.immutable.Map<A,​scala.math.BigInt>> unapply​([PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> m)
		```
		
		Extract the [`entries()`](#entries()).
		- #### entries
		
		
		
		```
		public scala.collection.immutable.Map<[A](PNCounterMap.html "type parameter in PNCounterMap"),​scala.math.BigInt> entries()
		```
		
		Scala API
		- #### getEntries
		
		
		
		```
		public java.util.Map<[A](PNCounterMap.html "type parameter in PNCounterMap"),​java.math.BigInteger> getEntries()
		```
		
		Java API
		- #### get
		
		
		
		```
		public scala.Option<scala.math.BigInt> get​([A](PNCounterMap.html "type parameter in PNCounterMap") key)
		```
		
		Scala API: The count for a key
		- #### getValue
		
		
		
		```
		public java.math.BigInteger getValue​([A](PNCounterMap.html "type parameter in PNCounterMap") key)
		```
		
		Java API: The count for a key, or `null` if it doesn't exist
		- #### contains
		
		
		
		```
		public boolean contains​([A](PNCounterMap.html "type parameter in PNCounterMap") key)
		```
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		- #### size
		
		
		
		```
		public int size()
		```
		- #### incrementBy
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> incrementBy​([A](PNCounterMap.html "type parameter in PNCounterMap") key,
		                                   long delta,
		                                   [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node)
		```
		
		Increment the counter with the delta specified.
		 If the delta is negative then it will decrement instead of increment.
		- #### increment
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> increment​([A](PNCounterMap.html "type parameter in PNCounterMap") key,
		                                 long delta,
		                                 [Cluster](../Cluster.html "class in akka.cluster") node)
		```
		
		Increment the counter with the delta specified.
		 If the delta is negative then it will decrement instead of increment.
		- #### increment
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> increment​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                 [A](PNCounterMap.html "type parameter in PNCounterMap") key,
		                                 long delta)
		```
		
		Increment the counter with the delta specified.
		 If the delta is negative then it will decrement instead of increment.
		- #### increment$default$2
		
		
		
		```
		public long increment$default$2()
		```
		- #### decrementBy
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> decrementBy​([A](PNCounterMap.html "type parameter in PNCounterMap") key,
		                                   long delta,
		                                   [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node)
		```
		
		Decrement the counter with the delta specified.
		 If the delta is negative then it will increment instead of decrement.
		 TODO add implicit after deprecated is EOL.
		- #### decrement
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> decrement​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                 [A](PNCounterMap.html "type parameter in PNCounterMap") key,
		                                 long delta)
		```
		
		Decrement the counter with the delta specified.
		 If the delta is negative then it will increment instead of decrement.
		 TODO add implicit after deprecated is EOL.
		- #### decrementBy$default$2
		
		
		
		```
		public long decrementBy$default$2()
		```
		- #### remove
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> remove​([A](PNCounterMap.html "type parameter in PNCounterMap") key,
		                              [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node)
		```
		
		Removes an entry from the map.
		 Note that if there is a conflicting update on another node the entry will
		 not be removed after merge.
		- #### merge
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> merge​([PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> that)
		```
		- #### resetDelta
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> resetDelta()
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
		- #### delta
		
		
		
		```
		public scala.Option<[ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata")> delta()
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
		- #### mergeDelta
		
		
		
		```
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> mergeDelta​([ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata") thatDelta)
		```
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
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> prune​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode,
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
		public [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<[A](PNCounterMap.html "type parameter in PNCounterMap")> pruningCleanup​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ORMap.DeltaOp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap.PNCounterMapTag$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/RemovedNodePruning.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/OneVersionVector.html
title: OneVersionVector
---

# OneVersionVector

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class OneVersionVector

- java.lang.Object
- - [akka.cluster.ddata.VersionVector](VersionVector.html "class in akka.cluster.ddata")
	- - akka.cluster.ddata.OneVersionVector

- All Implemented Interfaces:
`[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`, `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class OneVersionVector
extends [VersionVector](VersionVector.html "class in akka.cluster.ddata")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.OneVersionVector)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.cluster.ddata.[VersionVector](VersionVector.html "class in akka.cluster.ddata")
		
		
		`[VersionVector.After$](VersionVector.After$.html "class in akka.cluster.ddata"), [VersionVector.Before$](VersionVector.Before$.html "class in akka.cluster.ddata"), [VersionVector.Concurrent$](VersionVector.Concurrent$.html "class in akka.cluster.ddata"), [VersionVector.Ordering](VersionVector.Ordering.html "interface in akka.cluster.ddata"), [VersionVector.Same$](VersionVector.Same$.html "class in akka.cluster.ddata"), [VersionVector.Timestamp$](VersionVector.Timestamp$.html "class in akka.cluster.ddata")`

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata")` | `[apply](#apply(akka.cluster.UniqueAddress,long))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node,  long version)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata")` | `[copy](#copy(akka.cluster.UniqueAddress,long))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node,  long version)` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.cluster")` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isEmpty](#isEmpty())()` |  |
	| `[VersionVector](VersionVector.html "class in akka.cluster.ddata")` | `[merge](#merge(akka.cluster.ddata.VersionVector))​([VersionVector](VersionVector.html "class in akka.cluster.ddata") that)` | Merges this VersionVector with another VersionVector. |
	| `scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[modifiedByNodes](#modifiedByNodes())()` | The nodes that have changed the state for this data  and would need pruning when such node is no longer part  of the cluster. |
	| `boolean` | `[needPruningFrom](#needPruningFrom(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)` | Does it have any state changes from a specific node,  which has been removed from the cluster. |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.cluster")` | `[node](#node())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[VersionVector](VersionVector.html "class in akka.cluster.ddata")` | `[prune](#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode,  [UniqueAddress](../UniqueAddress.html "class in akka.cluster") collapseInto)` | When the `removed` node has been removed from the cluster the state  changes from that node will be pruned by collapsing the data entries  to another node. |
	| `[VersionVector](VersionVector.html "class in akka.cluster.ddata")` | `[pruningCleanup](#pruningCleanup(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)` | Remove data entries from a node that has been removed from the cluster  and already been pruned. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.ddata.OneVersionVector))​([OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata") x$0)` |  |
	| `long` | `[version](#version())()` |  |
	
	
		- ### Methods inherited from class akka.cluster.ddata.[VersionVector](VersionVector.html "class in akka.cluster.ddata")
		
		
		`[$colon$plus](VersionVector.html#$colon$plus(akka.cluster.ddata.SelfUniqueAddress)), [$eq$eq](VersionVector.html#$eq$eq(akka.cluster.ddata.VersionVector)), [$greater](VersionVector.html#$greater(akka.cluster.ddata.VersionVector)), [$less](VersionVector.html#$less(akka.cluster.ddata.VersionVector)), [$less$greater](VersionVector.html#$less$greater(akka.cluster.ddata.VersionVector)), [AfterInstance](VersionVector.html#AfterInstance()), [apply](VersionVector.html#apply()), [apply](VersionVector.html#apply(scala.collection.immutable.TreeMap)), [BeforeInstance](VersionVector.html#BeforeInstance()), [compareTo](VersionVector.html#compareTo(akka.cluster.ddata.VersionVector)), [ConcurrentInstance](VersionVector.html#ConcurrentInstance()), [create](VersionVector.html#create()), [empty](VersionVector.html#empty()), [increment](VersionVector.html#increment(akka.cluster.ddata.SelfUniqueAddress)), [SameInstance](VersionVector.html#SameInstance())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata") apply​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node,
		                                     long version)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>> unapply​([OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata") x$0)
		```
		- #### node
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.cluster") node()
		```
		- #### version
		
		
		
		```
		public long version()
		```
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		
		Specified by:
		`[isEmpty](VersionVector.html#isEmpty())` in class `[VersionVector](VersionVector.html "class in akka.cluster.ddata")`
		- #### merge
		
		
		
		```
		public [VersionVector](VersionVector.html "class in akka.cluster.ddata") merge​([VersionVector](VersionVector.html "class in akka.cluster.ddata") that)
		```
		
		Description copied from class: `[VersionVector](VersionVector.html#merge(akka.cluster.ddata.VersionVector))`
		Merges this VersionVector with another VersionVector. E.g. merges its versioned history.
		
		Specified by:
		`[merge](VersionVector.html#merge(akka.cluster.ddata.VersionVector))` in class `[VersionVector](VersionVector.html "class in akka.cluster.ddata")`
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
		Specified by:
		`[needPruningFrom](VersionVector.html#needPruningFrom(akka.cluster.UniqueAddress))` in class `[VersionVector](VersionVector.html "class in akka.cluster.ddata")`
		- #### prune
		
		
		
		```
		public [VersionVector](VersionVector.html "class in akka.cluster.ddata") prune​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode,
		                           [UniqueAddress](../UniqueAddress.html "class in akka.cluster") collapseInto)
		```
		
		Description copied from interface: `[RemovedNodePruning](RemovedNodePruning.html#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))`
		When the `removed` node has been removed from the cluster the state
		 changes from that node will be pruned by collapsing the data entries
		 to another node.
		
		Specified by:
		`[prune](RemovedNodePruning.html#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))` in interface `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`
		Specified by:
		`[prune](VersionVector.html#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress))` in class `[VersionVector](VersionVector.html "class in akka.cluster.ddata")`
		- #### pruningCleanup
		
		
		
		```
		public [VersionVector](VersionVector.html "class in akka.cluster.ddata") pruningCleanup​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") removedNode)
		```
		
		Description copied from interface: `[RemovedNodePruning](RemovedNodePruning.html#pruningCleanup(akka.cluster.UniqueAddress))`
		Remove data entries from a node that has been removed from the cluster
		 and already been pruned.
		
		Specified by:
		`[pruningCleanup](RemovedNodePruning.html#pruningCleanup(akka.cluster.UniqueAddress))` in interface `[RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata")`
		Specified by:
		`[pruningCleanup](VersionVector.html#pruningCleanup(akka.cluster.UniqueAddress))` in class `[VersionVector](VersionVector.html "class in akka.cluster.ddata")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata") copy​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node,
		                             long version)
		```
		- #### copy$default$1
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.cluster") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/OneVersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/RemovedNodePruning.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.After$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.Before$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.Concurrent$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.Ordering.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.Same$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.Timestamp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/OneVersionVector.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/OneVersionVector.html)*
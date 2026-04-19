---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/GSet.html
title: GSet
---

# GSet

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class GSet\<A\>

- java.lang.Object
- - akka.cluster.ddata.GSet\<A\>

- All Implemented Interfaces:
`[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")`, `[FastMerge](FastMerge.html "interface in akka.cluster.ddata")`, `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class GSet<A>
extends java.lang.Object
implements [DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata"), [ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata"), [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata"), [FastMerge](FastMerge.html "interface in akka.cluster.ddata"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.GSet)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GSet](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>` | `[$plus](#$plus(A))​([A](GSet.html "type parameter in GSet") element)` | Adds an element to the set |
	| `[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>` | `[add](#add(A))​([A](GSet.html "type parameter in GSet") element)` | Adds an element to the set |
	| `static [GSet](GSet.html "class in akka.cluster.ddata")<java.lang.Object>` | `[apply](#apply())()` |  |
	| `static <A> [GSet](GSet.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(scala.collection.immutable.Set,scala.Option))​(scala.collection.immutable.Set<A> elements,  scala.Option<[GSet](GSet.html "class in akka.cluster.ddata")<A>> delta)` | Implements a 'Add Set' CRDT, also called a 'G\-Set'. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `boolean` | `[contains](#contains(A))​([A](GSet.html "type parameter in GSet") a)` |  |
	| `[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>` | `[copy](#copy(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[A](GSet.html "type parameter in GSet")> e)` |  |
	| `static <A> [GSet](GSet.html "class in akka.cluster.ddata")<A>` | `[create](#create())()` | Java API |
	| `scala.Option<[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>>` | `[delta](#delta())()` | The accumulated delta of mutator operations since previous  [`DeltaReplicatedData.resetDelta()`](DeltaReplicatedData.html#resetDelta()). |
	| `scala.collection.immutable.Set<[A](GSet.html "type parameter in GSet")>` | `[elements](#elements())()` |  |
	| `static <A> [GSet](GSet.html "class in akka.cluster.ddata")<A>` | `[empty](#empty())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.util.Set<[A](GSet.html "type parameter in GSet")>` | `[getElements](#getElements())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isEmpty](#isEmpty())()` |  |
	| `[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>` | `[merge](#merge(akka.cluster.ddata.GSet))​([GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> that)` |  |
	| `[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>` | `[mergeDelta](#mergeDelta(akka.cluster.ddata.GSet))​([GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> thatDelta)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>` | `[resetDelta](#resetDelta())()` | Reset collection of deltas from mutator operations. |
	| `int` | `[size](#size())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <A> scala.Option<scala.collection.immutable.Set<A>>` | `[unapply](#unapply(akka.cluster.ddata.GSet))​([GSet](GSet.html "class in akka.cluster.ddata")<A> x$0)` |  |
	| `[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>` | `[zero](#zero())()` | The empty full state. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.ddata.[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[mergeDelta](DeltaReplicatedData.html#mergeDelta(akka.cluster.ddata.DeltaReplicatedData))`
		- ### Methods inherited from interface akka.cluster.ddata.[FastMerge](FastMerge.html "interface in akka.cluster.ddata")
		
		
		`[ancestor_$eq](FastMerge.html#ancestor_$eq(akka.cluster.ddata.FastMerge)), [assignAncestor](FastMerge.html#assignAncestor(akka.cluster.ddata.ReplicatedData.T)), [clearAncestor](FastMerge.html#clearAncestor()), [isAncestorOf](FastMerge.html#isAncestorOf(akka.cluster.ddata.ReplicatedData.T))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Constructor Detail
	
	
	
		- #### GSet
		
		
		
		```
		public GSet()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static <A> [GSet](GSet.html "class in akka.cluster.ddata")<A> empty()
		```
		- #### apply
		
		
		
		```
		public static [GSet](GSet.html "class in akka.cluster.ddata")<java.lang.Object> apply()
		```
		- #### create
		
		
		
		```
		public static <A> [GSet](GSet.html "class in akka.cluster.ddata")<A> create()
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static <A> [GSet](GSet.html "class in akka.cluster.ddata")<A> apply​(scala.collection.immutable.Set<A> elements,
		                                scala.Option<[GSet](GSet.html "class in akka.cluster.ddata")<A>> delta)
		```
		
		Implements a 'Add Set' CRDT, also called a 'G\-Set'. You can't
		 remove elements of a G\-Set.
		 
		 It is described in the paper
		 [A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).
		 
		
		
		 A G\-Set doesn't accumulate any garbage apart from the elements themselves.
		 
		
		
		 This class is immutable, i.e. "modifying" methods return a new instance.
		- #### unapply
		
		
		
		```
		public static <A> scala.Option<scala.collection.immutable.Set<A>> unapply​([GSet](GSet.html "class in akka.cluster.ddata")<A> x$0)
		```
		- #### elements
		
		
		
		```
		public scala.collection.immutable.Set<[A](GSet.html "type parameter in GSet")> elements()
		```
		- #### delta
		
		
		
		```
		public scala.Option<[GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")>> delta()
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
		- #### getElements
		
		
		
		```
		public java.util.Set<[A](GSet.html "type parameter in GSet")> getElements()
		```
		
		Java API
		- #### contains
		
		
		
		```
		public boolean contains​([A](GSet.html "type parameter in GSet") a)
		```
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		- #### size
		
		
		
		```
		public int size()
		```
		- #### $plus
		
		
		
		```
		public [GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> $plus​([A](GSet.html "type parameter in GSet") element)
		```
		
		Adds an element to the set
		- #### add
		
		
		
		```
		public [GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> add​([A](GSet.html "type parameter in GSet") element)
		```
		
		Adds an element to the set
		- #### merge
		
		
		
		```
		public [GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> merge​([GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> that)
		```
		- #### mergeDelta
		
		
		
		```
		public [GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> mergeDelta​([GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> thatDelta)
		```
		- #### zero
		
		
		
		```
		public [GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> zero()
		```
		
		Description copied from interface: `[ReplicatedDelta](ReplicatedDelta.html#zero())`
		The empty full state. This is used when a delta is received
		 and no existing full state exists on the receiving side. Then
		 the delta is merged into the `zero` to create the initial full state.
		
		Specified by:
		`[zero](ReplicatedDelta.html#zero())` in interface `[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")`
		- #### resetDelta
		
		
		
		```
		public [GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> resetDelta()
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
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [GSet](GSet.html "class in akka.cluster.ddata")<[A](GSet.html "type parameter in GSet")> copy​(scala.collection.immutable.Set<[A](GSet.html "type parameter in GSet")> e)
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FastMerge.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedDelta.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/GSet.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/GSet.html)*
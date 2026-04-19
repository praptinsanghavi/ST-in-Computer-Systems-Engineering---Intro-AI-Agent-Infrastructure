---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:59:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html
title: AbstractDeltaReplicatedData
---

# AbstractDeltaReplicatedData

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class AbstractDeltaReplicatedData\<A extends AbstractDeltaReplicatedData\<A,​B\>,​B extends [ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")\>

- java.lang.Object
- - [akka.cluster.ddata.AbstractReplicatedData](AbstractReplicatedData.html "class in akka.cluster.ddata")\<A\>
	- - akka.cluster.ddata.AbstractDeltaReplicatedData\<A,​B\>

- All Implemented Interfaces:
`[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`

---

```
public abstract class AbstractDeltaReplicatedData<A extends AbstractDeltaReplicatedData<A,​B>,​B extends [ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")>
extends [AbstractReplicatedData](AbstractReplicatedData.html "class in akka.cluster.ddata")<A>
implements [DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")
```

Java API: Interface for implementing a [`DeltaReplicatedData`](DeltaReplicatedData.html "interface in akka.cluster.ddata") in Java.
 
 The type parameter `A` is a self\-recursive type to be defined by the
 concrete implementation.
 E.g. `class TwoPhaseSet extends AbstractDeltaReplicatedData<TwoPhaseSet, TwoPhaseSet>`

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractDeltaReplicatedData](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")>` | `[delta](#delta())()` | Delegates to [`deltaData()`](#deltaData()), which must be implemented by subclass. |
	| `abstract java.util.Optional<[B](AbstractDeltaReplicatedData.html "type parameter in AbstractDeltaReplicatedData")>` | `[deltaData](#deltaData())()` | The accumulated delta of mutator operations since previous  [`DeltaReplicatedData.resetDelta()`](DeltaReplicatedData.html#resetDelta()). |
	| `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")` | `[mergeDelta](#mergeDelta(akka.cluster.ddata.ReplicatedDelta))​([ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata") that)` | Delegates to [`mergeDeltaData(B)`](#mergeDeltaData(B)), which must be implemented by subclass. |
	| `abstract [A](AbstractDeltaReplicatedData.html "type parameter in AbstractDeltaReplicatedData")` | `[mergeDeltaData](#mergeDeltaData(B))​([B](AbstractDeltaReplicatedData.html "type parameter in AbstractDeltaReplicatedData") that)` | When delta is merged into the full state this method is used. |
	
	
		- ### Methods inherited from class akka.cluster.ddata.[AbstractReplicatedData](AbstractReplicatedData.html "class in akka.cluster.ddata")
		
		
		`[merge](AbstractReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData)), [mergeData](AbstractReplicatedData.html#mergeData(A))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.ddata.[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[mergeDelta](DeltaReplicatedData.html#mergeDelta(akka.cluster.ddata.DeltaReplicatedData)), [resetDelta](DeltaReplicatedData.html#resetDelta())`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Constructor Detail
	
	
	
		- #### AbstractDeltaReplicatedData
		
		
		
		```
		public AbstractDeltaReplicatedData()
		```

	- ### Method Detail
	
	
	
		- #### delta
		
		
		
		```
		public final scala.Option<[ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")> delta()
		```
		
		Delegates to [`deltaData()`](#deltaData()), which must be implemented by subclass.
		
		Specified by:
		`[delta](DeltaReplicatedData.html#delta())` in interface `[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")`
		- #### deltaData
		
		
		
		```
		public abstract java.util.Optional<[B](AbstractDeltaReplicatedData.html "type parameter in AbstractDeltaReplicatedData")> deltaData()
		```
		
		The accumulated delta of mutator operations since previous
		 [`DeltaReplicatedData.resetDelta()`](DeltaReplicatedData.html#resetDelta()). When the `Replicator` invokes the `modify` function
		 of the `Update` message and the user code is invoking one or more mutator
		 operations the data is collecting the delta of the operations and makes
		 it available for the `Replicator` with the [`deltaData()`](#deltaData()) accessor. The
		 `modify` function shall still return the full state in the same way as
		 `ReplicatedData` without support for deltas.
		- #### mergeDelta
		
		
		
		```
		public final [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") mergeDelta​([ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata") that)
		```
		
		Delegates to [`mergeDeltaData(B)`](#mergeDeltaData(B)), which must be implemented by subclass.
		- #### mergeDeltaData
		
		
		
		```
		public abstract [A](AbstractDeltaReplicatedData.html "type parameter in AbstractDeltaReplicatedData") mergeDeltaData​([B](AbstractDeltaReplicatedData.html "type parameter in AbstractDeltaReplicatedData") that)
		```
		
		When delta is merged into the full state this method is used.
		 When the type `D` of the delta is of the same type as the full state `T`
		 this method can be implemented by delegating to `mergeData`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedDelta.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:59:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractReplicatedData.html
title: AbstractReplicatedData
---

# AbstractReplicatedData

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class AbstractReplicatedData\<A extends AbstractReplicatedData\<A\>\>

- java.lang.Object
- - akka.cluster.ddata.AbstractReplicatedData\<A\>

- All Implemented Interfaces:
`[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`

Direct Known Subclasses:
`[AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "class in akka.cluster.ddata")`

---

```
public abstract class AbstractReplicatedData<A extends AbstractReplicatedData<A>>
extends java.lang.Object
implements [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
```

Java API: Interface for implementing a [`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata") in Java.
 
 The type parameter `A` is a self\-recursive type to be defined by the
 concrete implementation.
 E.g. `class TwoPhaseSet extends AbstractReplicatedData<TwoPhaseSet>`

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractReplicatedData](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")` | `[merge](#merge(akka.cluster.ddata.ReplicatedData))​([ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") that)` | Delegates to [`mergeData(A)`](#mergeData(A)), which must be implemented by subclass. |
	| `abstract [A](AbstractReplicatedData.html "type parameter in AbstractReplicatedData")` | `[mergeData](#mergeData(A))​([A](AbstractReplicatedData.html "type parameter in AbstractReplicatedData") that)` | Java API: Monotonic merge function. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AbstractReplicatedData
		
		
		
		```
		public AbstractReplicatedData()
		```

	- ### Method Detail
	
	
	
		- #### merge
		
		
		
		```
		public final [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") merge​([ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") that)
		```
		
		Delegates to [`mergeData(A)`](#mergeData(A)), which must be implemented by subclass.
		
		Specified by:
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))` in interface `[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`
		- #### mergeData
		
		
		
		```
		public abstract [A](AbstractReplicatedData.html "type parameter in AbstractReplicatedData") mergeData​([A](AbstractReplicatedData.html "type parameter in AbstractReplicatedData") that)
		```
		
		Java API: Monotonic merge function.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractReplicatedData.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/AbstractReplicatedData.html)*
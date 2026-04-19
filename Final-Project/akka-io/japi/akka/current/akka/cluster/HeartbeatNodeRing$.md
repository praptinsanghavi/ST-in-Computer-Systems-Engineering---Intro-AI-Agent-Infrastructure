---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:41:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/HeartbeatNodeRing$.html
title: HeartbeatNodeRing$
---

# HeartbeatNodeRing$

## Content

Package [akka.cluster](package-summary.html)
## Class HeartbeatNodeRing$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set\<[UniqueAddress](UniqueAddress.html "class in akka.cluster")\>,​scala.collection.immutable.Set\<[UniqueAddress](UniqueAddress.html "class in akka.cluster")\>,​java.lang.Object,​akka.cluster.HeartbeatNodeRing\>
	- - akka.cluster.HeartbeatNodeRing$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​java.lang.Object,​akka.cluster.HeartbeatNodeRing>`

---

```
public class HeartbeatNodeRing$
extends scala.runtime.AbstractFunction4<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​java.lang.Object,​akka.cluster.HeartbeatNodeRing>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.HeartbeatNodeRing$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HeartbeatNodeRing$](HeartbeatNodeRing$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeartbeatNodeRing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.HeartbeatNodeRing` | `[apply](#apply(akka.cluster.UniqueAddress,scala.collection.immutable.Set,scala.collection.immutable.Set,int))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") selfAddress,  scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")> nodes,  scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")> unreachable,  int monitoredByNrOfMembers)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.HeartbeatNodeRing))​(akka.cluster.HeartbeatNodeRing x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HeartbeatNodeRing$](HeartbeatNodeRing$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HeartbeatNodeRing$
		
		
		
		```
		public HeartbeatNodeRing$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​java.lang.Object,​akka.cluster.HeartbeatNodeRing>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​java.lang.Object,​akka.cluster.HeartbeatNodeRing>`
		- #### apply
		
		
		
		```
		public akka.cluster.HeartbeatNodeRing apply​([UniqueAddress](UniqueAddress.html "class in akka.cluster") selfAddress,
		                                            scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")> nodes,
		                                            scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")> unreachable,
		                                            int monitoredByNrOfMembers)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​java.lang.Object>> unapply​(akka.cluster.HeartbeatNodeRing x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/HeartbeatNodeRing$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/HeartbeatNodeRing$.html](https://doc.akka.io/japi/akka/current/akka/cluster/HeartbeatNodeRing$.html)*
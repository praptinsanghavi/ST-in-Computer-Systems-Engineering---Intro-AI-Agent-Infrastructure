---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/GossipStatus$.html
title: GossipStatus$
---

# GossipStatus$

## Content

Package [akka.cluster](package-summary.html)
## Class GossipStatus$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​[VectorClock](VectorClock.html "class in akka.cluster"),​byte\[],​akka.cluster.GossipStatus\>
	- - akka.cluster.GossipStatus$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​[VectorClock](VectorClock.html "class in akka.cluster"),​byte[],​akka.cluster.GossipStatus>`

---

```
public class GossipStatus$
extends scala.runtime.AbstractFunction3<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​[VectorClock](VectorClock.html "class in akka.cluster"),​byte[],​akka.cluster.GossipStatus>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.GossipStatus$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GossipStatus$](GossipStatus$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GossipStatus$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.GossipStatus` | `[apply](#apply(akka.cluster.UniqueAddress,akka.cluster.VectorClock,byte%5B%5D))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,  [VectorClock](VectorClock.html "class in akka.cluster") version,  byte[] seenDigest)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​[VectorClock](VectorClock.html "class in akka.cluster"),​byte[]>>` | `[unapply](#unapply(akka.cluster.GossipStatus))​(akka.cluster.GossipStatus x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GossipStatus$](GossipStatus$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GossipStatus$
		
		
		
		```
		public GossipStatus$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​[VectorClock](VectorClock.html "class in akka.cluster"),​byte[],​akka.cluster.GossipStatus>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​[VectorClock](VectorClock.html "class in akka.cluster"),​byte[],​akka.cluster.GossipStatus>`
		- #### apply
		
		
		
		```
		public akka.cluster.GossipStatus apply​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,
		                                       [VectorClock](VectorClock.html "class in akka.cluster") version,
		                                       byte[] seenDigest)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​[VectorClock](VectorClock.html "class in akka.cluster"),​byte[],​akka.cluster.GossipStatus>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​[VectorClock](VectorClock.html "class in akka.cluster"),​byte[]>> unapply​(akka.cluster.GossipStatus x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/GossipStatus$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/VectorClock.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/GossipStatus$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/GossipStatus$.html)*
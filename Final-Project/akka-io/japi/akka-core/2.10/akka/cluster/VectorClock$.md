---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/VectorClock$.html
title: VectorClock$
---

# VectorClock$

## Content

Package [akka.cluster](package-summary.html)
## Class VectorClock$

- java.lang.Object
- - akka.cluster.VectorClock$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class VectorClock$
extends java.lang.Object
implements java.io.Serializable
```

VectorClock module with helper classes and methods.
 
 Based on code from the 'vlock' VectorClock library by Coda Hale.

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.VectorClock$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [VectorClock$](VectorClock$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[VectorClock$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object>` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` | Representation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks. |
	| `[VectorClock](VectorClock.html "class in akka.cluster")` | `[apply](#apply(scala.collection.immutable.TreeMap))​(scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object> versions)` |  |
	| `scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object>` | `[apply$default$1](#apply$default$1())()` |  |
	| `scala.Option<scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.VectorClock))​([VectorClock](VectorClock.html "class in akka.cluster") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [VectorClock$](VectorClock$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### VectorClock$
		
		
		
		```
		public VectorClock$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object> $lessinit$greater$default$1()
		```
		
		Representation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks.
		 
		```
		
		 Reference:
		    1) Leslie Lamport (1978). "Time, clocks, and the ordering of events in a distributed system". Communications of the ACM 21 (7): 558-565.
		    2) Friedemann Mattern (1988). "Virtual Time and Global States of Distributed Systems". Workshop on Parallel and Distributed Algorithms: pp. 215-226
		 
		```
		
		
		 Based on code from the 'vlock' VectorClock library by Coda Hale.
		- #### apply
		
		
		
		```
		public [VectorClock](VectorClock.html "class in akka.cluster") apply​(scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object> versions)
		```
		- #### apply$default$1
		
		
		
		```
		public scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object> apply$default$1()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object>> unapply​([VectorClock](VectorClock.html "class in akka.cluster") x$0)
		```

## Code Examples

### Example 1: $lessinit$greater$default$1

```text
Reference:
    1) Leslie Lamport (1978). "Time, clocks, and the ordering of events in a distributed system". Communications of the ACM 21 (7): 558-565.
    2) Friedemann Mattern (1988). "Virtual Time and Global States of Distributed Systems". Workshop on Parallel and Distributed Algorithms: pp. 215-226
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/VectorClock$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/VectorClock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/VectorClock$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/VectorClock$.html)*
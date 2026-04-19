---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:17:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/GossipEnvelope$.html
title: GossipEnvelope$
---

# GossipEnvelope$

## Content

Package [akka.cluster](package-summary.html)
## Class GossipEnvelope$

- java.lang.Object
- - akka.cluster.GossipEnvelope$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class GossipEnvelope$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.GossipEnvelope$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GossipEnvelope$](GossipEnvelope$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GossipEnvelope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.GossipEnvelope` | `[apply](#apply(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress,akka.cluster.Gossip))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,  [UniqueAddress](UniqueAddress.html "class in akka.cluster") to,  akka.cluster.Gossip gossip)` |  |
	| `akka.cluster.GossipEnvelope` | `[apply](#apply(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress,scala.concurrent.duration.Deadline,scala.Function0))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,  [UniqueAddress](UniqueAddress.html "class in akka.cluster") to,  scala.concurrent.duration.Deadline serDeadline,  scala.Function0<akka.cluster.Gossip> ser)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GossipEnvelope$](GossipEnvelope$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GossipEnvelope$
		
		
		
		```
		public GossipEnvelope$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.cluster.GossipEnvelope apply​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,
		                                         [UniqueAddress](UniqueAddress.html "class in akka.cluster") to,
		                                         akka.cluster.Gossip gossip)
		```
		- #### apply
		
		
		
		```
		public akka.cluster.GossipEnvelope apply​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,
		                                         [UniqueAddress](UniqueAddress.html "class in akka.cluster") to,
		                                         scala.concurrent.duration.Deadline serDeadline,
		                                         scala.Function0<akka.cluster.Gossip> ser)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/GossipEnvelope$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/GossipEnvelope$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/GossipEnvelope$.html)*
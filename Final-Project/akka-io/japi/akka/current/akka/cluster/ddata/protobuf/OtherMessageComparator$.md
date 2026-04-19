---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/OtherMessageComparator$.html
title: OtherMessageComparator$
---

# OtherMessageComparator$

## Content

Package [akka.cluster.ddata.protobuf](package-summary.html)
## Class OtherMessageComparator$

- java.lang.Object
- - akka.cluster.ddata.protobuf.OtherMessageComparator$

- All Implemented Interfaces:
`java.util.Comparator<[ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")>`

---

```
public class OtherMessageComparator$
extends java.lang.Object
implements java.util.Comparator<[ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [OtherMessageComparator$](OtherMessageComparator$.html "class in akka.cluster.ddata.protobuf")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OtherMessageComparator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[compare](#compare(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") a,  [ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") b)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.util.Comparator
		
		
		`equals, reversed, thenComparing, thenComparing, thenComparing, thenComparingDouble, thenComparingInt, thenComparingLong`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [OtherMessageComparator$](OtherMessageComparator$.html "class in akka.cluster.ddata.protobuf") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### OtherMessageComparator$
		
		
		
		```
		public OtherMessageComparator$()
		```

	- ### Method Detail
	
	
	
		- #### compare
		
		
		
		```
		public int compare​([ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") a,
		                   [ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") b)
		```
		
		
		Specified by:
		`compare` in interface `java.util.Comparator<[ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/OtherMessageComparator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/OtherMessageComparator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/OtherMessageComparator$.html)*
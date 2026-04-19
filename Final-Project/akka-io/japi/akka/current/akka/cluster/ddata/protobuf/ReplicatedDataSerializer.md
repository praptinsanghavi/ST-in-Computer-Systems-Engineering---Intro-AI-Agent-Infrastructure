---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:57:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.PNCounterMapEntryComparator$.html
title: ReplicatedDataSerializer.PNCounterMapEntryComparator$
---

# ReplicatedDataSerializer.PNCounterMapEntryComparator$

## Content

Package [akka.cluster.ddata.protobuf](package-summary.html)
## Class ReplicatedDataSerializer.PNCounterMapEntryComparator$

- java.lang.Object
- - [akka.cluster.ddata.protobuf.ReplicatedDataSerializer.KeyComparator](ReplicatedDataSerializer.KeyComparator.html "class in akka.cluster.ddata.protobuf")\<[ReplicatedDataMessages.PNCounterMap.Entry](msg/ReplicatedDataMessages.PNCounterMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")\>
	- - akka.cluster.ddata.protobuf.ReplicatedDataSerializer.PNCounterMapEntryComparator$

- All Implemented Interfaces:
`java.util.Comparator<[ReplicatedDataMessages.PNCounterMap.Entry](msg/ReplicatedDataMessages.PNCounterMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")>`

Enclosing class:
[ReplicatedDataSerializer](ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf")

---

```
public static class ReplicatedDataSerializer.PNCounterMapEntryComparator$
extends [ReplicatedDataSerializer.KeyComparator](ReplicatedDataSerializer.KeyComparator.html "class in akka.cluster.ddata.protobuf")<[ReplicatedDataMessages.PNCounterMap.Entry](msg/ReplicatedDataMessages.PNCounterMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatedDataSerializer.PNCounterMapEntryComparator$](ReplicatedDataSerializer.PNCounterMapEntryComparator$.html "class in akka.cluster.ddata.protobuf")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PNCounterMapEntryComparator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[getKey](#getKey(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounterMap.Entry))​([ReplicatedDataMessages.PNCounterMap.Entry](msg/ReplicatedDataMessages.PNCounterMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") e)` | Get the key from the entry. |
	
	
		- ### Methods inherited from class akka.cluster.ddata.protobuf.[ReplicatedDataSerializer.KeyComparator](ReplicatedDataSerializer.KeyComparator.html "class in akka.cluster.ddata.protobuf")
		
		
		`[compare](ReplicatedDataSerializer.KeyComparator.html#compare(A,A))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.util.Comparator
		
		
		`equals, reversed, thenComparing, thenComparing, thenComparing, thenComparingDouble, thenComparingInt, thenComparingLong`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatedDataSerializer.PNCounterMapEntryComparator$](ReplicatedDataSerializer.PNCounterMapEntryComparator$.html "class in akka.cluster.ddata.protobuf") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PNCounterMapEntryComparator$
		
		
		
		```
		public PNCounterMapEntryComparator$()
		```

	- ### Method Detail
	
	
	
		- #### getKey
		
		
		
		```
		public java.lang.Object getKey​([ReplicatedDataMessages.PNCounterMap.Entry](msg/ReplicatedDataMessages.PNCounterMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") e)
		```
		
		Description copied from class: `[ReplicatedDataSerializer.KeyComparator](ReplicatedDataSerializer.KeyComparator.html#getKey(A))`
		Get the key from the entry. The key may be a String, Int, Long, or OtherMessage
		
		Specified by:
		`[getKey](ReplicatedDataSerializer.KeyComparator.html#getKey(A))` in class `[ReplicatedDataSerializer.KeyComparator](ReplicatedDataSerializer.KeyComparator.html "class in akka.cluster.ddata.protobuf")<[ReplicatedDataMessages.PNCounterMap.Entry](msg/ReplicatedDataMessages.PNCounterMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")>`
		Parameters:
		`e` \- The protobuf entry used with Map types
		Returns:
		The Key

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.KeyComparator.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.PNCounterMapEntryComparator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounterMap.Entry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.PNCounterMapEntryComparator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.PNCounterMapEntryComparator$.html)*
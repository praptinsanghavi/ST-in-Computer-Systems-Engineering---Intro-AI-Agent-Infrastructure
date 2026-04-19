---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CollectionStopMessage$.html
title: CollectionStopMessage$
---

# CollectionStopMessage$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class CollectionStopMessage$

- java.lang.Object
- - [akka.cluster.metrics.CollectionControlMessage](CollectionControlMessage.html "class in akka.cluster.metrics")
	- - akka.cluster.metrics.CollectionStopMessage$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class CollectionStopMessage$
extends [CollectionControlMessage](CollectionControlMessage.html "class in akka.cluster.metrics")
implements scala.Product, java.io.Serializable
```

Command for `ClusterMetricsSupervisor` to stop metrics collection.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.CollectionStopMessage$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CollectionStopMessage$](CollectionStopMessage$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CollectionStopMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[CollectionStopMessage$](CollectionStopMessage$.html "class in akka.cluster.metrics")` | `[getInstance](#getInstance())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CollectionStopMessage$](CollectionStopMessage$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CollectionStopMessage$
		
		
		
		```
		public CollectionStopMessage$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [CollectionStopMessage$](CollectionStopMessage$.html "class in akka.cluster.metrics") getInstance()
		```
		
		Java API
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
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CollectionControlMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CollectionStopMessage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CollectionStopMessage$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CollectionStopMessage$.html)*
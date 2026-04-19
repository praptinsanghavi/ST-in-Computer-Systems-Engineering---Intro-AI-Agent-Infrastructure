---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DurableStore.Store$.html
title: DurableStore.Store$
---

# DurableStore.Store$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class DurableStore.Store$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option\<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")\>,​[DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata")\>
	- - akka.cluster.ddata.DurableStore.Store$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")>,​[DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata")>`

Enclosing class:
[DurableStore](DurableStore.html "class in akka.cluster.ddata")

---

```
public static class DurableStore.Store$
extends scala.runtime.AbstractFunction3<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")>,​[DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.DurableStore.Store$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableStore.Store$](DurableStore.Store$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Store$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata")` | `[apply](#apply(java.lang.String,akka.cluster.ddata.DurableStore.DurableDataEnvelope,scala.Option))​(java.lang.String key,  [DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata") data,  scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")> reply)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")>>>` | `[unapply](#unapply(akka.cluster.ddata.DurableStore.Store))​([DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableStore.Store$](DurableStore.Store$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Store$
		
		
		
		```
		public Store$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")>,​[DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")>,​[DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata")>`
		- #### apply
		
		
		
		```
		public [DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata") apply​(java.lang.String key,
		                                [DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata") data,
		                                scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")> reply)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")>,​[DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.String,​[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option<[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")>>> unapply​([DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DurableStore.DurableDataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DurableStore.Store$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DurableStore.Store.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DurableStore.StoreReply.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DurableStore.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DurableStore.Store$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DurableStore.Store$.html)*
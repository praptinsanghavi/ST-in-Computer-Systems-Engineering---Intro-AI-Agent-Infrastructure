---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PruningState.PruningInitialized$.html
title: PruningState.PruningInitialized$
---

# PruningState.PruningInitialized$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class PruningState.PruningInitialized$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set\<[Address](../../actor/Address.html "class in akka.actor")\>,​[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")\>
	- - akka.cluster.ddata.PruningState.PruningInitialized$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>,​[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")>`

Enclosing interface:
[PruningState](PruningState.html "interface in akka.cluster.ddata")

---

```
public static class PruningState.PruningInitialized$
extends scala.runtime.AbstractFunction2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>,​[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.PruningState.PruningInitialized$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PruningState.PruningInitialized$](PruningState.PruningInitialized$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PruningInitialized$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")` | `[apply](#apply(akka.cluster.UniqueAddress,scala.collection.immutable.Set))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") owner,  scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")> seen)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>>` | `[unapply](#unapply(akka.cluster.ddata.PruningState.PruningInitialized))​([PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PruningState.PruningInitialized$](PruningState.PruningInitialized$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PruningInitialized$
		
		
		
		```
		public PruningInitialized$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>,​[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>,​[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")>`
		- #### apply
		
		
		
		```
		public [PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata") apply​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") owner,
		                                             scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")> seen)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>,​[PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>> unapply​([PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PruningState.PruningInitialized$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PruningState.PruningInitialized.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PruningState.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PruningState.PruningInitialized$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PruningState.PruningInitialized$.html)*
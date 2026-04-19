---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime$.html
title: LwwTime$
---

# LwwTime$

## Content

Package [akka.persistence.typed.crdt](package-summary.html)
## Class LwwTime$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​[LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")\>
	- - akka.persistence.typed.crdt.LwwTime$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​[LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")>`

---

```
public class LwwTime$
extends scala.runtime.AbstractFunction2<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​[LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.crdt.LwwTime$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LwwTime$](LwwTime$.html "class in akka.persistence.typed.crdt")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LwwTime$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")` | `[apply](#apply(long,akka.persistence.typed.ReplicaId))​(long timestamp,  [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")>>` | `[unapply](#unapply(akka.persistence.typed.crdt.LwwTime))​([LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LwwTime$](LwwTime$.html "class in akka.persistence.typed.crdt") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LwwTime$
		
		
		
		```
		public LwwTime$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​[LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​[LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")>`
		- #### apply
		
		
		
		```
		public [LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") apply​(long timestamp,
		                     [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")>> unapply​([LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime$.html)*
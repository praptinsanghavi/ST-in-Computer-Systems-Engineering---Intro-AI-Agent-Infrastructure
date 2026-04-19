---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId$.html
title: ReplicaId$
---

# ReplicaId$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class ReplicaId$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.String,​[ReplicaId](ReplicaId.html "class in akka.persistence.typed")\>
	- - akka.persistence.typed.ReplicaId$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.String,​[ReplicaId](ReplicaId.html "class in akka.persistence.typed")>`

---

```
public class ReplicaId$
extends scala.runtime.AbstractFunction1<java.lang.String,​[ReplicaId](ReplicaId.html "class in akka.persistence.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.ReplicaId$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicaId$](ReplicaId$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicaId$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicaId](ReplicaId.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String))​(java.lang.String id)` |  |
	| `[ReplicaId](ReplicaId.html "class in akka.persistence.typed")` | `[empty](#empty())()` | When migrating from non\-replicated to replicated the ReplicaId of where the original entity  was located should be empty. |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.persistence.typed.ReplicaId))​([ReplicaId](ReplicaId.html "class in akka.persistence.typed") x$0)` | Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier. |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicaId$](ReplicaId$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicaId$
		
		
		
		```
		public ReplicaId$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [ReplicaId](ReplicaId.html "class in akka.persistence.typed") empty()
		```
		
		When migrating from non\-replicated to replicated the ReplicaId of where the original entity
		 was located should be empty.
		- #### apply
		
		
		
		```
		public [ReplicaId](ReplicaId.html "class in akka.persistence.typed") apply​(java.lang.String id)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.String,​[ReplicaId](ReplicaId.html "class in akka.persistence.typed")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​([ReplicaId](ReplicaId.html "class in akka.persistence.typed") x$0)
		```
		
		Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId$.html)*
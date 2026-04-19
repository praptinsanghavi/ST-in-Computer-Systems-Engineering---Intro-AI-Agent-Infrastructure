---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/ORSet$.html
title: ORSet$
---

# ORSet$

## Content

Package [akka.persistence.typed.crdt](package-summary.html)
## Class ORSet$

- java.lang.Object
- - akka.persistence.typed.crdt.ORSet$

- ---

```
public class ORSet$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ORSet$](ORSet$.html "class in akka.persistence.typed.crdt")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ORSet$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [ORSet](ORSet.html "class in akka.persistence.typed.crdt")<A>` | `[apply](#apply(akka.persistence.typed.ReplicaId))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)` |  |
	| `<A> [ORSet](ORSet.html "class in akka.persistence.typed.crdt")<A>` | `[create](#create(akka.persistence.typed.ReplicaId))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)` | Java API |
	| `<A> [ORSet](ORSet.html "class in akka.persistence.typed.crdt")<A>` | `[empty](#empty(akka.persistence.typed.ReplicaId))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)` |  |
	| `<A> scala.Option<scala.collection.immutable.Set<A>>` | `[unapply](#unapply(akka.persistence.typed.crdt.ORSet))​([ORSet](ORSet.html "class in akka.persistence.typed.crdt")<A> s)` | Extract the [`ORSet.elements()`](ORSet.html#elements()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ORSet$](ORSet$.html "class in akka.persistence.typed.crdt") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ORSet$
		
		
		
		```
		public ORSet$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public <A> [ORSet](ORSet.html "class in akka.persistence.typed.crdt")<A> empty​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)
		```
		- #### apply
		
		
		
		```
		public <A> [ORSet](ORSet.html "class in akka.persistence.typed.crdt")<A> apply​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)
		```
		- #### create
		
		
		
		```
		public <A> [ORSet](ORSet.html "class in akka.persistence.typed.crdt")<A> create​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public <A> scala.Option<scala.collection.immutable.Set<A>> unapply​([ORSet](ORSet.html "class in akka.persistence.typed.crdt")<A> s)
		```
		
		Extract the [`ORSet.elements()`](ORSet.html#elements()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/ORSet$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/ORSet.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/ORSet$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/ORSet$.html)*
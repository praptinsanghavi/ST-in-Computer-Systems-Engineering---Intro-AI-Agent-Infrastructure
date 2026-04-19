---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html
title: DeletedDurableState
---

# DeletedDurableState

## Content

Package [akka.persistence.query](package-summary.html)
## Class DeletedDurableState\<A\>

- java.lang.Object
- - akka.persistence.query.DeletedDurableState\<A\>

- Type Parameters:
`A` \- the type of the value

All Implemented Interfaces:
`[DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")<A>`

---

```
public final class DeletedDurableState<A>
extends java.lang.Object
implements [DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")<A>
```

param: persistenceId The persistence id of the origin entity.
 param: revision The revision number from the origin entity.
 param: offset The offset that can be used in next `changes` or `currentChanges` query.
 param: timestamp The time the state was stored, in milliseconds since midnight, January 1, 1970 UTC
 (same as `System.currentTimeMillis`).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeletedDurableState](#%3Cinit%3E(java.lang.String,long,akka.persistence.query.Offset,long))​(java.lang.String persistenceId,  long revision,  [Offset](Offset.html "class in akka.persistence.query") offset,  long timestamp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[offset](#offset())()` | The offset that can be used in next `changes` or `currentChanges` query. |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` | The persistence id of the origin entity. |
	| `long` | `[revision](#revision())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `static <A> scala.Option<scala.Tuple4<java.lang.String,​java.lang.Object,​[Offset](Offset.html "class in akka.persistence.query"),​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.query.DeletedDurableState))​([DeletedDurableState](DeletedDurableState.html "class in akka.persistence.query")<A> arg)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeletedDurableState
		
		
		
		```
		public DeletedDurableState​(java.lang.String persistenceId,
		                           long revision,
		                           [Offset](Offset.html "class in akka.persistence.query") offset,
		                           long timestamp)
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static <A> scala.Option<scala.Tuple4<java.lang.String,​java.lang.Object,​[Offset](Offset.html "class in akka.persistence.query"),​java.lang.Object>> unapply​([DeletedDurableState](DeletedDurableState.html "class in akka.persistence.query")<A> arg)
		```
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		
		Description copied from interface: `[DurableStateChange](DurableStateChange.html#persistenceId())`
		The persistence id of the origin entity.
		
		Specified by:
		`[persistenceId](DurableStateChange.html#persistenceId())` in interface `[DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")<[A](DeletedDurableState.html "type parameter in DeletedDurableState")>`
		- #### revision
		
		
		
		```
		public long revision()
		```
		- #### offset
		
		
		
		```
		public [Offset](Offset.html "class in akka.persistence.query") offset()
		```
		
		Description copied from interface: `[DurableStateChange](DurableStateChange.html#offset())`
		The offset that can be used in next `changes` or `currentChanges` query.
		
		Specified by:
		`[offset](DurableStateChange.html#offset())` in interface `[DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")<[A](DeletedDurableState.html "type parameter in DeletedDurableState")>`
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html)*
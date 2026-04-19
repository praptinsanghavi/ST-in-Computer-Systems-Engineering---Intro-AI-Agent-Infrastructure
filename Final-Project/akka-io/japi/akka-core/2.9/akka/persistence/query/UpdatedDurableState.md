---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:44:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/UpdatedDurableState.html
title: UpdatedDurableState
---

# UpdatedDurableState

## Content

Package [akka.persistence.query](package-summary.html)
## Class UpdatedDurableState\<A\>

- java.lang.Object
- - akka.persistence.query.UpdatedDurableState\<A\>

- Type Parameters:
`A` \- the type of the value

All Implemented Interfaces:
`[DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")<A>`

---

```
public final class UpdatedDurableState<A>
extends java.lang.Object
implements [DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")<A>
```

param: persistenceId The persistence id of the origin entity.
 param: revision The revision number from the origin entity.
 param: value The object value.
 param: offset The offset that can be used in next `changes` or `currentChanges` query.
 param: timestamp The time the state was stored, in milliseconds since midnight, January 1, 1970 UTC
 (same as `System.currentTimeMillis`).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UpdatedDurableState](#%3Cinit%3E(java.lang.String,long,A,akka.persistence.query.Offset,long))​(java.lang.String persistenceId,  long revision,  [A](UpdatedDurableState.html "type parameter in UpdatedDurableState") value,  [Offset](Offset.html "class in akka.persistence.query") offset,  long timestamp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[offset](#offset())()` | The offset that can be used in next `changes` or `currentChanges` query. |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` | The persistence id of the origin entity. |
	| `long` | `[revision](#revision())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `static <A> scala.Option<scala.Tuple5<java.lang.String,​java.lang.Object,​A,​[Offset](Offset.html "class in akka.persistence.query"),​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.query.UpdatedDurableState))​([UpdatedDurableState](UpdatedDurableState.html "class in akka.persistence.query")<A> arg)` |  |
	| `[A](UpdatedDurableState.html "type parameter in UpdatedDurableState")` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UpdatedDurableState
		
		
		
		```
		public UpdatedDurableState​(java.lang.String persistenceId,
		                           long revision,
		                           [A](UpdatedDurableState.html "type parameter in UpdatedDurableState") value,
		                           [Offset](Offset.html "class in akka.persistence.query") offset,
		                           long timestamp)
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static <A> scala.Option<scala.Tuple5<java.lang.String,​java.lang.Object,​A,​[Offset](Offset.html "class in akka.persistence.query"),​java.lang.Object>> unapply​([UpdatedDurableState](UpdatedDurableState.html "class in akka.persistence.query")<A> arg)
		```
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		
		Description copied from interface: `[DurableStateChange](DurableStateChange.html#persistenceId())`
		The persistence id of the origin entity.
		
		Specified by:
		`[persistenceId](DurableStateChange.html#persistenceId())` in interface `[DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")<[A](UpdatedDurableState.html "type parameter in UpdatedDurableState")>`
		- #### revision
		
		
		
		```
		public long revision()
		```
		- #### value
		
		
		
		```
		public [A](UpdatedDurableState.html "type parameter in UpdatedDurableState") value()
		```
		- #### offset
		
		
		
		```
		public [Offset](Offset.html "class in akka.persistence.query") offset()
		```
		
		Description copied from interface: `[DurableStateChange](DurableStateChange.html#offset())`
		The offset that can be used in next `changes` or `currentChanges` query.
		
		Specified by:
		`[offset](DurableStateChange.html#offset())` in interface `[DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")<[A](UpdatedDurableState.html "type parameter in UpdatedDurableState")>`
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/UpdatedDurableState.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/UpdatedDurableState.html)*
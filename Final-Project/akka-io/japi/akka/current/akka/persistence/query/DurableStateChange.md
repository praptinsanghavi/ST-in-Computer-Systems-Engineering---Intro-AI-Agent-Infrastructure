---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html
title: DurableStateChange
---

# DurableStateChange

## Content

Package [akka.persistence.query](package-summary.html)
## Interface DurableStateChange\<A\>

- Type Parameters:
`A` \- the type of the value

All Known Implementing Classes:
`[DeletedDurableState](DeletedDurableState.html "class in akka.persistence.query")`, `[UpdatedDurableState](UpdatedDurableState.html "class in akka.persistence.query")`

---

```
public interface DurableStateChange<A>
```

The `DurableStateStoreQuery` stream elements for `DurableStateStoreQuery`.
 
 The implementation can be a [`UpdatedDurableState`](UpdatedDurableState.html "class in akka.persistence.query") or a [`DeletedDurableState`](DeletedDurableState.html "class in akka.persistence.query").
 

 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[offset](#offset())()` | The offset that can be used in next `changes` or `currentChanges` query. |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` | The persistence id of the origin entity. |

- - ### Method Detail
	
	
	
		- #### offset
		
		
		
		```
		[Offset](Offset.html "class in akka.persistence.query") offset()
		```
		
		The offset that can be used in next `changes` or `currentChanges` query.
		- #### persistenceId
		
		
		
		```
		java.lang.String persistenceId()
		```
		
		The persistence id of the origin entity.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html)*
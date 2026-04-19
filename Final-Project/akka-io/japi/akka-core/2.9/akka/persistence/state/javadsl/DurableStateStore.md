---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:44:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/DurableStateStore.html
title: DurableStateStore
---

# DurableStateStore

## Content

Package [akka.persistence.state.javadsl](package-summary.html)
## Interface DurableStateStore\<A\>

- All Known Subinterfaces:
`[DurableStateStoreBySliceQuery](../../query/typed/javadsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")<A>`, `[DurableStateStorePagedPersistenceIdsQuery](../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")<A>`, `[DurableStateStoreQuery](../../query/javadsl/DurableStateStoreQuery.html "interface in akka.persistence.query.javadsl")<A>`, `[DurableStateUpdateStore](DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")<A>`, `[DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.javadsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.javadsl")`

---

```
public interface DurableStateStore<A>
```

API for reading durable state objects with payload `A`.
 
 For Scala API see [`DurableStateStore`](../scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl").
 

 See also [`DurableStateUpdateStore`](DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<[GetObjectResult](GetObjectResult.html "class in akka.persistence.state.javadsl")<[A](DurableStateStore.html "type parameter in DurableStateStore")>>` | `[getObject](#getObject(java.lang.String))​(java.lang.String persistenceId)` |  |

- - ### Method Detail
	
	
	
		- #### getObject
		
		
		
		```
		java.util.concurrent.CompletionStage<[GetObjectResult](GetObjectResult.html "class in akka.persistence.state.javadsl")<[A](DurableStateStore.html "type parameter in DurableStateStore")>> getObject​(java.lang.String persistenceId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/javadsl/DurableStateStoreQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/GetObjectResult.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/DurableStateStore.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/DurableStateStore.html)*
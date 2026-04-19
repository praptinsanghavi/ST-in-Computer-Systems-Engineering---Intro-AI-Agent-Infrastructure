---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:44:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/DurableStateStore.html
title: DurableStateStore
---

# DurableStateStore

## Content

Package [akka.persistence.state.scaladsl](package-summary.html)
## Interface DurableStateStore\<A\>

- All Known Subinterfaces:
`[DurableStateStoreBySliceQuery](../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")<A>`, `[DurableStateStorePagedPersistenceIdsQuery](../../query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")<A>`, `[DurableStateStoreQuery](../../query/scaladsl/DurableStateStoreQuery.html "interface in akka.persistence.query.scaladsl")<A>`, `[DurableStateUpdateStore](DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")<A>`, `[DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.scaladsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")`

---

```
public interface DurableStateStore<A>
```

API for reading durable state objects with payload `A`.
 
 For Java API see [`DurableStateStore`](../javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl").
 

 See also [`DurableStateUpdateStore`](DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[GetObjectResult](GetObjectResult.html "class in akka.persistence.state.scaladsl")<[A](DurableStateStore.html "type parameter in DurableStateStore")>>` | `[getObject](#getObject(java.lang.String))​(java.lang.String persistenceId)` |  |

- - ### Method Detail
	
	
	
		- #### getObject
		
		
		
		```
		scala.concurrent.Future<[GetObjectResult](GetObjectResult.html "class in akka.persistence.state.scaladsl")<[A](DurableStateStore.html "type parameter in DurableStateStore")>> getObject​(java.lang.String persistenceId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/scaladsl/DurableStateStoreQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/GetObjectResult.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/DurableStateStore.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/state/scaladsl/DurableStateStore.html)*
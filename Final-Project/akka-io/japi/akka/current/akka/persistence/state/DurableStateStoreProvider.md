---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/state/DurableStateStoreProvider.html
title: DurableStateStoreProvider
---

# DurableStateStoreProvider

## Content

Package [akka.persistence.state](package-summary.html)
## Interface DurableStateStoreProvider

- All Known Implementing Classes:
`[PersistenceTestKitDurableStateStoreProvider](../testkit/state/PersistenceTestKitDurableStateStoreProvider.html "class in akka.persistence.testkit.state")`

---

```
public interface DurableStateStoreProvider
```

A durable state store plugin must implement a class that implements this trait.
 It provides the concrete implementations for the Java and Scala APIs.
 
 A durable state store plugin plugin must provide implementations for both
 `akka.persistence.state.scaladsl.DurableStateStore` and `akka.persistence.state.javadsl.DurableStateStore`.
 One of the implementations can delegate to the other.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[DurableStateStore](javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<java.lang.Object>` | `[javadslDurableStateStore](#javadslDurableStateStore())()` | The `DurableStateStore` implementation for the Java API. |
	| `[DurableStateStore](scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<java.lang.Object>` | `[scaladslDurableStateStore](#scaladslDurableStateStore())()` | The `DurableStateStore` implementation for the Scala API. |

- - ### Method Detail
	
	
	
		- #### javadslDurableStateStore
		
		
		
		```
		[DurableStateStore](javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<java.lang.Object> javadslDurableStateStore()
		```
		
		The `DurableStateStore` implementation for the Java API.
		 This corresponds to the instance that is returned by [`DurableStateStoreRegistry.getDurableStateStoreFor(java.lang.Class<T>, java.lang.String)`](DurableStateStoreRegistry.html#getDurableStateStoreFor(java.lang.Class,java.lang.String)).
		- #### scaladslDurableStateStore
		
		
		
		```
		[DurableStateStore](scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<java.lang.Object> scaladslDurableStateStore()
		```
		
		The `DurableStateStore` implementation for the Scala API.
		 This corresponds to the instance that is returned by [`DurableStateStoreRegistry.durableStateStoreFor(java.lang.String)`](DurableStateStoreRegistry.html#durableStateStoreFor(java.lang.String)).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/state/DurableStateStoreRegistry.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/state/DurableStateStoreProvider.html](https://doc.akka.io/japi/akka/current/akka/persistence/state/DurableStateStoreProvider.html)*
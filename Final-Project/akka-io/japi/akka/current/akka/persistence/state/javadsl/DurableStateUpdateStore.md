---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateStore.html
title: DurableStateUpdateStore
---

# DurableStateUpdateStore

## Content

Package [akka.persistence.state.javadsl](package-summary.html)
## Interface DurableStateUpdateStore\<A\>

- All Superinterfaces:
`[DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>`

All Known Subinterfaces:
`[DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.javadsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.javadsl")`

---

```
public interface DurableStateUpdateStore<A>
extends [DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>
```

API for updating durable state objects.
 
 For Scala API see [`DurableStateUpdateStore`](../scaladsl/DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl").
 

 See also [`DurableStateUpdateWithChangeEventStore`](DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.javadsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String))​(java.lang.String persistenceId)` | Deprecated. Use the deleteObject overload with revision instead. |
	| `java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String,long))​(java.lang.String persistenceId,  long revision)` |  |
	| `java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")>` | `[upsertObject](#upsertObject(java.lang.String,long,A,java.lang.String))​(java.lang.String persistenceId,  long revision,  [A](DurableStateUpdateStore.html "type parameter in DurableStateUpdateStore") value,  java.lang.String tag)` |  |
	
	
		- ### Methods inherited from interface akka.persistence.state.javadsl.[DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.javadsl")
		
		
		`[getObject](DurableStateStore.html#getObject(java.lang.String))`

- - ### Method Detail
	
	
	
		- #### deleteObject
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId)
		```
		
		Deprecated.
		Use the deleteObject overload with revision instead. Since 2\.6\.20\.
		- #### deleteObject
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId,
		                                                        long revision)
		```
		- #### upsertObject
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")> upsertObject​(java.lang.String persistenceId,
		                                                        long revision,
		                                                        [A](DurableStateUpdateStore.html "type parameter in DurableStateUpdateStore") value,
		                                                        java.lang.String tag)
		```
		
		
		Parameters:
		`revision` \- sequence number for optimistic locking. starts at 1\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateStore.html](https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateStore.html)*
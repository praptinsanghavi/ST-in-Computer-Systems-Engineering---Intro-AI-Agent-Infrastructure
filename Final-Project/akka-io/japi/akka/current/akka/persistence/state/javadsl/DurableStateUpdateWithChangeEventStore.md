---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
title: DurableStateUpdateWithChangeEventStore
---

# DurableStateUpdateWithChangeEventStore

## Content

Package [akka.persistence.state.javadsl](package-summary.html)
## Interface DurableStateUpdateWithChangeEventStore\<A\>

- All Superinterfaces:
`[DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>`, `[DurableStateUpdateStore](DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.javadsl")`

---

```
public interface DurableStateUpdateWithChangeEventStore<A>
extends [DurableStateUpdateStore](DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")<A>
```

API May Change: API for updating durable state objects and storing additional change event.
 
 For Scala API see [`DurableStateUpdateWithChangeEventStore`](../scaladsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.scaladsl").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String,long,java.lang.Object))​(java.lang.String persistenceId,  long revision,  java.lang.Object changeEvent)` |  |
	| `java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")>` | `[upsertObject](#upsertObject(java.lang.String,long,A,java.lang.String,java.lang.Object))​(java.lang.String persistenceId,  long revision,  [A](DurableStateUpdateWithChangeEventStore.html "type parameter in DurableStateUpdateWithChangeEventStore") value,  java.lang.String tag,  java.lang.Object changeEvent)` | The `changeEvent` is written to the event journal. |
	
	
		- ### Methods inherited from interface akka.persistence.state.javadsl.[DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.javadsl")
		
		
		`[getObject](DurableStateStore.html#getObject(java.lang.String))`
		- ### Methods inherited from interface akka.persistence.state.javadsl.[DurableStateUpdateStore](DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")
		
		
		`[deleteObject](DurableStateUpdateStore.html#deleteObject(java.lang.String)), [deleteObject](DurableStateUpdateStore.html#deleteObject(java.lang.String,long)), [upsertObject](DurableStateUpdateStore.html#upsertObject(java.lang.String,long,A,java.lang.String))`

- - ### Method Detail
	
	
	
		- #### deleteObject
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId,
		                                                        long revision,
		                                                        java.lang.Object changeEvent)
		```
		- #### upsertObject
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")> upsertObject​(java.lang.String persistenceId,
		                                                        long revision,
		                                                        [A](DurableStateUpdateWithChangeEventStore.html "type parameter in DurableStateUpdateWithChangeEventStore") value,
		                                                        java.lang.String tag,
		                                                        java.lang.Object changeEvent)
		```
		
		The `changeEvent` is written to the event journal.
		 Same `persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.
		 
		
		Parameters:
		`revision` \- sequence number for optimistic locking. starts at 1\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html](https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html)*
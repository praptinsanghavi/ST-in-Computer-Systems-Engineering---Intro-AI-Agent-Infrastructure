---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
title: DurableStateUpdateWithChangeEventStore
---

# DurableStateUpdateWithChangeEventStore

## Content

Package [akka.persistence.state.scaladsl](package-summary.html)
## Interface DurableStateUpdateWithChangeEventStore\<A\>

- All Superinterfaces:
`[DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.scaladsl")<A>`, `[DurableStateUpdateStore](DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")`

---

```
public interface DurableStateUpdateWithChangeEventStore<A>
extends [DurableStateUpdateStore](DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")<A>
```

API May Change: API for updating durable state objects and storing additional change event.
 
 For Java API see [`DurableStateUpdateWithChangeEventStore`](../javadsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.javadsl").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[Done](../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String,long,java.lang.Object))​(java.lang.String persistenceId,  long revision,  java.lang.Object changeEvent)` |  |
	| `scala.concurrent.Future<[Done](../../../Done.html "class in akka")>` | `[upsertObject](#upsertObject(java.lang.String,long,A,java.lang.String,java.lang.Object))​(java.lang.String persistenceId,  long revision,  [A](DurableStateUpdateWithChangeEventStore.html "type parameter in DurableStateUpdateWithChangeEventStore") value,  java.lang.String tag,  java.lang.Object changeEvent)` | The `changeEvent` is written to the event journal. |
	
	
		- ### Methods inherited from interface akka.persistence.state.scaladsl.[DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.scaladsl")
		
		
		`[getObject](DurableStateStore.html#getObject(java.lang.String))`
		- ### Methods inherited from interface akka.persistence.state.scaladsl.[DurableStateUpdateStore](DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")
		
		
		`[deleteObject](DurableStateUpdateStore.html#deleteObject(java.lang.String)), [deleteObject](DurableStateUpdateStore.html#deleteObject(java.lang.String,long)), [upsertObject](DurableStateUpdateStore.html#upsertObject(java.lang.String,long,A,java.lang.String))`

- - ### Method Detail
	
	
	
		- #### deleteObject
		
		
		
		```
		scala.concurrent.Future<[Done](../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId,
		                                           long revision,
		                                           java.lang.Object changeEvent)
		```
		- #### upsertObject
		
		
		
		```
		scala.concurrent.Future<[Done](../../../Done.html "class in akka")> upsertObject​(java.lang.String persistenceId,
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
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html](https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html)*
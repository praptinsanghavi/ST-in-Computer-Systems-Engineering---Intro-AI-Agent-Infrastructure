---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
title: DurableStateUpdateStore
---

# DurableStateUpdateStore

## Content

Package [akka.persistence.state.scaladsl](package-summary.html)
## Interface DurableStateUpdateStore\<A\>

- All Superinterfaces:
`[DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.scaladsl")<A>`

All Known Subinterfaces:
`[DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.scaladsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")`

---

```
public interface DurableStateUpdateStore<A>
extends [DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.scaladsl")<A>
```

API for updating durable state objects.
 
 For Java API see [`DurableStateUpdateStore`](../javadsl/DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl").
 

 See also [`DurableStateUpdateWithChangeEventStore`](DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.scaladsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[Done](../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String))​(java.lang.String persistenceId)` | Deprecated. Use the deleteObject overload with revision instead. |
	| `scala.concurrent.Future<[Done](../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String,long))​(java.lang.String persistenceId,  long revision)` |  |
	| `scala.concurrent.Future<[Done](../../../Done.html "class in akka")>` | `[upsertObject](#upsertObject(java.lang.String,long,A,java.lang.String))​(java.lang.String persistenceId,  long revision,  [A](DurableStateUpdateStore.html "type parameter in DurableStateUpdateStore") value,  java.lang.String tag)` |  |
	
	
		- ### Methods inherited from interface akka.persistence.state.scaladsl.[DurableStateStore](DurableStateStore.html "interface in akka.persistence.state.scaladsl")
		
		
		`[getObject](DurableStateStore.html#getObject(java.lang.String))`

- - ### Method Detail
	
	
	
		- #### deleteObject
		
		
		
		```
		scala.concurrent.Future<[Done](../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId)
		```
		
		Deprecated.
		Use the deleteObject overload with revision instead. Since 2\.6\.20\.
		- #### deleteObject
		
		
		
		```
		scala.concurrent.Future<[Done](../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId,
		                                           long revision)
		```
		- #### upsertObject
		
		
		
		```
		scala.concurrent.Future<[Done](../../../Done.html "class in akka")> upsertObject​(java.lang.String persistenceId,
		                                           long revision,
		                                           [A](DurableStateUpdateStore.html "type parameter in DurableStateUpdateStore") value,
		                                           java.lang.String tag)
		```
		
		
		Parameters:
		`revision` \- sequence number for optimistic locking. starts at 1\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateStore.html](https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateStore.html)*
---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ExpectOps.html
title: ExpectOps
---

# ExpectOps

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface ExpectOps\<U\>

- All Known Implementing Classes:
`[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")`, `[SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface ExpectOps<U>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A> A` | `[expectNextPersisted](#expectNextPersisted(java.lang.String,A))​(java.lang.String persistenceId,  A event)` | Check that next persisted in storage for particular persistence id event/snapshot was `event`. |
	| `<A> A` | `[expectNextPersisted](#expectNextPersisted(java.lang.String,A,scala.concurrent.duration.FiniteDuration))​(java.lang.String persistenceId,  A event,  scala.concurrent.duration.FiniteDuration max)` | Check for `max` time that next persisted in storage for particular persistence id event/snapshot was `event`. |
	| `<A> A` | `[expectNextPersistedClass](#expectNextPersistedClass(java.lang.String,java.lang.Class))​(java.lang.String persistenceId,  java.lang.Class<A> cla)` | Check that next persisted in storage for particular persistence id event/snapshot has expected type. |
	| `<A> A` | `[expectNextPersistedClass](#expectNextPersistedClass(java.lang.String,java.lang.Class,scala.concurrent.duration.FiniteDuration))​(java.lang.String persistenceId,  java.lang.Class<A> cla,  scala.concurrent.duration.FiniteDuration max)` | Check for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type. |
	| `<A> A` | `[expectNextPersistedType](#expectNextPersistedType(java.lang.String,scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag))​(java.lang.String persistenceId,  scala.concurrent.duration.FiniteDuration max,  scala.reflect.ClassTag<A> t)` | Check for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type. |
	| `<A> A` | `[expectNextPersistedType](#expectNextPersistedType(java.lang.String,scala.reflect.ClassTag))​(java.lang.String persistenceId,  scala.reflect.ClassTag<A> t)` | Check that next persisted in storage for particular persistence id event/snapshot has expected type. |
	| `void` | `[expectNothingPersisted](#expectNothingPersisted(java.lang.String))​(java.lang.String persistenceId)` | Check that nothing was persisted in storage for particular persistence id. |
	| `void` | `[expectNothingPersisted](#expectNothingPersisted(java.lang.String,scala.concurrent.duration.FiniteDuration))​(java.lang.String persistenceId,  scala.concurrent.duration.FiniteDuration max)` | Check for `max` time that nothing was persisted in storage for particular persistence id. |
	| `scala.Option<java.lang.Object>` | `[getItem](#getItem(java.lang.String,int))​(java.lang.String persistenceId,  int nextInd)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[maxTimeout](#maxTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[pollInterval](#pollInterval())()` |  |
	| `[TestKitBase](../../../testkit/TestKitBase.html "interface in akka.testkit")` | `[probe](#probe())()` |  |
	| `<A> scala.collection.immutable.Seq<A>` | `[receivePersisted](#receivePersisted(java.lang.String,int,java.lang.Class))​(java.lang.String persistenceId,  int n,  java.lang.Class<A> cla)` | Receive next `n` events/snapshots that have been persisted in the storage. |
	| `<A> scala.collection.immutable.Seq<A>` | `[receivePersisted](#receivePersisted(java.lang.String,int,java.lang.Class,scala.concurrent.duration.FiniteDuration))​(java.lang.String persistenceId,  int n,  java.lang.Class<A> cla,  scala.concurrent.duration.FiniteDuration max)` | Receive for `max` time next `n` events/snapshots that have been persisted in the storage. |
	| `<A> scala.collection.immutable.Seq<A>` | `[receivePersisted](#receivePersisted(java.lang.String,int,scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag))​(java.lang.String persistenceId,  int n,  scala.concurrent.duration.FiniteDuration max,  scala.reflect.ClassTag<A> t)` | Receive for `max` time next `n` events/snapshots that have been persisted in the storage. |
	| `<A> scala.collection.immutable.Seq<A>` | `[receivePersisted](#receivePersisted(java.lang.String,int,scala.reflect.ClassTag))​(java.lang.String persistenceId,  int n,  scala.reflect.ClassTag<A> t)` | Receive next `n` events/snapshots that have been persisted in the storage. |
	| `java.lang.Object` | `[reprToAny](#reprToAny(U))​([U](ExpectOps.html "type parameter in ExpectOps") repr)` |  |

- - ### Method Detail
	
	
	
		- #### expectNextPersisted
		
		
		
		```
		<A> A expectNextPersisted​(java.lang.String persistenceId,
		                          A event)
		```
		
		Check that next persisted in storage for particular persistence id event/snapshot was `event`.
		- #### expectNextPersisted
		
		
		
		```
		<A> A expectNextPersisted​(java.lang.String persistenceId,
		                          A event,
		                          scala.concurrent.duration.FiniteDuration max)
		```
		
		Check for `max` time that next persisted in storage for particular persistence id event/snapshot was `event`.
		- #### expectNextPersistedClass
		
		
		
		```
		<A> A expectNextPersistedClass​(java.lang.String persistenceId,
		                               java.lang.Class<A> cla)
		```
		
		Check that next persisted in storage for particular persistence id event/snapshot has expected type.
		- #### expectNextPersistedClass
		
		
		
		```
		<A> A expectNextPersistedClass​(java.lang.String persistenceId,
		                               java.lang.Class<A> cla,
		                               scala.concurrent.duration.FiniteDuration max)
		```
		
		Check for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.
		- #### expectNextPersistedType
		
		
		
		```
		<A> A expectNextPersistedType​(java.lang.String persistenceId,
		                              scala.reflect.ClassTag<A> t)
		```
		
		Check that next persisted in storage for particular persistence id event/snapshot has expected type.
		- #### expectNextPersistedType
		
		
		
		```
		<A> A expectNextPersistedType​(java.lang.String persistenceId,
		                              scala.concurrent.duration.FiniteDuration max,
		                              scala.reflect.ClassTag<A> t)
		```
		
		Check for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.
		- #### expectNothingPersisted
		
		
		
		```
		void expectNothingPersisted​(java.lang.String persistenceId)
		```
		
		Check that nothing was persisted in storage for particular persistence id.
		- #### expectNothingPersisted
		
		
		
		```
		void expectNothingPersisted​(java.lang.String persistenceId,
		                            scala.concurrent.duration.FiniteDuration max)
		```
		
		Check for `max` time that nothing was persisted in storage for particular persistence id.
		- #### getItem
		
		
		
		```
		scala.Option<java.lang.Object> getItem​(java.lang.String persistenceId,
		                                       int nextInd)
		```
		- #### maxTimeout
		
		
		
		```
		scala.concurrent.duration.FiniteDuration maxTimeout()
		```
		- #### pollInterval
		
		
		
		```
		scala.concurrent.duration.FiniteDuration pollInterval()
		```
		- #### probe
		
		
		
		```
		[TestKitBase](../../../testkit/TestKitBase.html "interface in akka.testkit") probe()
		```
		- #### receivePersisted
		
		
		
		```
		<A> scala.collection.immutable.Seq<A> receivePersisted​(java.lang.String persistenceId,
		                                                       int n,
		                                                       scala.concurrent.duration.FiniteDuration max,
		                                                       scala.reflect.ClassTag<A> t)
		```
		
		Receive for `max` time next `n` events/snapshots that have been persisted in the storage.
		- #### receivePersisted
		
		
		
		```
		<A> scala.collection.immutable.Seq<A> receivePersisted​(java.lang.String persistenceId,
		                                                       int n,
		                                                       scala.reflect.ClassTag<A> t)
		```
		
		Receive next `n` events/snapshots that have been persisted in the storage.
		- #### receivePersisted
		
		
		
		```
		<A> scala.collection.immutable.Seq<A> receivePersisted​(java.lang.String persistenceId,
		                                                       int n,
		                                                       java.lang.Class<A> cla)
		```
		
		Receive next `n` events/snapshots that have been persisted in the storage.
		- #### receivePersisted
		
		
		
		```
		<A> scala.collection.immutable.Seq<A> receivePersisted​(java.lang.String persistenceId,
		                                                       int n,
		                                                       java.lang.Class<A> cla,
		                                                       scala.concurrent.duration.FiniteDuration max)
		```
		
		Receive for `max` time next `n` events/snapshots that have been persisted in the storage.
		- #### reprToAny
		
		
		
		```
		java.lang.Object reprToAny​([U](ExpectOps.html "type parameter in ExpectOps") repr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ExpectOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestKitBase.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ExpectOps.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ExpectOps.html)*
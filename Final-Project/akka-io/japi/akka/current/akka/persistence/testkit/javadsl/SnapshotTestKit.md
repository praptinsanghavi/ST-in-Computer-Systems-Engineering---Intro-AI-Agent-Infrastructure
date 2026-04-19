---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html
title: SnapshotTestKit
---

# SnapshotTestKit

## Content

Package [akka.persistence.testkit.javadsl](package-summary.html)
## Class SnapshotTestKit

- java.lang.Object
- - akka.persistence.testkit.javadsl.SnapshotTestKit

- ---

```
public class SnapshotTestKit
extends java.lang.Object
```

Class for testing persisted snapshots in persistent actors.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotTestKit](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[SnapshotTestKit](#%3Cinit%3E(akka.persistence.testkit.scaladsl.SnapshotTestKit))​([SnapshotTestKit](../scaladsl/SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl") scalaTestkit)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clearAll](#clearAll())()` | Clear all data from storage. |
	| `void` | `[clearByPersistenceId](#clearByPersistenceId(java.lang.String))​(java.lang.String persistenceId)` | Clear all data from storage for particular persistence id. |
	| `static [SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.javadsl")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.javadsl")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `<A> A` | `[expectNextPersisted](#expectNextPersisted(java.lang.String,A))​(java.lang.String persistenceId,  A snapshot)` | Check that `snapshot` has been saved in the storage. |
	| `<A> A` | `[expectNextPersisted](#expectNextPersisted(java.lang.String,A,java.time.Duration))​(java.lang.String persistenceId,  A snapshot,  java.time.Duration max)` | Check for `max` time that `snapshot` has been saved in the storage. |
	| `<A> A` | `[expectNextPersistedClass](#expectNextPersistedClass(java.lang.String,java.lang.Class))​(java.lang.String persistenceId,  java.lang.Class<A> cla)` | Check that next persisted in storage for particular persistence id snapshot has expected type. |
	| `<A> A` | `[expectNextPersistedClass](#expectNextPersistedClass(java.lang.String,java.lang.Class,java.time.Duration))​(java.lang.String persistenceId,  java.lang.Class<A> cla,  java.time.Duration max)` | Check for `max` time that next persisted in storage for particular persistence id snapshot has expected type. |
	| `void` | `[expectNothingPersisted](#expectNothingPersisted(java.lang.String))​(java.lang.String persistenceId)` | Check that nothing has been saved in the storage. |
	| `void` | `[expectNothingPersisted](#expectNothingPersisted(java.lang.String,java.time.Duration))​(java.lang.String persistenceId,  java.time.Duration max)` | Check for `max` time that nothing has been saved in the storage. |
	| `void` | `[failNextDelete](#failNextDelete())()` | Fail next delete from storage attempt with default exception for any persistence id. |
	| `void` | `[failNextDelete](#failNextDelete(java.lang.String))​(java.lang.String persistenceId)` | Fail next delete from storage attempt with default exception for particular persistence id. |
	| `void` | `[failNextDelete](#failNextDelete(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Fail next delete from storage attempt with `cause` exception for particular persistence id. |
	| `void` | `[failNextDelete](#failNextDelete(java.lang.Throwable))​(java.lang.Throwable cause)` | Fail next delete from storage attempt with `cause` exception for any persistence id. |
	| `void` | `[failNextNDeletes](#failNextNDeletes(int))​(int n)` | Fail next n delete from storage attempts with default exception for any persistence id. |
	| `void` | `[failNextNDeletes](#failNextNDeletes(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Fail next n delete from storage attempts with `cause` exception for any persistence id. |
	| `void` | `[failNextNDeletes](#failNextNDeletes(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Fail next n delete from storage attempts with default exception for particular persistence id. |
	| `void` | `[failNextNDeletes](#failNextNDeletes(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Fail next n delete from storage attempts with `cause` exception for particular persistence id. |
	| `void` | `[failNextNOps](#failNextNOps(int))​(int n)` | Fail n following journal operations regardless of their type. |
	| `void` | `[failNextNOps](#failNextNOps(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Fail `n` following journal operations depending on the condition `cond`. |
	| `void` | `[failNextNOpsCond](#failNextNOpsCond(java.util.function.BiFunction,int))​(java.util.function.BiFunction<java.lang.String,​[SnapshotOperation](../SnapshotOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,  int n)` | Fail `n` following journal operations depending on the condition `cond`. |
	| `void` | `[failNextNOpsCond](#failNextNOpsCond(java.util.function.BiFunction,int,java.lang.Throwable))​(java.util.function.BiFunction<java.lang.String,​[SnapshotOperation](../SnapshotOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,  int n,  java.lang.Throwable cause)` | Fail `n` following journal operations depending on the condition `cond`. |
	| `void` | `[failNextNPersisted](#failNextNPersisted(int))​(int n)` | Fail next `n` write operations with default exception for any persistence id. |
	| `void` | `[failNextNPersisted](#failNextNPersisted(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Fail next `n` write operations with the `cause` exception for any persistence id. |
	| `void` | `[failNextNPersisted](#failNextNPersisted(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Fail next `n` write operations for particular persistence id. |
	| `void` | `[failNextNPersisted](#failNextNPersisted(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Fail next `n` write operations with the `cause` exception for particular persistence id. |
	| `void` | `[failNextNReads](#failNextNReads(int))​(int n)` | Fail next n read from storage (recovery) attempts with default exception for any persistence id. |
	| `void` | `[failNextNReads](#failNextNReads(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id. |
	| `void` | `[failNextNReads](#failNextNReads(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Fail next n read from storage (recovery) attempts with default exception for particular persistence id. |
	| `void` | `[failNextNReads](#failNextNReads(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id. |
	| `void` | `[failNextPersisted](#failNextPersisted())()` | Fail next write operations with default exception for any persistence id. |
	| `void` | `[failNextPersisted](#failNextPersisted(java.lang.String))​(java.lang.String persistenceId)` | Fail next write operations with default exception for particular persistence id. |
	| `void` | `[failNextPersisted](#failNextPersisted(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Fail next write operations with `cause` exception for particular persistence id. |
	| `void` | `[failNextPersisted](#failNextPersisted(java.lang.Throwable))​(java.lang.Throwable cause)` | Fail next write operations with `cause` exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead())()` | Fail next read from storage (recovery) attempt with default exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.String))​(java.lang.String persistenceId)` | Fail next read from storage (recovery) attempt with default exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.Throwable))​(java.lang.Throwable cause)` | Fail next read from storage (recovery) attempt with `cause` exception for any persistence id. |
	| `java.util.List<[Pair](../../../japi/Pair.html "class in akka.japi")<[SnapshotMeta](../SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object>>` | `[persistedInStorage](#persistedInStorage(java.lang.String))​(java.lang.String persistenceId)` | Retrieve all snapshots and their metadata saved in storage by persistence id. |
	| `void` | `[persistForRecovery](#persistForRecovery(java.lang.String,java.util.List))​(java.lang.String persistenceId,  java.util.List<[Pair](../../../japi/Pair.html "class in akka.japi")<[SnapshotMeta](../SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object>> snapshots)` | Persist `snapshots` with metadata into storage in order. |
	| `<A> java.util.List<A>` | `[receivePersisted](#receivePersisted(java.lang.String,int,java.lang.Class))​(java.lang.String persistenceId,  int n,  java.lang.Class<A> cla)` | Receive next `n` snapshots that have been persisted in the storage. |
	| `<A> java.util.List<A>` | `[receivePersisted](#receivePersisted(java.lang.String,int,java.lang.Class,java.time.Duration))​(java.lang.String persistenceId,  int n,  java.lang.Class<A> cla,  java.time.Duration max)` | Receive for `max` time next `n` snapshots that have been persisted in the storage. |
	| `void` | `[resetPolicy](#resetPolicy())()` | Returns default policy if it was changed by {@link SnapshotTestKit.withPolicy()}. |
	| `[SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.javadsl")` | `[withPolicy](#withPolicy(akka.persistence.testkit.ProcessingPolicy))​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[SnapshotOperation](../SnapshotOperation.html "interface in akka.persistence.testkit")> policy)` | Set new processing policy for journal operations. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SnapshotTestKit
		
		
		
		```
		public SnapshotTestKit​([SnapshotTestKit](../scaladsl/SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl") scalaTestkit)
		```
		- #### SnapshotTestKit
		
		
		
		```
		public SnapshotTestKit​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.javadsl") create​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### create
		
		
		
		```
		public static [SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.javadsl") create​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### expectNothingPersisted
		
		
		
		```
		public void expectNothingPersisted​(java.lang.String persistenceId)
		```
		
		Check that nothing has been saved in the storage.
		- #### expectNothingPersisted
		
		
		
		```
		public void expectNothingPersisted​(java.lang.String persistenceId,
		                                   java.time.Duration max)
		```
		
		Check for `max` time that nothing has been saved in the storage.
		- #### expectNextPersisted
		
		
		
		```
		public <A> A expectNextPersisted​(java.lang.String persistenceId,
		                                 A snapshot)
		```
		
		Check that `snapshot` has been saved in the storage.
		- #### expectNextPersisted
		
		
		
		```
		public <A> A expectNextPersisted​(java.lang.String persistenceId,
		                                 A snapshot,
		                                 java.time.Duration max)
		```
		
		Check for `max` time that `snapshot` has been saved in the storage.
		- #### expectNextPersistedClass
		
		
		
		```
		public <A> A expectNextPersistedClass​(java.lang.String persistenceId,
		                                      java.lang.Class<A> cla)
		```
		
		Check that next persisted in storage for particular persistence id snapshot has expected type.
		- #### expectNextPersistedClass
		
		
		
		```
		public <A> A expectNextPersistedClass​(java.lang.String persistenceId,
		                                      java.lang.Class<A> cla,
		                                      java.time.Duration max)
		```
		
		Check for `max` time that next persisted in storage for particular persistence id snapshot has expected type.
		- #### failNextNPersisted
		
		
		
		```
		public void failNextNPersisted​(java.lang.String persistenceId,
		                               int n,
		                               java.lang.Throwable cause)
		```
		
		Fail next `n` write operations with the `cause` exception for particular persistence id.
		- #### failNextNPersisted
		
		
		
		```
		public void failNextNPersisted​(java.lang.String persistenceId,
		                               int n)
		```
		
		Fail next `n` write operations for particular persistence id.
		- #### failNextNPersisted
		
		
		
		```
		public void failNextNPersisted​(int n,
		                               java.lang.Throwable cause)
		```
		
		Fail next `n` write operations with the `cause` exception for any persistence id.
		- #### failNextNPersisted
		
		
		
		```
		public void failNextNPersisted​(int n)
		```
		
		Fail next `n` write operations with default exception for any persistence id.
		- #### failNextPersisted
		
		
		
		```
		public void failNextPersisted​(java.lang.String persistenceId,
		                              java.lang.Throwable cause)
		```
		
		Fail next write operations with `cause` exception for particular persistence id.
		- #### failNextPersisted
		
		
		
		```
		public void failNextPersisted​(java.lang.String persistenceId)
		```
		
		Fail next write operations with default exception for particular persistence id.
		- #### failNextPersisted
		
		
		
		```
		public void failNextPersisted​(java.lang.Throwable cause)
		```
		
		Fail next write operations with `cause` exception for any persistence id.
		- #### failNextPersisted
		
		
		
		```
		public void failNextPersisted()
		```
		
		Fail next write operations with default exception for any persistence id.
		- #### failNextRead
		
		
		
		```
		public void failNextRead​(java.lang.Throwable cause)
		```
		
		Fail next read from storage (recovery) attempt with `cause` exception for any persistence id.
		- #### failNextRead
		
		
		
		```
		public void failNextRead()
		```
		
		Fail next read from storage (recovery) attempt with default exception for any persistence id.
		- #### failNextRead
		
		
		
		```
		public void failNextRead​(java.lang.String persistenceId,
		                         java.lang.Throwable cause)
		```
		
		Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id.
		- #### failNextRead
		
		
		
		```
		public void failNextRead​(java.lang.String persistenceId)
		```
		
		Fail next read from storage (recovery) attempt with default exception for any persistence id.
		- #### failNextNReads
		
		
		
		```
		public void failNextNReads​(int n,
		                           java.lang.Throwable cause)
		```
		
		Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id.
		- #### failNextNReads
		
		
		
		```
		public void failNextNReads​(int n)
		```
		
		Fail next n read from storage (recovery) attempts with default exception for any persistence id.
		- #### failNextNReads
		
		
		
		```
		public void failNextNReads​(java.lang.String persistenceId,
		                           int n,
		                           java.lang.Throwable cause)
		```
		
		Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id.
		- #### failNextNReads
		
		
		
		```
		public void failNextNReads​(java.lang.String persistenceId,
		                           int n)
		```
		
		Fail next n read from storage (recovery) attempts with default exception for particular persistence id.
		- #### failNextDelete
		
		
		
		```
		public void failNextDelete​(java.lang.Throwable cause)
		```
		
		Fail next delete from storage attempt with `cause` exception for any persistence id.
		- #### failNextDelete
		
		
		
		```
		public void failNextDelete()
		```
		
		Fail next delete from storage attempt with default exception for any persistence id.
		- #### failNextDelete
		
		
		
		```
		public void failNextDelete​(java.lang.String persistenceId,
		                           java.lang.Throwable cause)
		```
		
		Fail next delete from storage attempt with `cause` exception for particular persistence id.
		- #### failNextDelete
		
		
		
		```
		public void failNextDelete​(java.lang.String persistenceId)
		```
		
		Fail next delete from storage attempt with default exception for particular persistence id.
		- #### failNextNDeletes
		
		
		
		```
		public void failNextNDeletes​(int n,
		                             java.lang.Throwable cause)
		```
		
		Fail next n delete from storage attempts with `cause` exception for any persistence id.
		- #### failNextNDeletes
		
		
		
		```
		public void failNextNDeletes​(int n)
		```
		
		Fail next n delete from storage attempts with default exception for any persistence id.
		- #### failNextNDeletes
		
		
		
		```
		public void failNextNDeletes​(java.lang.String persistenceId,
		                             int n,
		                             java.lang.Throwable cause)
		```
		
		Fail next n delete from storage attempts with `cause` exception for particular persistence id.
		- #### failNextNDeletes
		
		
		
		```
		public void failNextNDeletes​(java.lang.String persistenceId,
		                             int n)
		```
		
		Fail next n delete from storage attempts with default exception for particular persistence id.
		- #### receivePersisted
		
		
		
		```
		public <A> java.util.List<A> receivePersisted​(java.lang.String persistenceId,
		                                              int n,
		                                              java.lang.Class<A> cla)
		```
		
		Receive next `n` snapshots that have been persisted in the storage.
		- #### receivePersisted
		
		
		
		```
		public <A> java.util.List<A> receivePersisted​(java.lang.String persistenceId,
		                                              int n,
		                                              java.lang.Class<A> cla,
		                                              java.time.Duration max)
		```
		
		Receive for `max` time next `n` snapshots that have been persisted in the storage.
		- #### persistForRecovery
		
		
		
		```
		public void persistForRecovery​(java.lang.String persistenceId,
		                               java.util.List<[Pair](../../../japi/Pair.html "class in akka.japi")<[SnapshotMeta](../SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object>> snapshots)
		```
		
		Persist `snapshots` with metadata into storage in order.
		- #### persistedInStorage
		
		
		
		```
		public java.util.List<[Pair](../../../japi/Pair.html "class in akka.japi")<[SnapshotMeta](../SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object>> persistedInStorage​(java.lang.String persistenceId)
		```
		
		Retrieve all snapshots and their metadata saved in storage by persistence id.
		- #### clearAll
		
		
		
		```
		public void clearAll()
		```
		
		Clear all data from storage.
		- #### clearByPersistenceId
		
		
		
		```
		public void clearByPersistenceId​(java.lang.String persistenceId)
		```
		
		Clear all data from storage for particular persistence id.
		- #### failNextNOpsCond
		
		
		
		```
		public void failNextNOpsCond​(java.util.function.BiFunction<java.lang.String,​[SnapshotOperation](../SnapshotOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,
		                             int n)
		```
		
		Fail `n` following journal operations depending on the condition `cond`.
		 Failure triggers, when `cond` returns true.
		 Fails operations with default `ExpectedFailure` exception.
		- #### failNextNOpsCond
		
		
		
		```
		public void failNextNOpsCond​(java.util.function.BiFunction<java.lang.String,​[SnapshotOperation](../SnapshotOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,
		                             int n,
		                             java.lang.Throwable cause)
		```
		
		Fail `n` following journal operations depending on the condition `cond`.
		 Failure triggers, when `cond` returns true.
		 Fails operations with the `cause` exception.
		- #### failNextNOps
		
		
		
		```
		public void failNextNOps​(int n)
		```
		
		Fail n following journal operations regardless of their type.
		 Fails operations with default `ExpectedFailure` exception.
		- #### failNextNOps
		
		
		
		```
		public void failNextNOps​(int n,
		                         java.lang.Throwable cause)
		```
		
		Fail `n` following journal operations depending on the condition `cond`.
		 Failure triggers, when `cond` returns true.
		 Fails operations with the `cause` exception.
		- #### withPolicy
		
		
		
		```
		public [SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.javadsl") withPolicy​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[SnapshotOperation](../SnapshotOperation.html "interface in akka.persistence.testkit")> policy)
		```
		
		Set new processing policy for journal operations.
		 NOTE! Overrides previously invoked `failNext...` or `rejectNext...`
		- #### resetPolicy
		
		
		
		```
		public void resetPolicy()
		```
		
		Returns default policy if it was changed by {@link SnapshotTestKit.withPolicy()}.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html)*
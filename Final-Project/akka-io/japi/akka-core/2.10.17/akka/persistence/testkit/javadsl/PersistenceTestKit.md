---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceTestKit.html
title: PersistenceTestKit
---

# PersistenceTestKit

## Content

Package [akka.persistence.testkit.javadsl](package-summary.html)
## Class PersistenceTestKit

- java.lang.Object
- - akka.persistence.testkit.javadsl.PersistenceTestKit

- ---

```
public class PersistenceTestKit
extends java.lang.Object
```

Class for testing persisted events in persistent actors.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceTestKit](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[PersistenceTestKit](#%3Cinit%3E(akka.persistence.testkit.scaladsl.PersistenceTestKit))​([PersistenceTestKit](../scaladsl/PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl") scalaTestkit)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clearAll](#clearAll())()` | Clear all data from storage. |
	| `void` | `[clearAllPreservingSeqNumbers](#clearAllPreservingSeqNumbers())()` | Clear all data in storage preserving sequence numbers. |
	| `void` | `[clearByIdPreservingSeqNumbers](#clearByIdPreservingSeqNumbers(java.lang.String))​(java.lang.String persistenceId)` | Clear all data in storage for particular persistence id preserving sequence numbers. |
	| `void` | `[clearByPersistenceId](#clearByPersistenceId(java.lang.String))​(java.lang.String persistenceId)` | Clear all data from storage for particular persistence id. |
	| `static [PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.javadsl")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.javadsl")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `<A> A` | `[expectNextPersisted](#expectNextPersisted(java.lang.String,A))​(java.lang.String persistenceId,  A event)` | Check that `event` has been saved in the storage. |
	| `<A> A` | `[expectNextPersisted](#expectNextPersisted(java.lang.String,A,java.time.Duration))​(java.lang.String persistenceId,  A event,  java.time.Duration max)` | Check for `max` time that `event` has been saved in the storage. |
	| `<A> A` | `[expectNextPersistedClass](#expectNextPersistedClass(java.lang.String,java.lang.Class))​(java.lang.String persistenceId,  java.lang.Class<A> cla)` | Check that next persisted in storage for particular persistence id event has expected type. |
	| `<A> A` | `[expectNextPersistedClass](#expectNextPersistedClass(java.lang.String,java.lang.Class,java.time.Duration))​(java.lang.String persistenceId,  java.lang.Class<A> cla,  java.time.Duration max)` | Check for `max` time that next persisted in storage for particular persistence id event has expected type. |
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
	| `void` | `[failNextNOpsCond](#failNextNOpsCond(java.util.function.BiFunction,int))​(java.util.function.BiFunction<java.lang.String,​[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,  int n)` | Fail `n` following journal operations depending on the condition `cond`. |
	| `void` | `[failNextNOpsCond](#failNextNOpsCond(java.util.function.BiFunction,int,java.lang.Throwable))​(java.util.function.BiFunction<java.lang.String,​[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,  int n,  java.lang.Throwable cause)` | Fail `n` following journal operations depending on the condition `cond`. |
	| `void` | `[failNextNPersisted](#failNextNPersisted(int))​(int n)` | Fail next `n` write operations with default exception for any persistence id. |
	| `void` | `[failNextNPersisted](#failNextNPersisted(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Fail next `n` write operations with the `cause` exception for any persistence id. |
	| `void` | `[failNextNPersisted](#failNextNPersisted(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Fail next `n` write operations for particular persistence id. |
	| `void` | `[failNextNPersisted](#failNextNPersisted(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Fail next `n` write operations with the `cause` exception for particular persistence id. |
	| `void` | `[failNextNReads](#failNextNReads(int))​(int n)` | Fail next n read from storage (recovery) attempts with default exception for any persistence id. |
	| `void` | `[failNextNReads](#failNextNReads(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id. |
	| `void` | `[failNextNReads](#failNextNReads(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Fail next n read from storage (recovery) attempts with default exception for particular persistence id. |
	| `void` | `[failNextNReads](#failNextNReads(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id. |
	| `void` | `[failNextPersisted](#failNextPersisted())()` | Fail next write operation with default exception for any persistence id. |
	| `void` | `[failNextPersisted](#failNextPersisted(java.lang.String))​(java.lang.String persistenceId)` | Fail next write operation with default exception for particular persistence id. |
	| `void` | `[failNextPersisted](#failNextPersisted(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Fail next write operation with `cause` exception for particular persistence id. |
	| `void` | `[failNextPersisted](#failNextPersisted(java.lang.Throwable))​(java.lang.Throwable cause)` | Fail next write operation event with `cause` exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead())()` | Fail next read from storage (recovery) attempt with default exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.String))​(java.lang.String persistenceId)` | Fail next read from storage (recovery) attempt with default exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.Throwable))​(java.lang.Throwable cause)` | Fail next read from storage (recovery) attempt with `cause` exception for any persistence id. |
	| `java.util.List<java.lang.Object>` | `[persistedInStorage](#persistedInStorage(java.lang.String))​(java.lang.String persistenceId)` | Retrieve all events saved in storage by persistence id. |
	| `void` | `[persistForRecovery](#persistForRecovery(java.lang.String,java.util.List))​(java.lang.String persistenceId,  java.util.List<java.lang.Object> events)` | Persist `events` into storage in order. |
	| `<A> java.util.List<A>` | `[receivePersisted](#receivePersisted(java.lang.String,int,java.lang.Class))​(java.lang.String persistenceId,  int n,  java.lang.Class<A> cla)` | Receive next n events from the storage. |
	| `<A> java.util.List<A>` | `[receivePersisted](#receivePersisted(java.lang.String,int,java.lang.Class,java.time.Duration))​(java.lang.String persistenceId,  int n,  java.lang.Class<A> cla,  java.time.Duration max)` | Receive for `max` time next n events from the storage. |
	| `void` | `[rejectNextDelete](#rejectNextDelete())()` | Reject next delete from storage operation for any persistence id with default exception. |
	| `void` | `[rejectNextDelete](#rejectNextDelete(java.lang.String))​(java.lang.String persistenceId)` | Reject next delete from storage operations for particular persistence id with default exception. |
	| `void` | `[rejectNextDelete](#rejectNextDelete(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Reject next delete from storage operations for particular persistence id with `cause` exception. |
	| `void` | `[rejectNextDelete](#rejectNextDelete(java.lang.Throwable))​(java.lang.Throwable cause)` | Reject next delete from storage operation for any persistence id with `cause` exception. |
	| `void` | `[rejectNextNDeletes](#rejectNextNDeletes(int))​(int n)` | Reject next n delete from storage operations for any persistence id with default exception. |
	| `void` | `[rejectNextNDeletes](#rejectNextNDeletes(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Reject next n delete from storage operations for any persistence id with `cause` exception. |
	| `void` | `[rejectNextNDeletes](#rejectNextNDeletes(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Reject next n delete from storage operations for particular persistence id with default exception. |
	| `void` | `[rejectNextNDeletes](#rejectNextNDeletes(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Reject next n delete from storage operations for particular persistence id with `cause` exception. |
	| `void` | `[rejectNextNOps](#rejectNextNOps(int))​(int n)` | Reject n following journal operations regardless of their type. |
	| `void` | `[rejectNextNOps](#rejectNextNOps(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Reject `n` following journal operations regardless of their type. |
	| `void` | `[rejectNextNOpsCond](#rejectNextNOpsCond(java.util.function.BiFunction,int))​(java.util.function.BiFunction<java.lang.String,​[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,  int n)` | Reject `n` following journal operations depending on the condition `cond`. |
	| `void` | `[rejectNextNOpsCond](#rejectNextNOpsCond(java.util.function.BiFunction,int,java.lang.Throwable))​(java.util.function.BiFunction<java.lang.String,​[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,  int n,  java.lang.Throwable cause)` | Reject `n` following journal operations depending on the condition `cond`. |
	| `void` | `[rejectNextNPersisted](#rejectNextNPersisted(int))​(int n)` | Reject next n save in storage operations for any persistence id with default exception. |
	| `void` | `[rejectNextNPersisted](#rejectNextNPersisted(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Reject next n save in storage operations for any persistence id with `cause` exception. |
	| `void` | `[rejectNextNPersisted](#rejectNextNPersisted(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Reject next n save in storage operations for particular persistence id with default exception. |
	| `void` | `[rejectNextNPersisted](#rejectNextNPersisted(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Reject next n save in storage operations for particular persistence id with `cause` exception. |
	| `void` | `[rejectNextNReads](#rejectNextNReads(int))​(int n)` | Reject next n read from storage operations for any persistence id with default exception. |
	| `void` | `[rejectNextNReads](#rejectNextNReads(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Reject next n read from storage operations for any persistence id with `cause` exception. |
	| `void` | `[rejectNextNReads](#rejectNextNReads(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Reject next n read from storage operations for particular persistence id with default exception. |
	| `void` | `[rejectNextNReads](#rejectNextNReads(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Reject next n read from storage operations for particular persistence id with `cause` exception. |
	| `void` | `[rejectNextPersisted](#rejectNextPersisted())()` | Reject next save in storage operation for any persistence id with default exception. |
	| `void` | `[rejectNextPersisted](#rejectNextPersisted(java.lang.String))​(java.lang.String persistenceId)` | Reject next save in storage operation for particular persistence id with default exception. |
	| `void` | `[rejectNextPersisted](#rejectNextPersisted(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Reject next save in storage operation for particular persistence id with `cause` exception. |
	| `void` | `[rejectNextPersisted](#rejectNextPersisted(java.lang.Throwable))​(java.lang.Throwable cause)` | Reject next save in storage operation for any persistence id with `cause` exception. |
	| `void` | `[rejectNextRead](#rejectNextRead())()` | Reject next read from storage operation for any persistence id with default exception. |
	| `void` | `[rejectNextRead](#rejectNextRead(java.lang.String))​(java.lang.String persistenceId)` | Reject next read from storage operation for particular persistence id with default exception. |
	| `void` | `[rejectNextRead](#rejectNextRead(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Reject next read from storage operation for particular persistence id with `cause` exception. |
	| `void` | `[rejectNextRead](#rejectNextRead(java.lang.Throwable))​(java.lang.Throwable cause)` | Reject next read from storage operation for any persistence id with `cause` exception. |
	| `void` | `[resetPolicy](#resetPolicy())()` | Returns default policy if it was changed by {@link PersistenceTestKit.withPolicy()}. |
	| `[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.javadsl")` | `[withPolicy](#withPolicy(akka.persistence.testkit.ProcessingPolicy))​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit")> policy)` | Set new processing policy for journal operations. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceTestKit
		
		
		
		```
		public PersistenceTestKit​([PersistenceTestKit](../scaladsl/PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl") scalaTestkit)
		```
		- #### PersistenceTestKit
		
		
		
		```
		public PersistenceTestKit​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.javadsl") create​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### create
		
		
		
		```
		public static [PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.javadsl") create​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
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
		                                 A event)
		```
		
		Check that `event` has been saved in the storage.
		- #### expectNextPersisted
		
		
		
		```
		public <A> A expectNextPersisted​(java.lang.String persistenceId,
		                                 A event,
		                                 java.time.Duration max)
		```
		
		Check for `max` time that `event` has been saved in the storage.
		- #### expectNextPersistedClass
		
		
		
		```
		public <A> A expectNextPersistedClass​(java.lang.String persistenceId,
		                                      java.lang.Class<A> cla)
		```
		
		Check that next persisted in storage for particular persistence id event has expected type.
		- #### expectNextPersistedClass
		
		
		
		```
		public <A> A expectNextPersistedClass​(java.lang.String persistenceId,
		                                      java.lang.Class<A> cla,
		                                      java.time.Duration max)
		```
		
		Check for `max` time that next persisted in storage for particular persistence id event has expected type.
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
		
		Fail next write operation with `cause` exception for particular persistence id.
		- #### failNextPersisted
		
		
		
		```
		public void failNextPersisted​(java.lang.String persistenceId)
		```
		
		Fail next write operation with default exception for particular persistence id.
		- #### failNextPersisted
		
		
		
		```
		public void failNextPersisted​(java.lang.Throwable cause)
		```
		
		Fail next write operation event with `cause` exception for any persistence id.
		- #### failNextPersisted
		
		
		
		```
		public void failNextPersisted()
		```
		
		Fail next write operation with default exception for any persistence id.
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
		
		Receive next n events from the storage.
		- #### receivePersisted
		
		
		
		```
		public <A> java.util.List<A> receivePersisted​(java.lang.String persistenceId,
		                                              int n,
		                                              java.lang.Class<A> cla,
		                                              java.time.Duration max)
		```
		
		Receive for `max` time next n events from the storage.
		- #### rejectNextNPersisted
		
		
		
		```
		public void rejectNextNPersisted​(java.lang.String persistenceId,
		                                 int n,
		                                 java.lang.Throwable cause)
		```
		
		Reject next n save in storage operations for particular persistence id with `cause` exception.
		- #### rejectNextNPersisted
		
		
		
		```
		public void rejectNextNPersisted​(java.lang.String persistenceId,
		                                 int n)
		```
		
		Reject next n save in storage operations for particular persistence id with default exception.
		- #### rejectNextNPersisted
		
		
		
		```
		public void rejectNextNPersisted​(int n)
		```
		
		Reject next n save in storage operations for any persistence id with default exception.
		- #### rejectNextNPersisted
		
		
		
		```
		public void rejectNextNPersisted​(int n,
		                                 java.lang.Throwable cause)
		```
		
		Reject next n save in storage operations for any persistence id with `cause` exception.
		- #### rejectNextPersisted
		
		
		
		```
		public void rejectNextPersisted​(java.lang.String persistenceId)
		```
		
		Reject next save in storage operation for particular persistence id with default exception.
		- #### rejectNextPersisted
		
		
		
		```
		public void rejectNextPersisted​(java.lang.String persistenceId,
		                                java.lang.Throwable cause)
		```
		
		Reject next save in storage operation for particular persistence id with `cause` exception.
		- #### rejectNextPersisted
		
		
		
		```
		public void rejectNextPersisted​(java.lang.Throwable cause)
		```
		
		Reject next save in storage operation for any persistence id with `cause` exception.
		- #### rejectNextPersisted
		
		
		
		```
		public void rejectNextPersisted()
		```
		
		Reject next save in storage operation for any persistence id with default exception.
		- #### rejectNextRead
		
		
		
		```
		public void rejectNextRead()
		```
		
		Reject next read from storage operation for any persistence id with default exception.
		- #### rejectNextRead
		
		
		
		```
		public void rejectNextRead​(java.lang.Throwable cause)
		```
		
		Reject next read from storage operation for any persistence id with `cause` exception.
		- #### rejectNextNReads
		
		
		
		```
		public void rejectNextNReads​(int n)
		```
		
		Reject next n read from storage operations for any persistence id with default exception.
		- #### rejectNextNReads
		
		
		
		```
		public void rejectNextNReads​(int n,
		                             java.lang.Throwable cause)
		```
		
		Reject next n read from storage operations for any persistence id with `cause` exception.
		- #### rejectNextRead
		
		
		
		```
		public void rejectNextRead​(java.lang.String persistenceId)
		```
		
		Reject next read from storage operation for particular persistence id with default exception.
		- #### rejectNextRead
		
		
		
		```
		public void rejectNextRead​(java.lang.String persistenceId,
		                           java.lang.Throwable cause)
		```
		
		Reject next read from storage operation for particular persistence id with `cause` exception.
		- #### rejectNextNReads
		
		
		
		```
		public void rejectNextNReads​(java.lang.String persistenceId,
		                             int n)
		```
		
		Reject next n read from storage operations for particular persistence id with default exception.
		- #### rejectNextNReads
		
		
		
		```
		public void rejectNextNReads​(java.lang.String persistenceId,
		                             int n,
		                             java.lang.Throwable cause)
		```
		
		Reject next n read from storage operations for particular persistence id with `cause` exception.
		- #### rejectNextDelete
		
		
		
		```
		public void rejectNextDelete()
		```
		
		Reject next delete from storage operation for any persistence id with default exception.
		- #### rejectNextDelete
		
		
		
		```
		public void rejectNextDelete​(java.lang.Throwable cause)
		```
		
		Reject next delete from storage operation for any persistence id with `cause` exception.
		- #### rejectNextNDeletes
		
		
		
		```
		public void rejectNextNDeletes​(int n)
		```
		
		Reject next n delete from storage operations for any persistence id with default exception.
		- #### rejectNextNDeletes
		
		
		
		```
		public void rejectNextNDeletes​(int n,
		                               java.lang.Throwable cause)
		```
		
		Reject next n delete from storage operations for any persistence id with `cause` exception.
		- #### rejectNextDelete
		
		
		
		```
		public void rejectNextDelete​(java.lang.String persistenceId)
		```
		
		Reject next delete from storage operations for particular persistence id with default exception.
		- #### rejectNextDelete
		
		
		
		```
		public void rejectNextDelete​(java.lang.String persistenceId,
		                             java.lang.Throwable cause)
		```
		
		Reject next delete from storage operations for particular persistence id with `cause` exception.
		- #### rejectNextNDeletes
		
		
		
		```
		public void rejectNextNDeletes​(java.lang.String persistenceId,
		                               int n)
		```
		
		Reject next n delete from storage operations for particular persistence id with default exception.
		- #### rejectNextNDeletes
		
		
		
		```
		public void rejectNextNDeletes​(java.lang.String persistenceId,
		                               int n,
		                               java.lang.Throwable cause)
		```
		
		Reject next n delete from storage operations for particular persistence id with `cause` exception.
		- #### rejectNextNOpsCond
		
		
		
		```
		public void rejectNextNOpsCond​(java.util.function.BiFunction<java.lang.String,​[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,
		                               int n)
		```
		
		Reject `n` following journal operations depending on the condition `cond`.
		 Rejection triggers, when `cond` returns true.
		 Reject operations with default `ExpectedRejection` exception.
		- #### rejectNextNOpsCond
		
		
		
		```
		public void rejectNextNOpsCond​(java.util.function.BiFunction<java.lang.String,​[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,
		                               int n,
		                               java.lang.Throwable cause)
		```
		
		Reject `n` following journal operations depending on the condition `cond`.
		 Rejection triggers, when `cond` returns true.
		 Rejects operations with the `cause` exception.
		- #### rejectNextNOps
		
		
		
		```
		public void rejectNextNOps​(int n)
		```
		
		Reject n following journal operations regardless of their type.
		 Rejects operations with default `ExpectedRejection` exception.
		- #### rejectNextNOps
		
		
		
		```
		public void rejectNextNOps​(int n,
		                           java.lang.Throwable cause)
		```
		
		Reject `n` following journal operations regardless of their type.
		 Rejects operations with the `cause` exception.
		- #### persistForRecovery
		
		
		
		```
		public void persistForRecovery​(java.lang.String persistenceId,
		                               java.util.List<java.lang.Object> events)
		```
		
		Persist `events` into storage in order.
		- #### persistedInStorage
		
		
		
		```
		public java.util.List<java.lang.Object> persistedInStorage​(java.lang.String persistenceId)
		```
		
		Retrieve all events saved in storage by persistence id.
		- #### clearAll
		
		
		
		```
		public void clearAll()
		```
		
		Clear all data from storage.
		 
		 NOTE! Also clears sequence numbers in storage!
		- #### clearByPersistenceId
		
		
		
		```
		public void clearByPersistenceId​(java.lang.String persistenceId)
		```
		
		Clear all data from storage for particular persistence id.
		 
		 NOTE! Also clears sequence number in storage!
		- #### clearAllPreservingSeqNumbers
		
		
		
		```
		public void clearAllPreservingSeqNumbers()
		```
		
		Clear all data in storage preserving sequence numbers.
		- #### clearByIdPreservingSeqNumbers
		
		
		
		```
		public void clearByIdPreservingSeqNumbers​(java.lang.String persistenceId)
		```
		
		Clear all data in storage for particular persistence id preserving sequence numbers.
		- #### failNextNOpsCond
		
		
		
		```
		public void failNextNOpsCond​(java.util.function.BiFunction<java.lang.String,​[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,
		                             int n)
		```
		
		Fail `n` following journal operations depending on the condition `cond`.
		 Failure triggers, when `cond` returns true.
		 Fails operations with default `ExpectedFailure` exception.
		- #### failNextNOpsCond
		
		
		
		```
		public void failNextNOpsCond​(java.util.function.BiFunction<java.lang.String,​[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit"),​java.lang.Object> cond,
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
		public [PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.javadsl") withPolicy​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit")> policy)
		```
		
		Set new processing policy for journal operations.
		 NOTE! Overrides previously invoked `failNext...` or `rejectNext...`
		- #### resetPolicy
		
		
		
		```
		public void resetPolicy()
		```
		
		Returns default policy if it was changed by {@link PersistenceTestKit.withPolicy()}.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceTestKit.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceTestKit.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceTestKit.html)*
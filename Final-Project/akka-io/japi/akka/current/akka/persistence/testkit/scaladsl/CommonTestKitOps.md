---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/CommonTestKitOps.html
title: CommonTestKitOps
---

# CommonTestKitOps

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface CommonTestKitOps\<S,​P\>

- All Superinterfaces:
`[ClearOps](ClearOps.html "interface in akka.persistence.testkit.scaladsl")`, `[PolicyOpsTestKit](PolicyOpsTestKit.html "interface in akka.persistence.testkit.scaladsl")<P>`

All Known Subinterfaces:
`[PersistenceTestKitOps](PersistenceTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>`

All Known Implementing Classes:
`[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")`, `[SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface CommonTestKitOps<S,​P>
extends [ClearOps](ClearOps.html "interface in akka.persistence.testkit.scaladsl"), [PolicyOpsTestKit](PolicyOpsTestKit.html "interface in akka.persistence.testkit.scaladsl")<P>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A> A` | `[expectNextPersisted](#expectNextPersisted(java.lang.String,A))​(java.lang.String persistenceId,  A event)` | Check that `event` has been saved in the storage. |
	| `<A> A` | `[expectNextPersisted](#expectNextPersisted(java.lang.String,A,scala.concurrent.duration.FiniteDuration))​(java.lang.String persistenceId,  A event,  scala.concurrent.duration.FiniteDuration max)` | Check for `max` time that `event` has been saved in the storage. |
	| `void` | `[expectNothingPersisted](#expectNothingPersisted(java.lang.String))​(java.lang.String persistenceId)` | Check that nothing has been saved in the storage. |
	| `void` | `[expectNothingPersisted](#expectNothingPersisted(java.lang.String,scala.concurrent.duration.FiniteDuration))​(java.lang.String persistenceId,  scala.concurrent.duration.FiniteDuration max)` | Check for `max` time that nothing has been saved in the storage. |
	| `void` | `[failNextDelete](#failNextDelete())()` | Fail next delete from storage attempt with default exception for any persistence id. |
	| `void` | `[failNextDelete](#failNextDelete(java.lang.String))​(java.lang.String persistenceId)` | Fail next delete from storage attempt with default exception for particular persistence id. |
	| `void` | `[failNextDelete](#failNextDelete(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Fail next delete from storage attempt with `cause` exception for particular persistence id. |
	| `void` | `[failNextDelete](#failNextDelete(java.lang.Throwable))​(java.lang.Throwable cause)` | Fail next delete from storage attempt with `cause` exception for any persistence id. |
	| `void` | `[failNextNDeletes](#failNextNDeletes(int))​(int n)` | Fail next n delete from storage attempts with default exception for any persistence id. |
	| `void` | `[failNextNDeletes](#failNextNDeletes(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Fail next n delete from storage attempts with `cause` exception for any persistence id. |
	| `void` | `[failNextNDeletes](#failNextNDeletes(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Fail next n delete from storage attempts with default exception for particular persistence id. |
	| `void` | `[failNextNDeletes](#failNextNDeletes(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Fail next n delete from storage attempts with `cause` exception for particular persistence id. |
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
	| `void` | `[failNextPersisted](#failNextPersisted(java.lang.Throwable))​(java.lang.Throwable cause)` | Fail next write operation with `cause` exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead())()` | Fail next read from storage (recovery) attempt with default exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.String))​(java.lang.String persistenceId)` | Fail next read from storage (recovery) attempt with default exception for any persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id. |
	| `void` | `[failNextRead](#failNextRead(java.lang.Throwable))​(java.lang.Throwable cause)` | Fail next read from storage (recovery) attempt with `cause` exception for any persistence id. |
	
	
		- ### Methods inherited from interface akka.persistence.testkit.scaladsl.[ClearOps](ClearOps.html "interface in akka.persistence.testkit.scaladsl")
		
		
		`[clearAll](ClearOps.html#clearAll()), [clearByPersistenceId](ClearOps.html#clearByPersistenceId(java.lang.String))`
		- ### Methods inherited from interface akka.persistence.testkit.scaladsl.[PolicyOpsTestKit](PolicyOpsTestKit.html "interface in akka.persistence.testkit.scaladsl")
		
		
		`[failNextNOps](PolicyOpsTestKit.html#failNextNOps(int)), [failNextNOps](PolicyOpsTestKit.html#failNextNOps(int,java.lang.Throwable)), [failNextNOpsCond](PolicyOpsTestKit.html#failNextNOpsCond(scala.Function2,int)), [failNextNOpsCond](PolicyOpsTestKit.html#failNextNOpsCond(scala.Function2,int,java.lang.Throwable)), [Policies](PolicyOpsTestKit.html#Policies()), [resetPolicy](PolicyOpsTestKit.html#resetPolicy()), [withPolicy](PolicyOpsTestKit.html#withPolicy(akka.persistence.testkit.ProcessingPolicy))`

- - ### Method Detail
	
	
	
		- #### expectNextPersisted
		
		
		
		```
		<A> A expectNextPersisted​(java.lang.String persistenceId,
		                          A event)
		```
		
		Check that `event` has been saved in the storage.
		- #### expectNextPersisted
		
		
		
		```
		<A> A expectNextPersisted​(java.lang.String persistenceId,
		                          A event,
		                          scala.concurrent.duration.FiniteDuration max)
		```
		
		Check for `max` time that `event` has been saved in the storage.
		- #### expectNothingPersisted
		
		
		
		```
		void expectNothingPersisted​(java.lang.String persistenceId)
		```
		
		Check that nothing has been saved in the storage.
		- #### expectNothingPersisted
		
		
		
		```
		void expectNothingPersisted​(java.lang.String persistenceId,
		                            scala.concurrent.duration.FiniteDuration max)
		```
		
		Check for `max` time that nothing has been saved in the storage.
		- #### failNextDelete
		
		
		
		```
		void failNextDelete​(java.lang.Throwable cause)
		```
		
		Fail next delete from storage attempt with `cause` exception for any persistence id.
		- #### failNextDelete
		
		
		
		```
		void failNextDelete()
		```
		
		Fail next delete from storage attempt with default exception for any persistence id.
		- #### failNextDelete
		
		
		
		```
		void failNextDelete​(java.lang.String persistenceId,
		                    java.lang.Throwable cause)
		```
		
		Fail next delete from storage attempt with `cause` exception for particular persistence id.
		- #### failNextDelete
		
		
		
		```
		void failNextDelete​(java.lang.String persistenceId)
		```
		
		Fail next delete from storage attempt with default exception for particular persistence id.
		- #### failNextNDeletes
		
		
		
		```
		void failNextNDeletes​(int n,
		                      java.lang.Throwable cause)
		```
		
		Fail next n delete from storage attempts with `cause` exception for any persistence id.
		- #### failNextNDeletes
		
		
		
		```
		void failNextNDeletes​(int n)
		```
		
		Fail next n delete from storage attempts with default exception for any persistence id.
		- #### failNextNDeletes
		
		
		
		```
		void failNextNDeletes​(java.lang.String persistenceId,
		                      int n,
		                      java.lang.Throwable cause)
		```
		
		Fail next n delete from storage attempts with `cause` exception for particular persistence id.
		- #### failNextNDeletes
		
		
		
		```
		void failNextNDeletes​(java.lang.String persistenceId,
		                      int n)
		```
		
		Fail next n delete from storage attempts with default exception for particular persistence id.
		- #### failNextNPersisted
		
		
		
		```
		void failNextNPersisted​(java.lang.String persistenceId,
		                        int n,
		                        java.lang.Throwable cause)
		```
		
		Fail next `n` write operations with the `cause` exception for particular persistence id.
		- #### failNextNPersisted
		
		
		
		```
		void failNextNPersisted​(java.lang.String persistenceId,
		                        int n)
		```
		
		Fail next `n` write operations for particular persistence id.
		- #### failNextNPersisted
		
		
		
		```
		void failNextNPersisted​(int n,
		                        java.lang.Throwable cause)
		```
		
		Fail next `n` write operations with the `cause` exception for any persistence id.
		- #### failNextNPersisted
		
		
		
		```
		void failNextNPersisted​(int n)
		```
		
		Fail next `n` write operations with default exception for any persistence id.
		- #### failNextNReads
		
		
		
		```
		void failNextNReads​(int n,
		                    java.lang.Throwable cause)
		```
		
		Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id.
		- #### failNextNReads
		
		
		
		```
		void failNextNReads​(int n)
		```
		
		Fail next n read from storage (recovery) attempts with default exception for any persistence id.
		- #### failNextNReads
		
		
		
		```
		void failNextNReads​(java.lang.String persistenceId,
		                    int n,
		                    java.lang.Throwable cause)
		```
		
		Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id.
		- #### failNextNReads
		
		
		
		```
		void failNextNReads​(java.lang.String persistenceId,
		                    int n)
		```
		
		Fail next n read from storage (recovery) attempts with default exception for particular persistence id.
		- #### failNextPersisted
		
		
		
		```
		void failNextPersisted​(java.lang.String persistenceId,
		                       java.lang.Throwable cause)
		```
		
		Fail next write operation with `cause` exception for particular persistence id.
		- #### failNextPersisted
		
		
		
		```
		void failNextPersisted​(java.lang.String persistenceId)
		```
		
		Fail next write operation with default exception for particular persistence id.
		- #### failNextPersisted
		
		
		
		```
		void failNextPersisted​(java.lang.Throwable cause)
		```
		
		Fail next write operation with `cause` exception for any persistence id.
		- #### failNextPersisted
		
		
		
		```
		void failNextPersisted()
		```
		
		Fail next write operation with default exception for any persistence id.
		- #### failNextRead
		
		
		
		```
		void failNextRead​(java.lang.Throwable cause)
		```
		
		Fail next read from storage (recovery) attempt with `cause` exception for any persistence id.
		- #### failNextRead
		
		
		
		```
		void failNextRead()
		```
		
		Fail next read from storage (recovery) attempt with default exception for any persistence id.
		- #### failNextRead
		
		
		
		```
		void failNextRead​(java.lang.String persistenceId,
		                  java.lang.Throwable cause)
		```
		
		Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id.
		- #### failNextRead
		
		
		
		```
		void failNextRead​(java.lang.String persistenceId)
		```
		
		Fail next read from storage (recovery) attempt with default exception for any persistence id.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PolicyOpsTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/CommonTestKitOps.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/CommonTestKitOps.html)*
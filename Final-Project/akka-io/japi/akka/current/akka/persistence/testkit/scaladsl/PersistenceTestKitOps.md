---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html
title: PersistenceTestKitOps
---

# PersistenceTestKitOps

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface PersistenceTestKitOps\<S,​P\>

- All Superinterfaces:
`[ClearOps](ClearOps.html "interface in akka.persistence.testkit.scaladsl")`, `[ClearPreservingSeqNums](ClearPreservingSeqNums.html "interface in akka.persistence.testkit.scaladsl")`, `[CommonTestKitOps](CommonTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>`, `[PolicyOpsTestKit](PolicyOpsTestKit.html "interface in akka.persistence.testkit.scaladsl")<P>`, `[RejectSupport](RejectSupport.html "interface in akka.persistence.testkit.scaladsl")<P>`

All Known Implementing Classes:
`[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface PersistenceTestKitOps<S,​P>
extends [RejectSupport](RejectSupport.html "interface in akka.persistence.testkit.scaladsl")<P>, [ClearPreservingSeqNums](ClearPreservingSeqNums.html "interface in akka.persistence.testkit.scaladsl"), [CommonTestKitOps](CommonTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[persistedInStorage](#persistedInStorage(java.lang.String))​(java.lang.String persistenceId)` | Retrieve all snapshots saved in storage by persistence id. |
	| `void` | `[persistForRecovery](#persistForRecovery(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String persistenceId,  scala.collection.immutable.Seq<java.lang.Object> events)` | Persist `snapshots` into storage in order. |
	| `void` | `[rejectNextDelete](#rejectNextDelete())()` | Reject next delete from storage operation for any persistence id with default exception. |
	| `void` | `[rejectNextDelete](#rejectNextDelete(java.lang.String))​(java.lang.String persistenceId)` | Reject next delete from storage operations for particular persistence id with default exception. |
	| `void` | `[rejectNextDelete](#rejectNextDelete(java.lang.String,java.lang.Throwable))​(java.lang.String persistenceId,  java.lang.Throwable cause)` | Reject next delete from storage operations for particular persistence id with `cause` exception. |
	| `void` | `[rejectNextDelete](#rejectNextDelete(java.lang.Throwable))​(java.lang.Throwable cause)` | Reject next delete from storage operation for any persistence id with `cause` exception. |
	| `void` | `[rejectNextNDeletes](#rejectNextNDeletes(int))​(int n)` | Reject next n delete from storage operations for any persistence id with default exception. |
	| `void` | `[rejectNextNDeletes](#rejectNextNDeletes(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Reject next n delete from storage operations for any persistence id with `cause` exception. |
	| `void` | `[rejectNextNDeletes](#rejectNextNDeletes(java.lang.String,int))​(java.lang.String persistenceId,  int n)` | Reject next n delete from storage operations for particular persistence id with default exception. |
	| `void` | `[rejectNextNDeletes](#rejectNextNDeletes(java.lang.String,int,java.lang.Throwable))​(java.lang.String persistenceId,  int n,  java.lang.Throwable cause)` | Reject next n delete from storage operations for particular persistence id with `cause` exception. |
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
	
	
		- ### Methods inherited from interface akka.persistence.testkit.scaladsl.[ClearOps](ClearOps.html "interface in akka.persistence.testkit.scaladsl")
		
		
		`[clearAll](ClearOps.html#clearAll()), [clearByPersistenceId](ClearOps.html#clearByPersistenceId(java.lang.String))`
		- ### Methods inherited from interface akka.persistence.testkit.scaladsl.[ClearPreservingSeqNums](ClearPreservingSeqNums.html "interface in akka.persistence.testkit.scaladsl")
		
		
		`[clearAllPreservingSeqNumbers](ClearPreservingSeqNums.html#clearAllPreservingSeqNumbers()), [clearByIdPreservingSeqNumbers](ClearPreservingSeqNums.html#clearByIdPreservingSeqNumbers(java.lang.String))`
		- ### Methods inherited from interface akka.persistence.testkit.scaladsl.[CommonTestKitOps](CommonTestKitOps.html "interface in akka.persistence.testkit.scaladsl")
		
		
		`[expectNextPersisted](CommonTestKitOps.html#expectNextPersisted(java.lang.String,A)), [expectNextPersisted](CommonTestKitOps.html#expectNextPersisted(java.lang.String,A,scala.concurrent.duration.FiniteDuration)), [expectNothingPersisted](CommonTestKitOps.html#expectNothingPersisted(java.lang.String)), [expectNothingPersisted](CommonTestKitOps.html#expectNothingPersisted(java.lang.String,scala.concurrent.duration.FiniteDuration)), [failNextDelete](CommonTestKitOps.html#failNextDelete()), [failNextDelete](CommonTestKitOps.html#failNextDelete(java.lang.String)), [failNextDelete](CommonTestKitOps.html#failNextDelete(java.lang.String,java.lang.Throwable)), [failNextDelete](CommonTestKitOps.html#failNextDelete(java.lang.Throwable)), [failNextNDeletes](CommonTestKitOps.html#failNextNDeletes(int)), [failNextNDeletes](CommonTestKitOps.html#failNextNDeletes(int,java.lang.Throwable)), [failNextNDeletes](CommonTestKitOps.html#failNextNDeletes(java.lang.String,int)), [failNextNDeletes](CommonTestKitOps.html#failNextNDeletes(java.lang.String,int,java.lang.Throwable)), [failNextNPersisted](CommonTestKitOps.html#failNextNPersisted(int)), [failNextNPersisted](CommonTestKitOps.html#failNextNPersisted(int,java.lang.Throwable)), [failNextNPersisted](CommonTestKitOps.html#failNextNPersisted(java.lang.String,int)), [failNextNPersisted](CommonTestKitOps.html#failNextNPersisted(java.lang.String,int,java.lang.Throwable)), [failNextNReads](CommonTestKitOps.html#failNextNReads(int)), [failNextNReads](CommonTestKitOps.html#failNextNReads(int,java.lang.Throwable)), [failNextNReads](CommonTestKitOps.html#failNextNReads(java.lang.String,int)), [failNextNReads](CommonTestKitOps.html#failNextNReads(java.lang.String,int,java.lang.Throwable)), [failNextPersisted](CommonTestKitOps.html#failNextPersisted()), [failNextPersisted](CommonTestKitOps.html#failNextPersisted(java.lang.String)), [failNextPersisted](CommonTestKitOps.html#failNextPersisted(java.lang.String,java.lang.Throwable)), [failNextPersisted](CommonTestKitOps.html#failNextPersisted(java.lang.Throwable)), [failNextRead](CommonTestKitOps.html#failNextRead()), [failNextRead](CommonTestKitOps.html#failNextRead(java.lang.String)), [failNextRead](CommonTestKitOps.html#failNextRead(java.lang.String,java.lang.Throwable)), [failNextRead](CommonTestKitOps.html#failNextRead(java.lang.Throwable))`
		- ### Methods inherited from interface akka.persistence.testkit.scaladsl.[PolicyOpsTestKit](PolicyOpsTestKit.html "interface in akka.persistence.testkit.scaladsl")
		
		
		`[failNextNOps](PolicyOpsTestKit.html#failNextNOps(int)), [failNextNOps](PolicyOpsTestKit.html#failNextNOps(int,java.lang.Throwable)), [failNextNOpsCond](PolicyOpsTestKit.html#failNextNOpsCond(scala.Function2,int)), [failNextNOpsCond](PolicyOpsTestKit.html#failNextNOpsCond(scala.Function2,int,java.lang.Throwable)), [Policies](PolicyOpsTestKit.html#Policies()), [resetPolicy](PolicyOpsTestKit.html#resetPolicy()), [withPolicy](PolicyOpsTestKit.html#withPolicy(akka.persistence.testkit.ProcessingPolicy))`
		- ### Methods inherited from interface akka.persistence.testkit.scaladsl.[RejectSupport](RejectSupport.html "interface in akka.persistence.testkit.scaladsl")
		
		
		`[rejectNextNOps](RejectSupport.html#rejectNextNOps(int)), [rejectNextNOps](RejectSupport.html#rejectNextNOps(int,java.lang.Throwable)), [rejectNextNOpsCond](RejectSupport.html#rejectNextNOpsCond(scala.Function2,int)), [rejectNextNOpsCond](RejectSupport.html#rejectNextNOpsCond(scala.Function2,int,java.lang.Throwable))`

- - ### Method Detail
	
	
	
		- #### persistForRecovery
		
		
		
		```
		void persistForRecovery​(java.lang.String persistenceId,
		                        scala.collection.immutable.Seq<java.lang.Object> events)
		```
		
		Persist `snapshots` into storage in order.
		- #### persistedInStorage
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.Object> persistedInStorage​(java.lang.String persistenceId)
		```
		
		Retrieve all snapshots saved in storage by persistence id.
		- #### rejectNextDelete
		
		
		
		```
		void rejectNextDelete()
		```
		
		Reject next delete from storage operation for any persistence id with default exception.
		- #### rejectNextDelete
		
		
		
		```
		void rejectNextDelete​(java.lang.Throwable cause)
		```
		
		Reject next delete from storage operation for any persistence id with `cause` exception.
		- #### rejectNextDelete
		
		
		
		```
		void rejectNextDelete​(java.lang.String persistenceId)
		```
		
		Reject next delete from storage operations for particular persistence id with default exception.
		- #### rejectNextDelete
		
		
		
		```
		void rejectNextDelete​(java.lang.String persistenceId,
		                      java.lang.Throwable cause)
		```
		
		Reject next delete from storage operations for particular persistence id with `cause` exception.
		- #### rejectNextNDeletes
		
		
		
		```
		void rejectNextNDeletes​(int n)
		```
		
		Reject next n delete from storage operations for any persistence id with default exception.
		- #### rejectNextNDeletes
		
		
		
		```
		void rejectNextNDeletes​(int n,
		                        java.lang.Throwable cause)
		```
		
		Reject next n delete from storage operations for any persistence id with `cause` exception.
		- #### rejectNextNDeletes
		
		
		
		```
		void rejectNextNDeletes​(java.lang.String persistenceId,
		                        int n)
		```
		
		Reject next n delete from storage operations for particular persistence id with default exception.
		- #### rejectNextNDeletes
		
		
		
		```
		void rejectNextNDeletes​(java.lang.String persistenceId,
		                        int n,
		                        java.lang.Throwable cause)
		```
		
		Reject next n delete from storage operations for particular persistence id with `cause` exception.
		- #### rejectNextNPersisted
		
		
		
		```
		void rejectNextNPersisted​(java.lang.String persistenceId,
		                          int n,
		                          java.lang.Throwable cause)
		```
		
		Reject next n save in storage operations for particular persistence id with `cause` exception.
		- #### rejectNextNPersisted
		
		
		
		```
		void rejectNextNPersisted​(java.lang.String persistenceId,
		                          int n)
		```
		
		Reject next n save in storage operations for particular persistence id with default exception.
		- #### rejectNextNPersisted
		
		
		
		```
		void rejectNextNPersisted​(int n)
		```
		
		Reject next n save in storage operations for any persistence id with default exception.
		- #### rejectNextNPersisted
		
		
		
		```
		void rejectNextNPersisted​(int n,
		                          java.lang.Throwable cause)
		```
		
		Reject next n save in storage operations for any persistence id with `cause` exception.
		- #### rejectNextNReads
		
		
		
		```
		void rejectNextNReads​(int n)
		```
		
		Reject next n read from storage operations for any persistence id with default exception.
		- #### rejectNextNReads
		
		
		
		```
		void rejectNextNReads​(int n,
		                      java.lang.Throwable cause)
		```
		
		Reject next n read from storage operations for any persistence id with `cause` exception.
		- #### rejectNextNReads
		
		
		
		```
		void rejectNextNReads​(java.lang.String persistenceId,
		                      int n)
		```
		
		Reject next n read from storage operations for particular persistence id with default exception.
		- #### rejectNextNReads
		
		
		
		```
		void rejectNextNReads​(java.lang.String persistenceId,
		                      int n,
		                      java.lang.Throwable cause)
		```
		
		Reject next n read from storage operations for particular persistence id with `cause` exception.
		- #### rejectNextPersisted
		
		
		
		```
		void rejectNextPersisted​(java.lang.String persistenceId)
		```
		
		Reject next save in storage operation for particular persistence id with default exception.
		- #### rejectNextPersisted
		
		
		
		```
		void rejectNextPersisted​(java.lang.String persistenceId,
		                         java.lang.Throwable cause)
		```
		
		Reject next save in storage operation for particular persistence id with `cause` exception.
		- #### rejectNextPersisted
		
		
		
		```
		void rejectNextPersisted​(java.lang.Throwable cause)
		```
		
		Reject next save in storage operation for any persistence id with `cause` exception.
		- #### rejectNextPersisted
		
		
		
		```
		void rejectNextPersisted()
		```
		
		Reject next save in storage operation for any persistence id with default exception.
		- #### rejectNextRead
		
		
		
		```
		void rejectNextRead()
		```
		
		Reject next read from storage operation for any persistence id with default exception.
		- #### rejectNextRead
		
		
		
		```
		void rejectNextRead​(java.lang.Throwable cause)
		```
		
		Reject next read from storage operation for any persistence id with `cause` exception.
		- #### rejectNextRead
		
		
		
		```
		void rejectNextRead​(java.lang.String persistenceId)
		```
		
		Reject next read from storage operation for particular persistence id with default exception.
		- #### rejectNextRead
		
		
		
		```
		void rejectNextRead​(java.lang.String persistenceId,
		                    java.lang.Throwable cause)
		```
		
		Reject next read from storage operation for particular persistence id with `cause` exception.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/ClearPreservingSeqNums.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/CommonTestKitOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PolicyOpsTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/RejectSupport.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html)*
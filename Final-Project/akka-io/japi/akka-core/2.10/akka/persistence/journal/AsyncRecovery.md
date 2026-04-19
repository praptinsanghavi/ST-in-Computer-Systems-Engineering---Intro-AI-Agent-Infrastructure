---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html
title: AsyncRecovery
---

# AsyncRecovery

## Content

Package [akka.persistence.journal](package-summary.html)
## Interface AsyncRecovery

- All Known Subinterfaces:
`[AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal")`, `[AsyncWriteProxy](AsyncWriteProxy.html "interface in akka.persistence.journal")`, `[LeveldbRecovery](leveldb/LeveldbRecovery.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbStore](leveldb/LeveldbStore.html "interface in akka.persistence.journal.leveldb")`

All Known Implementing Classes:
`[AsyncRecovery](japi/AsyncRecovery.html "class in akka.persistence.journal.japi")`, `[AsyncWriteJournal](japi/AsyncWriteJournal.html "class in akka.persistence.journal.japi")`, `[PersistenceTestKitPlugin](../testkit/PersistenceTestKitPlugin.html "class in akka.persistence.testkit")`, `[SharedLeveldbStore](leveldb/SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`

---

```
public interface AsyncRecovery
```

Asynchronous message replay and sequence number recovery interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[asyncReadHighestSequenceNr](#asyncReadHighestSequenceNr(java.lang.String,long))​(java.lang.String persistenceId,  long fromSequenceNr)` | Plugin API: asynchronously reads the highest stored sequence number for the  given `persistenceId`. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncReplayMessages](#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> recoveryCallback)` | Plugin API: asynchronously replays persistent messages. |

- - ### Method Detail
	
	
	
		- #### asyncReadHighestSequenceNr
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> asyncReadHighestSequenceNr​(java.lang.String persistenceId,
		                                                                     long fromSequenceNr)
		```
		
		Plugin API: asynchronously reads the highest stored sequence number for the
		 given `persistenceId`. The persistent actor will use the highest sequence
		 number after recovery as the starting point when persisting new events.
		 This sequence number is also used as `toSequenceNr` in subsequent call
		 to [`asyncReplayMessages(java.lang.String, long, long, long, scala.Function1<akka.persistence.PersistentRepr, scala.runtime.BoxedUnit>)`](#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1)) unless the user has specified a lower `toSequenceNr`.
		 Journal must maintain the highest sequence number and never decrease it.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		 Please also note that requests for the highest sequence number may be made concurrently
		 to writes executing for the same `persistenceId`, in particular it is possible that
		 a restarting actor tries to recover before its outstanding writes have completed.
		 
		
		
		
		Parameters:
		`persistenceId` \- persistent actor id.
		`fromSequenceNr` \- hint where to start searching for the highest sequence
		 number. When a persistent actor is recovering this
		 `fromSequenceNr` will be the sequence number of the used
		 snapshot or `0L` if no snapshot is used.
		- #### asyncReplayMessages
		
		
		
		```
		scala.concurrent.Future<scala.runtime.BoxedUnit> asyncReplayMessages​(java.lang.String persistenceId,
		                                                                     long fromSequenceNr,
		                                                                     long toSequenceNr,
		                                                                     long max,
		                                                                     scala.Function1<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> recoveryCallback)
		```
		
		Plugin API: asynchronously replays persistent messages. Implementations replay
		 a message by calling `replayCallback`. The returned future must be completed
		 when all messages (matching the sequence number bounds) have been replayed.
		 The future must be completed with a failure if any of the persistent messages
		 could not be replayed.
		 
		 The `replayCallback` must also be called with messages that have been marked
		 as deleted. In this case a replayed message's `deleted` method must return
		 `true`.
		 
		
		
		 The `toSequenceNr` is the lowest of what was returned by [`asyncReadHighestSequenceNr(java.lang.String, long)`](#asyncReadHighestSequenceNr(java.lang.String,long))
		 and what the user specified as recovery [`Recovery`](../Recovery.html "class in akka.persistence") parameter.
		 This does imply that this call is always preceded by reading the highest sequence
		 number for the given `persistenceId`.
		 
		
		
		 A special case is `fromSequenceNr` of \-1, which means that only the last message if any
		 should be replayed.
		 
		
		
		 This call is NOT protected with a circuit\-breaker because it may take long time
		 to replay all events. The plugin implementation itself must protect against
		 an unresponsive backend store and make sure that the returned Future is
		 completed with success or failure within reasonable time. It is not allowed
		 to ignore completing the future.
		 
		
		
		
		Parameters:
		`persistenceId` \- persistent actor id.
		`fromSequenceNr` \- sequence number where replay should start (inclusive).
		`toSequenceNr` \- sequence number where replay should end (inclusive).
		`max` \- maximum number of messages to be replayed.
		`recoveryCallback` \- called to replay a single message. Can be called from any
		 thread.
		See Also:
		[`AsyncWriteJournal`](AsyncWriteJournal.html "interface in akka.persistence.journal")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncRecovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbRecovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html)*
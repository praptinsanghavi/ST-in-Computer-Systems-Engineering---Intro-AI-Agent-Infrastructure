---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbRecovery.html
title: LeveldbRecovery
---

# LeveldbRecovery

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Interface LeveldbRecovery

- All Superinterfaces:
`[AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")`

All Known Subinterfaces:
`[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`

All Known Implementing Classes:
`[SharedLeveldbStore](SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`

---

```
public interface LeveldbRecovery
extends [AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")
```

INTERNAL API.
 
 LevelDB backed message replay and sequence number recovery.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[asyncReadHighestSequenceNr](#asyncReadHighestSequenceNr(java.lang.String,long))​(java.lang.String persistenceId,  long fromSequenceNr)` | Plugin API: asynchronously reads the highest stored sequence number for the  given `persistenceId`. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncReplayMessages](#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> replayCallback)` | Plugin API: asynchronously replays persistent messages. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncReplayTaggedMessages](#asyncReplayTaggedMessages(java.lang.String,long,long,long,scala.Function1))​(java.lang.String tag,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage,​scala.runtime.BoxedUnit> replayCallback)` |  |
	| `long` | `[readHighestSequenceNr](#readHighestSequenceNr(int))​(int persistenceId)` |  |
	| `void` | `[replayMessages](#replayMessages(int,long,long,long,scala.Function1))​(int persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> replayCallback)` |  |
	| `void` | `[replayTaggedMessages](#replayTaggedMessages(java.lang.String,int,long,long,long,scala.Function1))​(java.lang.String tag,  int tagNid,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage,​scala.runtime.BoxedUnit> replayCallback)` |  |

- - ### Method Detail
	
	
	
		- #### asyncReadHighestSequenceNr
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> asyncReadHighestSequenceNr​(java.lang.String persistenceId,
		                                                                     long fromSequenceNr)
		```
		
		Description copied from interface: `[AsyncRecovery](../AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))`
		Plugin API: asynchronously reads the highest stored sequence number for the
		 given `persistenceId`. The persistent actor will use the highest sequence
		 number after recovery as the starting point when persisting new events.
		 This sequence number is also used as `toSequenceNr` in subsequent call
		 to [`AsyncRecovery.asyncReplayMessages(java.lang.String, long, long, long, scala.Function1<akka.persistence.PersistentRepr, scala.runtime.BoxedUnit>)`](../AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1)) unless the user has specified a lower `toSequenceNr`.
		 Journal must maintain the highest sequence number and never decrease it.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		 Please also note that requests for the highest sequence number may be made concurrently
		 to writes executing for the same `persistenceId`, in particular it is possible that
		 a restarting actor tries to recover before its outstanding writes have completed.
		 
		
		
		
		Specified by:
		`[asyncReadHighestSequenceNr](../AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))` in interface `[AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")`
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
		                                                                     scala.Function1<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> replayCallback)
		```
		
		Description copied from interface: `[AsyncRecovery](../AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))`
		Plugin API: asynchronously replays persistent messages. Implementations replay
		 a message by calling `replayCallback`. The returned future must be completed
		 when all messages (matching the sequence number bounds) have been replayed.
		 The future must be completed with a failure if any of the persistent messages
		 could not be replayed.
		 
		 The `replayCallback` must also be called with messages that have been marked
		 as deleted. In this case a replayed message's `deleted` method must return
		 `true`.
		 
		
		
		 The `toSequenceNr` is the lowest of what was returned by [`AsyncRecovery.asyncReadHighestSequenceNr(java.lang.String, long)`](../AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))
		 and what the user specified as recovery [`Recovery`](../../Recovery.html "class in akka.persistence") parameter.
		 This does imply that this call is always preceded by reading the highest sequence
		 number for the given `persistenceId`.
		 
		
		
		 A special case is `fromSequenceNr` of \-1, which means that only the last message if any
		 should be replayed.
		 
		
		
		 This call is NOT protected with a circuit\-breaker because it may take long time
		 to replay all events. The plugin implementation itself must protect against
		 an unresponsive backend store and make sure that the returned Future is
		 completed with success or failure within reasonable time. It is not allowed
		 to ignore completing the future.
		 
		
		
		
		Specified by:
		`[asyncReplayMessages](../AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))` in interface `[AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")`
		Parameters:
		`persistenceId` \- persistent actor id.
		`fromSequenceNr` \- sequence number where replay should start (inclusive).
		`toSequenceNr` \- sequence number where replay should end (inclusive).
		`max` \- maximum number of messages to be replayed.
		`replayCallback` \- called to replay a single message. Can be called from any
		 thread.
		See Also:
		[`AsyncWriteJournal`](../AsyncWriteJournal.html "interface in akka.persistence.journal")
		- #### asyncReplayTaggedMessages
		
		
		
		```
		scala.concurrent.Future<scala.runtime.BoxedUnit> asyncReplayTaggedMessages​(java.lang.String tag,
		                                                                           long fromSequenceNr,
		                                                                           long toSequenceNr,
		                                                                           long max,
		                                                                           scala.Function1<akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage,​scala.runtime.BoxedUnit> replayCallback)
		```
		- #### readHighestSequenceNr
		
		
		
		```
		long readHighestSequenceNr​(int persistenceId)
		```
		- #### replayMessages
		
		
		
		```
		void replayMessages​(int persistenceId,
		                    long fromSequenceNr,
		                    long toSequenceNr,
		                    long max,
		                    scala.Function1<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> replayCallback)
		```
		- #### replayTaggedMessages
		
		
		
		```
		void replayTaggedMessages​(java.lang.String tag,
		                          int tagNid,
		                          long fromSequenceNr,
		                          long toSequenceNr,
		                          long max,
		                          scala.Function1<akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage,​scala.runtime.BoxedUnit> replayCallback)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbRecovery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbRecovery.html)*
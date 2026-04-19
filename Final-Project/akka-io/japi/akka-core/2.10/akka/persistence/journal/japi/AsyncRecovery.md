---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncRecovery.html
title: AsyncRecovery
---

# AsyncRecovery

## Content

Package [akka.persistence.journal.japi](package-summary.html)
## Class AsyncRecovery

- java.lang.Object
- - akka.persistence.journal.japi.AsyncRecovery

- All Implemented Interfaces:
`[AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")`

Direct Known Subclasses:
`[AsyncWriteJournal](AsyncWriteJournal.html "class in akka.persistence.journal.japi")`

---

```
public abstract class AsyncRecovery
extends java.lang.Object
implements [AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")
```

Java API: asynchronous message replay and sequence number recovery interface.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AsyncRecovery](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[asyncReadHighestSequenceNr](#asyncReadHighestSequenceNr(java.lang.String,long))​(java.lang.String persistenceId,  long fromSequenceNr)` | Plugin API: asynchronously reads the highest stored sequence number for the  given `persistenceId`. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncReplayMessages](#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> replayCallback)` | Plugin API: asynchronously replays persistent messages. |
	| `scala.concurrent.Future<java.lang.Long>` | `[doAsyncReadHighestSequenceNr](#doAsyncReadHighestSequenceNr(java.lang.String,long))​(java.lang.String persistenceId,  long fromSequenceNr)` | Java API, Plugin API: asynchronously reads the highest stored sequence number for the given  \`persistenceId\`. |
	| `scala.concurrent.Future<java.lang.Void>` | `[doAsyncReplayMessages](#doAsyncReplayMessages(java.lang.String,long,long,long,java.util.function.Consumer))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  java.util.function.Consumer<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence")> replayCallback)` | Java API, Plugin API: asynchronously replays persistent messages. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AsyncRecovery
		
		
		
		```
		public AsyncRecovery()
		```

	- ### Method Detail
	
	
	
		- #### asyncReadHighestSequenceNr
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> asyncReadHighestSequenceNr​(java.lang.String persistenceId,
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
		public final scala.concurrent.Future<scala.runtime.BoxedUnit> asyncReplayMessages​(java.lang.String persistenceId,
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
		- #### doAsyncReplayMessages
		
		
		
		```
		public abstract scala.concurrent.Future<java.lang.Void> doAsyncReplayMessages​(java.lang.String persistenceId,
		                                                                              long fromSequenceNr,
		                                                                              long toSequenceNr,
		                                                                              long max,
		                                                                              java.util.function.Consumer<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence")> replayCallback)
		```
		
		Java API, Plugin API: asynchronously replays persistent messages. Implementations replay a
		 message by calling \`replayCallback\`. The returned future must be completed when all messages
		 (matching the sequence number bounds) have been replayed. The future must be completed with a
		 failure if any of the persistent messages could not be replayed.
		
		 The \`replayCallback\` must also be called with messages that have been marked as deleted. In
		 this case a replayed message's \`deleted\` method must return \`true\`.
		
		 
		
		The \`toSequenceNr\` is the lowest of what was returned by [`doAsyncReadHighestSequenceNr(java.lang.String, long)`](#doAsyncReadHighestSequenceNr(java.lang.String,long)) and what the user specified as recovery [`Recovery`](../../Recovery.html "class in akka.persistence") parameter.
		
		
		
		Parameters:
		`persistenceId` \- id of the persistent actor.
		`fromSequenceNr` \- sequence number where replay should start (inclusive).
		`toSequenceNr` \- sequence number where replay should end (inclusive).
		`max` \- maximum number of messages to be replayed.
		`replayCallback` \- called to replay a single message. Can be called from any thread.
		- #### doAsyncReadHighestSequenceNr
		
		
		
		```
		public abstract scala.concurrent.Future<java.lang.Long> doAsyncReadHighestSequenceNr​(java.lang.String persistenceId,
		                                                                                     long fromSequenceNr)
		```
		
		Java API, Plugin API: asynchronously reads the highest stored sequence number for the given
		 \`persistenceId\`. The persistent actor will use the highest sequence number after recovery as
		 the starting point when persisting new events. This sequence number is also used as
		 \`toSequenceNr\` in subsequent call to \[\[\#asyncReplayMessages]] unless the user has specified a
		 lower \`toSequenceNr\`.
		
		Parameters:
		`persistenceId` \- id of the persistent actor.
		`fromSequenceNr` \- hint where to start searching for the highest sequence number.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncRecovery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncRecovery.html)*
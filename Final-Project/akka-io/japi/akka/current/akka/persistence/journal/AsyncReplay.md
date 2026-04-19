---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncReplay.html
title: AsyncReplay
---

# AsyncReplay

## Content

Package [akka.persistence.journal](package-summary.html)
## Interface AsyncReplay

- ---

```
public interface AsyncReplay
```

A plugin may implement this trait as an optimization. Combining `asyncReplayMessages` and
 `asyncReadHighestSequenceNr` into one method. If this trait is implemented the
 methods in [`AsyncRecovery`](AsyncRecovery.html "interface in akka.persistence.journal") will not be called.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[replayMessages](#replayMessages(java.lang.String,long,long,long,scala.Function1))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> recoveryCallback)` | Plugin API: asynchronously replays persistent messages. |

- - ### Method Detail
	
	
	
		- #### replayMessages
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> replayMessages​(java.lang.String persistenceId,
		                                                         long fromSequenceNr,
		                                                         long toSequenceNr,
		                                                         long max,
		                                                         scala.Function1<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> recoveryCallback)
		```
		
		Plugin API: asynchronously replays persistent messages. Implementations replay
		 a message by calling `replayCallback`. The returned future must be completed
		 with the highest sequence number when all messages (matching the sequence number bounds)
		 have been replayed. Journal must maintain the highest sequence number and never decrease it.
		 The future must be completed with a failure if any of the persistent messages
		 could not be replayed.
		 
		 The `toSequenceNr` will either be `Long.MaxValue` to replay all messages or otherwise a limited
		 upper sequence number. When replaying all messages the returned highest sequence number should
		 be the same as the last replayed message, and the implementation would typically not have to
		 read highest sequence number in other way than replaying the messages. With a custom `toSequenceNr`
		 the implementation would typically have to both replay messages and read the actual highest sequence
		 number.
		 
		
		
		 One special case is `toSequenceNr` of 0, which means that no messages should be replayed, but the
		 returned highest sequence number must still be the highest of all stored messages. In this case
		 the implementation would typically have to read the actual highest sequence number but can skip
		 replay of messages.
		 
		
		
		 Another special case is `fromSequenceNr` of \-1, which means that only the last message if any
		 should be replayed.
		 
		
		
		 This call is NOT protected with a circuit\-breaker because it may take long time
		 to replay all events. The plugin implementation itself must protect against
		 an unresponsive backend store and make sure that the returned Future is
		 completed with success or failure within reasonable time. It is not allowed
		 to ignore completing the future.
		 
		
		
		 Please also note that requests to `replayMessages` may be made concurrently
		 to writes executing for the same `persistenceId`, in particular it is possible that
		 a restarting actor tries to recover before its outstanding writes have completed.
		 
		
		
		
		Parameters:
		`persistenceId` \- persistent actor id.
		`fromSequenceNr` \- sequence number where replay should start (inclusive).
		`toSequenceNr` \- sequence number where replay should end (inclusive).
		`max` \- maximum number of messages to be replayed.
		`recoveryCallback` \- called to replay a single message. Can be called from any
		 thread.
		Returns:
		highest sequence number
		 
		See Also:
		[`AsyncWriteJournal`](AsyncWriteJournal.html "interface in akka.persistence.journal")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncReplay.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncReplay.html)*
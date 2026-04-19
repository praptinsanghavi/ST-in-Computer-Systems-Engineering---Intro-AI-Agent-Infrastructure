---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbCompaction.html
title: LeveldbCompaction
---

# LeveldbCompaction

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Interface LeveldbCompaction

- All Superinterfaces:
`[Actor](../../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../../actor/ActorLogging.html "interface in akka.actor")`, `[CompactionSegmentManagement](CompactionSegmentManagement.html "interface in akka.persistence.journal.leveldb")`

All Known Subinterfaces:
`[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`

All Known Implementing Classes:
`[SharedLeveldbStore](SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`

---

```
public interface LeveldbCompaction
extends [Actor](../../../actor/Actor.html "interface in akka.actor"), [ActorLogging](../../../actor/ActorLogging.html "interface in akka.actor"), [CompactionSegmentManagement](CompactionSegmentManagement.html "interface in akka.persistence.journal.leveldb")
```

INTERNAL API.
 
 Exposure of LevelDB compaction capability to reduce journal size upon message deletions.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")` |  |
	| `static class` | `[LeveldbCompaction.TryCompactLeveldb$](LeveldbCompaction.TryCompactLeveldb$.html "class in akka.persistence.journal.leveldb")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveCompactionInternal](#receiveCompactionInternal())()` |  |
	| `void` | `[tryCompactOnDelete](#tryCompactOnDelete(java.lang.String,long))​(java.lang.String persistenceId,  long toSeqNr)` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../../../actor/Actor.html#context()), [postRestart](../../../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../../../actor/Actor.html#postStop()), [preRestart](../../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../../actor/Actor.html#preStart()), [receive](../../../actor/Actor.html#receive()), [self](../../../actor/Actor.html#self()), [sender](../../../actor/Actor.html#sender()), [supervisorStrategy](../../../actor/Actor.html#supervisorStrategy()), [unhandled](../../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.persistence.journal.leveldb.[CompactionSegmentManagement](CompactionSegmentManagement.html "interface in akka.persistence.journal.leveldb")
		
		
		`[compactionInterval](CompactionSegmentManagement.html#compactionInterval(java.lang.String)), [compactionIntervals](CompactionSegmentManagement.html#compactionIntervals()), [compactionLimit](CompactionSegmentManagement.html#compactionLimit(java.lang.String,long)), [compactionSegment](CompactionSegmentManagement.html#compactionSegment(java.lang.String,long)), [isCompactionEnabled](CompactionSegmentManagement.html#isCompactionEnabled(java.lang.String)), [isCompactionRequired](CompactionSegmentManagement.html#isCompactionRequired(java.lang.String,long)), [latestCompactionSegment](CompactionSegmentManagement.html#latestCompactionSegment(java.lang.String)), [latestCompactionSegments_$eq](CompactionSegmentManagement.html#latestCompactionSegments_$eq(scala.collection.immutable.Map)), [mustCompact](CompactionSegmentManagement.html#mustCompact(java.lang.String,long)), [updateCompactionSegment](CompactionSegmentManagement.html#updateCompactionSegment(java.lang.String,long))`

- - ### Method Detail
	
	
	
		- #### receiveCompactionInternal
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveCompactionInternal()
		```
		- #### tryCompactOnDelete
		
		
		
		```
		void tryCompactOnDelete​(java.lang.String persistenceId,
		                        long toSeqNr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/CompactionSegmentManagement.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbCompaction.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbCompaction.html)*
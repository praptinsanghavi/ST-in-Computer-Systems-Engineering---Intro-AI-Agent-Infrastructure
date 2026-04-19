---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html
title: SharedLeveldbStore
---

# SharedLeveldbStore

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Class SharedLeveldbStore

- java.lang.Object
- - akka.persistence.journal.leveldb.SharedLeveldbStore

- All Implemented Interfaces:
`[Actor](../../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../../actor/ActorLogging.html "interface in akka.actor")`, `[AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")`, `[CompactionSegmentManagement](CompactionSegmentManagement.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbIdMapping](LeveldbIdMapping.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbRecovery](LeveldbRecovery.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`, `[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")`

---

```
public class SharedLeveldbStore
extends java.lang.Object
implements [LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")
```

Deprecated.
Use another journal implementation or the in\-mem journal in combination with the journal\-proxy. Since 2\.6\.15\.

A LevelDB store that can be shared by multiple actor systems. The shared store must be
 set for each actor system that uses the store via `SharedLeveldbJournal.setStore`. The
 shared LevelDB store is for testing only.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.journal.leveldb.[LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")
		
		
		`[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb"), [LeveldbCompaction.TryCompactLeveldb$](LeveldbCompaction.TryCompactLeveldb$.html "class in akka.persistence.journal.leveldb")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SharedLeveldbStore](#%3Cinit%3E())()` | Deprecated. |
	| `[SharedLeveldbStore](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config cfg)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../../actor/ActorContext.html "interface in akka.actor") x$1)` | Deprecated. Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") x$1)` | Deprecated. The 'self' field holds the ActorRef for this actor. |
	| `protected void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$compactionIntervals_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$compactionIntervals_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` | Deprecated. |
	| `protected void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$config_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$config_$eq(com.typesafe.config.Config))​(com.typesafe.config.Config x$1)` | Deprecated. |
	| `protected void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbDir_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbDir_$eq(java.io.File))​(java.io.File x$1)` | Deprecated. |
	| `protected void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbOptions_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbOptions_$eq(org.iq80.leveldb.Options))​(org.iq80.leveldb.Options x$1)` | Deprecated. |
	| `protected void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbWriteOptions_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbWriteOptions_$eq(org.iq80.leveldb.WriteOptions))​(org.iq80.leveldb.WriteOptions x$1)` | Deprecated. |
	| `protected void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$nativeLeveldb_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$nativeLeveldb_$eq(boolean))​(boolean x$1)` | Deprecated. |
	| `protected void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$serialization_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$serialization_$eq(akka.serialization.Serialization))​([Serialization](../../../serialization/Serialization.html "class in akka.serialization") x$1)` | Deprecated. |
	| `protected void` | `[akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence))​([Persistence](../../Persistence.html "class in akka.persistence") x$1)` | Deprecated. |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[compactionIntervals](#compactionIntervals())()` | Deprecated. |
	| `com.typesafe.config.Config` | `[config](#config())()` | Deprecated. |
	| `[ActorContext](../../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Deprecated. Scala API: Stores the context for this actor, including self, and sender. |
	| `org.iq80.leveldb.DB` | `[leveldb](#leveldb())()` | Deprecated. |
	| `void` | `[leveldb_$eq](#leveldb_$eq(org.iq80.leveldb.DB))​(org.iq80.leveldb.DB x$1)` | Deprecated. |
	| `java.io.File` | `[leveldbDir](#leveldbDir())()` | Deprecated. |
	| `org.iq80.leveldb.Options` | `[leveldbOptions](#leveldbOptions())()` | Deprecated. |
	| `org.iq80.leveldb.WriteOptions` | `[leveldbWriteOptions](#leveldbWriteOptions())()` | Deprecated. |
	| `boolean` | `[nativeLeveldb](#nativeLeveldb())()` | Deprecated. |
	| `[Persistence](../../Persistence.html "class in akka.persistence")` | `[persistence](#persistence())()` | Deprecated. |
	| `com.typesafe.config.Config` | `[prepareConfig](#prepareConfig())()` | Deprecated. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Deprecated. Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `[ActorRef](../../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | Deprecated. The 'self' field holds the ActorRef for this actor. |
	| `[Serialization](../../../serialization/Serialization.html "class in akka.serialization")` | `[serialization](#serialization())()` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [sender](../../../actor/Actor.html#sender()), [supervisorStrategy](../../../actor/Actor.html#supervisorStrategy()), [unhandled](../../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.persistence.journal.leveldb.[CompactionSegmentManagement](CompactionSegmentManagement.html "interface in akka.persistence.journal.leveldb")
		
		
		`[compactionInterval](CompactionSegmentManagement.html#compactionInterval(java.lang.String)), [compactionLimit](CompactionSegmentManagement.html#compactionLimit(java.lang.String,long)), [compactionSegment](CompactionSegmentManagement.html#compactionSegment(java.lang.String,long)), [isCompactionEnabled](CompactionSegmentManagement.html#isCompactionEnabled(java.lang.String)), [isCompactionRequired](CompactionSegmentManagement.html#isCompactionRequired(java.lang.String,long)), [latestCompactionSegment](CompactionSegmentManagement.html#latestCompactionSegment(java.lang.String)), [latestCompactionSegments_$eq](CompactionSegmentManagement.html#latestCompactionSegments_$eq(scala.collection.immutable.Map)), [mustCompact](CompactionSegmentManagement.html#mustCompact(java.lang.String,long)), [updateCompactionSegment](CompactionSegmentManagement.html#updateCompactionSegment(java.lang.String,long))`
		- ### Methods inherited from interface akka.persistence.journal.leveldb.[LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")
		
		
		`[receiveCompactionInternal](LeveldbCompaction.html#receiveCompactionInternal()), [tryCompactOnDelete](LeveldbCompaction.html#tryCompactOnDelete(java.lang.String,long))`
		- ### Methods inherited from interface akka.persistence.journal.leveldb.[LeveldbIdMapping](LeveldbIdMapping.html "interface in akka.persistence.journal.leveldb")
		
		
		`[allPersistenceIds](LeveldbIdMapping.html#allPersistenceIds()), [idMap_$eq](LeveldbIdMapping.html#idMap_$eq(scala.collection.immutable.Map)), [isNewPersistenceId](LeveldbIdMapping.html#isNewPersistenceId(java.lang.String)), [numericId](LeveldbIdMapping.html#numericId(java.lang.String)), [readIdMap](LeveldbIdMapping.html#readIdMap()), [readIdMap](LeveldbIdMapping.html#readIdMap(scala.collection.immutable.Map,org.iq80.leveldb.DBIterator)), [writeIdMapping](LeveldbIdMapping.html#writeIdMapping(java.lang.String,int))`
		- ### Methods inherited from interface akka.persistence.journal.leveldb.[LeveldbRecovery](LeveldbRecovery.html "interface in akka.persistence.journal.leveldb")
		
		
		`[asyncReadHighestSequenceNr](LeveldbRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long)), [asyncReplayMessages](LeveldbRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1)), [asyncReplayTaggedMessages](LeveldbRecovery.html#asyncReplayTaggedMessages(java.lang.String,long,long,long,scala.Function1)), [readHighestSequenceNr](LeveldbRecovery.html#readHighestSequenceNr(int)), [replayMessages](LeveldbRecovery.html#replayMessages(int,long,long,long,scala.Function1)), [replayTaggedMessages](LeveldbRecovery.html#replayTaggedMessages(java.lang.String,int,long,long,long,scala.Function1))`
		- ### Methods inherited from interface akka.persistence.journal.leveldb.[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")
		
		
		`[addAllPersistenceIdsSubscriber](LeveldbStore.html#addAllPersistenceIdsSubscriber(akka.actor.ActorRef)), [addPersistenceIdSubscriber](LeveldbStore.html#addPersistenceIdSubscriber(akka.actor.ActorRef,java.lang.String)), [addTagSubscriber](LeveldbStore.html#addTagSubscriber(akka.actor.ActorRef,java.lang.String)), [addToMessageBatch](LeveldbStore.html#addToMessageBatch(akka.persistence.PersistentRepr,scala.collection.immutable.Set,org.iq80.leveldb.WriteBatch)), [allPersistenceIdsSubscribers_$eq](LeveldbStore.html#allPersistenceIdsSubscribers_$eq(scala.collection.immutable.Set)), [asyncDeleteMessagesTo](LeveldbStore.html#asyncDeleteMessagesTo(java.lang.String,long)), [asyncWriteMessages](LeveldbStore.html#asyncWriteMessages(scala.collection.immutable.Seq)), [hasAllPersistenceIdsSubscribers](LeveldbStore.html#hasAllPersistenceIdsSubscribers()), [hasPersistenceIdSubscribers](LeveldbStore.html#hasPersistenceIdSubscribers()), [hasTagSubscribers](LeveldbStore.html#hasTagSubscribers()), [leveldbFactory](LeveldbStore.html#leveldbFactory()), [leveldbReadOptions](LeveldbStore.html#leveldbReadOptions()), [leveldbSnapshot](LeveldbStore.html#leveldbSnapshot()), [newPersistenceIdAdded](LeveldbStore.html#newPersistenceIdAdded(java.lang.String)), [nextTagSequenceNr](LeveldbStore.html#nextTagSequenceNr(java.lang.String)), [notifyPersistenceIdChange](LeveldbStore.html#notifyPersistenceIdChange(java.lang.String)), [notifyTagChange](LeveldbStore.html#notifyTagChange(java.lang.String)), [persistentFromBytes](LeveldbStore.html#persistentFromBytes(byte%5B%5D)), [persistentToBytes](LeveldbStore.html#persistentToBytes(akka.persistence.PersistentRepr)), [postStop](LeveldbStore.html#postStop()), [preStart](LeveldbStore.html#preStart()), [removeSubscriber](LeveldbStore.html#removeSubscriber(akka.actor.ActorRef)), [super$postStop](LeveldbStore.html#super$postStop()), [super$preStart](LeveldbStore.html#super$preStart()), [tagAsPersistenceId](LeveldbStore.html#tagAsPersistenceId(java.lang.String)), [tagNumericId](LeveldbStore.html#tagNumericId(java.lang.String)), [tagSequenceNr_$eq](LeveldbStore.html#tagSequenceNr_$eq(scala.collection.immutable.Map)), [withBatch](LeveldbStore.html#withBatch(scala.Function1)), [withIterator](LeveldbStore.html#withIterator(scala.Function1))`
		- ### Methods inherited from interface akka.persistence.journal.[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")
		
		
		`[adaptFromJournal](../WriteJournalBase.html#adaptFromJournal(akka.persistence.PersistentRepr)), [adaptToJournal](../WriteJournalBase.html#adaptToJournal(akka.persistence.PersistentRepr)), [preparePersistentBatch](../WriteJournalBase.html#preparePersistentBatch(scala.collection.immutable.Seq))`

- - ### Constructor Detail
	
	
	
		- #### SharedLeveldbStore
		
		
		
		```
		public SharedLeveldbStore​(com.typesafe.config.Config cfg)
		```
		
		Deprecated.
		- #### SharedLeveldbStore
		
		
		
		```
		public SharedLeveldbStore()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### akka$persistence$journal$WriteJournalBase$\_setter\_$persistence\_$eq
		
		
		
		```
		protected void akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq​([Persistence](../../Persistence.html "class in akka.persistence") x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](../WriteJournalBase.html#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence))` in interface `[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")`
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$compactionIntervals\_$eq
		
		
		
		```
		protected void akka$persistence$journal$leveldb$LeveldbStore$_setter_$compactionIntervals_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$journal$leveldb$LeveldbStore$_setter_$compactionIntervals_$eq](LeveldbStore.html#akka$persistence$journal$leveldb$LeveldbStore$_setter_$compactionIntervals_$eq(scala.collection.immutable.Map))` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$config\_$eq
		
		
		
		```
		protected void akka$persistence$journal$leveldb$LeveldbStore$_setter_$config_$eq​(com.typesafe.config.Config x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$journal$leveldb$LeveldbStore$_setter_$config_$eq](LeveldbStore.html#akka$persistence$journal$leveldb$LeveldbStore$_setter_$config_$eq(com.typesafe.config.Config))` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$leveldbDir\_$eq
		
		
		
		```
		protected void akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbDir_$eq​(java.io.File x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbDir_$eq](LeveldbStore.html#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbDir_$eq(java.io.File))` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$leveldbOptions\_$eq
		
		
		
		```
		protected void akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbOptions_$eq​(org.iq80.leveldb.Options x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbOptions_$eq](LeveldbStore.html#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbOptions_$eq(org.iq80.leveldb.Options))` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$leveldbWriteOptions\_$eq
		
		
		
		```
		protected void akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbWriteOptions_$eq​(org.iq80.leveldb.WriteOptions x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbWriteOptions_$eq](LeveldbStore.html#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbWriteOptions_$eq(org.iq80.leveldb.WriteOptions))` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$nativeLeveldb\_$eq
		
		
		
		```
		protected void akka$persistence$journal$leveldb$LeveldbStore$_setter_$nativeLeveldb_$eq​(boolean x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$journal$leveldb$LeveldbStore$_setter_$nativeLeveldb_$eq](LeveldbStore.html#akka$persistence$journal$leveldb$LeveldbStore$_setter_$nativeLeveldb_$eq(boolean))` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$serialization\_$eq
		
		
		
		```
		protected void akka$persistence$journal$leveldb$LeveldbStore$_setter_$serialization_$eq​([Serialization](../../../serialization/Serialization.html "class in akka.serialization") x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$journal$leveldb$LeveldbStore$_setter_$serialization_$eq](LeveldbStore.html#akka$persistence$journal$leveldb$LeveldbStore$_setter_$serialization_$eq(akka.serialization.Serialization))` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### compactionIntervals
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.Object> compactionIntervals()
		```
		
		Deprecated.
		
		Specified by:
		`[compactionIntervals](CompactionSegmentManagement.html#compactionIntervals())` in interface `[CompactionSegmentManagement](CompactionSegmentManagement.html "interface in akka.persistence.journal.leveldb")`
		Specified by:
		`[compactionIntervals](LeveldbStore.html#compactionIntervals())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		
		Deprecated.
		
		Specified by:
		`[config](LeveldbStore.html#config())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### context
		
		
		
		```
		public [ActorContext](../../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../../../actor/Actor.html#context())` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### leveldb
		
		
		
		```
		public org.iq80.leveldb.DB leveldb()
		```
		
		Deprecated.
		
		Specified by:
		`[leveldb](LeveldbStore.html#leveldb())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### leveldbDir
		
		
		
		```
		public java.io.File leveldbDir()
		```
		
		Deprecated.
		
		Specified by:
		`[leveldbDir](LeveldbStore.html#leveldbDir())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### leveldbOptions
		
		
		
		```
		public org.iq80.leveldb.Options leveldbOptions()
		```
		
		Deprecated.
		
		Specified by:
		`[leveldbOptions](LeveldbStore.html#leveldbOptions())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### leveldbWriteOptions
		
		
		
		```
		public org.iq80.leveldb.WriteOptions leveldbWriteOptions()
		```
		
		Deprecated.
		
		Specified by:
		`[leveldbWriteOptions](LeveldbStore.html#leveldbWriteOptions())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### leveldb\_$eq
		
		
		
		```
		public void leveldb_$eq​(org.iq80.leveldb.DB x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[leveldb_$eq](LeveldbStore.html#leveldb_$eq(org.iq80.leveldb.DB))` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### nativeLeveldb
		
		
		
		```
		public boolean nativeLeveldb()
		```
		
		Deprecated.
		
		Specified by:
		`[nativeLeveldb](LeveldbStore.html#nativeLeveldb())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### persistence
		
		
		
		```
		public [Persistence](../../Persistence.html "class in akka.persistence") persistence()
		```
		
		Deprecated.
		
		Specified by:
		`[persistence](../WriteJournalBase.html#persistence())` in interface `[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")`
		- #### prepareConfig
		
		
		
		```
		public com.typesafe.config.Config prepareConfig()
		```
		
		Deprecated.
		
		Specified by:
		`[prepareConfig](LeveldbStore.html#prepareConfig())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../../actor/Actor.html#receive())` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](../../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../../actor/Actor.html#self())` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### serialization
		
		
		
		```
		public [Serialization](../../../serialization/Serialization.html "class in akka.serialization") serialization()
		```
		
		Deprecated.
		
		Specified by:
		`[serialization](LeveldbStore.html#serialization())` in interface `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Persistence.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/WriteJournalBase.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/CompactionSegmentManagement.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbIdMapping.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbRecovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html)*
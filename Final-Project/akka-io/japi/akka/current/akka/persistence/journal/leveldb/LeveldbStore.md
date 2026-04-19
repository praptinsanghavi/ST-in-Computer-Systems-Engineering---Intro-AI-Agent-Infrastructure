---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbStore.html
title: LeveldbStore
---

# LeveldbStore

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Interface LeveldbStore

- All Superinterfaces:
`[Actor](../../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../../actor/ActorLogging.html "interface in akka.actor")`, `[AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")`, `[CompactionSegmentManagement](CompactionSegmentManagement.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbIdMapping](LeveldbIdMapping.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbRecovery](LeveldbRecovery.html "interface in akka.persistence.journal.leveldb")`, `[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")`

All Known Implementing Classes:
`[SharedLeveldbStore](SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`

---

```
public interface LeveldbStore
extends [Actor](../../../actor/Actor.html "interface in akka.actor"), [WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal"), [LeveldbIdMapping](LeveldbIdMapping.html "interface in akka.persistence.journal.leveldb"), [LeveldbRecovery](LeveldbRecovery.html "interface in akka.persistence.journal.leveldb"), [LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")
```

INTERNAL API.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.journal.leveldb.[LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")
		
		
		`[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb"), [LeveldbCompaction.TryCompactLeveldb$](LeveldbCompaction.TryCompactLeveldb$.html "class in akka.persistence.journal.leveldb")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addAllPersistenceIdsSubscriber](#addAllPersistenceIdsSubscriber(akka.actor.ActorRef))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") subscriber)` |  |
	| `void` | `[addPersistenceIdSubscriber](#addPersistenceIdSubscriber(akka.actor.ActorRef,java.lang.String))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") subscriber,  java.lang.String persistenceId)` |  |
	| `void` | `[addTagSubscriber](#addTagSubscriber(akka.actor.ActorRef,java.lang.String))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") subscriber,  java.lang.String tag)` |  |
	| `void` | `[addToMessageBatch](#addToMessageBatch(akka.persistence.PersistentRepr,scala.collection.immutable.Set,org.iq80.leveldb.WriteBatch))​([PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") persistent,  scala.collection.immutable.Set<java.lang.String> tags,  org.iq80.leveldb.WriteBatch batch)` |  |
	| `void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$compactionIntervals_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$compactionIntervals_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` |  |
	| `void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$config_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$config_$eq(com.typesafe.config.Config))​(com.typesafe.config.Config x$1)` |  |
	| `void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbDir_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbDir_$eq(java.io.File))​(java.io.File x$1)` |  |
	| `void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbOptions_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbOptions_$eq(org.iq80.leveldb.Options))​(org.iq80.leveldb.Options x$1)` |  |
	| `void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbWriteOptions_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbWriteOptions_$eq(org.iq80.leveldb.WriteOptions))​(org.iq80.leveldb.WriteOptions x$1)` |  |
	| `void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$nativeLeveldb_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$nativeLeveldb_$eq(boolean))​(boolean x$1)` |  |
	| `void` | `[akka$persistence$journal$leveldb$LeveldbStore$_setter_$serialization_$eq](#akka$persistence$journal$leveldb$LeveldbStore$_setter_$serialization_$eq(akka.serialization.Serialization))​([Serialization](../../../serialization/Serialization.html "class in akka.serialization") x$1)` |  |
	| `void` | `[allPersistenceIdsSubscribers_$eq](#allPersistenceIdsSubscribers_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncDeleteMessagesTo](#asyncDeleteMessagesTo(java.lang.String,long))​(java.lang.String persistenceId,  long toSequenceNr)` |  |
	| `scala.concurrent.Future<scala.collection.immutable.Seq<scala.util.Try<scala.runtime.BoxedUnit>>>` | `[asyncWriteMessages](#asyncWriteMessages(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[AtomicWrite](../../AtomicWrite.html "class in akka.persistence")> messages)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[compactionIntervals](#compactionIntervals())()` |  |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `boolean` | `[hasAllPersistenceIdsSubscribers](#hasAllPersistenceIdsSubscribers())()` |  |
	| `boolean` | `[hasPersistenceIdSubscribers](#hasPersistenceIdSubscribers())()` |  |
	| `boolean` | `[hasTagSubscribers](#hasTagSubscribers())()` |  |
	| `org.iq80.leveldb.DB` | `[leveldb](#leveldb())()` |  |
	| `void` | `[leveldb_$eq](#leveldb_$eq(org.iq80.leveldb.DB))​(org.iq80.leveldb.DB x$1)` |  |
	| `java.io.File` | `[leveldbDir](#leveldbDir())()` |  |
	| `org.iq80.leveldb.DBFactory` | `[leveldbFactory](#leveldbFactory())()` |  |
	| `org.iq80.leveldb.Options` | `[leveldbOptions](#leveldbOptions())()` |  |
	| `org.iq80.leveldb.ReadOptions` | `[leveldbReadOptions](#leveldbReadOptions())()` |  |
	| `org.iq80.leveldb.ReadOptions` | `[leveldbSnapshot](#leveldbSnapshot())()` |  |
	| `org.iq80.leveldb.WriteOptions` | `[leveldbWriteOptions](#leveldbWriteOptions())()` |  |
	| `boolean` | `[nativeLeveldb](#nativeLeveldb())()` |  |
	| `void` | `[newPersistenceIdAdded](#newPersistenceIdAdded(java.lang.String))​(java.lang.String id)` |  |
	| `long` | `[nextTagSequenceNr](#nextTagSequenceNr(java.lang.String))​(java.lang.String tag)` |  |
	| `void` | `[notifyPersistenceIdChange](#notifyPersistenceIdChange(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `void` | `[notifyTagChange](#notifyTagChange(java.lang.String))​(java.lang.String tag)` |  |
	| `[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence")` | `[persistentFromBytes](#persistentFromBytes(byte%5B%5D))​(byte[] a)` |  |
	| `byte[]` | `[persistentToBytes](#persistentToBytes(akka.persistence.PersistentRepr))​([PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") p)` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `com.typesafe.config.Config` | `[prepareConfig](#prepareConfig())()` |  |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `void` | `[removeSubscriber](#removeSubscriber(akka.actor.ActorRef))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") subscriber)` |  |
	| `[Serialization](../../../serialization/Serialization.html "class in akka.serialization")` | `[serialization](#serialization())()` |  |
	| `void` | `[super$postStop](#super$postStop())()` |  |
	| `void` | `[super$preStart](#super$preStart())()` | Get the mapped numeric id for the specified persistent actor `id`. |
	| `java.lang.String` | `[tagAsPersistenceId](#tagAsPersistenceId(java.lang.String))​(java.lang.String tag)` |  |
	| `int` | `[tagNumericId](#tagNumericId(java.lang.String))​(java.lang.String tag)` |  |
	| `void` | `[tagSequenceNr_$eq](#tagSequenceNr_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` |  |
	| `<R> R` | `[withBatch](#withBatch(scala.Function1))​(scala.Function1<org.iq80.leveldb.WriteBatch,​R> body)` |  |
	| `<R> R` | `[withIterator](#withIterator(scala.Function1))​(scala.Function1<org.iq80.leveldb.DBIterator,​R> body)` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../../../actor/Actor.html#context()), [postRestart](../../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [receive](../../../actor/Actor.html#receive()), [self](../../../actor/Actor.html#self()), [sender](../../../actor/Actor.html#sender()), [supervisorStrategy](../../../actor/Actor.html#supervisorStrategy()), [unhandled](../../../actor/Actor.html#unhandled(java.lang.Object))`
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
		- ### Methods inherited from interface akka.persistence.journal.[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")
		
		
		`[adaptFromJournal](../WriteJournalBase.html#adaptFromJournal(akka.persistence.PersistentRepr)), [adaptToJournal](../WriteJournalBase.html#adaptToJournal(akka.persistence.PersistentRepr)), [akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](../WriteJournalBase.html#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence)), [persistence](../WriteJournalBase.html#persistence()), [preparePersistentBatch](../WriteJournalBase.html#preparePersistentBatch(scala.collection.immutable.Seq))`

- - ### Method Detail
	
	
	
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$config\_$eq
		
		
		
		```
		void akka$persistence$journal$leveldb$LeveldbStore$_setter_$config_$eq​(com.typesafe.config.Config x$1)
		```
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$nativeLeveldb\_$eq
		
		
		
		```
		void akka$persistence$journal$leveldb$LeveldbStore$_setter_$nativeLeveldb_$eq​(boolean x$1)
		```
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$leveldbOptions\_$eq
		
		
		
		```
		void akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbOptions_$eq​(org.iq80.leveldb.Options x$1)
		```
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$leveldbWriteOptions\_$eq
		
		
		
		```
		void akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbWriteOptions_$eq​(org.iq80.leveldb.WriteOptions x$1)
		```
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$leveldbDir\_$eq
		
		
		
		```
		void akka$persistence$journal$leveldb$LeveldbStore$_setter_$leveldbDir_$eq​(java.io.File x$1)
		```
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$compactionIntervals\_$eq
		
		
		
		```
		void akka$persistence$journal$leveldb$LeveldbStore$_setter_$compactionIntervals_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$persistence$journal$leveldb$LeveldbStore$\_setter\_$serialization\_$eq
		
		
		
		```
		void akka$persistence$journal$leveldb$LeveldbStore$_setter_$serialization_$eq​([Serialization](../../../serialization/Serialization.html "class in akka.serialization") x$1)
		```
		- #### super$preStart
		
		
		
		```
		void super$preStart()
		```
		
		Description copied from interface: `[LeveldbIdMapping](LeveldbIdMapping.html#super$preStart())`
		Get the mapped numeric id for the specified persistent actor `id`. Creates and
		 stores a new mapping if necessary.
		 
		 This method is thread safe and it is allowed to call it from a another
		 thread than the actor's thread. That is necessary for Future composition,
		 e.g. `asyncReadHighestSequenceNr` followed by `asyncReplayMessages`.
		
		
		
		Specified by:
		`[super$preStart](LeveldbIdMapping.html#super$preStart())` in interface `[LeveldbIdMapping](LeveldbIdMapping.html "interface in akka.persistence.journal.leveldb")`
		- #### super$postStop
		
		
		
		```
		void super$postStop()
		```
		- #### prepareConfig
		
		
		
		```
		com.typesafe.config.Config prepareConfig()
		```
		- #### config
		
		
		
		```
		com.typesafe.config.Config config()
		```
		- #### nativeLeveldb
		
		
		
		```
		boolean nativeLeveldb()
		```
		- #### leveldbOptions
		
		
		
		```
		org.iq80.leveldb.Options leveldbOptions()
		```
		- #### leveldbReadOptions
		
		
		
		```
		org.iq80.leveldb.ReadOptions leveldbReadOptions()
		```
		- #### leveldbWriteOptions
		
		
		
		```
		org.iq80.leveldb.WriteOptions leveldbWriteOptions()
		```
		- #### leveldbDir
		
		
		
		```
		java.io.File leveldbDir()
		```
		- #### leveldb
		
		
		
		```
		org.iq80.leveldb.DB leveldb()
		```
		- #### leveldb\_$eq
		
		
		
		```
		void leveldb_$eq​(org.iq80.leveldb.DB x$1)
		```
		- #### compactionIntervals
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​java.lang.Object> compactionIntervals()
		```
		
		
		Specified by:
		`[compactionIntervals](CompactionSegmentManagement.html#compactionIntervals())` in interface `[CompactionSegmentManagement](CompactionSegmentManagement.html "interface in akka.persistence.journal.leveldb")`
		- #### allPersistenceIdsSubscribers\_$eq
		
		
		
		```
		void allPersistenceIdsSubscribers_$eq​(scala.collection.immutable.Set<[ActorRef](../../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### tagSequenceNr\_$eq
		
		
		
		```
		void tagSequenceNr_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		- #### leveldbFactory
		
		
		
		```
		org.iq80.leveldb.DBFactory leveldbFactory()
		```
		- #### serialization
		
		
		
		```
		[Serialization](../../../serialization/Serialization.html "class in akka.serialization") serialization()
		```
		- #### asyncWriteMessages
		
		
		
		```
		scala.concurrent.Future<scala.collection.immutable.Seq<scala.util.Try<scala.runtime.BoxedUnit>>> asyncWriteMessages​(scala.collection.immutable.Seq<[AtomicWrite](../../AtomicWrite.html "class in akka.persistence")> messages)
		```
		- #### asyncDeleteMessagesTo
		
		
		
		```
		scala.concurrent.Future<scala.runtime.BoxedUnit> asyncDeleteMessagesTo​(java.lang.String persistenceId,
		                                                                       long toSequenceNr)
		```
		- #### leveldbSnapshot
		
		
		
		```
		org.iq80.leveldb.ReadOptions leveldbSnapshot()
		```
		- #### withIterator
		
		
		
		```
		<R> R withIterator​(scala.Function1<org.iq80.leveldb.DBIterator,​R> body)
		```
		- #### withBatch
		
		
		
		```
		<R> R withBatch​(scala.Function1<org.iq80.leveldb.WriteBatch,​R> body)
		```
		- #### persistentToBytes
		
		
		
		```
		byte[] persistentToBytes​([PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") p)
		```
		- #### persistentFromBytes
		
		
		
		```
		[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") persistentFromBytes​(byte[] a)
		```
		- #### addToMessageBatch
		
		
		
		```
		void addToMessageBatch​([PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") persistent,
		                       scala.collection.immutable.Set<java.lang.String> tags,
		                       org.iq80.leveldb.WriteBatch batch)
		```
		- #### nextTagSequenceNr
		
		
		
		```
		long nextTagSequenceNr​(java.lang.String tag)
		```
		- #### tagNumericId
		
		
		
		```
		int tagNumericId​(java.lang.String tag)
		```
		- #### tagAsPersistenceId
		
		
		
		```
		java.lang.String tagAsPersistenceId​(java.lang.String tag)
		```
		- #### preStart
		
		
		
		```
		void preStart()
		```
		
		Description copied from interface: `[Actor](../../../actor/Actor.html#preStart())`
		User overridable callback.
		 
		 Is called when an Actor is started.
		 Actors are automatically started asynchronously when created.
		 Empty default implementation.
		
		Specified by:
		`[preStart](../../../actor/Actor.html#preStart())` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		Specified by:
		`[preStart](LeveldbIdMapping.html#preStart())` in interface `[LeveldbIdMapping](LeveldbIdMapping.html "interface in akka.persistence.journal.leveldb")`
		- #### postStop
		
		
		
		```
		void postStop()
		```
		
		Description copied from interface: `[Actor](../../../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../../../actor/Actor.html#postStop())` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### hasPersistenceIdSubscribers
		
		
		
		```
		boolean hasPersistenceIdSubscribers()
		```
		- #### addPersistenceIdSubscriber
		
		
		
		```
		void addPersistenceIdSubscriber​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") subscriber,
		                                java.lang.String persistenceId)
		```
		- #### removeSubscriber
		
		
		
		```
		void removeSubscriber​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		- #### hasTagSubscribers
		
		
		
		```
		boolean hasTagSubscribers()
		```
		- #### addTagSubscriber
		
		
		
		```
		void addTagSubscriber​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") subscriber,
		                      java.lang.String tag)
		```
		- #### hasAllPersistenceIdsSubscribers
		
		
		
		```
		boolean hasAllPersistenceIdsSubscribers()
		```
		- #### addAllPersistenceIdsSubscriber
		
		
		
		```
		void addAllPersistenceIdsSubscriber​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		- #### notifyPersistenceIdChange
		
		
		
		```
		void notifyPersistenceIdChange​(java.lang.String persistenceId)
		```
		- #### notifyTagChange
		
		
		
		```
		void notifyTagChange​(java.lang.String tag)
		```
		- #### newPersistenceIdAdded
		
		
		
		```
		void newPersistenceIdAdded​(java.lang.String id)
		```
		
		
		Specified by:
		`[newPersistenceIdAdded](LeveldbIdMapping.html#newPersistenceIdAdded(java.lang.String))` in interface `[LeveldbIdMapping](LeveldbIdMapping.html "interface in akka.persistence.journal.leveldb")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/WriteJournalBase.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/CompactionSegmentManagement.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbIdMapping.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbRecovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbStore.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbStore.html)*
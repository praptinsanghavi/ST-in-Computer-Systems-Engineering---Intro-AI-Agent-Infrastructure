---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/WriteJournalBase.html
title: WriteJournalBase
---

# WriteJournalBase

## Content

Package [akka.persistence.journal](package-summary.html)
## Interface WriteJournalBase

- All Known Subinterfaces:
`[AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal")`, `[AsyncWriteProxy](AsyncWriteProxy.html "interface in akka.persistence.journal")`, `[LeveldbStore](leveldb/LeveldbStore.html "interface in akka.persistence.journal.leveldb")`

All Known Implementing Classes:
`[AsyncWriteJournal](japi/AsyncWriteJournal.html "class in akka.persistence.journal.japi")`, `[PersistenceTestKitPlugin](../testkit/PersistenceTestKitPlugin.html "class in akka.persistence.testkit")`, `[SharedLeveldbStore](leveldb/SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`

---

```
public interface WriteJournalBase
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence")>` | `[adaptFromJournal](#adaptFromJournal(akka.persistence.PersistentRepr))​([PersistentRepr](../PersistentRepr.html "interface in akka.persistence") repr)` | INTERNAL API |
	| `[PersistentRepr](../PersistentRepr.html "interface in akka.persistence")` | `[adaptToJournal](#adaptToJournal(akka.persistence.PersistentRepr))​([PersistentRepr](../PersistentRepr.html "interface in akka.persistence") repr)` | INTERNAL API |
	| `void` | `[akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence))​([Persistence](../Persistence.html "class in akka.persistence") x$1)` |  |
	| `[Persistence](../Persistence.html "class in akka.persistence")` | `[persistence](#persistence())()` |  |
	| `scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>` | `[preparePersistentBatch](#preparePersistentBatch(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[PersistentEnvelope](../PersistentEnvelope.html "interface in akka.persistence")> rb)` |  |

- - ### Method Detail
	
	
	
		- #### adaptFromJournal
		
		
		
		```
		scala.collection.immutable.Seq<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence")> adaptFromJournal​([PersistentRepr](../PersistentRepr.html "interface in akka.persistence") repr)
		```
		
		INTERNAL API
		- #### adaptToJournal
		
		
		
		```
		[PersistentRepr](../PersistentRepr.html "interface in akka.persistence") adaptToJournal​([PersistentRepr](../PersistentRepr.html "interface in akka.persistence") repr)
		```
		
		INTERNAL API
		- #### akka$persistence$journal$WriteJournalBase$\_setter\_$persistence\_$eq
		
		
		
		```
		void akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq​([Persistence](../Persistence.html "class in akka.persistence") x$1)
		```
		- #### persistence
		
		
		
		```
		[Persistence](../Persistence.html "class in akka.persistence") persistence()
		```
		- #### preparePersistentBatch
		
		
		
		```
		scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")> preparePersistentBatch​(scala.collection.immutable.Seq<[PersistentEnvelope](../PersistentEnvelope.html "interface in akka.persistence")> rb)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Persistence.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/WriteJournalBase.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/WriteJournalBase.html)*
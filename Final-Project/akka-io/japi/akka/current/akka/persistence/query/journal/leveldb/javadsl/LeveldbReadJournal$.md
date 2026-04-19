---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal$.html
title: LeveldbReadJournal$
---

# LeveldbReadJournal$

## Content

Package [akka.persistence.query.journal.leveldb.javadsl](package-summary.html)
## Class LeveldbReadJournal$

- java.lang.Object
- - akka.persistence.query.journal.leveldb.javadsl.LeveldbReadJournal$

- ---

```
public class LeveldbReadJournal$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LeveldbReadJournal$](LeveldbReadJournal$.html "class in akka.persistence.query.journal.leveldb.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeveldbReadJournal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[Identifier](#Identifier())()` | The default identifier for [`LeveldbReadJournal`](LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl") to be used with  [`PersistenceQuery.getReadJournalFor(java.lang.Class<T>, java.lang.String, com.typesafe.config.Config)`](../../../PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config)). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LeveldbReadJournal$](LeveldbReadJournal$.html "class in akka.persistence.query.journal.leveldb.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LeveldbReadJournal$
		
		
		
		```
		public LeveldbReadJournal$()
		```

	- ### Method Detail
	
	
	
		- #### Identifier
		
		
		
		```
		public final java.lang.String Identifier()
		```
		
		The default identifier for [`LeveldbReadJournal`](LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl") to be used with
		 [`PersistenceQuery.getReadJournalFor(java.lang.Class<T>, java.lang.String, com.typesafe.config.Config)`](../../../PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config)).
		 
		 The value is `"akka.persistence.query.journal.leveldb"` and corresponds
		 to the absolute path to the read journal configuration entry.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal$.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal$.html)*
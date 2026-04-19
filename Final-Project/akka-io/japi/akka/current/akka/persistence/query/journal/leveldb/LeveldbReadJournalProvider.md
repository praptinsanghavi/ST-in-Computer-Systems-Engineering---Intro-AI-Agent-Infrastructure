---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html
title: LeveldbReadJournalProvider
---

# LeveldbReadJournalProvider

## Content

Package [akka.persistence.query.journal.leveldb](package-summary.html)
## Class LeveldbReadJournalProvider

- java.lang.Object
- - akka.persistence.query.journal.leveldb.LeveldbReadJournalProvider

- All Implemented Interfaces:
`[ReadJournalProvider](../../ReadJournalProvider.html "interface in akka.persistence.query")`

---

```
public class LeveldbReadJournalProvider
extends java.lang.Object
implements [ReadJournalProvider](../../ReadJournalProvider.html "interface in akka.persistence.query")
```

Deprecated.
Use another journal/query implementation. Since 2\.6\.15\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeveldbReadJournalProvider](#%3Cinit%3E(akka.actor.ExtendedActorSystem,com.typesafe.config.Config))​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system,  com.typesafe.config.Config config)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")` | `[javadslReadJournal](#javadslReadJournal())()` | Deprecated. The `ReadJournal` implementation for the Java API. |
	| `[LeveldbReadJournal](javadsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl")` | `[javaReadJournal](#javaReadJournal())()` | Deprecated. |
	| `[LeveldbReadJournal](scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl")` | `[readJournal](#readJournal())()` | Deprecated. |
	| `[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")` | `[scaladslReadJournal](#scaladslReadJournal())()` | Deprecated. The `ReadJournal` implementation for the Scala API. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LeveldbReadJournalProvider
		
		
		
		```
		public LeveldbReadJournalProvider​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                  com.typesafe.config.Config config)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### javaReadJournal
		
		
		
		```
		public [LeveldbReadJournal](javadsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl") javaReadJournal()
		```
		
		Deprecated.
		- #### javadslReadJournal
		
		
		
		```
		public [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl") javadslReadJournal()
		```
		
		Deprecated.
		Description copied from interface: `[ReadJournalProvider](../../ReadJournalProvider.html#javadslReadJournal())`
		The `ReadJournal` implementation for the Java API.
		 This corresponds to the instance that is returned by [`PersistenceQuery.getReadJournalFor(java.lang.Class<T>, java.lang.String, com.typesafe.config.Config)`](../../PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config)).
		
		Specified by:
		`[javadslReadJournal](../../ReadJournalProvider.html#javadslReadJournal())` in interface `[ReadJournalProvider](../../ReadJournalProvider.html "interface in akka.persistence.query")`
		- #### readJournal
		
		
		
		```
		public [LeveldbReadJournal](scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl") readJournal()
		```
		
		Deprecated.
		- #### scaladslReadJournal
		
		
		
		```
		public [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl") scaladslReadJournal()
		```
		
		Deprecated.
		Description copied from interface: `[ReadJournalProvider](../../ReadJournalProvider.html#scaladslReadJournal())`
		The `ReadJournal` implementation for the Scala API.
		 This corresponds to the instance that is returned by [`PersistenceQuery.readJournalFor(java.lang.String, com.typesafe.config.Config)`](../../PersistenceQuery.html#readJournalFor(java.lang.String,com.typesafe.config.Config)).
		
		Specified by:
		`[scaladslReadJournal](../../ReadJournalProvider.html#scaladslReadJournal())` in interface `[ReadJournalProvider](../../ReadJournalProvider.html "interface in akka.persistence.query")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html)*
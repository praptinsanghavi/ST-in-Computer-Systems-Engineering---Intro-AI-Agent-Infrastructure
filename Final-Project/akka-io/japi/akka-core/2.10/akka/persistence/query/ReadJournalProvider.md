---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html
title: ReadJournalProvider
---

# ReadJournalProvider

## Content

Package [akka.persistence.query](package-summary.html)
## Interface ReadJournalProvider

- All Known Implementing Classes:
`[EventsBySliceFirehoseReadJournalProvider](typed/EventsBySliceFirehoseReadJournalProvider.html "class in akka.persistence.query.typed")`, `[LeveldbReadJournalProvider](journal/leveldb/LeveldbReadJournalProvider.html "class in akka.persistence.query.journal.leveldb")`, `[PersistenceTestKitReadJournalProvider](../testkit/query/PersistenceTestKitReadJournalProvider.html "class in akka.persistence.testkit.query")`

---

```
public interface ReadJournalProvider
```

A query plugin must implement a class that implements this trait.
 It provides the concrete implementations for the Java and Scala APIs.
 
 A read journal plugin must provide implementations for both
 `akka.persistence.query.scaladsl.ReadJournal` and `akka.persistence.query.javadsl.ReadJournal`.
 The plugin must implement both the `scaladsl` and the `javadsl` traits because the
 `akka.stream.scaladsl.Source` and `akka.stream.javadsl.Source` are different types
 and even though those types can easily be converted to each other it is most convenient
 for the end user to get access to the Java or Scala `Source` directly.
 One of the implementations can delegate to the other.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReadJournal](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")` | `[javadslReadJournal](#javadslReadJournal())()` | The `ReadJournal` implementation for the Java API. |
	| `[ReadJournal](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")` | `[scaladslReadJournal](#scaladslReadJournal())()` | The `ReadJournal` implementation for the Scala API. |

- - ### Method Detail
	
	
	
		- #### javadslReadJournal
		
		
		
		```
		[ReadJournal](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl") javadslReadJournal()
		```
		
		The `ReadJournal` implementation for the Java API.
		 This corresponds to the instance that is returned by [`PersistenceQuery.getReadJournalFor(java.lang.Class<T>, java.lang.String, com.typesafe.config.Config)`](PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config)).
		- #### scaladslReadJournal
		
		
		
		```
		[ReadJournal](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl") scaladslReadJournal()
		```
		
		The `ReadJournal` implementation for the Scala API.
		 This corresponds to the instance that is returned by [`PersistenceQuery.readJournalFor(java.lang.String, com.typesafe.config.Config)`](PersistenceQuery.html#readJournalFor(java.lang.String,com.typesafe.config.Config)).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/LeveldbReadJournalProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html)*
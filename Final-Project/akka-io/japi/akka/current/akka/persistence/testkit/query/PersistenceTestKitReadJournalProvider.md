---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html
title: PersistenceTestKitReadJournalProvider
---

# PersistenceTestKitReadJournalProvider

## Content

Package [akka.persistence.testkit.query](package-summary.html)
## Class PersistenceTestKitReadJournalProvider

- java.lang.Object
- - akka.persistence.testkit.query.PersistenceTestKitReadJournalProvider

- All Implemented Interfaces:
`[ReadJournalProvider](../../query/ReadJournalProvider.html "interface in akka.persistence.query")`

---

```
public class PersistenceTestKitReadJournalProvider
extends java.lang.Object
implements [ReadJournalProvider](../../query/ReadJournalProvider.html "interface in akka.persistence.query")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceTestKitReadJournalProvider](#%3Cinit%3E(akka.actor.ExtendedActorSystem,com.typesafe.config.Config,java.lang.String))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system,  com.typesafe.config.Config config,  java.lang.String configPath)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PersistenceTestKitReadJournal](javadsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.javadsl")` | `[javadslReadJournal](#javadslReadJournal())()` | The `ReadJournal` implementation for the Java API. |
	| `[PersistenceTestKitReadJournal](scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl")` | `[scaladslReadJournal](#scaladslReadJournal())()` | The `ReadJournal` implementation for the Scala API. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceTestKitReadJournalProvider
		
		
		
		```
		public PersistenceTestKitReadJournalProvider​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                             com.typesafe.config.Config config,
		                                             java.lang.String configPath)
		```

	- ### Method Detail
	
	
	
		- #### javadslReadJournal
		
		
		
		```
		public [PersistenceTestKitReadJournal](javadsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.javadsl") javadslReadJournal()
		```
		
		Description copied from interface: `[ReadJournalProvider](../../query/ReadJournalProvider.html#javadslReadJournal())`
		The `ReadJournal` implementation for the Java API.
		 This corresponds to the instance that is returned by [`PersistenceQuery.getReadJournalFor(java.lang.Class<T>, java.lang.String, com.typesafe.config.Config)`](../../query/PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config)).
		
		Specified by:
		`[javadslReadJournal](../../query/ReadJournalProvider.html#javadslReadJournal())` in interface `[ReadJournalProvider](../../query/ReadJournalProvider.html "interface in akka.persistence.query")`
		- #### scaladslReadJournal
		
		
		
		```
		public [PersistenceTestKitReadJournal](scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl") scaladslReadJournal()
		```
		
		Description copied from interface: `[ReadJournalProvider](../../query/ReadJournalProvider.html#scaladslReadJournal())`
		The `ReadJournal` implementation for the Scala API.
		 This corresponds to the instance that is returned by [`PersistenceQuery.readJournalFor(java.lang.String, com.typesafe.config.Config)`](../../query/PersistenceQuery.html#readJournalFor(java.lang.String,com.typesafe.config.Config)).
		
		Specified by:
		`[scaladslReadJournal](../../query/ReadJournalProvider.html#scaladslReadJournal())` in interface `[ReadJournalProvider](../../query/ReadJournalProvider.html "interface in akka.persistence.query")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/PersistenceTestKitReadJournalProvider.html)*
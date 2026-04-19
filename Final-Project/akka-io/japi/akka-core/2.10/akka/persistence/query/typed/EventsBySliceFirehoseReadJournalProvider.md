---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html
title: EventsBySliceFirehoseReadJournalProvider
---

# EventsBySliceFirehoseReadJournalProvider

## Content

Package [akka.persistence.query.typed](package-summary.html)
## Class EventsBySliceFirehoseReadJournalProvider

- java.lang.Object
- - akka.persistence.query.typed.EventsBySliceFirehoseReadJournalProvider

- All Implemented Interfaces:
`[ReadJournalProvider](../ReadJournalProvider.html "interface in akka.persistence.query")`

---

```
public final class EventsBySliceFirehoseReadJournalProvider
extends java.lang.Object
implements [ReadJournalProvider](../ReadJournalProvider.html "interface in akka.persistence.query")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventsBySliceFirehoseReadJournalProvider](#%3Cinit%3E(akka.actor.ExtendedActorSystem,com.typesafe.config.Config,java.lang.String))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system,  com.typesafe.config.Config config,  java.lang.String cfgPath)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventsBySliceFirehoseQuery](javadsl/EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl")` | `[javadslReadJournal](#javadslReadJournal())()` | The `ReadJournal` implementation for the Java API. |
	| `[EventsBySliceFirehoseQuery](scaladsl/EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl")` | `[scaladslReadJournal](#scaladslReadJournal())()` | The `ReadJournal` implementation for the Scala API. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventsBySliceFirehoseReadJournalProvider
		
		
		
		```
		public EventsBySliceFirehoseReadJournalProvider​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                                com.typesafe.config.Config config,
		                                                java.lang.String cfgPath)
		```

	- ### Method Detail
	
	
	
		- #### javadslReadJournal
		
		
		
		```
		public [EventsBySliceFirehoseQuery](javadsl/EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl") javadslReadJournal()
		```
		
		Description copied from interface: `[ReadJournalProvider](../ReadJournalProvider.html#javadslReadJournal())`
		The `ReadJournal` implementation for the Java API.
		 This corresponds to the instance that is returned by [`PersistenceQuery.getReadJournalFor(java.lang.Class<T>, java.lang.String, com.typesafe.config.Config)`](../PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config)).
		
		Specified by:
		`[javadslReadJournal](../ReadJournalProvider.html#javadslReadJournal())` in interface `[ReadJournalProvider](../ReadJournalProvider.html "interface in akka.persistence.query")`
		- #### scaladslReadJournal
		
		
		
		```
		public [EventsBySliceFirehoseQuery](scaladsl/EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl") scaladslReadJournal()
		```
		
		Description copied from interface: `[ReadJournalProvider](../ReadJournalProvider.html#scaladslReadJournal())`
		The `ReadJournal` implementation for the Scala API.
		 This corresponds to the instance that is returned by [`PersistenceQuery.readJournalFor(java.lang.String, com.typesafe.config.Config)`](../PersistenceQuery.html#readJournalFor(java.lang.String,com.typesafe.config.Config)).
		
		Specified by:
		`[scaladslReadJournal](../ReadJournalProvider.html#scaladslReadJournal())` in interface `[ReadJournalProvider](../ReadJournalProvider.html "interface in akka.persistence.query")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html)*
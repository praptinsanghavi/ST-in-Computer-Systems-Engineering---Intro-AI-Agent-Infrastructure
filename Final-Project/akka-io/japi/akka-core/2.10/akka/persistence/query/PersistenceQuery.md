---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
title: PersistenceQuery
---

# PersistenceQuery

## Content

Package [akka.persistence.query](package-summary.html)
## Class PersistenceQuery

- java.lang.Object
- - akka.persistence.PersistencePlugin\<[ReadJournal](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl"),​[ReadJournal](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl"),​[ReadJournalProvider](ReadJournalProvider.html "interface in akka.persistence.query")\>
	- - akka.persistence.query.PersistenceQuery

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class PersistenceQuery
extends akka.persistence.PersistencePlugin<[ReadJournal](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl"),​[ReadJournal](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl"),​[ReadJournalProvider](ReadJournalProvider.html "interface in akka.persistence.query")>
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.persistence.PersistencePlugin
		
		
		`akka.persistence.PersistencePlugin.PluginHolder<ScalaDsl extends java.lang.Object,​JavaDsl extends java.lang.Object>, akka.persistence.PersistencePlugin.PluginHolder$`

	- ### Field Summary
	
	
		- ### Fields inherited from class akka.persistence.PersistencePlugin
		
		
		`akka$persistence$PersistencePlugin$$ev, akka$persistence$PersistencePlugin$$system`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceQuery](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [PersistenceQuery](PersistenceQuery.html "class in akka.persistence.query")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [PersistenceQuery](PersistenceQuery.html "class in akka.persistence.query")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [PersistenceQuery](PersistenceQuery.html "class in akka.persistence.query")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `<T extends [ReadJournal](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")>T` | `[getReadJournalFor](#getReadJournalFor(java.lang.Class,java.lang.String))​(java.lang.Class<T> clazz,  java.lang.String readJournalPluginId)` |  |
	| `<T extends [ReadJournal](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")>T` | `[getReadJournalFor](#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config))​(java.lang.Class<T> clazz,  java.lang.String readJournalPluginId,  com.typesafe.config.Config readJournalPluginConfig)` | Java API: Returns the [`ReadJournal`](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl") specified by the given  read journal configuration entry. |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [PersistenceQuery$](PersistenceQuery$.html "class in akka.persistence.query")` | `[lookup](#lookup())()` |  |
	| `<T extends [ReadJournal](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")>T` | `[readJournalFor](#readJournalFor(java.lang.String))​(java.lang.String readJournalPluginId)` | Scala API: Returns the [`ReadJournal`](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl") specified by the given  read journal configuration entry. |
	| `<T extends [ReadJournal](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")>T` | `[readJournalFor](#readJournalFor(java.lang.String,com.typesafe.config.Config))​(java.lang.String readJournalPluginId,  com.typesafe.config.Config readJournalPluginConfig)` | Scala API: Returns the [`ReadJournal`](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl") specified by the given  read journal configuration entry. |
	
	
		- ### Methods inherited from class akka.persistence.PersistencePlugin
		
		
		`akka$persistence$PersistencePlugin$$createPlugin, akka$persistence$PersistencePlugin$$instantiate$1, pluginFor`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceQuery
		
		
		
		```
		public PersistenceQuery​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [PersistenceQuery](PersistenceQuery.html "class in akka.persistence.query") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [PersistenceQuery](PersistenceQuery.html "class in akka.persistence.query") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### createExtension
		
		
		
		```
		public static [PersistenceQuery](PersistenceQuery.html "class in akka.persistence.query") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [PersistenceQuery$](PersistenceQuery$.html "class in akka.persistence.query") lookup()
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### readJournalFor
		
		
		
		```
		public final <T extends [ReadJournal](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")> T readJournalFor​(java.lang.String readJournalPluginId,
		                                                      com.typesafe.config.Config readJournalPluginConfig)
		```
		
		Scala API: Returns the [`ReadJournal`](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl") specified by the given
		 read journal configuration entry.
		 
		 The provided readJournalPluginConfig will be used to configure the journal plugin instead of the actor system
		 config.
		- #### readJournalFor
		
		
		
		```
		public final <T extends [ReadJournal](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")> T readJournalFor​(java.lang.String readJournalPluginId)
		```
		
		Scala API: Returns the [`ReadJournal`](scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl") specified by the given
		 read journal configuration entry.
		- #### getReadJournalFor
		
		
		
		```
		public final <T extends [ReadJournal](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")> T getReadJournalFor​(java.lang.Class<T> clazz,
		                                                         java.lang.String readJournalPluginId,
		                                                         com.typesafe.config.Config readJournalPluginConfig)
		```
		
		Java API: Returns the [`ReadJournal`](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl") specified by the given
		 read journal configuration entry.
		- #### getReadJournalFor
		
		
		
		```
		public final <T extends [ReadJournal](javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")> T getReadJournalFor​(java.lang.Class<T> clazz,
		                                                         java.lang.String readJournalPluginId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html)*
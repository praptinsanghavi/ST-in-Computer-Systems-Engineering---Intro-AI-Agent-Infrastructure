---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/PersistenceInit$.html
title: PersistenceInit$
---

# PersistenceInit$

## Content

Package [akka.persistence.testkit.javadsl](package-summary.html)
## Class PersistenceInit$

- java.lang.Object
- - akka.persistence.testkit.javadsl.PersistenceInit$

- ---

```
public class PersistenceInit$
extends java.lang.Object
```

Test utility to initialize persistence plugins. Useful when initialization order or coordination
 is needed. For example to avoid creating tables concurrently.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistenceInit$](PersistenceInit$.html "class in akka.persistence.testkit.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceInit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")>` | `[initializeDefaultPlugins](#initializeDefaultPlugins(akka.actor.ClassicActorSystemProvider,java.time.Duration))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,  java.time.Duration timeout)` | Initialize the default journal and snapshot plugins. |
	| `java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")>` | `[initializePlugins](#initializePlugins(akka.actor.ClassicActorSystemProvider,java.lang.String,java.lang.String,java.time.Duration))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,  java.lang.String journalPluginId,  java.lang.String snapshotPluginId,  java.time.Duration timeout)` | Initialize the given journal and snapshot plugins. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistenceInit$](PersistenceInit$.html "class in akka.persistence.testkit.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistenceInit$
		
		
		
		```
		public PersistenceInit$()
		```

	- ### Method Detail
	
	
	
		- #### initializeDefaultPlugins
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")> initializeDefaultPlugins​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,
		                                                                           java.time.Duration timeout)
		```
		
		Initialize the default journal and snapshot plugins.
		 
		
		Returns:
		a `CompletionStage` that is completed when the initialization has completed
		- #### initializePlugins
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")> initializePlugins​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,
		                                                                    java.lang.String journalPluginId,
		                                                                    java.lang.String snapshotPluginId,
		                                                                    java.time.Duration timeout)
		```
		
		Initialize the given journal and snapshot plugins.
		 
		 The `snapshotPluginId` can be empty (`""`) if snapshot plugin isn't used.
		 
		
		
		
		Returns:
		a `CompletionStage` that is completed when the initialization has completed

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/PersistenceInit$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/PersistenceInit$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/PersistenceInit$.html)*
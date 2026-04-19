---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceInit$.html
title: PersistenceInit$
---

# PersistenceInit$

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Class PersistenceInit$

- java.lang.Object
- - akka.persistence.testkit.scaladsl.PersistenceInit$

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
	| `static [PersistenceInit$](PersistenceInit$.html "class in akka.persistence.testkit.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceInit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[Done](../../../Done.html "class in akka")>` | `[initializeDefaultPlugins](#initializeDefaultPlugins(akka.actor.ClassicActorSystemProvider,scala.concurrent.duration.FiniteDuration))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,  scala.concurrent.duration.FiniteDuration timeout)` | Initialize the default journal and snapshot plugins. |
	| `scala.concurrent.Future<[Done](../../../Done.html "class in akka")>` | `[initializePlugins](#initializePlugins(akka.actor.ClassicActorSystemProvider,java.lang.String,java.lang.String,scala.concurrent.duration.FiniteDuration))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,  java.lang.String journalPluginId,  java.lang.String snapshotPluginId,  scala.concurrent.duration.FiniteDuration timeout)` | Initialize the given journal and snapshot plugins. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistenceInit$](PersistenceInit$.html "class in akka.persistence.testkit.scaladsl") MODULE$
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
		public scala.concurrent.Future<[Done](../../../Done.html "class in akka")> initializeDefaultPlugins​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,
		                                                              scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Initialize the default journal and snapshot plugins.
		 
		
		Returns:
		a `Future` that is completed when the initialization has completed
		- #### initializePlugins
		
		
		
		```
		public scala.concurrent.Future<[Done](../../../Done.html "class in akka")> initializePlugins​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,
		                                                       java.lang.String journalPluginId,
		                                                       java.lang.String snapshotPluginId,
		                                                       scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Initialize the given journal and snapshot plugins.
		 
		 The `snapshotPluginId` can be empty (`""`) if snapshot plugin isn't used.
		 
		
		
		
		Returns:
		a `Future` that is completed when the initialization has completed

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceInit$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceInit$.html)*
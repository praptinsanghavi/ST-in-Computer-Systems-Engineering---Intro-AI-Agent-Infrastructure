---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbJournal$.html
title: SharedLeveldbJournal$
---

# SharedLeveldbJournal$

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Class SharedLeveldbJournal$

- java.lang.Object
- - akka.persistence.journal.leveldb.SharedLeveldbJournal$

- ---

```
public class SharedLeveldbJournal$
extends java.lang.Object
```

For testing only.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SharedLeveldbJournal$](SharedLeveldbJournal$.html "class in akka.persistence.journal.leveldb")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SharedLeveldbJournal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[configToEnableJavaSerializationForTest](#configToEnableJavaSerializationForTest())()` | Configuration to enable `TestJavaSerializer` in `akka-testkit` for  for the messages used by `SharedLeveldbJournal`. |
	| `void` | `[setStore](#setStore(akka.actor.ActorRef,akka.actor.ActorSystem))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") store,  [ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Sets the shared LevelDB `store` for the given actor `system`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SharedLeveldbJournal$](SharedLeveldbJournal$.html "class in akka.persistence.journal.leveldb") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SharedLeveldbJournal$
		
		
		
		```
		public SharedLeveldbJournal$()
		```

	- ### Method Detail
	
	
	
		- #### setStore
		
		
		
		```
		public void setStore​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") store,
		                     [ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Sets the shared LevelDB `store` for the given actor `system`.
		 
		
		See Also:
		[`SharedLeveldbStore`](SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")
		- #### configToEnableJavaSerializationForTest
		
		
		
		```
		public com.typesafe.config.Config configToEnableJavaSerializationForTest()
		```
		
		Configuration to enable `TestJavaSerializer` in `akka-testkit` for
		 for the messages used by `SharedLeveldbJournal`.
		 
		 For testing only.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbJournal$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbJournal$.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/SharedLeveldbJournal$.html)*
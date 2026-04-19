---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbIdMapping.html
title: LeveldbIdMapping
---

# LeveldbIdMapping

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Interface LeveldbIdMapping

- All Superinterfaces:
`[Actor](../../../actor/Actor.html "interface in akka.actor")`

All Known Subinterfaces:
`[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`

All Known Implementing Classes:
`[SharedLeveldbStore](SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`

---

```
public interface LeveldbIdMapping
extends [Actor](../../../actor/Actor.html "interface in akka.actor")
```

INTERNAL API.
 
 LevelDB backed persistent mapping of `String`\-based persistent actor ids to numeric ids.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<java.lang.String>` | `[allPersistenceIds](#allPersistenceIds())()` |  |
	| `void` | `[idMap_$eq](#idMap_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` |  |
	| `boolean` | `[isNewPersistenceId](#isNewPersistenceId(java.lang.String))​(java.lang.String id)` |  |
	| `void` | `[newPersistenceIdAdded](#newPersistenceIdAdded(java.lang.String))​(java.lang.String id)` |  |
	| `int` | `[numericId](#numericId(java.lang.String))​(java.lang.String id)` | Get the mapped numeric id for the specified persistent actor `id`. |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[readIdMap](#readIdMap())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[readIdMap](#readIdMap(scala.collection.immutable.Map,org.iq80.leveldb.DBIterator))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> pathMap,  org.iq80.leveldb.DBIterator iter)` |  |
	| `void` | `[super$preStart](#super$preStart())()` | Get the mapped numeric id for the specified persistent actor `id`. |
	| `int` | `[writeIdMapping](#writeIdMapping(java.lang.String,int))​(java.lang.String id,  int numericId)` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../../../actor/Actor.html#context()), [postRestart](../../../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../../../actor/Actor.html#postStop()), [preRestart](../../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [receive](../../../actor/Actor.html#receive()), [self](../../../actor/Actor.html#self()), [sender](../../../actor/Actor.html#sender()), [supervisorStrategy](../../../actor/Actor.html#supervisorStrategy()), [unhandled](../../../actor/Actor.html#unhandled(java.lang.Object))`

- - ### Method Detail
	
	
	
		- #### allPersistenceIds
		
		
		
		```
		scala.collection.immutable.Set<java.lang.String> allPersistenceIds()
		```
		- #### idMap\_$eq
		
		
		
		```
		void idMap_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		- #### isNewPersistenceId
		
		
		
		```
		boolean isNewPersistenceId​(java.lang.String id)
		```
		- #### newPersistenceIdAdded
		
		
		
		```
		void newPersistenceIdAdded​(java.lang.String id)
		```
		- #### numericId
		
		
		
		```
		int numericId​(java.lang.String id)
		```
		
		Get the mapped numeric id for the specified persistent actor `id`. Creates and
		 stores a new mapping if necessary.
		 
		 This method is thread safe and it is allowed to call it from a another
		 thread than the actor's thread. That is necessary for Future composition,
		 e.g. `asyncReadHighestSequenceNr` followed by `asyncReplayMessages`.
		- #### preStart
		
		
		
		```
		void preStart()
		```
		
		Description copied from interface: `[Actor](../../../actor/Actor.html#preStart())`
		User overridable callback.
		 
		 Is called when an Actor is started.
		 Actors are automatically started asynchronously when created.
		 Empty default implementation.
		
		Specified by:
		`[preStart](../../../actor/Actor.html#preStart())` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### readIdMap
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​java.lang.Object> readIdMap()
		```
		- #### readIdMap
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​java.lang.Object> readIdMap​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> pathMap,
		                                                                                  org.iq80.leveldb.DBIterator iter)
		```
		- #### super$preStart
		
		
		
		```
		void super$preStart()
		```
		
		Get the mapped numeric id for the specified persistent actor `id`. Creates and
		 stores a new mapping if necessary.
		 
		 This method is thread safe and it is allowed to call it from a another
		 thread than the actor's thread. That is necessary for Future composition,
		 e.g. `asyncReadHighestSequenceNr` followed by `asyncReplayMessages`.
		- #### writeIdMapping
		
		
		
		```
		int writeIdMapping​(java.lang.String id,
		                   int numericId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbIdMapping.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/leveldb/LeveldbIdMapping.html)*
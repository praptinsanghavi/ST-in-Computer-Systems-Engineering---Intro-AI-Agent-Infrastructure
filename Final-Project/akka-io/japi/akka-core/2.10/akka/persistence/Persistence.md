---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Persistence.html
title: Persistence
---

# Persistence

## Content

Package [akka.persistence](package-summary.html)
## Class Persistence

- java.lang.Object
- - akka.persistence.Persistence

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public class Persistence
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

Persistence extension.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Persistence.PluginHolder$](Persistence.PluginHolder$.html "class in akka.persistence")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Persistence](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventAdapters](journal/EventAdapters.html "class in akka.persistence.journal")` | `[adaptersFor](#adaptersFor(java.lang.String))​(java.lang.String journalPluginId)` | Returns an [`EventAdapters`](journal/EventAdapters.html "class in akka.persistence.journal") object which serves as a per\-journal collection of bound event adapters. |
	| `[EventAdapters](journal/EventAdapters.html "class in akka.persistence.journal")` | `[adaptersFor](#adaptersFor(java.lang.String,com.typesafe.config.Config))​(java.lang.String journalPluginId,  com.typesafe.config.Config journalPluginConfig)` | Returns an [`EventAdapters`](journal/EventAdapters.html "class in akka.persistence.journal") object which serves as a per\-journal collection of bound event adapters. |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [Persistence](Persistence.html "class in akka.persistence")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence")` | `[defaultInternalStashOverflowStrategy](#defaultInternalStashOverflowStrategy())()` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [Persistence](Persistence.html "class in akka.persistence")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Java API. |
	| `static [Persistence](Persistence.html "class in akka.persistence")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `java.util.List<[Pair](../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>>` | `[getSliceRanges](#getSliceRanges(int))​(int numberOfRanges)` | Java API: Split the total number of slices into ranges by the given `numberOfRanges`. |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static java.lang.String` | `[JournalFallbackConfigPath](#JournalFallbackConfigPath())()` | Config path to fall\-back to if a setting is not defined in a specific plugin's config section |
	| `static [Persistence$](Persistence$.html "class in akka.persistence")` | `[lookup](#lookup())()` |  |
	| `int` | `[numberOfSlices](#numberOfSlices())()` | A slice is deterministically defined based on the persistence id. |
	| `java.lang.String` | `[persistenceId](#persistenceId(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") persistentActor)` | Creates a canonical persistent actor id from a persistent actor ref. |
	| `[PersistenceSettings](PersistenceSettings.html "class in akka.persistence")` | `[settings](#settings())()` |  |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` | A slice is deterministically defined based on the persistence id. |
	| `scala.collection.immutable.IndexedSeq<scala.collection.immutable.Range>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` | Scala API: Split the total number of slices into ranges by the given `numberOfRanges`. |
	| `static java.lang.String` | `[SnapshotStoreFallbackConfigPath](#SnapshotStoreFallbackConfigPath())()` | Config path to fall\-back to if a setting is not defined in a specific snapshot plugin's config section |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Persistence
		
		
		
		```
		public Persistence​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [Persistence](Persistence.html "class in akka.persistence") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API.
		- #### get
		
		
		
		```
		public static [Persistence](Persistence.html "class in akka.persistence") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### createExtension
		
		
		
		```
		public static [Persistence](Persistence.html "class in akka.persistence") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [Persistence$](Persistence$.html "class in akka.persistence") lookup()
		```
		- #### JournalFallbackConfigPath
		
		
		
		```
		public static java.lang.String JournalFallbackConfigPath()
		```
		
		Config path to fall\-back to if a setting is not defined in a specific plugin's config section
		- #### SnapshotStoreFallbackConfigPath
		
		
		
		```
		public static java.lang.String SnapshotStoreFallbackConfigPath()
		```
		
		Config path to fall\-back to if a setting is not defined in a specific snapshot plugin's config section
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		- #### defaultInternalStashOverflowStrategy
		
		
		
		```
		public [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence") defaultInternalStashOverflowStrategy()
		```
		- #### settings
		
		
		
		```
		public [PersistenceSettings](PersistenceSettings.html "class in akka.persistence") settings()
		```
		- #### adaptersFor
		
		
		
		```
		public final [EventAdapters](journal/EventAdapters.html "class in akka.persistence.journal") adaptersFor​(java.lang.String journalPluginId)
		```
		
		Returns an [`EventAdapters`](journal/EventAdapters.html "class in akka.persistence.journal") object which serves as a per\-journal collection of bound event adapters.
		 If no adapters are registered for a given journal the EventAdapters object will simply return the identity
		 adapter for each class, otherwise the most specific adapter matching a given class will be returned.
		- #### adaptersFor
		
		
		
		```
		public final [EventAdapters](journal/EventAdapters.html "class in akka.persistence.journal") adaptersFor​(java.lang.String journalPluginId,
		                                       com.typesafe.config.Config journalPluginConfig)
		```
		
		Returns an [`EventAdapters`](journal/EventAdapters.html "class in akka.persistence.journal") object which serves as a per\-journal collection of bound event adapters.
		 If no adapters are registered for a given journal the EventAdapters object will simply return the identity
		 adapter for each class, otherwise the most specific adapter matching a given class will be returned.
		 
		 The provided journalPluginConfig will be used to configure the plugin instead of the actor system config.
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId​([ActorRef](../actor/ActorRef.html "class in akka.actor") persistentActor)
		```
		
		Creates a canonical persistent actor id from a persistent actor ref.
		- #### numberOfSlices
		
		
		
		```
		public final int numberOfSlices()
		```
		
		A slice is deterministically defined based on the persistence id.
		 `numberOfSlices` is not configurable because changing the value would result in
		 different slice for a persistence id than what was used before, which would
		 result in invalid eventsBySlices.
		 
		`numberOfSlices` is 1024
		- #### sliceForPersistenceId
		
		
		
		```
		public final int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		
		A slice is deterministically defined based on the persistence id. The purpose is to
		 evenly distribute all persistence ids over the slices and be able to query the
		 events for a range of slices.
		- #### sliceRanges
		
		
		
		```
		public final scala.collection.immutable.IndexedSeq<scala.collection.immutable.Range> sliceRanges​(int numberOfRanges)
		```
		
		Scala API: Split the total number of slices into ranges by the given `numberOfRanges`.
		 
		 For example, `numberOfSlices` is 1024 and given 4 `numberOfRanges` this method will
		 return ranges (0 to 255\), (256 to 511\), (512 to 767\) and (768 to 1023\).
		- #### getSliceRanges
		
		
		
		```
		public final java.util.List<[Pair](../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>> getSliceRanges​(int numberOfRanges)
		```
		
		Java API: Split the total number of slices into ranges by the given `numberOfRanges`.
		 
		 For example, `numberOfSlices` is 128 and given 4 `numberOfRanges` this method will
		 return ranges (0 to 255\), (256 to 511\), (512 to 767\) and (768 to 1023\).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Persistence$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Persistence.PluginHolder$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Persistence.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Persistence.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Persistence.html)*
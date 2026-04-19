---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension.html
title: InMemStorageExtension
---

# InMemStorageExtension

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Class InMemStorageExtension

- java.lang.Object
- - akka.persistence.testkit.internal.InMemStorageExtension

- All Implemented Interfaces:
`[Extension](../../../actor/Extension.html "interface in akka.actor")`

---

```
public final class InMemStorageExtension
extends java.lang.Object
implements [Extension](../../../actor/Extension.html "interface in akka.actor")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InMemStorageExtension](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `[ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit")>` | `[currentPolicy](#currentPolicy())()` |  |
	| `[EventStorage](../EventStorage.html "interface in akka.persistence.testkit")` | `[defaultStorage](#defaultStorage())()` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [InMemStorageExtension$](InMemStorageExtension$.html "class in akka.persistence.testkit.internal")` | `[lookup](#lookup())()` |  |
	| `void` | `[resetPolicy](#resetPolicy())()` |  |
	| `void` | `[setPolicy](#setPolicy(akka.persistence.testkit.ProcessingPolicy))​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit")> policy)` |  |
	| `[EventStorage](../EventStorage.html "interface in akka.persistence.testkit")` | `[storageFor](#storageFor(java.lang.String))​(java.lang.String key)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### InMemStorageExtension
		
		
		
		```
		public InMemStorageExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal") get​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### createExtension
		
		
		
		```
		public static [InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [InMemStorageExtension$](InMemStorageExtension$.html "class in akka.persistence.testkit.internal") lookup()
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### defaultStorage
		
		
		
		```
		public [EventStorage](../EventStorage.html "interface in akka.persistence.testkit") defaultStorage()
		```
		- #### currentPolicy
		
		
		
		```
		public [ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit")> currentPolicy()
		```
		- #### setPolicy
		
		
		
		```
		public void setPolicy​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[JournalOperation](../JournalOperation.html "interface in akka.persistence.testkit")> policy)
		```
		- #### resetPolicy
		
		
		
		```
		public void resetPolicy()
		```
		- #### storageFor
		
		
		
		```
		public [EventStorage](../EventStorage.html "interface in akka.persistence.testkit") storageFor​(java.lang.String key)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/EventStorage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension.html)*
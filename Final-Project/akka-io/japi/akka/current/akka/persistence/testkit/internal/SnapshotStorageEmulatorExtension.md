---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension.html
title: SnapshotStorageEmulatorExtension
---

# SnapshotStorageEmulatorExtension

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Class SnapshotStorageEmulatorExtension

- java.lang.Object
- - akka.persistence.testkit.internal.SnapshotStorageEmulatorExtension

- ---

```
public class SnapshotStorageEmulatorExtension
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotStorageEmulatorExtension](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../../../actor/Extension.html "interface in akka.actor")>` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SnapshotStorageEmulatorExtension
		
		
		
		```
		public SnapshotStorageEmulatorExtension()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit") get​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### createExtension
		
		
		
		```
		public static [SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../../../actor/Extension.html "interface in akka.actor")> lookup()
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension.html)*
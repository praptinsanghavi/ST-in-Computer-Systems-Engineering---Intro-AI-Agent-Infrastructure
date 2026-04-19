---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension$.html
title: SnapshotStorageEmulatorExtension$
---

# SnapshotStorageEmulatorExtension$

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Class SnapshotStorageEmulatorExtension$

- java.lang.Object
- - akka.persistence.testkit.internal.SnapshotStorageEmulatorExtension$

- All Implemented Interfaces:
`[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")>`, `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class SnapshotStorageEmulatorExtension$
extends java.lang.Object
implements [ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")>, [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotStorageEmulatorExtension$](SnapshotStorageEmulatorExtension$.html "class in akka.persistence.testkit.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotStorageEmulatorExtension$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../../../actor/Extension.html "interface in akka.actor")>` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../../actor/ExtensionId.html#equals(java.lang.Object)), [get](../../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider)), [hashCode](../../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotStorageEmulatorExtension$](SnapshotStorageEmulatorExtension$.html "class in akka.persistence.testkit.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotStorageEmulatorExtension$
		
		
		
		```
		public SnapshotStorageEmulatorExtension$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit") get​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")>`
		- #### createExtension
		
		
		
		```
		public [SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")>`
		- #### lookup
		
		
		
		```
		public [ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../../../actor/Extension.html "interface in akka.actor")> lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")`

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension$.html)*
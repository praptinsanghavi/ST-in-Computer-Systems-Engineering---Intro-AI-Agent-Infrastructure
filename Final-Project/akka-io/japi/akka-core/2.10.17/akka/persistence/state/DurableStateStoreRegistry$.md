---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry$.html
title: DurableStateStoreRegistry$
---

# DurableStateStoreRegistry$

## Content

Package [akka.persistence.state](package-summary.html)
## Class DurableStateStoreRegistry$

- java.lang.Object
- - akka.persistence.state.DurableStateStoreRegistry$

- All Implemented Interfaces:
`[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")>`, `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class DurableStateStoreRegistry$
extends java.lang.Object
implements [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")>, [ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

Persistence extension for queries.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableStateStoreRegistry$](DurableStateStoreRegistry$.html "class in akka.persistence.state")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStateStoreRegistry$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[DurableStateStoreRegistry$](DurableStateStoreRegistry$.html "class in akka.persistence.state")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableStateStoreRegistry$](DurableStateStoreRegistry$.html "class in akka.persistence.state") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DurableStateStoreRegistry$
		
		
		
		```
		public DurableStateStoreRegistry$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")>`
		- #### get
		
		
		
		```
		public [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")>`
		- #### createExtension
		
		
		
		```
		public [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")>`
		- #### lookup
		
		
		
		```
		public [DurableStateStoreRegistry$](DurableStateStoreRegistry$.html "class in akka.persistence.state") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry$.html)*
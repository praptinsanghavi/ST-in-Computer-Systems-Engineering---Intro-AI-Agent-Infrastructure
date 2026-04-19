---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension$.html
title: InMemStorageExtension$
---

# InMemStorageExtension$

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Class InMemStorageExtension$

- java.lang.Object
- - akka.persistence.testkit.internal.InMemStorageExtension$

- All Implemented Interfaces:
`[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal")>`, `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class InMemStorageExtension$
extends java.lang.Object
implements [ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal")>, [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [InMemStorageExtension$](InMemStorageExtension$.html "class in akka.persistence.testkit.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InMemStorageExtension$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[InMemStorageExtension$](InMemStorageExtension$.html "class in akka.persistence.testkit.internal")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../../actor/ExtensionId.html#equals(java.lang.Object)), [get](../../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider)), [hashCode](../../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [InMemStorageExtension$](InMemStorageExtension$.html "class in akka.persistence.testkit.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### InMemStorageExtension$
		
		
		
		```
		public InMemStorageExtension$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal") get​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
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
		`[get](../../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal")>`
		- #### createExtension
		
		
		
		```
		public [InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[InMemStorageExtension](InMemStorageExtension.html "class in akka.persistence.testkit.internal")>`
		- #### lookup
		
		
		
		```
		public [InMemStorageExtension$](InMemStorageExtension$.html "class in akka.persistence.testkit.internal") lookup()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/internal/InMemStorageExtension$.html)*
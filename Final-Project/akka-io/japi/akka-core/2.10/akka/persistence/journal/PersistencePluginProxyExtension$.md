---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtension$.html
title: PersistencePluginProxyExtension$
---

# PersistencePluginProxyExtension$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class PersistencePluginProxyExtension$

- java.lang.Object
- - akka.persistence.journal.PersistencePluginProxyExtension$

- All Implemented Interfaces:
`[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")>`, `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class PersistencePluginProxyExtension$
extends java.lang.Object
implements [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")>, [ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistencePluginProxyExtension$](PersistencePluginProxyExtension$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistencePluginProxyExtension$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../../actor/Extension.html "interface in akka.actor")>` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistencePluginProxyExtension$](PersistencePluginProxyExtension$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistencePluginProxyExtension$
		
		
		
		```
		public PersistencePluginProxyExtension$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")>`
		- #### lookup
		
		
		
		```
		public [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../../actor/Extension.html "interface in akka.actor")> lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### get
		
		
		
		```
		public [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
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
		`[get](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")>`
		- #### get
		
		
		
		```
		public [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
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
		`[get](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")>`

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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtension$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtension$.html)*
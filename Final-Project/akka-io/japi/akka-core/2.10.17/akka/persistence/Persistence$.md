---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:43:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Persistence$.html
title: Persistence$
---

# Persistence$

## Content

Package [akka.persistence](package-summary.html)
## Class Persistence$

- java.lang.Object
- - akka.persistence.Persistence$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[Persistence](Persistence.html "class in akka.persistence")>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class Persistence$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[Persistence](Persistence.html "class in akka.persistence")>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

Persistence extension provider.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Persistence$](Persistence$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Persistence$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Persistence](Persistence.html "class in akka.persistence")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[Persistence](Persistence.html "class in akka.persistence")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Java API. |
	| `[Persistence](Persistence.html "class in akka.persistence")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `java.lang.String` | `[JournalFallbackConfigPath](#JournalFallbackConfigPath())()` | Config path to fall\-back to if a setting is not defined in a specific plugin's config section |
	| `[Persistence$](Persistence$.html "class in akka.persistence")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	| `java.lang.String` | `[SnapshotStoreFallbackConfigPath](#SnapshotStoreFallbackConfigPath())()` | Config path to fall\-back to if a setting is not defined in a specific snapshot plugin's config section |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Persistence$](Persistence$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Persistence$
		
		
		
		```
		public Persistence$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [Persistence](Persistence.html "class in akka.persistence") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API.
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[Persistence](Persistence.html "class in akka.persistence")>`
		- #### get
		
		
		
		```
		public [Persistence](Persistence.html "class in akka.persistence") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[Persistence](Persistence.html "class in akka.persistence")>`
		- #### createExtension
		
		
		
		```
		public [Persistence](Persistence.html "class in akka.persistence") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[Persistence](Persistence.html "class in akka.persistence")>`
		- #### lookup
		
		
		
		```
		public [Persistence$](Persistence$.html "class in akka.persistence") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### JournalFallbackConfigPath
		
		
		
		```
		public java.lang.String JournalFallbackConfigPath()
		```
		
		Config path to fall\-back to if a setting is not defined in a specific plugin's config section
		- #### SnapshotStoreFallbackConfigPath
		
		
		
		```
		public java.lang.String SnapshotStoreFallbackConfigPath()
		```
		
		Config path to fall\-back to if a setting is not defined in a specific snapshot plugin's config section

## Code Examples

### Example 1: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Persistence$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Persistence.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Persistence$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Persistence$.html)*
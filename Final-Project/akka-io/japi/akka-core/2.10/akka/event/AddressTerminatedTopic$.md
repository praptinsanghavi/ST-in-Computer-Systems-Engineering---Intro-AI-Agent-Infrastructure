---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/AddressTerminatedTopic$.html
title: AddressTerminatedTopic$
---

# AddressTerminatedTopic$

## Content

Package [akka.event](package-summary.html)
## Class AddressTerminatedTopic$

- java.lang.Object
- - akka.event.AddressTerminatedTopic$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<akka.event.AddressTerminatedTopic>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class AddressTerminatedTopic$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<akka.event.AddressTerminatedTopic>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

INTERNAL API
 
 Watchers of remote actor references register themselves as subscribers
 of `AddressTerminated` notifications. Remote and cluster
 death watch publish `AddressTerminated` when a remote system is deemed
 dead.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AddressTerminatedTopic$](AddressTerminatedTopic$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AddressTerminatedTopic$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.event.AddressTerminatedTopic` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `akka.event.AddressTerminatedTopic` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `akka.event.AddressTerminatedTopic` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[AddressTerminatedTopic$](AddressTerminatedTopic$.html "class in akka.event")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AddressTerminatedTopic$](AddressTerminatedTopic$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AddressTerminatedTopic$
		
		
		
		```
		public AddressTerminatedTopic$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public akka.event.AddressTerminatedTopic get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<akka.event.AddressTerminatedTopic>`
		- #### get
		
		
		
		```
		public akka.event.AddressTerminatedTopic get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
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
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<akka.event.AddressTerminatedTopic>`
		- #### lookup
		
		
		
		```
		public [AddressTerminatedTopic$](AddressTerminatedTopic$.html "class in akka.event") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public akka.event.AddressTerminatedTopic createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<akka.event.AddressTerminatedTopic>`

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
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/AddressTerminatedTopic$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/AddressTerminatedTopic$.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/AddressTerminatedTopic$.html)*
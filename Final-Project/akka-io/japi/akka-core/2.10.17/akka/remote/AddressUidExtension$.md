---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:15:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/AddressUidExtension$.html
title: AddressUidExtension$
---

# AddressUidExtension$

## Content

Package [akka.remote](package-summary.html)
## Class AddressUidExtension$

- java.lang.Object
- - akka.remote.AddressUidExtension$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[AddressUidExtension](AddressUidExtension.html "class in akka.remote")>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class AddressUidExtension$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[AddressUidExtension](AddressUidExtension.html "class in akka.remote")>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

Deprecated.
Use ExtendedActorSystem.uid instead. Since 2\.8\.0\.

Extension that holds a uid that is assigned as a random `Long`.
 
 The uid is intended to be used together with an [`Address`](../actor/Address.html "class in akka.actor")
 to be able to distinguish restarted actor system using the same host
 and port.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AddressUidExtension$](AddressUidExtension$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AddressUidExtension$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[AddressUidExtension](AddressUidExtension.html "class in akka.remote")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Deprecated. Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[AddressUidExtension](AddressUidExtension.html "class in akka.remote")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Returns an instance of the extension identified by this ExtensionId instance. |
	| `[AddressUidExtension](AddressUidExtension.html "class in akka.remote")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Deprecated. Returns an instance of the extension identified by this ExtensionId instance. |
	| `[AddressUidExtension$](AddressUidExtension$.html "class in akka.remote")` | `[lookup](#lookup())()` | Deprecated. Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AddressUidExtension$](AddressUidExtension$.html "class in akka.remote") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AddressUidExtension$
		
		
		
		```
		public AddressUidExtension$()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [AddressUidExtension](AddressUidExtension.html "class in akka.remote") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[AddressUidExtension](AddressUidExtension.html "class in akka.remote")>`
		- #### get
		
		
		
		```
		public [AddressUidExtension](AddressUidExtension.html "class in akka.remote") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Deprecated.
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[AddressUidExtension](AddressUidExtension.html "class in akka.remote")>`
		- #### lookup
		
		
		
		```
		public [AddressUidExtension$](AddressUidExtension$.html "class in akka.remote") lookup()
		```
		
		Deprecated.
		Description copied from interface: `[ExtensionIdProvider](../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [AddressUidExtension](AddressUidExtension.html "class in akka.remote") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[AddressUidExtension](AddressUidExtension.html "class in akka.remote")>`

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
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/AddressUidExtension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/AddressUidExtension$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/AddressUidExtension$.html)*
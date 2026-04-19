---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider$.html
title: LeaseProvider$
---

# LeaseProvider$

## Content

Package [akka.coordination.lease.scaladsl](package-summary.html)
## Class LeaseProvider$

- java.lang.Object
- - akka.coordination.lease.scaladsl.LeaseProvider$

- All Implemented Interfaces:
`[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")>`, `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class LeaseProvider$
extends java.lang.Object
implements [ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")>, [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LeaseProvider$](LeaseProvider$.html "class in akka.coordination.lease.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeaseProvider$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[LeaseProvider$](LeaseProvider$.html "class in akka.coordination.lease.scaladsl")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LeaseProvider$](LeaseProvider$.html "class in akka.coordination.lease.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LeaseProvider$
		
		
		
		```
		public LeaseProvider$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl") get​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
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
		`[get](../../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")>`
		- #### get
		
		
		
		```
		public [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl") get​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")>`
		- #### lookup
		
		
		
		```
		public [LeaseProvider$](LeaseProvider$.html "class in akka.coordination.lease.scaladsl") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")>`

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
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider$.html](https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider$.html)*
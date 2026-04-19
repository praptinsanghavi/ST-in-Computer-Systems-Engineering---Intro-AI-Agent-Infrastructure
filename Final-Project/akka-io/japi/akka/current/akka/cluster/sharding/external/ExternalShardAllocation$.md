---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/external/ExternalShardAllocation$.html
title: ExternalShardAllocation$
---

# ExternalShardAllocation$

## Content

Package [akka.cluster.sharding.external](package-summary.html)
## Class ExternalShardAllocation$

- java.lang.Object
- - akka.cluster.sharding.external.ExternalShardAllocation$

- All Implemented Interfaces:
`[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external")>`, `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class ExternalShardAllocation$
extends java.lang.Object
implements [ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external")>, [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ExternalShardAllocation$](ExternalShardAllocation$.html "class in akka.cluster.sharding.external")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExternalShardAllocation$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[ExternalShardAllocation$](ExternalShardAllocation$.html "class in akka.cluster.sharding.external")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../../actor/ExtensionId.html#equals(java.lang.Object)), [get](../../../actor/ExtensionId.html#get(akka.actor.ActorSystem)), [hashCode](../../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ExternalShardAllocation$](ExternalShardAllocation$.html "class in akka.cluster.sharding.external") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ExternalShardAllocation$
		
		
		
		```
		public ExternalShardAllocation$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external")>`
		- #### lookup
		
		
		
		```
		public [ExternalShardAllocation$](ExternalShardAllocation$.html "class in akka.cluster.sharding.external") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### get
		
		
		
		```
		public [ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external") get​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
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
		`[get](../../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../../actor/ExtensionId.html "interface in akka.actor")<[ExternalShardAllocation](ExternalShardAllocation.html "class in akka.cluster.sharding.external")>`

## Code Examples

### Example 1: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/external/ExternalShardAllocation$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/external/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/external/ExternalShardAllocation$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/external/ExternalShardAllocation$.html)*
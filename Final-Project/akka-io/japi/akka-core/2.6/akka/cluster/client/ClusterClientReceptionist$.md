---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html
title: ClusterClientReceptionist$
---

# ClusterClientReceptionist$

## Content

Package [akka.cluster.client](package-summary.html)
## Class ClusterClientReceptionist$

- java.lang.Object
- - akka.cluster.client.ClusterClientReceptionist$

- All Implemented Interfaces:
`[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")>`, `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class ClusterClientReceptionist$
extends java.lang.Object
implements [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")>, [ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

Deprecated.
. Since .

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterClientReceptionist$](ClusterClientReceptionist$.html "class in akka.cluster.client")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterClientReceptionist$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Deprecated. Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Returns an instance of the extension identified by this ExtensionId instance. |
	| `[ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Deprecated. Returns an instance of the extension identified by this ExtensionId instance. |
	| `[ClusterClientReceptionist$](ClusterClientReceptionist$.html "class in akka.cluster.client")` | `[lookup](#lookup())()` | Deprecated. Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterClientReceptionist$](ClusterClientReceptionist$.html "class in akka.cluster.client") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterClientReceptionist$
		
		
		
		```
		public ClusterClientReceptionist$()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")>`
		- #### get
		
		
		
		```
		public [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Deprecated.
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")>`
		- #### lookup
		
		
		
		```
		public [ClusterClientReceptionist$](ClusterClientReceptionist$.html "class in akka.cluster.client") lookup()
		```
		
		Deprecated.
		Description copied from interface: `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")>`

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

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html)*
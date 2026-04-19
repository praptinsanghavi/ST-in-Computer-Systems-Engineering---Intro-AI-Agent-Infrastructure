---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/SystemMaterializer$.html
title: SystemMaterializer$
---

# SystemMaterializer$

## Content

Package [akka.stream](package-summary.html)
## Class SystemMaterializer$

- java.lang.Object
- - akka.stream.SystemMaterializer$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[SystemMaterializer](SystemMaterializer.html "class in akka.stream")>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class SystemMaterializer$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[SystemMaterializer](SystemMaterializer.html "class in akka.stream")>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

The system materializer is a default materializer to use for most cases running streams, it is a single instance
 per actor system that is tied to the lifecycle of that system.
 
 Not intended to be manually used in user code.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SystemMaterializer$](SystemMaterializer$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SystemMaterializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SystemMaterializer](SystemMaterializer.html "class in akka.stream")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[SystemMaterializer](SystemMaterializer.html "class in akka.stream")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[SystemMaterializer](SystemMaterializer.html "class in akka.stream")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[SystemMaterializer$](SystemMaterializer$.html "class in akka.stream")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SystemMaterializer$](SystemMaterializer$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SystemMaterializer$
		
		
		
		```
		public SystemMaterializer$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [SystemMaterializer](SystemMaterializer.html "class in akka.stream") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
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
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[SystemMaterializer](SystemMaterializer.html "class in akka.stream")>`
		- #### get
		
		
		
		```
		public [SystemMaterializer](SystemMaterializer.html "class in akka.stream") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
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
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[SystemMaterializer](SystemMaterializer.html "class in akka.stream")>`
		- #### lookup
		
		
		
		```
		public [SystemMaterializer$](SystemMaterializer$.html "class in akka.stream") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [SystemMaterializer](SystemMaterializer.html "class in akka.stream") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[SystemMaterializer](SystemMaterializer.html "class in akka.stream")>`

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

- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SystemMaterializer$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/SystemMaterializer$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/SystemMaterializer$.html)*
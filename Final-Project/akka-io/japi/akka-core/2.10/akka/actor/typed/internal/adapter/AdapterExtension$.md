---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/AdapterExtension$.html
title: AdapterExtension$
---

# AdapterExtension$

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class AdapterExtension$

- java.lang.Object
- - akka.actor.typed.internal.adapter.AdapterExtension$

- All Implemented Interfaces:
`[ExtensionId](../../../ExtensionId.html "interface in akka.actor")<akka.actor.typed.internal.adapter.AdapterExtension>`

---

```
public class AdapterExtension$
extends java.lang.Object
implements [ExtensionId](../../../ExtensionId.html "interface in akka.actor")<akka.actor.typed.internal.adapter.AdapterExtension>
```

Internal API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AdapterExtension$](AdapterExtension$.html "class in akka.actor.typed.internal.adapter")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdapterExtension$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.internal.adapter.AdapterExtension` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../ExtendedActorSystem.html "class in akka.actor") sys)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../../ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../../ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../../ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../../ExtensionId.html#equals(java.lang.Object)), [get](../../../ExtensionId.html#get(akka.actor.ActorSystem)), [get](../../../ExtensionId.html#get(akka.actor.ClassicActorSystemProvider)), [hashCode](../../../ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AdapterExtension$](AdapterExtension$.html "class in akka.actor.typed.internal.adapter") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AdapterExtension$
		
		
		
		```
		public AdapterExtension$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public akka.actor.typed.internal.adapter.AdapterExtension createExtension​([ExtendedActorSystem](../../../ExtendedActorSystem.html "class in akka.actor") sys)
		```
		
		Description copied from interface: `[ExtensionId](../../../ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../../ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../../ExtensionId.html "interface in akka.actor")<akka.actor.typed.internal.adapter.AdapterExtension>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/AdapterExtension$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/AdapterExtension$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/AdapterExtension$.html)*
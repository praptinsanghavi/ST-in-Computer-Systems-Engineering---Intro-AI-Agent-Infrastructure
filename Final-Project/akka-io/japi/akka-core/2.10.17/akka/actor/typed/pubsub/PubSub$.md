---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub$.html
title: PubSub$
---

# PubSub$

## Content

Package [akka.actor.typed.pubsub](package-summary.html)
## Class PubSub$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../ExtensionId.html "class in akka.actor.typed")\<[PubSub](PubSub.html "class in akka.actor.typed.pubsub")\>
	- - akka.actor.typed.pubsub.PubSub$

- ---

```
public class PubSub$
extends [ExtensionId](../ExtensionId.html "class in akka.actor.typed")<[PubSub](PubSub.html "class in akka.actor.typed.pubsub")>
```

Registry for [`Topic`](Topic.html "class in akka.actor.typed.pubsub")s. Keeps one topic actor instance of each requested topic name so that they can be shared
 between all subscribers in the same actor system.
 
 Note that manually spawned [`Topic`](Topic.html "class in akka.actor.typed.pubsub") actors will not appear in the registry.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PubSub$](PubSub$.html "class in akka.actor.typed.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PubSub$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PubSub](PubSub.html "class in akka.actor.typed.pubsub")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `[PubSub](PubSub.html "class in akka.actor.typed.pubsub")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../ExtensionId.html#equals(java.lang.Object)), [hashCode](../ExtensionId.html#hashCode()), [id](../ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PubSub$](PubSub$.html "class in akka.actor.typed.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PubSub$
		
		
		
		```
		public PubSub$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [PubSub](PubSub.html "class in akka.actor.typed.pubsub") createExtension​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../ExtensionId.html "class in akka.actor.typed")<[PubSub](PubSub.html "class in akka.actor.typed.pubsub")>`
		- #### get
		
		
		
		```
		public [PubSub](PubSub.html "class in akka.actor.typed.pubsub") get​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub$.html)*
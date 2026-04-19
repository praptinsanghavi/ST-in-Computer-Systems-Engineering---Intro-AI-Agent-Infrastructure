---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriterExtension$.html
title: EventWriterExtension$
---

# EventWriterExtension$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class EventWriterExtension$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")\<akka.persistence.typed.internal.EventWriterExtension\>
	- - akka.persistence.typed.internal.EventWriterExtension$

- ---

```
public class EventWriterExtension$
extends [ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<akka.persistence.typed.internal.EventWriterExtension>
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventWriterExtension$](EventWriterExtension$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventWriterExtension$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.internal.EventWriterExtension` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `akka.persistence.typed.internal.EventWriterExtension` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../../../actor/typed/ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../../../actor/typed/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../../actor/typed/ExtensionId.html#hashCode()), [id](../../../actor/typed/ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventWriterExtension$](EventWriterExtension$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventWriterExtension$
		
		
		
		```
		public EventWriterExtension$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public akka.persistence.typed.internal.EventWriterExtension createExtension​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<akka.persistence.typed.internal.EventWriterExtension>`
		- #### get
		
		
		
		```
		public akka.persistence.typed.internal.EventWriterExtension get​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriterExtension$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriterExtension$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/EventWriterExtension$.html)*
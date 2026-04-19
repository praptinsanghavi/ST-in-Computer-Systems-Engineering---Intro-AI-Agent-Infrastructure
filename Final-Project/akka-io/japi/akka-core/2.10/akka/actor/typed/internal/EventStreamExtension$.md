---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/EventStreamExtension$.html
title: EventStreamExtension$
---

# EventStreamExtension$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class EventStreamExtension$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../ExtensionId.html "class in akka.actor.typed")\<akka.actor.typed.internal.EventStreamExtension\>
	- - akka.actor.typed.internal.EventStreamExtension$

- ---

```
public class EventStreamExtension$
extends [ExtensionId](../ExtensionId.html "class in akka.actor.typed")<akka.actor.typed.internal.EventStreamExtension>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventStreamExtension$](EventStreamExtension$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStreamExtension$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.internal.EventStreamExtension` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../ExtensionId.html#equals(java.lang.Object)), [hashCode](../ExtensionId.html#hashCode()), [id](../ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventStreamExtension$](EventStreamExtension$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventStreamExtension$
		
		
		
		```
		public EventStreamExtension$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public akka.actor.typed.internal.EventStreamExtension createExtension​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../ExtensionId.html "class in akka.actor.typed")<akka.actor.typed.internal.EventStreamExtension>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/EventStreamExtension$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/EventStreamExtension$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/EventStreamExtension$.html)*
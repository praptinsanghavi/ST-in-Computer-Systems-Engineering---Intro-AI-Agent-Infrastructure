---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html
title: EventSourcedBehaviorInstrumentationProvider$
---

# EventSourcedBehaviorInstrumentationProvider$

## Content

Package [akka.persistence.typed.telemetry](package-summary.html)
## Class EventSourcedBehaviorInstrumentationProvider$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")\<[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")\>
	- - akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider$

- ---

```
public class EventSourcedBehaviorInstrumentationProvider$
extends [ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")>
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedBehaviorInstrumentationProvider$](EventSourcedBehaviorInstrumentationProvider$.html "class in akka.persistence.typed.telemetry")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedBehaviorInstrumentationProvider$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../../../actor/typed/ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../../../actor/typed/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../../actor/typed/ExtensionId.html#hashCode()), [id](../../../actor/typed/ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedBehaviorInstrumentationProvider$](EventSourcedBehaviorInstrumentationProvider$.html "class in akka.persistence.typed.telemetry") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSourcedBehaviorInstrumentationProvider$
		
		
		
		```
		public EventSourcedBehaviorInstrumentationProvider$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry") createExtension​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")>`
		- #### get
		
		
		
		```
		public [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry") get​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html)*